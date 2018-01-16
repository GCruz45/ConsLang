/**
 * generated by Xtext 2.13.0
 */
package org.xtext.hlcl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variables</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.hlcl.Variables#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.hlcl.Variables#getDom <em>Dom</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.hlcl.HlclPackage#getVariables()
 * @model
 * @generated
 */
public interface Variables extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.hlcl.HlclPackage#getVariables_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.hlcl.Variables#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dom</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dom</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dom</em>' containment reference.
   * @see #setDom(Dom)
   * @see org.xtext.hlcl.HlclPackage#getVariables_Dom()
   * @model containment="true"
   * @generated
   */
  Dom getDom();

  /**
   * Sets the value of the '{@link org.xtext.hlcl.Variables#getDom <em>Dom</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dom</em>' containment reference.
   * @see #getDom()
   * @generated
   */
  void setDom(Dom value);

} // Variables
