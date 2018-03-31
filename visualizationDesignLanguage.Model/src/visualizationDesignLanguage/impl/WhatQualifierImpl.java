/**
 */
package visualizationDesignLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import visualizationDesignLanguage.Taxonomy;
import visualizationDesignLanguage.VisualizationDesignLanguagePackage;
import visualizationDesignLanguage.WhatQualifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>What Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.impl.WhatQualifierImpl#getConcern <em>Concern</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WhatQualifierImpl extends ConcernImpl implements WhatQualifier {
	/**
	 * The default value of the '{@link #getConcern() <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected static final Taxonomy CONCERN_EDEFAULT = Taxonomy.PROPORTION;

	/**
	 * The cached value of the '{@link #getConcern() <em>Concern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcern()
	 * @generated
	 * @ordered
	 */
	protected Taxonomy concern = CONCERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WhatQualifierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationDesignLanguagePackage.Literals.WHAT_QUALIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy getConcern() {
		return concern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcern(Taxonomy newConcern) {
		Taxonomy oldConcern = concern;
		concern = newConcern == null ? CONCERN_EDEFAULT : newConcern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDesignLanguagePackage.WHAT_QUALIFIER__CONCERN, oldConcern, concern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER__CONCERN:
				return getConcern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER__CONCERN:
				setConcern((Taxonomy)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER__CONCERN:
				setConcern(CONCERN_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER__CONCERN:
				return concern != CONCERN_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (concern: ");
		result.append(concern);
		result.append(')');
		return result.toString();
	}

} //WhatQualifierImpl
