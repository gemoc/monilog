package org.gemoc.monilog.parser.antlr.internal;

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
import org.gemoc.monilog.services.MoniLog4DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMoniLog4DSLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'default-language'", "'monilog'", "'['", "']'", "'{'", "'events'", "','", "'}'", "'conditions'", "'actions'", "'before'", "'frequency^'", "'limit'", "'after'", "'frequency'", "'stream'", "'('", "')'", "'always'", "'exists'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'notify'", "'append'", "'file'", "'console'", "'='", "'.'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'INFO'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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


        public InternalMoniLog4DSLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMoniLog4DSLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMoniLog4DSLParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMoniLog4DSL.g"; }



     	private MoniLog4DSLGrammarAccess grammarAccess;

        public InternalMoniLog4DSLParser(TokenStream input, MoniLog4DSLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MoniLog4DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMoniLog4DSL.g:65:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMoniLog4DSL.g:65:46: (iv_ruleModel= ruleModel EOF )
            // InternalMoniLog4DSL.g:66:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMoniLog4DSL.g:72:1: ruleModel returns [EObject current=null] : ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( (lv_moniLogSpecs_2_0= ruleMoniLogSpec ) )+ ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_defaultLanguageID_1_1=null;
        Token lv_defaultLanguageID_1_2=null;
        EObject lv_moniLogSpecs_2_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:78:2: ( ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( (lv_moniLogSpecs_2_0= ruleMoniLogSpec ) )+ ) )
            // InternalMoniLog4DSL.g:79:2: ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( (lv_moniLogSpecs_2_0= ruleMoniLogSpec ) )+ )
            {
            // InternalMoniLog4DSL.g:79:2: ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( (lv_moniLogSpecs_2_0= ruleMoniLogSpec ) )+ )
            // InternalMoniLog4DSL.g:80:3: (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( (lv_moniLogSpecs_2_0= ruleMoniLogSpec ) )+
            {
            // InternalMoniLog4DSL.g:80:3: (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMoniLog4DSL.g:81:4: otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) )
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getModelAccess().getDefaultLanguageKeyword_0_0());
                    			
                    // InternalMoniLog4DSL.g:85:4: ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) )
                    // InternalMoniLog4DSL.g:86:5: ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) )
                    {
                    // InternalMoniLog4DSL.g:86:5: ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) )
                    // InternalMoniLog4DSL.g:87:6: (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:87:6: (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING )
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==RULE_ID) ) {
                        alt1=1;
                    }
                    else if ( (LA1_0==RULE_STRING) ) {
                        alt1=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 0, input);

                        throw nvae;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalMoniLog4DSL.g:88:7: lv_defaultLanguageID_1_1= RULE_ID
                            {
                            lv_defaultLanguageID_1_1=(Token)match(input,RULE_ID,FOLLOW_4); 

                            							newLeafNode(lv_defaultLanguageID_1_1, grammarAccess.getModelAccess().getDefaultLanguageIDIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"defaultLanguageID",
                            								lv_defaultLanguageID_1_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalMoniLog4DSL.g:103:7: lv_defaultLanguageID_1_2= RULE_STRING
                            {
                            lv_defaultLanguageID_1_2=(Token)match(input,RULE_STRING,FOLLOW_4); 

                            							newLeafNode(lv_defaultLanguageID_1_2, grammarAccess.getModelAccess().getDefaultLanguageIDSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getModelRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"defaultLanguageID",
                            								lv_defaultLanguageID_1_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalMoniLog4DSL.g:121:3: ( (lv_moniLogSpecs_2_0= ruleMoniLogSpec ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:122:4: (lv_moniLogSpecs_2_0= ruleMoniLogSpec )
            	    {
            	    // InternalMoniLog4DSL.g:122:4: (lv_moniLogSpecs_2_0= ruleMoniLogSpec )
            	    // InternalMoniLog4DSL.g:123:5: lv_moniLogSpecs_2_0= ruleMoniLogSpec
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getMoniLogSpecsMoniLogSpecParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_moniLogSpecs_2_0=ruleMoniLogSpec();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"moniLogSpecs",
            	    						lv_moniLogSpecs_2_0,
            	    						"org.gemoc.monilog.MoniLog4DSL.MoniLogSpec");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMoniLogSpec"
    // InternalMoniLog4DSL.g:144:1: entryRuleMoniLogSpec returns [EObject current=null] : iv_ruleMoniLogSpec= ruleMoniLogSpec EOF ;
    public final EObject entryRuleMoniLogSpec() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLogSpec = null;


        try {
            // InternalMoniLog4DSL.g:144:52: (iv_ruleMoniLogSpec= ruleMoniLogSpec EOF )
            // InternalMoniLog4DSL.g:145:2: iv_ruleMoniLogSpec= ruleMoniLogSpec EOF
            {
             newCompositeNode(grammarAccess.getMoniLogSpecRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoniLogSpec=ruleMoniLogSpec();

            state._fsp--;

             current =iv_ruleMoniLogSpec; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMoniLogSpec"


    // $ANTLR start "ruleMoniLogSpec"
    // InternalMoniLog4DSL.g:151:1: ruleMoniLogSpec returns [EObject current=null] : (otherlv_0= 'monilog' ( (lv_name_1_0= RULE_STRING ) )? (otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}' )? (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleMoniLogSpec() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_level_3_0 = null;

        EObject lv_events_8_0 = null;

        EObject lv_events_10_0 = null;

        EObject lv_conditions_14_0 = null;

        EObject lv_conditions_16_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_actions_22_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:157:2: ( (otherlv_0= 'monilog' ( (lv_name_1_0= RULE_STRING ) )? (otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}' )? (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalMoniLog4DSL.g:158:2: (otherlv_0= 'monilog' ( (lv_name_1_0= RULE_STRING ) )? (otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}' )? (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalMoniLog4DSL.g:158:2: (otherlv_0= 'monilog' ( (lv_name_1_0= RULE_STRING ) )? (otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}' )? (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalMoniLog4DSL.g:159:3: otherlv_0= 'monilog' ( (lv_name_1_0= RULE_STRING ) )? (otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']' )? otherlv_5= '{' (otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}' )? (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMoniLogSpecAccess().getMonilogKeyword_0());
            		
            // InternalMoniLog4DSL.g:163:3: ( (lv_name_1_0= RULE_STRING ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoniLog4DSL.g:164:4: (lv_name_1_0= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:164:4: (lv_name_1_0= RULE_STRING )
                    // InternalMoniLog4DSL.g:165:5: lv_name_1_0= RULE_STRING
                    {
                    lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_7); 

                    					newLeafNode(lv_name_1_0, grammarAccess.getMoniLogSpecAccess().getNameSTRINGTerminalRuleCall_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMoniLogSpecRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"name",
                    						lv_name_1_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }
                    break;

            }

            // InternalMoniLog4DSL.g:181:3: (otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==13) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMoniLog4DSL.g:182:4: otherlv_2= '[' ( (lv_level_3_0= ruleLogLevel ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoniLogSpecAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:186:4: ( (lv_level_3_0= ruleLogLevel ) )
                    // InternalMoniLog4DSL.g:187:5: (lv_level_3_0= ruleLogLevel )
                    {
                    // InternalMoniLog4DSL.g:187:5: (lv_level_3_0= ruleLogLevel )
                    // InternalMoniLog4DSL.g:188:6: lv_level_3_0= ruleLogLevel
                    {

                    						newCompositeNode(grammarAccess.getMoniLogSpecAccess().getLevelLogLevelEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_level_3_0=ruleLogLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
                    						}
                    						set(
                    							current,
                    							"level",
                    							lv_level_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.LogLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,14,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getMoniLogSpecAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoniLog4DSL.g:214:3: (otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==16) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoniLog4DSL.g:215:4: otherlv_6= 'events' otherlv_7= '{' ( (lv_events_8_0= ruleEvent ) ) (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )* otherlv_11= '}'
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_10); 

                    				newLeafNode(otherlv_6, grammarAccess.getMoniLogSpecAccess().getEventsKeyword_4_0());
                    			
                    otherlv_7=(Token)match(input,15,FOLLOW_12); 

                    				newLeafNode(otherlv_7, grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMoniLog4DSL.g:223:4: ( (lv_events_8_0= ruleEvent ) )
                    // InternalMoniLog4DSL.g:224:5: (lv_events_8_0= ruleEvent )
                    {
                    // InternalMoniLog4DSL.g:224:5: (lv_events_8_0= ruleEvent )
                    // InternalMoniLog4DSL.g:225:6: lv_events_8_0= ruleEvent
                    {

                    						newCompositeNode(grammarAccess.getMoniLogSpecAccess().getEventsEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_events_8_0=ruleEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
                    						}
                    						add(
                    							current,
                    							"events",
                    							lv_events_8_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Event");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:242:4: (otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==17) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:243:5: otherlv_9= ',' ( (lv_events_10_0= ruleEvent ) )
                    	    {
                    	    otherlv_9=(Token)match(input,17,FOLLOW_12); 

                    	    					newLeafNode(otherlv_9, grammarAccess.getMoniLogSpecAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:247:5: ( (lv_events_10_0= ruleEvent ) )
                    	    // InternalMoniLog4DSL.g:248:6: (lv_events_10_0= ruleEvent )
                    	    {
                    	    // InternalMoniLog4DSL.g:248:6: (lv_events_10_0= ruleEvent )
                    	    // InternalMoniLog4DSL.g:249:7: lv_events_10_0= ruleEvent
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoniLogSpecAccess().getEventsEventParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_events_10_0=ruleEvent();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"events",
                    	    								lv_events_10_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Event");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_11=(Token)match(input,18,FOLLOW_14); 

                    				newLeafNode(otherlv_11, grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            // InternalMoniLog4DSL.g:272:3: (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==19) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoniLog4DSL.g:273:4: otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getMoniLogSpecAccess().getConditionsKeyword_5_0());
                    			
                    otherlv_13=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_13, grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalMoniLog4DSL.g:281:4: ( (lv_conditions_14_0= ruleCondition ) )
                    // InternalMoniLog4DSL.g:282:5: (lv_conditions_14_0= ruleCondition )
                    {
                    // InternalMoniLog4DSL.g:282:5: (lv_conditions_14_0= ruleCondition )
                    // InternalMoniLog4DSL.g:283:6: lv_conditions_14_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getMoniLogSpecAccess().getConditionsConditionParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_conditions_14_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_14_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:300:4: (otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==17) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:301:5: otherlv_15= ',' ( (lv_conditions_16_0= ruleCondition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_15); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMoniLogSpecAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:305:5: ( (lv_conditions_16_0= ruleCondition ) )
                    	    // InternalMoniLog4DSL.g:306:6: (lv_conditions_16_0= ruleCondition )
                    	    {
                    	    // InternalMoniLog4DSL.g:306:6: (lv_conditions_16_0= ruleCondition )
                    	    // InternalMoniLog4DSL.g:307:7: lv_conditions_16_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoniLogSpecAccess().getConditionsConditionParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    lv_conditions_16_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conditions",
                    	    								lv_conditions_16_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_16); 

                    				newLeafNode(otherlv_17, grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,20,FOLLOW_10); 

            			newLeafNode(otherlv_18, grammarAccess.getMoniLogSpecAccess().getActionsKeyword_6());
            		
            otherlv_19=(Token)match(input,15,FOLLOW_17); 

            			newLeafNode(otherlv_19, grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_7());
            		
            // InternalMoniLog4DSL.g:338:3: ( (lv_actions_20_0= ruleAction ) )
            // InternalMoniLog4DSL.g:339:4: (lv_actions_20_0= ruleAction )
            {
            // InternalMoniLog4DSL.g:339:4: (lv_actions_20_0= ruleAction )
            // InternalMoniLog4DSL.g:340:5: lv_actions_20_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMoniLogSpecAccess().getActionsActionParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_13);
            lv_actions_20_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_20_0,
            						"org.gemoc.monilog.MoniLog4DSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:357:3: (otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:358:4: otherlv_21= ',' ( (lv_actions_22_0= ruleAction ) )
            	    {
            	    otherlv_21=(Token)match(input,17,FOLLOW_17); 

            	    				newLeafNode(otherlv_21, grammarAccess.getMoniLogSpecAccess().getCommaKeyword_9_0());
            	    			
            	    // InternalMoniLog4DSL.g:362:4: ( (lv_actions_22_0= ruleAction ) )
            	    // InternalMoniLog4DSL.g:363:5: (lv_actions_22_0= ruleAction )
            	    {
            	    // InternalMoniLog4DSL.g:363:5: (lv_actions_22_0= ruleAction )
            	    // InternalMoniLog4DSL.g:364:6: lv_actions_22_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMoniLogSpecAccess().getActionsActionParserRuleCall_9_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_actions_22_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoniLogSpecRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_22_0,
            	    							"org.gemoc.monilog.MoniLog4DSL.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_23=(Token)match(input,18,FOLLOW_18); 

            			newLeafNode(otherlv_23, grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_10());
            		
            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_11());
            		

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
    // $ANTLR end "ruleMoniLogSpec"


    // $ANTLR start "entryRuleEvent"
    // InternalMoniLog4DSL.g:394:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMoniLog4DSL.g:394:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMoniLog4DSL.g:395:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMoniLog4DSL.g:401:1: ruleEvent returns [EObject current=null] : (this_BeforeEvent_0= ruleBeforeEvent | this_AfterEvent_1= ruleAfterEvent | this_BeforeAfterEvent_2= ruleBeforeAfterEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_BeforeEvent_0 = null;

        EObject this_AfterEvent_1 = null;

        EObject this_BeforeAfterEvent_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:407:2: ( (this_BeforeEvent_0= ruleBeforeEvent | this_AfterEvent_1= ruleAfterEvent | this_BeforeAfterEvent_2= ruleBeforeAfterEvent ) )
            // InternalMoniLog4DSL.g:408:2: (this_BeforeEvent_0= ruleBeforeEvent | this_AfterEvent_1= ruleAfterEvent | this_BeforeAfterEvent_2= ruleBeforeAfterEvent )
            {
            // InternalMoniLog4DSL.g:408:2: (this_BeforeEvent_0= ruleBeforeEvent | this_AfterEvent_1= ruleAfterEvent | this_BeforeAfterEvent_2= ruleBeforeAfterEvent )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt11=1;
                }
                break;
            case 24:
                {
                alt11=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMoniLog4DSL.g:409:3: this_BeforeEvent_0= ruleBeforeEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getBeforeEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_BeforeEvent_0=ruleBeforeEvent();

                    state._fsp--;


                    			current = this_BeforeEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:418:3: this_AfterEvent_1= ruleAfterEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getAfterEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AfterEvent_1=ruleAfterEvent();

                    state._fsp--;


                    			current = this_AfterEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:427:3: this_BeforeAfterEvent_2= ruleBeforeAfterEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getBeforeAfterEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_BeforeAfterEvent_2=ruleBeforeAfterEvent();

                    state._fsp--;


                    			current = this_BeforeAfterEvent_2;
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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleBeforeEvent"
    // InternalMoniLog4DSL.g:439:1: entryRuleBeforeEvent returns [EObject current=null] : iv_ruleBeforeEvent= ruleBeforeEvent EOF ;
    public final EObject entryRuleBeforeEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeforeEvent = null;


        try {
            // InternalMoniLog4DSL.g:439:52: (iv_ruleBeforeEvent= ruleBeforeEvent EOF )
            // InternalMoniLog4DSL.g:440:2: iv_ruleBeforeEvent= ruleBeforeEvent EOF
            {
             newCompositeNode(grammarAccess.getBeforeEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeforeEvent=ruleBeforeEvent();

            state._fsp--;

             current =iv_ruleBeforeEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBeforeEvent"


    // $ANTLR start "ruleBeforeEvent"
    // InternalMoniLog4DSL.g:446:1: ruleBeforeEvent returns [EObject current=null] : (otherlv_0= 'before' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleBeforeEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ruleID_1_1=null;
        Token lv_ruleID_1_2=null;
        Token otherlv_3=null;
        Token lv_frequency_4_0=null;
        Token otherlv_5=null;
        Token lv_limit_6_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:452:2: ( (otherlv_0= 'before' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoniLog4DSL.g:453:2: (otherlv_0= 'before' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoniLog4DSL.g:453:2: (otherlv_0= 'before' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoniLog4DSL.g:454:3: otherlv_0= 'before' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBeforeEventAccess().getBeforeKeyword_0());
            		
            // InternalMoniLog4DSL.g:458:3: ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) )
            // InternalMoniLog4DSL.g:459:4: ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) )
            {
            // InternalMoniLog4DSL.g:459:4: ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) )
            // InternalMoniLog4DSL.g:460:5: (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:460:5: (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoniLog4DSL.g:461:6: lv_ruleID_1_1= RULE_ID
                    {
                    lv_ruleID_1_1=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(lv_ruleID_1_1, grammarAccess.getBeforeEventAccess().getRuleIDIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBeforeEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:476:6: lv_ruleID_1_2= RULE_STRING
                    {
                    lv_ruleID_1_2=(Token)match(input,RULE_STRING,FOLLOW_19); 

                    						newLeafNode(lv_ruleID_1_2, grammarAccess.getBeforeEventAccess().getRuleIDSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBeforeEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_1_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoniLog4DSL.g:493:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalMoniLog4DSL.g:494:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalMoniLog4DSL.g:494:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalMoniLog4DSL.g:495:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
            				
            // InternalMoniLog4DSL.g:498:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalMoniLog4DSL.g:499:6: ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalMoniLog4DSL.g:499:6: ( ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )*
            loop13:
            do {
                int alt13=3;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 22 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1) ) {
                    alt13=2;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:500:4: ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:500:4: ({...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalMoniLog4DSL.g:501:5: {...}? => ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoniLog4DSL.g:501:108: ( ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) ) )
            	    // InternalMoniLog4DSL.g:502:6: ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoniLog4DSL.g:505:9: ({...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) ) )
            	    // InternalMoniLog4DSL.g:505:10: {...}? => (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:505:19: (otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) ) )
            	    // InternalMoniLog4DSL.g:505:20: otherlv_3= 'frequency^' ( (lv_frequency_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,22,FOLLOW_20); 

            	    									newLeafNode(otherlv_3, grammarAccess.getBeforeEventAccess().getFrequencyKeyword_2_0_0());
            	    								
            	    // InternalMoniLog4DSL.g:509:9: ( (lv_frequency_4_0= RULE_INT ) )
            	    // InternalMoniLog4DSL.g:510:10: (lv_frequency_4_0= RULE_INT )
            	    {
            	    // InternalMoniLog4DSL.g:510:10: (lv_frequency_4_0= RULE_INT )
            	    // InternalMoniLog4DSL.g:511:11: lv_frequency_4_0= RULE_INT
            	    {
            	    lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    											newLeafNode(lv_frequency_4_0, grammarAccess.getBeforeEventAccess().getFrequencyINTTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBeforeEventRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"frequency",
            	    												lv_frequency_4_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog4DSL.g:533:4: ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:533:4: ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalMoniLog4DSL.g:534:5: {...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoniLog4DSL.g:534:108: ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) )
            	    // InternalMoniLog4DSL.g:535:6: ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoniLog4DSL.g:538:9: ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) )
            	    // InternalMoniLog4DSL.g:538:10: {...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:538:19: (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) )
            	    // InternalMoniLog4DSL.g:538:20: otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_20); 

            	    									newLeafNode(otherlv_5, grammarAccess.getBeforeEventAccess().getLimitKeyword_2_1_0());
            	    								
            	    // InternalMoniLog4DSL.g:542:9: ( (lv_limit_6_0= RULE_INT ) )
            	    // InternalMoniLog4DSL.g:543:10: (lv_limit_6_0= RULE_INT )
            	    {
            	    // InternalMoniLog4DSL.g:543:10: (lv_limit_6_0= RULE_INT )
            	    // InternalMoniLog4DSL.g:544:11: lv_limit_6_0= RULE_INT
            	    {
            	    lv_limit_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

            	    											newLeafNode(lv_limit_6_0, grammarAccess.getBeforeEventAccess().getLimitINTTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBeforeEventRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"limit",
            	    												lv_limit_6_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleBeforeEvent"


    // $ANTLR start "entryRuleAfterEvent"
    // InternalMoniLog4DSL.g:577:1: entryRuleAfterEvent returns [EObject current=null] : iv_ruleAfterEvent= ruleAfterEvent EOF ;
    public final EObject entryRuleAfterEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAfterEvent = null;


        try {
            // InternalMoniLog4DSL.g:577:51: (iv_ruleAfterEvent= ruleAfterEvent EOF )
            // InternalMoniLog4DSL.g:578:2: iv_ruleAfterEvent= ruleAfterEvent EOF
            {
             newCompositeNode(grammarAccess.getAfterEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAfterEvent=ruleAfterEvent();

            state._fsp--;

             current =iv_ruleAfterEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAfterEvent"


    // $ANTLR start "ruleAfterEvent"
    // InternalMoniLog4DSL.g:584:1: ruleAfterEvent returns [EObject current=null] : (otherlv_0= 'after' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleAfterEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ruleID_1_1=null;
        Token lv_ruleID_1_2=null;
        Token otherlv_3=null;
        Token lv_frequency_4_0=null;
        Token otherlv_5=null;
        Token lv_limit_6_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:590:2: ( (otherlv_0= 'after' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoniLog4DSL.g:591:2: (otherlv_0= 'after' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoniLog4DSL.g:591:2: (otherlv_0= 'after' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoniLog4DSL.g:592:3: otherlv_0= 'after' ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAfterEventAccess().getAfterKeyword_0());
            		
            // InternalMoniLog4DSL.g:596:3: ( ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) ) )
            // InternalMoniLog4DSL.g:597:4: ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) )
            {
            // InternalMoniLog4DSL.g:597:4: ( (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING ) )
            // InternalMoniLog4DSL.g:598:5: (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:598:5: (lv_ruleID_1_1= RULE_ID | lv_ruleID_1_2= RULE_STRING )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_STRING) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoniLog4DSL.g:599:6: lv_ruleID_1_1= RULE_ID
                    {
                    lv_ruleID_1_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_ruleID_1_1, grammarAccess.getAfterEventAccess().getRuleIDIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAfterEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_1_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:614:6: lv_ruleID_1_2= RULE_STRING
                    {
                    lv_ruleID_1_2=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_ruleID_1_2, grammarAccess.getAfterEventAccess().getRuleIDSTRINGTerminalRuleCall_1_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAfterEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_1_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoniLog4DSL.g:631:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalMoniLog4DSL.g:632:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalMoniLog4DSL.g:632:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalMoniLog4DSL.g:633:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
            				
            // InternalMoniLog4DSL.g:636:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalMoniLog4DSL.g:637:6: ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalMoniLog4DSL.g:637:6: ( ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) ) )*
            loop15:
            do {
                int alt15=3;
                int LA15_0 = input.LA(1);

                if ( LA15_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0) ) {
                    alt15=1;
                }
                else if ( LA15_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1) ) {
                    alt15=2;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:638:4: ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:638:4: ({...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) ) )
            	    // InternalMoniLog4DSL.g:639:5: {...}? => ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleAfterEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoniLog4DSL.g:639:107: ( ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) ) )
            	    // InternalMoniLog4DSL.g:640:6: ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoniLog4DSL.g:643:9: ({...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) ) )
            	    // InternalMoniLog4DSL.g:643:10: {...}? => (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAfterEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:643:19: (otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) ) )
            	    // InternalMoniLog4DSL.g:643:20: otherlv_3= 'frequency' ( (lv_frequency_4_0= RULE_INT ) )
            	    {
            	    otherlv_3=(Token)match(input,25,FOLLOW_20); 

            	    									newLeafNode(otherlv_3, grammarAccess.getAfterEventAccess().getFrequencyKeyword_2_0_0());
            	    								
            	    // InternalMoniLog4DSL.g:647:9: ( (lv_frequency_4_0= RULE_INT ) )
            	    // InternalMoniLog4DSL.g:648:10: (lv_frequency_4_0= RULE_INT )
            	    {
            	    // InternalMoniLog4DSL.g:648:10: (lv_frequency_4_0= RULE_INT )
            	    // InternalMoniLog4DSL.g:649:11: lv_frequency_4_0= RULE_INT
            	    {
            	    lv_frequency_4_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    											newLeafNode(lv_frequency_4_0, grammarAccess.getAfterEventAccess().getFrequencyINTTerminalRuleCall_2_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAfterEventRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"frequency",
            	    												lv_frequency_4_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog4DSL.g:671:4: ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:671:4: ({...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) ) )
            	    // InternalMoniLog4DSL.g:672:5: {...}? => ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleAfterEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoniLog4DSL.g:672:107: ( ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) ) )
            	    // InternalMoniLog4DSL.g:673:6: ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoniLog4DSL.g:676:9: ({...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) ) )
            	    // InternalMoniLog4DSL.g:676:10: {...}? => (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleAfterEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:676:19: (otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) ) )
            	    // InternalMoniLog4DSL.g:676:20: otherlv_5= 'limit' ( (lv_limit_6_0= RULE_INT ) )
            	    {
            	    otherlv_5=(Token)match(input,23,FOLLOW_20); 

            	    									newLeafNode(otherlv_5, grammarAccess.getAfterEventAccess().getLimitKeyword_2_1_0());
            	    								
            	    // InternalMoniLog4DSL.g:680:9: ( (lv_limit_6_0= RULE_INT ) )
            	    // InternalMoniLog4DSL.g:681:10: (lv_limit_6_0= RULE_INT )
            	    {
            	    // InternalMoniLog4DSL.g:681:10: (lv_limit_6_0= RULE_INT )
            	    // InternalMoniLog4DSL.g:682:11: lv_limit_6_0= RULE_INT
            	    {
            	    lv_limit_6_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    											newLeafNode(lv_limit_6_0, grammarAccess.getAfterEventAccess().getLimitINTTerminalRuleCall_2_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getAfterEventRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"limit",
            	    												lv_limit_6_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
            				

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
    // $ANTLR end "ruleAfterEvent"


    // $ANTLR start "entryRuleBeforeAfterEvent"
    // InternalMoniLog4DSL.g:715:1: entryRuleBeforeAfterEvent returns [EObject current=null] : iv_ruleBeforeAfterEvent= ruleBeforeAfterEvent EOF ;
    public final EObject entryRuleBeforeAfterEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBeforeAfterEvent = null;


        try {
            // InternalMoniLog4DSL.g:715:57: (iv_ruleBeforeAfterEvent= ruleBeforeAfterEvent EOF )
            // InternalMoniLog4DSL.g:716:2: iv_ruleBeforeAfterEvent= ruleBeforeAfterEvent EOF
            {
             newCompositeNode(grammarAccess.getBeforeAfterEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBeforeAfterEvent=ruleBeforeAfterEvent();

            state._fsp--;

             current =iv_ruleBeforeAfterEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBeforeAfterEvent"


    // $ANTLR start "ruleBeforeAfterEvent"
    // InternalMoniLog4DSL.g:722:1: ruleBeforeAfterEvent returns [EObject current=null] : ( ( ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleBeforeAfterEvent() throws RecognitionException {
        EObject current = null;

        Token lv_ruleID_0_1=null;
        Token lv_ruleID_0_2=null;
        Token otherlv_2=null;
        Token lv_frequency_3_0=null;
        Token otherlv_4=null;
        Token lv_limit_5_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:728:2: ( ( ( ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoniLog4DSL.g:729:2: ( ( ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoniLog4DSL.g:729:2: ( ( ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoniLog4DSL.g:730:3: ( ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            {
            // InternalMoniLog4DSL.g:730:3: ( ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) ) )
            // InternalMoniLog4DSL.g:731:4: ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) )
            {
            // InternalMoniLog4DSL.g:731:4: ( (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING ) )
            // InternalMoniLog4DSL.g:732:5: (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:732:5: (lv_ruleID_0_1= RULE_ID | lv_ruleID_0_2= RULE_STRING )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoniLog4DSL.g:733:6: lv_ruleID_0_1= RULE_ID
                    {
                    lv_ruleID_0_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(lv_ruleID_0_1, grammarAccess.getBeforeAfterEventAccess().getRuleIDIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBeforeAfterEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:748:6: lv_ruleID_0_2= RULE_STRING
                    {
                    lv_ruleID_0_2=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_ruleID_0_2, grammarAccess.getBeforeAfterEventAccess().getRuleIDSTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getBeforeAfterEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_0_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoniLog4DSL.g:765:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) ) )
            // InternalMoniLog4DSL.g:766:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) )
            {
            // InternalMoniLog4DSL.g:766:4: ( ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* ) )
            // InternalMoniLog4DSL.g:767:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
            				
            // InternalMoniLog4DSL.g:770:5: ( ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )* )
            // InternalMoniLog4DSL.g:771:6: ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )*
            {
            // InternalMoniLog4DSL.g:771:6: ( ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) ) )*
            loop17:
            do {
                int alt17=3;
                int LA17_0 = input.LA(1);

                if ( LA17_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0) ) {
                    alt17=1;
                }
                else if ( LA17_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1) ) {
                    alt17=2;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:772:4: ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:772:4: ({...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) ) )
            	    // InternalMoniLog4DSL.g:773:5: {...}? => ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeAfterEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoniLog4DSL.g:773:113: ( ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) ) )
            	    // InternalMoniLog4DSL.g:774:6: ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoniLog4DSL.g:777:9: ({...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) ) )
            	    // InternalMoniLog4DSL.g:777:10: {...}? => (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeAfterEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:777:19: (otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) ) )
            	    // InternalMoniLog4DSL.g:777:20: otherlv_2= 'frequency' ( (lv_frequency_3_0= RULE_INT ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_20); 

            	    									newLeafNode(otherlv_2, grammarAccess.getBeforeAfterEventAccess().getFrequencyKeyword_1_0_0());
            	    								
            	    // InternalMoniLog4DSL.g:781:9: ( (lv_frequency_3_0= RULE_INT ) )
            	    // InternalMoniLog4DSL.g:782:10: (lv_frequency_3_0= RULE_INT )
            	    {
            	    // InternalMoniLog4DSL.g:782:10: (lv_frequency_3_0= RULE_INT )
            	    // InternalMoniLog4DSL.g:783:11: lv_frequency_3_0= RULE_INT
            	    {
            	    lv_frequency_3_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    											newLeafNode(lv_frequency_3_0, grammarAccess.getBeforeAfterEventAccess().getFrequencyINTTerminalRuleCall_1_0_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBeforeAfterEventRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"frequency",
            	    												lv_frequency_3_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog4DSL.g:805:4: ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:805:4: ({...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) ) )
            	    // InternalMoniLog4DSL.g:806:5: {...}? => ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeAfterEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoniLog4DSL.g:806:113: ( ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) ) )
            	    // InternalMoniLog4DSL.g:807:6: ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoniLog4DSL.g:810:9: ({...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) ) )
            	    // InternalMoniLog4DSL.g:810:10: {...}? => (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleBeforeAfterEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:810:19: (otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) ) )
            	    // InternalMoniLog4DSL.g:810:20: otherlv_4= 'limit' ( (lv_limit_5_0= RULE_INT ) )
            	    {
            	    otherlv_4=(Token)match(input,23,FOLLOW_20); 

            	    									newLeafNode(otherlv_4, grammarAccess.getBeforeAfterEventAccess().getLimitKeyword_1_1_0());
            	    								
            	    // InternalMoniLog4DSL.g:814:9: ( (lv_limit_5_0= RULE_INT ) )
            	    // InternalMoniLog4DSL.g:815:10: (lv_limit_5_0= RULE_INT )
            	    {
            	    // InternalMoniLog4DSL.g:815:10: (lv_limit_5_0= RULE_INT )
            	    // InternalMoniLog4DSL.g:816:11: lv_limit_5_0= RULE_INT
            	    {
            	    lv_limit_5_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            	    											newLeafNode(lv_limit_5_0, grammarAccess.getBeforeAfterEventAccess().getLimitINTTerminalRuleCall_1_1_1_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getBeforeAfterEventRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"limit",
            	    												lv_limit_5_0,
            	    												"org.eclipse.xtext.common.Terminals.INT");
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
            				

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
    // $ANTLR end "ruleBeforeAfterEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog4DSL.g:849:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMoniLog4DSL.g:849:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMoniLog4DSL.g:850:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMoniLog4DSL.g:856:1: ruleCondition returns [EObject current=null] : ( ( () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')' ) | ( () ( (lv_expression_8_0= ruleLanguageExpression ) ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_pattern_3_0 = null;

        Enumerator lv_kind_5_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:862:2: ( ( ( () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')' ) | ( () ( (lv_expression_8_0= ruleLanguageExpression ) ) ) ) )
            // InternalMoniLog4DSL.g:863:2: ( ( () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')' ) | ( () ( (lv_expression_8_0= ruleLanguageExpression ) ) ) )
            {
            // InternalMoniLog4DSL.g:863:2: ( ( () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')' ) | ( () ( (lv_expression_8_0= ruleLanguageExpression ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            else if ( ((LA19_0>=RULE_ID && LA19_0<=RULE_STRING)) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoniLog4DSL.g:864:3: ( () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')' )
                    {
                    // InternalMoniLog4DSL.g:864:3: ( () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')' )
                    // InternalMoniLog4DSL.g:865:4: () otherlv_1= 'stream' otherlv_2= '(' ( (lv_pattern_3_0= ruleTemporalPattern ) ) (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )? otherlv_6= ')'
                    {
                    // InternalMoniLog4DSL.g:865:4: ()
                    // InternalMoniLog4DSL.g:866:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionAccess().getTemporalPropertyConditionAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,26,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getConditionAccess().getStreamKeyword_0_1());
                    			
                    otherlv_2=(Token)match(input,27,FOLLOW_23); 

                    				newLeafNode(otherlv_2, grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMoniLog4DSL.g:880:4: ( (lv_pattern_3_0= ruleTemporalPattern ) )
                    // InternalMoniLog4DSL.g:881:5: (lv_pattern_3_0= ruleTemporalPattern )
                    {
                    // InternalMoniLog4DSL.g:881:5: (lv_pattern_3_0= ruleTemporalPattern )
                    // InternalMoniLog4DSL.g:882:6: lv_pattern_3_0= ruleTemporalPattern
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getPatternTemporalPatternParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_24);
                    lv_pattern_3_0=ruleTemporalPattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"pattern",
                    							lv_pattern_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.TemporalPattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:899:4: (otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) ) )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==17) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMoniLog4DSL.g:900:5: otherlv_4= ',' ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) )
                            {
                            otherlv_4=(Token)match(input,17,FOLLOW_25); 

                            					newLeafNode(otherlv_4, grammarAccess.getConditionAccess().getCommaKeyword_0_4_0());
                            				
                            // InternalMoniLog4DSL.g:904:5: ( (lv_kind_5_0= ruleTemporalPropertyConditionKind ) )
                            // InternalMoniLog4DSL.g:905:6: (lv_kind_5_0= ruleTemporalPropertyConditionKind )
                            {
                            // InternalMoniLog4DSL.g:905:6: (lv_kind_5_0= ruleTemporalPropertyConditionKind )
                            // InternalMoniLog4DSL.g:906:7: lv_kind_5_0= ruleTemporalPropertyConditionKind
                            {

                            							newCompositeNode(grammarAccess.getConditionAccess().getKindTemporalPropertyConditionKindEnumRuleCall_0_4_1_0());
                            						
                            pushFollow(FOLLOW_26);
                            lv_kind_5_0=ruleTemporalPropertyConditionKind();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getConditionRule());
                            							}
                            							set(
                            								current,
                            								"kind",
                            								lv_kind_5_0,
                            								"org.gemoc.monilog.MoniLog4DSL.TemporalPropertyConditionKind");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_5());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:930:3: ( () ( (lv_expression_8_0= ruleLanguageExpression ) ) )
                    {
                    // InternalMoniLog4DSL.g:930:3: ( () ( (lv_expression_8_0= ruleLanguageExpression ) ) )
                    // InternalMoniLog4DSL.g:931:4: () ( (lv_expression_8_0= ruleLanguageExpression ) )
                    {
                    // InternalMoniLog4DSL.g:931:4: ()
                    // InternalMoniLog4DSL.g:932:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getConditionAccess().getLanguageExpressionConditionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:938:4: ( (lv_expression_8_0= ruleLanguageExpression ) )
                    // InternalMoniLog4DSL.g:939:5: (lv_expression_8_0= ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:939:5: (lv_expression_8_0= ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:940:6: lv_expression_8_0= ruleLanguageExpression
                    {

                    						newCompositeNode(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_expression_8_0=ruleLanguageExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getConditionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalMoniLog4DSL.g:962:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalMoniLog4DSL.g:962:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalMoniLog4DSL.g:963:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
            {
             newCompositeNode(grammarAccess.getTemporalPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTemporalPattern=ruleTemporalPattern();

            state._fsp--;

             current =iv_ruleTemporalPattern; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleTemporalPattern"


    // $ANTLR start "ruleTemporalPattern"
    // InternalMoniLog4DSL.g:969:1: ruleTemporalPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;

        EObject lv_scope_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:975:2: ( ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) )
            // InternalMoniLog4DSL.g:976:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            {
            // InternalMoniLog4DSL.g:976:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            // InternalMoniLog4DSL.g:977:3: ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) )
            {
            // InternalMoniLog4DSL.g:977:3: ( (lv_pattern_0_0= rulePattern ) )
            // InternalMoniLog4DSL.g:978:4: (lv_pattern_0_0= rulePattern )
            {
            // InternalMoniLog4DSL.g:978:4: (lv_pattern_0_0= rulePattern )
            // InternalMoniLog4DSL.g:979:5: lv_pattern_0_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_pattern_0_0=rulePattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_0_0,
            						"org.gemoc.monilog.MoniLog4DSL.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:996:3: ( (lv_scope_1_0= ruleScope ) )
            // InternalMoniLog4DSL.g:997:4: (lv_scope_1_0= ruleScope )
            {
            // InternalMoniLog4DSL.g:997:4: (lv_scope_1_0= ruleScope )
            // InternalMoniLog4DSL.g:998:5: lv_scope_1_0= ruleScope
            {

            					newCompositeNode(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_scope_1_0=ruleScope();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTemporalPatternRule());
            					}
            					set(
            						current,
            						"scope",
            						lv_scope_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.Scope");
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
    // $ANTLR end "ruleTemporalPattern"


    // $ANTLR start "entryRulePattern"
    // InternalMoniLog4DSL.g:1019:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMoniLog4DSL.g:1019:48: (iv_rulePattern= rulePattern EOF )
            // InternalMoniLog4DSL.g:1020:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMoniLog4DSL.g:1026:1: rulePattern returns [EObject current=null] : ( ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) ) | ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_event_2_0 = null;

        EObject lv_bound_5_0 = null;

        EObject lv_event_6_0 = null;

        EObject lv_event_9_0 = null;

        EObject lv_predecessor_11_0 = null;

        EObject lv_successor_13_0 = null;

        EObject lv_event_15_0 = null;

        EObject lv_trigger_17_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1032:2: ( ( ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) ) | ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog4DSL.g:1033:2: ( ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) ) | ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog4DSL.g:1033:2: ( ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) ) | ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            int alt20=5;
            alt20 = dfa20.predict(input);
            switch (alt20) {
                case 1 :
                    // InternalMoniLog4DSL.g:1034:3: ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1034:3: ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1035:4: () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1035:4: ()
                    // InternalMoniLog4DSL.g:1036:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getUniversalityAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getAlwaysKeyword_0_1());
                    			
                    // InternalMoniLog4DSL.g:1046:4: ( (lv_event_2_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1047:5: (lv_event_2_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1047:5: (lv_event_2_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1048:6: lv_event_2_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_event_2_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_2_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1067:3: ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1067:3: ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1068:4: () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1068:4: ()
                    // InternalMoniLog4DSL.g:1069:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getExistenceAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_4=(Token)match(input,30,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getExistsKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:1079:4: ( (lv_bound_5_0= ruleBoundType ) )
                    // InternalMoniLog4DSL.g:1080:5: (lv_bound_5_0= ruleBoundType )
                    {
                    // InternalMoniLog4DSL.g:1080:5: (lv_bound_5_0= ruleBoundType )
                    // InternalMoniLog4DSL.g:1081:6: lv_bound_5_0= ruleBoundType
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_bound_5_0=ruleBoundType();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"bound",
                    							lv_bound_5_0,
                    							"org.gemoc.monilog.MoniLog4DSL.BoundType");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1098:4: ( (lv_event_6_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1099:5: (lv_event_6_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1099:5: (lv_event_6_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1100:6: lv_event_6_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_event_6_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_6_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1119:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1119:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1120:4: () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1120:4: ()
                    // InternalMoniLog4DSL.g:1121:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getAbsenceAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getNeverKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:1131:4: ( (lv_event_9_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1132:5: (lv_event_9_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1132:5: (lv_event_9_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1133:6: lv_event_9_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_event_9_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_9_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1152:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1152:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1153:4: () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1153:4: ()
                    // InternalMoniLog4DSL.g:1154:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getPrecedenceAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1160:4: ( (lv_predecessor_11_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1161:5: (lv_predecessor_11_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1161:5: (lv_predecessor_11_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1162:6: lv_predecessor_11_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    lv_predecessor_11_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"predecessor",
                    							lv_predecessor_11_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPrecedesKeyword_3_2());
                    			
                    // InternalMoniLog4DSL.g:1183:4: ( (lv_successor_13_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1184:5: (lv_successor_13_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1184:5: (lv_successor_13_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1185:6: lv_successor_13_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_successor_13_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"successor",
                    							lv_successor_13_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1204:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1204:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1205:4: () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1205:4: ()
                    // InternalMoniLog4DSL.g:1206:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getResponseAction_4_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1212:4: ( (lv_event_15_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1213:5: (lv_event_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1213:5: (lv_event_15_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1214:6: lv_event_15_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_event_15_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_15_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,33,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getRespondsToKeyword_4_2());
                    			
                    // InternalMoniLog4DSL.g:1235:4: ( (lv_trigger_17_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1236:5: (lv_trigger_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1236:5: (lv_trigger_17_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1237:6: lv_trigger_17_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_trigger_17_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"trigger",
                    							lv_trigger_17_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBoundType"
    // InternalMoniLog4DSL.g:1259:1: entryRuleBoundType returns [EObject current=null] : iv_ruleBoundType= ruleBoundType EOF ;
    public final EObject entryRuleBoundType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundType = null;


        try {
            // InternalMoniLog4DSL.g:1259:50: (iv_ruleBoundType= ruleBoundType EOF )
            // InternalMoniLog4DSL.g:1260:2: iv_ruleBoundType= ruleBoundType EOF
            {
             newCompositeNode(grammarAccess.getBoundTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBoundType=ruleBoundType();

            state._fsp--;

             current =iv_ruleBoundType; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBoundType"


    // $ANTLR start "ruleBoundType"
    // InternalMoniLog4DSL.g:1266:1: ruleBoundType returns [EObject current=null] : (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) ;
    public final EObject ruleBoundType() throws RecognitionException {
        EObject current = null;

        EObject this_ExactBound_0 = null;

        EObject this_LowerBound_1 = null;

        EObject this_UpperBound_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1272:2: ( (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) )
            // InternalMoniLog4DSL.g:1273:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            {
            // InternalMoniLog4DSL.g:1273:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            int alt21=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt21=1;
                }
                break;
            case 34:
                {
                alt21=2;
                }
                break;
            case 35:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMoniLog4DSL.g:1274:3: this_ExactBound_0= ruleExactBound
                    {

                    			newCompositeNode(grammarAccess.getBoundTypeAccess().getExactBoundParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExactBound_0=ruleExactBound();

                    state._fsp--;


                    			current = this_ExactBound_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1283:3: this_LowerBound_1= ruleLowerBound
                    {

                    			newCompositeNode(grammarAccess.getBoundTypeAccess().getLowerBoundParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LowerBound_1=ruleLowerBound();

                    state._fsp--;


                    			current = this_LowerBound_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1292:3: this_UpperBound_2= ruleUpperBound
                    {

                    			newCompositeNode(grammarAccess.getBoundTypeAccess().getUpperBoundParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UpperBound_2=ruleUpperBound();

                    state._fsp--;


                    			current = this_UpperBound_2;
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
    // $ANTLR end "ruleBoundType"


    // $ANTLR start "entryRuleExactBound"
    // InternalMoniLog4DSL.g:1304:1: entryRuleExactBound returns [EObject current=null] : iv_ruleExactBound= ruleExactBound EOF ;
    public final EObject entryRuleExactBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactBound = null;


        try {
            // InternalMoniLog4DSL.g:1304:51: (iv_ruleExactBound= ruleExactBound EOF )
            // InternalMoniLog4DSL.g:1305:2: iv_ruleExactBound= ruleExactBound EOF
            {
             newCompositeNode(grammarAccess.getExactBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExactBound=ruleExactBound();

            state._fsp--;

             current =iv_ruleExactBound; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExactBound"


    // $ANTLR start "ruleExactBound"
    // InternalMoniLog4DSL.g:1311:1: ruleExactBound returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleExactBound() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1317:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1318:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalMoniLog4DSL.g:1318:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1319:3: (lv_n_0_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1319:3: (lv_n_0_0= RULE_INT )
            // InternalMoniLog4DSL.g:1320:4: lv_n_0_0= RULE_INT
            {
            lv_n_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_n_0_0, grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getExactBoundRule());
            				}
            				setWithLastConsumed(
            					current,
            					"n",
            					lv_n_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

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
    // $ANTLR end "ruleExactBound"


    // $ANTLR start "entryRuleLowerBound"
    // InternalMoniLog4DSL.g:1339:1: entryRuleLowerBound returns [EObject current=null] : iv_ruleLowerBound= ruleLowerBound EOF ;
    public final EObject entryRuleLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBound = null;


        try {
            // InternalMoniLog4DSL.g:1339:51: (iv_ruleLowerBound= ruleLowerBound EOF )
            // InternalMoniLog4DSL.g:1340:2: iv_ruleLowerBound= ruleLowerBound EOF
            {
             newCompositeNode(grammarAccess.getLowerBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLowerBound=ruleLowerBound();

            state._fsp--;

             current =iv_ruleLowerBound; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLowerBound"


    // $ANTLR start "ruleLowerBound"
    // InternalMoniLog4DSL.g:1346:1: ruleLowerBound returns [EObject current=null] : (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1352:2: ( (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog4DSL.g:1353:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog4DSL.g:1353:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1354:3: otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,34,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundAccess().getAtleastKeyword_0());
            		
            // InternalMoniLog4DSL.g:1358:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1359:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1359:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog4DSL.g:1360:5: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_1_0, grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLowerBoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleLowerBound"


    // $ANTLR start "entryRuleUpperBound"
    // InternalMoniLog4DSL.g:1380:1: entryRuleUpperBound returns [EObject current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final EObject entryRuleUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperBound = null;


        try {
            // InternalMoniLog4DSL.g:1380:51: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalMoniLog4DSL.g:1381:2: iv_ruleUpperBound= ruleUpperBound EOF
            {
             newCompositeNode(grammarAccess.getUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpperBound=ruleUpperBound();

            state._fsp--;

             current =iv_ruleUpperBound; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleUpperBound"


    // $ANTLR start "ruleUpperBound"
    // InternalMoniLog4DSL.g:1387:1: ruleUpperBound returns [EObject current=null] : (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1393:2: ( (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog4DSL.g:1394:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog4DSL.g:1394:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1395:3: otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,35,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperBoundAccess().getAtmostKeyword_0());
            		
            // InternalMoniLog4DSL.g:1399:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1400:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1400:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog4DSL.g:1401:5: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_n_1_0, grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUpperBoundRule());
            					}
            					setWithLastConsumed(
            						current,
            						"n",
            						lv_n_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

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
    // $ANTLR end "ruleUpperBound"


    // $ANTLR start "entryRuleScope"
    // InternalMoniLog4DSL.g:1421:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalMoniLog4DSL.g:1421:46: (iv_ruleScope= ruleScope EOF )
            // InternalMoniLog4DSL.g:1422:2: iv_ruleScope= ruleScope EOF
            {
             newCompositeNode(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;

             current =iv_ruleScope; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalMoniLog4DSL.g:1428:1: ruleScope returns [EObject current=null] : ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) ;
    public final EObject ruleScope() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        EObject lv_lowerBound_4_0 = null;

        EObject lv_upperBound_7_0 = null;

        EObject lv_lowerBound_10_0 = null;

        EObject lv_upperBound_12_0 = null;

        EObject lv_lowerBound_15_0 = null;

        EObject lv_upperBound_17_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1434:2: ( ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog4DSL.g:1435:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog4DSL.g:1435:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            int alt23=5;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalMoniLog4DSL.g:1436:3: ( () (otherlv_1= 'globally' )? )
                    {
                    // InternalMoniLog4DSL.g:1436:3: ( () (otherlv_1= 'globally' )? )
                    // InternalMoniLog4DSL.g:1437:4: () (otherlv_1= 'globally' )?
                    {
                    // InternalMoniLog4DSL.g:1437:4: ()
                    // InternalMoniLog4DSL.g:1438:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getGloballyAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1444:4: (otherlv_1= 'globally' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==36) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1445:5: otherlv_1= 'globally'
                            {
                            otherlv_1=(Token)match(input,36,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getGloballyKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1452:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1452:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1453:4: () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1453:4: ()
                    // InternalMoniLog4DSL.g:1454:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getAfterKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:1464:4: ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1465:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1465:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1466:6: lv_lowerBound_4_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_lowerBound_4_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1485:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1485:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1486:4: () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1486:4: ()
                    // InternalMoniLog4DSL.g:1487:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBeforeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,21,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getBeforeKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:1497:4: ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1498:5: (lv_upperBound_7_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1498:5: (lv_upperBound_7_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1499:6: lv_upperBound_7_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upperBound_7_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_7_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1518:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1518:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1519:4: () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1519:4: ()
                    // InternalMoniLog4DSL.g:1520:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBetweenAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                    			
                    // InternalMoniLog4DSL.g:1530:4: ( (lv_lowerBound_10_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1531:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1531:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1532:6: lv_lowerBound_10_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_31);
                    lv_lowerBound_10_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_10_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,38,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_3());
                    			
                    // InternalMoniLog4DSL.g:1553:4: ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1554:5: (lv_upperBound_12_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1554:5: (lv_upperBound_12_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1555:6: lv_upperBound_12_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upperBound_12_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_12_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1574:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1574:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1575:4: () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1575:4: ()
                    // InternalMoniLog4DSL.g:1576:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterUntilAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,24,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                    			
                    // InternalMoniLog4DSL.g:1586:4: ( (lv_lowerBound_15_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1587:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1587:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1588:6: lv_lowerBound_15_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_32);
                    lv_lowerBound_15_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"lowerBound",
                    							lv_lowerBound_15_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,39,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getScopeAccess().getUntilKeyword_4_3());
                    			
                    // InternalMoniLog4DSL.g:1609:4: ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1610:5: (lv_upperBound_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1610:5: (lv_upperBound_17_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1611:6: lv_upperBound_17_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_upperBound_17_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getScopeRule());
                    						}
                    						set(
                    							current,
                    							"upperBound",
                    							lv_upperBound_17_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleAction"
    // InternalMoniLog4DSL.g:1633:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMoniLog4DSL.g:1633:47: (iv_ruleAction= ruleAction EOF )
            // InternalMoniLog4DSL.g:1634:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMoniLog4DSL.g:1640:1: ruleAction returns [EObject current=null] : ( ( () otherlv_1= 'notify' ) | this_Append_2= ruleAppend ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject this_Append_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1646:2: ( ( ( () otherlv_1= 'notify' ) | this_Append_2= ruleAppend ) )
            // InternalMoniLog4DSL.g:1647:2: ( ( () otherlv_1= 'notify' ) | this_Append_2= ruleAppend )
            {
            // InternalMoniLog4DSL.g:1647:2: ( ( () otherlv_1= 'notify' ) | this_Append_2= ruleAppend )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==40) ) {
                alt24=1;
            }
            else if ( (LA24_0==41) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoniLog4DSL.g:1648:3: ( () otherlv_1= 'notify' )
                    {
                    // InternalMoniLog4DSL.g:1648:3: ( () otherlv_1= 'notify' )
                    // InternalMoniLog4DSL.g:1649:4: () otherlv_1= 'notify'
                    {
                    // InternalMoniLog4DSL.g:1649:4: ()
                    // InternalMoniLog4DSL.g:1650:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getActionAccess().getNotifyAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,40,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getActionAccess().getNotifyKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1662:3: this_Append_2= ruleAppend
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAppendParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Append_2=ruleAppend();

                    state._fsp--;


                    			current = this_Append_2;
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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAppend"
    // InternalMoniLog4DSL.g:1674:1: entryRuleAppend returns [EObject current=null] : iv_ruleAppend= ruleAppend EOF ;
    public final EObject entryRuleAppend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppend = null;


        try {
            // InternalMoniLog4DSL.g:1674:47: (iv_ruleAppend= ruleAppend EOF )
            // InternalMoniLog4DSL.g:1675:2: iv_ruleAppend= ruleAppend EOF
            {
             newCompositeNode(grammarAccess.getAppendRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppend=ruleAppend();

            state._fsp--;

             current =iv_ruleAppend; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppend"


    // $ANTLR start "ruleAppend"
    // InternalMoniLog4DSL.g:1681:1: ruleAppend returns [EObject current=null] : (otherlv_0= 'append' ( (lv_appender_1_0= ruleAppender ) ) ) ;
    public final EObject ruleAppend() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_appender_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1687:2: ( (otherlv_0= 'append' ( (lv_appender_1_0= ruleAppender ) ) ) )
            // InternalMoniLog4DSL.g:1688:2: (otherlv_0= 'append' ( (lv_appender_1_0= ruleAppender ) ) )
            {
            // InternalMoniLog4DSL.g:1688:2: (otherlv_0= 'append' ( (lv_appender_1_0= ruleAppender ) ) )
            // InternalMoniLog4DSL.g:1689:3: otherlv_0= 'append' ( (lv_appender_1_0= ruleAppender ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_33); 

            			newLeafNode(otherlv_0, grammarAccess.getAppendAccess().getAppendKeyword_0());
            		
            // InternalMoniLog4DSL.g:1693:3: ( (lv_appender_1_0= ruleAppender ) )
            // InternalMoniLog4DSL.g:1694:4: (lv_appender_1_0= ruleAppender )
            {
            // InternalMoniLog4DSL.g:1694:4: (lv_appender_1_0= ruleAppender )
            // InternalMoniLog4DSL.g:1695:5: lv_appender_1_0= ruleAppender
            {

            					newCompositeNode(grammarAccess.getAppendAccess().getAppenderAppenderParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_appender_1_0=ruleAppender();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppendRule());
            					}
            					set(
            						current,
            						"appender",
            						lv_appender_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.Appender");
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
    // $ANTLR end "ruleAppend"


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog4DSL.g:1716:1: entryRuleAppender returns [EObject current=null] : iv_ruleAppender= ruleAppender EOF ;
    public final EObject entryRuleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppender = null;


        try {
            // InternalMoniLog4DSL.g:1716:49: (iv_ruleAppender= ruleAppender EOF )
            // InternalMoniLog4DSL.g:1717:2: iv_ruleAppender= ruleAppender EOF
            {
             newCompositeNode(grammarAccess.getAppenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppender=ruleAppender();

            state._fsp--;

             current =iv_ruleAppender; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppender"


    // $ANTLR start "ruleAppender"
    // InternalMoniLog4DSL.g:1723:1: ruleAppender returns [EObject current=null] : (this_StreamAppender_0= ruleStreamAppender | this_FileAppender_1= ruleFileAppender | this_ConsoleAppender_2= ruleConsoleAppender ) ;
    public final EObject ruleAppender() throws RecognitionException {
        EObject current = null;

        EObject this_StreamAppender_0 = null;

        EObject this_FileAppender_1 = null;

        EObject this_ConsoleAppender_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1729:2: ( (this_StreamAppender_0= ruleStreamAppender | this_FileAppender_1= ruleFileAppender | this_ConsoleAppender_2= ruleConsoleAppender ) )
            // InternalMoniLog4DSL.g:1730:2: (this_StreamAppender_0= ruleStreamAppender | this_FileAppender_1= ruleFileAppender | this_ConsoleAppender_2= ruleConsoleAppender )
            {
            // InternalMoniLog4DSL.g:1730:2: (this_StreamAppender_0= ruleStreamAppender | this_FileAppender_1= ruleFileAppender | this_ConsoleAppender_2= ruleConsoleAppender )
            int alt25=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt25=1;
                }
                break;
            case 42:
                {
                alt25=2;
                }
                break;
            case 43:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalMoniLog4DSL.g:1731:3: this_StreamAppender_0= ruleStreamAppender
                    {

                    			newCompositeNode(grammarAccess.getAppenderAccess().getStreamAppenderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StreamAppender_0=ruleStreamAppender();

                    state._fsp--;


                    			current = this_StreamAppender_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1740:3: this_FileAppender_1= ruleFileAppender
                    {

                    			newCompositeNode(grammarAccess.getAppenderAccess().getFileAppenderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_FileAppender_1=ruleFileAppender();

                    state._fsp--;


                    			current = this_FileAppender_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1749:3: this_ConsoleAppender_2= ruleConsoleAppender
                    {

                    			newCompositeNode(grammarAccess.getAppenderAccess().getConsoleAppenderParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ConsoleAppender_2=ruleConsoleAppender();

                    state._fsp--;


                    			current = this_ConsoleAppender_2;
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
    // $ANTLR end "ruleAppender"


    // $ANTLR start "entryRuleStreamAppender"
    // InternalMoniLog4DSL.g:1761:1: entryRuleStreamAppender returns [EObject current=null] : iv_ruleStreamAppender= ruleStreamAppender EOF ;
    public final EObject entryRuleStreamAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamAppender = null;


        try {
            // InternalMoniLog4DSL.g:1761:55: (iv_ruleStreamAppender= ruleStreamAppender EOF )
            // InternalMoniLog4DSL.g:1762:2: iv_ruleStreamAppender= ruleStreamAppender EOF
            {
             newCompositeNode(grammarAccess.getStreamAppenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStreamAppender=ruleStreamAppender();

            state._fsp--;

             current =iv_ruleStreamAppender; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStreamAppender"


    // $ANTLR start "ruleStreamAppender"
    // InternalMoniLog4DSL.g:1768:1: ruleStreamAppender returns [EObject current=null] : (otherlv_0= 'stream' otherlv_1= '(' ( ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) ) ) (otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']' )? otherlv_8= ')' ) ;
    public final EObject ruleStreamAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_event_2_1=null;
        Token lv_event_2_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_values_4_0 = null;

        EObject lv_values_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1774:2: ( (otherlv_0= 'stream' otherlv_1= '(' ( ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) ) ) (otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']' )? otherlv_8= ')' ) )
            // InternalMoniLog4DSL.g:1775:2: (otherlv_0= 'stream' otherlv_1= '(' ( ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) ) ) (otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']' )? otherlv_8= ')' )
            {
            // InternalMoniLog4DSL.g:1775:2: (otherlv_0= 'stream' otherlv_1= '(' ( ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) ) ) (otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']' )? otherlv_8= ')' )
            // InternalMoniLog4DSL.g:1776:3: otherlv_0= 'stream' otherlv_1= '(' ( ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) ) ) (otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']' )? otherlv_8= ')'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getStreamAppenderAccess().getStreamKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getStreamAppenderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoniLog4DSL.g:1784:3: ( ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) ) )
            // InternalMoniLog4DSL.g:1785:4: ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) )
            {
            // InternalMoniLog4DSL.g:1785:4: ( (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING ) )
            // InternalMoniLog4DSL.g:1786:5: (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:1786:5: (lv_event_2_1= RULE_ID | lv_event_2_2= RULE_STRING )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            else if ( (LA26_0==RULE_STRING) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalMoniLog4DSL.g:1787:6: lv_event_2_1= RULE_ID
                    {
                    lv_event_2_1=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(lv_event_2_1, grammarAccess.getStreamAppenderAccess().getEventIDTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamAppenderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"event",
                    							lv_event_2_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1802:6: lv_event_2_2= RULE_STRING
                    {
                    lv_event_2_2=(Token)match(input,RULE_STRING,FOLLOW_34); 

                    						newLeafNode(lv_event_2_2, grammarAccess.getStreamAppenderAccess().getEventSTRINGTerminalRuleCall_2_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamAppenderRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"event",
                    							lv_event_2_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoniLog4DSL.g:1819:3: (otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==13) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMoniLog4DSL.g:1820:4: otherlv_3= '[' ( (lv_values_4_0= ruleLanguageExpression ) ) (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )* otherlv_7= ']'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_15); 

                    				newLeafNode(otherlv_3, grammarAccess.getStreamAppenderAccess().getLeftSquareBracketKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:1824:4: ( (lv_values_4_0= ruleLanguageExpression ) )
                    // InternalMoniLog4DSL.g:1825:5: (lv_values_4_0= ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:1825:5: (lv_values_4_0= ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:1826:6: lv_values_4_0= ruleLanguageExpression
                    {

                    						newCompositeNode(grammarAccess.getStreamAppenderAccess().getValuesLanguageExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_values_4_0=ruleLanguageExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamAppenderRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1843:4: (otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) ) )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==17) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:1844:5: otherlv_5= ',' ( (lv_values_6_0= ruleLanguageExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,17,FOLLOW_15); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getStreamAppenderAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:1848:5: ( (lv_values_6_0= ruleLanguageExpression ) )
                    	    // InternalMoniLog4DSL.g:1849:6: (lv_values_6_0= ruleLanguageExpression )
                    	    {
                    	    // InternalMoniLog4DSL.g:1849:6: (lv_values_6_0= ruleLanguageExpression )
                    	    // InternalMoniLog4DSL.g:1850:7: lv_values_6_0= ruleLanguageExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getStreamAppenderAccess().getValuesLanguageExpressionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_values_6_0=ruleLanguageExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStreamAppenderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_6_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,14,FOLLOW_26); 

                    				newLeafNode(otherlv_7, grammarAccess.getStreamAppenderAccess().getRightSquareBracketKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getStreamAppenderAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleStreamAppender"


    // $ANTLR start "entryRuleFileAppender"
    // InternalMoniLog4DSL.g:1881:1: entryRuleFileAppender returns [EObject current=null] : iv_ruleFileAppender= ruleFileAppender EOF ;
    public final EObject entryRuleFileAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileAppender = null;


        try {
            // InternalMoniLog4DSL.g:1881:53: (iv_ruleFileAppender= ruleFileAppender EOF )
            // InternalMoniLog4DSL.g:1882:2: iv_ruleFileAppender= ruleFileAppender EOF
            {
             newCompositeNode(grammarAccess.getFileAppenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFileAppender=ruleFileAppender();

            state._fsp--;

             current =iv_ruleFileAppender; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFileAppender"


    // $ANTLR start "ruleFileAppender"
    // InternalMoniLog4DSL.g:1888:1: ruleFileAppender returns [EObject current=null] : (otherlv_0= 'file' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_layout_4_0= ruleLayout ) ) otherlv_5= ')' ) ;
    public final EObject ruleFileAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filename_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_layout_4_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1894:2: ( (otherlv_0= 'file' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_layout_4_0= ruleLayout ) ) otherlv_5= ')' ) )
            // InternalMoniLog4DSL.g:1895:2: (otherlv_0= 'file' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_layout_4_0= ruleLayout ) ) otherlv_5= ')' )
            {
            // InternalMoniLog4DSL.g:1895:2: (otherlv_0= 'file' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_layout_4_0= ruleLayout ) ) otherlv_5= ')' )
            // InternalMoniLog4DSL.g:1896:3: otherlv_0= 'file' otherlv_1= '(' ( (lv_filename_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_layout_4_0= ruleLayout ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getFileAppenderAccess().getFileKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getFileAppenderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoniLog4DSL.g:1904:3: ( (lv_filename_2_0= RULE_STRING ) )
            // InternalMoniLog4DSL.g:1905:4: (lv_filename_2_0= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:1905:4: (lv_filename_2_0= RULE_STRING )
            // InternalMoniLog4DSL.g:1906:5: lv_filename_2_0= RULE_STRING
            {
            lv_filename_2_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

            					newLeafNode(lv_filename_2_0, grammarAccess.getFileAppenderAccess().getFilenameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFileAppenderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"filename",
            						lv_filename_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getFileAppenderAccess().getCommaKeyword_3());
            		
            // InternalMoniLog4DSL.g:1926:3: ( (lv_layout_4_0= ruleLayout ) )
            // InternalMoniLog4DSL.g:1927:4: (lv_layout_4_0= ruleLayout )
            {
            // InternalMoniLog4DSL.g:1927:4: (lv_layout_4_0= ruleLayout )
            // InternalMoniLog4DSL.g:1928:5: lv_layout_4_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getFileAppenderAccess().getLayoutLayoutParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_26);
            lv_layout_4_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFileAppenderRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_4_0,
            						"org.gemoc.monilog.MoniLog4DSL.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getFileAppenderAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleFileAppender"


    // $ANTLR start "entryRuleConsoleAppender"
    // InternalMoniLog4DSL.g:1953:1: entryRuleConsoleAppender returns [EObject current=null] : iv_ruleConsoleAppender= ruleConsoleAppender EOF ;
    public final EObject entryRuleConsoleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConsoleAppender = null;


        try {
            // InternalMoniLog4DSL.g:1953:56: (iv_ruleConsoleAppender= ruleConsoleAppender EOF )
            // InternalMoniLog4DSL.g:1954:2: iv_ruleConsoleAppender= ruleConsoleAppender EOF
            {
             newCompositeNode(grammarAccess.getConsoleAppenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConsoleAppender=ruleConsoleAppender();

            state._fsp--;

             current =iv_ruleConsoleAppender; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsoleAppender"


    // $ANTLR start "ruleConsoleAppender"
    // InternalMoniLog4DSL.g:1960:1: ruleConsoleAppender returns [EObject current=null] : (otherlv_0= 'console' otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' ) ;
    public final EObject ruleConsoleAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_layout_2_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1966:2: ( (otherlv_0= 'console' otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' ) )
            // InternalMoniLog4DSL.g:1967:2: (otherlv_0= 'console' otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )
            {
            // InternalMoniLog4DSL.g:1967:2: (otherlv_0= 'console' otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')' )
            // InternalMoniLog4DSL.g:1968:3: otherlv_0= 'console' otherlv_1= '(' ( (lv_layout_2_0= ruleLayout ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_22); 

            			newLeafNode(otherlv_0, grammarAccess.getConsoleAppenderAccess().getConsoleKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getConsoleAppenderAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoniLog4DSL.g:1976:3: ( (lv_layout_2_0= ruleLayout ) )
            // InternalMoniLog4DSL.g:1977:4: (lv_layout_2_0= ruleLayout )
            {
            // InternalMoniLog4DSL.g:1977:4: (lv_layout_2_0= ruleLayout )
            // InternalMoniLog4DSL.g:1978:5: lv_layout_2_0= ruleLayout
            {

            					newCompositeNode(grammarAccess.getConsoleAppenderAccess().getLayoutLayoutParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_26);
            lv_layout_2_0=ruleLayout();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConsoleAppenderRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_2_0,
            						"org.gemoc.monilog.MoniLog4DSL.Layout");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,28,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getConsoleAppenderAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleConsoleAppender"


    // $ANTLR start "entryRuleLayout"
    // InternalMoniLog4DSL.g:2003:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMoniLog4DSL.g:2003:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMoniLog4DSL.g:2004:2: iv_ruleLayout= ruleLayout EOF
            {
             newCompositeNode(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;

             current =iv_ruleLayout; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalMoniLog4DSL.g:2010:1: ruleLayout returns [EObject current=null] : (this_StringLayout_0= ruleStringLayout | this_ExternalLayout_1= ruleExternalLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_StringLayout_0 = null;

        EObject this_ExternalLayout_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2016:2: ( (this_StringLayout_0= ruleStringLayout | this_ExternalLayout_1= ruleExternalLayout ) )
            // InternalMoniLog4DSL.g:2017:2: (this_StringLayout_0= ruleStringLayout | this_ExternalLayout_1= ruleExternalLayout )
            {
            // InternalMoniLog4DSL.g:2017:2: (this_StringLayout_0= ruleStringLayout | this_ExternalLayout_1= ruleExternalLayout )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_ID) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoniLog4DSL.g:2018:3: this_StringLayout_0= ruleStringLayout
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getStringLayoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLayout_0=ruleStringLayout();

                    state._fsp--;


                    			current = this_StringLayout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2027:3: this_ExternalLayout_1= ruleExternalLayout
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getExternalLayoutParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalLayout_1=ruleExternalLayout();

                    state._fsp--;


                    			current = this_ExternalLayout_1;
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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleStringLayout"
    // InternalMoniLog4DSL.g:2039:1: entryRuleStringLayout returns [EObject current=null] : iv_ruleStringLayout= ruleStringLayout EOF ;
    public final EObject entryRuleStringLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLayout = null;


        try {
            // InternalMoniLog4DSL.g:2039:53: (iv_ruleStringLayout= ruleStringLayout EOF )
            // InternalMoniLog4DSL.g:2040:2: iv_ruleStringLayout= ruleStringLayout EOF
            {
             newCompositeNode(grammarAccess.getStringLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLayout=ruleStringLayout();

            state._fsp--;

             current =iv_ruleStringLayout; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLayout"


    // $ANTLR start "ruleStringLayout"
    // InternalMoniLog4DSL.g:2046:1: ruleStringLayout returns [EObject current=null] : ( ( (lv_formatString_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* ) ;
    public final EObject ruleStringLayout() throws RecognitionException {
        EObject current = null;

        Token lv_formatString_0_0=null;
        Token otherlv_1=null;
        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2052:2: ( ( ( (lv_formatString_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* ) )
            // InternalMoniLog4DSL.g:2053:2: ( ( (lv_formatString_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* )
            {
            // InternalMoniLog4DSL.g:2053:2: ( ( (lv_formatString_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* )
            // InternalMoniLog4DSL.g:2054:3: ( (lv_formatString_0_0= RULE_STRING ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )*
            {
            // InternalMoniLog4DSL.g:2054:3: ( (lv_formatString_0_0= RULE_STRING ) )
            // InternalMoniLog4DSL.g:2055:4: (lv_formatString_0_0= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:2055:4: (lv_formatString_0_0= RULE_STRING )
            // InternalMoniLog4DSL.g:2056:5: lv_formatString_0_0= RULE_STRING
            {
            lv_formatString_0_0=(Token)match(input,RULE_STRING,FOLLOW_38); 

            					newLeafNode(lv_formatString_0_0, grammarAccess.getStringLayoutAccess().getFormatStringSTRINGTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStringLayoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"formatString",
            						lv_formatString_0_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMoniLog4DSL.g:2072:3: (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==17) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2073:4: otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getStringLayoutAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMoniLog4DSL.g:2077:4: ( (lv_values_2_0= ruleLanguageExpression ) )
            	    // InternalMoniLog4DSL.g:2078:5: (lv_values_2_0= ruleLanguageExpression )
            	    {
            	    // InternalMoniLog4DSL.g:2078:5: (lv_values_2_0= ruleLanguageExpression )
            	    // InternalMoniLog4DSL.g:2079:6: lv_values_2_0= ruleLanguageExpression
            	    {

            	    						newCompositeNode(grammarAccess.getStringLayoutAccess().getValuesLanguageExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_values_2_0=ruleLanguageExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getStringLayoutRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
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
    // $ANTLR end "ruleStringLayout"


    // $ANTLR start "entryRuleExternalLayout"
    // InternalMoniLog4DSL.g:2101:1: entryRuleExternalLayout returns [EObject current=null] : iv_ruleExternalLayout= ruleExternalLayout EOF ;
    public final EObject entryRuleExternalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLayout = null;


        try {
            // InternalMoniLog4DSL.g:2101:55: (iv_ruleExternalLayout= ruleExternalLayout EOF )
            // InternalMoniLog4DSL.g:2102:2: iv_ruleExternalLayout= ruleExternalLayout EOF
            {
             newCompositeNode(grammarAccess.getExternalLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalLayout=ruleExternalLayout();

            state._fsp--;

             current =iv_ruleExternalLayout; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExternalLayout"


    // $ANTLR start "ruleExternalLayout"
    // InternalMoniLog4DSL.g:2108:1: ruleExternalLayout returns [EObject current=null] : ( ( (lv_path_0_0= ruleFQN ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* ) ;
    public final EObject ruleExternalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_path_0_0 = null;

        EObject lv_values_2_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2114:2: ( ( ( (lv_path_0_0= ruleFQN ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* ) )
            // InternalMoniLog4DSL.g:2115:2: ( ( (lv_path_0_0= ruleFQN ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* )
            {
            // InternalMoniLog4DSL.g:2115:2: ( ( (lv_path_0_0= ruleFQN ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )* )
            // InternalMoniLog4DSL.g:2116:3: ( (lv_path_0_0= ruleFQN ) ) (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )*
            {
            // InternalMoniLog4DSL.g:2116:3: ( (lv_path_0_0= ruleFQN ) )
            // InternalMoniLog4DSL.g:2117:4: (lv_path_0_0= ruleFQN )
            {
            // InternalMoniLog4DSL.g:2117:4: (lv_path_0_0= ruleFQN )
            // InternalMoniLog4DSL.g:2118:5: lv_path_0_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getExternalLayoutAccess().getPathFQNParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_38);
            lv_path_0_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalLayoutRule());
            					}
            					set(
            						current,
            						"path",
            						lv_path_0_0,
            						"org.gemoc.monilog.MoniLog4DSL.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:2135:3: (otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==17) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2136:4: otherlv_1= ',' ( (lv_values_2_0= ruleLanguageExpression ) )
            	    {
            	    otherlv_1=(Token)match(input,17,FOLLOW_15); 

            	    				newLeafNode(otherlv_1, grammarAccess.getExternalLayoutAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalMoniLog4DSL.g:2140:4: ( (lv_values_2_0= ruleLanguageExpression ) )
            	    // InternalMoniLog4DSL.g:2141:5: (lv_values_2_0= ruleLanguageExpression )
            	    {
            	    // InternalMoniLog4DSL.g:2141:5: (lv_values_2_0= ruleLanguageExpression )
            	    // InternalMoniLog4DSL.g:2142:6: lv_values_2_0= ruleLanguageExpression
            	    {

            	    						newCompositeNode(grammarAccess.getExternalLayoutAccess().getValuesLanguageExpressionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_38);
            	    lv_values_2_0=ruleLanguageExpression();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExternalLayoutRule());
            	    						}
            	    						add(
            	    							current,
            	    							"values",
            	    							lv_values_2_0,
            	    							"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
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
    // $ANTLR end "ruleExternalLayout"


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog4DSL.g:2164:1: entryRuleStreamEvent returns [EObject current=null] : iv_ruleStreamEvent= ruleStreamEvent EOF ;
    public final EObject entryRuleStreamEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamEvent = null;


        try {
            // InternalMoniLog4DSL.g:2164:52: (iv_ruleStreamEvent= ruleStreamEvent EOF )
            // InternalMoniLog4DSL.g:2165:2: iv_ruleStreamEvent= ruleStreamEvent EOF
            {
             newCompositeNode(grammarAccess.getStreamEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStreamEvent=ruleStreamEvent();

            state._fsp--;

             current =iv_ruleStreamEvent; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStreamEvent"


    // $ANTLR start "ruleStreamEvent"
    // InternalMoniLog4DSL.g:2171:1: ruleStreamEvent returns [EObject current=null] : ( ( ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? ) ;
    public final EObject ruleStreamEvent() throws RecognitionException {
        EObject current = null;

        Token lv_eventId_0_1=null;
        Token lv_eventId_0_2=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2177:2: ( ( ( ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? ) )
            // InternalMoniLog4DSL.g:2178:2: ( ( ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? )
            {
            // InternalMoniLog4DSL.g:2178:2: ( ( ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? )
            // InternalMoniLog4DSL.g:2179:3: ( ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )?
            {
            // InternalMoniLog4DSL.g:2179:3: ( ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) ) )
            // InternalMoniLog4DSL.g:2180:4: ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) )
            {
            // InternalMoniLog4DSL.g:2180:4: ( (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING ) )
            // InternalMoniLog4DSL.g:2181:5: (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:2181:5: (lv_eventId_0_1= RULE_ID | lv_eventId_0_2= RULE_STRING )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_ID) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_STRING) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalMoniLog4DSL.g:2182:6: lv_eventId_0_1= RULE_ID
                    {
                    lv_eventId_0_1=(Token)match(input,RULE_ID,FOLLOW_39); 

                    						newLeafNode(lv_eventId_0_1, grammarAccess.getStreamEventAccess().getEventIdIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventId",
                    							lv_eventId_0_1,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2197:6: lv_eventId_0_2= RULE_STRING
                    {
                    lv_eventId_0_2=(Token)match(input,RULE_STRING,FOLLOW_39); 

                    						newLeafNode(lv_eventId_0_2, grammarAccess.getStreamEventAccess().getEventIdSTRINGTerminalRuleCall_0_0_1());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getStreamEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventId",
                    							lv_eventId_0_2,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }
                    break;

            }


            }


            }

            // InternalMoniLog4DSL.g:2214:3: (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==13) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoniLog4DSL.g:2215:4: otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,13,FOLLOW_40); 

                    				newLeafNode(otherlv_1, grammarAccess.getStreamEventAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMoniLog4DSL.g:2219:4: ( (lv_values_2_0= ruleEmptyOrPropertyValue ) )
                    // InternalMoniLog4DSL.g:2220:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    {
                    // InternalMoniLog4DSL.g:2220:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    // InternalMoniLog4DSL.g:2221:6: lv_values_2_0= ruleEmptyOrPropertyValue
                    {

                    						newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    lv_values_2_0=ruleEmptyOrPropertyValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStreamEventRule());
                    						}
                    						add(
                    							current,
                    							"values",
                    							lv_values_2_0,
                    							"org.gemoc.monilog.MoniLog4DSL.EmptyOrPropertyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:2238:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )*
                    loop33:
                    do {
                        int alt33=2;
                        int LA33_0 = input.LA(1);

                        if ( (LA33_0==17) ) {
                            alt33=1;
                        }


                        switch (alt33) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2239:5: otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,17,FOLLOW_40); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2243:5: ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    // InternalMoniLog4DSL.g:2244:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    {
                    	    // InternalMoniLog4DSL.g:2244:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    // InternalMoniLog4DSL.g:2245:7: lv_values_4_0= ruleEmptyOrPropertyValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
                    	    lv_values_4_0=ruleEmptyOrPropertyValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStreamEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"values",
                    	    								lv_values_4_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.EmptyOrPropertyValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop33;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,14,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStreamEventAccess().getRightSquareBracketKeyword_1_3());
                    			

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
    // $ANTLR end "ruleStreamEvent"


    // $ANTLR start "entryRuleEmptyOrPropertyValue"
    // InternalMoniLog4DSL.g:2272:1: entryRuleEmptyOrPropertyValue returns [EObject current=null] : iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF ;
    public final EObject entryRuleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyOrPropertyValue = null;


        try {
            // InternalMoniLog4DSL.g:2272:61: (iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog4DSL.g:2273:2: iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF
            {
             newCompositeNode(grammarAccess.getEmptyOrPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmptyOrPropertyValue=ruleEmptyOrPropertyValue();

            state._fsp--;

             current =iv_ruleEmptyOrPropertyValue; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleEmptyOrPropertyValue"


    // $ANTLR start "ruleEmptyOrPropertyValue"
    // InternalMoniLog4DSL.g:2279:1: ruleEmptyOrPropertyValue returns [EObject current=null] : ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )? ) ) ;
    public final EObject ruleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2285:2: ( ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )? ) ) )
            // InternalMoniLog4DSL.g:2286:2: ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )? ) )
            {
            // InternalMoniLog4DSL.g:2286:2: ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==EOF||LA36_0==14||LA36_0==17) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ID) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoniLog4DSL.g:2287:3: ()
                    {
                    // InternalMoniLog4DSL.g:2287:3: ()
                    // InternalMoniLog4DSL.g:2288:4: 
                    {

                    				current = forceCreateModelElement(
                    					grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0(),
                    					current);
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2295:3: ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )? )
                    {
                    // InternalMoniLog4DSL.g:2295:3: ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )? )
                    // InternalMoniLog4DSL.g:2296:4: () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )?
                    {
                    // InternalMoniLog4DSL.g:2296:4: ()
                    // InternalMoniLog4DSL.g:2297:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2303:4: ( (lv_id_2_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:2304:5: (lv_id_2_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:2304:5: (lv_id_2_0= RULE_ID )
                    // InternalMoniLog4DSL.g:2305:6: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_41); 

                    						newLeafNode(lv_id_2_0, grammarAccess.getEmptyOrPropertyValueAccess().getIdIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEmptyOrPropertyValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:2321:4: (otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) ) )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==44) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2322:5: otherlv_3= '=' ( (lv_value_4_0= ruleLanguageExpression ) )
                            {
                            otherlv_3=(Token)match(input,44,FOLLOW_15); 

                            					newLeafNode(otherlv_3, grammarAccess.getEmptyOrPropertyValueAccess().getEqualsSignKeyword_1_2_0());
                            				
                            // InternalMoniLog4DSL.g:2326:5: ( (lv_value_4_0= ruleLanguageExpression ) )
                            // InternalMoniLog4DSL.g:2327:6: (lv_value_4_0= ruleLanguageExpression )
                            {
                            // InternalMoniLog4DSL.g:2327:6: (lv_value_4_0= ruleLanguageExpression )
                            // InternalMoniLog4DSL.g:2328:7: lv_value_4_0= ruleLanguageExpression
                            {

                            							newCompositeNode(grammarAccess.getEmptyOrPropertyValueAccess().getValueLanguageExpressionParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_4_0=ruleLanguageExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEmptyOrPropertyValueRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_4_0,
                            								"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


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
    // $ANTLR end "ruleEmptyOrPropertyValue"


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog4DSL.g:2351:1: entryRuleLanguageExpression returns [EObject current=null] : iv_ruleLanguageExpression= ruleLanguageExpression EOF ;
    public final EObject entryRuleLanguageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageExpression = null;


        try {
            // InternalMoniLog4DSL.g:2351:59: (iv_ruleLanguageExpression= ruleLanguageExpression EOF )
            // InternalMoniLog4DSL.g:2352:2: iv_ruleLanguageExpression= ruleLanguageExpression EOF
            {
             newCompositeNode(grammarAccess.getLanguageExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLanguageExpression=ruleLanguageExpression();

            state._fsp--;

             current =iv_ruleLanguageExpression; 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLanguageExpression"


    // $ANTLR start "ruleLanguageExpression"
    // InternalMoniLog4DSL.g:2358:1: ruleLanguageExpression returns [EObject current=null] : ( ( () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLanguageExpression() throws RecognitionException {
        EObject current = null;

        Token lv_languageId_1_1=null;
        Token lv_languageId_1_2=null;
        Token otherlv_2=null;
        Token lv_expression_3_0=null;
        Token otherlv_4=null;
        Token lv_expression_6_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2364:2: ( ( ( () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) ) )
            // InternalMoniLog4DSL.g:2365:2: ( ( () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) )
            {
            // InternalMoniLog4DSL.g:2365:2: ( ( () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_STRING) ) {
                int LA38_2 = input.LA(2);

                if ( (LA38_2==27) ) {
                    alt38=1;
                }
                else if ( (LA38_2==EOF||LA38_2==14||(LA38_2>=17 && LA38_2<=18)||LA38_2==28) ) {
                    alt38=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoniLog4DSL.g:2366:3: ( () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    {
                    // InternalMoniLog4DSL.g:2366:3: ( () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    // InternalMoniLog4DSL.g:2367:4: () ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    // InternalMoniLog4DSL.g:2367:4: ()
                    // InternalMoniLog4DSL.g:2368:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLanguageExpressionAccess().getExplicitLanguageExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2374:4: ( ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) ) )
                    // InternalMoniLog4DSL.g:2375:5: ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) )
                    {
                    // InternalMoniLog4DSL.g:2375:5: ( (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING ) )
                    // InternalMoniLog4DSL.g:2376:6: (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:2376:6: (lv_languageId_1_1= RULE_ID | lv_languageId_1_2= RULE_STRING )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==RULE_STRING) ) {
                        alt37=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2377:7: lv_languageId_1_1= RULE_ID
                            {
                            lv_languageId_1_1=(Token)match(input,RULE_ID,FOLLOW_22); 

                            							newLeafNode(lv_languageId_1_1, grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLanguageExpressionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"languageId",
                            								lv_languageId_1_1,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }
                            break;
                        case 2 :
                            // InternalMoniLog4DSL.g:2392:7: lv_languageId_1_2= RULE_STRING
                            {
                            lv_languageId_1_2=(Token)match(input,RULE_STRING,FOLLOW_22); 

                            							newLeafNode(lv_languageId_1_2, grammarAccess.getLanguageExpressionAccess().getLanguageIdSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLanguageExpressionRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"languageId",
                            								lv_languageId_1_2,
                            								"org.eclipse.xtext.common.Terminals.STRING");
                            						

                            }
                            break;

                    }


                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_36); 

                    				newLeafNode(otherlv_2, grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMoniLog4DSL.g:2413:4: ( (lv_expression_3_0= RULE_STRING ) )
                    // InternalMoniLog4DSL.g:2414:5: (lv_expression_3_0= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:2414:5: (lv_expression_3_0= RULE_STRING )
                    // InternalMoniLog4DSL.g:2415:6: lv_expression_3_0= RULE_STRING
                    {
                    lv_expression_3_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

                    						newLeafNode(lv_expression_3_0, grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_0_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLanguageExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,28,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2437:3: ( () ( (lv_expression_6_0= RULE_STRING ) ) )
                    {
                    // InternalMoniLog4DSL.g:2437:3: ( () ( (lv_expression_6_0= RULE_STRING ) ) )
                    // InternalMoniLog4DSL.g:2438:4: () ( (lv_expression_6_0= RULE_STRING ) )
                    {
                    // InternalMoniLog4DSL.g:2438:4: ()
                    // InternalMoniLog4DSL.g:2439:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLanguageExpressionAccess().getDefaultLanguageExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2445:4: ( (lv_expression_6_0= RULE_STRING ) )
                    // InternalMoniLog4DSL.g:2446:5: (lv_expression_6_0= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:2446:5: (lv_expression_6_0= RULE_STRING )
                    // InternalMoniLog4DSL.g:2447:6: lv_expression_6_0= RULE_STRING
                    {
                    lv_expression_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_expression_6_0, grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLanguageExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"expression",
                    							lv_expression_6_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


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
    // $ANTLR end "ruleLanguageExpression"


    // $ANTLR start "entryRuleFQN"
    // InternalMoniLog4DSL.g:2468:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalMoniLog4DSL.g:2468:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalMoniLog4DSL.g:2469:2: iv_ruleFQN= ruleFQN EOF
            {
             newCompositeNode(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFQN=ruleFQN();

            state._fsp--;

             current =iv_ruleFQN.getText(); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMoniLog4DSL.g:2475:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2481:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMoniLog4DSL.g:2482:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMoniLog4DSL.g:2482:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMoniLog4DSL.g:2483:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_42); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoniLog4DSL.g:2490:3: (kw= '.' this_ID_2= RULE_ID )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==45) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2491:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,45,FOLLOW_43); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_42); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleLogLevel"
    // InternalMoniLog4DSL.g:2508:1: ruleLogLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'CONFIG' ) | (enumLiteral_1= 'FINE' ) | (enumLiteral_2= 'FINER' ) | (enumLiteral_3= 'FINEST' ) | (enumLiteral_4= 'INFO' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) ;
    public final Enumerator ruleLogLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2514:2: ( ( (enumLiteral_0= 'CONFIG' ) | (enumLiteral_1= 'FINE' ) | (enumLiteral_2= 'FINER' ) | (enumLiteral_3= 'FINEST' ) | (enumLiteral_4= 'INFO' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) )
            // InternalMoniLog4DSL.g:2515:2: ( (enumLiteral_0= 'CONFIG' ) | (enumLiteral_1= 'FINE' ) | (enumLiteral_2= 'FINER' ) | (enumLiteral_3= 'FINEST' ) | (enumLiteral_4= 'INFO' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            {
            // InternalMoniLog4DSL.g:2515:2: ( (enumLiteral_0= 'CONFIG' ) | (enumLiteral_1= 'FINE' ) | (enumLiteral_2= 'FINER' ) | (enumLiteral_3= 'FINEST' ) | (enumLiteral_4= 'INFO' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            int alt40=7;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt40=1;
                }
                break;
            case 47:
                {
                alt40=2;
                }
                break;
            case 48:
                {
                alt40=3;
                }
                break;
            case 49:
                {
                alt40=4;
                }
                break;
            case 50:
                {
                alt40=5;
                }
                break;
            case 51:
                {
                alt40=6;
                }
                break;
            case 52:
                {
                alt40=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // InternalMoniLog4DSL.g:2516:3: (enumLiteral_0= 'CONFIG' )
                    {
                    // InternalMoniLog4DSL.g:2516:3: (enumLiteral_0= 'CONFIG' )
                    // InternalMoniLog4DSL.g:2517:4: enumLiteral_0= 'CONFIG'
                    {
                    enumLiteral_0=(Token)match(input,46,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2524:3: (enumLiteral_1= 'FINE' )
                    {
                    // InternalMoniLog4DSL.g:2524:3: (enumLiteral_1= 'FINE' )
                    // InternalMoniLog4DSL.g:2525:4: enumLiteral_1= 'FINE'
                    {
                    enumLiteral_1=(Token)match(input,47,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:2532:3: (enumLiteral_2= 'FINER' )
                    {
                    // InternalMoniLog4DSL.g:2532:3: (enumLiteral_2= 'FINER' )
                    // InternalMoniLog4DSL.g:2533:4: enumLiteral_2= 'FINER'
                    {
                    enumLiteral_2=(Token)match(input,48,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:2540:3: (enumLiteral_3= 'FINEST' )
                    {
                    // InternalMoniLog4DSL.g:2540:3: (enumLiteral_3= 'FINEST' )
                    // InternalMoniLog4DSL.g:2541:4: enumLiteral_3= 'FINEST'
                    {
                    enumLiteral_3=(Token)match(input,49,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:2548:3: (enumLiteral_4= 'INFO' )
                    {
                    // InternalMoniLog4DSL.g:2548:3: (enumLiteral_4= 'INFO' )
                    // InternalMoniLog4DSL.g:2549:4: enumLiteral_4= 'INFO'
                    {
                    enumLiteral_4=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog4DSL.g:2556:3: (enumLiteral_5= 'SEVERE' )
                    {
                    // InternalMoniLog4DSL.g:2556:3: (enumLiteral_5= 'SEVERE' )
                    // InternalMoniLog4DSL.g:2557:4: enumLiteral_5= 'SEVERE'
                    {
                    enumLiteral_5=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog4DSL.g:2564:3: (enumLiteral_6= 'WARNING' )
                    {
                    // InternalMoniLog4DSL.g:2564:3: (enumLiteral_6= 'WARNING' )
                    // InternalMoniLog4DSL.g:2565:4: enumLiteral_6= 'WARNING'
                    {
                    enumLiteral_6=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_6, grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6());
                    			

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
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "ruleTemporalPropertyConditionKind"
    // InternalMoniLog4DSL.g:2575:1: ruleTemporalPropertyConditionKind returns [Enumerator current=null] : ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) ;
    public final Enumerator ruleTemporalPropertyConditionKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2581:2: ( ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) )
            // InternalMoniLog4DSL.g:2582:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            {
            // InternalMoniLog4DSL.g:2582:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt41=1;
                }
                break;
            case 54:
                {
                alt41=2;
                }
                break;
            case 55:
                {
                alt41=3;
                }
                break;
            case 56:
                {
                alt41=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMoniLog4DSL.g:2583:3: (enumLiteral_0= 'S' )
                    {
                    // InternalMoniLog4DSL.g:2583:3: (enumLiteral_0= 'S' )
                    // InternalMoniLog4DSL.g:2584:4: enumLiteral_0= 'S'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPropertyConditionKindAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalPropertyConditionKindAccess().getSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2591:3: (enumLiteral_1= 'V' )
                    {
                    // InternalMoniLog4DSL.g:2591:3: (enumLiteral_1= 'V' )
                    // InternalMoniLog4DSL.g:2592:4: enumLiteral_1= 'V'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPropertyConditionKindAccess().getVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalPropertyConditionKindAccess().getVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:2599:3: (enumLiteral_2= 'nS' )
                    {
                    // InternalMoniLog4DSL.g:2599:3: (enumLiteral_2= 'nS' )
                    // InternalMoniLog4DSL.g:2600:4: enumLiteral_2= 'nS'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPropertyConditionKindAccess().getNSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalPropertyConditionKindAccess().getNSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:2607:3: (enumLiteral_3= 'nV' )
                    {
                    // InternalMoniLog4DSL.g:2607:3: (enumLiteral_3= 'nV' )
                    // InternalMoniLog4DSL.g:2608:4: enumLiteral_3= 'nV'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPropertyConditionKindAccess().getNVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTemporalPropertyConditionKindAccess().getNVEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTemporalPropertyConditionKind"

    // Delegated rules


    protected DFA20 dfa20 = new DFA20(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\3\uffff\2\15\1\4\2\uffff\1\4\1\40\2\16\2\4\1\33\1\16\1\33\1\16\2\5\2\34\2\16";
    static final String dfa_3s = "\1\37\3\uffff\2\41\1\21\2\uffff\1\21\1\41\2\54\2\5\4\33\2\5\2\34\2\21";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\3\uffff\1\5\1\4\20\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\5\27\uffff\1\1\1\2\1\3",
            "",
            "",
            "",
            "\1\6\22\uffff\1\10\1\7",
            "\1\6\22\uffff\1\10\1\7",
            "\1\13\11\uffff\1\12\2\uffff\1\11",
            "",
            "",
            "\1\14\11\uffff\1\12\2\uffff\1\11",
            "\1\10\1\7",
            "\1\12\2\uffff\1\11\32\uffff\1\15",
            "\1\12\2\uffff\1\11\32\uffff\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23",
            "\1\12\2\uffff\1\11\11\uffff\1\23",
            "\1\24",
            "\1\12\2\uffff\1\11\11\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\12\2\uffff\1\11",
            "\1\12\2\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1033:2: ( ( () otherlv_1= 'always' ( (lv_event_2_0= ruleStreamEvent ) ) ) | ( () otherlv_4= 'exists' ( (lv_bound_5_0= ruleBoundType ) ) ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )";
        }
    }
    static final String dfa_7s = "\32\uffff";
    static final String dfa_8s = "\1\1\4\uffff\2\10\4\uffff\1\10\16\uffff";
    static final String dfa_9s = "\1\21\1\uffff\1\4\2\uffff\2\15\1\4\2\uffff\1\4\1\21\2\16\2\4\1\33\1\16\1\33\1\16\2\5\2\34\2\16";
    static final String dfa_10s = "\1\45\1\uffff\1\5\2\uffff\2\47\1\21\2\uffff\1\21\1\47\2\54\2\5\4\33\2\5\2\34\2\21";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\1\5\20\uffff";
    static final String dfa_12s = "\32\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\3\uffff\1\3\2\uffff\1\2\3\uffff\1\1\7\uffff\1\1\1\4",
            "",
            "\1\5\1\6",
            "",
            "",
            "\1\7\3\uffff\1\10\12\uffff\1\10\12\uffff\1\11",
            "\1\7\3\uffff\1\10\12\uffff\1\10\12\uffff\1\11",
            "\1\14\11\uffff\1\13\2\uffff\1\12",
            "",
            "",
            "\1\15\11\uffff\1\13\2\uffff\1\12",
            "\1\10\12\uffff\1\10\12\uffff\1\11",
            "\1\13\2\uffff\1\12\32\uffff\1\16",
            "\1\13\2\uffff\1\12\32\uffff\1\17",
            "\1\20\1\21",
            "\1\22\1\23",
            "\1\24",
            "\1\13\2\uffff\1\12\11\uffff\1\24",
            "\1\25",
            "\1\13\2\uffff\1\12\11\uffff\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\13\2\uffff\1\12",
            "\1\13\2\uffff\1\12"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1435:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000A020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x001FC00000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000190000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000001200030L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000C00002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002800002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x00000000E0000030L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010020000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x01E0000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000003001200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000C00000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x00000C0004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000010002000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000024000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000024010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000010L});

}
