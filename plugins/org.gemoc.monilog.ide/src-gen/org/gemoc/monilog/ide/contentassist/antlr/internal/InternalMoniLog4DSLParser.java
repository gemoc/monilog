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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@Inactive'", "'@Async'", "'INFO'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'", "'package'", "'import'", "'appender'", "'{'", "'}'", "'('", "')'", "';'", "'layout'", "','", "'...'", "'monilogger'", "'event'", "'actions'", "'['", "']'", "'conditions'", "'call'", "'complex'", "'custom'", "'before'", "'after'", "'exists'", "'always'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'.'", "'emit'", "'set'", "'start'", "'stop'", "'='", "'.*'"
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


    // $ANTLR start "entryRuleImport"
    // InternalMoniLog4DSL.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:79:1: ( ruleImport EOF )
            // InternalMoniLog4DSL.g:80:1: ruleImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportRule()); 
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
    // $ANTLR end "entryRuleImport"


    // $ANTLR start "ruleImport"
    // InternalMoniLog4DSL.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMoniLog4DSL.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalMoniLog4DSL.g:93:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:94:3: ( rule__Import__Group__0 )
            // InternalMoniLog4DSL.g:94:4: rule__Import__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleImport"


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog4DSL.g:103:1: entryRuleAppender : ruleAppender EOF ;
    public final void entryRuleAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:104:1: ( ruleAppender EOF )
            // InternalMoniLog4DSL.g:105:1: ruleAppender EOF
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
    // InternalMoniLog4DSL.g:112:1: ruleAppender : ( ( rule__Appender__Alternatives ) ) ;
    public final void ruleAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:116:2: ( ( ( rule__Appender__Alternatives ) ) )
            // InternalMoniLog4DSL.g:117:2: ( ( rule__Appender__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:117:2: ( ( rule__Appender__Alternatives ) )
            // InternalMoniLog4DSL.g:118:3: ( rule__Appender__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:119:3: ( rule__Appender__Alternatives )
            // InternalMoniLog4DSL.g:119:4: rule__Appender__Alternatives
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
    // InternalMoniLog4DSL.g:128:1: entryRuleLocalAppender : ruleLocalAppender EOF ;
    public final void entryRuleLocalAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:129:1: ( ruleLocalAppender EOF )
            // InternalMoniLog4DSL.g:130:1: ruleLocalAppender EOF
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
    // InternalMoniLog4DSL.g:137:1: ruleLocalAppender : ( ( rule__LocalAppender__Group__0 ) ) ;
    public final void ruleLocalAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:141:2: ( ( ( rule__LocalAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:142:2: ( ( rule__LocalAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:142:2: ( ( rule__LocalAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:143:3: ( rule__LocalAppender__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:144:3: ( rule__LocalAppender__Group__0 )
            // InternalMoniLog4DSL.g:144:4: rule__LocalAppender__Group__0
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
    // InternalMoniLog4DSL.g:153:1: entryRuleExternalAppender : ruleExternalAppender EOF ;
    public final void entryRuleExternalAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:154:1: ( ruleExternalAppender EOF )
            // InternalMoniLog4DSL.g:155:1: ruleExternalAppender EOF
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
    // InternalMoniLog4DSL.g:162:1: ruleExternalAppender : ( ( rule__ExternalAppender__Group__0 ) ) ;
    public final void ruleExternalAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:166:2: ( ( ( rule__ExternalAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:167:2: ( ( rule__ExternalAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:167:2: ( ( rule__ExternalAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:168:3: ( rule__ExternalAppender__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:169:3: ( rule__ExternalAppender__Group__0 )
            // InternalMoniLog4DSL.g:169:4: rule__ExternalAppender__Group__0
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
    // InternalMoniLog4DSL.g:178:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:179:1: ( ruleLayout EOF )
            // InternalMoniLog4DSL.g:180:1: ruleLayout EOF
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
    // InternalMoniLog4DSL.g:187:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:191:2: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalMoniLog4DSL.g:192:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:192:2: ( ( rule__Layout__Alternatives ) )
            // InternalMoniLog4DSL.g:193:3: ( rule__Layout__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:194:3: ( rule__Layout__Alternatives )
            // InternalMoniLog4DSL.g:194:4: rule__Layout__Alternatives
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
    // InternalMoniLog4DSL.g:203:1: entryRuleLocalLayout : ruleLocalLayout EOF ;
    public final void entryRuleLocalLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:204:1: ( ruleLocalLayout EOF )
            // InternalMoniLog4DSL.g:205:1: ruleLocalLayout EOF
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
    // InternalMoniLog4DSL.g:212:1: ruleLocalLayout : ( ( rule__LocalLayout__Group__0 ) ) ;
    public final void ruleLocalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:216:2: ( ( ( rule__LocalLayout__Group__0 ) ) )
            // InternalMoniLog4DSL.g:217:2: ( ( rule__LocalLayout__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:217:2: ( ( rule__LocalLayout__Group__0 ) )
            // InternalMoniLog4DSL.g:218:3: ( rule__LocalLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:219:3: ( rule__LocalLayout__Group__0 )
            // InternalMoniLog4DSL.g:219:4: rule__LocalLayout__Group__0
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
    // InternalMoniLog4DSL.g:228:1: entryRuleExternalLayout : ruleExternalLayout EOF ;
    public final void entryRuleExternalLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:229:1: ( ruleExternalLayout EOF )
            // InternalMoniLog4DSL.g:230:1: ruleExternalLayout EOF
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
    // InternalMoniLog4DSL.g:237:1: ruleExternalLayout : ( ( rule__ExternalLayout__Group__0 ) ) ;
    public final void ruleExternalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:241:2: ( ( ( rule__ExternalLayout__Group__0 ) ) )
            // InternalMoniLog4DSL.g:242:2: ( ( rule__ExternalLayout__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:242:2: ( ( rule__ExternalLayout__Group__0 ) )
            // InternalMoniLog4DSL.g:243:3: ( rule__ExternalLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:244:3: ( rule__ExternalLayout__Group__0 )
            // InternalMoniLog4DSL.g:244:4: rule__ExternalLayout__Group__0
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


    // $ANTLR start "entryRuleParameterDeclVarArgs"
    // InternalMoniLog4DSL.g:253:1: entryRuleParameterDeclVarArgs : ruleParameterDeclVarArgs EOF ;
    public final void entryRuleParameterDeclVarArgs() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:254:1: ( ruleParameterDeclVarArgs EOF )
            // InternalMoniLog4DSL.g:255:1: ruleParameterDeclVarArgs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsRule()); 
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
    // $ANTLR end "entryRuleParameterDeclVarArgs"


    // $ANTLR start "ruleParameterDeclVarArgs"
    // InternalMoniLog4DSL.g:262:1: ruleParameterDeclVarArgs : ( ( rule__ParameterDeclVarArgs__Group__0 ) ) ;
    public final void ruleParameterDeclVarArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:266:2: ( ( ( rule__ParameterDeclVarArgs__Group__0 ) ) )
            // InternalMoniLog4DSL.g:267:2: ( ( rule__ParameterDeclVarArgs__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:267:2: ( ( rule__ParameterDeclVarArgs__Group__0 ) )
            // InternalMoniLog4DSL.g:268:3: ( rule__ParameterDeclVarArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:269:3: ( rule__ParameterDeclVarArgs__Group__0 )
            // InternalMoniLog4DSL.g:269:4: rule__ParameterDeclVarArgs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDeclVarArgs"


    // $ANTLR start "entryRuleParameterDeclNoVarArgs"
    // InternalMoniLog4DSL.g:278:1: entryRuleParameterDeclNoVarArgs : ruleParameterDeclNoVarArgs EOF ;
    public final void entryRuleParameterDeclNoVarArgs() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:279:1: ( ruleParameterDeclNoVarArgs EOF )
            // InternalMoniLog4DSL.g:280:1: ruleParameterDeclNoVarArgs EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleParameterDeclNoVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsRule()); 
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
    // $ANTLR end "entryRuleParameterDeclNoVarArgs"


    // $ANTLR start "ruleParameterDeclNoVarArgs"
    // InternalMoniLog4DSL.g:287:1: ruleParameterDeclNoVarArgs : ( ( rule__ParameterDeclNoVarArgs__Group__0 ) ) ;
    public final void ruleParameterDeclNoVarArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:291:2: ( ( ( rule__ParameterDeclNoVarArgs__Group__0 ) ) )
            // InternalMoniLog4DSL.g:292:2: ( ( rule__ParameterDeclNoVarArgs__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:292:2: ( ( rule__ParameterDeclNoVarArgs__Group__0 ) )
            // InternalMoniLog4DSL.g:293:3: ( rule__ParameterDeclNoVarArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:294:3: ( rule__ParameterDeclNoVarArgs__Group__0 )
            // InternalMoniLog4DSL.g:294:4: rule__ParameterDeclNoVarArgs__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParameterDeclNoVarArgs"


    // $ANTLR start "entryRuleMoniLogger"
    // InternalMoniLog4DSL.g:303:1: entryRuleMoniLogger : ruleMoniLogger EOF ;
    public final void entryRuleMoniLogger() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:304:1: ( ruleMoniLogger EOF )
            // InternalMoniLog4DSL.g:305:1: ruleMoniLogger EOF
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
    // InternalMoniLog4DSL.g:312:1: ruleMoniLogger : ( ( rule__MoniLogger__Group__0 ) ) ;
    public final void ruleMoniLogger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:316:2: ( ( ( rule__MoniLogger__Group__0 ) ) )
            // InternalMoniLog4DSL.g:317:2: ( ( rule__MoniLogger__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:317:2: ( ( rule__MoniLogger__Group__0 ) )
            // InternalMoniLog4DSL.g:318:3: ( rule__MoniLogger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:319:3: ( rule__MoniLogger__Group__0 )
            // InternalMoniLog4DSL.g:319:4: rule__MoniLogger__Group__0
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
    // InternalMoniLog4DSL.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:329:1: ( ruleParameter EOF )
            // InternalMoniLog4DSL.g:330:1: ruleParameter EOF
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
    // InternalMoniLog4DSL.g:337:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:341:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalMoniLog4DSL.g:342:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalMoniLog4DSL.g:342:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalMoniLog4DSL.g:343:3: ( rule__Parameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment()); 
            }
            // InternalMoniLog4DSL.g:344:3: ( rule__Parameter__NameAssignment )
            // InternalMoniLog4DSL.g:344:4: rule__Parameter__NameAssignment
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
    // InternalMoniLog4DSL.g:353:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:354:1: ( ruleEvent EOF )
            // InternalMoniLog4DSL.g:355:1: ruleEvent EOF
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
    // InternalMoniLog4DSL.g:362:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:366:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalMoniLog4DSL.g:367:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:367:2: ( ( rule__Event__Alternatives ) )
            // InternalMoniLog4DSL.g:368:3: ( rule__Event__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:369:3: ( rule__Event__Alternatives )
            // InternalMoniLog4DSL.g:369:4: rule__Event__Alternatives
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


    // $ANTLR start "entryRuleASTEventKind"
    // InternalMoniLog4DSL.g:378:1: entryRuleASTEventKind : ruleASTEventKind EOF ;
    public final void entryRuleASTEventKind() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:379:1: ( ruleASTEventKind EOF )
            // InternalMoniLog4DSL.g:380:1: ruleASTEventKind EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleASTEventKind();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventKindRule()); 
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
    // $ANTLR end "entryRuleASTEventKind"


    // $ANTLR start "ruleASTEventKind"
    // InternalMoniLog4DSL.g:387:1: ruleASTEventKind : ( ( rule__ASTEventKind__Alternatives ) ) ;
    public final void ruleASTEventKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:391:2: ( ( ( rule__ASTEventKind__Alternatives ) ) )
            // InternalMoniLog4DSL.g:392:2: ( ( rule__ASTEventKind__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:392:2: ( ( rule__ASTEventKind__Alternatives ) )
            // InternalMoniLog4DSL.g:393:3: ( rule__ASTEventKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:394:3: ( rule__ASTEventKind__Alternatives )
            // InternalMoniLog4DSL.g:394:4: rule__ASTEventKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ASTEventKind__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventKindAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleASTEventKind"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog4DSL.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:404:1: ( ruleCondition EOF )
            // InternalMoniLog4DSL.g:405:1: ruleCondition EOF
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
    // InternalMoniLog4DSL.g:412:1: ruleCondition : ( ( rule__Condition__ExpressionAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:416:2: ( ( ( rule__Condition__ExpressionAssignment ) ) )
            // InternalMoniLog4DSL.g:417:2: ( ( rule__Condition__ExpressionAssignment ) )
            {
            // InternalMoniLog4DSL.g:417:2: ( ( rule__Condition__ExpressionAssignment ) )
            // InternalMoniLog4DSL.g:418:3: ( rule__Condition__ExpressionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionAssignment()); 
            }
            // InternalMoniLog4DSL.g:419:3: ( rule__Condition__ExpressionAssignment )
            // InternalMoniLog4DSL.g:419:4: rule__Condition__ExpressionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionAssignment()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:428:1: entryRuleTemporalPattern : ruleTemporalPattern EOF ;
    public final void entryRuleTemporalPattern() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:429:1: ( ruleTemporalPattern EOF )
            // InternalMoniLog4DSL.g:430:1: ruleTemporalPattern EOF
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
    // InternalMoniLog4DSL.g:437:1: ruleTemporalPattern : ( ( rule__TemporalPattern__Group__0 ) ) ;
    public final void ruleTemporalPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:441:2: ( ( ( rule__TemporalPattern__Group__0 ) ) )
            // InternalMoniLog4DSL.g:442:2: ( ( rule__TemporalPattern__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:442:2: ( ( rule__TemporalPattern__Group__0 ) )
            // InternalMoniLog4DSL.g:443:3: ( rule__TemporalPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:444:3: ( rule__TemporalPattern__Group__0 )
            // InternalMoniLog4DSL.g:444:4: rule__TemporalPattern__Group__0
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
    // InternalMoniLog4DSL.g:453:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:454:1: ( rulePattern EOF )
            // InternalMoniLog4DSL.g:455:1: rulePattern EOF
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
    // InternalMoniLog4DSL.g:462:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:466:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalMoniLog4DSL.g:467:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:467:2: ( ( rule__Pattern__Alternatives ) )
            // InternalMoniLog4DSL.g:468:3: ( rule__Pattern__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:469:3: ( rule__Pattern__Alternatives )
            // InternalMoniLog4DSL.g:469:4: rule__Pattern__Alternatives
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
    // InternalMoniLog4DSL.g:478:1: entryRuleBoundType : ruleBoundType EOF ;
    public final void entryRuleBoundType() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:479:1: ( ruleBoundType EOF )
            // InternalMoniLog4DSL.g:480:1: ruleBoundType EOF
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
    // InternalMoniLog4DSL.g:487:1: ruleBoundType : ( ( rule__BoundType__Alternatives ) ) ;
    public final void ruleBoundType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:491:2: ( ( ( rule__BoundType__Alternatives ) ) )
            // InternalMoniLog4DSL.g:492:2: ( ( rule__BoundType__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:492:2: ( ( rule__BoundType__Alternatives ) )
            // InternalMoniLog4DSL.g:493:3: ( rule__BoundType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundTypeAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:494:3: ( rule__BoundType__Alternatives )
            // InternalMoniLog4DSL.g:494:4: rule__BoundType__Alternatives
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
    // InternalMoniLog4DSL.g:503:1: entryRuleExactBound : ruleExactBound EOF ;
    public final void entryRuleExactBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:504:1: ( ruleExactBound EOF )
            // InternalMoniLog4DSL.g:505:1: ruleExactBound EOF
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
    // InternalMoniLog4DSL.g:512:1: ruleExactBound : ( ( rule__ExactBound__NAssignment ) ) ;
    public final void ruleExactBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:516:2: ( ( ( rule__ExactBound__NAssignment ) ) )
            // InternalMoniLog4DSL.g:517:2: ( ( rule__ExactBound__NAssignment ) )
            {
            // InternalMoniLog4DSL.g:517:2: ( ( rule__ExactBound__NAssignment ) )
            // InternalMoniLog4DSL.g:518:3: ( rule__ExactBound__NAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExactBoundAccess().getNAssignment()); 
            }
            // InternalMoniLog4DSL.g:519:3: ( rule__ExactBound__NAssignment )
            // InternalMoniLog4DSL.g:519:4: rule__ExactBound__NAssignment
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
    // InternalMoniLog4DSL.g:528:1: entryRuleLowerBound : ruleLowerBound EOF ;
    public final void entryRuleLowerBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:529:1: ( ruleLowerBound EOF )
            // InternalMoniLog4DSL.g:530:1: ruleLowerBound EOF
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
    // InternalMoniLog4DSL.g:537:1: ruleLowerBound : ( ( rule__LowerBound__Group__0 ) ) ;
    public final void ruleLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:541:2: ( ( ( rule__LowerBound__Group__0 ) ) )
            // InternalMoniLog4DSL.g:542:2: ( ( rule__LowerBound__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:542:2: ( ( rule__LowerBound__Group__0 ) )
            // InternalMoniLog4DSL.g:543:3: ( rule__LowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:544:3: ( rule__LowerBound__Group__0 )
            // InternalMoniLog4DSL.g:544:4: rule__LowerBound__Group__0
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
    // InternalMoniLog4DSL.g:553:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:554:1: ( ruleUpperBound EOF )
            // InternalMoniLog4DSL.g:555:1: ruleUpperBound EOF
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
    // InternalMoniLog4DSL.g:562:1: ruleUpperBound : ( ( rule__UpperBound__Group__0 ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:566:2: ( ( ( rule__UpperBound__Group__0 ) ) )
            // InternalMoniLog4DSL.g:567:2: ( ( rule__UpperBound__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:567:2: ( ( rule__UpperBound__Group__0 ) )
            // InternalMoniLog4DSL.g:568:3: ( rule__UpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:569:3: ( rule__UpperBound__Group__0 )
            // InternalMoniLog4DSL.g:569:4: rule__UpperBound__Group__0
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
    // InternalMoniLog4DSL.g:578:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:579:1: ( ruleScope EOF )
            // InternalMoniLog4DSL.g:580:1: ruleScope EOF
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
    // InternalMoniLog4DSL.g:587:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:591:2: ( ( ( rule__Scope__Alternatives ) ) )
            // InternalMoniLog4DSL.g:592:2: ( ( rule__Scope__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:592:2: ( ( rule__Scope__Alternatives ) )
            // InternalMoniLog4DSL.g:593:3: ( rule__Scope__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:594:3: ( rule__Scope__Alternatives )
            // InternalMoniLog4DSL.g:594:4: rule__Scope__Alternatives
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
    // InternalMoniLog4DSL.g:603:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:604:1: ( ruleAction EOF )
            // InternalMoniLog4DSL.g:605:1: ruleAction EOF
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
    // InternalMoniLog4DSL.g:612:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:616:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMoniLog4DSL.g:617:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:617:2: ( ( rule__Action__Alternatives ) )
            // InternalMoniLog4DSL.g:618:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:619:3: ( rule__Action__Alternatives )
            // InternalMoniLog4DSL.g:619:4: rule__Action__Alternatives
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
    // InternalMoniLog4DSL.g:628:1: entryRuleAppenderCall : ruleAppenderCall EOF ;
    public final void entryRuleAppenderCall() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:629:1: ( ruleAppenderCall EOF )
            // InternalMoniLog4DSL.g:630:1: ruleAppenderCall EOF
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
    // InternalMoniLog4DSL.g:637:1: ruleAppenderCall : ( ( rule__AppenderCall__Group__0 ) ) ;
    public final void ruleAppenderCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:641:2: ( ( ( rule__AppenderCall__Group__0 ) ) )
            // InternalMoniLog4DSL.g:642:2: ( ( rule__AppenderCall__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:642:2: ( ( rule__AppenderCall__Group__0 ) )
            // InternalMoniLog4DSL.g:643:3: ( rule__AppenderCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:644:3: ( rule__AppenderCall__Group__0 )
            // InternalMoniLog4DSL.g:644:4: rule__AppenderCall__Group__0
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


    // $ANTLR start "entryRuleLayoutCallArgument"
    // InternalMoniLog4DSL.g:703:1: entryRuleLayoutCallArgument : ruleLayoutCallArgument EOF ;
    public final void entryRuleLayoutCallArgument() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:704:1: ( ruleLayoutCallArgument EOF )
            // InternalMoniLog4DSL.g:705:1: ruleLayoutCallArgument EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallArgumentRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleLayoutCallArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallArgumentRule()); 
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
    // $ANTLR end "entryRuleLayoutCallArgument"


    // $ANTLR start "ruleLayoutCallArgument"
    // InternalMoniLog4DSL.g:712:1: ruleLayoutCallArgument : ( ruleExpression ) ;
    public final void ruleLayoutCallArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:716:2: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:717:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:717:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:718:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallArgumentAccess().getExpressionParserRuleCall()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallArgumentAccess().getExpressionParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLayoutCallArgument"


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


    // $ANTLR start "entryRuleSetVariable"
    // InternalMoniLog4DSL.g:753:1: entryRuleSetVariable : ruleSetVariable EOF ;
    public final void entryRuleSetVariable() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:754:1: ( ruleSetVariable EOF )
            // InternalMoniLog4DSL.g:755:1: ruleSetVariable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleSetVariable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableRule()); 
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
    // $ANTLR end "entryRuleSetVariable"


    // $ANTLR start "ruleSetVariable"
    // InternalMoniLog4DSL.g:762:1: ruleSetVariable : ( ( rule__SetVariable__Group__0 ) ) ;
    public final void ruleSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:766:2: ( ( ( rule__SetVariable__Group__0 ) ) )
            // InternalMoniLog4DSL.g:767:2: ( ( rule__SetVariable__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:767:2: ( ( rule__SetVariable__Group__0 ) )
            // InternalMoniLog4DSL.g:768:3: ( rule__SetVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:769:3: ( rule__SetVariable__Group__0 )
            // InternalMoniLog4DSL.g:769:4: rule__SetVariable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSetVariable"


    // $ANTLR start "entryRuleMoniloggerCall"
    // InternalMoniLog4DSL.g:778:1: entryRuleMoniloggerCall : ruleMoniloggerCall EOF ;
    public final void entryRuleMoniloggerCall() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:779:1: ( ruleMoniloggerCall EOF )
            // InternalMoniLog4DSL.g:780:1: ruleMoniloggerCall EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleMoniloggerCall();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallRule()); 
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
    // $ANTLR end "entryRuleMoniloggerCall"


    // $ANTLR start "ruleMoniloggerCall"
    // InternalMoniLog4DSL.g:787:1: ruleMoniloggerCall : ( ( rule__MoniloggerCall__Alternatives ) ) ;
    public final void ruleMoniloggerCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:791:2: ( ( ( rule__MoniloggerCall__Alternatives ) ) )
            // InternalMoniLog4DSL.g:792:2: ( ( rule__MoniloggerCall__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:792:2: ( ( rule__MoniloggerCall__Alternatives ) )
            // InternalMoniLog4DSL.g:793:3: ( rule__MoniloggerCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:794:3: ( rule__MoniloggerCall__Alternatives )
            // InternalMoniLog4DSL.g:794:4: rule__MoniloggerCall__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoniloggerCall"


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog4DSL.g:803:1: entryRuleStreamEvent : ruleStreamEvent EOF ;
    public final void entryRuleStreamEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:804:1: ( ruleStreamEvent EOF )
            // InternalMoniLog4DSL.g:805:1: ruleStreamEvent EOF
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
    // InternalMoniLog4DSL.g:812:1: ruleStreamEvent : ( ( rule__StreamEvent__Group__0 ) ) ;
    public final void ruleStreamEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:816:2: ( ( ( rule__StreamEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:817:2: ( ( rule__StreamEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:817:2: ( ( rule__StreamEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:818:3: ( rule__StreamEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:819:3: ( rule__StreamEvent__Group__0 )
            // InternalMoniLog4DSL.g:819:4: rule__StreamEvent__Group__0
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
    // InternalMoniLog4DSL.g:828:1: entryRuleEmptyOrPropertyValue : ruleEmptyOrPropertyValue EOF ;
    public final void entryRuleEmptyOrPropertyValue() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:829:1: ( ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog4DSL.g:830:1: ruleEmptyOrPropertyValue EOF
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
    // InternalMoniLog4DSL.g:837:1: ruleEmptyOrPropertyValue : ( ( rule__EmptyOrPropertyValue__Alternatives ) ) ;
    public final void ruleEmptyOrPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:841:2: ( ( ( rule__EmptyOrPropertyValue__Alternatives ) ) )
            // InternalMoniLog4DSL.g:842:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:842:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            // InternalMoniLog4DSL.g:843:3: ( rule__EmptyOrPropertyValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:844:3: ( rule__EmptyOrPropertyValue__Alternatives )
            // InternalMoniLog4DSL.g:844:4: rule__EmptyOrPropertyValue__Alternatives
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
    // InternalMoniLog4DSL.g:853:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:854:1: ( ruleExpression EOF )
            // InternalMoniLog4DSL.g:855:1: ruleExpression EOF
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
    // InternalMoniLog4DSL.g:862:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:866:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMoniLog4DSL.g:867:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:867:2: ( ( rule__Expression__Alternatives ) )
            // InternalMoniLog4DSL.g:868:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:869:3: ( rule__Expression__Alternatives )
            // InternalMoniLog4DSL.g:869:4: rule__Expression__Alternatives
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
    // InternalMoniLog4DSL.g:878:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:879:1: ( ruleParameterReference EOF )
            // InternalMoniLog4DSL.g:880:1: ruleParameterReference EOF
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
    // InternalMoniLog4DSL.g:887:1: ruleParameterReference : ( ( rule__ParameterReference__ParameterAssignment ) ) ;
    public final void ruleParameterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:891:2: ( ( ( rule__ParameterReference__ParameterAssignment ) ) )
            // InternalMoniLog4DSL.g:892:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            {
            // InternalMoniLog4DSL.g:892:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            // InternalMoniLog4DSL.g:893:3: ( rule__ParameterReference__ParameterAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 
            }
            // InternalMoniLog4DSL.g:894:3: ( rule__ParameterReference__ParameterAssignment )
            // InternalMoniLog4DSL.g:894:4: rule__ParameterReference__ParameterAssignment
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


    // $ANTLR start "entryRulePropertyValue"
    // InternalMoniLog4DSL.g:903:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:904:1: ( rulePropertyValue EOF )
            // InternalMoniLog4DSL.g:905:1: rulePropertyValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueRule()); 
            }
            pushFollow(FOLLOW_1);
            rulePropertyValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueRule()); 
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
    // $ANTLR end "entryRulePropertyValue"


    // $ANTLR start "rulePropertyValue"
    // InternalMoniLog4DSL.g:912:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:916:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalMoniLog4DSL.g:917:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:917:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalMoniLog4DSL.g:918:3: ( rule__PropertyValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:919:3: ( rule__PropertyValue__Alternatives )
            // InternalMoniLog4DSL.g:919:4: rule__PropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyValue"


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog4DSL.g:928:1: entryRuleLanguageExpression : ruleLanguageExpression EOF ;
    public final void entryRuleLanguageExpression() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:929:1: ( ruleLanguageExpression EOF )
            // InternalMoniLog4DSL.g:930:1: ruleLanguageExpression EOF
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
    // InternalMoniLog4DSL.g:937:1: ruleLanguageExpression : ( ( rule__LanguageExpression__Group__0 ) ) ;
    public final void ruleLanguageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:941:2: ( ( ( rule__LanguageExpression__Group__0 ) ) )
            // InternalMoniLog4DSL.g:942:2: ( ( rule__LanguageExpression__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:942:2: ( ( rule__LanguageExpression__Group__0 ) )
            // InternalMoniLog4DSL.g:943:3: ( rule__LanguageExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:944:3: ( rule__LanguageExpression__Group__0 )
            // InternalMoniLog4DSL.g:944:4: rule__LanguageExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getGroup()); 
            }

            }


            }

        }
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMoniLog4DSL.g:953:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:954:1: ( ruleQualifiedName EOF )
            // InternalMoniLog4DSL.g:955:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMoniLog4DSL.g:962:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:966:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMoniLog4DSL.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMoniLog4DSL.g:968:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:969:3: ( rule__QualifiedName__Group__0 )
            // InternalMoniLog4DSL.g:969:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalMoniLog4DSL.g:978:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:979:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMoniLog4DSL.g:980:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalMoniLog4DSL.g:987:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:991:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMoniLog4DSL.g:992:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:992:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMoniLog4DSL.g:993:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMoniLog4DSL.g:994:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMoniLog4DSL.g:994:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "ruleMoniLoggerAnnotation"
    // InternalMoniLog4DSL.g:1003:1: ruleMoniLoggerAnnotation : ( ( '@Inactive' ) ) ;
    public final void ruleMoniLoggerAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1007:1: ( ( ( '@Inactive' ) ) )
            // InternalMoniLog4DSL.g:1008:2: ( ( '@Inactive' ) )
            {
            // InternalMoniLog4DSL.g:1008:2: ( ( '@Inactive' ) )
            // InternalMoniLog4DSL.g:1009:3: ( '@Inactive' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration()); 
            }
            // InternalMoniLog4DSL.g:1010:3: ( '@Inactive' )
            // InternalMoniLog4DSL.g:1010:4: '@Inactive'
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
    // InternalMoniLog4DSL.g:1019:1: ruleAppenderAnnotation : ( ( '@Async' ) ) ;
    public final void ruleAppenderAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1023:1: ( ( ( '@Async' ) ) )
            // InternalMoniLog4DSL.g:1024:2: ( ( '@Async' ) )
            {
            // InternalMoniLog4DSL.g:1024:2: ( ( '@Async' ) )
            // InternalMoniLog4DSL.g:1025:3: ( '@Async' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration()); 
            }
            // InternalMoniLog4DSL.g:1026:3: ( '@Async' )
            // InternalMoniLog4DSL.g:1026:4: '@Async'
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
    // InternalMoniLog4DSL.g:1035:1: ruleLogLevel : ( ( rule__LogLevel__Alternatives ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1039:1: ( ( ( rule__LogLevel__Alternatives ) ) )
            // InternalMoniLog4DSL.g:1040:2: ( ( rule__LogLevel__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:1040:2: ( ( rule__LogLevel__Alternatives ) )
            // InternalMoniLog4DSL.g:1041:3: ( rule__LogLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogLevelAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:1042:3: ( rule__LogLevel__Alternatives )
            // InternalMoniLog4DSL.g:1042:4: rule__LogLevel__Alternatives
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
    // InternalMoniLog4DSL.g:1051:1: ruleTemporalPatternKind : ( ( rule__TemporalPatternKind__Alternatives ) ) ;
    public final void ruleTemporalPatternKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1055:1: ( ( ( rule__TemporalPatternKind__Alternatives ) ) )
            // InternalMoniLog4DSL.g:1056:2: ( ( rule__TemporalPatternKind__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:1056:2: ( ( rule__TemporalPatternKind__Alternatives ) )
            // InternalMoniLog4DSL.g:1057:3: ( rule__TemporalPatternKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternKindAccess().getAlternatives()); 
            }
            // InternalMoniLog4DSL.g:1058:3: ( rule__TemporalPatternKind__Alternatives )
            // InternalMoniLog4DSL.g:1058:4: rule__TemporalPatternKind__Alternatives
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


    // $ANTLR start "rule__Appender__Alternatives"
    // InternalMoniLog4DSL.g:1066:1: rule__Appender__Alternatives : ( ( ruleLocalAppender ) | ( ruleExternalAppender ) );
    public final void rule__Appender__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1070:1: ( ( ruleLocalAppender ) | ( ruleExternalAppender ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMoniLog4DSL.g:1071:2: ( ruleLocalAppender )
                    {
                    // InternalMoniLog4DSL.g:1071:2: ( ruleLocalAppender )
                    // InternalMoniLog4DSL.g:1072:3: ruleLocalAppender
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
                    // InternalMoniLog4DSL.g:1077:2: ( ruleExternalAppender )
                    {
                    // InternalMoniLog4DSL.g:1077:2: ( ruleExternalAppender )
                    // InternalMoniLog4DSL.g:1078:3: ruleExternalAppender
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
    // InternalMoniLog4DSL.g:1087:1: rule__Layout__Alternatives : ( ( ruleLocalLayout ) | ( ruleExternalLayout ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1091:1: ( ( ruleLocalLayout ) | ( ruleExternalLayout ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMoniLog4DSL.g:1092:2: ( ruleLocalLayout )
                    {
                    // InternalMoniLog4DSL.g:1092:2: ( ruleLocalLayout )
                    // InternalMoniLog4DSL.g:1093:3: ruleLocalLayout
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
                    // InternalMoniLog4DSL.g:1098:2: ( ruleExternalLayout )
                    {
                    // InternalMoniLog4DSL.g:1098:2: ( ruleExternalLayout )
                    // InternalMoniLog4DSL.g:1099:3: ruleExternalLayout
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
    // InternalMoniLog4DSL.g:1108:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1112:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt3=1;
                }
                break;
            case 42:
                {
                alt3=2;
                }
                break;
            case 43:
                {
                alt3=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMoniLog4DSL.g:1113:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1113:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1114:3: ( rule__Event__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1115:3: ( rule__Event__Group_0__0 )
                    // InternalMoniLog4DSL.g:1115:4: rule__Event__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1119:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1119:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1120:3: ( rule__Event__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1121:3: ( rule__Event__Group_1__0 )
                    // InternalMoniLog4DSL.g:1121:4: rule__Event__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1125:2: ( ( rule__Event__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1125:2: ( ( rule__Event__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:1126:3: ( rule__Event__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_2()); 
                    }
                    // InternalMoniLog4DSL.g:1127:3: ( rule__Event__Group_2__0 )
                    // InternalMoniLog4DSL.g:1127:4: rule__Event__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEventAccess().getGroup_2()); 
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


    // $ANTLR start "rule__ASTEventKind__Alternatives"
    // InternalMoniLog4DSL.g:1135:1: rule__ASTEventKind__Alternatives : ( ( ( rule__ASTEventKind__Group_0__0 ) ) | ( ( rule__ASTEventKind__Group_1__0 ) ) );
    public final void rule__ASTEventKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1139:1: ( ( ( rule__ASTEventKind__Group_0__0 ) ) | ( ( rule__ASTEventKind__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==45) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoniLog4DSL.g:1140:2: ( ( rule__ASTEventKind__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1140:2: ( ( rule__ASTEventKind__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1141:3: ( rule__ASTEventKind__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASTEventKindAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1142:3: ( rule__ASTEventKind__Group_0__0 )
                    // InternalMoniLog4DSL.g:1142:4: rule__ASTEventKind__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ASTEventKind__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getASTEventKindAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1146:2: ( ( rule__ASTEventKind__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1146:2: ( ( rule__ASTEventKind__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1147:3: ( rule__ASTEventKind__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASTEventKindAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1148:3: ( rule__ASTEventKind__Group_1__0 )
                    // InternalMoniLog4DSL.g:1148:4: rule__ASTEventKind__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ASTEventKind__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getASTEventKindAccess().getGroup_1()); 
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
    // $ANTLR end "rule__ASTEventKind__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalMoniLog4DSL.g:1156:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1160:1: ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMoniLog4DSL.g:1161:2: ( ( rule__Pattern__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1161:2: ( ( rule__Pattern__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1162:3: ( rule__Pattern__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1163:3: ( rule__Pattern__Group_0__0 )
                    // InternalMoniLog4DSL.g:1163:4: rule__Pattern__Group_0__0
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
                    // InternalMoniLog4DSL.g:1167:2: ( ( rule__Pattern__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1167:2: ( ( rule__Pattern__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1168:3: ( rule__Pattern__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1169:3: ( rule__Pattern__Group_1__0 )
                    // InternalMoniLog4DSL.g:1169:4: rule__Pattern__Group_1__0
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
                    // InternalMoniLog4DSL.g:1173:2: ( ( rule__Pattern__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1173:2: ( ( rule__Pattern__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:1174:3: ( rule__Pattern__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_2()); 
                    }
                    // InternalMoniLog4DSL.g:1175:3: ( rule__Pattern__Group_2__0 )
                    // InternalMoniLog4DSL.g:1175:4: rule__Pattern__Group_2__0
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
                    // InternalMoniLog4DSL.g:1179:2: ( ( rule__Pattern__Group_3__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1179:2: ( ( rule__Pattern__Group_3__0 ) )
                    // InternalMoniLog4DSL.g:1180:3: ( rule__Pattern__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_3()); 
                    }
                    // InternalMoniLog4DSL.g:1181:3: ( rule__Pattern__Group_3__0 )
                    // InternalMoniLog4DSL.g:1181:4: rule__Pattern__Group_3__0
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
                    // InternalMoniLog4DSL.g:1185:2: ( ( rule__Pattern__Group_4__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1185:2: ( ( rule__Pattern__Group_4__0 ) )
                    // InternalMoniLog4DSL.g:1186:3: ( rule__Pattern__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_4()); 
                    }
                    // InternalMoniLog4DSL.g:1187:3: ( rule__Pattern__Group_4__0 )
                    // InternalMoniLog4DSL.g:1187:4: rule__Pattern__Group_4__0
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
    // InternalMoniLog4DSL.g:1195:1: rule__BoundType__Alternatives : ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) );
    public final void rule__BoundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1199:1: ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt6=1;
                }
                break;
            case 51:
                {
                alt6=2;
                }
                break;
            case 52:
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
                    // InternalMoniLog4DSL.g:1200:2: ( ruleExactBound )
                    {
                    // InternalMoniLog4DSL.g:1200:2: ( ruleExactBound )
                    // InternalMoniLog4DSL.g:1201:3: ruleExactBound
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
                    // InternalMoniLog4DSL.g:1206:2: ( ruleLowerBound )
                    {
                    // InternalMoniLog4DSL.g:1206:2: ( ruleLowerBound )
                    // InternalMoniLog4DSL.g:1207:3: ruleLowerBound
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
                    // InternalMoniLog4DSL.g:1212:2: ( ruleUpperBound )
                    {
                    // InternalMoniLog4DSL.g:1212:2: ( ruleUpperBound )
                    // InternalMoniLog4DSL.g:1213:3: ruleUpperBound
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
    // InternalMoniLog4DSL.g:1222:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1226:1: ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMoniLog4DSL.g:1227:2: ( ( rule__Scope__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1227:2: ( ( rule__Scope__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1228:3: ( rule__Scope__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1229:3: ( rule__Scope__Group_0__0 )
                    // InternalMoniLog4DSL.g:1229:4: rule__Scope__Group_0__0
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
                    // InternalMoniLog4DSL.g:1233:2: ( ( rule__Scope__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1233:2: ( ( rule__Scope__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1234:3: ( rule__Scope__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1235:3: ( rule__Scope__Group_1__0 )
                    // InternalMoniLog4DSL.g:1235:4: rule__Scope__Group_1__0
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
                    // InternalMoniLog4DSL.g:1239:2: ( ( rule__Scope__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1239:2: ( ( rule__Scope__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:1240:3: ( rule__Scope__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_2()); 
                    }
                    // InternalMoniLog4DSL.g:1241:3: ( rule__Scope__Group_2__0 )
                    // InternalMoniLog4DSL.g:1241:4: rule__Scope__Group_2__0
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
                    // InternalMoniLog4DSL.g:1245:2: ( ( rule__Scope__Group_3__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1245:2: ( ( rule__Scope__Group_3__0 ) )
                    // InternalMoniLog4DSL.g:1246:3: ( rule__Scope__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_3()); 
                    }
                    // InternalMoniLog4DSL.g:1247:3: ( rule__Scope__Group_3__0 )
                    // InternalMoniLog4DSL.g:1247:4: rule__Scope__Group_3__0
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
                    // InternalMoniLog4DSL.g:1251:2: ( ( rule__Scope__Group_4__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1251:2: ( ( rule__Scope__Group_4__0 ) )
                    // InternalMoniLog4DSL.g:1252:3: ( rule__Scope__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_4()); 
                    }
                    // InternalMoniLog4DSL.g:1253:3: ( rule__Scope__Group_4__0 )
                    // InternalMoniLog4DSL.g:1253:4: rule__Scope__Group_4__0
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
    // InternalMoniLog4DSL.g:1261:1: rule__Action__Alternatives : ( ( ruleLanguageExpression ) | ( ruleAppenderCall ) | ( ruleEmitEvent ) | ( ruleSetVariable ) | ( ruleMoniloggerCall ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1265:1: ( ( ruleLanguageExpression ) | ( ruleAppenderCall ) | ( ruleEmitEvent ) | ( ruleSetVariable ) | ( ruleMoniloggerCall ) )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==57) ) {
                    switch ( input.LA(3) ) {
                    case 60:
                    case 61:
                        {
                        alt8=5;
                        }
                        break;
                    case RULE_ID:
                    case 41:
                        {
                        alt8=2;
                        }
                        break;
                    case 58:
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
                else if ( (LA8_1==29) ) {
                    alt8=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA8_0==59) ) {
                alt8=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMoniLog4DSL.g:1266:2: ( ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:1266:2: ( ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:1267:3: ruleLanguageExpression
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
                    // InternalMoniLog4DSL.g:1272:2: ( ruleAppenderCall )
                    {
                    // InternalMoniLog4DSL.g:1272:2: ( ruleAppenderCall )
                    // InternalMoniLog4DSL.g:1273:3: ruleAppenderCall
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
                    // InternalMoniLog4DSL.g:1278:2: ( ruleEmitEvent )
                    {
                    // InternalMoniLog4DSL.g:1278:2: ( ruleEmitEvent )
                    // InternalMoniLog4DSL.g:1279:3: ruleEmitEvent
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
                    // InternalMoniLog4DSL.g:1284:2: ( ruleSetVariable )
                    {
                    // InternalMoniLog4DSL.g:1284:2: ( ruleSetVariable )
                    // InternalMoniLog4DSL.g:1285:3: ruleSetVariable
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getSetVariableParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleSetVariable();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getSetVariableParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1290:2: ( ruleMoniloggerCall )
                    {
                    // InternalMoniLog4DSL.g:1290:2: ( ruleMoniloggerCall )
                    // InternalMoniLog4DSL.g:1291:3: ruleMoniloggerCall
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getActionAccess().getMoniloggerCallParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleMoniloggerCall();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getActionAccess().getMoniloggerCallParserRuleCall_4()); 
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
    // InternalMoniLog4DSL.g:1300:1: rule__AppenderCallArgument__Alternatives : ( ( ruleExpression ) | ( ruleLayoutCall ) );
    public final void rule__AppenderCallArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1304:1: ( ( ruleExpression ) | ( ruleLayoutCall ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==EOF||(LA9_1>=29 && LA9_1<=30)||LA9_1==33) ) {
                    alt9=1;
                }
                else if ( (LA9_1==57) ) {
                    alt9=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoniLog4DSL.g:1305:2: ( ruleExpression )
                    {
                    // InternalMoniLog4DSL.g:1305:2: ( ruleExpression )
                    // InternalMoniLog4DSL.g:1306:3: ruleExpression
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
                    // InternalMoniLog4DSL.g:1311:2: ( ruleLayoutCall )
                    {
                    // InternalMoniLog4DSL.g:1311:2: ( ruleLayoutCall )
                    // InternalMoniLog4DSL.g:1312:3: ruleLayoutCall
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


    // $ANTLR start "rule__MoniloggerCall__Alternatives"
    // InternalMoniLog4DSL.g:1321:1: rule__MoniloggerCall__Alternatives : ( ( ( rule__MoniloggerCall__Group_0__0 ) ) | ( ( rule__MoniloggerCall__Group_1__0 ) ) );
    public final void rule__MoniloggerCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1325:1: ( ( ( rule__MoniloggerCall__Group_0__0 ) ) | ( ( rule__MoniloggerCall__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==57) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==60) ) {
                        alt10=1;
                    }
                    else if ( (LA10_2==61) ) {
                        alt10=2;
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
                    // InternalMoniLog4DSL.g:1326:2: ( ( rule__MoniloggerCall__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1326:2: ( ( rule__MoniloggerCall__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1327:3: ( rule__MoniloggerCall__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMoniloggerCallAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1328:3: ( rule__MoniloggerCall__Group_0__0 )
                    // InternalMoniLog4DSL.g:1328:4: rule__MoniloggerCall__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniloggerCall__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMoniloggerCallAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1332:2: ( ( rule__MoniloggerCall__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1332:2: ( ( rule__MoniloggerCall__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1333:3: ( rule__MoniloggerCall__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMoniloggerCallAccess().getGroup_1()); 
                    }
                    // InternalMoniLog4DSL.g:1334:3: ( rule__MoniloggerCall__Group_1__0 )
                    // InternalMoniLog4DSL.g:1334:4: rule__MoniloggerCall__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniloggerCall__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMoniloggerCallAccess().getGroup_1()); 
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
    // $ANTLR end "rule__MoniloggerCall__Alternatives"


    // $ANTLR start "rule__EmptyOrPropertyValue__Alternatives"
    // InternalMoniLog4DSL.g:1342:1: rule__EmptyOrPropertyValue__Alternatives : ( ( () ) | ( rulePropertyValue ) );
    public final void rule__EmptyOrPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1346:1: ( ( () ) | ( rulePropertyValue ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||LA11_0==30||LA11_0==33) ) {
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
                    // InternalMoniLog4DSL.g:1347:2: ( () )
                    {
                    // InternalMoniLog4DSL.g:1347:2: ( () )
                    // InternalMoniLog4DSL.g:1348:3: ()
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    }
                    // InternalMoniLog4DSL.g:1349:3: ()
                    // InternalMoniLog4DSL.g:1349:4: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1353:2: ( rulePropertyValue )
                    {
                    // InternalMoniLog4DSL.g:1353:2: ( rulePropertyValue )
                    // InternalMoniLog4DSL.g:1354:3: rulePropertyValue
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    rulePropertyValue();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueParserRuleCall_1()); 
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
    // InternalMoniLog4DSL.g:1363:1: rule__Expression__Alternatives : ( ( ruleParameterReference ) | ( ruleLanguageExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1367:1: ( ( ruleParameterReference ) | ( ruleLanguageExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==30||LA12_1==33) ) {
                    alt12=1;
                }
                else if ( (LA12_1==29) ) {
                    alt12=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoniLog4DSL.g:1368:2: ( ruleParameterReference )
                    {
                    // InternalMoniLog4DSL.g:1368:2: ( ruleParameterReference )
                    // InternalMoniLog4DSL.g:1369:3: ruleParameterReference
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
                    // InternalMoniLog4DSL.g:1374:2: ( ruleLanguageExpression )
                    {
                    // InternalMoniLog4DSL.g:1374:2: ( ruleLanguageExpression )
                    // InternalMoniLog4DSL.g:1375:3: ruleLanguageExpression
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


    // $ANTLR start "rule__PropertyValue__Alternatives"
    // InternalMoniLog4DSL.g:1384:1: rule__PropertyValue__Alternatives : ( ( ( rule__PropertyValue__Group_0__0 ) ) | ( ( rule__PropertyValue__ValueAssignment_1 ) ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1388:1: ( ( ( rule__PropertyValue__Group_0__0 ) ) | ( ( rule__PropertyValue__ValueAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==29) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==30||LA13_1==33||LA13_1==62) ) {
                    alt13=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoniLog4DSL.g:1389:2: ( ( rule__PropertyValue__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1389:2: ( ( rule__PropertyValue__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1390:3: ( rule__PropertyValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueAccess().getGroup_0()); 
                    }
                    // InternalMoniLog4DSL.g:1391:3: ( rule__PropertyValue__Group_0__0 )
                    // InternalMoniLog4DSL.g:1391:4: rule__PropertyValue__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1395:2: ( ( rule__PropertyValue__ValueAssignment_1 ) )
                    {
                    // InternalMoniLog4DSL.g:1395:2: ( ( rule__PropertyValue__ValueAssignment_1 ) )
                    // InternalMoniLog4DSL.g:1396:3: ( rule__PropertyValue__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueAccess().getValueAssignment_1()); 
                    }
                    // InternalMoniLog4DSL.g:1397:3: ( rule__PropertyValue__ValueAssignment_1 )
                    // InternalMoniLog4DSL.g:1397:4: rule__PropertyValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__ValueAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getPropertyValueAccess().getValueAssignment_1()); 
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
    // $ANTLR end "rule__PropertyValue__Alternatives"


    // $ANTLR start "rule__LogLevel__Alternatives"
    // InternalMoniLog4DSL.g:1405:1: rule__LogLevel__Alternatives : ( ( ( 'INFO' ) ) | ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) );
    public final void rule__LogLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1409:1: ( ( ( 'INFO' ) ) | ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) )
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
                    // InternalMoniLog4DSL.g:1410:2: ( ( 'INFO' ) )
                    {
                    // InternalMoniLog4DSL.g:1410:2: ( ( 'INFO' ) )
                    // InternalMoniLog4DSL.g:1411:3: ( 'INFO' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0()); 
                    }
                    // InternalMoniLog4DSL.g:1412:3: ( 'INFO' )
                    // InternalMoniLog4DSL.g:1412:4: 'INFO'
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
                    // InternalMoniLog4DSL.g:1416:2: ( ( 'CONFIG' ) )
                    {
                    // InternalMoniLog4DSL.g:1416:2: ( ( 'CONFIG' ) )
                    // InternalMoniLog4DSL.g:1417:3: ( 'CONFIG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1()); 
                    }
                    // InternalMoniLog4DSL.g:1418:3: ( 'CONFIG' )
                    // InternalMoniLog4DSL.g:1418:4: 'CONFIG'
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
                    // InternalMoniLog4DSL.g:1422:2: ( ( 'FINE' ) )
                    {
                    // InternalMoniLog4DSL.g:1422:2: ( ( 'FINE' ) )
                    // InternalMoniLog4DSL.g:1423:3: ( 'FINE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2()); 
                    }
                    // InternalMoniLog4DSL.g:1424:3: ( 'FINE' )
                    // InternalMoniLog4DSL.g:1424:4: 'FINE'
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
                    // InternalMoniLog4DSL.g:1428:2: ( ( 'FINER' ) )
                    {
                    // InternalMoniLog4DSL.g:1428:2: ( ( 'FINER' ) )
                    // InternalMoniLog4DSL.g:1429:3: ( 'FINER' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3()); 
                    }
                    // InternalMoniLog4DSL.g:1430:3: ( 'FINER' )
                    // InternalMoniLog4DSL.g:1430:4: 'FINER'
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
                    // InternalMoniLog4DSL.g:1434:2: ( ( 'FINEST' ) )
                    {
                    // InternalMoniLog4DSL.g:1434:2: ( ( 'FINEST' ) )
                    // InternalMoniLog4DSL.g:1435:3: ( 'FINEST' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4()); 
                    }
                    // InternalMoniLog4DSL.g:1436:3: ( 'FINEST' )
                    // InternalMoniLog4DSL.g:1436:4: 'FINEST'
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
                    // InternalMoniLog4DSL.g:1440:2: ( ( 'SEVERE' ) )
                    {
                    // InternalMoniLog4DSL.g:1440:2: ( ( 'SEVERE' ) )
                    // InternalMoniLog4DSL.g:1441:3: ( 'SEVERE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5()); 
                    }
                    // InternalMoniLog4DSL.g:1442:3: ( 'SEVERE' )
                    // InternalMoniLog4DSL.g:1442:4: 'SEVERE'
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
                    // InternalMoniLog4DSL.g:1446:2: ( ( 'WARNING' ) )
                    {
                    // InternalMoniLog4DSL.g:1446:2: ( ( 'WARNING' ) )
                    // InternalMoniLog4DSL.g:1447:3: ( 'WARNING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6()); 
                    }
                    // InternalMoniLog4DSL.g:1448:3: ( 'WARNING' )
                    // InternalMoniLog4DSL.g:1448:4: 'WARNING'
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
    // InternalMoniLog4DSL.g:1456:1: rule__TemporalPatternKind__Alternatives : ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) );
    public final void rule__TemporalPatternKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1460:1: ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) )
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
                    // InternalMoniLog4DSL.g:1461:2: ( ( 'S' ) )
                    {
                    // InternalMoniLog4DSL.g:1461:2: ( ( 'S' ) )
                    // InternalMoniLog4DSL.g:1462:3: ( 'S' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0()); 
                    }
                    // InternalMoniLog4DSL.g:1463:3: ( 'S' )
                    // InternalMoniLog4DSL.g:1463:4: 'S'
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
                    // InternalMoniLog4DSL.g:1467:2: ( ( 'V' ) )
                    {
                    // InternalMoniLog4DSL.g:1467:2: ( ( 'V' ) )
                    // InternalMoniLog4DSL.g:1468:3: ( 'V' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1()); 
                    }
                    // InternalMoniLog4DSL.g:1469:3: ( 'V' )
                    // InternalMoniLog4DSL.g:1469:4: 'V'
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
                    // InternalMoniLog4DSL.g:1473:2: ( ( 'nS' ) )
                    {
                    // InternalMoniLog4DSL.g:1473:2: ( ( 'nS' ) )
                    // InternalMoniLog4DSL.g:1474:3: ( 'nS' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2()); 
                    }
                    // InternalMoniLog4DSL.g:1475:3: ( 'nS' )
                    // InternalMoniLog4DSL.g:1475:4: 'nS'
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
                    // InternalMoniLog4DSL.g:1479:2: ( ( 'nV' ) )
                    {
                    // InternalMoniLog4DSL.g:1479:2: ( ( 'nV' ) )
                    // InternalMoniLog4DSL.g:1480:3: ( 'nV' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3()); 
                    }
                    // InternalMoniLog4DSL.g:1481:3: ( 'nV' )
                    // InternalMoniLog4DSL.g:1481:4: 'nV'
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
    // InternalMoniLog4DSL.g:1489:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1493:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalMoniLog4DSL.g:1494:2: rule__Document__Group__0__Impl rule__Document__Group__1
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
    // InternalMoniLog4DSL.g:1501:1: rule__Document__Group__0__Impl : ( 'package' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1505:1: ( ( 'package' ) )
            // InternalMoniLog4DSL.g:1506:1: ( 'package' )
            {
            // InternalMoniLog4DSL.g:1506:1: ( 'package' )
            // InternalMoniLog4DSL.g:1507:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getPackageKeyword_0()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:1516:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1520:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalMoniLog4DSL.g:1521:2: rule__Document__Group__1__Impl rule__Document__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Document__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Document__Group__2();

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
    // InternalMoniLog4DSL.g:1528:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1532:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:1533:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:1533:1: ( ( rule__Document__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:1534:2: ( rule__Document__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:1535:2: ( rule__Document__NameAssignment_1 )
            // InternalMoniLog4DSL.g:1535:3: rule__Document__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Document__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__Document__Group__2"
    // InternalMoniLog4DSL.g:1543:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1547:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // InternalMoniLog4DSL.g:1548:2: rule__Document__Group__2__Impl rule__Document__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Document__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Document__Group__3();

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
    // $ANTLR end "rule__Document__Group__2"


    // $ANTLR start "rule__Document__Group__2__Impl"
    // InternalMoniLog4DSL.g:1555:1: rule__Document__Group__2__Impl : ( ( rule__Document__ImportsAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1559:1: ( ( ( rule__Document__ImportsAssignment_2 )* ) )
            // InternalMoniLog4DSL.g:1560:1: ( ( rule__Document__ImportsAssignment_2 )* )
            {
            // InternalMoniLog4DSL.g:1560:1: ( ( rule__Document__ImportsAssignment_2 )* )
            // InternalMoniLog4DSL.g:1561:2: ( rule__Document__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getImportsAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:1562:2: ( rule__Document__ImportsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1562:3: rule__Document__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Document__ImportsAssignment_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getImportsAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__2__Impl"


    // $ANTLR start "rule__Document__Group__3"
    // InternalMoniLog4DSL.g:1570:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1574:1: ( rule__Document__Group__3__Impl )
            // InternalMoniLog4DSL.g:1575:2: rule__Document__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__Group__3__Impl();

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
    // $ANTLR end "rule__Document__Group__3"


    // $ANTLR start "rule__Document__Group__3__Impl"
    // InternalMoniLog4DSL.g:1581:1: rule__Document__Group__3__Impl : ( ( rule__Document__UnorderedGroup_3 ) ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1585:1: ( ( ( rule__Document__UnorderedGroup_3 ) ) )
            // InternalMoniLog4DSL.g:1586:1: ( ( rule__Document__UnorderedGroup_3 ) )
            {
            // InternalMoniLog4DSL.g:1586:1: ( ( rule__Document__UnorderedGroup_3 ) )
            // InternalMoniLog4DSL.g:1587:2: ( rule__Document__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getUnorderedGroup_3()); 
            }
            // InternalMoniLog4DSL.g:1588:2: ( rule__Document__UnorderedGroup_3 )
            // InternalMoniLog4DSL.g:1588:3: rule__Document__UnorderedGroup_3
            {
            pushFollow(FOLLOW_2);
            rule__Document__UnorderedGroup_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getUnorderedGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__Group__3__Impl"


    // $ANTLR start "rule__Import__Group__0"
    // InternalMoniLog4DSL.g:1597:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1601:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMoniLog4DSL.g:1602:2: rule__Import__Group__0__Impl rule__Import__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Import__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Import__Group__1();

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
    // $ANTLR end "rule__Import__Group__0"


    // $ANTLR start "rule__Import__Group__0__Impl"
    // InternalMoniLog4DSL.g:1609:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1613:1: ( ( 'import' ) )
            // InternalMoniLog4DSL.g:1614:1: ( 'import' )
            {
            // InternalMoniLog4DSL.g:1614:1: ( 'import' )
            // InternalMoniLog4DSL.g:1615:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__0__Impl"


    // $ANTLR start "rule__Import__Group__1"
    // InternalMoniLog4DSL.g:1624:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1628:1: ( rule__Import__Group__1__Impl )
            // InternalMoniLog4DSL.g:1629:2: rule__Import__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Import__Group__1__Impl();

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
    // $ANTLR end "rule__Import__Group__1"


    // $ANTLR start "rule__Import__Group__1__Impl"
    // InternalMoniLog4DSL.g:1635:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1639:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:1640:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:1640:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMoniLog4DSL.g:1641:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:1642:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMoniLog4DSL.g:1642:3: rule__Import__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Import__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__Group__1__Impl"


    // $ANTLR start "rule__LocalAppender__Group__0"
    // InternalMoniLog4DSL.g:1651:1: rule__LocalAppender__Group__0 : rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1 ;
    public final void rule__LocalAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1655:1: ( rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1 )
            // InternalMoniLog4DSL.g:1656:2: rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1
            {
            pushFollow(FOLLOW_6);
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
    // InternalMoniLog4DSL.g:1663:1: rule__LocalAppender__Group__0__Impl : ( ( rule__LocalAppender__AnnotationsAssignment_0 )* ) ;
    public final void rule__LocalAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1667:1: ( ( ( rule__LocalAppender__AnnotationsAssignment_0 )* ) )
            // InternalMoniLog4DSL.g:1668:1: ( ( rule__LocalAppender__AnnotationsAssignment_0 )* )
            {
            // InternalMoniLog4DSL.g:1668:1: ( ( rule__LocalAppender__AnnotationsAssignment_0 )* )
            // InternalMoniLog4DSL.g:1669:2: ( rule__LocalAppender__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getAnnotationsAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:1670:2: ( rule__LocalAppender__AnnotationsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1670:3: rule__LocalAppender__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_7);
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
    // InternalMoniLog4DSL.g:1678:1: rule__LocalAppender__Group__1 : rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2 ;
    public final void rule__LocalAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1682:1: ( rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2 )
            // InternalMoniLog4DSL.g:1683:2: rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:1690:1: rule__LocalAppender__Group__1__Impl : ( 'appender' ) ;
    public final void rule__LocalAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1694:1: ( ( 'appender' ) )
            // InternalMoniLog4DSL.g:1695:1: ( 'appender' )
            {
            // InternalMoniLog4DSL.g:1695:1: ( 'appender' )
            // InternalMoniLog4DSL.g:1696:2: 'appender'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getAppenderKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:1705:1: rule__LocalAppender__Group__2 : rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3 ;
    public final void rule__LocalAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1709:1: ( rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3 )
            // InternalMoniLog4DSL.g:1710:2: rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3
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
    // InternalMoniLog4DSL.g:1717:1: rule__LocalAppender__Group__2__Impl : ( ( rule__LocalAppender__NameAssignment_2 ) ) ;
    public final void rule__LocalAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1721:1: ( ( ( rule__LocalAppender__NameAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:1722:1: ( ( rule__LocalAppender__NameAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:1722:1: ( ( rule__LocalAppender__NameAssignment_2 ) )
            // InternalMoniLog4DSL.g:1723:2: ( rule__LocalAppender__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getNameAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:1724:2: ( rule__LocalAppender__NameAssignment_2 )
            // InternalMoniLog4DSL.g:1724:3: rule__LocalAppender__NameAssignment_2
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
    // InternalMoniLog4DSL.g:1732:1: rule__LocalAppender__Group__3 : rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4 ;
    public final void rule__LocalAppender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1736:1: ( rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4 )
            // InternalMoniLog4DSL.g:1737:2: rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4
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
    // InternalMoniLog4DSL.g:1744:1: rule__LocalAppender__Group__3__Impl : ( ( rule__LocalAppender__Group_3__0 )? ) ;
    public final void rule__LocalAppender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1748:1: ( ( ( rule__LocalAppender__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:1749:1: ( ( rule__LocalAppender__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:1749:1: ( ( rule__LocalAppender__Group_3__0 )? )
            // InternalMoniLog4DSL.g:1750:2: ( rule__LocalAppender__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:1751:2: ( rule__LocalAppender__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==29) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoniLog4DSL.g:1751:3: rule__LocalAppender__Group_3__0
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
    // InternalMoniLog4DSL.g:1759:1: rule__LocalAppender__Group__4 : rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5 ;
    public final void rule__LocalAppender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1763:1: ( rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5 )
            // InternalMoniLog4DSL.g:1764:2: rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:1771:1: rule__LocalAppender__Group__4__Impl : ( '{' ) ;
    public final void rule__LocalAppender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1775:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:1776:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:1776:1: ( '{' )
            // InternalMoniLog4DSL.g:1777:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:1786:1: rule__LocalAppender__Group__5 : rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6 ;
    public final void rule__LocalAppender__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1790:1: ( rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6 )
            // InternalMoniLog4DSL.g:1791:2: rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6
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
    // InternalMoniLog4DSL.g:1798:1: rule__LocalAppender__Group__5__Impl : ( ( rule__LocalAppender__CallsAssignment_5 ) ) ;
    public final void rule__LocalAppender__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1802:1: ( ( ( rule__LocalAppender__CallsAssignment_5 ) ) )
            // InternalMoniLog4DSL.g:1803:1: ( ( rule__LocalAppender__CallsAssignment_5 ) )
            {
            // InternalMoniLog4DSL.g:1803:1: ( ( rule__LocalAppender__CallsAssignment_5 ) )
            // InternalMoniLog4DSL.g:1804:2: ( rule__LocalAppender__CallsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAssignment_5()); 
            }
            // InternalMoniLog4DSL.g:1805:2: ( rule__LocalAppender__CallsAssignment_5 )
            // InternalMoniLog4DSL.g:1805:3: rule__LocalAppender__CallsAssignment_5
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
    // InternalMoniLog4DSL.g:1813:1: rule__LocalAppender__Group__6 : rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7 ;
    public final void rule__LocalAppender__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1817:1: ( rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7 )
            // InternalMoniLog4DSL.g:1818:2: rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7
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
    // InternalMoniLog4DSL.g:1825:1: rule__LocalAppender__Group__6__Impl : ( ( rule__LocalAppender__Group_6__0 )* ) ;
    public final void rule__LocalAppender__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1829:1: ( ( ( rule__LocalAppender__Group_6__0 )* ) )
            // InternalMoniLog4DSL.g:1830:1: ( ( rule__LocalAppender__Group_6__0 )* )
            {
            // InternalMoniLog4DSL.g:1830:1: ( ( rule__LocalAppender__Group_6__0 )* )
            // InternalMoniLog4DSL.g:1831:2: ( rule__LocalAppender__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_6()); 
            }
            // InternalMoniLog4DSL.g:1832:2: ( rule__LocalAppender__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==31) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1832:3: rule__LocalAppender__Group_6__0
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
    // InternalMoniLog4DSL.g:1840:1: rule__LocalAppender__Group__7 : rule__LocalAppender__Group__7__Impl ;
    public final void rule__LocalAppender__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1844:1: ( rule__LocalAppender__Group__7__Impl )
            // InternalMoniLog4DSL.g:1845:2: rule__LocalAppender__Group__7__Impl
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
    // InternalMoniLog4DSL.g:1851:1: rule__LocalAppender__Group__7__Impl : ( '}' ) ;
    public final void rule__LocalAppender__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1855:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:1856:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:1856:1: ( '}' )
            // InternalMoniLog4DSL.g:1857:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_7()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:1867:1: rule__LocalAppender__Group_3__0 : rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1 ;
    public final void rule__LocalAppender__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1871:1: ( rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1 )
            // InternalMoniLog4DSL.g:1872:2: rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:1879:1: rule__LocalAppender__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LocalAppender__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1883:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:1884:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:1884:1: ( '(' )
            // InternalMoniLog4DSL.g:1885:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:1894:1: rule__LocalAppender__Group_3__1 : rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2 ;
    public final void rule__LocalAppender__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1898:1: ( rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2 )
            // InternalMoniLog4DSL.g:1899:2: rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2
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
    // InternalMoniLog4DSL.g:1906:1: rule__LocalAppender__Group_3__1__Impl : ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) ) ;
    public final void rule__LocalAppender__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1910:1: ( ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:1911:1: ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:1911:1: ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:1912:2: ( rule__LocalAppender__ParameterDeclAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParameterDeclAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:1913:2: ( rule__LocalAppender__ParameterDeclAssignment_3_1 )
            // InternalMoniLog4DSL.g:1913:3: rule__LocalAppender__ParameterDeclAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__ParameterDeclAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getParameterDeclAssignment_3_1()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:1921:1: rule__LocalAppender__Group_3__2 : rule__LocalAppender__Group_3__2__Impl ;
    public final void rule__LocalAppender__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1925:1: ( rule__LocalAppender__Group_3__2__Impl )
            // InternalMoniLog4DSL.g:1926:2: rule__LocalAppender__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group_3__2__Impl();

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
    // InternalMoniLog4DSL.g:1932:1: rule__LocalAppender__Group_3__2__Impl : ( ')' ) ;
    public final void rule__LocalAppender__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1936:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:1937:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:1937:1: ( ')' )
            // InternalMoniLog4DSL.g:1938:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LocalAppender__Group_6__0"
    // InternalMoniLog4DSL.g:1948:1: rule__LocalAppender__Group_6__0 : rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1 ;
    public final void rule__LocalAppender__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1952:1: ( rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1 )
            // InternalMoniLog4DSL.g:1953:2: rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:1960:1: rule__LocalAppender__Group_6__0__Impl : ( ';' ) ;
    public final void rule__LocalAppender__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1964:1: ( ( ';' ) )
            // InternalMoniLog4DSL.g:1965:1: ( ';' )
            {
            // InternalMoniLog4DSL.g:1965:1: ( ';' )
            // InternalMoniLog4DSL.g:1966:2: ';'
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
    // InternalMoniLog4DSL.g:1975:1: rule__LocalAppender__Group_6__1 : rule__LocalAppender__Group_6__1__Impl ;
    public final void rule__LocalAppender__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1979:1: ( rule__LocalAppender__Group_6__1__Impl )
            // InternalMoniLog4DSL.g:1980:2: rule__LocalAppender__Group_6__1__Impl
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
    // InternalMoniLog4DSL.g:1986:1: rule__LocalAppender__Group_6__1__Impl : ( ( rule__LocalAppender__CallsAssignment_6_1 ) ) ;
    public final void rule__LocalAppender__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1990:1: ( ( ( rule__LocalAppender__CallsAssignment_6_1 ) ) )
            // InternalMoniLog4DSL.g:1991:1: ( ( rule__LocalAppender__CallsAssignment_6_1 ) )
            {
            // InternalMoniLog4DSL.g:1991:1: ( ( rule__LocalAppender__CallsAssignment_6_1 ) )
            // InternalMoniLog4DSL.g:1992:2: ( rule__LocalAppender__CallsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAssignment_6_1()); 
            }
            // InternalMoniLog4DSL.g:1993:2: ( rule__LocalAppender__CallsAssignment_6_1 )
            // InternalMoniLog4DSL.g:1993:3: rule__LocalAppender__CallsAssignment_6_1
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
    // InternalMoniLog4DSL.g:2002:1: rule__ExternalAppender__Group__0 : rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1 ;
    public final void rule__ExternalAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2006:1: ( rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1 )
            // InternalMoniLog4DSL.g:2007:2: rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2014:1: rule__ExternalAppender__Group__0__Impl : ( 'appender' ) ;
    public final void rule__ExternalAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2018:1: ( ( 'appender' ) )
            // InternalMoniLog4DSL.g:2019:1: ( 'appender' )
            {
            // InternalMoniLog4DSL.g:2019:1: ( 'appender' )
            // InternalMoniLog4DSL.g:2020:2: 'appender'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getAppenderKeyword_0()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:2029:1: rule__ExternalAppender__Group__1 : rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2 ;
    public final void rule__ExternalAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2033:1: ( rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2 )
            // InternalMoniLog4DSL.g:2034:2: rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMoniLog4DSL.g:2041:1: rule__ExternalAppender__Group__1__Impl : ( ( rule__ExternalAppender__NameAssignment_1 ) ) ;
    public final void rule__ExternalAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2045:1: ( ( ( rule__ExternalAppender__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2046:1: ( ( rule__ExternalAppender__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2046:1: ( ( rule__ExternalAppender__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:2047:2: ( rule__ExternalAppender__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:2048:2: ( rule__ExternalAppender__NameAssignment_1 )
            // InternalMoniLog4DSL.g:2048:3: rule__ExternalAppender__NameAssignment_1
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
    // InternalMoniLog4DSL.g:2056:1: rule__ExternalAppender__Group__2 : rule__ExternalAppender__Group__2__Impl ;
    public final void rule__ExternalAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2060:1: ( rule__ExternalAppender__Group__2__Impl )
            // InternalMoniLog4DSL.g:2061:2: rule__ExternalAppender__Group__2__Impl
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
    // InternalMoniLog4DSL.g:2067:1: rule__ExternalAppender__Group__2__Impl : ( ( rule__ExternalAppender__Group_2__0 )? ) ;
    public final void rule__ExternalAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2071:1: ( ( ( rule__ExternalAppender__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:2072:1: ( ( rule__ExternalAppender__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2072:1: ( ( rule__ExternalAppender__Group_2__0 )? )
            // InternalMoniLog4DSL.g:2073:2: ( rule__ExternalAppender__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:2074:2: ( rule__ExternalAppender__Group_2__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==29) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMoniLog4DSL.g:2074:3: rule__ExternalAppender__Group_2__0
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
    // InternalMoniLog4DSL.g:2083:1: rule__ExternalAppender__Group_2__0 : rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1 ;
    public final void rule__ExternalAppender__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2087:1: ( rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1 )
            // InternalMoniLog4DSL.g:2088:2: rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2095:1: rule__ExternalAppender__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExternalAppender__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2099:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2100:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2100:1: ( '(' )
            // InternalMoniLog4DSL.g:2101:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:2110:1: rule__ExternalAppender__Group_2__1 : rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2 ;
    public final void rule__ExternalAppender__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2114:1: ( rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2 )
            // InternalMoniLog4DSL.g:2115:2: rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2
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
    // InternalMoniLog4DSL.g:2122:1: rule__ExternalAppender__Group_2__1__Impl : ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) ) ;
    public final void rule__ExternalAppender__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2126:1: ( ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:2127:1: ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2127:1: ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:2128:2: ( rule__ExternalAppender__ParameterDeclAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParameterDeclAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:2129:2: ( rule__ExternalAppender__ParameterDeclAssignment_2_1 )
            // InternalMoniLog4DSL.g:2129:3: rule__ExternalAppender__ParameterDeclAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__ParameterDeclAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getParameterDeclAssignment_2_1()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:2137:1: rule__ExternalAppender__Group_2__2 : rule__ExternalAppender__Group_2__2__Impl ;
    public final void rule__ExternalAppender__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2141:1: ( rule__ExternalAppender__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:2142:2: rule__ExternalAppender__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalAppender__Group_2__2__Impl();

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
    // InternalMoniLog4DSL.g:2148:1: rule__ExternalAppender__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExternalAppender__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2152:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2153:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2153:1: ( ')' )
            // InternalMoniLog4DSL.g:2154:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LocalLayout__Group__0"
    // InternalMoniLog4DSL.g:2164:1: rule__LocalLayout__Group__0 : rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1 ;
    public final void rule__LocalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2168:1: ( rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1 )
            // InternalMoniLog4DSL.g:2169:2: rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2176:1: rule__LocalLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__LocalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2180:1: ( ( 'layout' ) )
            // InternalMoniLog4DSL.g:2181:1: ( 'layout' )
            {
            // InternalMoniLog4DSL.g:2181:1: ( 'layout' )
            // InternalMoniLog4DSL.g:2182:2: 'layout'
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
    // InternalMoniLog4DSL.g:2191:1: rule__LocalLayout__Group__1 : rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2 ;
    public final void rule__LocalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2195:1: ( rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2 )
            // InternalMoniLog4DSL.g:2196:2: rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2
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
    // InternalMoniLog4DSL.g:2203:1: rule__LocalLayout__Group__1__Impl : ( ( rule__LocalLayout__NameAssignment_1 ) ) ;
    public final void rule__LocalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2207:1: ( ( ( rule__LocalLayout__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2208:1: ( ( rule__LocalLayout__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2208:1: ( ( rule__LocalLayout__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:2209:2: ( rule__LocalLayout__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:2210:2: ( rule__LocalLayout__NameAssignment_1 )
            // InternalMoniLog4DSL.g:2210:3: rule__LocalLayout__NameAssignment_1
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
    // InternalMoniLog4DSL.g:2218:1: rule__LocalLayout__Group__2 : rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3 ;
    public final void rule__LocalLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2222:1: ( rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3 )
            // InternalMoniLog4DSL.g:2223:2: rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3
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
    // InternalMoniLog4DSL.g:2230:1: rule__LocalLayout__Group__2__Impl : ( ( rule__LocalLayout__Group_2__0 )? ) ;
    public final void rule__LocalLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2234:1: ( ( ( rule__LocalLayout__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:2235:1: ( ( rule__LocalLayout__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2235:1: ( ( rule__LocalLayout__Group_2__0 )? )
            // InternalMoniLog4DSL.g:2236:2: ( rule__LocalLayout__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:2237:2: ( rule__LocalLayout__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoniLog4DSL.g:2237:3: rule__LocalLayout__Group_2__0
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
    // InternalMoniLog4DSL.g:2245:1: rule__LocalLayout__Group__3 : rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4 ;
    public final void rule__LocalLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2249:1: ( rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4 )
            // InternalMoniLog4DSL.g:2250:2: rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2257:1: rule__LocalLayout__Group__3__Impl : ( '{' ) ;
    public final void rule__LocalLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2261:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:2262:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:2262:1: ( '{' )
            // InternalMoniLog4DSL.g:2263:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:2272:1: rule__LocalLayout__Group__4 : rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5 ;
    public final void rule__LocalLayout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2276:1: ( rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5 )
            // InternalMoniLog4DSL.g:2277:2: rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5
            {
            pushFollow(FOLLOW_13);
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
    // InternalMoniLog4DSL.g:2284:1: rule__LocalLayout__Group__4__Impl : ( ( rule__LocalLayout__CallAssignment_4 ) ) ;
    public final void rule__LocalLayout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2288:1: ( ( ( rule__LocalLayout__CallAssignment_4 ) ) )
            // InternalMoniLog4DSL.g:2289:1: ( ( rule__LocalLayout__CallAssignment_4 ) )
            {
            // InternalMoniLog4DSL.g:2289:1: ( ( rule__LocalLayout__CallAssignment_4 ) )
            // InternalMoniLog4DSL.g:2290:2: ( rule__LocalLayout__CallAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getCallAssignment_4()); 
            }
            // InternalMoniLog4DSL.g:2291:2: ( rule__LocalLayout__CallAssignment_4 )
            // InternalMoniLog4DSL.g:2291:3: rule__LocalLayout__CallAssignment_4
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
    // InternalMoniLog4DSL.g:2299:1: rule__LocalLayout__Group__5 : rule__LocalLayout__Group__5__Impl ;
    public final void rule__LocalLayout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2303:1: ( rule__LocalLayout__Group__5__Impl )
            // InternalMoniLog4DSL.g:2304:2: rule__LocalLayout__Group__5__Impl
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
    // InternalMoniLog4DSL.g:2310:1: rule__LocalLayout__Group__5__Impl : ( '}' ) ;
    public final void rule__LocalLayout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2314:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:2315:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:2315:1: ( '}' )
            // InternalMoniLog4DSL.g:2316:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:2326:1: rule__LocalLayout__Group_2__0 : rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1 ;
    public final void rule__LocalLayout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2330:1: ( rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1 )
            // InternalMoniLog4DSL.g:2331:2: rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2338:1: rule__LocalLayout__Group_2__0__Impl : ( '(' ) ;
    public final void rule__LocalLayout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2342:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2343:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2343:1: ( '(' )
            // InternalMoniLog4DSL.g:2344:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:2353:1: rule__LocalLayout__Group_2__1 : rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2 ;
    public final void rule__LocalLayout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2357:1: ( rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2 )
            // InternalMoniLog4DSL.g:2358:2: rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2
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
    // InternalMoniLog4DSL.g:2365:1: rule__LocalLayout__Group_2__1__Impl : ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) ) ;
    public final void rule__LocalLayout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2369:1: ( ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:2370:1: ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2370:1: ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:2371:2: ( rule__LocalLayout__ParameterDeclAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParameterDeclAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:2372:2: ( rule__LocalLayout__ParameterDeclAssignment_2_1 )
            // InternalMoniLog4DSL.g:2372:3: rule__LocalLayout__ParameterDeclAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__ParameterDeclAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getParameterDeclAssignment_2_1()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:2380:1: rule__LocalLayout__Group_2__2 : rule__LocalLayout__Group_2__2__Impl ;
    public final void rule__LocalLayout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2384:1: ( rule__LocalLayout__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:2385:2: rule__LocalLayout__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalLayout__Group_2__2__Impl();

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
    // InternalMoniLog4DSL.g:2391:1: rule__LocalLayout__Group_2__2__Impl : ( ')' ) ;
    public final void rule__LocalLayout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2395:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2396:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2396:1: ( ')' )
            // InternalMoniLog4DSL.g:2397:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ExternalLayout__Group__0"
    // InternalMoniLog4DSL.g:2407:1: rule__ExternalLayout__Group__0 : rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 ;
    public final void rule__ExternalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2411:1: ( rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 )
            // InternalMoniLog4DSL.g:2412:2: rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2419:1: rule__ExternalLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__ExternalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2423:1: ( ( 'layout' ) )
            // InternalMoniLog4DSL.g:2424:1: ( 'layout' )
            {
            // InternalMoniLog4DSL.g:2424:1: ( 'layout' )
            // InternalMoniLog4DSL.g:2425:2: 'layout'
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
    // InternalMoniLog4DSL.g:2434:1: rule__ExternalLayout__Group__1 : rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2 ;
    public final void rule__ExternalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2438:1: ( rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2 )
            // InternalMoniLog4DSL.g:2439:2: rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2
            {
            pushFollow(FOLLOW_12);
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
    // InternalMoniLog4DSL.g:2446:1: rule__ExternalLayout__Group__1__Impl : ( ( rule__ExternalLayout__NameAssignment_1 ) ) ;
    public final void rule__ExternalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2450:1: ( ( ( rule__ExternalLayout__NameAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2451:1: ( ( rule__ExternalLayout__NameAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2451:1: ( ( rule__ExternalLayout__NameAssignment_1 ) )
            // InternalMoniLog4DSL.g:2452:2: ( rule__ExternalLayout__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:2453:2: ( rule__ExternalLayout__NameAssignment_1 )
            // InternalMoniLog4DSL.g:2453:3: rule__ExternalLayout__NameAssignment_1
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
    // InternalMoniLog4DSL.g:2461:1: rule__ExternalLayout__Group__2 : rule__ExternalLayout__Group__2__Impl ;
    public final void rule__ExternalLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2465:1: ( rule__ExternalLayout__Group__2__Impl )
            // InternalMoniLog4DSL.g:2466:2: rule__ExternalLayout__Group__2__Impl
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
    // InternalMoniLog4DSL.g:2472:1: rule__ExternalLayout__Group__2__Impl : ( ( rule__ExternalLayout__Group_2__0 )? ) ;
    public final void rule__ExternalLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2476:1: ( ( ( rule__ExternalLayout__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:2477:1: ( ( rule__ExternalLayout__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2477:1: ( ( rule__ExternalLayout__Group_2__0 )? )
            // InternalMoniLog4DSL.g:2478:2: ( rule__ExternalLayout__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup_2()); 
            }
            // InternalMoniLog4DSL.g:2479:2: ( rule__ExternalLayout__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==29) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoniLog4DSL.g:2479:3: rule__ExternalLayout__Group_2__0
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
    // InternalMoniLog4DSL.g:2488:1: rule__ExternalLayout__Group_2__0 : rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1 ;
    public final void rule__ExternalLayout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2492:1: ( rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1 )
            // InternalMoniLog4DSL.g:2493:2: rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:2500:1: rule__ExternalLayout__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExternalLayout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2504:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2505:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2505:1: ( '(' )
            // InternalMoniLog4DSL.g:2506:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:2515:1: rule__ExternalLayout__Group_2__1 : rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2 ;
    public final void rule__ExternalLayout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2519:1: ( rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2 )
            // InternalMoniLog4DSL.g:2520:2: rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2
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
    // InternalMoniLog4DSL.g:2527:1: rule__ExternalLayout__Group_2__1__Impl : ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) ) ;
    public final void rule__ExternalLayout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2531:1: ( ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:2532:1: ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2532:1: ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:2533:2: ( rule__ExternalLayout__ParameterDeclAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParameterDeclAssignment_2_1()); 
            }
            // InternalMoniLog4DSL.g:2534:2: ( rule__ExternalLayout__ParameterDeclAssignment_2_1 )
            // InternalMoniLog4DSL.g:2534:3: rule__ExternalLayout__ParameterDeclAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__ParameterDeclAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getParameterDeclAssignment_2_1()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:2542:1: rule__ExternalLayout__Group_2__2 : rule__ExternalLayout__Group_2__2__Impl ;
    public final void rule__ExternalLayout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2546:1: ( rule__ExternalLayout__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:2547:2: rule__ExternalLayout__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_2__2__Impl();

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
    // InternalMoniLog4DSL.g:2553:1: rule__ExternalLayout__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExternalLayout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2557:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2558:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2558:1: ( ')' )
            // InternalMoniLog4DSL.g:2559:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ParameterDeclVarArgs__Group__0"
    // InternalMoniLog4DSL.g:2569:1: rule__ParameterDeclVarArgs__Group__0 : rule__ParameterDeclVarArgs__Group__0__Impl rule__ParameterDeclVarArgs__Group__1 ;
    public final void rule__ParameterDeclVarArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2573:1: ( rule__ParameterDeclVarArgs__Group__0__Impl rule__ParameterDeclVarArgs__Group__1 )
            // InternalMoniLog4DSL.g:2574:2: rule__ParameterDeclVarArgs__Group__0__Impl rule__ParameterDeclVarArgs__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterDeclVarArgs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group__1();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group__0"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group__0__Impl"
    // InternalMoniLog4DSL.g:2581:1: rule__ParameterDeclVarArgs__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclVarArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2585:1: ( ( () ) )
            // InternalMoniLog4DSL.g:2586:1: ( () )
            {
            // InternalMoniLog4DSL.g:2586:1: ( () )
            // InternalMoniLog4DSL.g:2587:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParameterDeclAction_0()); 
            }
            // InternalMoniLog4DSL.g:2588:2: ()
            // InternalMoniLog4DSL.g:2588:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getParameterDeclAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group__1"
    // InternalMoniLog4DSL.g:2596:1: rule__ParameterDeclVarArgs__Group__1 : rule__ParameterDeclVarArgs__Group__1__Impl ;
    public final void rule__ParameterDeclVarArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2600:1: ( rule__ParameterDeclVarArgs__Group__1__Impl )
            // InternalMoniLog4DSL.g:2601:2: rule__ParameterDeclVarArgs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group__1"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group__1__Impl"
    // InternalMoniLog4DSL.g:2607:1: rule__ParameterDeclVarArgs__Group__1__Impl : ( ( rule__ParameterDeclVarArgs__Group_1__0 )? ) ;
    public final void rule__ParameterDeclVarArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2611:1: ( ( ( rule__ParameterDeclVarArgs__Group_1__0 )? ) )
            // InternalMoniLog4DSL.g:2612:1: ( ( rule__ParameterDeclVarArgs__Group_1__0 )? )
            {
            // InternalMoniLog4DSL.g:2612:1: ( ( rule__ParameterDeclVarArgs__Group_1__0 )? )
            // InternalMoniLog4DSL.g:2613:2: ( rule__ParameterDeclVarArgs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1()); 
            }
            // InternalMoniLog4DSL.g:2614:2: ( rule__ParameterDeclVarArgs__Group_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog4DSL.g:2614:3: rule__ParameterDeclVarArgs__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDeclVarArgs__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group__1__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1__0"
    // InternalMoniLog4DSL.g:2623:1: rule__ParameterDeclVarArgs__Group_1__0 : rule__ParameterDeclVarArgs__Group_1__0__Impl rule__ParameterDeclVarArgs__Group_1__1 ;
    public final void rule__ParameterDeclVarArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2627:1: ( rule__ParameterDeclVarArgs__Group_1__0__Impl rule__ParameterDeclVarArgs__Group_1__1 )
            // InternalMoniLog4DSL.g:2628:2: rule__ParameterDeclVarArgs__Group_1__0__Impl rule__ParameterDeclVarArgs__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterDeclVarArgs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1__1();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1__0"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:2635:1: rule__ParameterDeclVarArgs__Group_1__0__Impl : ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) ) ;
    public final void rule__ParameterDeclVarArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2639:1: ( ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) ) )
            // InternalMoniLog4DSL.g:2640:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) )
            {
            // InternalMoniLog4DSL.g:2640:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) )
            // InternalMoniLog4DSL.g:2641:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParametersAssignment_1_0()); 
            }
            // InternalMoniLog4DSL.g:2642:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 )
            // InternalMoniLog4DSL.g:2642:3: rule__ParameterDeclVarArgs__ParametersAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__ParametersAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getParametersAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1__1"
    // InternalMoniLog4DSL.g:2650:1: rule__ParameterDeclVarArgs__Group_1__1 : rule__ParameterDeclVarArgs__Group_1__1__Impl rule__ParameterDeclVarArgs__Group_1__2 ;
    public final void rule__ParameterDeclVarArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2654:1: ( rule__ParameterDeclVarArgs__Group_1__1__Impl rule__ParameterDeclVarArgs__Group_1__2 )
            // InternalMoniLog4DSL.g:2655:2: rule__ParameterDeclVarArgs__Group_1__1__Impl rule__ParameterDeclVarArgs__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__ParameterDeclVarArgs__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1__2();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1__1"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:2662:1: rule__ParameterDeclVarArgs__Group_1__1__Impl : ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* ) ;
    public final void rule__ParameterDeclVarArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2666:1: ( ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* ) )
            // InternalMoniLog4DSL.g:2667:1: ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* )
            {
            // InternalMoniLog4DSL.g:2667:1: ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* )
            // InternalMoniLog4DSL.g:2668:2: ( rule__ParameterDeclVarArgs__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1_1()); 
            }
            // InternalMoniLog4DSL.g:2669:2: ( rule__ParameterDeclVarArgs__Group_1_1__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==33) ) {
                    int LA24_1 = input.LA(2);

                    if ( (LA24_1==RULE_ID) ) {
                        int LA24_3 = input.LA(3);

                        if ( (LA24_3==EOF||LA24_3==30||LA24_3==33) ) {
                            alt24=1;
                        }


                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2669:3: rule__ParameterDeclVarArgs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ParameterDeclVarArgs__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1__2"
    // InternalMoniLog4DSL.g:2677:1: rule__ParameterDeclVarArgs__Group_1__2 : rule__ParameterDeclVarArgs__Group_1__2__Impl ;
    public final void rule__ParameterDeclVarArgs__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2681:1: ( rule__ParameterDeclVarArgs__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:2682:2: rule__ParameterDeclVarArgs__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1__2__Impl();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1__2"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:2688:1: rule__ParameterDeclVarArgs__Group_1__2__Impl : ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? ) ;
    public final void rule__ParameterDeclVarArgs__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2692:1: ( ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? ) )
            // InternalMoniLog4DSL.g:2693:1: ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? )
            {
            // InternalMoniLog4DSL.g:2693:1: ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? )
            // InternalMoniLog4DSL.g:2694:2: ( rule__ParameterDeclVarArgs__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1_2()); 
            }
            // InternalMoniLog4DSL.g:2695:2: ( rule__ParameterDeclVarArgs__Group_1_2__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==33) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMoniLog4DSL.g:2695:3: rule__ParameterDeclVarArgs__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDeclVarArgs__Group_1_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1__2__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_1__0"
    // InternalMoniLog4DSL.g:2704:1: rule__ParameterDeclVarArgs__Group_1_1__0 : rule__ParameterDeclVarArgs__Group_1_1__0__Impl rule__ParameterDeclVarArgs__Group_1_1__1 ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2708:1: ( rule__ParameterDeclVarArgs__Group_1_1__0__Impl rule__ParameterDeclVarArgs__Group_1_1__1 )
            // InternalMoniLog4DSL.g:2709:2: rule__ParameterDeclVarArgs__Group_1_1__0__Impl rule__ParameterDeclVarArgs__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterDeclVarArgs__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1_1__1();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_1__0"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_1__0__Impl"
    // InternalMoniLog4DSL.g:2716:1: rule__ParameterDeclVarArgs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2720:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2721:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2721:1: ( ',' )
            // InternalMoniLog4DSL.g:2722:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_1__1"
    // InternalMoniLog4DSL.g:2731:1: rule__ParameterDeclVarArgs__Group_1_1__1 : rule__ParameterDeclVarArgs__Group_1_1__1__Impl ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2735:1: ( rule__ParameterDeclVarArgs__Group_1_1__1__Impl )
            // InternalMoniLog4DSL.g:2736:2: rule__ParameterDeclVarArgs__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_1__1"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_1__1__Impl"
    // InternalMoniLog4DSL.g:2742:1: rule__ParameterDeclVarArgs__Group_1_1__1__Impl : ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2746:1: ( ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) ) )
            // InternalMoniLog4DSL.g:2747:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) )
            {
            // InternalMoniLog4DSL.g:2747:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) )
            // InternalMoniLog4DSL.g:2748:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParametersAssignment_1_1_1()); 
            }
            // InternalMoniLog4DSL.g:2749:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 )
            // InternalMoniLog4DSL.g:2749:3: rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getParametersAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_2__0"
    // InternalMoniLog4DSL.g:2758:1: rule__ParameterDeclVarArgs__Group_1_2__0 : rule__ParameterDeclVarArgs__Group_1_2__0__Impl rule__ParameterDeclVarArgs__Group_1_2__1 ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2762:1: ( rule__ParameterDeclVarArgs__Group_1_2__0__Impl rule__ParameterDeclVarArgs__Group_1_2__1 )
            // InternalMoniLog4DSL.g:2763:2: rule__ParameterDeclVarArgs__Group_1_2__0__Impl rule__ParameterDeclVarArgs__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterDeclVarArgs__Group_1_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1_2__1();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_2__0"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_2__0__Impl"
    // InternalMoniLog4DSL.g:2770:1: rule__ParameterDeclVarArgs__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2774:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2775:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2775:1: ( ',' )
            // InternalMoniLog4DSL.g:2776:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getCommaKeyword_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_2__0__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_2__1"
    // InternalMoniLog4DSL.g:2785:1: rule__ParameterDeclVarArgs__Group_1_2__1 : rule__ParameterDeclVarArgs__Group_1_2__1__Impl rule__ParameterDeclVarArgs__Group_1_2__2 ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2789:1: ( rule__ParameterDeclVarArgs__Group_1_2__1__Impl rule__ParameterDeclVarArgs__Group_1_2__2 )
            // InternalMoniLog4DSL.g:2790:2: rule__ParameterDeclVarArgs__Group_1_2__1__Impl rule__ParameterDeclVarArgs__Group_1_2__2
            {
            pushFollow(FOLLOW_16);
            rule__ParameterDeclVarArgs__Group_1_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1_2__2();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_2__1"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_2__1__Impl"
    // InternalMoniLog4DSL.g:2797:1: rule__ParameterDeclVarArgs__Group_1_2__1__Impl : ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2801:1: ( ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) ) )
            // InternalMoniLog4DSL.g:2802:1: ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) )
            {
            // InternalMoniLog4DSL.g:2802:1: ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) )
            // InternalMoniLog4DSL.g:2803:2: ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsAssignment_1_2_1()); 
            }
            // InternalMoniLog4DSL.g:2804:2: ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 )
            // InternalMoniLog4DSL.g:2804:3: rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsAssignment_1_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_2__1__Impl"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_2__2"
    // InternalMoniLog4DSL.g:2812:1: rule__ParameterDeclVarArgs__Group_1_2__2 : rule__ParameterDeclVarArgs__Group_1_2__2__Impl ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2816:1: ( rule__ParameterDeclVarArgs__Group_1_2__2__Impl )
            // InternalMoniLog4DSL.g:2817:2: rule__ParameterDeclVarArgs__Group_1_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclVarArgs__Group_1_2__2__Impl();

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
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_2__2"


    // $ANTLR start "rule__ParameterDeclVarArgs__Group_1_2__2__Impl"
    // InternalMoniLog4DSL.g:2823:1: rule__ParameterDeclVarArgs__Group_1_2__2__Impl : ( '...' ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2827:1: ( ( '...' ) )
            // InternalMoniLog4DSL.g:2828:1: ( '...' )
            {
            // InternalMoniLog4DSL.g:2828:1: ( '...' )
            // InternalMoniLog4DSL.g:2829:2: '...'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getFullStopFullStopFullStopKeyword_1_2_2()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getFullStopFullStopFullStopKeyword_1_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__Group_1_2__2__Impl"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group__0"
    // InternalMoniLog4DSL.g:2839:1: rule__ParameterDeclNoVarArgs__Group__0 : rule__ParameterDeclNoVarArgs__Group__0__Impl rule__ParameterDeclNoVarArgs__Group__1 ;
    public final void rule__ParameterDeclNoVarArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2843:1: ( rule__ParameterDeclNoVarArgs__Group__0__Impl rule__ParameterDeclNoVarArgs__Group__1 )
            // InternalMoniLog4DSL.g:2844:2: rule__ParameterDeclNoVarArgs__Group__0__Impl rule__ParameterDeclNoVarArgs__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterDeclNoVarArgs__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group__1();

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
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group__0"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group__0__Impl"
    // InternalMoniLog4DSL.g:2851:1: rule__ParameterDeclNoVarArgs__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclNoVarArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2855:1: ( ( () ) )
            // InternalMoniLog4DSL.g:2856:1: ( () )
            {
            // InternalMoniLog4DSL.g:2856:1: ( () )
            // InternalMoniLog4DSL.g:2857:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParameterDeclAction_0()); 
            }
            // InternalMoniLog4DSL.g:2858:2: ()
            // InternalMoniLog4DSL.g:2858:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getParameterDeclAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group__0__Impl"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group__1"
    // InternalMoniLog4DSL.g:2866:1: rule__ParameterDeclNoVarArgs__Group__1 : rule__ParameterDeclNoVarArgs__Group__1__Impl ;
    public final void rule__ParameterDeclNoVarArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2870:1: ( rule__ParameterDeclNoVarArgs__Group__1__Impl )
            // InternalMoniLog4DSL.g:2871:2: rule__ParameterDeclNoVarArgs__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group__1"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group__1__Impl"
    // InternalMoniLog4DSL.g:2877:1: rule__ParameterDeclNoVarArgs__Group__1__Impl : ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? ) ;
    public final void rule__ParameterDeclNoVarArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2881:1: ( ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? ) )
            // InternalMoniLog4DSL.g:2882:1: ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? )
            {
            // InternalMoniLog4DSL.g:2882:1: ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? )
            // InternalMoniLog4DSL.g:2883:2: ( rule__ParameterDeclNoVarArgs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup_1()); 
            }
            // InternalMoniLog4DSL.g:2884:2: ( rule__ParameterDeclNoVarArgs__Group_1__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_ID) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMoniLog4DSL.g:2884:3: rule__ParameterDeclNoVarArgs__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ParameterDeclNoVarArgs__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group__1__Impl"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1__0"
    // InternalMoniLog4DSL.g:2893:1: rule__ParameterDeclNoVarArgs__Group_1__0 : rule__ParameterDeclNoVarArgs__Group_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1__1 ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2897:1: ( rule__ParameterDeclNoVarArgs__Group_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1__1 )
            // InternalMoniLog4DSL.g:2898:2: rule__ParameterDeclNoVarArgs__Group_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1__1
            {
            pushFollow(FOLLOW_14);
            rule__ParameterDeclNoVarArgs__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group_1__1();

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
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1__0"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:2905:1: rule__ParameterDeclNoVarArgs__Group_1__0__Impl : ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2909:1: ( ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) ) )
            // InternalMoniLog4DSL.g:2910:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) )
            {
            // InternalMoniLog4DSL.g:2910:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) )
            // InternalMoniLog4DSL.g:2911:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersAssignment_1_0()); 
            }
            // InternalMoniLog4DSL.g:2912:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 )
            // InternalMoniLog4DSL.g:2912:3: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersAssignment_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1__1"
    // InternalMoniLog4DSL.g:2920:1: rule__ParameterDeclNoVarArgs__Group_1__1 : rule__ParameterDeclNoVarArgs__Group_1__1__Impl ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2924:1: ( rule__ParameterDeclNoVarArgs__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:2925:2: rule__ParameterDeclNoVarArgs__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group_1__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1__1"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:2931:1: rule__ParameterDeclNoVarArgs__Group_1__1__Impl : ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2935:1: ( ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* ) )
            // InternalMoniLog4DSL.g:2936:1: ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* )
            {
            // InternalMoniLog4DSL.g:2936:1: ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* )
            // InternalMoniLog4DSL.g:2937:2: ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup_1_1()); 
            }
            // InternalMoniLog4DSL.g:2938:2: ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2938:3: rule__ParameterDeclNoVarArgs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ParameterDeclNoVarArgs__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1__1__Impl"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1_1__0"
    // InternalMoniLog4DSL.g:2947:1: rule__ParameterDeclNoVarArgs__Group_1_1__0 : rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1_1__1 ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2951:1: ( rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1_1__1 )
            // InternalMoniLog4DSL.g:2952:2: rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group_1_1__1();

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
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1_1__0"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl"
    // InternalMoniLog4DSL.g:2959:1: rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2963:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2964:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2964:1: ( ',' )
            // InternalMoniLog4DSL.g:2965:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getCommaKeyword_1_1_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getCommaKeyword_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1_1__1"
    // InternalMoniLog4DSL.g:2974:1: rule__ParameterDeclNoVarArgs__Group_1_1__1 : rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2978:1: ( rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl )
            // InternalMoniLog4DSL.g:2979:2: rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1_1__1"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl"
    // InternalMoniLog4DSL.g:2985:1: rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl : ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2989:1: ( ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) ) )
            // InternalMoniLog4DSL.g:2990:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) )
            {
            // InternalMoniLog4DSL.g:2990:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) )
            // InternalMoniLog4DSL.g:2991:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersAssignment_1_1_1()); 
            }
            // InternalMoniLog4DSL.g:2992:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 )
            // InternalMoniLog4DSL.g:2992:3: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersAssignment_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl"


    // $ANTLR start "rule__MoniLogger__Group__0"
    // InternalMoniLog4DSL.g:3001:1: rule__MoniLogger__Group__0 : rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1 ;
    public final void rule__MoniLogger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3005:1: ( rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1 )
            // InternalMoniLog4DSL.g:3006:2: rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1
            {
            pushFollow(FOLLOW_17);
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
    // InternalMoniLog4DSL.g:3013:1: rule__MoniLogger__Group__0__Impl : ( ( rule__MoniLogger__AnnotationsAssignment_0 )* ) ;
    public final void rule__MoniLogger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3017:1: ( ( ( rule__MoniLogger__AnnotationsAssignment_0 )* ) )
            // InternalMoniLog4DSL.g:3018:1: ( ( rule__MoniLogger__AnnotationsAssignment_0 )* )
            {
            // InternalMoniLog4DSL.g:3018:1: ( ( rule__MoniLogger__AnnotationsAssignment_0 )* )
            // InternalMoniLog4DSL.g:3019:2: ( rule__MoniLogger__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getAnnotationsAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:3020:2: ( rule__MoniLogger__AnnotationsAssignment_0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==11) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3020:3: rule__MoniLogger__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MoniLogger__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMoniLog4DSL.g:3028:1: rule__MoniLogger__Group__1 : rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2 ;
    public final void rule__MoniLogger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3032:1: ( rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2 )
            // InternalMoniLog4DSL.g:3033:2: rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:3040:1: rule__MoniLogger__Group__1__Impl : ( 'monilogger' ) ;
    public final void rule__MoniLogger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3044:1: ( ( 'monilogger' ) )
            // InternalMoniLog4DSL.g:3045:1: ( 'monilogger' )
            {
            // InternalMoniLog4DSL.g:3045:1: ( 'monilogger' )
            // InternalMoniLog4DSL.g:3046:2: 'monilogger'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getMoniloggerKeyword_1()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3055:1: rule__MoniLogger__Group__2 : rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3 ;
    public final void rule__MoniLogger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3059:1: ( rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3 )
            // InternalMoniLog4DSL.g:3060:2: rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3
            {
            pushFollow(FOLLOW_19);
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
    // InternalMoniLog4DSL.g:3067:1: rule__MoniLogger__Group__2__Impl : ( ( rule__MoniLogger__NameAssignment_2 ) ) ;
    public final void rule__MoniLogger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3071:1: ( ( ( rule__MoniLogger__NameAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:3072:1: ( ( rule__MoniLogger__NameAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:3072:1: ( ( rule__MoniLogger__NameAssignment_2 ) )
            // InternalMoniLog4DSL.g:3073:2: ( rule__MoniLogger__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getNameAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:3074:2: ( rule__MoniLogger__NameAssignment_2 )
            // InternalMoniLog4DSL.g:3074:3: rule__MoniLogger__NameAssignment_2
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
    // InternalMoniLog4DSL.g:3082:1: rule__MoniLogger__Group__3 : rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4 ;
    public final void rule__MoniLogger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3086:1: ( rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4 )
            // InternalMoniLog4DSL.g:3087:2: rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4
            {
            pushFollow(FOLLOW_19);
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
    // InternalMoniLog4DSL.g:3094:1: rule__MoniLogger__Group__3__Impl : ( ( rule__MoniLogger__Group_3__0 )? ) ;
    public final void rule__MoniLogger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3098:1: ( ( ( rule__MoniLogger__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:3099:1: ( ( rule__MoniLogger__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:3099:1: ( ( rule__MoniLogger__Group_3__0 )? )
            // InternalMoniLog4DSL.g:3100:2: ( rule__MoniLogger__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:3101:2: ( rule__MoniLogger__Group_3__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoniLog4DSL.g:3101:3: rule__MoniLogger__Group_3__0
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
    // InternalMoniLog4DSL.g:3109:1: rule__MoniLogger__Group__4 : rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5 ;
    public final void rule__MoniLogger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3113:1: ( rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5 )
            // InternalMoniLog4DSL.g:3114:2: rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5
            {
            pushFollow(FOLLOW_19);
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
    // InternalMoniLog4DSL.g:3121:1: rule__MoniLogger__Group__4__Impl : ( ( rule__MoniLogger__Group_4__0 )? ) ;
    public final void rule__MoniLogger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3125:1: ( ( ( rule__MoniLogger__Group_4__0 )? ) )
            // InternalMoniLog4DSL.g:3126:1: ( ( rule__MoniLogger__Group_4__0 )? )
            {
            // InternalMoniLog4DSL.g:3126:1: ( ( rule__MoniLogger__Group_4__0 )? )
            // InternalMoniLog4DSL.g:3127:2: ( rule__MoniLogger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_4()); 
            }
            // InternalMoniLog4DSL.g:3128:2: ( rule__MoniLogger__Group_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==38) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoniLog4DSL.g:3128:3: rule__MoniLogger__Group_4__0
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
    // InternalMoniLog4DSL.g:3136:1: rule__MoniLogger__Group__5 : rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6 ;
    public final void rule__MoniLogger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3140:1: ( rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6 )
            // InternalMoniLog4DSL.g:3141:2: rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6
            {
            pushFollow(FOLLOW_20);
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
    // InternalMoniLog4DSL.g:3148:1: rule__MoniLogger__Group__5__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3152:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3153:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3153:1: ( '{' )
            // InternalMoniLog4DSL.g:3154:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3163:1: rule__MoniLogger__Group__6 : rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7 ;
    public final void rule__MoniLogger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3167:1: ( rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7 )
            // InternalMoniLog4DSL.g:3168:2: rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:3175:1: rule__MoniLogger__Group__6__Impl : ( 'event' ) ;
    public final void rule__MoniLogger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3179:1: ( ( 'event' ) )
            // InternalMoniLog4DSL.g:3180:1: ( 'event' )
            {
            // InternalMoniLog4DSL.g:3180:1: ( 'event' )
            // InternalMoniLog4DSL.g:3181:2: 'event'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getEventKeyword_6()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3190:1: rule__MoniLogger__Group__7 : rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8 ;
    public final void rule__MoniLogger__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3194:1: ( rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8 )
            // InternalMoniLog4DSL.g:3195:2: rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8
            {
            pushFollow(FOLLOW_21);
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
    // InternalMoniLog4DSL.g:3202:1: rule__MoniLogger__Group__7__Impl : ( ( rule__MoniLogger__StreamEventAssignment_7 ) ) ;
    public final void rule__MoniLogger__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3206:1: ( ( ( rule__MoniLogger__StreamEventAssignment_7 ) ) )
            // InternalMoniLog4DSL.g:3207:1: ( ( rule__MoniLogger__StreamEventAssignment_7 ) )
            {
            // InternalMoniLog4DSL.g:3207:1: ( ( rule__MoniLogger__StreamEventAssignment_7 ) )
            // InternalMoniLog4DSL.g:3208:2: ( rule__MoniLogger__StreamEventAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getStreamEventAssignment_7()); 
            }
            // InternalMoniLog4DSL.g:3209:2: ( rule__MoniLogger__StreamEventAssignment_7 )
            // InternalMoniLog4DSL.g:3209:3: rule__MoniLogger__StreamEventAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__StreamEventAssignment_7();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getStreamEventAssignment_7()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3217:1: rule__MoniLogger__Group__8 : rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9 ;
    public final void rule__MoniLogger__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3221:1: ( rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9 )
            // InternalMoniLog4DSL.g:3222:2: rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9
            {
            pushFollow(FOLLOW_21);
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
    // InternalMoniLog4DSL.g:3229:1: rule__MoniLogger__Group__8__Impl : ( ( rule__MoniLogger__Group_8__0 )? ) ;
    public final void rule__MoniLogger__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3233:1: ( ( ( rule__MoniLogger__Group_8__0 )? ) )
            // InternalMoniLog4DSL.g:3234:1: ( ( rule__MoniLogger__Group_8__0 )? )
            {
            // InternalMoniLog4DSL.g:3234:1: ( ( rule__MoniLogger__Group_8__0 )? )
            // InternalMoniLog4DSL.g:3235:2: ( rule__MoniLogger__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_8()); 
            }
            // InternalMoniLog4DSL.g:3236:2: ( rule__MoniLogger__Group_8__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==40) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoniLog4DSL.g:3236:3: rule__MoniLogger__Group_8__0
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
    // InternalMoniLog4DSL.g:3244:1: rule__MoniLogger__Group__9 : rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10 ;
    public final void rule__MoniLogger__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3248:1: ( rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10 )
            // InternalMoniLog4DSL.g:3249:2: rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10
            {
            pushFollow(FOLLOW_22);
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
    // InternalMoniLog4DSL.g:3256:1: rule__MoniLogger__Group__9__Impl : ( 'actions' ) ;
    public final void rule__MoniLogger__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3260:1: ( ( 'actions' ) )
            // InternalMoniLog4DSL.g:3261:1: ( 'actions' )
            {
            // InternalMoniLog4DSL.g:3261:1: ( 'actions' )
            // InternalMoniLog4DSL.g:3262:2: 'actions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsKeyword_9()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3271:1: rule__MoniLogger__Group__10 : rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11 ;
    public final void rule__MoniLogger__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3275:1: ( rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11 )
            // InternalMoniLog4DSL.g:3276:2: rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11
            {
            pushFollow(FOLLOW_23);
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
    // InternalMoniLog4DSL.g:3283:1: rule__MoniLogger__Group__10__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3287:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3288:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3288:1: ( '{' )
            // InternalMoniLog4DSL.g:3289:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_10()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3298:1: rule__MoniLogger__Group__11 : rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12 ;
    public final void rule__MoniLogger__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3302:1: ( rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12 )
            // InternalMoniLog4DSL.g:3303:2: rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12
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
    // InternalMoniLog4DSL.g:3310:1: rule__MoniLogger__Group__11__Impl : ( ( rule__MoniLogger__ActionsAssignment_11 ) ) ;
    public final void rule__MoniLogger__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3314:1: ( ( ( rule__MoniLogger__ActionsAssignment_11 ) ) )
            // InternalMoniLog4DSL.g:3315:1: ( ( rule__MoniLogger__ActionsAssignment_11 ) )
            {
            // InternalMoniLog4DSL.g:3315:1: ( ( rule__MoniLogger__ActionsAssignment_11 ) )
            // InternalMoniLog4DSL.g:3316:2: ( rule__MoniLogger__ActionsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsAssignment_11()); 
            }
            // InternalMoniLog4DSL.g:3317:2: ( rule__MoniLogger__ActionsAssignment_11 )
            // InternalMoniLog4DSL.g:3317:3: rule__MoniLogger__ActionsAssignment_11
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
    // InternalMoniLog4DSL.g:3325:1: rule__MoniLogger__Group__12 : rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13 ;
    public final void rule__MoniLogger__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3329:1: ( rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13 )
            // InternalMoniLog4DSL.g:3330:2: rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13
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
    // InternalMoniLog4DSL.g:3337:1: rule__MoniLogger__Group__12__Impl : ( ( rule__MoniLogger__Group_12__0 )* ) ;
    public final void rule__MoniLogger__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3341:1: ( ( ( rule__MoniLogger__Group_12__0 )* ) )
            // InternalMoniLog4DSL.g:3342:1: ( ( rule__MoniLogger__Group_12__0 )* )
            {
            // InternalMoniLog4DSL.g:3342:1: ( ( rule__MoniLogger__Group_12__0 )* )
            // InternalMoniLog4DSL.g:3343:2: ( rule__MoniLogger__Group_12__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_12()); 
            }
            // InternalMoniLog4DSL.g:3344:2: ( rule__MoniLogger__Group_12__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3344:3: rule__MoniLogger__Group_12__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MoniLogger__Group_12__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // InternalMoniLog4DSL.g:3352:1: rule__MoniLogger__Group__13 : rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14 ;
    public final void rule__MoniLogger__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3356:1: ( rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14 )
            // InternalMoniLog4DSL.g:3357:2: rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14
            {
            pushFollow(FOLLOW_13);
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
    // InternalMoniLog4DSL.g:3364:1: rule__MoniLogger__Group__13__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3368:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3369:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3369:1: ( '}' )
            // InternalMoniLog4DSL.g:3370:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_13()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3379:1: rule__MoniLogger__Group__14 : rule__MoniLogger__Group__14__Impl ;
    public final void rule__MoniLogger__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3383:1: ( rule__MoniLogger__Group__14__Impl )
            // InternalMoniLog4DSL.g:3384:2: rule__MoniLogger__Group__14__Impl
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
    // InternalMoniLog4DSL.g:3390:1: rule__MoniLogger__Group__14__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3394:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3395:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3395:1: ( '}' )
            // InternalMoniLog4DSL.g:3396:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3406:1: rule__MoniLogger__Group_3__0 : rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1 ;
    public final void rule__MoniLogger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3410:1: ( rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1 )
            // InternalMoniLog4DSL.g:3411:2: rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:3418:1: rule__MoniLogger__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MoniLogger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3422:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:3423:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:3423:1: ( '(' )
            // InternalMoniLog4DSL.g:3424:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3433:1: rule__MoniLogger__Group_3__1 : rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2 ;
    public final void rule__MoniLogger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3437:1: ( rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2 )
            // InternalMoniLog4DSL.g:3438:2: rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2
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
    // InternalMoniLog4DSL.g:3445:1: rule__MoniLogger__Group_3__1__Impl : ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) ) ;
    public final void rule__MoniLogger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3449:1: ( ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:3450:1: ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:3450:1: ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:3451:2: ( rule__MoniLogger__ParameterDeclAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParameterDeclAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:3452:2: ( rule__MoniLogger__ParameterDeclAssignment_3_1 )
            // InternalMoniLog4DSL.g:3452:3: rule__MoniLogger__ParameterDeclAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__ParameterDeclAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getParameterDeclAssignment_3_1()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3460:1: rule__MoniLogger__Group_3__2 : rule__MoniLogger__Group_3__2__Impl ;
    public final void rule__MoniLogger__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3464:1: ( rule__MoniLogger__Group_3__2__Impl )
            // InternalMoniLog4DSL.g:3465:2: rule__MoniLogger__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_3__2__Impl();

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
    // InternalMoniLog4DSL.g:3471:1: rule__MoniLogger__Group_3__2__Impl : ( ')' ) ;
    public final void rule__MoniLogger__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3475:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:3476:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:3476:1: ( ')' )
            // InternalMoniLog4DSL.g:3477:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MoniLogger__Group_4__0"
    // InternalMoniLog4DSL.g:3487:1: rule__MoniLogger__Group_4__0 : rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1 ;
    public final void rule__MoniLogger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3491:1: ( rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1 )
            // InternalMoniLog4DSL.g:3492:2: rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1
            {
            pushFollow(FOLLOW_24);
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
    // InternalMoniLog4DSL.g:3499:1: rule__MoniLogger__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MoniLogger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3503:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:3504:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:3504:1: ( '[' )
            // InternalMoniLog4DSL.g:3505:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftSquareBracketKeyword_4_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3514:1: rule__MoniLogger__Group_4__1 : rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2 ;
    public final void rule__MoniLogger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3518:1: ( rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2 )
            // InternalMoniLog4DSL.g:3519:2: rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2
            {
            pushFollow(FOLLOW_25);
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
    // InternalMoniLog4DSL.g:3526:1: rule__MoniLogger__Group_4__1__Impl : ( ( rule__MoniLogger__LevelAssignment_4_1 ) ) ;
    public final void rule__MoniLogger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3530:1: ( ( ( rule__MoniLogger__LevelAssignment_4_1 ) ) )
            // InternalMoniLog4DSL.g:3531:1: ( ( rule__MoniLogger__LevelAssignment_4_1 ) )
            {
            // InternalMoniLog4DSL.g:3531:1: ( ( rule__MoniLogger__LevelAssignment_4_1 ) )
            // InternalMoniLog4DSL.g:3532:2: ( rule__MoniLogger__LevelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLevelAssignment_4_1()); 
            }
            // InternalMoniLog4DSL.g:3533:2: ( rule__MoniLogger__LevelAssignment_4_1 )
            // InternalMoniLog4DSL.g:3533:3: rule__MoniLogger__LevelAssignment_4_1
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
    // InternalMoniLog4DSL.g:3541:1: rule__MoniLogger__Group_4__2 : rule__MoniLogger__Group_4__2__Impl ;
    public final void rule__MoniLogger__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3545:1: ( rule__MoniLogger__Group_4__2__Impl )
            // InternalMoniLog4DSL.g:3546:2: rule__MoniLogger__Group_4__2__Impl
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
    // InternalMoniLog4DSL.g:3552:1: rule__MoniLogger__Group_4__2__Impl : ( ']' ) ;
    public final void rule__MoniLogger__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3556:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:3557:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:3557:1: ( ']' )
            // InternalMoniLog4DSL.g:3558:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightSquareBracketKeyword_4_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3568:1: rule__MoniLogger__Group_8__0 : rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1 ;
    public final void rule__MoniLogger__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3572:1: ( rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1 )
            // InternalMoniLog4DSL.g:3573:2: rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMoniLog4DSL.g:3580:1: rule__MoniLogger__Group_8__0__Impl : ( 'conditions' ) ;
    public final void rule__MoniLogger__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3584:1: ( ( 'conditions' ) )
            // InternalMoniLog4DSL.g:3585:1: ( 'conditions' )
            {
            // InternalMoniLog4DSL.g:3585:1: ( 'conditions' )
            // InternalMoniLog4DSL.g:3586:2: 'conditions'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsKeyword_8_0()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3595:1: rule__MoniLogger__Group_8__1 : rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2 ;
    public final void rule__MoniLogger__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3599:1: ( rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2 )
            // InternalMoniLog4DSL.g:3600:2: rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:3607:1: rule__MoniLogger__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3611:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3612:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3612:1: ( '{' )
            // InternalMoniLog4DSL.g:3613:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftCurlyBracketKeyword_8_1()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3622:1: rule__MoniLogger__Group_8__2 : rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3 ;
    public final void rule__MoniLogger__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3626:1: ( rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3 )
            // InternalMoniLog4DSL.g:3627:2: rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3
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
    // InternalMoniLog4DSL.g:3634:1: rule__MoniLogger__Group_8__2__Impl : ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) ) ;
    public final void rule__MoniLogger__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3638:1: ( ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) ) )
            // InternalMoniLog4DSL.g:3639:1: ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) )
            {
            // InternalMoniLog4DSL.g:3639:1: ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) )
            // InternalMoniLog4DSL.g:3640:2: ( rule__MoniLogger__ConditionsAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_2()); 
            }
            // InternalMoniLog4DSL.g:3641:2: ( rule__MoniLogger__ConditionsAssignment_8_2 )
            // InternalMoniLog4DSL.g:3641:3: rule__MoniLogger__ConditionsAssignment_8_2
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
    // InternalMoniLog4DSL.g:3649:1: rule__MoniLogger__Group_8__3 : rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4 ;
    public final void rule__MoniLogger__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3653:1: ( rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4 )
            // InternalMoniLog4DSL.g:3654:2: rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4
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
    // InternalMoniLog4DSL.g:3661:1: rule__MoniLogger__Group_8__3__Impl : ( ( rule__MoniLogger__Group_8_3__0 )* ) ;
    public final void rule__MoniLogger__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3665:1: ( ( ( rule__MoniLogger__Group_8_3__0 )* ) )
            // InternalMoniLog4DSL.g:3666:1: ( ( rule__MoniLogger__Group_8_3__0 )* )
            {
            // InternalMoniLog4DSL.g:3666:1: ( ( rule__MoniLogger__Group_8_3__0 )* )
            // InternalMoniLog4DSL.g:3667:2: ( rule__MoniLogger__Group_8_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_8_3()); 
            }
            // InternalMoniLog4DSL.g:3668:2: ( rule__MoniLogger__Group_8_3__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==31) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:3668:3: rule__MoniLogger__Group_8_3__0
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
    // InternalMoniLog4DSL.g:3676:1: rule__MoniLogger__Group_8__4 : rule__MoniLogger__Group_8__4__Impl ;
    public final void rule__MoniLogger__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3680:1: ( rule__MoniLogger__Group_8__4__Impl )
            // InternalMoniLog4DSL.g:3681:2: rule__MoniLogger__Group_8__4__Impl
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
    // InternalMoniLog4DSL.g:3687:1: rule__MoniLogger__Group_8__4__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3691:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:3692:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:3692:1: ( '}' )
            // InternalMoniLog4DSL.g:3693:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_4()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:3703:1: rule__MoniLogger__Group_8_3__0 : rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1 ;
    public final void rule__MoniLogger__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3707:1: ( rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1 )
            // InternalMoniLog4DSL.g:3708:2: rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:3715:1: rule__MoniLogger__Group_8_3__0__Impl : ( ';' ) ;
    public final void rule__MoniLogger__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3719:1: ( ( ';' ) )
            // InternalMoniLog4DSL.g:3720:1: ( ';' )
            {
            // InternalMoniLog4DSL.g:3720:1: ( ';' )
            // InternalMoniLog4DSL.g:3721:2: ';'
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
    // InternalMoniLog4DSL.g:3730:1: rule__MoniLogger__Group_8_3__1 : rule__MoniLogger__Group_8_3__1__Impl ;
    public final void rule__MoniLogger__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3734:1: ( rule__MoniLogger__Group_8_3__1__Impl )
            // InternalMoniLog4DSL.g:3735:2: rule__MoniLogger__Group_8_3__1__Impl
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
    // InternalMoniLog4DSL.g:3741:1: rule__MoniLogger__Group_8_3__1__Impl : ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) ) ;
    public final void rule__MoniLogger__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3745:1: ( ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) ) )
            // InternalMoniLog4DSL.g:3746:1: ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) )
            {
            // InternalMoniLog4DSL.g:3746:1: ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) )
            // InternalMoniLog4DSL.g:3747:2: ( rule__MoniLogger__ConditionsAssignment_8_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_3_1()); 
            }
            // InternalMoniLog4DSL.g:3748:2: ( rule__MoniLogger__ConditionsAssignment_8_3_1 )
            // InternalMoniLog4DSL.g:3748:3: rule__MoniLogger__ConditionsAssignment_8_3_1
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
    // InternalMoniLog4DSL.g:3757:1: rule__MoniLogger__Group_12__0 : rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1 ;
    public final void rule__MoniLogger__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3761:1: ( rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1 )
            // InternalMoniLog4DSL.g:3762:2: rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1
            {
            pushFollow(FOLLOW_23);
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
    // InternalMoniLog4DSL.g:3769:1: rule__MoniLogger__Group_12__0__Impl : ( ';' ) ;
    public final void rule__MoniLogger__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3773:1: ( ( ';' ) )
            // InternalMoniLog4DSL.g:3774:1: ( ';' )
            {
            // InternalMoniLog4DSL.g:3774:1: ( ';' )
            // InternalMoniLog4DSL.g:3775:2: ';'
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
    // InternalMoniLog4DSL.g:3784:1: rule__MoniLogger__Group_12__1 : rule__MoniLogger__Group_12__1__Impl ;
    public final void rule__MoniLogger__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3788:1: ( rule__MoniLogger__Group_12__1__Impl )
            // InternalMoniLog4DSL.g:3789:2: rule__MoniLogger__Group_12__1__Impl
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
    // InternalMoniLog4DSL.g:3795:1: rule__MoniLogger__Group_12__1__Impl : ( ( rule__MoniLogger__ActionsAssignment_12_1 ) ) ;
    public final void rule__MoniLogger__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3799:1: ( ( ( rule__MoniLogger__ActionsAssignment_12_1 ) ) )
            // InternalMoniLog4DSL.g:3800:1: ( ( rule__MoniLogger__ActionsAssignment_12_1 ) )
            {
            // InternalMoniLog4DSL.g:3800:1: ( ( rule__MoniLogger__ActionsAssignment_12_1 ) )
            // InternalMoniLog4DSL.g:3801:2: ( rule__MoniLogger__ActionsAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsAssignment_12_1()); 
            }
            // InternalMoniLog4DSL.g:3802:2: ( rule__MoniLogger__ActionsAssignment_12_1 )
            // InternalMoniLog4DSL.g:3802:3: rule__MoniLogger__ActionsAssignment_12_1
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


    // $ANTLR start "rule__Event__Group_0__0"
    // InternalMoniLog4DSL.g:3811:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3815:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalMoniLog4DSL.g:3816:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Event__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__1();

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
    // $ANTLR end "rule__Event__Group_0__0"


    // $ANTLR start "rule__Event__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:3823:1: rule__Event__Group_0__0__Impl : ( () ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3827:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3828:1: ( () )
            {
            // InternalMoniLog4DSL.g:3828:1: ( () )
            // InternalMoniLog4DSL.g:3829:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getASTEventAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:3830:2: ()
            // InternalMoniLog4DSL.g:3830:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getASTEventAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__0__Impl"


    // $ANTLR start "rule__Event__Group_0__1"
    // InternalMoniLog4DSL.g:3838:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3842:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // InternalMoniLog4DSL.g:3843:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__2();

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
    // $ANTLR end "rule__Event__Group_0__1"


    // $ANTLR start "rule__Event__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:3850:1: rule__Event__Group_0__1__Impl : ( 'call' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3854:1: ( ( 'call' ) )
            // InternalMoniLog4DSL.g:3855:1: ( 'call' )
            {
            // InternalMoniLog4DSL.g:3855:1: ( 'call' )
            // InternalMoniLog4DSL.g:3856:2: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCallKeyword_0_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getCallKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__1__Impl"


    // $ANTLR start "rule__Event__Group_0__2"
    // InternalMoniLog4DSL.g:3865:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl rule__Event__Group_0__3 ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3869:1: ( rule__Event__Group_0__2__Impl rule__Event__Group_0__3 )
            // InternalMoniLog4DSL.g:3870:2: rule__Event__Group_0__2__Impl rule__Event__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__3();

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
    // $ANTLR end "rule__Event__Group_0__2"


    // $ANTLR start "rule__Event__Group_0__2__Impl"
    // InternalMoniLog4DSL.g:3877:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__NameAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3881:1: ( ( ( rule__Event__NameAssignment_0_2 ) ) )
            // InternalMoniLog4DSL.g:3882:1: ( ( rule__Event__NameAssignment_0_2 ) )
            {
            // InternalMoniLog4DSL.g:3882:1: ( ( rule__Event__NameAssignment_0_2 ) )
            // InternalMoniLog4DSL.g:3883:2: ( rule__Event__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_0_2()); 
            }
            // InternalMoniLog4DSL.g:3884:2: ( rule__Event__NameAssignment_0_2 )
            // InternalMoniLog4DSL.g:3884:3: rule__Event__NameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameAssignment_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__2__Impl"


    // $ANTLR start "rule__Event__Group_0__3"
    // InternalMoniLog4DSL.g:3892:1: rule__Event__Group_0__3 : rule__Event__Group_0__3__Impl rule__Event__Group_0__4 ;
    public final void rule__Event__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3896:1: ( rule__Event__Group_0__3__Impl rule__Event__Group_0__4 )
            // InternalMoniLog4DSL.g:3897:2: rule__Event__Group_0__3__Impl rule__Event__Group_0__4
            {
            pushFollow(FOLLOW_8);
            rule__Event__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__4();

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
    // $ANTLR end "rule__Event__Group_0__3"


    // $ANTLR start "rule__Event__Group_0__3__Impl"
    // InternalMoniLog4DSL.g:3904:1: rule__Event__Group_0__3__Impl : ( ( rule__Event__Group_0_3__0 )? ) ;
    public final void rule__Event__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3908:1: ( ( ( rule__Event__Group_0_3__0 )? ) )
            // InternalMoniLog4DSL.g:3909:1: ( ( rule__Event__Group_0_3__0 )? )
            {
            // InternalMoniLog4DSL.g:3909:1: ( ( rule__Event__Group_0_3__0 )? )
            // InternalMoniLog4DSL.g:3910:2: ( rule__Event__Group_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_0_3()); 
            }
            // InternalMoniLog4DSL.g:3911:2: ( rule__Event__Group_0_3__0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==29) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoniLog4DSL.g:3911:3: rule__Event__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_0_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__3__Impl"


    // $ANTLR start "rule__Event__Group_0__4"
    // InternalMoniLog4DSL.g:3919:1: rule__Event__Group_0__4 : rule__Event__Group_0__4__Impl rule__Event__Group_0__5 ;
    public final void rule__Event__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3923:1: ( rule__Event__Group_0__4__Impl rule__Event__Group_0__5 )
            // InternalMoniLog4DSL.g:3924:2: rule__Event__Group_0__4__Impl rule__Event__Group_0__5
            {
            pushFollow(FOLLOW_27);
            rule__Event__Group_0__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__5();

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
    // $ANTLR end "rule__Event__Group_0__4"


    // $ANTLR start "rule__Event__Group_0__4__Impl"
    // InternalMoniLog4DSL.g:3931:1: rule__Event__Group_0__4__Impl : ( '{' ) ;
    public final void rule__Event__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3935:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:3936:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:3936:1: ( '{' )
            // InternalMoniLog4DSL.g:3937:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_0_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__4__Impl"


    // $ANTLR start "rule__Event__Group_0__5"
    // InternalMoniLog4DSL.g:3946:1: rule__Event__Group_0__5 : rule__Event__Group_0__5__Impl rule__Event__Group_0__6 ;
    public final void rule__Event__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3950:1: ( rule__Event__Group_0__5__Impl rule__Event__Group_0__6 )
            // InternalMoniLog4DSL.g:3951:2: rule__Event__Group_0__5__Impl rule__Event__Group_0__6
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_0__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__6();

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
    // $ANTLR end "rule__Event__Group_0__5"


    // $ANTLR start "rule__Event__Group_0__5__Impl"
    // InternalMoniLog4DSL.g:3958:1: rule__Event__Group_0__5__Impl : ( ( rule__Event__KindAssignment_0_5 ) ) ;
    public final void rule__Event__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3962:1: ( ( ( rule__Event__KindAssignment_0_5 ) ) )
            // InternalMoniLog4DSL.g:3963:1: ( ( rule__Event__KindAssignment_0_5 ) )
            {
            // InternalMoniLog4DSL.g:3963:1: ( ( rule__Event__KindAssignment_0_5 ) )
            // InternalMoniLog4DSL.g:3964:2: ( rule__Event__KindAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindAssignment_0_5()); 
            }
            // InternalMoniLog4DSL.g:3965:2: ( rule__Event__KindAssignment_0_5 )
            // InternalMoniLog4DSL.g:3965:3: rule__Event__KindAssignment_0_5
            {
            pushFollow(FOLLOW_2);
            rule__Event__KindAssignment_0_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getKindAssignment_0_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__5__Impl"


    // $ANTLR start "rule__Event__Group_0__6"
    // InternalMoniLog4DSL.g:3973:1: rule__Event__Group_0__6 : rule__Event__Group_0__6__Impl rule__Event__Group_0__7 ;
    public final void rule__Event__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3977:1: ( rule__Event__Group_0__6__Impl rule__Event__Group_0__7 )
            // InternalMoniLog4DSL.g:3978:2: rule__Event__Group_0__6__Impl rule__Event__Group_0__7
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_0__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__7();

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
    // $ANTLR end "rule__Event__Group_0__6"


    // $ANTLR start "rule__Event__Group_0__6__Impl"
    // InternalMoniLog4DSL.g:3985:1: rule__Event__Group_0__6__Impl : ( ( rule__Event__RuleIDAssignment_0_6 ) ) ;
    public final void rule__Event__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3989:1: ( ( ( rule__Event__RuleIDAssignment_0_6 ) ) )
            // InternalMoniLog4DSL.g:3990:1: ( ( rule__Event__RuleIDAssignment_0_6 ) )
            {
            // InternalMoniLog4DSL.g:3990:1: ( ( rule__Event__RuleIDAssignment_0_6 ) )
            // InternalMoniLog4DSL.g:3991:2: ( rule__Event__RuleIDAssignment_0_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRuleIDAssignment_0_6()); 
            }
            // InternalMoniLog4DSL.g:3992:2: ( rule__Event__RuleIDAssignment_0_6 )
            // InternalMoniLog4DSL.g:3992:3: rule__Event__RuleIDAssignment_0_6
            {
            pushFollow(FOLLOW_2);
            rule__Event__RuleIDAssignment_0_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRuleIDAssignment_0_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__6__Impl"


    // $ANTLR start "rule__Event__Group_0__7"
    // InternalMoniLog4DSL.g:4000:1: rule__Event__Group_0__7 : rule__Event__Group_0__7__Impl ;
    public final void rule__Event__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4004:1: ( rule__Event__Group_0__7__Impl )
            // InternalMoniLog4DSL.g:4005:2: rule__Event__Group_0__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0__7__Impl();

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
    // $ANTLR end "rule__Event__Group_0__7"


    // $ANTLR start "rule__Event__Group_0__7__Impl"
    // InternalMoniLog4DSL.g:4011:1: rule__Event__Group_0__7__Impl : ( '}' ) ;
    public final void rule__Event__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4015:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:4016:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:4016:1: ( '}' )
            // InternalMoniLog4DSL.g:4017:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_0_7()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_0_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0__7__Impl"


    // $ANTLR start "rule__Event__Group_0_3__0"
    // InternalMoniLog4DSL.g:4027:1: rule__Event__Group_0_3__0 : rule__Event__Group_0_3__0__Impl rule__Event__Group_0_3__1 ;
    public final void rule__Event__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4031:1: ( rule__Event__Group_0_3__0__Impl rule__Event__Group_0_3__1 )
            // InternalMoniLog4DSL.g:4032:2: rule__Event__Group_0_3__0__Impl rule__Event__Group_0_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_0_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_3__1();

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
    // $ANTLR end "rule__Event__Group_0_3__0"


    // $ANTLR start "rule__Event__Group_0_3__0__Impl"
    // InternalMoniLog4DSL.g:4039:1: rule__Event__Group_0_3__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4043:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4044:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4044:1: ( '(' )
            // InternalMoniLog4DSL.g:4045:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_3__0__Impl"


    // $ANTLR start "rule__Event__Group_0_3__1"
    // InternalMoniLog4DSL.g:4054:1: rule__Event__Group_0_3__1 : rule__Event__Group_0_3__1__Impl rule__Event__Group_0_3__2 ;
    public final void rule__Event__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4058:1: ( rule__Event__Group_0_3__1__Impl rule__Event__Group_0_3__2 )
            // InternalMoniLog4DSL.g:4059:2: rule__Event__Group_0_3__1__Impl rule__Event__Group_0_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_0_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_3__2();

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
    // $ANTLR end "rule__Event__Group_0_3__1"


    // $ANTLR start "rule__Event__Group_0_3__1__Impl"
    // InternalMoniLog4DSL.g:4066:1: rule__Event__Group_0_3__1__Impl : ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) ) ;
    public final void rule__Event__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4070:1: ( ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) ) )
            // InternalMoniLog4DSL.g:4071:1: ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) )
            {
            // InternalMoniLog4DSL.g:4071:1: ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) )
            // InternalMoniLog4DSL.g:4072:2: ( rule__Event__ParameterDeclAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclAssignment_0_3_1()); 
            }
            // InternalMoniLog4DSL.g:4073:2: ( rule__Event__ParameterDeclAssignment_0_3_1 )
            // InternalMoniLog4DSL.g:4073:3: rule__Event__ParameterDeclAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ParameterDeclAssignment_0_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParameterDeclAssignment_0_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_3__1__Impl"


    // $ANTLR start "rule__Event__Group_0_3__2"
    // InternalMoniLog4DSL.g:4081:1: rule__Event__Group_0_3__2 : rule__Event__Group_0_3__2__Impl ;
    public final void rule__Event__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4085:1: ( rule__Event__Group_0_3__2__Impl )
            // InternalMoniLog4DSL.g:4086:2: rule__Event__Group_0_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_0_3__2__Impl();

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
    // $ANTLR end "rule__Event__Group_0_3__2"


    // $ANTLR start "rule__Event__Group_0_3__2__Impl"
    // InternalMoniLog4DSL.g:4092:1: rule__Event__Group_0_3__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4096:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4097:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4097:1: ( ')' )
            // InternalMoniLog4DSL.g:4098:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_0_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightParenthesisKeyword_0_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_0_3__2__Impl"


    // $ANTLR start "rule__Event__Group_1__0"
    // InternalMoniLog4DSL.g:4108:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4112:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalMoniLog4DSL.g:4113:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
            {
            pushFollow(FOLLOW_28);
            rule__Event__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__1();

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
    // $ANTLR end "rule__Event__Group_1__0"


    // $ANTLR start "rule__Event__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:4120:1: rule__Event__Group_1__0__Impl : ( () ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4124:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4125:1: ( () )
            {
            // InternalMoniLog4DSL.g:4125:1: ( () )
            // InternalMoniLog4DSL.g:4126:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getComplexEventAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:4127:2: ()
            // InternalMoniLog4DSL.g:4127:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getComplexEventAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__0__Impl"


    // $ANTLR start "rule__Event__Group_1__1"
    // InternalMoniLog4DSL.g:4135:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4139:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // InternalMoniLog4DSL.g:4140:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__2();

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
    // $ANTLR end "rule__Event__Group_1__1"


    // $ANTLR start "rule__Event__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:4147:1: rule__Event__Group_1__1__Impl : ( 'complex' ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4151:1: ( ( 'complex' ) )
            // InternalMoniLog4DSL.g:4152:1: ( 'complex' )
            {
            // InternalMoniLog4DSL.g:4152:1: ( 'complex' )
            // InternalMoniLog4DSL.g:4153:2: 'complex'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getComplexKeyword_1_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getComplexKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__1__Impl"


    // $ANTLR start "rule__Event__Group_1__2"
    // InternalMoniLog4DSL.g:4162:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4166:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // InternalMoniLog4DSL.g:4167:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
            {
            pushFollow(FOLLOW_19);
            rule__Event__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__3();

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
    // $ANTLR end "rule__Event__Group_1__2"


    // $ANTLR start "rule__Event__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:4174:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__NameAssignment_1_2 ) ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4178:1: ( ( ( rule__Event__NameAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:4179:1: ( ( rule__Event__NameAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:4179:1: ( ( rule__Event__NameAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:4180:2: ( rule__Event__NameAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_1_2()); 
            }
            // InternalMoniLog4DSL.g:4181:2: ( rule__Event__NameAssignment_1_2 )
            // InternalMoniLog4DSL.g:4181:3: rule__Event__NameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__2__Impl"


    // $ANTLR start "rule__Event__Group_1__3"
    // InternalMoniLog4DSL.g:4189:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl rule__Event__Group_1__4 ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4193:1: ( rule__Event__Group_1__3__Impl rule__Event__Group_1__4 )
            // InternalMoniLog4DSL.g:4194:2: rule__Event__Group_1__3__Impl rule__Event__Group_1__4
            {
            pushFollow(FOLLOW_19);
            rule__Event__Group_1__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__4();

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
    // $ANTLR end "rule__Event__Group_1__3"


    // $ANTLR start "rule__Event__Group_1__3__Impl"
    // InternalMoniLog4DSL.g:4201:1: rule__Event__Group_1__3__Impl : ( ( rule__Event__Group_1_3__0 )? ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4205:1: ( ( ( rule__Event__Group_1_3__0 )? ) )
            // InternalMoniLog4DSL.g:4206:1: ( ( rule__Event__Group_1_3__0 )? )
            {
            // InternalMoniLog4DSL.g:4206:1: ( ( rule__Event__Group_1_3__0 )? )
            // InternalMoniLog4DSL.g:4207:2: ( rule__Event__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1_3()); 
            }
            // InternalMoniLog4DSL.g:4208:2: ( rule__Event__Group_1_3__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==38) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoniLog4DSL.g:4208:3: rule__Event__Group_1_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__3__Impl"


    // $ANTLR start "rule__Event__Group_1__4"
    // InternalMoniLog4DSL.g:4216:1: rule__Event__Group_1__4 : rule__Event__Group_1__4__Impl rule__Event__Group_1__5 ;
    public final void rule__Event__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4220:1: ( rule__Event__Group_1__4__Impl rule__Event__Group_1__5 )
            // InternalMoniLog4DSL.g:4221:2: rule__Event__Group_1__4__Impl rule__Event__Group_1__5
            {
            pushFollow(FOLLOW_19);
            rule__Event__Group_1__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__5();

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
    // $ANTLR end "rule__Event__Group_1__4"


    // $ANTLR start "rule__Event__Group_1__4__Impl"
    // InternalMoniLog4DSL.g:4228:1: rule__Event__Group_1__4__Impl : ( ( rule__Event__Group_1_4__0 )? ) ;
    public final void rule__Event__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4232:1: ( ( ( rule__Event__Group_1_4__0 )? ) )
            // InternalMoniLog4DSL.g:4233:1: ( ( rule__Event__Group_1_4__0 )? )
            {
            // InternalMoniLog4DSL.g:4233:1: ( ( rule__Event__Group_1_4__0 )? )
            // InternalMoniLog4DSL.g:4234:2: ( rule__Event__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1_4()); 
            }
            // InternalMoniLog4DSL.g:4235:2: ( rule__Event__Group_1_4__0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoniLog4DSL.g:4235:3: rule__Event__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_1_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_1_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__4__Impl"


    // $ANTLR start "rule__Event__Group_1__5"
    // InternalMoniLog4DSL.g:4243:1: rule__Event__Group_1__5 : rule__Event__Group_1__5__Impl rule__Event__Group_1__6 ;
    public final void rule__Event__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4247:1: ( rule__Event__Group_1__5__Impl rule__Event__Group_1__6 )
            // InternalMoniLog4DSL.g:4248:2: rule__Event__Group_1__5__Impl rule__Event__Group_1__6
            {
            pushFollow(FOLLOW_29);
            rule__Event__Group_1__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__6();

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
    // $ANTLR end "rule__Event__Group_1__5"


    // $ANTLR start "rule__Event__Group_1__5__Impl"
    // InternalMoniLog4DSL.g:4255:1: rule__Event__Group_1__5__Impl : ( '{' ) ;
    public final void rule__Event__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4259:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:4260:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:4260:1: ( '{' )
            // InternalMoniLog4DSL.g:4261:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftCurlyBracketKeyword_1_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__5__Impl"


    // $ANTLR start "rule__Event__Group_1__6"
    // InternalMoniLog4DSL.g:4270:1: rule__Event__Group_1__6 : rule__Event__Group_1__6__Impl rule__Event__Group_1__7 ;
    public final void rule__Event__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4274:1: ( rule__Event__Group_1__6__Impl rule__Event__Group_1__7 )
            // InternalMoniLog4DSL.g:4275:2: rule__Event__Group_1__6__Impl rule__Event__Group_1__7
            {
            pushFollow(FOLLOW_13);
            rule__Event__Group_1__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__7();

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
    // $ANTLR end "rule__Event__Group_1__6"


    // $ANTLR start "rule__Event__Group_1__6__Impl"
    // InternalMoniLog4DSL.g:4282:1: rule__Event__Group_1__6__Impl : ( ( rule__Event__PatternAssignment_1_6 ) ) ;
    public final void rule__Event__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4286:1: ( ( ( rule__Event__PatternAssignment_1_6 ) ) )
            // InternalMoniLog4DSL.g:4287:1: ( ( rule__Event__PatternAssignment_1_6 ) )
            {
            // InternalMoniLog4DSL.g:4287:1: ( ( rule__Event__PatternAssignment_1_6 ) )
            // InternalMoniLog4DSL.g:4288:2: ( rule__Event__PatternAssignment_1_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getPatternAssignment_1_6()); 
            }
            // InternalMoniLog4DSL.g:4289:2: ( rule__Event__PatternAssignment_1_6 )
            // InternalMoniLog4DSL.g:4289:3: rule__Event__PatternAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Event__PatternAssignment_1_6();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getPatternAssignment_1_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__6__Impl"


    // $ANTLR start "rule__Event__Group_1__7"
    // InternalMoniLog4DSL.g:4297:1: rule__Event__Group_1__7 : rule__Event__Group_1__7__Impl ;
    public final void rule__Event__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4301:1: ( rule__Event__Group_1__7__Impl )
            // InternalMoniLog4DSL.g:4302:2: rule__Event__Group_1__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1__7__Impl();

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
    // $ANTLR end "rule__Event__Group_1__7"


    // $ANTLR start "rule__Event__Group_1__7__Impl"
    // InternalMoniLog4DSL.g:4308:1: rule__Event__Group_1__7__Impl : ( '}' ) ;
    public final void rule__Event__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4312:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:4313:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:4313:1: ( '}' )
            // InternalMoniLog4DSL.g:4314:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_1_7()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_1_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1__7__Impl"


    // $ANTLR start "rule__Event__Group_1_3__0"
    // InternalMoniLog4DSL.g:4324:1: rule__Event__Group_1_3__0 : rule__Event__Group_1_3__0__Impl rule__Event__Group_1_3__1 ;
    public final void rule__Event__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4328:1: ( rule__Event__Group_1_3__0__Impl rule__Event__Group_1_3__1 )
            // InternalMoniLog4DSL.g:4329:2: rule__Event__Group_1_3__0__Impl rule__Event__Group_1_3__1
            {
            pushFollow(FOLLOW_30);
            rule__Event__Group_1_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_3__1();

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
    // $ANTLR end "rule__Event__Group_1_3__0"


    // $ANTLR start "rule__Event__Group_1_3__0__Impl"
    // InternalMoniLog4DSL.g:4336:1: rule__Event__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__Event__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4340:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:4341:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:4341:1: ( '[' )
            // InternalMoniLog4DSL.g:4342:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_3_0()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftSquareBracketKeyword_1_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_3__0__Impl"


    // $ANTLR start "rule__Event__Group_1_3__1"
    // InternalMoniLog4DSL.g:4351:1: rule__Event__Group_1_3__1 : rule__Event__Group_1_3__1__Impl rule__Event__Group_1_3__2 ;
    public final void rule__Event__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4355:1: ( rule__Event__Group_1_3__1__Impl rule__Event__Group_1_3__2 )
            // InternalMoniLog4DSL.g:4356:2: rule__Event__Group_1_3__1__Impl rule__Event__Group_1_3__2
            {
            pushFollow(FOLLOW_25);
            rule__Event__Group_1_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_3__2();

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
    // $ANTLR end "rule__Event__Group_1_3__1"


    // $ANTLR start "rule__Event__Group_1_3__1__Impl"
    // InternalMoniLog4DSL.g:4363:1: rule__Event__Group_1_3__1__Impl : ( ( rule__Event__KindAssignment_1_3_1 ) ) ;
    public final void rule__Event__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4367:1: ( ( ( rule__Event__KindAssignment_1_3_1 ) ) )
            // InternalMoniLog4DSL.g:4368:1: ( ( rule__Event__KindAssignment_1_3_1 ) )
            {
            // InternalMoniLog4DSL.g:4368:1: ( ( rule__Event__KindAssignment_1_3_1 ) )
            // InternalMoniLog4DSL.g:4369:2: ( rule__Event__KindAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindAssignment_1_3_1()); 
            }
            // InternalMoniLog4DSL.g:4370:2: ( rule__Event__KindAssignment_1_3_1 )
            // InternalMoniLog4DSL.g:4370:3: rule__Event__KindAssignment_1_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__KindAssignment_1_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getKindAssignment_1_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_3__1__Impl"


    // $ANTLR start "rule__Event__Group_1_3__2"
    // InternalMoniLog4DSL.g:4378:1: rule__Event__Group_1_3__2 : rule__Event__Group_1_3__2__Impl ;
    public final void rule__Event__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4382:1: ( rule__Event__Group_1_3__2__Impl )
            // InternalMoniLog4DSL.g:4383:2: rule__Event__Group_1_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_3__2__Impl();

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
    // $ANTLR end "rule__Event__Group_1_3__2"


    // $ANTLR start "rule__Event__Group_1_3__2__Impl"
    // InternalMoniLog4DSL.g:4389:1: rule__Event__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__Event__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4393:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:4394:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:4394:1: ( ']' )
            // InternalMoniLog4DSL.g:4395:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_3_2()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightSquareBracketKeyword_1_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_3__2__Impl"


    // $ANTLR start "rule__Event__Group_1_4__0"
    // InternalMoniLog4DSL.g:4405:1: rule__Event__Group_1_4__0 : rule__Event__Group_1_4__0__Impl rule__Event__Group_1_4__1 ;
    public final void rule__Event__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4409:1: ( rule__Event__Group_1_4__0__Impl rule__Event__Group_1_4__1 )
            // InternalMoniLog4DSL.g:4410:2: rule__Event__Group_1_4__0__Impl rule__Event__Group_1_4__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_1_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_4__1();

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
    // $ANTLR end "rule__Event__Group_1_4__0"


    // $ANTLR start "rule__Event__Group_1_4__0__Impl"
    // InternalMoniLog4DSL.g:4417:1: rule__Event__Group_1_4__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4421:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4422:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4422:1: ( '(' )
            // InternalMoniLog4DSL.g:4423:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_4_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_4__0__Impl"


    // $ANTLR start "rule__Event__Group_1_4__1"
    // InternalMoniLog4DSL.g:4432:1: rule__Event__Group_1_4__1 : rule__Event__Group_1_4__1__Impl rule__Event__Group_1_4__2 ;
    public final void rule__Event__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4436:1: ( rule__Event__Group_1_4__1__Impl rule__Event__Group_1_4__2 )
            // InternalMoniLog4DSL.g:4437:2: rule__Event__Group_1_4__1__Impl rule__Event__Group_1_4__2
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_1_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_4__2();

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
    // $ANTLR end "rule__Event__Group_1_4__1"


    // $ANTLR start "rule__Event__Group_1_4__1__Impl"
    // InternalMoniLog4DSL.g:4444:1: rule__Event__Group_1_4__1__Impl : ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) ) ;
    public final void rule__Event__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4448:1: ( ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) ) )
            // InternalMoniLog4DSL.g:4449:1: ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) )
            {
            // InternalMoniLog4DSL.g:4449:1: ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) )
            // InternalMoniLog4DSL.g:4450:2: ( rule__Event__ParameterDeclAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclAssignment_1_4_1()); 
            }
            // InternalMoniLog4DSL.g:4451:2: ( rule__Event__ParameterDeclAssignment_1_4_1 )
            // InternalMoniLog4DSL.g:4451:3: rule__Event__ParameterDeclAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ParameterDeclAssignment_1_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParameterDeclAssignment_1_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_4__1__Impl"


    // $ANTLR start "rule__Event__Group_1_4__2"
    // InternalMoniLog4DSL.g:4459:1: rule__Event__Group_1_4__2 : rule__Event__Group_1_4__2__Impl ;
    public final void rule__Event__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4463:1: ( rule__Event__Group_1_4__2__Impl )
            // InternalMoniLog4DSL.g:4464:2: rule__Event__Group_1_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_1_4__2__Impl();

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
    // $ANTLR end "rule__Event__Group_1_4__2"


    // $ANTLR start "rule__Event__Group_1_4__2__Impl"
    // InternalMoniLog4DSL.g:4470:1: rule__Event__Group_1_4__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4474:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4475:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4475:1: ( ')' )
            // InternalMoniLog4DSL.g:4476:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_4_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_1_4__2__Impl"


    // $ANTLR start "rule__Event__Group_2__0"
    // InternalMoniLog4DSL.g:4486:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4490:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalMoniLog4DSL.g:4491:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__Event__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__1();

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
    // $ANTLR end "rule__Event__Group_2__0"


    // $ANTLR start "rule__Event__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:4498:1: rule__Event__Group_2__0__Impl : ( () ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4502:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4503:1: ( () )
            {
            // InternalMoniLog4DSL.g:4503:1: ( () )
            // InternalMoniLog4DSL.g:4504:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getUserEventAction_2_0()); 
            }
            // InternalMoniLog4DSL.g:4505:2: ()
            // InternalMoniLog4DSL.g:4505:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getUserEventAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__0__Impl"


    // $ANTLR start "rule__Event__Group_2__1"
    // InternalMoniLog4DSL.g:4513:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl rule__Event__Group_2__2 ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4517:1: ( rule__Event__Group_2__1__Impl rule__Event__Group_2__2 )
            // InternalMoniLog4DSL.g:4518:2: rule__Event__Group_2__1__Impl rule__Event__Group_2__2
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__2();

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
    // $ANTLR end "rule__Event__Group_2__1"


    // $ANTLR start "rule__Event__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:4525:1: rule__Event__Group_2__1__Impl : ( 'custom' ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4529:1: ( ( 'custom' ) )
            // InternalMoniLog4DSL.g:4530:1: ( 'custom' )
            {
            // InternalMoniLog4DSL.g:4530:1: ( 'custom' )
            // InternalMoniLog4DSL.g:4531:2: 'custom'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getCustomKeyword_2_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getCustomKeyword_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__1__Impl"


    // $ANTLR start "rule__Event__Group_2__2"
    // InternalMoniLog4DSL.g:4540:1: rule__Event__Group_2__2 : rule__Event__Group_2__2__Impl rule__Event__Group_2__3 ;
    public final void rule__Event__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4544:1: ( rule__Event__Group_2__2__Impl rule__Event__Group_2__3 )
            // InternalMoniLog4DSL.g:4545:2: rule__Event__Group_2__2__Impl rule__Event__Group_2__3
            {
            pushFollow(FOLLOW_12);
            rule__Event__Group_2__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__3();

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
    // $ANTLR end "rule__Event__Group_2__2"


    // $ANTLR start "rule__Event__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:4552:1: rule__Event__Group_2__2__Impl : ( ( rule__Event__NameAssignment_2_2 ) ) ;
    public final void rule__Event__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4556:1: ( ( ( rule__Event__NameAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:4557:1: ( ( rule__Event__NameAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:4557:1: ( ( rule__Event__NameAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:4558:2: ( rule__Event__NameAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_2_2()); 
            }
            // InternalMoniLog4DSL.g:4559:2: ( rule__Event__NameAssignment_2_2 )
            // InternalMoniLog4DSL.g:4559:3: rule__Event__NameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment_2_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameAssignment_2_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__2__Impl"


    // $ANTLR start "rule__Event__Group_2__3"
    // InternalMoniLog4DSL.g:4567:1: rule__Event__Group_2__3 : rule__Event__Group_2__3__Impl ;
    public final void rule__Event__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4571:1: ( rule__Event__Group_2__3__Impl )
            // InternalMoniLog4DSL.g:4572:2: rule__Event__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2__3__Impl();

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
    // $ANTLR end "rule__Event__Group_2__3"


    // $ANTLR start "rule__Event__Group_2__3__Impl"
    // InternalMoniLog4DSL.g:4578:1: rule__Event__Group_2__3__Impl : ( ( rule__Event__Group_2_3__0 )? ) ;
    public final void rule__Event__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4582:1: ( ( ( rule__Event__Group_2_3__0 )? ) )
            // InternalMoniLog4DSL.g:4583:1: ( ( rule__Event__Group_2_3__0 )? )
            {
            // InternalMoniLog4DSL.g:4583:1: ( ( rule__Event__Group_2_3__0 )? )
            // InternalMoniLog4DSL.g:4584:2: ( rule__Event__Group_2_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_3()); 
            }
            // InternalMoniLog4DSL.g:4585:2: ( rule__Event__Group_2_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoniLog4DSL.g:4585:3: rule__Event__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Event__Group_2_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getGroup_2_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2__3__Impl"


    // $ANTLR start "rule__Event__Group_2_3__0"
    // InternalMoniLog4DSL.g:4594:1: rule__Event__Group_2_3__0 : rule__Event__Group_2_3__0__Impl rule__Event__Group_2_3__1 ;
    public final void rule__Event__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4598:1: ( rule__Event__Group_2_3__0__Impl rule__Event__Group_2_3__1 )
            // InternalMoniLog4DSL.g:4599:2: rule__Event__Group_2_3__0__Impl rule__Event__Group_2_3__1
            {
            pushFollow(FOLLOW_3);
            rule__Event__Group_2_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_3__1();

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
    // $ANTLR end "rule__Event__Group_2_3__0"


    // $ANTLR start "rule__Event__Group_2_3__0__Impl"
    // InternalMoniLog4DSL.g:4606:1: rule__Event__Group_2_3__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4610:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4611:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4611:1: ( '(' )
            // InternalMoniLog4DSL.g:4612:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_3__0__Impl"


    // $ANTLR start "rule__Event__Group_2_3__1"
    // InternalMoniLog4DSL.g:4621:1: rule__Event__Group_2_3__1 : rule__Event__Group_2_3__1__Impl rule__Event__Group_2_3__2 ;
    public final void rule__Event__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4625:1: ( rule__Event__Group_2_3__1__Impl rule__Event__Group_2_3__2 )
            // InternalMoniLog4DSL.g:4626:2: rule__Event__Group_2_3__1__Impl rule__Event__Group_2_3__2
            {
            pushFollow(FOLLOW_11);
            rule__Event__Group_2_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_3__2();

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
    // $ANTLR end "rule__Event__Group_2_3__1"


    // $ANTLR start "rule__Event__Group_2_3__1__Impl"
    // InternalMoniLog4DSL.g:4633:1: rule__Event__Group_2_3__1__Impl : ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) ) ;
    public final void rule__Event__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4637:1: ( ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) ) )
            // InternalMoniLog4DSL.g:4638:1: ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) )
            {
            // InternalMoniLog4DSL.g:4638:1: ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) )
            // InternalMoniLog4DSL.g:4639:2: ( rule__Event__ParameterDeclAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclAssignment_2_3_1()); 
            }
            // InternalMoniLog4DSL.g:4640:2: ( rule__Event__ParameterDeclAssignment_2_3_1 )
            // InternalMoniLog4DSL.g:4640:3: rule__Event__ParameterDeclAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Event__ParameterDeclAssignment_2_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParameterDeclAssignment_2_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_3__1__Impl"


    // $ANTLR start "rule__Event__Group_2_3__2"
    // InternalMoniLog4DSL.g:4648:1: rule__Event__Group_2_3__2 : rule__Event__Group_2_3__2__Impl ;
    public final void rule__Event__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4652:1: ( rule__Event__Group_2_3__2__Impl )
            // InternalMoniLog4DSL.g:4653:2: rule__Event__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Event__Group_2_3__2__Impl();

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
    // $ANTLR end "rule__Event__Group_2_3__2"


    // $ANTLR start "rule__Event__Group_2_3__2__Impl"
    // InternalMoniLog4DSL.g:4659:1: rule__Event__Group_2_3__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4663:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4664:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4664:1: ( ')' )
            // InternalMoniLog4DSL.g:4665:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_2_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRightParenthesisKeyword_2_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__Group_2_3__2__Impl"


    // $ANTLR start "rule__ASTEventKind__Group_0__0"
    // InternalMoniLog4DSL.g:4675:1: rule__ASTEventKind__Group_0__0 : rule__ASTEventKind__Group_0__0__Impl rule__ASTEventKind__Group_0__1 ;
    public final void rule__ASTEventKind__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4679:1: ( rule__ASTEventKind__Group_0__0__Impl rule__ASTEventKind__Group_0__1 )
            // InternalMoniLog4DSL.g:4680:2: rule__ASTEventKind__Group_0__0__Impl rule__ASTEventKind__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__ASTEventKind__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEventKind__Group_0__1();

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
    // $ANTLR end "rule__ASTEventKind__Group_0__0"


    // $ANTLR start "rule__ASTEventKind__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:4687:1: rule__ASTEventKind__Group_0__0__Impl : ( () ) ;
    public final void rule__ASTEventKind__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4691:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4692:1: ( () )
            {
            // InternalMoniLog4DSL.g:4692:1: ( () )
            // InternalMoniLog4DSL.g:4693:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getBeforeASTEventAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:4694:2: ()
            // InternalMoniLog4DSL.g:4694:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventKindAccess().getBeforeASTEventAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEventKind__Group_0__0__Impl"


    // $ANTLR start "rule__ASTEventKind__Group_0__1"
    // InternalMoniLog4DSL.g:4702:1: rule__ASTEventKind__Group_0__1 : rule__ASTEventKind__Group_0__1__Impl ;
    public final void rule__ASTEventKind__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4706:1: ( rule__ASTEventKind__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:4707:2: rule__ASTEventKind__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ASTEventKind__Group_0__1__Impl();

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
    // $ANTLR end "rule__ASTEventKind__Group_0__1"


    // $ANTLR start "rule__ASTEventKind__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:4713:1: rule__ASTEventKind__Group_0__1__Impl : ( 'before' ) ;
    public final void rule__ASTEventKind__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4717:1: ( ( 'before' ) )
            // InternalMoniLog4DSL.g:4718:1: ( 'before' )
            {
            // InternalMoniLog4DSL.g:4718:1: ( 'before' )
            // InternalMoniLog4DSL.g:4719:2: 'before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getBeforeKeyword_0_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventKindAccess().getBeforeKeyword_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEventKind__Group_0__1__Impl"


    // $ANTLR start "rule__ASTEventKind__Group_1__0"
    // InternalMoniLog4DSL.g:4729:1: rule__ASTEventKind__Group_1__0 : rule__ASTEventKind__Group_1__0__Impl rule__ASTEventKind__Group_1__1 ;
    public final void rule__ASTEventKind__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4733:1: ( rule__ASTEventKind__Group_1__0__Impl rule__ASTEventKind__Group_1__1 )
            // InternalMoniLog4DSL.g:4734:2: rule__ASTEventKind__Group_1__0__Impl rule__ASTEventKind__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__ASTEventKind__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__ASTEventKind__Group_1__1();

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
    // $ANTLR end "rule__ASTEventKind__Group_1__0"


    // $ANTLR start "rule__ASTEventKind__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:4741:1: rule__ASTEventKind__Group_1__0__Impl : ( () ) ;
    public final void rule__ASTEventKind__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4745:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4746:1: ( () )
            {
            // InternalMoniLog4DSL.g:4746:1: ( () )
            // InternalMoniLog4DSL.g:4747:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getAfterASTEventAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:4748:2: ()
            // InternalMoniLog4DSL.g:4748:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventKindAccess().getAfterASTEventAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEventKind__Group_1__0__Impl"


    // $ANTLR start "rule__ASTEventKind__Group_1__1"
    // InternalMoniLog4DSL.g:4756:1: rule__ASTEventKind__Group_1__1 : rule__ASTEventKind__Group_1__1__Impl ;
    public final void rule__ASTEventKind__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4760:1: ( rule__ASTEventKind__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:4761:2: rule__ASTEventKind__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ASTEventKind__Group_1__1__Impl();

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
    // $ANTLR end "rule__ASTEventKind__Group_1__1"


    // $ANTLR start "rule__ASTEventKind__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:4767:1: rule__ASTEventKind__Group_1__1__Impl : ( 'after' ) ;
    public final void rule__ASTEventKind__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4771:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:4772:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:4772:1: ( 'after' )
            // InternalMoniLog4DSL.g:4773:2: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getAfterKeyword_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getASTEventKindAccess().getAfterKeyword_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ASTEventKind__Group_1__1__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__0"
    // InternalMoniLog4DSL.g:4783:1: rule__TemporalPattern__Group__0 : rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 ;
    public final void rule__TemporalPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4787:1: ( rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 )
            // InternalMoniLog4DSL.g:4788:2: rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMoniLog4DSL.g:4795:1: rule__TemporalPattern__Group__0__Impl : ( ( rule__TemporalPattern__PatternAssignment_0 ) ) ;
    public final void rule__TemporalPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4799:1: ( ( ( rule__TemporalPattern__PatternAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:4800:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:4800:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            // InternalMoniLog4DSL.g:4801:2: ( rule__TemporalPattern__PatternAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:4802:2: ( rule__TemporalPattern__PatternAssignment_0 )
            // InternalMoniLog4DSL.g:4802:3: rule__TemporalPattern__PatternAssignment_0
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
    // InternalMoniLog4DSL.g:4810:1: rule__TemporalPattern__Group__1 : rule__TemporalPattern__Group__1__Impl ;
    public final void rule__TemporalPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4814:1: ( rule__TemporalPattern__Group__1__Impl )
            // InternalMoniLog4DSL.g:4815:2: rule__TemporalPattern__Group__1__Impl
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
    // InternalMoniLog4DSL.g:4821:1: rule__TemporalPattern__Group__1__Impl : ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) ;
    public final void rule__TemporalPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4825:1: ( ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4826:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4826:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            // InternalMoniLog4DSL.g:4827:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:4828:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            // InternalMoniLog4DSL.g:4828:3: rule__TemporalPattern__ScopeAssignment_1
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
    // InternalMoniLog4DSL.g:4837:1: rule__Pattern__Group_0__0 : rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 ;
    public final void rule__Pattern__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4841:1: ( rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 )
            // InternalMoniLog4DSL.g:4842:2: rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalMoniLog4DSL.g:4849:1: rule__Pattern__Group_0__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4853:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4854:1: ( () )
            {
            // InternalMoniLog4DSL.g:4854:1: ( () )
            // InternalMoniLog4DSL.g:4855:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getExistenceAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:4856:2: ()
            // InternalMoniLog4DSL.g:4856:3: 
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
    // InternalMoniLog4DSL.g:4864:1: rule__Pattern__Group_0__1 : rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 ;
    public final void rule__Pattern__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4868:1: ( rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 )
            // InternalMoniLog4DSL.g:4869:2: rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2
            {
            pushFollow(FOLLOW_34);
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
    // InternalMoniLog4DSL.g:4876:1: rule__Pattern__Group_0__1__Impl : ( ( 'exists' )? ) ;
    public final void rule__Pattern__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4880:1: ( ( ( 'exists' )? ) )
            // InternalMoniLog4DSL.g:4881:1: ( ( 'exists' )? )
            {
            // InternalMoniLog4DSL.g:4881:1: ( ( 'exists' )? )
            // InternalMoniLog4DSL.g:4882:2: ( 'exists' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getExistsKeyword_0_1()); 
            }
            // InternalMoniLog4DSL.g:4883:2: ( 'exists' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoniLog4DSL.g:4883:3: 'exists'
                    {
                    match(input,46,FOLLOW_2); if (state.failed) return ;

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
    // InternalMoniLog4DSL.g:4891:1: rule__Pattern__Group_0__2 : rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3 ;
    public final void rule__Pattern__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4895:1: ( rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3 )
            // InternalMoniLog4DSL.g:4896:2: rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalMoniLog4DSL.g:4903:1: rule__Pattern__Group_0__2__Impl : ( ( rule__Pattern__BoundAssignment_0_2 )? ) ;
    public final void rule__Pattern__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4907:1: ( ( ( rule__Pattern__BoundAssignment_0_2 )? ) )
            // InternalMoniLog4DSL.g:4908:1: ( ( rule__Pattern__BoundAssignment_0_2 )? )
            {
            // InternalMoniLog4DSL.g:4908:1: ( ( rule__Pattern__BoundAssignment_0_2 )? )
            // InternalMoniLog4DSL.g:4909:2: ( rule__Pattern__BoundAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getBoundAssignment_0_2()); 
            }
            // InternalMoniLog4DSL.g:4910:2: ( rule__Pattern__BoundAssignment_0_2 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_INT||(LA39_0>=51 && LA39_0<=52)) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoniLog4DSL.g:4910:3: rule__Pattern__BoundAssignment_0_2
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
    // InternalMoniLog4DSL.g:4918:1: rule__Pattern__Group_0__3 : rule__Pattern__Group_0__3__Impl ;
    public final void rule__Pattern__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4922:1: ( rule__Pattern__Group_0__3__Impl )
            // InternalMoniLog4DSL.g:4923:2: rule__Pattern__Group_0__3__Impl
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
    // InternalMoniLog4DSL.g:4929:1: rule__Pattern__Group_0__3__Impl : ( ( rule__Pattern__EventAssignment_0_3 ) ) ;
    public final void rule__Pattern__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4933:1: ( ( ( rule__Pattern__EventAssignment_0_3 ) ) )
            // InternalMoniLog4DSL.g:4934:1: ( ( rule__Pattern__EventAssignment_0_3 ) )
            {
            // InternalMoniLog4DSL.g:4934:1: ( ( rule__Pattern__EventAssignment_0_3 ) )
            // InternalMoniLog4DSL.g:4935:2: ( rule__Pattern__EventAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_0_3()); 
            }
            // InternalMoniLog4DSL.g:4936:2: ( rule__Pattern__EventAssignment_0_3 )
            // InternalMoniLog4DSL.g:4936:3: rule__Pattern__EventAssignment_0_3
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
    // InternalMoniLog4DSL.g:4945:1: rule__Pattern__Group_1__0 : rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 ;
    public final void rule__Pattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4949:1: ( rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 )
            // InternalMoniLog4DSL.g:4950:2: rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1
            {
            pushFollow(FOLLOW_35);
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
    // InternalMoniLog4DSL.g:4957:1: rule__Pattern__Group_1__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4961:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4962:1: ( () )
            {
            // InternalMoniLog4DSL.g:4962:1: ( () )
            // InternalMoniLog4DSL.g:4963:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getUniversalityAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:4964:2: ()
            // InternalMoniLog4DSL.g:4964:3: 
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
    // InternalMoniLog4DSL.g:4972:1: rule__Pattern__Group_1__1 : rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 ;
    public final void rule__Pattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4976:1: ( rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 )
            // InternalMoniLog4DSL.g:4977:2: rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:4984:1: rule__Pattern__Group_1__1__Impl : ( 'always' ) ;
    public final void rule__Pattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4988:1: ( ( 'always' ) )
            // InternalMoniLog4DSL.g:4989:1: ( 'always' )
            {
            // InternalMoniLog4DSL.g:4989:1: ( 'always' )
            // InternalMoniLog4DSL.g:4990:2: 'always'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAlwaysKeyword_1_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:4999:1: rule__Pattern__Group_1__2 : rule__Pattern__Group_1__2__Impl ;
    public final void rule__Pattern__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5003:1: ( rule__Pattern__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:5004:2: rule__Pattern__Group_1__2__Impl
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
    // InternalMoniLog4DSL.g:5010:1: rule__Pattern__Group_1__2__Impl : ( ( rule__Pattern__EventAssignment_1_2 ) ) ;
    public final void rule__Pattern__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5014:1: ( ( ( rule__Pattern__EventAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:5015:1: ( ( rule__Pattern__EventAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:5015:1: ( ( rule__Pattern__EventAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:5016:2: ( rule__Pattern__EventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_1_2()); 
            }
            // InternalMoniLog4DSL.g:5017:2: ( rule__Pattern__EventAssignment_1_2 )
            // InternalMoniLog4DSL.g:5017:3: rule__Pattern__EventAssignment_1_2
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
    // InternalMoniLog4DSL.g:5026:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5030:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMoniLog4DSL.g:5031:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_36);
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
    // InternalMoniLog4DSL.g:5038:1: rule__Pattern__Group_2__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5042:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5043:1: ( () )
            {
            // InternalMoniLog4DSL.g:5043:1: ( () )
            // InternalMoniLog4DSL.g:5044:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAbsenceAction_2_0()); 
            }
            // InternalMoniLog4DSL.g:5045:2: ()
            // InternalMoniLog4DSL.g:5045:3: 
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
    // InternalMoniLog4DSL.g:5053:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5057:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMoniLog4DSL.g:5058:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5065:1: rule__Pattern__Group_2__1__Impl : ( 'never' ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5069:1: ( ( 'never' ) )
            // InternalMoniLog4DSL.g:5070:1: ( 'never' )
            {
            // InternalMoniLog4DSL.g:5070:1: ( 'never' )
            // InternalMoniLog4DSL.g:5071:2: 'never'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getNeverKeyword_2_1()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5080:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5084:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:5085:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMoniLog4DSL.g:5091:1: rule__Pattern__Group_2__2__Impl : ( ( rule__Pattern__EventAssignment_2_2 ) ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5095:1: ( ( ( rule__Pattern__EventAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:5096:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:5096:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:5097:2: ( rule__Pattern__EventAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_2_2()); 
            }
            // InternalMoniLog4DSL.g:5098:2: ( rule__Pattern__EventAssignment_2_2 )
            // InternalMoniLog4DSL.g:5098:3: rule__Pattern__EventAssignment_2_2
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
    // InternalMoniLog4DSL.g:5107:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5111:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalMoniLog4DSL.g:5112:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5119:1: rule__Pattern__Group_3__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5123:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5124:1: ( () )
            {
            // InternalMoniLog4DSL.g:5124:1: ( () )
            // InternalMoniLog4DSL.g:5125:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPrecedenceAction_3_0()); 
            }
            // InternalMoniLog4DSL.g:5126:2: ()
            // InternalMoniLog4DSL.g:5126:3: 
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
    // InternalMoniLog4DSL.g:5134:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5138:1: ( rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 )
            // InternalMoniLog4DSL.g:5139:2: rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2
            {
            pushFollow(FOLLOW_37);
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
    // InternalMoniLog4DSL.g:5146:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5150:1: ( ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:5151:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:5151:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:5152:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:5153:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            // InternalMoniLog4DSL.g:5153:3: rule__Pattern__PredecessorAssignment_3_1
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
    // InternalMoniLog4DSL.g:5161:1: rule__Pattern__Group_3__2 : rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 ;
    public final void rule__Pattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5165:1: ( rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 )
            // InternalMoniLog4DSL.g:5166:2: rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5173:1: rule__Pattern__Group_3__2__Impl : ( 'precedes' ) ;
    public final void rule__Pattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5177:1: ( ( 'precedes' ) )
            // InternalMoniLog4DSL.g:5178:1: ( 'precedes' )
            {
            // InternalMoniLog4DSL.g:5178:1: ( 'precedes' )
            // InternalMoniLog4DSL.g:5179:2: 'precedes'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPrecedesKeyword_3_2()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5188:1: rule__Pattern__Group_3__3 : rule__Pattern__Group_3__3__Impl ;
    public final void rule__Pattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5192:1: ( rule__Pattern__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:5193:2: rule__Pattern__Group_3__3__Impl
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
    // InternalMoniLog4DSL.g:5199:1: rule__Pattern__Group_3__3__Impl : ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) ;
    public final void rule__Pattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5203:1: ( ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) )
            // InternalMoniLog4DSL.g:5204:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            {
            // InternalMoniLog4DSL.g:5204:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            // InternalMoniLog4DSL.g:5205:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3()); 
            }
            // InternalMoniLog4DSL.g:5206:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            // InternalMoniLog4DSL.g:5206:3: rule__Pattern__SuccessorAssignment_3_3
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
    // InternalMoniLog4DSL.g:5215:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5219:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalMoniLog4DSL.g:5220:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_29);
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
    // InternalMoniLog4DSL.g:5227:1: rule__Pattern__Group_4__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5231:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5232:1: ( () )
            {
            // InternalMoniLog4DSL.g:5232:1: ( () )
            // InternalMoniLog4DSL.g:5233:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getResponseAction_4_0()); 
            }
            // InternalMoniLog4DSL.g:5234:2: ()
            // InternalMoniLog4DSL.g:5234:3: 
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
    // InternalMoniLog4DSL.g:5242:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5246:1: ( rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 )
            // InternalMoniLog4DSL.g:5247:2: rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2
            {
            pushFollow(FOLLOW_38);
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
    // InternalMoniLog4DSL.g:5254:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__EventAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5258:1: ( ( ( rule__Pattern__EventAssignment_4_1 ) ) )
            // InternalMoniLog4DSL.g:5259:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            {
            // InternalMoniLog4DSL.g:5259:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            // InternalMoniLog4DSL.g:5260:2: ( rule__Pattern__EventAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_4_1()); 
            }
            // InternalMoniLog4DSL.g:5261:2: ( rule__Pattern__EventAssignment_4_1 )
            // InternalMoniLog4DSL.g:5261:3: rule__Pattern__EventAssignment_4_1
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
    // InternalMoniLog4DSL.g:5269:1: rule__Pattern__Group_4__2 : rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 ;
    public final void rule__Pattern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5273:1: ( rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 )
            // InternalMoniLog4DSL.g:5274:2: rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5281:1: rule__Pattern__Group_4__2__Impl : ( 'respondsTo' ) ;
    public final void rule__Pattern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5285:1: ( ( 'respondsTo' ) )
            // InternalMoniLog4DSL.g:5286:1: ( 'respondsTo' )
            {
            // InternalMoniLog4DSL.g:5286:1: ( 'respondsTo' )
            // InternalMoniLog4DSL.g:5287:2: 'respondsTo'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getRespondsToKeyword_4_2()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5296:1: rule__Pattern__Group_4__3 : rule__Pattern__Group_4__3__Impl ;
    public final void rule__Pattern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5300:1: ( rule__Pattern__Group_4__3__Impl )
            // InternalMoniLog4DSL.g:5301:2: rule__Pattern__Group_4__3__Impl
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
    // InternalMoniLog4DSL.g:5307:1: rule__Pattern__Group_4__3__Impl : ( ( rule__Pattern__TriggerAssignment_4_3 ) ) ;
    public final void rule__Pattern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5311:1: ( ( ( rule__Pattern__TriggerAssignment_4_3 ) ) )
            // InternalMoniLog4DSL.g:5312:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            {
            // InternalMoniLog4DSL.g:5312:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            // InternalMoniLog4DSL.g:5313:2: ( rule__Pattern__TriggerAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getTriggerAssignment_4_3()); 
            }
            // InternalMoniLog4DSL.g:5314:2: ( rule__Pattern__TriggerAssignment_4_3 )
            // InternalMoniLog4DSL.g:5314:3: rule__Pattern__TriggerAssignment_4_3
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
    // InternalMoniLog4DSL.g:5323:1: rule__LowerBound__Group__0 : rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 ;
    public final void rule__LowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5327:1: ( rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 )
            // InternalMoniLog4DSL.g:5328:2: rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMoniLog4DSL.g:5335:1: rule__LowerBound__Group__0__Impl : ( 'atleast' ) ;
    public final void rule__LowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5339:1: ( ( 'atleast' ) )
            // InternalMoniLog4DSL.g:5340:1: ( 'atleast' )
            {
            // InternalMoniLog4DSL.g:5340:1: ( 'atleast' )
            // InternalMoniLog4DSL.g:5341:2: 'atleast'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getAtleastKeyword_0()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5350:1: rule__LowerBound__Group__1 : rule__LowerBound__Group__1__Impl ;
    public final void rule__LowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5354:1: ( rule__LowerBound__Group__1__Impl )
            // InternalMoniLog4DSL.g:5355:2: rule__LowerBound__Group__1__Impl
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
    // InternalMoniLog4DSL.g:5361:1: rule__LowerBound__Group__1__Impl : ( ( rule__LowerBound__NAssignment_1 ) ) ;
    public final void rule__LowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5365:1: ( ( ( rule__LowerBound__NAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:5366:1: ( ( rule__LowerBound__NAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:5366:1: ( ( rule__LowerBound__NAssignment_1 ) )
            // InternalMoniLog4DSL.g:5367:2: ( rule__LowerBound__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getNAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:5368:2: ( rule__LowerBound__NAssignment_1 )
            // InternalMoniLog4DSL.g:5368:3: rule__LowerBound__NAssignment_1
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
    // InternalMoniLog4DSL.g:5377:1: rule__UpperBound__Group__0 : rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 ;
    public final void rule__UpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5381:1: ( rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 )
            // InternalMoniLog4DSL.g:5382:2: rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1
            {
            pushFollow(FOLLOW_39);
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
    // InternalMoniLog4DSL.g:5389:1: rule__UpperBound__Group__0__Impl : ( 'atmost' ) ;
    public final void rule__UpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5393:1: ( ( 'atmost' ) )
            // InternalMoniLog4DSL.g:5394:1: ( 'atmost' )
            {
            // InternalMoniLog4DSL.g:5394:1: ( 'atmost' )
            // InternalMoniLog4DSL.g:5395:2: 'atmost'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getAtmostKeyword_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5404:1: rule__UpperBound__Group__1 : rule__UpperBound__Group__1__Impl ;
    public final void rule__UpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5408:1: ( rule__UpperBound__Group__1__Impl )
            // InternalMoniLog4DSL.g:5409:2: rule__UpperBound__Group__1__Impl
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
    // InternalMoniLog4DSL.g:5415:1: rule__UpperBound__Group__1__Impl : ( ( rule__UpperBound__NAssignment_1 ) ) ;
    public final void rule__UpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5419:1: ( ( ( rule__UpperBound__NAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:5420:1: ( ( rule__UpperBound__NAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:5420:1: ( ( rule__UpperBound__NAssignment_1 ) )
            // InternalMoniLog4DSL.g:5421:2: ( rule__UpperBound__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getNAssignment_1()); 
            }
            // InternalMoniLog4DSL.g:5422:2: ( rule__UpperBound__NAssignment_1 )
            // InternalMoniLog4DSL.g:5422:3: rule__UpperBound__NAssignment_1
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
    // InternalMoniLog4DSL.g:5431:1: rule__Scope__Group_0__0 : rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 ;
    public final void rule__Scope__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5435:1: ( rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 )
            // InternalMoniLog4DSL.g:5436:2: rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalMoniLog4DSL.g:5443:1: rule__Scope__Group_0__0__Impl : ( () ) ;
    public final void rule__Scope__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5447:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5448:1: ( () )
            {
            // InternalMoniLog4DSL.g:5448:1: ( () )
            // InternalMoniLog4DSL.g:5449:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getGloballyAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:5450:2: ()
            // InternalMoniLog4DSL.g:5450:3: 
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
    // InternalMoniLog4DSL.g:5458:1: rule__Scope__Group_0__1 : rule__Scope__Group_0__1__Impl ;
    public final void rule__Scope__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5462:1: ( rule__Scope__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:5463:2: rule__Scope__Group_0__1__Impl
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
    // InternalMoniLog4DSL.g:5469:1: rule__Scope__Group_0__1__Impl : ( ( 'globally' )? ) ;
    public final void rule__Scope__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5473:1: ( ( ( 'globally' )? ) )
            // InternalMoniLog4DSL.g:5474:1: ( ( 'globally' )? )
            {
            // InternalMoniLog4DSL.g:5474:1: ( ( 'globally' )? )
            // InternalMoniLog4DSL.g:5475:2: ( 'globally' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 
            }
            // InternalMoniLog4DSL.g:5476:2: ( 'globally' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==53) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoniLog4DSL.g:5476:3: 'globally'
                    {
                    match(input,53,FOLLOW_2); if (state.failed) return ;

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
    // InternalMoniLog4DSL.g:5485:1: rule__Scope__Group_1__0 : rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 ;
    public final void rule__Scope__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5489:1: ( rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 )
            // InternalMoniLog4DSL.g:5490:2: rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalMoniLog4DSL.g:5497:1: rule__Scope__Group_1__0__Impl : ( () ) ;
    public final void rule__Scope__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5501:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5502:1: ( () )
            {
            // InternalMoniLog4DSL.g:5502:1: ( () )
            // InternalMoniLog4DSL.g:5503:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:5504:2: ()
            // InternalMoniLog4DSL.g:5504:3: 
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
    // InternalMoniLog4DSL.g:5512:1: rule__Scope__Group_1__1 : rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 ;
    public final void rule__Scope__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5516:1: ( rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 )
            // InternalMoniLog4DSL.g:5517:2: rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5524:1: rule__Scope__Group_1__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5528:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:5529:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:5529:1: ( 'after' )
            // InternalMoniLog4DSL.g:5530:2: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterKeyword_1_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5539:1: rule__Scope__Group_1__2 : rule__Scope__Group_1__2__Impl ;
    public final void rule__Scope__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5543:1: ( rule__Scope__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:5544:2: rule__Scope__Group_1__2__Impl
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
    // InternalMoniLog4DSL.g:5550:1: rule__Scope__Group_1__2__Impl : ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) ;
    public final void rule__Scope__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5554:1: ( ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:5555:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:5555:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:5556:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2()); 
            }
            // InternalMoniLog4DSL.g:5557:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            // InternalMoniLog4DSL.g:5557:3: rule__Scope__LowerBoundAssignment_1_2
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
    // InternalMoniLog4DSL.g:5566:1: rule__Scope__Group_2__0 : rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 ;
    public final void rule__Scope__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5570:1: ( rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 )
            // InternalMoniLog4DSL.g:5571:2: rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1
            {
            pushFollow(FOLLOW_32);
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
    // InternalMoniLog4DSL.g:5578:1: rule__Scope__Group_2__0__Impl : ( () ) ;
    public final void rule__Scope__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5582:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5583:1: ( () )
            {
            // InternalMoniLog4DSL.g:5583:1: ( () )
            // InternalMoniLog4DSL.g:5584:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBeforeAction_2_0()); 
            }
            // InternalMoniLog4DSL.g:5585:2: ()
            // InternalMoniLog4DSL.g:5585:3: 
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
    // InternalMoniLog4DSL.g:5593:1: rule__Scope__Group_2__1 : rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 ;
    public final void rule__Scope__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5597:1: ( rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 )
            // InternalMoniLog4DSL.g:5598:2: rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5605:1: rule__Scope__Group_2__1__Impl : ( 'before' ) ;
    public final void rule__Scope__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5609:1: ( ( 'before' ) )
            // InternalMoniLog4DSL.g:5610:1: ( 'before' )
            {
            // InternalMoniLog4DSL.g:5610:1: ( 'before' )
            // InternalMoniLog4DSL.g:5611:2: 'before'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBeforeKeyword_2_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5620:1: rule__Scope__Group_2__2 : rule__Scope__Group_2__2__Impl ;
    public final void rule__Scope__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5624:1: ( rule__Scope__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:5625:2: rule__Scope__Group_2__2__Impl
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
    // InternalMoniLog4DSL.g:5631:1: rule__Scope__Group_2__2__Impl : ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) ;
    public final void rule__Scope__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5635:1: ( ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:5636:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:5636:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:5637:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2()); 
            }
            // InternalMoniLog4DSL.g:5638:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            // InternalMoniLog4DSL.g:5638:3: rule__Scope__UpperBoundAssignment_2_2
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
    // InternalMoniLog4DSL.g:5647:1: rule__Scope__Group_3__0 : rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 ;
    public final void rule__Scope__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5651:1: ( rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 )
            // InternalMoniLog4DSL.g:5652:2: rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1
            {
            pushFollow(FOLLOW_42);
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
    // InternalMoniLog4DSL.g:5659:1: rule__Scope__Group_3__0__Impl : ( () ) ;
    public final void rule__Scope__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5663:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5664:1: ( () )
            {
            // InternalMoniLog4DSL.g:5664:1: ( () )
            // InternalMoniLog4DSL.g:5665:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBetweenAction_3_0()); 
            }
            // InternalMoniLog4DSL.g:5666:2: ()
            // InternalMoniLog4DSL.g:5666:3: 
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
    // InternalMoniLog4DSL.g:5674:1: rule__Scope__Group_3__1 : rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 ;
    public final void rule__Scope__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5678:1: ( rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 )
            // InternalMoniLog4DSL.g:5679:2: rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5686:1: rule__Scope__Group_3__1__Impl : ( 'between' ) ;
    public final void rule__Scope__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5690:1: ( ( 'between' ) )
            // InternalMoniLog4DSL.g:5691:1: ( 'between' )
            {
            // InternalMoniLog4DSL.g:5691:1: ( 'between' )
            // InternalMoniLog4DSL.g:5692:2: 'between'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5701:1: rule__Scope__Group_3__2 : rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 ;
    public final void rule__Scope__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5705:1: ( rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 )
            // InternalMoniLog4DSL.g:5706:2: rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3
            {
            pushFollow(FOLLOW_43);
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
    // InternalMoniLog4DSL.g:5713:1: rule__Scope__Group_3__2__Impl : ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) ;
    public final void rule__Scope__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5717:1: ( ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) )
            // InternalMoniLog4DSL.g:5718:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            {
            // InternalMoniLog4DSL.g:5718:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            // InternalMoniLog4DSL.g:5719:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2()); 
            }
            // InternalMoniLog4DSL.g:5720:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            // InternalMoniLog4DSL.g:5720:3: rule__Scope__LowerBoundAssignment_3_2
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
    // InternalMoniLog4DSL.g:5728:1: rule__Scope__Group_3__3 : rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 ;
    public final void rule__Scope__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5732:1: ( rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 )
            // InternalMoniLog4DSL.g:5733:2: rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5740:1: rule__Scope__Group_3__3__Impl : ( 'and' ) ;
    public final void rule__Scope__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5744:1: ( ( 'and' ) )
            // InternalMoniLog4DSL.g:5745:1: ( 'and' )
            {
            // InternalMoniLog4DSL.g:5745:1: ( 'and' )
            // InternalMoniLog4DSL.g:5746:2: 'and'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5755:1: rule__Scope__Group_3__4 : rule__Scope__Group_3__4__Impl ;
    public final void rule__Scope__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5759:1: ( rule__Scope__Group_3__4__Impl )
            // InternalMoniLog4DSL.g:5760:2: rule__Scope__Group_3__4__Impl
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
    // InternalMoniLog4DSL.g:5766:1: rule__Scope__Group_3__4__Impl : ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) ;
    public final void rule__Scope__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5770:1: ( ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) )
            // InternalMoniLog4DSL.g:5771:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            {
            // InternalMoniLog4DSL.g:5771:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            // InternalMoniLog4DSL.g:5772:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4()); 
            }
            // InternalMoniLog4DSL.g:5773:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            // InternalMoniLog4DSL.g:5773:3: rule__Scope__UpperBoundAssignment_3_4
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
    // InternalMoniLog4DSL.g:5782:1: rule__Scope__Group_4__0 : rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 ;
    public final void rule__Scope__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5786:1: ( rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 )
            // InternalMoniLog4DSL.g:5787:2: rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalMoniLog4DSL.g:5794:1: rule__Scope__Group_4__0__Impl : ( () ) ;
    public final void rule__Scope__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5798:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5799:1: ( () )
            {
            // InternalMoniLog4DSL.g:5799:1: ( () )
            // InternalMoniLog4DSL.g:5800:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterUntilAction_4_0()); 
            }
            // InternalMoniLog4DSL.g:5801:2: ()
            // InternalMoniLog4DSL.g:5801:3: 
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
    // InternalMoniLog4DSL.g:5809:1: rule__Scope__Group_4__1 : rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 ;
    public final void rule__Scope__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5813:1: ( rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 )
            // InternalMoniLog4DSL.g:5814:2: rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5821:1: rule__Scope__Group_4__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5825:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:5826:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:5826:1: ( 'after' )
            // InternalMoniLog4DSL.g:5827:2: 'after'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5836:1: rule__Scope__Group_4__2 : rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 ;
    public final void rule__Scope__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5840:1: ( rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 )
            // InternalMoniLog4DSL.g:5841:2: rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3
            {
            pushFollow(FOLLOW_44);
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
    // InternalMoniLog4DSL.g:5848:1: rule__Scope__Group_4__2__Impl : ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) ;
    public final void rule__Scope__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5852:1: ( ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) )
            // InternalMoniLog4DSL.g:5853:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            {
            // InternalMoniLog4DSL.g:5853:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            // InternalMoniLog4DSL.g:5854:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2()); 
            }
            // InternalMoniLog4DSL.g:5855:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            // InternalMoniLog4DSL.g:5855:3: rule__Scope__LowerBoundAssignment_4_2
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
    // InternalMoniLog4DSL.g:5863:1: rule__Scope__Group_4__3 : rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 ;
    public final void rule__Scope__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5867:1: ( rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 )
            // InternalMoniLog4DSL.g:5868:2: rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:5875:1: rule__Scope__Group_4__3__Impl : ( 'until' ) ;
    public final void rule__Scope__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5879:1: ( ( 'until' ) )
            // InternalMoniLog4DSL.g:5880:1: ( 'until' )
            {
            // InternalMoniLog4DSL.g:5880:1: ( 'until' )
            // InternalMoniLog4DSL.g:5881:2: 'until'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 
            }
            match(input,56,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5890:1: rule__Scope__Group_4__4 : rule__Scope__Group_4__4__Impl ;
    public final void rule__Scope__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5894:1: ( rule__Scope__Group_4__4__Impl )
            // InternalMoniLog4DSL.g:5895:2: rule__Scope__Group_4__4__Impl
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
    // InternalMoniLog4DSL.g:5901:1: rule__Scope__Group_4__4__Impl : ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) ;
    public final void rule__Scope__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5905:1: ( ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) )
            // InternalMoniLog4DSL.g:5906:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            {
            // InternalMoniLog4DSL.g:5906:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            // InternalMoniLog4DSL.g:5907:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4()); 
            }
            // InternalMoniLog4DSL.g:5908:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            // InternalMoniLog4DSL.g:5908:3: rule__Scope__UpperBoundAssignment_4_4
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
    // InternalMoniLog4DSL.g:5917:1: rule__AppenderCall__Group__0 : rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1 ;
    public final void rule__AppenderCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5921:1: ( rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1 )
            // InternalMoniLog4DSL.g:5922:2: rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMoniLog4DSL.g:5929:1: rule__AppenderCall__Group__0__Impl : ( ( rule__AppenderCall__AppenderAssignment_0 ) ) ;
    public final void rule__AppenderCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5933:1: ( ( ( rule__AppenderCall__AppenderAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:5934:1: ( ( rule__AppenderCall__AppenderAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:5934:1: ( ( rule__AppenderCall__AppenderAssignment_0 ) )
            // InternalMoniLog4DSL.g:5935:2: ( rule__AppenderCall__AppenderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:5936:2: ( rule__AppenderCall__AppenderAssignment_0 )
            // InternalMoniLog4DSL.g:5936:3: rule__AppenderCall__AppenderAssignment_0
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
    // InternalMoniLog4DSL.g:5944:1: rule__AppenderCall__Group__1 : rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2 ;
    public final void rule__AppenderCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5948:1: ( rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2 )
            // InternalMoniLog4DSL.g:5949:2: rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMoniLog4DSL.g:5956:1: rule__AppenderCall__Group__1__Impl : ( '.' ) ;
    public final void rule__AppenderCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5960:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:5961:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:5961:1: ( '.' )
            // InternalMoniLog4DSL.g:5962:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getFullStopKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5971:1: rule__AppenderCall__Group__2 : rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3 ;
    public final void rule__AppenderCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5975:1: ( rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3 )
            // InternalMoniLog4DSL.g:5976:2: rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMoniLog4DSL.g:5983:1: rule__AppenderCall__Group__2__Impl : ( 'call' ) ;
    public final void rule__AppenderCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5987:1: ( ( 'call' ) )
            // InternalMoniLog4DSL.g:5988:1: ( 'call' )
            {
            // InternalMoniLog4DSL.g:5988:1: ( 'call' )
            // InternalMoniLog4DSL.g:5989:2: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getCallKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:5998:1: rule__AppenderCall__Group__3 : rule__AppenderCall__Group__3__Impl ;
    public final void rule__AppenderCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6002:1: ( rule__AppenderCall__Group__3__Impl )
            // InternalMoniLog4DSL.g:6003:2: rule__AppenderCall__Group__3__Impl
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
    // InternalMoniLog4DSL.g:6009:1: rule__AppenderCall__Group__3__Impl : ( ( rule__AppenderCall__Group_3__0 )? ) ;
    public final void rule__AppenderCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6013:1: ( ( ( rule__AppenderCall__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:6014:1: ( ( rule__AppenderCall__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:6014:1: ( ( rule__AppenderCall__Group_3__0 )? )
            // InternalMoniLog4DSL.g:6015:2: ( rule__AppenderCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:6016:2: ( rule__AppenderCall__Group_3__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==29) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoniLog4DSL.g:6016:3: rule__AppenderCall__Group_3__0
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
    // InternalMoniLog4DSL.g:6025:1: rule__AppenderCall__Group_3__0 : rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1 ;
    public final void rule__AppenderCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6029:1: ( rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1 )
            // InternalMoniLog4DSL.g:6030:2: rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:6037:1: rule__AppenderCall__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AppenderCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6041:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:6042:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:6042:1: ( '(' )
            // InternalMoniLog4DSL.g:6043:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6052:1: rule__AppenderCall__Group_3__1 : rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2 ;
    public final void rule__AppenderCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6056:1: ( rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2 )
            // InternalMoniLog4DSL.g:6057:2: rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:6064:1: rule__AppenderCall__Group_3__1__Impl : ( ( rule__AppenderCall__ArgsAssignment_3_1 ) ) ;
    public final void rule__AppenderCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6068:1: ( ( ( rule__AppenderCall__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:6069:1: ( ( rule__AppenderCall__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:6069:1: ( ( rule__AppenderCall__ArgsAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:6070:2: ( rule__AppenderCall__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:6071:2: ( rule__AppenderCall__ArgsAssignment_3_1 )
            // InternalMoniLog4DSL.g:6071:3: rule__AppenderCall__ArgsAssignment_3_1
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
    // InternalMoniLog4DSL.g:6079:1: rule__AppenderCall__Group_3__2 : rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3 ;
    public final void rule__AppenderCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6083:1: ( rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3 )
            // InternalMoniLog4DSL.g:6084:2: rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:6091:1: rule__AppenderCall__Group_3__2__Impl : ( ( rule__AppenderCall__Group_3_2__0 )* ) ;
    public final void rule__AppenderCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6095:1: ( ( ( rule__AppenderCall__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:6096:1: ( ( rule__AppenderCall__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:6096:1: ( ( rule__AppenderCall__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:6097:2: ( rule__AppenderCall__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:6098:2: ( rule__AppenderCall__Group_3_2__0 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==33) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:6098:3: rule__AppenderCall__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AppenderCall__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalMoniLog4DSL.g:6106:1: rule__AppenderCall__Group_3__3 : rule__AppenderCall__Group_3__3__Impl ;
    public final void rule__AppenderCall__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6110:1: ( rule__AppenderCall__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:6111:2: rule__AppenderCall__Group_3__3__Impl
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
    // InternalMoniLog4DSL.g:6117:1: rule__AppenderCall__Group_3__3__Impl : ( ')' ) ;
    public final void rule__AppenderCall__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6121:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:6122:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:6122:1: ( ')' )
            // InternalMoniLog4DSL.g:6123:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6133:1: rule__AppenderCall__Group_3_2__0 : rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1 ;
    public final void rule__AppenderCall__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6137:1: ( rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1 )
            // InternalMoniLog4DSL.g:6138:2: rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:6145:1: rule__AppenderCall__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AppenderCall__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6149:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6150:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6150:1: ( ',' )
            // InternalMoniLog4DSL.g:6151:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6160:1: rule__AppenderCall__Group_3_2__1 : rule__AppenderCall__Group_3_2__1__Impl ;
    public final void rule__AppenderCall__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6164:1: ( rule__AppenderCall__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:6165:2: rule__AppenderCall__Group_3_2__1__Impl
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
    // InternalMoniLog4DSL.g:6171:1: rule__AppenderCall__Group_3_2__1__Impl : ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__AppenderCall__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6175:1: ( ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:6176:1: ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6176:1: ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:6177:2: ( rule__AppenderCall__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:6178:2: ( rule__AppenderCall__ArgsAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:6178:3: rule__AppenderCall__ArgsAssignment_3_2_1
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
    // InternalMoniLog4DSL.g:6187:1: rule__LayoutCall__Group__0 : rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1 ;
    public final void rule__LayoutCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6191:1: ( rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1 )
            // InternalMoniLog4DSL.g:6192:2: rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMoniLog4DSL.g:6199:1: rule__LayoutCall__Group__0__Impl : ( ( rule__LayoutCall__LayoutAssignment_0 ) ) ;
    public final void rule__LayoutCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6203:1: ( ( ( rule__LayoutCall__LayoutAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:6204:1: ( ( rule__LayoutCall__LayoutAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:6204:1: ( ( rule__LayoutCall__LayoutAssignment_0 ) )
            // InternalMoniLog4DSL.g:6205:2: ( rule__LayoutCall__LayoutAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:6206:2: ( rule__LayoutCall__LayoutAssignment_0 )
            // InternalMoniLog4DSL.g:6206:3: rule__LayoutCall__LayoutAssignment_0
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
    // InternalMoniLog4DSL.g:6214:1: rule__LayoutCall__Group__1 : rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2 ;
    public final void rule__LayoutCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6218:1: ( rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2 )
            // InternalMoniLog4DSL.g:6219:2: rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2
            {
            pushFollow(FOLLOW_26);
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
    // InternalMoniLog4DSL.g:6226:1: rule__LayoutCall__Group__1__Impl : ( '.' ) ;
    public final void rule__LayoutCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6230:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:6231:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:6231:1: ( '.' )
            // InternalMoniLog4DSL.g:6232:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getFullStopKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6241:1: rule__LayoutCall__Group__2 : rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3 ;
    public final void rule__LayoutCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6245:1: ( rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3 )
            // InternalMoniLog4DSL.g:6246:2: rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMoniLog4DSL.g:6253:1: rule__LayoutCall__Group__2__Impl : ( 'call' ) ;
    public final void rule__LayoutCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6257:1: ( ( 'call' ) )
            // InternalMoniLog4DSL.g:6258:1: ( 'call' )
            {
            // InternalMoniLog4DSL.g:6258:1: ( 'call' )
            // InternalMoniLog4DSL.g:6259:2: 'call'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getCallKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6268:1: rule__LayoutCall__Group__3 : rule__LayoutCall__Group__3__Impl ;
    public final void rule__LayoutCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6272:1: ( rule__LayoutCall__Group__3__Impl )
            // InternalMoniLog4DSL.g:6273:2: rule__LayoutCall__Group__3__Impl
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
    // InternalMoniLog4DSL.g:6279:1: rule__LayoutCall__Group__3__Impl : ( ( rule__LayoutCall__Group_3__0 )? ) ;
    public final void rule__LayoutCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6283:1: ( ( ( rule__LayoutCall__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:6284:1: ( ( rule__LayoutCall__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:6284:1: ( ( rule__LayoutCall__Group_3__0 )? )
            // InternalMoniLog4DSL.g:6285:2: ( rule__LayoutCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:6286:2: ( rule__LayoutCall__Group_3__0 )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==29) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoniLog4DSL.g:6286:3: rule__LayoutCall__Group_3__0
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
    // InternalMoniLog4DSL.g:6295:1: rule__LayoutCall__Group_3__0 : rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1 ;
    public final void rule__LayoutCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6299:1: ( rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1 )
            // InternalMoniLog4DSL.g:6300:2: rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:6307:1: rule__LayoutCall__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LayoutCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6311:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:6312:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:6312:1: ( '(' )
            // InternalMoniLog4DSL.g:6313:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6322:1: rule__LayoutCall__Group_3__1 : rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2 ;
    public final void rule__LayoutCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6326:1: ( rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2 )
            // InternalMoniLog4DSL.g:6327:2: rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:6334:1: rule__LayoutCall__Group_3__1__Impl : ( ( rule__LayoutCall__ArgsAssignment_3_1 ) ) ;
    public final void rule__LayoutCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6338:1: ( ( ( rule__LayoutCall__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:6339:1: ( ( rule__LayoutCall__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:6339:1: ( ( rule__LayoutCall__ArgsAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:6340:2: ( rule__LayoutCall__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:6341:2: ( rule__LayoutCall__ArgsAssignment_3_1 )
            // InternalMoniLog4DSL.g:6341:3: rule__LayoutCall__ArgsAssignment_3_1
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
    // InternalMoniLog4DSL.g:6349:1: rule__LayoutCall__Group_3__2 : rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3 ;
    public final void rule__LayoutCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6353:1: ( rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3 )
            // InternalMoniLog4DSL.g:6354:2: rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:6361:1: rule__LayoutCall__Group_3__2__Impl : ( ( rule__LayoutCall__Group_3_2__0 )* ) ;
    public final void rule__LayoutCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6365:1: ( ( ( rule__LayoutCall__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:6366:1: ( ( rule__LayoutCall__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:6366:1: ( ( rule__LayoutCall__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:6367:2: ( rule__LayoutCall__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:6368:2: ( rule__LayoutCall__Group_3_2__0 )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==33) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:6368:3: rule__LayoutCall__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__LayoutCall__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop44;
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
    // InternalMoniLog4DSL.g:6376:1: rule__LayoutCall__Group_3__3 : rule__LayoutCall__Group_3__3__Impl ;
    public final void rule__LayoutCall__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6380:1: ( rule__LayoutCall__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:6381:2: rule__LayoutCall__Group_3__3__Impl
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
    // InternalMoniLog4DSL.g:6387:1: rule__LayoutCall__Group_3__3__Impl : ( ')' ) ;
    public final void rule__LayoutCall__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6391:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:6392:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:6392:1: ( ')' )
            // InternalMoniLog4DSL.g:6393:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6403:1: rule__LayoutCall__Group_3_2__0 : rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1 ;
    public final void rule__LayoutCall__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6407:1: ( rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1 )
            // InternalMoniLog4DSL.g:6408:2: rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:6415:1: rule__LayoutCall__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__LayoutCall__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6419:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6420:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6420:1: ( ',' )
            // InternalMoniLog4DSL.g:6421:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6430:1: rule__LayoutCall__Group_3_2__1 : rule__LayoutCall__Group_3_2__1__Impl ;
    public final void rule__LayoutCall__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6434:1: ( rule__LayoutCall__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:6435:2: rule__LayoutCall__Group_3_2__1__Impl
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
    // InternalMoniLog4DSL.g:6441:1: rule__LayoutCall__Group_3_2__1__Impl : ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__LayoutCall__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6445:1: ( ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:6446:1: ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6446:1: ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:6447:2: ( rule__LayoutCall__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:6448:2: ( rule__LayoutCall__ArgsAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:6448:3: rule__LayoutCall__ArgsAssignment_3_2_1
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
    // InternalMoniLog4DSL.g:6457:1: rule__EmitEvent__Group__0 : rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1 ;
    public final void rule__EmitEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6461:1: ( rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1 )
            // InternalMoniLog4DSL.g:6462:2: rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1
            {
            pushFollow(FOLLOW_45);
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
    // InternalMoniLog4DSL.g:6469:1: rule__EmitEvent__Group__0__Impl : ( ( rule__EmitEvent__EventAssignment_0 ) ) ;
    public final void rule__EmitEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6473:1: ( ( ( rule__EmitEvent__EventAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:6474:1: ( ( rule__EmitEvent__EventAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:6474:1: ( ( rule__EmitEvent__EventAssignment_0 ) )
            // InternalMoniLog4DSL.g:6475:2: ( rule__EmitEvent__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:6476:2: ( rule__EmitEvent__EventAssignment_0 )
            // InternalMoniLog4DSL.g:6476:3: rule__EmitEvent__EventAssignment_0
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
    // InternalMoniLog4DSL.g:6484:1: rule__EmitEvent__Group__1 : rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2 ;
    public final void rule__EmitEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6488:1: ( rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2 )
            // InternalMoniLog4DSL.g:6489:2: rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2
            {
            pushFollow(FOLLOW_47);
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
    // InternalMoniLog4DSL.g:6496:1: rule__EmitEvent__Group__1__Impl : ( '.' ) ;
    public final void rule__EmitEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6500:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:6501:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:6501:1: ( '.' )
            // InternalMoniLog4DSL.g:6502:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getFullStopKeyword_1()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6511:1: rule__EmitEvent__Group__2 : rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3 ;
    public final void rule__EmitEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6515:1: ( rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3 )
            // InternalMoniLog4DSL.g:6516:2: rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3
            {
            pushFollow(FOLLOW_12);
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
    // InternalMoniLog4DSL.g:6523:1: rule__EmitEvent__Group__2__Impl : ( 'emit' ) ;
    public final void rule__EmitEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6527:1: ( ( 'emit' ) )
            // InternalMoniLog4DSL.g:6528:1: ( 'emit' )
            {
            // InternalMoniLog4DSL.g:6528:1: ( 'emit' )
            // InternalMoniLog4DSL.g:6529:2: 'emit'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEmitKeyword_2()); 
            }
            match(input,58,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6538:1: rule__EmitEvent__Group__3 : rule__EmitEvent__Group__3__Impl ;
    public final void rule__EmitEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6542:1: ( rule__EmitEvent__Group__3__Impl )
            // InternalMoniLog4DSL.g:6543:2: rule__EmitEvent__Group__3__Impl
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
    // InternalMoniLog4DSL.g:6549:1: rule__EmitEvent__Group__3__Impl : ( ( rule__EmitEvent__Group_3__0 )? ) ;
    public final void rule__EmitEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6553:1: ( ( ( rule__EmitEvent__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:6554:1: ( ( rule__EmitEvent__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:6554:1: ( ( rule__EmitEvent__Group_3__0 )? )
            // InternalMoniLog4DSL.g:6555:2: ( rule__EmitEvent__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup_3()); 
            }
            // InternalMoniLog4DSL.g:6556:2: ( rule__EmitEvent__Group_3__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==29) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoniLog4DSL.g:6556:3: rule__EmitEvent__Group_3__0
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
    // InternalMoniLog4DSL.g:6565:1: rule__EmitEvent__Group_3__0 : rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1 ;
    public final void rule__EmitEvent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6569:1: ( rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1 )
            // InternalMoniLog4DSL.g:6570:2: rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:6577:1: rule__EmitEvent__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EmitEvent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6581:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:6582:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:6582:1: ( '(' )
            // InternalMoniLog4DSL.g:6583:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6592:1: rule__EmitEvent__Group_3__1 : rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2 ;
    public final void rule__EmitEvent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6596:1: ( rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2 )
            // InternalMoniLog4DSL.g:6597:2: rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:6604:1: rule__EmitEvent__Group_3__1__Impl : ( ( rule__EmitEvent__ArgsAssignment_3_1 ) ) ;
    public final void rule__EmitEvent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6608:1: ( ( ( rule__EmitEvent__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:6609:1: ( ( rule__EmitEvent__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:6609:1: ( ( rule__EmitEvent__ArgsAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:6610:2: ( rule__EmitEvent__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog4DSL.g:6611:2: ( rule__EmitEvent__ArgsAssignment_3_1 )
            // InternalMoniLog4DSL.g:6611:3: rule__EmitEvent__ArgsAssignment_3_1
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
    // InternalMoniLog4DSL.g:6619:1: rule__EmitEvent__Group_3__2 : rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3 ;
    public final void rule__EmitEvent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6623:1: ( rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3 )
            // InternalMoniLog4DSL.g:6624:2: rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:6631:1: rule__EmitEvent__Group_3__2__Impl : ( ( rule__EmitEvent__Group_3_2__0 )* ) ;
    public final void rule__EmitEvent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6635:1: ( ( ( rule__EmitEvent__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:6636:1: ( ( rule__EmitEvent__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:6636:1: ( ( rule__EmitEvent__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:6637:2: ( rule__EmitEvent__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup_3_2()); 
            }
            // InternalMoniLog4DSL.g:6638:2: ( rule__EmitEvent__Group_3_2__0 )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==33) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:6638:3: rule__EmitEvent__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EmitEvent__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // InternalMoniLog4DSL.g:6646:1: rule__EmitEvent__Group_3__3 : rule__EmitEvent__Group_3__3__Impl ;
    public final void rule__EmitEvent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6650:1: ( rule__EmitEvent__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:6651:2: rule__EmitEvent__Group_3__3__Impl
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
    // InternalMoniLog4DSL.g:6657:1: rule__EmitEvent__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EmitEvent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6661:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:6662:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:6662:1: ( ')' )
            // InternalMoniLog4DSL.g:6663:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6673:1: rule__EmitEvent__Group_3_2__0 : rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1 ;
    public final void rule__EmitEvent__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6677:1: ( rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1 )
            // InternalMoniLog4DSL.g:6678:2: rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:6685:1: rule__EmitEvent__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EmitEvent__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6689:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6690:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6690:1: ( ',' )
            // InternalMoniLog4DSL.g:6691:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getCommaKeyword_3_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:6700:1: rule__EmitEvent__Group_3_2__1 : rule__EmitEvent__Group_3_2__1__Impl ;
    public final void rule__EmitEvent__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6704:1: ( rule__EmitEvent__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:6705:2: rule__EmitEvent__Group_3_2__1__Impl
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
    // InternalMoniLog4DSL.g:6711:1: rule__EmitEvent__Group_3_2__1__Impl : ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__EmitEvent__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6715:1: ( ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:6716:1: ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:6716:1: ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:6717:2: ( rule__EmitEvent__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog4DSL.g:6718:2: ( rule__EmitEvent__ArgsAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:6718:3: rule__EmitEvent__ArgsAssignment_3_2_1
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


    // $ANTLR start "rule__SetVariable__Group__0"
    // InternalMoniLog4DSL.g:6727:1: rule__SetVariable__Group__0 : rule__SetVariable__Group__0__Impl rule__SetVariable__Group__1 ;
    public final void rule__SetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6731:1: ( rule__SetVariable__Group__0__Impl rule__SetVariable__Group__1 )
            // InternalMoniLog4DSL.g:6732:2: rule__SetVariable__Group__0__Impl rule__SetVariable__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SetVariable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__1();

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
    // $ANTLR end "rule__SetVariable__Group__0"


    // $ANTLR start "rule__SetVariable__Group__0__Impl"
    // InternalMoniLog4DSL.g:6739:1: rule__SetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6743:1: ( ( 'set' ) )
            // InternalMoniLog4DSL.g:6744:1: ( 'set' )
            {
            // InternalMoniLog4DSL.g:6744:1: ( 'set' )
            // InternalMoniLog4DSL.g:6745:2: 'set'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getSetKeyword_0()); 
            }
            match(input,59,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getSetKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__Group__0__Impl"


    // $ANTLR start "rule__SetVariable__Group__1"
    // InternalMoniLog4DSL.g:6754:1: rule__SetVariable__Group__1 : rule__SetVariable__Group__1__Impl rule__SetVariable__Group__2 ;
    public final void rule__SetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6758:1: ( rule__SetVariable__Group__1__Impl rule__SetVariable__Group__2 )
            // InternalMoniLog4DSL.g:6759:2: rule__SetVariable__Group__1__Impl rule__SetVariable__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__SetVariable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__2();

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
    // $ANTLR end "rule__SetVariable__Group__1"


    // $ANTLR start "rule__SetVariable__Group__1__Impl"
    // InternalMoniLog4DSL.g:6766:1: rule__SetVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__SetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6770:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:6771:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:6771:1: ( '(' )
            // InternalMoniLog4DSL.g:6772:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__Group__1__Impl"


    // $ANTLR start "rule__SetVariable__Group__2"
    // InternalMoniLog4DSL.g:6781:1: rule__SetVariable__Group__2 : rule__SetVariable__Group__2__Impl rule__SetVariable__Group__3 ;
    public final void rule__SetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6785:1: ( rule__SetVariable__Group__2__Impl rule__SetVariable__Group__3 )
            // InternalMoniLog4DSL.g:6786:2: rule__SetVariable__Group__2__Impl rule__SetVariable__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SetVariable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__3();

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
    // $ANTLR end "rule__SetVariable__Group__2"


    // $ANTLR start "rule__SetVariable__Group__2__Impl"
    // InternalMoniLog4DSL.g:6793:1: rule__SetVariable__Group__2__Impl : ( ( rule__SetVariable__VariableAssignment_2 ) ) ;
    public final void rule__SetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6797:1: ( ( ( rule__SetVariable__VariableAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:6798:1: ( ( rule__SetVariable__VariableAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:6798:1: ( ( rule__SetVariable__VariableAssignment_2 ) )
            // InternalMoniLog4DSL.g:6799:2: ( rule__SetVariable__VariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getVariableAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:6800:2: ( rule__SetVariable__VariableAssignment_2 )
            // InternalMoniLog4DSL.g:6800:3: rule__SetVariable__VariableAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SetVariable__VariableAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getVariableAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__Group__2__Impl"


    // $ANTLR start "rule__SetVariable__Group__3"
    // InternalMoniLog4DSL.g:6808:1: rule__SetVariable__Group__3 : rule__SetVariable__Group__3__Impl rule__SetVariable__Group__4 ;
    public final void rule__SetVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6812:1: ( rule__SetVariable__Group__3__Impl rule__SetVariable__Group__4 )
            // InternalMoniLog4DSL.g:6813:2: rule__SetVariable__Group__3__Impl rule__SetVariable__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__SetVariable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__4();

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
    // $ANTLR end "rule__SetVariable__Group__3"


    // $ANTLR start "rule__SetVariable__Group__3__Impl"
    // InternalMoniLog4DSL.g:6820:1: rule__SetVariable__Group__3__Impl : ( ',' ) ;
    public final void rule__SetVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6824:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:6825:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:6825:1: ( ',' )
            // InternalMoniLog4DSL.g:6826:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getCommaKeyword_3()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getCommaKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__Group__3__Impl"


    // $ANTLR start "rule__SetVariable__Group__4"
    // InternalMoniLog4DSL.g:6835:1: rule__SetVariable__Group__4 : rule__SetVariable__Group__4__Impl rule__SetVariable__Group__5 ;
    public final void rule__SetVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6839:1: ( rule__SetVariable__Group__4__Impl rule__SetVariable__Group__5 )
            // InternalMoniLog4DSL.g:6840:2: rule__SetVariable__Group__4__Impl rule__SetVariable__Group__5
            {
            pushFollow(FOLLOW_11);
            rule__SetVariable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__5();

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
    // $ANTLR end "rule__SetVariable__Group__4"


    // $ANTLR start "rule__SetVariable__Group__4__Impl"
    // InternalMoniLog4DSL.g:6847:1: rule__SetVariable__Group__4__Impl : ( ( rule__SetVariable__ValueAssignment_4 ) ) ;
    public final void rule__SetVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6851:1: ( ( ( rule__SetVariable__ValueAssignment_4 ) ) )
            // InternalMoniLog4DSL.g:6852:1: ( ( rule__SetVariable__ValueAssignment_4 ) )
            {
            // InternalMoniLog4DSL.g:6852:1: ( ( rule__SetVariable__ValueAssignment_4 ) )
            // InternalMoniLog4DSL.g:6853:2: ( rule__SetVariable__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getValueAssignment_4()); 
            }
            // InternalMoniLog4DSL.g:6854:2: ( rule__SetVariable__ValueAssignment_4 )
            // InternalMoniLog4DSL.g:6854:3: rule__SetVariable__ValueAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__SetVariable__ValueAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getValueAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__Group__4__Impl"


    // $ANTLR start "rule__SetVariable__Group__5"
    // InternalMoniLog4DSL.g:6862:1: rule__SetVariable__Group__5 : rule__SetVariable__Group__5__Impl ;
    public final void rule__SetVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6866:1: ( rule__SetVariable__Group__5__Impl )
            // InternalMoniLog4DSL.g:6867:2: rule__SetVariable__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SetVariable__Group__5__Impl();

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
    // $ANTLR end "rule__SetVariable__Group__5"


    // $ANTLR start "rule__SetVariable__Group__5__Impl"
    // InternalMoniLog4DSL.g:6873:1: rule__SetVariable__Group__5__Impl : ( ')' ) ;
    public final void rule__SetVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6877:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:6878:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:6878:1: ( ')' )
            // InternalMoniLog4DSL.g:6879:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__Group__5__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0__0"
    // InternalMoniLog4DSL.g:6889:1: rule__MoniloggerCall__Group_0__0 : rule__MoniloggerCall__Group_0__0__Impl rule__MoniloggerCall__Group_0__1 ;
    public final void rule__MoniloggerCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6893:1: ( rule__MoniloggerCall__Group_0__0__Impl rule__MoniloggerCall__Group_0__1 )
            // InternalMoniLog4DSL.g:6894:2: rule__MoniloggerCall__Group_0__0__Impl rule__MoniloggerCall__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__MoniloggerCall__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0__1();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0__0"


    // $ANTLR start "rule__MoniloggerCall__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:6901:1: rule__MoniloggerCall__Group_0__0__Impl : ( () ) ;
    public final void rule__MoniloggerCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6905:1: ( ( () ) )
            // InternalMoniLog4DSL.g:6906:1: ( () )
            {
            // InternalMoniLog4DSL.g:6906:1: ( () )
            // InternalMoniLog4DSL.g:6907:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getStartMoniLoggerAction_0_0()); 
            }
            // InternalMoniLog4DSL.g:6908:2: ()
            // InternalMoniLog4DSL.g:6908:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getStartMoniLoggerAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0__0__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0__1"
    // InternalMoniLog4DSL.g:6916:1: rule__MoniloggerCall__Group_0__1 : rule__MoniloggerCall__Group_0__1__Impl rule__MoniloggerCall__Group_0__2 ;
    public final void rule__MoniloggerCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6920:1: ( rule__MoniloggerCall__Group_0__1__Impl rule__MoniloggerCall__Group_0__2 )
            // InternalMoniLog4DSL.g:6921:2: rule__MoniloggerCall__Group_0__1__Impl rule__MoniloggerCall__Group_0__2
            {
            pushFollow(FOLLOW_45);
            rule__MoniloggerCall__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0__2();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0__1"


    // $ANTLR start "rule__MoniloggerCall__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:6928:1: rule__MoniloggerCall__Group_0__1__Impl : ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) ) ;
    public final void rule__MoniloggerCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6932:1: ( ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) ) )
            // InternalMoniLog4DSL.g:6933:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) )
            {
            // InternalMoniLog4DSL.g:6933:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) )
            // InternalMoniLog4DSL.g:6934:2: ( rule__MoniloggerCall__MoniloggerAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerAssignment_0_1()); 
            }
            // InternalMoniLog4DSL.g:6935:2: ( rule__MoniloggerCall__MoniloggerAssignment_0_1 )
            // InternalMoniLog4DSL.g:6935:3: rule__MoniloggerCall__MoniloggerAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__MoniloggerAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getMoniloggerAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0__1__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0__2"
    // InternalMoniLog4DSL.g:6943:1: rule__MoniloggerCall__Group_0__2 : rule__MoniloggerCall__Group_0__2__Impl rule__MoniloggerCall__Group_0__3 ;
    public final void rule__MoniloggerCall__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6947:1: ( rule__MoniloggerCall__Group_0__2__Impl rule__MoniloggerCall__Group_0__3 )
            // InternalMoniLog4DSL.g:6948:2: rule__MoniloggerCall__Group_0__2__Impl rule__MoniloggerCall__Group_0__3
            {
            pushFollow(FOLLOW_49);
            rule__MoniloggerCall__Group_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0__3();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0__2"


    // $ANTLR start "rule__MoniloggerCall__Group_0__2__Impl"
    // InternalMoniLog4DSL.g:6955:1: rule__MoniloggerCall__Group_0__2__Impl : ( '.' ) ;
    public final void rule__MoniloggerCall__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6959:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:6960:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:6960:1: ( '.' )
            // InternalMoniLog4DSL.g:6961:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_0_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0__2__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0__3"
    // InternalMoniLog4DSL.g:6970:1: rule__MoniloggerCall__Group_0__3 : rule__MoniloggerCall__Group_0__3__Impl rule__MoniloggerCall__Group_0__4 ;
    public final void rule__MoniloggerCall__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6974:1: ( rule__MoniloggerCall__Group_0__3__Impl rule__MoniloggerCall__Group_0__4 )
            // InternalMoniLog4DSL.g:6975:2: rule__MoniloggerCall__Group_0__3__Impl rule__MoniloggerCall__Group_0__4
            {
            pushFollow(FOLLOW_12);
            rule__MoniloggerCall__Group_0__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0__4();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0__3"


    // $ANTLR start "rule__MoniloggerCall__Group_0__3__Impl"
    // InternalMoniLog4DSL.g:6982:1: rule__MoniloggerCall__Group_0__3__Impl : ( 'start' ) ;
    public final void rule__MoniloggerCall__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6986:1: ( ( 'start' ) )
            // InternalMoniLog4DSL.g:6987:1: ( 'start' )
            {
            // InternalMoniLog4DSL.g:6987:1: ( 'start' )
            // InternalMoniLog4DSL.g:6988:2: 'start'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getStartKeyword_0_3()); 
            }
            match(input,60,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getStartKeyword_0_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0__3__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0__4"
    // InternalMoniLog4DSL.g:6997:1: rule__MoniloggerCall__Group_0__4 : rule__MoniloggerCall__Group_0__4__Impl ;
    public final void rule__MoniloggerCall__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7001:1: ( rule__MoniloggerCall__Group_0__4__Impl )
            // InternalMoniLog4DSL.g:7002:2: rule__MoniloggerCall__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0__4__Impl();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0__4"


    // $ANTLR start "rule__MoniloggerCall__Group_0__4__Impl"
    // InternalMoniLog4DSL.g:7008:1: rule__MoniloggerCall__Group_0__4__Impl : ( ( rule__MoniloggerCall__Group_0_4__0 )? ) ;
    public final void rule__MoniloggerCall__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7012:1: ( ( ( rule__MoniloggerCall__Group_0_4__0 )? ) )
            // InternalMoniLog4DSL.g:7013:1: ( ( rule__MoniloggerCall__Group_0_4__0 )? )
            {
            // InternalMoniLog4DSL.g:7013:1: ( ( rule__MoniloggerCall__Group_0_4__0 )? )
            // InternalMoniLog4DSL.g:7014:2: ( rule__MoniloggerCall__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getGroup_0_4()); 
            }
            // InternalMoniLog4DSL.g:7015:2: ( rule__MoniloggerCall__Group_0_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==29) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoniLog4DSL.g:7015:3: rule__MoniloggerCall__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniloggerCall__Group_0_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getGroup_0_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0__4__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__0"
    // InternalMoniLog4DSL.g:7024:1: rule__MoniloggerCall__Group_0_4__0 : rule__MoniloggerCall__Group_0_4__0__Impl rule__MoniloggerCall__Group_0_4__1 ;
    public final void rule__MoniloggerCall__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7028:1: ( rule__MoniloggerCall__Group_0_4__0__Impl rule__MoniloggerCall__Group_0_4__1 )
            // InternalMoniLog4DSL.g:7029:2: rule__MoniloggerCall__Group_0_4__0__Impl rule__MoniloggerCall__Group_0_4__1
            {
            pushFollow(FOLLOW_3);
            rule__MoniloggerCall__Group_0_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0_4__1();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__0"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__0__Impl"
    // InternalMoniLog4DSL.g:7036:1: rule__MoniloggerCall__Group_0_4__0__Impl : ( '(' ) ;
    public final void rule__MoniloggerCall__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7040:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:7041:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:7041:1: ( '(' )
            // InternalMoniLog4DSL.g:7042:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getLeftParenthesisKeyword_0_4_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getLeftParenthesisKeyword_0_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__0__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__1"
    // InternalMoniLog4DSL.g:7051:1: rule__MoniloggerCall__Group_0_4__1 : rule__MoniloggerCall__Group_0_4__1__Impl rule__MoniloggerCall__Group_0_4__2 ;
    public final void rule__MoniloggerCall__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7055:1: ( rule__MoniloggerCall__Group_0_4__1__Impl rule__MoniloggerCall__Group_0_4__2 )
            // InternalMoniLog4DSL.g:7056:2: rule__MoniloggerCall__Group_0_4__1__Impl rule__MoniloggerCall__Group_0_4__2
            {
            pushFollow(FOLLOW_46);
            rule__MoniloggerCall__Group_0_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0_4__2();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__1"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__1__Impl"
    // InternalMoniLog4DSL.g:7063:1: rule__MoniloggerCall__Group_0_4__1__Impl : ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) ) ;
    public final void rule__MoniloggerCall__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7067:1: ( ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) ) )
            // InternalMoniLog4DSL.g:7068:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) )
            {
            // InternalMoniLog4DSL.g:7068:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) )
            // InternalMoniLog4DSL.g:7069:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getArgsAssignment_0_4_1()); 
            }
            // InternalMoniLog4DSL.g:7070:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_1 )
            // InternalMoniLog4DSL.g:7070:3: rule__MoniloggerCall__ArgsAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__ArgsAssignment_0_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getArgsAssignment_0_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__1__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__2"
    // InternalMoniLog4DSL.g:7078:1: rule__MoniloggerCall__Group_0_4__2 : rule__MoniloggerCall__Group_0_4__2__Impl rule__MoniloggerCall__Group_0_4__3 ;
    public final void rule__MoniloggerCall__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7082:1: ( rule__MoniloggerCall__Group_0_4__2__Impl rule__MoniloggerCall__Group_0_4__3 )
            // InternalMoniLog4DSL.g:7083:2: rule__MoniloggerCall__Group_0_4__2__Impl rule__MoniloggerCall__Group_0_4__3
            {
            pushFollow(FOLLOW_46);
            rule__MoniloggerCall__Group_0_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0_4__3();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__2"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__2__Impl"
    // InternalMoniLog4DSL.g:7090:1: rule__MoniloggerCall__Group_0_4__2__Impl : ( ( rule__MoniloggerCall__Group_0_4_2__0 )* ) ;
    public final void rule__MoniloggerCall__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7094:1: ( ( ( rule__MoniloggerCall__Group_0_4_2__0 )* ) )
            // InternalMoniLog4DSL.g:7095:1: ( ( rule__MoniloggerCall__Group_0_4_2__0 )* )
            {
            // InternalMoniLog4DSL.g:7095:1: ( ( rule__MoniloggerCall__Group_0_4_2__0 )* )
            // InternalMoniLog4DSL.g:7096:2: ( rule__MoniloggerCall__Group_0_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getGroup_0_4_2()); 
            }
            // InternalMoniLog4DSL.g:7097:2: ( rule__MoniloggerCall__Group_0_4_2__0 )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==33) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:7097:3: rule__MoniloggerCall__Group_0_4_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MoniloggerCall__Group_0_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getGroup_0_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__2__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__3"
    // InternalMoniLog4DSL.g:7105:1: rule__MoniloggerCall__Group_0_4__3 : rule__MoniloggerCall__Group_0_4__3__Impl ;
    public final void rule__MoniloggerCall__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7109:1: ( rule__MoniloggerCall__Group_0_4__3__Impl )
            // InternalMoniLog4DSL.g:7110:2: rule__MoniloggerCall__Group_0_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0_4__3__Impl();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__3"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4__3__Impl"
    // InternalMoniLog4DSL.g:7116:1: rule__MoniloggerCall__Group_0_4__3__Impl : ( ')' ) ;
    public final void rule__MoniloggerCall__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7120:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:7121:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:7121:1: ( ')' )
            // InternalMoniLog4DSL.g:7122:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getRightParenthesisKeyword_0_4_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getRightParenthesisKeyword_0_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0_4__3__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4_2__0"
    // InternalMoniLog4DSL.g:7132:1: rule__MoniloggerCall__Group_0_4_2__0 : rule__MoniloggerCall__Group_0_4_2__0__Impl rule__MoniloggerCall__Group_0_4_2__1 ;
    public final void rule__MoniloggerCall__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7136:1: ( rule__MoniloggerCall__Group_0_4_2__0__Impl rule__MoniloggerCall__Group_0_4_2__1 )
            // InternalMoniLog4DSL.g:7137:2: rule__MoniloggerCall__Group_0_4_2__0__Impl rule__MoniloggerCall__Group_0_4_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MoniloggerCall__Group_0_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0_4_2__1();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0_4_2__0"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4_2__0__Impl"
    // InternalMoniLog4DSL.g:7144:1: rule__MoniloggerCall__Group_0_4_2__0__Impl : ( ',' ) ;
    public final void rule__MoniloggerCall__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7148:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:7149:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:7149:1: ( ',' )
            // InternalMoniLog4DSL.g:7150:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getCommaKeyword_0_4_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getCommaKeyword_0_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0_4_2__0__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4_2__1"
    // InternalMoniLog4DSL.g:7159:1: rule__MoniloggerCall__Group_0_4_2__1 : rule__MoniloggerCall__Group_0_4_2__1__Impl ;
    public final void rule__MoniloggerCall__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7163:1: ( rule__MoniloggerCall__Group_0_4_2__1__Impl )
            // InternalMoniLog4DSL.g:7164:2: rule__MoniloggerCall__Group_0_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_0_4_2__1__Impl();

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
    // $ANTLR end "rule__MoniloggerCall__Group_0_4_2__1"


    // $ANTLR start "rule__MoniloggerCall__Group_0_4_2__1__Impl"
    // InternalMoniLog4DSL.g:7170:1: rule__MoniloggerCall__Group_0_4_2__1__Impl : ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) ) ;
    public final void rule__MoniloggerCall__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7174:1: ( ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) ) )
            // InternalMoniLog4DSL.g:7175:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) )
            {
            // InternalMoniLog4DSL.g:7175:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) )
            // InternalMoniLog4DSL.g:7176:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getArgsAssignment_0_4_2_1()); 
            }
            // InternalMoniLog4DSL.g:7177:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 )
            // InternalMoniLog4DSL.g:7177:3: rule__MoniloggerCall__ArgsAssignment_0_4_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__ArgsAssignment_0_4_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getArgsAssignment_0_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_0_4_2__1__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_1__0"
    // InternalMoniLog4DSL.g:7186:1: rule__MoniloggerCall__Group_1__0 : rule__MoniloggerCall__Group_1__0__Impl rule__MoniloggerCall__Group_1__1 ;
    public final void rule__MoniloggerCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7190:1: ( rule__MoniloggerCall__Group_1__0__Impl rule__MoniloggerCall__Group_1__1 )
            // InternalMoniLog4DSL.g:7191:2: rule__MoniloggerCall__Group_1__0__Impl rule__MoniloggerCall__Group_1__1
            {
            pushFollow(FOLLOW_23);
            rule__MoniloggerCall__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_1__1();

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
    // $ANTLR end "rule__MoniloggerCall__Group_1__0"


    // $ANTLR start "rule__MoniloggerCall__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:7198:1: rule__MoniloggerCall__Group_1__0__Impl : ( () ) ;
    public final void rule__MoniloggerCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7202:1: ( ( () ) )
            // InternalMoniLog4DSL.g:7203:1: ( () )
            {
            // InternalMoniLog4DSL.g:7203:1: ( () )
            // InternalMoniLog4DSL.g:7204:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getStopMoniLoggerAction_1_0()); 
            }
            // InternalMoniLog4DSL.g:7205:2: ()
            // InternalMoniLog4DSL.g:7205:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getStopMoniLoggerAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_1__0__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_1__1"
    // InternalMoniLog4DSL.g:7213:1: rule__MoniloggerCall__Group_1__1 : rule__MoniloggerCall__Group_1__1__Impl rule__MoniloggerCall__Group_1__2 ;
    public final void rule__MoniloggerCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7217:1: ( rule__MoniloggerCall__Group_1__1__Impl rule__MoniloggerCall__Group_1__2 )
            // InternalMoniLog4DSL.g:7218:2: rule__MoniloggerCall__Group_1__1__Impl rule__MoniloggerCall__Group_1__2
            {
            pushFollow(FOLLOW_45);
            rule__MoniloggerCall__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_1__2();

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
    // $ANTLR end "rule__MoniloggerCall__Group_1__1"


    // $ANTLR start "rule__MoniloggerCall__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:7225:1: rule__MoniloggerCall__Group_1__1__Impl : ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) ) ;
    public final void rule__MoniloggerCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7229:1: ( ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:7230:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:7230:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:7231:2: ( rule__MoniloggerCall__MoniloggerAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerAssignment_1_1()); 
            }
            // InternalMoniLog4DSL.g:7232:2: ( rule__MoniloggerCall__MoniloggerAssignment_1_1 )
            // InternalMoniLog4DSL.g:7232:3: rule__MoniloggerCall__MoniloggerAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__MoniloggerAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getMoniloggerAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_1__1__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_1__2"
    // InternalMoniLog4DSL.g:7240:1: rule__MoniloggerCall__Group_1__2 : rule__MoniloggerCall__Group_1__2__Impl rule__MoniloggerCall__Group_1__3 ;
    public final void rule__MoniloggerCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7244:1: ( rule__MoniloggerCall__Group_1__2__Impl rule__MoniloggerCall__Group_1__3 )
            // InternalMoniLog4DSL.g:7245:2: rule__MoniloggerCall__Group_1__2__Impl rule__MoniloggerCall__Group_1__3
            {
            pushFollow(FOLLOW_50);
            rule__MoniloggerCall__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_1__3();

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
    // $ANTLR end "rule__MoniloggerCall__Group_1__2"


    // $ANTLR start "rule__MoniloggerCall__Group_1__2__Impl"
    // InternalMoniLog4DSL.g:7252:1: rule__MoniloggerCall__Group_1__2__Impl : ( '.' ) ;
    public final void rule__MoniloggerCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7256:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:7257:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:7257:1: ( '.' )
            // InternalMoniLog4DSL.g:7258:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_1_2()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getFullStopKeyword_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_1__2__Impl"


    // $ANTLR start "rule__MoniloggerCall__Group_1__3"
    // InternalMoniLog4DSL.g:7267:1: rule__MoniloggerCall__Group_1__3 : rule__MoniloggerCall__Group_1__3__Impl ;
    public final void rule__MoniloggerCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7271:1: ( rule__MoniloggerCall__Group_1__3__Impl )
            // InternalMoniLog4DSL.g:7272:2: rule__MoniloggerCall__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniloggerCall__Group_1__3__Impl();

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
    // $ANTLR end "rule__MoniloggerCall__Group_1__3"


    // $ANTLR start "rule__MoniloggerCall__Group_1__3__Impl"
    // InternalMoniLog4DSL.g:7278:1: rule__MoniloggerCall__Group_1__3__Impl : ( 'stop' ) ;
    public final void rule__MoniloggerCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7282:1: ( ( 'stop' ) )
            // InternalMoniLog4DSL.g:7283:1: ( 'stop' )
            {
            // InternalMoniLog4DSL.g:7283:1: ( 'stop' )
            // InternalMoniLog4DSL.g:7284:2: 'stop'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getStopKeyword_1_3()); 
            }
            match(input,61,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getStopKeyword_1_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__Group_1__3__Impl"


    // $ANTLR start "rule__StreamEvent__Group__0"
    // InternalMoniLog4DSL.g:7294:1: rule__StreamEvent__Group__0 : rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 ;
    public final void rule__StreamEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7298:1: ( rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 )
            // InternalMoniLog4DSL.g:7299:2: rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalMoniLog4DSL.g:7306:1: rule__StreamEvent__Group__0__Impl : ( ( rule__StreamEvent__EventAssignment_0 ) ) ;
    public final void rule__StreamEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7310:1: ( ( ( rule__StreamEvent__EventAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:7311:1: ( ( rule__StreamEvent__EventAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:7311:1: ( ( rule__StreamEvent__EventAssignment_0 ) )
            // InternalMoniLog4DSL.g:7312:2: ( rule__StreamEvent__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:7313:2: ( rule__StreamEvent__EventAssignment_0 )
            // InternalMoniLog4DSL.g:7313:3: rule__StreamEvent__EventAssignment_0
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
    // InternalMoniLog4DSL.g:7321:1: rule__StreamEvent__Group__1 : rule__StreamEvent__Group__1__Impl ;
    public final void rule__StreamEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7325:1: ( rule__StreamEvent__Group__1__Impl )
            // InternalMoniLog4DSL.g:7326:2: rule__StreamEvent__Group__1__Impl
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
    // InternalMoniLog4DSL.g:7332:1: rule__StreamEvent__Group__1__Impl : ( ( rule__StreamEvent__Group_1__0 )? ) ;
    public final void rule__StreamEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7336:1: ( ( ( rule__StreamEvent__Group_1__0 )? ) )
            // InternalMoniLog4DSL.g:7337:1: ( ( rule__StreamEvent__Group_1__0 )? )
            {
            // InternalMoniLog4DSL.g:7337:1: ( ( rule__StreamEvent__Group_1__0 )? )
            // InternalMoniLog4DSL.g:7338:2: ( rule__StreamEvent__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup_1()); 
            }
            // InternalMoniLog4DSL.g:7339:2: ( rule__StreamEvent__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==29) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMoniLog4DSL.g:7339:3: rule__StreamEvent__Group_1__0
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
    // InternalMoniLog4DSL.g:7348:1: rule__StreamEvent__Group_1__0 : rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 ;
    public final void rule__StreamEvent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7352:1: ( rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 )
            // InternalMoniLog4DSL.g:7353:2: rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:7360:1: rule__StreamEvent__Group_1__0__Impl : ( '(' ) ;
    public final void rule__StreamEvent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7364:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:7365:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:7365:1: ( '(' )
            // InternalMoniLog4DSL.g:7366:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getLeftParenthesisKeyword_1_0()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:7375:1: rule__StreamEvent__Group_1__1 : rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 ;
    public final void rule__StreamEvent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7379:1: ( rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 )
            // InternalMoniLog4DSL.g:7380:2: rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:7387:1: rule__StreamEvent__Group_1__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) ;
    public final void rule__StreamEvent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7391:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:7392:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:7392:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:7393:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1()); 
            }
            // InternalMoniLog4DSL.g:7394:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            // InternalMoniLog4DSL.g:7394:3: rule__StreamEvent__ValuesAssignment_1_1
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
    // InternalMoniLog4DSL.g:7402:1: rule__StreamEvent__Group_1__2 : rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 ;
    public final void rule__StreamEvent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7406:1: ( rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 )
            // InternalMoniLog4DSL.g:7407:2: rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3
            {
            pushFollow(FOLLOW_46);
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
    // InternalMoniLog4DSL.g:7414:1: rule__StreamEvent__Group_1__2__Impl : ( ( rule__StreamEvent__Group_1_2__0 )* ) ;
    public final void rule__StreamEvent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7418:1: ( ( ( rule__StreamEvent__Group_1_2__0 )* ) )
            // InternalMoniLog4DSL.g:7419:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            {
            // InternalMoniLog4DSL.g:7419:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            // InternalMoniLog4DSL.g:7420:2: ( rule__StreamEvent__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup_1_2()); 
            }
            // InternalMoniLog4DSL.g:7421:2: ( rule__StreamEvent__Group_1_2__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==33) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:7421:3: rule__StreamEvent__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StreamEvent__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
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
    // InternalMoniLog4DSL.g:7429:1: rule__StreamEvent__Group_1__3 : rule__StreamEvent__Group_1__3__Impl ;
    public final void rule__StreamEvent__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7433:1: ( rule__StreamEvent__Group_1__3__Impl )
            // InternalMoniLog4DSL.g:7434:2: rule__StreamEvent__Group_1__3__Impl
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
    // InternalMoniLog4DSL.g:7440:1: rule__StreamEvent__Group_1__3__Impl : ( ')' ) ;
    public final void rule__StreamEvent__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7444:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:7445:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:7445:1: ( ')' )
            // InternalMoniLog4DSL.g:7446:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStreamEventAccess().getRightParenthesisKeyword_1_3()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:7456:1: rule__StreamEvent__Group_1_2__0 : rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 ;
    public final void rule__StreamEvent__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7460:1: ( rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 )
            // InternalMoniLog4DSL.g:7461:2: rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1
            {
            pushFollow(FOLLOW_3);
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
    // InternalMoniLog4DSL.g:7468:1: rule__StreamEvent__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StreamEvent__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7472:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:7473:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:7473:1: ( ',' )
            // InternalMoniLog4DSL.g:7474:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog4DSL.g:7483:1: rule__StreamEvent__Group_1_2__1 : rule__StreamEvent__Group_1_2__1__Impl ;
    public final void rule__StreamEvent__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7487:1: ( rule__StreamEvent__Group_1_2__1__Impl )
            // InternalMoniLog4DSL.g:7488:2: rule__StreamEvent__Group_1_2__1__Impl
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
    // InternalMoniLog4DSL.g:7494:1: rule__StreamEvent__Group_1_2__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) ;
    public final void rule__StreamEvent__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7498:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) )
            // InternalMoniLog4DSL.g:7499:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            {
            // InternalMoniLog4DSL.g:7499:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            // InternalMoniLog4DSL.g:7500:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1()); 
            }
            // InternalMoniLog4DSL.g:7501:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            // InternalMoniLog4DSL.g:7501:3: rule__StreamEvent__ValuesAssignment_1_2_1
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


    // $ANTLR start "rule__PropertyValue__Group_0__0"
    // InternalMoniLog4DSL.g:7510:1: rule__PropertyValue__Group_0__0 : rule__PropertyValue__Group_0__0__Impl rule__PropertyValue__Group_0__1 ;
    public final void rule__PropertyValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7514:1: ( rule__PropertyValue__Group_0__0__Impl rule__PropertyValue__Group_0__1 )
            // InternalMoniLog4DSL.g:7515:2: rule__PropertyValue__Group_0__0__Impl rule__PropertyValue__Group_0__1
            {
            pushFollow(FOLLOW_51);
            rule__PropertyValue__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_0__1();

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
    // $ANTLR end "rule__PropertyValue__Group_0__0"


    // $ANTLR start "rule__PropertyValue__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:7522:1: rule__PropertyValue__Group_0__0__Impl : ( ( rule__PropertyValue__IdAssignment_0_0 ) ) ;
    public final void rule__PropertyValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7526:1: ( ( ( rule__PropertyValue__IdAssignment_0_0 ) ) )
            // InternalMoniLog4DSL.g:7527:1: ( ( rule__PropertyValue__IdAssignment_0_0 ) )
            {
            // InternalMoniLog4DSL.g:7527:1: ( ( rule__PropertyValue__IdAssignment_0_0 ) )
            // InternalMoniLog4DSL.g:7528:2: ( rule__PropertyValue__IdAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getIdAssignment_0_0()); 
            }
            // InternalMoniLog4DSL.g:7529:2: ( rule__PropertyValue__IdAssignment_0_0 )
            // InternalMoniLog4DSL.g:7529:3: rule__PropertyValue__IdAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__IdAssignment_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getIdAssignment_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group_0__1"
    // InternalMoniLog4DSL.g:7537:1: rule__PropertyValue__Group_0__1 : rule__PropertyValue__Group_0__1__Impl ;
    public final void rule__PropertyValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7541:1: ( rule__PropertyValue__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:7542:2: rule__PropertyValue__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_0__1__Impl();

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
    // $ANTLR end "rule__PropertyValue__Group_0__1"


    // $ANTLR start "rule__PropertyValue__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:7548:1: rule__PropertyValue__Group_0__1__Impl : ( ( rule__PropertyValue__Group_0_1__0 )? ) ;
    public final void rule__PropertyValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7552:1: ( ( ( rule__PropertyValue__Group_0_1__0 )? ) )
            // InternalMoniLog4DSL.g:7553:1: ( ( rule__PropertyValue__Group_0_1__0 )? )
            {
            // InternalMoniLog4DSL.g:7553:1: ( ( rule__PropertyValue__Group_0_1__0 )? )
            // InternalMoniLog4DSL.g:7554:2: ( rule__PropertyValue__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getGroup_0_1()); 
            }
            // InternalMoniLog4DSL.g:7555:2: ( rule__PropertyValue__Group_0_1__0 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==62) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoniLog4DSL.g:7555:3: rule__PropertyValue__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PropertyValue__Group_0_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getGroup_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0__1__Impl"


    // $ANTLR start "rule__PropertyValue__Group_0_1__0"
    // InternalMoniLog4DSL.g:7564:1: rule__PropertyValue__Group_0_1__0 : rule__PropertyValue__Group_0_1__0__Impl rule__PropertyValue__Group_0_1__1 ;
    public final void rule__PropertyValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7568:1: ( rule__PropertyValue__Group_0_1__0__Impl rule__PropertyValue__Group_0_1__1 )
            // InternalMoniLog4DSL.g:7569:2: rule__PropertyValue__Group_0_1__0__Impl rule__PropertyValue__Group_0_1__1
            {
            pushFollow(FOLLOW_3);
            rule__PropertyValue__Group_0_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_0_1__1();

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
    // $ANTLR end "rule__PropertyValue__Group_0_1__0"


    // $ANTLR start "rule__PropertyValue__Group_0_1__0__Impl"
    // InternalMoniLog4DSL.g:7576:1: rule__PropertyValue__Group_0_1__0__Impl : ( '=' ) ;
    public final void rule__PropertyValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7580:1: ( ( '=' ) )
            // InternalMoniLog4DSL.g:7581:1: ( '=' )
            {
            // InternalMoniLog4DSL.g:7581:1: ( '=' )
            // InternalMoniLog4DSL.g:7582:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_0_1_0()); 
            }
            match(input,62,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getEqualsSignKeyword_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0_1__0__Impl"


    // $ANTLR start "rule__PropertyValue__Group_0_1__1"
    // InternalMoniLog4DSL.g:7591:1: rule__PropertyValue__Group_0_1__1 : rule__PropertyValue__Group_0_1__1__Impl ;
    public final void rule__PropertyValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7595:1: ( rule__PropertyValue__Group_0_1__1__Impl )
            // InternalMoniLog4DSL.g:7596:2: rule__PropertyValue__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__Group_0_1__1__Impl();

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
    // $ANTLR end "rule__PropertyValue__Group_0_1__1"


    // $ANTLR start "rule__PropertyValue__Group_0_1__1__Impl"
    // InternalMoniLog4DSL.g:7602:1: rule__PropertyValue__Group_0_1__1__Impl : ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) ) ;
    public final void rule__PropertyValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7606:1: ( ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) ) )
            // InternalMoniLog4DSL.g:7607:1: ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) )
            {
            // InternalMoniLog4DSL.g:7607:1: ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) )
            // InternalMoniLog4DSL.g:7608:2: ( rule__PropertyValue__ValueAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getValueAssignment_0_1_1()); 
            }
            // InternalMoniLog4DSL.g:7609:2: ( rule__PropertyValue__ValueAssignment_0_1_1 )
            // InternalMoniLog4DSL.g:7609:3: rule__PropertyValue__ValueAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PropertyValue__ValueAssignment_0_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getValueAssignment_0_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__Group_0_1__1__Impl"


    // $ANTLR start "rule__LanguageExpression__Group__0"
    // InternalMoniLog4DSL.g:7618:1: rule__LanguageExpression__Group__0 : rule__LanguageExpression__Group__0__Impl rule__LanguageExpression__Group__1 ;
    public final void rule__LanguageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7622:1: ( rule__LanguageExpression__Group__0__Impl rule__LanguageExpression__Group__1 )
            // InternalMoniLog4DSL.g:7623:2: rule__LanguageExpression__Group__0__Impl rule__LanguageExpression__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__LanguageExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group__1();

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
    // $ANTLR end "rule__LanguageExpression__Group__0"


    // $ANTLR start "rule__LanguageExpression__Group__0__Impl"
    // InternalMoniLog4DSL.g:7630:1: rule__LanguageExpression__Group__0__Impl : ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) ) ;
    public final void rule__LanguageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7634:1: ( ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:7635:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:7635:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) )
            // InternalMoniLog4DSL.g:7636:2: ( rule__LanguageExpression__LanguageIdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0()); 
            }
            // InternalMoniLog4DSL.g:7637:2: ( rule__LanguageExpression__LanguageIdAssignment_0 )
            // InternalMoniLog4DSL.g:7637:3: rule__LanguageExpression__LanguageIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__LanguageIdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group__0__Impl"


    // $ANTLR start "rule__LanguageExpression__Group__1"
    // InternalMoniLog4DSL.g:7645:1: rule__LanguageExpression__Group__1 : rule__LanguageExpression__Group__1__Impl rule__LanguageExpression__Group__2 ;
    public final void rule__LanguageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7649:1: ( rule__LanguageExpression__Group__1__Impl rule__LanguageExpression__Group__2 )
            // InternalMoniLog4DSL.g:7650:2: rule__LanguageExpression__Group__1__Impl rule__LanguageExpression__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__LanguageExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group__2();

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
    // $ANTLR end "rule__LanguageExpression__Group__1"


    // $ANTLR start "rule__LanguageExpression__Group__1__Impl"
    // InternalMoniLog4DSL.g:7657:1: rule__LanguageExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__LanguageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7661:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:7662:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:7662:1: ( '(' )
            // InternalMoniLog4DSL.g:7663:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group__1__Impl"


    // $ANTLR start "rule__LanguageExpression__Group__2"
    // InternalMoniLog4DSL.g:7672:1: rule__LanguageExpression__Group__2 : rule__LanguageExpression__Group__2__Impl rule__LanguageExpression__Group__3 ;
    public final void rule__LanguageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7676:1: ( rule__LanguageExpression__Group__2__Impl rule__LanguageExpression__Group__3 )
            // InternalMoniLog4DSL.g:7677:2: rule__LanguageExpression__Group__2__Impl rule__LanguageExpression__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__LanguageExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group__3();

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
    // $ANTLR end "rule__LanguageExpression__Group__2"


    // $ANTLR start "rule__LanguageExpression__Group__2__Impl"
    // InternalMoniLog4DSL.g:7684:1: rule__LanguageExpression__Group__2__Impl : ( ( rule__LanguageExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__LanguageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7688:1: ( ( ( rule__LanguageExpression__ExpressionAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:7689:1: ( ( rule__LanguageExpression__ExpressionAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:7689:1: ( ( rule__LanguageExpression__ExpressionAssignment_2 ) )
            // InternalMoniLog4DSL.g:7690:2: ( rule__LanguageExpression__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalMoniLog4DSL.g:7691:2: ( rule__LanguageExpression__ExpressionAssignment_2 )
            // InternalMoniLog4DSL.g:7691:3: rule__LanguageExpression__ExpressionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__ExpressionAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group__2__Impl"


    // $ANTLR start "rule__LanguageExpression__Group__3"
    // InternalMoniLog4DSL.g:7699:1: rule__LanguageExpression__Group__3 : rule__LanguageExpression__Group__3__Impl ;
    public final void rule__LanguageExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7703:1: ( rule__LanguageExpression__Group__3__Impl )
            // InternalMoniLog4DSL.g:7704:2: rule__LanguageExpression__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group__3__Impl();

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
    // $ANTLR end "rule__LanguageExpression__Group__3"


    // $ANTLR start "rule__LanguageExpression__Group__3__Impl"
    // InternalMoniLog4DSL.g:7710:1: rule__LanguageExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__LanguageExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7714:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:7715:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:7715:1: ( ')' )
            // InternalMoniLog4DSL.g:7716:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMoniLog4DSL.g:7726:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7730:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMoniLog4DSL.g:7731:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMoniLog4DSL.g:7738:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7742:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7743:1: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7743:1: ( RULE_ID )
            // InternalMoniLog4DSL.g:7744:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMoniLog4DSL.g:7753:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7757:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMoniLog4DSL.g:7758:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMoniLog4DSL.g:7764:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7768:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMoniLog4DSL.g:7769:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMoniLog4DSL.g:7769:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMoniLog4DSL.g:7770:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMoniLog4DSL.g:7771:2: ( rule__QualifiedName__Group_1__0 )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==57) ) {
                    int LA52_2 = input.LA(2);

                    if ( (LA52_2==RULE_ID) ) {
                        alt52=1;
                    }


                }


                switch (alt52) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:7771:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMoniLog4DSL.g:7780:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7784:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMoniLog4DSL.g:7785:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:7792:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7796:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:7797:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:7797:1: ( '.' )
            // InternalMoniLog4DSL.g:7798:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            match(input,57,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMoniLog4DSL.g:7807:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7811:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:7812:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:7818:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7822:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:7823:1: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:7823:1: ( RULE_ID )
            // InternalMoniLog4DSL.g:7824:2: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalMoniLog4DSL.g:7834:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7838:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMoniLog4DSL.g:7839:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_53);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalMoniLog4DSL.g:7846:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7850:1: ( ( ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:7851:1: ( ruleQualifiedName )
            {
            // InternalMoniLog4DSL.g:7851:1: ( ruleQualifiedName )
            // InternalMoniLog4DSL.g:7852:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalMoniLog4DSL.g:7861:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7865:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMoniLog4DSL.g:7866:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalMoniLog4DSL.g:7872:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:7876:1: ( ( ( '.*' )? ) )
            // InternalMoniLog4DSL.g:7877:1: ( ( '.*' )? )
            {
            // InternalMoniLog4DSL.g:7877:1: ( ( '.*' )? )
            // InternalMoniLog4DSL.g:7878:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalMoniLog4DSL.g:7879:2: ( '.*' )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==63) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoniLog4DSL.g:7879:3: '.*'
                    {
                    match(input,63,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Document__UnorderedGroup_3"
    // InternalMoniLog4DSL.g:7888:1: rule__Document__UnorderedGroup_3 : ( rule__Document__UnorderedGroup_3__0 )? ;
    public final void rule__Document__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
        	
        try {
            // InternalMoniLog4DSL.g:7893:1: ( ( rule__Document__UnorderedGroup_3__0 )? )
            // InternalMoniLog4DSL.g:7894:2: ( rule__Document__UnorderedGroup_3__0 )?
            {
            // InternalMoniLog4DSL.g:7894:2: ( rule__Document__UnorderedGroup_3__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 >= 41 && LA54_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt54=1;
            }
            else if ( ( LA54_0 == 12 || LA54_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt54=1;
            }
            else if ( LA54_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt54=1;
            }
            else if ( ( LA54_0 == 11 || LA54_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoniLog4DSL.g:7894:2: rule__Document__UnorderedGroup_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_3__0();

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

            	getUnorderedGroupHelper().leave(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_3"


    // $ANTLR start "rule__Document__UnorderedGroup_3__Impl"
    // InternalMoniLog4DSL.g:7902:1: rule__Document__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) ) ;
    public final void rule__Document__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog4DSL.g:7907:1: ( ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) ) )
            // InternalMoniLog4DSL.g:7908:3: ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) )
            {
            // InternalMoniLog4DSL.g:7908:3: ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) )
            int alt59=4;
            int LA59_0 = input.LA(1);

            if ( LA59_0 >= 41 && LA59_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt59=1;
            }
            else if ( ( LA59_0 == 12 || LA59_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt59=2;
            }
            else if ( LA59_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt59=3;
            }
            else if ( ( LA59_0 == 11 || LA59_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt59=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoniLog4DSL.g:7909:3: ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7909:3: ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7910:4: {...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalMoniLog4DSL.g:7910:104: ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) )
                    // InternalMoniLog4DSL.g:7911:5: ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalMoniLog4DSL.g:7917:5: ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) )
                    // InternalMoniLog4DSL.g:7918:6: ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* )
                    {
                    // InternalMoniLog4DSL.g:7918:6: ( ( rule__Document__EventsAssignment_3_0 ) )
                    // InternalMoniLog4DSL.g:7919:7: ( rule__Document__EventsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEventsAssignment_3_0()); 
                    }
                    // InternalMoniLog4DSL.g:7920:7: ( rule__Document__EventsAssignment_3_0 )
                    // InternalMoniLog4DSL.g:7920:8: rule__Document__EventsAssignment_3_0
                    {
                    pushFollow(FOLLOW_54);
                    rule__Document__EventsAssignment_3_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getEventsAssignment_3_0()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7923:6: ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* )
                    // InternalMoniLog4DSL.g:7924:7: ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEventsAssignment_3_0()); 
                    }
                    // InternalMoniLog4DSL.g:7925:7: ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )*
                    loop55:
                    do {
                        int alt55=2;
                        alt55 = dfa55.predict(input);
                        switch (alt55) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7925:8: ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_54);
                    	    rule__Document__EventsAssignment_3_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getEventsAssignment_3_0()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:7931:3: ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7931:3: ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7932:4: {...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalMoniLog4DSL.g:7932:104: ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) )
                    // InternalMoniLog4DSL.g:7933:5: ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalMoniLog4DSL.g:7939:5: ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) )
                    // InternalMoniLog4DSL.g:7940:6: ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* )
                    {
                    // InternalMoniLog4DSL.g:7940:6: ( ( rule__Document__AppendersAssignment_3_1 ) )
                    // InternalMoniLog4DSL.g:7941:7: ( rule__Document__AppendersAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getAppendersAssignment_3_1()); 
                    }
                    // InternalMoniLog4DSL.g:7942:7: ( rule__Document__AppendersAssignment_3_1 )
                    // InternalMoniLog4DSL.g:7942:8: rule__Document__AppendersAssignment_3_1
                    {
                    pushFollow(FOLLOW_55);
                    rule__Document__AppendersAssignment_3_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getAppendersAssignment_3_1()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7945:6: ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* )
                    // InternalMoniLog4DSL.g:7946:7: ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getAppendersAssignment_3_1()); 
                    }
                    // InternalMoniLog4DSL.g:7947:7: ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )*
                    loop56:
                    do {
                        int alt56=2;
                        alt56 = dfa56.predict(input);
                        switch (alt56) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7947:8: ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1
                    	    {
                    	    pushFollow(FOLLOW_55);
                    	    rule__Document__AppendersAssignment_3_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getAppendersAssignment_3_1()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:7953:3: ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7953:3: ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7954:4: {...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalMoniLog4DSL.g:7954:104: ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) )
                    // InternalMoniLog4DSL.g:7955:5: ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalMoniLog4DSL.g:7961:5: ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) )
                    // InternalMoniLog4DSL.g:7962:6: ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* )
                    {
                    // InternalMoniLog4DSL.g:7962:6: ( ( rule__Document__LayoutsAssignment_3_2 ) )
                    // InternalMoniLog4DSL.g:7963:7: ( rule__Document__LayoutsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getLayoutsAssignment_3_2()); 
                    }
                    // InternalMoniLog4DSL.g:7964:7: ( rule__Document__LayoutsAssignment_3_2 )
                    // InternalMoniLog4DSL.g:7964:8: rule__Document__LayoutsAssignment_3_2
                    {
                    pushFollow(FOLLOW_56);
                    rule__Document__LayoutsAssignment_3_2();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getLayoutsAssignment_3_2()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7967:6: ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* )
                    // InternalMoniLog4DSL.g:7968:7: ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getLayoutsAssignment_3_2()); 
                    }
                    // InternalMoniLog4DSL.g:7969:7: ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==32) ) {
                            int LA57_2 = input.LA(2);

                            if ( (LA57_2==RULE_ID) ) {
                                int LA57_3 = input.LA(3);

                                if ( (synpred3_InternalMoniLog4DSL()) ) {
                                    alt57=1;
                                }


                            }


                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7969:8: ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_56);
                    	    rule__Document__LayoutsAssignment_3_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getLayoutsAssignment_3_2()); 
                    }

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:7975:3: ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:7975:3: ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) )
                    // InternalMoniLog4DSL.g:7976:4: {...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalMoniLog4DSL.g:7976:104: ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) )
                    // InternalMoniLog4DSL.g:7977:5: ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // InternalMoniLog4DSL.g:7983:5: ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) )
                    // InternalMoniLog4DSL.g:7984:6: ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* )
                    {
                    // InternalMoniLog4DSL.g:7984:6: ( ( rule__Document__MoniloggersAssignment_3_3 ) )
                    // InternalMoniLog4DSL.g:7985:7: ( rule__Document__MoniloggersAssignment_3_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getMoniloggersAssignment_3_3()); 
                    }
                    // InternalMoniLog4DSL.g:7986:7: ( rule__Document__MoniloggersAssignment_3_3 )
                    // InternalMoniLog4DSL.g:7986:8: rule__Document__MoniloggersAssignment_3_3
                    {
                    pushFollow(FOLLOW_57);
                    rule__Document__MoniloggersAssignment_3_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getMoniloggersAssignment_3_3()); 
                    }

                    }

                    // InternalMoniLog4DSL.g:7989:6: ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* )
                    // InternalMoniLog4DSL.g:7990:7: ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getMoniloggersAssignment_3_3()); 
                    }
                    // InternalMoniLog4DSL.g:7991:7: ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )*
                    loop58:
                    do {
                        int alt58=2;
                        alt58 = dfa58.predict(input);
                        switch (alt58) {
                    	case 1 :
                    	    // InternalMoniLog4DSL.g:7991:8: ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3
                    	    {
                    	    pushFollow(FOLLOW_57);
                    	    rule__Document__MoniloggersAssignment_3_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDocumentAccess().getMoniloggersAssignment_3_3()); 
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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Document__UnorderedGroup_3__0"
    // InternalMoniLog4DSL.g:8005:1: rule__Document__UnorderedGroup_3__0 : rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__1 )? ;
    public final void rule__Document__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8009:1: ( rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__1 )? )
            // InternalMoniLog4DSL.g:8010:2: rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_57);
            rule__Document__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:8011:2: ( rule__Document__UnorderedGroup_3__1 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 >= 41 && LA60_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt60=1;
            }
            else if ( ( LA60_0 == 12 || LA60_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt60=1;
            }
            else if ( LA60_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt60=1;
            }
            else if ( ( LA60_0 == 11 || LA60_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoniLog4DSL.g:8011:2: rule__Document__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_3__1();

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
    // $ANTLR end "rule__Document__UnorderedGroup_3__0"


    // $ANTLR start "rule__Document__UnorderedGroup_3__1"
    // InternalMoniLog4DSL.g:8017:1: rule__Document__UnorderedGroup_3__1 : rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__2 )? ;
    public final void rule__Document__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8021:1: ( rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__2 )? )
            // InternalMoniLog4DSL.g:8022:2: rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_57);
            rule__Document__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:8023:2: ( rule__Document__UnorderedGroup_3__2 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( LA61_0 >= 41 && LA61_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt61=1;
            }
            else if ( ( LA61_0 == 12 || LA61_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt61=1;
            }
            else if ( LA61_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt61=1;
            }
            else if ( ( LA61_0 == 11 || LA61_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoniLog4DSL.g:8023:2: rule__Document__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_3__2();

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
    // $ANTLR end "rule__Document__UnorderedGroup_3__1"


    // $ANTLR start "rule__Document__UnorderedGroup_3__2"
    // InternalMoniLog4DSL.g:8029:1: rule__Document__UnorderedGroup_3__2 : rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__3 )? ;
    public final void rule__Document__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8033:1: ( rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__3 )? )
            // InternalMoniLog4DSL.g:8034:2: rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_57);
            rule__Document__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog4DSL.g:8035:2: ( rule__Document__UnorderedGroup_3__3 )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( LA62_0 >= 41 && LA62_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt62=1;
            }
            else if ( ( LA62_0 == 12 || LA62_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt62=1;
            }
            else if ( LA62_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt62=1;
            }
            else if ( ( LA62_0 == 11 || LA62_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoniLog4DSL.g:8035:2: rule__Document__UnorderedGroup_3__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Document__UnorderedGroup_3__3();

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
    // $ANTLR end "rule__Document__UnorderedGroup_3__2"


    // $ANTLR start "rule__Document__UnorderedGroup_3__3"
    // InternalMoniLog4DSL.g:8041:1: rule__Document__UnorderedGroup_3__3 : rule__Document__UnorderedGroup_3__Impl ;
    public final void rule__Document__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8045:1: ( rule__Document__UnorderedGroup_3__Impl )
            // InternalMoniLog4DSL.g:8046:2: rule__Document__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Document__UnorderedGroup_3__Impl();

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
    // $ANTLR end "rule__Document__UnorderedGroup_3__3"


    // $ANTLR start "rule__Document__NameAssignment_1"
    // InternalMoniLog4DSL.g:8053:1: rule__Document__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8057:1: ( ( ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:8058:2: ( ruleQualifiedName )
            {
            // InternalMoniLog4DSL.g:8058:2: ( ruleQualifiedName )
            // InternalMoniLog4DSL.g:8059:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__NameAssignment_1"


    // $ANTLR start "rule__Document__ImportsAssignment_2"
    // InternalMoniLog4DSL.g:8068:1: rule__Document__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Document__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8072:1: ( ( ruleImport ) )
            // InternalMoniLog4DSL.g:8073:2: ( ruleImport )
            {
            // InternalMoniLog4DSL.g:8073:2: ( ruleImport )
            // InternalMoniLog4DSL.g:8074:3: ruleImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getImportsImportParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getImportsImportParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__ImportsAssignment_2"


    // $ANTLR start "rule__Document__EventsAssignment_3_0"
    // InternalMoniLog4DSL.g:8083:1: rule__Document__EventsAssignment_3_0 : ( ruleEvent ) ;
    public final void rule__Document__EventsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8087:1: ( ( ruleEvent ) )
            // InternalMoniLog4DSL.g:8088:2: ( ruleEvent )
            {
            // InternalMoniLog4DSL.g:8088:2: ( ruleEvent )
            // InternalMoniLog4DSL.g:8089:3: ruleEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_3_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getEventsEventParserRuleCall_3_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__EventsAssignment_3_0"


    // $ANTLR start "rule__Document__AppendersAssignment_3_1"
    // InternalMoniLog4DSL.g:8098:1: rule__Document__AppendersAssignment_3_1 : ( ruleAppender ) ;
    public final void rule__Document__AppendersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8102:1: ( ( ruleAppender ) )
            // InternalMoniLog4DSL.g:8103:2: ( ruleAppender )
            {
            // InternalMoniLog4DSL.g:8103:2: ( ruleAppender )
            // InternalMoniLog4DSL.g:8104:3: ruleAppender
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleAppender();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getAppendersAppenderParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__AppendersAssignment_3_1"


    // $ANTLR start "rule__Document__LayoutsAssignment_3_2"
    // InternalMoniLog4DSL.g:8113:1: rule__Document__LayoutsAssignment_3_2 : ( ruleLayout ) ;
    public final void rule__Document__LayoutsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8117:1: ( ( ruleLayout ) )
            // InternalMoniLog4DSL.g:8118:2: ( ruleLayout )
            {
            // InternalMoniLog4DSL.g:8118:2: ( ruleLayout )
            // InternalMoniLog4DSL.g:8119:3: ruleLayout
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_3_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getLayoutsLayoutParserRuleCall_3_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__LayoutsAssignment_3_2"


    // $ANTLR start "rule__Document__MoniloggersAssignment_3_3"
    // InternalMoniLog4DSL.g:8128:1: rule__Document__MoniloggersAssignment_3_3 : ( ruleMoniLogger ) ;
    public final void rule__Document__MoniloggersAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8132:1: ( ( ruleMoniLogger ) )
            // InternalMoniLog4DSL.g:8133:2: ( ruleMoniLogger )
            {
            // InternalMoniLog4DSL.g:8133:2: ( ruleMoniLogger )
            // InternalMoniLog4DSL.g:8134:3: ruleMoniLogger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getMoniloggersMoniLoggerParserRuleCall_3_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleMoniLogger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDocumentAccess().getMoniloggersMoniLoggerParserRuleCall_3_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Document__MoniloggersAssignment_3_3"


    // $ANTLR start "rule__Import__ImportedNamespaceAssignment_1"
    // InternalMoniLog4DSL.g:8143:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8147:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMoniLog4DSL.g:8148:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMoniLog4DSL.g:8148:2: ( ruleQualifiedNameWithWildcard )
            // InternalMoniLog4DSL.g:8149:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Import__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__LocalAppender__AnnotationsAssignment_0"
    // InternalMoniLog4DSL.g:8158:1: rule__LocalAppender__AnnotationsAssignment_0 : ( ruleAppenderAnnotation ) ;
    public final void rule__LocalAppender__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8162:1: ( ( ruleAppenderAnnotation ) )
            // InternalMoniLog4DSL.g:8163:2: ( ruleAppenderAnnotation )
            {
            // InternalMoniLog4DSL.g:8163:2: ( ruleAppenderAnnotation )
            // InternalMoniLog4DSL.g:8164:3: ruleAppenderAnnotation
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
    // InternalMoniLog4DSL.g:8173:1: rule__LocalAppender__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalAppender__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8177:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8178:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8178:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8179:3: RULE_ID
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


    // $ANTLR start "rule__LocalAppender__ParameterDeclAssignment_3_1"
    // InternalMoniLog4DSL.g:8188:1: rule__LocalAppender__ParameterDeclAssignment_3_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__LocalAppender__ParameterDeclAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8192:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog4DSL.g:8193:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog4DSL.g:8193:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog4DSL.g:8194:3: ruleParameterDeclVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__ParameterDeclAssignment_3_1"


    // $ANTLR start "rule__LocalAppender__CallsAssignment_5"
    // InternalMoniLog4DSL.g:8203:1: rule__LocalAppender__CallsAssignment_5 : ( ruleAppenderCall ) ;
    public final void rule__LocalAppender__CallsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8207:1: ( ( ruleAppenderCall ) )
            // InternalMoniLog4DSL.g:8208:2: ( ruleAppenderCall )
            {
            // InternalMoniLog4DSL.g:8208:2: ( ruleAppenderCall )
            // InternalMoniLog4DSL.g:8209:3: ruleAppenderCall
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
    // InternalMoniLog4DSL.g:8218:1: rule__LocalAppender__CallsAssignment_6_1 : ( ruleAppenderCall ) ;
    public final void rule__LocalAppender__CallsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8222:1: ( ( ruleAppenderCall ) )
            // InternalMoniLog4DSL.g:8223:2: ( ruleAppenderCall )
            {
            // InternalMoniLog4DSL.g:8223:2: ( ruleAppenderCall )
            // InternalMoniLog4DSL.g:8224:3: ruleAppenderCall
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
    // InternalMoniLog4DSL.g:8233:1: rule__ExternalAppender__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalAppender__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8237:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8238:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8238:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8239:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ExternalAppender__ParameterDeclAssignment_2_1"
    // InternalMoniLog4DSL.g:8248:1: rule__ExternalAppender__ParameterDeclAssignment_2_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__ExternalAppender__ParameterDeclAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8252:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog4DSL.g:8253:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog4DSL.g:8253:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog4DSL.g:8254:3: ruleParameterDeclVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalAppenderAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalAppender__ParameterDeclAssignment_2_1"


    // $ANTLR start "rule__LocalLayout__NameAssignment_1"
    // InternalMoniLog4DSL.g:8263:1: rule__LocalLayout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalLayout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8267:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8268:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8268:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8269:3: RULE_ID
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


    // $ANTLR start "rule__LocalLayout__ParameterDeclAssignment_2_1"
    // InternalMoniLog4DSL.g:8278:1: rule__LocalLayout__ParameterDeclAssignment_2_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__LocalLayout__ParameterDeclAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8282:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog4DSL.g:8283:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog4DSL.g:8283:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog4DSL.g:8284:3: ruleParameterDeclVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalLayout__ParameterDeclAssignment_2_1"


    // $ANTLR start "rule__LocalLayout__CallAssignment_4"
    // InternalMoniLog4DSL.g:8293:1: rule__LocalLayout__CallAssignment_4 : ( ruleLayoutCall ) ;
    public final void rule__LocalLayout__CallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8297:1: ( ( ruleLayoutCall ) )
            // InternalMoniLog4DSL.g:8298:2: ( ruleLayoutCall )
            {
            // InternalMoniLog4DSL.g:8298:2: ( ruleLayoutCall )
            // InternalMoniLog4DSL.g:8299:3: ruleLayoutCall
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
    // InternalMoniLog4DSL.g:8308:1: rule__ExternalLayout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalLayout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8312:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8313:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8313:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8314:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getNameIDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__ExternalLayout__ParameterDeclAssignment_2_1"
    // InternalMoniLog4DSL.g:8323:1: rule__ExternalLayout__ParameterDeclAssignment_2_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__ExternalLayout__ParameterDeclAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8327:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog4DSL.g:8328:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog4DSL.g:8328:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog4DSL.g:8329:3: ruleParameterDeclVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExternalLayoutAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__ParameterDeclAssignment_2_1"


    // $ANTLR start "rule__ParameterDeclVarArgs__ParametersAssignment_1_0"
    // InternalMoniLog4DSL.g:8338:1: rule__ParameterDeclVarArgs__ParametersAssignment_1_0 : ( ruleParameter ) ;
    public final void rule__ParameterDeclVarArgs__ParametersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8342:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8343:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8343:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8344:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__ParametersAssignment_1_0"


    // $ANTLR start "rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1"
    // InternalMoniLog4DSL.g:8353:1: rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8357:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8358:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8358:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8359:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1"


    // $ANTLR start "rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1"
    // InternalMoniLog4DSL.g:8368:1: rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 : ( ruleParameter ) ;
    public final void rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8372:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8373:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8373:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8374:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsParameterParserRuleCall_1_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsParameterParserRuleCall_1_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0"
    // InternalMoniLog4DSL.g:8383:1: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 : ( ruleParameter ) ;
    public final void rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8387:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8388:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8388:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8389:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0"


    // $ANTLR start "rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1"
    // InternalMoniLog4DSL.g:8398:1: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8402:1: ( ( ruleParameter ) )
            // InternalMoniLog4DSL.g:8403:2: ( ruleParameter )
            {
            // InternalMoniLog4DSL.g:8403:2: ( ruleParameter )
            // InternalMoniLog4DSL.g:8404:3: ruleParameter
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameter();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersParameterParserRuleCall_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1"


    // $ANTLR start "rule__MoniLogger__AnnotationsAssignment_0"
    // InternalMoniLog4DSL.g:8413:1: rule__MoniLogger__AnnotationsAssignment_0 : ( ruleMoniLoggerAnnotation ) ;
    public final void rule__MoniLogger__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8417:1: ( ( ruleMoniLoggerAnnotation ) )
            // InternalMoniLog4DSL.g:8418:2: ( ruleMoniLoggerAnnotation )
            {
            // InternalMoniLog4DSL.g:8418:2: ( ruleMoniLoggerAnnotation )
            // InternalMoniLog4DSL.g:8419:3: ruleMoniLoggerAnnotation
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
    // InternalMoniLog4DSL.g:8428:1: rule__MoniLogger__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MoniLogger__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8432:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8433:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8433:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8434:3: RULE_ID
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


    // $ANTLR start "rule__MoniLogger__ParameterDeclAssignment_3_1"
    // InternalMoniLog4DSL.g:8443:1: rule__MoniLogger__ParameterDeclAssignment_3_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__MoniLogger__ParameterDeclAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8447:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog4DSL.g:8448:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog4DSL.g:8448:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog4DSL.g:8449:3: ruleParameterDeclVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getParameterDeclParameterDeclVarArgsParserRuleCall_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__ParameterDeclAssignment_3_1"


    // $ANTLR start "rule__MoniLogger__LevelAssignment_4_1"
    // InternalMoniLog4DSL.g:8458:1: rule__MoniLogger__LevelAssignment_4_1 : ( ruleLogLevel ) ;
    public final void rule__MoniLogger__LevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8462:1: ( ( ruleLogLevel ) )
            // InternalMoniLog4DSL.g:8463:2: ( ruleLogLevel )
            {
            // InternalMoniLog4DSL.g:8463:2: ( ruleLogLevel )
            // InternalMoniLog4DSL.g:8464:3: ruleLogLevel
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


    // $ANTLR start "rule__MoniLogger__StreamEventAssignment_7"
    // InternalMoniLog4DSL.g:8473:1: rule__MoniLogger__StreamEventAssignment_7 : ( ruleStreamEvent ) ;
    public final void rule__MoniLogger__StreamEventAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8477:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8478:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8478:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8479:3: ruleStreamEvent
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getStreamEventStreamEventParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getStreamEventStreamEventParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__StreamEventAssignment_7"


    // $ANTLR start "rule__MoniLogger__ConditionsAssignment_8_2"
    // InternalMoniLog4DSL.g:8488:1: rule__MoniLogger__ConditionsAssignment_8_2 : ( ruleCondition ) ;
    public final void rule__MoniLogger__ConditionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8492:1: ( ( ruleCondition ) )
            // InternalMoniLog4DSL.g:8493:2: ( ruleCondition )
            {
            // InternalMoniLog4DSL.g:8493:2: ( ruleCondition )
            // InternalMoniLog4DSL.g:8494:3: ruleCondition
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
    // InternalMoniLog4DSL.g:8503:1: rule__MoniLogger__ConditionsAssignment_8_3_1 : ( ruleCondition ) ;
    public final void rule__MoniLogger__ConditionsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8507:1: ( ( ruleCondition ) )
            // InternalMoniLog4DSL.g:8508:2: ( ruleCondition )
            {
            // InternalMoniLog4DSL.g:8508:2: ( ruleCondition )
            // InternalMoniLog4DSL.g:8509:3: ruleCondition
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
    // InternalMoniLog4DSL.g:8518:1: rule__MoniLogger__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__MoniLogger__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8522:1: ( ( ruleAction ) )
            // InternalMoniLog4DSL.g:8523:2: ( ruleAction )
            {
            // InternalMoniLog4DSL.g:8523:2: ( ruleAction )
            // InternalMoniLog4DSL.g:8524:3: ruleAction
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
    // InternalMoniLog4DSL.g:8533:1: rule__MoniLogger__ActionsAssignment_12_1 : ( ruleAction ) ;
    public final void rule__MoniLogger__ActionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8537:1: ( ( ruleAction ) )
            // InternalMoniLog4DSL.g:8538:2: ( ruleAction )
            {
            // InternalMoniLog4DSL.g:8538:2: ( ruleAction )
            // InternalMoniLog4DSL.g:8539:3: ruleAction
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
    // InternalMoniLog4DSL.g:8548:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8552:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8553:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8553:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8554:3: RULE_ID
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


    // $ANTLR start "rule__Event__NameAssignment_0_2"
    // InternalMoniLog4DSL.g:8563:1: rule__Event__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8567:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8568:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8568:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8569:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_0_2"


    // $ANTLR start "rule__Event__ParameterDeclAssignment_0_3_1"
    // InternalMoniLog4DSL.g:8578:1: rule__Event__ParameterDeclAssignment_0_3_1 : ( ruleParameterDeclNoVarArgs ) ;
    public final void rule__Event__ParameterDeclAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8582:1: ( ( ruleParameterDeclNoVarArgs ) )
            // InternalMoniLog4DSL.g:8583:2: ( ruleParameterDeclNoVarArgs )
            {
            // InternalMoniLog4DSL.g:8583:2: ( ruleParameterDeclNoVarArgs )
            // InternalMoniLog4DSL.g:8584:3: ruleParameterDeclNoVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_0_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclNoVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_0_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParameterDeclAssignment_0_3_1"


    // $ANTLR start "rule__Event__KindAssignment_0_5"
    // InternalMoniLog4DSL.g:8593:1: rule__Event__KindAssignment_0_5 : ( ruleASTEventKind ) ;
    public final void rule__Event__KindAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8597:1: ( ( ruleASTEventKind ) )
            // InternalMoniLog4DSL.g:8598:2: ( ruleASTEventKind )
            {
            // InternalMoniLog4DSL.g:8598:2: ( ruleASTEventKind )
            // InternalMoniLog4DSL.g:8599:3: ruleASTEventKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindASTEventKindParserRuleCall_0_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleASTEventKind();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getKindASTEventKindParserRuleCall_0_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__KindAssignment_0_5"


    // $ANTLR start "rule__Event__RuleIDAssignment_0_6"
    // InternalMoniLog4DSL.g:8608:1: rule__Event__RuleIDAssignment_0_6 : ( RULE_ID ) ;
    public final void rule__Event__RuleIDAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8612:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8613:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8613:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8614:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRuleIDIDTerminalRuleCall_0_6_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getRuleIDIDTerminalRuleCall_0_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__RuleIDAssignment_0_6"


    // $ANTLR start "rule__Event__NameAssignment_1_2"
    // InternalMoniLog4DSL.g:8623:1: rule__Event__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8627:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8628:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8628:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8629:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_1_2"


    // $ANTLR start "rule__Event__KindAssignment_1_3_1"
    // InternalMoniLog4DSL.g:8638:1: rule__Event__KindAssignment_1_3_1 : ( ruleTemporalPatternKind ) ;
    public final void rule__Event__KindAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8642:1: ( ( ruleTemporalPatternKind ) )
            // InternalMoniLog4DSL.g:8643:2: ( ruleTemporalPatternKind )
            {
            // InternalMoniLog4DSL.g:8643:2: ( ruleTemporalPatternKind )
            // InternalMoniLog4DSL.g:8644:3: ruleTemporalPatternKind
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindTemporalPatternKindEnumRuleCall_1_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemporalPatternKind();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getKindTemporalPatternKindEnumRuleCall_1_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__KindAssignment_1_3_1"


    // $ANTLR start "rule__Event__ParameterDeclAssignment_1_4_1"
    // InternalMoniLog4DSL.g:8653:1: rule__Event__ParameterDeclAssignment_1_4_1 : ( ruleParameterDeclNoVarArgs ) ;
    public final void rule__Event__ParameterDeclAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8657:1: ( ( ruleParameterDeclNoVarArgs ) )
            // InternalMoniLog4DSL.g:8658:2: ( ruleParameterDeclNoVarArgs )
            {
            // InternalMoniLog4DSL.g:8658:2: ( ruleParameterDeclNoVarArgs )
            // InternalMoniLog4DSL.g:8659:3: ruleParameterDeclNoVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_1_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclNoVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_1_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParameterDeclAssignment_1_4_1"


    // $ANTLR start "rule__Event__PatternAssignment_1_6"
    // InternalMoniLog4DSL.g:8668:1: rule__Event__PatternAssignment_1_6 : ( ruleTemporalPattern ) ;
    public final void rule__Event__PatternAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8672:1: ( ( ruleTemporalPattern ) )
            // InternalMoniLog4DSL.g:8673:2: ( ruleTemporalPattern )
            {
            // InternalMoniLog4DSL.g:8673:2: ( ruleTemporalPattern )
            // InternalMoniLog4DSL.g:8674:3: ruleTemporalPattern
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getPatternTemporalPatternParserRuleCall_1_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleTemporalPattern();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getPatternTemporalPatternParserRuleCall_1_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__PatternAssignment_1_6"


    // $ANTLR start "rule__Event__NameAssignment_2_2"
    // InternalMoniLog4DSL.g:8683:1: rule__Event__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8687:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:8688:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:8688:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:8689:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_2_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_2_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment_2_2"


    // $ANTLR start "rule__Event__ParameterDeclAssignment_2_3_1"
    // InternalMoniLog4DSL.g:8698:1: rule__Event__ParameterDeclAssignment_2_3_1 : ( ruleParameterDeclNoVarArgs ) ;
    public final void rule__Event__ParameterDeclAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8702:1: ( ( ruleParameterDeclNoVarArgs ) )
            // InternalMoniLog4DSL.g:8703:2: ( ruleParameterDeclNoVarArgs )
            {
            // InternalMoniLog4DSL.g:8703:2: ( ruleParameterDeclNoVarArgs )
            // InternalMoniLog4DSL.g:8704:3: ruleParameterDeclNoVarArgs
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_2_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleParameterDeclNoVarArgs();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEventAccess().getParameterDeclParameterDeclNoVarArgsParserRuleCall_2_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__ParameterDeclAssignment_2_3_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment"
    // InternalMoniLog4DSL.g:8713:1: rule__Condition__ExpressionAssignment : ( ruleLanguageExpression ) ;
    public final void rule__Condition__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8717:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:8718:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:8718:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:8719:3: ruleLanguageExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment"


    // $ANTLR start "rule__TemporalPattern__PatternAssignment_0"
    // InternalMoniLog4DSL.g:8728:1: rule__TemporalPattern__PatternAssignment_0 : ( rulePattern ) ;
    public final void rule__TemporalPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8732:1: ( ( rulePattern ) )
            // InternalMoniLog4DSL.g:8733:2: ( rulePattern )
            {
            // InternalMoniLog4DSL.g:8733:2: ( rulePattern )
            // InternalMoniLog4DSL.g:8734:3: rulePattern
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
    // InternalMoniLog4DSL.g:8743:1: rule__TemporalPattern__ScopeAssignment_1 : ( ruleScope ) ;
    public final void rule__TemporalPattern__ScopeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8747:1: ( ( ruleScope ) )
            // InternalMoniLog4DSL.g:8748:2: ( ruleScope )
            {
            // InternalMoniLog4DSL.g:8748:2: ( ruleScope )
            // InternalMoniLog4DSL.g:8749:3: ruleScope
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
    // InternalMoniLog4DSL.g:8758:1: rule__Pattern__BoundAssignment_0_2 : ( ruleBoundType ) ;
    public final void rule__Pattern__BoundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8762:1: ( ( ruleBoundType ) )
            // InternalMoniLog4DSL.g:8763:2: ( ruleBoundType )
            {
            // InternalMoniLog4DSL.g:8763:2: ( ruleBoundType )
            // InternalMoniLog4DSL.g:8764:3: ruleBoundType
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
    // InternalMoniLog4DSL.g:8773:1: rule__Pattern__EventAssignment_0_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8777:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8778:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8778:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8779:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8788:1: rule__Pattern__EventAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8792:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8793:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8793:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8794:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8803:1: rule__Pattern__EventAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8807:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8808:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8808:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8809:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8818:1: rule__Pattern__PredecessorAssignment_3_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__PredecessorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8822:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8823:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8823:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8824:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8833:1: rule__Pattern__SuccessorAssignment_3_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__SuccessorAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8837:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8838:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8838:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8839:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8848:1: rule__Pattern__EventAssignment_4_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8852:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8853:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8853:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8854:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8863:1: rule__Pattern__TriggerAssignment_4_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__TriggerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8867:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8868:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8868:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8869:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8878:1: rule__ExactBound__NAssignment : ( RULE_INT ) ;
    public final void rule__ExactBound__NAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8882:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:8883:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:8883:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:8884:3: RULE_INT
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
    // InternalMoniLog4DSL.g:8893:1: rule__LowerBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__LowerBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8897:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:8898:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:8898:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:8899:3: RULE_INT
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
    // InternalMoniLog4DSL.g:8908:1: rule__UpperBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__UpperBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8912:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:8913:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:8913:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:8914:3: RULE_INT
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
    // InternalMoniLog4DSL.g:8923:1: rule__Scope__LowerBoundAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8927:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8928:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8928:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8929:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8938:1: rule__Scope__UpperBoundAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8942:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8943:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8943:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8944:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8953:1: rule__Scope__LowerBoundAssignment_3_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8957:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8958:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8958:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8959:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8968:1: rule__Scope__UpperBoundAssignment_3_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8972:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8973:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8973:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8974:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8983:1: rule__Scope__LowerBoundAssignment_4_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:8987:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:8988:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:8988:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:8989:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:8998:1: rule__Scope__UpperBoundAssignment_4_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9002:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:9003:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:9003:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:9004:3: ruleStreamEvent
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
    // InternalMoniLog4DSL.g:9013:1: rule__AppenderCall__AppenderAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AppenderCall__AppenderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9017:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMoniLog4DSL.g:9018:2: ( ( ruleQualifiedName ) )
            {
            // InternalMoniLog4DSL.g:9018:2: ( ( ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:9019:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAppenderCrossReference_0_0()); 
            }
            // InternalMoniLog4DSL.g:9020:3: ( ruleQualifiedName )
            // InternalMoniLog4DSL.g:9021:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAppenderQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getAppenderAppenderQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAppenderCallAccess().getAppenderAppenderCrossReference_0_0()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:9032:1: rule__AppenderCall__ArgsAssignment_3_1 : ( ruleAppenderCallArgument ) ;
    public final void rule__AppenderCall__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9036:1: ( ( ruleAppenderCallArgument ) )
            // InternalMoniLog4DSL.g:9037:2: ( ruleAppenderCallArgument )
            {
            // InternalMoniLog4DSL.g:9037:2: ( ruleAppenderCallArgument )
            // InternalMoniLog4DSL.g:9038:3: ruleAppenderCallArgument
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
    // InternalMoniLog4DSL.g:9047:1: rule__AppenderCall__ArgsAssignment_3_2_1 : ( ruleAppenderCallArgument ) ;
    public final void rule__AppenderCall__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9051:1: ( ( ruleAppenderCallArgument ) )
            // InternalMoniLog4DSL.g:9052:2: ( ruleAppenderCallArgument )
            {
            // InternalMoniLog4DSL.g:9052:2: ( ruleAppenderCallArgument )
            // InternalMoniLog4DSL.g:9053:3: ruleAppenderCallArgument
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


    // $ANTLR start "rule__LayoutCall__LayoutAssignment_0"
    // InternalMoniLog4DSL.g:9062:1: rule__LayoutCall__LayoutAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__LayoutCall__LayoutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9066:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMoniLog4DSL.g:9067:2: ( ( ruleQualifiedName ) )
            {
            // InternalMoniLog4DSL.g:9067:2: ( ( ruleQualifiedName ) )
            // InternalMoniLog4DSL.g:9068:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutLayoutCrossReference_0_0()); 
            }
            // InternalMoniLog4DSL.g:9069:3: ( ruleQualifiedName )
            // InternalMoniLog4DSL.g:9070:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutLayoutQualifiedNameParserRuleCall_0_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getLayoutLayoutQualifiedNameParserRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getLayoutLayoutCrossReference_0_0()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:9081:1: rule__LayoutCall__ArgsAssignment_3_1 : ( ruleLayoutCallArgument ) ;
    public final void rule__LayoutCall__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9085:1: ( ( ruleLayoutCallArgument ) )
            // InternalMoniLog4DSL.g:9086:2: ( ruleLayoutCallArgument )
            {
            // InternalMoniLog4DSL.g:9086:2: ( ruleLayoutCallArgument )
            // InternalMoniLog4DSL.g:9087:3: ruleLayoutCallArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsLayoutCallArgumentParserRuleCall_3_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLayoutCallArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getArgsLayoutCallArgumentParserRuleCall_3_1_0()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:9096:1: rule__LayoutCall__ArgsAssignment_3_2_1 : ( ruleLayoutCallArgument ) ;
    public final void rule__LayoutCall__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9100:1: ( ( ruleLayoutCallArgument ) )
            // InternalMoniLog4DSL.g:9101:2: ( ruleLayoutCallArgument )
            {
            // InternalMoniLog4DSL.g:9101:2: ( ruleLayoutCallArgument )
            // InternalMoniLog4DSL.g:9102:3: ruleLayoutCallArgument
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsLayoutCallArgumentParserRuleCall_3_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLayoutCallArgument();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLayoutCallAccess().getArgsLayoutCallArgumentParserRuleCall_3_2_1_0()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__EmitEvent__EventAssignment_0"
    // InternalMoniLog4DSL.g:9111:1: rule__EmitEvent__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EmitEvent__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9115:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:9116:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:9116:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9117:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventUserEventCrossReference_0_0()); 
            }
            // InternalMoniLog4DSL.g:9118:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:9119:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventUserEventIDTerminalRuleCall_0_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getEventUserEventIDTerminalRuleCall_0_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEmitEventAccess().getEventUserEventCrossReference_0_0()); 
            }

            }


            }

        }
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
    // InternalMoniLog4DSL.g:9130:1: rule__EmitEvent__ArgsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__EmitEvent__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9134:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:9135:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:9135:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:9136:3: ruleExpression
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
    // InternalMoniLog4DSL.g:9145:1: rule__EmitEvent__ArgsAssignment_3_2_1 : ( ruleExpression ) ;
    public final void rule__EmitEvent__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9149:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:9150:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:9150:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:9151:3: ruleExpression
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


    // $ANTLR start "rule__SetVariable__VariableAssignment_2"
    // InternalMoniLog4DSL.g:9160:1: rule__SetVariable__VariableAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetVariable__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9164:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:9165:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:9165:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:9166:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getVariableSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getVariableSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__VariableAssignment_2"


    // $ANTLR start "rule__SetVariable__ValueAssignment_4"
    // InternalMoniLog4DSL.g:9175:1: rule__SetVariable__ValueAssignment_4 : ( ruleLanguageExpression ) ;
    public final void rule__SetVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9179:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:9180:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:9180:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:9181:3: ruleLanguageExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getValueLanguageExpressionParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSetVariableAccess().getValueLanguageExpressionParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SetVariable__ValueAssignment_4"


    // $ANTLR start "rule__MoniloggerCall__MoniloggerAssignment_0_1"
    // InternalMoniLog4DSL.g:9190:1: rule__MoniloggerCall__MoniloggerAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoniloggerCall__MoniloggerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9194:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:9195:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:9195:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9196:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0()); 
            }
            // InternalMoniLog4DSL.g:9197:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:9198:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_0_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_0_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__MoniloggerAssignment_0_1"


    // $ANTLR start "rule__MoniloggerCall__ArgsAssignment_0_4_1"
    // InternalMoniLog4DSL.g:9209:1: rule__MoniloggerCall__ArgsAssignment_0_4_1 : ( ruleExpression ) ;
    public final void rule__MoniloggerCall__ArgsAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9213:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:9214:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:9214:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:9215:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__ArgsAssignment_0_4_1"


    // $ANTLR start "rule__MoniloggerCall__ArgsAssignment_0_4_2_1"
    // InternalMoniLog4DSL.g:9224:1: rule__MoniloggerCall__ArgsAssignment_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__MoniloggerCall__ArgsAssignment_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9228:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:9229:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:9229:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:9230:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getArgsExpressionParserRuleCall_0_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__ArgsAssignment_0_4_2_1"


    // $ANTLR start "rule__MoniloggerCall__MoniloggerAssignment_1_1"
    // InternalMoniLog4DSL.g:9239:1: rule__MoniloggerCall__MoniloggerAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoniloggerCall__MoniloggerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9243:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:9244:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:9244:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9245:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0()); 
            }
            // InternalMoniLog4DSL.g:9246:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:9247:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_1_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerIDTerminalRuleCall_1_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniloggerCall__MoniloggerAssignment_1_1"


    // $ANTLR start "rule__StreamEvent__EventAssignment_0"
    // InternalMoniLog4DSL.g:9258:1: rule__StreamEvent__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamEvent__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9262:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:9263:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:9263:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9264:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0()); 
            }
            // InternalMoniLog4DSL.g:9265:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:9266:4: RULE_ID
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
    // InternalMoniLog4DSL.g:9277:1: rule__StreamEvent__ValuesAssignment_1_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9281:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog4DSL.g:9282:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog4DSL.g:9282:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog4DSL.g:9283:3: ruleEmptyOrPropertyValue
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
    // InternalMoniLog4DSL.g:9292:1: rule__StreamEvent__ValuesAssignment_1_2_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9296:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog4DSL.g:9297:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog4DSL.g:9297:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog4DSL.g:9298:3: ruleEmptyOrPropertyValue
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


    // $ANTLR start "rule__ParameterReference__ParameterAssignment"
    // InternalMoniLog4DSL.g:9307:1: rule__ParameterReference__ParameterAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9311:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog4DSL.g:9312:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog4DSL.g:9312:2: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9313:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            }
            // InternalMoniLog4DSL.g:9314:3: ( RULE_ID )
            // InternalMoniLog4DSL.g:9315:4: RULE_ID
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


    // $ANTLR start "rule__PropertyValue__IdAssignment_0_0"
    // InternalMoniLog4DSL.g:9326:1: rule__PropertyValue__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__PropertyValue__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9330:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9331:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:9331:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:9332:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getIdIDTerminalRuleCall_0_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getIdIDTerminalRuleCall_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__IdAssignment_0_0"


    // $ANTLR start "rule__PropertyValue__ValueAssignment_0_1_1"
    // InternalMoniLog4DSL.g:9341:1: rule__PropertyValue__ValueAssignment_0_1_1 : ( ruleExpression ) ;
    public final void rule__PropertyValue__ValueAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9345:1: ( ( ruleExpression ) )
            // InternalMoniLog4DSL.g:9346:2: ( ruleExpression )
            {
            // InternalMoniLog4DSL.g:9346:2: ( ruleExpression )
            // InternalMoniLog4DSL.g:9347:3: ruleExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getValueExpressionParserRuleCall_0_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getValueExpressionParserRuleCall_0_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ValueAssignment_0_1_1"


    // $ANTLR start "rule__PropertyValue__ValueAssignment_1"
    // InternalMoniLog4DSL.g:9356:1: rule__PropertyValue__ValueAssignment_1 : ( ruleLanguageExpression ) ;
    public final void rule__PropertyValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9360:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:9361:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:9361:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:9362:3: ruleLanguageExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getValueLanguageExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getPropertyValueAccess().getValueLanguageExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyValue__ValueAssignment_1"


    // $ANTLR start "rule__LanguageExpression__LanguageIdAssignment_0"
    // InternalMoniLog4DSL.g:9371:1: rule__LanguageExpression__LanguageIdAssignment_0 : ( RULE_ID ) ;
    public final void rule__LanguageExpression__LanguageIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9375:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:9376:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:9376:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:9377:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_0()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__LanguageIdAssignment_0"


    // $ANTLR start "rule__LanguageExpression__ExpressionAssignment_2"
    // InternalMoniLog4DSL.g:9386:1: rule__LanguageExpression__ExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LanguageExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:9390:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:9391:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:9391:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:9392:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LanguageExpression__ExpressionAssignment_2"

    // $ANTLR start synpred1_InternalMoniLog4DSL
    public final void synpred1_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7925:8: ( rule__Document__EventsAssignment_3_0 )
        // InternalMoniLog4DSL.g:7925:9: rule__Document__EventsAssignment_3_0
        {
        pushFollow(FOLLOW_2);
        rule__Document__EventsAssignment_3_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMoniLog4DSL

    // $ANTLR start synpred2_InternalMoniLog4DSL
    public final void synpred2_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7947:8: ( rule__Document__AppendersAssignment_3_1 )
        // InternalMoniLog4DSL.g:7947:9: rule__Document__AppendersAssignment_3_1
        {
        pushFollow(FOLLOW_2);
        rule__Document__AppendersAssignment_3_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMoniLog4DSL

    // $ANTLR start synpred3_InternalMoniLog4DSL
    public final void synpred3_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7969:8: ( rule__Document__LayoutsAssignment_3_2 )
        // InternalMoniLog4DSL.g:7969:9: rule__Document__LayoutsAssignment_3_2
        {
        pushFollow(FOLLOW_2);
        rule__Document__LayoutsAssignment_3_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMoniLog4DSL

    // $ANTLR start synpred4_InternalMoniLog4DSL
    public final void synpred4_InternalMoniLog4DSL_fragment() throws RecognitionException {   
        // InternalMoniLog4DSL.g:7991:8: ( rule__Document__MoniloggersAssignment_3_3 )
        // InternalMoniLog4DSL.g:7991:9: rule__Document__MoniloggersAssignment_3_3
        {
        pushFollow(FOLLOW_2);
        rule__Document__MoniloggersAssignment_3_3();

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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA55 dfa55 = new DFA55(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\5\3\uffff\1\5\3\uffff";
    static final String dfa_3s = "\1\14\1\uffff\1\4\1\13\1\4\1\uffff\1\36\1\13\1\4\2\36";
    static final String dfa_4s = "\1\32\1\uffff\1\4\1\53\1\36\1\uffff\1\41\1\53\1\4\1\42\1\36";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\15\uffff\1\2",
            "",
            "\1\3",
            "\2\5\15\uffff\1\5\1\1\1\uffff\1\4\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5",
            "\1\6\31\uffff\1\7",
            "",
            "\1\7\2\uffff\1\10",
            "\2\5\15\uffff\1\5\1\1\4\uffff\1\5\2\uffff\1\5\5\uffff\3\5",
            "\1\11",
            "\1\7\2\uffff\1\10\1\12",
            "\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1066:1: rule__Appender__Alternatives : ( ( ruleLocalAppender ) | ( ruleExternalAppender ) );";
        }
    }
    static final String dfa_8s = "\2\uffff\1\5\4\uffff\1\5\3\uffff";
    static final String dfa_9s = "\1\40\1\4\1\13\1\4\2\uffff\1\36\1\13\1\4\2\36";
    static final String dfa_10s = "\1\40\1\4\1\53\1\36\2\uffff\1\41\1\53\1\4\1\42\1\36";
    static final String dfa_11s = "\4\uffff\1\1\1\2\5\uffff";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\2\5\15\uffff\1\5\1\4\1\uffff\1\3\2\uffff\1\5\2\uffff\1\5\5\uffff\3\5",
            "\1\6\31\uffff\1\7",
            "",
            "",
            "\1\7\2\uffff\1\10",
            "\2\5\15\uffff\1\5\1\4\4\uffff\1\5\2\uffff\1\5\5\uffff\3\5",
            "\1\11",
            "\1\7\2\uffff\1\10\1\12",
            "\1\7"
    };
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_6;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1087:1: rule__Layout__Alternatives : ( ( ruleLocalLayout ) | ( ruleExternalLayout ) );";
        }
    }
    static final String dfa_13s = "\34\uffff";
    static final String dfa_14s = "\2\uffff\1\1\6\uffff\1\1\22\uffff";
    static final String dfa_15s = "\1\4\1\uffff\1\34\2\uffff\1\4\2\uffff\1\4\1\34\2\35\1\4\2\6\1\4\1\35\2\36\1\35\1\6\2\36\1\6\4\36";
    static final String dfa_16s = "\1\64\1\uffff\1\66\2\uffff\1\41\2\uffff\1\41\1\66\2\76\1\4\2\6\1\4\1\41\2\36\1\41\1\6\2\41\1\6\2\36\2\41";
    static final String dfa_17s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\4\1\5\24\uffff";
    static final String dfa_18s = "\34\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\1\50\uffff\1\1\1\3\1\4\2\uffff\2\1",
            "",
            "\1\1\1\5\16\uffff\2\1\3\uffff\1\6\1\7\2\uffff\2\1",
            "",
            "",
            "\1\12\31\uffff\1\11\2\uffff\1\10",
            "",
            "",
            "\1\13\31\uffff\1\11\2\uffff\1\10",
            "\1\1\17\uffff\2\1\3\uffff\1\6\1\7\2\uffff\2\1",
            "\1\15\1\11\2\uffff\1\10\34\uffff\1\14",
            "\1\16\1\11\2\uffff\1\10\34\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\1\11\2\uffff\1\10",
            "\1\25",
            "\1\26",
            "\1\27\1\11\2\uffff\1\10",
            "\1\30",
            "\1\11\2\uffff\1\10",
            "\1\11\2\uffff\1\10",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\11\2\uffff\1\10",
            "\1\11\2\uffff\1\10"
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
            return "1156:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );";
        }
    }
    static final String dfa_20s = "\35\uffff";
    static final String dfa_21s = "\1\1\4\uffff\1\7\4\uffff\1\7\22\uffff";
    static final String dfa_22s = "\1\34\1\uffff\1\4\2\uffff\1\34\1\4\2\uffff\1\4\1\34\2\35\1\4\1\6\1\4\1\6\1\35\1\36\1\35\1\36\1\6\1\36\1\6\5\36";
    static final String dfa_23s = "\1\66\1\uffff\1\4\2\uffff\1\70\1\41\2\uffff\1\41\1\70\2\76\1\4\1\6\1\4\1\6\1\41\1\36\1\41\1\36\1\6\1\41\1\6\1\41\2\36\2\41";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\2\1\5\24\uffff";
    static final String dfa_25s = "\35\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\17\uffff\1\3\1\2\7\uffff\1\1\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\7\1\6\32\uffff\1\10",
            "\1\13\31\uffff\1\12\2\uffff\1\11",
            "",
            "",
            "\1\14\31\uffff\1\12\2\uffff\1\11",
            "\1\7\33\uffff\1\10",
            "\1\16\1\12\2\uffff\1\11\34\uffff\1\15",
            "\1\20\1\12\2\uffff\1\11\34\uffff\1\17",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25\1\12\2\uffff\1\11",
            "\1\26",
            "\1\27\1\12\2\uffff\1\11",
            "\1\30",
            "\1\31",
            "\1\12\2\uffff\1\11",
            "\1\32",
            "\1\12\2\uffff\1\11",
            "\1\33",
            "\1\34",
            "\1\12\2\uffff\1\11",
            "\1\12\2\uffff\1\11"
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
            return "1222:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );";
        }
    }
    static final String dfa_27s = "\u0122\uffff";
    static final String dfa_28s = "\1\4\u0121\uffff";
    static final String dfa_29s = "\1\13\3\4\1\uffff\2\33\1\0\1\4\1\54\1\24\2\4\1\uffff\1\36\1\33\2\4\4\47\1\36\1\33\2\4\2\5\1\34\3\4\1\34\1\33\1\4\1\34\5\4\1\34\1\0\3\4\2\34\1\36\1\0\1\36\2\4\1\34\1\35\4\34\1\35\3\4\1\34\2\35\1\6\11\4\1\34\1\35\1\4\1\34\2\35\1\6\1\4\1\6\1\4\1\36\1\35\1\4\1\34\1\35\1\4\1\34\1\35\1\4\1\34\1\35\1\34\1\4\1\34\1\35\1\4\1\67\1\35\1\34\1\35\1\6\1\4\1\35\1\6\2\4\1\6\1\36\1\35\1\36\1\35\1\36\1\6\1\35\1\6\1\4\1\35\1\6\1\4\1\35\1\4\1\6\1\4\1\35\1\4\1\6\1\35\1\4\1\6\2\4\1\6\1\36\1\35\1\6\1\4\1\36\2\35\2\36\1\6\1\36\1\6\1\36\1\6\1\4\1\36\1\35\1\6\1\4\1\36\1\35\1\4\1\6\1\35\1\36\1\4\1\34\1\35\1\6\1\4\1\35\1\36\1\6\1\4\1\35\1\36\1\4\1\34\2\35\2\36\1\6\1\36\1\35\1\36\2\6\5\36\1\35\1\36\1\6\1\36\1\35\1\36\1\6\1\35\1\36\1\6\1\36\1\35\1\4\1\6\1\36\1\35\1\6\2\36\1\35\1\6\1\36\1\35\1\6\1\4\1\6\3\36\1\6\5\36\1\6\2\36\1\6\1\36\1\6\2\36\1\6\1\4\1\35\2\36\1\6\2\36\1\6\1\36\1\6\1\4\1\36\1\35\14\36\1\35\1\6\6\36\1\35\1\36\1\6\6\36\1\6\4\36\1\6\7\36";
    static final String dfa_30s = "\1\53\3\4\1\uffff\1\35\1\46\1\0\1\36\1\55\1\27\1\36\1\64\1\uffff\1\41\1\33\2\4\4\47\1\41\1\33\1\64\1\4\2\5\1\66\3\4\1\34\1\35\1\4\1\66\2\4\1\41\2\4\1\34\1\0\3\4\2\66\1\41\1\0\3\41\1\66\1\76\2\66\1\70\1\35\1\67\3\41\1\66\2\76\1\6\1\4\3\41\1\4\2\41\1\4\1\41\1\66\1\76\1\41\1\66\2\76\1\6\1\4\1\6\1\4\1\36\2\41\1\66\1\76\1\41\1\66\1\76\1\41\1\70\1\76\1\35\1\41\1\34\1\76\1\41\1\67\1\76\1\35\1\76\1\6\1\4\1\76\1\6\2\4\1\6\1\36\1\41\1\36\2\41\1\6\1\76\1\6\1\4\1\76\1\6\1\4\1\76\1\4\1\6\1\41\1\76\1\4\1\6\1\76\1\4\1\6\1\41\1\4\1\6\1\36\1\41\1\6\1\4\1\36\2\41\1\36\1\41\1\6\1\41\1\6\1\36\1\6\1\4\1\36\1\41\1\6\1\4\1\36\1\41\1\4\1\6\1\41\1\36\1\41\1\34\1\76\1\6\1\4\1\41\1\36\1\6\1\4\1\41\1\36\1\41\1\34\1\76\1\41\1\36\1\41\1\6\1\36\2\41\2\6\1\41\2\36\1\41\1\36\2\41\1\6\1\36\2\41\1\6\1\41\1\36\1\6\1\41\1\76\1\4\1\6\1\36\1\41\1\6\1\41\1\36\1\41\1\6\1\41\1\76\1\6\1\4\1\6\1\41\1\36\1\41\1\6\2\36\3\41\1\6\1\36\1\41\1\6\1\36\1\6\1\41\1\36\1\6\1\4\1\41\1\36\1\41\1\6\1\36\1\41\1\6\1\36\1\6\1\4\1\36\1\41\1\36\1\41\1\36\2\41\1\36\1\41\1\36\1\41\1\36\1\41\1\36\1\41\1\6\1\41\1\36\1\41\1\36\1\41\1\36\2\41\1\6\6\41\1\6\1\36\3\41\1\6\2\36\1\41\1\36\3\41";
    static final String dfa_31s = "\4\uffff\1\2\10\uffff\1\1\u0114\uffff";
    static final String dfa_32s = "\7\uffff\1\0\42\uffff\1\1\6\uffff\1\2\u00f0\uffff}>";
    static final String[] dfa_33s = {
            "\2\4\15\uffff\1\4\5\uffff\1\4\2\uffff\1\4\5\uffff\1\1\1\2\1\3",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\11\1\uffff\1\10",
            "\1\14\1\uffff\1\13\10\uffff\1\12",
            "\1\uffff",
            "\1\16\31\uffff\1\17",
            "\1\20\1\21",
            "\1\22\1\23\1\24\1\25",
            "\1\26\31\uffff\1\27",
            "\1\34\1\31\50\uffff\1\30\1\35\1\36\2\uffff\1\32\1\33",
            "",
            "\1\17\2\uffff\1\37",
            "\1\11",
            "\1\40",
            "\1\40",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\27\2\uffff\1\42",
            "\1\14",
            "\1\43\1\31\55\uffff\1\32\1\33",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\52\1\46\16\uffff\1\54\1\53\3\uffff\1\47\1\50\2\uffff\1\51\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\14\1\uffff\1\13",
            "\1\62",
            "\1\52\1\63\16\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\43",
            "\1\43",
            "\1\66\31\uffff\1\65\2\uffff\1\64",
            "\1\67",
            "\1\70",
            "\1\52",
            "\1\uffff",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\52\1\74\16\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\52\1\75\16\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\17\2\uffff\1\37",
            "\1\uffff",
            "\1\27\2\uffff\1\42",
            "\1\100\31\uffff\1\77\2\uffff\1\76",
            "\1\101\31\uffff\1\65\2\uffff\1\64",
            "\1\52\17\uffff\1\54\1\53\3\uffff\1\47\1\50\2\uffff\1\51\1\55",
            "\1\102\1\65\2\uffff\1\64\34\uffff\1\103",
            "\1\52\1\104\16\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\52\1\105\16\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\52\1\106\32\uffff\1\107",
            "\1\52\1\110",
            "\1\111\31\uffff\1\112",
            "\1\115\31\uffff\1\114\2\uffff\1\113",
            "\1\120\31\uffff\1\117\2\uffff\1\116",
            "\1\121\31\uffff\1\77\2\uffff\1\76",
            "\1\52\17\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\122\1\77\2\uffff\1\76\34\uffff\1\123",
            "\1\124\1\65\2\uffff\1\64\34\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\132\31\uffff\1\131\2\uffff\1\130",
            "\1\135\31\uffff\1\134\2\uffff\1\133",
            "\1\140\31\uffff\1\137\2\uffff\1\136",
            "\1\141",
            "\1\144\31\uffff\1\143\2\uffff\1\142",
            "\1\147\31\uffff\1\146\2\uffff\1\145",
            "\1\150",
            "\1\151\31\uffff\1\114\2\uffff\1\113",
            "\1\52\17\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\152\1\114\2\uffff\1\113\34\uffff\1\153",
            "\1\154\31\uffff\1\117\2\uffff\1\116",
            "\1\52\17\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\155\1\117\2\uffff\1\116\34\uffff\1\156",
            "\1\160\1\77\2\uffff\1\76\34\uffff\1\157",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166\1\65\2\uffff\1\64",
            "\1\167\31\uffff\1\131\2\uffff\1\130",
            "\1\52\17\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\170\1\131\2\uffff\1\130\34\uffff\1\171",
            "\1\172\31\uffff\1\134\2\uffff\1\133",
            "\1\52\17\uffff\1\54\1\53\7\uffff\1\51\1\55",
            "\1\173\1\134\2\uffff\1\133\34\uffff\1\174",
            "\1\175\31\uffff\1\137\2\uffff\1\136",
            "\1\52\33\uffff\1\107",
            "\1\177\1\137\2\uffff\1\136\34\uffff\1\176",
            "\1\52\1\u0080",
            "\1\u0081\31\uffff\1\143\2\uffff\1\142",
            "\1\52",
            "\1\u0083\1\143\2\uffff\1\142\34\uffff\1\u0082",
            "\1\u0084\31\uffff\1\146\2\uffff\1\145",
            "\1\112",
            "\1\u0086\1\146\2\uffff\1\145\34\uffff\1\u0085",
            "\1\52\1\u0087",
            "\1\u0089\1\114\2\uffff\1\113\34\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\1\117\2\uffff\1\116\34\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\1\77\2\uffff\1\76",
            "\1\u0094",
            "\1\u0095\1\65\2\uffff\1\64",
            "\1\65\2\uffff\1\64",
            "\1\u0096",
            "\1\u0097\1\131\2\uffff\1\130\34\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\1\134\2\uffff\1\133\34\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a0\1\137\2\uffff\1\136\34\uffff\1\u009f",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a5\31\uffff\1\u00a4\2\uffff\1\u00a3",
            "\1\u00a6\1\143\2\uffff\1\142\34\uffff\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa\1\146\2\uffff\1\145\34\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00b0\31\uffff\1\u00af\2\uffff\1\u00ae",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4\1\114\2\uffff\1\113",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\1\117\2\uffff\1\116",
            "\1\u00b9\1\77\2\uffff\1\76",
            "\1\u00ba",
            "\1\77\2\uffff\1\76",
            "\1\u00bb",
            "\1\65\2\uffff\1\64",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1\1\131\2\uffff\1\130",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\1\134\2\uffff\1\133",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8\1\137\2\uffff\1\136",
            "\1\u00c9",
            "\1\u00ca\31\uffff\1\u00a4\2\uffff\1\u00a3",
            "\1\52",
            "\1\u00cc\1\u00a4\2\uffff\1\u00a3\34\uffff\1\u00cb",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf\1\143\2\uffff\1\142",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3\1\146\2\uffff\1\145",
            "\1\u00d4",
            "\1\u00d5\31\uffff\1\u00af\2\uffff\1\u00ae",
            "\1\52",
            "\1\u00d6\1\u00af\2\uffff\1\u00ae\34\uffff\1\u00d7",
            "\1\u00d8\1\114\2\uffff\1\113",
            "\1\u00d9",
            "\1\114\2\uffff\1\113",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc\1\117\2\uffff\1\116",
            "\1\117\2\uffff\1\116",
            "\1\u00dd",
            "\1\u00de",
            "\1\77\2\uffff\1\76",
            "\1\u00df",
            "\1\u00e0",
            "\1\65\2\uffff\1\64",
            "\1\u00e1",
            "\1\u00e2\1\131\2\uffff\1\130",
            "\1\131\2\uffff\1\130",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5\1\134\2\uffff\1\133",
            "\1\134\2\uffff\1\133",
            "\1\u00e6",
            "\1\u00e7\1\137\2\uffff\1\136",
            "\1\u00e8",
            "\1\u00e9",
            "\1\137\2\uffff\1\136",
            "\1\u00ea\1\u00a4\2\uffff\1\u00a3\34\uffff\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef\1\143\2\uffff\1\142",
            "\1\u00f0",
            "\1\143\2\uffff\1\142",
            "\1\u00f1",
            "\1\u00f2\1\146\2\uffff\1\145",
            "\1\u00f3",
            "\1\146\2\uffff\1\145",
            "\1\u00f4\1\u00af\2\uffff\1\u00ae\34\uffff\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\114\2\uffff\1\113",
            "\1\u00f9",
            "\1\117\2\uffff\1\116",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\77\2\uffff\1\76",
            "\1\65\2\uffff\1\64",
            "\1\131\2\uffff\1\130",
            "\1\u00fd",
            "\1\u00fe",
            "\1\134\2\uffff\1\133",
            "\1\u00ff",
            "\1\u0100",
            "\1\u0101",
            "\1\137\2\uffff\1\136",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105\1\u00a4\2\uffff\1\u00a3",
            "\1\u0106",
            "\1\143\2\uffff\1\142",
            "\1\u0107",
            "\1\u0108",
            "\1\146\2\uffff\1\145",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e\1\u00af\2\uffff\1\u00ae",
            "\1\u010f",
            "\1\114\2\uffff\1\113",
            "\1\u0110",
            "\1\117\2\uffff\1\116",
            "\1\77\2\uffff\1\76",
            "\1\u0111",
            "\1\131\2\uffff\1\130",
            "\1\u0112",
            "\1\134\2\uffff\1\133",
            "\1\u0113",
            "\1\137\2\uffff\1\136",
            "\1\u0114",
            "\1\u0115\1\u00a4\2\uffff\1\u00a3",
            "\1\u0116",
            "\1\u00a4\2\uffff\1\u00a3",
            "\1\u0117",
            "\1\143\2\uffff\1\142",
            "\1\u0118",
            "\1\146\2\uffff\1\145",
            "\1\u0119",
            "\1\u011a\1\u00af\2\uffff\1\u00ae",
            "\1\u00af\2\uffff\1\u00ae",
            "\1\u011b",
            "\1\114\2\uffff\1\113",
            "\1\117\2\uffff\1\116",
            "\1\131\2\uffff\1\130",
            "\1\134\2\uffff\1\133",
            "\1\137\2\uffff\1\136",
            "\1\u00a4\2\uffff\1\u00a3",
            "\1\u011c",
            "\1\u011d",
            "\1\143\2\uffff\1\142",
            "\1\146\2\uffff\1\145",
            "\1\u00af\2\uffff\1\u00ae",
            "\1\u011e",
            "\1\u011f",
            "\1\u0120",
            "\1\u00a4\2\uffff\1\u00a3",
            "\1\u0121",
            "\1\u00af\2\uffff\1\u00ae",
            "\1\u00a4\2\uffff\1\u00a3",
            "\1\u00af\2\uffff\1\u00ae"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 7925:7: ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_7 = input.LA(1);

                         
                        int index55_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog4DSL()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index55_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_42 = input.LA(1);

                         
                        int index55_42 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog4DSL()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index55_42);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_49 = input.LA(1);

                         
                        int index55_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog4DSL()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index55_49);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_34s = "\147\uffff";
    static final String dfa_35s = "\1\1\146\uffff";
    static final String dfa_36s = "\1\13\1\uffff\1\14\2\4\1\0\1\33\1\uffff\2\4\1\36\1\33\1\71\2\4\1\36\1\34\1\71\1\36\2\4\1\0\1\35\1\71\1\6\2\4\1\34\1\4\1\36\1\71\2\35\1\34\1\71\1\36\1\4\1\6\2\4\1\35\1\36\1\35\1\71\1\35\1\6\1\4\2\36\2\4\1\6\1\4\1\34\1\36\2\35\1\71\1\35\1\36\1\35\1\36\2\6\1\4\1\36\1\4\1\36\1\6\1\4\2\36\2\35\1\36\1\71\1\35\2\36\2\6\1\4\2\36\1\4\2\36\2\35\2\36\2\6\1\4\3\36\1\35\2\36\1\6\2\36";
    static final String dfa_37s = "\1\53\1\uffff\1\32\2\4\1\0\1\35\1\uffff\1\36\1\4\1\41\1\33\1\71\1\4\1\51\1\42\1\37\1\71\1\36\2\4\1\0\2\71\1\6\1\51\1\4\1\37\1\51\1\36\1\71\1\41\1\71\1\37\1\71\1\41\1\4\1\6\1\51\1\4\1\41\1\36\1\41\2\71\1\6\1\4\2\41\1\4\1\51\1\6\1\4\1\37\1\36\2\41\1\71\1\41\1\36\1\71\1\41\2\6\1\4\1\41\1\4\1\41\1\6\1\51\2\36\2\41\1\36\1\71\3\41\2\6\1\4\2\41\1\4\2\36\4\41\2\6\1\4\1\41\2\36\3\41\1\6\1\36\1\41";
    static final String dfa_38s = "\1\uffff\1\2\5\uffff\1\1\137\uffff";
    static final String dfa_39s = "\5\uffff\1\0\17\uffff\1\1\121\uffff}>";
    static final String[] dfa_40s = {
            "\1\1\1\2\15\uffff\1\3\5\uffff\1\1\2\uffff\1\1\5\uffff\3\1",
            "",
            "\1\2\15\uffff\1\4",
            "\1\5",
            "\1\6",
            "\1\uffff",
            "\1\11\1\uffff\1\10",
            "",
            "\1\12\31\uffff\1\13",
            "\1\14",
            "\1\13\2\uffff\1\15",
            "\1\11",
            "\1\16",
            "\1\17",
            "\1\21\44\uffff\1\20",
            "\1\13\2\uffff\1\15\1\22",
            "\1\25\1\23\1\uffff\1\24",
            "\1\16",
            "\1\13",
            "\1\26",
            "\1\27",
            "\1\uffff",
            "\1\30\1\33\2\uffff\1\32\27\uffff\1\31",
            "\1\34",
            "\1\35",
            "\1\36\44\uffff\1\37",
            "\1\40",
            "\1\25\2\uffff\1\24",
            "\1\42\44\uffff\1\41",
            "\1\43",
            "\1\31",
            "\1\44\1\33\2\uffff\1\32",
            "\1\45\1\33\2\uffff\1\32\27\uffff\1\46",
            "\1\25\1\47\1\uffff\1\24",
            "\1\34",
            "\1\33\2\uffff\1\32",
            "\1\50",
            "\1\51",
            "\1\53\44\uffff\1\52",
            "\1\54",
            "\1\55\1\57\2\uffff\1\56",
            "\1\60",
            "\1\61\1\33\2\uffff\1\32",
            "\1\46",
            "\1\63\1\65\2\uffff\1\64\27\uffff\1\62",
            "\1\66",
            "\1\67",
            "\1\33\2\uffff\1\32",
            "\1\33\2\uffff\1\32",
            "\1\70",
            "\1\71\44\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\25\2\uffff\1\24",
            "\1\75",
            "\1\76\1\57\2\uffff\1\56",
            "\1\77\1\101\2\uffff\1\100",
            "\1\62",
            "\1\102\1\65\2\uffff\1\64",
            "\1\103",
            "\1\104\1\65\2\uffff\1\64\27\uffff\1\105",
            "\1\57\2\uffff\1\56",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\33\2\uffff\1\32",
            "\1\111",
            "\1\65\2\uffff\1\64",
            "\1\112",
            "\1\113\44\uffff\1\114",
            "\1\115",
            "\1\116",
            "\1\117\1\101\2\uffff\1\100",
            "\1\120\1\122\2\uffff\1\121",
            "\1\123",
            "\1\105",
            "\1\124\1\65\2\uffff\1\64",
            "\1\57\2\uffff\1\56",
            "\1\101\2\uffff\1\100",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\65\2\uffff\1\64",
            "\1\65\2\uffff\1\64",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133\1\122\2\uffff\1\121",
            "\1\134\1\136\2\uffff\1\135",
            "\1\101\2\uffff\1\100",
            "\1\122\2\uffff\1\121",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\65\2\uffff\1\64",
            "\1\142",
            "\1\143",
            "\1\144\1\136\2\uffff\1\135",
            "\1\122\2\uffff\1\121",
            "\1\136\2\uffff\1\135",
            "\1\145",
            "\1\146",
            "\1\136\2\uffff\1\135"
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 7947:7: ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_5 = input.LA(1);

                         
                        int index56_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMoniLog4DSL()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA56_21 = input.LA(1);

                         
                        int index56_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMoniLog4DSL()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index56_21);
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
    static final String dfa_41s = "\u00e0\uffff";
    static final String dfa_42s = "\1\1\u00df\uffff";
    static final String dfa_43s = "\1\13\1\uffff\1\13\1\4\1\33\1\4\1\15\1\44\1\36\1\33\7\47\2\4\1\33\1\35\1\36\1\4\2\33\1\36\1\4\1\45\1\35\2\4\1\35\1\4\1\6\3\35\1\4\1\6\1\35\1\36\1\6\1\4\2\6\1\35\1\36\1\6\2\36\1\71\4\34\1\36\1\41\1\6\2\36\1\34\2\4\1\34\3\4\1\34\1\4\2\36\1\4\1\45\2\35\1\0\4\35\1\36\1\35\1\6\1\4\1\6\1\uffff\1\6\1\4\1\34\1\6\1\4\1\34\1\4\1\34\1\6\1\4\2\6\1\36\4\34\1\71\1\41\1\36\1\35\1\36\2\35\1\36\1\71\1\35\2\36\1\34\5\4\1\36\1\6\1\36\2\6\1\4\1\36\1\4\1\36\1\34\4\35\3\36\1\35\1\71\1\35\1\34\1\6\1\4\1\34\1\6\2\4\1\34\1\4\1\34\2\6\3\36\2\4\1\36\1\6\1\36\1\35\1\36\1\71\3\35\2\36\2\35\2\36\1\6\1\36\2\4\2\6\2\36\1\4\1\36\2\6\2\36\1\35\1\71\1\35\2\36\1\34\1\35\3\36\1\6\1\4\1\36\1\4\2\36\1\6\3\36\2\35\2\36\2\6\1\4\4\36\1\35\2\36\1\6\2\36";
    static final String dfa_44s = "\1\53\1\uffff\1\43\1\4\1\46\1\36\1\23\1\44\1\41\1\46\7\47\2\4\1\33\1\50\1\42\1\41\2\33\1\36\1\41\1\50\1\76\1\4\1\73\1\76\1\4\1\6\1\35\1\71\1\35\1\4\1\6\1\41\1\36\1\6\1\75\2\6\1\41\1\36\1\6\1\41\1\36\1\71\4\37\1\36\1\41\1\6\1\41\1\36\1\37\1\51\1\73\1\34\3\4\1\37\1\4\1\36\1\41\1\4\1\45\1\71\1\35\1\0\2\41\1\71\1\35\1\41\1\35\1\6\1\75\1\6\1\uffff\1\6\1\4\1\37\1\6\1\4\1\37\1\4\1\37\1\6\1\51\2\6\1\36\4\37\1\71\1\41\1\36\1\41\1\36\1\41\1\71\1\36\1\71\1\41\2\36\1\37\3\4\1\51\1\4\1\41\1\6\1\41\2\6\1\51\1\41\1\4\1\36\1\37\1\41\1\71\1\41\1\35\3\36\1\41\1\71\1\41\1\37\1\6\1\4\1\37\1\6\1\51\1\4\1\37\1\4\1\37\2\6\3\41\2\4\1\41\1\6\1\36\1\41\1\36\1\71\1\41\1\71\1\41\2\36\2\41\1\36\1\41\1\6\1\41\1\4\1\51\2\6\1\41\1\36\1\4\1\41\2\6\1\41\1\36\1\41\1\71\1\41\2\36\1\37\1\41\2\36\1\41\1\6\1\4\1\41\1\4\2\41\1\6\2\41\1\36\2\41\1\36\1\41\2\6\1\4\2\41\2\36\3\41\1\6\1\36\1\41";
    static final String dfa_45s = "\1\uffff\1\2\123\uffff\1\1\u008a\uffff";
    static final String dfa_46s = "\113\uffff\1\0\u0094\uffff}>";
    static final String[] dfa_47s = {
            "\1\2\1\1\15\uffff\1\1\5\uffff\1\1\2\uffff\1\3\5\uffff\3\1",
            "",
            "\1\2\27\uffff\1\3",
            "\1\4",
            "\1\7\1\uffff\1\5\10\uffff\1\6",
            "\1\10\31\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\21",
            "\1\11\2\uffff\1\22",
            "\1\7\12\uffff\1\6",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\7",
            "\1\26\7\uffff\1\30\2\uffff\1\27",
            "\1\11\2\uffff\1\22\1\31",
            "\1\34\31\uffff\1\33\2\uffff\1\32",
            "\1\35",
            "\1\36",
            "\1\11",
            "\1\37\31\uffff\1\33\2\uffff\1\32",
            "\1\30\2\uffff\1\27",
            "\1\41\1\33\2\uffff\1\32\34\uffff\1\40",
            "\1\42",
            "\1\43\66\uffff\1\44",
            "\1\46\1\33\2\uffff\1\32\34\uffff\1\45",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\53\33\uffff\1\52",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57\1\33\2\uffff\1\32",
            "\1\60",
            "\1\61",
            "\1\62\44\uffff\1\66\20\uffff\1\64\1\uffff\1\65\1\63",
            "\1\67",
            "\1\70",
            "\1\71\1\33\2\uffff\1\32",
            "\1\72",
            "\1\73",
            "\1\33\2\uffff\1\32",
            "\1\74",
            "\1\75",
            "\1\77\2\uffff\1\76",
            "\1\77\1\100\1\uffff\1\76",
            "\1\77\1\101\1\uffff\1\76",
            "\1\77\1\102\1\uffff\1\76",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\33\2\uffff\1\32",
            "\1\106",
            "\1\110\2\uffff\1\107",
            "\1\62\44\uffff\1\66",
            "\1\111\66\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\77\2\uffff\1\76",
            "\1\117",
            "\1\120",
            "\1\33\2\uffff\1\32",
            "\1\121",
            "\1\30",
            "\1\122\33\uffff\1\123",
            "\1\124",
            "\1\uffff",
            "\1\126\1\130\2\uffff\1\127",
            "\1\131\1\133\2\uffff\1\132",
            "\1\136\1\135\2\uffff\1\134\27\uffff\1\137",
            "\1\140",
            "\1\33\2\uffff\1\32",
            "\1\141",
            "\1\142",
            "\1\147\44\uffff\1\144\20\uffff\1\146\1\uffff\1\143\1\145",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\1\77\2\uffff\1\76",
            "\1\153",
            "\1\154",
            "\1\77\2\uffff\1\76",
            "\1\155",
            "\1\77\2\uffff\1\76",
            "\1\156",
            "\1\157\44\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\77\1\164\1\uffff\1\76",
            "\1\77\1\165\1\uffff\1\76",
            "\1\77\2\uffff\1\76",
            "\1\77\1\166\1\uffff\1\76",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172\1\130\2\uffff\1\127",
            "\1\173",
            "\1\174\1\133\2\uffff\1\132",
            "\1\175\1\135\2\uffff\1\134\27\uffff\1\176",
            "\1\177",
            "\1\137",
            "\1\u0080\1\135\2\uffff\1\134",
            "\1\u0081",
            "\1\u0082",
            "\1\77\2\uffff\1\76",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\147\44\uffff\1\144",
            "\1\u0086",
            "\1\130\2\uffff\1\127",
            "\1\u0087",
            "\1\133\2\uffff\1\132",
            "\1\u0088",
            "\1\u0089",
            "\1\u008b\44\uffff\1\u008a",
            "\1\135\2\uffff\1\134",
            "\1\u008c",
            "\1\u008d",
            "\1\110\2\uffff\1\107",
            "\1\u008e\1\u0090\2\uffff\1\u008f",
            "\1\u0091\1\u0094\2\uffff\1\u0093\27\uffff\1\u0092",
            "\1\u0097\1\u0096\2\uffff\1\u0095",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c\1\135\2\uffff\1\134",
            "\1\176",
            "\1\u009f\1\u009e\2\uffff\1\u009d",
            "\1\77\2\uffff\1\76",
            "\1\u00a0",
            "\1\u00a1",
            "\1\77\2\uffff\1\76",
            "\1\u00a2",
            "\1\u00a3\44\uffff\1\u00a4",
            "\1\u00a5",
            "\1\77\2\uffff\1\76",
            "\1\u00a6",
            "\1\77\2\uffff\1\76",
            "\1\u00a7",
            "\1\u00a8",
            "\1\130\2\uffff\1\127",
            "\1\133\2\uffff\1\132",
            "\1\135\2\uffff\1\134",
            "\1\u00a9",
            "\1\u00aa",
            "\1\135\2\uffff\1\134",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad\1\u0090\2\uffff\1\u008f",
            "\1\u00ae",
            "\1\u0092",
            "\1\u00af\1\u0094\2\uffff\1\u0093",
            "\1\u00b1\1\u0094\2\uffff\1\u0093\27\uffff\1\u00b0",
            "\1\u00b2\1\u0096\2\uffff\1\u0095",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b7\1\u00b6\2\uffff\1\u00b5",
            "\1\u00b8\1\u009e\2\uffff\1\u009d",
            "\1\u00b9",
            "\1\u0090\2\uffff\1\u008f",
            "\1\u00ba",
            "\1\u0094\2\uffff\1\u0093",
            "\1\u00bb",
            "\1\u00bc\44\uffff\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u0096\2\uffff\1\u0095",
            "\1\u00c0",
            "\1\u00c1",
            "\1\135\2\uffff\1\134",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u009e\2\uffff\1\u009d",
            "\1\u00c4",
            "\1\u00c5\1\u00c7\2\uffff\1\u00c6",
            "\1\u00b0",
            "\1\u00c8\1\u0094\2\uffff\1\u0093",
            "\1\u00c9",
            "\1\u00ca",
            "\1\77\2\uffff\1\76",
            "\1\u00cb\1\u00b6\2\uffff\1\u00b5",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u0090\2\uffff\1\u008f",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u0094\2\uffff\1\u0093",
            "\1\u00d0",
            "\1\u0094\2\uffff\1\u0093",
            "\1\u0096\2\uffff\1\u0095",
            "\1\u00d1",
            "\1\u00b6\2\uffff\1\u00b5",
            "\1\u009e\2\uffff\1\u009d",
            "\1\u00d2",
            "\1\u00d3\1\u00c7\2\uffff\1\u00c6",
            "\1\u00d4\1\u00d6\2\uffff\1\u00d5",
            "\1\u00d7",
            "\1\u00c7\2\uffff\1\u00c6",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u0094\2\uffff\1\u0093",
            "\1\u00b6\2\uffff\1\u00b5",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd\1\u00d6\2\uffff\1\u00d5",
            "\1\u00c7\2\uffff\1\u00c6",
            "\1\u00d6\2\uffff\1\u00d5",
            "\1\u00de",
            "\1\u00df",
            "\1\u00d6\2\uffff\1\u00d5"
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_41;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "()* loopback of 7991:7: ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_75 = input.LA(1);

                         
                        int index58_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMoniLog4DSL()) ) {s = 85;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index58_75);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 58, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x00000E0906001800L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000004001000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000E0904001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004028000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000012000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0800000000000010L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000000FE000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000300000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0019C00000000030L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000F00000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00000E0000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0060300000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0018400000000030L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000240000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x00000E0000000002L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000004001002L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x00000E0904001802L});

}
