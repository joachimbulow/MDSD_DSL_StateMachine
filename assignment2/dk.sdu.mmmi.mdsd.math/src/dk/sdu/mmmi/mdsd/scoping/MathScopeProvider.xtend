/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.scoping
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.EcoreUtil2
import dk.sdu.mmmi.mdsd.math.varUse
import dk.sdu.mmmi.mdsd.math.variableInit
import dk.sdu.mmmi.mdsd.math.Expression
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.Variables
import org.eclipse.xtext.scoping.Scopes
import java.util.ArrayList
import org.eclipse.xtext.scoping.IScope

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MathScopeProvider extends AbstractMathScopeProvider {
	override getScope(EObject context, EReference reference) {
		switch(context){
			varUse: {
				val currentExp = EcoreUtil2.getContainerOfType(context, MathExp);
				val variables = EcoreUtil2.getContainerOfType(context, Variables).variables;
				val filteredVariables = variables.filter[math | math.name != currentExp.name]
				
				val letScope = getOuterMostLetScope(context);
				
				return Scopes.scopeFor(filteredVariables, letScope);
			}
		}
		
		return super.getScope(context, reference)
	}
	
	def IScope getOuterMostLetScope(Expression variable){
		val parent = EcoreUtil2.getContainerOfType(variable, variableInit);
		if (parent !== null && variable != parent){
			return Scopes.scopeFor(#[parent], getOuterMostLetScope(parent))
		}
		return Scopes.scopeFor(#[variable]);
	}


}
