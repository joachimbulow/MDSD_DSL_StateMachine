/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Binding;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.ExternalCall;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Program;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.ArrayList;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Program program = Iterators.<Program>filter(resource.getAllContents(), Program.class).next();
    String _name = program.getName();
    String _plus = ("math_expression/" + _name);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, 
      MathGenerator.compile(program));
  }
  
  private static ArrayList<String> variables = new ArrayList<String>(Arrays.<String>asList("n", "m", "o", "p"));
  
  private static int index = 0;
  
  public static CharSequence compile(final Program program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package math_expression;");
    _builder.newLine();
    _builder.append("public class ");
    String _name = program.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    {
      EList<VarBinding> _variables = program.getMath().getVariables();
      for(final VarBinding variable : _variables) {
        _builder.append("public int ");
        String _name_1 = variable.getName();
        _builder.append(_name_1);
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    {
      int _size = program.getExternals().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("private External external;");
        _builder.newLine();
      }
    }
    _builder.append("  ");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    {
      int _size_1 = program.getExternals().size();
      boolean _greaterThan_1 = (_size_1 > 0);
      if (_greaterThan_1) {
        _builder.append("  ");
        _builder.append("public ");
        String _name_2 = program.getName();
        _builder.append(_name_2, "  ");
        _builder.append(" (External external) {");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("  ");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append(" ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("public void compute() {");
    _builder.newLine();
    {
      EList<VarBinding> _variables_1 = program.getMath().getVariables();
      for(final VarBinding variable_1 : _variables_1) {
        _builder.append("    ");
        String _name_3 = variable_1.getName();
        _builder.append(_name_3, "    ");
        _builder.append(" = ");
        String _compileExpression = MathGenerator.compileExpression(variable_1.getExpression());
        _builder.append(_compileExpression, "    ");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    {
      int _size_2 = program.getExternals().size();
      boolean _greaterThan_2 = (_size_2 > 0);
      if (_greaterThan_2) {
        _builder.append(" ");
        _builder.append("interface External {");
        _builder.newLine();
        {
          EList<External> _externals = program.getExternals();
          for(final External external : _externals) {
            _builder.append("\t ");
            _builder.append("public int ");
            String _name_4 = external.getName();
            _builder.append(_name_4, "\t ");
            _builder.append("( ");
            {
              EList<String> _types = external.getTypes();
              boolean _hasElements = false;
              for(final String type : _types) {
                if (!_hasElements) {
                  _hasElements = true;
                } else {
                  _builder.appendImmediate(", ", "\t ");
                }
                _builder.append(type, "\t ");
                _builder.append(" ");
                int _plusPlus = MathGenerator.index++;
                String _get = MathGenerator.variables.get(_plusPlus);
                _builder.append(_get, "\t ");
                _builder.append(" ");
              }
            }
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t ");
        _builder.newLine();
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected static String _compileExpression(final VarBinding binding) {
    return MathGenerator.compileExpression(binding.getExpression());
  }
  
  protected static String _compileExpression(final MathNumber exp) {
    return Integer.valueOf(exp.getValue()).toString();
  }
  
  protected static String _compileExpression(final Plus exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _compileExpression = MathGenerator.compileExpression(exp.getLeft());
    _builder.append(_compileExpression);
    _builder.append(" + ");
    String _compileExpression_1 = MathGenerator.compileExpression(exp.getRight());
    _builder.append(_compileExpression_1);
    return _builder.toString();
  }
  
  protected static String _compileExpression(final Minus exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _compileExpression = MathGenerator.compileExpression(exp.getLeft());
    _builder.append(_compileExpression);
    _builder.append(" - ");
    String _compileExpression_1 = MathGenerator.compileExpression(exp.getRight());
    _builder.append(_compileExpression_1);
    return _builder.toString();
  }
  
  protected static String _compileExpression(final Mult exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _compileExpression = MathGenerator.compileExpression(exp.getLeft());
    _builder.append(_compileExpression);
    _builder.append(" * ");
    String _compileExpression_1 = MathGenerator.compileExpression(exp.getRight());
    _builder.append(_compileExpression_1);
    return _builder.toString();
  }
  
  protected static String _compileExpression(final Div exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _compileExpression = MathGenerator.compileExpression(exp.getLeft());
    _builder.append(_compileExpression);
    _builder.append(" / ");
    String _compileExpression_1 = MathGenerator.compileExpression(exp.getRight());
    _builder.append(_compileExpression_1);
    return _builder.toString();
  }
  
  protected static String _compileExpression(final LetBinding exp) {
    String bindingresult = MathGenerator.compileExpression(exp.getBinding());
    String bodyresult = MathGenerator.compileExpression(exp.getBody());
    String gg = bodyresult.replaceAll(exp.getName(), bindingresult);
    return gg;
  }
  
  protected static String _compileExpression(final VariableUse exp) {
    Binding ref = exp.getRef();
    if ((ref instanceof LetBinding)) {
      MathGenerator.compileExpression(((LetBinding)ref).getBinding());
    }
    StringConcatenation _builder = new StringConcatenation();
    String _name = exp.getRef().getName();
    _builder.append(_name);
    return _builder.toString();
  }
  
  protected static String _compileExpression(final ExternalCall exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("this.external.");
    String _name = exp.getExternal().getName();
    _builder.append(_name);
    _builder.append("( ");
    {
      EList<Expression> _arguments = exp.getArguments();
      for(final Expression argument : _arguments) {
        String _compileExpression = MathGenerator.compileExpression(argument);
        _builder.append(_compileExpression);
        {
          Expression _last = IterableExtensions.<Expression>last(exp.getArguments());
          boolean _notEquals = (!Objects.equal(argument, _last));
          if (_notEquals) {
            _builder.append(",");
          }
        }
        _builder.append(" ");
      }
    }
    _builder.append(")");
    return _builder.toString();
  }
  
  public static String compileExpression(final EObject exp) {
    if (exp instanceof Div) {
      return _compileExpression((Div)exp);
    } else if (exp instanceof ExternalCall) {
      return _compileExpression((ExternalCall)exp);
    } else if (exp instanceof LetBinding) {
      return _compileExpression((LetBinding)exp);
    } else if (exp instanceof MathNumber) {
      return _compileExpression((MathNumber)exp);
    } else if (exp instanceof Minus) {
      return _compileExpression((Minus)exp);
    } else if (exp instanceof Mult) {
      return _compileExpression((Mult)exp);
    } else if (exp instanceof Plus) {
      return _compileExpression((Plus)exp);
    } else if (exp instanceof VarBinding) {
      return _compileExpression((VarBinding)exp);
    } else if (exp instanceof VariableUse) {
      return _compileExpression((VariableUse)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
