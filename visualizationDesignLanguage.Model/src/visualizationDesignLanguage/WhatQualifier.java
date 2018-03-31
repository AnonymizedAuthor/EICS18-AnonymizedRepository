/**
 */
package visualizationDesignLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>What Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.WhatQualifier#getConcern <em>Concern</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getWhatQualifier()
 * @model
 * @generated
 */
public interface WhatQualifier extends Concern {
	/**
	 * Returns the value of the '<em><b>Concern</b></em>' attribute.
	 * The literals are from the enumeration {@link visualizationDesignLanguage.Taxonomy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Concern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concern</em>' attribute.
	 * @see visualizationDesignLanguage.Taxonomy
	 * @see #setConcern(Taxonomy)
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getWhatQualifier_Concern()
	 * @model required="true"
	 * @generated
	 */
	Taxonomy getConcern();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.WhatQualifier#getConcern <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Concern</em>' attribute.
	 * @see visualizationDesignLanguage.Taxonomy
	 * @see #getConcern()
	 * @generated
	 */
	void setConcern(Taxonomy value);

} // WhatQualifier
