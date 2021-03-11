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
import org.gemoc.monilog.services.MoniLogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMoniLogParser extends AbstractInternalAntlrParser {
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


        public InternalMoniLogParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMoniLogParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMoniLogParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMoniLog.g"; }



     	private MoniLogGrammarAccess grammarAccess;

        public InternalMoniLogParser(TokenStream input, MoniLogGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Document";
       	}

       	@Override
       	protected MoniLogGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDocument"
    // InternalMoniLog.g:65:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;


        try {
            // InternalMoniLog.g:65:49: (iv_ruleDocument= ruleDocument EOF )
            // InternalMoniLog.g:66:2: iv_ruleDocument= ruleDocument EOF
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
    // InternalMoniLog.g:72:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) ;
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
            // InternalMoniLog.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) )
            // InternalMoniLog.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            {
            // InternalMoniLog.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            // InternalMoniLog.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getPackageKeyword_0());
            		
            // InternalMoniLog.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMoniLog.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMoniLog.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMoniLog.g:86:5: lv_name_1_0= ruleQualifiedName
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
            						"org.gemoc.monilog.MoniLog.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog.g:103:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMoniLog.g:104:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalMoniLog.g:104:4: (lv_imports_2_0= ruleImport )
            	    // InternalMoniLog.g:105:5: lv_imports_2_0= ruleImport
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
            	    						"org.gemoc.monilog.MoniLog.Import");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMoniLog.g:122:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            // InternalMoniLog.g:123:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            {
            // InternalMoniLog.g:123:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            // InternalMoniLog.g:124:5: ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            				
            // InternalMoniLog.g:127:5: ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* )
            // InternalMoniLog.g:128:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*
            {
            // InternalMoniLog.g:128:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*
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
            	    // InternalMoniLog.g:129:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:129:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
            	    // InternalMoniLog.g:130:5: {...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoniLog.g:130:105: ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
            	    // InternalMoniLog.g:131:6: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoniLog.g:134:9: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
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
            	    	    // InternalMoniLog.g:134:10: {...}? => ( (lv_events_4_0= ruleEvent ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:134:19: ( (lv_events_4_0= ruleEvent ) )
            	    	    // InternalMoniLog.g:134:20: (lv_events_4_0= ruleEvent )
            	    	    {
            	    	    // InternalMoniLog.g:134:20: (lv_events_4_0= ruleEvent )
            	    	    // InternalMoniLog.g:135:10: lv_events_4_0= ruleEvent
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
            	    	    											"org.gemoc.monilog.MoniLog.Event");
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
            	    // InternalMoniLog.g:157:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:157:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
            	    // InternalMoniLog.g:158:5: {...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoniLog.g:158:105: ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
            	    // InternalMoniLog.g:159:6: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoniLog.g:162:9: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
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
            	    	    // InternalMoniLog.g:162:10: {...}? => ( (lv_appenders_5_0= ruleAppender ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:162:19: ( (lv_appenders_5_0= ruleAppender ) )
            	    	    // InternalMoniLog.g:162:20: (lv_appenders_5_0= ruleAppender )
            	    	    {
            	    	    // InternalMoniLog.g:162:20: (lv_appenders_5_0= ruleAppender )
            	    	    // InternalMoniLog.g:163:10: lv_appenders_5_0= ruleAppender
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
            	    	    											"org.gemoc.monilog.MoniLog.Appender");
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
            	    // InternalMoniLog.g:185:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:185:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
            	    // InternalMoniLog.g:186:5: {...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoniLog.g:186:105: ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
            	    // InternalMoniLog.g:187:6: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoniLog.g:190:9: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
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
            	    	    // InternalMoniLog.g:190:10: {...}? => ( (lv_layouts_6_0= ruleLayout ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:190:19: ( (lv_layouts_6_0= ruleLayout ) )
            	    	    // InternalMoniLog.g:190:20: (lv_layouts_6_0= ruleLayout )
            	    	    {
            	    	    // InternalMoniLog.g:190:20: (lv_layouts_6_0= ruleLayout )
            	    	    // InternalMoniLog.g:191:10: lv_layouts_6_0= ruleLayout
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
            	    	    											"org.gemoc.monilog.MoniLog.Layout");
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
            	    // InternalMoniLog.g:213:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:213:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
            	    // InternalMoniLog.g:214:5: {...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoniLog.g:214:105: ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
            	    // InternalMoniLog.g:215:6: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMoniLog.g:218:9: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
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
            	    	    // InternalMoniLog.g:218:10: {...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:218:19: ( (lv_moniloggers_7_0= ruleMoniLogger ) )
            	    	    // InternalMoniLog.g:218:20: (lv_moniloggers_7_0= ruleMoniLogger )
            	    	    {
            	    	    // InternalMoniLog.g:218:20: (lv_moniloggers_7_0= ruleMoniLogger )
            	    	    // InternalMoniLog.g:219:10: lv_moniloggers_7_0= ruleMoniLogger
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
            	    	    											"org.gemoc.monilog.MoniLog.MoniLogger");
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
    // InternalMoniLog.g:252:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMoniLog.g:252:47: (iv_ruleImport= ruleImport EOF )
            // InternalMoniLog.g:253:2: iv_ruleImport= ruleImport EOF
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
    // InternalMoniLog.g:259:1: ruleImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:265:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalMoniLog.g:266:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalMoniLog.g:266:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalMoniLog.g:267:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0());
            		
            // InternalMoniLog.g:271:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalMoniLog.g:272:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalMoniLog.g:272:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalMoniLog.g:273:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
            						"org.gemoc.monilog.MoniLog.QualifiedNameWithWildcard");
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
    // InternalMoniLog.g:294:1: entryRuleAppender returns [EObject current=null] : iv_ruleAppender= ruleAppender EOF ;
    public final EObject entryRuleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppender = null;


        try {
            // InternalMoniLog.g:294:49: (iv_ruleAppender= ruleAppender EOF )
            // InternalMoniLog.g:295:2: iv_ruleAppender= ruleAppender EOF
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
    // InternalMoniLog.g:301:1: ruleAppender returns [EObject current=null] : (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) ;
    public final EObject ruleAppender() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAppender_0 = null;

        EObject this_ExternalAppender_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:307:2: ( (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) )
            // InternalMoniLog.g:308:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            {
            // InternalMoniLog.g:308:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMoniLog.g:309:3: this_LocalAppender_0= ruleLocalAppender
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
                    // InternalMoniLog.g:318:3: this_ExternalAppender_1= ruleExternalAppender
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
    // InternalMoniLog.g:330:1: entryRuleLocalAppender returns [EObject current=null] : iv_ruleLocalAppender= ruleLocalAppender EOF ;
    public final EObject entryRuleLocalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAppender = null;


        try {
            // InternalMoniLog.g:330:54: (iv_ruleLocalAppender= ruleLocalAppender EOF )
            // InternalMoniLog.g:331:2: iv_ruleLocalAppender= ruleLocalAppender EOF
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
    // InternalMoniLog.g:337:1: ruleLocalAppender returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' ) ;
    public final EObject ruleLocalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Enumerator lv_annotations_0_0 = null;

        EObject lv_parameterDecl_4_0 = null;

        EObject lv_calls_7_0 = null;

        EObject lv_calls_9_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:343:2: ( ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' ) )
            // InternalMoniLog.g:344:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' )
            {
            // InternalMoniLog.g:344:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' )
            // InternalMoniLog.g:345:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}'
            {
            // InternalMoniLog.g:345:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==52) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMoniLog.g:346:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    {
            	    // InternalMoniLog.g:346:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    // InternalMoniLog.g:347:5: lv_annotations_0_0= ruleAppenderAnnotation
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
            	    						"org.gemoc.monilog.MoniLog.AppenderAnnotation");
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
            		
            // InternalMoniLog.g:368:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog.g:369:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog.g:369:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog.g:370:5: lv_name_2_0= RULE_ID
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

            // InternalMoniLog.g:386:3: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==14) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoniLog.g:387:4: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog.g:391:4: ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:392:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:392:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:393:6: lv_parameterDecl_4_0= ruleParameterDeclVarArgs
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
                    							"org.gemoc.monilog.MoniLog.ParameterDeclVarArgs");
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
            		
            // InternalMoniLog.g:419:3: ( (lv_calls_7_0= ruleAppenderCall ) )
            // InternalMoniLog.g:420:4: (lv_calls_7_0= ruleAppenderCall )
            {
            // InternalMoniLog.g:420:4: (lv_calls_7_0= ruleAppenderCall )
            // InternalMoniLog.g:421:5: lv_calls_7_0= ruleAppenderCall
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
            						"org.gemoc.monilog.MoniLog.AppenderCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog.g:438:3: (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==17) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==RULE_ID) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalMoniLog.g:439:4: otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) )
            	    {
            	    otherlv_8=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_8, grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0());
            	    			
            	    // InternalMoniLog.g:443:4: ( (lv_calls_9_0= ruleAppenderCall ) )
            	    // InternalMoniLog.g:444:5: (lv_calls_9_0= ruleAppenderCall )
            	    {
            	    // InternalMoniLog.g:444:5: (lv_calls_9_0= ruleAppenderCall )
            	    // InternalMoniLog.g:445:6: lv_calls_9_0= ruleAppenderCall
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
            	    							"org.gemoc.monilog.MoniLog.AppenderCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMoniLog.g:463:3: (otherlv_10= ';' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMoniLog.g:464:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_7());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMoniLog.g:477:1: entryRuleExternalAppender returns [EObject current=null] : iv_ruleExternalAppender= ruleExternalAppender EOF ;
    public final EObject entryRuleExternalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAppender = null;


        try {
            // InternalMoniLog.g:477:57: (iv_ruleExternalAppender= ruleExternalAppender EOF )
            // InternalMoniLog.g:478:2: iv_ruleExternalAppender= ruleExternalAppender EOF
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
    // InternalMoniLog.g:484:1: ruleExternalAppender returns [EObject current=null] : (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleExternalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDecl_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:490:2: ( (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) )
            // InternalMoniLog.g:491:2: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            {
            // InternalMoniLog.g:491:2: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            // InternalMoniLog.g:492:3: otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0());
            		
            // InternalMoniLog.g:496:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog.g:497:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog.g:497:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog.g:498:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMoniLog.g:514:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==14) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoniLog.g:515:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog.g:519:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:520:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:520:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:521:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
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
                    							"org.gemoc.monilog.MoniLog.ParameterDeclVarArgs");
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
    // InternalMoniLog.g:547:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMoniLog.g:547:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMoniLog.g:548:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalMoniLog.g:554:1: ruleLayout returns [EObject current=null] : (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LocalLayout_0 = null;

        EObject this_ExternalLayout_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:560:2: ( (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) )
            // InternalMoniLog.g:561:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            {
            // InternalMoniLog.g:561:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            int alt13=2;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalMoniLog.g:562:3: this_LocalLayout_0= ruleLocalLayout
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
                    // InternalMoniLog.g:571:3: this_ExternalLayout_1= ruleExternalLayout
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
    // InternalMoniLog.g:583:1: entryRuleLocalLayout returns [EObject current=null] : iv_ruleLocalLayout= ruleLocalLayout EOF ;
    public final EObject entryRuleLocalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalLayout = null;


        try {
            // InternalMoniLog.g:583:52: (iv_ruleLocalLayout= ruleLocalLayout EOF )
            // InternalMoniLog.g:584:2: iv_ruleLocalLayout= ruleLocalLayout EOF
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
    // InternalMoniLog.g:590:1: ruleLocalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' ) ;
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
            // InternalMoniLog.g:596:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' ) )
            // InternalMoniLog.g:597:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' )
            {
            // InternalMoniLog.g:597:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' )
            // InternalMoniLog.g:598:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMoniLog.g:602:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog.g:603:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog.g:603:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog.g:604:5: lv_name_1_0= RULE_ID
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

            // InternalMoniLog.g:620:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoniLog.g:621:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog.g:625:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:626:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:626:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:627:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
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
                    							"org.gemoc.monilog.MoniLog.ParameterDeclVarArgs");
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
            		
            // InternalMoniLog.g:653:3: ( (lv_call_6_0= ruleLayoutCall ) )
            // InternalMoniLog.g:654:4: (lv_call_6_0= ruleLayoutCall )
            {
            // InternalMoniLog.g:654:4: (lv_call_6_0= ruleLayoutCall )
            // InternalMoniLog.g:655:5: lv_call_6_0= ruleLayoutCall
            {

            					newCompositeNode(grammarAccess.getLocalLayoutAccess().getCallLayoutCallParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_call_6_0=ruleLayoutCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalLayoutRule());
            					}
            					set(
            						current,
            						"call",
            						lv_call_6_0,
            						"org.gemoc.monilog.MoniLog.LayoutCall");
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
    // InternalMoniLog.g:680:1: entryRuleExternalLayout returns [EObject current=null] : iv_ruleExternalLayout= ruleExternalLayout EOF ;
    public final EObject entryRuleExternalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLayout = null;


        try {
            // InternalMoniLog.g:680:55: (iv_ruleExternalLayout= ruleExternalLayout EOF )
            // InternalMoniLog.g:681:2: iv_ruleExternalLayout= ruleExternalLayout EOF
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
    // InternalMoniLog.g:687:1: ruleExternalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleExternalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDecl_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:693:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) )
            // InternalMoniLog.g:694:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            {
            // InternalMoniLog.g:694:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            // InternalMoniLog.g:695:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMoniLog.g:699:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog.g:700:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog.g:700:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog.g:701:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMoniLog.g:717:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==14) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoniLog.g:718:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog.g:722:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:723:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:723:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:724:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
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
                    							"org.gemoc.monilog.MoniLog.ParameterDeclVarArgs");
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
    // InternalMoniLog.g:750:1: entryRuleParameterDeclVarArgs returns [EObject current=null] : iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF ;
    public final EObject entryRuleParameterDeclVarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclVarArgs = null;


        try {
            // InternalMoniLog.g:750:61: (iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF )
            // InternalMoniLog.g:751:2: iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF
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
    // InternalMoniLog.g:757:1: ruleParameterDeclVarArgs returns [EObject current=null] : ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? ) ;
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
            // InternalMoniLog.g:763:2: ( ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? ) )
            // InternalMoniLog.g:764:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? )
            {
            // InternalMoniLog.g:764:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? )
            // InternalMoniLog.g:765:3: () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )?
            {
            // InternalMoniLog.g:765:3: ()
            // InternalMoniLog.g:766:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDeclVarArgsAccess().getParameterDeclAction_0(),
            					current);
            			

            }

            // InternalMoniLog.g:772:3: ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoniLog.g:773:4: ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )?
                    {
                    // InternalMoniLog.g:773:4: ( (lv_parameters_1_0= ruleParameter ) )
                    // InternalMoniLog.g:774:5: (lv_parameters_1_0= ruleParameter )
                    {
                    // InternalMoniLog.g:774:5: (lv_parameters_1_0= ruleParameter )
                    // InternalMoniLog.g:775:6: lv_parameters_1_0= ruleParameter
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
                    							"org.gemoc.monilog.MoniLog.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:792:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==20) ) {
                            int LA16_1 = input.LA(2);

                            if ( (LA16_1==RULE_ID) ) {
                                int LA16_3 = input.LA(3);

                                if ( (LA16_3==EOF||LA16_3==15||LA16_3==20) ) {
                                    alt16=1;
                                }


                            }


                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMoniLog.g:793:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMoniLog.g:797:5: ( (lv_parameters_3_0= ruleParameter ) )
                    	    // InternalMoniLog.g:798:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog.g:798:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalMoniLog.g:799:7: lv_parameters_3_0= ruleParameter
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
                    	    								"org.gemoc.monilog.MoniLog.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    // InternalMoniLog.g:817:4: (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==20) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalMoniLog.g:818:5: otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...'
                            {
                            otherlv_4=(Token)match(input,20,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_2_0());
                            				
                            // InternalMoniLog.g:822:5: ( (lv_varArgs_5_0= ruleParameter ) )
                            // InternalMoniLog.g:823:6: (lv_varArgs_5_0= ruleParameter )
                            {
                            // InternalMoniLog.g:823:6: (lv_varArgs_5_0= ruleParameter )
                            // InternalMoniLog.g:824:7: lv_varArgs_5_0= ruleParameter
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
                            								"org.gemoc.monilog.MoniLog.Parameter");
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
    // InternalMoniLog.g:851:1: entryRuleParameterDeclNoVarArgs returns [EObject current=null] : iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF ;
    public final EObject entryRuleParameterDeclNoVarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclNoVarArgs = null;


        try {
            // InternalMoniLog.g:851:63: (iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF )
            // InternalMoniLog.g:852:2: iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF
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
    // InternalMoniLog.g:858:1: ruleParameterDeclNoVarArgs returns [EObject current=null] : ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? ) ;
    public final EObject ruleParameterDeclNoVarArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:864:2: ( ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? ) )
            // InternalMoniLog.g:865:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? )
            {
            // InternalMoniLog.g:865:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? )
            // InternalMoniLog.g:866:3: () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )?
            {
            // InternalMoniLog.g:866:3: ()
            // InternalMoniLog.g:867:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getParameterDeclNoVarArgsAccess().getParameterDeclAction_0(),
            					current);
            			

            }

            // InternalMoniLog.g:873:3: ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMoniLog.g:874:4: ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    {
                    // InternalMoniLog.g:874:4: ( (lv_parameters_1_0= ruleParameter ) )
                    // InternalMoniLog.g:875:5: (lv_parameters_1_0= ruleParameter )
                    {
                    // InternalMoniLog.g:875:5: (lv_parameters_1_0= ruleParameter )
                    // InternalMoniLog.g:876:6: lv_parameters_1_0= ruleParameter
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
                    							"org.gemoc.monilog.MoniLog.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:893:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==20) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // InternalMoniLog.g:894:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getParameterDeclNoVarArgsAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMoniLog.g:898:5: ( (lv_parameters_3_0= ruleParameter ) )
                    	    // InternalMoniLog.g:899:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog.g:899:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalMoniLog.g:900:7: lv_parameters_3_0= ruleParameter
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
                    	    								"org.gemoc.monilog.MoniLog.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
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
    // InternalMoniLog.g:923:1: entryRuleMoniLogger returns [EObject current=null] : iv_ruleMoniLogger= ruleMoniLogger EOF ;
    public final EObject entryRuleMoniLogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLogger = null;


        try {
            // InternalMoniLog.g:923:51: (iv_ruleMoniLogger= ruleMoniLogger EOF )
            // InternalMoniLog.g:924:2: iv_ruleMoniLogger= ruleMoniLogger EOF
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
    // InternalMoniLog.g:930:1: ruleMoniLogger returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' ) ;
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
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_annotations_0_0 = null;

        EObject lv_parameterDecl_4_0 = null;

        Enumerator lv_level_7_0 = null;

        EObject lv_streamEvent_11_0 = null;

        EObject lv_conditions_14_0 = null;

        EObject lv_conditions_16_0 = null;

        EObject lv_actions_21_0 = null;

        EObject lv_actions_23_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:936:2: ( ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' ) )
            // InternalMoniLog.g:937:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' )
            {
            // InternalMoniLog.g:937:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' )
            // InternalMoniLog.g:938:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}'
            {
            // InternalMoniLog.g:938:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==51) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMoniLog.g:939:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    {
            	    // InternalMoniLog.g:939:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    // InternalMoniLog.g:940:5: lv_annotations_0_0= ruleMoniLoggerAnnotation
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
            	    						"org.gemoc.monilog.MoniLog.MoniLoggerAnnotation");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_1=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1());
            		
            // InternalMoniLog.g:961:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog.g:962:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog.g:962:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog.g:963:5: lv_name_2_0= RULE_ID
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

            // InternalMoniLog.g:979:3: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoniLog.g:980:4: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_8); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog.g:984:4: ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:985:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:985:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:986:6: lv_parameterDecl_4_0= ruleParameterDeclVarArgs
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
                    							"org.gemoc.monilog.MoniLog.ParameterDeclVarArgs");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_18); 

                    				newLeafNode(otherlv_5, grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_2());
                    			

                    }
                    break;

            }

            // InternalMoniLog.g:1008:3: (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog.g:1009:4: otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,23,FOLLOW_19); 

                    				newLeafNode(otherlv_6, grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMoniLog.g:1013:4: ( (lv_level_7_0= ruleLogLevel ) )
                    // InternalMoniLog.g:1014:5: (lv_level_7_0= ruleLogLevel )
                    {
                    // InternalMoniLog.g:1014:5: (lv_level_7_0= ruleLogLevel )
                    // InternalMoniLog.g:1015:6: lv_level_7_0= ruleLogLevel
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
                    							"org.gemoc.monilog.MoniLog.LogLevel");
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
            		
            // InternalMoniLog.g:1045:3: ( (lv_streamEvent_11_0= ruleStreamEvent ) )
            // InternalMoniLog.g:1046:4: (lv_streamEvent_11_0= ruleStreamEvent )
            {
            // InternalMoniLog.g:1046:4: (lv_streamEvent_11_0= ruleStreamEvent )
            // InternalMoniLog.g:1047:5: lv_streamEvent_11_0= ruleStreamEvent
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
            						"org.gemoc.monilog.MoniLog.StreamEvent");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog.g:1064:3: (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==26) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMoniLog.g:1065:4: otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}'
                    {
                    otherlv_12=(Token)match(input,26,FOLLOW_10); 

                    				newLeafNode(otherlv_12, grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0());
                    			
                    otherlv_13=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_13, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMoniLog.g:1073:4: ( (lv_conditions_14_0= ruleCondition ) )
                    // InternalMoniLog.g:1074:5: (lv_conditions_14_0= ruleCondition )
                    {
                    // InternalMoniLog.g:1074:5: (lv_conditions_14_0= ruleCondition )
                    // InternalMoniLog.g:1075:6: lv_conditions_14_0= ruleCondition
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
                    							"org.gemoc.monilog.MoniLog.Condition");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:1092:4: (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            int LA24_1 = input.LA(2);

                            if ( (LA24_1==RULE_ID) ) {
                                alt24=1;
                            }


                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMoniLog.g:1093:5: otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_15, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0());
                    	    				
                    	    // InternalMoniLog.g:1097:5: ( (lv_conditions_16_0= ruleCondition ) )
                    	    // InternalMoniLog.g:1098:6: (lv_conditions_16_0= ruleCondition )
                    	    {
                    	    // InternalMoniLog.g:1098:6: (lv_conditions_16_0= ruleCondition )
                    	    // InternalMoniLog.g:1099:7: lv_conditions_16_0= ruleCondition
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
                    	    								"org.gemoc.monilog.MoniLog.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    // InternalMoniLog.g:1117:4: (otherlv_17= ';' )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==17) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalMoniLog.g:1118:5: otherlv_17= ';'
                            {
                            otherlv_17=(Token)match(input,17,FOLLOW_12); 

                            					newLeafNode(otherlv_17, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_4());
                            				

                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,18,FOLLOW_23); 

                    				newLeafNode(otherlv_18, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_5());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,27,FOLLOW_10); 

            			newLeafNode(otherlv_19, grammarAccess.getMoniLoggerAccess().getActionsKeyword_9());
            		
            otherlv_20=(Token)match(input,16,FOLLOW_24); 

            			newLeafNode(otherlv_20, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMoniLog.g:1136:3: ( (lv_actions_21_0= ruleAction ) )
            // InternalMoniLog.g:1137:4: (lv_actions_21_0= ruleAction )
            {
            // InternalMoniLog.g:1137:4: (lv_actions_21_0= ruleAction )
            // InternalMoniLog.g:1138:5: lv_actions_21_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_actions_21_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
            					}
            					add(
            						current,
            						"actions",
            						lv_actions_21_0,
            						"org.gemoc.monilog.MoniLog.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog.g:1155:3: (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==17) ) {
                    int LA27_1 = input.LA(2);

                    if ( (LA27_1==RULE_ID||LA27_1==46) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoniLog.g:1156:4: otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) )
            	    {
            	    otherlv_22=(Token)match(input,17,FOLLOW_24); 

            	    				newLeafNode(otherlv_22, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0());
            	    			
            	    // InternalMoniLog.g:1160:4: ( (lv_actions_23_0= ruleAction ) )
            	    // InternalMoniLog.g:1161:5: (lv_actions_23_0= ruleAction )
            	    {
            	    // InternalMoniLog.g:1161:5: (lv_actions_23_0= ruleAction )
            	    // InternalMoniLog.g:1162:6: lv_actions_23_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_actions_23_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_23_0,
            	    							"org.gemoc.monilog.MoniLog.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalMoniLog.g:1180:3: (otherlv_24= ';' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==17) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMoniLog.g:1181:4: otherlv_24= ';'
                    {
                    otherlv_24=(Token)match(input,17,FOLLOW_12); 

                    				newLeafNode(otherlv_24, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_13());
                    			

                    }
                    break;

            }

            otherlv_25=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14());
            		
            otherlv_26=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_15());
            		

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
    // InternalMoniLog.g:1198:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMoniLog.g:1198:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMoniLog.g:1199:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMoniLog.g:1205:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:1211:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMoniLog.g:1212:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMoniLog.g:1212:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMoniLog.g:1213:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMoniLog.g:1213:3: (lv_name_0_0= RULE_ID )
            // InternalMoniLog.g:1214:4: lv_name_0_0= RULE_ID
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
    // InternalMoniLog.g:1233:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMoniLog.g:1233:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMoniLog.g:1234:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalMoniLog.g:1240:1: ruleEvent returns [EObject current=null] : ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) ) ;
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
            // InternalMoniLog.g:1246:2: ( ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) ) )
            // InternalMoniLog.g:1247:2: ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) )
            {
            // InternalMoniLog.g:1247:2: ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) )
            int alt33=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt33=1;
                }
                break;
            case 29:
                {
                alt33=2;
                }
                break;
            case 30:
                {
                alt33=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalMoniLog.g:1248:3: ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' )
                    {
                    // InternalMoniLog.g:1248:3: ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' )
                    // InternalMoniLog.g:1249:4: () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}'
                    {
                    // InternalMoniLog.g:1249:4: ()
                    // InternalMoniLog.g:1250:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getASTEventAction_0_0(),
                    						current);
                    				

                    }

                    otherlv_1=(Token)match(input,28,FOLLOW_3); 

                    				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getCallKeyword_0_1());
                    			
                    // InternalMoniLog.g:1260:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalMoniLog.g:1261:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1261:5: (lv_name_2_0= RULE_ID )
                    // InternalMoniLog.g:1262:6: lv_name_2_0= RULE_ID
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

                    // InternalMoniLog.g:1278:4: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==14) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // InternalMoniLog.g:1279:5: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_3_0());
                            				
                            // InternalMoniLog.g:1283:5: ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog.g:1284:6: (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog.g:1284:6: (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog.g:1285:7: lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs
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
                            								"org.gemoc.monilog.MoniLog.ParameterDeclNoVarArgs");
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
                    			
                    // InternalMoniLog.g:1311:4: ( (lv_kind_7_0= ruleASTEventKind ) )
                    // InternalMoniLog.g:1312:5: (lv_kind_7_0= ruleASTEventKind )
                    {
                    // InternalMoniLog.g:1312:5: (lv_kind_7_0= ruleASTEventKind )
                    // InternalMoniLog.g:1313:6: lv_kind_7_0= ruleASTEventKind
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
                    							"org.gemoc.monilog.MoniLog.ASTEventKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:1330:4: ( (lv_ruleID_8_0= RULE_ID ) )
                    // InternalMoniLog.g:1331:5: (lv_ruleID_8_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1331:5: (lv_ruleID_8_0= RULE_ID )
                    // InternalMoniLog.g:1332:6: lv_ruleID_8_0= RULE_ID
                    {
                    lv_ruleID_8_0=(Token)match(input,RULE_ID,FOLLOW_12); 

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
                    // InternalMoniLog.g:1354:3: ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' )
                    {
                    // InternalMoniLog.g:1354:3: ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' )
                    // InternalMoniLog.g:1355:4: () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}'
                    {
                    // InternalMoniLog.g:1355:4: ()
                    // InternalMoniLog.g:1356:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getComplexEventAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_11=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getComplexKeyword_1_1());
                    			
                    // InternalMoniLog.g:1366:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalMoniLog.g:1367:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1367:5: (lv_name_12_0= RULE_ID )
                    // InternalMoniLog.g:1368:6: lv_name_12_0= RULE_ID
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

                    // InternalMoniLog.g:1384:4: (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==23) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalMoniLog.g:1385:5: otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']'
                            {
                            otherlv_13=(Token)match(input,23,FOLLOW_26); 

                            					newLeafNode(otherlv_13, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_3_0());
                            				
                            // InternalMoniLog.g:1389:5: ( (lv_kind_14_0= ruleTemporalPatternKind ) )
                            // InternalMoniLog.g:1390:6: (lv_kind_14_0= ruleTemporalPatternKind )
                            {
                            // InternalMoniLog.g:1390:6: (lv_kind_14_0= ruleTemporalPatternKind )
                            // InternalMoniLog.g:1391:7: lv_kind_14_0= ruleTemporalPatternKind
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
                            								"org.gemoc.monilog.MoniLog.TemporalPatternKind");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_15=(Token)match(input,24,FOLLOW_7); 

                            					newLeafNode(otherlv_15, grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_3_2());
                            				

                            }
                            break;

                    }

                    // InternalMoniLog.g:1413:4: (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==14) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMoniLog.g:1414:5: otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')'
                            {
                            otherlv_16=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_16, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_4_0());
                            				
                            // InternalMoniLog.g:1418:5: ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog.g:1419:6: (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog.g:1419:6: (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog.g:1420:7: lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs
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
                            								"org.gemoc.monilog.MoniLog.ParameterDeclNoVarArgs");
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
                    			
                    // InternalMoniLog.g:1446:4: ( (lv_pattern_20_0= ruleTemporalPattern ) )
                    // InternalMoniLog.g:1447:5: (lv_pattern_20_0= ruleTemporalPattern )
                    {
                    // InternalMoniLog.g:1447:5: (lv_pattern_20_0= ruleTemporalPattern )
                    // InternalMoniLog.g:1448:6: lv_pattern_20_0= ruleTemporalPattern
                    {

                    						newCompositeNode(grammarAccess.getEventAccess().getPatternTemporalPatternParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_pattern_20_0=ruleTemporalPattern();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEventRule());
                    						}
                    						set(
                    							current,
                    							"pattern",
                    							lv_pattern_20_0,
                    							"org.gemoc.monilog.MoniLog.TemporalPattern");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_21=(Token)match(input,18,FOLLOW_2); 

                    				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:1471:3: ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? )
                    {
                    // InternalMoniLog.g:1471:3: ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? )
                    // InternalMoniLog.g:1472:4: () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )?
                    {
                    // InternalMoniLog.g:1472:4: ()
                    // InternalMoniLog.g:1473:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEventAccess().getUserEventAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_23=(Token)match(input,30,FOLLOW_3); 

                    				newLeafNode(otherlv_23, grammarAccess.getEventAccess().getCustomKeyword_2_1());
                    			
                    // InternalMoniLog.g:1483:4: ( (lv_name_24_0= RULE_ID ) )
                    // InternalMoniLog.g:1484:5: (lv_name_24_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1484:5: (lv_name_24_0= RULE_ID )
                    // InternalMoniLog.g:1485:6: lv_name_24_0= RULE_ID
                    {
                    lv_name_24_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

                    // InternalMoniLog.g:1501:4: (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==14) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMoniLog.g:1502:5: otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')'
                            {
                            otherlv_25=(Token)match(input,14,FOLLOW_8); 

                            					newLeafNode(otherlv_25, grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_3_0());
                            				
                            // InternalMoniLog.g:1506:5: ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog.g:1507:6: (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog.g:1507:6: (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog.g:1508:7: lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs
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
                            								"org.gemoc.monilog.MoniLog.ParameterDeclNoVarArgs");
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
    // InternalMoniLog.g:1535:1: entryRuleASTEventKind returns [EObject current=null] : iv_ruleASTEventKind= ruleASTEventKind EOF ;
    public final EObject entryRuleASTEventKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASTEventKind = null;


        try {
            // InternalMoniLog.g:1535:53: (iv_ruleASTEventKind= ruleASTEventKind EOF )
            // InternalMoniLog.g:1536:2: iv_ruleASTEventKind= ruleASTEventKind EOF
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
    // InternalMoniLog.g:1542:1: ruleASTEventKind returns [EObject current=null] : ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) ) ;
    public final EObject ruleASTEventKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoniLog.g:1548:2: ( ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) ) )
            // InternalMoniLog.g:1549:2: ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) )
            {
            // InternalMoniLog.g:1549:2: ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==31) ) {
                alt34=1;
            }
            else if ( (LA34_0==32) ) {
                alt34=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoniLog.g:1550:3: ( () otherlv_1= 'before' )
                    {
                    // InternalMoniLog.g:1550:3: ( () otherlv_1= 'before' )
                    // InternalMoniLog.g:1551:4: () otherlv_1= 'before'
                    {
                    // InternalMoniLog.g:1551:4: ()
                    // InternalMoniLog.g:1552:5: 
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
                    // InternalMoniLog.g:1564:3: ( () otherlv_3= 'after' )
                    {
                    // InternalMoniLog.g:1564:3: ( () otherlv_3= 'after' )
                    // InternalMoniLog.g:1565:4: () otherlv_3= 'after'
                    {
                    // InternalMoniLog.g:1565:4: ()
                    // InternalMoniLog.g:1566:5: 
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
    // InternalMoniLog.g:1581:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMoniLog.g:1581:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMoniLog.g:1582:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMoniLog.g:1588:1: ruleCondition returns [EObject current=null] : ( (lv_expression_0_0= ruleLanguageExpression ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:1594:2: ( ( (lv_expression_0_0= ruleLanguageExpression ) ) )
            // InternalMoniLog.g:1595:2: ( (lv_expression_0_0= ruleLanguageExpression ) )
            {
            // InternalMoniLog.g:1595:2: ( (lv_expression_0_0= ruleLanguageExpression ) )
            // InternalMoniLog.g:1596:3: (lv_expression_0_0= ruleLanguageExpression )
            {
            // InternalMoniLog.g:1596:3: (lv_expression_0_0= ruleLanguageExpression )
            // InternalMoniLog.g:1597:4: lv_expression_0_0= ruleLanguageExpression
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
            					"org.gemoc.monilog.MoniLog.LanguageExpression");
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
    // InternalMoniLog.g:1617:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalMoniLog.g:1617:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalMoniLog.g:1618:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
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
    // InternalMoniLog.g:1624:1: ruleTemporalPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;

        EObject lv_scope_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:1630:2: ( ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) )
            // InternalMoniLog.g:1631:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            {
            // InternalMoniLog.g:1631:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            // InternalMoniLog.g:1632:3: ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) )
            {
            // InternalMoniLog.g:1632:3: ( (lv_pattern_0_0= rulePattern ) )
            // InternalMoniLog.g:1633:4: (lv_pattern_0_0= rulePattern )
            {
            // InternalMoniLog.g:1633:4: (lv_pattern_0_0= rulePattern )
            // InternalMoniLog.g:1634:5: lv_pattern_0_0= rulePattern
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
            						"org.gemoc.monilog.MoniLog.Pattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog.g:1651:3: ( (lv_scope_1_0= ruleScope ) )
            // InternalMoniLog.g:1652:4: (lv_scope_1_0= ruleScope )
            {
            // InternalMoniLog.g:1652:4: (lv_scope_1_0= ruleScope )
            // InternalMoniLog.g:1653:5: lv_scope_1_0= ruleScope
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
            						"org.gemoc.monilog.MoniLog.Scope");
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
    // InternalMoniLog.g:1674:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMoniLog.g:1674:48: (iv_rulePattern= rulePattern EOF )
            // InternalMoniLog.g:1675:2: iv_rulePattern= rulePattern EOF
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
    // InternalMoniLog.g:1681:1: rulePattern returns [EObject current=null] : ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog.g:1687:2: ( ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog.g:1688:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog.g:1688:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalMoniLog.g:1689:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1689:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1690:4: () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1690:4: ()
                    // InternalMoniLog.g:1691:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getExistenceAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog.g:1697:4: (otherlv_1= 'exists' )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==33) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalMoniLog.g:1698:5: otherlv_1= 'exists'
                            {
                            otherlv_1=(Token)match(input,33,FOLLOW_29); 

                            					newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getExistsKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMoniLog.g:1703:4: ( (lv_bound_2_0= ruleBoundType ) )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_INT||(LA36_0>=38 && LA36_0<=39)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMoniLog.g:1704:5: (lv_bound_2_0= ruleBoundType )
                            {
                            // InternalMoniLog.g:1704:5: (lv_bound_2_0= ruleBoundType )
                            // InternalMoniLog.g:1705:6: lv_bound_2_0= ruleBoundType
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
                            							"org.gemoc.monilog.MoniLog.BoundType");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalMoniLog.g:1722:4: ( (lv_event_3_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1723:5: (lv_event_3_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1723:5: (lv_event_3_0= ruleStreamEvent )
                    // InternalMoniLog.g:1724:6: lv_event_3_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:1743:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1743:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1744:4: () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1744:4: ()
                    // InternalMoniLog.g:1745:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getUniversalityAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,34,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getAlwaysKeyword_1_1());
                    			
                    // InternalMoniLog.g:1755:4: ( (lv_event_6_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1756:5: (lv_event_6_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1756:5: (lv_event_6_0= ruleStreamEvent )
                    // InternalMoniLog.g:1757:6: lv_event_6_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:1776:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1776:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1777:4: () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1777:4: ()
                    // InternalMoniLog.g:1778:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getAbsenceAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,35,FOLLOW_3); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getNeverKeyword_2_1());
                    			
                    // InternalMoniLog.g:1788:4: ( (lv_event_9_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1789:5: (lv_event_9_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1789:5: (lv_event_9_0= ruleStreamEvent )
                    // InternalMoniLog.g:1790:6: lv_event_9_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:1809:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1809:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1810:4: () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1810:4: ()
                    // InternalMoniLog.g:1811:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getPrecedenceAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog.g:1817:4: ( (lv_predecessor_11_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1818:5: (lv_predecessor_11_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1818:5: (lv_predecessor_11_0= ruleStreamEvent )
                    // InternalMoniLog.g:1819:6: lv_predecessor_11_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,36,FOLLOW_3); 

                    				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPrecedesKeyword_3_2());
                    			
                    // InternalMoniLog.g:1840:4: ( (lv_successor_13_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1841:5: (lv_successor_13_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1841:5: (lv_successor_13_0= ruleStreamEvent )
                    // InternalMoniLog.g:1842:6: lv_successor_13_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:1861:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1861:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1862:4: () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1862:4: ()
                    // InternalMoniLog.g:1863:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getResponseAction_4_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog.g:1869:4: ( (lv_event_15_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1870:5: (lv_event_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1870:5: (lv_event_15_0= ruleStreamEvent )
                    // InternalMoniLog.g:1871:6: lv_event_15_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,37,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getRespondsToKeyword_4_2());
                    			
                    // InternalMoniLog.g:1892:4: ( (lv_trigger_17_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1893:5: (lv_trigger_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1893:5: (lv_trigger_17_0= ruleStreamEvent )
                    // InternalMoniLog.g:1894:6: lv_trigger_17_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
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
    // InternalMoniLog.g:1916:1: entryRuleBoundType returns [EObject current=null] : iv_ruleBoundType= ruleBoundType EOF ;
    public final EObject entryRuleBoundType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundType = null;


        try {
            // InternalMoniLog.g:1916:50: (iv_ruleBoundType= ruleBoundType EOF )
            // InternalMoniLog.g:1917:2: iv_ruleBoundType= ruleBoundType EOF
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
    // InternalMoniLog.g:1923:1: ruleBoundType returns [EObject current=null] : (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) ;
    public final EObject ruleBoundType() throws RecognitionException {
        EObject current = null;

        EObject this_ExactBound_0 = null;

        EObject this_LowerBound_1 = null;

        EObject this_UpperBound_2 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:1929:2: ( (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) )
            // InternalMoniLog.g:1930:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            {
            // InternalMoniLog.g:1930:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            int alt38=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt38=1;
                }
                break;
            case 38:
                {
                alt38=2;
                }
                break;
            case 39:
                {
                alt38=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMoniLog.g:1931:3: this_ExactBound_0= ruleExactBound
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
                    // InternalMoniLog.g:1940:3: this_LowerBound_1= ruleLowerBound
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
                    // InternalMoniLog.g:1949:3: this_UpperBound_2= ruleUpperBound
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
    // InternalMoniLog.g:1961:1: entryRuleExactBound returns [EObject current=null] : iv_ruleExactBound= ruleExactBound EOF ;
    public final EObject entryRuleExactBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactBound = null;


        try {
            // InternalMoniLog.g:1961:51: (iv_ruleExactBound= ruleExactBound EOF )
            // InternalMoniLog.g:1962:2: iv_ruleExactBound= ruleExactBound EOF
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
    // InternalMoniLog.g:1968:1: ruleExactBound returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleExactBound() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:1974:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalMoniLog.g:1975:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalMoniLog.g:1975:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalMoniLog.g:1976:3: (lv_n_0_0= RULE_INT )
            {
            // InternalMoniLog.g:1976:3: (lv_n_0_0= RULE_INT )
            // InternalMoniLog.g:1977:4: lv_n_0_0= RULE_INT
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
    // InternalMoniLog.g:1996:1: entryRuleLowerBound returns [EObject current=null] : iv_ruleLowerBound= ruleLowerBound EOF ;
    public final EObject entryRuleLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBound = null;


        try {
            // InternalMoniLog.g:1996:51: (iv_ruleLowerBound= ruleLowerBound EOF )
            // InternalMoniLog.g:1997:2: iv_ruleLowerBound= ruleLowerBound EOF
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
    // InternalMoniLog.g:2003:1: ruleLowerBound returns [EObject current=null] : (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:2009:2: ( (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog.g:2010:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog.g:2010:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog.g:2011:3: otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,38,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundAccess().getAtleastKeyword_0());
            		
            // InternalMoniLog.g:2015:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog.g:2016:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog.g:2016:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog.g:2017:5: lv_n_1_0= RULE_INT
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
    // InternalMoniLog.g:2037:1: entryRuleUpperBound returns [EObject current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final EObject entryRuleUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperBound = null;


        try {
            // InternalMoniLog.g:2037:51: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalMoniLog.g:2038:2: iv_ruleUpperBound= ruleUpperBound EOF
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
    // InternalMoniLog.g:2044:1: ruleUpperBound returns [EObject current=null] : (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:2050:2: ( (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog.g:2051:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog.g:2051:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog.g:2052:3: otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_32); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperBoundAccess().getAtmostKeyword_0());
            		
            // InternalMoniLog.g:2056:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog.g:2057:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog.g:2057:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog.g:2058:5: lv_n_1_0= RULE_INT
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
    // InternalMoniLog.g:2078:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalMoniLog.g:2078:46: (iv_ruleScope= ruleScope EOF )
            // InternalMoniLog.g:2079:2: iv_ruleScope= ruleScope EOF
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
    // InternalMoniLog.g:2085:1: ruleScope returns [EObject current=null] : ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog.g:2091:2: ( ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog.g:2092:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog.g:2092:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            int alt40=5;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalMoniLog.g:2093:3: ( () (otherlv_1= 'globally' )? )
                    {
                    // InternalMoniLog.g:2093:3: ( () (otherlv_1= 'globally' )? )
                    // InternalMoniLog.g:2094:4: () (otherlv_1= 'globally' )?
                    {
                    // InternalMoniLog.g:2094:4: ()
                    // InternalMoniLog.g:2095:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getGloballyAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog.g:2101:4: (otherlv_1= 'globally' )?
                    int alt39=2;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==40) ) {
                        alt39=1;
                    }
                    switch (alt39) {
                        case 1 :
                            // InternalMoniLog.g:2102:5: otherlv_1= 'globally'
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
                    // InternalMoniLog.g:2109:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2109:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2110:4: () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2110:4: ()
                    // InternalMoniLog.g:2111:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getAfterKeyword_1_1());
                    			
                    // InternalMoniLog.g:2121:4: ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2122:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2122:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    // InternalMoniLog.g:2123:6: lv_lowerBound_4_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:2142:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2142:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2143:4: () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2143:4: ()
                    // InternalMoniLog.g:2144:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBeforeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,31,FOLLOW_3); 

                    				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getBeforeKeyword_2_1());
                    			
                    // InternalMoniLog.g:2154:4: ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2155:5: (lv_upperBound_7_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2155:5: (lv_upperBound_7_0= ruleStreamEvent )
                    // InternalMoniLog.g:2156:6: lv_upperBound_7_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:2175:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2175:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2176:4: () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2176:4: ()
                    // InternalMoniLog.g:2177:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBetweenAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,41,FOLLOW_3); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                    			
                    // InternalMoniLog.g:2187:4: ( (lv_lowerBound_10_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2188:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2188:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    // InternalMoniLog.g:2189:6: lv_lowerBound_10_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,42,FOLLOW_3); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_3());
                    			
                    // InternalMoniLog.g:2210:4: ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2211:5: (lv_upperBound_12_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2211:5: (lv_upperBound_12_0= ruleStreamEvent )
                    // InternalMoniLog.g:2212:6: lv_upperBound_12_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:2231:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2231:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2232:4: () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2232:4: ()
                    // InternalMoniLog.g:2233:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterUntilAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_14, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                    			
                    // InternalMoniLog.g:2243:4: ( (lv_lowerBound_15_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2244:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2244:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    // InternalMoniLog.g:2245:6: lv_lowerBound_15_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_16=(Token)match(input,43,FOLLOW_3); 

                    				newLeafNode(otherlv_16, grammarAccess.getScopeAccess().getUntilKeyword_4_3());
                    			
                    // InternalMoniLog.g:2266:4: ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2267:5: (lv_upperBound_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2267:5: (lv_upperBound_17_0= ruleStreamEvent )
                    // InternalMoniLog.g:2268:6: lv_upperBound_17_0= ruleStreamEvent
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
                    							"org.gemoc.monilog.MoniLog.StreamEvent");
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
    // InternalMoniLog.g:2290:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMoniLog.g:2290:47: (iv_ruleAction= ruleAction EOF )
            // InternalMoniLog.g:2291:2: iv_ruleAction= ruleAction EOF
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
    // InternalMoniLog.g:2297:1: ruleAction returns [EObject current=null] : (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LanguageExpression_0 = null;

        EObject this_AppenderCall_1 = null;

        EObject this_EmitEvent_2 = null;

        EObject this_SetVariable_3 = null;

        EObject this_MoniloggerCall_4 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:2303:2: ( (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall ) )
            // InternalMoniLog.g:2304:2: (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall )
            {
            // InternalMoniLog.g:2304:2: (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_SetVariable_3= ruleSetVariable | this_MoniloggerCall_4= ruleMoniloggerCall )
            int alt41=5;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==44) ) {
                    switch ( input.LA(3) ) {
                    case 47:
                    case 48:
                        {
                        alt41=5;
                        }
                        break;
                    case 45:
                        {
                        alt41=3;
                        }
                        break;
                    case RULE_ID:
                    case 28:
                        {
                        alt41=2;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 41, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA41_1==14) ) {
                    alt41=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==46) ) {
                alt41=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoniLog.g:2305:3: this_LanguageExpression_0= ruleLanguageExpression
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
                    // InternalMoniLog.g:2314:3: this_AppenderCall_1= ruleAppenderCall
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
                    // InternalMoniLog.g:2323:3: this_EmitEvent_2= ruleEmitEvent
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
                    // InternalMoniLog.g:2332:3: this_SetVariable_3= ruleSetVariable
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
                    // InternalMoniLog.g:2341:3: this_MoniloggerCall_4= ruleMoniloggerCall
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
    // InternalMoniLog.g:2353:1: entryRuleAppenderCall returns [EObject current=null] : iv_ruleAppenderCall= ruleAppenderCall EOF ;
    public final EObject entryRuleAppenderCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCall = null;


        try {
            // InternalMoniLog.g:2353:53: (iv_ruleAppenderCall= ruleAppenderCall EOF )
            // InternalMoniLog.g:2354:2: iv_ruleAppenderCall= ruleAppenderCall EOF
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
    // InternalMoniLog.g:2360:1: ruleAppenderCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog.g:2366:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:2367:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:2367:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:2368:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:2368:3: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:2369:4: ( ruleQualifiedName )
            {
            // InternalMoniLog.g:2369:4: ( ruleQualifiedName )
            // InternalMoniLog.g:2370:5: ruleQualifiedName
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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getAppenderCallAccess().getCallKeyword_2());
            		
            // InternalMoniLog.g:2392:3: (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==14) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoniLog.g:2393:4: otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog.g:2397:4: ( (lv_args_4_0= ruleAppenderCallArgument ) )
                    // InternalMoniLog.g:2398:5: (lv_args_4_0= ruleAppenderCallArgument )
                    {
                    // InternalMoniLog.g:2398:5: (lv_args_4_0= ruleAppenderCallArgument )
                    // InternalMoniLog.g:2399:6: lv_args_4_0= ruleAppenderCallArgument
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
                    							"org.gemoc.monilog.MoniLog.AppenderCallArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:2416:4: (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==20) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMoniLog.g:2417:5: otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog.g:2421:5: ( (lv_args_6_0= ruleAppenderCallArgument ) )
                    	    // InternalMoniLog.g:2422:6: (lv_args_6_0= ruleAppenderCallArgument )
                    	    {
                    	    // InternalMoniLog.g:2422:6: (lv_args_6_0= ruleAppenderCallArgument )
                    	    // InternalMoniLog.g:2423:7: lv_args_6_0= ruleAppenderCallArgument
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
                    	    								"org.gemoc.monilog.MoniLog.AppenderCallArgument");
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
    // InternalMoniLog.g:2450:1: entryRuleAppenderCallArgument returns [EObject current=null] : iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF ;
    public final EObject entryRuleAppenderCallArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCallArgument = null;


        try {
            // InternalMoniLog.g:2450:61: (iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF )
            // InternalMoniLog.g:2451:2: iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF
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
    // InternalMoniLog.g:2457:1: ruleAppenderCallArgument returns [EObject current=null] : (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall ) ;
    public final EObject ruleAppenderCallArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_LayoutCall_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:2463:2: ( (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall ) )
            // InternalMoniLog.g:2464:2: (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall )
            {
            // InternalMoniLog.g:2464:2: (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==EOF||(LA44_1>=14 && LA44_1<=15)||LA44_1==20) ) {
                    alt44=1;
                }
                else if ( (LA44_1==44) ) {
                    alt44=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoniLog.g:2465:3: this_Expression_0= ruleExpression
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
                    // InternalMoniLog.g:2474:3: this_LayoutCall_1= ruleLayoutCall
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
    // InternalMoniLog.g:2486:1: entryRuleLayoutCall returns [EObject current=null] : iv_ruleLayoutCall= ruleLayoutCall EOF ;
    public final EObject entryRuleLayoutCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutCall = null;


        try {
            // InternalMoniLog.g:2486:51: (iv_ruleLayoutCall= ruleLayoutCall EOF )
            // InternalMoniLog.g:2487:2: iv_ruleLayoutCall= ruleLayoutCall EOF
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
    // InternalMoniLog.g:2493:1: ruleLayoutCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog.g:2499:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:2500:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:2500:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:2501:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:2501:3: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:2502:4: ( ruleQualifiedName )
            {
            // InternalMoniLog.g:2502:4: ( ruleQualifiedName )
            // InternalMoniLog.g:2503:5: ruleQualifiedName
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
            		
            otherlv_2=(Token)match(input,28,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutCallAccess().getCallKeyword_2());
            		
            // InternalMoniLog.g:2525:3: (otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==14) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoniLog.g:2526:4: otherlv_3= '(' ( (lv_args_4_0= ruleLayoutCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog.g:2530:4: ( (lv_args_4_0= ruleLayoutCallArgument ) )
                    // InternalMoniLog.g:2531:5: (lv_args_4_0= ruleLayoutCallArgument )
                    {
                    // InternalMoniLog.g:2531:5: (lv_args_4_0= ruleLayoutCallArgument )
                    // InternalMoniLog.g:2532:6: lv_args_4_0= ruleLayoutCallArgument
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
                    							"org.gemoc.monilog.MoniLog.LayoutCallArgument");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:2549:4: (otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==20) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMoniLog.g:2550:5: otherlv_5= ',' ( (lv_args_6_0= ruleLayoutCallArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog.g:2554:5: ( (lv_args_6_0= ruleLayoutCallArgument ) )
                    	    // InternalMoniLog.g:2555:6: (lv_args_6_0= ruleLayoutCallArgument )
                    	    {
                    	    // InternalMoniLog.g:2555:6: (lv_args_6_0= ruleLayoutCallArgument )
                    	    // InternalMoniLog.g:2556:7: lv_args_6_0= ruleLayoutCallArgument
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
                    	    								"org.gemoc.monilog.MoniLog.LayoutCallArgument");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
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
    // InternalMoniLog.g:2583:1: entryRuleLayoutCallArgument returns [EObject current=null] : iv_ruleLayoutCallArgument= ruleLayoutCallArgument EOF ;
    public final EObject entryRuleLayoutCallArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutCallArgument = null;


        try {
            // InternalMoniLog.g:2583:59: (iv_ruleLayoutCallArgument= ruleLayoutCallArgument EOF )
            // InternalMoniLog.g:2584:2: iv_ruleLayoutCallArgument= ruleLayoutCallArgument EOF
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
    // InternalMoniLog.g:2590:1: ruleLayoutCallArgument returns [EObject current=null] : this_Expression_0= ruleExpression ;
    public final EObject ruleLayoutCallArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:2596:2: (this_Expression_0= ruleExpression )
            // InternalMoniLog.g:2597:2: this_Expression_0= ruleExpression
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
    // InternalMoniLog.g:2608:1: entryRuleEmitEvent returns [EObject current=null] : iv_ruleEmitEvent= ruleEmitEvent EOF ;
    public final EObject entryRuleEmitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmitEvent = null;


        try {
            // InternalMoniLog.g:2608:50: (iv_ruleEmitEvent= ruleEmitEvent EOF )
            // InternalMoniLog.g:2609:2: iv_ruleEmitEvent= ruleEmitEvent EOF
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
    // InternalMoniLog.g:2615:1: ruleEmitEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog.g:2621:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:2622:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:2622:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:2623:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:2623:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:2624:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:2624:4: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:2625:5: otherlv_0= RULE_ID
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
            		
            otherlv_2=(Token)match(input,45,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getEmitEventAccess().getEmitKeyword_2());
            		
            // InternalMoniLog.g:2644:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==14) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoniLog.g:2645:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog.g:2649:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog.g:2650:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog.g:2650:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog.g:2651:6: lv_args_4_0= ruleExpression
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
                    							"org.gemoc.monilog.MoniLog.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:2668:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==20) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMoniLog.g:2669:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,20,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog.g:2673:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog.g:2674:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog.g:2674:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog.g:2675:7: lv_args_6_0= ruleExpression
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
                    	    								"org.gemoc.monilog.MoniLog.Expression");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
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
    // InternalMoniLog.g:2702:1: entryRuleSetVariable returns [EObject current=null] : iv_ruleSetVariable= ruleSetVariable EOF ;
    public final EObject entryRuleSetVariable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSetVariable = null;


        try {
            // InternalMoniLog.g:2702:52: (iv_ruleSetVariable= ruleSetVariable EOF )
            // InternalMoniLog.g:2703:2: iv_ruleSetVariable= ruleSetVariable EOF
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
    // InternalMoniLog.g:2709:1: ruleSetVariable returns [EObject current=null] : (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' ) ;
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
            // InternalMoniLog.g:2715:2: ( (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' ) )
            // InternalMoniLog.g:2716:2: (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' )
            {
            // InternalMoniLog.g:2716:2: (otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')' )
            // InternalMoniLog.g:2717:3: otherlv_0= 'set' otherlv_1= '(' ( (lv_variable_2_0= RULE_STRING ) ) otherlv_3= ',' ( (lv_value_4_0= ruleLanguageExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getSetVariableAccess().getSetKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_40); 

            			newLeafNode(otherlv_1, grammarAccess.getSetVariableAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoniLog.g:2725:3: ( (lv_variable_2_0= RULE_STRING ) )
            // InternalMoniLog.g:2726:4: (lv_variable_2_0= RULE_STRING )
            {
            // InternalMoniLog.g:2726:4: (lv_variable_2_0= RULE_STRING )
            // InternalMoniLog.g:2727:5: lv_variable_2_0= RULE_STRING
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
            		
            // InternalMoniLog.g:2747:3: ( (lv_value_4_0= ruleLanguageExpression ) )
            // InternalMoniLog.g:2748:4: (lv_value_4_0= ruleLanguageExpression )
            {
            // InternalMoniLog.g:2748:4: (lv_value_4_0= ruleLanguageExpression )
            // InternalMoniLog.g:2749:5: lv_value_4_0= ruleLanguageExpression
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
            						"org.gemoc.monilog.MoniLog.LanguageExpression");
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
    // InternalMoniLog.g:2774:1: entryRuleMoniloggerCall returns [EObject current=null] : iv_ruleMoniloggerCall= ruleMoniloggerCall EOF ;
    public final EObject entryRuleMoniloggerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniloggerCall = null;


        try {
            // InternalMoniLog.g:2774:55: (iv_ruleMoniloggerCall= ruleMoniloggerCall EOF )
            // InternalMoniLog.g:2775:2: iv_ruleMoniloggerCall= ruleMoniloggerCall EOF
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
    // InternalMoniLog.g:2781:1: ruleMoniloggerCall returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) ;
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
            // InternalMoniLog.g:2787:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) )
            // InternalMoniLog.g:2788:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            {
            // InternalMoniLog.g:2788:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==44) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==48) ) {
                        alt51=2;
                    }
                    else if ( (LA51_2==47) ) {
                        alt51=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoniLog.g:2789:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalMoniLog.g:2789:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    // InternalMoniLog.g:2790:4: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    {
                    // InternalMoniLog.g:2790:4: ()
                    // InternalMoniLog.g:2791:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMoniloggerCallAccess().getStartMoniLoggerAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog.g:2797:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoniLog.g:2798:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoniLog.g:2798:5: (otherlv_1= RULE_ID )
                    // InternalMoniLog.g:2799:6: otherlv_1= RULE_ID
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
                    			
                    otherlv_3=(Token)match(input,47,FOLLOW_13); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoniloggerCallAccess().getStartKeyword_0_3());
                    			
                    // InternalMoniLog.g:2818:4: (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==14) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalMoniLog.g:2819:5: otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,14,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getMoniloggerCallAccess().getLeftParenthesisKeyword_0_4_0());
                            				
                            // InternalMoniLog.g:2823:5: ( (lv_args_5_0= ruleExpression ) )
                            // InternalMoniLog.g:2824:6: (lv_args_5_0= ruleExpression )
                            {
                            // InternalMoniLog.g:2824:6: (lv_args_5_0= ruleExpression )
                            // InternalMoniLog.g:2825:7: lv_args_5_0= ruleExpression
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
                            								"org.gemoc.monilog.MoniLog.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMoniLog.g:2842:5: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==20) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalMoniLog.g:2843:6: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,20,FOLLOW_3); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getMoniloggerCallAccess().getCommaKeyword_0_4_2_0());
                            	    					
                            	    // InternalMoniLog.g:2847:6: ( (lv_args_7_0= ruleExpression ) )
                            	    // InternalMoniLog.g:2848:7: (lv_args_7_0= ruleExpression )
                            	    {
                            	    // InternalMoniLog.g:2848:7: (lv_args_7_0= ruleExpression )
                            	    // InternalMoniLog.g:2849:8: lv_args_7_0= ruleExpression
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
                            	    									"org.gemoc.monilog.MoniLog.Expression");
                            	    								afterParserOrEnumRuleCall();
                            	    							

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
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
                    // InternalMoniLog.g:2874:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    {
                    // InternalMoniLog.g:2874:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    // InternalMoniLog.g:2875:4: () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop'
                    {
                    // InternalMoniLog.g:2875:4: ()
                    // InternalMoniLog.g:2876:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMoniloggerCallAccess().getStopMoniLoggerAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog.g:2882:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMoniLog.g:2883:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMoniLog.g:2883:5: (otherlv_10= RULE_ID )
                    // InternalMoniLog.g:2884:6: otherlv_10= RULE_ID
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
    // InternalMoniLog.g:2908:1: entryRuleStreamEvent returns [EObject current=null] : iv_ruleStreamEvent= ruleStreamEvent EOF ;
    public final EObject entryRuleStreamEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamEvent = null;


        try {
            // InternalMoniLog.g:2908:52: (iv_ruleStreamEvent= ruleStreamEvent EOF )
            // InternalMoniLog.g:2909:2: iv_ruleStreamEvent= ruleStreamEvent EOF
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
    // InternalMoniLog.g:2915:1: ruleStreamEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalMoniLog.g:2921:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? ) )
            // InternalMoniLog.g:2922:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? )
            {
            // InternalMoniLog.g:2922:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? )
            // InternalMoniLog.g:2923:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )?
            {
            // InternalMoniLog.g:2923:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:2924:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:2924:4: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:2925:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_13); 

            					newLeafNode(otherlv_0, grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalMoniLog.g:2936:3: (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==14) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoniLog.g:2937:4: otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,14,FOLLOW_44); 

                    				newLeafNode(otherlv_1, grammarAccess.getStreamEventAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalMoniLog.g:2941:4: ( (lv_values_2_0= ruleEmptyOrPropertyValue ) )
                    // InternalMoniLog.g:2942:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    {
                    // InternalMoniLog.g:2942:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    // InternalMoniLog.g:2943:6: lv_values_2_0= ruleEmptyOrPropertyValue
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
                    							"org.gemoc.monilog.MoniLog.EmptyOrPropertyValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog.g:2960:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==20) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalMoniLog.g:2961:5: otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,20,FOLLOW_44); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMoniLog.g:2965:5: ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    // InternalMoniLog.g:2966:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    {
                    	    // InternalMoniLog.g:2966:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    // InternalMoniLog.g:2967:7: lv_values_4_0= ruleEmptyOrPropertyValue
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
                    	    								"org.gemoc.monilog.MoniLog.EmptyOrPropertyValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
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
    // InternalMoniLog.g:2994:1: entryRuleEmptyOrPropertyValue returns [EObject current=null] : iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF ;
    public final EObject entryRuleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyOrPropertyValue = null;


        try {
            // InternalMoniLog.g:2994:61: (iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog.g:2995:2: iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF
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
    // InternalMoniLog.g:3001:1: ruleEmptyOrPropertyValue returns [EObject current=null] : ( () | this_PropertyValue_1= rulePropertyValue ) ;
    public final EObject ruleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValue_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3007:2: ( ( () | this_PropertyValue_1= rulePropertyValue ) )
            // InternalMoniLog.g:3008:2: ( () | this_PropertyValue_1= rulePropertyValue )
            {
            // InternalMoniLog.g:3008:2: ( () | this_PropertyValue_1= rulePropertyValue )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EOF||LA54_0==15||LA54_0==20) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoniLog.g:3009:3: ()
                    {
                    // InternalMoniLog.g:3009:3: ()
                    // InternalMoniLog.g:3010:4: 
                    {

                    				current = forceCreateModelElement(
                    					grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0(),
                    					current);
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3017:3: this_PropertyValue_1= rulePropertyValue
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
    // InternalMoniLog.g:3029:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMoniLog.g:3029:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMoniLog.g:3030:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMoniLog.g:3036:1: ruleExpression returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_LanguageExpression_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3042:2: ( (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression ) )
            // InternalMoniLog.g:3043:2: (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression )
            {
            // InternalMoniLog.g:3043:2: (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ID) ) {
                int LA55_1 = input.LA(2);

                if ( (LA55_1==14) ) {
                    alt55=2;
                }
                else if ( (LA55_1==EOF||LA55_1==15||LA55_1==20) ) {
                    alt55=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalMoniLog.g:3044:3: this_ParameterReference_0= ruleParameterReference
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
                    // InternalMoniLog.g:3053:3: this_LanguageExpression_1= ruleLanguageExpression
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
    // InternalMoniLog.g:3065:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // InternalMoniLog.g:3065:59: (iv_ruleParameterReference= ruleParameterReference EOF )
            // InternalMoniLog.g:3066:2: iv_ruleParameterReference= ruleParameterReference EOF
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
    // InternalMoniLog.g:3072:1: ruleParameterReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3078:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMoniLog.g:3079:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMoniLog.g:3079:2: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:3080:3: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:3080:3: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:3081:4: otherlv_0= RULE_ID
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
    // InternalMoniLog.g:3095:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalMoniLog.g:3095:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalMoniLog.g:3096:2: iv_rulePropertyValue= rulePropertyValue EOF
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
    // InternalMoniLog.g:3102:1: rulePropertyValue returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3108:2: ( ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) ) )
            // InternalMoniLog.g:3109:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) )
            {
            // InternalMoniLog.g:3109:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageExpression ) ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                int LA57_1 = input.LA(2);

                if ( (LA57_1==14) ) {
                    alt57=2;
                }
                else if ( (LA57_1==EOF||LA57_1==15||LA57_1==20||LA57_1==49) ) {
                    alt57=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoniLog.g:3110:3: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
                    {
                    // InternalMoniLog.g:3110:3: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
                    // InternalMoniLog.g:3111:4: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
                    {
                    // InternalMoniLog.g:3111:4: ( (lv_id_0_0= RULE_ID ) )
                    // InternalMoniLog.g:3112:5: (lv_id_0_0= RULE_ID )
                    {
                    // InternalMoniLog.g:3112:5: (lv_id_0_0= RULE_ID )
                    // InternalMoniLog.g:3113:6: lv_id_0_0= RULE_ID
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

                    // InternalMoniLog.g:3129:4: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==49) ) {
                        alt56=1;
                    }
                    switch (alt56) {
                        case 1 :
                            // InternalMoniLog.g:3130:5: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,49,FOLLOW_3); 

                            					newLeafNode(otherlv_1, grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_0_1_0());
                            				
                            // InternalMoniLog.g:3134:5: ( (lv_value_2_0= ruleExpression ) )
                            // InternalMoniLog.g:3135:6: (lv_value_2_0= ruleExpression )
                            {
                            // InternalMoniLog.g:3135:6: (lv_value_2_0= ruleExpression )
                            // InternalMoniLog.g:3136:7: lv_value_2_0= ruleExpression
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
                            								"org.gemoc.monilog.MoniLog.Expression");
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
                    // InternalMoniLog.g:3156:3: ( (lv_value_3_0= ruleLanguageExpression ) )
                    {
                    // InternalMoniLog.g:3156:3: ( (lv_value_3_0= ruleLanguageExpression ) )
                    // InternalMoniLog.g:3157:4: (lv_value_3_0= ruleLanguageExpression )
                    {
                    // InternalMoniLog.g:3157:4: (lv_value_3_0= ruleLanguageExpression )
                    // InternalMoniLog.g:3158:5: lv_value_3_0= ruleLanguageExpression
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
                    						"org.gemoc.monilog.MoniLog.LanguageExpression");
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
    // InternalMoniLog.g:3179:1: entryRuleLanguageExpression returns [EObject current=null] : iv_ruleLanguageExpression= ruleLanguageExpression EOF ;
    public final EObject entryRuleLanguageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageExpression = null;


        try {
            // InternalMoniLog.g:3179:59: (iv_ruleLanguageExpression= ruleLanguageExpression EOF )
            // InternalMoniLog.g:3180:2: iv_ruleLanguageExpression= ruleLanguageExpression EOF
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
    // InternalMoniLog.g:3186:1: ruleLanguageExpression returns [EObject current=null] : ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' ) ;
    public final EObject ruleLanguageExpression() throws RecognitionException {
        EObject current = null;

        Token lv_languageId_0_0=null;
        Token otherlv_1=null;
        Token lv_expression_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3192:2: ( ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' ) )
            // InternalMoniLog.g:3193:2: ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' )
            {
            // InternalMoniLog.g:3193:2: ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')' )
            // InternalMoniLog.g:3194:3: ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( (lv_expression_2_0= RULE_STRING ) ) otherlv_3= ')'
            {
            // InternalMoniLog.g:3194:3: ( (lv_languageId_0_0= RULE_ID ) )
            // InternalMoniLog.g:3195:4: (lv_languageId_0_0= RULE_ID )
            {
            // InternalMoniLog.g:3195:4: (lv_languageId_0_0= RULE_ID )
            // InternalMoniLog.g:3196:5: lv_languageId_0_0= RULE_ID
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
            		
            // InternalMoniLog.g:3216:3: ( (lv_expression_2_0= RULE_STRING ) )
            // InternalMoniLog.g:3217:4: (lv_expression_2_0= RULE_STRING )
            {
            // InternalMoniLog.g:3217:4: (lv_expression_2_0= RULE_STRING )
            // InternalMoniLog.g:3218:5: lv_expression_2_0= RULE_STRING
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
    // InternalMoniLog.g:3242:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMoniLog.g:3242:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMoniLog.g:3243:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalMoniLog.g:3249:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3255:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMoniLog.g:3256:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMoniLog.g:3256:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMoniLog.g:3257:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_46); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoniLog.g:3264:3: (kw= '.' this_ID_2= RULE_ID )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==44) ) {
                    int LA58_2 = input.LA(2);

                    if ( (LA58_2==RULE_ID) ) {
                        alt58=1;
                    }


                }


                switch (alt58) {
            	case 1 :
            	    // InternalMoniLog.g:3265:4: kw= '.' this_ID_2= RULE_ID
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
            	    break loop58;
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
    // InternalMoniLog.g:3282:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMoniLog.g:3282:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMoniLog.g:3283:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalMoniLog.g:3289:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3295:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMoniLog.g:3296:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMoniLog.g:3296:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMoniLog.g:3297:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_47);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalMoniLog.g:3307:3: (kw= '.*' )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==50) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoniLog.g:3308:4: kw= '.*'
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
    // InternalMoniLog.g:3318:1: ruleMoniLoggerAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Inactive' ) ;
    public final Enumerator ruleMoniLoggerAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3324:2: ( (enumLiteral_0= '@Inactive' ) )
            // InternalMoniLog.g:3325:2: (enumLiteral_0= '@Inactive' )
            {
            // InternalMoniLog.g:3325:2: (enumLiteral_0= '@Inactive' )
            // InternalMoniLog.g:3326:3: enumLiteral_0= '@Inactive'
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
    // InternalMoniLog.g:3335:1: ruleAppenderAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Async' ) ;
    public final Enumerator ruleAppenderAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3341:2: ( (enumLiteral_0= '@Async' ) )
            // InternalMoniLog.g:3342:2: (enumLiteral_0= '@Async' )
            {
            // InternalMoniLog.g:3342:2: (enumLiteral_0= '@Async' )
            // InternalMoniLog.g:3343:3: enumLiteral_0= '@Async'
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
    // InternalMoniLog.g:3352:1: ruleLogLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) ;
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
            // InternalMoniLog.g:3358:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) )
            // InternalMoniLog.g:3359:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            {
            // InternalMoniLog.g:3359:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            int alt60=7;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt60=1;
                }
                break;
            case 54:
                {
                alt60=2;
                }
                break;
            case 55:
                {
                alt60=3;
                }
                break;
            case 56:
                {
                alt60=4;
                }
                break;
            case 57:
                {
                alt60=5;
                }
                break;
            case 58:
                {
                alt60=6;
                }
                break;
            case 59:
                {
                alt60=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }

            switch (alt60) {
                case 1 :
                    // InternalMoniLog.g:3360:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalMoniLog.g:3360:3: (enumLiteral_0= 'INFO' )
                    // InternalMoniLog.g:3361:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3368:3: (enumLiteral_1= 'CONFIG' )
                    {
                    // InternalMoniLog.g:3368:3: (enumLiteral_1= 'CONFIG' )
                    // InternalMoniLog.g:3369:4: enumLiteral_1= 'CONFIG'
                    {
                    enumLiteral_1=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:3376:3: (enumLiteral_2= 'FINE' )
                    {
                    // InternalMoniLog.g:3376:3: (enumLiteral_2= 'FINE' )
                    // InternalMoniLog.g:3377:4: enumLiteral_2= 'FINE'
                    {
                    enumLiteral_2=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:3384:3: (enumLiteral_3= 'FINER' )
                    {
                    // InternalMoniLog.g:3384:3: (enumLiteral_3= 'FINER' )
                    // InternalMoniLog.g:3385:4: enumLiteral_3= 'FINER'
                    {
                    enumLiteral_3=(Token)match(input,56,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:3392:3: (enumLiteral_4= 'FINEST' )
                    {
                    // InternalMoniLog.g:3392:3: (enumLiteral_4= 'FINEST' )
                    // InternalMoniLog.g:3393:4: enumLiteral_4= 'FINEST'
                    {
                    enumLiteral_4=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog.g:3400:3: (enumLiteral_5= 'SEVERE' )
                    {
                    // InternalMoniLog.g:3400:3: (enumLiteral_5= 'SEVERE' )
                    // InternalMoniLog.g:3401:4: enumLiteral_5= 'SEVERE'
                    {
                    enumLiteral_5=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog.g:3408:3: (enumLiteral_6= 'WARNING' )
                    {
                    // InternalMoniLog.g:3408:3: (enumLiteral_6= 'WARNING' )
                    // InternalMoniLog.g:3409:4: enumLiteral_6= 'WARNING'
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
    // InternalMoniLog.g:3419:1: ruleTemporalPatternKind returns [Enumerator current=null] : ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) ;
    public final Enumerator ruleTemporalPatternKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3425:2: ( ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) )
            // InternalMoniLog.g:3426:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            {
            // InternalMoniLog.g:3426:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            int alt61=4;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt61=1;
                }
                break;
            case 61:
                {
                alt61=2;
                }
                break;
            case 62:
                {
                alt61=3;
                }
                break;
            case 63:
                {
                alt61=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // InternalMoniLog.g:3427:3: (enumLiteral_0= 'S' )
                    {
                    // InternalMoniLog.g:3427:3: (enumLiteral_0= 'S' )
                    // InternalMoniLog.g:3428:4: enumLiteral_0= 'S'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3435:3: (enumLiteral_1= 'V' )
                    {
                    // InternalMoniLog.g:3435:3: (enumLiteral_1= 'V' )
                    // InternalMoniLog.g:3436:4: enumLiteral_1= 'V'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:3443:3: (enumLiteral_2= 'nS' )
                    {
                    // InternalMoniLog.g:3443:3: (enumLiteral_2= 'nS' )
                    // InternalMoniLog.g:3444:4: enumLiteral_2= 'nS'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:3451:3: (enumLiteral_3= 'nV' )
                    {
                    // InternalMoniLog.g:3451:3: (enumLiteral_3= 'nV' )
                    // InternalMoniLog.g:3452:4: enumLiteral_3= 'nV'
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
    protected DFA13 dfa13 = new DFA13(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA40 dfa40 = new DFA40(this);
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

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "561:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )";
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

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1688:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )";
        }
    }
    static final String dfa_20s = "\35\uffff";
    static final String dfa_21s = "\1\1\4\uffff\1\10\4\uffff\1\10\22\uffff";
    static final String dfa_22s = "\1\22\1\uffff\1\4\2\uffff\1\16\1\4\2\uffff\1\4\1\22\2\16\1\4\2\6\1\4\1\16\2\17\1\16\1\6\2\17\1\6\4\17";
    static final String dfa_23s = "\1\51\1\uffff\1\4\2\uffff\1\53\1\24\2\uffff\1\24\1\53\2\61\1\4\2\6\1\4\1\24\2\17\1\24\1\6\2\24\1\6\2\17\2\24";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\5\1\2\24\uffff";
    static final String dfa_25s = "\35\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\14\uffff\1\3\1\2\7\uffff\1\1\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\6\3\uffff\1\10\30\uffff\1\7",
            "\1\13\12\uffff\1\12\4\uffff\1\11",
            "",
            "",
            "\1\14\12\uffff\1\12\4\uffff\1\11",
            "\1\10\30\uffff\1\7",
            "\1\16\1\12\4\uffff\1\11\34\uffff\1\15",
            "\1\17\1\12\4\uffff\1\11\34\uffff\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25\1\12\4\uffff\1\11",
            "\1\26",
            "\1\27",
            "\1\30\1\12\4\uffff\1\11",
            "\1\31",
            "\1\12\4\uffff\1\11",
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

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2092:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )";
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
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000004002L});
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
