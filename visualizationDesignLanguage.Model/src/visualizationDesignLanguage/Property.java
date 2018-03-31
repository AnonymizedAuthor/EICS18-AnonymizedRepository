/**
 */
package visualizationDesignLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Property#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends HowQualifier {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The literals are from the enumeration {@link visualizationDesignLanguage.DataProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see visualizationDesignLanguage.DataProperty
	 * @see #setValue(DataProperty)
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getProperty_Value()
	 * @model
	 * @generated
	 */
	DataProperty getValue();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Property#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see visualizationDesignLanguage.DataProperty
	 * @see #getValue()
	 * @generated
	 */
	void setValue(DataProperty value);

} // Property
