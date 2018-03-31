/**
 */
package visualizationDesignLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Dashboard#getName <em>Name</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Dashboard#getWindows <em>Windows</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Dashboard#getVisualizations <em>Visualizations</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getDashboard()
 * @model
 * @generated
 */
public interface Dashboard extends EObject {
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
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getDashboard_Name()
	 * @model id="true" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Dashboard#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Windows</b></em>' containment reference list.
	 * The list contents are of type {@link visualizationDesignLanguage.Window}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Windows</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Windows</em>' containment reference list.
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getDashboard_Windows()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Window> getWindows();

	/**
	 * Returns the value of the '<em><b>Visualizations</b></em>' containment reference list.
	 * The list contents are of type {@link visualizationDesignLanguage.Visualization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visualizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visualizations</em>' containment reference list.
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getDashboard_Visualizations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Visualization> getVisualizations();

} // Dashboard
