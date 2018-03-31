/**
 */
package visualizationDesignLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Container#getPonderation <em>Ponderation</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Container#getContains <em>Contains</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getContainer()
 * @model abstract="true"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ponderation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ponderation</em>' attribute.
	 * @see #setPonderation(int)
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getContainer_Ponderation()
	 * @model
	 * @generated
	 */
	int getPonderation();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Container#getPonderation <em>Ponderation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ponderation</em>' attribute.
	 * @see #getPonderation()
	 * @generated
	 */
	void setPonderation(int value);

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link visualizationDesignLanguage.Cell}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getContainer_Contains()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Cell> getContains();

} // Container
