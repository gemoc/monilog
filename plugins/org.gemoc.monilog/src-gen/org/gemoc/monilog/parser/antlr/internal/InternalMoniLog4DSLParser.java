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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'appender'", "'('", "')'", "'{'", "';'", "'}'", "'layout'", "','", "'...'", "'monilogger'", "'['", "']'", "'event'", "'conditions'", "'actions'", "'call'", "'complex'", "'custom'", "'before'", "'after'", "'exists'", "'always'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'.'", "'emit'", "'set'", "'start'", "'stop'", "'='", "'.*'", "'@Inactive'", "'@Async'", "'INFO'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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
        	return "Document";
       	}

       	@Override
       	protected MoniLog4DSLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalMoniLog4DSL.g:65:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalMoniLog4DSL.g:65:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalMoniLog4DSL.g:66:2: iv_ruleDocument= ruleDocument EOF
            {
             newCompositeNode(grammarAccess.getDocumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;

             current =iv_ruleDocument; 
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
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalMoniLog4DSL.g:72:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_events_4_0 = null;

        EObject lv_appenders_5_0 = null;

        EObject lv_layouts_6_0 = null;

        EObject lv_moniloggers_7_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) )
            // InternalMoniLog4DSL.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            {
            // InternalMoniLog4DSL.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            // InternalMoniLog4DSL.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getPackageKeyword_0());
            		
            // InternalMoniLog4DSL.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMoniLog4DSL.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMoniLog4DSL.g:86:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getDocumentAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDocumentRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:103:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:104:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalMoniLog4DSL.g:104:4: (lv_imports_2_0= ruleImport )
            	    // InternalMoniLog4DSL.g:105:5: lv_imports_2_0= ruleImport
            	    {

            	    					newCompositeNode(grammarAccess.getDocumentAccess().getImportsImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.gemoc.monilog.MoniLog4DSL.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMoniLog4DSL.g:122:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            // InternalMoniLog4DSL.g:123:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            {
            // InternalMoniLog4DSL.g:123:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            // InternalMoniLog4DSL.g:124:5: ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            				
            // InternalMoniLog4DSL.g:127:5: ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* )
            // InternalMoniLog4DSL.g:128:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*
            {
            // InternalMoniLog4DSL.g:128:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*
            loop6:
            do {
                int alt6=5;
                int LA6_0 = input.LA(1);

                if ( LA6_0 >= 28 && LA6_0 <= 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                    alt6=1;
                }
                else if ( ( LA6_0 == 13 || LA6_0 == 52 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                    alt6=2;
                }
                else if ( LA6_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                    alt6=3;
                }
                else if ( ( LA6_0 == 22 || LA6_0 == 51 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                    alt6=4;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:129:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:129:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:130:5: {...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoniLog4DSL.g:130:105: ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
            	    // InternalMoniLog4DSL.g:131:6: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoniLog4DSL.g:134:9: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        switch ( input.LA(1) ) {
            	        case 28:
            	            {
            	            int LA2_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 29:
            	            {
            	            int LA2_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 30:
            	            {
            	            int LA2_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:134:10: {...}? => ( (lv_events_4_0= ruleEvent ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:134:19: ( (lv_events_4_0= ruleEvent ) )
            	    	    // InternalMoniLog4DSL.g:134:20: (lv_events_4_0= ruleEvent )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:134:20: (lv_events_4_0= ruleEvent )
            	    	    // InternalMoniLog4DSL.g:135:10: lv_events_4_0= ruleEvent
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_3_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_events_4_0=ruleEvent();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"events",
            	    	    											lv_events_4_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.Event");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	                EarlyExitException eee =
            	                    new EarlyExitException(2, input);
            	                throw eee;
            	        }
            	        cnt2++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog4DSL.g:157:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:157:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:158:5: {...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoniLog4DSL.g:158:105: ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
            	    // InternalMoniLog4DSL.g:159:6: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoniLog4DSL.g:162:9: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==52) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( (LA3_0==13) ) {
            	            int LA3_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:162:10: {...}? => ( (lv_appenders_5_0= ruleAppender ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:162:19: ( (lv_appenders_5_0= ruleAppender ) )
            	    	    // InternalMoniLog4DSL.g:162:20: (lv_appenders_5_0= ruleAppender )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:162:20: (lv_appenders_5_0= ruleAppender )
            	    	    // InternalMoniLog4DSL.g:163:10: lv_appenders_5_0= ruleAppender
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_3_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_appenders_5_0=ruleAppender();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"appenders",
            	    	    											lv_appenders_5_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.Appender");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoniLog4DSL.g:185:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:185:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:186:5: {...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoniLog4DSL.g:186:105: ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
            	    // InternalMoniLog4DSL.g:187:6: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoniLog4DSL.g:190:9: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==19) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:190:10: {...}? => ( (lv_layouts_6_0= ruleLayout ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:190:19: ( (lv_layouts_6_0= ruleLayout ) )
            	    	    // InternalMoniLog4DSL.g:190:20: (lv_layouts_6_0= ruleLayout )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:190:20: (lv_layouts_6_0= ruleLayout )
            	    	    // InternalMoniLog4DSL.g:191:10: lv_layouts_6_0= ruleLayout
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_3_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_layouts_6_0=ruleLayout();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"layouts",
            	    	    											lv_layouts_6_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.Layout");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	                EarlyExitException eee =
            	                    new EarlyExitException(4, input);
            	                throw eee;
            	        }
            	        cnt4++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoniLog4DSL.g:213:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:213:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:214:5: {...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoniLog4DSL.g:214:105: ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
            	    // InternalMoniLog4DSL.g:215:6: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMoniLog4DSL.g:218:9: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==51) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==22) ) {
            	            int LA5_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:218:10: {...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:218:19: ( (lv_moniloggers_7_0= ruleMoniLogger ) )
            	    	    // InternalMoniLog4DSL.g:218:20: (lv_moniloggers_7_0= ruleMoniLogger )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:218:20: (lv_moniloggers_7_0= ruleMoniLogger )
            	    	    // InternalMoniLog4DSL.g:219:10: lv_moniloggers_7_0= ruleMoniLogger
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getMoniloggersMoniLoggerParserRuleCall_3_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_moniloggers_7_0=ruleMoniLogger();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"moniloggers",
            	    	    											lv_moniloggers_7_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.MoniLogger");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	                EarlyExitException eee =
            	                    new EarlyExitException(5, input);
            	                throw eee;
            	        }
            	        cnt5++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            				

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
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleImport"
    // InternalMoniLog4DSL.g:252:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMoniLog4DSL.g:252:47: (iv_ruleImport= ruleImport EOF )
            // InternalMoniLog4DSL.g:253:2: iv_ruleImport= ruleImport EOF
            {
             newCompositeNode(grammarAccess.getImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;

             current =iv_ruleImport; 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMoniLog4DSL.g:259:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:265:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMoniLog4DSL.g:266:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMoniLog4DSL.g:266:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMoniLog4DSL.g:267:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMoniLog4DSL.g:271:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMoniLog4DSL.g:272:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMoniLog4DSL.g:272:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMoniLog4DSL.g:273:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog4DSL.g:294:1: entryRuleAppender returns [EObject current=null] : iv_ruleAppender= ruleAppender EOF ;
    public final EObject entryRuleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppender = null;


        try {
            // InternalMoniLog4DSL.g:294:49: (iv_ruleAppender= ruleAppender EOF )
            // InternalMoniLog4DSL.g:295:2: iv_ruleAppender= ruleAppender EOF
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
    // InternalMoniLog4DSL.g:301:1: ruleAppender returns [EObject current=null] : (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) ;
    public final EObject ruleAppender() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAppender_0 = null;

        EObject this_ExternalAppender_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:307:2: ( (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) )
            // InternalMoniLog4DSL.g:308:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            {
            // InternalMoniLog4DSL.g:308:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMoniLog4DSL.g:309:3: this_LocalAppender_0= ruleLocalAppender
                    {

                    			newCompositeNode(grammarAccess.getAppenderAccess().getLocalAppenderParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalAppender_0=ruleLocalAppender();

                    state._fsp--;


                    			current = this_LocalAppender_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:318:3: this_ExternalAppender_1= ruleExternalAppender
                    {

                    			newCompositeNode(grammarAccess.getAppenderAccess().getExternalAppenderParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ExternalAppender_1=ruleExternalAppender();

                    state._fsp--;


                    			current = this_ExternalAppender_1;
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


    // $ANTLR start "entryRuleLocalAppender"
    // InternalMoniLog4DSL.g:330:1: entryRuleLocalAppender returns [EObject current=null] : iv_ruleLocalAppender= ruleLocalAppender EOF ;
    public final EObject entryRuleLocalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAppender = null;


        try {
            // InternalMoniLog4DSL.g:330:54: (iv_ruleLocalAppender= ruleLocalAppender EOF )
            // InternalMoniLog4DSL.g:331:2: iv_ruleLocalAppender= ruleLocalAppender EOF
            {
             newCompositeNode(grammarAccess.getLocalAppenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalAppender=ruleLocalAppender();

            state._fsp--;

             current =iv_ruleLocalAppender; 
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
    // $ANTLR end "entryRuleLocalAppender"


    // $ANTLR start "ruleLocalAppender"
    // InternalMoniLog4DSL.g:337:1: ruleLocalAppender returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* otherlv_10= '}' ) ;
    public final EObject ruleLocalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Enumerator lv_annotations_0_0 = null;

        EObject lv_parameterDecl_4_0 = null;

        EObject lv_calls_7_0 = null;

        EObject lv_calls_9_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:343:2: ( ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* otherlv_10= '}' ) )
            // InternalMoniLog4DSL.g:344:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* otherlv_10= '}' )
            {
            // InternalMoniLog4DSL.g:344:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* otherlv_10= '}' )
            // InternalMoniLog4DSL.g:345:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* otherlv_10= '}'
            {
            // InternalMoniLog4DSL.g:345:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==52) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:346:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    {
            	    // InternalMoniLog4DSL.g:346:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    // InternalMoniLog4DSL.g:347:5: lv_annotations_0_0= ruleAppenderAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getLocalAppenderAccess().getAnnotationsAppenderAnnotationEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_0_0=ruleAppenderAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"org.gemoc.monilog.MoniLog4DSL.AppenderAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_1=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAppenderAccess().getAppenderKeyword_1());
            		
            // InternalMoniLog4DSL.g:368:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:369:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:369:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog4DSL.g:370:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getLocalAppenderAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalAppenderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:386:3: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoniLog4DSL.g:387:4: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:391:4: ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog4DSL.g:392:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog4DSL.g:392:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog4DSL.g:393:6: lv_parameterDecl_4_0= ruleParameterDeclVarArgs
                    {

                    						newCompositeNode(grammarAccess.getLocalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameterDecl_4_0=ruleParameterDeclVarArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
                    						}
                    						set(
                    							current,
                    							"parameterDecl",
                    							lv_parameterDecl_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.ParameterDeclVarArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_5, grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_6, grammarAccess.getLocalAppenderAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoniLog4DSL.g:419:3: ( (lv_calls_7_0= ruleAppenderCall ) )
            // InternalMoniLog4DSL.g:420:4: (lv_calls_7_0= ruleAppenderCall )
            {
            // InternalMoniLog4DSL.g:420:4: (lv_calls_7_0= ruleAppenderCall )
            // InternalMoniLog4DSL.g:421:5: lv_calls_7_0= ruleAppenderCall
            {

            					newCompositeNode(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_11);
            lv_calls_7_0=ruleAppenderCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
            					}
            					add(
            						current,
            						"calls",
            						lv_calls_7_0,
            						"org.gemoc.monilog.MoniLog4DSL.AppenderCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:438:3: (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:439:4: otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0());
            	    			
            	    // InternalMoniLog4DSL.g:443:4: ( (lv_calls_9_0= ruleAppenderCall ) )
            	    // InternalMoniLog4DSL.g:444:5: (lv_calls_9_0= ruleAppenderCall )
            	    {
            	    // InternalMoniLog4DSL.g:444:5: (lv_calls_9_0= ruleAppenderCall )
            	    // InternalMoniLog4DSL.g:445:6: lv_calls_9_0= ruleAppenderCall
            	    {

            	    						newCompositeNode(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_calls_9_0=ruleAppenderCall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"calls",
            	    							lv_calls_9_0,
            	    							"org.gemoc.monilog.MoniLog4DSL.AppenderCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            otherlv_10=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleLocalAppender"


    // $ANTLR start "entryRuleExternalAppender"
    // InternalMoniLog4DSL.g:471:1: entryRuleExternalAppender returns [EObject current=null] : iv_ruleExternalAppender= ruleExternalAppender EOF ;
    public final EObject entryRuleExternalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAppender = null;


        try {
            // InternalMoniLog4DSL.g:471:57: (iv_ruleExternalAppender= ruleExternalAppender EOF )
            // InternalMoniLog4DSL.g:472:2: iv_ruleExternalAppender= ruleExternalAppender EOF
            {
             newCompositeNode(grammarAccess.getExternalAppenderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExternalAppender=ruleExternalAppender();

            state._fsp--;

             current =iv_ruleExternalAppender; 
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
    // $ANTLR end "entryRuleExternalAppender"


    // $ANTLR start "ruleExternalAppender"
    // InternalMoniLog4DSL.g:478:1: ruleExternalAppender returns [EObject current=null] : (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleExternalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDecl_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:484:2: ( (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) )
            // InternalMoniLog4DSL.g:485:2: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            {
            // InternalMoniLog4DSL.g:485:2: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            // InternalMoniLog4DSL.g:486:3: otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0());
            		
            // InternalMoniLog4DSL.g:490:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:491:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:491:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:492:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalAppenderAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalAppenderRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:508:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==14) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMoniLog4DSL.g:509:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:513:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog4DSL.g:514:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog4DSL.g:514:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog4DSL.g:515:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
                    {

                    						newCompositeNode(grammarAccess.getExternalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameterDecl_3_0=ruleParameterDeclVarArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalAppenderRule());
                    						}
                    						set(
                    							current,
                    							"parameterDecl",
                    							lv_parameterDecl_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.ParameterDeclVarArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleExternalAppender"


    // $ANTLR start "entryRuleLayout"
    // InternalMoniLog4DSL.g:541:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMoniLog4DSL.g:541:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMoniLog4DSL.g:542:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalMoniLog4DSL.g:548:1: ruleLayout returns [EObject current=null] : (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LocalLayout_0 = null;

        EObject this_ExternalLayout_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:554:2: ( (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) )
            // InternalMoniLog4DSL.g:555:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            {
            // InternalMoniLog4DSL.g:555:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            int alt12=2;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // InternalMoniLog4DSL.g:556:3: this_LocalLayout_0= ruleLocalLayout
                    {

                    			newCompositeNode(grammarAccess.getLayoutAccess().getLocalLayoutParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LocalLayout_0=ruleLocalLayout();

                    state._fsp--;


                    			current = this_LocalLayout_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:565:3: this_ExternalLayout_1= ruleExternalLayout
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


    // $ANTLR start "entryRuleLocalLayout"
    // InternalMoniLog4DSL.g:577:1: entryRuleLocalLayout returns [EObject current=null] : iv_ruleLocalLayout= ruleLocalLayout EOF ;
    public final EObject entryRuleLocalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalLayout = null;


        try {
            // InternalMoniLog4DSL.g:577:52: (iv_ruleLocalLayout= ruleLocalLayout EOF )
            // InternalMoniLog4DSL.g:578:2: iv_ruleLocalLayout= ruleLocalLayout EOF
            {
             newCompositeNode(grammarAccess.getLocalLayoutRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLocalLayout=ruleLocalLayout();

            state._fsp--;

             current =iv_ruleLocalLayout; 
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
    // $ANTLR end "entryRuleLocalLayout"


    // $ANTLR start "ruleLocalLayout"
    // InternalMoniLog4DSL.g:584:1: ruleLocalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' ) ;
    public final EObject ruleLocalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_parameterDecl_3_0 = null;

        EObject lv_call_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:590:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' ) )
            // InternalMoniLog4DSL.g:591:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' )
            {
            // InternalMoniLog4DSL.g:591:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' )
            // InternalMoniLog4DSL.g:592:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMoniLog4DSL.g:596:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:597:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:597:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:598:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLocalLayoutAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLocalLayoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:614:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==14) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoniLog4DSL.g:615:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:619:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog4DSL.g:620:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog4DSL.g:620:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog4DSL.g:621:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
                    {

                    						newCompositeNode(grammarAccess.getLocalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameterDecl_3_0=ruleParameterDeclVarArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalLayoutRule());
                    						}
                    						set(
                    							current,
                    							"parameterDecl",
                    							lv_parameterDecl_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.ParameterDeclVarArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_10); 

                    				newLeafNode(otherlv_4, grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_5, grammarAccess.getLocalLayoutAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoniLog4DSL.g:647:3: ( (lv_call_6_0= ruleLayoutCall ) )
            // InternalMoniLog4DSL.g:648:4: (lv_call_6_0= ruleLayoutCall )
            {
            // InternalMoniLog4DSL.g:648:4: (lv_call_6_0= ruleLayoutCall )
            // InternalMoniLog4DSL.g:649:5: lv_call_6_0= ruleLayoutCall
            {

            					newCompositeNode(grammarAccess.getLocalLayoutAccess().getCallLayoutCallParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_13);
            lv_call_6_0=ruleLayoutCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalLayoutRule());
            					}
            					set(
            						current,
            						"call",
            						lv_call_6_0,
            						"org.gemoc.monilog.MoniLog4DSL.LayoutCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleLocalLayout"


    // $ANTLR start "entryRuleExternalLayout"
    // InternalMoniLog4DSL.g:674:1: entryRuleExternalLayout returns [EObject current=null] : iv_ruleExternalLayout= ruleExternalLayout EOF ;
    public final EObject entryRuleExternalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLayout = null;


        try {
            // InternalMoniLog4DSL.g:674:55: (iv_ruleExternalLayout= ruleExternalLayout EOF )
            // InternalMoniLog4DSL.g:675:2: iv_ruleExternalLayout= ruleExternalLayout EOF
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
    // InternalMoniLog4DSL.g:681:1: ruleExternalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleExternalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDecl_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:687:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) )
            // InternalMoniLog4DSL.g:688:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            {
            // InternalMoniLog4DSL.g:688:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            // InternalMoniLog4DSL.g:689:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMoniLog4DSL.g:693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:694:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_name_1_0, grammarAccess.getExternalLayoutAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getExternalLayoutRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:711:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoniLog4DSL.g:712:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:716:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog4DSL.g:717:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog4DSL.g:717:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog4DSL.g:718:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
                    {

                    						newCompositeNode(grammarAccess.getExternalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameterDecl_3_0=ruleParameterDeclVarArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalLayoutRule());
                    						}
                    						set(
                    							current,
                    							"parameterDecl",
                    							lv_parameterDecl_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.ParameterDeclVarArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_2());
                    			

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
    // $ANTLR end "ruleExternalLayout"


    // $ANTLR start "entryRuleParameterDeclVarArgs"
    // InternalMoniLog4DSL.g:744:1: entryRuleParameterDeclVarArgs returns [EObject current=null] : iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF ;
    public final EObject entryRuleParameterDeclVarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclVarArgs = null;


        try {
            // InternalMoniLog4DSL.g:744:61: (iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF )
            // InternalMoniLog4DSL.g:745:2: iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclVarArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclVarArgs=ruleParameterDeclVarArgs();

            state._fsp--;

             current =iv_ruleParameterDeclVarArgs; 
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
    // $ANTLR end "entryRuleParameterDeclVarArgs"


    // $ANTLR start "ruleParameterDeclVarArgs"
    // InternalMoniLog4DSL.g:751:1: ruleParameterDeclVarArgs returns [EObject current=null] : ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? ) ;
    public final EObject ruleParameterDeclVarArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_varArgs_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:757:2: ( ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? ) )
            // InternalMoniLog4DSL.g:758:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? )
            {
            // InternalMoniLog4DSL.g:758:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? )
            // InternalMoniLog4DSL.g:759:3: () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )?
            {
            // InternalMoniLog4DSL.g:759:3: ()
            // InternalMoniLog4DSL.g:760:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDeclVarArgsAccess().getParameterDeclAction_0(),
            					current);
            			

            }

            // InternalMoniLog4DSL.g:766:3: ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoniLog4DSL.g:767:4: ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )?
                    {
                    // InternalMoniLog4DSL.g:767:4: ( (lv_parameters_1_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:768:5: (lv_parameters_1_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:768:5: (lv_parameters_1_0= ruleParameter )
                    // InternalMoniLog4DSL.g:769:6: lv_parameters_1_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameters_1_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDeclVarArgsRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_1_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:786:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==20) ) {
                            int LA15_1 = input.LA(2);

                            if ( (LA15_1==RULE_ID) ) {
                                int LA15_3 = input.LA(3);

                                if ( (LA15_3==EOF||LA15_3==15||LA15_3==20) ) {
                                    alt15=1;
                                }


                            }


                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:787:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:791:5: ( (lv_parameters_3_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:792:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:792:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:793:7: lv_parameters_3_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterDeclVarArgsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_3_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);

                    // InternalMoniLog4DSL.g:811:4: (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==20) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalMoniLog4DSL.g:812:5: otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_2_0());
                            				
                            // InternalMoniLog4DSL.g:816:5: ( (lv_varArgs_5_0= ruleParameter ) )
                            // InternalMoniLog4DSL.g:817:6: (lv_varArgs_5_0= ruleParameter )
                            {
                            // InternalMoniLog4DSL.g:817:6: (lv_varArgs_5_0= ruleParameter )
                            // InternalMoniLog4DSL.g:818:7: lv_varArgs_5_0= ruleParameter
                            {

                            							newCompositeNode(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsParameterParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_15);
                            lv_varArgs_5_0=ruleParameter();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getParameterDeclVarArgsRule());
                            							}
                            							set(
                            								current,
                            								"varArgs",
                            								lv_varArgs_5_0,
                            								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,21,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getParameterDeclVarArgsAccess().getFullStopFullStopFullStopKeyword_1_2_2());
                            				

                            }
                            break;

                    }


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
    // $ANTLR end "ruleParameterDeclVarArgs"


    // $ANTLR start "entryRuleParameterDeclNoVarArgs"
    // InternalMoniLog4DSL.g:845:1: entryRuleParameterDeclNoVarArgs returns [EObject current=null] : iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF ;
    public final EObject entryRuleParameterDeclNoVarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclNoVarArgs = null;


        try {
            // InternalMoniLog4DSL.g:845:63: (iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF )
            // InternalMoniLog4DSL.g:846:2: iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF
            {
             newCompositeNode(grammarAccess.getParameterDeclNoVarArgsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclNoVarArgs=ruleParameterDeclNoVarArgs();

            state._fsp--;

             current =iv_ruleParameterDeclNoVarArgs; 
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
    // $ANTLR end "entryRuleParameterDeclNoVarArgs"


    // $ANTLR start "ruleParameterDeclNoVarArgs"
    // InternalMoniLog4DSL.g:852:1: ruleParameterDeclNoVarArgs returns [EObject current=null] : ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? ) ;
    public final EObject ruleParameterDeclNoVarArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:858:2: ( ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? ) )
            // InternalMoniLog4DSL.g:859:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? )
            {
            // InternalMoniLog4DSL.g:859:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? )
            // InternalMoniLog4DSL.g:860:3: () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )?
            {
            // InternalMoniLog4DSL.g:860:3: ()
            // InternalMoniLog4DSL.g:861:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDeclNoVarArgsAccess().getParameterDeclAction_0(),
            					current);
            			

            }

            // InternalMoniLog4DSL.g:867:3: ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoniLog4DSL.g:868:4: ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    {
                    // InternalMoniLog4DSL.g:868:4: ( (lv_parameters_1_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:869:5: (lv_parameters_1_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:869:5: (lv_parameters_1_0= ruleParameter )
                    // InternalMoniLog4DSL.g:870:6: lv_parameters_1_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_parameters_1_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getParameterDeclNoVarArgsRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_1_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:887:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==20) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:888:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterDeclNoVarArgsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:892:5: ( (lv_parameters_3_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:893:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:893:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:894:7: lv_parameters_3_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_14);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getParameterDeclNoVarArgsRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_3_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
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
    // $ANTLR end "ruleParameterDeclNoVarArgs"


    // $ANTLR start "entryRuleMoniLogger"
    // InternalMoniLog4DSL.g:917:1: entryRuleMoniLogger returns [EObject current=null] : iv_ruleMoniLogger= ruleMoniLogger EOF ;
    public final EObject entryRuleMoniLogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLogger = null;


        try {
            // InternalMoniLog4DSL.g:917:51: (iv_ruleMoniLogger= ruleMoniLogger EOF )
            // InternalMoniLog4DSL.g:918:2: iv_ruleMoniLogger= ruleMoniLogger EOF
            {
             newCompositeNode(grammarAccess.getMoniLoggerRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoniLogger=ruleMoniLogger();

            state._fsp--;

             current =iv_ruleMoniLogger; 
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
    // $ANTLR end "entryRuleMoniLogger"


    // $ANTLR start "ruleMoniLogger"
    // InternalMoniLog4DSL.g:924:1: ruleMoniLogger returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' ) ;
    public final EObject ruleMoniLogger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Enumerator lv_annotations_0_0 = null;

        EObject lv_parameterDecl_4_0 = null;

        Enumerator lv_level_7_0 = null;

        EObject lv_streamEvent_11_0 = null;

        EObject lv_conditions_14_0 = null;

        EObject lv_conditions_16_0 = null;

        EObject lv_actions_20_0 = null;

        EObject lv_actions_22_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:930:2: ( ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' ) )
            // InternalMoniLog4DSL.g:931:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' )
            {
            // InternalMoniLog4DSL.g:931:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}' )
            // InternalMoniLog4DSL.g:932:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )? otherlv_18= 'actions' otherlv_19= '{' ( (lv_actions_20_0= ruleAction ) ) (otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) ) )* otherlv_23= '}' otherlv_24= '}'
            {
            // InternalMoniLog4DSL.g:932:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==51) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:933:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    {
            	    // InternalMoniLog4DSL.g:933:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    // InternalMoniLog4DSL.g:934:5: lv_annotations_0_0= ruleMoniLoggerAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMoniLoggerAccess().getAnnotationsMoniLoggerAnnotationEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_16);
            	    lv_annotations_0_0=ruleMoniLoggerAnnotation();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
            	    					}
            	    					add(
            	    						current,
            	    						"annotations",
            	    						lv_annotations_0_0,
            	    						"org.gemoc.monilog.MoniLog4DSL.MoniLoggerAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1());
            		
            // InternalMoniLog4DSL.g:955:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:956:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:956:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog4DSL.g:957:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMoniLoggerAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoniLoggerRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:973:3: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==14) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoniLog4DSL.g:974:4: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:978:4: ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog4DSL.g:979:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog4DSL.g:979:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog4DSL.g:980:6: lv_parameterDecl_4_0= ruleParameterDeclVarArgs
                    {

                    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_parameterDecl_4_0=ruleParameterDeclVarArgs();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    						}
                    						set(
                    							current,
                    							"parameterDecl",
                    							lv_parameterDecl_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.ParameterDeclVarArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalMoniLog4DSL.g:1002:3: (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==23) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoniLog4DSL.g:1003:4: otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMoniLog4DSL.g:1007:4: ( (lv_level_7_0= ruleLogLevel ) )
                    // InternalMoniLog4DSL.g:1008:5: (lv_level_7_0= ruleLogLevel )
                    {
                    // InternalMoniLog4DSL.g:1008:5: (lv_level_7_0= ruleLogLevel )
                    // InternalMoniLog4DSL.g:1009:6: lv_level_7_0= ruleLogLevel
                    {

                    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getLevelLogLevelEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_level_7_0=ruleLogLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    						}
                    						set(
                    							current,
                    							"level",
                    							lv_level_7_0,
                    							"org.gemoc.monilog.MoniLog4DSL.LogLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,24,FOLLOW_10); 

                    				newLeafNode(otherlv_8, grammarAccess.getMoniLoggerAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_9=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_9, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_10=(Token)match(input,25,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getMoniLoggerAccess().getEventKeyword_6());
            		
            // InternalMoniLog4DSL.g:1039:3: ( (lv_streamEvent_11_0= ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:1040:4: (lv_streamEvent_11_0= ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:1040:4: (lv_streamEvent_11_0= ruleStreamEvent )
            // InternalMoniLog4DSL.g:1041:5: lv_streamEvent_11_0= ruleStreamEvent
            {

            					newCompositeNode(grammarAccess.getMoniLoggerAccess().getStreamEventStreamEventParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_22);
            lv_streamEvent_11_0=ruleStreamEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
            					}
            					set(
            						current,
            						"streamEvent",
            						lv_streamEvent_11_0,
            						"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:1058:3: (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoniLog4DSL.g:1059:4: otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* otherlv_17= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMoniLog4DSL.g:1067:4: ( (lv_conditions_14_0= ruleCondition ) )
                    // InternalMoniLog4DSL.g:1068:5: (lv_conditions_14_0= ruleCondition )
                    {
                    // InternalMoniLog4DSL.g:1068:5: (lv_conditions_14_0= ruleCondition )
                    // InternalMoniLog4DSL.g:1069:6: lv_conditions_14_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_conditions_14_0=ruleCondition();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    						}
                    						add(
                    							current,
                    							"conditions",
                    							lv_conditions_14_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1086:4: (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==17) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:1087:5: otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:1091:5: ( (lv_conditions_16_0= ruleCondition ) )
                    	    // InternalMoniLog4DSL.g:1092:6: (lv_conditions_16_0= ruleCondition )
                    	    {
                    	    // InternalMoniLog4DSL.g:1092:6: (lv_conditions_16_0= ruleCondition )
                    	    // InternalMoniLog4DSL.g:1093:7: lv_conditions_16_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
                    	    lv_conditions_16_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
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
                    	    break loop23;
                        }
                    } while (true);

                    otherlv_17=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_17, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_18=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_18, grammarAccess.getMoniLoggerAccess().getActionsKeyword_9());
            		
            otherlv_19=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_19, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMoniLog4DSL.g:1124:3: ( (lv_actions_20_0= ruleAction ) )
            // InternalMoniLog4DSL.g:1125:4: (lv_actions_20_0= ruleAction )
            {
            // InternalMoniLog4DSL.g:1125:4: (lv_actions_20_0= ruleAction )
            // InternalMoniLog4DSL.g:1126:5: lv_actions_20_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_actions_20_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_20_0,
            						"org.gemoc.monilog.MoniLog4DSL.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:1143:3: (otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==17) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1144:4: otherlv_21= ';' ( (lv_actions_22_0= ruleAction ) )
            	    {
            	    otherlv_21=(Token)match(input,17,FOLLOW_24); 

            	    				newLeafNode(otherlv_21, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0());
            	    			
            	    // InternalMoniLog4DSL.g:1148:4: ( (lv_actions_22_0= ruleAction ) )
            	    // InternalMoniLog4DSL.g:1149:5: (lv_actions_22_0= ruleAction )
            	    {
            	    // InternalMoniLog4DSL.g:1149:5: (lv_actions_22_0= ruleAction )
            	    // InternalMoniLog4DSL.g:1150:6: lv_actions_22_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_actions_22_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
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
            	    break loop25;
                }
            } while (true);

            otherlv_23=(Token)match(input,18,FOLLOW_13); 

            			newLeafNode(otherlv_23, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_24=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_24, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14());
            		

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
    // $ANTLR end "ruleMoniLogger"


    // $ANTLR start "entryRuleParameter"
    // InternalMoniLog4DSL.g:1180:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMoniLog4DSL.g:1180:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMoniLog4DSL.g:1181:2: iv_ruleParameter= ruleParameter EOF
            {
             newCompositeNode(grammarAccess.getParameterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;

             current =iv_ruleParameter; 
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
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMoniLog4DSL.g:1187:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1193:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMoniLog4DSL.g:1194:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:1194:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:1195:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:1195:3: (lv_name_0_0= RULE_ID )
            // InternalMoniLog4DSL.g:1196:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEvent"
    // InternalMoniLog4DSL.g:1215:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMoniLog4DSL.g:1215:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMoniLog4DSL.g:1216:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalMoniLog4DSL.g:1222:1: ruleEvent returns [EObject current=null] : ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_ruleID_8_0=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_name_12_0=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token lv_name_24_0=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        EObject lv_parameterDecl_4_0 = null;

        EObject lv_kind_7_0 = null;

        Enumerator lv_kind_14_0 = null;

        EObject lv_parameterDecl_17_0 = null;

        EObject lv_pattern_20_0 = null;

        EObject lv_parameterDecl_26_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1228:2: ( ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) ) )
            // InternalMoniLog4DSL.g:1229:2: ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) )
            {
            // InternalMoniLog4DSL.g:1229:2: ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt30=1;
                }
                break;
            case 29:
                {
                alt30=2;
                }
                break;
            case 30:
                {
                alt30=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMoniLog4DSL.g:1230:3: ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' )
                    {
                    // InternalMoniLog4DSL.g:1230:3: ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' )
                    // InternalMoniLog4DSL.g:1231:4: () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}'
                    {
                    // InternalMoniLog4DSL.g:1231:4: ()
                    // InternalMoniLog4DSL.g:1232:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getASTEventAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getCallKeyword_0_1());
                    			
                    // InternalMoniLog4DSL.g:1242:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:1243:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1243:5: (lv_name_2_0= RULE_ID )
                    // InternalMoniLog4DSL.g:1244:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1260:4: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==14) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1261:5: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_3_0());
                            				
                            // InternalMoniLog4DSL.g:1265:5: ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog4DSL.g:1266:6: (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog4DSL.g:1266:6: (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog4DSL.g:1267:7: lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs
                            {

                            							newCompositeNode(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_parameterDecl_4_0=ruleParameterDeclNoVarArgs();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEventRule());
                            							}
                            							set(
                            								current,
                            								"parameterDecl",
                            								lv_parameterDecl_4_0,
                            								"org.gemoc.monilog.MoniLog4DSL.ParameterDeclNoVarArgs");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_5=(Token)match(input,15,FOLLOW_10); 

                            					newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightParenthesisKeyword_0_3_2());
                            				

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,16,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_0_4());
                    			
                    // InternalMoniLog4DSL.g:1293:4: ( (lv_kind_7_0= ruleASTEventKind ) )
                    // InternalMoniLog4DSL.g:1294:5: (lv_kind_7_0= ruleASTEventKind )
                    {
                    // InternalMoniLog4DSL.g:1294:5: (lv_kind_7_0= ruleASTEventKind )
                    // InternalMoniLog4DSL.g:1295:6: lv_kind_7_0= ruleASTEventKind
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getKindASTEventKindParserRuleCall_0_5_0());
                    					
                    pushFollow(FOLLOW_3);
                    lv_kind_7_0=ruleASTEventKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_7_0,
                    							"org.gemoc.monilog.MoniLog4DSL.ASTEventKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1312:4: ( (lv_ruleID_8_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:1313:5: (lv_ruleID_8_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1313:5: (lv_ruleID_8_0= RULE_ID )
                    // InternalMoniLog4DSL.g:1314:6: lv_ruleID_8_0= RULE_ID
                    {
                    lv_ruleID_8_0=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(lv_ruleID_8_0, grammarAccess.getEventAccess().getRuleIDIDTerminalRuleCall_0_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"ruleID",
                    							lv_ruleID_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_0_7());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1336:3: ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' )
                    {
                    // InternalMoniLog4DSL.g:1336:3: ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' )
                    // InternalMoniLog4DSL.g:1337:4: () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}'
                    {
                    // InternalMoniLog4DSL.g:1337:4: ()
                    // InternalMoniLog4DSL.g:1338:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getComplexEventAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getComplexKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:1348:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:1349:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1349:5: (lv_name_12_0= RULE_ID )
                    // InternalMoniLog4DSL.g:1350:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_17); 

                    						newLeafNode(lv_name_12_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_12_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1366:4: (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==23) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1367:5: otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']'
                            {
                            otherlv_13=(Token)match(input,23,FOLLOW_26); 

                            					newLeafNode(otherlv_13, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_3_0());
                            				
                            // InternalMoniLog4DSL.g:1371:5: ( (lv_kind_14_0= ruleTemporalPatternKind ) )
                            // InternalMoniLog4DSL.g:1372:6: (lv_kind_14_0= ruleTemporalPatternKind )
                            {
                            // InternalMoniLog4DSL.g:1372:6: (lv_kind_14_0= ruleTemporalPatternKind )
                            // InternalMoniLog4DSL.g:1373:7: lv_kind_14_0= ruleTemporalPatternKind
                            {

                            							newCompositeNode(grammarAccess.getEventAccess().getKindTemporalPatternKindEnumRuleCall_1_3_1_0());
                            						
                            pushFollow(FOLLOW_20);
                            lv_kind_14_0=ruleTemporalPatternKind();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEventRule());
                            							}
                            							set(
                            								current,
                            								"kind",
                            								lv_kind_14_0,
                            								"org.gemoc.monilog.MoniLog4DSL.TemporalPatternKind");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_15=(Token)match(input,24,FOLLOW_7); 

                            					newLeafNode(otherlv_15, grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_3_2());
                            				

                            }
                            break;

                    }

                    // InternalMoniLog4DSL.g:1395:4: (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==14) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1396:5: otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')'
                            {
                            otherlv_16=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_16, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_4_0());
                            				
                            // InternalMoniLog4DSL.g:1400:5: ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog4DSL.g:1401:6: (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog4DSL.g:1401:6: (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog4DSL.g:1402:7: lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs
                            {

                            							newCompositeNode(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_1_4_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_parameterDecl_17_0=ruleParameterDeclNoVarArgs();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEventRule());
                            							}
                            							set(
                            								current,
                            								"parameterDecl",
                            								lv_parameterDecl_17_0,
                            								"org.gemoc.monilog.MoniLog4DSL.ParameterDeclNoVarArgs");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_18=(Token)match(input,15,FOLLOW_10); 

                            					newLeafNode(otherlv_18, grammarAccess.getEventAccess().getRightParenthesisKeyword_1_4_2());
                            				

                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,16,FOLLOW_27); 

                    				newLeafNode(otherlv_19, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1_5());
                    			
                    // InternalMoniLog4DSL.g:1428:4: ( (lv_pattern_20_0= ruleTemporalPattern ) )
                    // InternalMoniLog4DSL.g:1429:5: (lv_pattern_20_0= ruleTemporalPattern )
                    {
                    // InternalMoniLog4DSL.g:1429:5: (lv_pattern_20_0= ruleTemporalPattern )
                    // InternalMoniLog4DSL.g:1430:6: lv_pattern_20_0= ruleTemporalPattern
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getPatternTemporalPatternParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_pattern_20_0=ruleTemporalPattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"pattern",
                    							lv_pattern_20_0,
                    							"org.gemoc.monilog.MoniLog4DSL.TemporalPattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1453:3: ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? )
                    {
                    // InternalMoniLog4DSL.g:1453:3: ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? )
                    // InternalMoniLog4DSL.g:1454:4: () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )?
                    {
                    // InternalMoniLog4DSL.g:1454:4: ()
                    // InternalMoniLog4DSL.g:1455:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getUserEventAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_23=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEventAccess().getCustomKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:1465:4: ( (lv_name_24_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:1466:5: (lv_name_24_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1466:5: (lv_name_24_0= RULE_ID )
                    // InternalMoniLog4DSL.g:1467:6: lv_name_24_0= RULE_ID
                    {
                    lv_name_24_0=(Token)match(input,RULE_ID,FOLLOW_12); 

                    						newLeafNode(lv_name_24_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEventRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_24_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1483:4: (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==14) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1484:5: otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')'
                            {
                            otherlv_25=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_25, grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_3_0());
                            				
                            // InternalMoniLog4DSL.g:1488:5: ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog4DSL.g:1489:6: (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog4DSL.g:1489:6: (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog4DSL.g:1490:7: lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs
                            {

                            							newCompositeNode(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_9);
                            lv_parameterDecl_26_0=ruleParameterDeclNoVarArgs();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEventRule());
                            							}
                            							set(
                            								current,
                            								"parameterDecl",
                            								lv_parameterDecl_26_0,
                            								"org.gemoc.monilog.MoniLog4DSL.ParameterDeclNoVarArgs");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_27=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_27, grammarAccess.getEventAccess().getRightParenthesisKeyword_2_3_2());
                            				

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleASTEventKind"
    // InternalMoniLog4DSL.g:1517:1: entryRuleASTEventKind returns [EObject current=null] : iv_ruleASTEventKind= ruleASTEventKind EOF ;
    public final EObject entryRuleASTEventKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASTEventKind = null;


        try {
            // InternalMoniLog4DSL.g:1517:53: (iv_ruleASTEventKind= ruleASTEventKind EOF )
            // InternalMoniLog4DSL.g:1518:2: iv_ruleASTEventKind= ruleASTEventKind EOF
            {
             newCompositeNode(grammarAccess.getASTEventKindRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleASTEventKind=ruleASTEventKind();

            state._fsp--;

             current =iv_ruleASTEventKind; 
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
    // $ANTLR end "entryRuleASTEventKind"


    // $ANTLR start "ruleASTEventKind"
    // InternalMoniLog4DSL.g:1524:1: ruleASTEventKind returns [EObject current=null] : ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) ) ;
    public final EObject ruleASTEventKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1530:2: ( ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) ) )
            // InternalMoniLog4DSL.g:1531:2: ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) )
            {
            // InternalMoniLog4DSL.g:1531:2: ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==31) ) {
                alt31=1;
            }
            else if ( (LA31_0==32) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoniLog4DSL.g:1532:3: ( () otherlv_1= 'before' )
                    {
                    // InternalMoniLog4DSL.g:1532:3: ( () otherlv_1= 'before' )
                    // InternalMoniLog4DSL.g:1533:4: () otherlv_1= 'before'
                    {
                    // InternalMoniLog4DSL.g:1533:4: ()
                    // InternalMoniLog4DSL.g:1534:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getASTEventKindAccess().getBeforeASTEventAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,31,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getASTEventKindAccess().getBeforeKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1546:3: ( () otherlv_3= 'after' )
                    {
                    // InternalMoniLog4DSL.g:1546:3: ( () otherlv_3= 'after' )
                    // InternalMoniLog4DSL.g:1547:4: () otherlv_3= 'after'
                    {
                    // InternalMoniLog4DSL.g:1547:4: ()
                    // InternalMoniLog4DSL.g:1548:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getASTEventKindAccess().getAfterASTEventAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getASTEventKindAccess().getAfterKeyword_1_1());
                    			

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
    // $ANTLR end "ruleASTEventKind"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog4DSL.g:1563:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMoniLog4DSL.g:1563:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMoniLog4DSL.g:1564:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMoniLog4DSL.g:1570:1: ruleCondition returns [EObject current=null] : ( (lv_expression_0_0= ruleLanguageExpression ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1576:2: ( ( (lv_expression_0_0= ruleLanguageExpression ) ) )
            // InternalMoniLog4DSL.g:1577:2: ( (lv_expression_0_0= ruleLanguageExpression ) )
            {
            // InternalMoniLog4DSL.g:1577:2: ( (lv_expression_0_0= ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:1578:3: (lv_expression_0_0= ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:1578:3: (lv_expression_0_0= ruleLanguageExpression )
            // InternalMoniLog4DSL.g:1579:4: lv_expression_0_0= ruleLanguageExpression
            {

            				newCompositeNode(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleLanguageExpression();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getConditionRule());
            				}
            				set(
            					current,
            					"expression",
            					lv_expression_0_0,
            					"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalMoniLog4DSL.g:1599:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalMoniLog4DSL.g:1599:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalMoniLog4DSL.g:1600:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
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
    // InternalMoniLog4DSL.g:1606:1: ruleTemporalPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;

        EObject lv_scope_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1612:2: ( ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) )
            // InternalMoniLog4DSL.g:1613:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            {
            // InternalMoniLog4DSL.g:1613:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            // InternalMoniLog4DSL.g:1614:3: ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) )
            {
            // InternalMoniLog4DSL.g:1614:3: ( (lv_pattern_0_0= rulePattern ) )
            // InternalMoniLog4DSL.g:1615:4: (lv_pattern_0_0= rulePattern )
            {
            // InternalMoniLog4DSL.g:1615:4: (lv_pattern_0_0= rulePattern )
            // InternalMoniLog4DSL.g:1616:5: lv_pattern_0_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalMoniLog4DSL.g:1633:3: ( (lv_scope_1_0= ruleScope ) )
            // InternalMoniLog4DSL.g:1634:4: (lv_scope_1_0= ruleScope )
            {
            // InternalMoniLog4DSL.g:1634:4: (lv_scope_1_0= ruleScope )
            // InternalMoniLog4DSL.g:1635:5: lv_scope_1_0= ruleScope
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
    // InternalMoniLog4DSL.g:1656:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMoniLog4DSL.g:1656:48: (iv_rulePattern= rulePattern EOF )
            // InternalMoniLog4DSL.g:1657:2: iv_rulePattern= rulePattern EOF
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
    // InternalMoniLog4DSL.g:1663:1: rulePattern returns [EObject current=null] : ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_12=null;
        Token otherlv_16=null;
        EObject lv_bound_2_0 = null;

        EObject lv_event_3_0 = null;

        EObject lv_event_6_0 = null;

        EObject lv_event_9_0 = null;

        EObject lv_predecessor_11_0 = null;

        EObject lv_successor_13_0 = null;

        EObject lv_event_15_0 = null;

        EObject lv_trigger_17_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1669:2: ( ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog4DSL.g:1670:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog4DSL.g:1670:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            int alt34=5;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalMoniLog4DSL.g:1671:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1671:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1672:4: () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1672:4: ()
                    // InternalMoniLog4DSL.g:1673:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getExistenceAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1679:4: (otherlv_1= 'exists' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==33) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1680:5: otherlv_1= 'exists'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getExistsKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMoniLog4DSL.g:1685:4: ( (lv_bound_2_0= ruleBoundType ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT||(LA33_0>=38 && LA33_0<=39)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1686:5: (lv_bound_2_0= ruleBoundType )
                            {
                            // InternalMoniLog4DSL.g:1686:5: (lv_bound_2_0= ruleBoundType )
                            // InternalMoniLog4DSL.g:1687:6: lv_bound_2_0= ruleBoundType
                            {

                            						newCompositeNode(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_3);
                            lv_bound_2_0=ruleBoundType();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getPatternRule());
                            						}
                            						set(
                            							current,
                            							"bound",
                            							lv_bound_2_0,
                            							"org.gemoc.monilog.MoniLog4DSL.BoundType");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalMoniLog4DSL.g:1704:4: ( (lv_event_3_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1705:5: (lv_event_3_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1705:5: (lv_event_3_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1706:6: lv_event_3_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_event_3_0=ruleStreamEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"event",
                    							lv_event_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1725:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1725:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1726:4: () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1726:4: ()
                    // InternalMoniLog4DSL.g:1727:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getUniversalityAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getAlwaysKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:1737:4: ( (lv_event_6_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1738:5: (lv_event_6_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1738:5: (lv_event_6_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1739:6: lv_event_6_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_2_0());
                    					
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
                    // InternalMoniLog4DSL.g:1758:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1758:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1759:4: () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1759:4: ()
                    // InternalMoniLog4DSL.g:1760:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getAbsenceAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getNeverKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:1770:4: ( (lv_event_9_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1771:5: (lv_event_9_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1771:5: (lv_event_9_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1772:6: lv_event_9_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:1791:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1791:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1792:4: () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1792:4: ()
                    // InternalMoniLog4DSL.g:1793:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getPrecedenceAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1799:4: ( (lv_predecessor_11_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1800:5: (lv_predecessor_11_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1800:5: (lv_predecessor_11_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1801:6: lv_predecessor_11_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_12=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPrecedesKeyword_3_2());
                    			
                    // InternalMoniLog4DSL.g:1822:4: ( (lv_successor_13_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1823:5: (lv_successor_13_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1823:5: (lv_successor_13_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1824:6: lv_successor_13_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:1843:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1843:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1844:4: () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1844:4: ()
                    // InternalMoniLog4DSL.g:1845:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getResponseAction_4_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1851:4: ( (lv_event_15_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1852:5: (lv_event_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1852:5: (lv_event_15_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1853:6: lv_event_15_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_31);
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

                    otherlv_16=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getRespondsToKeyword_4_2());
                    			
                    // InternalMoniLog4DSL.g:1874:4: ( (lv_trigger_17_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1875:5: (lv_trigger_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1875:5: (lv_trigger_17_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1876:6: lv_trigger_17_0= ruleStreamEvent
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
    // InternalMoniLog4DSL.g:1898:1: entryRuleBoundType returns [EObject current=null] : iv_ruleBoundType= ruleBoundType EOF ;
    public final EObject entryRuleBoundType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundType = null;


        try {
            // InternalMoniLog4DSL.g:1898:50: (iv_ruleBoundType= ruleBoundType EOF )
            // InternalMoniLog4DSL.g:1899:2: iv_ruleBoundType= ruleBoundType EOF
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
    // InternalMoniLog4DSL.g:1905:1: ruleBoundType returns [EObject current=null] : (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) ;
    public final EObject ruleBoundType() throws RecognitionException {
        EObject current = null;

        EObject this_ExactBound_0 = null;

        EObject this_LowerBound_1 = null;

        EObject this_UpperBound_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1911:2: ( (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) )
            // InternalMoniLog4DSL.g:1912:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            {
            // InternalMoniLog4DSL.g:1912:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt35=1;
                }
                break;
            case 38:
                {
                alt35=2;
                }
                break;
            case 39:
                {
                alt35=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalMoniLog4DSL.g:1913:3: this_ExactBound_0= ruleExactBound
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
                    // InternalMoniLog4DSL.g:1922:3: this_LowerBound_1= ruleLowerBound
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
                    // InternalMoniLog4DSL.g:1931:3: this_UpperBound_2= ruleUpperBound
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
    // InternalMoniLog4DSL.g:1943:1: entryRuleExactBound returns [EObject current=null] : iv_ruleExactBound= ruleExactBound EOF ;
    public final EObject entryRuleExactBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactBound = null;


        try {
            // InternalMoniLog4DSL.g:1943:51: (iv_ruleExactBound= ruleExactBound EOF )
            // InternalMoniLog4DSL.g:1944:2: iv_ruleExactBound= ruleExactBound EOF
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
    // InternalMoniLog4DSL.g:1950:1: ruleExactBound returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleExactBound() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1956:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1957:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalMoniLog4DSL.g:1957:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1958:3: (lv_n_0_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1958:3: (lv_n_0_0= RULE_INT )
            // InternalMoniLog4DSL.g:1959:4: lv_n_0_0= RULE_INT
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
    // InternalMoniLog4DSL.g:1978:1: entryRuleLowerBound returns [EObject current=null] : iv_ruleLowerBound= ruleLowerBound EOF ;
    public final EObject entryRuleLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBound = null;


        try {
            // InternalMoniLog4DSL.g:1978:51: (iv_ruleLowerBound= ruleLowerBound EOF )
            // InternalMoniLog4DSL.g:1979:2: iv_ruleLowerBound= ruleLowerBound EOF
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
    // InternalMoniLog4DSL.g:1985:1: ruleLowerBound returns [EObject current=null] : (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1991:2: ( (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog4DSL.g:1992:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog4DSL.g:1992:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1993:3: otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundAccess().getAtleastKeyword_0());
            		
            // InternalMoniLog4DSL.g:1997:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1998:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1998:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog4DSL.g:1999:5: lv_n_1_0= RULE_INT
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
    // InternalMoniLog4DSL.g:2019:1: entryRuleUpperBound returns [EObject current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final EObject entryRuleUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperBound = null;


        try {
            // InternalMoniLog4DSL.g:2019:51: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalMoniLog4DSL.g:2020:2: iv_ruleUpperBound= ruleUpperBound EOF
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
    // InternalMoniLog4DSL.g:2026:1: ruleUpperBound returns [EObject current=null] : (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2032:2: ( (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog4DSL.g:2033:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog4DSL.g:2033:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:2034:3: otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperBoundAccess().getAtmostKeyword_0());
            		
            // InternalMoniLog4DSL.g:2038:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:2039:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:2039:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog4DSL.g:2040:5: lv_n_1_0= RULE_INT
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
    // InternalMoniLog4DSL.g:2060:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalMoniLog4DSL.g:2060:46: (iv_ruleScope= ruleScope EOF )
            // InternalMoniLog4DSL.g:2061:2: iv_ruleScope= ruleScope EOF
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
    // InternalMoniLog4DSL.g:2067:1: ruleScope returns [EObject current=null] : ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog4DSL.g:2073:2: ( ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog4DSL.g:2074:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog4DSL.g:2074:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalMoniLog4DSL.g:2075:3: ( () (otherlv_1= 'globally' )? )
                    {
                    // InternalMoniLog4DSL.g:2075:3: ( () (otherlv_1= 'globally' )? )
                    // InternalMoniLog4DSL.g:2076:4: () (otherlv_1= 'globally' )?
                    {
                    // InternalMoniLog4DSL.g:2076:4: ()
                    // InternalMoniLog4DSL.g:2077:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getGloballyAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2083:4: (otherlv_1= 'globally' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==40) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2084:5: otherlv_1= 'globally'
                            {
                            otherlv_1=(Token)match(input,40,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getGloballyKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2091:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2091:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2092:4: () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2092:4: ()
                    // InternalMoniLog4DSL.g:2093:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getAfterKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:2103:4: ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2104:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2104:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2105:6: lv_lowerBound_4_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:2124:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2124:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2125:4: () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2125:4: ()
                    // InternalMoniLog4DSL.g:2126:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBeforeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getBeforeKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:2136:4: ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2137:5: (lv_upperBound_7_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2137:5: (lv_upperBound_7_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2138:6: lv_upperBound_7_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:2157:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2157:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2158:4: () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2158:4: ()
                    // InternalMoniLog4DSL.g:2159:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBetweenAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                    			
                    // InternalMoniLog4DSL.g:2169:4: ( (lv_lowerBound_10_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2170:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2170:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2171:6: lv_lowerBound_10_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_33);
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

                    otherlv_11=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_3());
                    			
                    // InternalMoniLog4DSL.g:2192:4: ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2193:5: (lv_upperBound_12_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2193:5: (lv_upperBound_12_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2194:6: lv_upperBound_12_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:2213:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2213:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2214:4: () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2214:4: ()
                    // InternalMoniLog4DSL.g:2215:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterUntilAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                    			
                    // InternalMoniLog4DSL.g:2225:4: ( (lv_lowerBound_15_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2226:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2226:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2227:6: lv_lowerBound_15_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_34);
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

                    otherlv_16=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getScopeAccess().getUntilKeyword_4_3());
                    			
                    // InternalMoniLog4DSL.g:2248:4: ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2249:5: (lv_upperBound_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2249:5: (lv_upperBound_17_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2250:6: lv_upperBound_17_0= ruleStreamEvent
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
    // InternalMoniLog4DSL.g:2272:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMoniLog4DSL.g:2272:47: (iv_ruleAction= ruleAction EOF )
            // InternalMoniLog4DSL.g:2273:2: iv_ruleAction= ruleAction EOF
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
    // InternalMoniLog4DSL.g:2279:1: ruleAction returns [EObject current=null] : (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LanguageExpression_0 = null;

        EObject this_AppenderCall_1 = null;

        EObject this_EmitEvent_2 = null;

        EObject this_SetVariable_3 = null;

        EObject this_MoniloggerCall_4 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2285:2: ( (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall ) )
            // InternalMoniLog4DSL.g:2286:2: (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall )
            {
            // InternalMoniLog4DSL.g:2286:2: (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall )
            int alt38=5;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==44) ) {
                    switch ( input.LA(3) ) {
                    case 47:
                    case 48:
                        {
                        alt38=5;
                        }
                        break;
                    case 45:
                        {
                        alt38=3;
                        }
                        break;
                    case RULE_ID:
                    case 28:
                        {
                        alt38=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA38_1==14) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==46) ) {
                alt38=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoniLog4DSL.g:2287:3: this_LanguageExpression_0= ruleLanguageExpression
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLanguageExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LanguageExpression_0=ruleLanguageExpression();

                    state._fsp--;


                    			current = this_LanguageExpression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2296:3: this_AppenderCall_1= ruleAppenderCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getAppenderCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_AppenderCall_1=ruleAppenderCall();

                    state._fsp--;


                    			current = this_AppenderCall_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:2305:3: this_EmitEvent_2= ruleEmitEvent
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getEmitEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_EmitEvent_2=ruleEmitEvent();

                    state._fsp--;


                    			current = this_EmitEvent_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:2314:3: this_SetVariable_3= ruleSetVariable
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getSetVariableParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_SetVariable_3=ruleSetVariable();

                    state._fsp--;


                    			current = this_SetVariable_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:2323:3: this_MoniloggerCall_4= ruleMoniloggerCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMoniloggerCallParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoniloggerCall_4=ruleMoniloggerCall();

                    state._fsp--;


                    			current = this_MoniloggerCall_4;
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


    // $ANTLR start "entryRuleAppenderCall"
    // InternalMoniLog4DSL.g:2335:1: entryRuleAppenderCall returns [EObject current=null] : iv_ruleAppenderCall= ruleAppenderCall EOF ;
    public final EObject entryRuleAppenderCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCall = null;


        try {
            // InternalMoniLog4DSL.g:2335:53: (iv_ruleAppenderCall= ruleAppenderCall EOF )
            // InternalMoniLog4DSL.g:2336:2: iv_ruleAppenderCall= ruleAppenderCall EOF
            {
             newCompositeNode(grammarAccess.getAppenderCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppenderCall=ruleAppenderCall();

            state._fsp--;

             current =iv_ruleAppenderCall; 
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
    // $ANTLR end "entryRuleAppenderCall"


    // $ANTLR start "ruleAppenderCall"
    // InternalMoniLog4DSL.g:2342:1: ruleAppenderCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleAppenderCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2348:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog4DSL.g:2349:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog4DSL.g:2349:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog4DSL.g:2350:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog4DSL.g:2350:3: ( ( ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:2351:4: ( ruleQualifiedName )
            {
            // InternalMoniLog4DSL.g:2351:4: ( ruleQualifiedName )
            // InternalMoniLog4DSL.g:2352:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAppenderCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getAppenderCallAccess().getAppenderAppenderCrossReference_0_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getAppenderCallAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getAppenderCallAccess().getCallKeyword_2());
            		
            // InternalMoniLog4DSL.g:2374:3: (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==14) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoniLog4DSL.g:2375:4: otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:2379:4: ( (lv_args_4_0= ruleAppenderCallArgument ) )
                    // InternalMoniLog4DSL.g:2380:5: (lv_args_4_0= ruleAppenderCallArgument )
                    {
                    // InternalMoniLog4DSL.g:2380:5: (lv_args_4_0= ruleAppenderCallArgument )
                    // InternalMoniLog4DSL.g:2381:6: lv_args_4_0= ruleAppenderCallArgument
                    {

                    						newCompositeNode(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_args_4_0=ruleAppenderCallArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAppenderCallRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.AppenderCallArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:2398:4: (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==20) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2399:5: otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2403:5: ( (lv_args_6_0= ruleAppenderCallArgument ) )
                    	    // InternalMoniLog4DSL.g:2404:6: (lv_args_6_0= ruleAppenderCallArgument )
                    	    {
                    	    // InternalMoniLog4DSL.g:2404:6: (lv_args_6_0= ruleAppenderCallArgument )
                    	    // InternalMoniLog4DSL.g:2405:7: lv_args_6_0= ruleAppenderCallArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_args_6_0=ruleAppenderCallArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getAppenderCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_6_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.AppenderCallArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getAppenderCallAccess().getRightParenthesisKeyword_3_3());
                    			

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
    // $ANTLR end "ruleAppenderCall"


    // $ANTLR start "entryRuleAppenderCallArgument"
    // InternalMoniLog4DSL.g:2432:1: entryRuleAppenderCallArgument returns [EObject current=null] : iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF ;
    public final EObject entryRuleAppenderCallArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCallArgument = null;


        try {
            // InternalMoniLog4DSL.g:2432:61: (iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF )
            // InternalMoniLog4DSL.g:2433:2: iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF
            {
             newCompositeNode(grammarAccess.getAppenderCallArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppenderCallArgument=ruleAppenderCallArgument();

            state._fsp--;

             current =iv_ruleAppenderCallArgument; 
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
    // $ANTLR end "entryRuleAppenderCallArgument"


    // $ANTLR start "ruleAppenderCallArgument"
    // InternalMoniLog4DSL.g:2439:1: ruleAppenderCallArgument returns [EObject current=null] : (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall ) ;
    public final EObject ruleAppenderCallArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_LayoutCall_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2445:2: ( (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall ) )
            // InternalMoniLog4DSL.g:2446:2: (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall )
            {
            // InternalMoniLog4DSL.g:2446:2: (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||(LA41_1>=14 && LA41_1<=15)||LA41_1==20) ) {
                    alt41=1;
                }
                else if ( (LA41_1==44) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoniLog4DSL.g:2447:3: this_Expression_0= ruleExpression
                    {

                    			newCompositeNode(grammarAccess.getAppenderCallArgumentAccess().getExpressionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Expression_0=ruleExpression();

                    state._fsp--;


                    			current = this_Expression_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2456:3: this_LayoutCall_1= ruleLayoutCall
                    {

                    			newCompositeNode(grammarAccess.getAppenderCallArgumentAccess().getLayoutCallParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LayoutCall_1=ruleLayoutCall();

                    state._fsp--;


                    			current = this_LayoutCall_1;
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
    // $ANTLR end "ruleAppenderCallArgument"


    // $ANTLR start "entryRuleLayoutCall"
    // InternalMoniLog4DSL.g:2468:1: entryRuleLayoutCall returns [EObject current=null] : iv_ruleLayoutCall= ruleLayoutCall EOF ;
    public final EObject entryRuleLayoutCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutCall = null;


        try {
            // InternalMoniLog4DSL.g:2468:51: (iv_ruleLayoutCall= ruleLayoutCall EOF )
            // InternalMoniLog4DSL.g:2469:2: iv_ruleLayoutCall= ruleLayoutCall EOF
            {
             newCompositeNode(grammarAccess.getLayoutCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutCall=ruleLayoutCall();

            state._fsp--;

             current =iv_ruleLayoutCall; 
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
    // $ANTLR end "entryRuleLayoutCall"


    // $ANTLR start "ruleLayoutCall"
    // InternalMoniLog4DSL.g:2475:1: ruleLayoutCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleLayoutCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2481:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog4DSL.g:2482:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog4DSL.g:2482:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog4DSL.g:2483:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog4DSL.g:2483:3: ( ( ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:2484:4: ( ruleQualifiedName )
            {
            // InternalMoniLog4DSL.g:2484:4: ( ruleQualifiedName )
            // InternalMoniLog4DSL.g:2485:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLayoutCallRule());
            					}
            				

            					newCompositeNode(grammarAccess.getLayoutCallAccess().getLayoutLayoutCrossReference_0_0());
            				
            pushFollow(FOLLOW_35);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getLayoutCallAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutCallAccess().getCallKeyword_2());
            		
            // InternalMoniLog4DSL.g:2507:3: (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoniLog4DSL.g:2508:4: otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:2512:4: ( (lv_args_4_0= ruleLayoutCallArgument ) )
                    // InternalMoniLog4DSL.g:2513:5: (lv_args_4_0= ruleLayoutCallArgument )
                    {
                    // InternalMoniLog4DSL.g:2513:5: (lv_args_4_0= ruleLayoutCallArgument )
                    // InternalMoniLog4DSL.g:2514:6: lv_args_4_0= ruleLayoutCallArgument
                    {

                    						newCompositeNode(grammarAccess.getLayoutCallAccess().getArgsLayoutCallArgumentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_args_4_0=ruleLayoutCallArgument();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayoutCallRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.LayoutCallArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:2531:4: (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==20) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2532:5: otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2536:5: ( (lv_args_6_0= ruleLayoutCallArgument ) )
                    	    // InternalMoniLog4DSL.g:2537:6: (lv_args_6_0= ruleLayoutCallArgument )
                    	    {
                    	    // InternalMoniLog4DSL.g:2537:6: (lv_args_6_0= ruleLayoutCallArgument )
                    	    // InternalMoniLog4DSL.g:2538:7: lv_args_6_0= ruleLayoutCallArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getLayoutCallAccess().getArgsLayoutCallArgumentParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_args_6_0=ruleLayoutCallArgument();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLayoutCallRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_6_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.LayoutCallArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getLayoutCallAccess().getRightParenthesisKeyword_3_3());
                    			

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
    // $ANTLR end "ruleLayoutCall"


    // $ANTLR start "entryRuleLayoutCallArgument"
    // InternalMoniLog4DSL.g:2565:1: entryRuleLayoutCallArgument returns [EObject current=null] : iv_ruleLayoutCallArgument= ruleLayoutCallArgument EOF ;
    public final EObject entryRuleLayoutCallArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutCallArgument = null;


        try {
            // InternalMoniLog4DSL.g:2565:59: (iv_ruleLayoutCallArgument= ruleLayoutCallArgument EOF )
            // InternalMoniLog4DSL.g:2566:2: iv_ruleLayoutCallArgument= ruleLayoutCallArgument EOF
            {
             newCompositeNode(grammarAccess.getLayoutCallArgumentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutCallArgument=ruleLayoutCallArgument();

            state._fsp--;

             current =iv_ruleLayoutCallArgument; 
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
    // $ANTLR end "entryRuleLayoutCallArgument"


    // $ANTLR start "ruleLayoutCallArgument"
    // InternalMoniLog4DSL.g:2572:1: ruleLayoutCallArgument returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleLayoutCallArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2578:2: (this_Expression_0= ruleExpression )
            // InternalMoniLog4DSL.g:2579:2: this_Expression_0= ruleExpression
            {

            		newCompositeNode(grammarAccess.getLayoutCallArgumentAccess().getExpressionParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_Expression_0=ruleExpression();

            state._fsp--;


            		current = this_Expression_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleLayoutCallArgument"


    // $ANTLR start "entryRuleEmitEvent"
    // InternalMoniLog4DSL.g:2590:1: entryRuleEmitEvent returns [EObject current=null] : iv_ruleEmitEvent= ruleEmitEvent EOF ;
    public final EObject entryRuleEmitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmitEvent = null;


        try {
            // InternalMoniLog4DSL.g:2590:50: (iv_ruleEmitEvent= ruleEmitEvent EOF )
            // InternalMoniLog4DSL.g:2591:2: iv_ruleEmitEvent= ruleEmitEvent EOF
            {
             newCompositeNode(grammarAccess.getEmitEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEmitEvent=ruleEmitEvent();

            state._fsp--;

             current =iv_ruleEmitEvent; 
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
    // $ANTLR end "entryRuleEmitEvent"


    // $ANTLR start "ruleEmitEvent"
    // InternalMoniLog4DSL.g:2597:1: ruleEmitEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleEmitEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2603:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog4DSL.g:2604:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog4DSL.g:2604:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog4DSL.g:2605:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog4DSL.g:2605:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:2606:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:2606:4: (otherlv_0= RULE_ID )
            // InternalMoniLog4DSL.g:2607:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmitEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_0, grammarAccess.getEmitEventAccess().getEventUserEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,44,FOLLOW_38); 

            			newLeafNode(otherlv_1, grammarAccess.getEmitEventAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,45,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getEmitEventAccess().getEmitKeyword_2());
            		
            // InternalMoniLog4DSL.g:2626:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==14) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoniLog4DSL.g:2627:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:2631:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog4DSL.g:2632:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog4DSL.g:2632:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog4DSL.g:2633:6: lv_args_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_37);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEmitEventRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:2650:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==20) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2651:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2655:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog4DSL.g:2656:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog4DSL.g:2656:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog4DSL.g:2657:7: lv_args_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getEmitEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"args",
                    	    								lv_args_6_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_7, grammarAccess.getEmitEventAccess().getRightParenthesisKeyword_3_3());
                    			

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
    // $ANTLR end "ruleEmitEvent"


    // $ANTLR start "entryRuleSetVariable"
    // InternalMoniLog4DSL.g:2684:1: entryRuleSetVariable returns [EObject current=null] : iv_ruleSetVariable= ruleSetVariable EOF ;
    public final EObject entryRuleSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVariable = null;


        try {
            // InternalMoniLog4DSL.g:2684:52: (iv_ruleSetVariable= ruleSetVariable EOF )
            // InternalMoniLog4DSL.g:2685:2: iv_ruleSetVariable= ruleSetVariable EOF
            {
             newCompositeNode(grammarAccess.getSetVariableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSetVariable=ruleSetVariable();

            state._fsp--;

             current =iv_ruleSetVariable; 
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
    // $ANTLR end "entryRuleSetVariable"


    // $ANTLR start "ruleSetVariable"
    // InternalMoniLog4DSL.g:2691:1: ruleSetVariable returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleSetVariable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2697:2: ( (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' ) )
            // InternalMoniLog4DSL.g:2698:2: (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' )
            {
            // InternalMoniLog4DSL.g:2698:2: (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' )
            // InternalMoniLog4DSL.g:2699:3: otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVariableAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSetVariableAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoniLog4DSL.g:2707:3: ( (lv_variable_2_0= RULE_STRING ) )
            // InternalMoniLog4DSL.g:2708:4: (lv_variable_2_0= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:2708:4: (lv_variable_2_0= RULE_STRING )
            // InternalMoniLog4DSL.g:2709:5: lv_variable_2_0= RULE_STRING
            {
            lv_variable_2_0=(Token)match(input,RULE_STRING,FOLLOW_41); 

            					newLeafNode(lv_variable_2_0, grammarAccess.getSetVariableAccess().getVariableSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSetVariableRule());
            					}
            					setWithLastConsumed(
            						current,
            						"variable",
            						lv_variable_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_3, grammarAccess.getSetVariableAccess().getCommaKeyword_3());
            		
            // InternalMoniLog4DSL.g:2729:3: ( (lv_value_4_0= ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:2730:4: (lv_value_4_0= ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:2730:4: (lv_value_4_0= ruleLanguageExpression )
            // InternalMoniLog4DSL.g:2731:5: lv_value_4_0= ruleLanguageExpression
            {

            					newCompositeNode(grammarAccess.getSetVariableAccess().getValueLanguageExpressionParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_9);
            lv_value_4_0=ruleLanguageExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetVariableRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_4_0,
            						"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getSetVariableAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleSetVariable"


    // $ANTLR start "entryRuleMoniloggerCall"
    // InternalMoniLog4DSL.g:2756:1: entryRuleMoniloggerCall returns [EObject current=null] : iv_ruleMoniloggerCall= ruleMoniloggerCall EOF ;
    public final EObject entryRuleMoniloggerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniloggerCall = null;


        try {
            // InternalMoniLog4DSL.g:2756:55: (iv_ruleMoniloggerCall= ruleMoniloggerCall EOF )
            // InternalMoniLog4DSL.g:2757:2: iv_ruleMoniloggerCall= ruleMoniloggerCall EOF
            {
             newCompositeNode(grammarAccess.getMoniloggerCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoniloggerCall=ruleMoniloggerCall();

            state._fsp--;

             current =iv_ruleMoniloggerCall; 
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
    // $ANTLR end "entryRuleMoniloggerCall"


    // $ANTLR start "ruleMoniloggerCall"
    // InternalMoniLog4DSL.g:2763:1: ruleMoniloggerCall returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) ;
    public final EObject ruleMoniloggerCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2769:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) )
            // InternalMoniLog4DSL.g:2770:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            {
            // InternalMoniLog4DSL.g:2770:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==44) ) {
                    int LA48_2 = input.LA(3);

                    if ( (LA48_2==47) ) {
                        alt48=1;
                    }
                    else if ( (LA48_2==48) ) {
                        alt48=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 48, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoniLog4DSL.g:2771:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalMoniLog4DSL.g:2771:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    // InternalMoniLog4DSL.g:2772:4: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    {
                    // InternalMoniLog4DSL.g:2772:4: ()
                    // InternalMoniLog4DSL.g:2773:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMoniloggerCallAccess().getStartMoniLoggerAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2779:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoniLog4DSL.g:2780:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:2780:5: (otherlv_1= RULE_ID )
                    // InternalMoniLog4DSL.g:2781:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoniloggerCallRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_1, grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,44,FOLLOW_42); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,47,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoniloggerCallAccess().getStartKeyword_0_3());
                    			
                    // InternalMoniLog4DSL.g:2800:4: (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==14) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2801:5: otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getMoniloggerCallAccess().getLeftParenthesisKeyword_0_4_0());
                            				
                            // InternalMoniLog4DSL.g:2805:5: ( (lv_args_5_0= ruleExpression ) )
                            // InternalMoniLog4DSL.g:2806:6: (lv_args_5_0= ruleExpression )
                            {
                            // InternalMoniLog4DSL.g:2806:6: (lv_args_5_0= ruleExpression )
                            // InternalMoniLog4DSL.g:2807:7: lv_args_5_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0());
                            						
                            pushFollow(FOLLOW_37);
                            lv_args_5_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMoniloggerCallRule());
                            							}
                            							add(
                            								current,
                            								"args",
                            								lv_args_5_0,
                            								"org.gemoc.monilog.MoniLog4DSL.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMoniLog4DSL.g:2824:5: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==20) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalMoniLog4DSL.g:2825:6: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getMoniloggerCallAccess().getCommaKeyword_0_4_2_0());
                            	    					
                            	    // InternalMoniLog4DSL.g:2829:6: ( (lv_args_7_0= ruleExpression ) )
                            	    // InternalMoniLog4DSL.g:2830:7: (lv_args_7_0= ruleExpression )
                            	    {
                            	    // InternalMoniLog4DSL.g:2830:7: (lv_args_7_0= ruleExpression )
                            	    // InternalMoniLog4DSL.g:2831:8: lv_args_7_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_37);
                            	    lv_args_7_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMoniloggerCallRule());
                            	    								}
                            	    								add(
                            	    									current,
                            	    									"args",
                            	    									lv_args_7_0,
                            	    									"org.gemoc.monilog.MoniLog4DSL.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop46;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,15,FOLLOW_2); 

                            					newLeafNode(otherlv_8, grammarAccess.getMoniloggerCallAccess().getRightParenthesisKeyword_0_4_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2856:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    {
                    // InternalMoniLog4DSL.g:2856:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    // InternalMoniLog4DSL.g:2857:4: () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop'
                    {
                    // InternalMoniLog4DSL.g:2857:4: ()
                    // InternalMoniLog4DSL.g:2858:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMoniloggerCallAccess().getStopMoniLoggerAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2864:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMoniLog4DSL.g:2865:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:2865:5: (otherlv_10= RULE_ID )
                    // InternalMoniLog4DSL.g:2866:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoniloggerCallRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_35); 

                    						newLeafNode(otherlv_10, grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,44,FOLLOW_43); 

                    				newLeafNode(otherlv_11, grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_12=(Token)match(input,48,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getMoniloggerCallAccess().getStopKeyword_1_3());
                    			

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
    // $ANTLR end "ruleMoniloggerCall"


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog4DSL.g:2890:1: entryRuleStreamEvent returns [EObject current=null] : iv_ruleStreamEvent= ruleStreamEvent EOF ;
    public final EObject entryRuleStreamEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamEvent = null;


        try {
            // InternalMoniLog4DSL.g:2890:52: (iv_ruleStreamEvent= ruleStreamEvent EOF )
            // InternalMoniLog4DSL.g:2891:2: iv_ruleStreamEvent= ruleStreamEvent EOF
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
    // InternalMoniLog4DSL.g:2897:1: ruleStreamEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? ) ;
    public final EObject ruleStreamEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_values_2_0 = null;

        EObject lv_values_4_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2903:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? ) )
            // InternalMoniLog4DSL.g:2904:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? )
            {
            // InternalMoniLog4DSL.g:2904:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? )
            // InternalMoniLog4DSL.g:2905:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )?
            {
            // InternalMoniLog4DSL.g:2905:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:2906:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:2906:4: (otherlv_0= RULE_ID )
            // InternalMoniLog4DSL.g:2907:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalMoniLog4DSL.g:2918:3: (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==14) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoniLog4DSL.g:2919:4: otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getStreamEventAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMoniLog4DSL.g:2923:4: ( (lv_values_2_0= ruleEmptyOrPropertyValue ) )
                    // InternalMoniLog4DSL.g:2924:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    {
                    // InternalMoniLog4DSL.g:2924:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    // InternalMoniLog4DSL.g:2925:6: lv_values_2_0= ruleEmptyOrPropertyValue
                    {

                    						newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_37);
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

                    // InternalMoniLog4DSL.g:2942:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==20) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2943:5: otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_44); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2947:5: ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    // InternalMoniLog4DSL.g:2948:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    {
                    	    // InternalMoniLog4DSL.g:2948:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    // InternalMoniLog4DSL.g:2949:7: lv_values_4_0= ruleEmptyOrPropertyValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_37);
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
                    	    break loop49;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getStreamEventAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // InternalMoniLog4DSL.g:2976:1: entryRuleEmptyOrPropertyValue returns [EObject current=null] : iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF ;
    public final EObject entryRuleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyOrPropertyValue = null;


        try {
            // InternalMoniLog4DSL.g:2976:61: (iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog4DSL.g:2977:2: iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF
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
    // InternalMoniLog4DSL.g:2983:1: ruleEmptyOrPropertyValue returns [EObject current=null] : ( () | this_PropertyValue_1= rulePropertyValue ) ;
    public final EObject ruleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValue_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2989:2: ( ( () | this_PropertyValue_1= rulePropertyValue ) )
            // InternalMoniLog4DSL.g:2990:2: ( () | this_PropertyValue_1= rulePropertyValue )
            {
            // InternalMoniLog4DSL.g:2990:2: ( () | this_PropertyValue_1= rulePropertyValue )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==EOF||LA51_0==15||LA51_0==20) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ID) ) {
                alt51=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoniLog4DSL.g:2991:3: ()
                    {
                    // InternalMoniLog4DSL.g:2991:3: ()
                    // InternalMoniLog4DSL.g:2992:4: 
                    {

                    				current = forceCreateModelElement(
                    					grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0(),
                    					current);
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2999:3: this_PropertyValue_1= rulePropertyValue
                    {

                    			newCompositeNode(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PropertyValue_1=rulePropertyValue();

                    state._fsp--;


                    			current = this_PropertyValue_1;
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
    // $ANTLR end "ruleEmptyOrPropertyValue"


    // $ANTLR start "entryRuleExpression"
    // InternalMoniLog4DSL.g:3011:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMoniLog4DSL.g:3011:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMoniLog4DSL.g:3012:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMoniLog4DSL.g:3018:1: ruleExpression returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_LanguageExpression_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3024:2: ( (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:3025:2: (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:3025:2: (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_ID) ) {
                int LA52_1 = input.LA(2);

                if ( (LA52_1==EOF||LA52_1==15||LA52_1==20) ) {
                    alt52=1;
                }
                else if ( (LA52_1==14) ) {
                    alt52=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 52, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoniLog4DSL.g:3026:3: this_ParameterReference_0= ruleParameterReference
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getParameterReferenceParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ParameterReference_0=ruleParameterReference();

                    state._fsp--;


                    			current = this_ParameterReference_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3035:3: this_LanguageExpression_1= ruleLanguageExpression
                    {

                    			newCompositeNode(grammarAccess.getExpressionAccess().getLanguageExpressionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_LanguageExpression_1=ruleLanguageExpression();

                    state._fsp--;


                    			current = this_LanguageExpression_1;
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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParameterReference"
    // InternalMoniLog4DSL.g:3047:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // InternalMoniLog4DSL.g:3047:59: (iv_ruleParameterReference= ruleParameterReference EOF )
            // InternalMoniLog4DSL.g:3048:2: iv_ruleParameterReference= ruleParameterReference EOF
            {
             newCompositeNode(grammarAccess.getParameterReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParameterReference=ruleParameterReference();

            state._fsp--;

             current =iv_ruleParameterReference; 
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
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // InternalMoniLog4DSL.g:3054:1: ruleParameterReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3060:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMoniLog4DSL.g:3061:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:3061:2: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:3062:3: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:3062:3: (otherlv_0= RULE_ID )
            // InternalMoniLog4DSL.g:3063:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParameterReferenceRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0());
            			

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
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRulePropertyValue"
    // InternalMoniLog4DSL.g:3077:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalMoniLog4DSL.g:3077:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalMoniLog4DSL.g:3078:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
             newCompositeNode(grammarAccess.getPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;

             current =iv_rulePropertyValue; 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalMoniLog4DSL.g:3084:1: rulePropertyValue returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3090:2: ( ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) ) )
            // InternalMoniLog4DSL.g:3091:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) )
            {
            // InternalMoniLog4DSL.g:3091:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                int LA54_1 = input.LA(2);

                if ( (LA54_1==EOF||LA54_1==15||LA54_1==20||LA54_1==49) ) {
                    alt54=1;
                }
                else if ( (LA54_1==14) ) {
                    alt54=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 54, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoniLog4DSL.g:3092:3: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
                    {
                    // InternalMoniLog4DSL.g:3092:3: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
                    // InternalMoniLog4DSL.g:3093:4: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
                    {
                    // InternalMoniLog4DSL.g:3093:4: ( (lv_id_0_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:3094:5: (lv_id_0_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:3094:5: (lv_id_0_0= RULE_ID )
                    // InternalMoniLog4DSL.g:3095:6: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_45); 

                    						newLeafNode(lv_id_0_0, grammarAccess.getPropertyValueAccess().getIdIDTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPropertyValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"id",
                    							lv_id_0_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:3111:4: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==49) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // InternalMoniLog4DSL.g:3112:5: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_0_1_0());
                            				
                            // InternalMoniLog4DSL.g:3116:5: ( (lv_value_2_0= ruleExpression ) )
                            // InternalMoniLog4DSL.g:3117:6: (lv_value_2_0= ruleExpression )
                            {
                            // InternalMoniLog4DSL.g:3117:6: (lv_value_2_0= ruleExpression )
                            // InternalMoniLog4DSL.g:3118:7: lv_value_2_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getPropertyValueAccess().getValueExpressionParserRuleCall_0_1_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_2_0,
                            								"org.gemoc.monilog.MoniLog4DSL.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3138:3: ( (lv_value_3_0= ruleLanguageExpression ) )
                    {
                    // InternalMoniLog4DSL.g:3138:3: ( (lv_value_3_0= ruleLanguageExpression ) )
                    // InternalMoniLog4DSL.g:3139:4: (lv_value_3_0= ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:3139:4: (lv_value_3_0= ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:3140:5: lv_value_3_0= ruleLanguageExpression
                    {

                    					newCompositeNode(grammarAccess.getPropertyValueAccess().getValueLanguageExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleLanguageExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog4DSL.g:3161:1: entryRuleLanguageExpression returns [EObject current=null] : iv_ruleLanguageExpression= ruleLanguageExpression EOF ;
    public final EObject entryRuleLanguageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageExpression = null;


        try {
            // InternalMoniLog4DSL.g:3161:59: (iv_ruleLanguageExpression= ruleLanguageExpression EOF )
            // InternalMoniLog4DSL.g:3162:2: iv_ruleLanguageExpression= ruleLanguageExpression EOF
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
    // InternalMoniLog4DSL.g:3168:1: ruleLanguageExpression returns [EObject current=null] : ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleLanguageExpression() throws RecognitionException {
        EObject current = null;

        Token lv_languageId_0_0=null;
        Token otherlv_1=null;
        Token lv_expression_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3174:2: ( ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMoniLog4DSL.g:3175:2: ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMoniLog4DSL.g:3175:2: ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMoniLog4DSL.g:3176:3: ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMoniLog4DSL.g:3176:3: ( (lv_languageId_0_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:3177:4: (lv_languageId_0_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:3177:4: (lv_languageId_0_0= RULE_ID )
            // InternalMoniLog4DSL.g:3178:5: lv_languageId_0_0= RULE_ID
            {
            lv_languageId_0_0=(Token)match(input,RULE_ID,FOLLOW_39); 

            					newLeafNode(lv_languageId_0_0, grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"languageId",
            						lv_languageId_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoniLog4DSL.g:3198:3: ( (lv_expression_2_0= RULE_STRING ) )
            // InternalMoniLog4DSL.g:3199:4: (lv_expression_2_0= RULE_STRING )
            {
            // InternalMoniLog4DSL.g:3199:4: (lv_expression_2_0= RULE_STRING )
            // InternalMoniLog4DSL.g:3200:5: lv_expression_2_0= RULE_STRING
            {
            lv_expression_2_0=(Token)match(input,RULE_STRING,FOLLOW_9); 

            					newLeafNode(lv_expression_2_0, grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLanguageExpressionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_3());
            		

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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMoniLog4DSL.g:3224:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMoniLog4DSL.g:3224:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMoniLog4DSL.g:3225:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMoniLog4DSL.g:3231:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3237:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMoniLog4DSL.g:3238:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMoniLog4DSL.g:3238:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMoniLog4DSL.g:3239:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoniLog4DSL.g:3246:3: (kw= '.' this_ID_2= RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==44) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==RULE_ID) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3247:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,44,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_46); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMoniLog4DSL.g:3264:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMoniLog4DSL.g:3264:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMoniLog4DSL.g:3265:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMoniLog4DSL.g:3271:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3277:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMoniLog4DSL.g:3278:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMoniLog4DSL.g:3278:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMoniLog4DSL.g:3279:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMoniLog4DSL.g:3289:3: (kw= '.*' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==50) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMoniLog4DSL.g:3290:4: kw= '.*'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleMoniLoggerAnnotation"
    // InternalMoniLog4DSL.g:3300:1: ruleMoniLoggerAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Inactive' ) ;
    public final Enumerator ruleMoniLoggerAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3306:2: ( (enumLiteral_0= '@Inactive' ) )
            // InternalMoniLog4DSL.g:3307:2: (enumLiteral_0= '@Inactive' )
            {
            // InternalMoniLog4DSL.g:3307:2: (enumLiteral_0= '@Inactive' )
            // InternalMoniLog4DSL.g:3308:3: enumLiteral_0= '@Inactive'
            {
            enumLiteral_0=(Token)match(input,51,FOLLOW_2); 

            			current = grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleMoniLoggerAnnotation"


    // $ANTLR start "ruleAppenderAnnotation"
    // InternalMoniLog4DSL.g:3317:1: ruleAppenderAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Async' ) ;
    public final Enumerator ruleAppenderAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3323:2: ( (enumLiteral_0= '@Async' ) )
            // InternalMoniLog4DSL.g:3324:2: (enumLiteral_0= '@Async' )
            {
            // InternalMoniLog4DSL.g:3324:2: (enumLiteral_0= '@Async' )
            // InternalMoniLog4DSL.g:3325:3: enumLiteral_0= '@Async'
            {
            enumLiteral_0=(Token)match(input,52,FOLLOW_2); 

            			current = grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration().getEnumLiteral().getInstance();
            			newLeafNode(enumLiteral_0, grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration());
            		

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
    // $ANTLR end "ruleAppenderAnnotation"


    // $ANTLR start "ruleLogLevel"
    // InternalMoniLog4DSL.g:3334:1: ruleLogLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) ;
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
            // InternalMoniLog4DSL.g:3340:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) )
            // InternalMoniLog4DSL.g:3341:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            {
            // InternalMoniLog4DSL.g:3341:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            int alt57=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt57=1;
                }
                break;
            case 54:
                {
                alt57=2;
                }
                break;
            case 55:
                {
                alt57=3;
                }
                break;
            case 56:
                {
                alt57=4;
                }
                break;
            case 57:
                {
                alt57=5;
                }
                break;
            case 58:
                {
                alt57=6;
                }
                break;
            case 59:
                {
                alt57=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMoniLog4DSL.g:3342:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalMoniLog4DSL.g:3342:3: (enumLiteral_0= 'INFO' )
                    // InternalMoniLog4DSL.g:3343:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3350:3: (enumLiteral_1= 'CONFIG' )
                    {
                    // InternalMoniLog4DSL.g:3350:3: (enumLiteral_1= 'CONFIG' )
                    // InternalMoniLog4DSL.g:3351:4: enumLiteral_1= 'CONFIG'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:3358:3: (enumLiteral_2= 'FINE' )
                    {
                    // InternalMoniLog4DSL.g:3358:3: (enumLiteral_2= 'FINE' )
                    // InternalMoniLog4DSL.g:3359:4: enumLiteral_2= 'FINE'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:3366:3: (enumLiteral_3= 'FINER' )
                    {
                    // InternalMoniLog4DSL.g:3366:3: (enumLiteral_3= 'FINER' )
                    // InternalMoniLog4DSL.g:3367:4: enumLiteral_3= 'FINER'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:3374:3: (enumLiteral_4= 'FINEST' )
                    {
                    // InternalMoniLog4DSL.g:3374:3: (enumLiteral_4= 'FINEST' )
                    // InternalMoniLog4DSL.g:3375:4: enumLiteral_4= 'FINEST'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog4DSL.g:3382:3: (enumLiteral_5= 'SEVERE' )
                    {
                    // InternalMoniLog4DSL.g:3382:3: (enumLiteral_5= 'SEVERE' )
                    // InternalMoniLog4DSL.g:3383:4: enumLiteral_5= 'SEVERE'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog4DSL.g:3390:3: (enumLiteral_6= 'WARNING' )
                    {
                    // InternalMoniLog4DSL.g:3390:3: (enumLiteral_6= 'WARNING' )
                    // InternalMoniLog4DSL.g:3391:4: enumLiteral_6= 'WARNING'
                    {
                    enumLiteral_6=(Token)match(input,59,FOLLOW_2); 

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


    // $ANTLR start "ruleTemporalPatternKind"
    // InternalMoniLog4DSL.g:3401:1: ruleTemporalPatternKind returns [Enumerator current=null] : ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) ;
    public final Enumerator ruleTemporalPatternKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3407:2: ( ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) )
            // InternalMoniLog4DSL.g:3408:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            {
            // InternalMoniLog4DSL.g:3408:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            int alt58=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt58=1;
                }
                break;
            case 61:
                {
                alt58=2;
                }
                break;
            case 62:
                {
                alt58=3;
                }
                break;
            case 63:
                {
                alt58=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalMoniLog4DSL.g:3409:3: (enumLiteral_0= 'S' )
                    {
                    // InternalMoniLog4DSL.g:3409:3: (enumLiteral_0= 'S' )
                    // InternalMoniLog4DSL.g:3410:4: enumLiteral_0= 'S'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3417:3: (enumLiteral_1= 'V' )
                    {
                    // InternalMoniLog4DSL.g:3417:3: (enumLiteral_1= 'V' )
                    // InternalMoniLog4DSL.g:3418:4: enumLiteral_1= 'V'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:3425:3: (enumLiteral_2= 'nS' )
                    {
                    // InternalMoniLog4DSL.g:3425:3: (enumLiteral_2= 'nS' )
                    // InternalMoniLog4DSL.g:3426:4: enumLiteral_2= 'nS'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:3433:3: (enumLiteral_3= 'nV' )
                    {
                    // InternalMoniLog4DSL.g:3433:3: (enumLiteral_3= 'nV' )
                    // InternalMoniLog4DSL.g:3434:4: enumLiteral_3= 'nV'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3());
                    			

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
    // $ANTLR end "ruleTemporalPatternKind"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\5\3\uffff\1\5\3\uffff";
    static final String dfa_3s = "\1\15\1\uffff\1\4\1\15\1\4\1\uffff\1\17\1\15\1\4\2\17";
    static final String dfa_4s = "\1\64\1\uffff\1\4\1\64\1\17\1\uffff\1\24\1\64\1\4\1\25\1\17";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\46\uffff\1\1",
            "",
            "\1\3",
            "\1\5\1\4\1\uffff\1\1\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5\24\uffff\2\5",
            "\1\6\12\uffff\1\7",
            "",
            "\1\7\4\uffff\1\10",
            "\1\5\2\uffff\1\1\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5\24\uffff\2\5",
            "\1\11",
            "\1\7\4\uffff\1\10\1\12",
            "\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "308:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )";
        }
    }
    static final String dfa_8s = "\2\uffff\1\5\4\uffff\1\5\3\uffff";
    static final String dfa_9s = "\1\23\1\4\1\15\1\4\2\uffff\1\17\1\15\1\4\2\17";
    static final String dfa_10s = "\1\23\1\4\1\64\1\17\2\uffff\1\24\1\64\1\4\1\25\1\17";
    static final String dfa_11s = "\4\uffff\1\1\1\2\5\uffff";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\5\1\3\1\uffff\1\4\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5\24\uffff\2\5",
            "\1\6\12\uffff\1\7",
            "",
            "",
            "\1\7\4\uffff\1\10",
            "\1\5\2\uffff\1\4\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5\24\uffff\2\5",
            "\1\11",
            "\1\7\4\uffff\1\10\1\12",
            "\1\7"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "555:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )";
        }
    }
    static final String dfa_13s = "\34\uffff";
    static final String dfa_14s = "\2\uffff\1\1\6\uffff\1\1\22\uffff";
    static final String dfa_15s = "\1\4\1\uffff\1\16\2\uffff\1\4\2\uffff\1\4\1\22\2\16\1\4\2\6\1\4\1\16\2\17\1\16\1\6\2\17\1\6\4\17";
    static final String dfa_16s = "\1\47\1\uffff\1\51\2\uffff\1\24\2\uffff\1\24\1\51\2\61\1\4\2\6\1\4\1\24\2\17\1\24\1\6\2\24\1\6\2\17\2\24";
    static final String dfa_17s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\5\1\4\24\uffff";
    static final String dfa_18s = "\34\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\1\33\uffff\1\1\1\3\1\4\2\uffff\2\1",
            "",
            "\1\5\3\uffff\1\1\14\uffff\2\1\3\uffff\1\7\1\6\2\uffff\2\1",
            "",
            "",
            "\1\12\12\uffff\1\11\4\uffff\1\10",
            "",
            "",
            "\1\13\12\uffff\1\11\4\uffff\1\10",
            "\1\1\14\uffff\2\1\3\uffff\1\7\1\6\2\uffff\2\1",
            "\1\15\1\11\4\uffff\1\10\34\uffff\1\14",
            "\1\16\1\11\4\uffff\1\10\34\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\1\11\4\uffff\1\10",
            "\1\25",
            "\1\26",
            "\1\27\1\11\4\uffff\1\10",
            "\1\30",
            "\1\11\4\uffff\1\10",
            "\1\11\4\uffff\1\10",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\11\4\uffff\1\10",
            "\1\11\4\uffff\1\10"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1670:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )";
        }
    }
    static final String dfa_20s = "\35\uffff";
    static final String dfa_21s = "\1\1\4\uffff\1\7\4\uffff\1\7\22\uffff";
    static final String dfa_22s = "\1\22\1\uffff\1\4\2\uffff\1\16\1\4\2\uffff\1\4\1\22\2\16\1\6\1\4\1\6\1\4\1\17\1\16\1\17\1\16\1\17\1\6\1\17\1\6\4\17";
    static final String dfa_23s = "\1\51\1\uffff\1\4\2\uffff\1\53\1\24\2\uffff\1\24\1\53\2\61\1\6\1\4\1\6\1\4\1\17\1\24\1\17\2\24\1\6\1\24\1\6\2\17\2\24";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\2\1\5\24\uffff";
    static final String dfa_25s = "\35\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\14\uffff\1\3\1\2\7\uffff\1\1\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\6\3\uffff\1\7\30\uffff\1\10",
            "\1\13\12\uffff\1\12\4\uffff\1\11",
            "",
            "",
            "\1\14\12\uffff\1\12\4\uffff\1\11",
            "\1\7\30\uffff\1\10",
            "\1\15\1\12\4\uffff\1\11\34\uffff\1\16",
            "\1\17\1\12\4\uffff\1\11\34\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26\1\12\4\uffff\1\11",
            "\1\27",
            "\1\30\1\12\4\uffff\1\11",
            "\1\12\4\uffff\1\11",
            "\1\31",
            "\1\12\4\uffff\1\11",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\12\4\uffff\1\11",
            "\1\12\4\uffff\1\11"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2074:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0018000070483002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0018000070482002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0010000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0008000000400000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000814000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000810000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0FE0000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0xF000000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000CE00000030L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000030180000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000000C000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000108000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000108010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0004000000000002L});

}
