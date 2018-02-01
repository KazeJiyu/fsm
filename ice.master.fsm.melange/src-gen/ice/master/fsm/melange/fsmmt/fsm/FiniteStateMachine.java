/**
 */
package ice.master.fsm.melange.fsmmt.fsm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finite State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine#getStates <em>States</em>}</li>
 *   <li>{@link ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine#getInitial <em>Initial</em>}</li>
 *   <li>{@link ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ice.master.fsm.melange.fsmmt.fsm.FsmPackage#getFiniteStateMachine()
 * @model
 * @generated
 */
public interface FiniteStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link ice.master.fsm.melange.fsmmt.fsm.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see ice.master.fsm.melange.fsmmt.fsm.FsmPackage#getFiniteStateMachine_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial</em>' reference.
	 * @see #setInitial(State)
	 * @see ice.master.fsm.melange.fsmmt.fsm.FsmPackage#getFiniteStateMachine_Initial()
	 * @model
	 * @generated
	 */
	State getInitial();

	/**
	 * Sets the value of the '{@link ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine#getInitial <em>Initial</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial</em>' reference.
	 * @see #getInitial()
	 * @generated
	 */
	void setInitial(State value);

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
	 * @see ice.master.fsm.melange.fsmmt.fsm.FsmPackage#getFiniteStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ice.master.fsm.melange.fsmmt.fsm.FiniteStateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void on(String event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void main();

} // FiniteStateMachine
