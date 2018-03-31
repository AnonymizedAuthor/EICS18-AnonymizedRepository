/**
 */
package visualizationDesignLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see visualizationDesignLanguage.VisualizationDesignLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface VisualizationDesignLanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "visualizationDesignLanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fr.uns.i3s.sparks.modalis.israfel.visualisationdesignlanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "visualizationDesignLanguage";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VisualizationDesignLanguagePackage eINSTANCE = visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.DashboardImpl <em>Dashboard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.DashboardImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getDashboard()
	 * @generated
	 */
	int DASHBOARD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Windows</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__WINDOWS = 1;

	/**
	 * The feature id for the '<em><b>Visualizations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD__VISUALIZATIONS = 2;

	/**
	 * The number of structural features of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Dashboard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DASHBOARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.WindowImpl <em>Window</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.WindowImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getWindow()
	 * @generated
	 */
	int WINDOW = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__NAME = 0;

	/**
	 * The feature id for the '<em><b>Organizes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW__ORGANIZES = 1;

	/**
	 * The number of structural features of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Window</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WINDOW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.ContainerImpl <em>Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.ContainerImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getContainer()
	 * @generated
	 */
	int CONTAINER = 2;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__PONDERATION = 0;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER__CONTAINS = 1;

	/**
	 * The number of structural features of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.ColumnImpl <em>Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.ColumnImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getColumn()
	 * @generated
	 */
	int COLUMN = 3;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__PONDERATION = CONTAINER__PONDERATION;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN__CONTAINS = CONTAINER__CONTAINS;

	/**
	 * The number of structural features of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLUMN_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.LineImpl <em>Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.LineImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getLine()
	 * @generated
	 */
	int LINE = 4;

	/**
	 * The feature id for the '<em><b>Ponderation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__PONDERATION = CONTAINER__PONDERATION;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE__CONTAINS = CONTAINER__CONTAINS;

	/**
	 * The number of structural features of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_FEATURE_COUNT = CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_OPERATION_COUNT = CONTAINER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.VisualizationImpl <em>Visualization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.VisualizationImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getVisualization()
	 * @generated
	 */
	int VISUALIZATION = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Displays</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__DISPLAYS = 1;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION__CONCERNS = 2;

	/**
	 * The number of structural features of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Visualization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VISUALIZATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.CellImpl <em>Cell</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.CellImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getCell()
	 * @generated
	 */
	int CELL = 6;

	/**
	 * The feature id for the '<em><b>Wraps</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL__WRAPS = 0;

	/**
	 * The number of structural features of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cell</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CELL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.SourceImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Concerns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CONCERNS = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.ConcernImpl <em>Concern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.ConcernImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getConcern()
	 * @generated
	 */
	int CONCERN = 8;

	/**
	 * The number of structural features of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Concern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONCERN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.HowQualifierImpl <em>How Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.HowQualifierImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getHowQualifier()
	 * @generated
	 */
	int HOW_QUALIFIER = 9;

	/**
	 * The number of structural features of the '<em>How Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_QUALIFIER_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>How Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOW_QUALIFIER_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.WhatQualifierImpl <em>What Qualifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.WhatQualifierImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getWhatQualifier()
	 * @generated
	 */
	int WHAT_QUALIFIER = 10;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_QUALIFIER__CONCERN = CONCERN_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>What Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_QUALIFIER_FEATURE_COUNT = CONCERN_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>What Qualifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WHAT_QUALIFIER_OPERATION_COUNT = CONCERN_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.IconImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 11;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = HOW_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_OPERATION_COUNT = HOW_QUALIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.ColorizationImpl <em>Colorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.ColorizationImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getColorization()
	 * @generated
	 */
	int COLORIZATION = 12;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORIZATION__COLOR = HOW_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Colorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORIZATION_FEATURE_COUNT = HOW_QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Colorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLORIZATION_OPERATION_COUNT = HOW_QUALIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.PropertyImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getProperty()
	 * @generated
	 */
	int PROPERTY = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY__VALUE = HOW_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_FEATURE_COUNT = HOW_QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_OPERATION_COUNT = HOW_QUALIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.impl.ThresholdImpl <em>Threshold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.impl.ThresholdImpl
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getThreshold()
	 * @generated
	 */
	int THRESHOLD = 14;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__MIN = HOW_QUALIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD__MAX = HOW_QUALIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_FEATURE_COUNT = HOW_QUALIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Threshold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THRESHOLD_OPERATION_COUNT = HOW_QUALIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.Taxonomy <em>Taxonomy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.Taxonomy
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getTaxonomy()
	 * @generated
	 */
	int TAXONOMY = 15;

	/**
	 * The meta object id for the '{@link visualizationDesignLanguage.DataProperty <em>Data Property</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see visualizationDesignLanguage.DataProperty
	 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getDataProperty()
	 * @generated
	 */
	int DATA_PROPERTY = 16;


	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Dashboard <em>Dashboard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dashboard</em>'.
	 * @see visualizationDesignLanguage.Dashboard
	 * @generated
	 */
	EClass getDashboard();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Dashboard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizationDesignLanguage.Dashboard#getName()
	 * @see #getDashboard()
	 * @generated
	 */
	EAttribute getDashboard_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Dashboard#getWindows <em>Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Windows</em>'.
	 * @see visualizationDesignLanguage.Dashboard#getWindows()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Windows();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Dashboard#getVisualizations <em>Visualizations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Visualizations</em>'.
	 * @see visualizationDesignLanguage.Dashboard#getVisualizations()
	 * @see #getDashboard()
	 * @generated
	 */
	EReference getDashboard_Visualizations();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Window <em>Window</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Window</em>'.
	 * @see visualizationDesignLanguage.Window
	 * @generated
	 */
	EClass getWindow();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Window#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizationDesignLanguage.Window#getName()
	 * @see #getWindow()
	 * @generated
	 */
	EAttribute getWindow_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Window#getOrganizes <em>Organizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Organizes</em>'.
	 * @see visualizationDesignLanguage.Window#getOrganizes()
	 * @see #getWindow()
	 * @generated
	 */
	EReference getWindow_Organizes();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Container</em>'.
	 * @see visualizationDesignLanguage.Container
	 * @generated
	 */
	EClass getContainer();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Container#getPonderation <em>Ponderation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ponderation</em>'.
	 * @see visualizationDesignLanguage.Container#getPonderation()
	 * @see #getContainer()
	 * @generated
	 */
	EAttribute getContainer_Ponderation();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Container#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see visualizationDesignLanguage.Container#getContains()
	 * @see #getContainer()
	 * @generated
	 */
	EReference getContainer_Contains();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Column <em>Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Column</em>'.
	 * @see visualizationDesignLanguage.Column
	 * @generated
	 */
	EClass getColumn();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line</em>'.
	 * @see visualizationDesignLanguage.Line
	 * @generated
	 */
	EClass getLine();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Visualization <em>Visualization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Visualization</em>'.
	 * @see visualizationDesignLanguage.Visualization
	 * @generated
	 */
	EClass getVisualization();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Visualization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizationDesignLanguage.Visualization#getName()
	 * @see #getVisualization()
	 * @generated
	 */
	EAttribute getVisualization_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Visualization#getDisplays <em>Displays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Displays</em>'.
	 * @see visualizationDesignLanguage.Visualization#getDisplays()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Displays();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Visualization#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see visualizationDesignLanguage.Visualization#getConcerns()
	 * @see #getVisualization()
	 * @generated
	 */
	EReference getVisualization_Concerns();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Cell <em>Cell</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cell</em>'.
	 * @see visualizationDesignLanguage.Cell
	 * @generated
	 */
	EClass getCell();

	/**
	 * Returns the meta object for the reference '{@link visualizationDesignLanguage.Cell#getWraps <em>Wraps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Wraps</em>'.
	 * @see visualizationDesignLanguage.Cell#getWraps()
	 * @see #getCell()
	 * @generated
	 */
	EReference getCell_Wraps();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see visualizationDesignLanguage.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Source#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see visualizationDesignLanguage.Source#getName()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link visualizationDesignLanguage.Source#getConcerns <em>Concerns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Concerns</em>'.
	 * @see visualizationDesignLanguage.Source#getConcerns()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Concerns();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Source#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see visualizationDesignLanguage.Source#getLocation()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Location();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Source#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see visualizationDesignLanguage.Source#getType()
	 * @see #getSource()
	 * @generated
	 */
	EAttribute getSource_Type();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Concern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Concern</em>'.
	 * @see visualizationDesignLanguage.Concern
	 * @generated
	 */
	EClass getConcern();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.HowQualifier <em>How Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>How Qualifier</em>'.
	 * @see visualizationDesignLanguage.HowQualifier
	 * @generated
	 */
	EClass getHowQualifier();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.WhatQualifier <em>What Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>What Qualifier</em>'.
	 * @see visualizationDesignLanguage.WhatQualifier
	 * @generated
	 */
	EClass getWhatQualifier();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.WhatQualifier#getConcern <em>Concern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Concern</em>'.
	 * @see visualizationDesignLanguage.WhatQualifier#getConcern()
	 * @see #getWhatQualifier()
	 * @generated
	 */
	EAttribute getWhatQualifier_Concern();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see visualizationDesignLanguage.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Colorization <em>Colorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colorization</em>'.
	 * @see visualizationDesignLanguage.Colorization
	 * @generated
	 */
	EClass getColorization();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Colorization#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see visualizationDesignLanguage.Colorization#getColor()
	 * @see #getColorization()
	 * @generated
	 */
	EAttribute getColorization_Color();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Property <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see visualizationDesignLanguage.Property
	 * @generated
	 */
	EClass getProperty();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Property#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see visualizationDesignLanguage.Property#getValue()
	 * @see #getProperty()
	 * @generated
	 */
	EAttribute getProperty_Value();

	/**
	 * Returns the meta object for class '{@link visualizationDesignLanguage.Threshold <em>Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Threshold</em>'.
	 * @see visualizationDesignLanguage.Threshold
	 * @generated
	 */
	EClass getThreshold();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Threshold#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see visualizationDesignLanguage.Threshold#getMin()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_Min();

	/**
	 * Returns the meta object for the attribute '{@link visualizationDesignLanguage.Threshold#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see visualizationDesignLanguage.Threshold#getMax()
	 * @see #getThreshold()
	 * @generated
	 */
	EAttribute getThreshold_Max();

	/**
	 * Returns the meta object for enum '{@link visualizationDesignLanguage.Taxonomy <em>Taxonomy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Taxonomy</em>'.
	 * @see visualizationDesignLanguage.Taxonomy
	 * @generated
	 */
	EEnum getTaxonomy();

	/**
	 * Returns the meta object for enum '{@link visualizationDesignLanguage.DataProperty <em>Data Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Property</em>'.
	 * @see visualizationDesignLanguage.DataProperty
	 * @generated
	 */
	EEnum getDataProperty();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VisualizationDesignLanguageFactory getVisualizationDesignLanguageFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.DashboardImpl <em>Dashboard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.DashboardImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getDashboard()
		 * @generated
		 */
		EClass DASHBOARD = eINSTANCE.getDashboard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DASHBOARD__NAME = eINSTANCE.getDashboard_Name();

		/**
		 * The meta object literal for the '<em><b>Windows</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__WINDOWS = eINSTANCE.getDashboard_Windows();

		/**
		 * The meta object literal for the '<em><b>Visualizations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DASHBOARD__VISUALIZATIONS = eINSTANCE.getDashboard_Visualizations();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.WindowImpl <em>Window</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.WindowImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getWindow()
		 * @generated
		 */
		EClass WINDOW = eINSTANCE.getWindow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WINDOW__NAME = eINSTANCE.getWindow_Name();

		/**
		 * The meta object literal for the '<em><b>Organizes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WINDOW__ORGANIZES = eINSTANCE.getWindow_Organizes();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.ContainerImpl <em>Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.ContainerImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getContainer()
		 * @generated
		 */
		EClass CONTAINER = eINSTANCE.getContainer();

		/**
		 * The meta object literal for the '<em><b>Ponderation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINER__PONDERATION = eINSTANCE.getContainer_Ponderation();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINER__CONTAINS = eINSTANCE.getContainer_Contains();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.ColumnImpl <em>Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.ColumnImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getColumn()
		 * @generated
		 */
		EClass COLUMN = eINSTANCE.getColumn();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.LineImpl <em>Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.LineImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getLine()
		 * @generated
		 */
		EClass LINE = eINSTANCE.getLine();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.VisualizationImpl <em>Visualization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.VisualizationImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getVisualization()
		 * @generated
		 */
		EClass VISUALIZATION = eINSTANCE.getVisualization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VISUALIZATION__NAME = eINSTANCE.getVisualization_Name();

		/**
		 * The meta object literal for the '<em><b>Displays</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__DISPLAYS = eINSTANCE.getVisualization_Displays();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VISUALIZATION__CONCERNS = eINSTANCE.getVisualization_Concerns();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.CellImpl <em>Cell</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.CellImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getCell()
		 * @generated
		 */
		EClass CELL = eINSTANCE.getCell();

		/**
		 * The meta object literal for the '<em><b>Wraps</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CELL__WRAPS = eINSTANCE.getCell_Wraps();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.SourceImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__NAME = eINSTANCE.getSource_Name();

		/**
		 * The meta object literal for the '<em><b>Concerns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CONCERNS = eINSTANCE.getSource_Concerns();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__LOCATION = eINSTANCE.getSource_Location();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SOURCE__TYPE = eINSTANCE.getSource_Type();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.ConcernImpl <em>Concern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.ConcernImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getConcern()
		 * @generated
		 */
		EClass CONCERN = eINSTANCE.getConcern();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.HowQualifierImpl <em>How Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.HowQualifierImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getHowQualifier()
		 * @generated
		 */
		EClass HOW_QUALIFIER = eINSTANCE.getHowQualifier();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.WhatQualifierImpl <em>What Qualifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.WhatQualifierImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getWhatQualifier()
		 * @generated
		 */
		EClass WHAT_QUALIFIER = eINSTANCE.getWhatQualifier();

		/**
		 * The meta object literal for the '<em><b>Concern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WHAT_QUALIFIER__CONCERN = eINSTANCE.getWhatQualifier_Concern();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.IconImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.ColorizationImpl <em>Colorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.ColorizationImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getColorization()
		 * @generated
		 */
		EClass COLORIZATION = eINSTANCE.getColorization();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLORIZATION__COLOR = eINSTANCE.getColorization_Color();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.PropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.PropertyImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getProperty()
		 * @generated
		 */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.impl.ThresholdImpl <em>Threshold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.impl.ThresholdImpl
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getThreshold()
		 * @generated
		 */
		EClass THRESHOLD = eINSTANCE.getThreshold();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD__MIN = eINSTANCE.getThreshold_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THRESHOLD__MAX = eINSTANCE.getThreshold_Max();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.Taxonomy <em>Taxonomy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.Taxonomy
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getTaxonomy()
		 * @generated
		 */
		EEnum TAXONOMY = eINSTANCE.getTaxonomy();

		/**
		 * The meta object literal for the '{@link visualizationDesignLanguage.DataProperty <em>Data Property</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see visualizationDesignLanguage.DataProperty
		 * @see visualizationDesignLanguage.impl.VisualizationDesignLanguagePackageImpl#getDataProperty()
		 * @generated
		 */
		EEnum DATA_PROPERTY = eINSTANCE.getDataProperty();

	}

} //VisualizationDesignLanguagePackage
