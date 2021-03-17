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
import org.eclipse.xtext.parser.antlr.IUnorderedGroupHelper.UnorderedGroupState;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.gemoc.monilog.services.MoniLogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMoniLogParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_REAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "'import'", "'as'", "'appender'", "'('", "')'", "'{'", "';'", "'}'", "'layout'", "','", "'...'", "'monilogger'", "'['", "']'", "'event'", "'conditions'", "'actions'", "'call'", "'complex'", "'custom'", "'before'", "'after'", "'exists'", "'always'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'.'", "'emit'", "'start'", "'stop'", "'='", "'?'", "':'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'>'", "'<'", "'+'", "'-'", "'*'", "'/'", "'%'", "'!'", "'true'", "'false'", "'sizeOf'", "'.*'", "'@Inactive'", "'@Async'", "'INFO'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ID=5;
    public static final int RULE_REAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
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



    /*
      This grammar contains a lot of empty actions to work around a bug in ANTLR.
      Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
    */

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
    // InternalMoniLog.g:72:1: entryRuleDocument returns [EObject current=null] : iv_ruleDocument= ruleDocument EOF ;
    public final EObject entryRuleDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDocument = null;



        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getDocumentAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalMoniLog.g:76:2: (iv_ruleDocument= ruleDocument EOF )
            // InternalMoniLog.g:77:2: iv_ruleDocument= ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleDocument=ruleDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDocument; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalMoniLog.g:86:1: ruleDocument returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) ;
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
        	UnorderedGroupState myUnorderedGroupState = getUnorderedGroupHelper().snapShot(
        	grammarAccess.getDocumentAccess().getUnorderedGroup_3()
        	);

        try {
            // InternalMoniLog.g:95:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) ) )
            // InternalMoniLog.g:96:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            {
            // InternalMoniLog.g:96:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) ) )
            // InternalMoniLog.g:97:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleImport ) )* ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getDocumentAccess().getPackageKeyword_0());
              		
            }
            // InternalMoniLog.g:101:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalMoniLog.g:102:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalMoniLog.g:102:4: (lv_name_1_0= ruleQualifiedName )
            // InternalMoniLog.g:103:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDocumentAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:120:3: ( (lv_imports_2_0= ruleImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMoniLog.g:121:4: (lv_imports_2_0= ruleImport )
            	    {
            	    // InternalMoniLog.g:121:4: (lv_imports_2_0= ruleImport )
            	    // InternalMoniLog.g:122:5: lv_imports_2_0= ruleImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getDocumentAccess().getImportsImportParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMoniLog.g:139:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) ) )
            // InternalMoniLog.g:140:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            {
            // InternalMoniLog.g:140:4: ( ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* ) )
            // InternalMoniLog.g:141:5: ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            // InternalMoniLog.g:144:5: ( ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )* )
            // InternalMoniLog.g:145:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*
            {
            // InternalMoniLog.g:145:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*
            loop6:
            do {
                int alt6=5;
                alt6 = dfa6.predict(input);
                switch (alt6) {
            	case 1 :
            	    // InternalMoniLog.g:146:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:146:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
            	    // InternalMoniLog.g:147:5: {...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoniLog.g:147:105: ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
            	    // InternalMoniLog.g:148:6: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0);
            	    // InternalMoniLog.g:151:9: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
            	    int cnt2=0;
            	    loop2:
            	    do {
            	        int alt2=2;
            	        switch ( input.LA(1) ) {
            	        case 30:
            	            {
            	            int LA2_2 = input.LA(2);

            	            if ( ((synpred2_InternalMoniLog()&&(true))) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 31:
            	            {
            	            int LA2_3 = input.LA(2);

            	            if ( ((synpred2_InternalMoniLog()&&(true))) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;
            	        case 32:
            	            {
            	            int LA2_4 = input.LA(2);

            	            if ( ((synpred2_InternalMoniLog()&&(true))) ) {
            	                alt2=1;
            	            }


            	            }
            	            break;

            	        }

            	        switch (alt2) {
            	    	case 1 :
            	    	    // InternalMoniLog.g:151:10: {...}? => ( (lv_events_4_0= ruleEvent ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:151:19: ( (lv_events_4_0= ruleEvent ) )
            	    	    // InternalMoniLog.g:151:20: (lv_events_4_0= ruleEvent )
            	    	    {
            	    	    // InternalMoniLog.g:151:20: (lv_events_4_0= ruleEvent )
            	    	    // InternalMoniLog.g:152:10: lv_events_4_0= ruleEvent
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_3_0_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_events_4_0=ruleEvent();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt2 >= 1 ) break loop2;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
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
            	    // InternalMoniLog.g:174:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:174:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
            	    // InternalMoniLog.g:175:5: {...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoniLog.g:175:105: ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
            	    // InternalMoniLog.g:176:6: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1);
            	    // InternalMoniLog.g:179:9: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
            	    int cnt3=0;
            	    loop3:
            	    do {
            	        int alt3=2;
            	        int LA3_0 = input.LA(1);

            	        if ( (LA3_0==72) ) {
            	            int LA3_2 = input.LA(2);

            	            if ( ((synpred4_InternalMoniLog()&&(true))) ) {
            	                alt3=1;
            	            }


            	        }
            	        else if ( (LA3_0==15) ) {
            	            int LA3_3 = input.LA(2);

            	            if ( ((synpred4_InternalMoniLog()&&(true))) ) {
            	                alt3=1;
            	            }


            	        }


            	        switch (alt3) {
            	    	case 1 :
            	    	    // InternalMoniLog.g:179:10: {...}? => ( (lv_appenders_5_0= ruleAppender ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:179:19: ( (lv_appenders_5_0= ruleAppender ) )
            	    	    // InternalMoniLog.g:179:20: (lv_appenders_5_0= ruleAppender )
            	    	    {
            	    	    // InternalMoniLog.g:179:20: (lv_appenders_5_0= ruleAppender )
            	    	    // InternalMoniLog.g:180:10: lv_appenders_5_0= ruleAppender
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_3_1_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_appenders_5_0=ruleAppender();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt3 >= 1 ) break loop3;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
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
            	    // InternalMoniLog.g:202:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:202:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
            	    // InternalMoniLog.g:203:5: {...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoniLog.g:203:105: ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
            	    // InternalMoniLog.g:204:6: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2);
            	    // InternalMoniLog.g:207:9: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
            	    int cnt4=0;
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==21) ) {
            	            int LA4_2 = input.LA(2);

            	            if ( ((synpred6_InternalMoniLog()&&(true))) ) {
            	                alt4=1;
            	            }


            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // InternalMoniLog.g:207:10: {...}? => ( (lv_layouts_6_0= ruleLayout ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:207:19: ( (lv_layouts_6_0= ruleLayout ) )
            	    	    // InternalMoniLog.g:207:20: (lv_layouts_6_0= ruleLayout )
            	    	    {
            	    	    // InternalMoniLog.g:207:20: (lv_layouts_6_0= ruleLayout )
            	    	    // InternalMoniLog.g:208:10: lv_layouts_6_0= ruleLayout
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_3_2_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_layouts_6_0=ruleLayout();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt4 >= 1 ) break loop4;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
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
            	    // InternalMoniLog.g:230:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
            	    {
            	    // InternalMoniLog.g:230:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
            	    // InternalMoniLog.g:231:5: {...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleDocument", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoniLog.g:231:105: ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
            	    // InternalMoniLog.g:232:6: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3);
            	    // InternalMoniLog.g:235:9: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
            	    int cnt5=0;
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==71) ) {
            	            int LA5_2 = input.LA(2);

            	            if ( ((synpred8_InternalMoniLog()&&(true))) ) {
            	                alt5=1;
            	            }


            	        }
            	        else if ( (LA5_0==24) ) {
            	            int LA5_3 = input.LA(2);

            	            if ( ((synpred8_InternalMoniLog()&&(true))) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // InternalMoniLog.g:235:10: {...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleDocument", "true");
            	    	    }
            	    	    // InternalMoniLog.g:235:19: ( (lv_moniloggers_7_0= ruleMoniLogger ) )
            	    	    // InternalMoniLog.g:235:20: (lv_moniloggers_7_0= ruleMoniLogger )
            	    	    {
            	    	    // InternalMoniLog.g:235:20: (lv_moniloggers_7_0= ruleMoniLogger )
            	    	    // InternalMoniLog.g:236:10: lv_moniloggers_7_0= ruleMoniLogger
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      										newCompositeNode(grammarAccess.getDocumentAccess().getMoniloggersMoniLoggerParserRuleCall_3_3_0());
            	    	      									
            	    	    }
            	    	    pushFollow(FOLLOW_5);
            	    	    lv_moniloggers_7_0=ruleMoniLogger();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt5 >= 1 ) break loop5;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
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

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myUnorderedGroupState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleImport"
    // InternalMoniLog.g:272:1: entryRuleImport returns [EObject current=null] : iv_ruleImport= ruleImport EOF ;
    public final EObject entryRuleImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImport = null;


        try {
            // InternalMoniLog.g:272:47: (iv_ruleImport= ruleImport EOF )
            // InternalMoniLog.g:273:2: iv_ruleImport= ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleImport=ruleImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:279:1: ruleImport returns [EObject current=null] : ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) | (otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) ) ) ) ;
    public final EObject ruleImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;

        EObject lv_alias_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:285:2: ( ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) | (otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) ) ) ) )
            // InternalMoniLog.g:286:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) | (otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) ) ) )
            {
            // InternalMoniLog.g:286:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) | (otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==13) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==RULE_STRING) ) {
                    alt7=2;
                }
                else if ( (LA7_1==RULE_ID) ) {
                    alt7=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoniLog.g:287:3: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
                    {
                    // InternalMoniLog.g:287:3: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
                    // InternalMoniLog.g:288:4: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    {
                    otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getImportAccess().getImportKeyword_0_0());
                      			
                    }
                    // InternalMoniLog.g:292:4: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
                    // InternalMoniLog.g:293:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    {
                    // InternalMoniLog.g:293:5: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
                    // InternalMoniLog.g:294:6: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:313:3: (otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) ) )
                    {
                    // InternalMoniLog.g:313:3: (otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) ) )
                    // InternalMoniLog.g:314:4: otherlv_2= 'import' ( (lv_alias_3_0= ruleFileAlias ) )
                    {
                    otherlv_2=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getImportAccess().getImportKeyword_1_0());
                      			
                    }
                    // InternalMoniLog.g:318:4: ( (lv_alias_3_0= ruleFileAlias ) )
                    // InternalMoniLog.g:319:5: (lv_alias_3_0= ruleFileAlias )
                    {
                    // InternalMoniLog.g:319:5: (lv_alias_3_0= ruleFileAlias )
                    // InternalMoniLog.g:320:6: lv_alias_3_0= ruleFileAlias
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getImportAccess().getAliasFileAliasParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_alias_3_0=ruleFileAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getImportRule());
                      						}
                      						set(
                      							current,
                      							"alias",
                      							lv_alias_3_0,
                      							"org.gemoc.monilog.MoniLog.FileAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleFileAlias"
    // InternalMoniLog.g:342:1: entryRuleFileAlias returns [EObject current=null] : iv_ruleFileAlias= ruleFileAlias EOF ;
    public final EObject entryRuleFileAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFileAlias = null;


        try {
            // InternalMoniLog.g:342:50: (iv_ruleFileAlias= ruleFileAlias EOF )
            // InternalMoniLog.g:343:2: iv_ruleFileAlias= ruleFileAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFileAliasRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleFileAlias=ruleFileAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFileAlias; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleFileAlias"


    // $ANTLR start "ruleFileAlias"
    // InternalMoniLog.g:349:1: ruleFileAlias returns [EObject current=null] : ( ( (lv_filePath_0_0= RULE_STRING ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleFileAlias() throws RecognitionException {
        EObject current = null;

        Token lv_filePath_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:355:2: ( ( ( (lv_filePath_0_0= RULE_STRING ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMoniLog.g:356:2: ( ( (lv_filePath_0_0= RULE_STRING ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMoniLog.g:356:2: ( ( (lv_filePath_0_0= RULE_STRING ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMoniLog.g:357:3: ( (lv_filePath_0_0= RULE_STRING ) ) otherlv_1= 'as' ( (lv_name_2_0= RULE_ID ) )
            {
            // InternalMoniLog.g:357:3: ( (lv_filePath_0_0= RULE_STRING ) )
            // InternalMoniLog.g:358:4: (lv_filePath_0_0= RULE_STRING )
            {
            // InternalMoniLog.g:358:4: (lv_filePath_0_0= RULE_STRING )
            // InternalMoniLog.g:359:5: lv_filePath_0_0= RULE_STRING
            {
            lv_filePath_0_0=(Token)match(input,RULE_STRING,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_filePath_0_0, grammarAccess.getFileAliasAccess().getFilePathSTRINGTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFileAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"filePath",
              						lv_filePath_0_0,
              						"org.eclipse.xtext.common.Terminals.STRING");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getFileAliasAccess().getAsKeyword_1());
              		
            }
            // InternalMoniLog.g:379:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog.g:380:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog.g:380:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog.g:381:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getFileAliasAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getFileAliasRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleFileAlias"


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog.g:401:1: entryRuleAppender returns [EObject current=null] : iv_ruleAppender= ruleAppender EOF ;
    public final EObject entryRuleAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppender = null;


        try {
            // InternalMoniLog.g:401:49: (iv_ruleAppender= ruleAppender EOF )
            // InternalMoniLog.g:402:2: iv_ruleAppender= ruleAppender EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppenderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAppender=ruleAppender();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppender; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:408:1: ruleAppender returns [EObject current=null] : (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) ;
    public final EObject ruleAppender() throws RecognitionException {
        EObject current = null;

        EObject this_LocalAppender_0 = null;

        EObject this_ExternalAppender_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:414:2: ( (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender ) )
            // InternalMoniLog.g:415:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            {
            // InternalMoniLog.g:415:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalMoniLog.g:416:3: this_LocalAppender_0= ruleLocalAppender
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAppenderAccess().getLocalAppenderParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalAppender_0=ruleLocalAppender();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocalAppender_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:428:3: this_ExternalAppender_1= ruleExternalAppender
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAppenderAccess().getExternalAppenderParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternalAppender_1=ruleExternalAppender();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternalAppender_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAppender"


    // $ANTLR start "entryRuleLocalAppender"
    // InternalMoniLog.g:443:1: entryRuleLocalAppender returns [EObject current=null] : iv_ruleLocalAppender= ruleLocalAppender EOF ;
    public final EObject entryRuleLocalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalAppender = null;


        try {
            // InternalMoniLog.g:443:54: (iv_ruleLocalAppender= ruleLocalAppender EOF )
            // InternalMoniLog.g:444:2: iv_ruleLocalAppender= ruleLocalAppender EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalAppenderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalAppender=ruleLocalAppender();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalAppender; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:450:1: ruleLocalAppender returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' ) ;
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
            // InternalMoniLog.g:456:2: ( ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' ) )
            // InternalMoniLog.g:457:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' )
            {
            // InternalMoniLog.g:457:2: ( ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}' )
            // InternalMoniLog.g:458:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )* otherlv_1= 'appender' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_calls_7_0= ruleAppenderCall ) ) (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )* (otherlv_10= ';' )? otherlv_11= '}'
            {
            // InternalMoniLog.g:458:3: ( (lv_annotations_0_0= ruleAppenderAnnotation ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==72) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMoniLog.g:459:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    {
            	    // InternalMoniLog.g:459:4: (lv_annotations_0_0= ruleAppenderAnnotation )
            	    // InternalMoniLog.g:460:5: lv_annotations_0_0= ruleAppenderAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getLocalAppenderAccess().getAnnotationsAppenderAnnotationEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_8);
            	    lv_annotations_0_0=ruleAppenderAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_1=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLocalAppenderAccess().getAppenderKeyword_1());
              		
            }
            // InternalMoniLog.g:481:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog.g:482:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog.g:482:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog.g:483:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getLocalAppenderAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:499:3: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==16) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoniLog.g:500:4: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoniLog.g:504:4: ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:505:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:505:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:506:6: lv_parameterDecl_4_0= ruleParameterDeclVarArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parameterDecl_4_0=ruleParameterDeclVarArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_6=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getLocalAppenderAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoniLog.g:532:3: ( (lv_calls_7_0= ruleAppenderCall ) )
            // InternalMoniLog.g:533:4: (lv_calls_7_0= ruleAppenderCall )
            {
            // InternalMoniLog.g:533:4: (lv_calls_7_0= ruleAppenderCall )
            // InternalMoniLog.g:534:5: lv_calls_7_0= ruleAppenderCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_calls_7_0=ruleAppenderCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:551:3: (otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==19) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==RULE_ID) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // InternalMoniLog.g:552:4: otherlv_8= ';' ( (lv_calls_9_0= ruleAppenderCall ) )
            	    {
            	    otherlv_8=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_8, grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0());
            	      			
            	    }
            	    // InternalMoniLog.g:556:4: ( (lv_calls_9_0= ruleAppenderCall ) )
            	    // InternalMoniLog.g:557:5: (lv_calls_9_0= ruleAppenderCall )
            	    {
            	    // InternalMoniLog.g:557:5: (lv_calls_9_0= ruleAppenderCall )
            	    // InternalMoniLog.g:558:6: lv_calls_9_0= ruleAppenderCall
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_6_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_calls_9_0=ruleAppenderCall();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            // InternalMoniLog.g:576:3: (otherlv_10= ';' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==19) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoniLog.g:577:4: otherlv_10= ';'
                    {
                    otherlv_10=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_7());
                      			
                    }

                    }
                    break;

            }

            otherlv_11=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLocalAppender"


    // $ANTLR start "entryRuleExternalAppender"
    // InternalMoniLog.g:590:1: entryRuleExternalAppender returns [EObject current=null] : iv_ruleExternalAppender= ruleExternalAppender EOF ;
    public final EObject entryRuleExternalAppender() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalAppender = null;


        try {
            // InternalMoniLog.g:590:57: (iv_ruleExternalAppender= ruleExternalAppender EOF )
            // InternalMoniLog.g:591:2: iv_ruleExternalAppender= ruleExternalAppender EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalAppenderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalAppender=ruleExternalAppender();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalAppender; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:597:1: ruleExternalAppender returns [EObject current=null] : (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleExternalAppender() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDecl_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:603:2: ( (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) )
            // InternalMoniLog.g:604:2: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            {
            // InternalMoniLog.g:604:2: (otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            // InternalMoniLog.g:605:3: otherlv_0= 'appender' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0());
              		
            }
            // InternalMoniLog.g:609:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog.g:610:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog.g:610:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog.g:611:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getExternalAppenderAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:627:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==16) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoniLog.g:628:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMoniLog.g:632:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:633:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:633:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:634:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExternalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parameterDecl_3_0=ruleParameterDeclVarArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExternalAppender"


    // $ANTLR start "entryRuleLayout"
    // InternalMoniLog.g:660:1: entryRuleLayout returns [EObject current=null] : iv_ruleLayout= ruleLayout EOF ;
    public final EObject entryRuleLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayout = null;


        try {
            // InternalMoniLog.g:660:47: (iv_ruleLayout= ruleLayout EOF )
            // InternalMoniLog.g:661:2: iv_ruleLayout= ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLayout=ruleLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayout; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:667:1: ruleLayout returns [EObject current=null] : (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) ;
    public final EObject ruleLayout() throws RecognitionException {
        EObject current = null;

        EObject this_LocalLayout_0 = null;

        EObject this_ExternalLayout_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:673:2: ( (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout ) )
            // InternalMoniLog.g:674:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            {
            // InternalMoniLog.g:674:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )
            int alt14=2;
            alt14 = dfa14.predict(input);
            switch (alt14) {
                case 1 :
                    // InternalMoniLog.g:675:3: this_LocalLayout_0= ruleLocalLayout
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLayoutAccess().getLocalLayoutParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LocalLayout_0=ruleLocalLayout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LocalLayout_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:687:3: this_ExternalLayout_1= ruleExternalLayout
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getLayoutAccess().getExternalLayoutParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExternalLayout_1=ruleExternalLayout();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExternalLayout_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLocalLayout"
    // InternalMoniLog.g:702:1: entryRuleLocalLayout returns [EObject current=null] : iv_ruleLocalLayout= ruleLocalLayout EOF ;
    public final EObject entryRuleLocalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLocalLayout = null;


        try {
            // InternalMoniLog.g:702:52: (iv_ruleLocalLayout= ruleLocalLayout EOF )
            // InternalMoniLog.g:703:2: iv_ruleLocalLayout= ruleLocalLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLocalLayoutRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLocalLayout=ruleLocalLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLocalLayout; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:709:1: ruleLocalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' ) ;
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
            // InternalMoniLog.g:715:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' ) )
            // InternalMoniLog.g:716:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' )
            {
            // InternalMoniLog.g:716:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}' )
            // InternalMoniLog.g:717:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? otherlv_5= '{' ( (lv_call_6_0= ruleLayoutCall ) ) otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLocalLayoutAccess().getLayoutKeyword_0());
              		
            }
            // InternalMoniLog.g:721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog.g:722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog.g:722:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog.g:723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getLocalLayoutAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:739:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==16) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoniLog.g:740:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMoniLog.g:744:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:745:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:745:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:746:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLocalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parameterDecl_3_0=ruleParameterDeclVarArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_5=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getLocalLayoutAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMoniLog.g:772:3: ( (lv_call_6_0= ruleLayoutCall ) )
            // InternalMoniLog.g:773:4: (lv_call_6_0= ruleLayoutCall )
            {
            // InternalMoniLog.g:773:4: (lv_call_6_0= ruleLayoutCall )
            // InternalMoniLog.g:774:5: lv_call_6_0= ruleLayoutCall
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLocalLayoutAccess().getCallLayoutCallParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_call_6_0=ruleLayoutCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_7=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLocalLayout"


    // $ANTLR start "entryRuleExternalLayout"
    // InternalMoniLog.g:799:1: entryRuleExternalLayout returns [EObject current=null] : iv_ruleExternalLayout= ruleExternalLayout EOF ;
    public final EObject entryRuleExternalLayout() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalLayout = null;


        try {
            // InternalMoniLog.g:799:55: (iv_ruleExternalLayout= ruleExternalLayout EOF )
            // InternalMoniLog.g:800:2: iv_ruleExternalLayout= ruleExternalLayout EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalLayoutRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExternalLayout=ruleExternalLayout();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalLayout; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:806:1: ruleExternalLayout returns [EObject current=null] : (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) ;
    public final EObject ruleExternalLayout() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_parameterDecl_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:812:2: ( (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? ) )
            // InternalMoniLog.g:813:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            {
            // InternalMoniLog.g:813:2: (otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )? )
            // InternalMoniLog.g:814:3: otherlv_0= 'layout' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getExternalLayoutAccess().getLayoutKeyword_0());
              		
            }
            // InternalMoniLog.g:818:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoniLog.g:819:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoniLog.g:819:4: (lv_name_1_0= RULE_ID )
            // InternalMoniLog.g:820:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getExternalLayoutAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:836:3: (otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoniLog.g:837:4: otherlv_2= '(' ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) ) otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMoniLog.g:841:4: ( (lv_parameterDecl_3_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:842:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:842:5: (lv_parameterDecl_3_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:843:6: lv_parameterDecl_3_0= ruleParameterDeclVarArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExternalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parameterDecl_3_0=ruleParameterDeclVarArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExternalLayout"


    // $ANTLR start "entryRuleParameterDeclVarArgs"
    // InternalMoniLog.g:869:1: entryRuleParameterDeclVarArgs returns [EObject current=null] : iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF ;
    public final EObject entryRuleParameterDeclVarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclVarArgs = null;


        try {
            // InternalMoniLog.g:869:61: (iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF )
            // InternalMoniLog.g:870:2: iv_ruleParameterDeclVarArgs= ruleParameterDeclVarArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclVarArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclVarArgs=ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclVarArgs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:876:1: ruleParameterDeclVarArgs returns [EObject current=null] : ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? ) ;
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
            // InternalMoniLog.g:882:2: ( ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? ) )
            // InternalMoniLog.g:883:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? )
            {
            // InternalMoniLog.g:883:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )? )
            // InternalMoniLog.g:884:3: () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )?
            {
            // InternalMoniLog.g:884:3: ()
            // InternalMoniLog.g:885:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterDeclVarArgsAccess().getParameterDeclAction_0(),
              					current);
              			
            }

            }

            // InternalMoniLog.g:894:3: ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoniLog.g:895:4: ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )?
                    {
                    // InternalMoniLog.g:895:4: ( (lv_parameters_1_0= ruleParameter ) )
                    // InternalMoniLog.g:896:5: (lv_parameters_1_0= ruleParameter )
                    {
                    // InternalMoniLog.g:896:5: (lv_parameters_1_0= ruleParameter )
                    // InternalMoniLog.g:897:6: lv_parameters_1_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_parameters_1_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:914:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==22) ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1==RULE_ID) ) {
                                int LA17_3 = input.LA(3);

                                if ( (LA17_3==EOF||LA17_3==17||LA17_3==22) ) {
                                    alt17=1;
                                }


                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalMoniLog.g:915:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:919:5: ( (lv_parameters_3_0= ruleParameter ) )
                    	    // InternalMoniLog.g:920:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog.g:920:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalMoniLog.g:921:7: lv_parameters_3_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // InternalMoniLog.g:939:4: (otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==22) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalMoniLog.g:940:5: otherlv_4= ',' ( (lv_varArgs_5_0= ruleParameter ) ) otherlv_6= '...'
                            {
                            otherlv_4=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_2_0());
                              				
                            }
                            // InternalMoniLog.g:944:5: ( (lv_varArgs_5_0= ruleParameter ) )
                            // InternalMoniLog.g:945:6: (lv_varArgs_5_0= ruleParameter )
                            {
                            // InternalMoniLog.g:945:6: (lv_varArgs_5_0= ruleParameter )
                            // InternalMoniLog.g:946:7: lv_varArgs_5_0= ruleParameter
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsParameterParserRuleCall_1_2_1_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
                            lv_varArgs_5_0=ruleParameter();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_6=(Token)match(input,23,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getParameterDeclVarArgsAccess().getFullStopFullStopFullStopKeyword_1_2_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterDeclVarArgs"


    // $ANTLR start "entryRuleParameterDeclNoVarArgs"
    // InternalMoniLog.g:973:1: entryRuleParameterDeclNoVarArgs returns [EObject current=null] : iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF ;
    public final EObject entryRuleParameterDeclNoVarArgs() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterDeclNoVarArgs = null;


        try {
            // InternalMoniLog.g:973:63: (iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF )
            // InternalMoniLog.g:974:2: iv_ruleParameterDeclNoVarArgs= ruleParameterDeclNoVarArgs EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterDeclNoVarArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterDeclNoVarArgs=ruleParameterDeclNoVarArgs();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterDeclNoVarArgs; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:980:1: ruleParameterDeclNoVarArgs returns [EObject current=null] : ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? ) ;
    public final EObject ruleParameterDeclNoVarArgs() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject lv_parameters_1_0 = null;

        EObject lv_parameters_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:986:2: ( ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? ) )
            // InternalMoniLog.g:987:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? )
            {
            // InternalMoniLog.g:987:2: ( () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )? )
            // InternalMoniLog.g:988:3: () ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )?
            {
            // InternalMoniLog.g:988:3: ()
            // InternalMoniLog.g:989:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getParameterDeclNoVarArgsAccess().getParameterDeclAction_0(),
              					current);
              			
            }

            }

            // InternalMoniLog.g:998:3: ( ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )* )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoniLog.g:999:4: ( (lv_parameters_1_0= ruleParameter ) ) (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    {
                    // InternalMoniLog.g:999:4: ( (lv_parameters_1_0= ruleParameter ) )
                    // InternalMoniLog.g:1000:5: (lv_parameters_1_0= ruleParameter )
                    {
                    // InternalMoniLog.g:1000:5: (lv_parameters_1_0= ruleParameter )
                    // InternalMoniLog.g:1001:6: lv_parameters_1_0= ruleParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_16);
                    lv_parameters_1_0=ruleParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:1018:4: (otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) ) )*
                    loop20:
                    do {
                        int alt20=2;
                        int LA20_0 = input.LA(1);

                        if ( (LA20_0==22) ) {
                            alt20=1;
                        }


                        switch (alt20) {
                    	case 1 :
                    	    // InternalMoniLog.g:1019:5: otherlv_2= ',' ( (lv_parameters_3_0= ruleParameter ) )
                    	    {
                    	    otherlv_2=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_2, grammarAccess.getParameterDeclNoVarArgsAccess().getCommaKeyword_1_1_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:1023:5: ( (lv_parameters_3_0= ruleParameter ) )
                    	    // InternalMoniLog.g:1024:6: (lv_parameters_3_0= ruleParameter )
                    	    {
                    	    // InternalMoniLog.g:1024:6: (lv_parameters_3_0= ruleParameter )
                    	    // InternalMoniLog.g:1025:7: lv_parameters_3_0= ruleParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_16);
                    	    lv_parameters_3_0=ruleParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop20;
                        }
                    } while (true);


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterDeclNoVarArgs"


    // $ANTLR start "entryRuleMoniLogger"
    // InternalMoniLog.g:1048:1: entryRuleMoniLogger returns [EObject current=null] : iv_ruleMoniLogger= ruleMoniLogger EOF ;
    public final EObject entryRuleMoniLogger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLogger = null;


        try {
            // InternalMoniLog.g:1048:51: (iv_ruleMoniLogger= ruleMoniLogger EOF )
            // InternalMoniLog.g:1049:2: iv_ruleMoniLogger= ruleMoniLogger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoniLoggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMoniLogger=ruleMoniLogger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMoniLogger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1055:1: ruleMoniLogger returns [EObject current=null] : ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' ) ;
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
            // InternalMoniLog.g:1061:2: ( ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' ) )
            // InternalMoniLog.g:1062:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' )
            {
            // InternalMoniLog.g:1062:2: ( ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}' )
            // InternalMoniLog.g:1063:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )* otherlv_1= 'monilogger' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )? (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )? otherlv_9= '{' otherlv_10= 'event' ( (lv_streamEvent_11_0= ruleStreamEvent ) ) (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )? otherlv_19= 'actions' otherlv_20= '{' ( (lv_actions_21_0= ruleAction ) ) (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )* (otherlv_24= ';' )? otherlv_25= '}' otherlv_26= '}'
            {
            // InternalMoniLog.g:1063:3: ( (lv_annotations_0_0= ruleMoniLoggerAnnotation ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==71) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMoniLog.g:1064:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    {
            	    // InternalMoniLog.g:1064:4: (lv_annotations_0_0= ruleMoniLoggerAnnotation )
            	    // InternalMoniLog.g:1065:5: lv_annotations_0_0= ruleMoniLoggerAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMoniLoggerAccess().getAnnotationsMoniLoggerAnnotationEnumRuleCall_0_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_annotations_0_0=ruleMoniLoggerAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_1=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1());
              		
            }
            // InternalMoniLog.g:1086:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoniLog.g:1087:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoniLog.g:1087:4: (lv_name_2_0= RULE_ID )
            // InternalMoniLog.g:1088:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMoniLoggerAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:1104:3: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==16) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog.g:1105:4: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) ) otherlv_5= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoniLog.g:1109:4: ( (lv_parameterDecl_4_0= ruleParameterDeclVarArgs ) )
                    // InternalMoniLog.g:1110:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    {
                    // InternalMoniLog.g:1110:5: (lv_parameterDecl_4_0= ruleParameterDeclVarArgs )
                    // InternalMoniLog.g:1111:6: lv_parameterDecl_4_0= ruleParameterDeclVarArgs
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMoniLoggerAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_parameterDecl_4_0=ruleParameterDeclVarArgs();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            // InternalMoniLog.g:1133:3: (otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==25) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoniLog.g:1134:4: otherlv_6= '[' ( (lv_level_7_0= ruleLogLevel ) ) otherlv_8= ']'
                    {
                    otherlv_6=(Token)match(input,25,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0());
                      			
                    }
                    // InternalMoniLog.g:1138:4: ( (lv_level_7_0= ruleLogLevel ) )
                    // InternalMoniLog.g:1139:5: (lv_level_7_0= ruleLogLevel )
                    {
                    // InternalMoniLog.g:1139:5: (lv_level_7_0= ruleLogLevel )
                    // InternalMoniLog.g:1140:6: lv_level_7_0= ruleLogLevel
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMoniLoggerAccess().getLevelLogLevelEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_22);
                    lv_level_7_0=ruleLogLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_8=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMoniLoggerAccess().getRightSquareBracketKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_9=(Token)match(input,18,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            otherlv_10=(Token)match(input,27,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getMoniLoggerAccess().getEventKeyword_6());
              		
            }
            // InternalMoniLog.g:1170:3: ( (lv_streamEvent_11_0= ruleStreamEvent ) )
            // InternalMoniLog.g:1171:4: (lv_streamEvent_11_0= ruleStreamEvent )
            {
            // InternalMoniLog.g:1171:4: (lv_streamEvent_11_0= ruleStreamEvent )
            // InternalMoniLog.g:1172:5: lv_streamEvent_11_0= ruleStreamEvent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoniLoggerAccess().getStreamEventStreamEventParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_streamEvent_11_0=ruleStreamEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:1189:3: (otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMoniLog.g:1190:4: otherlv_12= 'conditions' otherlv_13= '{' ( (lv_conditions_14_0= ruleCondition ) ) (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )* (otherlv_17= ';' )? otherlv_18= '}'
                    {
                    otherlv_12=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0());
                      			
                    }
                    otherlv_13=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1());
                      			
                    }
                    // InternalMoniLog.g:1198:4: ( (lv_conditions_14_0= ruleCondition ) )
                    // InternalMoniLog.g:1199:5: (lv_conditions_14_0= ruleCondition )
                    {
                    // InternalMoniLog.g:1199:5: (lv_conditions_14_0= ruleCondition )
                    // InternalMoniLog.g:1200:6: lv_conditions_14_0= ruleCondition
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_2_0());
                      					
                    }
                    pushFollow(FOLLOW_13);
                    lv_conditions_14_0=ruleCondition();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:1217:4: (otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==19) ) {
                            int LA25_1 = input.LA(2);

                            if ( (LA25_1==RULE_ID) ) {
                                alt25=1;
                            }


                        }


                        switch (alt25) {
                    	case 1 :
                    	    // InternalMoniLog.g:1218:5: otherlv_15= ';' ( (lv_conditions_16_0= ruleCondition ) )
                    	    {
                    	    otherlv_15=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_15, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:1222:5: ( (lv_conditions_16_0= ruleCondition ) )
                    	    // InternalMoniLog.g:1223:6: (lv_conditions_16_0= ruleCondition )
                    	    {
                    	    // InternalMoniLog.g:1223:6: (lv_conditions_16_0= ruleCondition )
                    	    // InternalMoniLog.g:1224:7: lv_conditions_16_0= ruleCondition
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_13);
                    	    lv_conditions_16_0=ruleCondition();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop25;
                        }
                    } while (true);

                    // InternalMoniLog.g:1242:4: (otherlv_17= ';' )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==19) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalMoniLog.g:1243:5: otherlv_17= ';'
                            {
                            otherlv_17=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_17, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_4());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_18=(Token)match(input,20,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_18, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_5());
                      			
                    }

                    }
                    break;

            }

            otherlv_19=(Token)match(input,29,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_19, grammarAccess.getMoniLoggerAccess().getActionsKeyword_9());
              		
            }
            otherlv_20=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_20, grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10());
              		
            }
            // InternalMoniLog.g:1261:3: ( (lv_actions_21_0= ruleAction ) )
            // InternalMoniLog.g:1262:4: (lv_actions_21_0= ruleAction )
            {
            // InternalMoniLog.g:1262:4: (lv_actions_21_0= ruleAction )
            // InternalMoniLog.g:1263:5: lv_actions_21_0= ruleAction
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_11_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_actions_21_0=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:1280:3: (otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==19) ) {
                    int LA28_1 = input.LA(2);

                    if ( (LA28_1==RULE_ID) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoniLog.g:1281:4: otherlv_22= ';' ( (lv_actions_23_0= ruleAction ) )
            	    {
            	    otherlv_22=(Token)match(input,19,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_22, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0());
            	      			
            	    }
            	    // InternalMoniLog.g:1285:4: ( (lv_actions_23_0= ruleAction ) )
            	    // InternalMoniLog.g:1286:5: (lv_actions_23_0= ruleAction )
            	    {
            	    // InternalMoniLog.g:1286:5: (lv_actions_23_0= ruleAction )
            	    // InternalMoniLog.g:1287:6: lv_actions_23_0= ruleAction
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_12_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_13);
            	    lv_actions_23_0=ruleAction();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalMoniLog.g:1305:3: (otherlv_24= ';' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==19) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoniLog.g:1306:4: otherlv_24= ';'
                    {
                    otherlv_24=(Token)match(input,19,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_13());
                      			
                    }

                    }
                    break;

            }

            otherlv_25=(Token)match(input,20,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14());
              		
            }
            otherlv_26=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_26, grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_15());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMoniLogger"


    // $ANTLR start "entryRuleParameter"
    // InternalMoniLog.g:1323:1: entryRuleParameter returns [EObject current=null] : iv_ruleParameter= ruleParameter EOF ;
    public final EObject entryRuleParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameter = null;


        try {
            // InternalMoniLog.g:1323:50: (iv_ruleParameter= ruleParameter EOF )
            // InternalMoniLog.g:1324:2: iv_ruleParameter= ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameter=ruleParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1330:1: ruleParameter returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleParameter() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:1336:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalMoniLog.g:1337:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalMoniLog.g:1337:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalMoniLog.g:1338:3: (lv_name_0_0= RULE_ID )
            {
            // InternalMoniLog.g:1338:3: (lv_name_0_0= RULE_ID )
            // InternalMoniLog.g:1339:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_name_0_0, grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEvent"
    // InternalMoniLog.g:1358:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalMoniLog.g:1358:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalMoniLog.g:1359:2: iv_ruleEvent= ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1365:1: ruleEvent returns [EObject current=null] : ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) ) ;
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
            // InternalMoniLog.g:1371:2: ( ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) ) )
            // InternalMoniLog.g:1372:2: ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) )
            {
            // InternalMoniLog.g:1372:2: ( ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' ) | ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' ) | ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt34=1;
                }
                break;
            case 31:
                {
                alt34=2;
                }
                break;
            case 32:
                {
                alt34=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalMoniLog.g:1373:3: ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' )
                    {
                    // InternalMoniLog.g:1373:3: ( () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}' )
                    // InternalMoniLog.g:1374:4: () otherlv_1= 'call' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )? otherlv_6= '{' ( (lv_kind_7_0= ruleASTEventKind ) ) ( (lv_ruleID_8_0= RULE_ID ) ) otherlv_9= '}'
                    {
                    // InternalMoniLog.g:1374:4: ()
                    // InternalMoniLog.g:1375:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventAccess().getASTEventAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,30,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEventAccess().getCallKeyword_0_1());
                      			
                    }
                    // InternalMoniLog.g:1388:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalMoniLog.g:1389:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1389:5: (lv_name_2_0= RULE_ID )
                    // InternalMoniLog.g:1390:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_2_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:1406:4: (otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')' )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==16) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // InternalMoniLog.g:1407:5: otherlv_3= '(' ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_3, grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_3_0());
                              				
                            }
                            // InternalMoniLog.g:1411:5: ( (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog.g:1412:6: (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog.g:1412:6: (lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog.g:1413:7: lv_parameterDecl_4_0= ruleParameterDeclNoVarArgs
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_0_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_parameterDecl_4_0=ruleParameterDeclNoVarArgs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_5=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_5, grammarAccess.getEventAccess().getRightParenthesisKeyword_0_3_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_6=(Token)match(input,18,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_0_4());
                      			
                    }
                    // InternalMoniLog.g:1439:4: ( (lv_kind_7_0= ruleASTEventKind ) )
                    // InternalMoniLog.g:1440:5: (lv_kind_7_0= ruleASTEventKind )
                    {
                    // InternalMoniLog.g:1440:5: (lv_kind_7_0= ruleASTEventKind )
                    // InternalMoniLog.g:1441:6: lv_kind_7_0= ruleASTEventKind
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventAccess().getKindASTEventKindParserRuleCall_0_5_0());
                      					
                    }
                    pushFollow(FOLLOW_3);
                    lv_kind_7_0=ruleASTEventKind();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:1458:4: ( (lv_ruleID_8_0= RULE_ID ) )
                    // InternalMoniLog.g:1459:5: (lv_ruleID_8_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1459:5: (lv_ruleID_8_0= RULE_ID )
                    // InternalMoniLog.g:1460:6: lv_ruleID_8_0= RULE_ID
                    {
                    lv_ruleID_8_0=(Token)match(input,RULE_ID,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ruleID_8_0, grammarAccess.getEventAccess().getRuleIDIDTerminalRuleCall_0_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_0_7());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:1482:3: ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' )
                    {
                    // InternalMoniLog.g:1482:3: ( () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}' )
                    // InternalMoniLog.g:1483:4: () otherlv_11= 'complex' ( (lv_name_12_0= RULE_ID ) ) (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )? (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )? otherlv_19= '{' ( (lv_pattern_20_0= ruleTemporalPattern ) ) otherlv_21= '}'
                    {
                    // InternalMoniLog.g:1483:4: ()
                    // InternalMoniLog.g:1484:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventAccess().getComplexEventAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,31,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getEventAccess().getComplexKeyword_1_1());
                      			
                    }
                    // InternalMoniLog.g:1497:4: ( (lv_name_12_0= RULE_ID ) )
                    // InternalMoniLog.g:1498:5: (lv_name_12_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1498:5: (lv_name_12_0= RULE_ID )
                    // InternalMoniLog.g:1499:6: lv_name_12_0= RULE_ID
                    {
                    lv_name_12_0=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_12_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:1515:4: (otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']' )?
                    int alt31=2;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==25) ) {
                        alt31=1;
                    }
                    switch (alt31) {
                        case 1 :
                            // InternalMoniLog.g:1516:5: otherlv_13= '[' ( (lv_kind_14_0= ruleTemporalPatternKind ) ) otherlv_15= ']'
                            {
                            otherlv_13=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_3_0());
                              				
                            }
                            // InternalMoniLog.g:1520:5: ( (lv_kind_14_0= ruleTemporalPatternKind ) )
                            // InternalMoniLog.g:1521:6: (lv_kind_14_0= ruleTemporalPatternKind )
                            {
                            // InternalMoniLog.g:1521:6: (lv_kind_14_0= ruleTemporalPatternKind )
                            // InternalMoniLog.g:1522:7: lv_kind_14_0= ruleTemporalPatternKind
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEventAccess().getKindTemporalPatternKindEnumRuleCall_1_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_22);
                            lv_kind_14_0=ruleTemporalPatternKind();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_15=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_15, grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_3_2());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMoniLog.g:1544:4: (otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')' )?
                    int alt32=2;
                    int LA32_0 = input.LA(1);

                    if ( (LA32_0==16) ) {
                        alt32=1;
                    }
                    switch (alt32) {
                        case 1 :
                            // InternalMoniLog.g:1545:5: otherlv_16= '(' ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) ) otherlv_18= ')'
                            {
                            otherlv_16=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_16, grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_4_0());
                              				
                            }
                            // InternalMoniLog.g:1549:5: ( (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog.g:1550:6: (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog.g:1550:6: (lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog.g:1551:7: lv_parameterDecl_17_0= ruleParameterDeclNoVarArgs
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_1_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_parameterDecl_17_0=ruleParameterDeclNoVarArgs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_18=(Token)match(input,17,FOLLOW_12); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_18, grammarAccess.getEventAccess().getRightParenthesisKeyword_1_4_2());
                              				
                            }

                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1_5());
                      			
                    }
                    // InternalMoniLog.g:1577:4: ( (lv_pattern_20_0= ruleTemporalPattern ) )
                    // InternalMoniLog.g:1578:5: (lv_pattern_20_0= ruleTemporalPattern )
                    {
                    // InternalMoniLog.g:1578:5: (lv_pattern_20_0= ruleTemporalPattern )
                    // InternalMoniLog.g:1579:6: lv_pattern_20_0= ruleTemporalPattern
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEventAccess().getPatternTemporalPatternParserRuleCall_1_6_0());
                      					
                    }
                    pushFollow(FOLLOW_14);
                    lv_pattern_20_0=ruleTemporalPattern();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_21=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getEventAccess().getRightCurlyBracketKeyword_1_7());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:1602:3: ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? )
                    {
                    // InternalMoniLog.g:1602:3: ( () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )? )
                    // InternalMoniLog.g:1603:4: () otherlv_23= 'custom' ( (lv_name_24_0= RULE_ID ) ) (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )?
                    {
                    // InternalMoniLog.g:1603:4: ()
                    // InternalMoniLog.g:1604:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEventAccess().getUserEventAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_23=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getEventAccess().getCustomKeyword_2_1());
                      			
                    }
                    // InternalMoniLog.g:1617:4: ( (lv_name_24_0= RULE_ID ) )
                    // InternalMoniLog.g:1618:5: (lv_name_24_0= RULE_ID )
                    {
                    // InternalMoniLog.g:1618:5: (lv_name_24_0= RULE_ID )
                    // InternalMoniLog.g:1619:6: lv_name_24_0= RULE_ID
                    {
                    lv_name_24_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_name_24_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:1635:4: (otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==16) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalMoniLog.g:1636:5: otherlv_25= '(' ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) ) otherlv_27= ')'
                            {
                            otherlv_25=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_25, grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_3_0());
                              				
                            }
                            // InternalMoniLog.g:1640:5: ( (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs ) )
                            // InternalMoniLog.g:1641:6: (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs )
                            {
                            // InternalMoniLog.g:1641:6: (lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs )
                            // InternalMoniLog.g:1642:7: lv_parameterDecl_26_0= ruleParameterDeclNoVarArgs
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_2_3_1_0());
                              						
                            }
                            pushFollow(FOLLOW_11);
                            lv_parameterDecl_26_0=ruleParameterDeclNoVarArgs();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            otherlv_27=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_27, grammarAccess.getEventAccess().getRightParenthesisKeyword_2_3_2());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleASTEventKind"
    // InternalMoniLog.g:1669:1: entryRuleASTEventKind returns [EObject current=null] : iv_ruleASTEventKind= ruleASTEventKind EOF ;
    public final EObject entryRuleASTEventKind() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASTEventKind = null;


        try {
            // InternalMoniLog.g:1669:53: (iv_ruleASTEventKind= ruleASTEventKind EOF )
            // InternalMoniLog.g:1670:2: iv_ruleASTEventKind= ruleASTEventKind EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASTEventKindRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleASTEventKind=ruleASTEventKind();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASTEventKind; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1676:1: ruleASTEventKind returns [EObject current=null] : ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) ) ;
    public final EObject ruleASTEventKind() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoniLog.g:1682:2: ( ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) ) )
            // InternalMoniLog.g:1683:2: ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) )
            {
            // InternalMoniLog.g:1683:2: ( ( () otherlv_1= 'before' ) | ( () otherlv_3= 'after' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==33) ) {
                alt35=1;
            }
            else if ( (LA35_0==34) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoniLog.g:1684:3: ( () otherlv_1= 'before' )
                    {
                    // InternalMoniLog.g:1684:3: ( () otherlv_1= 'before' )
                    // InternalMoniLog.g:1685:4: () otherlv_1= 'before'
                    {
                    // InternalMoniLog.g:1685:4: ()
                    // InternalMoniLog.g:1686:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getASTEventKindAccess().getBeforeASTEventAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getASTEventKindAccess().getBeforeKeyword_0_1());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:1701:3: ( () otherlv_3= 'after' )
                    {
                    // InternalMoniLog.g:1701:3: ( () otherlv_3= 'after' )
                    // InternalMoniLog.g:1702:4: () otherlv_3= 'after'
                    {
                    // InternalMoniLog.g:1702:4: ()
                    // InternalMoniLog.g:1703:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getASTEventKindAccess().getAfterASTEventAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getASTEventKindAccess().getAfterKeyword_1_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleASTEventKind"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog.g:1721:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // InternalMoniLog.g:1721:50: (iv_ruleCondition= ruleCondition EOF )
            // InternalMoniLog.g:1722:2: iv_ruleCondition= ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleCondition=ruleCondition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCondition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1728:1: ruleCondition returns [EObject current=null] : ( (lv_expression_0_0= ruleLanguageValue ) ) ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:1734:2: ( ( (lv_expression_0_0= ruleLanguageValue ) ) )
            // InternalMoniLog.g:1735:2: ( (lv_expression_0_0= ruleLanguageValue ) )
            {
            // InternalMoniLog.g:1735:2: ( (lv_expression_0_0= ruleLanguageValue ) )
            // InternalMoniLog.g:1736:3: (lv_expression_0_0= ruleLanguageValue )
            {
            // InternalMoniLog.g:1736:3: (lv_expression_0_0= ruleLanguageValue )
            // InternalMoniLog.g:1737:4: lv_expression_0_0= ruleLanguageValue
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getConditionAccess().getExpressionLanguageValueParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_expression_0_0=ruleLanguageValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getConditionRule());
              				}
              				set(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.gemoc.monilog.MoniLog.LanguageValue");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalMoniLog.g:1757:1: entryRuleTemporalPattern returns [EObject current=null] : iv_ruleTemporalPattern= ruleTemporalPattern EOF ;
    public final EObject entryRuleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTemporalPattern = null;


        try {
            // InternalMoniLog.g:1757:56: (iv_ruleTemporalPattern= ruleTemporalPattern EOF )
            // InternalMoniLog.g:1758:2: iv_ruleTemporalPattern= ruleTemporalPattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTemporalPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleTemporalPattern=ruleTemporalPattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTemporalPattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1764:1: ruleTemporalPattern returns [EObject current=null] : ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) ;
    public final EObject ruleTemporalPattern() throws RecognitionException {
        EObject current = null;

        EObject lv_pattern_0_0 = null;

        EObject lv_scope_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:1770:2: ( ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) ) )
            // InternalMoniLog.g:1771:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            {
            // InternalMoniLog.g:1771:2: ( ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) ) )
            // InternalMoniLog.g:1772:3: ( (lv_pattern_0_0= rulePattern ) ) ( (lv_scope_1_0= ruleScope ) )
            {
            // InternalMoniLog.g:1772:3: ( (lv_pattern_0_0= rulePattern ) )
            // InternalMoniLog.g:1773:4: (lv_pattern_0_0= rulePattern )
            {
            // InternalMoniLog.g:1773:4: (lv_pattern_0_0= rulePattern )
            // InternalMoniLog.g:1774:5: lv_pattern_0_0= rulePattern
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_29);
            lv_pattern_0_0=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoniLog.g:1791:3: ( (lv_scope_1_0= ruleScope ) )
            // InternalMoniLog.g:1792:4: (lv_scope_1_0= ruleScope )
            {
            // InternalMoniLog.g:1792:4: (lv_scope_1_0= ruleScope )
            // InternalMoniLog.g:1793:5: lv_scope_1_0= ruleScope
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_scope_1_0=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTemporalPattern"


    // $ANTLR start "entryRulePattern"
    // InternalMoniLog.g:1814:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalMoniLog.g:1814:48: (iv_rulePattern= rulePattern EOF )
            // InternalMoniLog.g:1815:2: iv_rulePattern= rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePattern; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:1821:1: rulePattern returns [EObject current=null] : ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog.g:1827:2: ( ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog.g:1828:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog.g:1828:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )
            int alt38=5;
            alt38 = dfa38.predict(input);
            switch (alt38) {
                case 1 :
                    // InternalMoniLog.g:1829:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1829:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1830:4: () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1830:4: ()
                    // InternalMoniLog.g:1831:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPatternAccess().getExistenceAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:1840:4: (otherlv_1= 'exists' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==35) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalMoniLog.g:1841:5: otherlv_1= 'exists'
                            {
                            otherlv_1=(Token)match(input,35,FOLLOW_30); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getExistsKeyword_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalMoniLog.g:1846:4: ( (lv_bound_2_0= ruleBoundType ) )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_INT||(LA37_0>=40 && LA37_0<=41)) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalMoniLog.g:1847:5: (lv_bound_2_0= ruleBoundType )
                            {
                            // InternalMoniLog.g:1847:5: (lv_bound_2_0= ruleBoundType )
                            // InternalMoniLog.g:1848:6: lv_bound_2_0= ruleBoundType
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_0_2_0());
                              					
                            }
                            pushFollow(FOLLOW_3);
                            lv_bound_2_0=ruleBoundType();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }

                    // InternalMoniLog.g:1865:4: ( (lv_event_3_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1866:5: (lv_event_3_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1866:5: (lv_event_3_0= ruleStreamEvent )
                    // InternalMoniLog.g:1867:6: lv_event_3_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_event_3_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:1886:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1886:3: ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1887:4: () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1887:4: ()
                    // InternalMoniLog.g:1888:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPatternAccess().getUniversalityAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,36,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getAlwaysKeyword_1_1());
                      			
                    }
                    // InternalMoniLog.g:1901:4: ( (lv_event_6_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1902:5: (lv_event_6_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1902:5: (lv_event_6_0= ruleStreamEvent )
                    // InternalMoniLog.g:1903:6: lv_event_6_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_event_6_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:1922:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1922:3: ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1923:4: () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1923:4: ()
                    // InternalMoniLog.g:1924:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPatternAccess().getAbsenceAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,37,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getNeverKeyword_2_1());
                      			
                    }
                    // InternalMoniLog.g:1937:4: ( (lv_event_9_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1938:5: (lv_event_9_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1938:5: (lv_event_9_0= ruleStreamEvent )
                    // InternalMoniLog.g:1939:6: lv_event_9_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_event_9_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:1958:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:1958:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:1959:4: () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:1959:4: ()
                    // InternalMoniLog.g:1960:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPatternAccess().getPrecedenceAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:1969:4: ( (lv_predecessor_11_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1970:5: (lv_predecessor_11_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1970:5: (lv_predecessor_11_0= ruleStreamEvent )
                    // InternalMoniLog.g:1971:6: lv_predecessor_11_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_31);
                    lv_predecessor_11_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_12=(Token)match(input,38,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getPatternAccess().getPrecedesKeyword_3_2());
                      			
                    }
                    // InternalMoniLog.g:1992:4: ( (lv_successor_13_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:1993:5: (lv_successor_13_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:1993:5: (lv_successor_13_0= ruleStreamEvent )
                    // InternalMoniLog.g:1994:6: lv_successor_13_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_successor_13_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:2013:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2013:3: ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2014:4: () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2014:4: ()
                    // InternalMoniLog.g:2015:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPatternAccess().getResponseAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:2024:4: ( (lv_event_15_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2025:5: (lv_event_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2025:5: (lv_event_15_0= ruleStreamEvent )
                    // InternalMoniLog.g:2026:6: lv_event_15_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_event_15_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_16=(Token)match(input,39,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getRespondsToKeyword_4_2());
                      			
                    }
                    // InternalMoniLog.g:2047:4: ( (lv_trigger_17_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2048:5: (lv_trigger_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2048:5: (lv_trigger_17_0= ruleStreamEvent )
                    // InternalMoniLog.g:2049:6: lv_trigger_17_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_trigger_17_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBoundType"
    // InternalMoniLog.g:2071:1: entryRuleBoundType returns [EObject current=null] : iv_ruleBoundType= ruleBoundType EOF ;
    public final EObject entryRuleBoundType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBoundType = null;


        try {
            // InternalMoniLog.g:2071:50: (iv_ruleBoundType= ruleBoundType EOF )
            // InternalMoniLog.g:2072:2: iv_ruleBoundType= ruleBoundType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBoundTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleBoundType=ruleBoundType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoundType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2078:1: ruleBoundType returns [EObject current=null] : (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) ;
    public final EObject ruleBoundType() throws RecognitionException {
        EObject current = null;

        EObject this_ExactBound_0 = null;

        EObject this_LowerBound_1 = null;

        EObject this_UpperBound_2 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:2084:2: ( (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound ) )
            // InternalMoniLog.g:2085:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            {
            // InternalMoniLog.g:2085:2: (this_ExactBound_0= ruleExactBound | this_LowerBound_1= ruleLowerBound | this_UpperBound_2= ruleUpperBound )
            int alt39=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt39=1;
                }
                break;
            case 40:
                {
                alt39=2;
                }
                break;
            case 41:
                {
                alt39=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalMoniLog.g:2086:3: this_ExactBound_0= ruleExactBound
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBoundTypeAccess().getExactBoundParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ExactBound_0=ruleExactBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ExactBound_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:2098:3: this_LowerBound_1= ruleLowerBound
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBoundTypeAccess().getLowerBoundParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LowerBound_1=ruleLowerBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LowerBound_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:2110:3: this_UpperBound_2= ruleUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getBoundTypeAccess().getUpperBoundParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_UpperBound_2=ruleUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_UpperBound_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleBoundType"


    // $ANTLR start "entryRuleExactBound"
    // InternalMoniLog.g:2125:1: entryRuleExactBound returns [EObject current=null] : iv_ruleExactBound= ruleExactBound EOF ;
    public final EObject entryRuleExactBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExactBound = null;


        try {
            // InternalMoniLog.g:2125:51: (iv_ruleExactBound= ruleExactBound EOF )
            // InternalMoniLog.g:2126:2: iv_ruleExactBound= ruleExactBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExactBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExactBound=ruleExactBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExactBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2132:1: ruleExactBound returns [EObject current=null] : ( (lv_n_0_0= RULE_INT ) ) ;
    public final EObject ruleExactBound() throws RecognitionException {
        EObject current = null;

        Token lv_n_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:2138:2: ( ( (lv_n_0_0= RULE_INT ) ) )
            // InternalMoniLog.g:2139:2: ( (lv_n_0_0= RULE_INT ) )
            {
            // InternalMoniLog.g:2139:2: ( (lv_n_0_0= RULE_INT ) )
            // InternalMoniLog.g:2140:3: (lv_n_0_0= RULE_INT )
            {
            // InternalMoniLog.g:2140:3: (lv_n_0_0= RULE_INT )
            // InternalMoniLog.g:2141:4: lv_n_0_0= RULE_INT
            {
            lv_n_0_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_n_0_0, grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExactBound"


    // $ANTLR start "entryRuleLowerBound"
    // InternalMoniLog.g:2160:1: entryRuleLowerBound returns [EObject current=null] : iv_ruleLowerBound= ruleLowerBound EOF ;
    public final EObject entryRuleLowerBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLowerBound = null;


        try {
            // InternalMoniLog.g:2160:51: (iv_ruleLowerBound= ruleLowerBound EOF )
            // InternalMoniLog.g:2161:2: iv_ruleLowerBound= ruleLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLowerBound=ruleLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLowerBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2167:1: ruleLowerBound returns [EObject current=null] : (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleLowerBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:2173:2: ( (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog.g:2174:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog.g:2174:2: (otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog.g:2175:3: otherlv_0= 'atleast' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,40,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getLowerBoundAccess().getAtleastKeyword_0());
              		
            }
            // InternalMoniLog.g:2179:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog.g:2180:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog.g:2180:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog.g:2181:5: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_n_1_0, grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLowerBound"


    // $ANTLR start "entryRuleUpperBound"
    // InternalMoniLog.g:2201:1: entryRuleUpperBound returns [EObject current=null] : iv_ruleUpperBound= ruleUpperBound EOF ;
    public final EObject entryRuleUpperBound() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpperBound = null;


        try {
            // InternalMoniLog.g:2201:51: (iv_ruleUpperBound= ruleUpperBound EOF )
            // InternalMoniLog.g:2202:2: iv_ruleUpperBound= ruleUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleUpperBound=ruleUpperBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUpperBound; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2208:1: ruleUpperBound returns [EObject current=null] : (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) ;
    public final EObject ruleUpperBound() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_n_1_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:2214:2: ( (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) ) )
            // InternalMoniLog.g:2215:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            {
            // InternalMoniLog.g:2215:2: (otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) ) )
            // InternalMoniLog.g:2216:3: otherlv_0= 'atmost' ( (lv_n_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getUpperBoundAccess().getAtmostKeyword_0());
              		
            }
            // InternalMoniLog.g:2220:3: ( (lv_n_1_0= RULE_INT ) )
            // InternalMoniLog.g:2221:4: (lv_n_1_0= RULE_INT )
            {
            // InternalMoniLog.g:2221:4: (lv_n_1_0= RULE_INT )
            // InternalMoniLog.g:2222:5: lv_n_1_0= RULE_INT
            {
            lv_n_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_n_1_0, grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleUpperBound"


    // $ANTLR start "entryRuleScope"
    // InternalMoniLog.g:2242:1: entryRuleScope returns [EObject current=null] : iv_ruleScope= ruleScope EOF ;
    public final EObject entryRuleScope() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScope = null;


        try {
            // InternalMoniLog.g:2242:46: (iv_ruleScope= ruleScope EOF )
            // InternalMoniLog.g:2243:2: iv_ruleScope= ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleScope=ruleScope();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScope; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2249:1: ruleScope returns [EObject current=null] : ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) ;
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
            // InternalMoniLog.g:2255:2: ( ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) ) )
            // InternalMoniLog.g:2256:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            {
            // InternalMoniLog.g:2256:2: ( ( () (otherlv_1= 'globally' )? ) | ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) | ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) ) | ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) ) | ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) ) )
            int alt41=5;
            switch ( input.LA(1) ) {
            case EOF:
            case 20:
            case 42:
                {
                alt41=1;
                }
                break;
            case 34:
                {
                int LA41_4 = input.LA(2);

                if ( (synpred50_InternalMoniLog()) ) {
                    alt41=2;
                }
                else if ( (true) ) {
                    alt41=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 41, 4, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                alt41=3;
                }
                break;
            case 43:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalMoniLog.g:2257:3: ( () (otherlv_1= 'globally' )? )
                    {
                    // InternalMoniLog.g:2257:3: ( () (otherlv_1= 'globally' )? )
                    // InternalMoniLog.g:2258:4: () (otherlv_1= 'globally' )?
                    {
                    // InternalMoniLog.g:2258:4: ()
                    // InternalMoniLog.g:2259:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getGloballyAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:2268:4: (otherlv_1= 'globally' )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==42) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalMoniLog.g:2269:5: otherlv_1= 'globally'
                            {
                            otherlv_1=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getScopeAccess().getGloballyKeyword_0_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:2276:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2276:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2277:4: () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2277:4: ()
                    // InternalMoniLog.g:2278:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getAfterAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getScopeAccess().getAfterKeyword_1_1());
                      			
                    }
                    // InternalMoniLog.g:2291:4: ( (lv_lowerBound_4_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2292:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2292:5: (lv_lowerBound_4_0= ruleStreamEvent )
                    // InternalMoniLog.g:2293:6: lv_lowerBound_4_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_lowerBound_4_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:2312:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2312:3: ( () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2313:4: () otherlv_6= 'before' ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2313:4: ()
                    // InternalMoniLog.g:2314:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getBeforeAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_6=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getScopeAccess().getBeforeKeyword_2_1());
                      			
                    }
                    // InternalMoniLog.g:2327:4: ( (lv_upperBound_7_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2328:5: (lv_upperBound_7_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2328:5: (lv_upperBound_7_0= ruleStreamEvent )
                    // InternalMoniLog.g:2329:6: lv_upperBound_7_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_upperBound_7_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:2348:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2348:3: ( () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2349:4: () otherlv_9= 'between' ( (lv_lowerBound_10_0= ruleStreamEvent ) ) otherlv_11= 'and' ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2349:4: ()
                    // InternalMoniLog.g:2350:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getBetweenAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,43,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getScopeAccess().getBetweenKeyword_3_1());
                      			
                    }
                    // InternalMoniLog.g:2363:4: ( (lv_lowerBound_10_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2364:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2364:5: (lv_lowerBound_10_0= ruleStreamEvent )
                    // InternalMoniLog.g:2365:6: lv_lowerBound_10_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_lowerBound_10_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_11=(Token)match(input,44,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getScopeAccess().getAndKeyword_3_3());
                      			
                    }
                    // InternalMoniLog.g:2386:4: ( (lv_upperBound_12_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2387:5: (lv_upperBound_12_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2387:5: (lv_upperBound_12_0= ruleStreamEvent )
                    // InternalMoniLog.g:2388:6: lv_upperBound_12_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_upperBound_12_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:2407:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    {
                    // InternalMoniLog.g:2407:3: ( () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) ) )
                    // InternalMoniLog.g:2408:4: () otherlv_14= 'after' ( (lv_lowerBound_15_0= ruleStreamEvent ) ) otherlv_16= 'until' ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    {
                    // InternalMoniLog.g:2408:4: ()
                    // InternalMoniLog.g:2409:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getScopeAccess().getAfterUntilAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_14=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getScopeAccess().getAfterKeyword_4_1());
                      			
                    }
                    // InternalMoniLog.g:2422:4: ( (lv_lowerBound_15_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2423:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2423:5: (lv_lowerBound_15_0= ruleStreamEvent )
                    // InternalMoniLog.g:2424:6: lv_lowerBound_15_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_35);
                    lv_lowerBound_15_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    otherlv_16=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getScopeAccess().getUntilKeyword_4_3());
                      			
                    }
                    // InternalMoniLog.g:2445:4: ( (lv_upperBound_17_0= ruleStreamEvent ) )
                    // InternalMoniLog.g:2446:5: (lv_upperBound_17_0= ruleStreamEvent )
                    {
                    // InternalMoniLog.g:2446:5: (lv_upperBound_17_0= ruleStreamEvent )
                    // InternalMoniLog.g:2447:6: lv_upperBound_17_0= ruleStreamEvent
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_upperBound_17_0=ruleStreamEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleAction"
    // InternalMoniLog.g:2469:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMoniLog.g:2469:47: (iv_ruleAction= ruleAction EOF )
            // InternalMoniLog.g:2470:2: iv_ruleAction= ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAction; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2476:1: ruleAction returns [EObject current=null] : (this_LanguageValue_0= ruleLanguageValue | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniloggerCall_3= ruleMoniloggerCall ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LanguageValue_0 = null;

        EObject this_AppenderCall_1 = null;

        EObject this_EmitEvent_2 = null;

        EObject this_MoniloggerCall_3 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:2482:2: ( (this_LanguageValue_0= ruleLanguageValue | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniloggerCall_3= ruleMoniloggerCall ) )
            // InternalMoniLog.g:2483:2: (this_LanguageValue_0= ruleLanguageValue | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniloggerCall_3= ruleMoniloggerCall )
            {
            // InternalMoniLog.g:2483:2: (this_LanguageValue_0= ruleLanguageValue | this_AppenderCall_1= ruleAppenderCall | this_EmitEvent_2= ruleEmitEvent | this_MoniloggerCall_3= ruleMoniloggerCall )
            int alt42=4;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_ID) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==46) ) {
                    switch ( input.LA(3) ) {
                    case 47:
                        {
                        alt42=3;
                        }
                        break;
                    case RULE_ID:
                    case 30:
                        {
                        alt42=2;
                        }
                        break;
                    case 48:
                    case 49:
                        {
                        alt42=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 42, 2, input);

                        throw nvae;
                    }

                }
                else if ( (LA42_1==16) ) {
                    alt42=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoniLog.g:2484:3: this_LanguageValue_0= ruleLanguageValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getLanguageValueParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LanguageValue_0=ruleLanguageValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageValue_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:2496:3: this_AppenderCall_1= ruleAppenderCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getAppenderCallParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_AppenderCall_1=ruleAppenderCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AppenderCall_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:2508:3: this_EmitEvent_2= ruleEmitEvent
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getEmitEventParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EmitEvent_2=ruleEmitEvent();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EmitEvent_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:2520:3: this_MoniloggerCall_3= ruleMoniloggerCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActionAccess().getMoniloggerCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MoniloggerCall_3=ruleMoniloggerCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MoniloggerCall_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAppenderCall"
    // InternalMoniLog.g:2535:1: entryRuleAppenderCall returns [EObject current=null] : iv_ruleAppenderCall= ruleAppenderCall EOF ;
    public final EObject entryRuleAppenderCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAppenderCall = null;


        try {
            // InternalMoniLog.g:2535:53: (iv_ruleAppenderCall= ruleAppenderCall EOF )
            // InternalMoniLog.g:2536:2: iv_ruleAppenderCall= ruleAppenderCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAppenderCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAppenderCall=ruleAppenderCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAppenderCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2542:1: ruleAppenderCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog.g:2548:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:2549:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:2549:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:2550:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:2550:3: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:2551:4: ( ruleQualifiedName )
            {
            // InternalMoniLog.g:2551:4: ( ruleQualifiedName )
            // InternalMoniLog.g:2552:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getAppenderCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAppenderCallAccess().getAppenderAppenderCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getAppenderCallAccess().getFullStopKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getAppenderCallAccess().getCallKeyword_2());
              		
            }
            // InternalMoniLog.g:2577:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==16) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoniLog.g:2578:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoniLog.g:2582:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog.g:2583:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog.g:2583:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog.g:2584:6: lv_args_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAppenderCallAccess().getArgsExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAppenderCallRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_4_0,
                      							"org.gemoc.monilog.MoniLog.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMoniLog.g:2601:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==22) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalMoniLog.g:2602:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:2606:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog.g:2607:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog.g:2607:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog.g:2608:7: lv_args_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAppenderCallAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAppenderCallRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop43;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getAppenderCallAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAppenderCall"


    // $ANTLR start "entryRuleLayoutCall"
    // InternalMoniLog.g:2635:1: entryRuleLayoutCall returns [EObject current=null] : iv_ruleLayoutCall= ruleLayoutCall EOF ;
    public final EObject entryRuleLayoutCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLayoutCall = null;


        try {
            // InternalMoniLog.g:2635:51: (iv_ruleLayoutCall= ruleLayoutCall EOF )
            // InternalMoniLog.g:2636:2: iv_ruleLayoutCall= ruleLayoutCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLayoutCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLayoutCall=ruleLayoutCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLayoutCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2642:1: ruleLayoutCall returns [EObject current=null] : ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog.g:2648:2: ( ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:2649:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:2649:2: ( ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:2650:3: ( ( ruleQualifiedName ) ) otherlv_1= '.' otherlv_2= 'call' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:2650:3: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:2651:4: ( ruleQualifiedName )
            {
            // InternalMoniLog.g:2651:4: ( ruleQualifiedName )
            // InternalMoniLog.g:2652:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLayoutCallRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLayoutCallAccess().getLayoutLayoutCrossReference_0_0());
              				
            }
            pushFollow(FOLLOW_36);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLayoutCallAccess().getFullStopKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,30,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getLayoutCallAccess().getCallKeyword_2());
              		
            }
            // InternalMoniLog.g:2677:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==16) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoniLog.g:2678:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoniLog.g:2682:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog.g:2683:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog.g:2683:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog.g:2684:6: lv_args_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLayoutCallRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_4_0,
                      							"org.gemoc.monilog.MoniLog.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMoniLog.g:2701:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( (LA45_0==22) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMoniLog.g:2702:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:2706:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog.g:2707:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog.g:2707:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog.g:2708:7: lv_args_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLayoutCallRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop45;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLayoutCallAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLayoutCall"


    // $ANTLR start "entryRuleEmitEvent"
    // InternalMoniLog.g:2735:1: entryRuleEmitEvent returns [EObject current=null] : iv_ruleEmitEvent= ruleEmitEvent EOF ;
    public final EObject entryRuleEmitEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmitEvent = null;


        try {
            // InternalMoniLog.g:2735:50: (iv_ruleEmitEvent= ruleEmitEvent EOF )
            // InternalMoniLog.g:2736:2: iv_ruleEmitEvent= ruleEmitEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmitEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmitEvent=ruleEmitEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmitEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2742:1: ruleEmitEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
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
            // InternalMoniLog.g:2748:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:2749:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:2749:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:2750:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' otherlv_2= 'emit' (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:2750:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:2751:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:2751:4: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:2752:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEmitEventRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getEmitEventAccess().getEventUserEventCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEmitEventAccess().getFullStopKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,47,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEmitEventAccess().getEmitKeyword_2());
              		
            }
            // InternalMoniLog.g:2774:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==16) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoniLog.g:2775:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoniLog.g:2779:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog.g:2780:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog.g:2780:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog.g:2781:6: lv_args_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:2798:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop47:
                    do {
                        int alt47=2;
                        int LA47_0 = input.LA(1);

                        if ( (LA47_0==22) ) {
                            alt47=1;
                        }


                        switch (alt47) {
                    	case 1 :
                    	    // InternalMoniLog.g:2799:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:2803:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog.g:2804:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog.g:2804:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog.g:2805:7: lv_args_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop47;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getEmitEventAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEmitEvent"


    // $ANTLR start "entryRuleMoniloggerCall"
    // InternalMoniLog.g:2832:1: entryRuleMoniloggerCall returns [EObject current=null] : iv_ruleMoniloggerCall= ruleMoniloggerCall EOF ;
    public final EObject entryRuleMoniloggerCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniloggerCall = null;


        try {
            // InternalMoniLog.g:2832:55: (iv_ruleMoniloggerCall= ruleMoniloggerCall EOF )
            // InternalMoniLog.g:2833:2: iv_ruleMoniloggerCall= ruleMoniloggerCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoniloggerCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMoniloggerCall=ruleMoniloggerCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMoniloggerCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2839:1: ruleMoniloggerCall returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) ;
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
            // InternalMoniLog.g:2845:2: ( ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) ) )
            // InternalMoniLog.g:2846:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            {
            // InternalMoniLog.g:2846:2: ( ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? ) | ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ID) ) {
                int LA51_1 = input.LA(2);

                if ( (LA51_1==46) ) {
                    int LA51_2 = input.LA(3);

                    if ( (LA51_2==48) ) {
                        alt51=1;
                    }
                    else if ( (LA51_2==49) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoniLog.g:2847:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    {
                    // InternalMoniLog.g:2847:3: ( () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )? )
                    // InternalMoniLog.g:2848:4: () ( (otherlv_1= RULE_ID ) ) otherlv_2= '.' otherlv_3= 'start' (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    {
                    // InternalMoniLog.g:2848:4: ()
                    // InternalMoniLog.g:2849:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMoniloggerCallAccess().getStartMoniLoggerAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:2858:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoniLog.g:2859:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoniLog.g:2859:5: (otherlv_1= RULE_ID )
                    // InternalMoniLog.g:2860:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMoniloggerCallRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0());
                      					
                    }

                    }


                    }

                    otherlv_2=(Token)match(input,46,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_0_2());
                      			
                    }
                    otherlv_3=(Token)match(input,48,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMoniloggerCallAccess().getStartKeyword_0_3());
                      			
                    }
                    // InternalMoniLog.g:2882:4: (otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')' )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==16) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // InternalMoniLog.g:2883:5: otherlv_4= '(' ( (lv_args_5_0= ruleExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )* otherlv_8= ')'
                            {
                            otherlv_4=(Token)match(input,16,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_4, grammarAccess.getMoniloggerCallAccess().getLeftParenthesisKeyword_0_4_0());
                              				
                            }
                            // InternalMoniLog.g:2887:5: ( (lv_args_5_0= ruleExpression ) )
                            // InternalMoniLog.g:2888:6: (lv_args_5_0= ruleExpression )
                            {
                            // InternalMoniLog.g:2888:6: (lv_args_5_0= ruleExpression )
                            // InternalMoniLog.g:2889:7: lv_args_5_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0());
                              						
                            }
                            pushFollow(FOLLOW_39);
                            lv_args_5_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }

                            // InternalMoniLog.g:2906:5: (otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) ) )*
                            loop49:
                            do {
                                int alt49=2;
                                int LA49_0 = input.LA(1);

                                if ( (LA49_0==22) ) {
                                    alt49=1;
                                }


                                switch (alt49) {
                            	case 1 :
                            	    // InternalMoniLog.g:2907:6: otherlv_6= ',' ( (lv_args_7_0= ruleExpression ) )
                            	    {
                            	    otherlv_6=(Token)match(input,22,FOLLOW_38); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getMoniloggerCallAccess().getCommaKeyword_0_4_2_0());
                            	      					
                            	    }
                            	    // InternalMoniLog.g:2911:6: ( (lv_args_7_0= ruleExpression ) )
                            	    // InternalMoniLog.g:2912:7: (lv_args_7_0= ruleExpression )
                            	    {
                            	    // InternalMoniLog.g:2912:7: (lv_args_7_0= ruleExpression )
                            	    // InternalMoniLog.g:2913:8: lv_args_7_0= ruleExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_39);
                            	    lv_args_7_0=ruleExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

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


                            	    }
                            	    break;

                            	default :
                            	    break loop49;
                                }
                            } while (true);

                            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_8, grammarAccess.getMoniloggerCallAccess().getRightParenthesisKeyword_0_4_3());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:2938:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    {
                    // InternalMoniLog.g:2938:3: ( () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop' )
                    // InternalMoniLog.g:2939:4: () ( (otherlv_10= RULE_ID ) ) otherlv_11= '.' otherlv_12= 'stop'
                    {
                    // InternalMoniLog.g:2939:4: ()
                    // InternalMoniLog.g:2940:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getMoniloggerCallAccess().getStopMoniLoggerAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:2949:4: ( (otherlv_10= RULE_ID ) )
                    // InternalMoniLog.g:2950:5: (otherlv_10= RULE_ID )
                    {
                    // InternalMoniLog.g:2950:5: (otherlv_10= RULE_ID )
                    // InternalMoniLog.g:2951:6: otherlv_10= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						/* */
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMoniloggerCallRule());
                      						}
                      					
                    }
                    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_10, grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0());
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,46,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_1_2());
                      			
                    }
                    otherlv_12=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMoniloggerCallAccess().getStopKeyword_1_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMoniloggerCall"


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog.g:2978:1: entryRuleStreamEvent returns [EObject current=null] : iv_ruleStreamEvent= ruleStreamEvent EOF ;
    public final EObject entryRuleStreamEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStreamEvent = null;


        try {
            // InternalMoniLog.g:2978:52: (iv_ruleStreamEvent= ruleStreamEvent EOF )
            // InternalMoniLog.g:2979:2: iv_ruleStreamEvent= ruleStreamEvent EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStreamEventRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleStreamEvent=ruleStreamEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStreamEvent; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:2985:1: ruleStreamEvent returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? ) ;
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
            // InternalMoniLog.g:2991:2: ( ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? ) )
            // InternalMoniLog.g:2992:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? )
            {
            // InternalMoniLog.g:2992:2: ( ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )? )
            // InternalMoniLog.g:2993:3: ( (otherlv_0= RULE_ID ) ) (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )?
            {
            // InternalMoniLog.g:2993:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:2994:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:2994:4: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:2995:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStreamEventRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0());
              				
            }

            }


            }

            // InternalMoniLog.g:3009:3: (otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==16) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoniLog.g:3010:4: otherlv_1= '(' ( (lv_values_2_0= ruleEmptyOrPropertyValue ) ) (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )* otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,16,FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getStreamEventAccess().getLeftParenthesisKeyword_1_0());
                      			
                    }
                    // InternalMoniLog.g:3014:4: ( (lv_values_2_0= ruleEmptyOrPropertyValue ) )
                    // InternalMoniLog.g:3015:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    {
                    // InternalMoniLog.g:3015:5: (lv_values_2_0= ruleEmptyOrPropertyValue )
                    // InternalMoniLog.g:3016:6: lv_values_2_0= ruleEmptyOrPropertyValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_values_2_0=ruleEmptyOrPropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:3033:4: (otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) ) )*
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( (LA52_0==22) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalMoniLog.g:3034:5: otherlv_3= ',' ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    {
                    	    otherlv_3=(Token)match(input,22,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:3038:5: ( (lv_values_4_0= ruleEmptyOrPropertyValue ) )
                    	    // InternalMoniLog.g:3039:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    {
                    	    // InternalMoniLog.g:3039:6: (lv_values_4_0= ruleEmptyOrPropertyValue )
                    	    // InternalMoniLog.g:3040:7: lv_values_4_0= ruleEmptyOrPropertyValue
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_values_4_0=ruleEmptyOrPropertyValue();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop52;
                        }
                    } while (true);

                    otherlv_5=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getStreamEventAccess().getRightParenthesisKeyword_1_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleStreamEvent"


    // $ANTLR start "entryRuleEmptyOrPropertyValue"
    // InternalMoniLog.g:3067:1: entryRuleEmptyOrPropertyValue returns [EObject current=null] : iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF ;
    public final EObject entryRuleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEmptyOrPropertyValue = null;


        try {
            // InternalMoniLog.g:3067:61: (iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog.g:3068:2: iv_ruleEmptyOrPropertyValue= ruleEmptyOrPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEmptyOrPropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEmptyOrPropertyValue=ruleEmptyOrPropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEmptyOrPropertyValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:3074:1: ruleEmptyOrPropertyValue returns [EObject current=null] : ( () | this_PropertyValue_1= rulePropertyValue ) ;
    public final EObject ruleEmptyOrPropertyValue() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyValue_1 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3080:2: ( ( () | this_PropertyValue_1= rulePropertyValue ) )
            // InternalMoniLog.g:3081:2: ( () | this_PropertyValue_1= rulePropertyValue )
            {
            // InternalMoniLog.g:3081:2: ( () | this_PropertyValue_1= rulePropertyValue )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==EOF||LA54_0==17||LA54_0==22) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ID) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoniLog.g:3082:3: ()
                    {
                    // InternalMoniLog.g:3082:3: ()
                    // InternalMoniLog.g:3083:4: 
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				current = forceCreateModelElement(
                      					grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0(),
                      					current);
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3093:3: this_PropertyValue_1= rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_PropertyValue_1=rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PropertyValue_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEmptyOrPropertyValue"


    // $ANTLR start "entryRulePropertyValue"
    // InternalMoniLog.g:3108:1: entryRulePropertyValue returns [EObject current=null] : iv_rulePropertyValue= rulePropertyValue EOF ;
    public final EObject entryRulePropertyValue() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyValue = null;


        try {
            // InternalMoniLog.g:3108:54: (iv_rulePropertyValue= rulePropertyValue EOF )
            // InternalMoniLog.g:3109:2: iv_rulePropertyValue= rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePropertyValue=rulePropertyValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:3115:1: rulePropertyValue returns [EObject current=null] : ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageValue ) ) ) ;
    public final EObject rulePropertyValue() throws RecognitionException {
        EObject current = null;

        Token lv_id_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3121:2: ( ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageValue ) ) ) )
            // InternalMoniLog.g:3122:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageValue ) ) )
            {
            // InternalMoniLog.g:3122:2: ( ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? ) | ( (lv_value_3_0= ruleLanguageValue ) ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                int LA56_1 = input.LA(2);

                if ( (LA56_1==EOF||LA56_1==17||LA56_1==22||LA56_1==50) ) {
                    alt56=1;
                }
                else if ( (LA56_1==16) ) {
                    alt56=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 56, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalMoniLog.g:3123:3: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
                    {
                    // InternalMoniLog.g:3123:3: ( ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )? )
                    // InternalMoniLog.g:3124:4: ( (lv_id_0_0= RULE_ID ) ) (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
                    {
                    // InternalMoniLog.g:3124:4: ( (lv_id_0_0= RULE_ID ) )
                    // InternalMoniLog.g:3125:5: (lv_id_0_0= RULE_ID )
                    {
                    // InternalMoniLog.g:3125:5: (lv_id_0_0= RULE_ID )
                    // InternalMoniLog.g:3126:6: lv_id_0_0= RULE_ID
                    {
                    lv_id_0_0=(Token)match(input,RULE_ID,FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_id_0_0, grammarAccess.getPropertyValueAccess().getIdIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }

                    // InternalMoniLog.g:3142:4: (otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) ) )?
                    int alt55=2;
                    int LA55_0 = input.LA(1);

                    if ( (LA55_0==50) ) {
                        alt55=1;
                    }
                    switch (alt55) {
                        case 1 :
                            // InternalMoniLog.g:3143:5: otherlv_1= '=' ( (lv_value_2_0= ruleExpression ) )
                            {
                            otherlv_1=(Token)match(input,50,FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_0_1_0());
                              				
                            }
                            // InternalMoniLog.g:3147:5: ( (lv_value_2_0= ruleExpression ) )
                            // InternalMoniLog.g:3148:6: (lv_value_2_0= ruleExpression )
                            {
                            // InternalMoniLog.g:3148:6: (lv_value_2_0= ruleExpression )
                            // InternalMoniLog.g:3149:7: lv_value_2_0= ruleExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getPropertyValueAccess().getValueExpressionParserRuleCall_0_1_1_0());
                              						
                            }
                            pushFollow(FOLLOW_2);
                            lv_value_2_0=ruleExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

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


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3169:3: ( (lv_value_3_0= ruleLanguageValue ) )
                    {
                    // InternalMoniLog.g:3169:3: ( (lv_value_3_0= ruleLanguageValue ) )
                    // InternalMoniLog.g:3170:4: (lv_value_3_0= ruleLanguageValue )
                    {
                    // InternalMoniLog.g:3170:4: (lv_value_3_0= ruleLanguageValue )
                    // InternalMoniLog.g:3171:5: lv_value_3_0= ruleLanguageValue
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getPropertyValueAccess().getValueLanguageValueParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleLanguageValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getPropertyValueRule());
                      					}
                      					set(
                      						current,
                      						"value",
                      						lv_value_3_0,
                      						"org.gemoc.monilog.MoniLog.LanguageValue");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleExpression"
    // InternalMoniLog.g:3192:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMoniLog.g:3192:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMoniLog.g:3193:2: iv_ruleExpression= ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:3199:1: ruleExpression returns [EObject current=null] : (this_ParameterReference_0= ruleParameterReference | this_MoniLogExpression_1= ruleMoniLogExpression | this_LanguageValue_2= ruleLanguageValue | this_LayoutCall_3= ruleLayoutCall ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ParameterReference_0 = null;

        EObject this_MoniLogExpression_1 = null;

        EObject this_LanguageValue_2 = null;

        EObject this_LayoutCall_3 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3205:2: ( (this_ParameterReference_0= ruleParameterReference | this_MoniLogExpression_1= ruleMoniLogExpression | this_LanguageValue_2= ruleLanguageValue | this_LayoutCall_3= ruleLayoutCall ) )
            // InternalMoniLog.g:3206:2: (this_ParameterReference_0= ruleParameterReference | this_MoniLogExpression_1= ruleMoniLogExpression | this_LanguageValue_2= ruleLanguageValue | this_LayoutCall_3= ruleLayoutCall )
            {
            // InternalMoniLog.g:3206:2: (this_ParameterReference_0= ruleParameterReference | this_MoniLogExpression_1= ruleMoniLogExpression | this_LanguageValue_2= ruleLanguageValue | this_LayoutCall_3= ruleLayoutCall )
            int alt57=4;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ID) ) {
                switch ( input.LA(2) ) {
                case EOF:
                case 17:
                case 22:
                    {
                    alt57=1;
                    }
                    break;
                case 46:
                    {
                    alt57=4;
                    }
                    break;
                case 16:
                    {
                    alt57=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 57, 1, input);

                    throw nvae;
                }

            }
            else if ( (LA57_0==18) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoniLog.g:3207:3: this_ParameterReference_0= ruleParameterReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getParameterReferenceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ParameterReference_0=ruleParameterReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParameterReference_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3219:3: this_MoniLogExpression_1= ruleMoniLogExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getMoniLogExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MoniLogExpression_1=ruleMoniLogExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MoniLogExpression_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:3231:3: this_LanguageValue_2= ruleLanguageValue
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getLanguageValueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LanguageValue_2=ruleLanguageValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageValue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:3243:3: this_LayoutCall_3= ruleLayoutCall
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getExpressionAccess().getLayoutCallParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_LayoutCall_3=ruleLayoutCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LayoutCall_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParameterReference"
    // InternalMoniLog.g:3258:1: entryRuleParameterReference returns [EObject current=null] : iv_ruleParameterReference= ruleParameterReference EOF ;
    public final EObject entryRuleParameterReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParameterReference = null;


        try {
            // InternalMoniLog.g:3258:59: (iv_ruleParameterReference= ruleParameterReference EOF )
            // InternalMoniLog.g:3259:2: iv_ruleParameterReference= ruleParameterReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParameterReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleParameterReference=ruleParameterReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParameterReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:3265:1: ruleParameterReference returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleParameterReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3271:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMoniLog.g:3272:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMoniLog.g:3272:2: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:3273:3: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:3273:3: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:3274:4: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getParameterReferenceRule());
              				}
              			
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_0, grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0());
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleMoniLogExpression"
    // InternalMoniLog.g:3291:1: entryRuleMoniLogExpression returns [EObject current=null] : iv_ruleMoniLogExpression= ruleMoniLogExpression EOF ;
    public final EObject entryRuleMoniLogExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMoniLogExpression = null;


        try {
            // InternalMoniLog.g:3291:58: (iv_ruleMoniLogExpression= ruleMoniLogExpression EOF )
            // InternalMoniLog.g:3292:2: iv_ruleMoniLogExpression= ruleMoniLogExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMoniLogExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMoniLogExpression=ruleMoniLogExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMoniLogExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMoniLogExpression"


    // $ANTLR start "ruleMoniLogExpression"
    // InternalMoniLog.g:3298:1: ruleMoniLogExpression returns [EObject current=null] : (otherlv_0= '{' ( (lv_expression_1_0= ruleSimpleExpression ) ) otherlv_2= '}' ) ;
    public final EObject ruleMoniLogExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3304:2: ( (otherlv_0= '{' ( (lv_expression_1_0= ruleSimpleExpression ) ) otherlv_2= '}' ) )
            // InternalMoniLog.g:3305:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleSimpleExpression ) ) otherlv_2= '}' )
            {
            // InternalMoniLog.g:3305:2: (otherlv_0= '{' ( (lv_expression_1_0= ruleSimpleExpression ) ) otherlv_2= '}' )
            // InternalMoniLog.g:3306:3: otherlv_0= '{' ( (lv_expression_1_0= ruleSimpleExpression ) ) otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMoniLogExpressionAccess().getLeftCurlyBracketKeyword_0());
              		
            }
            // InternalMoniLog.g:3310:3: ( (lv_expression_1_0= ruleSimpleExpression ) )
            // InternalMoniLog.g:3311:4: (lv_expression_1_0= ruleSimpleExpression )
            {
            // InternalMoniLog.g:3311:4: (lv_expression_1_0= ruleSimpleExpression )
            // InternalMoniLog.g:3312:5: lv_expression_1_0= ruleSimpleExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMoniLogExpressionAccess().getExpressionSimpleExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_14);
            lv_expression_1_0=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMoniLogExpressionRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.gemoc.monilog.MoniLog.SimpleExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMoniLogExpressionAccess().getRightCurlyBracketKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMoniLogExpression"


    // $ANTLR start "entryRuleLanguageValue"
    // InternalMoniLog.g:3337:1: entryRuleLanguageValue returns [EObject current=null] : iv_ruleLanguageValue= ruleLanguageValue EOF ;
    public final EObject entryRuleLanguageValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageValue = null;


        try {
            // InternalMoniLog.g:3337:54: (iv_ruleLanguageValue= ruleLanguageValue EOF )
            // InternalMoniLog.g:3338:2: iv_ruleLanguageValue= ruleLanguageValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLanguageValue=ruleLanguageValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLanguageValue"


    // $ANTLR start "ruleLanguageValue"
    // InternalMoniLog.g:3344:1: ruleLanguageValue returns [EObject current=null] : ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) ) ) otherlv_3= ')' ) ;
    public final EObject ruleLanguageValue() throws RecognitionException {
        EObject current = null;

        Token lv_languageId_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_value_2_1 = null;

        EObject lv_value_2_2 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3350:2: ( ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) ) ) otherlv_3= ')' ) )
            // InternalMoniLog.g:3351:2: ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) ) ) otherlv_3= ')' )
            {
            // InternalMoniLog.g:3351:2: ( ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) ) ) otherlv_3= ')' )
            // InternalMoniLog.g:3352:3: ( (lv_languageId_0_0= RULE_ID ) ) otherlv_1= '(' ( ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) ) ) otherlv_3= ')'
            {
            // InternalMoniLog.g:3352:3: ( (lv_languageId_0_0= RULE_ID ) )
            // InternalMoniLog.g:3353:4: (lv_languageId_0_0= RULE_ID )
            {
            // InternalMoniLog.g:3353:4: (lv_languageId_0_0= RULE_ID )
            // InternalMoniLog.g:3354:5: lv_languageId_0_0= RULE_ID
            {
            lv_languageId_0_0=(Token)match(input,RULE_ID,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_languageId_0_0, grammarAccess.getLanguageValueAccess().getLanguageIdIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLanguageValueRule());
              					}
              					setWithLastConsumed(
              						current,
              						"languageId",
              						lv_languageId_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLanguageValueAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMoniLog.g:3374:3: ( ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) ) )
            // InternalMoniLog.g:3375:4: ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) )
            {
            // InternalMoniLog.g:3375:4: ( (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall ) )
            // InternalMoniLog.g:3376:5: (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall )
            {
            // InternalMoniLog.g:3376:5: (lv_value_2_1= ruleLanguageExpression | lv_value_2_2= ruleLanguageCall )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_STRING) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ID) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoniLog.g:3377:6: lv_value_2_1= ruleLanguageExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageValueAccess().getValueLanguageExpressionParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_value_2_1=ruleLanguageExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLanguageValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_1,
                      							"org.gemoc.monilog.MoniLog.LanguageExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:3393:6: lv_value_2_2= ruleLanguageCall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageValueAccess().getValueLanguageCallParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_value_2_2=ruleLanguageCall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLanguageValueRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_2_2,
                      							"org.gemoc.monilog.MoniLog.LanguageCall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getLanguageValueAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLanguageValue"


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog.g:3419:1: entryRuleLanguageExpression returns [EObject current=null] : iv_ruleLanguageExpression= ruleLanguageExpression EOF ;
    public final EObject entryRuleLanguageExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageExpression = null;


        try {
            // InternalMoniLog.g:3419:59: (iv_ruleLanguageExpression= ruleLanguageExpression EOF )
            // InternalMoniLog.g:3420:2: iv_ruleLanguageExpression= ruleLanguageExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLanguageExpression=ruleLanguageExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:3426:1: ruleLanguageExpression returns [EObject current=null] : ( (lv_expression_0_0= RULE_STRING ) ) ;
    public final EObject ruleLanguageExpression() throws RecognitionException {
        EObject current = null;

        Token lv_expression_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:3432:2: ( ( (lv_expression_0_0= RULE_STRING ) ) )
            // InternalMoniLog.g:3433:2: ( (lv_expression_0_0= RULE_STRING ) )
            {
            // InternalMoniLog.g:3433:2: ( (lv_expression_0_0= RULE_STRING ) )
            // InternalMoniLog.g:3434:3: (lv_expression_0_0= RULE_STRING )
            {
            // InternalMoniLog.g:3434:3: (lv_expression_0_0= RULE_STRING )
            // InternalMoniLog.g:3435:4: lv_expression_0_0= RULE_STRING
            {
            lv_expression_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_expression_0_0, grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getLanguageExpressionRule());
              				}
              				setWithLastConsumed(
              					current,
              					"expression",
              					lv_expression_0_0,
              					"org.eclipse.xtext.common.Terminals.STRING");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLanguageExpression"


    // $ANTLR start "entryRuleLanguageCall"
    // InternalMoniLog.g:3454:1: entryRuleLanguageCall returns [EObject current=null] : iv_ruleLanguageCall= ruleLanguageCall EOF ;
    public final EObject entryRuleLanguageCall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageCall = null;


        try {
            // InternalMoniLog.g:3454:53: (iv_ruleLanguageCall= ruleLanguageCall EOF )
            // InternalMoniLog.g:3455:2: iv_ruleLanguageCall= ruleLanguageCall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageCallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleLanguageCall=ruleLanguageCall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageCall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleLanguageCall"


    // $ANTLR start "ruleLanguageCall"
    // InternalMoniLog.g:3461:1: ruleLanguageCall returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fqn_2_0= ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) ;
    public final EObject ruleLanguageCall() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_fqn_2_0 = null;

        EObject lv_args_4_0 = null;

        EObject lv_args_6_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3467:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fqn_2_0= ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? ) )
            // InternalMoniLog.g:3468:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fqn_2_0= ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            {
            // InternalMoniLog.g:3468:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fqn_2_0= ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )? )
            // InternalMoniLog.g:3469:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '.' ( (lv_fqn_2_0= ruleQualifiedName ) ) (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            {
            // InternalMoniLog.g:3469:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoniLog.g:3470:4: (otherlv_0= RULE_ID )
            {
            // InternalMoniLog.g:3470:4: (otherlv_0= RULE_ID )
            // InternalMoniLog.g:3471:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					/* */
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getLanguageCallRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getLanguageCallAccess().getFileFileAliasCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getLanguageCallAccess().getFullStopKeyword_1());
              		
            }
            // InternalMoniLog.g:3489:3: ( (lv_fqn_2_0= ruleQualifiedName ) )
            // InternalMoniLog.g:3490:4: (lv_fqn_2_0= ruleQualifiedName )
            {
            // InternalMoniLog.g:3490:4: (lv_fqn_2_0= ruleQualifiedName )
            // InternalMoniLog.g:3491:5: lv_fqn_2_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageCallAccess().getFqnQualifiedNameParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_fqn_2_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageCallRule());
              					}
              					set(
              						current,
              						"fqn",
              						lv_fqn_2_0,
              						"org.gemoc.monilog.MoniLog.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalMoniLog.g:3508:3: (otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')' )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==16) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoniLog.g:3509:4: otherlv_3= '(' ( (lv_args_4_0= ruleExpression ) ) (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )* otherlv_7= ')'
                    {
                    otherlv_3=(Token)match(input,16,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getLanguageCallAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoniLog.g:3513:4: ( (lv_args_4_0= ruleExpression ) )
                    // InternalMoniLog.g:3514:5: (lv_args_4_0= ruleExpression )
                    {
                    // InternalMoniLog.g:3514:5: (lv_args_4_0= ruleExpression )
                    // InternalMoniLog.g:3515:6: lv_args_4_0= ruleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageCallAccess().getArgsExpressionParserRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_39);
                    lv_args_4_0=ruleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLanguageCallRule());
                      						}
                      						add(
                      							current,
                      							"args",
                      							lv_args_4_0,
                      							"org.gemoc.monilog.MoniLog.Expression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMoniLog.g:3532:4: (otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==22) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // InternalMoniLog.g:3533:5: otherlv_5= ',' ( (lv_args_6_0= ruleExpression ) )
                    	    {
                    	    otherlv_5=(Token)match(input,22,FOLLOW_38); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getLanguageCallAccess().getCommaKeyword_3_2_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:3537:5: ( (lv_args_6_0= ruleExpression ) )
                    	    // InternalMoniLog.g:3538:6: (lv_args_6_0= ruleExpression )
                    	    {
                    	    // InternalMoniLog.g:3538:6: (lv_args_6_0= ruleExpression )
                    	    // InternalMoniLog.g:3539:7: lv_args_6_0= ruleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageCallAccess().getArgsExpressionParserRuleCall_3_2_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_39);
                    	    lv_args_6_0=ruleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLanguageCallRule());
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


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);

                    otherlv_7=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getLanguageCallAccess().getRightParenthesisKeyword_3_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLanguageCall"


    // $ANTLR start "entryRuleSimpleExpression"
    // InternalMoniLog.g:3566:1: entryRuleSimpleExpression returns [EObject current=null] : iv_ruleSimpleExpression= ruleSimpleExpression EOF ;
    public final EObject entryRuleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleExpression = null;


        try {
            // InternalMoniLog.g:3566:57: (iv_ruleSimpleExpression= ruleSimpleExpression EOF )
            // InternalMoniLog.g:3567:2: iv_ruleSimpleExpression= ruleSimpleExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleExpression=ruleSimpleExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleExpression"


    // $ANTLR start "ruleSimpleExpression"
    // InternalMoniLog.g:3573:1: ruleSimpleExpression returns [EObject current=null] : this_ContractedIf_0= ruleContractedIf ;
    public final EObject ruleSimpleExpression() throws RecognitionException {
        EObject current = null;

        EObject this_ContractedIf_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3579:2: (this_ContractedIf_0= ruleContractedIf )
            // InternalMoniLog.g:3580:2: this_ContractedIf_0= ruleContractedIf
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSimpleExpressionAccess().getContractedIfParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_ContractedIf_0=ruleContractedIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_ContractedIf_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleExpression"


    // $ANTLR start "entryRuleContractedIf"
    // InternalMoniLog.g:3594:1: entryRuleContractedIf returns [EObject current=null] : iv_ruleContractedIf= ruleContractedIf EOF ;
    public final EObject entryRuleContractedIf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractedIf = null;


        try {
            // InternalMoniLog.g:3594:53: (iv_ruleContractedIf= ruleContractedIf EOF )
            // InternalMoniLog.g:3595:2: iv_ruleContractedIf= ruleContractedIf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractedIfRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleContractedIf=ruleContractedIf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContractedIf; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContractedIf"


    // $ANTLR start "ruleContractedIf"
    // InternalMoniLog.g:3601:1: ruleContractedIf returns [EObject current=null] : (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* ) ;
    public final EObject ruleContractedIf() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Or_0 = null;

        EObject lv_then_3_0 = null;

        EObject lv_else_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3607:2: ( (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* ) )
            // InternalMoniLog.g:3608:2: (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* )
            {
            // InternalMoniLog.g:3608:2: (this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )* )
            // InternalMoniLog.g:3609:3: this_Or_0= ruleOr ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getContractedIfAccess().getOrParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_48);
            this_Or_0=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Or_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:3620:3: ( () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) ) )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==51) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMoniLog.g:3621:4: () otherlv_2= '?' ( (lv_then_3_0= ruleOr ) ) otherlv_4= ':' ( (lv_else_5_0= ruleOr ) )
            	    {
            	    // InternalMoniLog.g:3621:4: ()
            	    // InternalMoniLog.g:3622:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getContractedIfAccess().getContractedIfConditionAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,51,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getContractedIfAccess().getQuestionMarkKeyword_1_1());
            	      			
            	    }
            	    // InternalMoniLog.g:3635:4: ( (lv_then_3_0= ruleOr ) )
            	    // InternalMoniLog.g:3636:5: (lv_then_3_0= ruleOr )
            	    {
            	    // InternalMoniLog.g:3636:5: (lv_then_3_0= ruleOr )
            	    // InternalMoniLog.g:3637:6: lv_then_3_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContractedIfAccess().getThenOrParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_49);
            	    lv_then_3_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContractedIfRule());
            	      						}
            	      						set(
            	      							current,
            	      							"then",
            	      							lv_then_3_0,
            	      							"org.gemoc.monilog.MoniLog.Or");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    otherlv_4=(Token)match(input,52,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getContractedIfAccess().getColonKeyword_1_3());
            	      			
            	    }
            	    // InternalMoniLog.g:3658:4: ( (lv_else_5_0= ruleOr ) )
            	    // InternalMoniLog.g:3659:5: (lv_else_5_0= ruleOr )
            	    {
            	    // InternalMoniLog.g:3659:5: (lv_else_5_0= ruleOr )
            	    // InternalMoniLog.g:3660:6: lv_else_5_0= ruleOr
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getContractedIfAccess().getElseOrParserRuleCall_1_4_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_48);
            	    lv_else_5_0=ruleOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getContractedIfRule());
            	      						}
            	      						set(
            	      							current,
            	      							"else",
            	      							lv_else_5_0,
            	      							"org.gemoc.monilog.MoniLog.Or");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleContractedIf"


    // $ANTLR start "entryRuleOr"
    // InternalMoniLog.g:3682:1: entryRuleOr returns [EObject current=null] : iv_ruleOr= ruleOr EOF ;
    public final EObject entryRuleOr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOr = null;


        try {
            // InternalMoniLog.g:3682:43: (iv_ruleOr= ruleOr EOF )
            // InternalMoniLog.g:3683:2: iv_ruleOr= ruleOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOr=ruleOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOr; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOr"


    // $ANTLR start "ruleOr"
    // InternalMoniLog.g:3689:1: ruleOr returns [EObject current=null] : (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) ;
    public final EObject ruleOr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_And_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3695:2: ( (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* ) )
            // InternalMoniLog.g:3696:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            {
            // InternalMoniLog.g:3696:2: (this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )* )
            // InternalMoniLog.g:3697:3: this_And_0= ruleAnd ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAccess().getAndParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_50);
            this_And_0=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_And_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:3708:3: ( () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==53) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMoniLog.g:3709:4: () ( (lv_op_2_0= '||' ) ) ( (lv_right_3_0= ruleAnd ) )
            	    {
            	    // InternalMoniLog.g:3709:4: ()
            	    // InternalMoniLog.g:3710:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAccess().getOrLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMoniLog.g:3719:4: ( (lv_op_2_0= '||' ) )
            	    // InternalMoniLog.g:3720:5: (lv_op_2_0= '||' )
            	    {
            	    // InternalMoniLog.g:3720:5: (lv_op_2_0= '||' )
            	    // InternalMoniLog.g:3721:6: lv_op_2_0= '||'
            	    {
            	    lv_op_2_0=(Token)match(input,53,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getOrAccess().getOpVerticalLineVerticalLineKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getOrRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "||");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMoniLog.g:3733:4: ( (lv_right_3_0= ruleAnd ) )
            	    // InternalMoniLog.g:3734:5: (lv_right_3_0= ruleAnd )
            	    {
            	    // InternalMoniLog.g:3734:5: (lv_right_3_0= ruleAnd )
            	    // InternalMoniLog.g:3735:6: lv_right_3_0= ruleAnd
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_right_3_0=ruleAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.monilog.MoniLog.And");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleOr"


    // $ANTLR start "entryRuleAnd"
    // InternalMoniLog.g:3757:1: entryRuleAnd returns [EObject current=null] : iv_ruleAnd= ruleAnd EOF ;
    public final EObject entryRuleAnd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAnd = null;


        try {
            // InternalMoniLog.g:3757:44: (iv_ruleAnd= ruleAnd EOF )
            // InternalMoniLog.g:3758:2: iv_ruleAnd= ruleAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAnd=ruleAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAnd; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAnd"


    // $ANTLR start "ruleAnd"
    // InternalMoniLog.g:3764:1: ruleAnd returns [EObject current=null] : (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) ;
    public final EObject ruleAnd() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Equality_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3770:2: ( (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* ) )
            // InternalMoniLog.g:3771:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            {
            // InternalMoniLog.g:3771:2: (this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )* )
            // InternalMoniLog.g:3772:3: this_Equality_0= ruleEquality ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAccess().getEqualityParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_51);
            this_Equality_0=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Equality_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:3783:3: ( () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) ) )*
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==54) ) {
                    alt63=1;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMoniLog.g:3784:4: () ( (lv_op_2_0= '&&' ) ) ( (lv_right_3_0= ruleEquality ) )
            	    {
            	    // InternalMoniLog.g:3784:4: ()
            	    // InternalMoniLog.g:3785:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAccess().getAndLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMoniLog.g:3794:4: ( (lv_op_2_0= '&&' ) )
            	    // InternalMoniLog.g:3795:5: (lv_op_2_0= '&&' )
            	    {
            	    // InternalMoniLog.g:3795:5: (lv_op_2_0= '&&' )
            	    // InternalMoniLog.g:3796:6: lv_op_2_0= '&&'
            	    {
            	    lv_op_2_0=(Token)match(input,54,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getAndAccess().getOpAmpersandAmpersandKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getAndRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "&&");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMoniLog.g:3808:4: ( (lv_right_3_0= ruleEquality ) )
            	    // InternalMoniLog.g:3809:5: (lv_right_3_0= ruleEquality )
            	    {
            	    // InternalMoniLog.g:3809:5: (lv_right_3_0= ruleEquality )
            	    // InternalMoniLog.g:3810:6: lv_right_3_0= ruleEquality
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_right_3_0=ruleEquality();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.monilog.MoniLog.Equality");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop63;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAnd"


    // $ANTLR start "entryRuleEquality"
    // InternalMoniLog.g:3832:1: entryRuleEquality returns [EObject current=null] : iv_ruleEquality= ruleEquality EOF ;
    public final EObject entryRuleEquality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEquality = null;


        try {
            // InternalMoniLog.g:3832:49: (iv_ruleEquality= ruleEquality EOF )
            // InternalMoniLog.g:3833:2: iv_ruleEquality= ruleEquality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEqualityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEquality=ruleEquality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEquality; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEquality"


    // $ANTLR start "ruleEquality"
    // InternalMoniLog.g:3839:1: ruleEquality returns [EObject current=null] : (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) ;
    public final EObject ruleEquality() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_Comparison_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3845:2: ( (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* ) )
            // InternalMoniLog.g:3846:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            {
            // InternalMoniLog.g:3846:2: (this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )* )
            // InternalMoniLog.g:3847:3: this_Comparison_0= ruleComparison ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEqualityAccess().getComparisonParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_52);
            this_Comparison_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Comparison_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:3858:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( ((LA65_0>=55 && LA65_0<=56)) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalMoniLog.g:3859:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleComparison ) )
            	    {
            	    // InternalMoniLog.g:3859:4: ()
            	    // InternalMoniLog.g:3860:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMoniLog.g:3869:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalMoniLog.g:3870:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalMoniLog.g:3870:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalMoniLog.g:3871:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalMoniLog.g:3871:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt64=2;
            	    int LA64_0 = input.LA(1);

            	    if ( (LA64_0==55) ) {
            	        alt64=1;
            	    }
            	    else if ( (LA64_0==56) ) {
            	        alt64=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 64, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt64) {
            	        case 1 :
            	            // InternalMoniLog.g:3872:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,55,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getEqualityAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoniLog.g:3883:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,56,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getEqualityAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getEqualityRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMoniLog.g:3896:4: ( (lv_right_3_0= ruleComparison ) )
            	    // InternalMoniLog.g:3897:5: (lv_right_3_0= ruleComparison )
            	    {
            	    // InternalMoniLog.g:3897:5: (lv_right_3_0= ruleComparison )
            	    // InternalMoniLog.g:3898:6: lv_right_3_0= ruleComparison
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEqualityAccess().getRightComparisonParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_52);
            	    lv_right_3_0=ruleComparison();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEqualityRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.monilog.MoniLog.Comparison");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEquality"


    // $ANTLR start "entryRuleComparison"
    // InternalMoniLog.g:3920:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMoniLog.g:3920:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMoniLog.g:3921:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMoniLog.g:3927:1: ruleComparison returns [EObject current=null] : (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        Token lv_op_2_3=null;
        Token lv_op_2_4=null;
        EObject this_PlusOrMinus_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:3933:2: ( (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* ) )
            // InternalMoniLog.g:3934:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            {
            // InternalMoniLog.g:3934:2: (this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )* )
            // InternalMoniLog.g:3935:3: this_PlusOrMinus_0= rulePlusOrMinus ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getComparisonAccess().getPlusOrMinusParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_53);
            this_PlusOrMinus_0=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PlusOrMinus_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:3946:3: ( () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( ((LA67_0>=57 && LA67_0<=60)) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // InternalMoniLog.g:3947:4: () ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) ) ( (lv_right_3_0= rulePlusOrMinus ) )
            	    {
            	    // InternalMoniLog.g:3947:4: ()
            	    // InternalMoniLog.g:3948:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMoniLog.g:3957:4: ( ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) ) )
            	    // InternalMoniLog.g:3958:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    {
            	    // InternalMoniLog.g:3958:5: ( (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' ) )
            	    // InternalMoniLog.g:3959:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    {
            	    // InternalMoniLog.g:3959:6: (lv_op_2_1= '>=' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '<' )
            	    int alt66=4;
            	    switch ( input.LA(1) ) {
            	    case 57:
            	        {
            	        alt66=1;
            	        }
            	        break;
            	    case 58:
            	        {
            	        alt66=2;
            	        }
            	        break;
            	    case 59:
            	        {
            	        alt66=3;
            	        }
            	        break;
            	    case 60:
            	        {
            	        alt66=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 66, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt66) {
            	        case 1 :
            	            // InternalMoniLog.g:3960:7: lv_op_2_1= '>='
            	            {
            	            lv_op_2_1=(Token)match(input,57,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getComparisonAccess().getOpGreaterThanSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalMoniLog.g:3971:7: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,58,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getComparisonAccess().getOpLessThanSignEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // InternalMoniLog.g:3982:7: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,59,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_3, grammarAccess.getComparisonAccess().getOpGreaterThanSignKeyword_1_1_0_2());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_3, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // InternalMoniLog.g:3993:7: lv_op_2_4= '<'
            	            {
            	            lv_op_2_4=(Token)match(input,60,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_4, grammarAccess.getComparisonAccess().getOpLessThanSignKeyword_1_1_0_3());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getComparisonRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_4, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalMoniLog.g:4006:4: ( (lv_right_3_0= rulePlusOrMinus ) )
            	    // InternalMoniLog.g:4007:5: (lv_right_3_0= rulePlusOrMinus )
            	    {
            	    // InternalMoniLog.g:4007:5: (lv_right_3_0= rulePlusOrMinus )
            	    // InternalMoniLog.g:4008:6: lv_right_3_0= rulePlusOrMinus
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getComparisonAccess().getRightPlusOrMinusParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_right_3_0=rulePlusOrMinus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getComparisonRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.monilog.MoniLog.PlusOrMinus");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMoniLog.g:4030:1: entryRulePlusOrMinus returns [EObject current=null] : iv_rulePlusOrMinus= rulePlusOrMinus EOF ;
    public final EObject entryRulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlusOrMinus = null;


        try {
            // InternalMoniLog.g:4030:52: (iv_rulePlusOrMinus= rulePlusOrMinus EOF )
            // InternalMoniLog.g:4031:2: iv_rulePlusOrMinus= rulePlusOrMinus EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPlusOrMinusRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePlusOrMinus=rulePlusOrMinus();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePlusOrMinus; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMoniLog.g:4037:1: rulePlusOrMinus returns [EObject current=null] : (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) ;
    public final EObject rulePlusOrMinus() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_MulOrDiv_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4043:2: ( (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* ) )
            // InternalMoniLog.g:4044:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            {
            // InternalMoniLog.g:4044:2: (this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )* )
            // InternalMoniLog.g:4045:3: this_MulOrDiv_0= ruleMulOrDiv ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_54);
            this_MulOrDiv_0=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MulOrDiv_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:4056:3: ( ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) ) )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( ((LA69_0>=61 && LA69_0<=62)) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // InternalMoniLog.g:4057:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) ) ( (lv_right_5_0= ruleMulOrDiv ) )
            	    {
            	    // InternalMoniLog.g:4057:4: ( ( () ( (lv_op_2_0= '+' ) ) ) | ( () ( (lv_op_4_0= '-' ) ) ) )
            	    int alt68=2;
            	    int LA68_0 = input.LA(1);

            	    if ( (LA68_0==61) ) {
            	        alt68=1;
            	    }
            	    else if ( (LA68_0==62) ) {
            	        alt68=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 68, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt68) {
            	        case 1 :
            	            // InternalMoniLog.g:4058:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            {
            	            // InternalMoniLog.g:4058:5: ( () ( (lv_op_2_0= '+' ) ) )
            	            // InternalMoniLog.g:4059:6: () ( (lv_op_2_0= '+' ) )
            	            {
            	            // InternalMoniLog.g:4059:6: ()
            	            // InternalMoniLog.g:4060:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMoniLog.g:4069:6: ( (lv_op_2_0= '+' ) )
            	            // InternalMoniLog.g:4070:7: (lv_op_2_0= '+' )
            	            {
            	            // InternalMoniLog.g:4070:7: (lv_op_2_0= '+' )
            	            // InternalMoniLog.g:4071:8: lv_op_2_0= '+'
            	            {
            	            lv_op_2_0=(Token)match(input,61,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_0, grammarAccess.getPlusOrMinusAccess().getOpPlusSignKeyword_1_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_0, "+");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoniLog.g:4085:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            {
            	            // InternalMoniLog.g:4085:5: ( () ( (lv_op_4_0= '-' ) ) )
            	            // InternalMoniLog.g:4086:6: () ( (lv_op_4_0= '-' ) )
            	            {
            	            // InternalMoniLog.g:4086:6: ()
            	            // InternalMoniLog.g:4087:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMoniLog.g:4096:6: ( (lv_op_4_0= '-' ) )
            	            // InternalMoniLog.g:4097:7: (lv_op_4_0= '-' )
            	            {
            	            // InternalMoniLog.g:4097:7: (lv_op_4_0= '-' )
            	            // InternalMoniLog.g:4098:8: lv_op_4_0= '-'
            	            {
            	            lv_op_4_0=(Token)match(input,62,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_4_0, grammarAccess.getPlusOrMinusAccess().getOpHyphenMinusKeyword_1_0_1_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getPlusOrMinusRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_4_0, "-");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMoniLog.g:4112:4: ( (lv_right_5_0= ruleMulOrDiv ) )
            	    // InternalMoniLog.g:4113:5: (lv_right_5_0= ruleMulOrDiv )
            	    {
            	    // InternalMoniLog.g:4113:5: (lv_right_5_0= ruleMulOrDiv )
            	    // InternalMoniLog.g:4114:6: lv_right_5_0= ruleMulOrDiv
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_right_5_0=ruleMulOrDiv();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getPlusOrMinusRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.gemoc.monilog.MoniLog.MulOrDiv");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMoniLog.g:4136:1: entryRuleMulOrDiv returns [EObject current=null] : iv_ruleMulOrDiv= ruleMulOrDiv EOF ;
    public final EObject entryRuleMulOrDiv() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMulOrDiv = null;


        try {
            // InternalMoniLog.g:4136:49: (iv_ruleMulOrDiv= ruleMulOrDiv EOF )
            // InternalMoniLog.g:4137:2: iv_ruleMulOrDiv= ruleMulOrDiv EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMulOrDivRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMulOrDiv=ruleMulOrDiv();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMulOrDiv; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMoniLog.g:4143:1: ruleMulOrDiv returns [EObject current=null] : (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* ) ;
    public final EObject ruleMulOrDiv() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        Token lv_op_4_0=null;
        EObject this_Modulo_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4149:2: ( (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* ) )
            // InternalMoniLog.g:4150:2: (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* )
            {
            // InternalMoniLog.g:4150:2: (this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )* )
            // InternalMoniLog.g:4151:3: this_Modulo_0= ruleModulo ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getMulOrDivAccess().getModuloParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_55);
            this_Modulo_0=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Modulo_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:4162:3: ( ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( ((LA71_0>=63 && LA71_0<=64)) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalMoniLog.g:4163:4: ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) ) ( (lv_right_5_0= ruleModulo ) )
            	    {
            	    // InternalMoniLog.g:4163:4: ( ( () ( (lv_op_2_0= '*' ) ) ) | ( () ( (lv_op_4_0= '/' ) ) ) )
            	    int alt70=2;
            	    int LA70_0 = input.LA(1);

            	    if ( (LA70_0==63) ) {
            	        alt70=1;
            	    }
            	    else if ( (LA70_0==64) ) {
            	        alt70=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 70, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt70) {
            	        case 1 :
            	            // InternalMoniLog.g:4164:5: ( () ( (lv_op_2_0= '*' ) ) )
            	            {
            	            // InternalMoniLog.g:4164:5: ( () ( (lv_op_2_0= '*' ) ) )
            	            // InternalMoniLog.g:4165:6: () ( (lv_op_2_0= '*' ) )
            	            {
            	            // InternalMoniLog.g:4165:6: ()
            	            // InternalMoniLog.g:4166:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getMulLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMoniLog.g:4175:6: ( (lv_op_2_0= '*' ) )
            	            // InternalMoniLog.g:4176:7: (lv_op_2_0= '*' )
            	            {
            	            // InternalMoniLog.g:4176:7: (lv_op_2_0= '*' )
            	            // InternalMoniLog.g:4177:8: lv_op_2_0= '*'
            	            {
            	            lv_op_2_0=(Token)match(input,63,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_2_0, grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_0_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMulOrDivRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_2_0, "*");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoniLog.g:4191:5: ( () ( (lv_op_4_0= '/' ) ) )
            	            {
            	            // InternalMoniLog.g:4191:5: ( () ( (lv_op_4_0= '/' ) ) )
            	            // InternalMoniLog.g:4192:6: () ( (lv_op_4_0= '/' ) )
            	            {
            	            // InternalMoniLog.g:4192:6: ()
            	            // InternalMoniLog.g:4193:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							/* */
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getMulOrDivAccess().getDivLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            // InternalMoniLog.g:4202:6: ( (lv_op_4_0= '/' ) )
            	            // InternalMoniLog.g:4203:7: (lv_op_4_0= '/' )
            	            {
            	            // InternalMoniLog.g:4203:7: (lv_op_4_0= '/' )
            	            // InternalMoniLog.g:4204:8: lv_op_4_0= '/'
            	            {
            	            lv_op_4_0=(Token)match(input,64,FOLLOW_45); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              								newLeafNode(lv_op_4_0, grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_1_0());
            	              							
            	            }
            	            if ( state.backtracking==0 ) {

            	              								if (current==null) {
            	              									current = createModelElement(grammarAccess.getMulOrDivRule());
            	              								}
            	              								setWithLastConsumed(current, "op", lv_op_4_0, "/");
            	              							
            	            }

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMoniLog.g:4218:4: ( (lv_right_5_0= ruleModulo ) )
            	    // InternalMoniLog.g:4219:5: (lv_right_5_0= ruleModulo )
            	    {
            	    // InternalMoniLog.g:4219:5: (lv_right_5_0= ruleModulo )
            	    // InternalMoniLog.g:4220:6: lv_right_5_0= ruleModulo
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getMulOrDivAccess().getRightModuloParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_right_5_0=ruleModulo();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getMulOrDivRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"org.gemoc.monilog.MoniLog.Modulo");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRuleModulo"
    // InternalMoniLog.g:4242:1: entryRuleModulo returns [EObject current=null] : iv_ruleModulo= ruleModulo EOF ;
    public final EObject entryRuleModulo() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModulo = null;


        try {
            // InternalMoniLog.g:4242:47: (iv_ruleModulo= ruleModulo EOF )
            // InternalMoniLog.g:4243:2: iv_ruleModulo= ruleModulo EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuloRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleModulo=ruleModulo();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModulo; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleModulo"


    // $ANTLR start "ruleModulo"
    // InternalMoniLog.g:4249:1: ruleModulo returns [EObject current=null] : (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) ;
    public final EObject ruleModulo() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_Primary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4255:2: ( (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* ) )
            // InternalMoniLog.g:4256:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            {
            // InternalMoniLog.g:4256:2: (this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )* )
            // InternalMoniLog.g:4257:3: this_Primary_0= rulePrimary ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuloAccess().getPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_56);
            this_Primary_0=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Primary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:4268:3: ( () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==65) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalMoniLog.g:4269:4: () ( (lv_op_2_0= '%' ) ) ( (lv_right_3_0= rulePrimary ) )
            	    {
            	    // InternalMoniLog.g:4269:4: ()
            	    // InternalMoniLog.g:4270:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getModuloAccess().getModuloLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalMoniLog.g:4279:4: ( (lv_op_2_0= '%' ) )
            	    // InternalMoniLog.g:4280:5: (lv_op_2_0= '%' )
            	    {
            	    // InternalMoniLog.g:4280:5: (lv_op_2_0= '%' )
            	    // InternalMoniLog.g:4281:6: lv_op_2_0= '%'
            	    {
            	    lv_op_2_0=(Token)match(input,65,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(lv_op_2_0, grammarAccess.getModuloAccess().getOpPercentSignKeyword_1_1_0());
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getModuloRule());
            	      						}
            	      						setWithLastConsumed(current, "op", lv_op_2_0, "%");
            	      					
            	    }

            	    }


            	    }

            	    // InternalMoniLog.g:4293:4: ( (lv_right_3_0= rulePrimary ) )
            	    // InternalMoniLog.g:4294:5: (lv_right_3_0= rulePrimary )
            	    {
            	    // InternalMoniLog.g:4294:5: (lv_right_3_0= rulePrimary )
            	    // InternalMoniLog.g:4295:6: lv_right_3_0= rulePrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getModuloAccess().getRightPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_56);
            	    lv_right_3_0=rulePrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getModuloRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.gemoc.monilog.MoniLog.Primary");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleModulo"


    // $ANTLR start "entryRulePrimary"
    // InternalMoniLog.g:4317:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMoniLog.g:4317:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMoniLog.g:4318:2: iv_rulePrimary= rulePrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimary; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMoniLog.g:4324:1: rulePrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        EObject lv_expression_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject lv_expression_9_0 = null;

        EObject this_Atomic_10 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4330:2: ( ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic ) )
            // InternalMoniLog.g:4331:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic )
            {
            // InternalMoniLog.g:4331:2: ( ( () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) ) | ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) ) | this_Atomic_10= ruleAtomic )
            int alt73=4;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt73=1;
                }
                break;
            case 62:
                {
                alt73=2;
                }
                break;
            case 66:
                {
                alt73=3;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
            case RULE_INT:
            case RULE_REAL:
            case 25:
            case 67:
            case 68:
            case 69:
                {
                alt73=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalMoniLog.g:4332:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')' )
                    {
                    // InternalMoniLog.g:4332:3: ( () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')' )
                    // InternalMoniLog.g:4333:4: () otherlv_1= '(' ( (lv_expression_2_0= ruleSimpleExpression ) ) otherlv_3= ')'
                    {
                    // InternalMoniLog.g:4333:4: ()
                    // InternalMoniLog.g:4334:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getParenthesisAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,16,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalMoniLog.g:4347:4: ( (lv_expression_2_0= ruleSimpleExpression ) )
                    // InternalMoniLog.g:4348:5: (lv_expression_2_0= ruleSimpleExpression )
                    {
                    // InternalMoniLog.g:4348:5: (lv_expression_2_0= ruleSimpleExpression )
                    // InternalMoniLog.g:4349:6: lv_expression_2_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionSimpleExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_11);
                    lv_expression_2_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.gemoc.monilog.MoniLog.SimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:4372:3: ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) )
                    {
                    // InternalMoniLog.g:4372:3: ( () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) ) )
                    // InternalMoniLog.g:4373:4: () otherlv_5= '-' ( (lv_expression_6_0= rulePrimary ) )
                    {
                    // InternalMoniLog.g:4373:4: ()
                    // InternalMoniLog.g:4374:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getUnaryMinusAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,62,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getPrimaryAccess().getHyphenMinusKeyword_1_1());
                      			
                    }
                    // InternalMoniLog.g:4387:4: ( (lv_expression_6_0= rulePrimary ) )
                    // InternalMoniLog.g:4388:5: (lv_expression_6_0= rulePrimary )
                    {
                    // InternalMoniLog.g:4388:5: (lv_expression_6_0= rulePrimary )
                    // InternalMoniLog.g:4389:6: lv_expression_6_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"org.gemoc.monilog.MoniLog.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:4408:3: ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) )
                    {
                    // InternalMoniLog.g:4408:3: ( () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) ) )
                    // InternalMoniLog.g:4409:4: () otherlv_8= '!' ( (lv_expression_9_0= rulePrimary ) )
                    {
                    // InternalMoniLog.g:4409:4: ()
                    // InternalMoniLog.g:4410:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getPrimaryAccess().getNotAction_2_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_8=(Token)match(input,66,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getPrimaryAccess().getExclamationMarkKeyword_2_1());
                      			
                    }
                    // InternalMoniLog.g:4423:4: ( (lv_expression_9_0= rulePrimary ) )
                    // InternalMoniLog.g:4424:5: (lv_expression_9_0= rulePrimary )
                    {
                    // InternalMoniLog.g:4424:5: (lv_expression_9_0= rulePrimary )
                    // InternalMoniLog.g:4425:6: lv_expression_9_0= rulePrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_2_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_9_0=rulePrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_9_0,
                      							"org.gemoc.monilog.MoniLog.Primary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:4444:3: this_Atomic_10= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Atomic_10=ruleAtomic();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Atomic_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMoniLog.g:4459:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // InternalMoniLog.g:4459:47: (iv_ruleAtomic= ruleAtomic EOF )
            // InternalMoniLog.g:4460:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMoniLog.g:4466:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']' ) | this_Ref_15= ruleRef | this_ArraySize_16= ruleArraySize ) ;
    public final EObject ruleAtomic() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_0=null;
        Token otherlv_6=null;
        Token lv_value_8_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        EObject lv_values_11_0 = null;

        EObject lv_values_13_0 = null;

        EObject this_Ref_15 = null;

        EObject this_ArraySize_16 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4472:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']' ) | this_Ref_15= ruleRef | this_ArraySize_16= ruleArraySize ) )
            // InternalMoniLog.g:4473:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']' ) | this_Ref_15= ruleRef | this_ArraySize_16= ruleArraySize )
            {
            // InternalMoniLog.g:4473:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | ( () ( (lv_value_3_0= RULE_REAL ) ) ) | ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) ) | ( () ( (lv_value_8_0= RULE_STRING ) ) ) | ( () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']' ) | this_Ref_15= ruleRef | this_ArraySize_16= ruleArraySize )
            int alt76=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt76=1;
                }
                break;
            case RULE_REAL:
                {
                alt76=2;
                }
                break;
            case 67:
            case 68:
                {
                alt76=3;
                }
                break;
            case RULE_STRING:
                {
                alt76=4;
                }
                break;
            case 25:
                {
                alt76=5;
                }
                break;
            case RULE_ID:
                {
                alt76=6;
                }
                break;
            case 69:
                {
                alt76=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalMoniLog.g:4474:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMoniLog.g:4474:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMoniLog.g:4475:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMoniLog.g:4475:4: ()
                    // InternalMoniLog.g:4476:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:4485:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMoniLog.g:4486:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMoniLog.g:4486:5: (lv_value_1_0= RULE_INT )
                    // InternalMoniLog.g:4487:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:4505:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    {
                    // InternalMoniLog.g:4505:3: ( () ( (lv_value_3_0= RULE_REAL ) ) )
                    // InternalMoniLog.g:4506:4: () ( (lv_value_3_0= RULE_REAL ) )
                    {
                    // InternalMoniLog.g:4506:4: ()
                    // InternalMoniLog.g:4507:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getRealConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:4516:4: ( (lv_value_3_0= RULE_REAL ) )
                    // InternalMoniLog.g:4517:5: (lv_value_3_0= RULE_REAL )
                    {
                    // InternalMoniLog.g:4517:5: (lv_value_3_0= RULE_REAL )
                    // InternalMoniLog.g:4518:6: lv_value_3_0= RULE_REAL
                    {
                    lv_value_3_0=(Token)match(input,RULE_REAL,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getAtomicAccess().getValueREALTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.gemoc.monilog.MoniLog.REAL");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:4536:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    {
                    // InternalMoniLog.g:4536:3: ( () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' ) )
                    // InternalMoniLog.g:4537:4: () ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    {
                    // InternalMoniLog.g:4537:4: ()
                    // InternalMoniLog.g:4538:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:4547:4: ( ( (lv_value_5_0= 'true' ) ) | otherlv_6= 'false' )
                    int alt74=2;
                    int LA74_0 = input.LA(1);

                    if ( (LA74_0==67) ) {
                        alt74=1;
                    }
                    else if ( (LA74_0==68) ) {
                        alt74=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 0, input);

                        throw nvae;
                    }
                    switch (alt74) {
                        case 1 :
                            // InternalMoniLog.g:4548:5: ( (lv_value_5_0= 'true' ) )
                            {
                            // InternalMoniLog.g:4548:5: ( (lv_value_5_0= 'true' ) )
                            // InternalMoniLog.g:4549:6: (lv_value_5_0= 'true' )
                            {
                            // InternalMoniLog.g:4549:6: (lv_value_5_0= 'true' )
                            // InternalMoniLog.g:4550:7: lv_value_5_0= 'true'
                            {
                            lv_value_5_0=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_0, grammarAccess.getAtomicAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getAtomicRule());
                              							}
                              							setWithLastConsumed(current, "value", true, "true");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoniLog.g:4563:5: otherlv_6= 'false'
                            {
                            otherlv_6=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_6, grammarAccess.getAtomicAccess().getFalseKeyword_2_1_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:4570:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    {
                    // InternalMoniLog.g:4570:3: ( () ( (lv_value_8_0= RULE_STRING ) ) )
                    // InternalMoniLog.g:4571:4: () ( (lv_value_8_0= RULE_STRING ) )
                    {
                    // InternalMoniLog.g:4571:4: ()
                    // InternalMoniLog.g:4572:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getStringConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalMoniLog.g:4581:4: ( (lv_value_8_0= RULE_STRING ) )
                    // InternalMoniLog.g:4582:5: (lv_value_8_0= RULE_STRING )
                    {
                    // InternalMoniLog.g:4582:5: (lv_value_8_0= RULE_STRING )
                    // InternalMoniLog.g:4583:6: lv_value_8_0= RULE_STRING
                    {
                    lv_value_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_8_0, grammarAccess.getAtomicAccess().getValueSTRINGTerminalRuleCall_3_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAtomicRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_8_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:4601:3: ( () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']' )
                    {
                    // InternalMoniLog.g:4601:3: ( () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']' )
                    // InternalMoniLog.g:4602:4: () otherlv_10= '[' ( (lv_values_11_0= ruleSimpleExpression ) ) (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )* otherlv_14= ']'
                    {
                    // InternalMoniLog.g:4602:4: ()
                    // InternalMoniLog.g:4603:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getAtomicAccess().getVectorConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_10=(Token)match(input,25,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getAtomicAccess().getLeftSquareBracketKeyword_4_1());
                      			
                    }
                    // InternalMoniLog.g:4616:4: ( (lv_values_11_0= ruleSimpleExpression ) )
                    // InternalMoniLog.g:4617:5: (lv_values_11_0= ruleSimpleExpression )
                    {
                    // InternalMoniLog.g:4617:5: (lv_values_11_0= ruleSimpleExpression )
                    // InternalMoniLog.g:4618:6: lv_values_11_0= ruleSimpleExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAtomicAccess().getValuesSimpleExpressionParserRuleCall_4_2_0());
                      					
                    }
                    pushFollow(FOLLOW_57);
                    lv_values_11_0=ruleSimpleExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAtomicRule());
                      						}
                      						add(
                      							current,
                      							"values",
                      							lv_values_11_0,
                      							"org.gemoc.monilog.MoniLog.SimpleExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalMoniLog.g:4635:4: (otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) ) )*
                    loop75:
                    do {
                        int alt75=2;
                        int LA75_0 = input.LA(1);

                        if ( (LA75_0==22) ) {
                            alt75=1;
                        }


                        switch (alt75) {
                    	case 1 :
                    	    // InternalMoniLog.g:4636:5: otherlv_12= ',' ( (lv_values_13_0= ruleSimpleExpression ) )
                    	    {
                    	    otherlv_12=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_12, grammarAccess.getAtomicAccess().getCommaKeyword_4_3_0());
                    	      				
                    	    }
                    	    // InternalMoniLog.g:4640:5: ( (lv_values_13_0= ruleSimpleExpression ) )
                    	    // InternalMoniLog.g:4641:6: (lv_values_13_0= ruleSimpleExpression )
                    	    {
                    	    // InternalMoniLog.g:4641:6: (lv_values_13_0= ruleSimpleExpression )
                    	    // InternalMoniLog.g:4642:7: lv_values_13_0= ruleSimpleExpression
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getAtomicAccess().getValuesSimpleExpressionParserRuleCall_4_3_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_57);
                    	    lv_values_13_0=ruleSimpleExpression();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getAtomicRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"values",
                    	      								lv_values_13_0,
                    	      								"org.gemoc.monilog.MoniLog.SimpleExpression");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop75;
                        }
                    } while (true);

                    otherlv_14=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getAtomicAccess().getRightSquareBracketKeyword_4_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog.g:4666:3: this_Ref_15= ruleRef
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getRefParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_Ref_15=ruleRef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Ref_15;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMoniLog.g:4678:3: this_ArraySize_16= ruleArraySize
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAtomicAccess().getArraySizeParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_ArraySize_16=ruleArraySize();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ArraySize_16;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "entryRuleRef"
    // InternalMoniLog.g:4693:1: entryRuleRef returns [EObject current=null] : iv_ruleRef= ruleRef EOF ;
    public final EObject entryRuleRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRef = null;


        try {
            // InternalMoniLog.g:4693:44: (iv_ruleRef= ruleRef EOF )
            // InternalMoniLog.g:4694:2: iv_ruleRef= ruleRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleRef=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRef"


    // $ANTLR start "ruleRef"
    // InternalMoniLog.g:4700:1: ruleRef returns [EObject current=null] : (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* ) ;
    public final EObject ruleRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token lv_property_9_0=null;
        EObject this_SimpleVarRef_0 = null;

        EObject lv_indices_3_0 = null;

        EObject lv_indices_5_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4706:2: ( (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* ) )
            // InternalMoniLog.g:4707:2: (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* )
            {
            // InternalMoniLog.g:4707:2: (this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )* )
            // InternalMoniLog.g:4708:3: this_SimpleVarRef_0= ruleSimpleVarRef ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefAccess().getSimpleVarRefParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_58);
            this_SimpleVarRef_0=ruleSimpleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SimpleVarRef_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:4719:3: ( ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' ) | ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) ) )*
            loop78:
            do {
                int alt78=3;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==25) ) {
                    alt78=1;
                }
                else if ( (LA78_0==46) ) {
                    alt78=2;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalMoniLog.g:4720:4: ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' )
            	    {
            	    // InternalMoniLog.g:4720:4: ( () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']' )
            	    // InternalMoniLog.g:4721:5: () otherlv_2= '[' ( (lv_indices_3_0= ruleSimpleExpression ) ) (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )* otherlv_6= ']'
            	    {
            	    // InternalMoniLog.g:4721:5: ()
            	    // InternalMoniLog.g:4722:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRefAccess().getArrayRefArrayAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_2=(Token)match(input,25,FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_2, grammarAccess.getRefAccess().getLeftSquareBracketKeyword_1_0_1());
            	      				
            	    }
            	    // InternalMoniLog.g:4735:5: ( (lv_indices_3_0= ruleSimpleExpression ) )
            	    // InternalMoniLog.g:4736:6: (lv_indices_3_0= ruleSimpleExpression )
            	    {
            	    // InternalMoniLog.g:4736:6: (lv_indices_3_0= ruleSimpleExpression )
            	    // InternalMoniLog.g:4737:7: lv_indices_3_0= ruleSimpleExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getRefAccess().getIndicesSimpleExpressionParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_indices_3_0=ruleSimpleExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getRefRule());
            	      							}
            	      							add(
            	      								current,
            	      								"indices",
            	      								lv_indices_3_0,
            	      								"org.gemoc.monilog.MoniLog.SimpleExpression");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }

            	    // InternalMoniLog.g:4754:5: (otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==22) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalMoniLog.g:4755:6: otherlv_4= ',' ( (lv_indices_5_0= ruleSimpleExpression ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,22,FOLLOW_45); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      						newLeafNode(otherlv_4, grammarAccess.getRefAccess().getCommaKeyword_1_0_3_0());
            	    	      					
            	    	    }
            	    	    // InternalMoniLog.g:4759:6: ( (lv_indices_5_0= ruleSimpleExpression ) )
            	    	    // InternalMoniLog.g:4760:7: (lv_indices_5_0= ruleSimpleExpression )
            	    	    {
            	    	    // InternalMoniLog.g:4760:7: (lv_indices_5_0= ruleSimpleExpression )
            	    	    // InternalMoniLog.g:4761:8: lv_indices_5_0= ruleSimpleExpression
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      								newCompositeNode(grammarAccess.getRefAccess().getIndicesSimpleExpressionParserRuleCall_1_0_3_1_0());
            	    	      							
            	    	    }
            	    	    pushFollow(FOLLOW_57);
            	    	    lv_indices_5_0=ruleSimpleExpression();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      								if (current==null) {
            	    	      									current = createModelElementForParent(grammarAccess.getRefRule());
            	    	      								}
            	    	      								add(
            	    	      									current,
            	    	      									"indices",
            	    	      									lv_indices_5_0,
            	    	      									"org.gemoc.monilog.MoniLog.SimpleExpression");
            	    	      								afterParserOrEnumRuleCall();
            	    	      							
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,26,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_6, grammarAccess.getRefAccess().getRightSquareBracketKeyword_1_0_4());
            	      				
            	    }

            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoniLog.g:4785:4: ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) )
            	    {
            	    // InternalMoniLog.g:4785:4: ( () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) ) )
            	    // InternalMoniLog.g:4786:5: () otherlv_8= '.' ( (lv_property_9_0= RULE_ID ) )
            	    {
            	    // InternalMoniLog.g:4786:5: ()
            	    // InternalMoniLog.g:4787:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getRefAccess().getPropertyRefObjectAction_1_1_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    otherlv_8=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_8, grammarAccess.getRefAccess().getFullStopKeyword_1_1_1());
            	      				
            	    }
            	    // InternalMoniLog.g:4800:5: ( (lv_property_9_0= RULE_ID ) )
            	    // InternalMoniLog.g:4801:6: (lv_property_9_0= RULE_ID )
            	    {
            	    // InternalMoniLog.g:4801:6: (lv_property_9_0= RULE_ID )
            	    // InternalMoniLog.g:4802:7: lv_property_9_0= RULE_ID
            	    {
            	    lv_property_9_0=(Token)match(input,RULE_ID,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							newLeafNode(lv_property_9_0, grammarAccess.getRefAccess().getPropertyIDTerminalRuleCall_1_1_2_0());
            	      						
            	    }
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElement(grammarAccess.getRefRule());
            	      							}
            	      							setWithLastConsumed(
            	      								current,
            	      								"property",
            	      								lv_property_9_0,
            	      								"org.eclipse.xtext.common.Terminals.ID");
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleRef"


    // $ANTLR start "entryRuleSimpleVarRef"
    // InternalMoniLog.g:4824:1: entryRuleSimpleVarRef returns [EObject current=null] : iv_ruleSimpleVarRef= ruleSimpleVarRef EOF ;
    public final EObject entryRuleSimpleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleVarRef = null;


        try {
            // InternalMoniLog.g:4824:53: (iv_ruleSimpleVarRef= ruleSimpleVarRef EOF )
            // InternalMoniLog.g:4825:2: iv_ruleSimpleVarRef= ruleSimpleVarRef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSimpleVarRefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleSimpleVarRef=ruleSimpleVarRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSimpleVarRef; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSimpleVarRef"


    // $ANTLR start "ruleSimpleVarRef"
    // InternalMoniLog.g:4831:1: ruleSimpleVarRef returns [EObject current=null] : ( (lv_target_0_0= RULE_ID ) ) ;
    public final EObject ruleSimpleVarRef() throws RecognitionException {
        EObject current = null;

        Token lv_target_0_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:4837:2: ( ( (lv_target_0_0= RULE_ID ) ) )
            // InternalMoniLog.g:4838:2: ( (lv_target_0_0= RULE_ID ) )
            {
            // InternalMoniLog.g:4838:2: ( (lv_target_0_0= RULE_ID ) )
            // InternalMoniLog.g:4839:3: (lv_target_0_0= RULE_ID )
            {
            // InternalMoniLog.g:4839:3: (lv_target_0_0= RULE_ID )
            // InternalMoniLog.g:4840:4: lv_target_0_0= RULE_ID
            {
            lv_target_0_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(lv_target_0_0, grammarAccess.getSimpleVarRefAccess().getTargetIDTerminalRuleCall_0());
              			
            }
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElement(grammarAccess.getSimpleVarRefRule());
              				}
              				setWithLastConsumed(
              					current,
              					"target",
              					lv_target_0_0,
              					"org.eclipse.xtext.common.Terminals.ID");
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleSimpleVarRef"


    // $ANTLR start "entryRuleArraySize"
    // InternalMoniLog.g:4859:1: entryRuleArraySize returns [EObject current=null] : iv_ruleArraySize= ruleArraySize EOF ;
    public final EObject entryRuleArraySize() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArraySize = null;


        try {
            // InternalMoniLog.g:4859:50: (iv_ruleArraySize= ruleArraySize EOF )
            // InternalMoniLog.g:4860:2: iv_ruleArraySize= ruleArraySize EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArraySizeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleArraySize=ruleArraySize();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArraySize; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArraySize"


    // $ANTLR start "ruleArraySize"
    // InternalMoniLog.g:4866:1: ruleArraySize returns [EObject current=null] : (otherlv_0= 'sizeOf' otherlv_1= '(' ( (lv_array_2_0= ruleRef ) ) otherlv_3= ')' ) ;
    public final EObject ruleArraySize() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_array_2_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4872:2: ( (otherlv_0= 'sizeOf' otherlv_1= '(' ( (lv_array_2_0= ruleRef ) ) otherlv_3= ')' ) )
            // InternalMoniLog.g:4873:2: (otherlv_0= 'sizeOf' otherlv_1= '(' ( (lv_array_2_0= ruleRef ) ) otherlv_3= ')' )
            {
            // InternalMoniLog.g:4873:2: (otherlv_0= 'sizeOf' otherlv_1= '(' ( (lv_array_2_0= ruleRef ) ) otherlv_3= ')' )
            // InternalMoniLog.g:4874:3: otherlv_0= 'sizeOf' otherlv_1= '(' ( (lv_array_2_0= ruleRef ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getArraySizeAccess().getSizeOfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getArraySizeAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMoniLog.g:4882:3: ( (lv_array_2_0= ruleRef ) )
            // InternalMoniLog.g:4883:4: (lv_array_2_0= ruleRef )
            {
            // InternalMoniLog.g:4883:4: (lv_array_2_0= ruleRef )
            // InternalMoniLog.g:4884:5: lv_array_2_0= ruleRef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getArraySizeAccess().getArrayRefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            lv_array_2_0=ruleRef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getArraySizeRule());
              					}
              					set(
              						current,
              						"array",
              						lv_array_2_0,
              						"org.gemoc.monilog.MoniLog.Ref");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getArraySizeAccess().getRightParenthesisKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleArraySize"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMoniLog.g:4909:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalMoniLog.g:4909:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalMoniLog.g:4910:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:4916:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalMoniLog.g:4922:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalMoniLog.g:4923:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalMoniLog.g:4923:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalMoniLog.g:4924:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalMoniLog.g:4931:3: (kw= '.' this_ID_2= RULE_ID )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==46) ) {
                    int LA79_2 = input.LA(2);

                    if ( (LA79_2==RULE_ID) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // InternalMoniLog.g:4932:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMoniLog.g:4949:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalMoniLog.g:4949:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalMoniLog.g:4950:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoniLog.g:4956:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalMoniLog.g:4962:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalMoniLog.g:4963:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalMoniLog.g:4963:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalMoniLog.g:4964:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_60);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoniLog.g:4974:3: (kw= '.*' )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==70) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // InternalMoniLog.g:4975:4: kw= '.*'
                    {
                    kw=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleMoniLoggerAnnotation"
    // InternalMoniLog.g:4985:1: ruleMoniLoggerAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Inactive' ) ;
    public final Enumerator ruleMoniLoggerAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:4991:2: ( (enumLiteral_0= '@Inactive' ) )
            // InternalMoniLog.g:4992:2: (enumLiteral_0= '@Inactive' )
            {
            // InternalMoniLog.g:4992:2: (enumLiteral_0= '@Inactive' )
            // InternalMoniLog.g:4993:3: enumLiteral_0= '@Inactive'
            {
            enumLiteral_0=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMoniLoggerAnnotation"


    // $ANTLR start "ruleAppenderAnnotation"
    // InternalMoniLog.g:5002:1: ruleAppenderAnnotation returns [Enumerator current=null] : (enumLiteral_0= '@Async' ) ;
    public final Enumerator ruleAppenderAnnotation() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;


        	enterRule();

        try {
            // InternalMoniLog.g:5008:2: ( (enumLiteral_0= '@Async' ) )
            // InternalMoniLog.g:5009:2: (enumLiteral_0= '@Async' )
            {
            // InternalMoniLog.g:5009:2: (enumLiteral_0= '@Async' )
            // InternalMoniLog.g:5010:3: enumLiteral_0= '@Async'
            {
            enumLiteral_0=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration().getEnumLiteral().getInstance();
              			newLeafNode(enumLiteral_0, grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAppenderAnnotation"


    // $ANTLR start "ruleLogLevel"
    // InternalMoniLog.g:5019:1: ruleLogLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) ;
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
            // InternalMoniLog.g:5025:2: ( ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) ) )
            // InternalMoniLog.g:5026:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            {
            // InternalMoniLog.g:5026:2: ( (enumLiteral_0= 'INFO' ) | (enumLiteral_1= 'CONFIG' ) | (enumLiteral_2= 'FINE' ) | (enumLiteral_3= 'FINER' ) | (enumLiteral_4= 'FINEST' ) | (enumLiteral_5= 'SEVERE' ) | (enumLiteral_6= 'WARNING' ) )
            int alt81=7;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt81=1;
                }
                break;
            case 74:
                {
                alt81=2;
                }
                break;
            case 75:
                {
                alt81=3;
                }
                break;
            case 76:
                {
                alt81=4;
                }
                break;
            case 77:
                {
                alt81=5;
                }
                break;
            case 78:
                {
                alt81=6;
                }
                break;
            case 79:
                {
                alt81=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalMoniLog.g:5027:3: (enumLiteral_0= 'INFO' )
                    {
                    // InternalMoniLog.g:5027:3: (enumLiteral_0= 'INFO' )
                    // InternalMoniLog.g:5028:4: enumLiteral_0= 'INFO'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:5035:3: (enumLiteral_1= 'CONFIG' )
                    {
                    // InternalMoniLog.g:5035:3: (enumLiteral_1= 'CONFIG' )
                    // InternalMoniLog.g:5036:4: enumLiteral_1= 'CONFIG'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:5043:3: (enumLiteral_2= 'FINE' )
                    {
                    // InternalMoniLog.g:5043:3: (enumLiteral_2= 'FINE' )
                    // InternalMoniLog.g:5044:4: enumLiteral_2= 'FINE'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:5051:3: (enumLiteral_3= 'FINER' )
                    {
                    // InternalMoniLog.g:5051:3: (enumLiteral_3= 'FINER' )
                    // InternalMoniLog.g:5052:4: enumLiteral_3= 'FINER'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog.g:5059:3: (enumLiteral_4= 'FINEST' )
                    {
                    // InternalMoniLog.g:5059:3: (enumLiteral_4= 'FINEST' )
                    // InternalMoniLog.g:5060:4: enumLiteral_4= 'FINEST'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog.g:5067:3: (enumLiteral_5= 'SEVERE' )
                    {
                    // InternalMoniLog.g:5067:3: (enumLiteral_5= 'SEVERE' )
                    // InternalMoniLog.g:5068:4: enumLiteral_5= 'SEVERE'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog.g:5075:3: (enumLiteral_6= 'WARNING' )
                    {
                    // InternalMoniLog.g:5075:3: (enumLiteral_6= 'WARNING' )
                    // InternalMoniLog.g:5076:4: enumLiteral_6= 'WARNING'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "ruleTemporalPatternKind"
    // InternalMoniLog.g:5086:1: ruleTemporalPatternKind returns [Enumerator current=null] : ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) ;
    public final Enumerator ruleTemporalPatternKind() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoniLog.g:5092:2: ( ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) ) )
            // InternalMoniLog.g:5093:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            {
            // InternalMoniLog.g:5093:2: ( (enumLiteral_0= 'S' ) | (enumLiteral_1= 'V' ) | (enumLiteral_2= 'nS' ) | (enumLiteral_3= 'nV' ) )
            int alt82=4;
            switch ( input.LA(1) ) {
            case 80:
                {
                alt82=1;
                }
                break;
            case 81:
                {
                alt82=2;
                }
                break;
            case 82:
                {
                alt82=3;
                }
                break;
            case 83:
                {
                alt82=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalMoniLog.g:5094:3: (enumLiteral_0= 'S' )
                    {
                    // InternalMoniLog.g:5094:3: (enumLiteral_0= 'S' )
                    // InternalMoniLog.g:5095:4: enumLiteral_0= 'S'
                    {
                    enumLiteral_0=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:5102:3: (enumLiteral_1= 'V' )
                    {
                    // InternalMoniLog.g:5102:3: (enumLiteral_1= 'V' )
                    // InternalMoniLog.g:5103:4: enumLiteral_1= 'V'
                    {
                    enumLiteral_1=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog.g:5110:3: (enumLiteral_2= 'nS' )
                    {
                    // InternalMoniLog.g:5110:3: (enumLiteral_2= 'nS' )
                    // InternalMoniLog.g:5111:4: enumLiteral_2= 'nS'
                    {
                    enumLiteral_2=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog.g:5118:3: (enumLiteral_3= 'nV' )
                    {
                    // InternalMoniLog.g:5118:3: (enumLiteral_3= 'nV' )
                    // InternalMoniLog.g:5119:4: enumLiteral_3= 'nV'
                    {
                    enumLiteral_3=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTemporalPatternKind"

    // $ANTLR start synpred2_InternalMoniLog
    public final void synpred2_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_events_4_0 = null;


        // InternalMoniLog.g:151:10: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )
        // InternalMoniLog.g:151:10: {...}? => ( (lv_events_4_0= ruleEvent ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred2_InternalMoniLog", "true");
        }
        // InternalMoniLog.g:151:19: ( (lv_events_4_0= ruleEvent ) )
        // InternalMoniLog.g:151:20: (lv_events_4_0= ruleEvent )
        {
        // InternalMoniLog.g:151:20: (lv_events_4_0= ruleEvent )
        // InternalMoniLog.g:152:10: lv_events_4_0= ruleEvent
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_3_0_0());
          									
        }
        pushFollow(FOLLOW_2);
        lv_events_4_0=ruleEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalMoniLog

    // $ANTLR start synpred3_InternalMoniLog
    public final void synpred3_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_events_4_0 = null;


        // InternalMoniLog.g:146:4: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) )
        // InternalMoniLog.g:146:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
        {
        // InternalMoniLog.g:146:4: ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) )
        // InternalMoniLog.g:147:5: {...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred3_InternalMoniLog", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0)");
        }
        // InternalMoniLog.g:147:105: ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ )
        // InternalMoniLog.g:148:6: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0);
        // InternalMoniLog.g:151:9: ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+
        int cnt83=0;
        loop83:
        do {
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==30) && ((true))) {
                alt83=1;
            }
            else if ( (LA83_0==31) && ((true))) {
                alt83=1;
            }
            else if ( (LA83_0==32) && ((true))) {
                alt83=1;
            }


            switch (alt83) {
        	case 1 :
        	    // InternalMoniLog.g:151:10: {...}? => ( (lv_events_4_0= ruleEvent ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred3_InternalMoniLog", "true");
        	    }
        	    // InternalMoniLog.g:151:19: ( (lv_events_4_0= ruleEvent ) )
        	    // InternalMoniLog.g:151:20: (lv_events_4_0= ruleEvent )
        	    {
        	    // InternalMoniLog.g:151:20: (lv_events_4_0= ruleEvent )
        	    // InternalMoniLog.g:152:10: lv_events_4_0= ruleEvent
        	    {
        	    if ( state.backtracking==0 ) {

        	      										newCompositeNode(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_3_0_0());
        	      									
        	    }
        	    pushFollow(FOLLOW_61);
        	    lv_events_4_0=ruleEvent();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt83 >= 1 ) break loop83;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(83, input);
                    throw eee;
            }
            cnt83++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalMoniLog

    // $ANTLR start synpred4_InternalMoniLog
    public final void synpred4_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_appenders_5_0 = null;


        // InternalMoniLog.g:179:10: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )
        // InternalMoniLog.g:179:10: {...}? => ( (lv_appenders_5_0= ruleAppender ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred4_InternalMoniLog", "true");
        }
        // InternalMoniLog.g:179:19: ( (lv_appenders_5_0= ruleAppender ) )
        // InternalMoniLog.g:179:20: (lv_appenders_5_0= ruleAppender )
        {
        // InternalMoniLog.g:179:20: (lv_appenders_5_0= ruleAppender )
        // InternalMoniLog.g:180:10: lv_appenders_5_0= ruleAppender
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_3_1_0());
          									
        }
        pushFollow(FOLLOW_2);
        lv_appenders_5_0=ruleAppender();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalMoniLog

    // $ANTLR start synpred5_InternalMoniLog
    public final void synpred5_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_appenders_5_0 = null;


        // InternalMoniLog.g:174:4: ( ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) )
        // InternalMoniLog.g:174:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
        {
        // InternalMoniLog.g:174:4: ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) )
        // InternalMoniLog.g:175:5: {...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred5_InternalMoniLog", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1)");
        }
        // InternalMoniLog.g:175:105: ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ )
        // InternalMoniLog.g:176:6: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1);
        // InternalMoniLog.g:179:9: ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+
        int cnt84=0;
        loop84:
        do {
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==72) && ((true))) {
                alt84=1;
            }
            else if ( (LA84_0==15) && ((true))) {
                alt84=1;
            }


            switch (alt84) {
        	case 1 :
        	    // InternalMoniLog.g:179:10: {...}? => ( (lv_appenders_5_0= ruleAppender ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred5_InternalMoniLog", "true");
        	    }
        	    // InternalMoniLog.g:179:19: ( (lv_appenders_5_0= ruleAppender ) )
        	    // InternalMoniLog.g:179:20: (lv_appenders_5_0= ruleAppender )
        	    {
        	    // InternalMoniLog.g:179:20: (lv_appenders_5_0= ruleAppender )
        	    // InternalMoniLog.g:180:10: lv_appenders_5_0= ruleAppender
        	    {
        	    if ( state.backtracking==0 ) {

        	      										newCompositeNode(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_3_1_0());
        	      									
        	    }
        	    pushFollow(FOLLOW_62);
        	    lv_appenders_5_0=ruleAppender();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt84 >= 1 ) break loop84;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(84, input);
                    throw eee;
            }
            cnt84++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred5_InternalMoniLog

    // $ANTLR start synpred6_InternalMoniLog
    public final void synpred6_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_layouts_6_0 = null;


        // InternalMoniLog.g:207:10: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )
        // InternalMoniLog.g:207:10: {...}? => ( (lv_layouts_6_0= ruleLayout ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred6_InternalMoniLog", "true");
        }
        // InternalMoniLog.g:207:19: ( (lv_layouts_6_0= ruleLayout ) )
        // InternalMoniLog.g:207:20: (lv_layouts_6_0= ruleLayout )
        {
        // InternalMoniLog.g:207:20: (lv_layouts_6_0= ruleLayout )
        // InternalMoniLog.g:208:10: lv_layouts_6_0= ruleLayout
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_3_2_0());
          									
        }
        pushFollow(FOLLOW_2);
        lv_layouts_6_0=ruleLayout();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred6_InternalMoniLog

    // $ANTLR start synpred7_InternalMoniLog
    public final void synpred7_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_layouts_6_0 = null;


        // InternalMoniLog.g:202:4: ( ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) )
        // InternalMoniLog.g:202:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
        {
        // InternalMoniLog.g:202:4: ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) )
        // InternalMoniLog.g:203:5: {...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred7_InternalMoniLog", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2)");
        }
        // InternalMoniLog.g:203:105: ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ )
        // InternalMoniLog.g:204:6: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2);
        // InternalMoniLog.g:207:9: ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+
        int cnt85=0;
        loop85:
        do {
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==21) && ((true))) {
                alt85=1;
            }


            switch (alt85) {
        	case 1 :
        	    // InternalMoniLog.g:207:10: {...}? => ( (lv_layouts_6_0= ruleLayout ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred7_InternalMoniLog", "true");
        	    }
        	    // InternalMoniLog.g:207:19: ( (lv_layouts_6_0= ruleLayout ) )
        	    // InternalMoniLog.g:207:20: (lv_layouts_6_0= ruleLayout )
        	    {
        	    // InternalMoniLog.g:207:20: (lv_layouts_6_0= ruleLayout )
        	    // InternalMoniLog.g:208:10: lv_layouts_6_0= ruleLayout
        	    {
        	    if ( state.backtracking==0 ) {

        	      										newCompositeNode(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_3_2_0());
        	      									
        	    }
        	    pushFollow(FOLLOW_63);
        	    lv_layouts_6_0=ruleLayout();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt85 >= 1 ) break loop85;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(85, input);
                    throw eee;
            }
            cnt85++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred7_InternalMoniLog

    // $ANTLR start synpred8_InternalMoniLog
    public final void synpred8_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_moniloggers_7_0 = null;


        // InternalMoniLog.g:235:10: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )
        // InternalMoniLog.g:235:10: {...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) )
        {
        if ( !((true)) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred8_InternalMoniLog", "true");
        }
        // InternalMoniLog.g:235:19: ( (lv_moniloggers_7_0= ruleMoniLogger ) )
        // InternalMoniLog.g:235:20: (lv_moniloggers_7_0= ruleMoniLogger )
        {
        // InternalMoniLog.g:235:20: (lv_moniloggers_7_0= ruleMoniLogger )
        // InternalMoniLog.g:236:10: lv_moniloggers_7_0= ruleMoniLogger
        {
        if ( state.backtracking==0 ) {

          										newCompositeNode(grammarAccess.getDocumentAccess().getMoniloggersMoniLoggerParserRuleCall_3_3_0());
          									
        }
        pushFollow(FOLLOW_2);
        lv_moniloggers_7_0=ruleMoniLogger();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred8_InternalMoniLog

    // $ANTLR start synpred9_InternalMoniLog
    public final void synpred9_InternalMoniLog_fragment() throws RecognitionException {   
        EObject lv_moniloggers_7_0 = null;


        // InternalMoniLog.g:230:4: ( ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )
        // InternalMoniLog.g:230:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
        {
        // InternalMoniLog.g:230:4: ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) )
        // InternalMoniLog.g:231:5: {...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
        {
        if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
            if (state.backtracking>0) {state.failed=true; return ;}
            throw new FailedPredicateException(input, "synpred9_InternalMoniLog", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3)");
        }
        // InternalMoniLog.g:231:105: ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ )
        // InternalMoniLog.g:232:6: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
        {
        getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3);
        // InternalMoniLog.g:235:9: ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+
        int cnt86=0;
        loop86:
        do {
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==71) && ((true))) {
                alt86=1;
            }
            else if ( (LA86_0==24) && ((true))) {
                alt86=1;
            }


            switch (alt86) {
        	case 1 :
        	    // InternalMoniLog.g:235:10: {...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) )
        	    {
        	    if ( !((true)) ) {
        	        if (state.backtracking>0) {state.failed=true; return ;}
        	        throw new FailedPredicateException(input, "synpred9_InternalMoniLog", "true");
        	    }
        	    // InternalMoniLog.g:235:19: ( (lv_moniloggers_7_0= ruleMoniLogger ) )
        	    // InternalMoniLog.g:235:20: (lv_moniloggers_7_0= ruleMoniLogger )
        	    {
        	    // InternalMoniLog.g:235:20: (lv_moniloggers_7_0= ruleMoniLogger )
        	    // InternalMoniLog.g:236:10: lv_moniloggers_7_0= ruleMoniLogger
        	    {
        	    if ( state.backtracking==0 ) {

        	      										newCompositeNode(grammarAccess.getDocumentAccess().getMoniloggersMoniLoggerParserRuleCall_3_3_0());
        	      									
        	    }
        	    pushFollow(FOLLOW_5);
        	    lv_moniloggers_7_0=ruleMoniLogger();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }


        	    }


        	    }
        	    break;

        	default :
        	    if ( cnt86 >= 1 ) break loop86;
        	    if (state.backtracking>0) {state.failed=true; return ;}
                    EarlyExitException eee =
                        new EarlyExitException(86, input);
                    throw eee;
            }
            cnt86++;
        } while (true);


        }


        }


        }
    }
    // $ANTLR end synpred9_InternalMoniLog

    // $ANTLR start synpred42_InternalMoniLog
    public final void synpred42_InternalMoniLog_fragment() throws RecognitionException {   
        Token otherlv_1=null;
        EObject lv_bound_2_0 = null;

        EObject lv_event_3_0 = null;


        // InternalMoniLog.g:1829:3: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) )
        // InternalMoniLog.g:1829:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
        {
        // InternalMoniLog.g:1829:3: ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) )
        // InternalMoniLog.g:1830:4: () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) )
        {
        // InternalMoniLog.g:1830:4: ()
        // InternalMoniLog.g:1831:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMoniLog.g:1840:4: (otherlv_1= 'exists' )?
        int alt95=2;
        int LA95_0 = input.LA(1);

        if ( (LA95_0==35) ) {
            alt95=1;
        }
        switch (alt95) {
            case 1 :
                // InternalMoniLog.g:1841:5: otherlv_1= 'exists'
                {
                otherlv_1=(Token)match(input,35,FOLLOW_30); if (state.failed) return ;

                }
                break;

        }

        // InternalMoniLog.g:1846:4: ( (lv_bound_2_0= ruleBoundType ) )?
        int alt96=2;
        int LA96_0 = input.LA(1);

        if ( (LA96_0==RULE_INT||(LA96_0>=40 && LA96_0<=41)) ) {
            alt96=1;
        }
        switch (alt96) {
            case 1 :
                // InternalMoniLog.g:1847:5: (lv_bound_2_0= ruleBoundType )
                {
                // InternalMoniLog.g:1847:5: (lv_bound_2_0= ruleBoundType )
                // InternalMoniLog.g:1848:6: lv_bound_2_0= ruleBoundType
                {
                if ( state.backtracking==0 ) {

                  						newCompositeNode(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_0_2_0());
                  					
                }
                pushFollow(FOLLOW_3);
                lv_bound_2_0=ruleBoundType();

                state._fsp--;
                if (state.failed) return ;

                }


                }
                break;

        }

        // InternalMoniLog.g:1865:4: ( (lv_event_3_0= ruleStreamEvent ) )
        // InternalMoniLog.g:1866:5: (lv_event_3_0= ruleStreamEvent )
        {
        // InternalMoniLog.g:1866:5: (lv_event_3_0= ruleStreamEvent )
        // InternalMoniLog.g:1867:6: lv_event_3_0= ruleStreamEvent
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_event_3_0=ruleStreamEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred42_InternalMoniLog

    // $ANTLR start synpred45_InternalMoniLog
    public final void synpred45_InternalMoniLog_fragment() throws RecognitionException {   
        Token otherlv_12=null;
        EObject lv_predecessor_11_0 = null;

        EObject lv_successor_13_0 = null;


        // InternalMoniLog.g:1958:3: ( ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) )
        // InternalMoniLog.g:1958:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
        {
        // InternalMoniLog.g:1958:3: ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) )
        // InternalMoniLog.g:1959:4: () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) )
        {
        // InternalMoniLog.g:1959:4: ()
        // InternalMoniLog.g:1960:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalMoniLog.g:1969:4: ( (lv_predecessor_11_0= ruleStreamEvent ) )
        // InternalMoniLog.g:1970:5: (lv_predecessor_11_0= ruleStreamEvent )
        {
        // InternalMoniLog.g:1970:5: (lv_predecessor_11_0= ruleStreamEvent )
        // InternalMoniLog.g:1971:6: lv_predecessor_11_0= ruleStreamEvent
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0());
          					
        }
        pushFollow(FOLLOW_31);
        lv_predecessor_11_0=ruleStreamEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        otherlv_12=(Token)match(input,38,FOLLOW_3); if (state.failed) return ;
        // InternalMoniLog.g:1992:4: ( (lv_successor_13_0= ruleStreamEvent ) )
        // InternalMoniLog.g:1993:5: (lv_successor_13_0= ruleStreamEvent )
        {
        // InternalMoniLog.g:1993:5: (lv_successor_13_0= ruleStreamEvent )
        // InternalMoniLog.g:1994:6: lv_successor_13_0= ruleStreamEvent
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_successor_13_0=ruleStreamEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred45_InternalMoniLog

    // $ANTLR start synpred50_InternalMoniLog
    public final void synpred50_InternalMoniLog_fragment() throws RecognitionException {   
        Token otherlv_3=null;
        EObject lv_lowerBound_4_0 = null;


        // InternalMoniLog.g:2276:3: ( ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) ) )
        // InternalMoniLog.g:2276:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
        {
        // InternalMoniLog.g:2276:3: ( () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) ) )
        // InternalMoniLog.g:2277:4: () otherlv_3= 'after' ( (lv_lowerBound_4_0= ruleStreamEvent ) )
        {
        // InternalMoniLog.g:2277:4: ()
        // InternalMoniLog.g:2278:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        otherlv_3=(Token)match(input,34,FOLLOW_3); if (state.failed) return ;
        // InternalMoniLog.g:2291:4: ( (lv_lowerBound_4_0= ruleStreamEvent ) )
        // InternalMoniLog.g:2292:5: (lv_lowerBound_4_0= ruleStreamEvent )
        {
        // InternalMoniLog.g:2292:5: (lv_lowerBound_4_0= ruleStreamEvent )
        // InternalMoniLog.g:2293:6: lv_lowerBound_4_0= ruleStreamEvent
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0());
          					
        }
        pushFollow(FOLLOW_2);
        lv_lowerBound_4_0=ruleStreamEvent();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred50_InternalMoniLog

    // Delegated rules

    public final boolean synpred5_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred7_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred45_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred45_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred42_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred50_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred50_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalMoniLog_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA14 dfa14 = new DFA14(this);
    protected DFA38 dfa38 = new DFA38(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\1\1\11\uffff";
    static final String dfa_3s = "\1\17\11\uffff";
    static final String dfa_4s = "\1\110\11\uffff";
    static final String dfa_5s = "\1\uffff\1\5\3\1\2\2\1\3\2\4";
    static final String dfa_6s = "\1\0\11\uffff}>";
    static final String[] dfa_7s = {
            "\1\6\5\uffff\1\7\2\uffff\1\11\5\uffff\1\2\1\3\1\4\46\uffff\1\10\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 145:6: ( ({...}? => ( ({...}? => ( (lv_events_4_0= ruleEvent ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_appenders_5_0= ruleAppender ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_layouts_6_0= ruleLayout ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_moniloggers_7_0= ruleMoniLogger ) ) )+ ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_0 = input.LA(1);

                         
                        int index6_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA6_0==EOF) ) {s = 1;}

                        else if ( LA6_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA6_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {s = 3;}

                        else if ( LA6_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {s = 4;}

                        else if ( LA6_0 == 72 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {s = 5;}

                        else if ( LA6_0 == 15 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {s = 6;}

                        else if ( LA6_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {s = 7;}

                        else if ( LA6_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {s = 8;}

                        else if ( LA6_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {s = 9;}

                         
                        input.seek(index6_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\13\uffff";
    static final String dfa_9s = "\3\uffff\1\5\3\uffff\1\5\3\uffff";
    static final String dfa_10s = "\1\17\1\uffff\1\5\1\17\1\5\1\uffff\1\21\1\17\1\5\2\21";
    static final String dfa_11s = "\1\110\1\uffff\1\5\1\110\1\21\1\uffff\1\26\1\110\1\5\1\27\1\21";
    static final String dfa_12s = "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String dfa_13s = "\13\uffff}>";
    static final String[] dfa_14s = {
            "\1\2\70\uffff\1\1",
            "",
            "\1\3",
            "\1\5\1\4\1\uffff\1\1\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5\46\uffff\2\5",
            "\1\6\13\uffff\1\7",
            "",
            "\1\7\4\uffff\1\10",
            "\1\5\2\uffff\1\1\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5\46\uffff\2\5",
            "\1\11",
            "\1\7\4\uffff\1\10\1\12",
            "\1\7"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "415:2: (this_LocalAppender_0= ruleLocalAppender | this_ExternalAppender_1= ruleExternalAppender )";
        }
    }
    static final String dfa_15s = "\2\uffff\1\4\4\uffff\1\4\3\uffff";
    static final String dfa_16s = "\1\25\1\5\1\17\1\5\2\uffff\1\21\1\17\1\5\2\21";
    static final String dfa_17s = "\1\25\1\5\1\110\1\21\2\uffff\1\26\1\110\1\5\1\27\1\21";
    static final String dfa_18s = "\4\uffff\1\2\1\1\5\uffff";
    static final String[] dfa_19s = {
            "\1\1",
            "\1\2",
            "\1\4\1\3\1\uffff\1\5\2\uffff\1\4\2\uffff\1\4\5\uffff\3\4\46\uffff\2\4",
            "\1\6\13\uffff\1\7",
            "",
            "",
            "\1\7\4\uffff\1\10",
            "\1\4\2\uffff\1\5\2\uffff\1\4\2\uffff\1\4\5\uffff\3\4\46\uffff\2\4",
            "\1\11",
            "\1\7\4\uffff\1\10\1\12",
            "\1\7"
    };
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = dfa_8;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_13;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "674:2: (this_LocalLayout_0= ruleLocalLayout | this_ExternalLayout_1= ruleExternalLayout )";
        }
    }
    static final String dfa_20s = "\1\5\4\uffff\1\0\4\uffff";
    static final String dfa_21s = "\1\51\4\uffff\1\0\4\uffff";
    static final String dfa_22s = "\1\uffff\1\1\4\uffff\1\2\1\3\1\4\1\5";
    static final String dfa_23s = "\5\uffff\1\0\4\uffff}>";
    static final String[] dfa_24s = {
            "\1\5\1\1\34\uffff\1\1\1\6\1\7\2\uffff\2\1",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "1828:2: ( ( () (otherlv_1= 'exists' )? ( (lv_bound_2_0= ruleBoundType ) )? ( (lv_event_3_0= ruleStreamEvent ) ) ) | ( () otherlv_5= 'always' ( (lv_event_6_0= ruleStreamEvent ) ) ) | ( () otherlv_8= 'never' ( (lv_event_9_0= ruleStreamEvent ) ) ) | ( () ( (lv_predecessor_11_0= ruleStreamEvent ) ) otherlv_12= 'precedes' ( (lv_successor_13_0= ruleStreamEvent ) ) ) | ( () ( (lv_event_15_0= ruleStreamEvent ) ) otherlv_16= 'respondsTo' ( (lv_trigger_17_0= ruleStreamEvent ) ) ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA38_5 = input.LA(1);

                         
                        int index38_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred42_InternalMoniLog()) ) {s = 1;}

                        else if ( (synpred45_InternalMoniLog()) ) {s = 8;}

                        else if ( (true) ) {s = 9;}

                         
                        input.seek(index38_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 38, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000001C120A002L,0x0000000000000180L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000001C1208002L,0x0000000000000180L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000100L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002050000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002040000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x000000000000FE00L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x00000000000F0000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000033800000060L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00000C0600000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000030000000060L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000420000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000420020L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x40000000020100F0L,0x000000000000003CL});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0180000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x1E00000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000004400000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000400002000002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x00000001C0000002L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000008002L,0x0000000000000100L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000200002L});

}
