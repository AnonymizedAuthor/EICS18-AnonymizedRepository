/**
 */
package visualizationDesignLanguage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Cell#getWraps <em>Wraps</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getCell()
 * @model
 * @generated
 */
public interface Cell extends EObject {
	/**
	 * Returns the value of the '<em><b>Wraps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wraps</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wraps</em>' reference.
	 * @see #setWraps(Visualization)
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getCell_Wraps()
	 * @model required="true"
	 * @generated
	 */
	Visualization getWraps();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Cell#getWraps <em>Wraps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wraps</em>' reference.
	 * @see #getWraps()
	 * @generated
	 */
	void setWraps(Visualization value);

} // Cell
