package visualizationDesignLanguage.DSL.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import visualizationDesignLanguage.Cell;
import visualizationDesignLanguage.Colorization;
import visualizationDesignLanguage.Column;
import visualizationDesignLanguage.DSL.services.VDGrammarAccess;
import visualizationDesignLanguage.Dashboard;
import visualizationDesignLanguage.Icon;
import visualizationDesignLanguage.Line;
import visualizationDesignLanguage.Property;
import visualizationDesignLanguage.Source;
import visualizationDesignLanguage.Threshold;
import visualizationDesignLanguage.Visualization;
import visualizationDesignLanguage.VisualizationDesignLanguagePackage;
import visualizationDesignLanguage.WhatQualifier;
import visualizationDesignLanguage.Window;

@SuppressWarnings("all")
public abstract class AbstractVDSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private VDGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == VisualizationDesignLanguagePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case VisualizationDesignLanguagePackage.CELL:
				if(context == grammarAccess.getCellRule()) {
					sequence_Cell(context, (Cell) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.COLORIZATION:
				if(context == grammarAccess.getColorizationRule() ||
				   context == grammarAccess.getHowQualifierRule()) {
					sequence_Colorization(context, (Colorization) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.COLUMN:
				if(context == grammarAccess.getContainerRule()) {
					sequence_Container(context, (Column) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.DASHBOARD:
				if(context == grammarAccess.getDashboardRule()) {
					sequence_Dashboard(context, (Dashboard) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.ICON:
				if(context == grammarAccess.getHowQualifierRule() ||
				   context == grammarAccess.getIconRule()) {
					sequence_Icon(context, (Icon) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.LINE:
				if(context == grammarAccess.getContainerRule()) {
					sequence_Container(context, (Line) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.PROPERTY:
				if(context == grammarAccess.getHowQualifierRule() ||
				   context == grammarAccess.getPropertyRule()) {
					sequence_Property(context, (Property) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.SOURCE:
				if(context == grammarAccess.getSourceRule()) {
					sequence_Source(context, (Source) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.THRESHOLD:
				if(context == grammarAccess.getHowQualifierRule() ||
				   context == grammarAccess.getThresholdRule()) {
					sequence_Threshold(context, (Threshold) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.VISUALIZATION:
				if(context == grammarAccess.getVisualizationRule()) {
					sequence_Visualization(context, (Visualization) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.WHAT_QUALIFIER:
				if(context == grammarAccess.getWhatQualifierRule()) {
					sequence_WhatQualifier(context, (WhatQualifier) semanticObject); 
					return; 
				}
				else break;
			case VisualizationDesignLanguagePackage.WINDOW:
				if(context == grammarAccess.getWindowRule()) {
					sequence_Window(context, (Window) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     wraps=[Visualization|ID]
	 */
	protected void sequence_Cell(EObject context, Cell semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualizationDesignLanguagePackage.Literals.CELL__WRAPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDesignLanguagePackage.Literals.CELL__WRAPS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCellAccess().getWrapsVisualizationIDTerminalRuleCall_0_1(), semanticObject.getWraps());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     color=EString
	 */
	protected void sequence_Colorization(EObject context, Colorization semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualizationDesignLanguagePackage.Literals.COLORIZATION__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDesignLanguagePackage.Literals.COLORIZATION__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getColorizationAccess().getColorEStringParserRuleCall_2_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ponderation=EInt? contains+=Cell contains+=Cell*)
	 */
	protected void sequence_Container(EObject context, Column semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ponderation=EInt? contains+=Cell contains+=Cell*)
	 */
	protected void sequence_Container(EObject context, Line semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString visualizations+=Visualization visualizations+=Visualization* windows+=Window windows+=Window*)
	 */
	protected void sequence_Dashboard(EObject context, Dashboard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Icon}
	 */
	protected void sequence_Icon(EObject context, Icon semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=DataProperty
	 */
	protected void sequence_Property(EObject context, Property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualizationDesignLanguagePackage.Literals.PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDesignLanguagePackage.Literals.PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAccess().getValueDataPropertyEnumRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString type=EString? location=EString? (concerns+=HowQualifier concerns+=HowQualifier*)?)
	 */
	protected void sequence_Source(EObject context, Source semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (min=EInt? max=EInt?)
	 */
	protected void sequence_Threshold(EObject context, Threshold semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString (concerns+=WhatQualifier concerns+=WhatQualifier*)? displays+=Source displays+=Source*)
	 */
	protected void sequence_Visualization(EObject context, Visualization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     concern=Taxonomy
	 */
	protected void sequence_WhatQualifier(EObject context, WhatQualifier semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, VisualizationDesignLanguagePackage.Literals.WHAT_QUALIFIER__CONCERN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, VisualizationDesignLanguagePackage.Literals.WHAT_QUALIFIER__CONCERN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhatQualifierAccess().getConcernTaxonomyEnumRuleCall_0(), semanticObject.getConcern());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString organizes+=Container organizes+=Container*)
	 */
	protected void sequence_Window(EObject context, Window semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
