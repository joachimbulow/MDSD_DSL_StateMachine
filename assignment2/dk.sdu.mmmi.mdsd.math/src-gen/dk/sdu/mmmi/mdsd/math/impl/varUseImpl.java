/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.math.impl;

import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.varUse;
import dk.sdu.mmmi.mdsd.math.variableInit;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>var Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.impl.varUseImpl#getInExp <em>In Exp</em>}</li>
 *   <li>{@link dk.sdu.mmmi.mdsd.math.impl.varUseImpl#getInVariableInit <em>In Variable Init</em>}</li>
 * </ul>
 *
 * @generated
 */
public class varUseImpl extends ExpressionImpl implements varUse
{
  /**
   * The cached value of the '{@link #getInExp() <em>In Exp</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInExp()
   * @generated
   * @ordered
   */
  protected MathExp inExp;

  /**
   * The cached value of the '{@link #getInVariableInit() <em>In Variable Init</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInVariableInit()
   * @generated
   * @ordered
   */
  protected variableInit inVariableInit;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected varUseImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MathPackage.Literals.VAR_USE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MathExp getInExp()
  {
    if (inExp != null && inExp.eIsProxy())
    {
      InternalEObject oldInExp = (InternalEObject)inExp;
      inExp = (MathExp)eResolveProxy(oldInExp);
      if (inExp != oldInExp)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathPackage.VAR_USE__IN_EXP, oldInExp, inExp));
      }
    }
    return inExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MathExp basicGetInExp()
  {
    return inExp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInExp(MathExp newInExp)
  {
    MathExp oldInExp = inExp;
    inExp = newInExp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.VAR_USE__IN_EXP, oldInExp, inExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public variableInit getInVariableInit()
  {
    if (inVariableInit != null && inVariableInit.eIsProxy())
    {
      InternalEObject oldInVariableInit = (InternalEObject)inVariableInit;
      inVariableInit = (variableInit)eResolveProxy(oldInVariableInit);
      if (inVariableInit != oldInVariableInit)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, MathPackage.VAR_USE__IN_VARIABLE_INIT, oldInVariableInit, inVariableInit));
      }
    }
    return inVariableInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public variableInit basicGetInVariableInit()
  {
    return inVariableInit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setInVariableInit(variableInit newInVariableInit)
  {
    variableInit oldInVariableInit = inVariableInit;
    inVariableInit = newInVariableInit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MathPackage.VAR_USE__IN_VARIABLE_INIT, oldInVariableInit, inVariableInit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case MathPackage.VAR_USE__IN_EXP:
        if (resolve) return getInExp();
        return basicGetInExp();
      case MathPackage.VAR_USE__IN_VARIABLE_INIT:
        if (resolve) return getInVariableInit();
        return basicGetInVariableInit();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MathPackage.VAR_USE__IN_EXP:
        setInExp((MathExp)newValue);
        return;
      case MathPackage.VAR_USE__IN_VARIABLE_INIT:
        setInVariableInit((variableInit)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case MathPackage.VAR_USE__IN_EXP:
        setInExp((MathExp)null);
        return;
      case MathPackage.VAR_USE__IN_VARIABLE_INIT:
        setInVariableInit((variableInit)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case MathPackage.VAR_USE__IN_EXP:
        return inExp != null;
      case MathPackage.VAR_USE__IN_VARIABLE_INIT:
        return inVariableInit != null;
    }
    return super.eIsSet(featureID);
  }

} //varUseImpl
