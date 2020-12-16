package org.gemoc.monilog.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.gemoc.monilog.services.MoniLog4DSLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMoniLog4DSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@Inactive'", "'@Async'", "'INFO'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'", "'default-language'", "'appender'", "'{'", "'}'", "'('", "')'", "','", "';'", "'layout'", "'monilogger'", "'event'", "'actions'", "'['", "']'", "'conditions'", "'ast'", "'complex'", "'custom'", "'exists'", "'always'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'after'", "'before'", "'between'", "'and'", "'until'", "'.'", "'call'", "'emit'", "'start'", "'stop'", "'='"
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

    	public void setGrammarAccess(MoniLog4DSLGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDocument"
    // InternalMoniLog4DSL.g:53:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:54:1: ( ruleDocument EOF )
            // InternalMoniLog4DSL.g:55:1: ruleDocument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleDocument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDocument"


    // $ANTLR start "ruleDocument"
    // InternalMoniLog4DSL.g:62:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:66:2: ( ( ( rule__Document__Group__0 ) ) )
            // InternalMoniLog4DSL.g:67:2: ( ( rule__Document__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:67:2: ( ( rule__Document__Group__0 ) )
            // InternalMoniLog4DSL.g:68:3: ( rule__Document__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:69:3: ( rule__Document__Group__0 )
            // InternalMoniLog4DSL.g:69:4: rule__Document__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDocument"


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog4DSL.g:78:1: entryRuleAppender : ruleAppender EOF ;
    public final void entryRuleAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:79:1: ( ruleAppender EOF )
            // InternalMoniLog4DSL.g:80:1: ruleAppender EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAppender();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppender"


    // $ANTLR start "ruleAppender"
    // InternalMoniLog4DSL.g:87:1: ruleAppender : ( ( rule__Appender__Alternatives ) ) ;
    public final void ruleAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:91:2: ( ( ( rule__Appender__Alternatives ) ) )
            // InternalMoniLog4DSL.g:92:2: ( ( rule__Appender__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:92:2: ( ( rule__Appender__Alternatives ) )
            // InternalMoniLog4DSL.g:93:3: ( rule__Appender__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:94:3: ( rule__Appender__Alternatives )
            // InternalMoniLog4DSL.g:94:4: rule__Appender__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Appender__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppender"


    // $ANTLR start "entryRuleLocalAppender"
    // InternalMoniLog4DSL.g:103:1: entryRuleLocalAppender : ruleLocalAppender EOF ;
    public final void entryRuleLocalAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:104:1: ( ruleLocalAppender EOF )
            // InternalMoniLog4DSL.g:105:1: ruleLocalAppender EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalAppender();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalAppender"


    // $ANTLR start "ruleLocalAppender"
    // InternalMoniLog4DSL.g:112:1: ruleLocalAppender : ( ( rule__LocalAppender__Group__0 ) ) ;
    public final void ruleLocalAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:116:2: ( ( ( rule__LocalAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:117:2: ( ( rule__LocalAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:117:2: ( ( rule__LocalAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:118:3: ( rule__LocalAppender__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:119:3: ( rule__LocalAppender__Group__0 )
            // InternalMoniLog4DSL.g:119:4: rule__LocalAppender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalAppender"


    // $ANTLR start "entryRuleExternalAppender"
    // InternalMoniLog4DSL.g:128:1: entryRuleExternalAppender : ruleExternalAppender EOF ;
    public final void entryRuleExternalAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:129:1: ( ruleExternalAppender EOF )
            // InternalMoniLog4DSL.g:130:1: ruleExternalAppender EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExternalAppender();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalAppender"


    // $ANTLR start "ruleExternalAppender"
    // InternalMoniLog4DSL.g:137:1: ruleExternalAppender : ( ( rule__ExternalAppender__Group__0 ) ) ;
    public final void ruleExternalAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:141:2: ( ( ( rule__ExternalAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:142:2: ( ( rule__ExternalAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:142:2: ( ( rule__ExternalAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:143:3: ( rule__ExternalAppender__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:144:3: ( rule__ExternalAppender__Group__0 )
            // InternalMoniLog4DSL.g:144:4: rule__ExternalAppender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalAppender"


    // $ANTLR start "entryRuleLayout"
    // InternalMoniLog4DSL.g:153:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:154:1: ( ruleLayout EOF )
            // InternalMoniLog4DSL.g:155:1: ruleLayout EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayout"


    // $ANTLR start "ruleLayout"
    // InternalMoniLog4DSL.g:162:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:166:2: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalMoniLog4DSL.g:167:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:167:2: ( ( rule__Layout__Alternatives ) )
            // InternalMoniLog4DSL.g:168:3: ( rule__Layout__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:169:3: ( rule__Layout__Alternatives )
            // InternalMoniLog4DSL.g:169:4: rule__Layout__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayout"


    // $ANTLR start "entryRuleLocalLayout"
    // InternalMoniLog4DSL.g:178:1: entryRuleLocalLayout : ruleLocalLayout EOF ;
    public final void entryRuleLocalLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:179:1: ( ruleLocalLayout EOF )
            // InternalMoniLog4DSL.g:180:1: ruleLocalLayout EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLocalLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLocalLayout"


    // $ANTLR start "ruleLocalLayout"
    // InternalMoniLog4DSL.g:187:1: ruleLocalLayout : ( ( rule__LocalLayout__Group__0 ) ) ;
    public final void ruleLocalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:191:2: ( ( ( rule__LocalLayout__Group__0 ) ) )
            // InternalMoniLog4DSL.g:192:2: ( ( rule__LocalLayout__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:192:2: ( ( rule__LocalLayout__Group__0 ) )
            // InternalMoniLog4DSL.g:193:3: ( rule__LocalLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:194:3: ( rule__LocalLayout__Group__0 )
            // InternalMoniLog4DSL.g:194:4: rule__LocalLayout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLocalLayout"


    // $ANTLR start "entryRuleExternalLayout"
    // InternalMoniLog4DSL.g:203:1: entryRuleExternalLayout : ruleExternalLayout EOF ;
    public final void entryRuleExternalLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:204:1: ( ruleExternalLayout EOF )
            // InternalMoniLog4DSL.g:205:1: ruleExternalLayout EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExternalLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExternalLayout"


    // $ANTLR start "ruleExternalLayout"
    // InternalMoniLog4DSL.g:212:1: ruleExternalLayout : ( ( rule__ExternalLayout__Group__0 ) ) ;
    public final void ruleExternalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:216:2: ( ( ( rule__ExternalLayout__Group__0 ) ) )
            // InternalMoniLog4DSL.g:217:2: ( ( rule__ExternalLayout__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:217:2: ( ( rule__ExternalLayout__Group__0 ) )
            // InternalMoniLog4DSL.g:218:3: ( rule__ExternalLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:219:3: ( rule__ExternalLayout__Group__0 )
            // InternalMoniLog4DSL.g:219:4: rule__ExternalLayout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExternalLayout"


    // $ANTLR start "entryRuleMoniLogger"
    // InternalMoniLog4DSL.g:228:1: entryRuleMoniLogger : ruleMoniLogger EOF ;
    public final void entryRuleMoniLogger() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:229:1: ( ruleMoniLogger EOF )
            // InternalMoniLog4DSL.g:230:1: ruleMoniLogger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMoniLogger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoniLogger"


    // $ANTLR start "ruleMoniLogger"
    // InternalMoniLog4DSL.g:237:1: ruleMoniLogger : ( ( rule__MoniLogger__Group__0 ) ) ;
    public final void ruleMoniLogger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:241:2: ( ( ( rule__MoniLogger__Group__0 ) ) )
            // InternalMoniLog4DSL.g:242:2: ( ( rule__MoniLogger__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:242:2: ( ( rule__MoniLogger__Group__0 ) )
            // InternalMoniLog4DSL.g:243:3: ( rule__MoniLogger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:244:3: ( rule__MoniLogger__Group__0 )
            // InternalMoniLog4DSL.g:244:4: rule__MoniLogger__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoniLogger"


    // $ANTLR start "entryRuleParameter"
    // InternalMoniLog4DSL.g:253:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:254:1: ( ruleParameter EOF )
            // InternalMoniLog4DSL.g:255:1: ruleParameter EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameter"


    // $ANTLR start "ruleParameter"
    // InternalMoniLog4DSL.g:262:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:266:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalMoniLog4DSL.g:267:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalMoniLog4DSL.g:267:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalMoniLog4DSL.g:268:3: ( rule__Parameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment()); 
            }
            // InternalMoniLog4DSL.g:269:3: ( rule__Parameter__NameAssignment )
            // InternalMoniLog4DSL.g:269:4: rule__Parameter__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Parameter__NameAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameter"


    // $ANTLR start "entryRuleEvent"
    // InternalMoniLog4DSL.g:278:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:279:1: ( ruleEvent EOF )
            // InternalMoniLog4DSL.g:280:1: ruleEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalMoniLog4DSL.g:287:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:291:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalMoniLog4DSL.g:292:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:292:2: ( ( rule__Event__Alternatives ) )
            // InternalMoniLog4DSL.g:293:3: ( rule__Event__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:294:3: ( rule__Event__Alternatives )
            // InternalMoniLog4DSL.g:294:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleASTEvent"
    // InternalMoniLog4DSL.g:303:1: entryRuleASTEvent : ruleASTEvent EOF ;
    public final void entryRuleASTEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:304:1: ( ruleASTEvent EOF )
            // InternalMoniLog4DSL.g:305:1: ruleASTEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleASTEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleASTEvent"


    // $ANTLR start "ruleASTEvent"
    // InternalMoniLog4DSL.g:312:1: ruleASTEvent : ( ( rule__ASTEvent__Group__0 ) ) ;
    public final void ruleASTEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:316:2: ( ( ( rule__ASTEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:317:2: ( ( rule__ASTEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:317:2: ( ( rule__ASTEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:318:3: ( rule__ASTEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:319:3: ( rule__ASTEvent__Group__0 )
            // InternalMoniLog4DSL.g:319:4: rule__ASTEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleASTEvent"


    // $ANTLR start "entryRuleComplexEvent"
    // InternalMoniLog4DSL.g:328:1: entryRuleComplexEvent : ruleComplexEvent EOF ;
    public final void entryRuleComplexEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:329:1: ( ruleComplexEvent EOF )
            // InternalMoniLog4DSL.g:330:1: ruleComplexEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleComplexEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComplexEvent"


    // $ANTLR start "ruleComplexEvent"
    // InternalMoniLog4DSL.g:337:1: ruleComplexEvent : ( ( rule__ComplexEvent__Group__0 ) ) ;
    public final void ruleComplexEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:341:2: ( ( ( rule__ComplexEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:342:2: ( ( rule__ComplexEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:342:2: ( ( rule__ComplexEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:343:3: ( rule__ComplexEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:344:3: ( rule__ComplexEvent__Group__0 )
            // InternalMoniLog4DSL.g:344:4: rule__ComplexEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComplexEvent"


    // $ANTLR start "entryRuleUserEvent"
    // InternalMoniLog4DSL.g:353:1: entryRuleUserEvent : ruleUserEvent EOF ;
    public final void entryRuleUserEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:354:1: ( ruleUserEvent EOF )
            // InternalMoniLog4DSL.g:355:1: ruleUserEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUserEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUserEvent"


    // $ANTLR start "ruleUserEvent"
    // InternalMoniLog4DSL.g:362:1: ruleUserEvent : ( ( rule__UserEvent__Group__0 ) ) ;
    public final void ruleUserEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:366:2: ( ( ( rule__UserEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:367:2: ( ( rule__UserEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:367:2: ( ( rule__UserEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:368:3: ( rule__UserEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:369:3: ( rule__UserEvent__Group__0 )
            // InternalMoniLog4DSL.g:369:4: rule__UserEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUserEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog4DSL.g:378:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:379:1: ( ruleCondition EOF )
            // InternalMoniLog4DSL.g:380:1: ruleCondition EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCondition"


    // $ANTLR start "ruleCondition"
    // InternalMoniLog4DSL.g:387:1: ruleCondition : ( ( rule__Condition__Group__0 ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:391:2: ( ( ( rule__Condition__Group__0 ) ) )
            // InternalMoniLog4DSL.g:392:2: ( ( rule__Condition__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:392:2: ( ( rule__Condition__Group__0 ) )
            // InternalMoniLog4DSL.g:393:3: ( rule__Condition__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:394:3: ( rule__Condition__Group__0 )
            // InternalMoniLog4DSL.g:394:4: rule__Condition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleTemporalPattern"
    // InternalMoniLog4DSL.g:403:1: entryRuleTemporalPattern : ruleTemporalPattern EOF ;
    public final void entryRuleTemporalPattern() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:404:1: ( ruleTemporalPattern EOF )
            // InternalMoniLog4DSL.g:405:1: ruleTemporalPattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleTemporalPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTemporalPattern"


    // $ANTLR start "ruleTemporalPattern"
    // InternalMoniLog4DSL.g:412:1: ruleTemporalPattern : ( ( rule__TemporalPattern__Group__0 ) ) ;
    public final void ruleTemporalPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:416:2: ( ( ( rule__TemporalPattern__Group__0 ) ) )
            // InternalMoniLog4DSL.g:417:2: ( ( rule__TemporalPattern__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:417:2: ( ( rule__TemporalPattern__Group__0 ) )
            // InternalMoniLog4DSL.g:418:3: ( rule__TemporalPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:419:3: ( rule__TemporalPattern__Group__0 )
            // InternalMoniLog4DSL.g:419:4: rule__TemporalPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalPattern"


    // $ANTLR start "entryRulePattern"
    // InternalMoniLog4DSL.g:428:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:429:1: ( rulePattern EOF )
            // InternalMoniLog4DSL.g:430:1: rulePattern EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalMoniLog4DSL.g:437:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:441:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalMoniLog4DSL.g:442:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:442:2: ( ( rule__Pattern__Alternatives ) )
            // InternalMoniLog4DSL.g:443:3: ( rule__Pattern__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:444:3: ( rule__Pattern__Alternatives )
            // InternalMoniLog4DSL.g:444:4: rule__Pattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleBoundType"
    // InternalMoniLog4DSL.g:453:1: entryRuleBoundType : ruleBoundType EOF ;
    public final void entryRuleBoundType() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:454:1: ( ruleBoundType EOF )
            // InternalMoniLog4DSL.g:455:1: ruleBoundType EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleBoundType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundTypeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBoundType"


    // $ANTLR start "ruleBoundType"
    // InternalMoniLog4DSL.g:462:1: ruleBoundType : ( ( rule__BoundType__Alternatives ) ) ;
    public final void ruleBoundType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:466:2: ( ( ( rule__BoundType__Alternatives ) ) )
            // InternalMoniLog4DSL.g:467:2: ( ( rule__BoundType__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:467:2: ( ( rule__BoundType__Alternatives ) )
            // InternalMoniLog4DSL.g:468:3: ( rule__BoundType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundTypeAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:469:3: ( rule__BoundType__Alternatives )
            // InternalMoniLog4DSL.g:469:4: rule__BoundType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoundType__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBoundTypeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBoundType"


    // $ANTLR start "entryRuleExactBound"
    // InternalMoniLog4DSL.g:478:1: entryRuleExactBound : ruleExactBound EOF ;
    public final void entryRuleExactBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:479:1: ( ruleExactBound EOF )
            // InternalMoniLog4DSL.g:480:1: ruleExactBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExactBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExactBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExactBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExactBound"


    // $ANTLR start "ruleExactBound"
    // InternalMoniLog4DSL.g:487:1: ruleExactBound : ( ( rule__ExactBound__NAssignment ) ) ;
    public final void ruleExactBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:491:2: ( ( ( rule__ExactBound__NAssignment ) ) )
            // InternalMoniLog4DSL.g:492:2: ( ( rule__ExactBound__NAssignment ) )
            {
            // InternalMoniLog4DSL.g:492:2: ( ( rule__ExactBound__NAssignment ) )
            // InternalMoniLog4DSL.g:493:3: ( rule__ExactBound__NAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExactBoundAccess().getNAssignment()); 
            }
            // InternalMoniLog4DSL.g:494:3: ( rule__ExactBound__NAssignment )
            // InternalMoniLog4DSL.g:494:4: rule__ExactBound__NAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExactBound__NAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExactBoundAccess().getNAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExactBound"


    // $ANTLR start "entryRuleLowerBound"
    // InternalMoniLog4DSL.g:503:1: entryRuleLowerBound : ruleLowerBound EOF ;
    public final void entryRuleLowerBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:504:1: ( ruleLowerBound EOF )
            // InternalMoniLog4DSL.g:505:1: ruleLowerBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLowerBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLowerBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLowerBound"


    // $ANTLR start "ruleLowerBound"
    // InternalMoniLog4DSL.g:512:1: ruleLowerBound : ( ( rule__LowerBound__Group__0 ) ) ;
    public final void ruleLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:516:2: ( ( ( rule__LowerBound__Group__0 ) ) )
            // InternalMoniLog4DSL.g:517:2: ( ( rule__LowerBound__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:517:2: ( ( rule__LowerBound__Group__0 ) )
            // InternalMoniLog4DSL.g:518:3: ( rule__LowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:519:3: ( rule__LowerBound__Group__0 )
            // InternalMoniLog4DSL.g:519:4: rule__LowerBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LowerBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLowerBoundAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLowerBound"


    // $ANTLR start "entryRuleUpperBound"
    // InternalMoniLog4DSL.g:528:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:529:1: ( ruleUpperBound EOF )
            // InternalMoniLog4DSL.g:530:1: ruleUpperBound EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleUpperBound();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpperBoundRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUpperBound"


    // $ANTLR start "ruleUpperBound"
    // InternalMoniLog4DSL.g:537:1: ruleUpperBound : ( ( rule__UpperBound__Group__0 ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:541:2: ( ( ( rule__UpperBound__Group__0 ) ) )
            // InternalMoniLog4DSL.g:542:2: ( ( rule__UpperBound__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:542:2: ( ( rule__UpperBound__Group__0 ) )
            // InternalMoniLog4DSL.g:543:3: ( rule__UpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:544:3: ( rule__UpperBound__Group__0 )
            // InternalMoniLog4DSL.g:544:4: rule__UpperBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpperBoundAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUpperBound"


    // $ANTLR start "entryRuleScope"
    // InternalMoniLog4DSL.g:553:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:554:1: ( ruleScope EOF )
            // InternalMoniLog4DSL.g:555:1: ruleScope EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScope"


    // $ANTLR start "ruleScope"
    // InternalMoniLog4DSL.g:562:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:566:2: ( ( ( rule__Scope__Alternatives ) ) )
            // InternalMoniLog4DSL.g:567:2: ( ( rule__Scope__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:567:2: ( ( rule__Scope__Alternatives ) )
            // InternalMoniLog4DSL.g:568:3: ( rule__Scope__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:569:3: ( rule__Scope__Alternatives )
            // InternalMoniLog4DSL.g:569:4: rule__Scope__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScope"


    // $ANTLR start "entryRuleAction"
    // InternalMoniLog4DSL.g:578:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:579:1: ( ruleAction EOF )
            // InternalMoniLog4DSL.g:580:1: ruleAction EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMoniLog4DSL.g:587:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:591:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMoniLog4DSL.g:592:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:592:2: ( ( rule__Action__Alternatives ) )
            // InternalMoniLog4DSL.g:593:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:594:3: ( rule__Action__Alternatives )
            // InternalMoniLog4DSL.g:594:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getActionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleAppenderCall"
    // InternalMoniLog4DSL.g:603:1: entryRuleAppenderCall : ruleAppenderCall EOF ;
    public final void entryRuleAppenderCall() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:604:1: ( ruleAppenderCall EOF )
            // InternalMoniLog4DSL.g:605:1: ruleAppenderCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAppenderCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppenderCall"


    // $ANTLR start "ruleAppenderCall"
    // InternalMoniLog4DSL.g:612:1: ruleAppenderCall : ( ( rule__AppenderCall__Group__0 ) ) ;
    public final void ruleAppenderCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:616:2: ( ( ( rule__AppenderCall__Group__0 ) ) )
            // InternalMoniLog4DSL.g:617:2: ( ( rule__AppenderCall__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:617:2: ( ( rule__AppenderCall__Group__0 ) )
            // InternalMoniLog4DSL.g:618:3: ( rule__AppenderCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:619:3: ( rule__AppenderCall__Group__0 )
            // InternalMoniLog4DSL.g:619:4: rule__AppenderCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppenderCall"


    // $ANTLR start "entryRuleAppenderRef"
    // InternalMoniLog4DSL.g:628:1: entryRuleAppenderRef : ruleAppenderRef EOF ;
    public final void entryRuleAppenderRef() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:629:1: ( ruleAppenderRef EOF )
            // InternalMoniLog4DSL.g:630:1: ruleAppenderRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAppenderRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppenderRef"


    // $ANTLR start "ruleAppenderRef"
    // InternalMoniLog4DSL.g:637:1: ruleAppenderRef : ( ( rule__AppenderRef__AppenderAssignment ) ) ;
    public final void ruleAppenderRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:641:2: ( ( ( rule__AppenderRef__AppenderAssignment ) ) )
            // InternalMoniLog4DSL.g:642:2: ( ( rule__AppenderRef__AppenderAssignment ) )
            {
            // InternalMoniLog4DSL.g:642:2: ( ( rule__AppenderRef__AppenderAssignment ) )
            // InternalMoniLog4DSL.g:643:3: ( rule__AppenderRef__AppenderAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderRefAccess().getAppenderAssignment()); 
            }
            // InternalMoniLog4DSL.g:644:3: ( rule__AppenderRef__AppenderAssignment )
            // InternalMoniLog4DSL.g:644:4: rule__AppenderRef__AppenderAssignment
            {
            pushFollow(FOLLOW_2);
            rule__AppenderRef__AppenderAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderRefAccess().getAppenderAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppenderRef"


    // $ANTLR start "entryRuleAppenderCallArgument"
    // InternalMoniLog4DSL.g:653:1: entryRuleAppenderCallArgument : ruleAppenderCallArgument EOF ;
    public final void entryRuleAppenderCallArgument() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:654:1: ( ruleAppenderCallArgument EOF )
            // InternalMoniLog4DSL.g:655:1: ruleAppenderCallArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleAppenderCallArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallArgumentRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAppenderCallArgument"


    // $ANTLR start "ruleAppenderCallArgument"
    // InternalMoniLog4DSL.g:662:1: ruleAppenderCallArgument : ( ( rule__AppenderCallArgument__Alternatives ) ) ;
    public final void ruleAppenderCallArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:666:2: ( ( ( rule__AppenderCallArgument__Alternatives ) ) )
            // InternalMoniLog4DSL.g:667:2: ( ( rule__AppenderCallArgument__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:667:2: ( ( rule__AppenderCallArgument__Alternatives ) )
            // InternalMoniLog4DSL.g:668:3: ( rule__AppenderCallArgument__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallArgumentAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:669:3: ( rule__AppenderCallArgument__Alternatives )
            // InternalMoniLog4DSL.g:669:4: rule__AppenderCallArgument__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCallArgument__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallArgumentAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppenderCallArgument"


    // $ANTLR start "entryRuleLayoutCall"
    // InternalMoniLog4DSL.g:678:1: entryRuleLayoutCall : ruleLayoutCall EOF ;
    public final void entryRuleLayoutCall() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:679:1: ( ruleLayoutCall EOF )
            // InternalMoniLog4DSL.g:680:1: ruleLayoutCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLayoutCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayoutCall"


    // $ANTLR start "ruleLayoutCall"
    // InternalMoniLog4DSL.g:687:1: ruleLayoutCall : ( ( rule__LayoutCall__Group__0 ) ) ;
    public final void ruleLayoutCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:691:2: ( ( ( rule__LayoutCall__Group__0 ) ) )
            // InternalMoniLog4DSL.g:692:2: ( ( rule__LayoutCall__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:692:2: ( ( rule__LayoutCall__Group__0 ) )
            // InternalMoniLog4DSL.g:693:3: ( rule__LayoutCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:694:3: ( rule__LayoutCall__Group__0 )
            // InternalMoniLog4DSL.g:694:4: rule__LayoutCall__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutCall"


    // $ANTLR start "entryRuleLayoutRef"
    // InternalMoniLog4DSL.g:703:1: entryRuleLayoutRef : ruleLayoutRef EOF ;
    public final void entryRuleLayoutRef() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:704:1: ( ruleLayoutRef EOF )
            // InternalMoniLog4DSL.g:705:1: ruleLayoutRef EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutRefRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLayoutRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutRefRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLayoutRef"


    // $ANTLR start "ruleLayoutRef"
    // InternalMoniLog4DSL.g:712:1: ruleLayoutRef : ( ( rule__LayoutRef__LayoutAssignment ) ) ;
    public final void ruleLayoutRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:716:2: ( ( ( rule__LayoutRef__LayoutAssignment ) ) )
            // InternalMoniLog4DSL.g:717:2: ( ( rule__LayoutRef__LayoutAssignment ) )
            {
            // InternalMoniLog4DSL.g:717:2: ( ( rule__LayoutRef__LayoutAssignment ) )
            // InternalMoniLog4DSL.g:718:3: ( rule__LayoutRef__LayoutAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutRefAccess().getLayoutAssignment()); 
            }
            // InternalMoniLog4DSL.g:719:3: ( rule__LayoutRef__LayoutAssignment )
            // InternalMoniLog4DSL.g:719:4: rule__LayoutRef__LayoutAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LayoutRef__LayoutAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutRefAccess().getLayoutAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutRef"


    // $ANTLR start "entryRuleEmitEvent"
    // InternalMoniLog4DSL.g:728:1: entryRuleEmitEvent : ruleEmitEvent EOF ;
    public final void entryRuleEmitEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:729:1: ( ruleEmitEvent EOF )
            // InternalMoniLog4DSL.g:730:1: ruleEmitEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmitEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmitEvent"


    // $ANTLR start "ruleEmitEvent"
    // InternalMoniLog4DSL.g:737:1: ruleEmitEvent : ( ( rule__EmitEvent__Group__0 ) ) ;
    public final void ruleEmitEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:741:2: ( ( ( rule__EmitEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:742:2: ( ( rule__EmitEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:742:2: ( ( rule__EmitEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:743:3: ( rule__EmitEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:744:3: ( rule__EmitEvent__Group__0 )
            // InternalMoniLog4DSL.g:744:4: rule__EmitEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmitEvent"


    // $ANTLR start "entryRuleMoniLoggerCall"
    // InternalMoniLog4DSL.g:753:1: entryRuleMoniLoggerCall : ruleMoniLoggerCall EOF ;
    public final void entryRuleMoniLoggerCall() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:754:1: ( ruleMoniLoggerCall EOF )
            // InternalMoniLog4DSL.g:755:1: ruleMoniLoggerCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMoniLoggerCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMoniLoggerCall"


    // $ANTLR start "ruleMoniLoggerCall"
    // InternalMoniLog4DSL.g:762:1: ruleMoniLoggerCall : ( ( rule__MoniLoggerCall__Alternatives ) ) ;
    public final void ruleMoniLoggerCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:766:2: ( ( ( rule__MoniLoggerCall__Alternatives ) ) )
            // InternalMoniLog4DSL.g:767:2: ( ( rule__MoniLoggerCall__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:767:2: ( ( rule__MoniLoggerCall__Alternatives ) )
            // InternalMoniLog4DSL.g:768:3: ( rule__MoniLoggerCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:769:3: ( rule__MoniLoggerCall__Alternatives )
            // InternalMoniLog4DSL.g:769:4: rule__MoniLoggerCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoniLoggerCall"


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog4DSL.g:778:1: entryRuleStreamEvent : ruleStreamEvent EOF ;
    public final void entryRuleStreamEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:779:1: ( ruleStreamEvent EOF )
            // InternalMoniLog4DSL.g:780:1: ruleStreamEvent EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStreamEvent"


    // $ANTLR start "ruleStreamEvent"
    // InternalMoniLog4DSL.g:787:1: ruleStreamEvent : ( ( rule__StreamEvent__Group__0 ) ) ;
    public final void ruleStreamEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:791:2: ( ( ( rule__StreamEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:792:2: ( ( rule__StreamEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:792:2: ( ( rule__StreamEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:793:3: ( rule__StreamEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:794:3: ( rule__StreamEvent__Group__0 )
            // InternalMoniLog4DSL.g:794:4: rule__StreamEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamEvent"


    // $ANTLR start "entryRuleEmptyOrPropertyValue"
    // InternalMoniLog4DSL.g:803:1: entryRuleEmptyOrPropertyValue : ruleEmptyOrPropertyValue EOF ;
    public final void entryRuleEmptyOrPropertyValue() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:804:1: ( ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog4DSL.g:805:1: ruleEmptyOrPropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleEmptyOrPropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEmptyOrPropertyValue"


    // $ANTLR start "ruleEmptyOrPropertyValue"
    // InternalMoniLog4DSL.g:812:1: ruleEmptyOrPropertyValue : ( ( rule__EmptyOrPropertyValue__Alternatives ) ) ;
    public final void ruleEmptyOrPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:816:2: ( ( ( rule__EmptyOrPropertyValue__Alternatives ) ) )
            // InternalMoniLog4DSL.g:817:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:817:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            // InternalMoniLog4DSL.g:818:3: ( rule__EmptyOrPropertyValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:819:3: ( rule__EmptyOrPropertyValue__Alternatives )
            // InternalMoniLog4DSL.g:819:4: rule__EmptyOrPropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEmptyOrPropertyValue"


    // $ANTLR start "entryRuleExpression"
    // InternalMoniLog4DSL.g:828:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:829:1: ( ruleExpression EOF )
            // InternalMoniLog4DSL.g:830:1: ruleExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMoniLog4DSL.g:837:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:841:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMoniLog4DSL.g:842:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:842:2: ( ( rule__Expression__Alternatives ) )
            // InternalMoniLog4DSL.g:843:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:844:3: ( rule__Expression__Alternatives )
            // InternalMoniLog4DSL.g:844:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleParameterReference"
    // InternalMoniLog4DSL.g:853:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:854:1: ( ruleParameterReference EOF )
            // InternalMoniLog4DSL.g:855:1: ruleParameterReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterReferenceRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParameterReference"


    // $ANTLR start "ruleParameterReference"
    // InternalMoniLog4DSL.g:862:1: ruleParameterReference : ( ( rule__ParameterReference__ParameterAssignment ) ) ;
    public final void ruleParameterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:866:2: ( ( ( rule__ParameterReference__ParameterAssignment ) ) )
            // InternalMoniLog4DSL.g:867:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            {
            // InternalMoniLog4DSL.g:867:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            // InternalMoniLog4DSL.g:868:3: ( rule__ParameterReference__ParameterAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 
            }
            // InternalMoniLog4DSL.g:869:3: ( rule__ParameterReference__ParameterAssignment )
            // InternalMoniLog4DSL.g:869:4: rule__ParameterReference__ParameterAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ParameterReference__ParameterAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterReference"


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog4DSL.g:878:1: entryRuleLanguageExpression : ruleLanguageExpression EOF ;
    public final void entryRuleLanguageExpression() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:879:1: ( ruleLanguageExpression EOF )
            // InternalMoniLog4DSL.g:880:1: ruleLanguageExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLanguageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLanguageExpression"


    // $ANTLR start "ruleLanguageExpression"
    // InternalMoniLog4DSL.g:887:1: ruleLanguageExpression : ( ( rule__LanguageExpression__Alternatives ) ) ;
    public final void ruleLanguageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:891:2: ( ( ( rule__LanguageExpression__Alternatives ) ) )
            // InternalMoniLog4DSL.g:892:2: ( ( rule__LanguageExpression__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:892:2: ( ( rule__LanguageExpression__Alternatives ) )
            // InternalMoniLog4DSL.g:893:3: ( rule__LanguageExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:894:3: ( rule__LanguageExpression__Alternatives )
            // InternalMoniLog4DSL.g:894:4: rule__LanguageExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLanguageExpression"


    // $ANTLR start "entryRuleFQN"
    // InternalMoniLog4DSL.g:903:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:904:1: ( ruleFQN EOF )
            // InternalMoniLog4DSL.g:905:1: ruleFQN EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFQN"


    // $ANTLR start "ruleFQN"
    // InternalMoniLog4DSL.g:912:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:916:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMoniLog4DSL.g:917:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:917:2: ( ( rule__FQN__Group__0 ) )
            // InternalMoniLog4DSL.g:918:3: ( rule__FQN__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:919:3: ( rule__FQN__Group__0 )
            // InternalMoniLog4DSL.g:919:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFQN"


    // $ANTLR start "ruleMoniLoggerAnnotation"
    // InternalMoniLog4DSL.g:928:1: ruleMoniLoggerAnnotation : ( ( '@Inactive' ) ) ;
    public final void ruleMoniLoggerAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:932:1: ( ( ( '@Inactive' ) ) )
            // InternalMoniLog4DSL.g:933:2: ( ( '@Inactive' ) )
            {
            // InternalMoniLog4DSL.g:933:2: ( ( '@Inactive' ) )
            // InternalMoniLog4DSL.g:934:3: ( '@Inactive' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration()); 
            }
            // InternalMoniLog4DSL.g:935:3: ( '@Inactive' )
            // InternalMoniLog4DSL.g:935:4: '@Inactive'
            {
            match(input,11,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoniLoggerAnnotation"


    // $ANTLR start "ruleAppenderAnnotation"
    // InternalMoniLog4DSL.g:944:1: ruleAppenderAnnotation : ( ( '@Async' ) ) ;
    public final void ruleAppenderAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:948:1: ( ( ( '@Async' ) ) )
            // InternalMoniLog4DSL.g:949:2: ( ( '@Async' ) )
            {
            // InternalMoniLog4DSL.g:949:2: ( ( '@Async' ) )
            // InternalMoniLog4DSL.g:950:3: ( '@Async' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration()); 
            }
            // InternalMoniLog4DSL.g:951:3: ( '@Async' )
            // InternalMoniLog4DSL.g:951:4: '@Async'
            {
            match(input,12,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppenderAnnotation"


    // $ANTLR start "ruleLogLevel"
    // InternalMoniLog4DSL.g:960:1: ruleLogLevel : ( ( rule__LogLevel__Alternatives ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:964:1: ( ( ( rule__LogLevel__Alternatives ) ) )
            // InternalMoniLog4DSL.g:965:2: ( ( rule__LogLevel__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:965:2: ( ( rule__LogLevel__Alternatives ) )
            // InternalMoniLog4DSL.g:966:3: ( rule__LogLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogLevelAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:967:3: ( rule__LogLevel__Alternatives )
            // InternalMoniLog4DSL.g:967:4: rule__LogLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLogLevelAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogLevel"


    // $ANTLR start "ruleTemporalPatternKind"
    // InternalMoniLog4DSL.g:976:1: ruleTemporalPatternKind : ( ( rule__TemporalPatternKind__Alternatives ) ) ;
    public final void ruleTemporalPatternKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:980:1: ( ( ( rule__TemporalPatternKind__Alternatives ) ) )
            // InternalMoniLog4DSL.g:981:2: ( ( rule__TemporalPatternKind__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:981:2: ( ( rule__TemporalPatternKind__Alternatives ) )
            // InternalMoniLog4DSL.g:982:3: ( rule__TemporalPatternKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternKindAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:983:3: ( rule__TemporalPatternKind__Alternatives )
            // InternalMoniLog4DSL.g:983:4: rule__TemporalPatternKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPatternKind__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternKindAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalPatternKind"


    // $ANTLR start "rule__Document__DefaultLanguageIDAlternatives_0_1_0"
    // InternalMoniLog4DSL.g:991:1: rule__Document__DefaultLanguageIDAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Document__DefaultLanguageIDAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:995:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_ID) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_STRING) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMoniLog4DSL.g:996:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:996:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:997:3: RULE_ID
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getDefaultLanguageIDIDTerminalRuleCall_0_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getDefaultLanguageIDIDTerminalRuleCall_0_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1002:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:1002:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:1003:3: RULE_STRING
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getDefaultLanguageIDSTRINGTerminalRuleCall_0_1_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getDefaultLanguageIDSTRINGTerminalRuleCall_0_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__DefaultLanguageIDAlternatives_0_1_0"


    // $ANTLR start "rule__Appender__Alternatives"
    // InternalMoniLog4DSL.g:1012:1: rule__Appender__Alternatives : ( ( ruleLocalAppender ) | ( ruleExternalAppender ) );
    public final void rule__Appender__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1016:1: ( ( ruleLocalAppender ) | ( ruleExternalAppender ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMoniLog4DSL.g:1017:2: ( ruleLocalAppender )
                    {
                    // InternalMoniLog4DSL.g:1017:2: ( ruleLocalAppender )
                    // InternalMoniLog4DSL.g:1018:3: ruleLocalAppender
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAppenderAccess().getLocalAppenderParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalAppender();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAppenderAccess().getLocalAppenderParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1023:2: ( ruleExternalAppender )
                    {
                    // InternalMoniLog4DSL.g:1023:2: ( ruleExternalAppender )
                    // InternalMoniLog4DSL.g:1024:3: ruleExternalAppender
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAppenderAccess().getExternalAppenderParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExternalAppender();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAppenderAccess().getExternalAppenderParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Appender__Alternatives"


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalMoniLog4DSL.g:1033:1: rule__Layout__Alternatives : ( ( ruleLocalLayout ) | ( ruleExternalLayout ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1037:1: ( ( ruleLocalLayout ) | ( ruleExternalLayout ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMoniLog4DSL.g:1038:2: ( ruleLocalLayout )
                    {
                    // InternalMoniLog4DSL.g:1038:2: ( ruleLocalLayout )
                    // InternalMoniLog4DSL.g:1039:3: ruleLocalLayout
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLayoutAccess().getLocalLayoutParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLocalLayout();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLayoutAccess().getLocalLayoutParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1044:2: ( ruleExternalLayout )
                    {
                    // InternalMoniLog4DSL.g:1044:2: ( ruleExternalLayout )
                    // InternalMoniLog4DSL.g:1045:3: ruleExternalLayout
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLayoutAccess().getExternalLayoutParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExternalLayout();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLayoutAccess().getExternalLayoutParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Layout__Alternatives"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalMoniLog4DSL.g:1054:1: rule__Event__Alternatives : ( ( ruleASTEvent ) | ( ruleComplexEvent ) | ( ruleUserEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1058:1: ( ( ruleASTEvent ) | ( ruleComplexEvent ) | ( ruleUserEvent ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt4=1;
                }
                break;
            case 40:
                {
                alt4=2;
                }
                break;
            case 41:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMoniLog4DSL.g:1059:2: ( ruleASTEvent )
                    {
                    // InternalMoniLog4DSL.g:1059:2: ( ruleASTEvent )
                    // InternalMoniLog4DSL.g:1060:3: ruleASTEvent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getASTEventParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleASTEvent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getASTEventParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1065:2: ( ruleComplexEvent )
                    {
                    // InternalMoniLog4DSL.g:1065:2: ( ruleComplexEvent )
                    // InternalMoniLog4DSL.g:1066:3: ruleComplexEvent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getComplexEventParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleComplexEvent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getComplexEventParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1071:2: ( ruleUserEvent )
                    {
                    // InternalMoniLog4DSL.g:1071:2: ( ruleUserEvent )
                    // InternalMoniLog4DSL.g:1072:3: ruleUserEvent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getUserEventParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUserEvent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getUserEventParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalMoniLog4DSL.g:1081:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1085:1: ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMoniLog4DSL.g:1086:2: ( ( rule__Pattern__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1086:2: ( ( rule__Pattern__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1087:3: ( rule__Pattern__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1088:3: ( rule__Pattern__Group_0__0 )
                    // InternalMoniLog4DSL.g:1088:4: rule__Pattern__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1092:2: ( ( rule__Pattern__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1092:2: ( ( rule__Pattern__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1093:3: ( rule__Pattern__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1094:3: ( rule__Pattern__Group_1__0 )
                    // InternalMoniLog4DSL.g:1094:4: rule__Pattern__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1098:2: ( ( rule__Pattern__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1098:2: ( ( rule__Pattern__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:1099:3: ( rule__Pattern__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_2()); 
                    }
                    // InternalMoniLog4DSL.g:1100:3: ( rule__Pattern__Group_2__0 )
                    // InternalMoniLog4DSL.g:1100:4: rule__Pattern__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1104:2: ( ( rule__Pattern__Group_3__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1104:2: ( ( rule__Pattern__Group_3__0 ) )
                    // InternalMoniLog4DSL.g:1105:3: ( rule__Pattern__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_3()); 
                    }
                    // InternalMoniLog4DSL.g:1106:3: ( rule__Pattern__Group_3__0 )
                    // InternalMoniLog4DSL.g:1106:4: rule__Pattern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1110:2: ( ( rule__Pattern__Group_4__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1110:2: ( ( rule__Pattern__Group_4__0 ) )
                    // InternalMoniLog4DSL.g:1111:3: ( rule__Pattern__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_4()); 
                    }
                    // InternalMoniLog4DSL.g:1112:3: ( rule__Pattern__Group_4__0 )
                    // InternalMoniLog4DSL.g:1112:4: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPatternAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Alternatives"


    // $ANTLR start "rule__BoundType__Alternatives"
    // InternalMoniLog4DSL.g:1120:1: rule__BoundType__Alternatives : ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) );
    public final void rule__BoundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1124:1: ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 47:
                {
                alt6=2;
                }
                break;
            case 48:
                {
                alt6=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMoniLog4DSL.g:1125:2: ( ruleExactBound )
                    {
                    // InternalMoniLog4DSL.g:1125:2: ( ruleExactBound )
                    // InternalMoniLog4DSL.g:1126:3: ruleExactBound
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundTypeAccess().getExactBoundParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExactBound();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundTypeAccess().getExactBoundParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1131:2: ( ruleLowerBound )
                    {
                    // InternalMoniLog4DSL.g:1131:2: ( ruleLowerBound )
                    // InternalMoniLog4DSL.g:1132:3: ruleLowerBound
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundTypeAccess().getLowerBoundParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLowerBound();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundTypeAccess().getLowerBoundParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1137:2: ( ruleUpperBound )
                    {
                    // InternalMoniLog4DSL.g:1137:2: ( ruleUpperBound )
                    // InternalMoniLog4DSL.g:1138:3: ruleUpperBound
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBoundTypeAccess().getUpperBoundParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleUpperBound();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBoundTypeAccess().getUpperBoundParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BoundType__Alternatives"


    // $ANTLR start "rule__Scope__Alternatives"
    // InternalMoniLog4DSL.g:1147:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1151:1: ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMoniLog4DSL.g:1152:2: ( ( rule__Scope__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1152:2: ( ( rule__Scope__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1153:3: ( rule__Scope__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1154:3: ( rule__Scope__Group_0__0 )
                    // InternalMoniLog4DSL.g:1154:4: rule__Scope__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScopeAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1158:2: ( ( rule__Scope__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1158:2: ( ( rule__Scope__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1159:3: ( rule__Scope__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1160:3: ( rule__Scope__Group_1__0 )
                    // InternalMoniLog4DSL.g:1160:4: rule__Scope__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScopeAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1164:2: ( ( rule__Scope__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1164:2: ( ( rule__Scope__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:1165:3: ( rule__Scope__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_2()); 
                    }
                    // InternalMoniLog4DSL.g:1166:3: ( rule__Scope__Group_2__0 )
                    // InternalMoniLog4DSL.g:1166:4: rule__Scope__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScopeAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1170:2: ( ( rule__Scope__Group_3__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1170:2: ( ( rule__Scope__Group_3__0 ) )
                    // InternalMoniLog4DSL.g:1171:3: ( rule__Scope__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_3()); 
                    }
                    // InternalMoniLog4DSL.g:1172:3: ( rule__Scope__Group_3__0 )
                    // InternalMoniLog4DSL.g:1172:4: rule__Scope__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScopeAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1176:2: ( ( rule__Scope__Group_4__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1176:2: ( ( rule__Scope__Group_4__0 ) )
                    // InternalMoniLog4DSL.g:1177:3: ( rule__Scope__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_4()); 
                    }
                    // InternalMoniLog4DSL.g:1178:3: ( rule__Scope__Group_4__0 )
                    // InternalMoniLog4DSL.g:1178:4: rule__Scope__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getScopeAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalMoniLog4DSL.g:1186:1: rule__Action__Alternatives : ( ( ruleLanguageExpression ) | ( ruleAppenderCall ) | ( ruleEmitEvent ) | ( ruleMoniLoggerCall ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1190:1: ( ( ruleLanguageExpression ) | ( ruleAppenderCall ) | ( ruleEmitEvent ) | ( ruleMoniLoggerCall ) )
            int alt8=4;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==55) ) {
                    switch ( input.LA(3) ) {
                    case 58:
                    case 59:
                        {
                        alt8=4;
                        }
                        break;
                    case RULE_ID:
                    case 56:
                        {
                        alt8=2;
                        }
                        break;
                    case 57:
                        {
                        alt8=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA8_1==28) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMoniLog4DSL.g:1191:2: ( ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:1191:2: ( ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:1192:3: ruleLanguageExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getLanguageExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLanguageExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getLanguageExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1197:2: ( ruleAppenderCall )
                    {
                    // InternalMoniLog4DSL.g:1197:2: ( ruleAppenderCall )
                    // InternalMoniLog4DSL.g:1198:3: ruleAppenderCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getAppenderCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleAppenderCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getAppenderCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1203:2: ( ruleEmitEvent )
                    {
                    // InternalMoniLog4DSL.g:1203:2: ( ruleEmitEvent )
                    // InternalMoniLog4DSL.g:1204:3: ruleEmitEvent
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getEmitEventParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleEmitEvent();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getEmitEventParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1209:2: ( ruleMoniLoggerCall )
                    {
                    // InternalMoniLog4DSL.g:1209:2: ( ruleMoniLoggerCall )
                    // InternalMoniLog4DSL.g:1210:3: ruleMoniLoggerCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getMoniLoggerCallParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMoniLoggerCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getMoniLoggerCallParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__AppenderCallArgument__Alternatives"
    // InternalMoniLog4DSL.g:1219:1: rule__AppenderCallArgument__Alternatives : ( ( ruleExpression ) | ( ruleLayoutCall ) );
    public final void rule__AppenderCallArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1223:1: ( ( ruleExpression ) | ( ruleLayoutCall ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==55) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||(LA9_1>=28 && LA9_1<=30)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoniLog4DSL.g:1224:2: ( ruleExpression )
                    {
                    // InternalMoniLog4DSL.g:1224:2: ( ruleExpression )
                    // InternalMoniLog4DSL.g:1225:3: ruleExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAppenderCallArgumentAccess().getExpressionParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAppenderCallArgumentAccess().getExpressionParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1230:2: ( ruleLayoutCall )
                    {
                    // InternalMoniLog4DSL.g:1230:2: ( ruleLayoutCall )
                    // InternalMoniLog4DSL.g:1231:3: ruleLayoutCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAppenderCallArgumentAccess().getLayoutCallParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLayoutCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAppenderCallArgumentAccess().getLayoutCallParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCallArgument__Alternatives"


    // $ANTLR start "rule__MoniLoggerCall__Alternatives"
    // InternalMoniLog4DSL.g:1240:1: rule__MoniLoggerCall__Alternatives : ( ( ( rule__MoniLoggerCall__Group_0__0 ) ) | ( ( rule__MoniLoggerCall__Group_1__0 ) ) );
    public final void rule__MoniLoggerCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1244:1: ( ( ( rule__MoniLoggerCall__Group_0__0 ) ) | ( ( rule__MoniLoggerCall__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==55) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==59) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==58) ) {
                        alt10=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoniLog4DSL.g:1245:2: ( ( rule__MoniLoggerCall__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1245:2: ( ( rule__MoniLoggerCall__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1246:3: ( rule__MoniLoggerCall__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMoniLoggerCallAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1247:3: ( rule__MoniLoggerCall__Group_0__0 )
                    // InternalMoniLog4DSL.g:1247:4: rule__MoniLoggerCall__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLoggerCall__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMoniLoggerCallAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1251:2: ( ( rule__MoniLoggerCall__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1251:2: ( ( rule__MoniLoggerCall__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1252:3: ( rule__MoniLoggerCall__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMoniLoggerCallAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1253:3: ( rule__MoniLoggerCall__Group_1__0 )
                    // InternalMoniLog4DSL.g:1253:4: rule__MoniLoggerCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLoggerCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMoniLoggerCallAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Alternatives"


    // $ANTLR start "rule__EmptyOrPropertyValue__Alternatives"
    // InternalMoniLog4DSL.g:1261:1: rule__EmptyOrPropertyValue__Alternatives : ( ( () ) | ( ( rule__EmptyOrPropertyValue__Group_1__0 ) ) );
    public final void rule__EmptyOrPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1265:1: ( ( () ) | ( ( rule__EmptyOrPropertyValue__Group_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||LA11_0==30||LA11_0==37) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_ID) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMoniLog4DSL.g:1266:2: ( () )
                    {
                    // InternalMoniLog4DSL.g:1266:2: ( () )
                    // InternalMoniLog4DSL.g:1267:3: ()
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    }
                    // InternalMoniLog4DSL.g:1268:3: ()
                    // InternalMoniLog4DSL.g:1268:4: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1272:2: ( ( rule__EmptyOrPropertyValue__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1272:2: ( ( rule__EmptyOrPropertyValue__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1273:3: ( rule__EmptyOrPropertyValue__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1274:3: ( rule__EmptyOrPropertyValue__Group_1__0 )
                    // InternalMoniLog4DSL.g:1274:4: rule__EmptyOrPropertyValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmptyOrPropertyValue__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMoniLog4DSL.g:1282:1: rule__Expression__Alternatives : ( ( ruleParameterReference ) | ( ruleLanguageExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1286:1: ( ( ruleParameterReference ) | ( ruleLanguageExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==28) ) {
                    alt12=2;
                }
                else if ( (LA12_1==EOF||(LA12_1>=29 && LA12_1<=30)||LA12_1==37) ) {
                    alt12=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0==RULE_STRING) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoniLog4DSL.g:1287:2: ( ruleParameterReference )
                    {
                    // InternalMoniLog4DSL.g:1287:2: ( ruleParameterReference )
                    // InternalMoniLog4DSL.g:1288:3: ruleParameterReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getParameterReferenceParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleParameterReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getParameterReferenceParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1293:2: ( ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:1293:2: ( ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:1294:3: ruleLanguageExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getLanguageExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleLanguageExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getExpressionAccess().getLanguageExpressionParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__LanguageExpression__Alternatives"
    // InternalMoniLog4DSL.g:1303:1: rule__LanguageExpression__Alternatives : ( ( ( rule__LanguageExpression__Group_0__0 ) ) | ( ( rule__LanguageExpression__Group_1__0 ) ) );
    public final void rule__LanguageExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1307:1: ( ( ( rule__LanguageExpression__Group_0__0 ) ) | ( ( rule__LanguageExpression__Group_1__0 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_STRING) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoniLog4DSL.g:1308:2: ( ( rule__LanguageExpression__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1308:2: ( ( rule__LanguageExpression__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1309:3: ( rule__LanguageExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLanguageExpressionAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1310:3: ( rule__LanguageExpression__Group_0__0 )
                    // InternalMoniLog4DSL.g:1310:4: rule__LanguageExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLanguageExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1314:2: ( ( rule__LanguageExpression__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1314:2: ( ( rule__LanguageExpression__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1315:3: ( rule__LanguageExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLanguageExpressionAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1316:3: ( rule__LanguageExpression__Group_1__0 )
                    // InternalMoniLog4DSL.g:1316:4: rule__LanguageExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLanguageExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Alternatives"


    // $ANTLR start "rule__LogLevel__Alternatives"
    // InternalMoniLog4DSL.g:1324:1: rule__LogLevel__Alternatives : ( ( ( 'INFO' ) ) | ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) );
    public final void rule__LogLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1328:1: ( ( ( 'INFO' ) ) | ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt14=1;
                }
                break;
            case 14:
                {
                alt14=2;
                }
                break;
            case 15:
                {
                alt14=3;
                }
                break;
            case 16:
                {
                alt14=4;
                }
                break;
            case 17:
                {
                alt14=5;
                }
                break;
            case 18:
                {
                alt14=6;
                }
                break;
            case 19:
                {
                alt14=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMoniLog4DSL.g:1329:2: ( ( 'INFO' ) )
                    {
                    // InternalMoniLog4DSL.g:1329:2: ( ( 'INFO' ) )
                    // InternalMoniLog4DSL.g:1330:3: ( 'INFO' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0()); 
                    }
                    // InternalMoniLog4DSL.g:1331:3: ( 'INFO' )
                    // InternalMoniLog4DSL.g:1331:4: 'INFO'
                    {
                    match(input,13,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1335:2: ( ( 'CONFIG' ) )
                    {
                    // InternalMoniLog4DSL.g:1335:2: ( ( 'CONFIG' ) )
                    // InternalMoniLog4DSL.g:1336:3: ( 'CONFIG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1()); 
                    }
                    // InternalMoniLog4DSL.g:1337:3: ( 'CONFIG' )
                    // InternalMoniLog4DSL.g:1337:4: 'CONFIG'
                    {
                    match(input,14,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1341:2: ( ( 'FINE' ) )
                    {
                    // InternalMoniLog4DSL.g:1341:2: ( ( 'FINE' ) )
                    // InternalMoniLog4DSL.g:1342:3: ( 'FINE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2()); 
                    }
                    // InternalMoniLog4DSL.g:1343:3: ( 'FINE' )
                    // InternalMoniLog4DSL.g:1343:4: 'FINE'
                    {
                    match(input,15,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1347:2: ( ( 'FINER' ) )
                    {
                    // InternalMoniLog4DSL.g:1347:2: ( ( 'FINER' ) )
                    // InternalMoniLog4DSL.g:1348:3: ( 'FINER' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3()); 
                    }
                    // InternalMoniLog4DSL.g:1349:3: ( 'FINER' )
                    // InternalMoniLog4DSL.g:1349:4: 'FINER'
                    {
                    match(input,16,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1353:2: ( ( 'FINEST' ) )
                    {
                    // InternalMoniLog4DSL.g:1353:2: ( ( 'FINEST' ) )
                    // InternalMoniLog4DSL.g:1354:3: ( 'FINEST' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4()); 
                    }
                    // InternalMoniLog4DSL.g:1355:3: ( 'FINEST' )
                    // InternalMoniLog4DSL.g:1355:4: 'FINEST'
                    {
                    match(input,17,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog4DSL.g:1359:2: ( ( 'SEVERE' ) )
                    {
                    // InternalMoniLog4DSL.g:1359:2: ( ( 'SEVERE' ) )
                    // InternalMoniLog4DSL.g:1360:3: ( 'SEVERE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5()); 
                    }
                    // InternalMoniLog4DSL.g:1361:3: ( 'SEVERE' )
                    // InternalMoniLog4DSL.g:1361:4: 'SEVERE'
                    {
                    match(input,18,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog4DSL.g:1365:2: ( ( 'WARNING' ) )
                    {
                    // InternalMoniLog4DSL.g:1365:2: ( ( 'WARNING' ) )
                    // InternalMoniLog4DSL.g:1366:3: ( 'WARNING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6()); 
                    }
                    // InternalMoniLog4DSL.g:1367:3: ( 'WARNING' )
                    // InternalMoniLog4DSL.g:1367:4: 'WARNING'
                    {
                    match(input,19,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogLevel__Alternatives"


    // $ANTLR start "rule__TemporalPatternKind__Alternatives"
    // InternalMoniLog4DSL.g:1375:1: rule__TemporalPatternKind__Alternatives : ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) );
    public final void rule__TemporalPatternKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1379:1: ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) )
            int alt15=4;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt15=1;
                }
                break;
            case 21:
                {
                alt15=2;
                }
                break;
            case 22:
                {
                alt15=3;
                }
                break;
            case 23:
                {
                alt15=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMoniLog4DSL.g:1380:2: ( ( 'S' ) )
                    {
                    // InternalMoniLog4DSL.g:1380:2: ( ( 'S' ) )
                    // InternalMoniLog4DSL.g:1381:3: ( 'S' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0()); 
                    }
                    // InternalMoniLog4DSL.g:1382:3: ( 'S' )
                    // InternalMoniLog4DSL.g:1382:4: 'S'
                    {
                    match(input,20,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1386:2: ( ( 'V' ) )
                    {
                    // InternalMoniLog4DSL.g:1386:2: ( ( 'V' ) )
                    // InternalMoniLog4DSL.g:1387:3: ( 'V' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1()); 
                    }
                    // InternalMoniLog4DSL.g:1388:3: ( 'V' )
                    // InternalMoniLog4DSL.g:1388:4: 'V'
                    {
                    match(input,21,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1392:2: ( ( 'nS' ) )
                    {
                    // InternalMoniLog4DSL.g:1392:2: ( ( 'nS' ) )
                    // InternalMoniLog4DSL.g:1393:3: ( 'nS' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2()); 
                    }
                    // InternalMoniLog4DSL.g:1394:3: ( 'nS' )
                    // InternalMoniLog4DSL.g:1394:4: 'nS'
                    {
                    match(input,22,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1398:2: ( ( 'nV' ) )
                    {
                    // InternalMoniLog4DSL.g:1398:2: ( ( 'nV' ) )
                    // InternalMoniLog4DSL.g:1399:3: ( 'nV' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3()); 
                    }
                    // InternalMoniLog4DSL.g:1400:3: ( 'nV' )
                    // InternalMoniLog4DSL.g:1400:4: 'nV'
                    {
                    match(input,23,FOLLOW_2); if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPatternKind__Alternatives"


    // $ANTLR start "rule__Document__Group__0"
    // InternalMoniLog4DSL.g:1408:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1412:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalMoniLog4DSL.g:1413:2: rule__Document__Group__0__Impl rule__Document__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Document__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Document__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0"


    // $ANTLR start "rule__Document__Group__0__Impl"
    // InternalMoniLog4DSL.g:1420:1: rule__Document__Group__0__Impl : ( ( rule__Document__Group_0__0 )? ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1424:1: ( ( ( rule__Document__Group_0__0 )? ) )
            // InternalMoniLog4DSL.g:1425:1: ( ( rule__Document__Group_0__0 )? )
            {
            // InternalMoniLog4DSL.g:1425:1: ( ( rule__Document__Group_0__0 )? )
            // InternalMoniLog4DSL.g:1426:2: ( rule__Document__Group_0__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getGroup_0()); 
            }
            // InternalMoniLog4DSL.g:1427:2: ( rule__Document__Group_0__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoniLog4DSL.g:1427:3: rule__Document__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__0__Impl"


    // $ANTLR start "rule__Document__Group__1"
    // InternalMoniLog4DSL.g:1435:1: rule__Document__Group__1 : rule__Document__Group__1__Impl ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1439:1: ( rule__Document__Group__1__Impl )
            // InternalMoniLog4DSL.g:1440:2: rule__Document__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1"


    // $ANTLR start "rule__Document__Group__1__Impl"
    // InternalMoniLog4DSL.g:1446:1: rule__Document__Group__1__Impl : ( ( rule__Document__UnorderedGroup_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1450:1: ( ( ( rule__Document__UnorderedGroup_1 ) ) )
            // InternalMoniLog4DSL.g:1451:1: ( ( rule__Document__UnorderedGroup_1 ) )
            {
            // InternalMoniLog4DSL.g:1451:1: ( ( rule__Document__UnorderedGroup_1 ) )
            // InternalMoniLog4DSL.g:1452:2: ( rule__Document__UnorderedGroup_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getUnorderedGroup_1()); 
            }
            // InternalMoniLog4DSL.g:1453:2: ( rule__Document__UnorderedGroup_1 )
            // InternalMoniLog4DSL.g:1453:3: rule__Document__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__Document__UnorderedGroup_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getUnorderedGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__1__Impl"


    // $ANTLR start "rule__Document__Group_0__0"
    // InternalMoniLog4DSL.g:1462:1: rule__Document__Group_0__0 : rule__Document__Group_0__0__Impl rule__Document__Group_0__1 ;
    public final void rule__Document__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1466:1: ( rule__Document__Group_0__0__Impl rule__Document__Group_0__1 )
            // InternalMoniLog4DSL.g:1467:2: rule__Document__Group_0__0__Impl rule__Document__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Document__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Document__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group_0__0"


    // $ANTLR start "rule__Document__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:1474:1: rule__Document__Group_0__0__Impl : ( 'default-language' ) ;
    public final void rule__Document__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1478:1: ( ( 'default-language' ) )
            // InternalMoniLog4DSL.g:1479:1: ( 'default-language' )
            {
            // InternalMoniLog4DSL.g:1479:1: ( 'default-language' )
            // InternalMoniLog4DSL.g:1480:2: 'default-language'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getDefaultLanguageKeyword_0_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getDefaultLanguageKeyword_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group_0__0__Impl"


    // $ANTLR start "rule__Document__Group_0__1"
    // InternalMoniLog4DSL.g:1489:1: rule__Document__Group_0__1 : rule__Document__Group_0__1__Impl ;
    public final void rule__Document__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1493:1: ( rule__Document__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:1494:2: rule__Document__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group_0__1"


    // $ANTLR start "rule__Document__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:1500:1: rule__Document__Group_0__1__Impl : ( ( rule__Document__DefaultLanguageIDAssignment_0_1 ) ) ;
    public final void rule__Document__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1504:1: ( ( ( rule__Document__DefaultLanguageIDAssignment_0_1 ) ) )
            // InternalMoniLog4DSL.g:1505:1: ( ( rule__Document__DefaultLanguageIDAssignment_0_1 ) )
            {
            // InternalMoniLog4DSL.g:1505:1: ( ( rule__Document__DefaultLanguageIDAssignment_0_1 ) )
            // InternalMoniLog4DSL.g:1506:2: ( rule__Document__DefaultLanguageIDAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getDefaultLanguageIDAssignment_0_1()); 
            }
            // InternalMoniLog4DSL.g:1507:2: ( rule__Document__DefaultLanguageIDAssignment_0_1 )
            // InternalMoniLog4DSL.g:1507:3: rule__Document__DefaultLanguageIDAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Document__DefaultLanguageIDAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getDefaultLanguageIDAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group_0__1__Impl"


    // $ANTLR start "rule__LocalAppender__Group__0"
    // InternalMoniLog4DSL.g:1516:1: rule__LocalAppender__Group__0 : rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1 ;
    public final void rule__LocalAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1520:1: ( rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1 )
            // InternalMoniLog4DSL.g:1521:2: rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__LocalAppender__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__0"


    // $ANTLR start "rule__LocalAppender__Group__0__Impl"
    // InternalMoniLog4DSL.g:1528:1: rule__LocalAppender__Group__0__Impl : ( ( rule__LocalAppender__AnnotationsAssignment_0 )* ) ;
    public final void rule__LocalAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1532:1: ( ( ( rule__LocalAppender__AnnotationsAssignment_0 )* ) )
            // InternalMoniLog4DSL.g:1533:1: ( ( rule__LocalAppender__AnnotationsAssignment_0 )* )
            {
            // InternalMoniLog4DSL.g:1533:1: ( ( rule__LocalAppender__AnnotationsAssignment_0 )* )
            // InternalMoniLog4DSL.g:1534:2: ( rule__LocalAppender__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getAnnotationsAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:1535:2: ( rule__LocalAppender__AnnotationsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1535:3: rule__LocalAppender__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__LocalAppender__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__0__Impl"


    // $ANTLR start "rule__LocalAppender__Group__1"
    // InternalMoniLog4DSL.g:1543:1: rule__LocalAppender__Group__1 : rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2 ;
    public final void rule__LocalAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1547:1: ( rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2 )
            // InternalMoniLog4DSL.g:1548:2: rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__LocalAppender__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__1"


    // $ANTLR start "rule__LocalAppender__Group__1__Impl"
    // InternalMoniLog4DSL.g:1555:1: rule__LocalAppender__Group__1__Impl : ( 'appender' ) ;
    public final void rule__LocalAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1559:1: ( ( 'appender' ) )
            // InternalMoniLog4DSL.g:1560:1: ( 'appender' )
            {
            // InternalMoniLog4DSL.g:1560:1: ( 'appender' )
            // InternalMoniLog4DSL.g:1561:2: 'appender'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getAppenderKeyword_1()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getAppenderKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__1__Impl"


    // $ANTLR start "rule__LocalAppender__Group__2"
    // InternalMoniLog4DSL.g:1570:1: rule__LocalAppender__Group__2 : rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3 ;
    public final void rule__LocalAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1574:1: ( rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3 )
            // InternalMoniLog4DSL.g:1575:2: rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LocalAppender__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__2"


    // $ANTLR start "rule__LocalAppender__Group__2__Impl"
    // InternalMoniLog4DSL.g:1582:1: rule__LocalAppender__Group__2__Impl : ( ( rule__LocalAppender__NameAssignment_2 ) ) ;
    public final void rule__LocalAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1586:1: ( ( ( rule__LocalAppender__NameAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:1587:1: ( ( rule__LocalAppender__NameAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:1587:1: ( ( rule__LocalAppender__NameAssignment_2 ) )
            // InternalMoniLog4DSL.g:1588:2: ( rule__LocalAppender__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getNameAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:1589:2: ( rule__LocalAppender__NameAssignment_2 )
            // InternalMoniLog4DSL.g:1589:3: rule__LocalAppender__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__2__Impl"


    // $ANTLR start "rule__LocalAppender__Group__3"
    // InternalMoniLog4DSL.g:1597:1: rule__LocalAppender__Group__3 : rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4 ;
    public final void rule__LocalAppender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1601:1: ( rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4 )
            // InternalMoniLog4DSL.g:1602:2: rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__LocalAppender__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__3"


    // $ANTLR start "rule__LocalAppender__Group__3__Impl"
    // InternalMoniLog4DSL.g:1609:1: rule__LocalAppender__Group__3__Impl : ( ( rule__LocalAppender__Group_3__0 )? ) ;
    public final void rule__LocalAppender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1613:1: ( ( ( rule__LocalAppender__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:1614:1: ( ( rule__LocalAppender__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:1614:1: ( ( rule__LocalAppender__Group_3__0 )? )
            // InternalMoniLog4DSL.g:1615:2: ( rule__LocalAppender__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:1616:2: ( rule__LocalAppender__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==28) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoniLog4DSL.g:1616:3: rule__LocalAppender__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalAppender__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__3__Impl"


    // $ANTLR start "rule__LocalAppender__Group__4"
    // InternalMoniLog4DSL.g:1624:1: rule__LocalAppender__Group__4 : rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5 ;
    public final void rule__LocalAppender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1628:1: ( rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5 )
            // InternalMoniLog4DSL.g:1629:2: rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__LocalAppender__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__4"


    // $ANTLR start "rule__LocalAppender__Group__4__Impl"
    // InternalMoniLog4DSL.g:1636:1: rule__LocalAppender__Group__4__Impl : ( '{' ) ;
    public final void rule__LocalAppender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1640:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:1641:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:1641:1: ( '{' )
            // InternalMoniLog4DSL.g:1642:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__4__Impl"


    // $ANTLR start "rule__LocalAppender__Group__5"
    // InternalMoniLog4DSL.g:1651:1: rule__LocalAppender__Group__5 : rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6 ;
    public final void rule__LocalAppender__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1655:1: ( rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6 )
            // InternalMoniLog4DSL.g:1656:2: rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__LocalAppender__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__5"


    // $ANTLR start "rule__LocalAppender__Group__5__Impl"
    // InternalMoniLog4DSL.g:1663:1: rule__LocalAppender__Group__5__Impl : ( ( rule__LocalAppender__CallsAssignment_5 ) ) ;
    public final void rule__LocalAppender__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1667:1: ( ( ( rule__LocalAppender__CallsAssignment_5 ) ) )
            // InternalMoniLog4DSL.g:1668:1: ( ( rule__LocalAppender__CallsAssignment_5 ) )
            {
            // InternalMoniLog4DSL.g:1668:1: ( ( rule__LocalAppender__CallsAssignment_5 ) )
            // InternalMoniLog4DSL.g:1669:2: ( rule__LocalAppender__CallsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAssignment_5()); 
            }
            // InternalMoniLog4DSL.g:1670:2: ( rule__LocalAppender__CallsAssignment_5 )
            // InternalMoniLog4DSL.g:1670:3: rule__LocalAppender__CallsAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__CallsAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getCallsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__5__Impl"


    // $ANTLR start "rule__LocalAppender__Group__6"
    // InternalMoniLog4DSL.g:1678:1: rule__LocalAppender__Group__6 : rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7 ;
    public final void rule__LocalAppender__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1682:1: ( rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7 )
            // InternalMoniLog4DSL.g:1683:2: rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7
            {
            pushFollow(FOLLOW_9);
            rule__LocalAppender__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__6"


    // $ANTLR start "rule__LocalAppender__Group__6__Impl"
    // InternalMoniLog4DSL.g:1690:1: rule__LocalAppender__Group__6__Impl : ( ( rule__LocalAppender__Group_6__0 )* ) ;
    public final void rule__LocalAppender__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1694:1: ( ( ( rule__LocalAppender__Group_6__0 )* ) )
            // InternalMoniLog4DSL.g:1695:1: ( ( rule__LocalAppender__Group_6__0 )* )
            {
            // InternalMoniLog4DSL.g:1695:1: ( ( rule__LocalAppender__Group_6__0 )* )
            // InternalMoniLog4DSL.g:1696:2: ( rule__LocalAppender__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_6()); 
            }
            // InternalMoniLog4DSL.g:1697:2: ( rule__LocalAppender__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1697:3: rule__LocalAppender__Group_6__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__LocalAppender__Group_6__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__6__Impl"


    // $ANTLR start "rule__LocalAppender__Group__7"
    // InternalMoniLog4DSL.g:1705:1: rule__LocalAppender__Group__7 : rule__LocalAppender__Group__7__Impl ;
    public final void rule__LocalAppender__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1709:1: ( rule__LocalAppender__Group__7__Impl )
            // InternalMoniLog4DSL.g:1710:2: rule__LocalAppender__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__7"


    // $ANTLR start "rule__LocalAppender__Group__7__Impl"
    // InternalMoniLog4DSL.g:1716:1: rule__LocalAppender__Group__7__Impl : ( '}' ) ;
    public final void rule__LocalAppender__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1720:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:1721:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:1721:1: ( '}' )
            // InternalMoniLog4DSL.g:1722:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__7__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3__0"
    // InternalMoniLog4DSL.g:1732:1: rule__LocalAppender__Group_3__0 : rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1 ;
    public final void rule__LocalAppender__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1736:1: ( rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1 )
            // InternalMoniLog4DSL.g:1737:2: rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalAppender__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__0"


    // $ANTLR start "rule__LocalAppender__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:1744:1: rule__LocalAppender__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LocalAppender__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1748:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:1749:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:1749:1: ( '(' )
            // InternalMoniLog4DSL.g:1750:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__0__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3__1"
    // InternalMoniLog4DSL.g:1759:1: rule__LocalAppender__Group_3__1 : rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2 ;
    public final void rule__LocalAppender__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1763:1: ( rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2 )
            // InternalMoniLog4DSL.g:1764:2: rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__LocalAppender__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__1"


    // $ANTLR start "rule__LocalAppender__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:1771:1: rule__LocalAppender__Group_3__1__Impl : ( ( rule__LocalAppender__ParametersAssignment_3_1 ) ) ;
    public final void rule__LocalAppender__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1775:1: ( ( ( rule__LocalAppender__ParametersAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:1776:1: ( ( rule__LocalAppender__ParametersAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:1776:1: ( ( rule__LocalAppender__ParametersAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:1777:2: ( rule__LocalAppender__ParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParametersAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:1778:2: ( rule__LocalAppender__ParametersAssignment_3_1 )
            // InternalMoniLog4DSL.g:1778:3: rule__LocalAppender__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__ParametersAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getParametersAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__1__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3__2"
    // InternalMoniLog4DSL.g:1786:1: rule__LocalAppender__Group_3__2 : rule__LocalAppender__Group_3__2__Impl rule__LocalAppender__Group_3__3 ;
    public final void rule__LocalAppender__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1790:1: ( rule__LocalAppender__Group_3__2__Impl rule__LocalAppender__Group_3__3 )
            // InternalMoniLog4DSL.g:1791:2: rule__LocalAppender__Group_3__2__Impl rule__LocalAppender__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__LocalAppender__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__2"


    // $ANTLR start "rule__LocalAppender__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:1798:1: rule__LocalAppender__Group_3__2__Impl : ( ( rule__LocalAppender__Group_3_2__0 )* ) ;
    public final void rule__LocalAppender__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1802:1: ( ( ( rule__LocalAppender__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:1803:1: ( ( rule__LocalAppender__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:1803:1: ( ( rule__LocalAppender__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:1804:2: ( rule__LocalAppender__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:1805:2: ( rule__LocalAppender__Group_3_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==30) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1805:3: rule__LocalAppender__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__LocalAppender__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__2__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3__3"
    // InternalMoniLog4DSL.g:1813:1: rule__LocalAppender__Group_3__3 : rule__LocalAppender__Group_3__3__Impl ;
    public final void rule__LocalAppender__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1817:1: ( rule__LocalAppender__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:1818:2: rule__LocalAppender__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__3"


    // $ANTLR start "rule__LocalAppender__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:1824:1: rule__LocalAppender__Group_3__3__Impl : ( ')' ) ;
    public final void rule__LocalAppender__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1828:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:1829:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:1829:1: ( ')' )
            // InternalMoniLog4DSL.g:1830:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3__3__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3_2__0"
    // InternalMoniLog4DSL.g:1840:1: rule__LocalAppender__Group_3_2__0 : rule__LocalAppender__Group_3_2__0__Impl rule__LocalAppender__Group_3_2__1 ;
    public final void rule__LocalAppender__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1844:1: ( rule__LocalAppender__Group_3_2__0__Impl rule__LocalAppender__Group_3_2__1 )
            // InternalMoniLog4DSL.g:1845:2: rule__LocalAppender__Group_3_2__0__Impl rule__LocalAppender__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalAppender__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3_2__0"


    // $ANTLR start "rule__LocalAppender__Group_3_2__0__Impl"
    // InternalMoniLog4DSL.g:1852:1: rule__LocalAppender__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__LocalAppender__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1856:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:1857:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:1857:1: ( ',' )
            // InternalMoniLog4DSL.g:1858:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3_2__0__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3_2__1"
    // InternalMoniLog4DSL.g:1867:1: rule__LocalAppender__Group_3_2__1 : rule__LocalAppender__Group_3_2__1__Impl ;
    public final void rule__LocalAppender__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1871:1: ( rule__LocalAppender__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:1872:2: rule__LocalAppender__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3_2__1"


    // $ANTLR start "rule__LocalAppender__Group_3_2__1__Impl"
    // InternalMoniLog4DSL.g:1878:1: rule__LocalAppender__Group_3_2__1__Impl : ( ( rule__LocalAppender__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__LocalAppender__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1882:1: ( ( ( rule__LocalAppender__ParametersAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:1883:1: ( ( rule__LocalAppender__ParametersAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:1883:1: ( ( rule__LocalAppender__ParametersAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:1884:2: ( rule__LocalAppender__ParametersAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParametersAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:1885:2: ( rule__LocalAppender__ParametersAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:1885:3: rule__LocalAppender__ParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__ParametersAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getParametersAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_3_2__1__Impl"


    // $ANTLR start "rule__LocalAppender__Group_6__0"
    // InternalMoniLog4DSL.g:1894:1: rule__LocalAppender__Group_6__0 : rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1 ;
    public final void rule__LocalAppender__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1898:1: ( rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1 )
            // InternalMoniLog4DSL.g:1899:2: rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalAppender__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_6__0"


    // $ANTLR start "rule__LocalAppender__Group_6__0__Impl"
    // InternalMoniLog4DSL.g:1906:1: rule__LocalAppender__Group_6__0__Impl : ( ';' ) ;
    public final void rule__LocalAppender__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1910:1: ( ( ';' ) )
            // InternalMoniLog4DSL.g:1911:1: ( ';' )
            {
            // InternalMoniLog4DSL.g:1911:1: ( ';' )
            // InternalMoniLog4DSL.g:1912:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_6__0__Impl"


    // $ANTLR start "rule__LocalAppender__Group_6__1"
    // InternalMoniLog4DSL.g:1921:1: rule__LocalAppender__Group_6__1 : rule__LocalAppender__Group_6__1__Impl ;
    public final void rule__LocalAppender__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1925:1: ( rule__LocalAppender__Group_6__1__Impl )
            // InternalMoniLog4DSL.g:1926:2: rule__LocalAppender__Group_6__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_6__1"


    // $ANTLR start "rule__LocalAppender__Group_6__1__Impl"
    // InternalMoniLog4DSL.g:1932:1: rule__LocalAppender__Group_6__1__Impl : ( ( rule__LocalAppender__CallsAssignment_6_1 ) ) ;
    public final void rule__LocalAppender__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1936:1: ( ( ( rule__LocalAppender__CallsAssignment_6_1 ) ) )
            // InternalMoniLog4DSL.g:1937:1: ( ( rule__LocalAppender__CallsAssignment_6_1 ) )
            {
            // InternalMoniLog4DSL.g:1937:1: ( ( rule__LocalAppender__CallsAssignment_6_1 ) )
            // InternalMoniLog4DSL.g:1938:2: ( rule__LocalAppender__CallsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAssignment_6_1()); 
            }
            // InternalMoniLog4DSL.g:1939:2: ( rule__LocalAppender__CallsAssignment_6_1 )
            // InternalMoniLog4DSL.g:1939:3: rule__LocalAppender__CallsAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__CallsAssignment_6_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getCallsAssignment_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group_6__1__Impl"


    // $ANTLR start "rule__ExternalAppender__Group__0"
    // InternalMoniLog4DSL.g:1948:1: rule__ExternalAppender__Group__0 : rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1 ;
    public final void rule__ExternalAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1952:1: ( rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1 )
            // InternalMoniLog4DSL.g:1953:2: rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalAppender__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group__0"


    // $ANTLR start "rule__ExternalAppender__Group__0__Impl"
    // InternalMoniLog4DSL.g:1960:1: rule__ExternalAppender__Group__0__Impl : ( 'appender' ) ;
    public final void rule__ExternalAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1964:1: ( ( 'appender' ) )
            // InternalMoniLog4DSL.g:1965:1: ( 'appender' )
            {
            // InternalMoniLog4DSL.g:1965:1: ( 'appender' )
            // InternalMoniLog4DSL.g:1966:2: 'appender'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group__0__Impl"


    // $ANTLR start "rule__ExternalAppender__Group__1"
    // InternalMoniLog4DSL.g:1975:1: rule__ExternalAppender__Group__1 : rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2 ;
    public final void rule__ExternalAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1979:1: ( rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2 )
            // InternalMoniLog4DSL.g:1980:2: rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExternalAppender__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group__1"


    // $ANTLR start "rule__ExternalAppender__Group__1__Impl"
    // InternalMoniLog4DSL.g:1987:1: rule__ExternalAppender__Group__1__Impl : ( ( rule__ExternalAppender__NameAssignment_1 ) ) ;
    public final void rule__ExternalAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1991:1: ( ( ( rule__ExternalAppender__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:1992:1: ( ( rule__ExternalAppender__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:1992:1: ( ( rule__ExternalAppender__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:1993:2: ( rule__ExternalAppender__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:1994:2: ( rule__ExternalAppender__NameAssignment_1 )
            // InternalMoniLog4DSL.g:1994:3: rule__ExternalAppender__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group__1__Impl"


    // $ANTLR start "rule__ExternalAppender__Group__2"
    // InternalMoniLog4DSL.g:2002:1: rule__ExternalAppender__Group__2 : rule__ExternalAppender__Group__2__Impl ;
    public final void rule__ExternalAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2006:1: ( rule__ExternalAppender__Group__2__Impl )
            // InternalMoniLog4DSL.g:2007:2: rule__ExternalAppender__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group__2"


    // $ANTLR start "rule__ExternalAppender__Group__2__Impl"
    // InternalMoniLog4DSL.g:2013:1: rule__ExternalAppender__Group__2__Impl : ( ( rule__ExternalAppender__Group_2__0 )? ) ;
    public final void rule__ExternalAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2017:1: ( ( ( rule__ExternalAppender__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:2018:1: ( ( rule__ExternalAppender__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2018:1: ( ( rule__ExternalAppender__Group_2__0 )? )
            // InternalMoniLog4DSL.g:2019:2: ( rule__ExternalAppender__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:2020:2: ( rule__ExternalAppender__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==28) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoniLog4DSL.g:2020:3: rule__ExternalAppender__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalAppender__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group__2__Impl"


    // $ANTLR start "rule__ExternalAppender__Group_2__0"
    // InternalMoniLog4DSL.g:2029:1: rule__ExternalAppender__Group_2__0 : rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1 ;
    public final void rule__ExternalAppender__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2033:1: ( rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1 )
            // InternalMoniLog4DSL.g:2034:2: rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalAppender__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__0"


    // $ANTLR start "rule__ExternalAppender__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:2041:1: rule__ExternalAppender__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExternalAppender__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2045:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2046:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2046:1: ( '(' )
            // InternalMoniLog4DSL.g:2047:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalAppender__Group_2__1"
    // InternalMoniLog4DSL.g:2056:1: rule__ExternalAppender__Group_2__1 : rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2 ;
    public final void rule__ExternalAppender__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2060:1: ( rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2 )
            // InternalMoniLog4DSL.g:2061:2: rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__ExternalAppender__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__1"


    // $ANTLR start "rule__ExternalAppender__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:2068:1: rule__ExternalAppender__Group_2__1__Impl : ( ( rule__ExternalAppender__ParametersAssignment_2_1 ) ) ;
    public final void rule__ExternalAppender__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2072:1: ( ( ( rule__ExternalAppender__ParametersAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:2073:1: ( ( rule__ExternalAppender__ParametersAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2073:1: ( ( rule__ExternalAppender__ParametersAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:2074:2: ( rule__ExternalAppender__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParametersAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:2075:2: ( rule__ExternalAppender__ParametersAssignment_2_1 )
            // InternalMoniLog4DSL.g:2075:3: rule__ExternalAppender__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalAppender__Group_2__2"
    // InternalMoniLog4DSL.g:2083:1: rule__ExternalAppender__Group_2__2 : rule__ExternalAppender__Group_2__2__Impl rule__ExternalAppender__Group_2__3 ;
    public final void rule__ExternalAppender__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2087:1: ( rule__ExternalAppender__Group_2__2__Impl rule__ExternalAppender__Group_2__3 )
            // InternalMoniLog4DSL.g:2088:2: rule__ExternalAppender__Group_2__2__Impl rule__ExternalAppender__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__ExternalAppender__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__2"


    // $ANTLR start "rule__ExternalAppender__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:2095:1: rule__ExternalAppender__Group_2__2__Impl : ( ( rule__ExternalAppender__Group_2_2__0 )* ) ;
    public final void rule__ExternalAppender__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2099:1: ( ( ( rule__ExternalAppender__Group_2_2__0 )* ) )
            // InternalMoniLog4DSL.g:2100:1: ( ( rule__ExternalAppender__Group_2_2__0 )* )
            {
            // InternalMoniLog4DSL.g:2100:1: ( ( rule__ExternalAppender__Group_2_2__0 )* )
            // InternalMoniLog4DSL.g:2101:2: ( rule__ExternalAppender__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup_2_2()); 
            }
            // InternalMoniLog4DSL.g:2102:2: ( rule__ExternalAppender__Group_2_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==30) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2102:3: rule__ExternalAppender__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ExternalAppender__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__2__Impl"


    // $ANTLR start "rule__ExternalAppender__Group_2__3"
    // InternalMoniLog4DSL.g:2110:1: rule__ExternalAppender__Group_2__3 : rule__ExternalAppender__Group_2__3__Impl ;
    public final void rule__ExternalAppender__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2114:1: ( rule__ExternalAppender__Group_2__3__Impl )
            // InternalMoniLog4DSL.g:2115:2: rule__ExternalAppender__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__3"


    // $ANTLR start "rule__ExternalAppender__Group_2__3__Impl"
    // InternalMoniLog4DSL.g:2121:1: rule__ExternalAppender__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ExternalAppender__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2125:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2126:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2126:1: ( ')' )
            // InternalMoniLog4DSL.g:2127:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2__3__Impl"


    // $ANTLR start "rule__ExternalAppender__Group_2_2__0"
    // InternalMoniLog4DSL.g:2137:1: rule__ExternalAppender__Group_2_2__0 : rule__ExternalAppender__Group_2_2__0__Impl rule__ExternalAppender__Group_2_2__1 ;
    public final void rule__ExternalAppender__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2141:1: ( rule__ExternalAppender__Group_2_2__0__Impl rule__ExternalAppender__Group_2_2__1 )
            // InternalMoniLog4DSL.g:2142:2: rule__ExternalAppender__Group_2_2__0__Impl rule__ExternalAppender__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalAppender__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2_2__0"


    // $ANTLR start "rule__ExternalAppender__Group_2_2__0__Impl"
    // InternalMoniLog4DSL.g:2149:1: rule__ExternalAppender__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ExternalAppender__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2153:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2154:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2154:1: ( ',' )
            // InternalMoniLog4DSL.g:2155:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2_2__0__Impl"


    // $ANTLR start "rule__ExternalAppender__Group_2_2__1"
    // InternalMoniLog4DSL.g:2164:1: rule__ExternalAppender__Group_2_2__1 : rule__ExternalAppender__Group_2_2__1__Impl ;
    public final void rule__ExternalAppender__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2168:1: ( rule__ExternalAppender__Group_2_2__1__Impl )
            // InternalMoniLog4DSL.g:2169:2: rule__ExternalAppender__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2_2__1"


    // $ANTLR start "rule__ExternalAppender__Group_2_2__1__Impl"
    // InternalMoniLog4DSL.g:2175:1: rule__ExternalAppender__Group_2_2__1__Impl : ( ( rule__ExternalAppender__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__ExternalAppender__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2179:1: ( ( ( rule__ExternalAppender__ParametersAssignment_2_2_1 ) ) )
            // InternalMoniLog4DSL.g:2180:1: ( ( rule__ExternalAppender__ParametersAssignment_2_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2180:1: ( ( rule__ExternalAppender__ParametersAssignment_2_2_1 ) )
            // InternalMoniLog4DSL.g:2181:2: ( rule__ExternalAppender__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParametersAssignment_2_2_1()); 
            }
            // InternalMoniLog4DSL.g:2182:2: ( rule__ExternalAppender__ParametersAssignment_2_2_1 )
            // InternalMoniLog4DSL.g:2182:3: rule__ExternalAppender__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__ParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__Group_2_2__1__Impl"


    // $ANTLR start "rule__LocalLayout__Group__0"
    // InternalMoniLog4DSL.g:2191:1: rule__LocalLayout__Group__0 : rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1 ;
    public final void rule__LocalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2195:1: ( rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1 )
            // InternalMoniLog4DSL.g:2196:2: rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalLayout__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__0"


    // $ANTLR start "rule__LocalLayout__Group__0__Impl"
    // InternalMoniLog4DSL.g:2203:1: rule__LocalLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__LocalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2207:1: ( ( 'layout' ) )
            // InternalMoniLog4DSL.g:2208:1: ( 'layout' )
            {
            // InternalMoniLog4DSL.g:2208:1: ( 'layout' )
            // InternalMoniLog4DSL.g:2209:2: 'layout'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getLayoutKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getLayoutKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__0__Impl"


    // $ANTLR start "rule__LocalLayout__Group__1"
    // InternalMoniLog4DSL.g:2218:1: rule__LocalLayout__Group__1 : rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2 ;
    public final void rule__LocalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2222:1: ( rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2 )
            // InternalMoniLog4DSL.g:2223:2: rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__LocalLayout__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__1"


    // $ANTLR start "rule__LocalLayout__Group__1__Impl"
    // InternalMoniLog4DSL.g:2230:1: rule__LocalLayout__Group__1__Impl : ( ( rule__LocalLayout__NameAssignment_1 ) ) ;
    public final void rule__LocalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2234:1: ( ( ( rule__LocalLayout__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2235:1: ( ( rule__LocalLayout__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2235:1: ( ( rule__LocalLayout__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:2236:2: ( rule__LocalLayout__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:2237:2: ( rule__LocalLayout__NameAssignment_1 )
            // InternalMoniLog4DSL.g:2237:3: rule__LocalLayout__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__1__Impl"


    // $ANTLR start "rule__LocalLayout__Group__2"
    // InternalMoniLog4DSL.g:2245:1: rule__LocalLayout__Group__2 : rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3 ;
    public final void rule__LocalLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2249:1: ( rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3 )
            // InternalMoniLog4DSL.g:2250:2: rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__LocalLayout__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__2"


    // $ANTLR start "rule__LocalLayout__Group__2__Impl"
    // InternalMoniLog4DSL.g:2257:1: rule__LocalLayout__Group__2__Impl : ( ( rule__LocalLayout__Group_2__0 )? ) ;
    public final void rule__LocalLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2261:1: ( ( ( rule__LocalLayout__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:2262:1: ( ( rule__LocalLayout__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2262:1: ( ( rule__LocalLayout__Group_2__0 )? )
            // InternalMoniLog4DSL.g:2263:2: ( rule__LocalLayout__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:2264:2: ( rule__LocalLayout__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==28) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog4DSL.g:2264:3: rule__LocalLayout__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LocalLayout__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__2__Impl"


    // $ANTLR start "rule__LocalLayout__Group__3"
    // InternalMoniLog4DSL.g:2272:1: rule__LocalLayout__Group__3 : rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4 ;
    public final void rule__LocalLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2276:1: ( rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4 )
            // InternalMoniLog4DSL.g:2277:2: rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LocalLayout__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__3"


    // $ANTLR start "rule__LocalLayout__Group__3__Impl"
    // InternalMoniLog4DSL.g:2284:1: rule__LocalLayout__Group__3__Impl : ( '{' ) ;
    public final void rule__LocalLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2288:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:2289:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:2289:1: ( '{' )
            // InternalMoniLog4DSL.g:2290:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__3__Impl"


    // $ANTLR start "rule__LocalLayout__Group__4"
    // InternalMoniLog4DSL.g:2299:1: rule__LocalLayout__Group__4 : rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5 ;
    public final void rule__LocalLayout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2303:1: ( rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5 )
            // InternalMoniLog4DSL.g:2304:2: rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__LocalLayout__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__4"


    // $ANTLR start "rule__LocalLayout__Group__4__Impl"
    // InternalMoniLog4DSL.g:2311:1: rule__LocalLayout__Group__4__Impl : ( ( rule__LocalLayout__CallAssignment_4 ) ) ;
    public final void rule__LocalLayout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2315:1: ( ( ( rule__LocalLayout__CallAssignment_4 ) ) )
            // InternalMoniLog4DSL.g:2316:1: ( ( rule__LocalLayout__CallAssignment_4 ) )
            {
            // InternalMoniLog4DSL.g:2316:1: ( ( rule__LocalLayout__CallAssignment_4 ) )
            // InternalMoniLog4DSL.g:2317:2: ( rule__LocalLayout__CallAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getCallAssignment_4()); 
            }
            // InternalMoniLog4DSL.g:2318:2: ( rule__LocalLayout__CallAssignment_4 )
            // InternalMoniLog4DSL.g:2318:3: rule__LocalLayout__CallAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__CallAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getCallAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__4__Impl"


    // $ANTLR start "rule__LocalLayout__Group__5"
    // InternalMoniLog4DSL.g:2326:1: rule__LocalLayout__Group__5 : rule__LocalLayout__Group__5__Impl ;
    public final void rule__LocalLayout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2330:1: ( rule__LocalLayout__Group__5__Impl )
            // InternalMoniLog4DSL.g:2331:2: rule__LocalLayout__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__5"


    // $ANTLR start "rule__LocalLayout__Group__5__Impl"
    // InternalMoniLog4DSL.g:2337:1: rule__LocalLayout__Group__5__Impl : ( '}' ) ;
    public final void rule__LocalLayout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2341:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:2342:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:2342:1: ( '}' )
            // InternalMoniLog4DSL.g:2343:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group__5__Impl"


    // $ANTLR start "rule__LocalLayout__Group_2__0"
    // InternalMoniLog4DSL.g:2353:1: rule__LocalLayout__Group_2__0 : rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1 ;
    public final void rule__LocalLayout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2357:1: ( rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1 )
            // InternalMoniLog4DSL.g:2358:2: rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalLayout__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__0"


    // $ANTLR start "rule__LocalLayout__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:2365:1: rule__LocalLayout__Group_2__0__Impl : ( '(' ) ;
    public final void rule__LocalLayout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2369:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2370:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2370:1: ( '(' )
            // InternalMoniLog4DSL.g:2371:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__0__Impl"


    // $ANTLR start "rule__LocalLayout__Group_2__1"
    // InternalMoniLog4DSL.g:2380:1: rule__LocalLayout__Group_2__1 : rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2 ;
    public final void rule__LocalLayout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2384:1: ( rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2 )
            // InternalMoniLog4DSL.g:2385:2: rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__LocalLayout__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__1"


    // $ANTLR start "rule__LocalLayout__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:2392:1: rule__LocalLayout__Group_2__1__Impl : ( ( rule__LocalLayout__ParametersAssignment_2_1 ) ) ;
    public final void rule__LocalLayout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2396:1: ( ( ( rule__LocalLayout__ParametersAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:2397:1: ( ( rule__LocalLayout__ParametersAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2397:1: ( ( rule__LocalLayout__ParametersAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:2398:2: ( rule__LocalLayout__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParametersAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:2399:2: ( rule__LocalLayout__ParametersAssignment_2_1 )
            // InternalMoniLog4DSL.g:2399:3: rule__LocalLayout__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__1__Impl"


    // $ANTLR start "rule__LocalLayout__Group_2__2"
    // InternalMoniLog4DSL.g:2407:1: rule__LocalLayout__Group_2__2 : rule__LocalLayout__Group_2__2__Impl rule__LocalLayout__Group_2__3 ;
    public final void rule__LocalLayout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2411:1: ( rule__LocalLayout__Group_2__2__Impl rule__LocalLayout__Group_2__3 )
            // InternalMoniLog4DSL.g:2412:2: rule__LocalLayout__Group_2__2__Impl rule__LocalLayout__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__LocalLayout__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__2"


    // $ANTLR start "rule__LocalLayout__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:2419:1: rule__LocalLayout__Group_2__2__Impl : ( ( rule__LocalLayout__Group_2_2__0 )* ) ;
    public final void rule__LocalLayout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2423:1: ( ( ( rule__LocalLayout__Group_2_2__0 )* ) )
            // InternalMoniLog4DSL.g:2424:1: ( ( rule__LocalLayout__Group_2_2__0 )* )
            {
            // InternalMoniLog4DSL.g:2424:1: ( ( rule__LocalLayout__Group_2_2__0 )* )
            // InternalMoniLog4DSL.g:2425:2: ( rule__LocalLayout__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup_2_2()); 
            }
            // InternalMoniLog4DSL.g:2426:2: ( rule__LocalLayout__Group_2_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==30) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2426:3: rule__LocalLayout__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__LocalLayout__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__2__Impl"


    // $ANTLR start "rule__LocalLayout__Group_2__3"
    // InternalMoniLog4DSL.g:2434:1: rule__LocalLayout__Group_2__3 : rule__LocalLayout__Group_2__3__Impl ;
    public final void rule__LocalLayout__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2438:1: ( rule__LocalLayout__Group_2__3__Impl )
            // InternalMoniLog4DSL.g:2439:2: rule__LocalLayout__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__3"


    // $ANTLR start "rule__LocalLayout__Group_2__3__Impl"
    // InternalMoniLog4DSL.g:2445:1: rule__LocalLayout__Group_2__3__Impl : ( ')' ) ;
    public final void rule__LocalLayout__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2449:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2450:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2450:1: ( ')' )
            // InternalMoniLog4DSL.g:2451:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2__3__Impl"


    // $ANTLR start "rule__LocalLayout__Group_2_2__0"
    // InternalMoniLog4DSL.g:2461:1: rule__LocalLayout__Group_2_2__0 : rule__LocalLayout__Group_2_2__0__Impl rule__LocalLayout__Group_2_2__1 ;
    public final void rule__LocalLayout__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2465:1: ( rule__LocalLayout__Group_2_2__0__Impl rule__LocalLayout__Group_2_2__1 )
            // InternalMoniLog4DSL.g:2466:2: rule__LocalLayout__Group_2_2__0__Impl rule__LocalLayout__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__LocalLayout__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2_2__0"


    // $ANTLR start "rule__LocalLayout__Group_2_2__0__Impl"
    // InternalMoniLog4DSL.g:2473:1: rule__LocalLayout__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__LocalLayout__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2477:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2478:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2478:1: ( ',' )
            // InternalMoniLog4DSL.g:2479:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2_2__0__Impl"


    // $ANTLR start "rule__LocalLayout__Group_2_2__1"
    // InternalMoniLog4DSL.g:2488:1: rule__LocalLayout__Group_2_2__1 : rule__LocalLayout__Group_2_2__1__Impl ;
    public final void rule__LocalLayout__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2492:1: ( rule__LocalLayout__Group_2_2__1__Impl )
            // InternalMoniLog4DSL.g:2493:2: rule__LocalLayout__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2_2__1"


    // $ANTLR start "rule__LocalLayout__Group_2_2__1__Impl"
    // InternalMoniLog4DSL.g:2499:1: rule__LocalLayout__Group_2_2__1__Impl : ( ( rule__LocalLayout__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__LocalLayout__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2503:1: ( ( ( rule__LocalLayout__ParametersAssignment_2_2_1 ) ) )
            // InternalMoniLog4DSL.g:2504:1: ( ( rule__LocalLayout__ParametersAssignment_2_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2504:1: ( ( rule__LocalLayout__ParametersAssignment_2_2_1 ) )
            // InternalMoniLog4DSL.g:2505:2: ( rule__LocalLayout__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParametersAssignment_2_2_1()); 
            }
            // InternalMoniLog4DSL.g:2506:2: ( rule__LocalLayout__ParametersAssignment_2_2_1 )
            // InternalMoniLog4DSL.g:2506:3: rule__LocalLayout__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__ParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__Group_2_2__1__Impl"


    // $ANTLR start "rule__ExternalLayout__Group__0"
    // InternalMoniLog4DSL.g:2515:1: rule__ExternalLayout__Group__0 : rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 ;
    public final void rule__ExternalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2519:1: ( rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 )
            // InternalMoniLog4DSL.g:2520:2: rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalLayout__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group__0"


    // $ANTLR start "rule__ExternalLayout__Group__0__Impl"
    // InternalMoniLog4DSL.g:2527:1: rule__ExternalLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__ExternalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2531:1: ( ( 'layout' ) )
            // InternalMoniLog4DSL.g:2532:1: ( 'layout' )
            {
            // InternalMoniLog4DSL.g:2532:1: ( 'layout' )
            // InternalMoniLog4DSL.g:2533:2: 'layout'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getLayoutKeyword_0()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getLayoutKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group__0__Impl"


    // $ANTLR start "rule__ExternalLayout__Group__1"
    // InternalMoniLog4DSL.g:2542:1: rule__ExternalLayout__Group__1 : rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2 ;
    public final void rule__ExternalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2546:1: ( rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2 )
            // InternalMoniLog4DSL.g:2547:2: rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ExternalLayout__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group__1"


    // $ANTLR start "rule__ExternalLayout__Group__1__Impl"
    // InternalMoniLog4DSL.g:2554:1: rule__ExternalLayout__Group__1__Impl : ( ( rule__ExternalLayout__NameAssignment_1 ) ) ;
    public final void rule__ExternalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2558:1: ( ( ( rule__ExternalLayout__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2559:1: ( ( rule__ExternalLayout__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2559:1: ( ( rule__ExternalLayout__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:2560:2: ( rule__ExternalLayout__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:2561:2: ( rule__ExternalLayout__NameAssignment_1 )
            // InternalMoniLog4DSL.g:2561:3: rule__ExternalLayout__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group__1__Impl"


    // $ANTLR start "rule__ExternalLayout__Group__2"
    // InternalMoniLog4DSL.g:2569:1: rule__ExternalLayout__Group__2 : rule__ExternalLayout__Group__2__Impl ;
    public final void rule__ExternalLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2573:1: ( rule__ExternalLayout__Group__2__Impl )
            // InternalMoniLog4DSL.g:2574:2: rule__ExternalLayout__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group__2"


    // $ANTLR start "rule__ExternalLayout__Group__2__Impl"
    // InternalMoniLog4DSL.g:2580:1: rule__ExternalLayout__Group__2__Impl : ( ( rule__ExternalLayout__Group_2__0 )? ) ;
    public final void rule__ExternalLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2584:1: ( ( ( rule__ExternalLayout__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:2585:1: ( ( rule__ExternalLayout__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2585:1: ( ( rule__ExternalLayout__Group_2__0 )? )
            // InternalMoniLog4DSL.g:2586:2: ( rule__ExternalLayout__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:2587:2: ( rule__ExternalLayout__Group_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==28) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMoniLog4DSL.g:2587:3: rule__ExternalLayout__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ExternalLayout__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group__2__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_2__0"
    // InternalMoniLog4DSL.g:2596:1: rule__ExternalLayout__Group_2__0 : rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1 ;
    public final void rule__ExternalLayout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2600:1: ( rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1 )
            // InternalMoniLog4DSL.g:2601:2: rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalLayout__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__0"


    // $ANTLR start "rule__ExternalLayout__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:2608:1: rule__ExternalLayout__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExternalLayout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2612:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2613:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2613:1: ( '(' )
            // InternalMoniLog4DSL.g:2614:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__0__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_2__1"
    // InternalMoniLog4DSL.g:2623:1: rule__ExternalLayout__Group_2__1 : rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2 ;
    public final void rule__ExternalLayout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2627:1: ( rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2 )
            // InternalMoniLog4DSL.g:2628:2: rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__ExternalLayout__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__1"


    // $ANTLR start "rule__ExternalLayout__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:2635:1: rule__ExternalLayout__Group_2__1__Impl : ( ( rule__ExternalLayout__ParametersAssignment_2_1 ) ) ;
    public final void rule__ExternalLayout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2639:1: ( ( ( rule__ExternalLayout__ParametersAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:2640:1: ( ( rule__ExternalLayout__ParametersAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2640:1: ( ( rule__ExternalLayout__ParametersAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:2641:2: ( rule__ExternalLayout__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParametersAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:2642:2: ( rule__ExternalLayout__ParametersAssignment_2_1 )
            // InternalMoniLog4DSL.g:2642:3: rule__ExternalLayout__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__1__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_2__2"
    // InternalMoniLog4DSL.g:2650:1: rule__ExternalLayout__Group_2__2 : rule__ExternalLayout__Group_2__2__Impl rule__ExternalLayout__Group_2__3 ;
    public final void rule__ExternalLayout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2654:1: ( rule__ExternalLayout__Group_2__2__Impl rule__ExternalLayout__Group_2__3 )
            // InternalMoniLog4DSL.g:2655:2: rule__ExternalLayout__Group_2__2__Impl rule__ExternalLayout__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__ExternalLayout__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__2"


    // $ANTLR start "rule__ExternalLayout__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:2662:1: rule__ExternalLayout__Group_2__2__Impl : ( ( rule__ExternalLayout__Group_2_2__0 )* ) ;
    public final void rule__ExternalLayout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2666:1: ( ( ( rule__ExternalLayout__Group_2_2__0 )* ) )
            // InternalMoniLog4DSL.g:2667:1: ( ( rule__ExternalLayout__Group_2_2__0 )* )
            {
            // InternalMoniLog4DSL.g:2667:1: ( ( rule__ExternalLayout__Group_2_2__0 )* )
            // InternalMoniLog4DSL.g:2668:2: ( rule__ExternalLayout__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup_2_2()); 
            }
            // InternalMoniLog4DSL.g:2669:2: ( rule__ExternalLayout__Group_2_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2669:3: rule__ExternalLayout__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__ExternalLayout__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__2__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_2__3"
    // InternalMoniLog4DSL.g:2677:1: rule__ExternalLayout__Group_2__3 : rule__ExternalLayout__Group_2__3__Impl ;
    public final void rule__ExternalLayout__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2681:1: ( rule__ExternalLayout__Group_2__3__Impl )
            // InternalMoniLog4DSL.g:2682:2: rule__ExternalLayout__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__3"


    // $ANTLR start "rule__ExternalLayout__Group_2__3__Impl"
    // InternalMoniLog4DSL.g:2688:1: rule__ExternalLayout__Group_2__3__Impl : ( ')' ) ;
    public final void rule__ExternalLayout__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2692:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2693:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2693:1: ( ')' )
            // InternalMoniLog4DSL.g:2694:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2__3__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_2_2__0"
    // InternalMoniLog4DSL.g:2704:1: rule__ExternalLayout__Group_2_2__0 : rule__ExternalLayout__Group_2_2__0__Impl rule__ExternalLayout__Group_2_2__1 ;
    public final void rule__ExternalLayout__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2708:1: ( rule__ExternalLayout__Group_2_2__0__Impl rule__ExternalLayout__Group_2_2__1 )
            // InternalMoniLog4DSL.g:2709:2: rule__ExternalLayout__Group_2_2__0__Impl rule__ExternalLayout__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__ExternalLayout__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2_2__0"


    // $ANTLR start "rule__ExternalLayout__Group_2_2__0__Impl"
    // InternalMoniLog4DSL.g:2716:1: rule__ExternalLayout__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__ExternalLayout__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2720:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2721:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2721:1: ( ',' )
            // InternalMoniLog4DSL.g:2722:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2_2__0__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_2_2__1"
    // InternalMoniLog4DSL.g:2731:1: rule__ExternalLayout__Group_2_2__1 : rule__ExternalLayout__Group_2_2__1__Impl ;
    public final void rule__ExternalLayout__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2735:1: ( rule__ExternalLayout__Group_2_2__1__Impl )
            // InternalMoniLog4DSL.g:2736:2: rule__ExternalLayout__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2_2__1"


    // $ANTLR start "rule__ExternalLayout__Group_2_2__1__Impl"
    // InternalMoniLog4DSL.g:2742:1: rule__ExternalLayout__Group_2_2__1__Impl : ( ( rule__ExternalLayout__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__ExternalLayout__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2746:1: ( ( ( rule__ExternalLayout__ParametersAssignment_2_2_1 ) ) )
            // InternalMoniLog4DSL.g:2747:1: ( ( rule__ExternalLayout__ParametersAssignment_2_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2747:1: ( ( rule__ExternalLayout__ParametersAssignment_2_2_1 ) )
            // InternalMoniLog4DSL.g:2748:2: ( rule__ExternalLayout__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParametersAssignment_2_2_1()); 
            }
            // InternalMoniLog4DSL.g:2749:2: ( rule__ExternalLayout__ParametersAssignment_2_2_1 )
            // InternalMoniLog4DSL.g:2749:3: rule__ExternalLayout__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__ParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_2_2__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group__0"
    // InternalMoniLog4DSL.g:2758:1: rule__MoniLogger__Group__0 : rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1 ;
    public final void rule__MoniLogger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2762:1: ( rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1 )
            // InternalMoniLog4DSL.g:2763:2: rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MoniLogger__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__0"


    // $ANTLR start "rule__MoniLogger__Group__0__Impl"
    // InternalMoniLog4DSL.g:2770:1: rule__MoniLogger__Group__0__Impl : ( ( rule__MoniLogger__AnnotationsAssignment_0 )* ) ;
    public final void rule__MoniLogger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2774:1: ( ( ( rule__MoniLogger__AnnotationsAssignment_0 )* ) )
            // InternalMoniLog4DSL.g:2775:1: ( ( rule__MoniLogger__AnnotationsAssignment_0 )* )
            {
            // InternalMoniLog4DSL.g:2775:1: ( ( rule__MoniLogger__AnnotationsAssignment_0 )* )
            // InternalMoniLog4DSL.g:2776:2: ( rule__MoniLogger__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getAnnotationsAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:2777:2: ( rule__MoniLogger__AnnotationsAssignment_0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==11) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2777:3: rule__MoniLogger__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MoniLogger__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getAnnotationsAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group__1"
    // InternalMoniLog4DSL.g:2785:1: rule__MoniLogger__Group__1 : rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2 ;
    public final void rule__MoniLogger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2789:1: ( rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2 )
            // InternalMoniLog4DSL.g:2790:2: rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogger__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__1"


    // $ANTLR start "rule__MoniLogger__Group__1__Impl"
    // InternalMoniLog4DSL.g:2797:1: rule__MoniLogger__Group__1__Impl : ( 'monilogger' ) ;
    public final void rule__MoniLogger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2801:1: ( ( 'monilogger' ) )
            // InternalMoniLog4DSL.g:2802:1: ( 'monilogger' )
            {
            // InternalMoniLog4DSL.g:2802:1: ( 'monilogger' )
            // InternalMoniLog4DSL.g:2803:2: 'monilogger'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group__2"
    // InternalMoniLog4DSL.g:2812:1: rule__MoniLogger__Group__2 : rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3 ;
    public final void rule__MoniLogger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2816:1: ( rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3 )
            // InternalMoniLog4DSL.g:2817:2: rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__MoniLogger__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__2"


    // $ANTLR start "rule__MoniLogger__Group__2__Impl"
    // InternalMoniLog4DSL.g:2824:1: rule__MoniLogger__Group__2__Impl : ( ( rule__MoniLogger__NameAssignment_2 ) ) ;
    public final void rule__MoniLogger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2828:1: ( ( ( rule__MoniLogger__NameAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:2829:1: ( ( rule__MoniLogger__NameAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:2829:1: ( ( rule__MoniLogger__NameAssignment_2 ) )
            // InternalMoniLog4DSL.g:2830:2: ( rule__MoniLogger__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getNameAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:2831:2: ( rule__MoniLogger__NameAssignment_2 )
            // InternalMoniLog4DSL.g:2831:3: rule__MoniLogger__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__2__Impl"


    // $ANTLR start "rule__MoniLogger__Group__3"
    // InternalMoniLog4DSL.g:2839:1: rule__MoniLogger__Group__3 : rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4 ;
    public final void rule__MoniLogger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2843:1: ( rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4 )
            // InternalMoniLog4DSL.g:2844:2: rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__MoniLogger__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__3"


    // $ANTLR start "rule__MoniLogger__Group__3__Impl"
    // InternalMoniLog4DSL.g:2851:1: rule__MoniLogger__Group__3__Impl : ( ( rule__MoniLogger__Group_3__0 )? ) ;
    public final void rule__MoniLogger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2855:1: ( ( ( rule__MoniLogger__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:2856:1: ( ( rule__MoniLogger__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:2856:1: ( ( rule__MoniLogger__Group_3__0 )? )
            // InternalMoniLog4DSL.g:2857:2: ( rule__MoniLogger__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:2858:2: ( rule__MoniLogger__Group_3__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==28) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMoniLog4DSL.g:2858:3: rule__MoniLogger__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogger__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__3__Impl"


    // $ANTLR start "rule__MoniLogger__Group__4"
    // InternalMoniLog4DSL.g:2866:1: rule__MoniLogger__Group__4 : rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5 ;
    public final void rule__MoniLogger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2870:1: ( rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5 )
            // InternalMoniLog4DSL.g:2871:2: rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__MoniLogger__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__4"


    // $ANTLR start "rule__MoniLogger__Group__4__Impl"
    // InternalMoniLog4DSL.g:2878:1: rule__MoniLogger__Group__4__Impl : ( ( rule__MoniLogger__Group_4__0 )? ) ;
    public final void rule__MoniLogger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2882:1: ( ( ( rule__MoniLogger__Group_4__0 )? ) )
            // InternalMoniLog4DSL.g:2883:1: ( ( rule__MoniLogger__Group_4__0 )? )
            {
            // InternalMoniLog4DSL.g:2883:1: ( ( rule__MoniLogger__Group_4__0 )? )
            // InternalMoniLog4DSL.g:2884:2: ( rule__MoniLogger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_4()); 
            }
            // InternalMoniLog4DSL.g:2885:2: ( rule__MoniLogger__Group_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==36) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoniLog4DSL.g:2885:3: rule__MoniLogger__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogger__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__4__Impl"


    // $ANTLR start "rule__MoniLogger__Group__5"
    // InternalMoniLog4DSL.g:2893:1: rule__MoniLogger__Group__5 : rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6 ;
    public final void rule__MoniLogger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2897:1: ( rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6 )
            // InternalMoniLog4DSL.g:2898:2: rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__MoniLogger__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__5"


    // $ANTLR start "rule__MoniLogger__Group__5__Impl"
    // InternalMoniLog4DSL.g:2905:1: rule__MoniLogger__Group__5__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2909:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:2910:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:2910:1: ( '{' )
            // InternalMoniLog4DSL.g:2911:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__5__Impl"


    // $ANTLR start "rule__MoniLogger__Group__6"
    // InternalMoniLog4DSL.g:2920:1: rule__MoniLogger__Group__6 : rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7 ;
    public final void rule__MoniLogger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2924:1: ( rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7 )
            // InternalMoniLog4DSL.g:2925:2: rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogger__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__6"


    // $ANTLR start "rule__MoniLogger__Group__6__Impl"
    // InternalMoniLog4DSL.g:2932:1: rule__MoniLogger__Group__6__Impl : ( 'event' ) ;
    public final void rule__MoniLogger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2936:1: ( ( 'event' ) )
            // InternalMoniLog4DSL.g:2937:1: ( 'event' )
            {
            // InternalMoniLog4DSL.g:2937:1: ( 'event' )
            // InternalMoniLog4DSL.g:2938:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getEventKeyword_6()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getEventKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__6__Impl"


    // $ANTLR start "rule__MoniLogger__Group__7"
    // InternalMoniLog4DSL.g:2947:1: rule__MoniLogger__Group__7 : rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8 ;
    public final void rule__MoniLogger__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2951:1: ( rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8 )
            // InternalMoniLog4DSL.g:2952:2: rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8
            {
            pushFollow(FOLLOW_18);
            rule__MoniLogger__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__7"


    // $ANTLR start "rule__MoniLogger__Group__7__Impl"
    // InternalMoniLog4DSL.g:2959:1: rule__MoniLogger__Group__7__Impl : ( ( rule__MoniLogger__EventAssignment_7 ) ) ;
    public final void rule__MoniLogger__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2963:1: ( ( ( rule__MoniLogger__EventAssignment_7 ) ) )
            // InternalMoniLog4DSL.g:2964:1: ( ( rule__MoniLogger__EventAssignment_7 ) )
            {
            // InternalMoniLog4DSL.g:2964:1: ( ( rule__MoniLogger__EventAssignment_7 ) )
            // InternalMoniLog4DSL.g:2965:2: ( rule__MoniLogger__EventAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getEventAssignment_7()); 
            }
            // InternalMoniLog4DSL.g:2966:2: ( rule__MoniLogger__EventAssignment_7 )
            // InternalMoniLog4DSL.g:2966:3: rule__MoniLogger__EventAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__EventAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getEventAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__7__Impl"


    // $ANTLR start "rule__MoniLogger__Group__8"
    // InternalMoniLog4DSL.g:2974:1: rule__MoniLogger__Group__8 : rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9 ;
    public final void rule__MoniLogger__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2978:1: ( rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9 )
            // InternalMoniLog4DSL.g:2979:2: rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9
            {
            pushFollow(FOLLOW_18);
            rule__MoniLogger__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__8"


    // $ANTLR start "rule__MoniLogger__Group__8__Impl"
    // InternalMoniLog4DSL.g:2986:1: rule__MoniLogger__Group__8__Impl : ( ( rule__MoniLogger__Group_8__0 )? ) ;
    public final void rule__MoniLogger__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2990:1: ( ( ( rule__MoniLogger__Group_8__0 )? ) )
            // InternalMoniLog4DSL.g:2991:1: ( ( rule__MoniLogger__Group_8__0 )? )
            {
            // InternalMoniLog4DSL.g:2991:1: ( ( rule__MoniLogger__Group_8__0 )? )
            // InternalMoniLog4DSL.g:2992:2: ( rule__MoniLogger__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_8()); 
            }
            // InternalMoniLog4DSL.g:2993:2: ( rule__MoniLogger__Group_8__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoniLog4DSL.g:2993:3: rule__MoniLogger__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogger__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__8__Impl"


    // $ANTLR start "rule__MoniLogger__Group__9"
    // InternalMoniLog4DSL.g:3001:1: rule__MoniLogger__Group__9 : rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10 ;
    public final void rule__MoniLogger__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3005:1: ( rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10 )
            // InternalMoniLog4DSL.g:3006:2: rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10
            {
            pushFollow(FOLLOW_19);
            rule__MoniLogger__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__10();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__9"


    // $ANTLR start "rule__MoniLogger__Group__9__Impl"
    // InternalMoniLog4DSL.g:3013:1: rule__MoniLogger__Group__9__Impl : ( 'actions' ) ;
    public final void rule__MoniLogger__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3017:1: ( ( 'actions' ) )
            // InternalMoniLog4DSL.g:3018:1: ( 'actions' )
            {
            // InternalMoniLog4DSL.g:3018:1: ( 'actions' )
            // InternalMoniLog4DSL.g:3019:2: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsKeyword_9()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getActionsKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__9__Impl"


    // $ANTLR start "rule__MoniLogger__Group__10"
    // InternalMoniLog4DSL.g:3028:1: rule__MoniLogger__Group__10 : rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11 ;
    public final void rule__MoniLogger__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3032:1: ( rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11 )
            // InternalMoniLog4DSL.g:3033:2: rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11
            {
            pushFollow(FOLLOW_4);
            rule__MoniLogger__Group__10__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__11();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__10"


    // $ANTLR start "rule__MoniLogger__Group__10__Impl"
    // InternalMoniLog4DSL.g:3040:1: rule__MoniLogger__Group__10__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3044:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3045:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3045:1: ( '{' )
            // InternalMoniLog4DSL.g:3046:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__10__Impl"


    // $ANTLR start "rule__MoniLogger__Group__11"
    // InternalMoniLog4DSL.g:3055:1: rule__MoniLogger__Group__11 : rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12 ;
    public final void rule__MoniLogger__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3059:1: ( rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12 )
            // InternalMoniLog4DSL.g:3060:2: rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogger__Group__11__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__12();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__11"


    // $ANTLR start "rule__MoniLogger__Group__11__Impl"
    // InternalMoniLog4DSL.g:3067:1: rule__MoniLogger__Group__11__Impl : ( ( rule__MoniLogger__ActionsAssignment_11 ) ) ;
    public final void rule__MoniLogger__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3071:1: ( ( ( rule__MoniLogger__ActionsAssignment_11 ) ) )
            // InternalMoniLog4DSL.g:3072:1: ( ( rule__MoniLogger__ActionsAssignment_11 ) )
            {
            // InternalMoniLog4DSL.g:3072:1: ( ( rule__MoniLogger__ActionsAssignment_11 ) )
            // InternalMoniLog4DSL.g:3073:2: ( rule__MoniLogger__ActionsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsAssignment_11()); 
            }
            // InternalMoniLog4DSL.g:3074:2: ( rule__MoniLogger__ActionsAssignment_11 )
            // InternalMoniLog4DSL.g:3074:3: rule__MoniLogger__ActionsAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ActionsAssignment_11();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getActionsAssignment_11()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__11__Impl"


    // $ANTLR start "rule__MoniLogger__Group__12"
    // InternalMoniLog4DSL.g:3082:1: rule__MoniLogger__Group__12 : rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13 ;
    public final void rule__MoniLogger__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3086:1: ( rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13 )
            // InternalMoniLog4DSL.g:3087:2: rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogger__Group__12__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__13();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__12"


    // $ANTLR start "rule__MoniLogger__Group__12__Impl"
    // InternalMoniLog4DSL.g:3094:1: rule__MoniLogger__Group__12__Impl : ( ( rule__MoniLogger__Group_12__0 )* ) ;
    public final void rule__MoniLogger__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3098:1: ( ( ( rule__MoniLogger__Group_12__0 )* ) )
            // InternalMoniLog4DSL.g:3099:1: ( ( rule__MoniLogger__Group_12__0 )* )
            {
            // InternalMoniLog4DSL.g:3099:1: ( ( rule__MoniLogger__Group_12__0 )* )
            // InternalMoniLog4DSL.g:3100:2: ( rule__MoniLogger__Group_12__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_12()); 
            }
            // InternalMoniLog4DSL.g:3101:2: ( rule__MoniLogger__Group_12__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==31) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3101:3: rule__MoniLogger__Group_12__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MoniLogger__Group_12__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup_12()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__12__Impl"


    // $ANTLR start "rule__MoniLogger__Group__13"
    // InternalMoniLog4DSL.g:3109:1: rule__MoniLogger__Group__13 : rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14 ;
    public final void rule__MoniLogger__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3113:1: ( rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14 )
            // InternalMoniLog4DSL.g:3114:2: rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14
            {
            pushFollow(FOLLOW_14);
            rule__MoniLogger__Group__13__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__14();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__13"


    // $ANTLR start "rule__MoniLogger__Group__13__Impl"
    // InternalMoniLog4DSL.g:3121:1: rule__MoniLogger__Group__13__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3125:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3126:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3126:1: ( '}' )
            // InternalMoniLog4DSL.g:3127:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_13()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__13__Impl"


    // $ANTLR start "rule__MoniLogger__Group__14"
    // InternalMoniLog4DSL.g:3136:1: rule__MoniLogger__Group__14 : rule__MoniLogger__Group__14__Impl ;
    public final void rule__MoniLogger__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3140:1: ( rule__MoniLogger__Group__14__Impl )
            // InternalMoniLog4DSL.g:3141:2: rule__MoniLogger__Group__14__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__14"


    // $ANTLR start "rule__MoniLogger__Group__14__Impl"
    // InternalMoniLog4DSL.g:3147:1: rule__MoniLogger__Group__14__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3151:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3152:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3152:1: ( '}' )
            // InternalMoniLog4DSL.g:3153:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__14__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3__0"
    // InternalMoniLog4DSL.g:3163:1: rule__MoniLogger__Group_3__0 : rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1 ;
    public final void rule__MoniLogger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3167:1: ( rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1 )
            // InternalMoniLog4DSL.g:3168:2: rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogger__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__0"


    // $ANTLR start "rule__MoniLogger__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:3175:1: rule__MoniLogger__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MoniLogger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3179:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:3180:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:3180:1: ( '(' )
            // InternalMoniLog4DSL.g:3181:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3__1"
    // InternalMoniLog4DSL.g:3190:1: rule__MoniLogger__Group_3__1 : rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2 ;
    public final void rule__MoniLogger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3194:1: ( rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2 )
            // InternalMoniLog4DSL.g:3195:2: rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__MoniLogger__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__1"


    // $ANTLR start "rule__MoniLogger__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:3202:1: rule__MoniLogger__Group_3__1__Impl : ( ( rule__MoniLogger__ParametersAssignment_3_1 ) ) ;
    public final void rule__MoniLogger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3206:1: ( ( ( rule__MoniLogger__ParametersAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:3207:1: ( ( rule__MoniLogger__ParametersAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:3207:1: ( ( rule__MoniLogger__ParametersAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:3208:2: ( rule__MoniLogger__ParametersAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParametersAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:3209:2: ( rule__MoniLogger__ParametersAssignment_3_1 )
            // InternalMoniLog4DSL.g:3209:3: rule__MoniLogger__ParametersAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ParametersAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getParametersAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3__2"
    // InternalMoniLog4DSL.g:3217:1: rule__MoniLogger__Group_3__2 : rule__MoniLogger__Group_3__2__Impl rule__MoniLogger__Group_3__3 ;
    public final void rule__MoniLogger__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3221:1: ( rule__MoniLogger__Group_3__2__Impl rule__MoniLogger__Group_3__3 )
            // InternalMoniLog4DSL.g:3222:2: rule__MoniLogger__Group_3__2__Impl rule__MoniLogger__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__MoniLogger__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__2"


    // $ANTLR start "rule__MoniLogger__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:3229:1: rule__MoniLogger__Group_3__2__Impl : ( ( rule__MoniLogger__Group_3_2__0 )* ) ;
    public final void rule__MoniLogger__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3233:1: ( ( ( rule__MoniLogger__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:3234:1: ( ( rule__MoniLogger__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:3234:1: ( ( rule__MoniLogger__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:3235:2: ( rule__MoniLogger__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:3236:2: ( rule__MoniLogger__Group_3_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3236:3: rule__MoniLogger__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MoniLogger__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__2__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3__3"
    // InternalMoniLog4DSL.g:3244:1: rule__MoniLogger__Group_3__3 : rule__MoniLogger__Group_3__3__Impl ;
    public final void rule__MoniLogger__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3248:1: ( rule__MoniLogger__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:3249:2: rule__MoniLogger__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__3"


    // $ANTLR start "rule__MoniLogger__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:3255:1: rule__MoniLogger__Group_3__3__Impl : ( ')' ) ;
    public final void rule__MoniLogger__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3259:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:3260:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:3260:1: ( ')' )
            // InternalMoniLog4DSL.g:3261:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3__3__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3_2__0"
    // InternalMoniLog4DSL.g:3271:1: rule__MoniLogger__Group_3_2__0 : rule__MoniLogger__Group_3_2__0__Impl rule__MoniLogger__Group_3_2__1 ;
    public final void rule__MoniLogger__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3275:1: ( rule__MoniLogger__Group_3_2__0__Impl rule__MoniLogger__Group_3_2__1 )
            // InternalMoniLog4DSL.g:3276:2: rule__MoniLogger__Group_3_2__0__Impl rule__MoniLogger__Group_3_2__1
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogger__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3_2__0"


    // $ANTLR start "rule__MoniLogger__Group_3_2__0__Impl"
    // InternalMoniLog4DSL.g:3283:1: rule__MoniLogger__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__MoniLogger__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3287:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:3288:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:3288:1: ( ',' )
            // InternalMoniLog4DSL.g:3289:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3_2__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3_2__1"
    // InternalMoniLog4DSL.g:3298:1: rule__MoniLogger__Group_3_2__1 : rule__MoniLogger__Group_3_2__1__Impl ;
    public final void rule__MoniLogger__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3302:1: ( rule__MoniLogger__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:3303:2: rule__MoniLogger__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3_2__1"


    // $ANTLR start "rule__MoniLogger__Group_3_2__1__Impl"
    // InternalMoniLog4DSL.g:3309:1: rule__MoniLogger__Group_3_2__1__Impl : ( ( rule__MoniLogger__ParametersAssignment_3_2_1 ) ) ;
    public final void rule__MoniLogger__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3313:1: ( ( ( rule__MoniLogger__ParametersAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:3314:1: ( ( rule__MoniLogger__ParametersAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:3314:1: ( ( rule__MoniLogger__ParametersAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:3315:2: ( rule__MoniLogger__ParametersAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParametersAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:3316:2: ( rule__MoniLogger__ParametersAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:3316:3: rule__MoniLogger__ParametersAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ParametersAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getParametersAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_3_2__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group_4__0"
    // InternalMoniLog4DSL.g:3325:1: rule__MoniLogger__Group_4__0 : rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1 ;
    public final void rule__MoniLogger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3329:1: ( rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1 )
            // InternalMoniLog4DSL.g:3330:2: rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1
            {
            pushFollow(FOLLOW_20);
            rule__MoniLogger__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_4__0"


    // $ANTLR start "rule__MoniLogger__Group_4__0__Impl"
    // InternalMoniLog4DSL.g:3337:1: rule__MoniLogger__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MoniLogger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3341:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:3342:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:3342:1: ( '[' )
            // InternalMoniLog4DSL.g:3343:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_4__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group_4__1"
    // InternalMoniLog4DSL.g:3352:1: rule__MoniLogger__Group_4__1 : rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2 ;
    public final void rule__MoniLogger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3356:1: ( rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2 )
            // InternalMoniLog4DSL.g:3357:2: rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__MoniLogger__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_4__1"


    // $ANTLR start "rule__MoniLogger__Group_4__1__Impl"
    // InternalMoniLog4DSL.g:3364:1: rule__MoniLogger__Group_4__1__Impl : ( ( rule__MoniLogger__LevelAssignment_4_1 ) ) ;
    public final void rule__MoniLogger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3368:1: ( ( ( rule__MoniLogger__LevelAssignment_4_1 ) ) )
            // InternalMoniLog4DSL.g:3369:1: ( ( rule__MoniLogger__LevelAssignment_4_1 ) )
            {
            // InternalMoniLog4DSL.g:3369:1: ( ( rule__MoniLogger__LevelAssignment_4_1 ) )
            // InternalMoniLog4DSL.g:3370:2: ( rule__MoniLogger__LevelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLevelAssignment_4_1()); 
            }
            // InternalMoniLog4DSL.g:3371:2: ( rule__MoniLogger__LevelAssignment_4_1 )
            // InternalMoniLog4DSL.g:3371:3: rule__MoniLogger__LevelAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__LevelAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLevelAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_4__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group_4__2"
    // InternalMoniLog4DSL.g:3379:1: rule__MoniLogger__Group_4__2 : rule__MoniLogger__Group_4__2__Impl ;
    public final void rule__MoniLogger__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3383:1: ( rule__MoniLogger__Group_4__2__Impl )
            // InternalMoniLog4DSL.g:3384:2: rule__MoniLogger__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_4__2"


    // $ANTLR start "rule__MoniLogger__Group_4__2__Impl"
    // InternalMoniLog4DSL.g:3390:1: rule__MoniLogger__Group_4__2__Impl : ( ']' ) ;
    public final void rule__MoniLogger__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3394:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:3395:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:3395:1: ( ']' )
            // InternalMoniLog4DSL.g:3396:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightSquareBracketKeyword_4_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightSquareBracketKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_4__2__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8__0"
    // InternalMoniLog4DSL.g:3406:1: rule__MoniLogger__Group_8__0 : rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1 ;
    public final void rule__MoniLogger__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3410:1: ( rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1 )
            // InternalMoniLog4DSL.g:3411:2: rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1
            {
            pushFollow(FOLLOW_19);
            rule__MoniLogger__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__0"


    // $ANTLR start "rule__MoniLogger__Group_8__0__Impl"
    // InternalMoniLog4DSL.g:3418:1: rule__MoniLogger__Group_8__0__Impl : ( 'conditions' ) ;
    public final void rule__MoniLogger__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3422:1: ( ( 'conditions' ) )
            // InternalMoniLog4DSL.g:3423:1: ( 'conditions' )
            {
            // InternalMoniLog4DSL.g:3423:1: ( 'conditions' )
            // InternalMoniLog4DSL.g:3424:2: 'conditions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8__1"
    // InternalMoniLog4DSL.g:3433:1: rule__MoniLogger__Group_8__1 : rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2 ;
    public final void rule__MoniLogger__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3437:1: ( rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2 )
            // InternalMoniLog4DSL.g:3438:2: rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2
            {
            pushFollow(FOLLOW_4);
            rule__MoniLogger__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__1"


    // $ANTLR start "rule__MoniLogger__Group_8__1__Impl"
    // InternalMoniLog4DSL.g:3445:1: rule__MoniLogger__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3449:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3450:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3450:1: ( '{' )
            // InternalMoniLog4DSL.g:3451:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8__2"
    // InternalMoniLog4DSL.g:3460:1: rule__MoniLogger__Group_8__2 : rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3 ;
    public final void rule__MoniLogger__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3464:1: ( rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3 )
            // InternalMoniLog4DSL.g:3465:2: rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogger__Group_8__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__2"


    // $ANTLR start "rule__MoniLogger__Group_8__2__Impl"
    // InternalMoniLog4DSL.g:3472:1: rule__MoniLogger__Group_8__2__Impl : ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) ) ;
    public final void rule__MoniLogger__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3476:1: ( ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) ) )
            // InternalMoniLog4DSL.g:3477:1: ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) )
            {
            // InternalMoniLog4DSL.g:3477:1: ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) )
            // InternalMoniLog4DSL.g:3478:2: ( rule__MoniLogger__ConditionsAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_2()); 
            }
            // InternalMoniLog4DSL.g:3479:2: ( rule__MoniLogger__ConditionsAssignment_8_2 )
            // InternalMoniLog4DSL.g:3479:3: rule__MoniLogger__ConditionsAssignment_8_2
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ConditionsAssignment_8_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__2__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8__3"
    // InternalMoniLog4DSL.g:3487:1: rule__MoniLogger__Group_8__3 : rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4 ;
    public final void rule__MoniLogger__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3491:1: ( rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4 )
            // InternalMoniLog4DSL.g:3492:2: rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogger__Group_8__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__3"


    // $ANTLR start "rule__MoniLogger__Group_8__3__Impl"
    // InternalMoniLog4DSL.g:3499:1: rule__MoniLogger__Group_8__3__Impl : ( ( rule__MoniLogger__Group_8_3__0 )* ) ;
    public final void rule__MoniLogger__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3503:1: ( ( ( rule__MoniLogger__Group_8_3__0 )* ) )
            // InternalMoniLog4DSL.g:3504:1: ( ( rule__MoniLogger__Group_8_3__0 )* )
            {
            // InternalMoniLog4DSL.g:3504:1: ( ( rule__MoniLogger__Group_8_3__0 )* )
            // InternalMoniLog4DSL.g:3505:2: ( rule__MoniLogger__Group_8_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_8_3()); 
            }
            // InternalMoniLog4DSL.g:3506:2: ( rule__MoniLogger__Group_8_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==31) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3506:3: rule__MoniLogger__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MoniLogger__Group_8_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getGroup_8_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__3__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8__4"
    // InternalMoniLog4DSL.g:3514:1: rule__MoniLogger__Group_8__4 : rule__MoniLogger__Group_8__4__Impl ;
    public final void rule__MoniLogger__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3518:1: ( rule__MoniLogger__Group_8__4__Impl )
            // InternalMoniLog4DSL.g:3519:2: rule__MoniLogger__Group_8__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__4"


    // $ANTLR start "rule__MoniLogger__Group_8__4__Impl"
    // InternalMoniLog4DSL.g:3525:1: rule__MoniLogger__Group_8__4__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3529:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3530:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3530:1: ( '}' )
            // InternalMoniLog4DSL.g:3531:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__4__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8_3__0"
    // InternalMoniLog4DSL.g:3541:1: rule__MoniLogger__Group_8_3__0 : rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1 ;
    public final void rule__MoniLogger__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3545:1: ( rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1 )
            // InternalMoniLog4DSL.g:3546:2: rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1
            {
            pushFollow(FOLLOW_4);
            rule__MoniLogger__Group_8_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8_3__0"


    // $ANTLR start "rule__MoniLogger__Group_8_3__0__Impl"
    // InternalMoniLog4DSL.g:3553:1: rule__MoniLogger__Group_8_3__0__Impl : ( ';' ) ;
    public final void rule__MoniLogger__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3557:1: ( ( ';' ) )
            // InternalMoniLog4DSL.g:3558:1: ( ';' )
            {
            // InternalMoniLog4DSL.g:3558:1: ( ';' )
            // InternalMoniLog4DSL.g:3559:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8_3__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8_3__1"
    // InternalMoniLog4DSL.g:3568:1: rule__MoniLogger__Group_8_3__1 : rule__MoniLogger__Group_8_3__1__Impl ;
    public final void rule__MoniLogger__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3572:1: ( rule__MoniLogger__Group_8_3__1__Impl )
            // InternalMoniLog4DSL.g:3573:2: rule__MoniLogger__Group_8_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8_3__1"


    // $ANTLR start "rule__MoniLogger__Group_8_3__1__Impl"
    // InternalMoniLog4DSL.g:3579:1: rule__MoniLogger__Group_8_3__1__Impl : ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) ) ;
    public final void rule__MoniLogger__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3583:1: ( ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) ) )
            // InternalMoniLog4DSL.g:3584:1: ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) )
            {
            // InternalMoniLog4DSL.g:3584:1: ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) )
            // InternalMoniLog4DSL.g:3585:2: ( rule__MoniLogger__ConditionsAssignment_8_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_3_1()); 
            }
            // InternalMoniLog4DSL.g:3586:2: ( rule__MoniLogger__ConditionsAssignment_8_3_1 )
            // InternalMoniLog4DSL.g:3586:3: rule__MoniLogger__ConditionsAssignment_8_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ConditionsAssignment_8_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8_3__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group_12__0"
    // InternalMoniLog4DSL.g:3595:1: rule__MoniLogger__Group_12__0 : rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1 ;
    public final void rule__MoniLogger__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3599:1: ( rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1 )
            // InternalMoniLog4DSL.g:3600:2: rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1
            {
            pushFollow(FOLLOW_4);
            rule__MoniLogger__Group_12__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_12__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_12__0"


    // $ANTLR start "rule__MoniLogger__Group_12__0__Impl"
    // InternalMoniLog4DSL.g:3607:1: rule__MoniLogger__Group_12__0__Impl : ( ';' ) ;
    public final void rule__MoniLogger__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3611:1: ( ( ';' ) )
            // InternalMoniLog4DSL.g:3612:1: ( ';' )
            {
            // InternalMoniLog4DSL.g:3612:1: ( ';' )
            // InternalMoniLog4DSL.g:3613:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_12__0__Impl"


    // $ANTLR start "rule__MoniLogger__Group_12__1"
    // InternalMoniLog4DSL.g:3622:1: rule__MoniLogger__Group_12__1 : rule__MoniLogger__Group_12__1__Impl ;
    public final void rule__MoniLogger__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3626:1: ( rule__MoniLogger__Group_12__1__Impl )
            // InternalMoniLog4DSL.g:3627:2: rule__MoniLogger__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_12__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_12__1"


    // $ANTLR start "rule__MoniLogger__Group_12__1__Impl"
    // InternalMoniLog4DSL.g:3633:1: rule__MoniLogger__Group_12__1__Impl : ( ( rule__MoniLogger__ActionsAssignment_12_1 ) ) ;
    public final void rule__MoniLogger__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3637:1: ( ( ( rule__MoniLogger__ActionsAssignment_12_1 ) ) )
            // InternalMoniLog4DSL.g:3638:1: ( ( rule__MoniLogger__ActionsAssignment_12_1 ) )
            {
            // InternalMoniLog4DSL.g:3638:1: ( ( rule__MoniLogger__ActionsAssignment_12_1 ) )
            // InternalMoniLog4DSL.g:3639:2: ( rule__MoniLogger__ActionsAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsAssignment_12_1()); 
            }
            // InternalMoniLog4DSL.g:3640:2: ( rule__MoniLogger__ActionsAssignment_12_1 )
            // InternalMoniLog4DSL.g:3640:3: rule__MoniLogger__ActionsAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ActionsAssignment_12_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getActionsAssignment_12_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_12__1__Impl"


    // $ANTLR start "rule__ASTEvent__Group__0"
    // InternalMoniLog4DSL.g:3649:1: rule__ASTEvent__Group__0 : rule__ASTEvent__Group__0__Impl rule__ASTEvent__Group__1 ;
    public final void rule__ASTEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3653:1: ( rule__ASTEvent__Group__0__Impl rule__ASTEvent__Group__1 )
            // InternalMoniLog4DSL.g:3654:2: rule__ASTEvent__Group__0__Impl rule__ASTEvent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ASTEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__0"


    // $ANTLR start "rule__ASTEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:3661:1: rule__ASTEvent__Group__0__Impl : ( 'ast' ) ;
    public final void rule__ASTEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3665:1: ( ( 'ast' ) )
            // InternalMoniLog4DSL.g:3666:1: ( 'ast' )
            {
            // InternalMoniLog4DSL.g:3666:1: ( 'ast' )
            // InternalMoniLog4DSL.g:3667:2: 'ast'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getAstKeyword_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getAstKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__0__Impl"


    // $ANTLR start "rule__ASTEvent__Group__1"
    // InternalMoniLog4DSL.g:3676:1: rule__ASTEvent__Group__1 : rule__ASTEvent__Group__1__Impl rule__ASTEvent__Group__2 ;
    public final void rule__ASTEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3680:1: ( rule__ASTEvent__Group__1__Impl rule__ASTEvent__Group__2 )
            // InternalMoniLog4DSL.g:3681:2: rule__ASTEvent__Group__1__Impl rule__ASTEvent__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__ASTEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__1"


    // $ANTLR start "rule__ASTEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:3688:1: rule__ASTEvent__Group__1__Impl : ( ( rule__ASTEvent__NameAssignment_1 ) ) ;
    public final void rule__ASTEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3692:1: ( ( ( rule__ASTEvent__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:3693:1: ( ( rule__ASTEvent__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:3693:1: ( ( rule__ASTEvent__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:3694:2: ( rule__ASTEvent__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:3695:2: ( rule__ASTEvent__NameAssignment_1 )
            // InternalMoniLog4DSL.g:3695:3: rule__ASTEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ASTEvent__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__1__Impl"


    // $ANTLR start "rule__ASTEvent__Group__2"
    // InternalMoniLog4DSL.g:3703:1: rule__ASTEvent__Group__2 : rule__ASTEvent__Group__2__Impl rule__ASTEvent__Group__3 ;
    public final void rule__ASTEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3707:1: ( rule__ASTEvent__Group__2__Impl rule__ASTEvent__Group__3 )
            // InternalMoniLog4DSL.g:3708:2: rule__ASTEvent__Group__2__Impl rule__ASTEvent__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__ASTEvent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__2"


    // $ANTLR start "rule__ASTEvent__Group__2__Impl"
    // InternalMoniLog4DSL.g:3715:1: rule__ASTEvent__Group__2__Impl : ( '{' ) ;
    public final void rule__ASTEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3719:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3720:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3720:1: ( '{' )
            // InternalMoniLog4DSL.g:3721:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getLeftCurlyBracketKeyword_2()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getLeftCurlyBracketKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__2__Impl"


    // $ANTLR start "rule__ASTEvent__Group__3"
    // InternalMoniLog4DSL.g:3730:1: rule__ASTEvent__Group__3 : rule__ASTEvent__Group__3__Impl rule__ASTEvent__Group__4 ;
    public final void rule__ASTEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3734:1: ( rule__ASTEvent__Group__3__Impl rule__ASTEvent__Group__4 )
            // InternalMoniLog4DSL.g:3735:2: rule__ASTEvent__Group__3__Impl rule__ASTEvent__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ASTEvent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__3"


    // $ANTLR start "rule__ASTEvent__Group__3__Impl"
    // InternalMoniLog4DSL.g:3742:1: rule__ASTEvent__Group__3__Impl : ( ( rule__ASTEvent__UnorderedGroup_3 ) ) ;
    public final void rule__ASTEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3746:1: ( ( ( rule__ASTEvent__UnorderedGroup_3 ) ) )
            // InternalMoniLog4DSL.g:3747:1: ( ( rule__ASTEvent__UnorderedGroup_3 ) )
            {
            // InternalMoniLog4DSL.g:3747:1: ( ( rule__ASTEvent__UnorderedGroup_3 ) )
            // InternalMoniLog4DSL.g:3748:2: ( rule__ASTEvent__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getUnorderedGroup_3()); 
            }
            // InternalMoniLog4DSL.g:3749:2: ( rule__ASTEvent__UnorderedGroup_3 )
            // InternalMoniLog4DSL.g:3749:3: rule__ASTEvent__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__ASTEvent__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__3__Impl"


    // $ANTLR start "rule__ASTEvent__Group__4"
    // InternalMoniLog4DSL.g:3757:1: rule__ASTEvent__Group__4 : rule__ASTEvent__Group__4__Impl rule__ASTEvent__Group__5 ;
    public final void rule__ASTEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3761:1: ( rule__ASTEvent__Group__4__Impl rule__ASTEvent__Group__5 )
            // InternalMoniLog4DSL.g:3762:2: rule__ASTEvent__Group__4__Impl rule__ASTEvent__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ASTEvent__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__4"


    // $ANTLR start "rule__ASTEvent__Group__4__Impl"
    // InternalMoniLog4DSL.g:3769:1: rule__ASTEvent__Group__4__Impl : ( ( rule__ASTEvent__RuleIDAssignment_4 ) ) ;
    public final void rule__ASTEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3773:1: ( ( ( rule__ASTEvent__RuleIDAssignment_4 ) ) )
            // InternalMoniLog4DSL.g:3774:1: ( ( rule__ASTEvent__RuleIDAssignment_4 ) )
            {
            // InternalMoniLog4DSL.g:3774:1: ( ( rule__ASTEvent__RuleIDAssignment_4 ) )
            // InternalMoniLog4DSL.g:3775:2: ( rule__ASTEvent__RuleIDAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getRuleIDAssignment_4()); 
            }
            // InternalMoniLog4DSL.g:3776:2: ( rule__ASTEvent__RuleIDAssignment_4 )
            // InternalMoniLog4DSL.g:3776:3: rule__ASTEvent__RuleIDAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ASTEvent__RuleIDAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getRuleIDAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__4__Impl"


    // $ANTLR start "rule__ASTEvent__Group__5"
    // InternalMoniLog4DSL.g:3784:1: rule__ASTEvent__Group__5 : rule__ASTEvent__Group__5__Impl ;
    public final void rule__ASTEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3788:1: ( rule__ASTEvent__Group__5__Impl )
            // InternalMoniLog4DSL.g:3789:2: rule__ASTEvent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ASTEvent__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__5"


    // $ANTLR start "rule__ASTEvent__Group__5__Impl"
    // InternalMoniLog4DSL.g:3795:1: rule__ASTEvent__Group__5__Impl : ( '}' ) ;
    public final void rule__ASTEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3799:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3800:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3800:1: ( '}' )
            // InternalMoniLog4DSL.g:3801:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__Group__5__Impl"


    // $ANTLR start "rule__ComplexEvent__Group__0"
    // InternalMoniLog4DSL.g:3811:1: rule__ComplexEvent__Group__0 : rule__ComplexEvent__Group__0__Impl rule__ComplexEvent__Group__1 ;
    public final void rule__ComplexEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3815:1: ( rule__ComplexEvent__Group__0__Impl rule__ComplexEvent__Group__1 )
            // InternalMoniLog4DSL.g:3816:2: rule__ComplexEvent__Group__0__Impl rule__ComplexEvent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__ComplexEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__0"


    // $ANTLR start "rule__ComplexEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:3823:1: rule__ComplexEvent__Group__0__Impl : ( 'complex' ) ;
    public final void rule__ComplexEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3827:1: ( ( 'complex' ) )
            // InternalMoniLog4DSL.g:3828:1: ( 'complex' )
            {
            // InternalMoniLog4DSL.g:3828:1: ( 'complex' )
            // InternalMoniLog4DSL.g:3829:2: 'complex'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getComplexKeyword_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getComplexKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__0__Impl"


    // $ANTLR start "rule__ComplexEvent__Group__1"
    // InternalMoniLog4DSL.g:3838:1: rule__ComplexEvent__Group__1 : rule__ComplexEvent__Group__1__Impl rule__ComplexEvent__Group__2 ;
    public final void rule__ComplexEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3842:1: ( rule__ComplexEvent__Group__1__Impl rule__ComplexEvent__Group__2 )
            // InternalMoniLog4DSL.g:3843:2: rule__ComplexEvent__Group__1__Impl rule__ComplexEvent__Group__2
            {
            pushFollow(FOLLOW_23);
            rule__ComplexEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__1"


    // $ANTLR start "rule__ComplexEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:3850:1: rule__ComplexEvent__Group__1__Impl : ( ( rule__ComplexEvent__NameAssignment_1 ) ) ;
    public final void rule__ComplexEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3854:1: ( ( ( rule__ComplexEvent__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:3855:1: ( ( rule__ComplexEvent__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:3855:1: ( ( rule__ComplexEvent__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:3856:2: ( rule__ComplexEvent__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:3857:2: ( rule__ComplexEvent__NameAssignment_1 )
            // InternalMoniLog4DSL.g:3857:3: rule__ComplexEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__1__Impl"


    // $ANTLR start "rule__ComplexEvent__Group__2"
    // InternalMoniLog4DSL.g:3865:1: rule__ComplexEvent__Group__2 : rule__ComplexEvent__Group__2__Impl rule__ComplexEvent__Group__3 ;
    public final void rule__ComplexEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3869:1: ( rule__ComplexEvent__Group__2__Impl rule__ComplexEvent__Group__3 )
            // InternalMoniLog4DSL.g:3870:2: rule__ComplexEvent__Group__2__Impl rule__ComplexEvent__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__ComplexEvent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__2"


    // $ANTLR start "rule__ComplexEvent__Group__2__Impl"
    // InternalMoniLog4DSL.g:3877:1: rule__ComplexEvent__Group__2__Impl : ( ( rule__ComplexEvent__Group_2__0 )? ) ;
    public final void rule__ComplexEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3881:1: ( ( ( rule__ComplexEvent__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:3882:1: ( ( rule__ComplexEvent__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:3882:1: ( ( rule__ComplexEvent__Group_2__0 )? )
            // InternalMoniLog4DSL.g:3883:2: ( rule__ComplexEvent__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:3884:2: ( rule__ComplexEvent__Group_2__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==36) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoniLog4DSL.g:3884:3: rule__ComplexEvent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComplexEvent__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__2__Impl"


    // $ANTLR start "rule__ComplexEvent__Group__3"
    // InternalMoniLog4DSL.g:3892:1: rule__ComplexEvent__Group__3 : rule__ComplexEvent__Group__3__Impl rule__ComplexEvent__Group__4 ;
    public final void rule__ComplexEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3896:1: ( rule__ComplexEvent__Group__3__Impl rule__ComplexEvent__Group__4 )
            // InternalMoniLog4DSL.g:3897:2: rule__ComplexEvent__Group__3__Impl rule__ComplexEvent__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__ComplexEvent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__3"


    // $ANTLR start "rule__ComplexEvent__Group__3__Impl"
    // InternalMoniLog4DSL.g:3904:1: rule__ComplexEvent__Group__3__Impl : ( '{' ) ;
    public final void rule__ComplexEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3908:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3909:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3909:1: ( '{' )
            // InternalMoniLog4DSL.g:3910:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__3__Impl"


    // $ANTLR start "rule__ComplexEvent__Group__4"
    // InternalMoniLog4DSL.g:3919:1: rule__ComplexEvent__Group__4 : rule__ComplexEvent__Group__4__Impl rule__ComplexEvent__Group__5 ;
    public final void rule__ComplexEvent__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3923:1: ( rule__ComplexEvent__Group__4__Impl rule__ComplexEvent__Group__5 )
            // InternalMoniLog4DSL.g:3924:2: rule__ComplexEvent__Group__4__Impl rule__ComplexEvent__Group__5
            {
            pushFollow(FOLLOW_14);
            rule__ComplexEvent__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__4"


    // $ANTLR start "rule__ComplexEvent__Group__4__Impl"
    // InternalMoniLog4DSL.g:3931:1: rule__ComplexEvent__Group__4__Impl : ( ( rule__ComplexEvent__PatternAssignment_4 ) ) ;
    public final void rule__ComplexEvent__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3935:1: ( ( ( rule__ComplexEvent__PatternAssignment_4 ) ) )
            // InternalMoniLog4DSL.g:3936:1: ( ( rule__ComplexEvent__PatternAssignment_4 ) )
            {
            // InternalMoniLog4DSL.g:3936:1: ( ( rule__ComplexEvent__PatternAssignment_4 ) )
            // InternalMoniLog4DSL.g:3937:2: ( rule__ComplexEvent__PatternAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getPatternAssignment_4()); 
            }
            // InternalMoniLog4DSL.g:3938:2: ( rule__ComplexEvent__PatternAssignment_4 )
            // InternalMoniLog4DSL.g:3938:3: rule__ComplexEvent__PatternAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__PatternAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getPatternAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__4__Impl"


    // $ANTLR start "rule__ComplexEvent__Group__5"
    // InternalMoniLog4DSL.g:3946:1: rule__ComplexEvent__Group__5 : rule__ComplexEvent__Group__5__Impl ;
    public final void rule__ComplexEvent__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3950:1: ( rule__ComplexEvent__Group__5__Impl )
            // InternalMoniLog4DSL.g:3951:2: rule__ComplexEvent__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__5"


    // $ANTLR start "rule__ComplexEvent__Group__5__Impl"
    // InternalMoniLog4DSL.g:3957:1: rule__ComplexEvent__Group__5__Impl : ( '}' ) ;
    public final void rule__ComplexEvent__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3961:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3962:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3962:1: ( '}' )
            // InternalMoniLog4DSL.g:3963:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getRightCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group__5__Impl"


    // $ANTLR start "rule__ComplexEvent__Group_2__0"
    // InternalMoniLog4DSL.g:3973:1: rule__ComplexEvent__Group_2__0 : rule__ComplexEvent__Group_2__0__Impl rule__ComplexEvent__Group_2__1 ;
    public final void rule__ComplexEvent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3977:1: ( rule__ComplexEvent__Group_2__0__Impl rule__ComplexEvent__Group_2__1 )
            // InternalMoniLog4DSL.g:3978:2: rule__ComplexEvent__Group_2__0__Impl rule__ComplexEvent__Group_2__1
            {
            pushFollow(FOLLOW_25);
            rule__ComplexEvent__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group_2__0"


    // $ANTLR start "rule__ComplexEvent__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:3985:1: rule__ComplexEvent__Group_2__0__Impl : ( '[' ) ;
    public final void rule__ComplexEvent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3989:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:3990:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:3990:1: ( '[' )
            // InternalMoniLog4DSL.g:3991:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getLeftSquareBracketKeyword_2_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getLeftSquareBracketKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group_2__0__Impl"


    // $ANTLR start "rule__ComplexEvent__Group_2__1"
    // InternalMoniLog4DSL.g:4000:1: rule__ComplexEvent__Group_2__1 : rule__ComplexEvent__Group_2__1__Impl rule__ComplexEvent__Group_2__2 ;
    public final void rule__ComplexEvent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4004:1: ( rule__ComplexEvent__Group_2__1__Impl rule__ComplexEvent__Group_2__2 )
            // InternalMoniLog4DSL.g:4005:2: rule__ComplexEvent__Group_2__1__Impl rule__ComplexEvent__Group_2__2
            {
            pushFollow(FOLLOW_21);
            rule__ComplexEvent__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group_2__1"


    // $ANTLR start "rule__ComplexEvent__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:4012:1: rule__ComplexEvent__Group_2__1__Impl : ( ( rule__ComplexEvent__KindAssignment_2_1 ) ) ;
    public final void rule__ComplexEvent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4016:1: ( ( ( rule__ComplexEvent__KindAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:4017:1: ( ( rule__ComplexEvent__KindAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:4017:1: ( ( rule__ComplexEvent__KindAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:4018:2: ( rule__ComplexEvent__KindAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getKindAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:4019:2: ( rule__ComplexEvent__KindAssignment_2_1 )
            // InternalMoniLog4DSL.g:4019:3: rule__ComplexEvent__KindAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__KindAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getKindAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group_2__1__Impl"


    // $ANTLR start "rule__ComplexEvent__Group_2__2"
    // InternalMoniLog4DSL.g:4027:1: rule__ComplexEvent__Group_2__2 : rule__ComplexEvent__Group_2__2__Impl ;
    public final void rule__ComplexEvent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4031:1: ( rule__ComplexEvent__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:4032:2: rule__ComplexEvent__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComplexEvent__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group_2__2"


    // $ANTLR start "rule__ComplexEvent__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:4038:1: rule__ComplexEvent__Group_2__2__Impl : ( ']' ) ;
    public final void rule__ComplexEvent__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4042:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:4043:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:4043:1: ( ']' )
            // InternalMoniLog4DSL.g:4044:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getRightSquareBracketKeyword_2_2()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getRightSquareBracketKeyword_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__Group_2__2__Impl"


    // $ANTLR start "rule__UserEvent__Group__0"
    // InternalMoniLog4DSL.g:4054:1: rule__UserEvent__Group__0 : rule__UserEvent__Group__0__Impl rule__UserEvent__Group__1 ;
    public final void rule__UserEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4058:1: ( rule__UserEvent__Group__0__Impl rule__UserEvent__Group__1 )
            // InternalMoniLog4DSL.g:4059:2: rule__UserEvent__Group__0__Impl rule__UserEvent__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__UserEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group__0"


    // $ANTLR start "rule__UserEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:4066:1: rule__UserEvent__Group__0__Impl : ( 'custom' ) ;
    public final void rule__UserEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4070:1: ( ( 'custom' ) )
            // InternalMoniLog4DSL.g:4071:1: ( 'custom' )
            {
            // InternalMoniLog4DSL.g:4071:1: ( 'custom' )
            // InternalMoniLog4DSL.g:4072:2: 'custom'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getCustomKeyword_0()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getCustomKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group__0__Impl"


    // $ANTLR start "rule__UserEvent__Group__1"
    // InternalMoniLog4DSL.g:4081:1: rule__UserEvent__Group__1 : rule__UserEvent__Group__1__Impl rule__UserEvent__Group__2 ;
    public final void rule__UserEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4085:1: ( rule__UserEvent__Group__1__Impl rule__UserEvent__Group__2 )
            // InternalMoniLog4DSL.g:4086:2: rule__UserEvent__Group__1__Impl rule__UserEvent__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__UserEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group__1"


    // $ANTLR start "rule__UserEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:4093:1: rule__UserEvent__Group__1__Impl : ( ( rule__UserEvent__NameAssignment_1 ) ) ;
    public final void rule__UserEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4097:1: ( ( ( rule__UserEvent__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4098:1: ( ( rule__UserEvent__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4098:1: ( ( rule__UserEvent__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:4099:2: ( rule__UserEvent__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:4100:2: ( rule__UserEvent__NameAssignment_1 )
            // InternalMoniLog4DSL.g:4100:3: rule__UserEvent__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group__1__Impl"


    // $ANTLR start "rule__UserEvent__Group__2"
    // InternalMoniLog4DSL.g:4108:1: rule__UserEvent__Group__2 : rule__UserEvent__Group__2__Impl ;
    public final void rule__UserEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4112:1: ( rule__UserEvent__Group__2__Impl )
            // InternalMoniLog4DSL.g:4113:2: rule__UserEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group__2"


    // $ANTLR start "rule__UserEvent__Group__2__Impl"
    // InternalMoniLog4DSL.g:4119:1: rule__UserEvent__Group__2__Impl : ( ( rule__UserEvent__Group_2__0 )? ) ;
    public final void rule__UserEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4123:1: ( ( ( rule__UserEvent__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:4124:1: ( ( rule__UserEvent__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:4124:1: ( ( rule__UserEvent__Group_2__0 )? )
            // InternalMoniLog4DSL.g:4125:2: ( rule__UserEvent__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:4126:2: ( rule__UserEvent__Group_2__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==28) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoniLog4DSL.g:4126:3: rule__UserEvent__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__UserEvent__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group__2__Impl"


    // $ANTLR start "rule__UserEvent__Group_2__0"
    // InternalMoniLog4DSL.g:4135:1: rule__UserEvent__Group_2__0 : rule__UserEvent__Group_2__0__Impl rule__UserEvent__Group_2__1 ;
    public final void rule__UserEvent__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4139:1: ( rule__UserEvent__Group_2__0__Impl rule__UserEvent__Group_2__1 )
            // InternalMoniLog4DSL.g:4140:2: rule__UserEvent__Group_2__0__Impl rule__UserEvent__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__UserEvent__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__0"


    // $ANTLR start "rule__UserEvent__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:4147:1: rule__UserEvent__Group_2__0__Impl : ( '(' ) ;
    public final void rule__UserEvent__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4151:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4152:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4152:1: ( '(' )
            // InternalMoniLog4DSL.g:4153:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getLeftParenthesisKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__0__Impl"


    // $ANTLR start "rule__UserEvent__Group_2__1"
    // InternalMoniLog4DSL.g:4162:1: rule__UserEvent__Group_2__1 : rule__UserEvent__Group_2__1__Impl rule__UserEvent__Group_2__2 ;
    public final void rule__UserEvent__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4166:1: ( rule__UserEvent__Group_2__1__Impl rule__UserEvent__Group_2__2 )
            // InternalMoniLog4DSL.g:4167:2: rule__UserEvent__Group_2__1__Impl rule__UserEvent__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__UserEvent__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__1"


    // $ANTLR start "rule__UserEvent__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:4174:1: rule__UserEvent__Group_2__1__Impl : ( ( rule__UserEvent__ParametersAssignment_2_1 ) ) ;
    public final void rule__UserEvent__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4178:1: ( ( ( rule__UserEvent__ParametersAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:4179:1: ( ( rule__UserEvent__ParametersAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:4179:1: ( ( rule__UserEvent__ParametersAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:4180:2: ( rule__UserEvent__ParametersAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getParametersAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:4181:2: ( rule__UserEvent__ParametersAssignment_2_1 )
            // InternalMoniLog4DSL.g:4181:3: rule__UserEvent__ParametersAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__ParametersAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getParametersAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__1__Impl"


    // $ANTLR start "rule__UserEvent__Group_2__2"
    // InternalMoniLog4DSL.g:4189:1: rule__UserEvent__Group_2__2 : rule__UserEvent__Group_2__2__Impl rule__UserEvent__Group_2__3 ;
    public final void rule__UserEvent__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4193:1: ( rule__UserEvent__Group_2__2__Impl rule__UserEvent__Group_2__3 )
            // InternalMoniLog4DSL.g:4194:2: rule__UserEvent__Group_2__2__Impl rule__UserEvent__Group_2__3
            {
            pushFollow(FOLLOW_11);
            rule__UserEvent__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group_2__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__2"


    // $ANTLR start "rule__UserEvent__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:4201:1: rule__UserEvent__Group_2__2__Impl : ( ( rule__UserEvent__Group_2_2__0 )* ) ;
    public final void rule__UserEvent__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4205:1: ( ( ( rule__UserEvent__Group_2_2__0 )* ) )
            // InternalMoniLog4DSL.g:4206:1: ( ( rule__UserEvent__Group_2_2__0 )* )
            {
            // InternalMoniLog4DSL.g:4206:1: ( ( rule__UserEvent__Group_2_2__0 )* )
            // InternalMoniLog4DSL.g:4207:2: ( rule__UserEvent__Group_2_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getGroup_2_2()); 
            }
            // InternalMoniLog4DSL.g:4208:2: ( rule__UserEvent__Group_2_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:4208:3: rule__UserEvent__Group_2_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__UserEvent__Group_2_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getGroup_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__2__Impl"


    // $ANTLR start "rule__UserEvent__Group_2__3"
    // InternalMoniLog4DSL.g:4216:1: rule__UserEvent__Group_2__3 : rule__UserEvent__Group_2__3__Impl ;
    public final void rule__UserEvent__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4220:1: ( rule__UserEvent__Group_2__3__Impl )
            // InternalMoniLog4DSL.g:4221:2: rule__UserEvent__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group_2__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__3"


    // $ANTLR start "rule__UserEvent__Group_2__3__Impl"
    // InternalMoniLog4DSL.g:4227:1: rule__UserEvent__Group_2__3__Impl : ( ')' ) ;
    public final void rule__UserEvent__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4231:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4232:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4232:1: ( ')' )
            // InternalMoniLog4DSL.g:4233:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getRightParenthesisKeyword_2_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getRightParenthesisKeyword_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2__3__Impl"


    // $ANTLR start "rule__UserEvent__Group_2_2__0"
    // InternalMoniLog4DSL.g:4243:1: rule__UserEvent__Group_2_2__0 : rule__UserEvent__Group_2_2__0__Impl rule__UserEvent__Group_2_2__1 ;
    public final void rule__UserEvent__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4247:1: ( rule__UserEvent__Group_2_2__0__Impl rule__UserEvent__Group_2_2__1 )
            // InternalMoniLog4DSL.g:4248:2: rule__UserEvent__Group_2_2__0__Impl rule__UserEvent__Group_2_2__1
            {
            pushFollow(FOLLOW_7);
            rule__UserEvent__Group_2_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group_2_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2_2__0"


    // $ANTLR start "rule__UserEvent__Group_2_2__0__Impl"
    // InternalMoniLog4DSL.g:4255:1: rule__UserEvent__Group_2_2__0__Impl : ( ',' ) ;
    public final void rule__UserEvent__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4259:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:4260:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:4260:1: ( ',' )
            // InternalMoniLog4DSL.g:4261:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getCommaKeyword_2_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getCommaKeyword_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2_2__0__Impl"


    // $ANTLR start "rule__UserEvent__Group_2_2__1"
    // InternalMoniLog4DSL.g:4270:1: rule__UserEvent__Group_2_2__1 : rule__UserEvent__Group_2_2__1__Impl ;
    public final void rule__UserEvent__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4274:1: ( rule__UserEvent__Group_2_2__1__Impl )
            // InternalMoniLog4DSL.g:4275:2: rule__UserEvent__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__Group_2_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2_2__1"


    // $ANTLR start "rule__UserEvent__Group_2_2__1__Impl"
    // InternalMoniLog4DSL.g:4281:1: rule__UserEvent__Group_2_2__1__Impl : ( ( rule__UserEvent__ParametersAssignment_2_2_1 ) ) ;
    public final void rule__UserEvent__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4285:1: ( ( ( rule__UserEvent__ParametersAssignment_2_2_1 ) ) )
            // InternalMoniLog4DSL.g:4286:1: ( ( rule__UserEvent__ParametersAssignment_2_2_1 ) )
            {
            // InternalMoniLog4DSL.g:4286:1: ( ( rule__UserEvent__ParametersAssignment_2_2_1 ) )
            // InternalMoniLog4DSL.g:4287:2: ( rule__UserEvent__ParametersAssignment_2_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getParametersAssignment_2_2_1()); 
            }
            // InternalMoniLog4DSL.g:4288:2: ( rule__UserEvent__ParametersAssignment_2_2_1 )
            // InternalMoniLog4DSL.g:4288:3: rule__UserEvent__ParametersAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__UserEvent__ParametersAssignment_2_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getParametersAssignment_2_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__Group_2_2__1__Impl"


    // $ANTLR start "rule__Condition__Group__0"
    // InternalMoniLog4DSL.g:4297:1: rule__Condition__Group__0 : rule__Condition__Group__0__Impl rule__Condition__Group__1 ;
    public final void rule__Condition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4301:1: ( rule__Condition__Group__0__Impl rule__Condition__Group__1 )
            // InternalMoniLog4DSL.g:4302:2: rule__Condition__Group__0__Impl rule__Condition__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Condition__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0"


    // $ANTLR start "rule__Condition__Group__0__Impl"
    // InternalMoniLog4DSL.g:4309:1: rule__Condition__Group__0__Impl : ( () ) ;
    public final void rule__Condition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4313:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4314:1: ( () )
            {
            // InternalMoniLog4DSL.g:4314:1: ( () )
            // InternalMoniLog4DSL.g:4315:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getLanguageExpressionConditionAction_0()); 
            }
            // InternalMoniLog4DSL.g:4316:2: ()
            // InternalMoniLog4DSL.g:4316:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getLanguageExpressionConditionAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__0__Impl"


    // $ANTLR start "rule__Condition__Group__1"
    // InternalMoniLog4DSL.g:4324:1: rule__Condition__Group__1 : rule__Condition__Group__1__Impl ;
    public final void rule__Condition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4328:1: ( rule__Condition__Group__1__Impl )
            // InternalMoniLog4DSL.g:4329:2: rule__Condition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1"


    // $ANTLR start "rule__Condition__Group__1__Impl"
    // InternalMoniLog4DSL.g:4335:1: rule__Condition__Group__1__Impl : ( ( rule__Condition__ExpressionAssignment_1 ) ) ;
    public final void rule__Condition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4339:1: ( ( ( rule__Condition__ExpressionAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4340:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4340:1: ( ( rule__Condition__ExpressionAssignment_1 ) )
            // InternalMoniLog4DSL.g:4341:2: ( rule__Condition__ExpressionAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:4342:2: ( rule__Condition__ExpressionAssignment_1 )
            // InternalMoniLog4DSL.g:4342:3: rule__Condition__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group__1__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__0"
    // InternalMoniLog4DSL.g:4351:1: rule__TemporalPattern__Group__0 : rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 ;
    public final void rule__TemporalPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4355:1: ( rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 )
            // InternalMoniLog4DSL.g:4356:2: rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__TemporalPattern__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__0"


    // $ANTLR start "rule__TemporalPattern__Group__0__Impl"
    // InternalMoniLog4DSL.g:4363:1: rule__TemporalPattern__Group__0__Impl : ( ( rule__TemporalPattern__PatternAssignment_0 ) ) ;
    public final void rule__TemporalPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4367:1: ( ( ( rule__TemporalPattern__PatternAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:4368:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:4368:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            // InternalMoniLog4DSL.g:4369:2: ( rule__TemporalPattern__PatternAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:4370:2: ( rule__TemporalPattern__PatternAssignment_0 )
            // InternalMoniLog4DSL.g:4370:3: rule__TemporalPattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__PatternAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__0__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__1"
    // InternalMoniLog4DSL.g:4378:1: rule__TemporalPattern__Group__1 : rule__TemporalPattern__Group__1__Impl ;
    public final void rule__TemporalPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4382:1: ( rule__TemporalPattern__Group__1__Impl )
            // InternalMoniLog4DSL.g:4383:2: rule__TemporalPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__1"


    // $ANTLR start "rule__TemporalPattern__Group__1__Impl"
    // InternalMoniLog4DSL.g:4389:1: rule__TemporalPattern__Group__1__Impl : ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) ;
    public final void rule__TemporalPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4393:1: ( ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4394:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4394:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            // InternalMoniLog4DSL.g:4395:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:4396:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            // InternalMoniLog4DSL.g:4396:3: rule__TemporalPattern__ScopeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__ScopeAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group_0__0"
    // InternalMoniLog4DSL.g:4405:1: rule__Pattern__Group_0__0 : rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 ;
    public final void rule__Pattern__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4409:1: ( rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 )
            // InternalMoniLog4DSL.g:4410:2: rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__0"


    // $ANTLR start "rule__Pattern__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:4417:1: rule__Pattern__Group_0__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4421:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4422:1: ( () )
            {
            // InternalMoniLog4DSL.g:4422:1: ( () )
            // InternalMoniLog4DSL.g:4423:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getExistenceAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:4424:2: ()
            // InternalMoniLog4DSL.g:4424:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getExistenceAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__0__Impl"


    // $ANTLR start "rule__Pattern__Group_0__1"
    // InternalMoniLog4DSL.g:4432:1: rule__Pattern__Group_0__1 : rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 ;
    public final void rule__Pattern__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4436:1: ( rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 )
            // InternalMoniLog4DSL.g:4437:2: rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__1"


    // $ANTLR start "rule__Pattern__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:4444:1: rule__Pattern__Group_0__1__Impl : ( ( 'exists' )? ) ;
    public final void rule__Pattern__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4448:1: ( ( ( 'exists' )? ) )
            // InternalMoniLog4DSL.g:4449:1: ( ( 'exists' )? )
            {
            // InternalMoniLog4DSL.g:4449:1: ( ( 'exists' )? )
            // InternalMoniLog4DSL.g:4450:2: ( 'exists' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getExistsKeyword_0_1()); 
            }
            // InternalMoniLog4DSL.g:4451:2: ( 'exists' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==42) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoniLog4DSL.g:4451:3: 'exists'
                    {
                    match(input,42,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getExistsKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__1__Impl"


    // $ANTLR start "rule__Pattern__Group_0__2"
    // InternalMoniLog4DSL.g:4459:1: rule__Pattern__Group_0__2 : rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3 ;
    public final void rule__Pattern__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4463:1: ( rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3 )
            // InternalMoniLog4DSL.g:4464:2: rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__2"


    // $ANTLR start "rule__Pattern__Group_0__2__Impl"
    // InternalMoniLog4DSL.g:4471:1: rule__Pattern__Group_0__2__Impl : ( ( rule__Pattern__BoundAssignment_0_2 )? ) ;
    public final void rule__Pattern__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4475:1: ( ( ( rule__Pattern__BoundAssignment_0_2 )? ) )
            // InternalMoniLog4DSL.g:4476:1: ( ( rule__Pattern__BoundAssignment_0_2 )? )
            {
            // InternalMoniLog4DSL.g:4476:1: ( ( rule__Pattern__BoundAssignment_0_2 )? )
            // InternalMoniLog4DSL.g:4477:2: ( rule__Pattern__BoundAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getBoundAssignment_0_2()); 
            }
            // InternalMoniLog4DSL.g:4478:2: ( rule__Pattern__BoundAssignment_0_2 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==RULE_INT||(LA38_0>=47 && LA38_0<=48)) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoniLog4DSL.g:4478:3: rule__Pattern__BoundAssignment_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__BoundAssignment_0_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getBoundAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__2__Impl"


    // $ANTLR start "rule__Pattern__Group_0__3"
    // InternalMoniLog4DSL.g:4486:1: rule__Pattern__Group_0__3 : rule__Pattern__Group_0__3__Impl ;
    public final void rule__Pattern__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4490:1: ( rule__Pattern__Group_0__3__Impl )
            // InternalMoniLog4DSL.g:4491:2: rule__Pattern__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__3"


    // $ANTLR start "rule__Pattern__Group_0__3__Impl"
    // InternalMoniLog4DSL.g:4497:1: rule__Pattern__Group_0__3__Impl : ( ( rule__Pattern__EventAssignment_0_3 ) ) ;
    public final void rule__Pattern__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4501:1: ( ( ( rule__Pattern__EventAssignment_0_3 ) ) )
            // InternalMoniLog4DSL.g:4502:1: ( ( rule__Pattern__EventAssignment_0_3 ) )
            {
            // InternalMoniLog4DSL.g:4502:1: ( ( rule__Pattern__EventAssignment_0_3 ) )
            // InternalMoniLog4DSL.g:4503:2: ( rule__Pattern__EventAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_0_3()); 
            }
            // InternalMoniLog4DSL.g:4504:2: ( rule__Pattern__EventAssignment_0_3 )
            // InternalMoniLog4DSL.g:4504:3: rule__Pattern__EventAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_0__3__Impl"


    // $ANTLR start "rule__Pattern__Group_1__0"
    // InternalMoniLog4DSL.g:4513:1: rule__Pattern__Group_1__0 : rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 ;
    public final void rule__Pattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4517:1: ( rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 )
            // InternalMoniLog4DSL.g:4518:2: rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Pattern__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__0"


    // $ANTLR start "rule__Pattern__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:4525:1: rule__Pattern__Group_1__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4529:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4530:1: ( () )
            {
            // InternalMoniLog4DSL.g:4530:1: ( () )
            // InternalMoniLog4DSL.g:4531:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getUniversalityAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:4532:2: ()
            // InternalMoniLog4DSL.g:4532:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getUniversalityAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__0__Impl"


    // $ANTLR start "rule__Pattern__Group_1__1"
    // InternalMoniLog4DSL.g:4540:1: rule__Pattern__Group_1__1 : rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 ;
    public final void rule__Pattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4544:1: ( rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 )
            // InternalMoniLog4DSL.g:4545:2: rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__1"


    // $ANTLR start "rule__Pattern__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:4552:1: rule__Pattern__Group_1__1__Impl : ( 'always' ) ;
    public final void rule__Pattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4556:1: ( ( 'always' ) )
            // InternalMoniLog4DSL.g:4557:1: ( 'always' )
            {
            // InternalMoniLog4DSL.g:4557:1: ( 'always' )
            // InternalMoniLog4DSL.g:4558:2: 'always'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAlwaysKeyword_1_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getAlwaysKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__1__Impl"


    // $ANTLR start "rule__Pattern__Group_1__2"
    // InternalMoniLog4DSL.g:4567:1: rule__Pattern__Group_1__2 : rule__Pattern__Group_1__2__Impl ;
    public final void rule__Pattern__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4571:1: ( rule__Pattern__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:4572:2: rule__Pattern__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__2"


    // $ANTLR start "rule__Pattern__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:4578:1: rule__Pattern__Group_1__2__Impl : ( ( rule__Pattern__EventAssignment_1_2 ) ) ;
    public final void rule__Pattern__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4582:1: ( ( ( rule__Pattern__EventAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:4583:1: ( ( rule__Pattern__EventAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:4583:1: ( ( rule__Pattern__EventAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:4584:2: ( rule__Pattern__EventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_1_2()); 
            }
            // InternalMoniLog4DSL.g:4585:2: ( rule__Pattern__EventAssignment_1_2 )
            // InternalMoniLog4DSL.g:4585:3: rule__Pattern__EventAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__2__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // InternalMoniLog4DSL.g:4594:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4598:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMoniLog4DSL.g:4599:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0"


    // $ANTLR start "rule__Pattern__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:4606:1: rule__Pattern__Group_2__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4610:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4611:1: ( () )
            {
            // InternalMoniLog4DSL.g:4611:1: ( () )
            // InternalMoniLog4DSL.g:4612:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAbsenceAction_2_0()); 
            }
            // InternalMoniLog4DSL.g:4613:2: ()
            // InternalMoniLog4DSL.g:4613:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getAbsenceAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__0__Impl"


    // $ANTLR start "rule__Pattern__Group_2__1"
    // InternalMoniLog4DSL.g:4621:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4625:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMoniLog4DSL.g:4626:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1"


    // $ANTLR start "rule__Pattern__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:4633:1: rule__Pattern__Group_2__1__Impl : ( 'never' ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4637:1: ( ( 'never' ) )
            // InternalMoniLog4DSL.g:4638:1: ( 'never' )
            {
            // InternalMoniLog4DSL.g:4638:1: ( 'never' )
            // InternalMoniLog4DSL.g:4639:2: 'never'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNeverKeyword_2_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getNeverKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__1__Impl"


    // $ANTLR start "rule__Pattern__Group_2__2"
    // InternalMoniLog4DSL.g:4648:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4652:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:4653:2: rule__Pattern__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2"


    // $ANTLR start "rule__Pattern__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:4659:1: rule__Pattern__Group_2__2__Impl : ( ( rule__Pattern__EventAssignment_2_2 ) ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4663:1: ( ( ( rule__Pattern__EventAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:4664:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:4664:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:4665:2: ( rule__Pattern__EventAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_2_2()); 
            }
            // InternalMoniLog4DSL.g:4666:2: ( rule__Pattern__EventAssignment_2_2 )
            // InternalMoniLog4DSL.g:4666:3: rule__Pattern__EventAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_2__2__Impl"


    // $ANTLR start "rule__Pattern__Group_3__0"
    // InternalMoniLog4DSL.g:4675:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4679:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalMoniLog4DSL.g:4680:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__0"


    // $ANTLR start "rule__Pattern__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:4687:1: rule__Pattern__Group_3__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4691:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4692:1: ( () )
            {
            // InternalMoniLog4DSL.g:4692:1: ( () )
            // InternalMoniLog4DSL.g:4693:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPrecedenceAction_3_0()); 
            }
            // InternalMoniLog4DSL.g:4694:2: ()
            // InternalMoniLog4DSL.g:4694:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPrecedenceAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__0__Impl"


    // $ANTLR start "rule__Pattern__Group_3__1"
    // InternalMoniLog4DSL.g:4702:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4706:1: ( rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 )
            // InternalMoniLog4DSL.g:4707:2: rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__Pattern__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__1"


    // $ANTLR start "rule__Pattern__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:4714:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4718:1: ( ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:4719:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:4719:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:4720:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:4721:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            // InternalMoniLog4DSL.g:4721:3: rule__Pattern__PredecessorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__PredecessorAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__1__Impl"


    // $ANTLR start "rule__Pattern__Group_3__2"
    // InternalMoniLog4DSL.g:4729:1: rule__Pattern__Group_3__2 : rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 ;
    public final void rule__Pattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4733:1: ( rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 )
            // InternalMoniLog4DSL.g:4734:2: rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__2"


    // $ANTLR start "rule__Pattern__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:4741:1: rule__Pattern__Group_3__2__Impl : ( 'precedes' ) ;
    public final void rule__Pattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4745:1: ( ( 'precedes' ) )
            // InternalMoniLog4DSL.g:4746:1: ( 'precedes' )
            {
            // InternalMoniLog4DSL.g:4746:1: ( 'precedes' )
            // InternalMoniLog4DSL.g:4747:2: 'precedes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPrecedesKeyword_3_2()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPrecedesKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__2__Impl"


    // $ANTLR start "rule__Pattern__Group_3__3"
    // InternalMoniLog4DSL.g:4756:1: rule__Pattern__Group_3__3 : rule__Pattern__Group_3__3__Impl ;
    public final void rule__Pattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4760:1: ( rule__Pattern__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:4761:2: rule__Pattern__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__3"


    // $ANTLR start "rule__Pattern__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:4767:1: rule__Pattern__Group_3__3__Impl : ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) ;
    public final void rule__Pattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4771:1: ( ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) )
            // InternalMoniLog4DSL.g:4772:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            {
            // InternalMoniLog4DSL.g:4772:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            // InternalMoniLog4DSL.g:4773:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3()); 
            }
            // InternalMoniLog4DSL.g:4774:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            // InternalMoniLog4DSL.g:4774:3: rule__Pattern__SuccessorAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__SuccessorAssignment_3_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_3__3__Impl"


    // $ANTLR start "rule__Pattern__Group_4__0"
    // InternalMoniLog4DSL.g:4783:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4787:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalMoniLog4DSL.g:4788:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0"


    // $ANTLR start "rule__Pattern__Group_4__0__Impl"
    // InternalMoniLog4DSL.g:4795:1: rule__Pattern__Group_4__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4799:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4800:1: ( () )
            {
            // InternalMoniLog4DSL.g:4800:1: ( () )
            // InternalMoniLog4DSL.g:4801:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getResponseAction_4_0()); 
            }
            // InternalMoniLog4DSL.g:4802:2: ()
            // InternalMoniLog4DSL.g:4802:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getResponseAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__0__Impl"


    // $ANTLR start "rule__Pattern__Group_4__1"
    // InternalMoniLog4DSL.g:4810:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4814:1: ( rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 )
            // InternalMoniLog4DSL.g:4815:2: rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__Pattern__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1"


    // $ANTLR start "rule__Pattern__Group_4__1__Impl"
    // InternalMoniLog4DSL.g:4822:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__EventAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4826:1: ( ( ( rule__Pattern__EventAssignment_4_1 ) ) )
            // InternalMoniLog4DSL.g:4827:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            {
            // InternalMoniLog4DSL.g:4827:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            // InternalMoniLog4DSL.g:4828:2: ( rule__Pattern__EventAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_4_1()); 
            }
            // InternalMoniLog4DSL.g:4829:2: ( rule__Pattern__EventAssignment_4_1 )
            // InternalMoniLog4DSL.g:4829:3: rule__Pattern__EventAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__1__Impl"


    // $ANTLR start "rule__Pattern__Group_4__2"
    // InternalMoniLog4DSL.g:4837:1: rule__Pattern__Group_4__2 : rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 ;
    public final void rule__Pattern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4841:1: ( rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 )
            // InternalMoniLog4DSL.g:4842:2: rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__2"


    // $ANTLR start "rule__Pattern__Group_4__2__Impl"
    // InternalMoniLog4DSL.g:4849:1: rule__Pattern__Group_4__2__Impl : ( 'respondsTo' ) ;
    public final void rule__Pattern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4853:1: ( ( 'respondsTo' ) )
            // InternalMoniLog4DSL.g:4854:1: ( 'respondsTo' )
            {
            // InternalMoniLog4DSL.g:4854:1: ( 'respondsTo' )
            // InternalMoniLog4DSL.g:4855:2: 'respondsTo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRespondsToKeyword_4_2()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getRespondsToKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__2__Impl"


    // $ANTLR start "rule__Pattern__Group_4__3"
    // InternalMoniLog4DSL.g:4864:1: rule__Pattern__Group_4__3 : rule__Pattern__Group_4__3__Impl ;
    public final void rule__Pattern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4868:1: ( rule__Pattern__Group_4__3__Impl )
            // InternalMoniLog4DSL.g:4869:2: rule__Pattern__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__3"


    // $ANTLR start "rule__Pattern__Group_4__3__Impl"
    // InternalMoniLog4DSL.g:4875:1: rule__Pattern__Group_4__3__Impl : ( ( rule__Pattern__TriggerAssignment_4_3 ) ) ;
    public final void rule__Pattern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4879:1: ( ( ( rule__Pattern__TriggerAssignment_4_3 ) ) )
            // InternalMoniLog4DSL.g:4880:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            {
            // InternalMoniLog4DSL.g:4880:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            // InternalMoniLog4DSL.g:4881:2: ( rule__Pattern__TriggerAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getTriggerAssignment_4_3()); 
            }
            // InternalMoniLog4DSL.g:4882:2: ( rule__Pattern__TriggerAssignment_4_3 )
            // InternalMoniLog4DSL.g:4882:3: rule__Pattern__TriggerAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__TriggerAssignment_4_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getTriggerAssignment_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_4__3__Impl"


    // $ANTLR start "rule__LowerBound__Group__0"
    // InternalMoniLog4DSL.g:4891:1: rule__LowerBound__Group__0 : rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 ;
    public final void rule__LowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4895:1: ( rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 )
            // InternalMoniLog4DSL.g:4896:2: rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__LowerBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LowerBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerBound__Group__0"


    // $ANTLR start "rule__LowerBound__Group__0__Impl"
    // InternalMoniLog4DSL.g:4903:1: rule__LowerBound__Group__0__Impl : ( 'atleast' ) ;
    public final void rule__LowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4907:1: ( ( 'atleast' ) )
            // InternalMoniLog4DSL.g:4908:1: ( 'atleast' )
            {
            // InternalMoniLog4DSL.g:4908:1: ( 'atleast' )
            // InternalMoniLog4DSL.g:4909:2: 'atleast'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getAtleastKeyword_0()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLowerBoundAccess().getAtleastKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerBound__Group__0__Impl"


    // $ANTLR start "rule__LowerBound__Group__1"
    // InternalMoniLog4DSL.g:4918:1: rule__LowerBound__Group__1 : rule__LowerBound__Group__1__Impl ;
    public final void rule__LowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4922:1: ( rule__LowerBound__Group__1__Impl )
            // InternalMoniLog4DSL.g:4923:2: rule__LowerBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LowerBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerBound__Group__1"


    // $ANTLR start "rule__LowerBound__Group__1__Impl"
    // InternalMoniLog4DSL.g:4929:1: rule__LowerBound__Group__1__Impl : ( ( rule__LowerBound__NAssignment_1 ) ) ;
    public final void rule__LowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4933:1: ( ( ( rule__LowerBound__NAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4934:1: ( ( rule__LowerBound__NAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4934:1: ( ( rule__LowerBound__NAssignment_1 ) )
            // InternalMoniLog4DSL.g:4935:2: ( rule__LowerBound__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getNAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:4936:2: ( rule__LowerBound__NAssignment_1 )
            // InternalMoniLog4DSL.g:4936:3: rule__LowerBound__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LowerBound__NAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLowerBoundAccess().getNAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerBound__Group__1__Impl"


    // $ANTLR start "rule__UpperBound__Group__0"
    // InternalMoniLog4DSL.g:4945:1: rule__UpperBound__Group__0 : rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 ;
    public final void rule__UpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4949:1: ( rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 )
            // InternalMoniLog4DSL.g:4950:2: rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__UpperBound__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__UpperBound__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperBound__Group__0"


    // $ANTLR start "rule__UpperBound__Group__0__Impl"
    // InternalMoniLog4DSL.g:4957:1: rule__UpperBound__Group__0__Impl : ( 'atmost' ) ;
    public final void rule__UpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4961:1: ( ( 'atmost' ) )
            // InternalMoniLog4DSL.g:4962:1: ( 'atmost' )
            {
            // InternalMoniLog4DSL.g:4962:1: ( 'atmost' )
            // InternalMoniLog4DSL.g:4963:2: 'atmost'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getAtmostKeyword_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpperBoundAccess().getAtmostKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperBound__Group__0__Impl"


    // $ANTLR start "rule__UpperBound__Group__1"
    // InternalMoniLog4DSL.g:4972:1: rule__UpperBound__Group__1 : rule__UpperBound__Group__1__Impl ;
    public final void rule__UpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4976:1: ( rule__UpperBound__Group__1__Impl )
            // InternalMoniLog4DSL.g:4977:2: rule__UpperBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperBound__Group__1"


    // $ANTLR start "rule__UpperBound__Group__1__Impl"
    // InternalMoniLog4DSL.g:4983:1: rule__UpperBound__Group__1__Impl : ( ( rule__UpperBound__NAssignment_1 ) ) ;
    public final void rule__UpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4987:1: ( ( ( rule__UpperBound__NAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4988:1: ( ( rule__UpperBound__NAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4988:1: ( ( rule__UpperBound__NAssignment_1 ) )
            // InternalMoniLog4DSL.g:4989:2: ( rule__UpperBound__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getNAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:4990:2: ( rule__UpperBound__NAssignment_1 )
            // InternalMoniLog4DSL.g:4990:3: rule__UpperBound__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__NAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpperBoundAccess().getNAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperBound__Group__1__Impl"


    // $ANTLR start "rule__Scope__Group_0__0"
    // InternalMoniLog4DSL.g:4999:1: rule__Scope__Group_0__0 : rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 ;
    public final void rule__Scope__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5003:1: ( rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 )
            // InternalMoniLog4DSL.g:5004:2: rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1
            {
            pushFollow(FOLLOW_33);
            rule__Scope__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_0__0"


    // $ANTLR start "rule__Scope__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:5011:1: rule__Scope__Group_0__0__Impl : ( () ) ;
    public final void rule__Scope__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5015:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5016:1: ( () )
            {
            // InternalMoniLog4DSL.g:5016:1: ( () )
            // InternalMoniLog4DSL.g:5017:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getGloballyAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:5018:2: ()
            // InternalMoniLog4DSL.g:5018:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getGloballyAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_0__0__Impl"


    // $ANTLR start "rule__Scope__Group_0__1"
    // InternalMoniLog4DSL.g:5026:1: rule__Scope__Group_0__1 : rule__Scope__Group_0__1__Impl ;
    public final void rule__Scope__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5030:1: ( rule__Scope__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:5031:2: rule__Scope__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_0__1"


    // $ANTLR start "rule__Scope__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:5037:1: rule__Scope__Group_0__1__Impl : ( ( 'globally' )? ) ;
    public final void rule__Scope__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5041:1: ( ( ( 'globally' )? ) )
            // InternalMoniLog4DSL.g:5042:1: ( ( 'globally' )? )
            {
            // InternalMoniLog4DSL.g:5042:1: ( ( 'globally' )? )
            // InternalMoniLog4DSL.g:5043:2: ( 'globally' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 
            }
            // InternalMoniLog4DSL.g:5044:2: ( 'globally' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==49) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoniLog4DSL.g:5044:3: 'globally'
                    {
                    match(input,49,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_0__1__Impl"


    // $ANTLR start "rule__Scope__Group_1__0"
    // InternalMoniLog4DSL.g:5053:1: rule__Scope__Group_1__0 : rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 ;
    public final void rule__Scope__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5057:1: ( rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 )
            // InternalMoniLog4DSL.g:5058:2: rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1
            {
            pushFollow(FOLLOW_34);
            rule__Scope__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__0"


    // $ANTLR start "rule__Scope__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:5065:1: rule__Scope__Group_1__0__Impl : ( () ) ;
    public final void rule__Scope__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5069:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5070:1: ( () )
            {
            // InternalMoniLog4DSL.g:5070:1: ( () )
            // InternalMoniLog4DSL.g:5071:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:5072:2: ()
            // InternalMoniLog4DSL.g:5072:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getAfterAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__0__Impl"


    // $ANTLR start "rule__Scope__Group_1__1"
    // InternalMoniLog4DSL.g:5080:1: rule__Scope__Group_1__1 : rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 ;
    public final void rule__Scope__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5084:1: ( rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 )
            // InternalMoniLog4DSL.g:5085:2: rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2
            {
            pushFollow(FOLLOW_27);
            rule__Scope__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__1"


    // $ANTLR start "rule__Scope__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:5092:1: rule__Scope__Group_1__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5096:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:5097:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:5097:1: ( 'after' )
            // InternalMoniLog4DSL.g:5098:2: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterKeyword_1_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getAfterKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__1__Impl"


    // $ANTLR start "rule__Scope__Group_1__2"
    // InternalMoniLog4DSL.g:5107:1: rule__Scope__Group_1__2 : rule__Scope__Group_1__2__Impl ;
    public final void rule__Scope__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5111:1: ( rule__Scope__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:5112:2: rule__Scope__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__2"


    // $ANTLR start "rule__Scope__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:5118:1: rule__Scope__Group_1__2__Impl : ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) ;
    public final void rule__Scope__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5122:1: ( ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:5123:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:5123:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:5124:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2()); 
            }
            // InternalMoniLog4DSL.g:5125:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            // InternalMoniLog4DSL.g:5125:3: rule__Scope__LowerBoundAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__LowerBoundAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_1__2__Impl"


    // $ANTLR start "rule__Scope__Group_2__0"
    // InternalMoniLog4DSL.g:5134:1: rule__Scope__Group_2__0 : rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 ;
    public final void rule__Scope__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5138:1: ( rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 )
            // InternalMoniLog4DSL.g:5139:2: rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__Scope__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__0"


    // $ANTLR start "rule__Scope__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:5146:1: rule__Scope__Group_2__0__Impl : ( () ) ;
    public final void rule__Scope__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5150:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5151:1: ( () )
            {
            // InternalMoniLog4DSL.g:5151:1: ( () )
            // InternalMoniLog4DSL.g:5152:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBeforeAction_2_0()); 
            }
            // InternalMoniLog4DSL.g:5153:2: ()
            // InternalMoniLog4DSL.g:5153:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getBeforeAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__0__Impl"


    // $ANTLR start "rule__Scope__Group_2__1"
    // InternalMoniLog4DSL.g:5161:1: rule__Scope__Group_2__1 : rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 ;
    public final void rule__Scope__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5165:1: ( rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 )
            // InternalMoniLog4DSL.g:5166:2: rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2
            {
            pushFollow(FOLLOW_27);
            rule__Scope__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__1"


    // $ANTLR start "rule__Scope__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:5173:1: rule__Scope__Group_2__1__Impl : ( 'before' ) ;
    public final void rule__Scope__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5177:1: ( ( 'before' ) )
            // InternalMoniLog4DSL.g:5178:1: ( 'before' )
            {
            // InternalMoniLog4DSL.g:5178:1: ( 'before' )
            // InternalMoniLog4DSL.g:5179:2: 'before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBeforeKeyword_2_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getBeforeKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__1__Impl"


    // $ANTLR start "rule__Scope__Group_2__2"
    // InternalMoniLog4DSL.g:5188:1: rule__Scope__Group_2__2 : rule__Scope__Group_2__2__Impl ;
    public final void rule__Scope__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5192:1: ( rule__Scope__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:5193:2: rule__Scope__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__2"


    // $ANTLR start "rule__Scope__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:5199:1: rule__Scope__Group_2__2__Impl : ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) ;
    public final void rule__Scope__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5203:1: ( ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:5204:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:5204:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:5205:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2()); 
            }
            // InternalMoniLog4DSL.g:5206:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            // InternalMoniLog4DSL.g:5206:3: rule__Scope__UpperBoundAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__UpperBoundAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_2__2__Impl"


    // $ANTLR start "rule__Scope__Group_3__0"
    // InternalMoniLog4DSL.g:5215:1: rule__Scope__Group_3__0 : rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 ;
    public final void rule__Scope__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5219:1: ( rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 )
            // InternalMoniLog4DSL.g:5220:2: rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1
            {
            pushFollow(FOLLOW_36);
            rule__Scope__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__0"


    // $ANTLR start "rule__Scope__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:5227:1: rule__Scope__Group_3__0__Impl : ( () ) ;
    public final void rule__Scope__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5231:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5232:1: ( () )
            {
            // InternalMoniLog4DSL.g:5232:1: ( () )
            // InternalMoniLog4DSL.g:5233:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBetweenAction_3_0()); 
            }
            // InternalMoniLog4DSL.g:5234:2: ()
            // InternalMoniLog4DSL.g:5234:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getBetweenAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__0__Impl"


    // $ANTLR start "rule__Scope__Group_3__1"
    // InternalMoniLog4DSL.g:5242:1: rule__Scope__Group_3__1 : rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 ;
    public final void rule__Scope__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5246:1: ( rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 )
            // InternalMoniLog4DSL.g:5247:2: rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2
            {
            pushFollow(FOLLOW_27);
            rule__Scope__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__1"


    // $ANTLR start "rule__Scope__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:5254:1: rule__Scope__Group_3__1__Impl : ( 'between' ) ;
    public final void rule__Scope__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5258:1: ( ( 'between' ) )
            // InternalMoniLog4DSL.g:5259:1: ( 'between' )
            {
            // InternalMoniLog4DSL.g:5259:1: ( 'between' )
            // InternalMoniLog4DSL.g:5260:2: 'between'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__1__Impl"


    // $ANTLR start "rule__Scope__Group_3__2"
    // InternalMoniLog4DSL.g:5269:1: rule__Scope__Group_3__2 : rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 ;
    public final void rule__Scope__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5273:1: ( rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 )
            // InternalMoniLog4DSL.g:5274:2: rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3
            {
            pushFollow(FOLLOW_37);
            rule__Scope__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__2"


    // $ANTLR start "rule__Scope__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:5281:1: rule__Scope__Group_3__2__Impl : ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) ;
    public final void rule__Scope__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5285:1: ( ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) )
            // InternalMoniLog4DSL.g:5286:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            {
            // InternalMoniLog4DSL.g:5286:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            // InternalMoniLog4DSL.g:5287:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2()); 
            }
            // InternalMoniLog4DSL.g:5288:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            // InternalMoniLog4DSL.g:5288:3: rule__Scope__LowerBoundAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__LowerBoundAssignment_3_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__2__Impl"


    // $ANTLR start "rule__Scope__Group_3__3"
    // InternalMoniLog4DSL.g:5296:1: rule__Scope__Group_3__3 : rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 ;
    public final void rule__Scope__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5300:1: ( rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 )
            // InternalMoniLog4DSL.g:5301:2: rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4
            {
            pushFollow(FOLLOW_27);
            rule__Scope__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__3"


    // $ANTLR start "rule__Scope__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:5308:1: rule__Scope__Group_3__3__Impl : ( 'and' ) ;
    public final void rule__Scope__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5312:1: ( ( 'and' ) )
            // InternalMoniLog4DSL.g:5313:1: ( 'and' )
            {
            // InternalMoniLog4DSL.g:5313:1: ( 'and' )
            // InternalMoniLog4DSL.g:5314:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 
            }
            match(input,53,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__3__Impl"


    // $ANTLR start "rule__Scope__Group_3__4"
    // InternalMoniLog4DSL.g:5323:1: rule__Scope__Group_3__4 : rule__Scope__Group_3__4__Impl ;
    public final void rule__Scope__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5327:1: ( rule__Scope__Group_3__4__Impl )
            // InternalMoniLog4DSL.g:5328:2: rule__Scope__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__4"


    // $ANTLR start "rule__Scope__Group_3__4__Impl"
    // InternalMoniLog4DSL.g:5334:1: rule__Scope__Group_3__4__Impl : ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) ;
    public final void rule__Scope__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5338:1: ( ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) )
            // InternalMoniLog4DSL.g:5339:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            {
            // InternalMoniLog4DSL.g:5339:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            // InternalMoniLog4DSL.g:5340:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4()); 
            }
            // InternalMoniLog4DSL.g:5341:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            // InternalMoniLog4DSL.g:5341:3: rule__Scope__UpperBoundAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Scope__UpperBoundAssignment_3_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_3__4__Impl"


    // $ANTLR start "rule__Scope__Group_4__0"
    // InternalMoniLog4DSL.g:5350:1: rule__Scope__Group_4__0 : rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 ;
    public final void rule__Scope__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5354:1: ( rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 )
            // InternalMoniLog4DSL.g:5355:2: rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1
            {
            pushFollow(FOLLOW_26);
            rule__Scope__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__0"


    // $ANTLR start "rule__Scope__Group_4__0__Impl"
    // InternalMoniLog4DSL.g:5362:1: rule__Scope__Group_4__0__Impl : ( () ) ;
    public final void rule__Scope__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5366:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5367:1: ( () )
            {
            // InternalMoniLog4DSL.g:5367:1: ( () )
            // InternalMoniLog4DSL.g:5368:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterUntilAction_4_0()); 
            }
            // InternalMoniLog4DSL.g:5369:2: ()
            // InternalMoniLog4DSL.g:5369:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getAfterUntilAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__0__Impl"


    // $ANTLR start "rule__Scope__Group_4__1"
    // InternalMoniLog4DSL.g:5377:1: rule__Scope__Group_4__1 : rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 ;
    public final void rule__Scope__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5381:1: ( rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 )
            // InternalMoniLog4DSL.g:5382:2: rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2
            {
            pushFollow(FOLLOW_27);
            rule__Scope__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__1"


    // $ANTLR start "rule__Scope__Group_4__1__Impl"
    // InternalMoniLog4DSL.g:5389:1: rule__Scope__Group_4__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5393:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:5394:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:5394:1: ( 'after' )
            // InternalMoniLog4DSL.g:5395:2: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__1__Impl"


    // $ANTLR start "rule__Scope__Group_4__2"
    // InternalMoniLog4DSL.g:5404:1: rule__Scope__Group_4__2 : rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 ;
    public final void rule__Scope__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5408:1: ( rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 )
            // InternalMoniLog4DSL.g:5409:2: rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3
            {
            pushFollow(FOLLOW_38);
            rule__Scope__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__2"


    // $ANTLR start "rule__Scope__Group_4__2__Impl"
    // InternalMoniLog4DSL.g:5416:1: rule__Scope__Group_4__2__Impl : ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) ;
    public final void rule__Scope__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5420:1: ( ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) )
            // InternalMoniLog4DSL.g:5421:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            {
            // InternalMoniLog4DSL.g:5421:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            // InternalMoniLog4DSL.g:5422:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2()); 
            }
            // InternalMoniLog4DSL.g:5423:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            // InternalMoniLog4DSL.g:5423:3: rule__Scope__LowerBoundAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__LowerBoundAssignment_4_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__2__Impl"


    // $ANTLR start "rule__Scope__Group_4__3"
    // InternalMoniLog4DSL.g:5431:1: rule__Scope__Group_4__3 : rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 ;
    public final void rule__Scope__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5435:1: ( rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 )
            // InternalMoniLog4DSL.g:5436:2: rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4
            {
            pushFollow(FOLLOW_27);
            rule__Scope__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__3"


    // $ANTLR start "rule__Scope__Group_4__3__Impl"
    // InternalMoniLog4DSL.g:5443:1: rule__Scope__Group_4__3__Impl : ( 'until' ) ;
    public final void rule__Scope__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5447:1: ( ( 'until' ) )
            // InternalMoniLog4DSL.g:5448:1: ( 'until' )
            {
            // InternalMoniLog4DSL.g:5448:1: ( 'until' )
            // InternalMoniLog4DSL.g:5449:2: 'until'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__3__Impl"


    // $ANTLR start "rule__Scope__Group_4__4"
    // InternalMoniLog4DSL.g:5458:1: rule__Scope__Group_4__4 : rule__Scope__Group_4__4__Impl ;
    public final void rule__Scope__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5462:1: ( rule__Scope__Group_4__4__Impl )
            // InternalMoniLog4DSL.g:5463:2: rule__Scope__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__4"


    // $ANTLR start "rule__Scope__Group_4__4__Impl"
    // InternalMoniLog4DSL.g:5469:1: rule__Scope__Group_4__4__Impl : ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) ;
    public final void rule__Scope__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5473:1: ( ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) )
            // InternalMoniLog4DSL.g:5474:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            {
            // InternalMoniLog4DSL.g:5474:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            // InternalMoniLog4DSL.g:5475:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4()); 
            }
            // InternalMoniLog4DSL.g:5476:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            // InternalMoniLog4DSL.g:5476:3: rule__Scope__UpperBoundAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Scope__UpperBoundAssignment_4_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__Group_4__4__Impl"


    // $ANTLR start "rule__AppenderCall__Group__0"
    // InternalMoniLog4DSL.g:5485:1: rule__AppenderCall__Group__0 : rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1 ;
    public final void rule__AppenderCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5489:1: ( rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1 )
            // InternalMoniLog4DSL.g:5490:2: rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__AppenderCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__0"


    // $ANTLR start "rule__AppenderCall__Group__0__Impl"
    // InternalMoniLog4DSL.g:5497:1: rule__AppenderCall__Group__0__Impl : ( ( rule__AppenderCall__AppenderAssignment_0 ) ) ;
    public final void rule__AppenderCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5501:1: ( ( ( rule__AppenderCall__AppenderAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:5502:1: ( ( rule__AppenderCall__AppenderAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:5502:1: ( ( rule__AppenderCall__AppenderAssignment_0 ) )
            // InternalMoniLog4DSL.g:5503:2: ( rule__AppenderCall__AppenderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:5504:2: ( rule__AppenderCall__AppenderAssignment_0 )
            // InternalMoniLog4DSL.g:5504:3: rule__AppenderCall__AppenderAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__AppenderAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getAppenderAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__0__Impl"


    // $ANTLR start "rule__AppenderCall__Group__1"
    // InternalMoniLog4DSL.g:5512:1: rule__AppenderCall__Group__1 : rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2 ;
    public final void rule__AppenderCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5516:1: ( rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2 )
            // InternalMoniLog4DSL.g:5517:2: rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__AppenderCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__1"


    // $ANTLR start "rule__AppenderCall__Group__1__Impl"
    // InternalMoniLog4DSL.g:5524:1: rule__AppenderCall__Group__1__Impl : ( '.' ) ;
    public final void rule__AppenderCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5528:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:5529:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:5529:1: ( '.' )
            // InternalMoniLog4DSL.g:5530:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getFullStopKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__1__Impl"


    // $ANTLR start "rule__AppenderCall__Group__2"
    // InternalMoniLog4DSL.g:5539:1: rule__AppenderCall__Group__2 : rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3 ;
    public final void rule__AppenderCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5543:1: ( rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3 )
            // InternalMoniLog4DSL.g:5544:2: rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__AppenderCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__2"


    // $ANTLR start "rule__AppenderCall__Group__2__Impl"
    // InternalMoniLog4DSL.g:5551:1: rule__AppenderCall__Group__2__Impl : ( 'call' ) ;
    public final void rule__AppenderCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5555:1: ( ( 'call' ) )
            // InternalMoniLog4DSL.g:5556:1: ( 'call' )
            {
            // InternalMoniLog4DSL.g:5556:1: ( 'call' )
            // InternalMoniLog4DSL.g:5557:2: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getCallKeyword_2()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getCallKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__2__Impl"


    // $ANTLR start "rule__AppenderCall__Group__3"
    // InternalMoniLog4DSL.g:5566:1: rule__AppenderCall__Group__3 : rule__AppenderCall__Group__3__Impl ;
    public final void rule__AppenderCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5570:1: ( rule__AppenderCall__Group__3__Impl )
            // InternalMoniLog4DSL.g:5571:2: rule__AppenderCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__3"


    // $ANTLR start "rule__AppenderCall__Group__3__Impl"
    // InternalMoniLog4DSL.g:5577:1: rule__AppenderCall__Group__3__Impl : ( ( rule__AppenderCall__Group_3__0 )? ) ;
    public final void rule__AppenderCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5581:1: ( ( ( rule__AppenderCall__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:5582:1: ( ( rule__AppenderCall__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:5582:1: ( ( rule__AppenderCall__Group_3__0 )? )
            // InternalMoniLog4DSL.g:5583:2: ( rule__AppenderCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:5584:2: ( rule__AppenderCall__Group_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==28) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoniLog4DSL.g:5584:3: rule__AppenderCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AppenderCall__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group__3__Impl"


    // $ANTLR start "rule__AppenderCall__Group_3__0"
    // InternalMoniLog4DSL.g:5593:1: rule__AppenderCall__Group_3__0 : rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1 ;
    public final void rule__AppenderCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5597:1: ( rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1 )
            // InternalMoniLog4DSL.g:5598:2: rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__AppenderCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__0"


    // $ANTLR start "rule__AppenderCall__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:5605:1: rule__AppenderCall__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AppenderCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5609:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:5610:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:5610:1: ( '(' )
            // InternalMoniLog4DSL.g:5611:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__0__Impl"


    // $ANTLR start "rule__AppenderCall__Group_3__1"
    // InternalMoniLog4DSL.g:5620:1: rule__AppenderCall__Group_3__1 : rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2 ;
    public final void rule__AppenderCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5624:1: ( rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2 )
            // InternalMoniLog4DSL.g:5625:2: rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__AppenderCall__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__1"


    // $ANTLR start "rule__AppenderCall__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:5632:1: rule__AppenderCall__Group_3__1__Impl : ( ( rule__AppenderCall__ArgsAssignment_3_1 ) ) ;
    public final void rule__AppenderCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5636:1: ( ( ( rule__AppenderCall__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:5637:1: ( ( rule__AppenderCall__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:5637:1: ( ( rule__AppenderCall__ArgsAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:5638:2: ( rule__AppenderCall__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:5639:2: ( rule__AppenderCall__ArgsAssignment_3_1 )
            // InternalMoniLog4DSL.g:5639:3: rule__AppenderCall__ArgsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__ArgsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__1__Impl"


    // $ANTLR start "rule__AppenderCall__Group_3__2"
    // InternalMoniLog4DSL.g:5647:1: rule__AppenderCall__Group_3__2 : rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3 ;
    public final void rule__AppenderCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5651:1: ( rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3 )
            // InternalMoniLog4DSL.g:5652:2: rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__AppenderCall__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__2"


    // $ANTLR start "rule__AppenderCall__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:5659:1: rule__AppenderCall__Group_3__2__Impl : ( ( rule__AppenderCall__Group_3_2__0 )* ) ;
    public final void rule__AppenderCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5663:1: ( ( ( rule__AppenderCall__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:5664:1: ( ( rule__AppenderCall__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:5664:1: ( ( rule__AppenderCall__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:5665:2: ( rule__AppenderCall__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:5666:2: ( rule__AppenderCall__Group_3_2__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==30) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:5666:3: rule__AppenderCall__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__AppenderCall__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__2__Impl"


    // $ANTLR start "rule__AppenderCall__Group_3__3"
    // InternalMoniLog4DSL.g:5674:1: rule__AppenderCall__Group_3__3 : rule__AppenderCall__Group_3__3__Impl ;
    public final void rule__AppenderCall__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5678:1: ( rule__AppenderCall__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:5679:2: rule__AppenderCall__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__3"


    // $ANTLR start "rule__AppenderCall__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:5685:1: rule__AppenderCall__Group_3__3__Impl : ( ')' ) ;
    public final void rule__AppenderCall__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5689:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:5690:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:5690:1: ( ')' )
            // InternalMoniLog4DSL.g:5691:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3__3__Impl"


    // $ANTLR start "rule__AppenderCall__Group_3_2__0"
    // InternalMoniLog4DSL.g:5701:1: rule__AppenderCall__Group_3_2__0 : rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1 ;
    public final void rule__AppenderCall__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5705:1: ( rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1 )
            // InternalMoniLog4DSL.g:5706:2: rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__AppenderCall__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3_2__0"


    // $ANTLR start "rule__AppenderCall__Group_3_2__0__Impl"
    // InternalMoniLog4DSL.g:5713:1: rule__AppenderCall__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AppenderCall__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5717:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:5718:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:5718:1: ( ',' )
            // InternalMoniLog4DSL.g:5719:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3_2__0__Impl"


    // $ANTLR start "rule__AppenderCall__Group_3_2__1"
    // InternalMoniLog4DSL.g:5728:1: rule__AppenderCall__Group_3_2__1 : rule__AppenderCall__Group_3_2__1__Impl ;
    public final void rule__AppenderCall__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5732:1: ( rule__AppenderCall__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:5733:2: rule__AppenderCall__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3_2__1"


    // $ANTLR start "rule__AppenderCall__Group_3_2__1__Impl"
    // InternalMoniLog4DSL.g:5739:1: rule__AppenderCall__Group_3_2__1__Impl : ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__AppenderCall__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5743:1: ( ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:5744:1: ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:5744:1: ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:5745:2: ( rule__AppenderCall__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:5746:2: ( rule__AppenderCall__ArgsAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:5746:3: rule__AppenderCall__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AppenderCall__ArgsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__Group_3_2__1__Impl"


    // $ANTLR start "rule__LayoutCall__Group__0"
    // InternalMoniLog4DSL.g:5755:1: rule__LayoutCall__Group__0 : rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1 ;
    public final void rule__LayoutCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5759:1: ( rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1 )
            // InternalMoniLog4DSL.g:5760:2: rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__LayoutCall__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__0"


    // $ANTLR start "rule__LayoutCall__Group__0__Impl"
    // InternalMoniLog4DSL.g:5767:1: rule__LayoutCall__Group__0__Impl : ( ( rule__LayoutCall__LayoutAssignment_0 ) ) ;
    public final void rule__LayoutCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5771:1: ( ( ( rule__LayoutCall__LayoutAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:5772:1: ( ( rule__LayoutCall__LayoutAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:5772:1: ( ( rule__LayoutCall__LayoutAssignment_0 ) )
            // InternalMoniLog4DSL.g:5773:2: ( rule__LayoutCall__LayoutAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:5774:2: ( rule__LayoutCall__LayoutAssignment_0 )
            // InternalMoniLog4DSL.g:5774:3: rule__LayoutCall__LayoutAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__LayoutAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getLayoutAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__0__Impl"


    // $ANTLR start "rule__LayoutCall__Group__1"
    // InternalMoniLog4DSL.g:5782:1: rule__LayoutCall__Group__1 : rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2 ;
    public final void rule__LayoutCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5786:1: ( rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2 )
            // InternalMoniLog4DSL.g:5787:2: rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2
            {
            pushFollow(FOLLOW_40);
            rule__LayoutCall__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__1"


    // $ANTLR start "rule__LayoutCall__Group__1__Impl"
    // InternalMoniLog4DSL.g:5794:1: rule__LayoutCall__Group__1__Impl : ( '.' ) ;
    public final void rule__LayoutCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5798:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:5799:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:5799:1: ( '.' )
            // InternalMoniLog4DSL.g:5800:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getFullStopKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__1__Impl"


    // $ANTLR start "rule__LayoutCall__Group__2"
    // InternalMoniLog4DSL.g:5809:1: rule__LayoutCall__Group__2 : rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3 ;
    public final void rule__LayoutCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5813:1: ( rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3 )
            // InternalMoniLog4DSL.g:5814:2: rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__LayoutCall__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__2"


    // $ANTLR start "rule__LayoutCall__Group__2__Impl"
    // InternalMoniLog4DSL.g:5821:1: rule__LayoutCall__Group__2__Impl : ( 'call' ) ;
    public final void rule__LayoutCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5825:1: ( ( 'call' ) )
            // InternalMoniLog4DSL.g:5826:1: ( 'call' )
            {
            // InternalMoniLog4DSL.g:5826:1: ( 'call' )
            // InternalMoniLog4DSL.g:5827:2: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getCallKeyword_2()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getCallKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__2__Impl"


    // $ANTLR start "rule__LayoutCall__Group__3"
    // InternalMoniLog4DSL.g:5836:1: rule__LayoutCall__Group__3 : rule__LayoutCall__Group__3__Impl ;
    public final void rule__LayoutCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5840:1: ( rule__LayoutCall__Group__3__Impl )
            // InternalMoniLog4DSL.g:5841:2: rule__LayoutCall__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__3"


    // $ANTLR start "rule__LayoutCall__Group__3__Impl"
    // InternalMoniLog4DSL.g:5847:1: rule__LayoutCall__Group__3__Impl : ( ( rule__LayoutCall__Group_3__0 )? ) ;
    public final void rule__LayoutCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5851:1: ( ( ( rule__LayoutCall__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:5852:1: ( ( rule__LayoutCall__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:5852:1: ( ( rule__LayoutCall__Group_3__0 )? )
            // InternalMoniLog4DSL.g:5853:2: ( rule__LayoutCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:5854:2: ( rule__LayoutCall__Group_3__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==28) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoniLog4DSL.g:5854:3: rule__LayoutCall__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LayoutCall__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group__3__Impl"


    // $ANTLR start "rule__LayoutCall__Group_3__0"
    // InternalMoniLog4DSL.g:5863:1: rule__LayoutCall__Group_3__0 : rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1 ;
    public final void rule__LayoutCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5867:1: ( rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1 )
            // InternalMoniLog4DSL.g:5868:2: rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__LayoutCall__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__0"


    // $ANTLR start "rule__LayoutCall__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:5875:1: rule__LayoutCall__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LayoutCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5879:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:5880:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:5880:1: ( '(' )
            // InternalMoniLog4DSL.g:5881:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__0__Impl"


    // $ANTLR start "rule__LayoutCall__Group_3__1"
    // InternalMoniLog4DSL.g:5890:1: rule__LayoutCall__Group_3__1 : rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2 ;
    public final void rule__LayoutCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5894:1: ( rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2 )
            // InternalMoniLog4DSL.g:5895:2: rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__LayoutCall__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__1"


    // $ANTLR start "rule__LayoutCall__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:5902:1: rule__LayoutCall__Group_3__1__Impl : ( ( rule__LayoutCall__ArgsAssignment_3_1 ) ) ;
    public final void rule__LayoutCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5906:1: ( ( ( rule__LayoutCall__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:5907:1: ( ( rule__LayoutCall__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:5907:1: ( ( rule__LayoutCall__ArgsAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:5908:2: ( rule__LayoutCall__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:5909:2: ( rule__LayoutCall__ArgsAssignment_3_1 )
            // InternalMoniLog4DSL.g:5909:3: rule__LayoutCall__ArgsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__ArgsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__1__Impl"


    // $ANTLR start "rule__LayoutCall__Group_3__2"
    // InternalMoniLog4DSL.g:5917:1: rule__LayoutCall__Group_3__2 : rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3 ;
    public final void rule__LayoutCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5921:1: ( rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3 )
            // InternalMoniLog4DSL.g:5922:2: rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__LayoutCall__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__2"


    // $ANTLR start "rule__LayoutCall__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:5929:1: rule__LayoutCall__Group_3__2__Impl : ( ( rule__LayoutCall__Group_3_2__0 )* ) ;
    public final void rule__LayoutCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5933:1: ( ( ( rule__LayoutCall__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:5934:1: ( ( rule__LayoutCall__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:5934:1: ( ( rule__LayoutCall__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:5935:2: ( rule__LayoutCall__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:5936:2: ( rule__LayoutCall__Group_3_2__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==30) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:5936:3: rule__LayoutCall__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__LayoutCall__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__2__Impl"


    // $ANTLR start "rule__LayoutCall__Group_3__3"
    // InternalMoniLog4DSL.g:5944:1: rule__LayoutCall__Group_3__3 : rule__LayoutCall__Group_3__3__Impl ;
    public final void rule__LayoutCall__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5948:1: ( rule__LayoutCall__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:5949:2: rule__LayoutCall__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__3"


    // $ANTLR start "rule__LayoutCall__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:5955:1: rule__LayoutCall__Group_3__3__Impl : ( ')' ) ;
    public final void rule__LayoutCall__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5959:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:5960:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:5960:1: ( ')' )
            // InternalMoniLog4DSL.g:5961:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3__3__Impl"


    // $ANTLR start "rule__LayoutCall__Group_3_2__0"
    // InternalMoniLog4DSL.g:5971:1: rule__LayoutCall__Group_3_2__0 : rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1 ;
    public final void rule__LayoutCall__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5975:1: ( rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1 )
            // InternalMoniLog4DSL.g:5976:2: rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__LayoutCall__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3_2__0"


    // $ANTLR start "rule__LayoutCall__Group_3_2__0__Impl"
    // InternalMoniLog4DSL.g:5983:1: rule__LayoutCall__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__LayoutCall__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5987:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:5988:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:5988:1: ( ',' )
            // InternalMoniLog4DSL.g:5989:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3_2__0__Impl"


    // $ANTLR start "rule__LayoutCall__Group_3_2__1"
    // InternalMoniLog4DSL.g:5998:1: rule__LayoutCall__Group_3_2__1 : rule__LayoutCall__Group_3_2__1__Impl ;
    public final void rule__LayoutCall__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6002:1: ( rule__LayoutCall__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:6003:2: rule__LayoutCall__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3_2__1"


    // $ANTLR start "rule__LayoutCall__Group_3_2__1__Impl"
    // InternalMoniLog4DSL.g:6009:1: rule__LayoutCall__Group_3_2__1__Impl : ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__LayoutCall__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6013:1: ( ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:6014:1: ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6014:1: ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:6015:2: ( rule__LayoutCall__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:6016:2: ( rule__LayoutCall__ArgsAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:6016:3: rule__LayoutCall__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LayoutCall__ArgsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__Group_3_2__1__Impl"


    // $ANTLR start "rule__EmitEvent__Group__0"
    // InternalMoniLog4DSL.g:6025:1: rule__EmitEvent__Group__0 : rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1 ;
    public final void rule__EmitEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6029:1: ( rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1 )
            // InternalMoniLog4DSL.g:6030:2: rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__EmitEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__0"


    // $ANTLR start "rule__EmitEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:6037:1: rule__EmitEvent__Group__0__Impl : ( ( rule__EmitEvent__EventAssignment_0 ) ) ;
    public final void rule__EmitEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6041:1: ( ( ( rule__EmitEvent__EventAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:6042:1: ( ( rule__EmitEvent__EventAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:6042:1: ( ( rule__EmitEvent__EventAssignment_0 ) )
            // InternalMoniLog4DSL.g:6043:2: ( rule__EmitEvent__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:6044:2: ( rule__EmitEvent__EventAssignment_0 )
            // InternalMoniLog4DSL.g:6044:3: rule__EmitEvent__EventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__EventAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getEventAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__0__Impl"


    // $ANTLR start "rule__EmitEvent__Group__1"
    // InternalMoniLog4DSL.g:6052:1: rule__EmitEvent__Group__1 : rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2 ;
    public final void rule__EmitEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6056:1: ( rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2 )
            // InternalMoniLog4DSL.g:6057:2: rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2
            {
            pushFollow(FOLLOW_41);
            rule__EmitEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__1"


    // $ANTLR start "rule__EmitEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:6064:1: rule__EmitEvent__Group__1__Impl : ( '.' ) ;
    public final void rule__EmitEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6068:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:6069:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:6069:1: ( '.' )
            // InternalMoniLog4DSL.g:6070:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getFullStopKeyword_1()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getFullStopKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__1__Impl"


    // $ANTLR start "rule__EmitEvent__Group__2"
    // InternalMoniLog4DSL.g:6079:1: rule__EmitEvent__Group__2 : rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3 ;
    public final void rule__EmitEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6083:1: ( rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3 )
            // InternalMoniLog4DSL.g:6084:2: rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__EmitEvent__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__2"


    // $ANTLR start "rule__EmitEvent__Group__2__Impl"
    // InternalMoniLog4DSL.g:6091:1: rule__EmitEvent__Group__2__Impl : ( 'emit' ) ;
    public final void rule__EmitEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6095:1: ( ( 'emit' ) )
            // InternalMoniLog4DSL.g:6096:1: ( 'emit' )
            {
            // InternalMoniLog4DSL.g:6096:1: ( 'emit' )
            // InternalMoniLog4DSL.g:6097:2: 'emit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEmitKeyword_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getEmitKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__2__Impl"


    // $ANTLR start "rule__EmitEvent__Group__3"
    // InternalMoniLog4DSL.g:6106:1: rule__EmitEvent__Group__3 : rule__EmitEvent__Group__3__Impl ;
    public final void rule__EmitEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6110:1: ( rule__EmitEvent__Group__3__Impl )
            // InternalMoniLog4DSL.g:6111:2: rule__EmitEvent__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__3"


    // $ANTLR start "rule__EmitEvent__Group__3__Impl"
    // InternalMoniLog4DSL.g:6117:1: rule__EmitEvent__Group__3__Impl : ( ( rule__EmitEvent__Group_3__0 )? ) ;
    public final void rule__EmitEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6121:1: ( ( ( rule__EmitEvent__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:6122:1: ( ( rule__EmitEvent__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:6122:1: ( ( rule__EmitEvent__Group_3__0 )? )
            // InternalMoniLog4DSL.g:6123:2: ( rule__EmitEvent__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:6124:2: ( rule__EmitEvent__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==28) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoniLog4DSL.g:6124:3: rule__EmitEvent__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmitEvent__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group__3__Impl"


    // $ANTLR start "rule__EmitEvent__Group_3__0"
    // InternalMoniLog4DSL.g:6133:1: rule__EmitEvent__Group_3__0 : rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1 ;
    public final void rule__EmitEvent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6137:1: ( rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1 )
            // InternalMoniLog4DSL.g:6138:2: rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1
            {
            pushFollow(FOLLOW_4);
            rule__EmitEvent__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__0"


    // $ANTLR start "rule__EmitEvent__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:6145:1: rule__EmitEvent__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EmitEvent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6149:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:6150:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:6150:1: ( '(' )
            // InternalMoniLog4DSL.g:6151:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__0__Impl"


    // $ANTLR start "rule__EmitEvent__Group_3__1"
    // InternalMoniLog4DSL.g:6160:1: rule__EmitEvent__Group_3__1 : rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2 ;
    public final void rule__EmitEvent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6164:1: ( rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2 )
            // InternalMoniLog4DSL.g:6165:2: rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2
            {
            pushFollow(FOLLOW_11);
            rule__EmitEvent__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__1"


    // $ANTLR start "rule__EmitEvent__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:6172:1: rule__EmitEvent__Group_3__1__Impl : ( ( rule__EmitEvent__ArgsAssignment_3_1 ) ) ;
    public final void rule__EmitEvent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6176:1: ( ( ( rule__EmitEvent__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:6177:1: ( ( rule__EmitEvent__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:6177:1: ( ( rule__EmitEvent__ArgsAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:6178:2: ( rule__EmitEvent__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:6179:2: ( rule__EmitEvent__ArgsAssignment_3_1 )
            // InternalMoniLog4DSL.g:6179:3: rule__EmitEvent__ArgsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__ArgsAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getArgsAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__1__Impl"


    // $ANTLR start "rule__EmitEvent__Group_3__2"
    // InternalMoniLog4DSL.g:6187:1: rule__EmitEvent__Group_3__2 : rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3 ;
    public final void rule__EmitEvent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6191:1: ( rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3 )
            // InternalMoniLog4DSL.g:6192:2: rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3
            {
            pushFollow(FOLLOW_11);
            rule__EmitEvent__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group_3__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__2"


    // $ANTLR start "rule__EmitEvent__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:6199:1: rule__EmitEvent__Group_3__2__Impl : ( ( rule__EmitEvent__Group_3_2__0 )* ) ;
    public final void rule__EmitEvent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6203:1: ( ( ( rule__EmitEvent__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:6204:1: ( ( rule__EmitEvent__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:6204:1: ( ( rule__EmitEvent__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:6205:2: ( rule__EmitEvent__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:6206:2: ( rule__EmitEvent__Group_3_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==30) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:6206:3: rule__EmitEvent__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__EmitEvent__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getGroup_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__2__Impl"


    // $ANTLR start "rule__EmitEvent__Group_3__3"
    // InternalMoniLog4DSL.g:6214:1: rule__EmitEvent__Group_3__3 : rule__EmitEvent__Group_3__3__Impl ;
    public final void rule__EmitEvent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6218:1: ( rule__EmitEvent__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:6219:2: rule__EmitEvent__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group_3__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__3"


    // $ANTLR start "rule__EmitEvent__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:6225:1: rule__EmitEvent__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EmitEvent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6229:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:6230:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:6230:1: ( ')' )
            // InternalMoniLog4DSL.g:6231:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getRightParenthesisKeyword_3_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3__3__Impl"


    // $ANTLR start "rule__EmitEvent__Group_3_2__0"
    // InternalMoniLog4DSL.g:6241:1: rule__EmitEvent__Group_3_2__0 : rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1 ;
    public final void rule__EmitEvent__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6245:1: ( rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1 )
            // InternalMoniLog4DSL.g:6246:2: rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EmitEvent__Group_3_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group_3_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3_2__0"


    // $ANTLR start "rule__EmitEvent__Group_3_2__0__Impl"
    // InternalMoniLog4DSL.g:6253:1: rule__EmitEvent__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EmitEvent__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6257:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6258:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6258:1: ( ',' )
            // InternalMoniLog4DSL.g:6259:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3_2__0__Impl"


    // $ANTLR start "rule__EmitEvent__Group_3_2__1"
    // InternalMoniLog4DSL.g:6268:1: rule__EmitEvent__Group_3_2__1 : rule__EmitEvent__Group_3_2__1__Impl ;
    public final void rule__EmitEvent__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6272:1: ( rule__EmitEvent__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:6273:2: rule__EmitEvent__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__Group_3_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3_2__1"


    // $ANTLR start "rule__EmitEvent__Group_3_2__1__Impl"
    // InternalMoniLog4DSL.g:6279:1: rule__EmitEvent__Group_3_2__1__Impl : ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__EmitEvent__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6283:1: ( ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:6284:1: ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6284:1: ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:6285:2: ( rule__EmitEvent__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:6286:2: ( rule__EmitEvent__ArgsAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:6286:3: rule__EmitEvent__ArgsAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EmitEvent__ArgsAssignment_3_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getArgsAssignment_3_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__Group_3_2__1__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__0"
    // InternalMoniLog4DSL.g:6295:1: rule__MoniLoggerCall__Group_0__0 : rule__MoniLoggerCall__Group_0__0__Impl rule__MoniLoggerCall__Group_0__1 ;
    public final void rule__MoniLoggerCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6299:1: ( rule__MoniLoggerCall__Group_0__0__Impl rule__MoniLoggerCall__Group_0__1 )
            // InternalMoniLog4DSL.g:6300:2: rule__MoniLoggerCall__Group_0__0__Impl rule__MoniLoggerCall__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__MoniLoggerCall__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__0"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:6307:1: rule__MoniLoggerCall__Group_0__0__Impl : ( () ) ;
    public final void rule__MoniLoggerCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6311:1: ( ( () ) )
            // InternalMoniLog4DSL.g:6312:1: ( () )
            {
            // InternalMoniLog4DSL.g:6312:1: ( () )
            // InternalMoniLog4DSL.g:6313:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getStartMoniLoggerAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:6314:2: ()
            // InternalMoniLog4DSL.g:6314:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getStartMoniLoggerAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__0__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__1"
    // InternalMoniLog4DSL.g:6322:1: rule__MoniLoggerCall__Group_0__1 : rule__MoniLoggerCall__Group_0__1__Impl rule__MoniLoggerCall__Group_0__2 ;
    public final void rule__MoniLoggerCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6326:1: ( rule__MoniLoggerCall__Group_0__1__Impl rule__MoniLoggerCall__Group_0__2 )
            // InternalMoniLog4DSL.g:6327:2: rule__MoniLoggerCall__Group_0__1__Impl rule__MoniLoggerCall__Group_0__2
            {
            pushFollow(FOLLOW_39);
            rule__MoniLoggerCall__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__1"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:6334:1: rule__MoniLoggerCall__Group_0__1__Impl : ( ( rule__MoniLoggerCall__MoniloggerAssignment_0_1 ) ) ;
    public final void rule__MoniLoggerCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6338:1: ( ( ( rule__MoniLoggerCall__MoniloggerAssignment_0_1 ) ) )
            // InternalMoniLog4DSL.g:6339:1: ( ( rule__MoniLoggerCall__MoniloggerAssignment_0_1 ) )
            {
            // InternalMoniLog4DSL.g:6339:1: ( ( rule__MoniLoggerCall__MoniloggerAssignment_0_1 ) )
            // InternalMoniLog4DSL.g:6340:2: ( rule__MoniLoggerCall__MoniloggerAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getMoniloggerAssignment_0_1()); 
            }
            // InternalMoniLog4DSL.g:6341:2: ( rule__MoniLoggerCall__MoniloggerAssignment_0_1 )
            // InternalMoniLog4DSL.g:6341:3: rule__MoniLoggerCall__MoniloggerAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__MoniloggerAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getMoniloggerAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__1__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__2"
    // InternalMoniLog4DSL.g:6349:1: rule__MoniLoggerCall__Group_0__2 : rule__MoniLoggerCall__Group_0__2__Impl rule__MoniLoggerCall__Group_0__3 ;
    public final void rule__MoniLoggerCall__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6353:1: ( rule__MoniLoggerCall__Group_0__2__Impl rule__MoniLoggerCall__Group_0__3 )
            // InternalMoniLog4DSL.g:6354:2: rule__MoniLoggerCall__Group_0__2__Impl rule__MoniLoggerCall__Group_0__3
            {
            pushFollow(FOLLOW_42);
            rule__MoniLoggerCall__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__2"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__2__Impl"
    // InternalMoniLog4DSL.g:6361:1: rule__MoniLoggerCall__Group_0__2__Impl : ( '.' ) ;
    public final void rule__MoniLoggerCall__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6365:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:6366:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:6366:1: ( '.' )
            // InternalMoniLog4DSL.g:6367:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getFullStopKeyword_0_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getFullStopKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__2__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__3"
    // InternalMoniLog4DSL.g:6376:1: rule__MoniLoggerCall__Group_0__3 : rule__MoniLoggerCall__Group_0__3__Impl rule__MoniLoggerCall__Group_0__4 ;
    public final void rule__MoniLoggerCall__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6380:1: ( rule__MoniLoggerCall__Group_0__3__Impl rule__MoniLoggerCall__Group_0__4 )
            // InternalMoniLog4DSL.g:6381:2: rule__MoniLoggerCall__Group_0__3__Impl rule__MoniLoggerCall__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__MoniLoggerCall__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__3"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__3__Impl"
    // InternalMoniLog4DSL.g:6388:1: rule__MoniLoggerCall__Group_0__3__Impl : ( 'start' ) ;
    public final void rule__MoniLoggerCall__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6392:1: ( ( 'start' ) )
            // InternalMoniLog4DSL.g:6393:1: ( 'start' )
            {
            // InternalMoniLog4DSL.g:6393:1: ( 'start' )
            // InternalMoniLog4DSL.g:6394:2: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getStartKeyword_0_3()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getStartKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__3__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__4"
    // InternalMoniLog4DSL.g:6403:1: rule__MoniLoggerCall__Group_0__4 : rule__MoniLoggerCall__Group_0__4__Impl ;
    public final void rule__MoniLoggerCall__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6407:1: ( rule__MoniLoggerCall__Group_0__4__Impl )
            // InternalMoniLog4DSL.g:6408:2: rule__MoniLoggerCall__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__4"


    // $ANTLR start "rule__MoniLoggerCall__Group_0__4__Impl"
    // InternalMoniLog4DSL.g:6414:1: rule__MoniLoggerCall__Group_0__4__Impl : ( ( rule__MoniLoggerCall__Group_0_4__0 )? ) ;
    public final void rule__MoniLoggerCall__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6418:1: ( ( ( rule__MoniLoggerCall__Group_0_4__0 )? ) )
            // InternalMoniLog4DSL.g:6419:1: ( ( rule__MoniLoggerCall__Group_0_4__0 )? )
            {
            // InternalMoniLog4DSL.g:6419:1: ( ( rule__MoniLoggerCall__Group_0_4__0 )? )
            // InternalMoniLog4DSL.g:6420:2: ( rule__MoniLoggerCall__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getGroup_0_4()); 
            }
            // InternalMoniLog4DSL.g:6421:2: ( rule__MoniLoggerCall__Group_0_4__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==28) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoniLog4DSL.g:6421:3: rule__MoniLoggerCall__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLoggerCall__Group_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getGroup_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0__4__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__0"
    // InternalMoniLog4DSL.g:6430:1: rule__MoniLoggerCall__Group_0_4__0 : rule__MoniLoggerCall__Group_0_4__0__Impl rule__MoniLoggerCall__Group_0_4__1 ;
    public final void rule__MoniLoggerCall__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6434:1: ( rule__MoniLoggerCall__Group_0_4__0__Impl rule__MoniLoggerCall__Group_0_4__1 )
            // InternalMoniLog4DSL.g:6435:2: rule__MoniLoggerCall__Group_0_4__0__Impl rule__MoniLoggerCall__Group_0_4__1
            {
            pushFollow(FOLLOW_4);
            rule__MoniLoggerCall__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__0"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__0__Impl"
    // InternalMoniLog4DSL.g:6442:1: rule__MoniLoggerCall__Group_0_4__0__Impl : ( '(' ) ;
    public final void rule__MoniLoggerCall__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6446:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:6447:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:6447:1: ( '(' )
            // InternalMoniLog4DSL.g:6448:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getLeftParenthesisKeyword_0_4_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getLeftParenthesisKeyword_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__0__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__1"
    // InternalMoniLog4DSL.g:6457:1: rule__MoniLoggerCall__Group_0_4__1 : rule__MoniLoggerCall__Group_0_4__1__Impl rule__MoniLoggerCall__Group_0_4__2 ;
    public final void rule__MoniLoggerCall__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6461:1: ( rule__MoniLoggerCall__Group_0_4__1__Impl rule__MoniLoggerCall__Group_0_4__2 )
            // InternalMoniLog4DSL.g:6462:2: rule__MoniLoggerCall__Group_0_4__1__Impl rule__MoniLoggerCall__Group_0_4__2
            {
            pushFollow(FOLLOW_11);
            rule__MoniLoggerCall__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__1"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__1__Impl"
    // InternalMoniLog4DSL.g:6469:1: rule__MoniLoggerCall__Group_0_4__1__Impl : ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_1 ) ) ;
    public final void rule__MoniLoggerCall__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6473:1: ( ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_1 ) ) )
            // InternalMoniLog4DSL.g:6474:1: ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_1 ) )
            {
            // InternalMoniLog4DSL.g:6474:1: ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_1 ) )
            // InternalMoniLog4DSL.g:6475:2: ( rule__MoniLoggerCall__ArgsAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getArgsAssignment_0_4_1()); 
            }
            // InternalMoniLog4DSL.g:6476:2: ( rule__MoniLoggerCall__ArgsAssignment_0_4_1 )
            // InternalMoniLog4DSL.g:6476:3: rule__MoniLoggerCall__ArgsAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__ArgsAssignment_0_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getArgsAssignment_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__1__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__2"
    // InternalMoniLog4DSL.g:6484:1: rule__MoniLoggerCall__Group_0_4__2 : rule__MoniLoggerCall__Group_0_4__2__Impl rule__MoniLoggerCall__Group_0_4__3 ;
    public final void rule__MoniLoggerCall__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6488:1: ( rule__MoniLoggerCall__Group_0_4__2__Impl rule__MoniLoggerCall__Group_0_4__3 )
            // InternalMoniLog4DSL.g:6489:2: rule__MoniLoggerCall__Group_0_4__2__Impl rule__MoniLoggerCall__Group_0_4__3
            {
            pushFollow(FOLLOW_11);
            rule__MoniLoggerCall__Group_0_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__2"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__2__Impl"
    // InternalMoniLog4DSL.g:6496:1: rule__MoniLoggerCall__Group_0_4__2__Impl : ( ( rule__MoniLoggerCall__Group_0_4_2__0 )* ) ;
    public final void rule__MoniLoggerCall__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6500:1: ( ( ( rule__MoniLoggerCall__Group_0_4_2__0 )* ) )
            // InternalMoniLog4DSL.g:6501:1: ( ( rule__MoniLoggerCall__Group_0_4_2__0 )* )
            {
            // InternalMoniLog4DSL.g:6501:1: ( ( rule__MoniLoggerCall__Group_0_4_2__0 )* )
            // InternalMoniLog4DSL.g:6502:2: ( rule__MoniLoggerCall__Group_0_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getGroup_0_4_2()); 
            }
            // InternalMoniLog4DSL.g:6503:2: ( rule__MoniLoggerCall__Group_0_4_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==30) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:6503:3: rule__MoniLoggerCall__Group_0_4_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__MoniLoggerCall__Group_0_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getGroup_0_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__2__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__3"
    // InternalMoniLog4DSL.g:6511:1: rule__MoniLoggerCall__Group_0_4__3 : rule__MoniLoggerCall__Group_0_4__3__Impl ;
    public final void rule__MoniLoggerCall__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6515:1: ( rule__MoniLoggerCall__Group_0_4__3__Impl )
            // InternalMoniLog4DSL.g:6516:2: rule__MoniLoggerCall__Group_0_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__3"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4__3__Impl"
    // InternalMoniLog4DSL.g:6522:1: rule__MoniLoggerCall__Group_0_4__3__Impl : ( ')' ) ;
    public final void rule__MoniLoggerCall__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6526:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:6527:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:6527:1: ( ')' )
            // InternalMoniLog4DSL.g:6528:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getRightParenthesisKeyword_0_4_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getRightParenthesisKeyword_0_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4__3__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4_2__0"
    // InternalMoniLog4DSL.g:6538:1: rule__MoniLoggerCall__Group_0_4_2__0 : rule__MoniLoggerCall__Group_0_4_2__0__Impl rule__MoniLoggerCall__Group_0_4_2__1 ;
    public final void rule__MoniLoggerCall__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6542:1: ( rule__MoniLoggerCall__Group_0_4_2__0__Impl rule__MoniLoggerCall__Group_0_4_2__1 )
            // InternalMoniLog4DSL.g:6543:2: rule__MoniLoggerCall__Group_0_4_2__0__Impl rule__MoniLoggerCall__Group_0_4_2__1
            {
            pushFollow(FOLLOW_4);
            rule__MoniLoggerCall__Group_0_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4_2__0"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4_2__0__Impl"
    // InternalMoniLog4DSL.g:6550:1: rule__MoniLoggerCall__Group_0_4_2__0__Impl : ( ',' ) ;
    public final void rule__MoniLoggerCall__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6554:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6555:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6555:1: ( ',' )
            // InternalMoniLog4DSL.g:6556:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getCommaKeyword_0_4_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getCommaKeyword_0_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4_2__0__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4_2__1"
    // InternalMoniLog4DSL.g:6565:1: rule__MoniLoggerCall__Group_0_4_2__1 : rule__MoniLoggerCall__Group_0_4_2__1__Impl ;
    public final void rule__MoniLoggerCall__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6569:1: ( rule__MoniLoggerCall__Group_0_4_2__1__Impl )
            // InternalMoniLog4DSL.g:6570:2: rule__MoniLoggerCall__Group_0_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_0_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4_2__1"


    // $ANTLR start "rule__MoniLoggerCall__Group_0_4_2__1__Impl"
    // InternalMoniLog4DSL.g:6576:1: rule__MoniLoggerCall__Group_0_4_2__1__Impl : ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 ) ) ;
    public final void rule__MoniLoggerCall__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6580:1: ( ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 ) ) )
            // InternalMoniLog4DSL.g:6581:1: ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6581:1: ( ( rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 ) )
            // InternalMoniLog4DSL.g:6582:2: ( rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getArgsAssignment_0_4_2_1()); 
            }
            // InternalMoniLog4DSL.g:6583:2: ( rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 )
            // InternalMoniLog4DSL.g:6583:3: rule__MoniLoggerCall__ArgsAssignment_0_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__ArgsAssignment_0_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getArgsAssignment_0_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_0_4_2__1__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__0"
    // InternalMoniLog4DSL.g:6592:1: rule__MoniLoggerCall__Group_1__0 : rule__MoniLoggerCall__Group_1__0__Impl rule__MoniLoggerCall__Group_1__1 ;
    public final void rule__MoniLoggerCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6596:1: ( rule__MoniLoggerCall__Group_1__0__Impl rule__MoniLoggerCall__Group_1__1 )
            // InternalMoniLog4DSL.g:6597:2: rule__MoniLoggerCall__Group_1__0__Impl rule__MoniLoggerCall__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__MoniLoggerCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__0"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:6604:1: rule__MoniLoggerCall__Group_1__0__Impl : ( () ) ;
    public final void rule__MoniLoggerCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6608:1: ( ( () ) )
            // InternalMoniLog4DSL.g:6609:1: ( () )
            {
            // InternalMoniLog4DSL.g:6609:1: ( () )
            // InternalMoniLog4DSL.g:6610:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getStopMoniLoggerAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:6611:2: ()
            // InternalMoniLog4DSL.g:6611:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getStopMoniLoggerAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__0__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__1"
    // InternalMoniLog4DSL.g:6619:1: rule__MoniLoggerCall__Group_1__1 : rule__MoniLoggerCall__Group_1__1__Impl rule__MoniLoggerCall__Group_1__2 ;
    public final void rule__MoniLoggerCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6623:1: ( rule__MoniLoggerCall__Group_1__1__Impl rule__MoniLoggerCall__Group_1__2 )
            // InternalMoniLog4DSL.g:6624:2: rule__MoniLoggerCall__Group_1__1__Impl rule__MoniLoggerCall__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__MoniLoggerCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__1"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:6631:1: rule__MoniLoggerCall__Group_1__1__Impl : ( ( rule__MoniLoggerCall__MoniloggerAssignment_1_1 ) ) ;
    public final void rule__MoniLoggerCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6635:1: ( ( ( rule__MoniLoggerCall__MoniloggerAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:6636:1: ( ( rule__MoniLoggerCall__MoniloggerAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:6636:1: ( ( rule__MoniLoggerCall__MoniloggerAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:6637:2: ( rule__MoniLoggerCall__MoniloggerAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getMoniloggerAssignment_1_1()); 
            }
            // InternalMoniLog4DSL.g:6638:2: ( rule__MoniLoggerCall__MoniloggerAssignment_1_1 )
            // InternalMoniLog4DSL.g:6638:3: rule__MoniLoggerCall__MoniloggerAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__MoniloggerAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getMoniloggerAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__1__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__2"
    // InternalMoniLog4DSL.g:6646:1: rule__MoniLoggerCall__Group_1__2 : rule__MoniLoggerCall__Group_1__2__Impl rule__MoniLoggerCall__Group_1__3 ;
    public final void rule__MoniLoggerCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6650:1: ( rule__MoniLoggerCall__Group_1__2__Impl rule__MoniLoggerCall__Group_1__3 )
            // InternalMoniLog4DSL.g:6651:2: rule__MoniLoggerCall__Group_1__2__Impl rule__MoniLoggerCall__Group_1__3
            {
            pushFollow(FOLLOW_43);
            rule__MoniLoggerCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__2"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:6658:1: rule__MoniLoggerCall__Group_1__2__Impl : ( '.' ) ;
    public final void rule__MoniLoggerCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6662:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:6663:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:6663:1: ( '.' )
            // InternalMoniLog4DSL.g:6664:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getFullStopKeyword_1_2()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getFullStopKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__2__Impl"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__3"
    // InternalMoniLog4DSL.g:6673:1: rule__MoniLoggerCall__Group_1__3 : rule__MoniLoggerCall__Group_1__3__Impl ;
    public final void rule__MoniLoggerCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6677:1: ( rule__MoniLoggerCall__Group_1__3__Impl )
            // InternalMoniLog4DSL.g:6678:2: rule__MoniLoggerCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLoggerCall__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__3"


    // $ANTLR start "rule__MoniLoggerCall__Group_1__3__Impl"
    // InternalMoniLog4DSL.g:6684:1: rule__MoniLoggerCall__Group_1__3__Impl : ( 'stop' ) ;
    public final void rule__MoniLoggerCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6688:1: ( ( 'stop' ) )
            // InternalMoniLog4DSL.g:6689:1: ( 'stop' )
            {
            // InternalMoniLog4DSL.g:6689:1: ( 'stop' )
            // InternalMoniLog4DSL.g:6690:2: 'stop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getStopKeyword_1_3()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getStopKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__Group_1__3__Impl"


    // $ANTLR start "rule__StreamEvent__Group__0"
    // InternalMoniLog4DSL.g:6700:1: rule__StreamEvent__Group__0 : rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 ;
    public final void rule__StreamEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6704:1: ( rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 )
            // InternalMoniLog4DSL.g:6705:2: rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__StreamEvent__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group__0"


    // $ANTLR start "rule__StreamEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:6712:1: rule__StreamEvent__Group__0__Impl : ( ( rule__StreamEvent__EventAssignment_0 ) ) ;
    public final void rule__StreamEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6716:1: ( ( ( rule__StreamEvent__EventAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:6717:1: ( ( rule__StreamEvent__EventAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:6717:1: ( ( rule__StreamEvent__EventAssignment_0 ) )
            // InternalMoniLog4DSL.g:6718:2: ( rule__StreamEvent__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:6719:2: ( rule__StreamEvent__EventAssignment_0 )
            // InternalMoniLog4DSL.g:6719:3: rule__StreamEvent__EventAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__EventAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getEventAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group__0__Impl"


    // $ANTLR start "rule__StreamEvent__Group__1"
    // InternalMoniLog4DSL.g:6727:1: rule__StreamEvent__Group__1 : rule__StreamEvent__Group__1__Impl ;
    public final void rule__StreamEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6731:1: ( rule__StreamEvent__Group__1__Impl )
            // InternalMoniLog4DSL.g:6732:2: rule__StreamEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group__1"


    // $ANTLR start "rule__StreamEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:6738:1: rule__StreamEvent__Group__1__Impl : ( ( rule__StreamEvent__Group_1__0 )? ) ;
    public final void rule__StreamEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6742:1: ( ( ( rule__StreamEvent__Group_1__0 )? ) )
            // InternalMoniLog4DSL.g:6743:1: ( ( rule__StreamEvent__Group_1__0 )? )
            {
            // InternalMoniLog4DSL.g:6743:1: ( ( rule__StreamEvent__Group_1__0 )? )
            // InternalMoniLog4DSL.g:6744:2: ( rule__StreamEvent__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup_1()); 
            }
            // InternalMoniLog4DSL.g:6745:2: ( rule__StreamEvent__Group_1__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==36) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoniLog4DSL.g:6745:3: rule__StreamEvent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StreamEvent__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group__1__Impl"


    // $ANTLR start "rule__StreamEvent__Group_1__0"
    // InternalMoniLog4DSL.g:6754:1: rule__StreamEvent__Group_1__0 : rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 ;
    public final void rule__StreamEvent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6758:1: ( rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 )
            // InternalMoniLog4DSL.g:6759:2: rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__StreamEvent__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__0"


    // $ANTLR start "rule__StreamEvent__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:6766:1: rule__StreamEvent__Group_1__0__Impl : ( '[' ) ;
    public final void rule__StreamEvent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6770:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:6771:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:6771:1: ( '[' )
            // InternalMoniLog4DSL.g:6772:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getLeftSquareBracketKeyword_1_0()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getLeftSquareBracketKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__0__Impl"


    // $ANTLR start "rule__StreamEvent__Group_1__1"
    // InternalMoniLog4DSL.g:6781:1: rule__StreamEvent__Group_1__1 : rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 ;
    public final void rule__StreamEvent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6785:1: ( rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 )
            // InternalMoniLog4DSL.g:6786:2: rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2
            {
            pushFollow(FOLLOW_45);
            rule__StreamEvent__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__1"


    // $ANTLR start "rule__StreamEvent__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:6793:1: rule__StreamEvent__Group_1__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) ;
    public final void rule__StreamEvent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6797:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:6798:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:6798:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:6799:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1()); 
            }
            // InternalMoniLog4DSL.g:6800:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            // InternalMoniLog4DSL.g:6800:3: rule__StreamEvent__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__ValuesAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__1__Impl"


    // $ANTLR start "rule__StreamEvent__Group_1__2"
    // InternalMoniLog4DSL.g:6808:1: rule__StreamEvent__Group_1__2 : rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 ;
    public final void rule__StreamEvent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6812:1: ( rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 )
            // InternalMoniLog4DSL.g:6813:2: rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3
            {
            pushFollow(FOLLOW_45);
            rule__StreamEvent__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__2"


    // $ANTLR start "rule__StreamEvent__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:6820:1: rule__StreamEvent__Group_1__2__Impl : ( ( rule__StreamEvent__Group_1_2__0 )* ) ;
    public final void rule__StreamEvent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6824:1: ( ( ( rule__StreamEvent__Group_1_2__0 )* ) )
            // InternalMoniLog4DSL.g:6825:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            {
            // InternalMoniLog4DSL.g:6825:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            // InternalMoniLog4DSL.g:6826:2: ( rule__StreamEvent__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup_1_2()); 
            }
            // InternalMoniLog4DSL.g:6827:2: ( rule__StreamEvent__Group_1_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==30) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:6827:3: rule__StreamEvent__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__StreamEvent__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__2__Impl"


    // $ANTLR start "rule__StreamEvent__Group_1__3"
    // InternalMoniLog4DSL.g:6835:1: rule__StreamEvent__Group_1__3 : rule__StreamEvent__Group_1__3__Impl ;
    public final void rule__StreamEvent__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6839:1: ( rule__StreamEvent__Group_1__3__Impl )
            // InternalMoniLog4DSL.g:6840:2: rule__StreamEvent__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__3"


    // $ANTLR start "rule__StreamEvent__Group_1__3__Impl"
    // InternalMoniLog4DSL.g:6846:1: rule__StreamEvent__Group_1__3__Impl : ( ']' ) ;
    public final void rule__StreamEvent__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6850:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:6851:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:6851:1: ( ']' )
            // InternalMoniLog4DSL.g:6852:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getRightSquareBracketKeyword_1_3()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getRightSquareBracketKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1__3__Impl"


    // $ANTLR start "rule__StreamEvent__Group_1_2__0"
    // InternalMoniLog4DSL.g:6862:1: rule__StreamEvent__Group_1_2__0 : rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 ;
    public final void rule__StreamEvent__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6866:1: ( rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 )
            // InternalMoniLog4DSL.g:6867:2: rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1
            {
            pushFollow(FOLLOW_7);
            rule__StreamEvent__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1_2__0"


    // $ANTLR start "rule__StreamEvent__Group_1_2__0__Impl"
    // InternalMoniLog4DSL.g:6874:1: rule__StreamEvent__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StreamEvent__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6878:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6879:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6879:1: ( ',' )
            // InternalMoniLog4DSL.g:6880:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1_2__0__Impl"


    // $ANTLR start "rule__StreamEvent__Group_1_2__1"
    // InternalMoniLog4DSL.g:6889:1: rule__StreamEvent__Group_1_2__1 : rule__StreamEvent__Group_1_2__1__Impl ;
    public final void rule__StreamEvent__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6893:1: ( rule__StreamEvent__Group_1_2__1__Impl )
            // InternalMoniLog4DSL.g:6894:2: rule__StreamEvent__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1_2__1"


    // $ANTLR start "rule__StreamEvent__Group_1_2__1__Impl"
    // InternalMoniLog4DSL.g:6900:1: rule__StreamEvent__Group_1_2__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) ;
    public final void rule__StreamEvent__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6904:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) )
            // InternalMoniLog4DSL.g:6905:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6905:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            // InternalMoniLog4DSL.g:6906:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1()); 
            }
            // InternalMoniLog4DSL.g:6907:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            // InternalMoniLog4DSL.g:6907:3: rule__StreamEvent__ValuesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__ValuesAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__Group_1_2__1__Impl"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1__0"
    // InternalMoniLog4DSL.g:6916:1: rule__EmptyOrPropertyValue__Group_1__0 : rule__EmptyOrPropertyValue__Group_1__0__Impl rule__EmptyOrPropertyValue__Group_1__1 ;
    public final void rule__EmptyOrPropertyValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6920:1: ( rule__EmptyOrPropertyValue__Group_1__0__Impl rule__EmptyOrPropertyValue__Group_1__1 )
            // InternalMoniLog4DSL.g:6921:2: rule__EmptyOrPropertyValue__Group_1__0__Impl rule__EmptyOrPropertyValue__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__EmptyOrPropertyValue__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1__0"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:6928:1: rule__EmptyOrPropertyValue__Group_1__0__Impl : ( () ) ;
    public final void rule__EmptyOrPropertyValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6932:1: ( ( () ) )
            // InternalMoniLog4DSL.g:6933:1: ( () )
            {
            // InternalMoniLog4DSL.g:6933:1: ( () )
            // InternalMoniLog4DSL.g:6934:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:6935:2: ()
            // InternalMoniLog4DSL.g:6935:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1__0__Impl"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1__1"
    // InternalMoniLog4DSL.g:6943:1: rule__EmptyOrPropertyValue__Group_1__1 : rule__EmptyOrPropertyValue__Group_1__1__Impl rule__EmptyOrPropertyValue__Group_1__2 ;
    public final void rule__EmptyOrPropertyValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6947:1: ( rule__EmptyOrPropertyValue__Group_1__1__Impl rule__EmptyOrPropertyValue__Group_1__2 )
            // InternalMoniLog4DSL.g:6948:2: rule__EmptyOrPropertyValue__Group_1__1__Impl rule__EmptyOrPropertyValue__Group_1__2
            {
            pushFollow(FOLLOW_46);
            rule__EmptyOrPropertyValue__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1__1"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:6955:1: rule__EmptyOrPropertyValue__Group_1__1__Impl : ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) ) ;
    public final void rule__EmptyOrPropertyValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6959:1: ( ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:6960:1: ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:6960:1: ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:6961:2: ( rule__EmptyOrPropertyValue__IdAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getIdAssignment_1_1()); 
            }
            // InternalMoniLog4DSL.g:6962:2: ( rule__EmptyOrPropertyValue__IdAssignment_1_1 )
            // InternalMoniLog4DSL.g:6962:3: rule__EmptyOrPropertyValue__IdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__IdAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getIdAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1__1__Impl"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1__2"
    // InternalMoniLog4DSL.g:6970:1: rule__EmptyOrPropertyValue__Group_1__2 : rule__EmptyOrPropertyValue__Group_1__2__Impl ;
    public final void rule__EmptyOrPropertyValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6974:1: ( rule__EmptyOrPropertyValue__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:6975:2: rule__EmptyOrPropertyValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1__2"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:6981:1: rule__EmptyOrPropertyValue__Group_1__2__Impl : ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? ) ;
    public final void rule__EmptyOrPropertyValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6985:1: ( ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? ) )
            // InternalMoniLog4DSL.g:6986:1: ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? )
            {
            // InternalMoniLog4DSL.g:6986:1: ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? )
            // InternalMoniLog4DSL.g:6987:2: ( rule__EmptyOrPropertyValue__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1_2()); 
            }
            // InternalMoniLog4DSL.g:6988:2: ( rule__EmptyOrPropertyValue__Group_1_2__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==60) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoniLog4DSL.g:6988:3: rule__EmptyOrPropertyValue__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmptyOrPropertyValue__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1__2__Impl"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1_2__0"
    // InternalMoniLog4DSL.g:6997:1: rule__EmptyOrPropertyValue__Group_1_2__0 : rule__EmptyOrPropertyValue__Group_1_2__0__Impl rule__EmptyOrPropertyValue__Group_1_2__1 ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7001:1: ( rule__EmptyOrPropertyValue__Group_1_2__0__Impl rule__EmptyOrPropertyValue__Group_1_2__1 )
            // InternalMoniLog4DSL.g:7002:2: rule__EmptyOrPropertyValue__Group_1_2__0__Impl rule__EmptyOrPropertyValue__Group_1_2__1
            {
            pushFollow(FOLLOW_4);
            rule__EmptyOrPropertyValue__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1_2__0"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1_2__0__Impl"
    // InternalMoniLog4DSL.g:7009:1: rule__EmptyOrPropertyValue__Group_1_2__0__Impl : ( '=' ) ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7013:1: ( ( '=' ) )
            // InternalMoniLog4DSL.g:7014:1: ( '=' )
            {
            // InternalMoniLog4DSL.g:7014:1: ( '=' )
            // InternalMoniLog4DSL.g:7015:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getEqualsSignKeyword_1_2_0()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getEqualsSignKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1_2__0__Impl"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1_2__1"
    // InternalMoniLog4DSL.g:7024:1: rule__EmptyOrPropertyValue__Group_1_2__1 : rule__EmptyOrPropertyValue__Group_1_2__1__Impl ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7028:1: ( rule__EmptyOrPropertyValue__Group_1_2__1__Impl )
            // InternalMoniLog4DSL.g:7029:2: rule__EmptyOrPropertyValue__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1_2__1"


    // $ANTLR start "rule__EmptyOrPropertyValue__Group_1_2__1__Impl"
    // InternalMoniLog4DSL.g:7035:1: rule__EmptyOrPropertyValue__Group_1_2__1__Impl : ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) ) ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7039:1: ( ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) ) )
            // InternalMoniLog4DSL.g:7040:1: ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) )
            {
            // InternalMoniLog4DSL.g:7040:1: ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) )
            // InternalMoniLog4DSL.g:7041:2: ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getValueAssignment_1_2_1()); 
            }
            // InternalMoniLog4DSL.g:7042:2: ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 )
            // InternalMoniLog4DSL.g:7042:3: rule__EmptyOrPropertyValue__ValueAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__ValueAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getValueAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__Group_1_2__1__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_0__0"
    // InternalMoniLog4DSL.g:7051:1: rule__LanguageExpression__Group_0__0 : rule__LanguageExpression__Group_0__0__Impl rule__LanguageExpression__Group_0__1 ;
    public final void rule__LanguageExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7055:1: ( rule__LanguageExpression__Group_0__0__Impl rule__LanguageExpression__Group_0__1 )
            // InternalMoniLog4DSL.g:7056:2: rule__LanguageExpression__Group_0__0__Impl rule__LanguageExpression__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__LanguageExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__0"


    // $ANTLR start "rule__LanguageExpression__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:7063:1: rule__LanguageExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LanguageExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7067:1: ( ( () ) )
            // InternalMoniLog4DSL.g:7068:1: ( () )
            {
            // InternalMoniLog4DSL.g:7068:1: ( () )
            // InternalMoniLog4DSL.g:7069:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExplicitLanguageExpressionAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:7070:2: ()
            // InternalMoniLog4DSL.g:7070:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExplicitLanguageExpressionAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__0__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_0__1"
    // InternalMoniLog4DSL.g:7078:1: rule__LanguageExpression__Group_0__1 : rule__LanguageExpression__Group_0__1__Impl rule__LanguageExpression__Group_0__2 ;
    public final void rule__LanguageExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7082:1: ( rule__LanguageExpression__Group_0__1__Impl rule__LanguageExpression__Group_0__2 )
            // InternalMoniLog4DSL.g:7083:2: rule__LanguageExpression__Group_0__1__Impl rule__LanguageExpression__Group_0__2
            {
            pushFollow(FOLLOW_13);
            rule__LanguageExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__1"


    // $ANTLR start "rule__LanguageExpression__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:7090:1: rule__LanguageExpression__Group_0__1__Impl : ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) ) ;
    public final void rule__LanguageExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7094:1: ( ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) ) )
            // InternalMoniLog4DSL.g:7095:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) )
            {
            // InternalMoniLog4DSL.g:7095:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) )
            // InternalMoniLog4DSL.g:7096:2: ( rule__LanguageExpression__LanguageIdAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0_1()); 
            }
            // InternalMoniLog4DSL.g:7097:2: ( rule__LanguageExpression__LanguageIdAssignment_0_1 )
            // InternalMoniLog4DSL.g:7097:3: rule__LanguageExpression__LanguageIdAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__LanguageIdAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__1__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_0__2"
    // InternalMoniLog4DSL.g:7105:1: rule__LanguageExpression__Group_0__2 : rule__LanguageExpression__Group_0__2__Impl rule__LanguageExpression__Group_0__3 ;
    public final void rule__LanguageExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7109:1: ( rule__LanguageExpression__Group_0__2__Impl rule__LanguageExpression__Group_0__3 )
            // InternalMoniLog4DSL.g:7110:2: rule__LanguageExpression__Group_0__2__Impl rule__LanguageExpression__Group_0__3
            {
            pushFollow(FOLLOW_47);
            rule__LanguageExpression__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__2"


    // $ANTLR start "rule__LanguageExpression__Group_0__2__Impl"
    // InternalMoniLog4DSL.g:7117:1: rule__LanguageExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__LanguageExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7121:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:7122:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:7122:1: ( '(' )
            // InternalMoniLog4DSL.g:7123:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__2__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_0__3"
    // InternalMoniLog4DSL.g:7132:1: rule__LanguageExpression__Group_0__3 : rule__LanguageExpression__Group_0__3__Impl rule__LanguageExpression__Group_0__4 ;
    public final void rule__LanguageExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7136:1: ( rule__LanguageExpression__Group_0__3__Impl rule__LanguageExpression__Group_0__4 )
            // InternalMoniLog4DSL.g:7137:2: rule__LanguageExpression__Group_0__3__Impl rule__LanguageExpression__Group_0__4
            {
            pushFollow(FOLLOW_48);
            rule__LanguageExpression__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__3"


    // $ANTLR start "rule__LanguageExpression__Group_0__3__Impl"
    // InternalMoniLog4DSL.g:7144:1: rule__LanguageExpression__Group_0__3__Impl : ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) ) ;
    public final void rule__LanguageExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7148:1: ( ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) ) )
            // InternalMoniLog4DSL.g:7149:1: ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) )
            {
            // InternalMoniLog4DSL.g:7149:1: ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) )
            // InternalMoniLog4DSL.g:7150:2: ( rule__LanguageExpression__ExpressionAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_0_3()); 
            }
            // InternalMoniLog4DSL.g:7151:2: ( rule__LanguageExpression__ExpressionAssignment_0_3 )
            // InternalMoniLog4DSL.g:7151:3: rule__LanguageExpression__ExpressionAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__ExpressionAssignment_0_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__3__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_0__4"
    // InternalMoniLog4DSL.g:7159:1: rule__LanguageExpression__Group_0__4 : rule__LanguageExpression__Group_0__4__Impl ;
    public final void rule__LanguageExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7163:1: ( rule__LanguageExpression__Group_0__4__Impl )
            // InternalMoniLog4DSL.g:7164:2: rule__LanguageExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__4"


    // $ANTLR start "rule__LanguageExpression__Group_0__4__Impl"
    // InternalMoniLog4DSL.g:7170:1: rule__LanguageExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__LanguageExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7174:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:7175:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:7175:1: ( ')' )
            // InternalMoniLog4DSL.g:7176:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_0__4__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_1__0"
    // InternalMoniLog4DSL.g:7186:1: rule__LanguageExpression__Group_1__0 : rule__LanguageExpression__Group_1__0__Impl rule__LanguageExpression__Group_1__1 ;
    public final void rule__LanguageExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7190:1: ( rule__LanguageExpression__Group_1__0__Impl rule__LanguageExpression__Group_1__1 )
            // InternalMoniLog4DSL.g:7191:2: rule__LanguageExpression__Group_1__0__Impl rule__LanguageExpression__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__LanguageExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_1__0"


    // $ANTLR start "rule__LanguageExpression__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:7198:1: rule__LanguageExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LanguageExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7202:1: ( ( () ) )
            // InternalMoniLog4DSL.g:7203:1: ( () )
            {
            // InternalMoniLog4DSL.g:7203:1: ( () )
            // InternalMoniLog4DSL.g:7204:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getDefaultLanguageExpressionAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:7205:2: ()
            // InternalMoniLog4DSL.g:7205:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getDefaultLanguageExpressionAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_1__0__Impl"


    // $ANTLR start "rule__LanguageExpression__Group_1__1"
    // InternalMoniLog4DSL.g:7213:1: rule__LanguageExpression__Group_1__1 : rule__LanguageExpression__Group_1__1__Impl ;
    public final void rule__LanguageExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7217:1: ( rule__LanguageExpression__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:7218:2: rule__LanguageExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_1__1"


    // $ANTLR start "rule__LanguageExpression__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:7224:1: rule__LanguageExpression__Group_1__1__Impl : ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__LanguageExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7228:1: ( ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:7229:1: ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:7229:1: ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:7230:2: ( rule__LanguageExpression__ExpressionAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_1_1()); 
            }
            // InternalMoniLog4DSL.g:7231:2: ( rule__LanguageExpression__ExpressionAssignment_1_1 )
            // InternalMoniLog4DSL.g:7231:3: rule__LanguageExpression__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__ExpressionAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group_1__1__Impl"


    // $ANTLR start "rule__FQN__Group__0"
    // InternalMoniLog4DSL.g:7240:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7244:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMoniLog4DSL.g:7245:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__FQN__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0"


    // $ANTLR start "rule__FQN__Group__0__Impl"
    // InternalMoniLog4DSL.g:7252:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7256:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7257:1: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7257:1: ( RULE_ID )
            // InternalMoniLog4DSL.g:7258:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__0__Impl"


    // $ANTLR start "rule__FQN__Group__1"
    // InternalMoniLog4DSL.g:7267:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7271:1: ( rule__FQN__Group__1__Impl )
            // InternalMoniLog4DSL.g:7272:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1"


    // $ANTLR start "rule__FQN__Group__1__Impl"
    // InternalMoniLog4DSL.g:7278:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7282:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMoniLog4DSL.g:7283:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMoniLog4DSL.g:7283:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMoniLog4DSL.g:7284:2: ( rule__FQN__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getGroup_1()); 
            }
            // InternalMoniLog4DSL.g:7285:2: ( rule__FQN__Group_1__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==55) ) {
                    int LA51_2 = input.LA(2);

                    if ( (LA51_2==RULE_ID) ) {
                        alt51=1;
                    }


                }


                switch (alt51) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:7285:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group__1__Impl"


    // $ANTLR start "rule__FQN__Group_1__0"
    // InternalMoniLog4DSL.g:7294:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7298:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMoniLog4DSL.g:7299:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_7);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0"


    // $ANTLR start "rule__FQN__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:7306:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7310:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:7311:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:7311:1: ( '.' )
            // InternalMoniLog4DSL.g:7312:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__0__Impl"


    // $ANTLR start "rule__FQN__Group_1__1"
    // InternalMoniLog4DSL.g:7321:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7325:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:7326:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1"


    // $ANTLR start "rule__FQN__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:7332:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7336:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7337:1: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7337:1: ( RULE_ID )
            // InternalMoniLog4DSL.g:7338:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FQN__Group_1__1__Impl"


    // $ANTLR start "rule__Document__UnorderedGroup_1"
    // InternalMoniLog4DSL.g:7348:1: rule__Document__UnorderedGroup_1 : ( rule__Document__UnorderedGroup_1__0 )? ;
    public final void rule__Document__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoniLog4DSL.g:7353:1: ( ( rule__Document__UnorderedGroup_1__0 )? )
            // InternalMoniLog4DSL.g:7354:2: ( rule__Document__UnorderedGroup_1__0 )?
            {
            // InternalMoniLog4DSL.g:7354:2: ( rule__Document__UnorderedGroup_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 >= 39 && LA52_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                alt52=1;
            }
            else if ( ( LA52_0 == 12 || LA52_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                alt52=1;
            }
            else if ( ( LA52_0 == 11 || LA52_0 == 33 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoniLog4DSL.g:7354:2: rule__Document__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_1"


    // $ANTLR start "rule__Document__UnorderedGroup_1__Impl"
    // InternalMoniLog4DSL.g:7362:1: rule__Document__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) ) ) ) ;
    public final void rule__Document__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog4DSL.g:7367:1: ( ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) ) ) ) )
            // InternalMoniLog4DSL.g:7368:3: ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) ) ) )
            {
            // InternalMoniLog4DSL.g:7368:3: ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) ) ) )
            int alt57=4;
            int LA57_0 = input.LA(1);

            if ( LA57_0 >= 39 && LA57_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                alt57=1;
            }
            else if ( ( LA57_0 == 12 || LA57_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                alt57=2;
            }
            else if ( LA57_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                alt57=3;
            }
            else if ( ( LA57_0 == 11 || LA57_0 == 33 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                alt57=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoniLog4DSL.g:7369:3: ({...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7369:3: ({...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7370:4: {...}? => ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoniLog4DSL.g:7370:104: ( ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) ) )
                    // InternalMoniLog4DSL.g:7371:5: ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0);
                    selected = true;
                    // InternalMoniLog4DSL.g:7377:5: ( ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* ) )
                    // InternalMoniLog4DSL.g:7378:6: ( ( rule__Document__EventsAssignment_1_0 ) ) ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* )
                    {
                    // InternalMoniLog4DSL.g:7378:6: ( ( rule__Document__EventsAssignment_1_0 ) )
                    // InternalMoniLog4DSL.g:7379:7: ( rule__Document__EventsAssignment_1_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEventsAssignment_1_0()); 
                    }
                    // InternalMoniLog4DSL.g:7380:7: ( rule__Document__EventsAssignment_1_0 )
                    // InternalMoniLog4DSL.g:7380:8: rule__Document__EventsAssignment_1_0
                    {
                    pushFollow(FOLLOW_50);
                    rule__Document__EventsAssignment_1_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getEventsAssignment_1_0()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7383:6: ( ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )* )
                    // InternalMoniLog4DSL.g:7384:7: ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEventsAssignment_1_0()); 
                    }
                    // InternalMoniLog4DSL.g:7385:7: ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )*
                    loop53:
                    do {
                        int alt53=2;
                        alt53 = dfa53.predict(input);
                        switch (alt53) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7385:8: ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0
                    	    {
                    	    pushFollow(FOLLOW_50);
                    	    rule__Document__EventsAssignment_1_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop53;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getEventsAssignment_1_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:7391:3: ({...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7391:3: ({...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7392:4: {...}? => ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoniLog4DSL.g:7392:104: ( ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) ) )
                    // InternalMoniLog4DSL.g:7393:5: ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1);
                    selected = true;
                    // InternalMoniLog4DSL.g:7399:5: ( ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* ) )
                    // InternalMoniLog4DSL.g:7400:6: ( ( rule__Document__AppendersAssignment_1_1 ) ) ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* )
                    {
                    // InternalMoniLog4DSL.g:7400:6: ( ( rule__Document__AppendersAssignment_1_1 ) )
                    // InternalMoniLog4DSL.g:7401:7: ( rule__Document__AppendersAssignment_1_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getAppendersAssignment_1_1()); 
                    }
                    // InternalMoniLog4DSL.g:7402:7: ( rule__Document__AppendersAssignment_1_1 )
                    // InternalMoniLog4DSL.g:7402:8: rule__Document__AppendersAssignment_1_1
                    {
                    pushFollow(FOLLOW_51);
                    rule__Document__AppendersAssignment_1_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getAppendersAssignment_1_1()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7405:6: ( ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )* )
                    // InternalMoniLog4DSL.g:7406:7: ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getAppendersAssignment_1_1()); 
                    }
                    // InternalMoniLog4DSL.g:7407:7: ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )*
                    loop54:
                    do {
                        int alt54=2;
                        alt54 = dfa54.predict(input);
                        switch (alt54) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7407:8: ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1
                    	    {
                    	    pushFollow(FOLLOW_51);
                    	    rule__Document__AppendersAssignment_1_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop54;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getAppendersAssignment_1_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:7413:3: ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7413:3: ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7414:4: {...}? => ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMoniLog4DSL.g:7414:104: ( ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) ) )
                    // InternalMoniLog4DSL.g:7415:5: ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2);
                    selected = true;
                    // InternalMoniLog4DSL.g:7421:5: ( ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* ) )
                    // InternalMoniLog4DSL.g:7422:6: ( ( rule__Document__LayoutsAssignment_1_2 ) ) ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* )
                    {
                    // InternalMoniLog4DSL.g:7422:6: ( ( rule__Document__LayoutsAssignment_1_2 ) )
                    // InternalMoniLog4DSL.g:7423:7: ( rule__Document__LayoutsAssignment_1_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getLayoutsAssignment_1_2()); 
                    }
                    // InternalMoniLog4DSL.g:7424:7: ( rule__Document__LayoutsAssignment_1_2 )
                    // InternalMoniLog4DSL.g:7424:8: rule__Document__LayoutsAssignment_1_2
                    {
                    pushFollow(FOLLOW_52);
                    rule__Document__LayoutsAssignment_1_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getLayoutsAssignment_1_2()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7427:6: ( ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )* )
                    // InternalMoniLog4DSL.g:7428:7: ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getLayoutsAssignment_1_2()); 
                    }
                    // InternalMoniLog4DSL.g:7429:7: ( ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2 )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==32) ) {
                            int LA55_2 = input.LA(2);

                            if ( (LA55_2==RULE_ID) ) {
                                int LA55_3 = input.LA(3);

                                if ( (synpred3_InternalMoniLog4DSL()) ) {
                                    alt55=1;
                                }


                            }


                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7429:8: ( rule__Document__LayoutsAssignment_1_2 )=> rule__Document__LayoutsAssignment_1_2
                    	    {
                    	    pushFollow(FOLLOW_52);
                    	    rule__Document__LayoutsAssignment_1_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getLayoutsAssignment_1_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:7435:3: ({...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7435:3: ({...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7436:4: {...}? => ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalMoniLog4DSL.g:7436:104: ( ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) ) )
                    // InternalMoniLog4DSL.g:7437:5: ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3);
                    selected = true;
                    // InternalMoniLog4DSL.g:7443:5: ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* ) )
                    // InternalMoniLog4DSL.g:7444:6: ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) ) ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* )
                    {
                    // InternalMoniLog4DSL.g:7444:6: ( ( rule__Document__MoniLogSpecsAssignment_1_3 ) )
                    // InternalMoniLog4DSL.g:7445:7: ( rule__Document__MoniLogSpecsAssignment_1_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getMoniLogSpecsAssignment_1_3()); 
                    }
                    // InternalMoniLog4DSL.g:7446:7: ( rule__Document__MoniLogSpecsAssignment_1_3 )
                    // InternalMoniLog4DSL.g:7446:8: rule__Document__MoniLogSpecsAssignment_1_3
                    {
                    pushFollow(FOLLOW_53);
                    rule__Document__MoniLogSpecsAssignment_1_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getMoniLogSpecsAssignment_1_3()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7449:6: ( ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )* )
                    // InternalMoniLog4DSL.g:7450:7: ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getMoniLogSpecsAssignment_1_3()); 
                    }
                    // InternalMoniLog4DSL.g:7451:7: ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )*
                    loop56:
                    do {
                        int alt56=2;
                        alt56 = dfa56.predict(input);
                        switch (alt56) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7451:8: ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3
                    	    {
                    	    pushFollow(FOLLOW_53);
                    	    rule__Document__MoniLogSpecsAssignment_1_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getMoniLogSpecsAssignment_1_3()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__Document__UnorderedGroup_1__0"
    // InternalMoniLog4DSL.g:7465:1: rule__Document__UnorderedGroup_1__0 : rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__1 )? ;
    public final void rule__Document__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7469:1: ( rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__1 )? )
            // InternalMoniLog4DSL.g:7470:2: rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_53);
            rule__Document__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:7471:2: ( rule__Document__UnorderedGroup_1__1 )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( LA58_0 >= 39 && LA58_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                alt58=1;
            }
            else if ( ( LA58_0 == 12 || LA58_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                alt58=1;
            }
            else if ( LA58_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                alt58=1;
            }
            else if ( ( LA58_0 == 11 || LA58_0 == 33 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoniLog4DSL.g:7471:2: rule__Document__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_1__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_1__0"


    // $ANTLR start "rule__Document__UnorderedGroup_1__1"
    // InternalMoniLog4DSL.g:7477:1: rule__Document__UnorderedGroup_1__1 : rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__2 )? ;
    public final void rule__Document__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7481:1: ( rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__2 )? )
            // InternalMoniLog4DSL.g:7482:2: rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_53);
            rule__Document__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:7483:2: ( rule__Document__UnorderedGroup_1__2 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 >= 39 && LA59_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                alt59=1;
            }
            else if ( ( LA59_0 == 12 || LA59_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                alt59=1;
            }
            else if ( LA59_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                alt59=1;
            }
            else if ( ( LA59_0 == 11 || LA59_0 == 33 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoniLog4DSL.g:7483:2: rule__Document__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_1__2();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_1__1"


    // $ANTLR start "rule__Document__UnorderedGroup_1__2"
    // InternalMoniLog4DSL.g:7489:1: rule__Document__UnorderedGroup_1__2 : rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__3 )? ;
    public final void rule__Document__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7493:1: ( rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__3 )? )
            // InternalMoniLog4DSL.g:7494:2: rule__Document__UnorderedGroup_1__Impl ( rule__Document__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_53);
            rule__Document__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:7495:2: ( rule__Document__UnorderedGroup_1__3 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 >= 39 && LA60_0 <= 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 0) ) {
                alt60=1;
            }
            else if ( ( LA60_0 == 12 || LA60_0 == 25 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 1) ) {
                alt60=1;
            }
            else if ( LA60_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 2) ) {
                alt60=1;
            }
            else if ( ( LA60_0 == 11 || LA60_0 == 33 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_1(), 3) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoniLog4DSL.g:7495:2: rule__Document__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_1__3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_1__2"


    // $ANTLR start "rule__Document__UnorderedGroup_1__3"
    // InternalMoniLog4DSL.g:7501:1: rule__Document__UnorderedGroup_1__3 : rule__Document__UnorderedGroup_1__Impl ;
    public final void rule__Document__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7505:1: ( rule__Document__UnorderedGroup_1__Impl )
            // InternalMoniLog4DSL.g:7506:2: rule__Document__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__UnorderedGroup_1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_1__3"


    // $ANTLR start "rule__ASTEvent__UnorderedGroup_3"
    // InternalMoniLog4DSL.g:7513:1: rule__ASTEvent__UnorderedGroup_3 : ( rule__ASTEvent__UnorderedGroup_3__0 )? ;
    public final void rule__ASTEvent__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
        	
        try {
            // InternalMoniLog4DSL.g:7518:1: ( ( rule__ASTEvent__UnorderedGroup_3__0 )? )
            // InternalMoniLog4DSL.g:7519:2: ( rule__ASTEvent__UnorderedGroup_3__0 )?
            {
            // InternalMoniLog4DSL.g:7519:2: ( rule__ASTEvent__UnorderedGroup_3__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( LA61_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoniLog4DSL.g:7519:2: rule__ASTEvent__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ASTEvent__UnorderedGroup_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__UnorderedGroup_3"


    // $ANTLR start "rule__ASTEvent__UnorderedGroup_3__Impl"
    // InternalMoniLog4DSL.g:7527:1: rule__ASTEvent__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) ) ) ) ;
    public final void rule__ASTEvent__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog4DSL.g:7532:1: ( ( ({...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) ) ) ) )
            // InternalMoniLog4DSL.g:7533:3: ( ({...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) ) ) )
            {
            // InternalMoniLog4DSL.g:7533:3: ( ({...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) ) ) | ({...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( LA62_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoniLog4DSL.g:7534:3: ({...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7534:3: ({...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) ) )
                    // InternalMoniLog4DSL.g:7535:4: {...}? => ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ASTEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalMoniLog4DSL.g:7535:104: ( ( ( rule__ASTEvent__BeforeAssignment_3_0 ) ) )
                    // InternalMoniLog4DSL.g:7536:5: ( ( rule__ASTEvent__BeforeAssignment_3_0 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalMoniLog4DSL.g:7542:5: ( ( rule__ASTEvent__BeforeAssignment_3_0 ) )
                    // InternalMoniLog4DSL.g:7543:6: ( rule__ASTEvent__BeforeAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASTEventAccess().getBeforeAssignment_3_0()); 
                    }
                    // InternalMoniLog4DSL.g:7544:6: ( rule__ASTEvent__BeforeAssignment_3_0 )
                    // InternalMoniLog4DSL.g:7544:7: rule__ASTEvent__BeforeAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ASTEvent__BeforeAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getASTEventAccess().getBeforeAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:7549:3: ({...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7549:3: ({...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) ) )
                    // InternalMoniLog4DSL.g:7550:4: {...}? => ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__ASTEvent__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalMoniLog4DSL.g:7550:104: ( ( ( rule__ASTEvent__AfterAssignment_3_1 ) ) )
                    // InternalMoniLog4DSL.g:7551:5: ( ( rule__ASTEvent__AfterAssignment_3_1 ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalMoniLog4DSL.g:7557:5: ( ( rule__ASTEvent__AfterAssignment_3_1 ) )
                    // InternalMoniLog4DSL.g:7558:6: ( rule__ASTEvent__AfterAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASTEventAccess().getAfterAssignment_3_1()); 
                    }
                    // InternalMoniLog4DSL.g:7559:6: ( rule__ASTEvent__AfterAssignment_3_1 )
                    // InternalMoniLog4DSL.g:7559:7: rule__ASTEvent__AfterAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ASTEvent__AfterAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getASTEventAccess().getAfterAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getASTEventAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__ASTEvent__UnorderedGroup_3__0"
    // InternalMoniLog4DSL.g:7572:1: rule__ASTEvent__UnorderedGroup_3__0 : rule__ASTEvent__UnorderedGroup_3__Impl ( rule__ASTEvent__UnorderedGroup_3__1 )? ;
    public final void rule__ASTEvent__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7576:1: ( rule__ASTEvent__UnorderedGroup_3__Impl ( rule__ASTEvent__UnorderedGroup_3__1 )? )
            // InternalMoniLog4DSL.g:7577:2: rule__ASTEvent__UnorderedGroup_3__Impl ( rule__ASTEvent__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_54);
            rule__ASTEvent__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:7578:2: ( rule__ASTEvent__UnorderedGroup_3__1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( LA63_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getASTEventAccess().getUnorderedGroup_3(), 1) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMoniLog4DSL.g:7578:2: rule__ASTEvent__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ASTEvent__UnorderedGroup_3__1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__UnorderedGroup_3__0"


    // $ANTLR start "rule__ASTEvent__UnorderedGroup_3__1"
    // InternalMoniLog4DSL.g:7584:1: rule__ASTEvent__UnorderedGroup_3__1 : rule__ASTEvent__UnorderedGroup_3__Impl ;
    public final void rule__ASTEvent__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7588:1: ( rule__ASTEvent__UnorderedGroup_3__Impl )
            // InternalMoniLog4DSL.g:7589:2: rule__ASTEvent__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ASTEvent__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__UnorderedGroup_3__1"


    // $ANTLR start "rule__Document__DefaultLanguageIDAssignment_0_1"
    // InternalMoniLog4DSL.g:7596:1: rule__Document__DefaultLanguageIDAssignment_0_1 : ( ( rule__Document__DefaultLanguageIDAlternatives_0_1_0 ) ) ;
    public final void rule__Document__DefaultLanguageIDAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7600:1: ( ( ( rule__Document__DefaultLanguageIDAlternatives_0_1_0 ) ) )
            // InternalMoniLog4DSL.g:7601:2: ( ( rule__Document__DefaultLanguageIDAlternatives_0_1_0 ) )
            {
            // InternalMoniLog4DSL.g:7601:2: ( ( rule__Document__DefaultLanguageIDAlternatives_0_1_0 ) )
            // InternalMoniLog4DSL.g:7602:3: ( rule__Document__DefaultLanguageIDAlternatives_0_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getDefaultLanguageIDAlternatives_0_1_0()); 
            }
            // InternalMoniLog4DSL.g:7603:3: ( rule__Document__DefaultLanguageIDAlternatives_0_1_0 )
            // InternalMoniLog4DSL.g:7603:4: rule__Document__DefaultLanguageIDAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Document__DefaultLanguageIDAlternatives_0_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getDefaultLanguageIDAlternatives_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__DefaultLanguageIDAssignment_0_1"


    // $ANTLR start "rule__Document__EventsAssignment_1_0"
    // InternalMoniLog4DSL.g:7611:1: rule__Document__EventsAssignment_1_0 : ( ruleEvent ) ;
    public final void rule__Document__EventsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7615:1: ( ( ruleEvent ) )
            // InternalMoniLog4DSL.g:7616:2: ( ruleEvent )
            {
            // InternalMoniLog4DSL.g:7616:2: ( ruleEvent )
            // InternalMoniLog4DSL.g:7617:3: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__EventsAssignment_1_0"


    // $ANTLR start "rule__Document__AppendersAssignment_1_1"
    // InternalMoniLog4DSL.g:7626:1: rule__Document__AppendersAssignment_1_1 : ( ruleAppender ) ;
    public final void rule__Document__AppendersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7630:1: ( ( ruleAppender ) )
            // InternalMoniLog4DSL.g:7631:2: ( ruleAppender )
            {
            // InternalMoniLog4DSL.g:7631:2: ( ruleAppender )
            // InternalMoniLog4DSL.g:7632:3: ruleAppender
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppender();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__AppendersAssignment_1_1"


    // $ANTLR start "rule__Document__LayoutsAssignment_1_2"
    // InternalMoniLog4DSL.g:7641:1: rule__Document__LayoutsAssignment_1_2 : ( ruleLayout ) ;
    public final void rule__Document__LayoutsAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7645:1: ( ( ruleLayout ) )
            // InternalMoniLog4DSL.g:7646:2: ( ruleLayout )
            {
            // InternalMoniLog4DSL.g:7646:2: ( ruleLayout )
            // InternalMoniLog4DSL.g:7647:3: ruleLayout
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__LayoutsAssignment_1_2"


    // $ANTLR start "rule__Document__MoniLogSpecsAssignment_1_3"
    // InternalMoniLog4DSL.g:7656:1: rule__Document__MoniLogSpecsAssignment_1_3 : ( ruleMoniLogger ) ;
    public final void rule__Document__MoniLogSpecsAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7660:1: ( ( ruleMoniLogger ) )
            // InternalMoniLog4DSL.g:7661:2: ( ruleMoniLogger )
            {
            // InternalMoniLog4DSL.g:7661:2: ( ruleMoniLogger )
            // InternalMoniLog4DSL.g:7662:3: ruleMoniLogger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getMoniLogSpecsMoniLoggerParserRuleCall_1_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMoniLogger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getMoniLogSpecsMoniLoggerParserRuleCall_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__MoniLogSpecsAssignment_1_3"


    // $ANTLR start "rule__LocalAppender__AnnotationsAssignment_0"
    // InternalMoniLog4DSL.g:7671:1: rule__LocalAppender__AnnotationsAssignment_0 : ( ruleAppenderAnnotation ) ;
    public final void rule__LocalAppender__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7675:1: ( ( ruleAppenderAnnotation ) )
            // InternalMoniLog4DSL.g:7676:2: ( ruleAppenderAnnotation )
            {
            // InternalMoniLog4DSL.g:7676:2: ( ruleAppenderAnnotation )
            // InternalMoniLog4DSL.g:7677:3: ruleAppenderAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getAnnotationsAppenderAnnotationEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppenderAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getAnnotationsAppenderAnnotationEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__AnnotationsAssignment_0"


    // $ANTLR start "rule__LocalAppender__NameAssignment_2"
    // InternalMoniLog4DSL.g:7686:1: rule__LocalAppender__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalAppender__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7690:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7691:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7691:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:7692:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__NameAssignment_2"


    // $ANTLR start "rule__LocalAppender__ParametersAssignment_3_1"
    // InternalMoniLog4DSL.g:7701:1: rule__LocalAppender__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__LocalAppender__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7705:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7706:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7706:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7707:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParametersParameterParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getParametersParameterParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__ParametersAssignment_3_1"


    // $ANTLR start "rule__LocalAppender__ParametersAssignment_3_2_1"
    // InternalMoniLog4DSL.g:7716:1: rule__LocalAppender__ParametersAssignment_3_2_1 : ( ruleParameter ) ;
    public final void rule__LocalAppender__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7720:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7721:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7721:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7722:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__LocalAppender__CallsAssignment_5"
    // InternalMoniLog4DSL.g:7731:1: rule__LocalAppender__CallsAssignment_5 : ( ruleAppenderCall ) ;
    public final void rule__LocalAppender__CallsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7735:1: ( ( ruleAppenderCall ) )
            // InternalMoniLog4DSL.g:7736:2: ( ruleAppenderCall )
            {
            // InternalMoniLog4DSL.g:7736:2: ( ruleAppenderCall )
            // InternalMoniLog4DSL.g:7737:3: ruleAppenderCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppenderCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__CallsAssignment_5"


    // $ANTLR start "rule__LocalAppender__CallsAssignment_6_1"
    // InternalMoniLog4DSL.g:7746:1: rule__LocalAppender__CallsAssignment_6_1 : ( ruleAppenderCall ) ;
    public final void rule__LocalAppender__CallsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7750:1: ( ( ruleAppenderCall ) )
            // InternalMoniLog4DSL.g:7751:2: ( ruleAppenderCall )
            {
            // InternalMoniLog4DSL.g:7751:2: ( ruleAppenderCall )
            // InternalMoniLog4DSL.g:7752:3: ruleAppenderCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_6_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppenderCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getCallsAppenderCallParserRuleCall_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__CallsAssignment_6_1"


    // $ANTLR start "rule__ExternalAppender__NameAssignment_1"
    // InternalMoniLog4DSL.g:7761:1: rule__ExternalAppender__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__ExternalAppender__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7765:1: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:7766:2: ( ruleFQN )
            {
            // InternalMoniLog4DSL.g:7766:2: ( ruleFQN )
            // InternalMoniLog4DSL.g:7767:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getNameFQNParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getNameFQNParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__NameAssignment_1"


    // $ANTLR start "rule__ExternalAppender__ParametersAssignment_2_1"
    // InternalMoniLog4DSL.g:7776:1: rule__ExternalAppender__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__ExternalAppender__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7780:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7781:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7781:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7782:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__ParametersAssignment_2_1"


    // $ANTLR start "rule__ExternalAppender__ParametersAssignment_2_2_1"
    // InternalMoniLog4DSL.g:7791:1: rule__ExternalAppender__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__ExternalAppender__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7795:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7796:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7796:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7797:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__LocalLayout__NameAssignment_1"
    // InternalMoniLog4DSL.g:7806:1: rule__LocalLayout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalLayout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7810:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7811:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7811:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:7812:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__NameAssignment_1"


    // $ANTLR start "rule__LocalLayout__ParametersAssignment_2_1"
    // InternalMoniLog4DSL.g:7821:1: rule__LocalLayout__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__LocalLayout__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7825:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7826:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7826:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7827:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__ParametersAssignment_2_1"


    // $ANTLR start "rule__LocalLayout__ParametersAssignment_2_2_1"
    // InternalMoniLog4DSL.g:7836:1: rule__LocalLayout__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__LocalLayout__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7840:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7841:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7841:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7842:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__LocalLayout__CallAssignment_4"
    // InternalMoniLog4DSL.g:7851:1: rule__LocalLayout__CallAssignment_4 : ( ruleLayoutCall ) ;
    public final void rule__LocalLayout__CallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7855:1: ( ( ruleLayoutCall ) )
            // InternalMoniLog4DSL.g:7856:2: ( ruleLayoutCall )
            {
            // InternalMoniLog4DSL.g:7856:2: ( ruleLayoutCall )
            // InternalMoniLog4DSL.g:7857:3: ruleLayoutCall
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getCallLayoutCallParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLayoutCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getCallLayoutCallParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__CallAssignment_4"


    // $ANTLR start "rule__ExternalLayout__NameAssignment_1"
    // InternalMoniLog4DSL.g:7866:1: rule__ExternalLayout__NameAssignment_1 : ( ruleFQN ) ;
    public final void rule__ExternalLayout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7870:1: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:7871:2: ( ruleFQN )
            {
            // InternalMoniLog4DSL.g:7871:2: ( ruleFQN )
            // InternalMoniLog4DSL.g:7872:3: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getNameFQNParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getNameFQNParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__NameAssignment_1"


    // $ANTLR start "rule__ExternalLayout__ParametersAssignment_2_1"
    // InternalMoniLog4DSL.g:7881:1: rule__ExternalLayout__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__ExternalLayout__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7885:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7886:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7886:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7887:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__ParametersAssignment_2_1"


    // $ANTLR start "rule__ExternalLayout__ParametersAssignment_2_2_1"
    // InternalMoniLog4DSL.g:7896:1: rule__ExternalLayout__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__ExternalLayout__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7900:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7901:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7901:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7902:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__MoniLogger__AnnotationsAssignment_0"
    // InternalMoniLog4DSL.g:7911:1: rule__MoniLogger__AnnotationsAssignment_0 : ( ruleMoniLoggerAnnotation ) ;
    public final void rule__MoniLogger__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7915:1: ( ( ruleMoniLoggerAnnotation ) )
            // InternalMoniLog4DSL.g:7916:2: ( ruleMoniLoggerAnnotation )
            {
            // InternalMoniLog4DSL.g:7916:2: ( ruleMoniLoggerAnnotation )
            // InternalMoniLog4DSL.g:7917:3: ruleMoniLoggerAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getAnnotationsMoniLoggerAnnotationEnumRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMoniLoggerAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getAnnotationsMoniLoggerAnnotationEnumRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__AnnotationsAssignment_0"


    // $ANTLR start "rule__MoniLogger__NameAssignment_2"
    // InternalMoniLog4DSL.g:7926:1: rule__MoniLogger__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MoniLogger__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7930:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7931:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7931:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:7932:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getNameIDTerminalRuleCall_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getNameIDTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__NameAssignment_2"


    // $ANTLR start "rule__MoniLogger__ParametersAssignment_3_1"
    // InternalMoniLog4DSL.g:7941:1: rule__MoniLogger__ParametersAssignment_3_1 : ( ruleParameter ) ;
    public final void rule__MoniLogger__ParametersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7945:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7946:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7946:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7947:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParametersParameterParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getParametersParameterParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ParametersAssignment_3_1"


    // $ANTLR start "rule__MoniLogger__ParametersAssignment_3_2_1"
    // InternalMoniLog4DSL.g:7956:1: rule__MoniLogger__ParametersAssignment_3_2_1 : ( ruleParameter ) ;
    public final void rule__MoniLogger__ParametersAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7960:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:7961:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:7961:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:7962:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getParametersParameterParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ParametersAssignment_3_2_1"


    // $ANTLR start "rule__MoniLogger__LevelAssignment_4_1"
    // InternalMoniLog4DSL.g:7971:1: rule__MoniLogger__LevelAssignment_4_1 : ( ruleLogLevel ) ;
    public final void rule__MoniLogger__LevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7975:1: ( ( ruleLogLevel ) )
            // InternalMoniLog4DSL.g:7976:2: ( ruleLogLevel )
            {
            // InternalMoniLog4DSL.g:7976:2: ( ruleLogLevel )
            // InternalMoniLog4DSL.g:7977:3: ruleLogLevel
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLevelLogLevelEnumRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLogLevel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getLevelLogLevelEnumRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__LevelAssignment_4_1"


    // $ANTLR start "rule__MoniLogger__EventAssignment_7"
    // InternalMoniLog4DSL.g:7986:1: rule__MoniLogger__EventAssignment_7 : ( ( RULE_ID ) ) ;
    public final void rule__MoniLogger__EventAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7990:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:7991:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:7991:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7992:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getEventEventCrossReference_7_0()); 
            }
            // InternalMoniLog4DSL.g:7993:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:7994:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getEventEventIDTerminalRuleCall_7_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getEventEventIDTerminalRuleCall_7_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getEventEventCrossReference_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__EventAssignment_7"


    // $ANTLR start "rule__MoniLogger__ConditionsAssignment_8_2"
    // InternalMoniLog4DSL.g:8005:1: rule__MoniLogger__ConditionsAssignment_8_2 : ( ruleCondition ) ;
    public final void rule__MoniLogger__ConditionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8009:1: ( ( ruleCondition ) )
            // InternalMoniLog4DSL.g:8010:2: ( ruleCondition )
            {
            // InternalMoniLog4DSL.g:8010:2: ( ruleCondition )
            // InternalMoniLog4DSL.g:8011:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ConditionsAssignment_8_2"


    // $ANTLR start "rule__MoniLogger__ConditionsAssignment_8_3_1"
    // InternalMoniLog4DSL.g:8020:1: rule__MoniLogger__ConditionsAssignment_8_3_1 : ( ruleCondition ) ;
    public final void rule__MoniLogger__ConditionsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8024:1: ( ( ruleCondition ) )
            // InternalMoniLog4DSL.g:8025:2: ( ruleCondition )
            {
            // InternalMoniLog4DSL.g:8025:2: ( ruleCondition )
            // InternalMoniLog4DSL.g:8026:3: ruleCondition
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getConditionsConditionParserRuleCall_8_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ConditionsAssignment_8_3_1"


    // $ANTLR start "rule__MoniLogger__ActionsAssignment_11"
    // InternalMoniLog4DSL.g:8035:1: rule__MoniLogger__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__MoniLogger__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8039:1: ( ( ruleAction ) )
            // InternalMoniLog4DSL.g:8040:2: ( ruleAction )
            {
            // InternalMoniLog4DSL.g:8040:2: ( ruleAction )
            // InternalMoniLog4DSL.g:8041:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_11_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_11_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ActionsAssignment_11"


    // $ANTLR start "rule__MoniLogger__ActionsAssignment_12_1"
    // InternalMoniLog4DSL.g:8050:1: rule__MoniLogger__ActionsAssignment_12_1 : ( ruleAction ) ;
    public final void rule__MoniLogger__ActionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8054:1: ( ( ruleAction ) )
            // InternalMoniLog4DSL.g:8055:2: ( ruleAction )
            {
            // InternalMoniLog4DSL.g:8055:2: ( ruleAction )
            // InternalMoniLog4DSL.g:8056:3: ruleAction
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_12_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getActionsActionParserRuleCall_12_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ActionsAssignment_12_1"


    // $ANTLR start "rule__Parameter__NameAssignment"
    // InternalMoniLog4DSL.g:8065:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8069:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8070:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8070:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8071:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterAccess().getNameIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parameter__NameAssignment"


    // $ANTLR start "rule__ASTEvent__NameAssignment_1"
    // InternalMoniLog4DSL.g:8080:1: rule__ASTEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ASTEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8084:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8085:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8085:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8086:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__NameAssignment_1"


    // $ANTLR start "rule__ASTEvent__BeforeAssignment_3_0"
    // InternalMoniLog4DSL.g:8095:1: rule__ASTEvent__BeforeAssignment_3_0 : ( ( 'before' ) ) ;
    public final void rule__ASTEvent__BeforeAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8099:1: ( ( ( 'before' ) ) )
            // InternalMoniLog4DSL.g:8100:2: ( ( 'before' ) )
            {
            // InternalMoniLog4DSL.g:8100:2: ( ( 'before' ) )
            // InternalMoniLog4DSL.g:8101:3: ( 'before' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getBeforeBeforeKeyword_3_0_0()); 
            }
            // InternalMoniLog4DSL.g:8102:3: ( 'before' )
            // InternalMoniLog4DSL.g:8103:4: 'before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getBeforeBeforeKeyword_3_0_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getBeforeBeforeKeyword_3_0_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getBeforeBeforeKeyword_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__BeforeAssignment_3_0"


    // $ANTLR start "rule__ASTEvent__AfterAssignment_3_1"
    // InternalMoniLog4DSL.g:8114:1: rule__ASTEvent__AfterAssignment_3_1 : ( ( 'after' ) ) ;
    public final void rule__ASTEvent__AfterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8118:1: ( ( ( 'after' ) ) )
            // InternalMoniLog4DSL.g:8119:2: ( ( 'after' ) )
            {
            // InternalMoniLog4DSL.g:8119:2: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:8120:3: ( 'after' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getAfterAfterKeyword_3_1_0()); 
            }
            // InternalMoniLog4DSL.g:8121:3: ( 'after' )
            // InternalMoniLog4DSL.g:8122:4: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getAfterAfterKeyword_3_1_0()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getAfterAfterKeyword_3_1_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getAfterAfterKeyword_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__AfterAssignment_3_1"


    // $ANTLR start "rule__ASTEvent__RuleIDAssignment_4"
    // InternalMoniLog4DSL.g:8133:1: rule__ASTEvent__RuleIDAssignment_4 : ( RULE_ID ) ;
    public final void rule__ASTEvent__RuleIDAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8137:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8138:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8138:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8139:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventAccess().getRuleIDIDTerminalRuleCall_4_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventAccess().getRuleIDIDTerminalRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEvent__RuleIDAssignment_4"


    // $ANTLR start "rule__ComplexEvent__NameAssignment_1"
    // InternalMoniLog4DSL.g:8148:1: rule__ComplexEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ComplexEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8152:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8153:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8153:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8154:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__NameAssignment_1"


    // $ANTLR start "rule__ComplexEvent__KindAssignment_2_1"
    // InternalMoniLog4DSL.g:8163:1: rule__ComplexEvent__KindAssignment_2_1 : ( ruleTemporalPatternKind ) ;
    public final void rule__ComplexEvent__KindAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8167:1: ( ( ruleTemporalPatternKind ) )
            // InternalMoniLog4DSL.g:8168:2: ( ruleTemporalPatternKind )
            {
            // InternalMoniLog4DSL.g:8168:2: ( ruleTemporalPatternKind )
            // InternalMoniLog4DSL.g:8169:3: ruleTemporalPatternKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getKindTemporalPatternKindEnumRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemporalPatternKind();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getKindTemporalPatternKindEnumRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__KindAssignment_2_1"


    // $ANTLR start "rule__ComplexEvent__PatternAssignment_4"
    // InternalMoniLog4DSL.g:8178:1: rule__ComplexEvent__PatternAssignment_4 : ( ruleTemporalPattern ) ;
    public final void rule__ComplexEvent__PatternAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8182:1: ( ( ruleTemporalPattern ) )
            // InternalMoniLog4DSL.g:8183:2: ( ruleTemporalPattern )
            {
            // InternalMoniLog4DSL.g:8183:2: ( ruleTemporalPattern )
            // InternalMoniLog4DSL.g:8184:3: ruleTemporalPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComplexEventAccess().getPatternTemporalPatternParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemporalPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComplexEventAccess().getPatternTemporalPatternParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComplexEvent__PatternAssignment_4"


    // $ANTLR start "rule__UserEvent__NameAssignment_1"
    // InternalMoniLog4DSL.g:8193:1: rule__UserEvent__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__UserEvent__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8197:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8198:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8198:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8199:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__NameAssignment_1"


    // $ANTLR start "rule__UserEvent__ParametersAssignment_2_1"
    // InternalMoniLog4DSL.g:8208:1: rule__UserEvent__ParametersAssignment_2_1 : ( ruleParameter ) ;
    public final void rule__UserEvent__ParametersAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8212:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8213:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8213:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8214:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getParametersParameterParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__ParametersAssignment_2_1"


    // $ANTLR start "rule__UserEvent__ParametersAssignment_2_2_1"
    // InternalMoniLog4DSL.g:8223:1: rule__UserEvent__ParametersAssignment_2_2_1 : ( ruleParameter ) ;
    public final void rule__UserEvent__ParametersAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8227:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8228:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8228:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8229:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUserEventAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUserEventAccess().getParametersParameterParserRuleCall_2_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UserEvent__ParametersAssignment_2_2_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment_1"
    // InternalMoniLog4DSL.g:8238:1: rule__Condition__ExpressionAssignment_1 : ( ruleLanguageExpression ) ;
    public final void rule__Condition__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8242:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:8243:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:8243:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:8244:3: ruleLanguageExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_1"


    // $ANTLR start "rule__TemporalPattern__PatternAssignment_0"
    // InternalMoniLog4DSL.g:8253:1: rule__TemporalPattern__PatternAssignment_0 : ( rulePattern ) ;
    public final void rule__TemporalPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8257:1: ( ( rulePattern ) )
            // InternalMoniLog4DSL.g:8258:2: ( rulePattern )
            {
            // InternalMoniLog4DSL.g:8258:2: ( rulePattern )
            // InternalMoniLog4DSL.g:8259:3: rulePattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__PatternAssignment_0"


    // $ANTLR start "rule__TemporalPattern__ScopeAssignment_1"
    // InternalMoniLog4DSL.g:8268:1: rule__TemporalPattern__ScopeAssignment_1 : ( ruleScope ) ;
    public final void rule__TemporalPattern__ScopeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8272:1: ( ( ruleScope ) )
            // InternalMoniLog4DSL.g:8273:2: ( ruleScope )
            {
            // InternalMoniLog4DSL.g:8273:2: ( ruleScope )
            // InternalMoniLog4DSL.g:8274:3: ruleScope
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TemporalPattern__ScopeAssignment_1"


    // $ANTLR start "rule__Pattern__BoundAssignment_0_2"
    // InternalMoniLog4DSL.g:8283:1: rule__Pattern__BoundAssignment_0_2 : ( ruleBoundType ) ;
    public final void rule__Pattern__BoundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8287:1: ( ( ruleBoundType ) )
            // InternalMoniLog4DSL.g:8288:2: ( ruleBoundType )
            {
            // InternalMoniLog4DSL.g:8288:2: ( ruleBoundType )
            // InternalMoniLog4DSL.g:8289:3: ruleBoundType
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_0_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleBoundType();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__BoundAssignment_0_2"


    // $ANTLR start "rule__Pattern__EventAssignment_0_3"
    // InternalMoniLog4DSL.g:8298:1: rule__Pattern__EventAssignment_0_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8302:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8303:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8303:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8304:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_0_3"


    // $ANTLR start "rule__Pattern__EventAssignment_1_2"
    // InternalMoniLog4DSL.g:8313:1: rule__Pattern__EventAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8317:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8318:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8318:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8319:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_1_2"


    // $ANTLR start "rule__Pattern__EventAssignment_2_2"
    // InternalMoniLog4DSL.g:8328:1: rule__Pattern__EventAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8332:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8333:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8333:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8334:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_2_2"


    // $ANTLR start "rule__Pattern__PredecessorAssignment_3_1"
    // InternalMoniLog4DSL.g:8343:1: rule__Pattern__PredecessorAssignment_3_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__PredecessorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8347:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8348:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8348:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8349:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__PredecessorAssignment_3_1"


    // $ANTLR start "rule__Pattern__SuccessorAssignment_3_3"
    // InternalMoniLog4DSL.g:8358:1: rule__Pattern__SuccessorAssignment_3_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__SuccessorAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8362:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8363:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8363:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8364:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__SuccessorAssignment_3_3"


    // $ANTLR start "rule__Pattern__EventAssignment_4_1"
    // InternalMoniLog4DSL.g:8373:1: rule__Pattern__EventAssignment_4_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8377:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8378:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8378:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8379:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_4_1"


    // $ANTLR start "rule__Pattern__TriggerAssignment_4_3"
    // InternalMoniLog4DSL.g:8388:1: rule__Pattern__TriggerAssignment_4_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__TriggerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8392:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8393:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8393:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8394:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__TriggerAssignment_4_3"


    // $ANTLR start "rule__ExactBound__NAssignment"
    // InternalMoniLog4DSL.g:8403:1: rule__ExactBound__NAssignment : ( RULE_INT ) ;
    public final void rule__ExactBound__NAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8407:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:8408:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:8408:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:8409:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExactBound__NAssignment"


    // $ANTLR start "rule__LowerBound__NAssignment_1"
    // InternalMoniLog4DSL.g:8418:1: rule__LowerBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__LowerBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8422:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:8423:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:8423:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:8424:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LowerBound__NAssignment_1"


    // $ANTLR start "rule__UpperBound__NAssignment_1"
    // InternalMoniLog4DSL.g:8433:1: rule__UpperBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__UpperBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8437:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:8438:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:8438:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:8439:3: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UpperBound__NAssignment_1"


    // $ANTLR start "rule__Scope__LowerBoundAssignment_1_2"
    // InternalMoniLog4DSL.g:8448:1: rule__Scope__LowerBoundAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8452:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8453:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8453:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8454:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__LowerBoundAssignment_1_2"


    // $ANTLR start "rule__Scope__UpperBoundAssignment_2_2"
    // InternalMoniLog4DSL.g:8463:1: rule__Scope__UpperBoundAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8467:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8468:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8468:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8469:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__UpperBoundAssignment_2_2"


    // $ANTLR start "rule__Scope__LowerBoundAssignment_3_2"
    // InternalMoniLog4DSL.g:8478:1: rule__Scope__LowerBoundAssignment_3_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8482:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8483:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8483:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8484:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__LowerBoundAssignment_3_2"


    // $ANTLR start "rule__Scope__UpperBoundAssignment_3_4"
    // InternalMoniLog4DSL.g:8493:1: rule__Scope__UpperBoundAssignment_3_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8497:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8498:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8498:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8499:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__UpperBoundAssignment_3_4"


    // $ANTLR start "rule__Scope__LowerBoundAssignment_4_2"
    // InternalMoniLog4DSL.g:8508:1: rule__Scope__LowerBoundAssignment_4_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8512:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8513:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8513:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8514:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__LowerBoundAssignment_4_2"


    // $ANTLR start "rule__Scope__UpperBoundAssignment_4_4"
    // InternalMoniLog4DSL.g:8523:1: rule__Scope__UpperBoundAssignment_4_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8527:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8528:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8528:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8529:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Scope__UpperBoundAssignment_4_4"


    // $ANTLR start "rule__AppenderCall__AppenderAssignment_0"
    // InternalMoniLog4DSL.g:8538:1: rule__AppenderCall__AppenderAssignment_0 : ( ruleAppenderRef ) ;
    public final void rule__AppenderCall__AppenderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8542:1: ( ( ruleAppenderRef ) )
            // InternalMoniLog4DSL.g:8543:2: ( ruleAppenderRef )
            {
            // InternalMoniLog4DSL.g:8543:2: ( ruleAppenderRef )
            // InternalMoniLog4DSL.g:8544:3: ruleAppenderRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAppenderRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppenderRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getAppenderAppenderRefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__AppenderAssignment_0"


    // $ANTLR start "rule__AppenderCall__ArgsAssignment_3_1"
    // InternalMoniLog4DSL.g:8553:1: rule__AppenderCall__ArgsAssignment_3_1 : ( ruleAppenderCallArgument ) ;
    public final void rule__AppenderCall__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8557:1: ( ( ruleAppenderCallArgument ) )
            // InternalMoniLog4DSL.g:8558:2: ( ruleAppenderCallArgument )
            {
            // InternalMoniLog4DSL.g:8558:2: ( ruleAppenderCallArgument )
            // InternalMoniLog4DSL.g:8559:3: ruleAppenderCallArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppenderCallArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__ArgsAssignment_3_1"


    // $ANTLR start "rule__AppenderCall__ArgsAssignment_3_2_1"
    // InternalMoniLog4DSL.g:8568:1: rule__AppenderCall__ArgsAssignment_3_2_1 : ( ruleAppenderCallArgument ) ;
    public final void rule__AppenderCall__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8572:1: ( ( ruleAppenderCallArgument ) )
            // InternalMoniLog4DSL.g:8573:2: ( ruleAppenderCallArgument )
            {
            // InternalMoniLog4DSL.g:8573:2: ( ruleAppenderCallArgument )
            // InternalMoniLog4DSL.g:8574:3: ruleAppenderCallArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppenderCallArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getArgsAppenderCallArgumentParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderCall__ArgsAssignment_3_2_1"


    // $ANTLR start "rule__AppenderRef__AppenderAssignment"
    // InternalMoniLog4DSL.g:8583:1: rule__AppenderRef__AppenderAssignment : ( ( ruleFQN ) ) ;
    public final void rule__AppenderRef__AppenderAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8587:1: ( ( ( ruleFQN ) ) )
            // InternalMoniLog4DSL.g:8588:2: ( ( ruleFQN ) )
            {
            // InternalMoniLog4DSL.g:8588:2: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:8589:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderRefAccess().getAppenderAppenderCrossReference_0()); 
            }
            // InternalMoniLog4DSL.g:8590:3: ( ruleFQN )
            // InternalMoniLog4DSL.g:8591:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderRefAccess().getAppenderAppenderFQNParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderRefAccess().getAppenderAppenderFQNParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderRefAccess().getAppenderAppenderCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AppenderRef__AppenderAssignment"


    // $ANTLR start "rule__LayoutCall__LayoutAssignment_0"
    // InternalMoniLog4DSL.g:8602:1: rule__LayoutCall__LayoutAssignment_0 : ( ruleLayoutRef ) ;
    public final void rule__LayoutCall__LayoutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8606:1: ( ( ruleLayoutRef ) )
            // InternalMoniLog4DSL.g:8607:2: ( ruleLayoutRef )
            {
            // InternalMoniLog4DSL.g:8607:2: ( ruleLayoutRef )
            // InternalMoniLog4DSL.g:8608:3: ruleLayoutRef
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutLayoutRefParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLayoutRef();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getLayoutLayoutRefParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__LayoutAssignment_0"


    // $ANTLR start "rule__LayoutCall__ArgsAssignment_3_1"
    // InternalMoniLog4DSL.g:8617:1: rule__LayoutCall__ArgsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__LayoutCall__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8621:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8622:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8622:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8623:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__ArgsAssignment_3_1"


    // $ANTLR start "rule__LayoutCall__ArgsAssignment_3_2_1"
    // InternalMoniLog4DSL.g:8632:1: rule__LayoutCall__ArgsAssignment_3_2_1 : ( ruleExpression ) ;
    public final void rule__LayoutCall__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8636:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8637:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8637:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8638:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getArgsExpressionParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutCall__ArgsAssignment_3_2_1"


    // $ANTLR start "rule__LayoutRef__LayoutAssignment"
    // InternalMoniLog4DSL.g:8647:1: rule__LayoutRef__LayoutAssignment : ( ( ruleFQN ) ) ;
    public final void rule__LayoutRef__LayoutAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8651:1: ( ( ( ruleFQN ) ) )
            // InternalMoniLog4DSL.g:8652:2: ( ( ruleFQN ) )
            {
            // InternalMoniLog4DSL.g:8652:2: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:8653:3: ( ruleFQN )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutRefAccess().getLayoutLayoutCrossReference_0()); 
            }
            // InternalMoniLog4DSL.g:8654:3: ( ruleFQN )
            // InternalMoniLog4DSL.g:8655:4: ruleFQN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutRefAccess().getLayoutLayoutFQNParserRuleCall_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutRefAccess().getLayoutLayoutFQNParserRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutRefAccess().getLayoutLayoutCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LayoutRef__LayoutAssignment"


    // $ANTLR start "rule__EmitEvent__EventAssignment_0"
    // InternalMoniLog4DSL.g:8666:1: rule__EmitEvent__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EmitEvent__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8670:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:8671:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:8671:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8672:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventEventCrossReference_0_0()); 
            }
            // InternalMoniLog4DSL.g:8673:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:8674:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getEventEventCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__EventAssignment_0"


    // $ANTLR start "rule__EmitEvent__ArgsAssignment_3_1"
    // InternalMoniLog4DSL.g:8685:1: rule__EmitEvent__ArgsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__EmitEvent__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8689:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8690:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8690:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8691:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__ArgsAssignment_3_1"


    // $ANTLR start "rule__EmitEvent__ArgsAssignment_3_2_1"
    // InternalMoniLog4DSL.g:8700:1: rule__EmitEvent__ArgsAssignment_3_2_1 : ( ruleExpression ) ;
    public final void rule__EmitEvent__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8704:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8705:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8705:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8706:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getArgsExpressionParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmitEvent__ArgsAssignment_3_2_1"


    // $ANTLR start "rule__MoniLoggerCall__MoniloggerAssignment_0_1"
    // InternalMoniLog4DSL.g:8715:1: rule__MoniLoggerCall__MoniloggerAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoniLoggerCall__MoniloggerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8719:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:8720:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:8720:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8721:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0()); 
            }
            // InternalMoniLog4DSL.g:8722:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:8723:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__MoniloggerAssignment_0_1"


    // $ANTLR start "rule__MoniLoggerCall__ArgsAssignment_0_4_1"
    // InternalMoniLog4DSL.g:8734:1: rule__MoniLoggerCall__ArgsAssignment_0_4_1 : ( ruleExpression ) ;
    public final void rule__MoniLoggerCall__ArgsAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8738:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8739:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8739:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8740:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__ArgsAssignment_0_4_1"


    // $ANTLR start "rule__MoniLoggerCall__ArgsAssignment_0_4_2_1"
    // InternalMoniLog4DSL.g:8749:1: rule__MoniLoggerCall__ArgsAssignment_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__MoniLoggerCall__ArgsAssignment_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8753:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8754:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8754:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8755:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__ArgsAssignment_0_4_2_1"


    // $ANTLR start "rule__MoniLoggerCall__MoniloggerAssignment_1_1"
    // InternalMoniLog4DSL.g:8764:1: rule__MoniLoggerCall__MoniloggerAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoniLoggerCall__MoniloggerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8768:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:8769:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:8769:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8770:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0()); 
            }
            // InternalMoniLog4DSL.g:8771:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:8772:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLoggerCall__MoniloggerAssignment_1_1"


    // $ANTLR start "rule__StreamEvent__EventAssignment_0"
    // InternalMoniLog4DSL.g:8783:1: rule__StreamEvent__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamEvent__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8787:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:8788:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:8788:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8789:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0()); 
            }
            // InternalMoniLog4DSL.g:8790:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:8791:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getEventEventIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__EventAssignment_0"


    // $ANTLR start "rule__StreamEvent__ValuesAssignment_1_1"
    // InternalMoniLog4DSL.g:8802:1: rule__StreamEvent__ValuesAssignment_1_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8806:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog4DSL.g:8807:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog4DSL.g:8807:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog4DSL.g:8808:3: ruleEmptyOrPropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmptyOrPropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__ValuesAssignment_1_1"


    // $ANTLR start "rule__StreamEvent__ValuesAssignment_1_2_1"
    // InternalMoniLog4DSL.g:8817:1: rule__StreamEvent__ValuesAssignment_1_2_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8821:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog4DSL.g:8822:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog4DSL.g:8822:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog4DSL.g:8823:3: ruleEmptyOrPropertyValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEmptyOrPropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__ValuesAssignment_1_2_1"


    // $ANTLR start "rule__EmptyOrPropertyValue__IdAssignment_1_1"
    // InternalMoniLog4DSL.g:8832:1: rule__EmptyOrPropertyValue__IdAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__EmptyOrPropertyValue__IdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8836:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8837:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8837:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8838:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getIdIDTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getIdIDTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__IdAssignment_1_1"


    // $ANTLR start "rule__EmptyOrPropertyValue__ValueAssignment_1_2_1"
    // InternalMoniLog4DSL.g:8847:1: rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 : ( ruleExpression ) ;
    public final void rule__EmptyOrPropertyValue__ValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8851:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:8852:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:8852:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:8853:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getValueExpressionParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmptyOrPropertyValueAccess().getValueExpressionParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EmptyOrPropertyValue__ValueAssignment_1_2_1"


    // $ANTLR start "rule__ParameterReference__ParameterAssignment"
    // InternalMoniLog4DSL.g:8862:1: rule__ParameterReference__ParameterAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8866:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:8867:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:8867:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8868:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            }
            // InternalMoniLog4DSL.g:8869:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:8870:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterReferenceAccess().getParameterParameterIDTerminalRuleCall_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterReference__ParameterAssignment"


    // $ANTLR start "rule__LanguageExpression__LanguageIdAssignment_0_1"
    // InternalMoniLog4DSL.g:8881:1: rule__LanguageExpression__LanguageIdAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__LanguageExpression__LanguageIdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8885:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8886:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8886:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8887:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__LanguageIdAssignment_0_1"


    // $ANTLR start "rule__LanguageExpression__ExpressionAssignment_0_3"
    // InternalMoniLog4DSL.g:8896:1: rule__LanguageExpression__ExpressionAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__LanguageExpression__ExpressionAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8900:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:8901:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:8901:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:8902:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_0_3_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__ExpressionAssignment_0_3"


    // $ANTLR start "rule__LanguageExpression__ExpressionAssignment_1_1"
    // InternalMoniLog4DSL.g:8911:1: rule__LanguageExpression__ExpressionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__LanguageExpression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8915:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:8916:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:8916:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:8917:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__ExpressionAssignment_1_1"

    // $ANTLR start synpred1_InternalMoniLog4DSL
    public final void synpred1_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7385:8: ( rule__Document__EventsAssignment_1_0 )
        // InternalMoniLog4DSL.g:7385:9: rule__Document__EventsAssignment_1_0
        {
        pushFollow(FOLLOW_2);
        rule__Document__EventsAssignment_1_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMoniLog4DSL

    // $ANTLR start synpred2_InternalMoniLog4DSL
    public final void synpred2_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7407:8: ( rule__Document__AppendersAssignment_1_1 )
        // InternalMoniLog4DSL.g:7407:9: rule__Document__AppendersAssignment_1_1
        {
        pushFollow(FOLLOW_2);
        rule__Document__AppendersAssignment_1_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMoniLog4DSL

    // $ANTLR start synpred3_InternalMoniLog4DSL
    public final void synpred3_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7429:8: ( rule__Document__LayoutsAssignment_1_2 )
        // InternalMoniLog4DSL.g:7429:9: rule__Document__LayoutsAssignment_1_2
        {
        pushFollow(FOLLOW_2);
        rule__Document__LayoutsAssignment_1_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMoniLog4DSL

    // $ANTLR start synpred4_InternalMoniLog4DSL
    public final void synpred4_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7451:8: ( rule__Document__MoniLogSpecsAssignment_1_3 )
        // InternalMoniLog4DSL.g:7451:9: rule__Document__MoniLogSpecsAssignment_1_3
        {
        pushFollow(FOLLOW_2);
        rule__Document__MoniLogSpecsAssignment_1_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMoniLog4DSL

    // Delegated rules

    public final boolean synpred2_InternalMoniLog4DSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMoniLog4DSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalMoniLog4DSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalMoniLog4DSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMoniLog4DSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMoniLog4DSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalMoniLog4DSL() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalMoniLog4DSL_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA54 dfa54 = new DFA54(this);
    protected DFA56 dfa56 = new DFA56(this);
    static final String dfa_1s = "\12\uffff";
    static final String dfa_2s = "\3\uffff\1\5\4\uffff\1\5\1\uffff";
    static final String dfa_3s = "\1\14\1\uffff\1\4\1\13\1\4\1\uffff\1\35\1\4\1\13\1\35";
    static final String dfa_4s = "\1\31\1\uffff\1\4\1\67\1\4\1\uffff\1\36\1\4\1\51\1\36";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\4\uffff";
    static final String dfa_6s = "\12\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\14\uffff\1\2",
            "",
            "\1\3",
            "\2\5\14\uffff\1\5\1\1\1\uffff\1\4\3\uffff\2\5\5\uffff\3\5\15\uffff\1\5",
            "\1\6",
            "",
            "\1\10\1\7",
            "\1\11",
            "\2\5\14\uffff\1\5\1\1\5\uffff\2\5\5\uffff\3\5",
            "\1\10\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1012:1: rule__Appender__Alternatives : ( ( ruleLocalAppender ) | ( ruleExternalAppender ) );";
        }
    }
    static final String dfa_8s = "\2\uffff\1\3\5\uffff\1\3\1\uffff";
    static final String dfa_9s = "\1\40\1\4\1\13\1\uffff\1\4\1\uffff\1\35\1\4\1\13\1\35";
    static final String dfa_10s = "\1\40\1\4\1\67\1\uffff\1\4\1\uffff\1\36\1\4\1\51\1\36";
    static final String dfa_11s = "\3\uffff\1\2\1\uffff\1\1\4\uffff";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\2\3\14\uffff\1\3\1\5\1\uffff\1\4\3\uffff\2\3\5\uffff\3\3\15\uffff\1\3",
            "",
            "\1\6",
            "",
            "\1\10\1\7",
            "\1\11",
            "\2\3\14\uffff\1\3\1\5\5\uffff\2\3\5\uffff\3\3",
            "\1\10\1\7"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1033:1: rule__Layout__Alternatives : ( ( ruleLocalLayout ) | ( ruleExternalLayout ) );";
        }
    }
    static final String dfa_13s = "\30\uffff";
    static final String dfa_14s = "\2\uffff\1\1\6\uffff\1\1\16\uffff";
    static final String dfa_15s = "\1\4\1\uffff\1\33\2\uffff\1\4\2\uffff\1\4\1\33\2\36\2\4\1\34\1\36\1\34\1\36\2\5\2\35\2\36";
    static final String dfa_16s = "\1\60\1\uffff\1\64\2\uffff\1\45\2\uffff\1\45\1\64\2\74\2\5\4\45\2\5\2\35\2\45";
    static final String dfa_17s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\20\uffff";
    static final String dfa_18s = "\30\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\uffff\1\1\43\uffff\1\1\1\3\1\4\2\uffff\2\1",
            "",
            "\1\1\10\uffff\1\5\10\uffff\1\6\1\7\2\uffff\4\1",
            "",
            "",
            "\1\12\31\uffff\1\10\6\uffff\1\11",
            "",
            "",
            "\1\13\31\uffff\1\10\6\uffff\1\11",
            "\1\1\21\uffff\1\6\1\7\2\uffff\4\1",
            "\1\10\6\uffff\1\11\26\uffff\1\14",
            "\1\10\6\uffff\1\11\26\uffff\1\15",
            "\1\16\1\17",
            "\1\20\1\21",
            "\1\22\1\uffff\1\10\6\uffff\1\11",
            "\1\10\6\uffff\1\11",
            "\1\23\1\uffff\1\10\6\uffff\1\11",
            "\1\10\6\uffff\1\11",
            "\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\10\6\uffff\1\11",
            "\1\10\6\uffff\1\11"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1081:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );";
        }
    }
    static final String dfa_20s = "\31\uffff";
    static final String dfa_21s = "\1\1\4\uffff\1\7\4\uffff\1\7\16\uffff";
    static final String dfa_22s = "\1\33\1\uffff\1\4\2\uffff\1\33\1\4\2\uffff\1\4\1\33\2\36\2\4\1\34\1\36\1\34\1\36\2\5\2\35\2\36";
    static final String dfa_23s = "\1\64\1\uffff\1\4\2\uffff\1\66\1\45\2\uffff\1\45\1\66\2\74\2\5\4\45\2\5\2\35\2\45";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\2\1\5\20\uffff";
    static final String dfa_25s = "\31\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\25\uffff\1\1\1\2\1\3\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\7\10\uffff\1\6\21\uffff\1\10",
            "\1\13\31\uffff\1\11\6\uffff\1\12",
            "",
            "",
            "\1\14\31\uffff\1\11\6\uffff\1\12",
            "\1\7\32\uffff\1\10",
            "\1\11\6\uffff\1\12\26\uffff\1\15",
            "\1\11\6\uffff\1\12\26\uffff\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23\1\uffff\1\11\6\uffff\1\12",
            "\1\11\6\uffff\1\12",
            "\1\24\1\uffff\1\11\6\uffff\1\12",
            "\1\11\6\uffff\1\12",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\11\6\uffff\1\12",
            "\1\11\6\uffff\1\12"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "1147:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );";
        }
    }
    static final String dfa_27s = "\u00ee\uffff";
    static final String dfa_28s = "\1\4\u00ed\uffff";
    static final String dfa_29s = "\1\13\3\4\1\uffff\2\32\1\0\1\4\1\24\1\4\1\uffff\2\4\1\33\4\45\2\4\2\6\1\33\4\4\1\0\1\32\1\33\3\4\1\33\1\0\5\4\2\33\2\4\1\33\1\36\2\33\1\44\2\33\3\4\1\33\2\36\11\4\1\33\1\36\1\4\1\33\2\36\2\4\1\34\1\36\1\4\1\33\1\36\1\33\1\4\1\33\1\36\1\4\1\65\1\36\1\33\1\4\1\33\1\36\1\4\1\33\2\36\1\4\1\36\2\4\1\34\1\36\1\34\1\36\1\5\1\36\2\4\1\36\1\4\1\36\2\4\1\36\1\4\1\36\2\4\1\34\1\36\1\4\1\34\1\36\1\34\1\36\2\5\1\35\1\4\1\34\1\36\1\4\1\33\1\36\1\4\1\34\1\36\1\4\1\34\1\36\1\4\1\33\1\36\1\4\1\34\1\36\1\4\1\34\1\36\1\34\1\36\1\5\1\34\1\36\2\5\2\35\1\36\1\34\1\36\1\5\1\36\1\4\1\34\1\36\1\5\1\34\1\36\1\5\1\36\1\4\1\34\1\36\1\5\1\34\1\36\2\5\1\35\1\5\2\35\2\36\1\5\1\35\1\4\1\34\1\36\1\5\1\35\1\5\1\35\1\4\1\34\1\36\1\5\1\35\1\5\2\35\1\36\1\35\2\36\1\35\1\36\1\34\1\36\1\5\1\35\1\36\1\35\1\36\1\34\1\36\1\5\1\35\1\36\1\35\4\36\1\5\1\35\2\36\1\5\1\35\2\36\1\35\1\36\1\35\3\36";
    static final String dfa_30s = "\1\51\3\4\1\uffff\1\32\1\44\1\0\1\63\1\27\1\60\1\uffff\2\63\1\33\4\45\1\60\1\4\2\6\1\64\4\4\1\0\1\32\1\64\2\4\1\45\1\33\1\0\5\4\2\64\2\45\1\64\1\74\1\66\1\44\1\65\2\64\3\45\1\64\2\74\1\5\1\45\1\4\2\45\1\4\3\45\1\64\1\74\1\45\1\64\2\74\2\5\3\45\1\66\1\74\1\44\1\45\1\33\1\74\1\45\1\65\1\74\1\44\1\45\1\64\1\74\1\45\1\64\2\74\1\5\1\74\2\5\4\45\1\5\1\74\1\5\1\45\1\74\1\5\1\74\1\5\1\45\1\74\1\5\1\74\2\5\2\45\1\5\4\45\2\5\1\35\1\5\3\45\1\33\1\74\1\5\2\45\1\5\3\45\1\33\1\74\1\5\2\45\1\5\4\45\1\5\2\45\2\5\2\35\3\45\1\5\1\74\1\5\2\45\1\5\2\45\1\5\1\74\1\5\2\45\1\5\2\45\2\5\1\35\1\5\2\35\2\45\1\5\1\35\1\5\2\45\1\5\1\35\1\5\1\35\1\5\2\45\1\5\1\35\1\5\2\35\1\45\1\35\2\45\1\35\3\45\1\5\1\35\1\45\1\35\3\45\1\5\1\35\1\45\1\35\4\45\1\5\1\35\2\45\1\5\1\35\2\45\1\35\1\45\1\35\3\45";
    static final String dfa_31s = "\4\uffff\1\2\6\uffff\1\1\u00e2\uffff";
    static final String dfa_32s = "\7\uffff\1\1\24\uffff\1\2\6\uffff\1\0\u00ca\uffff}>";
    static final String[] dfa_33s = {
            "\2\4\14\uffff\1\4\6\uffff\2\4\5\uffff\1\1\1\2\1\3",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\10",
            "\1\12\11\uffff\1\11",
            "\1\uffff",
            "\1\16\55\uffff\1\15\1\14",
            "\1\17\1\20\1\21\1\22",
            "\1\27\1\uffff\1\24\43\uffff\1\23\1\30\1\31\2\uffff\1\25\1\26",
            "",
            "\1\16\55\uffff\1\33\1\32",
            "\1\16\55\uffff\1\33\1\32",
            "\1\34",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\35",
            "\1\36\1\uffff\1\24\50\uffff\1\25\1\26",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\43\10\uffff\1\41\10\uffff\1\47\1\50\2\uffff\1\42\1\44\1\45\1\46",
            "\1\51",
            "\1\52",
            "\1\16",
            "\1\16",
            "\1\uffff",
            "\1\12",
            "\1\43\10\uffff\1\53\14\uffff\1\42\1\44\1\45\1\46",
            "\1\36",
            "\1\36",
            "\1\56\31\uffff\1\54\6\uffff\1\55",
            "\1\43",
            "\1\uffff",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\43\10\uffff\1\64\14\uffff\1\42\1\44\1\45\1\46",
            "\1\43\10\uffff\1\65\14\uffff\1\42\1\44\1\45\1\46",
            "\1\70\31\uffff\1\66\6\uffff\1\67",
            "\1\71\31\uffff\1\54\6\uffff\1\55",
            "\1\43\21\uffff\1\47\1\50\2\uffff\1\42\1\44\1\45\1\46",
            "\1\54\6\uffff\1\55\26\uffff\1\72",
            "\1\43\10\uffff\1\73\21\uffff\1\74",
            "\1\43\10\uffff\1\75",
            "\1\76\20\uffff\1\77",
            "\1\43\10\uffff\1\100\14\uffff\1\42\1\44\1\45\1\46",
            "\1\43\10\uffff\1\101\14\uffff\1\42\1\44\1\45\1\46",
            "\1\104\31\uffff\1\102\6\uffff\1\103",
            "\1\107\31\uffff\1\105\6\uffff\1\106",
            "\1\110\31\uffff\1\66\6\uffff\1\67",
            "\1\43\25\uffff\1\42\1\44\1\45\1\46",
            "\1\66\6\uffff\1\67\26\uffff\1\111",
            "\1\54\6\uffff\1\55\26\uffff\1\112",
            "\1\113\1\114",
            "\1\117\31\uffff\1\115\6\uffff\1\116",
            "\1\120",
            "\1\123\31\uffff\1\121\6\uffff\1\122",
            "\1\126\31\uffff\1\124\6\uffff\1\125",
            "\1\127",
            "\1\132\31\uffff\1\130\6\uffff\1\131",
            "\1\135\31\uffff\1\133\6\uffff\1\134",
            "\1\136\31\uffff\1\102\6\uffff\1\103",
            "\1\43\25\uffff\1\42\1\44\1\45\1\46",
            "\1\102\6\uffff\1\103\26\uffff\1\137",
            "\1\140\31\uffff\1\105\6\uffff\1\106",
            "\1\43\25\uffff\1\42\1\44\1\45\1\46",
            "\1\105\6\uffff\1\106\26\uffff\1\141",
            "\1\66\6\uffff\1\67\26\uffff\1\142",
            "\1\143\1\144",
            "\1\145\1\146",
            "\1\147\1\uffff\1\54\6\uffff\1\55",
            "\1\54\6\uffff\1\55",
            "\1\150\31\uffff\1\115\6\uffff\1\116",
            "\1\43\32\uffff\1\74",
            "\1\115\6\uffff\1\116\26\uffff\1\151",
            "\1\43\10\uffff\1\152",
            "\1\153\31\uffff\1\121\6\uffff\1\122",
            "\1\43",
            "\1\121\6\uffff\1\122\26\uffff\1\154",
            "\1\155\31\uffff\1\124\6\uffff\1\125",
            "\1\77",
            "\1\124\6\uffff\1\125\26\uffff\1\156",
            "\1\43\10\uffff\1\157",
            "\1\160\31\uffff\1\130\6\uffff\1\131",
            "\1\43\25\uffff\1\42\1\44\1\45\1\46",
            "\1\130\6\uffff\1\131\26\uffff\1\161",
            "\1\162\31\uffff\1\133\6\uffff\1\134",
            "\1\43\25\uffff\1\42\1\44\1\45\1\46",
            "\1\133\6\uffff\1\134\26\uffff\1\163",
            "\1\102\6\uffff\1\103\26\uffff\1\164",
            "\1\165\1\166",
            "\1\105\6\uffff\1\106\26\uffff\1\167",
            "\1\170\1\171",
            "\1\172\1\173",
            "\1\174\1\uffff\1\66\6\uffff\1\67",
            "\1\66\6\uffff\1\67",
            "\1\175\1\uffff\1\54\6\uffff\1\55",
            "\1\54\6\uffff\1\55",
            "\1\176",
            "\1\115\6\uffff\1\116\26\uffff\1\177",
            "\1\u0080\1\u0081",
            "\1\u0084\31\uffff\1\u0082\6\uffff\1\u0083",
            "\1\121\6\uffff\1\122\26\uffff\1\u0085",
            "\1\u0086\1\u0087",
            "\1\124\6\uffff\1\125\26\uffff\1\u0088",
            "\1\u0089\1\u008a",
            "\1\u008d\31\uffff\1\u008b\6\uffff\1\u008c",
            "\1\130\6\uffff\1\131\26\uffff\1\u008e",
            "\1\u008f\1\u0090",
            "\1\133\6\uffff\1\134\26\uffff\1\u0091",
            "\1\u0092\1\u0093",
            "\1\u0094\1\u0095",
            "\1\u0096\1\uffff\1\102\6\uffff\1\103",
            "\1\102\6\uffff\1\103",
            "\1\u0097\1\u0098",
            "\1\u0099\1\uffff\1\105\6\uffff\1\106",
            "\1\105\6\uffff\1\106",
            "\1\u009a\1\uffff\1\66\6\uffff\1\67",
            "\1\66\6\uffff\1\67",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e\1\u009f",
            "\1\u00a0\1\uffff\1\115\6\uffff\1\116",
            "\1\115\6\uffff\1\116",
            "\1\u00a1\31\uffff\1\u0082\6\uffff\1\u0083",
            "\1\43",
            "\1\u0082\6\uffff\1\u0083\26\uffff\1\u00a2",
            "\1\u00a3\1\u00a4",
            "\1\u00a5\1\uffff\1\121\6\uffff\1\122",
            "\1\121\6\uffff\1\122",
            "\1\u00a6\1\u00a7",
            "\1\u00a8\1\uffff\1\124\6\uffff\1\125",
            "\1\124\6\uffff\1\125",
            "\1\u00a9\31\uffff\1\u008b\6\uffff\1\u008c",
            "\1\43",
            "\1\u008b\6\uffff\1\u008c\26\uffff\1\u00aa",
            "\1\u00ab\1\u00ac",
            "\1\u00ad\1\uffff\1\130\6\uffff\1\131",
            "\1\130\6\uffff\1\131",
            "\1\u00ae\1\u00af",
            "\1\u00b0\1\uffff\1\133\6\uffff\1\134",
            "\1\133\6\uffff\1\134",
            "\1\u00b1\1\uffff\1\102\6\uffff\1\103",
            "\1\102\6\uffff\1\103",
            "\1\u00b2",
            "\1\u00b3\1\uffff\1\105\6\uffff\1\106",
            "\1\105\6\uffff\1\106",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\54\6\uffff\1\55",
            "\1\u00b8\1\uffff\1\115\6\uffff\1\116",
            "\1\115\6\uffff\1\116",
            "\1\u00b9",
            "\1\u0082\6\uffff\1\u0083\26\uffff\1\u00ba",
            "\1\u00bb\1\u00bc",
            "\1\u00bd\1\uffff\1\121\6\uffff\1\122",
            "\1\121\6\uffff\1\122",
            "\1\u00be",
            "\1\u00bf\1\uffff\1\124\6\uffff\1\125",
            "\1\124\6\uffff\1\125",
            "\1\u00c0",
            "\1\u008b\6\uffff\1\u008c\26\uffff\1\u00c1",
            "\1\u00c2\1\u00c3",
            "\1\u00c4\1\uffff\1\130\6\uffff\1\131",
            "\1\130\6\uffff\1\131",
            "\1\u00c5",
            "\1\u00c6\1\uffff\1\133\6\uffff\1\134",
            "\1\133\6\uffff\1\134",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\66\6\uffff\1\67",
            "\1\54\6\uffff\1\55",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\1\u00d0",
            "\1\u00d1\1\uffff\1\u0082\6\uffff\1\u0083",
            "\1\u0082\6\uffff\1\u0083",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6\1\u00d7",
            "\1\u00d8\1\uffff\1\u008b\6\uffff\1\u008c",
            "\1\u008b\6\uffff\1\u008c",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\102\6\uffff\1\103",
            "\1\u00de",
            "\1\105\6\uffff\1\106",
            "\1\66\6\uffff\1\67",
            "\1\u00df",
            "\1\115\6\uffff\1\116",
            "\1\u00e0\1\uffff\1\u0082\6\uffff\1\u0083",
            "\1\u0082\6\uffff\1\u0083",
            "\1\u00e1",
            "\1\u00e2",
            "\1\121\6\uffff\1\122",
            "\1\u00e3",
            "\1\124\6\uffff\1\125",
            "\1\u00e4\1\uffff\1\u008b\6\uffff\1\u008c",
            "\1\u008b\6\uffff\1\u008c",
            "\1\u00e5",
            "\1\u00e6",
            "\1\130\6\uffff\1\131",
            "\1\u00e7",
            "\1\133\6\uffff\1\134",
            "\1\102\6\uffff\1\103",
            "\1\105\6\uffff\1\106",
            "\1\115\6\uffff\1\116",
            "\1\u00e8",
            "\1\u00e9",
            "\1\121\6\uffff\1\122",
            "\1\124\6\uffff\1\125",
            "\1\u00ea",
            "\1\u00eb",
            "\1\130\6\uffff\1\131",
            "\1\133\6\uffff\1\134",
            "\1\u00ec",
            "\1\u0082\6\uffff\1\u0083",
            "\1\u00ed",
            "\1\u008b\6\uffff\1\u008c",
            "\1\u0082\6\uffff\1\u0083",
            "\1\u008b\6\uffff\1\u008c"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 7385:7: ( ( rule__Document__EventsAssignment_1_0 )=> rule__Document__EventsAssignment_1_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_35 = input.LA(1);

                         
                        int index53_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog4DSL()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_35);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_7 = input.LA(1);

                         
                        int index53_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog4DSL()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA53_28 = input.LA(1);

                         
                        int index53_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog4DSL()) ) {s = 11;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index53_28);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\162\uffff";
    static final String dfa_35s = "\1\1\161\uffff";
    static final String dfa_36s = "\1\13\1\uffff\1\14\2\4\1\0\1\32\1\uffff\2\4\1\35\1\67\1\4\1\32\1\4\1\35\1\67\1\33\2\4\1\0\1\34\1\35\1\67\1\5\1\4\1\33\2\4\1\35\1\34\1\35\1\67\1\34\1\67\1\33\1\35\1\5\3\4\1\35\1\67\2\34\1\35\1\34\2\35\1\4\1\5\1\4\1\35\2\4\1\33\1\5\1\34\2\35\1\34\1\35\1\67\2\34\2\35\1\5\1\4\2\35\1\5\2\4\1\5\2\35\1\34\2\35\1\34\1\35\1\67\1\34\2\35\1\5\1\35\1\4\1\35\1\5\1\4\2\35\1\34\2\35\1\34\2\35\1\5\1\35\1\5\1\4\3\35\1\34\3\35\1\5\2\35";
    static final String dfa_37s = "\1\51\1\uffff\1\31\2\4\1\0\1\34\1\uffff\2\4\1\36\1\67\1\4\1\32\1\70\1\36\1\67\1\37\1\5\1\4\1\0\1\67\1\36\1\67\2\5\1\37\2\70\1\35\1\67\1\36\1\67\1\36\1\67\1\37\1\36\1\5\1\70\2\5\1\35\1\67\3\36\1\67\2\36\3\5\1\36\1\70\1\5\1\37\1\5\2\36\1\35\2\36\1\67\1\36\1\67\1\36\1\35\2\5\2\36\2\5\1\70\1\5\1\36\1\35\2\36\1\35\2\36\1\67\1\36\1\35\1\36\1\5\1\36\1\5\1\36\2\5\1\36\1\35\2\36\1\35\3\36\1\5\1\36\2\5\1\36\2\35\4\36\1\5\1\35\1\36";
    static final String dfa_38s = "\1\uffff\1\2\5\uffff\1\1\152\uffff";
    static final String dfa_39s = "\5\uffff\1\0\16\uffff\1\1\135\uffff}>";
    static final String[] dfa_40s = {
            "\1\1\1\2\14\uffff\1\3\6\uffff\2\1\5\uffff\3\1",
            "",
            "\1\2\14\uffff\1\4",
            "\1\5",
            "\1\6",
            "\1\uffff",
            "\1\11\1\uffff\1\10",
            "",
            "\1\12",
            "\1\13",
            "\1\15\1\14",
            "\1\16",
            "\1\17",
            "\1\11",
            "\1\20\63\uffff\1\21",
            "\1\15\1\14",
            "\1\16",
            "\1\24\1\22\2\uffff\1\23",
            "\1\25\1\26",
            "\1\27",
            "\1\uffff",
            "\1\30\1\32\1\31\30\uffff\1\33",
            "\1\32\1\31",
            "\1\34",
            "\1\35",
            "\1\36\1\37",
            "\1\24\3\uffff\1\23",
            "\1\40\63\uffff\1\41",
            "\1\42\63\uffff\1\43",
            "\1\44",
            "\1\45\1\32\1\31\30\uffff\1\46",
            "\1\32\1\31",
            "\1\33",
            "\1\47\1\32\1\31",
            "\1\34",
            "\1\24\1\50\2\uffff\1\23",
            "\1\32\1\31",
            "\1\51",
            "\1\52\63\uffff\1\53",
            "\1\54\1\55",
            "\1\56\1\57",
            "\1\60",
            "\1\46",
            "\1\61\1\32\1\31",
            "\1\62\1\64\1\63",
            "\1\64\1\63",
            "\1\70\1\67\1\66\30\uffff\1\65",
            "\1\67\1\66",
            "\1\32\1\31",
            "\1\71\1\72",
            "\1\73",
            "\1\74\1\75",
            "\1\32\1\31",
            "\1\76\63\uffff\1\77",
            "\1\100\1\101",
            "\1\24\3\uffff\1\23",
            "\1\102",
            "\1\103\1\105\1\104",
            "\1\105\1\104",
            "\1\106",
            "\1\107\1\64\1\63",
            "\1\64\1\63",
            "\1\65",
            "\1\110\1\67\1\66",
            "\1\112\1\67\1\66\30\uffff\1\111",
            "\1\67\1\66",
            "\1\113",
            "\1\114",
            "\1\115\1\116",
            "\1\32\1\31",
            "\1\64\1\63",
            "\1\117",
            "\1\120\1\121",
            "\1\122\63\uffff\1\123",
            "\1\124",
            "\1\67\1\66",
            "\1\125",
            "\1\126\1\105\1\104",
            "\1\105\1\104",
            "\1\127",
            "\1\132\1\131\1\130",
            "\1\131\1\130",
            "\1\111",
            "\1\133\1\67\1\66",
            "\1\134",
            "\1\105\1\104",
            "\1\135",
            "\1\64\1\63",
            "\1\136\1\137",
            "\1\67\1\66",
            "\1\140",
            "\1\141\1\142",
            "\1\67\1\66",
            "\1\143",
            "\1\144\1\131\1\130",
            "\1\131\1\130",
            "\1\145",
            "\1\146\1\150\1\147",
            "\1\150\1\147",
            "\1\105\1\104",
            "\1\151",
            "\1\131\1\130",
            "\1\152",
            "\1\153\1\154",
            "\1\67\1\66",
            "\1\155",
            "\1\156",
            "\1\157\1\150\1\147",
            "\1\150\1\147",
            "\1\131\1\130",
            "\1\150\1\147",
            "\1\160",
            "\1\161",
            "\1\150\1\147"
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA54 extends DFA {

        public DFA54(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 54;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 7407:7: ( ( rule__Document__AppendersAssignment_1_1 )=> rule__Document__AppendersAssignment_1_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA54_5 = input.LA(1);

                         
                        int index54_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMoniLog4DSL()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA54_20 = input.LA(1);

                         
                        int index54_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMoniLog4DSL()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index54_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 54, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\u00d0\uffff";
    static final String dfa_42s = "\1\1\u00cf\uffff";
    static final String dfa_43s = "\1\13\1\uffff\1\13\1\4\1\32\1\4\1\15\1\42\1\35\7\45\2\4\2\32\1\43\1\35\2\32\2\4\1\34\1\33\1\34\1\33\1\5\1\4\1\43\1\4\1\5\1\4\1\33\1\35\1\34\2\33\1\67\3\33\1\35\1\34\1\33\1\0\1\33\1\5\4\4\1\33\1\4\1\5\1\uffff\1\35\1\34\1\35\1\34\1\35\1\34\1\35\1\33\1\67\3\33\1\35\1\33\1\4\1\33\1\5\2\4\1\33\1\5\1\4\1\33\1\5\4\4\1\33\1\34\2\35\1\34\1\67\1\34\2\35\1\34\2\35\1\34\1\35\1\34\1\35\1\34\1\35\1\5\1\35\2\4\1\5\1\35\1\5\1\35\1\4\1\5\1\4\1\33\1\5\1\4\1\33\1\4\1\33\1\5\1\35\1\34\1\35\1\67\1\34\2\35\1\34\1\67\1\35\1\34\2\35\1\34\1\35\1\34\3\35\1\4\1\35\1\5\1\4\2\35\1\4\1\35\1\5\1\4\1\35\2\5\1\35\1\34\2\35\1\34\1\35\1\34\2\35\1\67\1\34\2\35\1\5\1\35\1\4\1\35\1\5\1\4\1\35\1\5\1\35\1\4\3\35\1\34\2\35\1\34\2\35\1\34\2\35\1\5\1\35\1\5\1\35\1\5\1\4\4\35\1\34\4\35\1\5\2\35";
    static final String dfa_44s = "\1\51\1\uffff\1\41\1\4\1\44\1\4\1\23\1\42\1\36\7\45\2\4\1\44\1\32\1\46\1\36\2\32\2\5\1\34\1\37\1\67\1\37\2\5\1\43\1\73\2\5\1\33\1\35\1\34\2\37\1\67\3\37\1\35\1\67\1\37\1\0\1\37\2\5\1\70\2\5\1\37\1\73\1\5\1\uffff\1\35\2\36\1\67\3\36\1\37\1\67\3\37\1\35\1\37\1\5\1\37\1\5\1\70\1\5\1\37\2\5\1\37\2\5\1\70\2\5\1\37\2\36\1\35\1\36\2\67\1\36\1\35\2\36\1\35\1\67\5\36\1\5\1\36\1\5\1\70\1\5\1\36\1\5\1\36\1\70\2\5\1\37\2\5\1\37\1\5\1\37\1\5\1\35\2\36\1\67\1\36\2\35\1\36\1\67\1\35\1\67\1\36\1\35\4\36\1\35\1\36\1\5\1\36\2\5\2\36\1\5\1\36\1\5\1\70\1\36\2\5\3\36\1\35\4\36\1\35\1\67\1\36\2\35\1\5\1\36\1\5\1\36\2\5\1\36\1\5\1\36\1\5\2\36\1\35\2\36\1\35\2\36\1\35\3\36\1\5\1\36\1\5\1\36\2\5\1\36\3\35\5\36\1\5\1\35\1\36";
    static final String dfa_45s = "\1\uffff\1\2\70\uffff\1\1\u0095\uffff";
    static final String dfa_46s = "\60\uffff\1\0\u009f\uffff}>";
    static final String[] dfa_47s = {
            "\1\2\1\1\14\uffff\1\1\6\uffff\1\1\1\3\5\uffff\3\1",
            "",
            "\1\2\25\uffff\1\3",
            "\1\4",
            "\1\7\1\uffff\1\5\7\uffff\1\6",
            "\1\10",
            "\1\11\1\12\1\13\1\14\1\15\1\16\1\17",
            "\1\20",
            "\1\22\1\21",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\7\11\uffff\1\6",
            "\1\7",
            "\1\27\2\uffff\1\26",
            "\1\22\1\21",
            "\1\30",
            "\1\31",
            "\1\32\1\33",
            "\1\34\1\35",
            "\1\36",
            "\1\40\3\uffff\1\37",
            "\1\42\32\uffff\1\41",
            "\1\44\3\uffff\1\43",
            "\1\45",
            "\1\46\1\47",
            "\1\27",
            "\1\51\63\uffff\1\52\1\54\1\50\1\53",
            "\1\55",
            "\1\56\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\40\3\uffff\1\37",
            "\1\44\1\63\2\uffff\1\43",
            "\1\64",
            "\1\44\1\65\2\uffff\1\43",
            "\1\44\3\uffff\1\43",
            "\1\44\1\66\2\uffff\1\43",
            "\1\67",
            "\1\71\32\uffff\1\70",
            "\1\44\3\uffff\1\43",
            "\1\uffff",
            "\1\40\3\uffff\1\37",
            "\1\73",
            "\1\74\1\75",
            "\1\51\63\uffff\1\52",
            "\1\76\1\77",
            "\1\100\1\101",
            "\1\44\3\uffff\1\43",
            "\1\103\63\uffff\1\102\1\104\1\106\1\105",
            "\1\107",
            "",
            "\1\110",
            "\1\113\1\112\1\111",
            "\1\112\1\111",
            "\1\117\1\116\1\115\30\uffff\1\114",
            "\1\116\1\115",
            "\1\122\1\121\1\120",
            "\1\121\1\120",
            "\1\44\1\123\2\uffff\1\43",
            "\1\124",
            "\1\44\1\125\2\uffff\1\43",
            "\1\44\3\uffff\1\43",
            "\1\44\1\126\2\uffff\1\43",
            "\1\127",
            "\1\40\3\uffff\1\37",
            "\1\130\1\131",
            "\1\44\3\uffff\1\43",
            "\1\132",
            "\1\134\63\uffff\1\133",
            "\1\135\1\136",
            "\1\44\3\uffff\1\43",
            "\1\137",
            "\1\140\1\141",
            "\1\44\3\uffff\1\43",
            "\1\142",
            "\1\143\1\144",
            "\1\103\63\uffff\1\102",
            "\1\145\1\146",
            "\1\147\1\150",
            "\1\44\3\uffff\1\43",
            "\1\151\1\112\1\111",
            "\1\112\1\111",
            "\1\152",
            "\1\153\1\116\1\115",
            "\1\114",
            "\1\155\1\116\1\115\30\uffff\1\154",
            "\1\116\1\115",
            "\1\156",
            "\1\157\1\121\1\120",
            "\1\121\1\120",
            "\1\160",
            "\1\162\1\164\1\163\30\uffff\1\161",
            "\1\164\1\163",
            "\1\165\1\167\1\166",
            "\1\167\1\166",
            "\1\172\1\171\1\170",
            "\1\171\1\170",
            "\1\173",
            "\1\112\1\111",
            "\1\174\1\175",
            "\1\176\63\uffff\1\177",
            "\1\u0080",
            "\1\116\1\115",
            "\1\u0081",
            "\1\121\1\120",
            "\1\u0083\63\uffff\1\u0082",
            "\1\u0084",
            "\1\u0085\1\u0086",
            "\1\44\3\uffff\1\43",
            "\1\u0087",
            "\1\u0088\1\u0089",
            "\1\44\3\uffff\1\43",
            "\1\u008a\1\u008b",
            "\1\44\3\uffff\1\43",
            "\1\u008c",
            "\1\u008d",
            "\1\u0090\1\u008f\1\u008e",
            "\1\u008f\1\u008e",
            "\1\154",
            "\1\u0091\1\116\1\115",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094\1\164\1\163",
            "\1\161",
            "\1\u0095",
            "\1\u0096\1\164\1\163\30\uffff\1\u0097",
            "\1\164\1\163",
            "\1\u0098",
            "\1\u0099\1\167\1\166",
            "\1\167\1\166",
            "\1\u009a\1\171\1\170",
            "\1\171\1\170",
            "\1\u009b",
            "\1\112\1\111",
            "\1\u009c\1\u009d",
            "\1\116\1\115",
            "\1\u009e",
            "\1\u009f\1\u00a0",
            "\1\116\1\115",
            "\1\121\1\120",
            "\1\u00a1\1\u00a2",
            "\1\164\1\163",
            "\1\u00a3",
            "\1\u00a4\63\uffff\1\u00a5",
            "\1\167\1\166",
            "\1\u00a6",
            "\1\u00a7",
            "\1\171\1\170",
            "\1\u00a8\1\u008f\1\u008e",
            "\1\u008f\1\u008e",
            "\1\u00a9",
            "\1\u00ac\1\u00ab\1\u00aa",
            "\1\u00ab\1\u00aa",
            "\1\u00af\1\u00ae\1\u00ad",
            "\1\u00ae\1\u00ad",
            "\1\u00b0",
            "\1\u0097",
            "\1\u00b1\1\164\1\163",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u008f\1\u008e",
            "\1\u00b5\1\u00b6",
            "\1\116\1\115",
            "\1\u00b7",
            "\1\u00b8\1\u00b9",
            "\1\164\1\163",
            "\1\u00ba",
            "\1\164\1\163",
            "\1\u00bb\1\u00bc",
            "\1\167\1\166",
            "\1\171\1\170",
            "\1\u00bd",
            "\1\u00be\1\u00ab\1\u00aa",
            "\1\u00ab\1\u00aa",
            "\1\u00bf",
            "\1\u00c0\1\u00ae\1\u00ad",
            "\1\u00ae\1\u00ad",
            "\1\u00c1",
            "\1\u00c2\1\u00c4\1\u00c3",
            "\1\u00c4\1\u00c3",
            "\1\u008f\1\u008e",
            "\1\u00c5",
            "\1\u00ab\1\u00aa",
            "\1\u00c6",
            "\1\u00ae\1\u00ad",
            "\1\u00c7",
            "\1\u00c8\1\u00c9",
            "\1\164\1\163",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd\1\u00c4\1\u00c3",
            "\1\u00c4\1\u00c3",
            "\1\u00ab\1\u00aa",
            "\1\u00ae\1\u00ad",
            "\1\u00c4\1\u00c3",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00c4\1\u00c3"
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_41;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "()* loopback of 7451:7: ( ( rule__Document__MoniLogSpecsAssignment_1_3 )=> rule__Document__MoniLogSpecsAssignment_1_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_48 = input.LA(1);

                         
                        int index56_48 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMoniLog4DSL()) ) {s = 58;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_48);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000038302001800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000088000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001014000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000004800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000C000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00019C0000000050L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0001840000000050L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000002040000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000038000000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000038302001802L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x000C000000000002L});

}
