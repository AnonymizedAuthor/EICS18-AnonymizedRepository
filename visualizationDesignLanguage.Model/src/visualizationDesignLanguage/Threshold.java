/**
 */
package visualizationDesignLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Threshold</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.Threshold#getMin <em>Min</em>}</li>
 *   <li>{@link visualizationDesignLanguage.Threshold#getMax <em>Max</em>}</li>
 * </ul>
 *
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getThreshold()
 * @model
 * @generated
 */
public interface Threshold extends HowQualifier {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' attribute.
	 * @see #setMin(int)
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getThreshold_Min()
	 * @model
	 * @generated
	 */
	int getMin();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Threshold#getMin <em>Min</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' attribute.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(int value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' attribute.
	 * @see #setMax(int)
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getThreshold_Max()
	 * @model
	 * @generated
	 */
	int getMax();

	/**
	 * Sets the value of the '{@link visualizationDesignLanguage.Threshold#getMax <em>Max</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' attribute.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(int value);

} // Threshold
