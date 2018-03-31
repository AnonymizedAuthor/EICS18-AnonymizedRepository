/**
 */
package visualizationDesignLanguage.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import visualizationDesignLanguage.Dashboard;
import visualizationDesignLanguage.Visualization;
import visualizationDesignLanguage.VisualizationDesignLanguagePackage;
import visualizationDesignLanguage.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dashboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link visualizationDesignLanguage.impl.DashboardImpl#getName <em>Name</em>}</li>
 *   <li>{@link visualizationDesignLanguage.impl.DashboardImpl#getWindows <em>Windows</em>}</li>
 *   <li>{@link visualizationDesignLanguage.impl.DashboardImpl#getVisualizations <em>Visualizations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DashboardImpl extends MinimalEObjectImpl.Container implements Dashboard {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWindows() <em>Windows</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<Window> windows;

	/**
	 * The cached value of the '{@link #getVisualizations() <em>Visualizations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisualizations()
	 * @generated
	 * @ordered
	 */
	protected EList<Visualization> visualizations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DashboardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VisualizationDesignLanguagePackage.Literals.DASHBOARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDesignLanguagePackage.DASHBOARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Window> getWindows() {
		if (windows == null) {
			windows = new EObjectContainmentEList<Window>(Window.class, this, VisualizationDesignLanguagePackage.DASHBOARD__WINDOWS);
		}
		return windows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Visualization> getVisualizations() {
		if (visualizations == null) {
			visualizations = new EObjectContainmentEList<Visualization>(Visualization.class, this, VisualizationDesignLanguagePackage.DASHBOARD__VISUALIZATIONS);
		}
		return visualizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.DASHBOARD__WINDOWS:
				return ((InternalEList<?>)getWindows()).basicRemove(otherEnd, msgs);
			case VisualizationDesignLanguagePackage.DASHBOARD__VISUALIZATIONS:
				return ((InternalEList<?>)getVisualizations()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.DASHBOARD__NAME:
				return getName();
			case VisualizationDesignLanguagePackage.DASHBOARD__WINDOWS:
				return getWindows();
			case VisualizationDesignLanguagePackage.DASHBOARD__VISUALIZATIONS:
				return getVisualizations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case VisualizationDesignLanguagePackage.DASHBOARD__NAME:
				setName((String)newValue);
				return;
			case VisualizationDesignLanguagePackage.DASHBOARD__WINDOWS:
				getWindows().clear();
				getWindows().addAll((Collection<? extends Window>)newValue);
				return;
			case VisualizationDesignLanguagePackage.DASHBOARD__VISUALIZATIONS:
				getVisualizations().clear();
				getVisualizations().addAll((Collection<? extends Visualization>)newValue);
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
			case VisualizationDesignLanguagePackage.DASHBOARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case VisualizationDesignLanguagePackage.DASHBOARD__WINDOWS:
				getWindows().clear();
				return;
			case VisualizationDesignLanguagePackage.DASHBOARD__VISUALIZATIONS:
				getVisualizations().clear();
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
			case VisualizationDesignLanguagePackage.DASHBOARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case VisualizationDesignLanguagePackage.DASHBOARD__WINDOWS:
				return windows != null && !windows.isEmpty();
			case VisualizationDesignLanguagePackage.DASHBOARD__VISUALIZATIONS:
				return visualizations != null && !visualizations.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //DashboardImpl
