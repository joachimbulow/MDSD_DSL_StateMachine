/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>var Use</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.varUse#getInExp <em>In Exp</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.varUse#getInVariableInit <em>In Variable Init</em>}</li>
 * </ul>
 *
 * @see dk.sdu.mmmi.mdsd.math.MathPackage#getvarUse()
 * @model
 * @generated
 */
public interface varUse extends Expression
{
  /**
   * Returns the value of the '<em><b>In Exp</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Exp</em>' reference.
   * @see #setInExp(MathExp)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getvarUse_InExp()
   * @model
   * @generated
   */
  MathExp getInExp();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.varUse#getInExp <em>In Exp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Exp</em>' reference.
   * @see #getInExp()
   * @generated
   */
  void setInExp(MathExp value);

  /**
   * Returns the value of the '<em><b>In Variable Init</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Variable Init</em>' reference.
   * @see #setInVariableInit(variableInit)
   * @see dk.sdu.mmmi.mdsd.math.MathPackage#getvarUse_InVariableInit()
   * @model
   * @generated
   */
  variableInit getInVariableInit();

  /**
   * Sets the value of the '{@link dk.sdu.mmmi.mdsd.math.varUse#getInVariableInit <em>In Variable Init</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Variable Init</em>' reference.
   * @see #getInVariableInit()
   * @generated
   */
  void setInVariableInit(variableInit value);

} // varUse
