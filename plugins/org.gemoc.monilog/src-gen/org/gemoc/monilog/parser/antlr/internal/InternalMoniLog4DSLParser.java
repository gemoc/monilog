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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'default-language'", "'appender'", "'('", "','", "')'", "'{'", "';'", "'}'", "'layout'", "'monilogger'", "'['", "']'", "'event'", "'conditions'", "'actions'", "'ast'", "'before'", "'after'", "'complex'", "'custom'", "'exists'", "'always'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'.'", "'call'", "'emit'", "'start'", "'stop'", "'='", "'@Inactive'", "'@Async'", "'INFO'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'"
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
    // InternalMoniLog4DSL.g:72:1: ruleDocument returns [EObject current=null] : ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) ;
    public final EObject ruleDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_defaultLanguageID_1_1=null;
        Token lv_defaultLanguageID_1_2=null;
        EObject lv_events_3_0 = null;

        EObject lv_appenders_4_0 = null;

        EObject lv_layouts_5_0 = null;

        EObject lv_moniLogSpecs_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:78:2: ( ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) )
            // InternalMoniLog4DSL.g:79:2: ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            {
            // InternalMoniLog4DSL.g:79:2: ( (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            // InternalMoniLog4DSL.g:80:3: (otherlv_0= 'default-language' ( ( (lv_defaultLanguageID_1_1= RULE_ID | lv_defaultLanguageID_1_2= RULE_STRING ) ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
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

                    				newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getDefaultLanguageKeyword_0_0());
                    			
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

                            							newLeafNode(lv_defaultLanguageID_1_1, grammarAccess.getDocumentAccess().getDefaultLanguageIDIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDocumentRule());
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

                            							newLeafNode(lv_defaultLanguageID_1_2, grammarAccess.getDocumentAccess().getDefaultLanguageIDSTRINGTerminalRuleCall_0_1_0_1());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getDocumentRule());
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

            // InternalMoniLog4DSL.g:121:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            // InternalMoniLog4DSL.g:122:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            {
            // InternalMoniLog4DSL.g:122:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            // InternalMoniLog4DSL.g:123:5: ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            				
            // InternalMoniLog4DSL.g:126:5: ( ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )* )
            // InternalMoniLog4DSL.g:127:6: ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )*
            {
            // InternalMoniLog4DSL.g:127:6: ( ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) ) )*
            loop7:
            do {
                int alt7=5;
                int LA7_0 = input.LA(1);

                if ( ( LA7_0 == 26 || LA7_0 >= 29 && LA7_0 <= 30 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                    alt7=1;
                }
                else if ( ( LA7_0 == 12 || LA7_0 == 49 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                    alt7=2;
                }
                else if ( LA7_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                    alt7=3;
                }
                else if ( ( LA7_0 == 20 || LA7_0 == 48 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                    alt7=4;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:128:4: ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:128:4: ({...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:129:5: {...}? => ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoniLog4DSL.g:129:105: ( ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+ )
            	    // InternalMoniLog4DSL.g:130:6: ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoniLog4DSL.g:133:9: ({...}? => ( (lv_events_3_0= ruleEvent ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        switch ( input.LA(1) ) {
            	        case 26:
            	            {
            	            int LA3_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 29:
            	            {
            	            int LA3_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;
            	        case 30:
            	            {
            	            int LA3_4 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt3=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:133:10: {...}? => ( (lv_events_3_0= ruleEvent ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:133:19: ( (lv_events_3_0= ruleEvent ) )
            	    	    // InternalMoniLog4DSL.g:133:20: (lv_events_3_0= ruleEvent )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:133:20: (lv_events_3_0= ruleEvent )
            	    	    // InternalMoniLog4DSL.g:134:10: lv_events_3_0= ruleEvent
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_1_0_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_events_3_0=ruleEvent();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"events",
            	    	    											lv_events_3_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.Event");
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog4DSL.g:156:4: ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:156:4: ({...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:157:5: {...}? => ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoniLog4DSL.g:157:105: ( ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+ )
            	    // InternalMoniLog4DSL.g:158:6: ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoniLog4DSL.g:161:9: ({...}? => ( (lv_appenders_4_0= ruleAppender ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==49) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }
            	        else if ( (LA4_0==12) ) {
            	            int LA4_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:161:10: {...}? => ( (lv_appenders_4_0= ruleAppender ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:161:19: ( (lv_appenders_4_0= ruleAppender ) )
            	    	    // InternalMoniLog4DSL.g:161:20: (lv_appenders_4_0= ruleAppender )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:161:20: (lv_appenders_4_0= ruleAppender )
            	    	    // InternalMoniLog4DSL.g:162:10: lv_appenders_4_0= ruleAppender
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_1_1_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_appenders_4_0=ruleAppender();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"appenders",
            	    	    											lv_appenders_4_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.Appender");
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoniLog4DSL.g:184:4: ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:184:4: ({...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:185:5: {...}? => ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoniLog4DSL.g:185:105: ( ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+ )
            	    // InternalMoniLog4DSL.g:186:6: ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoniLog4DSL.g:189:9: ({...}? => ( (lv_layouts_5_0= ruleLayout ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==19) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:189:10: {...}? => ( (lv_layouts_5_0= ruleLayout ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:189:19: ( (lv_layouts_5_0= ruleLayout ) )
            	    	    // InternalMoniLog4DSL.g:189:20: (lv_layouts_5_0= ruleLayout )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:189:20: (lv_layouts_5_0= ruleLayout )
            	    	    // InternalMoniLog4DSL.g:190:10: lv_layouts_5_0= ruleLayout
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_1_2_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_layouts_5_0=ruleLayout();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"layouts",
            	    	    											lv_layouts_5_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.Layout");
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoniLog4DSL.g:212:4: ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) )
            	    {
            	    // InternalMoniLog4DSL.g:212:4: ({...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ ) )
            	    // InternalMoniLog4DSL.g:213:5: {...}? => ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoniLog4DSL.g:213:105: ( ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+ )
            	    // InternalMoniLog4DSL.g:214:6: ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoniLog4DSL.g:217:9: ({...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) ) )+
            	    int cnt6=0;
            	    loop6:
            	    do {
            	        int alt6=2;
            	        int LA6_0 = input.LA(1);

            	        if ( (LA6_0==48) ) {
            	            int LA6_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }
            	        else if ( (LA6_0==20) ) {
            	            int LA6_3 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt6=1;
            	            }


            	        }


            	        switch (alt6) {
            	    	case 1 :
            	    	    // InternalMoniLog4DSL.g:217:10: {...}? => ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog4DSL.g:217:19: ( (lv_moniLogSpecs_6_0= ruleMoniLogger ) )
            	    	    // InternalMoniLog4DSL.g:217:20: (lv_moniLogSpecs_6_0= ruleMoniLogger )
            	    	    {
            	    	    // InternalMoniLog4DSL.g:217:20: (lv_moniLogSpecs_6_0= ruleMoniLogger )
            	    	    // InternalMoniLog4DSL.g:218:10: lv_moniLogSpecs_6_0= ruleMoniLogger
            	    	    {

            	    	    										newCompositeNode(grammarAccess.getDocumentAccess().getMoniLogSpecsMoniLoggerParserRuleCall_1_3_0());
            	    	    									
            	    	    pushFollow(FOLLOW_4);
            	    	    lv_moniLogSpecs_6_0=ruleMoniLogger();

            	    	    state._fsp--;


            	    	    										if (current==null) {
            	    	    											current = createModelElementForParent(grammarAccess.getDocumentRule());
            	    	    										}
            	    	    										add(
            	    	    											current,
            	    	    											"moniLogSpecs",
            	    	    											lv_moniLogSpecs_6_0,
            	    	    											"org.gemoc.monilog.MoniLog4DSL.MoniLogger");
            	    	    										afterParserOrEnumRuleCall();
            	    	    									

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt6 >= 1 ) break loop6;
            	                EarlyExitException eee =
            	                    new EarlyExitException(6, input);
            	                throw eee;
            	        }
            	        cnt6++;
            	    } while (true);

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            				

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


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog4DSL.g:251:1: entryRuleAppender returns [EObject current=null] : iv_ruleAppender= ruleAppender EOF ;
    public final EObject entryRuleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppender = null;


        try {
            // InternalMoniLog4DSL.g:251:49: (iv_ruleAppender= ruleAppender EOF )
            // InternalMoniLog4DSL.g:252:2: iv_ruleAppender= ruleAppender EOF
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
    // InternalMoniLog4DSL.g:258:1: ruleAppender returns [EObject current=null] : (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) ;
    public final EObject ruleAppender() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAppender_0 = null;

        EObject this_ExternalAppender_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:264:2: ( (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) )
            // InternalMoniLog4DSL.g:265:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            {
            // InternalMoniLog4DSL.g:265:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMoniLog4DSL.g:266:3: this_LocalAppender_0= ruleLocalAppender
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
                    // InternalMoniLog4DSL.g:275:3: this_ExternalAppender_1= ruleExternalAppender
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
    // InternalMoniLog4DSL.g:287:1: entryRuleLocalAppender returns [EObject current=null] : iv_ruleLocalAppender= ruleLocalAppender EOF ;
    public final EObject entryRuleLocalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAppender = null;


        try {
            // InternalMoniLog4DSL.g:287:54: (iv_ruleLocalAppender= ruleLocalAppender EOF )
            // InternalMoniLog4DSL.g:288:2: iv_ruleLocalAppender= ruleLocalAppender EOF
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
    // InternalMoniLog4DSL.g:294:1: ruleLocalAppender returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_calls_9_0= ruleAppenderCall ) ) (otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) ) )* otherlv_12= '}' ) ;
    public final EObject ruleLocalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Enumerator lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        EObject lv_calls_9_0 = null;

        EObject lv_calls_11_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:300:2: ( ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_calls_9_0= ruleAppenderCall ) ) (otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) ) )* otherlv_12= '}' ) )
            // InternalMoniLog4DSL.g:301:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_calls_9_0= ruleAppenderCall ) ) (otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) ) )* otherlv_12= '}' )
            {
            // InternalMoniLog4DSL.g:301:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_calls_9_0= ruleAppenderCall ) ) (otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) ) )* otherlv_12= '}' )
            // InternalMoniLog4DSL.g:302:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? otherlv_8= '{' ( (lv_calls_9_0= ruleAppenderCall ) ) (otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) ) )* otherlv_12= '}'
            {
            // InternalMoniLog4DSL.g:302:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==49) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:303:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    {
            	    // InternalMoniLog4DSL.g:303:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    // InternalMoniLog4DSL.g:304:5: lv_annotations_0_0= ruleAppenderAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getLocalAppenderAccess().getAnnotationsAppenderAnnotationEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_5);
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
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getLocalAppenderAccess().getAppenderKeyword_1());
            		
            // InternalMoniLog4DSL.g:325:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:326:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:326:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog4DSL.g:327:5: lv_name_2_0= RULE_ID
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

            // InternalMoniLog4DSL.g:343:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==13) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMoniLog4DSL.g:344:4: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:348:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:349:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:349:5: (lv_parameters_4_0= ruleParameter )
                    // InternalMoniLog4DSL.g:350:6: lv_parameters_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getLocalAppenderAccess().getParametersParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:367:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==14) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:368:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getLocalAppenderAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:372:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:373:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:373:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:374:7: lv_parameters_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLocalAppenderAccess().getParametersParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_8, grammarAccess.getLocalAppenderAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoniLog4DSL.g:401:3: ( (lv_calls_9_0= ruleAppenderCall ) )
            // InternalMoniLog4DSL.g:402:4: (lv_calls_9_0= ruleAppenderCall )
            {
            // InternalMoniLog4DSL.g:402:4: (lv_calls_9_0= ruleAppenderCall )
            // InternalMoniLog4DSL.g:403:5: lv_calls_9_0= ruleAppenderCall
            {

            					newCompositeNode(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMoniLog4DSL.g:420:3: (otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:421:4: otherlv_10= ';' ( (lv_calls_11_0= ruleAppenderCall ) )
            	    {
            	    otherlv_10=(Token)match(input,17,FOLLOW_6); 

            	    				newLeafNode(otherlv_10, grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0());
            	    			
            	    // InternalMoniLog4DSL.g:425:4: ( (lv_calls_11_0= ruleAppenderCall ) )
            	    // InternalMoniLog4DSL.g:426:5: (lv_calls_11_0= ruleAppenderCall )
            	    {
            	    // InternalMoniLog4DSL.g:426:5: (lv_calls_11_0= ruleAppenderCall )
            	    // InternalMoniLog4DSL.g:427:6: lv_calls_11_0= ruleAppenderCall
            	    {

            	    						newCompositeNode(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_calls_11_0=ruleAppenderCall();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getLocalAppenderRule());
            	    						}
            	    						add(
            	    							current,
            	    							"calls",
            	    							lv_calls_11_0,
            	    							"org.gemoc.monilog.MoniLog4DSL.AppenderCall");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_12=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_12, grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMoniLog4DSL.g:453:1: entryRuleExternalAppender returns [EObject current=null] : iv_ruleExternalAppender= ruleExternalAppender EOF ;
    public final EObject entryRuleExternalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAppender = null;


        try {
            // InternalMoniLog4DSL.g:453:57: (iv_ruleExternalAppender= ruleExternalAppender EOF )
            // InternalMoniLog4DSL.g:454:2: iv_ruleExternalAppender= ruleExternalAppender EOF
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
    // InternalMoniLog4DSL.g:460:1: ruleExternalAppender returns [EObject current=null] : (otherlv_0= 'appender' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleExternalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:466:2: ( (otherlv_0= 'appender' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // InternalMoniLog4DSL.g:467:2: (otherlv_0= 'appender' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // InternalMoniLog4DSL.g:467:2: (otherlv_0= 'appender' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // InternalMoniLog4DSL.g:468:3: otherlv_0= 'appender' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0());
            		
            // InternalMoniLog4DSL.g:472:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalMoniLog4DSL.g:473:4: (lv_name_1_0= ruleFQN )
            {
            // InternalMoniLog4DSL.g:473:4: (lv_name_1_0= ruleFQN )
            // InternalMoniLog4DSL.g:474:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getExternalAppenderAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalAppenderRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:491:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==13) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoniLog4DSL.g:492:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:496:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:497:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:497:5: (lv_parameters_3_0= ruleParameter )
                    // InternalMoniLog4DSL.g:498:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getExternalAppenderAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalAppenderRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:515:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==14) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:516:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalAppenderAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:520:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:521:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:521:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:522:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalAppenderAccess().getParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalAppenderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // InternalMoniLog4DSL.g:549:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMoniLog4DSL.g:549:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMoniLog4DSL.g:550:2: iv_ruleLayout= ruleLayout EOF
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
    // InternalMoniLog4DSL.g:556:1: ruleLayout returns [EObject current=null] : (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LocalLayout_0 = null;

        EObject this_ExternalLayout_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:562:2: ( (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) )
            // InternalMoniLog4DSL.g:563:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            {
            // InternalMoniLog4DSL.g:563:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            int alt15=2;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // InternalMoniLog4DSL.g:564:3: this_LocalLayout_0= ruleLocalLayout
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
                    // InternalMoniLog4DSL.g:573:3: this_ExternalLayout_1= ruleExternalLayout
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
    // InternalMoniLog4DSL.g:585:1: entryRuleLocalLayout returns [EObject current=null] : iv_ruleLocalLayout= ruleLocalLayout EOF ;
    public final EObject entryRuleLocalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalLayout = null;


        try {
            // InternalMoniLog4DSL.g:585:52: (iv_ruleLocalLayout= ruleLocalLayout EOF )
            // InternalMoniLog4DSL.g:586:2: iv_ruleLocalLayout= ruleLocalLayout EOF
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
    // InternalMoniLog4DSL.g:592:1: ruleLocalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_call_8_0= ruleLayoutCall ) ) otherlv_9= '}' ) ;
    public final EObject ruleLocalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;

        EObject lv_call_8_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:598:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_call_8_0= ruleLayoutCall ) ) otherlv_9= '}' ) )
            // InternalMoniLog4DSL.g:599:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_call_8_0= ruleLayoutCall ) ) otherlv_9= '}' )
            {
            // InternalMoniLog4DSL.g:599:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_call_8_0= ruleLayoutCall ) ) otherlv_9= '}' )
            // InternalMoniLog4DSL.g:600:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? otherlv_7= '{' ( (lv_call_8_0= ruleLayoutCall ) ) otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getLocalLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMoniLog4DSL.g:604:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:605:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:605:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:606:5: lv_name_1_0= RULE_ID
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

            // InternalMoniLog4DSL.g:622:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==13) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoniLog4DSL.g:623:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:627:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:628:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:628:5: (lv_parameters_3_0= ruleParameter )
                    // InternalMoniLog4DSL.g:629:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getLocalLayoutAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLocalLayoutRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:646:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==14) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:647:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getLocalLayoutAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:651:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:652:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:652:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:653:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getLocalLayoutAccess().getParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLocalLayoutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop16;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_9); 

                    				newLeafNode(otherlv_6, grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_3());
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_6); 

            			newLeafNode(otherlv_7, grammarAccess.getLocalLayoutAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoniLog4DSL.g:680:3: ( (lv_call_8_0= ruleLayoutCall ) )
            // InternalMoniLog4DSL.g:681:4: (lv_call_8_0= ruleLayoutCall )
            {
            // InternalMoniLog4DSL.g:681:4: (lv_call_8_0= ruleLayoutCall )
            // InternalMoniLog4DSL.g:682:5: lv_call_8_0= ruleLayoutCall
            {

            					newCompositeNode(grammarAccess.getLocalLayoutAccess().getCallLayoutCallParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_call_8_0=ruleLayoutCall();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLocalLayoutRule());
            					}
            					set(
            						current,
            						"call",
            						lv_call_8_0,
            						"org.gemoc.monilog.MoniLog4DSL.LayoutCall");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5());
            		

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
    // InternalMoniLog4DSL.g:707:1: entryRuleExternalLayout returns [EObject current=null] : iv_ruleExternalLayout= ruleExternalLayout EOF ;
    public final EObject entryRuleExternalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLayout = null;


        try {
            // InternalMoniLog4DSL.g:707:55: (iv_ruleExternalLayout= ruleExternalLayout EOF )
            // InternalMoniLog4DSL.g:708:2: iv_ruleExternalLayout= ruleExternalLayout EOF
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
    // InternalMoniLog4DSL.g:714:1: ruleExternalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleExternalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:720:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // InternalMoniLog4DSL.g:721:2: (otherlv_0= 'layout' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // InternalMoniLog4DSL.g:721:2: (otherlv_0= 'layout' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // InternalMoniLog4DSL.g:722:3: otherlv_0= 'layout' ( (lv_name_1_0= ruleFQN ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,19,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getExternalLayoutAccess().getLayoutKeyword_0());
            		
            // InternalMoniLog4DSL.g:726:3: ( (lv_name_1_0= ruleFQN ) )
            // InternalMoniLog4DSL.g:727:4: (lv_name_1_0= ruleFQN )
            {
            // InternalMoniLog4DSL.g:727:4: (lv_name_1_0= ruleFQN )
            // InternalMoniLog4DSL.g:728:5: lv_name_1_0= ruleFQN
            {

            					newCompositeNode(grammarAccess.getExternalLayoutAccess().getNameFQNParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_name_1_0=ruleFQN();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getExternalLayoutRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.FQN");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoniLog4DSL.g:745:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoniLog4DSL.g:746:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:750:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:751:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:751:5: (lv_parameters_3_0= ruleParameter )
                    // InternalMoniLog4DSL.g:752:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getExternalLayoutAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getExternalLayoutRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:769:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==14) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:770:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getExternalLayoutAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:774:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:775:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:775:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:776:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getExternalLayoutAccess().getParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getExternalLayoutRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
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

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_3());
                    			

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


    // $ANTLR start "entryRuleMoniLogger"
    // InternalMoniLog4DSL.g:803:1: entryRuleMoniLogger returns [EObject current=null] : iv_ruleMoniLogger= ruleMoniLogger EOF ;
    public final EObject entryRuleMoniLogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLogger = null;


        try {
            // InternalMoniLog4DSL.g:803:51: (iv_ruleMoniLogger= ruleMoniLogger EOF )
            // InternalMoniLog4DSL.g:804:2: iv_ruleMoniLogger= ruleMoniLogger EOF
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
    // InternalMoniLog4DSL.g:810:1: ruleMoniLogger returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? (otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']' )? otherlv_11= '{' otherlv_12= 'event' ( (otherlv_13= RULE_ID ) ) (otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}' )? otherlv_20= 'actions' otherlv_21= '{' ( (lv_actions_22_0= ruleAction ) ) (otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) ) )* otherlv_25= '}' otherlv_26= '}' ) ;
    public final EObject ruleMoniLogger() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Enumerator lv_annotations_0_0 = null;

        EObject lv_parameters_4_0 = null;

        EObject lv_parameters_6_0 = null;

        Enumerator lv_level_9_0 = null;

        EObject lv_conditions_16_0 = null;

        EObject lv_conditions_18_0 = null;

        EObject lv_actions_22_0 = null;

        EObject lv_actions_24_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:816:2: ( ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? (otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']' )? otherlv_11= '{' otherlv_12= 'event' ( (otherlv_13= RULE_ID ) ) (otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}' )? otherlv_20= 'actions' otherlv_21= '{' ( (lv_actions_22_0= ruleAction ) ) (otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) ) )* otherlv_25= '}' otherlv_26= '}' ) )
            // InternalMoniLog4DSL.g:817:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? (otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']' )? otherlv_11= '{' otherlv_12= 'event' ( (otherlv_13= RULE_ID ) ) (otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}' )? otherlv_20= 'actions' otherlv_21= '{' ( (lv_actions_22_0= ruleAction ) ) (otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) ) )* otherlv_25= '}' otherlv_26= '}' )
            {
            // InternalMoniLog4DSL.g:817:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? (otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']' )? otherlv_11= '{' otherlv_12= 'event' ( (otherlv_13= RULE_ID ) ) (otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}' )? otherlv_20= 'actions' otherlv_21= '{' ( (lv_actions_22_0= ruleAction ) ) (otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) ) )* otherlv_25= '}' otherlv_26= '}' )
            // InternalMoniLog4DSL.g:818:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )? (otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']' )? otherlv_11= '{' otherlv_12= 'event' ( (otherlv_13= RULE_ID ) ) (otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}' )? otherlv_20= 'actions' otherlv_21= '{' ( (lv_actions_22_0= ruleAction ) ) (otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) ) )* otherlv_25= '}' otherlv_26= '}'
            {
            // InternalMoniLog4DSL.g:818:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==48) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:819:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    {
            	    // InternalMoniLog4DSL.g:819:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    // InternalMoniLog4DSL.g:820:5: lv_annotations_0_0= ruleMoniLoggerAnnotation
            	    {

            	    					newCompositeNode(grammarAccess.getMoniLoggerAccess().getAnnotationsMoniLoggerAnnotationEnumRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_13);
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

            otherlv_1=(Token)match(input,20,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1());
            		
            // InternalMoniLog4DSL.g:841:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:842:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:842:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog4DSL.g:843:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_14); 

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

            // InternalMoniLog4DSL.g:859:3: (otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==13) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoniLog4DSL.g:860:4: otherlv_3= '(' ( (lv_parameters_4_0= ruleParameter ) ) (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:864:4: ( (lv_parameters_4_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:865:5: (lv_parameters_4_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:865:5: (lv_parameters_4_0= ruleParameter )
                    // InternalMoniLog4DSL.g:866:6: lv_parameters_4_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getParametersParameterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_4_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:883:4: (otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) ) )*
                    loop21:
                    do {
                        int alt21=2;
                        int LA21_0 = input.LA(1);

                        if ( (LA21_0==14) ) {
                            alt21=1;
                        }


                        switch (alt21) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:884:5: otherlv_5= ',' ( (lv_parameters_6_0= ruleParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getMoniLoggerAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:888:5: ( (lv_parameters_6_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:889:6: (lv_parameters_6_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:889:6: (lv_parameters_6_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:890:7: lv_parameters_6_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoniLoggerAccess().getParametersParameterParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_6_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_6_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop21;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,15,FOLLOW_15); 

                    				newLeafNode(otherlv_7, grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }

            // InternalMoniLog4DSL.g:913:3: (otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==21) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog4DSL.g:914:4: otherlv_8= '[' ( (lv_level_9_0= ruleLogLevel ) ) otherlv_10= ']'
                    {
                    otherlv_8=(Token)match(input,21,FOLLOW_16); 

                    				newLeafNode(otherlv_8, grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0());
                    			
                    // InternalMoniLog4DSL.g:918:4: ( (lv_level_9_0= ruleLogLevel ) )
                    // InternalMoniLog4DSL.g:919:5: (lv_level_9_0= ruleLogLevel )
                    {
                    // InternalMoniLog4DSL.g:919:5: (lv_level_9_0= ruleLogLevel )
                    // InternalMoniLog4DSL.g:920:6: lv_level_9_0= ruleLogLevel
                    {

                    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getLevelLogLevelEnumRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_level_9_0=ruleLogLevel();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    						}
                    						set(
                    							current,
                    							"level",
                    							lv_level_9_0,
                    							"org.gemoc.monilog.MoniLog4DSL.LogLevel");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_10, grammarAccess.getMoniLoggerAccess().getRightSquareBracketKeyword_4_2());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_5());
            		
            otherlv_12=(Token)match(input,23,FOLLOW_6); 

            			newLeafNode(otherlv_12, grammarAccess.getMoniLoggerAccess().getEventKeyword_6());
            		
            // InternalMoniLog4DSL.g:950:3: ( (otherlv_13= RULE_ID ) )
            // InternalMoniLog4DSL.g:951:4: (otherlv_13= RULE_ID )
            {
            // InternalMoniLog4DSL.g:951:4: (otherlv_13= RULE_ID )
            // InternalMoniLog4DSL.g:952:5: otherlv_13= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMoniLoggerRule());
            					}
            				
            otherlv_13=(Token)match(input,RULE_ID,FOLLOW_19); 

            					newLeafNode(otherlv_13, grammarAccess.getMoniLoggerAccess().getEventEventCrossReference_7_0());
            				

            }


            }

            // InternalMoniLog4DSL.g:963:3: (otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==24) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMoniLog4DSL.g:964:4: otherlv_14= 'conditions' otherlv_15= '{' ( (lv_conditions_16_0= ruleCondition ) ) (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )* otherlv_19= '}'
                    {
                    otherlv_14=(Token)match(input,24,FOLLOW_9); 

                    				newLeafNode(otherlv_14, grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0());
                    			
                    otherlv_15=(Token)match(input,16,FOLLOW_3); 

                    				newLeafNode(otherlv_15, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1());
                    			
                    // InternalMoniLog4DSL.g:972:4: ( (lv_conditions_16_0= ruleCondition ) )
                    // InternalMoniLog4DSL.g:973:5: (lv_conditions_16_0= ruleCondition )
                    {
                    // InternalMoniLog4DSL.g:973:5: (lv_conditions_16_0= ruleCondition )
                    // InternalMoniLog4DSL.g:974:6: lv_conditions_16_0= ruleCondition
                    {

                    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_2_0());
                    					
                    pushFollow(FOLLOW_10);
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

                    // InternalMoniLog4DSL.g:991:4: (otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) ) )*
                    loop24:
                    do {
                        int alt24=2;
                        int LA24_0 = input.LA(1);

                        if ( (LA24_0==17) ) {
                            alt24=1;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:992:5: otherlv_17= ';' ( (lv_conditions_18_0= ruleCondition ) )
                    	    {
                    	    otherlv_17=(Token)match(input,17,FOLLOW_3); 

                    	    					newLeafNode(otherlv_17, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:996:5: ( (lv_conditions_18_0= ruleCondition ) )
                    	    // InternalMoniLog4DSL.g:997:6: (lv_conditions_18_0= ruleCondition )
                    	    {
                    	    // InternalMoniLog4DSL.g:997:6: (lv_conditions_18_0= ruleCondition )
                    	    // InternalMoniLog4DSL.g:998:7: lv_conditions_18_0= ruleCondition
                    	    {

                    	    							newCompositeNode(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_10);
                    	    lv_conditions_18_0=ruleCondition();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"conditions",
                    	    								lv_conditions_18_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Condition");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);

                    otherlv_19=(Token)match(input,18,FOLLOW_20); 

                    				newLeafNode(otherlv_19, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_4());
                    			

                    }
                    break;

            }

            otherlv_20=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_20, grammarAccess.getMoniLoggerAccess().getActionsKeyword_9());
            		
            otherlv_21=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_21, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalMoniLog4DSL.g:1029:3: ( (lv_actions_22_0= ruleAction ) )
            // InternalMoniLog4DSL.g:1030:4: (lv_actions_22_0= ruleAction )
            {
            // InternalMoniLog4DSL.g:1030:4: (lv_actions_22_0= ruleAction )
            // InternalMoniLog4DSL.g:1031:5: lv_actions_22_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_10);
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

            // InternalMoniLog4DSL.g:1048:3: (otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==17) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1049:4: otherlv_23= ';' ( (lv_actions_24_0= ruleAction ) )
            	    {
            	    otherlv_23=(Token)match(input,17,FOLLOW_3); 

            	    				newLeafNode(otherlv_23, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0());
            	    			
            	    // InternalMoniLog4DSL.g:1053:4: ( (lv_actions_24_0= ruleAction ) )
            	    // InternalMoniLog4DSL.g:1054:5: (lv_actions_24_0= ruleAction )
            	    {
            	    // InternalMoniLog4DSL.g:1054:5: (lv_actions_24_0= ruleAction )
            	    // InternalMoniLog4DSL.g:1055:6: lv_actions_24_0= ruleAction
            	    {

            	    						newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_actions_24_0=ruleAction();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMoniLoggerRule());
            	    						}
            	    						add(
            	    							current,
            	    							"actions",
            	    							lv_actions_24_0,
            	    							"org.gemoc.monilog.MoniLog4DSL.Action");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_25=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_25, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_26=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_26, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14());
            		

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
    // InternalMoniLog4DSL.g:1085:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMoniLog4DSL.g:1085:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMoniLog4DSL.g:1086:2: iv_ruleParameter= ruleParameter EOF
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
    // InternalMoniLog4DSL.g:1092:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1098:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMoniLog4DSL.g:1099:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:1099:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:1100:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:1100:3: (lv_name_0_0= RULE_ID )
            // InternalMoniLog4DSL.g:1101:4: lv_name_0_0= RULE_ID
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
    // InternalMoniLog4DSL.g:1120:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMoniLog4DSL.g:1120:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMoniLog4DSL.g:1121:2: iv_ruleEvent= ruleEvent EOF
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
    // InternalMoniLog4DSL.g:1127:1: ruleEvent returns [EObject current=null] : (this_ASTEvent_0= ruleASTEvent | this_ComplexEvent_1= ruleComplexEvent | this_UserEvent_2= ruleUserEvent ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        EObject this_ASTEvent_0 = null;

        EObject this_ComplexEvent_1 = null;

        EObject this_UserEvent_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1133:2: ( (this_ASTEvent_0= ruleASTEvent | this_ComplexEvent_1= ruleComplexEvent | this_UserEvent_2= ruleUserEvent ) )
            // InternalMoniLog4DSL.g:1134:2: (this_ASTEvent_0= ruleASTEvent | this_ComplexEvent_1= ruleComplexEvent | this_UserEvent_2= ruleUserEvent )
            {
            // InternalMoniLog4DSL.g:1134:2: (this_ASTEvent_0= ruleASTEvent | this_ComplexEvent_1= ruleComplexEvent | this_UserEvent_2= ruleUserEvent )
            int alt27=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt27=1;
                }
                break;
            case 29:
                {
                alt27=2;
                }
                break;
            case 30:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalMoniLog4DSL.g:1135:3: this_ASTEvent_0= ruleASTEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getASTEventParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_ASTEvent_0=ruleASTEvent();

                    state._fsp--;


                    			current = this_ASTEvent_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1144:3: this_ComplexEvent_1= ruleComplexEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getComplexEventParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComplexEvent_1=ruleComplexEvent();

                    state._fsp--;


                    			current = this_ComplexEvent_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1153:3: this_UserEvent_2= ruleUserEvent
                    {

                    			newCompositeNode(grammarAccess.getEventAccess().getUserEventParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_UserEvent_2=ruleUserEvent();

                    state._fsp--;


                    			current = this_UserEvent_2;
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


    // $ANTLR start "entryRuleASTEvent"
    // InternalMoniLog4DSL.g:1165:1: entryRuleASTEvent returns [EObject current=null] : iv_ruleASTEvent= ruleASTEvent EOF ;
    public final EObject entryRuleASTEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASTEvent = null;


        try {
            // InternalMoniLog4DSL.g:1165:49: (iv_ruleASTEvent= ruleASTEvent EOF )
            // InternalMoniLog4DSL.g:1166:2: iv_ruleASTEvent= ruleASTEvent EOF
            {
             newCompositeNode(grammarAccess.getASTEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleASTEvent=ruleASTEvent();

            state._fsp--;

             current =iv_ruleASTEvent; 
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
    // $ANTLR end "entryRuleASTEvent"


    // $ANTLR start "ruleASTEvent"
    // InternalMoniLog4DSL.g:1172:1: ruleASTEvent returns [EObject current=null] : (otherlv_0= 'ast' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) ) ) ( (lv_ruleID_6_0= RULE_ID ) ) otherlv_7= '}' ) ;
    public final EObject ruleASTEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_before_4_0=null;
        Token lv_after_5_0=null;
        Token lv_ruleID_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1178:2: ( (otherlv_0= 'ast' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) ) ) ( (lv_ruleID_6_0= RULE_ID ) ) otherlv_7= '}' ) )
            // InternalMoniLog4DSL.g:1179:2: (otherlv_0= 'ast' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) ) ) ( (lv_ruleID_6_0= RULE_ID ) ) otherlv_7= '}' )
            {
            // InternalMoniLog4DSL.g:1179:2: (otherlv_0= 'ast' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) ) ) ( (lv_ruleID_6_0= RULE_ID ) ) otherlv_7= '}' )
            // InternalMoniLog4DSL.g:1180:3: otherlv_0= 'ast' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) ) ) ( (lv_ruleID_6_0= RULE_ID ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getASTEventAccess().getAstKeyword_0());
            		
            // InternalMoniLog4DSL.g:1184:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:1185:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:1185:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:1186:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); 

            					newLeafNode(lv_name_1_0, grammarAccess.getASTEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getASTEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getASTEventAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoniLog4DSL.g:1206:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) ) )
            // InternalMoniLog4DSL.g:1207:4: ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) )
            {
            // InternalMoniLog4DSL.g:1207:4: ( ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* ) )
            // InternalMoniLog4DSL.g:1208:5: ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
            				
            // InternalMoniLog4DSL.g:1211:5: ( ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )* )
            // InternalMoniLog4DSL.g:1212:6: ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )*
            {
            // InternalMoniLog4DSL.g:1212:6: ( ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0) ) {
                    alt28=1;
                }
                else if ( LA28_0 == 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1) ) {
                    alt28=2;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1213:4: ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:1213:4: ({...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) ) )
            	    // InternalMoniLog4DSL.g:1214:5: {...}? => ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleASTEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoniLog4DSL.g:1214:105: ( ({...}? => ( (lv_before_4_0= 'before' ) ) ) )
            	    // InternalMoniLog4DSL.g:1215:6: ({...}? => ( (lv_before_4_0= 'before' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoniLog4DSL.g:1218:9: ({...}? => ( (lv_before_4_0= 'before' ) ) )
            	    // InternalMoniLog4DSL.g:1218:10: {...}? => ( (lv_before_4_0= 'before' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleASTEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:1218:19: ( (lv_before_4_0= 'before' ) )
            	    // InternalMoniLog4DSL.g:1218:20: (lv_before_4_0= 'before' )
            	    {
            	    // InternalMoniLog4DSL.g:1218:20: (lv_before_4_0= 'before' )
            	    // InternalMoniLog4DSL.g:1219:10: lv_before_4_0= 'before'
            	    {
            	    lv_before_4_0=(Token)match(input,27,FOLLOW_21); 

            	    										newLeafNode(lv_before_4_0, grammarAccess.getASTEventAccess().getBeforeBeforeKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getASTEventRule());
            	    										}
            	    										setWithLastConsumed(current, "before", lv_before_4_0 != null, "before");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog4DSL.g:1236:4: ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) )
            	    {
            	    // InternalMoniLog4DSL.g:1236:4: ({...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) ) )
            	    // InternalMoniLog4DSL.g:1237:5: {...}? => ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleASTEvent", "getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoniLog4DSL.g:1237:105: ( ({...}? => ( (lv_after_5_0= 'after' ) ) ) )
            	    // InternalMoniLog4DSL.g:1238:6: ({...}? => ( (lv_after_5_0= 'after' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoniLog4DSL.g:1241:9: ({...}? => ( (lv_after_5_0= 'after' ) ) )
            	    // InternalMoniLog4DSL.g:1241:10: {...}? => ( (lv_after_5_0= 'after' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleASTEvent", "true");
            	    }
            	    // InternalMoniLog4DSL.g:1241:19: ( (lv_after_5_0= 'after' ) )
            	    // InternalMoniLog4DSL.g:1241:20: (lv_after_5_0= 'after' )
            	    {
            	    // InternalMoniLog4DSL.g:1241:20: (lv_after_5_0= 'after' )
            	    // InternalMoniLog4DSL.g:1242:10: lv_after_5_0= 'after'
            	    {
            	    lv_after_5_0=(Token)match(input,28,FOLLOW_21); 

            	    										newLeafNode(lv_after_5_0, grammarAccess.getASTEventAccess().getAfterAfterKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getASTEventRule());
            	    										}
            	    										setWithLastConsumed(current, "after", lv_after_5_0 != null, "after");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
            				

            }

            // InternalMoniLog4DSL.g:1266:3: ( (lv_ruleID_6_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:1267:4: (lv_ruleID_6_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:1267:4: (lv_ruleID_6_0= RULE_ID )
            // InternalMoniLog4DSL.g:1268:5: lv_ruleID_6_0= RULE_ID
            {
            lv_ruleID_6_0=(Token)match(input,RULE_ID,FOLLOW_12); 

            					newLeafNode(lv_ruleID_6_0, grammarAccess.getASTEventAccess().getRuleIDIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getASTEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"ruleID",
            						lv_ruleID_6_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getASTEventAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleASTEvent"


    // $ANTLR start "entryRuleComplexEvent"
    // InternalMoniLog4DSL.g:1292:1: entryRuleComplexEvent returns [EObject current=null] : iv_ruleComplexEvent= ruleComplexEvent EOF ;
    public final EObject entryRuleComplexEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComplexEvent = null;


        try {
            // InternalMoniLog4DSL.g:1292:53: (iv_ruleComplexEvent= ruleComplexEvent EOF )
            // InternalMoniLog4DSL.g:1293:2: iv_ruleComplexEvent= ruleComplexEvent EOF
            {
             newCompositeNode(grammarAccess.getComplexEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComplexEvent=ruleComplexEvent();

            state._fsp--;

             current =iv_ruleComplexEvent; 
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
    // $ANTLR end "entryRuleComplexEvent"


    // $ANTLR start "ruleComplexEvent"
    // InternalMoniLog4DSL.g:1299:1: ruleComplexEvent returns [EObject current=null] : (otherlv_0= 'complex' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']' )? otherlv_5= '{' ( (lv_pattern_6_0= ruleTemporalPattern ) ) otherlv_7= '}' ) ;
    public final EObject ruleComplexEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_kind_3_0 = null;

        EObject lv_pattern_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1305:2: ( (otherlv_0= 'complex' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']' )? otherlv_5= '{' ( (lv_pattern_6_0= ruleTemporalPattern ) ) otherlv_7= '}' ) )
            // InternalMoniLog4DSL.g:1306:2: (otherlv_0= 'complex' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']' )? otherlv_5= '{' ( (lv_pattern_6_0= ruleTemporalPattern ) ) otherlv_7= '}' )
            {
            // InternalMoniLog4DSL.g:1306:2: (otherlv_0= 'complex' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']' )? otherlv_5= '{' ( (lv_pattern_6_0= ruleTemporalPattern ) ) otherlv_7= '}' )
            // InternalMoniLog4DSL.g:1307:3: otherlv_0= 'complex' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']' )? otherlv_5= '{' ( (lv_pattern_6_0= ruleTemporalPattern ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getComplexEventAccess().getComplexKeyword_0());
            		
            // InternalMoniLog4DSL.g:1311:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:1312:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:1312:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:1313:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getComplexEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComplexEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:1329:3: (otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==21) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoniLog4DSL.g:1330:4: otherlv_2= '[' ( (lv_kind_3_0= ruleTemporalPatternKind ) ) otherlv_4= ']'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_22); 

                    				newLeafNode(otherlv_2, grammarAccess.getComplexEventAccess().getLeftSquareBracketKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:1334:4: ( (lv_kind_3_0= ruleTemporalPatternKind ) )
                    // InternalMoniLog4DSL.g:1335:5: (lv_kind_3_0= ruleTemporalPatternKind )
                    {
                    // InternalMoniLog4DSL.g:1335:5: (lv_kind_3_0= ruleTemporalPatternKind )
                    // InternalMoniLog4DSL.g:1336:6: lv_kind_3_0= ruleTemporalPatternKind
                    {

                    						newCompositeNode(grammarAccess.getComplexEventAccess().getKindTemporalPatternKindEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_17);
                    lv_kind_3_0=ruleTemporalPatternKind();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getComplexEventRule());
                    						}
                    						set(
                    							current,
                    							"kind",
                    							lv_kind_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.TemporalPatternKind");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,22,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getComplexEventAccess().getRightSquareBracketKeyword_2_2());
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_23); 

            			newLeafNode(otherlv_5, grammarAccess.getComplexEventAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoniLog4DSL.g:1362:3: ( (lv_pattern_6_0= ruleTemporalPattern ) )
            // InternalMoniLog4DSL.g:1363:4: (lv_pattern_6_0= ruleTemporalPattern )
            {
            // InternalMoniLog4DSL.g:1363:4: (lv_pattern_6_0= ruleTemporalPattern )
            // InternalMoniLog4DSL.g:1364:5: lv_pattern_6_0= ruleTemporalPattern
            {

            					newCompositeNode(grammarAccess.getComplexEventAccess().getPatternTemporalPatternParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_12);
            lv_pattern_6_0=ruleTemporalPattern();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getComplexEventRule());
            					}
            					set(
            						current,
            						"pattern",
            						lv_pattern_6_0,
            						"org.gemoc.monilog.MoniLog4DSL.TemporalPattern");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getComplexEventAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleComplexEvent"


    // $ANTLR start "entryRuleUserEvent"
    // InternalMoniLog4DSL.g:1389:1: entryRuleUserEvent returns [EObject current=null] : iv_ruleUserEvent= ruleUserEvent EOF ;
    public final EObject entryRuleUserEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUserEvent = null;


        try {
            // InternalMoniLog4DSL.g:1389:50: (iv_ruleUserEvent= ruleUserEvent EOF )
            // InternalMoniLog4DSL.g:1390:2: iv_ruleUserEvent= ruleUserEvent EOF
            {
             newCompositeNode(grammarAccess.getUserEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUserEvent=ruleUserEvent();

            state._fsp--;

             current =iv_ruleUserEvent; 
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
    // $ANTLR end "entryRuleUserEvent"


    // $ANTLR start "ruleUserEvent"
    // InternalMoniLog4DSL.g:1396:1: ruleUserEvent returns [EObject current=null] : (otherlv_0= 'custom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) ;
    public final EObject ruleUserEvent() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_parameters_3_0 = null;

        EObject lv_parameters_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1402:2: ( (otherlv_0= 'custom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? ) )
            // InternalMoniLog4DSL.g:1403:2: (otherlv_0= 'custom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            {
            // InternalMoniLog4DSL.g:1403:2: (otherlv_0= 'custom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )? )
            // InternalMoniLog4DSL.g:1404:3: otherlv_0= 'custom' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            {
            otherlv_0=(Token)match(input,30,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getUserEventAccess().getCustomKeyword_0());
            		
            // InternalMoniLog4DSL.g:1408:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:1409:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:1409:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog4DSL.g:1410:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getUserEventAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getUserEventRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoniLog4DSL.g:1426:3: (otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==13) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoniLog4DSL.g:1427:4: otherlv_2= '(' ( (lv_parameters_3_0= ruleParameter ) ) (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )* otherlv_6= ')'
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getUserEventAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoniLog4DSL.g:1431:4: ( (lv_parameters_3_0= ruleParameter ) )
                    // InternalMoniLog4DSL.g:1432:5: (lv_parameters_3_0= ruleParameter )
                    {
                    // InternalMoniLog4DSL.g:1432:5: (lv_parameters_3_0= ruleParameter )
                    // InternalMoniLog4DSL.g:1433:6: lv_parameters_3_0= ruleParameter
                    {

                    						newCompositeNode(grammarAccess.getUserEventAccess().getParametersParameterParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_parameters_3_0=ruleParameter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getUserEventRule());
                    						}
                    						add(
                    							current,
                    							"parameters",
                    							lv_parameters_3_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:1450:4: (otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==14) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:1451:5: otherlv_4= ',' ( (lv_parameters_5_0= ruleParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FOLLOW_6); 

                    	    					newLeafNode(otherlv_4, grammarAccess.getUserEventAccess().getCommaKeyword_2_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:1455:5: ( (lv_parameters_5_0= ruleParameter ) )
                    	    // InternalMoniLog4DSL.g:1456:6: (lv_parameters_5_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog4DSL.g:1456:6: (lv_parameters_5_0= ruleParameter )
                    	    // InternalMoniLog4DSL.g:1457:7: lv_parameters_5_0= ruleParameter
                    	    {

                    	    							newCompositeNode(grammarAccess.getUserEventAccess().getParametersParameterParserRuleCall_2_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_5_0=ruleParameter();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getUserEventRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"parameters",
                    	    								lv_parameters_5_0,
                    	    								"org.gemoc.monilog.MoniLog4DSL.Parameter");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);

                    otherlv_6=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_6, grammarAccess.getUserEventAccess().getRightParenthesisKeyword_2_3());
                    			

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
    // $ANTLR end "ruleUserEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog4DSL.g:1484:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMoniLog4DSL.g:1484:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMoniLog4DSL.g:1485:2: iv_ruleCondition= ruleCondition EOF
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
    // InternalMoniLog4DSL.g:1491:1: ruleCondition returns [EObject current=null] : ( () ( (lv_expression_1_0= ruleLanguageExpression ) ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1497:2: ( ( () ( (lv_expression_1_0= ruleLanguageExpression ) ) ) )
            // InternalMoniLog4DSL.g:1498:2: ( () ( (lv_expression_1_0= ruleLanguageExpression ) ) )
            {
            // InternalMoniLog4DSL.g:1498:2: ( () ( (lv_expression_1_0= ruleLanguageExpression ) ) )
            // InternalMoniLog4DSL.g:1499:3: () ( (lv_expression_1_0= ruleLanguageExpression ) )
            {
            // InternalMoniLog4DSL.g:1499:3: ()
            // InternalMoniLog4DSL.g:1500:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getConditionAccess().getLanguageExpressionConditionAction_0(),
            					current);
            			

            }

            // InternalMoniLog4DSL.g:1506:3: ( (lv_expression_1_0= ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:1507:4: (lv_expression_1_0= ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:1507:4: (lv_expression_1_0= ruleLanguageExpression )
            // InternalMoniLog4DSL.g:1508:5: lv_expression_1_0= ruleLanguageExpression
            {

            					newCompositeNode(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_1_0=ruleLanguageExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.gemoc.monilog.MoniLog4DSL.LanguageExpression");
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalMoniLog4DSL.g:1529:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalMoniLog4DSL.g:1529:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalMoniLog4DSL.g:1530:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
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
    // InternalMoniLog4DSL.g:1536:1: ruleTemporalPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;

        EObject lv_scope_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1542:2: ( ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) )
            // InternalMoniLog4DSL.g:1543:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            {
            // InternalMoniLog4DSL.g:1543:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            // InternalMoniLog4DSL.g:1544:3: ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) )
            {
            // InternalMoniLog4DSL.g:1544:3: ( (lv_pattern_0_0= rulePattern ) )
            // InternalMoniLog4DSL.g:1545:4: (lv_pattern_0_0= rulePattern )
            {
            // InternalMoniLog4DSL.g:1545:4: (lv_pattern_0_0= rulePattern )
            // InternalMoniLog4DSL.g:1546:5: lv_pattern_0_0= rulePattern
            {

            					newCompositeNode(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMoniLog4DSL.g:1563:3: ( (lv_scope_1_0= ruleScope ) )
            // InternalMoniLog4DSL.g:1564:4: (lv_scope_1_0= ruleScope )
            {
            // InternalMoniLog4DSL.g:1564:4: (lv_scope_1_0= ruleScope )
            // InternalMoniLog4DSL.g:1565:5: lv_scope_1_0= ruleScope
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
    // InternalMoniLog4DSL.g:1586:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMoniLog4DSL.g:1586:48: (iv_rulePattern= rulePattern EOF )
            // InternalMoniLog4DSL.g:1587:2: iv_rulePattern= rulePattern EOF
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
    // InternalMoniLog4DSL.g:1593:1: rulePattern returns [EObject current=null] : ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog4DSL.g:1599:2: ( ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog4DSL.g:1600:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog4DSL.g:1600:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            int alt34=5;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // InternalMoniLog4DSL.g:1601:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1601:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1602:4: () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1602:4: ()
                    // InternalMoniLog4DSL.g:1603:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getExistenceAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1609:4: (otherlv_1= 'exists' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==31) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1610:5: otherlv_1= 'exists'
                            {
                            otherlv_1=(Token)match(input,31,FOLLOW_25); 

                            					newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getExistsKeyword_0_1());
                            				

                            }
                            break;

                    }

                    // InternalMoniLog4DSL.g:1615:4: ( (lv_bound_2_0= ruleBoundType ) )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==RULE_INT||(LA33_0>=36 && LA33_0<=37)) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMoniLog4DSL.g:1616:5: (lv_bound_2_0= ruleBoundType )
                            {
                            // InternalMoniLog4DSL.g:1616:5: (lv_bound_2_0= ruleBoundType )
                            // InternalMoniLog4DSL.g:1617:6: lv_bound_2_0= ruleBoundType
                            {

                            						newCompositeNode(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_0_2_0());
                            					
                            pushFollow(FOLLOW_25);
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

                    // InternalMoniLog4DSL.g:1634:4: ( (lv_event_3_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1635:5: (lv_event_3_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1635:5: (lv_event_3_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1636:6: lv_event_3_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:1655:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1655:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1656:4: () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1656:4: ()
                    // InternalMoniLog4DSL.g:1657:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getUniversalityAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_5=(Token)match(input,32,FOLLOW_25); 

                    				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getAlwaysKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:1667:4: ( (lv_event_6_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1668:5: (lv_event_6_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1668:5: (lv_event_6_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1669:6: lv_event_6_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:1688:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1688:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1689:4: () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1689:4: ()
                    // InternalMoniLog4DSL.g:1690:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getAbsenceAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_8=(Token)match(input,33,FOLLOW_25); 

                    				newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getNeverKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:1700:4: ( (lv_event_9_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1701:5: (lv_event_9_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1701:5: (lv_event_9_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1702:6: lv_event_9_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:1721:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1721:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1722:4: () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1722:4: ()
                    // InternalMoniLog4DSL.g:1723:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getPrecedenceAction_3_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1729:4: ( (lv_predecessor_11_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1730:5: (lv_predecessor_11_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1730:5: (lv_predecessor_11_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1731:6: lv_predecessor_11_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_26);
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

                    otherlv_12=(Token)match(input,34,FOLLOW_25); 

                    				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPrecedesKeyword_3_2());
                    			
                    // InternalMoniLog4DSL.g:1752:4: ( (lv_successor_13_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1753:5: (lv_successor_13_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1753:5: (lv_successor_13_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1754:6: lv_successor_13_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:1773:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:1773:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:1774:4: () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:1774:4: ()
                    // InternalMoniLog4DSL.g:1775:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPatternAccess().getResponseAction_4_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:1781:4: ( (lv_event_15_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1782:5: (lv_event_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1782:5: (lv_event_15_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1783:6: lv_event_15_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_27);
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

                    otherlv_16=(Token)match(input,35,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getRespondsToKeyword_4_2());
                    			
                    // InternalMoniLog4DSL.g:1804:4: ( (lv_trigger_17_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:1805:5: (lv_trigger_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:1805:5: (lv_trigger_17_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:1806:6: lv_trigger_17_0= ruleStreamEvent
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
    // InternalMoniLog4DSL.g:1828:1: entryRuleBoundType returns [EObject current=null] : iv_ruleBoundType= ruleBoundType EOF ;
    public final EObject entryRuleBoundType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundType = null;


        try {
            // InternalMoniLog4DSL.g:1828:50: (iv_ruleBoundType= ruleBoundType EOF )
            // InternalMoniLog4DSL.g:1829:2: iv_ruleBoundType= ruleBoundType EOF
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
    // InternalMoniLog4DSL.g:1835:1: ruleBoundType returns [EObject current=null] : (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) ;
    public final EObject ruleBoundType() throws RecognitionException {
        EObject current = null;

        EObject this_ExactBound_0 = null;

        EObject this_LowerBound_1 = null;

        EObject this_UpperBound_2 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1841:2: ( (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) )
            // InternalMoniLog4DSL.g:1842:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            {
            // InternalMoniLog4DSL.g:1842:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            int alt35=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt35=1;
                }
                break;
            case 36:
                {
                alt35=2;
                }
                break;
            case 37:
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
                    // InternalMoniLog4DSL.g:1843:3: this_ExactBound_0= ruleExactBound
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
                    // InternalMoniLog4DSL.g:1852:3: this_LowerBound_1= ruleLowerBound
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
                    // InternalMoniLog4DSL.g:1861:3: this_UpperBound_2= ruleUpperBound
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
    // InternalMoniLog4DSL.g:1873:1: entryRuleExactBound returns [EObject current=null] : iv_ruleExactBound= ruleExactBound EOF ;
    public final EObject entryRuleExactBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactBound = null;


        try {
            // InternalMoniLog4DSL.g:1873:51: (iv_ruleExactBound= ruleExactBound EOF )
            // InternalMoniLog4DSL.g:1874:2: iv_ruleExactBound= ruleExactBound EOF
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
    // InternalMoniLog4DSL.g:1880:1: ruleExactBound returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleExactBound() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1886:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1887:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalMoniLog4DSL.g:1887:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1888:3: (lv_n_0_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1888:3: (lv_n_0_0= RULE_INT )
            // InternalMoniLog4DSL.g:1889:4: lv_n_0_0= RULE_INT
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
    // InternalMoniLog4DSL.g:1908:1: entryRuleLowerBound returns [EObject current=null] : iv_ruleLowerBound= ruleLowerBound EOF ;
    public final EObject entryRuleLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBound = null;


        try {
            // InternalMoniLog4DSL.g:1908:51: (iv_ruleLowerBound= ruleLowerBound EOF )
            // InternalMoniLog4DSL.g:1909:2: iv_ruleLowerBound= ruleLowerBound EOF
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
    // InternalMoniLog4DSL.g:1915:1: ruleLowerBound returns [EObject current=null] : (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1921:2: ( (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog4DSL.g:1922:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog4DSL.g:1922:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1923:3: otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getLowerBoundAccess().getAtleastKeyword_0());
            		
            // InternalMoniLog4DSL.g:1927:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1928:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1928:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog4DSL.g:1929:5: lv_n_1_0= RULE_INT
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
    // InternalMoniLog4DSL.g:1949:1: entryRuleUpperBound returns [EObject current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final EObject entryRuleUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperBound = null;


        try {
            // InternalMoniLog4DSL.g:1949:51: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalMoniLog4DSL.g:1950:2: iv_ruleUpperBound= ruleUpperBound EOF
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
    // InternalMoniLog4DSL.g:1956:1: ruleUpperBound returns [EObject current=null] : (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:1962:2: ( (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog4DSL.g:1963:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog4DSL.g:1963:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog4DSL.g:1964:3: otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,37,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getUpperBoundAccess().getAtmostKeyword_0());
            		
            // InternalMoniLog4DSL.g:1968:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog4DSL.g:1969:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog4DSL.g:1969:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog4DSL.g:1970:5: lv_n_1_0= RULE_INT
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
    // InternalMoniLog4DSL.g:1990:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalMoniLog4DSL.g:1990:46: (iv_ruleScope= ruleScope EOF )
            // InternalMoniLog4DSL.g:1991:2: iv_ruleScope= ruleScope EOF
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
    // InternalMoniLog4DSL.g:1997:1: ruleScope returns [EObject current=null] : ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog4DSL.g:2003:2: ( ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog4DSL.g:2004:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog4DSL.g:2004:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            int alt37=5;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalMoniLog4DSL.g:2005:3: ( () (otherlv_1= 'globally' )? )
                    {
                    // InternalMoniLog4DSL.g:2005:3: ( () (otherlv_1= 'globally' )? )
                    // InternalMoniLog4DSL.g:2006:4: () (otherlv_1= 'globally' )?
                    {
                    // InternalMoniLog4DSL.g:2006:4: ()
                    // InternalMoniLog4DSL.g:2007:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getGloballyAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2013:4: (otherlv_1= 'globally' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==38) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2014:5: otherlv_1= 'globally'
                            {
                            otherlv_1=(Token)match(input,38,FOLLOW_2); 

                            					newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getGloballyKeyword_0_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2021:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2021:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2022:4: () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2022:4: ()
                    // InternalMoniLog4DSL.g:2023:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterAction_1_0(),
                    						current);
                    				

                    }

                    otherlv_3=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getAfterKeyword_1_1());
                    			
                    // InternalMoniLog4DSL.g:2033:4: ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2034:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2034:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2035:6: lv_lowerBound_4_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:2054:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2054:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2055:4: () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2055:4: ()
                    // InternalMoniLog4DSL.g:2056:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBeforeAction_2_0(),
                    						current);
                    				

                    }

                    otherlv_6=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getBeforeKeyword_2_1());
                    			
                    // InternalMoniLog4DSL.g:2066:4: ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2067:5: (lv_upperBound_7_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2067:5: (lv_upperBound_7_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2068:6: lv_upperBound_7_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:2087:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2087:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2088:4: () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2088:4: ()
                    // InternalMoniLog4DSL.g:2089:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getBetweenAction_3_0(),
                    						current);
                    				

                    }

                    otherlv_9=(Token)match(input,39,FOLLOW_25); 

                    				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                    			
                    // InternalMoniLog4DSL.g:2099:4: ( (lv_lowerBound_10_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2100:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2100:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2101:6: lv_lowerBound_10_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_29);
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

                    otherlv_11=(Token)match(input,40,FOLLOW_25); 

                    				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_3());
                    			
                    // InternalMoniLog4DSL.g:2122:4: ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2123:5: (lv_upperBound_12_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2123:5: (lv_upperBound_12_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2124:6: lv_upperBound_12_0= ruleStreamEvent
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
                    // InternalMoniLog4DSL.g:2143:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog4DSL.g:2143:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog4DSL.g:2144:4: () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog4DSL.g:2144:4: ()
                    // InternalMoniLog4DSL.g:2145:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getScopeAccess().getAfterUntilAction_4_0(),
                    						current);
                    				

                    }

                    otherlv_14=(Token)match(input,28,FOLLOW_25); 

                    				newLeafNode(otherlv_14, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                    			
                    // InternalMoniLog4DSL.g:2155:4: ( (lv_lowerBound_15_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2156:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2156:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2157:6: lv_lowerBound_15_0= ruleStreamEvent
                    {

                    						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_30);
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

                    otherlv_16=(Token)match(input,41,FOLLOW_25); 

                    				newLeafNode(otherlv_16, grammarAccess.getScopeAccess().getUntilKeyword_4_3());
                    			
                    // InternalMoniLog4DSL.g:2178:4: ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    // InternalMoniLog4DSL.g:2179:5: (lv_upperBound_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog4DSL.g:2179:5: (lv_upperBound_17_0= ruleStreamEvent )
                    // InternalMoniLog4DSL.g:2180:6: lv_upperBound_17_0= ruleStreamEvent
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
    // InternalMoniLog4DSL.g:2202:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMoniLog4DSL.g:2202:47: (iv_ruleAction= ruleAction EOF )
            // InternalMoniLog4DSL.g:2203:2: iv_ruleAction= ruleAction EOF
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
    // InternalMoniLog4DSL.g:2209:1: ruleAction returns [EObject current=null] : (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniLoggerCall_3= ruleMoniLoggerCall ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LanguageExpression_0 = null;

        EObject this_AppenderCall_1 = null;

        EObject this_EmitEvent_2 = null;

        EObject this_MoniLoggerCall_3 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2215:2: ( (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniLoggerCall_3= ruleMoniLoggerCall ) )
            // InternalMoniLog4DSL.g:2216:2: (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniLoggerCall_3= ruleMoniLoggerCall )
            {
            // InternalMoniLog4DSL.g:2216:2: (this_LanguageExpression_0= ruleLanguageExpression | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniLoggerCall_3= ruleMoniLoggerCall )
            int alt38=4;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_ID) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==42) ) {
                    switch ( input.LA(3) ) {
                    case RULE_ID:
                    case 43:
                        {
                        alt38=2;
                        }
                        break;
                    case 45:
                    case 46:
                        {
                        alt38=4;
                        }
                        break;
                    case 44:
                        {
                        alt38=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA38_1==13) ) {
                    alt38=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA38_0==RULE_STRING) ) {
                alt38=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoniLog4DSL.g:2217:3: this_LanguageExpression_0= ruleLanguageExpression
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
                    // InternalMoniLog4DSL.g:2226:3: this_AppenderCall_1= ruleAppenderCall
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
                    // InternalMoniLog4DSL.g:2235:3: this_EmitEvent_2= ruleEmitEvent
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
                    // InternalMoniLog4DSL.g:2244:3: this_MoniLoggerCall_3= ruleMoniLoggerCall
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMoniLoggerCallParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MoniLoggerCall_3=ruleMoniLoggerCall();

                    state._fsp--;


                    			current = this_MoniLoggerCall_3;
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
    // InternalMoniLog4DSL.g:2256:1: entryRuleAppenderCall returns [EObject current=null] : iv_ruleAppenderCall= ruleAppenderCall EOF ;
    public final EObject entryRuleAppenderCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCall = null;


        try {
            // InternalMoniLog4DSL.g:2256:53: (iv_ruleAppenderCall= ruleAppenderCall EOF )
            // InternalMoniLog4DSL.g:2257:2: iv_ruleAppenderCall= ruleAppenderCall EOF
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
    // InternalMoniLog4DSL.g:2263:1: ruleAppenderCall returns [EObject current=null] : ( ( (lv_appender_0_0= ruleAppenderRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleAppenderCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_appender_0_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2269:2: ( ( ( (lv_appender_0_0= ruleAppenderRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog4DSL.g:2270:2: ( ( (lv_appender_0_0= ruleAppenderRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog4DSL.g:2270:2: ( ( (lv_appender_0_0= ruleAppenderRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog4DSL.g:2271:3: ( (lv_appender_0_0= ruleAppenderRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog4DSL.g:2271:3: ( (lv_appender_0_0= ruleAppenderRef ) )
            // InternalMoniLog4DSL.g:2272:4: (lv_appender_0_0= ruleAppenderRef )
            {
            // InternalMoniLog4DSL.g:2272:4: (lv_appender_0_0= ruleAppenderRef )
            // InternalMoniLog4DSL.g:2273:5: lv_appender_0_0= ruleAppenderRef
            {

            					newCompositeNode(grammarAccess.getAppenderCallAccess().getAppenderAppenderRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_appender_0_0=ruleAppenderRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAppenderCallRule());
            					}
            					set(
            						current,
            						"appender",
            						lv_appender_0_0,
            						"org.gemoc.monilog.MoniLog4DSL.AppenderRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getAppenderCallAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getAppenderCallAccess().getCallKeyword_2());
            		
            // InternalMoniLog4DSL.g:2298:3: (otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==13) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoniLog4DSL.g:2299:4: otherlv_3= '(' ( (lv_args_4_0= ruleAppenderCallArgument ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:2303:4: ( (lv_args_4_0= ruleAppenderCallArgument ) )
                    // InternalMoniLog4DSL.g:2304:5: (lv_args_4_0= ruleAppenderCallArgument )
                    {
                    // InternalMoniLog4DSL.g:2304:5: (lv_args_4_0= ruleAppenderCallArgument )
                    // InternalMoniLog4DSL.g:2305:6: lv_args_4_0= ruleAppenderCallArgument
                    {

                    						newCompositeNode(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalMoniLog4DSL.g:2322:4: (otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==14) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2323:5: otherlv_5= ',' ( (lv_args_6_0= ruleAppenderCallArgument ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2327:5: ( (lv_args_6_0= ruleAppenderCallArgument ) )
                    	    // InternalMoniLog4DSL.g:2328:6: (lv_args_6_0= ruleAppenderCallArgument )
                    	    {
                    	    // InternalMoniLog4DSL.g:2328:6: (lv_args_6_0= ruleAppenderCallArgument )
                    	    // InternalMoniLog4DSL.g:2329:7: lv_args_6_0= ruleAppenderCallArgument
                    	    {

                    	    							newCompositeNode(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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


    // $ANTLR start "entryRuleAppenderRef"
    // InternalMoniLog4DSL.g:2356:1: entryRuleAppenderRef returns [EObject current=null] : iv_ruleAppenderRef= ruleAppenderRef EOF ;
    public final EObject entryRuleAppenderRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderRef = null;


        try {
            // InternalMoniLog4DSL.g:2356:52: (iv_ruleAppenderRef= ruleAppenderRef EOF )
            // InternalMoniLog4DSL.g:2357:2: iv_ruleAppenderRef= ruleAppenderRef EOF
            {
             newCompositeNode(grammarAccess.getAppenderRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAppenderRef=ruleAppenderRef();

            state._fsp--;

             current =iv_ruleAppenderRef; 
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
    // $ANTLR end "entryRuleAppenderRef"


    // $ANTLR start "ruleAppenderRef"
    // InternalMoniLog4DSL.g:2363:1: ruleAppenderRef returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleAppenderRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2369:2: ( ( ( ruleFQN ) ) )
            // InternalMoniLog4DSL.g:2370:2: ( ( ruleFQN ) )
            {
            // InternalMoniLog4DSL.g:2370:2: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:2371:3: ( ruleFQN )
            {
            // InternalMoniLog4DSL.g:2371:3: ( ruleFQN )
            // InternalMoniLog4DSL.g:2372:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getAppenderRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getAppenderRefAccess().getAppenderAppenderCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


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
    // $ANTLR end "ruleAppenderRef"


    // $ANTLR start "entryRuleAppenderCallArgument"
    // InternalMoniLog4DSL.g:2389:1: entryRuleAppenderCallArgument returns [EObject current=null] : iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF ;
    public final EObject entryRuleAppenderCallArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCallArgument = null;


        try {
            // InternalMoniLog4DSL.g:2389:61: (iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF )
            // InternalMoniLog4DSL.g:2390:2: iv_ruleAppenderCallArgument= ruleAppenderCallArgument EOF
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
    // InternalMoniLog4DSL.g:2396:1: ruleAppenderCallArgument returns [EObject current=null] : (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall ) ;
    public final EObject ruleAppenderCallArgument() throws RecognitionException {
        EObject current = null;

        EObject this_Expression_0 = null;

        EObject this_LayoutCall_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2402:2: ( (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall ) )
            // InternalMoniLog4DSL.g:2403:2: (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall )
            {
            // InternalMoniLog4DSL.g:2403:2: (this_Expression_0= ruleExpression | this_LayoutCall_1= ruleLayoutCall )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_ID) ) {
                int LA41_1 = input.LA(2);

                if ( (LA41_1==EOF||(LA41_1>=13 && LA41_1<=15)) ) {
                    alt41=1;
                }
                else if ( (LA41_1==42) ) {
                    alt41=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA41_0==RULE_STRING) ) {
                alt41=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoniLog4DSL.g:2404:3: this_Expression_0= ruleExpression
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
                    // InternalMoniLog4DSL.g:2413:3: this_LayoutCall_1= ruleLayoutCall
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
    // InternalMoniLog4DSL.g:2425:1: entryRuleLayoutCall returns [EObject current=null] : iv_ruleLayoutCall= ruleLayoutCall EOF ;
    public final EObject entryRuleLayoutCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutCall = null;


        try {
            // InternalMoniLog4DSL.g:2425:51: (iv_ruleLayoutCall= ruleLayoutCall EOF )
            // InternalMoniLog4DSL.g:2426:2: iv_ruleLayoutCall= ruleLayoutCall EOF
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
    // InternalMoniLog4DSL.g:2432:1: ruleLayoutCall returns [EObject current=null] : ( ( (lv_layout_0_0= ruleLayoutRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleLayoutCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_layout_0_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2438:2: ( ( ( (lv_layout_0_0= ruleLayoutRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog4DSL.g:2439:2: ( ( (lv_layout_0_0= ruleLayoutRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog4DSL.g:2439:2: ( ( (lv_layout_0_0= ruleLayoutRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog4DSL.g:2440:3: ( (lv_layout_0_0= ruleLayoutRef ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog4DSL.g:2440:3: ( (lv_layout_0_0= ruleLayoutRef ) )
            // InternalMoniLog4DSL.g:2441:4: (lv_layout_0_0= ruleLayoutRef )
            {
            // InternalMoniLog4DSL.g:2441:4: (lv_layout_0_0= ruleLayoutRef )
            // InternalMoniLog4DSL.g:2442:5: lv_layout_0_0= ruleLayoutRef
            {

            					newCompositeNode(grammarAccess.getLayoutCallAccess().getLayoutLayoutRefParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_31);
            lv_layout_0_0=ruleLayoutRef();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLayoutCallRule());
            					}
            					set(
            						current,
            						"layout",
            						lv_layout_0_0,
            						"org.gemoc.monilog.MoniLog4DSL.LayoutRef");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_32); 

            			newLeafNode(otherlv_1, grammarAccess.getLayoutCallAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,43,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getLayoutCallAccess().getCallKeyword_2());
            		
            // InternalMoniLog4DSL.g:2467:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==13) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoniLog4DSL.g:2468:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:2472:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog4DSL.g:2473:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog4DSL.g:2473:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog4DSL.g:2474:6: lv_args_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLayoutCallRule());
                    						}
                    						add(
                    							current,
                    							"args",
                    							lv_args_4_0,
                    							"org.gemoc.monilog.MoniLog4DSL.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMoniLog4DSL.g:2491:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( (LA42_0==14) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2492:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2496:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog4DSL.g:2497:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog4DSL.g:2497:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog4DSL.g:2498:7: lv_args_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLayoutCallRule());
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


    // $ANTLR start "entryRuleLayoutRef"
    // InternalMoniLog4DSL.g:2525:1: entryRuleLayoutRef returns [EObject current=null] : iv_ruleLayoutRef= ruleLayoutRef EOF ;
    public final EObject entryRuleLayoutRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutRef = null;


        try {
            // InternalMoniLog4DSL.g:2525:50: (iv_ruleLayoutRef= ruleLayoutRef EOF )
            // InternalMoniLog4DSL.g:2526:2: iv_ruleLayoutRef= ruleLayoutRef EOF
            {
             newCompositeNode(grammarAccess.getLayoutRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLayoutRef=ruleLayoutRef();

            state._fsp--;

             current =iv_ruleLayoutRef; 
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
    // $ANTLR end "entryRuleLayoutRef"


    // $ANTLR start "ruleLayoutRef"
    // InternalMoniLog4DSL.g:2532:1: ruleLayoutRef returns [EObject current=null] : ( ( ruleFQN ) ) ;
    public final EObject ruleLayoutRef() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2538:2: ( ( ( ruleFQN ) ) )
            // InternalMoniLog4DSL.g:2539:2: ( ( ruleFQN ) )
            {
            // InternalMoniLog4DSL.g:2539:2: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:2540:3: ( ruleFQN )
            {
            // InternalMoniLog4DSL.g:2540:3: ( ruleFQN )
            // InternalMoniLog4DSL.g:2541:4: ruleFQN
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLayoutRefRule());
            				}
            			

            				newCompositeNode(grammarAccess.getLayoutRefAccess().getLayoutLayoutCrossReference_0());
            			
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;


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
    // $ANTLR end "ruleLayoutRef"


    // $ANTLR start "entryRuleEmitEvent"
    // InternalMoniLog4DSL.g:2558:1: entryRuleEmitEvent returns [EObject current=null] : iv_ruleEmitEvent= ruleEmitEvent EOF ;
    public final EObject entryRuleEmitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmitEvent = null;


        try {
            // InternalMoniLog4DSL.g:2558:50: (iv_ruleEmitEvent= ruleEmitEvent EOF )
            // InternalMoniLog4DSL.g:2559:2: iv_ruleEmitEvent= ruleEmitEvent EOF
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
    // InternalMoniLog4DSL.g:2565:1: ruleEmitEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog4DSL.g:2571:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog4DSL.g:2572:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog4DSL.g:2572:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog4DSL.g:2573:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog4DSL.g:2573:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:2574:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:2574:4: (otherlv_0= RULE_ID )
            // InternalMoniLog4DSL.g:2575:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEmitEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(otherlv_0, grammarAccess.getEmitEventAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,42,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getEmitEventAccess().getFullStopKeyword_1());
            		
            otherlv_2=(Token)match(input,44,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getEmitEventAccess().getEmitKeyword_2());
            		
            // InternalMoniLog4DSL.g:2594:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==13) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoniLog4DSL.g:2595:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0());
                    			
                    // InternalMoniLog4DSL.g:2599:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog4DSL.g:2600:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog4DSL.g:2600:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog4DSL.g:2601:6: lv_args_4_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_8);
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

                    // InternalMoniLog4DSL.g:2618:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==14) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2619:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,14,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2623:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog4DSL.g:2624:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog4DSL.g:2624:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog4DSL.g:2625:7: lv_args_6_0= ruleExpression
                    	    {

                    	    							newCompositeNode(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
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


    // $ANTLR start "entryRuleMoniLoggerCall"
    // InternalMoniLog4DSL.g:2652:1: entryRuleMoniLoggerCall returns [EObject current=null] : iv_ruleMoniLoggerCall= ruleMoniLoggerCall EOF ;
    public final EObject entryRuleMoniLoggerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLoggerCall = null;


        try {
            // InternalMoniLog4DSL.g:2652:55: (iv_ruleMoniLoggerCall= ruleMoniLoggerCall EOF )
            // InternalMoniLog4DSL.g:2653:2: iv_ruleMoniLoggerCall= ruleMoniLoggerCall EOF
            {
             newCompositeNode(grammarAccess.getMoniLoggerCallRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMoniLoggerCall=ruleMoniLoggerCall();

            state._fsp--;

             current =iv_ruleMoniLoggerCall; 
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
    // $ANTLR end "entryRuleMoniLoggerCall"


    // $ANTLR start "ruleMoniLoggerCall"
    // InternalMoniLog4DSL.g:2659:1: ruleMoniLoggerCall returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) ;
    public final EObject ruleMoniLoggerCall() throws RecognitionException {
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
            // InternalMoniLog4DSL.g:2665:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) )
            // InternalMoniLog4DSL.g:2666:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            {
            // InternalMoniLog4DSL.g:2666:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ID) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==42) ) {
                    int LA48_2 = input.LA(3);

                    if ( (LA48_2==45) ) {
                        alt48=1;
                    }
                    else if ( (LA48_2==46) ) {
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
                    // InternalMoniLog4DSL.g:2667:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalMoniLog4DSL.g:2667:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    // InternalMoniLog4DSL.g:2668:4: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    {
                    // InternalMoniLog4DSL.g:2668:4: ()
                    // InternalMoniLog4DSL.g:2669:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMoniLoggerCallAccess().getStartMoniLoggerAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2675:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoniLog4DSL.g:2676:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:2676:5: (otherlv_1= RULE_ID )
                    // InternalMoniLog4DSL.g:2677:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoniLoggerCallRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_1, grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0());
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,42,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getMoniLoggerCallAccess().getFullStopKeyword_0_2());
                    			
                    otherlv_3=(Token)match(input,45,FOLLOW_11); 

                    				newLeafNode(otherlv_3, grammarAccess.getMoniLoggerCallAccess().getStartKeyword_0_3());
                    			
                    // InternalMoniLog4DSL.g:2696:4: (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==13) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2697:5: otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,13,FOLLOW_3); 

                            					newLeafNode(otherlv_4, grammarAccess.getMoniLoggerCallAccess().getLeftParenthesisKeyword_0_4_0());
                            				
                            // InternalMoniLog4DSL.g:2701:5: ( (lv_args_5_0= ruleExpression ) )
                            // InternalMoniLog4DSL.g:2702:6: (lv_args_5_0= ruleExpression )
                            {
                            // InternalMoniLog4DSL.g:2702:6: (lv_args_5_0= ruleExpression )
                            // InternalMoniLog4DSL.g:2703:7: lv_args_5_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getMoniLoggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0());
                            						
                            pushFollow(FOLLOW_8);
                            lv_args_5_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getMoniLoggerCallRule());
                            							}
                            							add(
                            								current,
                            								"args",
                            								lv_args_5_0,
                            								"org.gemoc.monilog.MoniLog4DSL.Expression");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            // InternalMoniLog4DSL.g:2720:5: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
                            loop46:
                            do {
                                int alt46=2;
                                int LA46_0 = input.LA(1);

                                if ( (LA46_0==14) ) {
                                    alt46=1;
                                }


                                switch (alt46) {
                            	case 1 :
                            	    // InternalMoniLog4DSL.g:2721:6: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,14,FOLLOW_3); 

                            	    						newLeafNode(otherlv_6, grammarAccess.getMoniLoggerCallAccess().getCommaKeyword_0_4_2_0());
                            	    					
                            	    // InternalMoniLog4DSL.g:2725:6: ( (lv_args_7_0= ruleExpression ) )
                            	    // InternalMoniLog4DSL.g:2726:7: (lv_args_7_0= ruleExpression )
                            	    {
                            	    // InternalMoniLog4DSL.g:2726:7: (lv_args_7_0= ruleExpression )
                            	    // InternalMoniLog4DSL.g:2727:8: lv_args_7_0= ruleExpression
                            	    {

                            	    								newCompositeNode(grammarAccess.getMoniLoggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0());
                            	    							
                            	    pushFollow(FOLLOW_8);
                            	    lv_args_7_0=ruleExpression();

                            	    state._fsp--;


                            	    								if (current==null) {
                            	    									current = createModelElementForParent(grammarAccess.getMoniLoggerCallRule());
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

                            					newLeafNode(otherlv_8, grammarAccess.getMoniLoggerCallAccess().getRightParenthesisKeyword_0_4_3());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2752:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    {
                    // InternalMoniLog4DSL.g:2752:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    // InternalMoniLog4DSL.g:2753:4: () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop'
                    {
                    // InternalMoniLog4DSL.g:2753:4: ()
                    // InternalMoniLog4DSL.g:2754:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getMoniLoggerCallAccess().getStopMoniLoggerAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2760:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMoniLog4DSL.g:2761:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:2761:5: (otherlv_10= RULE_ID )
                    // InternalMoniLog4DSL.g:2762:6: otherlv_10= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMoniLoggerCallRule());
                    						}
                    					
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_10, grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0());
                    					

                    }


                    }

                    otherlv_11=(Token)match(input,42,FOLLOW_35); 

                    				newLeafNode(otherlv_11, grammarAccess.getMoniLoggerCallAccess().getFullStopKeyword_1_2());
                    			
                    otherlv_12=(Token)match(input,46,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getMoniLoggerCallAccess().getStopKeyword_1_3());
                    			

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
    // $ANTLR end "ruleMoniLoggerCall"


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog4DSL.g:2786:1: entryRuleStreamEvent returns [EObject current=null] : iv_ruleStreamEvent= ruleStreamEvent EOF ;
    public final EObject entryRuleStreamEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamEvent = null;


        try {
            // InternalMoniLog4DSL.g:2786:52: (iv_ruleStreamEvent= ruleStreamEvent EOF )
            // InternalMoniLog4DSL.g:2787:2: iv_ruleStreamEvent= ruleStreamEvent EOF
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
    // InternalMoniLog4DSL.g:2793:1: ruleStreamEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? ) ;
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
            // InternalMoniLog4DSL.g:2799:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? ) )
            // InternalMoniLog4DSL.g:2800:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? )
            {
            // InternalMoniLog4DSL.g:2800:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )? )
            // InternalMoniLog4DSL.g:2801:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )?
            {
            // InternalMoniLog4DSL.g:2801:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:2802:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:2802:4: (otherlv_0= RULE_ID )
            // InternalMoniLog4DSL.g:2803:5: otherlv_0= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getStreamEventRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); 

            					newLeafNode(otherlv_0, grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0());
            				

            }


            }

            // InternalMoniLog4DSL.g:2814:3: (otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==21) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoniLog4DSL.g:2815:4: otherlv_1= '[' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ']'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_37); 

                    				newLeafNode(otherlv_1, grammarAccess.getStreamEventAccess().getLeftSquareBracketKeyword_1_0());
                    			
                    // InternalMoniLog4DSL.g:2819:4: ( (lv_values_2_0= ruleEmptyOrPropertyValue ) )
                    // InternalMoniLog4DSL.g:2820:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    {
                    // InternalMoniLog4DSL.g:2820:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    // InternalMoniLog4DSL.g:2821:6: lv_values_2_0= ruleEmptyOrPropertyValue
                    {

                    						newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalMoniLog4DSL.g:2838:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )*
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( (LA49_0==14) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:2839:5: otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,14,FOLLOW_37); 

                    	    					newLeafNode(otherlv_3, grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0());
                    	    				
                    	    // InternalMoniLog4DSL.g:2843:5: ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    // InternalMoniLog4DSL.g:2844:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    {
                    	    // InternalMoniLog4DSL.g:2844:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    // InternalMoniLog4DSL.g:2845:7: lv_values_4_0= ruleEmptyOrPropertyValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_38);
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

                    otherlv_5=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:2872:1: entryRuleEmptyOrPropertyValue returns [EObject current=null] : iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF ;
    public final EObject entryRuleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyOrPropertyValue = null;


        try {
            // InternalMoniLog4DSL.g:2872:61: (iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog4DSL.g:2873:2: iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF
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
    // InternalMoniLog4DSL.g:2879:1: ruleEmptyOrPropertyValue returns [EObject current=null] : ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )? ) ) ;
    public final EObject ruleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_id_2_0=null;
        Token otherlv_3=null;
        EObject lv_value_4_0 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2885:2: ( ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )? ) ) )
            // InternalMoniLog4DSL.g:2886:2: ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            {
            // InternalMoniLog4DSL.g:2886:2: ( () | ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )? ) )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==EOF||LA52_0==14||LA52_0==22) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ID) ) {
                alt52=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoniLog4DSL.g:2887:3: ()
                    {
                    // InternalMoniLog4DSL.g:2887:3: ()
                    // InternalMoniLog4DSL.g:2888:4: 
                    {

                    				current = forceCreateModelElement(
                    					grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0(),
                    					current);
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:2895:3: ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )? )
                    {
                    // InternalMoniLog4DSL.g:2895:3: ( () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )? )
                    // InternalMoniLog4DSL.g:2896:4: () ( (lv_id_2_0= RULE_ID ) ) (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )?
                    {
                    // InternalMoniLog4DSL.g:2896:4: ()
                    // InternalMoniLog4DSL.g:2897:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:2903:4: ( (lv_id_2_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:2904:5: (lv_id_2_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:2904:5: (lv_id_2_0= RULE_ID )
                    // InternalMoniLog4DSL.g:2905:6: lv_id_2_0= RULE_ID
                    {
                    lv_id_2_0=(Token)match(input,RULE_ID,FOLLOW_39); 

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

                    // InternalMoniLog4DSL.g:2921:4: (otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) ) )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==47) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // InternalMoniLog4DSL.g:2922:5: otherlv_3= '=' ( (lv_value_4_0= ruleExpression ) )
                            {
                            otherlv_3=(Token)match(input,47,FOLLOW_3); 

                            					newLeafNode(otherlv_3, grammarAccess.getEmptyOrPropertyValueAccess().getEqualsSignKeyword_1_2_0());
                            				
                            // InternalMoniLog4DSL.g:2926:5: ( (lv_value_4_0= ruleExpression ) )
                            // InternalMoniLog4DSL.g:2927:6: (lv_value_4_0= ruleExpression )
                            {
                            // InternalMoniLog4DSL.g:2927:6: (lv_value_4_0= ruleExpression )
                            // InternalMoniLog4DSL.g:2928:7: lv_value_4_0= ruleExpression
                            {

                            							newCompositeNode(grammarAccess.getEmptyOrPropertyValueAccess().getValueExpressionParserRuleCall_1_2_1_0());
                            						
                            pushFollow(FOLLOW_2);
                            lv_value_4_0=ruleExpression();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEmptyOrPropertyValueRule());
                            							}
                            							set(
                            								current,
                            								"value",
                            								lv_value_4_0,
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
    // InternalMoniLog4DSL.g:2951:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMoniLog4DSL.g:2951:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMoniLog4DSL.g:2952:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMoniLog4DSL.g:2958:1: ruleExpression returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_LanguageExpression_1 = null;



        	enterRule();

        try {
            // InternalMoniLog4DSL.g:2964:2: ( (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:2965:2: (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:2965:2: (this_ParameterReference_0= ruleParameterReference | this_LanguageExpression_1= ruleLanguageExpression )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_ID) ) {
                int LA53_1 = input.LA(2);

                if ( (LA53_1==13) ) {
                    alt53=2;
                }
                else if ( (LA53_1==EOF||(LA53_1>=14 && LA53_1<=15)||LA53_1==22) ) {
                    alt53=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA53_0==RULE_STRING) ) {
                alt53=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoniLog4DSL.g:2966:3: this_ParameterReference_0= ruleParameterReference
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
                    // InternalMoniLog4DSL.g:2975:3: this_LanguageExpression_1= ruleLanguageExpression
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
    // InternalMoniLog4DSL.g:2987:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // InternalMoniLog4DSL.g:2987:59: (iv_ruleParameterReference= ruleParameterReference EOF )
            // InternalMoniLog4DSL.g:2988:2: iv_ruleParameterReference= ruleParameterReference EOF
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
    // InternalMoniLog4DSL.g:2994:1: ruleParameterReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3000:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMoniLog4DSL.g:3001:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:3001:2: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog4DSL.g:3002:3: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog4DSL.g:3002:3: (otherlv_0= RULE_ID )
            // InternalMoniLog4DSL.g:3003:4: otherlv_0= RULE_ID
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


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog4DSL.g:3017:1: entryRuleLanguageExpression returns [EObject current=null] : iv_ruleLanguageExpression= ruleLanguageExpression EOF ;
    public final EObject entryRuleLanguageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageExpression = null;


        try {
            // InternalMoniLog4DSL.g:3017:59: (iv_ruleLanguageExpression= ruleLanguageExpression EOF )
            // InternalMoniLog4DSL.g:3018:2: iv_ruleLanguageExpression= ruleLanguageExpression EOF
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
    // InternalMoniLog4DSL.g:3024:1: ruleLanguageExpression returns [EObject current=null] : ( ( () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLanguageExpression() throws RecognitionException {
        EObject current = null;

        Token lv_languageId_1_0=null;
        Token otherlv_2=null;
        Token lv_expression_3_0=null;
        Token otherlv_4=null;
        Token lv_expression_6_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3030:2: ( ( ( () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) ) )
            // InternalMoniLog4DSL.g:3031:2: ( ( () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) )
            {
            // InternalMoniLog4DSL.g:3031:2: ( ( () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' ) | ( () ( (lv_expression_6_0= RULE_STRING ) ) ) )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ID) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_STRING) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoniLog4DSL.g:3032:3: ( () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    {
                    // InternalMoniLog4DSL.g:3032:3: ( () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')' )
                    // InternalMoniLog4DSL.g:3033:4: () ( (lv_languageId_1_0= RULE_ID ) ) otherlv_2= '(' ( (lv_expression_3_0= RULE_STRING ) ) otherlv_4= ')'
                    {
                    // InternalMoniLog4DSL.g:3033:4: ()
                    // InternalMoniLog4DSL.g:3034:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLanguageExpressionAccess().getExplicitLanguageExpressionAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:3040:4: ( (lv_languageId_1_0= RULE_ID ) )
                    // InternalMoniLog4DSL.g:3041:5: (lv_languageId_1_0= RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:3041:5: (lv_languageId_1_0= RULE_ID )
                    // InternalMoniLog4DSL.g:3042:6: lv_languageId_1_0= RULE_ID
                    {
                    lv_languageId_1_0=(Token)match(input,RULE_ID,FOLLOW_40); 

                    						newLeafNode(lv_languageId_1_0, grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLanguageExpressionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"languageId",
                    							lv_languageId_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,13,FOLLOW_41); 

                    				newLeafNode(otherlv_2, grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_0_2());
                    			
                    // InternalMoniLog4DSL.g:3062:4: ( (lv_expression_3_0= RULE_STRING ) )
                    // InternalMoniLog4DSL.g:3063:5: (lv_expression_3_0= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:3063:5: (lv_expression_3_0= RULE_STRING )
                    // InternalMoniLog4DSL.g:3064:6: lv_expression_3_0= RULE_STRING
                    {
                    lv_expression_3_0=(Token)match(input,RULE_STRING,FOLLOW_42); 

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

                    otherlv_4=(Token)match(input,15,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3086:3: ( () ( (lv_expression_6_0= RULE_STRING ) ) )
                    {
                    // InternalMoniLog4DSL.g:3086:3: ( () ( (lv_expression_6_0= RULE_STRING ) ) )
                    // InternalMoniLog4DSL.g:3087:4: () ( (lv_expression_6_0= RULE_STRING ) )
                    {
                    // InternalMoniLog4DSL.g:3087:4: ()
                    // InternalMoniLog4DSL.g:3088:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLanguageExpressionAccess().getDefaultLanguageExpressionAction_1_0(),
                    						current);
                    				

                    }

                    // InternalMoniLog4DSL.g:3094:4: ( (lv_expression_6_0= RULE_STRING ) )
                    // InternalMoniLog4DSL.g:3095:5: (lv_expression_6_0= RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:3095:5: (lv_expression_6_0= RULE_STRING )
                    // InternalMoniLog4DSL.g:3096:6: lv_expression_6_0= RULE_STRING
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
    // InternalMoniLog4DSL.g:3117:1: entryRuleFQN returns [String current=null] : iv_ruleFQN= ruleFQN EOF ;
    public final String entryRuleFQN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleFQN = null;


        try {
            // InternalMoniLog4DSL.g:3117:43: (iv_ruleFQN= ruleFQN EOF )
            // InternalMoniLog4DSL.g:3118:2: iv_ruleFQN= ruleFQN EOF
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
    // InternalMoniLog4DSL.g:3124:1: ruleFQN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleFQN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3130:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMoniLog4DSL.g:3131:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMoniLog4DSL.g:3131:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMoniLog4DSL.g:3132:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_43); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getFQNAccess().getIDTerminalRuleCall_0());
            		
            // InternalMoniLog4DSL.g:3139:3: (kw= '.' this_ID_2= RULE_ID )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==42) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==RULE_ID) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3140:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,42,FOLLOW_6); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getFQNAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_43); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1());
            	    			

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
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleMoniLoggerAnnotation"
    // InternalMoniLog4DSL.g:3157:1: ruleMoniLoggerAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Inactive' ) ;
    public final Enumerator ruleMoniLoggerAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3163:2: ( (enumLiteral_0= '@Inactive' ) )
            // InternalMoniLog4DSL.g:3164:2: (enumLiteral_0= '@Inactive' )
            {
            // InternalMoniLog4DSL.g:3164:2: (enumLiteral_0= '@Inactive' )
            // InternalMoniLog4DSL.g:3165:3: enumLiteral_0= '@Inactive'
            {
            enumLiteral_0=(Token)match(input,48,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:3174:1: ruleAppenderAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Async' ) ;
    public final Enumerator ruleAppenderAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3180:2: ( (enumLiteral_0= '@Async' ) )
            // InternalMoniLog4DSL.g:3181:2: (enumLiteral_0= '@Async' )
            {
            // InternalMoniLog4DSL.g:3181:2: (enumLiteral_0= '@Async' )
            // InternalMoniLog4DSL.g:3182:3: enumLiteral_0= '@Async'
            {
            enumLiteral_0=(Token)match(input,49,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:3191:1: ruleLogLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) ;
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
            // InternalMoniLog4DSL.g:3197:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) )
            // InternalMoniLog4DSL.g:3198:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            {
            // InternalMoniLog4DSL.g:3198:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            int alt56=7;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt56=1;
                }
                break;
            case 51:
                {
                alt56=2;
                }
                break;
            case 52:
                {
                alt56=3;
                }
                break;
            case 53:
                {
                alt56=4;
                }
                break;
            case 54:
                {
                alt56=5;
                }
                break;
            case 55:
                {
                alt56=6;
                }
                break;
            case 56:
                {
                alt56=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalMoniLog4DSL.g:3199:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalMoniLog4DSL.g:3199:3: (enumLiteral_0= 'INFO' )
                    // InternalMoniLog4DSL.g:3200:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3207:3: (enumLiteral_1= 'CONFIG' )
                    {
                    // InternalMoniLog4DSL.g:3207:3: (enumLiteral_1= 'CONFIG' )
                    // InternalMoniLog4DSL.g:3208:4: enumLiteral_1= 'CONFIG'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:3215:3: (enumLiteral_2= 'FINE' )
                    {
                    // InternalMoniLog4DSL.g:3215:3: (enumLiteral_2= 'FINE' )
                    // InternalMoniLog4DSL.g:3216:4: enumLiteral_2= 'FINE'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:3223:3: (enumLiteral_3= 'FINER' )
                    {
                    // InternalMoniLog4DSL.g:3223:3: (enumLiteral_3= 'FINER' )
                    // InternalMoniLog4DSL.g:3224:4: enumLiteral_3= 'FINER'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:3231:3: (enumLiteral_4= 'FINEST' )
                    {
                    // InternalMoniLog4DSL.g:3231:3: (enumLiteral_4= 'FINEST' )
                    // InternalMoniLog4DSL.g:3232:4: enumLiteral_4= 'FINEST'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog4DSL.g:3239:3: (enumLiteral_5= 'SEVERE' )
                    {
                    // InternalMoniLog4DSL.g:3239:3: (enumLiteral_5= 'SEVERE' )
                    // InternalMoniLog4DSL.g:3240:4: enumLiteral_5= 'SEVERE'
                    {
                    enumLiteral_5=(Token)match(input,55,FOLLOW_2); 

                    				current = grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_5, grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5());
                    			

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog4DSL.g:3247:3: (enumLiteral_6= 'WARNING' )
                    {
                    // InternalMoniLog4DSL.g:3247:3: (enumLiteral_6= 'WARNING' )
                    // InternalMoniLog4DSL.g:3248:4: enumLiteral_6= 'WARNING'
                    {
                    enumLiteral_6=(Token)match(input,56,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:3258:1: ruleTemporalPatternKind returns [Enumerator current=null] : ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) ;
    public final Enumerator ruleTemporalPatternKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoniLog4DSL.g:3264:2: ( ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) )
            // InternalMoniLog4DSL.g:3265:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            {
            // InternalMoniLog4DSL.g:3265:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            int alt57=4;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt57=1;
                }
                break;
            case 58:
                {
                alt57=2;
                }
                break;
            case 59:
                {
                alt57=3;
                }
                break;
            case 60:
                {
                alt57=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMoniLog4DSL.g:3266:3: (enumLiteral_0= 'S' )
                    {
                    // InternalMoniLog4DSL.g:3266:3: (enumLiteral_0= 'S' )
                    // InternalMoniLog4DSL.g:3267:4: enumLiteral_0= 'S'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:3274:3: (enumLiteral_1= 'V' )
                    {
                    // InternalMoniLog4DSL.g:3274:3: (enumLiteral_1= 'V' )
                    // InternalMoniLog4DSL.g:3275:4: enumLiteral_1= 'V'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:3282:3: (enumLiteral_2= 'nS' )
                    {
                    // InternalMoniLog4DSL.g:3282:3: (enumLiteral_2= 'nS' )
                    // InternalMoniLog4DSL.g:3283:4: enumLiteral_2= 'nS'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); 

                    				current = grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:3290:3: (enumLiteral_3= 'nV' )
                    {
                    // InternalMoniLog4DSL.g:3290:3: (enumLiteral_3= 'nV' )
                    // InternalMoniLog4DSL.g:3291:4: enumLiteral_3= 'nV'
                    {
                    enumLiteral_3=(Token)match(input,60,FOLLOW_2); 

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


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA37 dfa37 = new DFA37(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\4\4\uffff\1\4\1\uffff";
    static final String dfa_3s = "\1\14\1\uffff\1\4\1\14\1\uffff\1\4\1\16\1\4\1\14\1\16";
    static final String dfa_4s = "\1\61\1\uffff\1\4\1\61\1\uffff\1\4\1\17\1\4\1\61\1\17";
    static final String dfa_5s = "\1\uffff\1\1\2\uffff\1\2\5\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\44\uffff\1\1",
            "",
            "\1\3",
            "\1\4\1\5\2\uffff\1\1\2\uffff\2\4\5\uffff\1\4\2\uffff\2\4\13\uffff\1\4\5\uffff\2\4",
            "",
            "\1\6",
            "\1\7\1\10",
            "\1\11",
            "\1\4\3\uffff\1\1\2\uffff\2\4\5\uffff\1\4\2\uffff\2\4\21\uffff\2\4",
            "\1\7\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "265:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )";
        }
    }
    static final String dfa_8s = "\2\uffff\1\3\5\uffff\1\3\1\uffff";
    static final String dfa_9s = "\1\23\1\4\1\14\1\uffff\1\4\1\uffff\1\16\1\4\1\14\1\16";
    static final String dfa_10s = "\1\23\1\4\1\61\1\uffff\1\4\1\uffff\1\17\1\4\1\61\1\17";
    static final String dfa_11s = "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\1\3\1\4\2\uffff\1\5\2\uffff\2\3\5\uffff\1\3\2\uffff\2\3\13\uffff\1\3\5\uffff\2\3",
            "",
            "\1\6",
            "",
            "\1\7\1\10",
            "\1\11",
            "\1\3\3\uffff\1\5\2\uffff\2\3\5\uffff\1\3\2\uffff\2\3\21\uffff\2\3",
            "\1\7\1\10"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "563:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )";
        }
    }
    static final String dfa_13s = "\30\uffff";
    static final String dfa_14s = "\2\uffff\1\1\6\uffff\1\1\16\uffff";
    static final String dfa_15s = "\1\4\1\uffff\1\22\2\uffff\1\4\2\uffff\1\4\1\22\2\16\2\4\1\15\1\16\1\15\1\16\2\5\2\17\2\16";
    static final String dfa_16s = "\1\45\1\uffff\1\47\2\uffff\1\26\2\uffff\1\26\1\47\2\57\2\5\4\26\2\5\2\17\2\26";
    static final String dfa_17s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\5\1\4\20\uffff";
    static final String dfa_18s = "\30\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\uffff\1\1\30\uffff\1\1\1\3\1\4\2\uffff\2\1",
            "",
            "\1\1\2\uffff\1\5\5\uffff\2\1\5\uffff\1\7\1\6\2\uffff\2\1",
            "",
            "",
            "\1\12\11\uffff\1\10\7\uffff\1\11",
            "",
            "",
            "\1\13\11\uffff\1\10\7\uffff\1\11",
            "\1\1\10\uffff\2\1\5\uffff\1\7\1\6\2\uffff\2\1",
            "\1\10\7\uffff\1\11\30\uffff\1\14",
            "\1\10\7\uffff\1\11\30\uffff\1\15",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\22\1\10\7\uffff\1\11",
            "\1\10\7\uffff\1\11",
            "\1\23\1\10\7\uffff\1\11",
            "\1\10\7\uffff\1\11",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\10\7\uffff\1\11",
            "\1\10\7\uffff\1\11"
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
            return "1600:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )";
        }
    }
    static final String dfa_20s = "\31\uffff";
    static final String dfa_21s = "\1\1\4\uffff\1\7\4\uffff\1\7\16\uffff";
    static final String dfa_22s = "\1\22\1\uffff\1\4\2\uffff\1\22\1\4\2\uffff\1\4\1\22\2\16\2\4\1\15\1\16\1\15\1\16\2\5\2\17\2\16";
    static final String dfa_23s = "\1\47\1\uffff\1\4\2\uffff\1\51\1\26\2\uffff\1\26\1\51\2\57\2\5\4\26\2\5\2\17\2\26";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\2\1\5\20\uffff";
    static final String dfa_25s = "\31\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\10\uffff\1\3\1\2\11\uffff\1\1\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\7\2\uffff\1\6\23\uffff\1\10",
            "\1\13\11\uffff\1\11\7\uffff\1\12",
            "",
            "",
            "\1\14\11\uffff\1\11\7\uffff\1\12",
            "\1\7\26\uffff\1\10",
            "\1\11\7\uffff\1\12\30\uffff\1\15",
            "\1\11\7\uffff\1\12\30\uffff\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\24\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\11\7\uffff\1\12",
            "\1\11\7\uffff\1\12"
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
            return "2004:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0003000064181002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0002000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0001000000100000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000212000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01FC000000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000018000010L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x1E00000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000003380000050L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000C018000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000003080000050L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000404010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000404000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000040000000002L});

}
