/**
 */
package visualizationDesignLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visualization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Visualization#getName <em>Name</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Visualization#getDisplays <em>Displays</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Visualization#getConcerns <em>Concerns</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getVisualization()
 * @model
 * @generated
 */
public interface Visualization extends EObject {
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
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getVisualization_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Visualization#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Displays</b></em>' containment reference list.
	 * The list contents are of type {@link visualizationDesignLanguage.Source}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Displays</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Displays</em>' containment reference list.
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getVisualization_Displays()
	 * @model containment="true"
	 * @generated
	 */
	EList<Source> getDisplays();

	/**
	 * Returns the value of the '<em><b>Concerns</b></em>' containment reference list.
	 * The list contents are of type {@link visualizationDesignLanguage.WhatQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concerns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concerns</em>' containment reference list.
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getVisualization_Concerns()
	 * @model containment="true"
	 * @generated
	 */
	EList<WhatQualifier> getConcerns();

} // Visualization
