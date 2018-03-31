package visualizationDesignLanguage.DSL.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import visualizationDesignLanguage.DSL.services.VDGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVDParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Dashboard'", "':'", "'Visualizations :'", "'Positioning :'", "'shows'", "','", "'of'", "';'", "'of type'", "'locate at'", "'displayed as'", "'view'", "'   |   '", "'Column'", "'Line'", "'sized'", "': ['", "']'", "'Icon'", "'Color'", "'Threshold ('", "'min'", "'max'", "')'", "'-'", "'Continuous'", "'Discrete'", "'Scalar'", "'Structural'", "'Proportion'", "'Location'", "'Comparison'", "'Part_to_a_whole'", "'Relationship'", "'Over_time'", "'Distribution'", "'Hierarchy'", "'Reference_tool'", "'Range'", "'Pattern'", "'Extremum'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalVDParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVDParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVDParser.tokenNames; }
    public String getGrammarFileName() { return "../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g"; }



     	private VDGrammarAccess grammarAccess;
     	
        public InternalVDParser(TokenStream input, VDGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Dashboard";	
       	}
       	
       	@Override
       	protected VDGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleDashboard"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:68:1: entryRuleDashboard returns [EObject current=null] : iv_ruleDashboard= ruleDashboard EOF ;
    public final EObject entryRuleDashboard() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDashboard = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:69:2: (iv_ruleDashboard= ruleDashboard EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:70:2: iv_ruleDashboard= ruleDashboard EOF
            {
             newCompositeNode(grammarAccess.getDashboardRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDashboard_in_entryRuleDashboard75);
            iv_ruleDashboard=ruleDashboard();

            state._fsp--;

             current =iv_ruleDashboard; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDashboard85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDashboard"


    // $ANTLR start "ruleDashboard"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:77:1: ruleDashboard returns [EObject current=null] : (otherlv_0= 'Dashboard' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'Visualizations :' ( (lv_visualizations_4_0= ruleVisualization ) ) ( (lv_visualizations_5_0= ruleVisualization ) )* otherlv_6= 'Positioning :' ( (lv_windows_7_0= ruleWindow ) ) ( (lv_windows_8_0= ruleWindow ) )* ) ;
    public final EObject ruleDashboard() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_visualizations_4_0 = null;

        EObject lv_visualizations_5_0 = null;

        EObject lv_windows_7_0 = null;

        EObject lv_windows_8_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:80:28: ( (otherlv_0= 'Dashboard' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'Visualizations :' ( (lv_visualizations_4_0= ruleVisualization ) ) ( (lv_visualizations_5_0= ruleVisualization ) )* otherlv_6= 'Positioning :' ( (lv_windows_7_0= ruleWindow ) ) ( (lv_windows_8_0= ruleWindow ) )* ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:81:1: (otherlv_0= 'Dashboard' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'Visualizations :' ( (lv_visualizations_4_0= ruleVisualization ) ) ( (lv_visualizations_5_0= ruleVisualization ) )* otherlv_6= 'Positioning :' ( (lv_windows_7_0= ruleWindow ) ) ( (lv_windows_8_0= ruleWindow ) )* )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:81:1: (otherlv_0= 'Dashboard' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'Visualizations :' ( (lv_visualizations_4_0= ruleVisualization ) ) ( (lv_visualizations_5_0= ruleVisualization ) )* otherlv_6= 'Positioning :' ( (lv_windows_7_0= ruleWindow ) ) ( (lv_windows_8_0= ruleWindow ) )* )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:81:3: otherlv_0= 'Dashboard' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' otherlv_3= 'Visualizations :' ( (lv_visualizations_4_0= ruleVisualization ) ) ( (lv_visualizations_5_0= ruleVisualization ) )* otherlv_6= 'Positioning :' ( (lv_windows_7_0= ruleWindow ) ) ( (lv_windows_8_0= ruleWindow ) )*
            {
            otherlv_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDashboard122); 

                	newLeafNode(otherlv_0, grammarAccess.getDashboardAccess().getDashboardKeyword_0());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:85:1: ( (lv_name_1_0= ruleEString ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:86:1: (lv_name_1_0= ruleEString )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:86:1: (lv_name_1_0= ruleEString )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:87:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getDashboardAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleDashboard143);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDashboardRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDashboard155); 

                	newLeafNode(otherlv_2, grammarAccess.getDashboardAccess().getColonKeyword_2());
                
            otherlv_3=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDashboard167); 

                	newLeafNode(otherlv_3, grammarAccess.getDashboardAccess().getVisualizationsKeyword_3());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:111:1: ( (lv_visualizations_4_0= ruleVisualization ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:112:1: (lv_visualizations_4_0= ruleVisualization )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:112:1: (lv_visualizations_4_0= ruleVisualization )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:113:3: lv_visualizations_4_0= ruleVisualization
            {
             
            	        newCompositeNode(grammarAccess.getDashboardAccess().getVisualizationsVisualizationParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleVisualization_in_ruleDashboard188);
            lv_visualizations_4_0=ruleVisualization();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDashboardRule());
            	        }
                   		add(
                   			current, 
                   			"visualizations",
                    		lv_visualizations_4_0, 
                    		"Visualization");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:129:2: ( (lv_visualizations_5_0= ruleVisualization ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:130:1: (lv_visualizations_5_0= ruleVisualization )
            	    {
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:130:1: (lv_visualizations_5_0= ruleVisualization )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:131:3: lv_visualizations_5_0= ruleVisualization
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDashboardAccess().getVisualizationsVisualizationParserRuleCall_5_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleVisualization_in_ruleDashboard209);
            	    lv_visualizations_5_0=ruleVisualization();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDashboardRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"visualizations",
            	            		lv_visualizations_5_0, 
            	            		"Visualization");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleDashboard222); 

                	newLeafNode(otherlv_6, grammarAccess.getDashboardAccess().getPositioningKeyword_6());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:151:1: ( (lv_windows_7_0= ruleWindow ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:152:1: (lv_windows_7_0= ruleWindow )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:152:1: (lv_windows_7_0= ruleWindow )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:153:3: lv_windows_7_0= ruleWindow
            {
             
            	        newCompositeNode(grammarAccess.getDashboardAccess().getWindowsWindowParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleWindow_in_ruleDashboard243);
            lv_windows_7_0=ruleWindow();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDashboardRule());
            	        }
                   		add(
                   			current, 
                   			"windows",
                    		lv_windows_7_0, 
                    		"Window");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:169:2: ( (lv_windows_8_0= ruleWindow ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:170:1: (lv_windows_8_0= ruleWindow )
            	    {
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:170:1: (lv_windows_8_0= ruleWindow )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:171:3: lv_windows_8_0= ruleWindow
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getDashboardAccess().getWindowsWindowParserRuleCall_8_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleWindow_in_ruleDashboard264);
            	    lv_windows_8_0=ruleWindow();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getDashboardRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"windows",
            	            		lv_windows_8_0, 
            	            		"Window");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDashboard"


    // $ANTLR start "entryRuleVisualization"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:195:1: entryRuleVisualization returns [EObject current=null] : iv_ruleVisualization= ruleVisualization EOF ;
    public final EObject entryRuleVisualization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVisualization = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:196:2: (iv_ruleVisualization= ruleVisualization EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:197:2: iv_ruleVisualization= ruleVisualization EOF
            {
             newCompositeNode(grammarAccess.getVisualizationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleVisualization_in_entryRuleVisualization301);
            iv_ruleVisualization=ruleVisualization();

            state._fsp--;

             current =iv_ruleVisualization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleVisualization311); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVisualization"


    // $ANTLR start "ruleVisualization"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:204:1: ruleVisualization returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )* )? otherlv_5= 'of' ( (lv_displays_6_0= ruleSource ) ) (otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) ) )* (otherlv_9= ';' )? ) ;
    public final EObject ruleVisualization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_concerns_2_0 = null;

        EObject lv_concerns_4_0 = null;

        EObject lv_displays_6_0 = null;

        EObject lv_displays_8_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:207:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )* )? otherlv_5= 'of' ( (lv_displays_6_0= ruleSource ) ) (otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) ) )* (otherlv_9= ';' )? ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:208:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )* )? otherlv_5= 'of' ( (lv_displays_6_0= ruleSource ) ) (otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) ) )* (otherlv_9= ';' )? )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:208:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )* )? otherlv_5= 'of' ( (lv_displays_6_0= ruleSource ) ) (otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) ) )* (otherlv_9= ';' )? )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:208:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )* )? otherlv_5= 'of' ( (lv_displays_6_0= ruleSource ) ) (otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) ) )* (otherlv_9= ';' )?
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:208:2: ( (lv_name_0_0= ruleEString ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:209:1: (lv_name_0_0= ruleEString )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:209:1: (lv_name_0_0= ruleEString )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:210:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getVisualizationAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleVisualization357);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:226:2: (otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:226:4: otherlv_1= 'shows' ( (lv_concerns_2_0= ruleWhatQualifier ) ) (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )*
                    {
                    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleVisualization370); 

                        	newLeafNode(otherlv_1, grammarAccess.getVisualizationAccess().getShowsKeyword_1_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:230:1: ( (lv_concerns_2_0= ruleWhatQualifier ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:231:1: (lv_concerns_2_0= ruleWhatQualifier )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:231:1: (lv_concerns_2_0= ruleWhatQualifier )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:232:3: lv_concerns_2_0= ruleWhatQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getVisualizationAccess().getConcernsWhatQualifierParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleWhatQualifier_in_ruleVisualization391);
                    lv_concerns_2_0=ruleWhatQualifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                    	        }
                           		add(
                           			current, 
                           			"concerns",
                            		lv_concerns_2_0, 
                            		"WhatQualifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:248:2: (otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==16) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:248:4: otherlv_3= ',' ( (lv_concerns_4_0= ruleWhatQualifier ) )
                    	    {
                    	    otherlv_3=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleVisualization404); 

                    	        	newLeafNode(otherlv_3, grammarAccess.getVisualizationAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:252:1: ( (lv_concerns_4_0= ruleWhatQualifier ) )
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:253:1: (lv_concerns_4_0= ruleWhatQualifier )
                    	    {
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:253:1: (lv_concerns_4_0= ruleWhatQualifier )
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:254:3: lv_concerns_4_0= ruleWhatQualifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVisualizationAccess().getConcernsWhatQualifierParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleWhatQualifier_in_ruleVisualization425);
                    	    lv_concerns_4_0=ruleWhatQualifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"concerns",
                    	            		lv_concerns_4_0, 
                    	            		"WhatQualifier");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleVisualization441); 

                	newLeafNode(otherlv_5, grammarAccess.getVisualizationAccess().getOfKeyword_2());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:274:1: ( (lv_displays_6_0= ruleSource ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:275:1: (lv_displays_6_0= ruleSource )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:275:1: (lv_displays_6_0= ruleSource )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:276:3: lv_displays_6_0= ruleSource
            {
             
            	        newCompositeNode(grammarAccess.getVisualizationAccess().getDisplaysSourceParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleSource_in_ruleVisualization462);
            lv_displays_6_0=ruleSource();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
            	        }
                   		add(
                   			current, 
                   			"displays",
                    		lv_displays_6_0, 
                    		"Source");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:292:2: (otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18) ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1==RULE_STRING) ) {
                        int LA5_3 = input.LA(3);

                        if ( (LA5_3==EOF||(LA5_3>=RULE_ID && LA5_3<=RULE_STRING)||LA5_3==14||(LA5_3>=18 && LA5_3<=21)) ) {
                            alt5=1;
                        }


                    }
                    else if ( (LA5_1==RULE_ID) ) {
                        int LA5_4 = input.LA(3);

                        if ( (LA5_4==EOF||(LA5_4>=RULE_ID && LA5_4<=RULE_STRING)||LA5_4==14||(LA5_4>=18 && LA5_4<=21)) ) {
                            alt5=1;
                        }


                    }


                }


                switch (alt5) {
            	case 1 :
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:292:4: otherlv_7= ';' ( (lv_displays_8_0= ruleSource ) )
            	    {
            	    otherlv_7=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVisualization475); 

            	        	newLeafNode(otherlv_7, grammarAccess.getVisualizationAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:296:1: ( (lv_displays_8_0= ruleSource ) )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:297:1: (lv_displays_8_0= ruleSource )
            	    {
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:297:1: (lv_displays_8_0= ruleSource )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:298:3: lv_displays_8_0= ruleSource
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVisualizationAccess().getDisplaysSourceParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleSource_in_ruleVisualization496);
            	    lv_displays_8_0=ruleSource();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVisualizationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"displays",
            	            		lv_displays_8_0, 
            	            		"Source");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:314:4: (otherlv_9= ';' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==18) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:314:6: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleVisualization511); 

                        	newLeafNode(otherlv_9, grammarAccess.getVisualizationAccess().getSemicolonKeyword_5());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVisualization"


    // $ANTLR start "entryRuleWhatQualifier"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:326:1: entryRuleWhatQualifier returns [EObject current=null] : iv_ruleWhatQualifier= ruleWhatQualifier EOF ;
    public final EObject entryRuleWhatQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhatQualifier = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:327:2: (iv_ruleWhatQualifier= ruleWhatQualifier EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:328:2: iv_ruleWhatQualifier= ruleWhatQualifier EOF
            {
             newCompositeNode(grammarAccess.getWhatQualifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWhatQualifier_in_entryRuleWhatQualifier549);
            iv_ruleWhatQualifier=ruleWhatQualifier();

            state._fsp--;

             current =iv_ruleWhatQualifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWhatQualifier559); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWhatQualifier"


    // $ANTLR start "ruleWhatQualifier"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:335:1: ruleWhatQualifier returns [EObject current=null] : ( (lv_concern_0_0= ruleTaxonomy ) ) ;
    public final EObject ruleWhatQualifier() throws RecognitionException {
        EObject current = null;

        Enumerator lv_concern_0_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:338:28: ( ( (lv_concern_0_0= ruleTaxonomy ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:339:1: ( (lv_concern_0_0= ruleTaxonomy ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:339:1: ( (lv_concern_0_0= ruleTaxonomy ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:340:1: (lv_concern_0_0= ruleTaxonomy )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:340:1: (lv_concern_0_0= ruleTaxonomy )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:341:3: lv_concern_0_0= ruleTaxonomy
            {
             
            	        newCompositeNode(grammarAccess.getWhatQualifierAccess().getConcernTaxonomyEnumRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleTaxonomy_in_ruleWhatQualifier604);
            lv_concern_0_0=ruleTaxonomy();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWhatQualifierRule());
            	        }
                   		set(
                   			current, 
                   			"concern",
                    		lv_concern_0_0, 
                    		"Taxonomy");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWhatQualifier"


    // $ANTLR start "entryRuleSource"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:365:1: entryRuleSource returns [EObject current=null] : iv_ruleSource= ruleSource EOF ;
    public final EObject entryRuleSource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSource = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:366:2: (iv_ruleSource= ruleSource EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:367:2: iv_ruleSource= ruleSource EOF
            {
             newCompositeNode(grammarAccess.getSourceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleSource_in_entryRuleSource639);
            iv_ruleSource=ruleSource();

            state._fsp--;

             current =iv_ruleSource; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleSource649); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSource"


    // $ANTLR start "ruleSource"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:374:1: ruleSource returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) ) )? (otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) ) )? (otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )* )? ) ;
    public final EObject ruleSource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_type_2_0 = null;

        AntlrDatatypeRuleToken lv_location_4_0 = null;

        EObject lv_concerns_6_0 = null;

        EObject lv_concerns_8_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:377:28: ( ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) ) )? (otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) ) )? (otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )* )? ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:378:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) ) )? (otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) ) )? (otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )* )? )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:378:1: ( ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) ) )? (otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) ) )? (otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )* )? )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:378:2: ( (lv_name_0_0= ruleEString ) ) (otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) ) )? (otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) ) )? (otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )* )?
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:378:2: ( (lv_name_0_0= ruleEString ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:379:1: (lv_name_0_0= ruleEString )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:379:1: (lv_name_0_0= ruleEString )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:380:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getSourceAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSource695);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSourceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:396:2: (otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:396:4: otherlv_1= 'of type' ( (lv_type_2_0= ruleEString ) )
                    {
                    otherlv_1=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleSource708); 

                        	newLeafNode(otherlv_1, grammarAccess.getSourceAccess().getOfTypeKeyword_1_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:400:1: ( (lv_type_2_0= ruleEString ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:401:1: (lv_type_2_0= ruleEString )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:401:1: (lv_type_2_0= ruleEString )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:402:3: lv_type_2_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSourceAccess().getTypeEStringParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSource729);
                    lv_type_2_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"type",
                            		lv_type_2_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:418:4: (otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:418:6: otherlv_3= 'locate at' ( (lv_location_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleSource744); 

                        	newLeafNode(otherlv_3, grammarAccess.getSourceAccess().getLocateAtKeyword_2_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:422:1: ( (lv_location_4_0= ruleEString ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:423:1: (lv_location_4_0= ruleEString )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:423:1: (lv_location_4_0= ruleEString )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:424:3: lv_location_4_0= ruleEString
                    {
                     
                    	        newCompositeNode(grammarAccess.getSourceAccess().getLocationEStringParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleSource765);
                    lv_location_4_0=ruleEString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSourceRule());
                    	        }
                           		set(
                           			current, 
                           			"location",
                            		lv_location_4_0, 
                            		"EString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:440:4: (otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:440:6: otherlv_5= 'displayed as' ( (lv_concerns_6_0= ruleHowQualifier ) ) (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )*
                    {
                    otherlv_5=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleSource780); 

                        	newLeafNode(otherlv_5, grammarAccess.getSourceAccess().getDisplayedAsKeyword_3_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:444:1: ( (lv_concerns_6_0= ruleHowQualifier ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:445:1: (lv_concerns_6_0= ruleHowQualifier )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:445:1: (lv_concerns_6_0= ruleHowQualifier )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:446:3: lv_concerns_6_0= ruleHowQualifier
                    {
                     
                    	        newCompositeNode(grammarAccess.getSourceAccess().getConcernsHowQualifierParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleHowQualifier_in_ruleSource801);
                    lv_concerns_6_0=ruleHowQualifier();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSourceRule());
                    	        }
                           		add(
                           			current, 
                           			"concerns",
                            		lv_concerns_6_0, 
                            		"HowQualifier");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:462:2: (otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==16) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:462:4: otherlv_7= ',' ( (lv_concerns_8_0= ruleHowQualifier ) )
                    	    {
                    	    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleSource814); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getSourceAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:466:1: ( (lv_concerns_8_0= ruleHowQualifier ) )
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:467:1: (lv_concerns_8_0= ruleHowQualifier )
                    	    {
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:467:1: (lv_concerns_8_0= ruleHowQualifier )
                    	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:468:3: lv_concerns_8_0= ruleHowQualifier
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getSourceAccess().getConcernsHowQualifierParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleHowQualifier_in_ruleSource835);
                    	    lv_concerns_8_0=ruleHowQualifier();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getSourceRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"concerns",
                    	            		lv_concerns_8_0, 
                    	            		"HowQualifier");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSource"


    // $ANTLR start "entryRuleHowQualifier"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:492:1: entryRuleHowQualifier returns [EObject current=null] : iv_ruleHowQualifier= ruleHowQualifier EOF ;
    public final EObject entryRuleHowQualifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHowQualifier = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:493:2: (iv_ruleHowQualifier= ruleHowQualifier EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:494:2: iv_ruleHowQualifier= ruleHowQualifier EOF
            {
             newCompositeNode(grammarAccess.getHowQualifierRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHowQualifier_in_entryRuleHowQualifier875);
            iv_ruleHowQualifier=ruleHowQualifier();

            state._fsp--;

             current =iv_ruleHowQualifier; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHowQualifier885); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHowQualifier"


    // $ANTLR start "ruleHowQualifier"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:501:1: ruleHowQualifier returns [EObject current=null] : (this_Icon_0= ruleIcon | this_Colorization_1= ruleColorization | this_Property_2= ruleProperty | this_Threshold_3= ruleThreshold ) ;
    public final EObject ruleHowQualifier() throws RecognitionException {
        EObject current = null;

        EObject this_Icon_0 = null;

        EObject this_Colorization_1 = null;

        EObject this_Property_2 = null;

        EObject this_Threshold_3 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:504:28: ( (this_Icon_0= ruleIcon | this_Colorization_1= ruleColorization | this_Property_2= ruleProperty | this_Threshold_3= ruleThreshold ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:505:1: (this_Icon_0= ruleIcon | this_Colorization_1= ruleColorization | this_Property_2= ruleProperty | this_Threshold_3= ruleThreshold )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:505:1: (this_Icon_0= ruleIcon | this_Colorization_1= ruleColorization | this_Property_2= ruleProperty | this_Threshold_3= ruleThreshold )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt11=1;
                }
                break;
            case 30:
                {
                alt11=2;
                }
                break;
            case 36:
            case 37:
            case 38:
            case 39:
                {
                alt11=3;
                }
                break;
            case 31:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:506:5: this_Icon_0= ruleIcon
                    {
                     
                            newCompositeNode(grammarAccess.getHowQualifierAccess().getIconParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleIcon_in_ruleHowQualifier932);
                    this_Icon_0=ruleIcon();

                    state._fsp--;

                     
                            current = this_Icon_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:516:5: this_Colorization_1= ruleColorization
                    {
                     
                            newCompositeNode(grammarAccess.getHowQualifierAccess().getColorizationParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleColorization_in_ruleHowQualifier959);
                    this_Colorization_1=ruleColorization();

                    state._fsp--;

                     
                            current = this_Colorization_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:526:5: this_Property_2= ruleProperty
                    {
                     
                            newCompositeNode(grammarAccess.getHowQualifierAccess().getPropertyParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleProperty_in_ruleHowQualifier986);
                    this_Property_2=ruleProperty();

                    state._fsp--;

                     
                            current = this_Property_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:536:5: this_Threshold_3= ruleThreshold
                    {
                     
                            newCompositeNode(grammarAccess.getHowQualifierAccess().getThresholdParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleThreshold_in_ruleHowQualifier1013);
                    this_Threshold_3=ruleThreshold();

                    state._fsp--;

                     
                            current = this_Threshold_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHowQualifier"


    // $ANTLR start "entryRuleWindow"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:552:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:553:2: (iv_ruleWindow= ruleWindow EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:554:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWindow_in_entryRuleWindow1048);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWindow1058); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:561:1: ruleWindow returns [EObject current=null] : (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_organizes_3_0= ruleContainer ) ) (otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) ) )* ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_organizes_3_0 = null;

        EObject lv_organizes_5_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:564:28: ( (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_organizes_3_0= ruleContainer ) ) (otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) ) )* ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:565:1: (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_organizes_3_0= ruleContainer ) ) (otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) ) )* )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:565:1: (otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_organizes_3_0= ruleContainer ) ) (otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) ) )* )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:565:3: otherlv_0= 'view' ( (lv_name_1_0= ruleEString ) ) otherlv_2= ':' ( (lv_organizes_3_0= ruleContainer ) ) (otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) ) )*
            {
            otherlv_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleWindow1095); 

                	newLeafNode(otherlv_0, grammarAccess.getWindowAccess().getViewKeyword_0());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:569:1: ( (lv_name_1_0= ruleEString ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:570:1: (lv_name_1_0= ruleEString )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:570:1: (lv_name_1_0= ruleEString )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:571:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWindowAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWindow1116);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWindowRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleWindow1128); 

                	newLeafNode(otherlv_2, grammarAccess.getWindowAccess().getColonKeyword_2());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:591:1: ( (lv_organizes_3_0= ruleContainer ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:592:1: (lv_organizes_3_0= ruleContainer )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:592:1: (lv_organizes_3_0= ruleContainer )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:593:3: lv_organizes_3_0= ruleContainer
            {
             
            	        newCompositeNode(grammarAccess.getWindowAccess().getOrganizesContainerParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_ruleWindow1149);
            lv_organizes_3_0=ruleContainer();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWindowRule());
            	        }
                   		add(
                   			current, 
                   			"organizes",
                    		lv_organizes_3_0, 
                    		"Container");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:609:2: (otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==23) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:609:4: otherlv_4= ' | ' ( (lv_organizes_5_0= ruleContainer ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleWindow1162); 

            	        	newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getSpaceSpaceSpaceVerticalLineSpaceSpaceSpaceKeyword_4_0());
            	        
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:613:1: ( (lv_organizes_5_0= ruleContainer ) )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:614:1: (lv_organizes_5_0= ruleContainer )
            	    {
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:614:1: (lv_organizes_5_0= ruleContainer )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:615:3: lv_organizes_5_0= ruleContainer
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getWindowAccess().getOrganizesContainerParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleContainer_in_ruleWindow1183);
            	    lv_organizes_5_0=ruleContainer();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getWindowRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"organizes",
            	            		lv_organizes_5_0, 
            	            		"Container");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleContainer"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:639:1: entryRuleContainer returns [EObject current=null] : iv_ruleContainer= ruleContainer EOF ;
    public final EObject entryRuleContainer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContainer = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:640:2: (iv_ruleContainer= ruleContainer EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:641:2: iv_ruleContainer= ruleContainer EOF
            {
             newCompositeNode(grammarAccess.getContainerRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleContainer_in_entryRuleContainer1221);
            iv_ruleContainer=ruleContainer();

            state._fsp--;

             current =iv_ruleContainer; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleContainer1231); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContainer"


    // $ANTLR start "ruleContainer"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:648:1: ruleContainer returns [EObject current=null] : ( ( (otherlv_0= 'Column' () ) | (otherlv_2= 'Line' () ) ) (otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) ) )? otherlv_6= ': [' ( (lv_contains_7_0= ruleCell ) ) (otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) ) )* otherlv_10= ']' ) ;
    public final EObject ruleContainer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_ponderation_5_0 = null;

        EObject lv_contains_7_0 = null;

        EObject lv_contains_9_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:651:28: ( ( ( (otherlv_0= 'Column' () ) | (otherlv_2= 'Line' () ) ) (otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) ) )? otherlv_6= ': [' ( (lv_contains_7_0= ruleCell ) ) (otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) ) )* otherlv_10= ']' ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:1: ( ( (otherlv_0= 'Column' () ) | (otherlv_2= 'Line' () ) ) (otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) ) )? otherlv_6= ': [' ( (lv_contains_7_0= ruleCell ) ) (otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) ) )* otherlv_10= ']' )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:1: ( ( (otherlv_0= 'Column' () ) | (otherlv_2= 'Line' () ) ) (otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) ) )? otherlv_6= ': [' ( (lv_contains_7_0= ruleCell ) ) (otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) ) )* otherlv_10= ']' )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:2: ( (otherlv_0= 'Column' () ) | (otherlv_2= 'Line' () ) ) (otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) ) )? otherlv_6= ': [' ( (lv_contains_7_0= ruleCell ) ) (otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) ) )* otherlv_10= ']'
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:2: ( (otherlv_0= 'Column' () ) | (otherlv_2= 'Line' () ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==24) ) {
                alt13=1;
            }
            else if ( (LA13_0==25) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:3: (otherlv_0= 'Column' () )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:3: (otherlv_0= 'Column' () )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:652:5: otherlv_0= 'Column' ()
                    {
                    otherlv_0=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleContainer1270); 

                        	newLeafNode(otherlv_0, grammarAccess.getContainerAccess().getColumnKeyword_0_0_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:656:1: ()
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:657:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getContainerAccess().getColumnAction_0_0_1(),
                                current);
                        

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:663:6: (otherlv_2= 'Line' () )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:663:6: (otherlv_2= 'Line' () )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:663:8: otherlv_2= 'Line' ()
                    {
                    otherlv_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleContainer1299); 

                        	newLeafNode(otherlv_2, grammarAccess.getContainerAccess().getLineKeyword_0_1_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:667:1: ()
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:668:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getContainerAccess().getLineAction_0_1_1(),
                                current);
                        

                    }


                    }


                    }
                    break;

            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:673:4: (otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==26) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:673:6: otherlv_4= 'sized' ( (lv_ponderation_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleContainer1323); 

                        	newLeafNode(otherlv_4, grammarAccess.getContainerAccess().getSizedKeyword_1_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:677:1: ( (lv_ponderation_5_0= ruleEInt ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:678:1: (lv_ponderation_5_0= ruleEInt )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:678:1: (lv_ponderation_5_0= ruleEInt )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:679:3: lv_ponderation_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getContainerAccess().getPonderationEIntParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleContainer1344);
                    lv_ponderation_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getContainerRule());
                    	        }
                           		set(
                           			current, 
                           			"ponderation",
                            		lv_ponderation_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleContainer1358); 

                	newLeafNode(otherlv_6, grammarAccess.getContainerAccess().getColonSpaceLeftSquareBracketKeyword_2());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:699:1: ( (lv_contains_7_0= ruleCell ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:700:1: (lv_contains_7_0= ruleCell )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:700:1: (lv_contains_7_0= ruleCell )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:701:3: lv_contains_7_0= ruleCell
            {
             
            	        newCompositeNode(grammarAccess.getContainerAccess().getContainsCellParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCell_in_ruleContainer1379);
            lv_contains_7_0=ruleCell();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	        }
                   		add(
                   			current, 
                   			"contains",
                    		lv_contains_7_0, 
                    		"Cell");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:717:2: (otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==18) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:717:4: otherlv_8= ';' ( (lv_contains_9_0= ruleCell ) )
            	    {
            	    otherlv_8=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleContainer1392); 

            	        	newLeafNode(otherlv_8, grammarAccess.getContainerAccess().getSemicolonKeyword_4_0());
            	        
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:721:1: ( (lv_contains_9_0= ruleCell ) )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:722:1: (lv_contains_9_0= ruleCell )
            	    {
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:722:1: (lv_contains_9_0= ruleCell )
            	    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:723:3: lv_contains_9_0= ruleCell
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContainerAccess().getContainsCellParserRuleCall_4_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleCell_in_ruleContainer1413);
            	    lv_contains_9_0=ruleCell();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContainerRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"contains",
            	            		lv_contains_9_0, 
            	            		"Cell");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_10=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleContainer1427); 

                	newLeafNode(otherlv_10, grammarAccess.getContainerAccess().getRightSquareBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContainer"


    // $ANTLR start "entryRuleCell"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:751:1: entryRuleCell returns [EObject current=null] : iv_ruleCell= ruleCell EOF ;
    public final EObject entryRuleCell() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCell = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:752:2: (iv_ruleCell= ruleCell EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:753:2: iv_ruleCell= ruleCell EOF
            {
             newCompositeNode(grammarAccess.getCellRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCell_in_entryRuleCell1463);
            iv_ruleCell=ruleCell();

            state._fsp--;

             current =iv_ruleCell; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCell1473); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCell"


    // $ANTLR start "ruleCell"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:760:1: ruleCell returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleCell() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:763:28: ( ( (otherlv_0= RULE_ID ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:764:1: ( (otherlv_0= RULE_ID ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:764:1: ( (otherlv_0= RULE_ID ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:765:1: (otherlv_0= RULE_ID )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:765:1: (otherlv_0= RULE_ID )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:766:3: otherlv_0= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getCellRule());
            	        }
                    
            otherlv_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleCell1517); 

            		newLeafNode(otherlv_0, grammarAccess.getCellAccess().getWrapsVisualizationCrossReference_0()); 
            	

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCell"


    // $ANTLR start "entryRuleIcon"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:785:1: entryRuleIcon returns [EObject current=null] : iv_ruleIcon= ruleIcon EOF ;
    public final EObject entryRuleIcon() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIcon = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:786:2: (iv_ruleIcon= ruleIcon EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:787:2: iv_ruleIcon= ruleIcon EOF
            {
             newCompositeNode(grammarAccess.getIconRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleIcon_in_entryRuleIcon1552);
            iv_ruleIcon=ruleIcon();

            state._fsp--;

             current =iv_ruleIcon; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleIcon1562); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIcon"


    // $ANTLR start "ruleIcon"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:794:1: ruleIcon returns [EObject current=null] : ( () otherlv_1= 'Icon' ) ;
    public final EObject ruleIcon() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:797:28: ( ( () otherlv_1= 'Icon' ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:798:1: ( () otherlv_1= 'Icon' )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:798:1: ( () otherlv_1= 'Icon' )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:798:2: () otherlv_1= 'Icon'
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:798:2: ()
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:799:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getIconAccess().getIconAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleIcon1608); 

                	newLeafNode(otherlv_1, grammarAccess.getIconAccess().getIconKeyword_1());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIcon"


    // $ANTLR start "entryRuleColorization"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:816:1: entryRuleColorization returns [EObject current=null] : iv_ruleColorization= ruleColorization EOF ;
    public final EObject entryRuleColorization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColorization = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:817:2: (iv_ruleColorization= ruleColorization EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:818:2: iv_ruleColorization= ruleColorization EOF
            {
             newCompositeNode(grammarAccess.getColorizationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleColorization_in_entryRuleColorization1644);
            iv_ruleColorization=ruleColorization();

            state._fsp--;

             current =iv_ruleColorization; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleColorization1654); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleColorization"


    // $ANTLR start "ruleColorization"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:825:1: ruleColorization returns [EObject current=null] : ( () otherlv_1= 'Color' ( (lv_color_2_0= ruleEString ) ) ) ;
    public final EObject ruleColorization() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_color_2_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:828:28: ( ( () otherlv_1= 'Color' ( (lv_color_2_0= ruleEString ) ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:829:1: ( () otherlv_1= 'Color' ( (lv_color_2_0= ruleEString ) ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:829:1: ( () otherlv_1= 'Color' ( (lv_color_2_0= ruleEString ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:829:2: () otherlv_1= 'Color' ( (lv_color_2_0= ruleEString ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:829:2: ()
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:830:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getColorizationAccess().getColorizationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleColorization1700); 

                	newLeafNode(otherlv_1, grammarAccess.getColorizationAccess().getColorKeyword_1());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:839:1: ( (lv_color_2_0= ruleEString ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:840:1: (lv_color_2_0= ruleEString )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:840:1: (lv_color_2_0= ruleEString )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:841:3: lv_color_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getColorizationAccess().getColorEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleColorization1721);
            lv_color_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getColorizationRule());
            	        }
                   		set(
                   			current, 
                   			"color",
                    		lv_color_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleColorization"


    // $ANTLR start "entryRuleProperty"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:865:1: entryRuleProperty returns [EObject current=null] : iv_ruleProperty= ruleProperty EOF ;
    public final EObject entryRuleProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProperty = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:866:2: (iv_ruleProperty= ruleProperty EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:867:2: iv_ruleProperty= ruleProperty EOF
            {
             newCompositeNode(grammarAccess.getPropertyRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProperty_in_entryRuleProperty1757);
            iv_ruleProperty=ruleProperty();

            state._fsp--;

             current =iv_ruleProperty; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProperty1767); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProperty"


    // $ANTLR start "ruleProperty"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:874:1: ruleProperty returns [EObject current=null] : ( (lv_value_0_0= ruleDataProperty ) ) ;
    public final EObject ruleProperty() throws RecognitionException {
        EObject current = null;

        Enumerator lv_value_0_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:877:28: ( ( (lv_value_0_0= ruleDataProperty ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:878:1: ( (lv_value_0_0= ruleDataProperty ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:878:1: ( (lv_value_0_0= ruleDataProperty ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:879:1: (lv_value_0_0= ruleDataProperty )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:879:1: (lv_value_0_0= ruleDataProperty )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:880:3: lv_value_0_0= ruleDataProperty
            {
             
            	        newCompositeNode(grammarAccess.getPropertyAccess().getValueDataPropertyEnumRuleCall_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDataProperty_in_ruleProperty1812);
            lv_value_0_0=ruleDataProperty();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_0_0, 
                    		"DataProperty");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProperty"


    // $ANTLR start "entryRuleThreshold"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:904:1: entryRuleThreshold returns [EObject current=null] : iv_ruleThreshold= ruleThreshold EOF ;
    public final EObject entryRuleThreshold() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleThreshold = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:905:2: (iv_ruleThreshold= ruleThreshold EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:906:2: iv_ruleThreshold= ruleThreshold EOF
            {
             newCompositeNode(grammarAccess.getThresholdRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleThreshold_in_entryRuleThreshold1847);
            iv_ruleThreshold=ruleThreshold();

            state._fsp--;

             current =iv_ruleThreshold; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleThreshold1857); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleThreshold"


    // $ANTLR start "ruleThreshold"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:913:1: ruleThreshold returns [EObject current=null] : ( () otherlv_1= 'Threshold (' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= ')' ) ;
    public final EObject ruleThreshold() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_min_3_0 = null;

        AntlrDatatypeRuleToken lv_max_5_0 = null;


         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:916:28: ( ( () otherlv_1= 'Threshold (' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= ')' ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:917:1: ( () otherlv_1= 'Threshold (' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= ')' )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:917:1: ( () otherlv_1= 'Threshold (' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= ')' )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:917:2: () otherlv_1= 'Threshold (' (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )? (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )? otherlv_6= ')'
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:917:2: ()
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:918:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getThresholdAccess().getThresholdAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleThreshold1903); 

                	newLeafNode(otherlv_1, grammarAccess.getThresholdAccess().getThresholdKeyword_1());
                
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:927:1: (otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==32) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:927:3: otherlv_2= 'min' ( (lv_min_3_0= ruleEInt ) )
                    {
                    otherlv_2=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleThreshold1916); 

                        	newLeafNode(otherlv_2, grammarAccess.getThresholdAccess().getMinKeyword_2_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:931:1: ( (lv_min_3_0= ruleEInt ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:932:1: (lv_min_3_0= ruleEInt )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:932:1: (lv_min_3_0= ruleEInt )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:933:3: lv_min_3_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getThresholdAccess().getMinEIntParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleThreshold1937);
                    lv_min_3_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThresholdRule());
                    	        }
                           		set(
                           			current, 
                           			"min",
                            		lv_min_3_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:949:4: (otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==33) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:949:6: otherlv_4= 'max' ( (lv_max_5_0= ruleEInt ) )
                    {
                    otherlv_4=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleThreshold1952); 

                        	newLeafNode(otherlv_4, grammarAccess.getThresholdAccess().getMaxKeyword_3_0());
                        
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:953:1: ( (lv_max_5_0= ruleEInt ) )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:954:1: (lv_max_5_0= ruleEInt )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:954:1: (lv_max_5_0= ruleEInt )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:955:3: lv_max_5_0= ruleEInt
                    {
                     
                    	        newCompositeNode(grammarAccess.getThresholdAccess().getMaxEIntParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleThreshold1973);
                    lv_max_5_0=ruleEInt();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getThresholdRule());
                    	        }
                           		set(
                           			current, 
                           			"max",
                            		lv_max_5_0, 
                            		"EInt");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleThreshold1987); 

                	newLeafNode(otherlv_6, grammarAccess.getThresholdAccess().getRightParenthesisKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleThreshold"


    // $ANTLR start "entryRuleEString"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:983:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:984:2: (iv_ruleEString= ruleEString EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:985:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString2024);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString2035); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:992:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:995:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:996:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:996:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_STRING) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ID) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:996:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString2075); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1004:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString2101); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEInt"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1019:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1020:2: (iv_ruleEInt= ruleEInt EOF )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1021:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt2147);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt2158); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1028:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1031:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1032:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1032:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1032:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1032:2: (kw= '-' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==35) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1033:2: kw= '-'
                    {
                    kw=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleEInt2197); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt2214); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleDataProperty"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1053:1: ruleDataProperty returns [Enumerator current=null] : ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Discrete' ) | (enumLiteral_2= 'Scalar' ) | (enumLiteral_3= 'Structural' ) ) ;
    public final Enumerator ruleDataProperty() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1055:28: ( ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Discrete' ) | (enumLiteral_2= 'Scalar' ) | (enumLiteral_3= 'Structural' ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1056:1: ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Discrete' ) | (enumLiteral_2= 'Scalar' ) | (enumLiteral_3= 'Structural' ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1056:1: ( (enumLiteral_0= 'Continuous' ) | (enumLiteral_1= 'Discrete' ) | (enumLiteral_2= 'Scalar' ) | (enumLiteral_3= 'Structural' ) )
            int alt20=4;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt20=1;
                }
                break;
            case 37:
                {
                alt20=2;
                }
                break;
            case 38:
                {
                alt20=3;
                }
                break;
            case 39:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1056:2: (enumLiteral_0= 'Continuous' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1056:2: (enumLiteral_0= 'Continuous' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1056:4: enumLiteral_0= 'Continuous'
                    {
                    enumLiteral_0=(Token)match(input,36,FollowSets000.FOLLOW_36_in_ruleDataProperty2273); 

                            current = grammarAccess.getDataPropertyAccess().getContinuousEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getDataPropertyAccess().getContinuousEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1062:6: (enumLiteral_1= 'Discrete' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1062:6: (enumLiteral_1= 'Discrete' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1062:8: enumLiteral_1= 'Discrete'
                    {
                    enumLiteral_1=(Token)match(input,37,FollowSets000.FOLLOW_37_in_ruleDataProperty2290); 

                            current = grammarAccess.getDataPropertyAccess().getDiscreteEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getDataPropertyAccess().getDiscreteEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1068:6: (enumLiteral_2= 'Scalar' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1068:6: (enumLiteral_2= 'Scalar' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1068:8: enumLiteral_2= 'Scalar'
                    {
                    enumLiteral_2=(Token)match(input,38,FollowSets000.FOLLOW_38_in_ruleDataProperty2307); 

                            current = grammarAccess.getDataPropertyAccess().getScalarEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getDataPropertyAccess().getScalarEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1074:6: (enumLiteral_3= 'Structural' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1074:6: (enumLiteral_3= 'Structural' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1074:8: enumLiteral_3= 'Structural'
                    {
                    enumLiteral_3=(Token)match(input,39,FollowSets000.FOLLOW_39_in_ruleDataProperty2324); 

                            current = grammarAccess.getDataPropertyAccess().getStructuralEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getDataPropertyAccess().getStructuralEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataProperty"


    // $ANTLR start "ruleTaxonomy"
    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1084:1: ruleTaxonomy returns [Enumerator current=null] : ( (enumLiteral_0= 'Proportion' ) | (enumLiteral_1= 'Location' ) | (enumLiteral_2= 'Comparison' ) | (enumLiteral_3= 'Part_to_a_whole' ) | (enumLiteral_4= 'Relationship' ) | (enumLiteral_5= 'Over_time' ) | (enumLiteral_6= 'Distribution' ) | (enumLiteral_7= 'Hierarchy' ) | (enumLiteral_8= 'Reference_tool' ) | (enumLiteral_9= 'Range' ) | (enumLiteral_10= 'Pattern' ) | (enumLiteral_11= 'Extremum' ) ) ;
    public final Enumerator ruleTaxonomy() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;

         enterRule(); 
        try {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1086:28: ( ( (enumLiteral_0= 'Proportion' ) | (enumLiteral_1= 'Location' ) | (enumLiteral_2= 'Comparison' ) | (enumLiteral_3= 'Part_to_a_whole' ) | (enumLiteral_4= 'Relationship' ) | (enumLiteral_5= 'Over_time' ) | (enumLiteral_6= 'Distribution' ) | (enumLiteral_7= 'Hierarchy' ) | (enumLiteral_8= 'Reference_tool' ) | (enumLiteral_9= 'Range' ) | (enumLiteral_10= 'Pattern' ) | (enumLiteral_11= 'Extremum' ) ) )
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1087:1: ( (enumLiteral_0= 'Proportion' ) | (enumLiteral_1= 'Location' ) | (enumLiteral_2= 'Comparison' ) | (enumLiteral_3= 'Part_to_a_whole' ) | (enumLiteral_4= 'Relationship' ) | (enumLiteral_5= 'Over_time' ) | (enumLiteral_6= 'Distribution' ) | (enumLiteral_7= 'Hierarchy' ) | (enumLiteral_8= 'Reference_tool' ) | (enumLiteral_9= 'Range' ) | (enumLiteral_10= 'Pattern' ) | (enumLiteral_11= 'Extremum' ) )
            {
            // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1087:1: ( (enumLiteral_0= 'Proportion' ) | (enumLiteral_1= 'Location' ) | (enumLiteral_2= 'Comparison' ) | (enumLiteral_3= 'Part_to_a_whole' ) | (enumLiteral_4= 'Relationship' ) | (enumLiteral_5= 'Over_time' ) | (enumLiteral_6= 'Distribution' ) | (enumLiteral_7= 'Hierarchy' ) | (enumLiteral_8= 'Reference_tool' ) | (enumLiteral_9= 'Range' ) | (enumLiteral_10= 'Pattern' ) | (enumLiteral_11= 'Extremum' ) )
            int alt21=12;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt21=1;
                }
                break;
            case 41:
                {
                alt21=2;
                }
                break;
            case 42:
                {
                alt21=3;
                }
                break;
            case 43:
                {
                alt21=4;
                }
                break;
            case 44:
                {
                alt21=5;
                }
                break;
            case 45:
                {
                alt21=6;
                }
                break;
            case 46:
                {
                alt21=7;
                }
                break;
            case 47:
                {
                alt21=8;
                }
                break;
            case 48:
                {
                alt21=9;
                }
                break;
            case 49:
                {
                alt21=10;
                }
                break;
            case 50:
                {
                alt21=11;
                }
                break;
            case 51:
                {
                alt21=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1087:2: (enumLiteral_0= 'Proportion' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1087:2: (enumLiteral_0= 'Proportion' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1087:4: enumLiteral_0= 'Proportion'
                    {
                    enumLiteral_0=(Token)match(input,40,FollowSets000.FOLLOW_40_in_ruleTaxonomy2369); 

                            current = grammarAccess.getTaxonomyAccess().getProportionEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTaxonomyAccess().getProportionEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1093:6: (enumLiteral_1= 'Location' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1093:6: (enumLiteral_1= 'Location' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1093:8: enumLiteral_1= 'Location'
                    {
                    enumLiteral_1=(Token)match(input,41,FollowSets000.FOLLOW_41_in_ruleTaxonomy2386); 

                            current = grammarAccess.getTaxonomyAccess().getLocationEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTaxonomyAccess().getLocationEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1099:6: (enumLiteral_2= 'Comparison' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1099:6: (enumLiteral_2= 'Comparison' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1099:8: enumLiteral_2= 'Comparison'
                    {
                    enumLiteral_2=(Token)match(input,42,FollowSets000.FOLLOW_42_in_ruleTaxonomy2403); 

                            current = grammarAccess.getTaxonomyAccess().getComparisonEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTaxonomyAccess().getComparisonEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1105:6: (enumLiteral_3= 'Part_to_a_whole' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1105:6: (enumLiteral_3= 'Part_to_a_whole' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1105:8: enumLiteral_3= 'Part_to_a_whole'
                    {
                    enumLiteral_3=(Token)match(input,43,FollowSets000.FOLLOW_43_in_ruleTaxonomy2420); 

                            current = grammarAccess.getTaxonomyAccess().getPart_to_a_wholeEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTaxonomyAccess().getPart_to_a_wholeEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1111:6: (enumLiteral_4= 'Relationship' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1111:6: (enumLiteral_4= 'Relationship' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1111:8: enumLiteral_4= 'Relationship'
                    {
                    enumLiteral_4=(Token)match(input,44,FollowSets000.FOLLOW_44_in_ruleTaxonomy2437); 

                            current = grammarAccess.getTaxonomyAccess().getRelationshipEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTaxonomyAccess().getRelationshipEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1117:6: (enumLiteral_5= 'Over_time' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1117:6: (enumLiteral_5= 'Over_time' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1117:8: enumLiteral_5= 'Over_time'
                    {
                    enumLiteral_5=(Token)match(input,45,FollowSets000.FOLLOW_45_in_ruleTaxonomy2454); 

                            current = grammarAccess.getTaxonomyAccess().getOver_timeEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTaxonomyAccess().getOver_timeEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1123:6: (enumLiteral_6= 'Distribution' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1123:6: (enumLiteral_6= 'Distribution' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1123:8: enumLiteral_6= 'Distribution'
                    {
                    enumLiteral_6=(Token)match(input,46,FollowSets000.FOLLOW_46_in_ruleTaxonomy2471); 

                            current = grammarAccess.getTaxonomyAccess().getDistributionEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTaxonomyAccess().getDistributionEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1129:6: (enumLiteral_7= 'Hierarchy' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1129:6: (enumLiteral_7= 'Hierarchy' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1129:8: enumLiteral_7= 'Hierarchy'
                    {
                    enumLiteral_7=(Token)match(input,47,FollowSets000.FOLLOW_47_in_ruleTaxonomy2488); 

                            current = grammarAccess.getTaxonomyAccess().getHierarchyEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTaxonomyAccess().getHierarchyEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1135:6: (enumLiteral_8= 'Reference_tool' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1135:6: (enumLiteral_8= 'Reference_tool' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1135:8: enumLiteral_8= 'Reference_tool'
                    {
                    enumLiteral_8=(Token)match(input,48,FollowSets000.FOLLOW_48_in_ruleTaxonomy2505); 

                            current = grammarAccess.getTaxonomyAccess().getReference_toolEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTaxonomyAccess().getReference_toolEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1141:6: (enumLiteral_9= 'Range' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1141:6: (enumLiteral_9= 'Range' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1141:8: enumLiteral_9= 'Range'
                    {
                    enumLiteral_9=(Token)match(input,49,FollowSets000.FOLLOW_49_in_ruleTaxonomy2522); 

                            current = grammarAccess.getTaxonomyAccess().getRangeEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getTaxonomyAccess().getRangeEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1147:6: (enumLiteral_10= 'Pattern' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1147:6: (enumLiteral_10= 'Pattern' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1147:8: enumLiteral_10= 'Pattern'
                    {
                    enumLiteral_10=(Token)match(input,50,FollowSets000.FOLLOW_50_in_ruleTaxonomy2539); 

                            current = grammarAccess.getTaxonomyAccess().getPatternEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getTaxonomyAccess().getPatternEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;
                case 12 :
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1153:6: (enumLiteral_11= 'Extremum' )
                    {
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1153:6: (enumLiteral_11= 'Extremum' )
                    // ../visualizationDesignLanguage.DSL/src-gen/visualizationDesignLanguage/DSL/parser/antlr/internal/InternalVD.g:1153:8: enumLiteral_11= 'Extremum'
                    {
                    enumLiteral_11=(Token)match(input,51,FollowSets000.FOLLOW_51_in_ruleTaxonomy2556); 

                            current = grammarAccess.getTaxonomyAccess().getExtremumEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_11, grammarAccess.getTaxonomyAccess().getExtremumEnumLiteralDeclaration_11()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTaxonomy"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleDashboard_in_entryRuleDashboard75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDashboard85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDashboard122 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleDashboard143 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDashboard155 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDashboard167 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleVisualization_in_ruleDashboard188 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_ruleVisualization_in_ruleDashboard209 = new BitSet(new long[]{0x0000000000004030L});
        public static final BitSet FOLLOW_14_in_ruleDashboard222 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_ruleWindow_in_ruleDashboard243 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleWindow_in_ruleDashboard264 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_ruleVisualization_in_entryRuleVisualization301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleVisualization311 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleVisualization357 = new BitSet(new long[]{0x0000000000028000L});
        public static final BitSet FOLLOW_15_in_ruleVisualization370 = new BitSet(new long[]{0x000FFF0000000000L});
        public static final BitSet FOLLOW_ruleWhatQualifier_in_ruleVisualization391 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_16_in_ruleVisualization404 = new BitSet(new long[]{0x000FFF0000000000L});
        public static final BitSet FOLLOW_ruleWhatQualifier_in_ruleVisualization425 = new BitSet(new long[]{0x0000000000030000L});
        public static final BitSet FOLLOW_17_in_ruleVisualization441 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleSource_in_ruleVisualization462 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleVisualization475 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleSource_in_ruleVisualization496 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleVisualization511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWhatQualifier_in_entryRuleWhatQualifier549 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWhatQualifier559 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleTaxonomy_in_ruleWhatQualifier604 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleSource_in_entryRuleSource639 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleSource649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSource695 = new BitSet(new long[]{0x0000000000380002L});
        public static final BitSet FOLLOW_19_in_ruleSource708 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSource729 = new BitSet(new long[]{0x0000000000300002L});
        public static final BitSet FOLLOW_20_in_ruleSource744 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleSource765 = new BitSet(new long[]{0x0000000000200002L});
        public static final BitSet FOLLOW_21_in_ruleSource780 = new BitSet(new long[]{0x000000F0E0000000L});
        public static final BitSet FOLLOW_ruleHowQualifier_in_ruleSource801 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleSource814 = new BitSet(new long[]{0x000000F0E0000000L});
        public static final BitSet FOLLOW_ruleHowQualifier_in_ruleSource835 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleHowQualifier_in_entryRuleHowQualifier875 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHowQualifier885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIcon_in_ruleHowQualifier932 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColorization_in_ruleHowQualifier959 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_ruleHowQualifier986 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThreshold_in_ruleHowQualifier1013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWindow_in_entryRuleWindow1048 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWindow1058 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleWindow1095 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWindow1116 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleWindow1128 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleContainer_in_ruleWindow1149 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_23_in_ruleWindow1162 = new BitSet(new long[]{0x0000000003000000L});
        public static final BitSet FOLLOW_ruleContainer_in_ruleWindow1183 = new BitSet(new long[]{0x0000000000800002L});
        public static final BitSet FOLLOW_ruleContainer_in_entryRuleContainer1221 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleContainer1231 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleContainer1270 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_25_in_ruleContainer1299 = new BitSet(new long[]{0x000000000C000000L});
        public static final BitSet FOLLOW_26_in_ruleContainer1323 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleContainer1344 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_27_in_ruleContainer1358 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCell_in_ruleContainer1379 = new BitSet(new long[]{0x0000000010040000L});
        public static final BitSet FOLLOW_18_in_ruleContainer1392 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_ruleCell_in_ruleContainer1413 = new BitSet(new long[]{0x0000000010040000L});
        public static final BitSet FOLLOW_28_in_ruleContainer1427 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCell_in_entryRuleCell1463 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCell1473 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleCell1517 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleIcon_in_entryRuleIcon1552 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleIcon1562 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleIcon1608 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleColorization_in_entryRuleColorization1644 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleColorization1654 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleColorization1700 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleColorization1721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProperty_in_entryRuleProperty1757 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProperty1767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDataProperty_in_ruleProperty1812 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleThreshold_in_entryRuleThreshold1847 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleThreshold1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleThreshold1903 = new BitSet(new long[]{0x0000000700000000L});
        public static final BitSet FOLLOW_32_in_ruleThreshold1916 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleThreshold1937 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_33_in_ruleThreshold1952 = new BitSet(new long[]{0x0000000800000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleThreshold1973 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_34_in_ruleThreshold1987 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString2024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString2035 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString2075 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString2101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt2147 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt2158 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleEInt2197 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt2214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_ruleDataProperty2273 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_37_in_ruleDataProperty2290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_38_in_ruleDataProperty2307 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_39_in_ruleDataProperty2324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_40_in_ruleTaxonomy2369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_41_in_ruleTaxonomy2386 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_42_in_ruleTaxonomy2403 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_43_in_ruleTaxonomy2420 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_44_in_ruleTaxonomy2437 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_45_in_ruleTaxonomy2454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_46_in_ruleTaxonomy2471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_47_in_ruleTaxonomy2488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_48_in_ruleTaxonomy2505 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_49_in_ruleTaxonomy2522 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_50_in_ruleTaxonomy2539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_51_in_ruleTaxonomy2556 = new BitSet(new long[]{0x0000000000000002L});
    }


}