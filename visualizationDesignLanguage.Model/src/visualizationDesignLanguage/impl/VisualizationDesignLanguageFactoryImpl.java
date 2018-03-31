/**
 */
package visualizationDesignLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import visualizationDesignLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationDesignLanguageFactoryImpl extends EFactoryImpl implements VisualizationDesignLanguageFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VisualizationDesignLanguageFactory init() {
		try {
			VisualizationDesignLanguageFactory theVisualizationDesignLanguageFactory = (VisualizationDesignLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(VisualizationDesignLanguagePackage.eNS_URI);
			if (theVisualizationDesignLanguageFactory != null) {
				return theVisualizationDesignLanguageFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VisualizationDesignLanguageFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationDesignLanguageFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case VisualizationDesignLanguagePackage.DASHBOARD: return createDashboard();
			case VisualizationDesignLanguagePackage.WINDOW: return createWindow();
			case VisualizationDesignLanguagePackage.COLUMN: return createColumn();
			case VisualizationDesignLanguagePackage.LINE: return createLine();
			case VisualizationDesignLanguagePackage.VISUALIZATION: return createVisualization();
			case VisualizationDesignLanguagePackage.CELL: return createCell();
			case VisualizationDesignLanguagePackage.SOURCE: return createSource();
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER: return createWhatQualifier();
			case VisualizationDesignLanguagePackage.ICON: return createIcon();
			case VisualizationDesignLanguagePackage.COLORIZATION: return createColorization();
			case VisualizationDesignLanguagePackage.PROPERTY: return createProperty();
			case VisualizationDesignLanguagePackage.THRESHOLD: return createThreshold();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizationDesignLanguagePackage.TAXONOMY:
				return createTaxonomyFromString(eDataType, initialValue);
			case VisualizationDesignLanguagePackage.DATA_PROPERTY:
				return createDataPropertyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case VisualizationDesignLanguagePackage.TAXONOMY:
				return convertTaxonomyToString(eDataType, instanceValue);
			case VisualizationDesignLanguagePackage.DATA_PROPERTY:
				return convertDataPropertyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dashboard createDashboard() {
		DashboardImpl dashboard = new DashboardImpl();
		return dashboard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Window createWindow() {
		WindowImpl window = new WindowImpl();
		return window;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Column createColumn() {
		ColumnImpl column = new ColumnImpl();
		return column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Visualization createVisualization() {
		VisualizationImpl visualization = new VisualizationImpl();
		return visualization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cell createCell() {
		CellImpl cell = new CellImpl();
		return cell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhatQualifier createWhatQualifier() {
		WhatQualifierImpl whatQualifier = new WhatQualifierImpl();
		return whatQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Icon createIcon() {
		IconImpl icon = new IconImpl();
		return icon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colorization createColorization() {
		ColorizationImpl colorization = new ColorizationImpl();
		return colorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Threshold createThreshold() {
		ThresholdImpl threshold = new ThresholdImpl();
		return threshold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Taxonomy createTaxonomyFromString(EDataType eDataType, String initialValue) {
		Taxonomy result = Taxonomy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxonomyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProperty createDataPropertyFromString(EDataType eDataType, String initialValue) {
		DataProperty result = DataProperty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataPropertyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationDesignLanguagePackage getVisualizationDesignLanguagePackage() {
		return (VisualizationDesignLanguagePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VisualizationDesignLanguagePackage getPackage() {
		return VisualizationDesignLanguagePackage.eINSTANCE;
	}

} //VisualizationDesignLanguageFactoryImpl
