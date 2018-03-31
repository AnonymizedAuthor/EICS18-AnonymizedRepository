/**
 */
package visualizationDesignLanguage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Taxonomy</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see visualizationDesignLanguage.VisualizationDesignLanguagePackage#getTaxonomy()
 * @model
 * @generated
 */
public enum Taxonomy implements Enumerator {
	/**
	 * The '<em><b>Proportion</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROPORTION_VALUE
	 * @generated
	 * @ordered
	 */
	PROPORTION(0, "Proportion", "Proportion"),

	/**
	 * The '<em><b>Location</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOCATION_VALUE
	 * @generated
	 * @ordered
	 */
	LOCATION(1, "Location", "Location"),

	/**
	 * The '<em><b>Comparison</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPARISON_VALUE
	 * @generated
	 * @ordered
	 */
	COMPARISON(2, "Comparison", "Comparison"),

	/**
	 * The '<em><b>Part to awhole</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PART_TO_AWHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	PART_TO_AWHOLE(3, "Part_to_a_whole", "Part_to_a_whole"),

	/**
	 * The '<em><b>Relationship</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP_VALUE
	 * @generated
	 * @ordered
	 */
	RELATIONSHIP(4, "Relationship", "Relationship"),

	/**
	 * The '<em><b>Over time</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVER_TIME_VALUE
	 * @generated
	 * @ordered
	 */
	OVER_TIME(5, "Over_time", "Over_time"),

	/**
	 * The '<em><b>Distribution</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION_VALUE
	 * @generated
	 * @ordered
	 */
	DISTRIBUTION(6, "Distribution", "Distribution"),

	/**
	 * The '<em><b>Hierarchy</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY_VALUE
	 * @generated
	 * @ordered
	 */
	HIERARCHY(7, "Hierarchy", "Hierarchy"),

	/**
	 * The '<em><b>Reference tool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_TOOL_VALUE
	 * @generated
	 * @ordered
	 */
	REFERENCE_TOOL(8, "Reference_tool", "Reference_tool"),

	/**
	 * The '<em><b>Range</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	RANGE(9, "Range", "Range"),

	/**
	 * The '<em><b>Pattern</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATTERN_VALUE
	 * @generated
	 * @ordered
	 */
	PATTERN(10, "Pattern", "Pattern"), /**
	 * The '<em><b>Extremum</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXTREMUM_VALUE
	 * @generated
	 * @ordered
	 */
	EXTREMUM(11, "Extremum", "Extremum");

	/**
	 * The '<em><b>Proportion</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Proportion</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROPORTION
	 * @model name="Proportion"
	 * @generated
	 * @ordered
	 */
	public static final int PROPORTION_VALUE = 0;

	/**
	 * The '<em><b>Location</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Location</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOCATION
	 * @model name="Location"
	 * @generated
	 * @ordered
	 */
	public static final int LOCATION_VALUE = 1;

	/**
	 * The '<em><b>Comparison</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Comparison</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPARISON
	 * @model name="Comparison"
	 * @generated
	 * @ordered
	 */
	public static final int COMPARISON_VALUE = 2;

	/**
	 * The '<em><b>Part to awhole</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Part to awhole</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PART_TO_AWHOLE
	 * @model name="Part_to_a_whole"
	 * @generated
	 * @ordered
	 */
	public static final int PART_TO_AWHOLE_VALUE = 3;

	/**
	 * The '<em><b>Relationship</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Relationship</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RELATIONSHIP
	 * @model name="Relationship"
	 * @generated
	 * @ordered
	 */
	public static final int RELATIONSHIP_VALUE = 4;

	/**
	 * The '<em><b>Over time</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Over time</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVER_TIME
	 * @model name="Over_time"
	 * @generated
	 * @ordered
	 */
	public static final int OVER_TIME_VALUE = 5;

	/**
	 * The '<em><b>Distribution</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Distribution</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISTRIBUTION
	 * @model name="Distribution"
	 * @generated
	 * @ordered
	 */
	public static final int DISTRIBUTION_VALUE = 6;

	/**
	 * The '<em><b>Hierarchy</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hierarchy</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIERARCHY
	 * @model name="Hierarchy"
	 * @generated
	 * @ordered
	 */
	public static final int HIERARCHY_VALUE = 7;

	/**
	 * The '<em><b>Reference tool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reference tool</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REFERENCE_TOOL
	 * @model name="Reference_tool"
	 * @generated
	 * @ordered
	 */
	public static final int REFERENCE_TOOL_VALUE = 8;

	/**
	 * The '<em><b>Range</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Range</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RANGE
	 * @model name="Range"
	 * @generated
	 * @ordered
	 */
	public static final int RANGE_VALUE = 9;

	/**
	 * The '<em><b>Pattern</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pattern</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATTERN
	 * @model name="Pattern"
	 * @generated
	 * @ordered
	 */
	public static final int PATTERN_VALUE = 10;

	/**
	 * The '<em><b>Extremum</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Extremum</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXTREMUM
	 * @model name="Extremum"
	 * @generated
	 * @ordered
	 */
	public static final int EXTREMUM_VALUE = 11;

	/**
	 * An array of all the '<em><b>Taxonomy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Taxonomy[] VALUES_ARRAY =
		new Taxonomy[] {
			PROPORTION,
			LOCATION,
			COMPARISON,
			PART_TO_AWHOLE,
			RELATIONSHIP,
			OVER_TIME,
			DISTRIBUTION,
			HIERARCHY,
			REFERENCE_TOOL,
			RANGE,
			PATTERN,
			EXTREMUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Taxonomy</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Taxonomy> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Taxonomy</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Taxonomy get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Taxonomy result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Taxonomy</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Taxonomy getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Taxonomy result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Taxonomy</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Taxonomy get(int value) {
		switch (value) {
			case PROPORTION_VALUE: return PROPORTION;
			case LOCATION_VALUE: return LOCATION;
			case COMPARISON_VALUE: return COMPARISON;
			case PART_TO_AWHOLE_VALUE: return PART_TO_AWHOLE;
			case RELATIONSHIP_VALUE: return RELATIONSHIP;
			case OVER_TIME_VALUE: return OVER_TIME;
			case DISTRIBUTION_VALUE: return DISTRIBUTION;
			case HIERARCHY_VALUE: return HIERARCHY;
			case REFERENCE_TOOL_VALUE: return REFERENCE_TOOL;
			case RANGE_VALUE: return RANGE;
			case PATTERN_VALUE: return PATTERN;
			case EXTREMUM_VALUE: return EXTREMUM;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Taxonomy(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Taxonomy
