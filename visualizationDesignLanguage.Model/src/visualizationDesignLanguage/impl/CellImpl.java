/**
 */
package visualizationDesignLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import visualizationDesignLanguage.Cell;
import visualizationDesignLanguage.Visualization;
import visualizationDesignLanguage.VisualizationDesignLanguagePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cell</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.impl.CellImpl#getWraps <em>Wraps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CellImpl extends MinimalEObjectImpl.Container implements Cell {
	/**
	 * The cached value of the '{@link #getWraps() <em>Wraps</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWraps()
	 * @generated
	 * @ordered
	 */
	protected Visualization wraps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CellImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationDesignLanguagePackage.Literals.CELL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization getWraps() {
		if (wraps != null && wraps.eIsProxy()) {
			InternalEObject oldWraps = (InternalEObject)wraps;
			wraps = (Visualization)eResolveProxy(oldWraps);
			if (wraps != oldWraps) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, VisualizationDesignLanguagePackage.CELL__WRAPS, oldWraps, wraps));
			}
		}
		return wraps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization basicGetWraps() {
		return wraps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWraps(Visualization newWraps) {
		Visualization oldWraps = wraps;
		wraps = newWraps;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDesignLanguagePackage.CELL__WRAPS, oldWraps, wraps));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.CELL__WRAPS:
				if (resolve) return getWraps();
				return basicGetWraps();
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
			case VisualizationDesignLanguagePackage.CELL__WRAPS:
				setWraps((Visualization)newValue);
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
			case VisualizationDesignLanguagePackage.CELL__WRAPS:
				setWraps((Visualization)null);
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
			case VisualizationDesignLanguagePackage.CELL__WRAPS:
				return wraps != null;
		}
		return super.eIsSet(featureID);
	}

} //CellImpl
