/**
 */
package visualizationDesignLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Window</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Window#getName <em>Name</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Window#getOrganizes <em>Organizes</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getWindow()
 * @model
 * @generated
 */
public interface Window extends EObject {
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
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getWindow_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Window#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Organizes</b></em>' containment reference list.
	 * The list contents are of type {@link visualizationDesignLanguage.Container}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizes</em>' containment reference list.
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getWindow_Organizes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Container> getOrganizes();

} // Window
