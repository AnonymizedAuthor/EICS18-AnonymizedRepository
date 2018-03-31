/**
 */
package visualizationDesignLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import visualizationDesignLanguage.Cell;
import visualizationDesignLanguage.Colorization;
import visualizationDesignLanguage.Column;
import visualizationDesignLanguage.Concern;
import visualizationDesignLanguage.Dashboard;
import visualizationDesignLanguage.DataProperty;
import visualizationDesignLanguage.HowQualifier;
import visualizationDesignLanguage.Icon;
import visualizationDesignLanguage.Line;
import visualizationDesignLanguage.Property;
import visualizationDesignLanguage.Source;
import visualizationDesignLanguage.Taxonomy;
import visualizationDesignLanguage.Threshold;
import visualizationDesignLanguage.Visualization;
import visualizationDesignLanguage.VisualizationDesignLanguageFactory;
import visualizationDesignLanguage.VisualizationDesignLanguagePackage;
import visualizationDesignLanguage.WhatQualifier;
import visualizationDesignLanguage.Window;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationDesignLanguagePackageImpl extends EPackageImpl implements VisualizationDesignLanguagePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dashboardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass windowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass visualizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concernEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass howQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whatQualifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iconEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass thresholdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxonomyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataPropertyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private VisualizationDesignLanguagePackageImpl() {
		super(eNS_URI, VisualizationDesignLanguageFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link VisualizationDesignLanguagePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static VisualizationDesignLanguagePackage init() {
		if (isInited) return (VisualizationDesignLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(VisualizationDesignLanguagePackage.eNS_URI);

		// Obtain or create and register package
		VisualizationDesignLanguagePackageImpl theVisualizationDesignLanguagePackage = (VisualizationDesignLanguagePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof VisualizationDesignLanguagePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new VisualizationDesignLanguagePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theVisualizationDesignLanguagePackage.createPackageContents();

		// Initialize created meta-data
		theVisualizationDesignLanguagePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theVisualizationDesignLanguagePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(VisualizationDesignLanguagePackage.eNS_URI, theVisualizationDesignLanguagePackage);
		return theVisualizationDesignLanguagePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDashboard() {
		return dashboardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDashboard_Name() {
		return (EAttribute)dashboardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Windows() {
		return (EReference)dashboardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDashboard_Visualizations() {
		return (EReference)dashboardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWindow() {
		return windowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWindow_Name() {
		return (EAttribute)windowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWindow_Organizes() {
		return (EReference)windowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainer() {
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainer_Ponderation() {
		return (EAttribute)containerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainer_Contains() {
		return (EReference)containerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColumn() {
		return columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVisualization() {
		return visualizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVisualization_Name() {
		return (EAttribute)visualizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Displays() {
		return (EReference)visualizationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVisualization_Concerns() {
		return (EReference)visualizationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCell() {
		return cellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCell_Wraps() {
		return (EReference)cellEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Name() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSource_Concerns() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Location() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSource_Type() {
		return (EAttribute)sourceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConcern() {
		return concernEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHowQualifier() {
		return howQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhatQualifier() {
		return whatQualifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWhatQualifier_Concern() {
		return (EAttribute)whatQualifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIcon() {
		return iconEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorization() {
		return colorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorization_Color() {
		return (EAttribute)colorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProperty() {
		return propertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProperty_Value() {
		return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThreshold() {
		return thresholdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreshold_Min() {
		return (EAttribute)thresholdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getThreshold_Max() {
		return (EAttribute)thresholdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxonomy() {
		return taxonomyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataProperty() {
		return dataPropertyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisualizationDesignLanguageFactory getVisualizationDesignLanguageFactory() {
		return (VisualizationDesignLanguageFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		dashboardEClass = createEClass(DASHBOARD);
		createEAttribute(dashboardEClass, DASHBOARD__NAME);
		createEReference(dashboardEClass, DASHBOARD__WINDOWS);
		createEReference(dashboardEClass, DASHBOARD__VISUALIZATIONS);

		windowEClass = createEClass(WINDOW);
		createEAttribute(windowEClass, WINDOW__NAME);
		createEReference(windowEClass, WINDOW__ORGANIZES);

		containerEClass = createEClass(CONTAINER);
		createEAttribute(containerEClass, CONTAINER__PONDERATION);
		createEReference(containerEClass, CONTAINER__CONTAINS);

		columnEClass = createEClass(COLUMN);

		lineEClass = createEClass(LINE);

		visualizationEClass = createEClass(VISUALIZATION);
		createEAttribute(visualizationEClass, VISUALIZATION__NAME);
		createEReference(visualizationEClass, VISUALIZATION__DISPLAYS);
		createEReference(visualizationEClass, VISUALIZATION__CONCERNS);

		cellEClass = createEClass(CELL);
		createEReference(cellEClass, CELL__WRAPS);

		sourceEClass = createEClass(SOURCE);
		createEAttribute(sourceEClass, SOURCE__NAME);
		createEReference(sourceEClass, SOURCE__CONCERNS);
		createEAttribute(sourceEClass, SOURCE__LOCATION);
		createEAttribute(sourceEClass, SOURCE__TYPE);

		concernEClass = createEClass(CONCERN);

		howQualifierEClass = createEClass(HOW_QUALIFIER);

		whatQualifierEClass = createEClass(WHAT_QUALIFIER);
		createEAttribute(whatQualifierEClass, WHAT_QUALIFIER__CONCERN);

		iconEClass = createEClass(ICON);

		colorizationEClass = createEClass(COLORIZATION);
		createEAttribute(colorizationEClass, COLORIZATION__COLOR);

		propertyEClass = createEClass(PROPERTY);
		createEAttribute(propertyEClass, PROPERTY__VALUE);

		thresholdEClass = createEClass(THRESHOLD);
		createEAttribute(thresholdEClass, THRESHOLD__MIN);
		createEAttribute(thresholdEClass, THRESHOLD__MAX);

		// Create enums
		taxonomyEEnum = createEEnum(TAXONOMY);
		dataPropertyEEnum = createEEnum(DATA_PROPERTY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		columnEClass.getESuperTypes().add(this.getContainer());
		lineEClass.getESuperTypes().add(this.getContainer());
		howQualifierEClass.getESuperTypes().add(this.getConcern());
		whatQualifierEClass.getESuperTypes().add(this.getConcern());
		iconEClass.getESuperTypes().add(this.getHowQualifier());
		colorizationEClass.getESuperTypes().add(this.getHowQualifier());
		propertyEClass.getESuperTypes().add(this.getHowQualifier());
		thresholdEClass.getESuperTypes().add(this.getHowQualifier());

		// Initialize classes, features, and operations; add parameters
		initEClass(dashboardEClass, Dashboard.class, "Dashboard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDashboard_Name(), ecorePackage.getEString(), "name", null, 1, 1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Windows(), this.getWindow(), null, "windows", null, 1, -1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDashboard_Visualizations(), this.getVisualization(), null, "visualizations", null, 1, -1, Dashboard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(windowEClass, Window.class, "Window", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWindow_Name(), ecorePackage.getEString(), "name", null, 1, 1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWindow_Organizes(), this.getContainer(), null, "organizes", null, 1, -1, Window.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerEClass, visualizationDesignLanguage.Container.class, "Container", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainer_Ponderation(), ecorePackage.getEInt(), "ponderation", null, 0, 1, visualizationDesignLanguage.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContainer_Contains(), this.getCell(), null, "contains", null, 1, -1, visualizationDesignLanguage.Container.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(columnEClass, Column.class, "Column", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(visualizationEClass, Visualization.class, "Visualization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVisualization_Name(), ecorePackage.getEString(), "name", null, 0, 1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Displays(), this.getSource(), null, "displays", null, 0, -1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVisualization_Concerns(), this.getWhatQualifier(), null, "concerns", null, 0, -1, Visualization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cellEClass, Cell.class, "Cell", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCell_Wraps(), this.getVisualization(), null, "wraps", null, 1, 1, Cell.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSource_Name(), ecorePackage.getEString(), "name", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Concerns(), this.getHowQualifier(), null, "concerns", null, 0, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Location(), ecorePackage.getEString(), "location", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSource_Type(), ecorePackage.getEString(), "type", null, 0, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concernEClass, Concern.class, "Concern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(howQualifierEClass, HowQualifier.class, "HowQualifier", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(whatQualifierEClass, WhatQualifier.class, "WhatQualifier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWhatQualifier_Concern(), this.getTaxonomy(), "concern", null, 1, 1, WhatQualifier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iconEClass, Icon.class, "Icon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(colorizationEClass, Colorization.class, "Colorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorization_Color(), ecorePackage.getEString(), "color", null, 0, 1, Colorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProperty_Value(), this.getDataProperty(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(thresholdEClass, Threshold.class, "Threshold", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getThreshold_Min(), ecorePackage.getEInt(), "min", null, 0, 1, Threshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getThreshold_Max(), ecorePackage.getEInt(), "max", null, 0, 1, Threshold.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(taxonomyEEnum, Taxonomy.class, "Taxonomy");
		addEEnumLiteral(taxonomyEEnum, Taxonomy.PROPORTION);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.LOCATION);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.COMPARISON);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.PART_TO_AWHOLE);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.RELATIONSHIP);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.OVER_TIME);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.DISTRIBUTION);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.HIERARCHY);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.REFERENCE_TOOL);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.RANGE);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.PATTERN);
		addEEnumLiteral(taxonomyEEnum, Taxonomy.EXTREMUM);

		initEEnum(dataPropertyEEnum, DataProperty.class, "DataProperty");
		addEEnumLiteral(dataPropertyEEnum, DataProperty.CONTINUOUS);
		addEEnumLiteral(dataPropertyEEnum, DataProperty.DISCRETE);
		addEEnumLiteral(dataPropertyEEnum, DataProperty.SCALAR);
		addEEnumLiteral(dataPropertyEEnum, DataProperty.STRUCTURAL);

		// Create resource
		createResource(eNS_URI);
	}

} //VisualizationDesignLanguagePackageImpl
