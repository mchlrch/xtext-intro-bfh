/**
 * generated by Xtext 2.14.0
 */
package com.acme.homeautomation.dsl.harDsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Device</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.acme.homeautomation.dsl.harDsl.Device#getName <em>Name</em>}</li>
 *   <li>{@link com.acme.homeautomation.dsl.harDsl.Device#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see com.acme.homeautomation.dsl.harDsl.HarDslPackage#getDevice()
 * @model
 * @generated
 */
public interface Device extends Declaration
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
   * @see com.acme.homeautomation.dsl.harDsl.HarDslPackage#getDevice_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.acme.homeautomation.dsl.harDsl.Device#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link com.acme.homeautomation.dsl.harDsl.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see com.acme.homeautomation.dsl.harDsl.HarDslPackage#getDevice_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // Device
