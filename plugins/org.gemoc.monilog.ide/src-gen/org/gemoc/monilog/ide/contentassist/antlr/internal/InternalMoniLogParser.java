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
import org.gemoc.monilog.services.MoniLogGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMoniLogParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@Inactive'", "'@Async'", "'INFO'", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'", "'package'", "'import'", "'appender'", "'{'", "';'", "'}'", "'('", "')'", "'layout'", "','", "'...'", "'monilogger'", "'event'", "'actions'", "'['", "']'", "'conditions'", "'call'", "'complex'", "'custom'", "'before'", "'after'", "'exists'", "'always'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'.'", "'emit'", "'set'", "'start'", "'stop'", "'='", "'.*'"
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

    	public void setGrammarAccess(MoniLogGrammarAccess grammarAccess) {
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
    // InternalMoniLog.g:53:1: entryRuleDocument : ruleDocument EOF ;
    public final void entryRuleDocument() throws RecognitionException {
        try {
            // InternalMoniLog.g:54:1: ( ruleDocument EOF )
            // InternalMoniLog.g:55:1: ruleDocument EOF
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
    // InternalMoniLog.g:62:1: ruleDocument : ( ( rule__Document__Group__0 ) ) ;
    public final void ruleDocument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:66:2: ( ( ( rule__Document__Group__0 ) ) )
            // InternalMoniLog.g:67:2: ( ( rule__Document__Group__0 ) )
            {
            // InternalMoniLog.g:67:2: ( ( rule__Document__Group__0 ) )
            // InternalMoniLog.g:68:3: ( rule__Document__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getGroup()); 
            }
            // InternalMoniLog.g:69:3: ( rule__Document__Group__0 )
            // InternalMoniLog.g:69:4: rule__Document__Group__0
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
    // InternalMoniLog.g:78:1: entryRuleImport : ruleImport EOF ;
    public final void entryRuleImport() throws RecognitionException {
        try {
            // InternalMoniLog.g:79:1: ( ruleImport EOF )
            // InternalMoniLog.g:80:1: ruleImport EOF
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
    // InternalMoniLog.g:87:1: ruleImport : ( ( rule__Import__Group__0 ) ) ;
    public final void ruleImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:91:2: ( ( ( rule__Import__Group__0 ) ) )
            // InternalMoniLog.g:92:2: ( ( rule__Import__Group__0 ) )
            {
            // InternalMoniLog.g:92:2: ( ( rule__Import__Group__0 ) )
            // InternalMoniLog.g:93:3: ( rule__Import__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getGroup()); 
            }
            // InternalMoniLog.g:94:3: ( rule__Import__Group__0 )
            // InternalMoniLog.g:94:4: rule__Import__Group__0
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
    // InternalMoniLog.g:103:1: entryRuleAppender : ruleAppender EOF ;
    public final void entryRuleAppender() throws RecognitionException {
        try {
            // InternalMoniLog.g:104:1: ( ruleAppender EOF )
            // InternalMoniLog.g:105:1: ruleAppender EOF
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
    // InternalMoniLog.g:112:1: ruleAppender : ( ( rule__Appender__Alternatives ) ) ;
    public final void ruleAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:116:2: ( ( ( rule__Appender__Alternatives ) ) )
            // InternalMoniLog.g:117:2: ( ( rule__Appender__Alternatives ) )
            {
            // InternalMoniLog.g:117:2: ( ( rule__Appender__Alternatives ) )
            // InternalMoniLog.g:118:3: ( rule__Appender__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:119:3: ( rule__Appender__Alternatives )
            // InternalMoniLog.g:119:4: rule__Appender__Alternatives
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
    // InternalMoniLog.g:128:1: entryRuleLocalAppender : ruleLocalAppender EOF ;
    public final void entryRuleLocalAppender() throws RecognitionException {
        try {
            // InternalMoniLog.g:129:1: ( ruleLocalAppender EOF )
            // InternalMoniLog.g:130:1: ruleLocalAppender EOF
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
    // InternalMoniLog.g:137:1: ruleLocalAppender : ( ( rule__LocalAppender__Group__0 ) ) ;
    public final void ruleLocalAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:141:2: ( ( ( rule__LocalAppender__Group__0 ) ) )
            // InternalMoniLog.g:142:2: ( ( rule__LocalAppender__Group__0 ) )
            {
            // InternalMoniLog.g:142:2: ( ( rule__LocalAppender__Group__0 ) )
            // InternalMoniLog.g:143:3: ( rule__LocalAppender__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup()); 
            }
            // InternalMoniLog.g:144:3: ( rule__LocalAppender__Group__0 )
            // InternalMoniLog.g:144:4: rule__LocalAppender__Group__0
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
    // InternalMoniLog.g:153:1: entryRuleExternalAppender : ruleExternalAppender EOF ;
    public final void entryRuleExternalAppender() throws RecognitionException {
        try {
            // InternalMoniLog.g:154:1: ( ruleExternalAppender EOF )
            // InternalMoniLog.g:155:1: ruleExternalAppender EOF
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
    // InternalMoniLog.g:162:1: ruleExternalAppender : ( ( rule__ExternalAppender__Group__0 ) ) ;
    public final void ruleExternalAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:166:2: ( ( ( rule__ExternalAppender__Group__0 ) ) )
            // InternalMoniLog.g:167:2: ( ( rule__ExternalAppender__Group__0 ) )
            {
            // InternalMoniLog.g:167:2: ( ( rule__ExternalAppender__Group__0 ) )
            // InternalMoniLog.g:168:3: ( rule__ExternalAppender__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup()); 
            }
            // InternalMoniLog.g:169:3: ( rule__ExternalAppender__Group__0 )
            // InternalMoniLog.g:169:4: rule__ExternalAppender__Group__0
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
    // InternalMoniLog.g:178:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalMoniLog.g:179:1: ( ruleLayout EOF )
            // InternalMoniLog.g:180:1: ruleLayout EOF
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
    // InternalMoniLog.g:187:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:191:2: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalMoniLog.g:192:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalMoniLog.g:192:2: ( ( rule__Layout__Alternatives ) )
            // InternalMoniLog.g:193:3: ( rule__Layout__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:194:3: ( rule__Layout__Alternatives )
            // InternalMoniLog.g:194:4: rule__Layout__Alternatives
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
    // InternalMoniLog.g:203:1: entryRuleLocalLayout : ruleLocalLayout EOF ;
    public final void entryRuleLocalLayout() throws RecognitionException {
        try {
            // InternalMoniLog.g:204:1: ( ruleLocalLayout EOF )
            // InternalMoniLog.g:205:1: ruleLocalLayout EOF
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
    // InternalMoniLog.g:212:1: ruleLocalLayout : ( ( rule__LocalLayout__Group__0 ) ) ;
    public final void ruleLocalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:216:2: ( ( ( rule__LocalLayout__Group__0 ) ) )
            // InternalMoniLog.g:217:2: ( ( rule__LocalLayout__Group__0 ) )
            {
            // InternalMoniLog.g:217:2: ( ( rule__LocalLayout__Group__0 ) )
            // InternalMoniLog.g:218:3: ( rule__LocalLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup()); 
            }
            // InternalMoniLog.g:219:3: ( rule__LocalLayout__Group__0 )
            // InternalMoniLog.g:219:4: rule__LocalLayout__Group__0
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
    // InternalMoniLog.g:228:1: entryRuleExternalLayout : ruleExternalLayout EOF ;
    public final void entryRuleExternalLayout() throws RecognitionException {
        try {
            // InternalMoniLog.g:229:1: ( ruleExternalLayout EOF )
            // InternalMoniLog.g:230:1: ruleExternalLayout EOF
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
    // InternalMoniLog.g:237:1: ruleExternalLayout : ( ( rule__ExternalLayout__Group__0 ) ) ;
    public final void ruleExternalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:241:2: ( ( ( rule__ExternalLayout__Group__0 ) ) )
            // InternalMoniLog.g:242:2: ( ( rule__ExternalLayout__Group__0 ) )
            {
            // InternalMoniLog.g:242:2: ( ( rule__ExternalLayout__Group__0 ) )
            // InternalMoniLog.g:243:3: ( rule__ExternalLayout__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup()); 
            }
            // InternalMoniLog.g:244:3: ( rule__ExternalLayout__Group__0 )
            // InternalMoniLog.g:244:4: rule__ExternalLayout__Group__0
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
    // InternalMoniLog.g:253:1: entryRuleParameterDeclVarArgs : ruleParameterDeclVarArgs EOF ;
    public final void entryRuleParameterDeclVarArgs() throws RecognitionException {
        try {
            // InternalMoniLog.g:254:1: ( ruleParameterDeclVarArgs EOF )
            // InternalMoniLog.g:255:1: ruleParameterDeclVarArgs EOF
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
    // InternalMoniLog.g:262:1: ruleParameterDeclVarArgs : ( ( rule__ParameterDeclVarArgs__Group__0 ) ) ;
    public final void ruleParameterDeclVarArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:266:2: ( ( ( rule__ParameterDeclVarArgs__Group__0 ) ) )
            // InternalMoniLog.g:267:2: ( ( rule__ParameterDeclVarArgs__Group__0 ) )
            {
            // InternalMoniLog.g:267:2: ( ( rule__ParameterDeclVarArgs__Group__0 ) )
            // InternalMoniLog.g:268:3: ( rule__ParameterDeclVarArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup()); 
            }
            // InternalMoniLog.g:269:3: ( rule__ParameterDeclVarArgs__Group__0 )
            // InternalMoniLog.g:269:4: rule__ParameterDeclVarArgs__Group__0
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
    // InternalMoniLog.g:278:1: entryRuleParameterDeclNoVarArgs : ruleParameterDeclNoVarArgs EOF ;
    public final void entryRuleParameterDeclNoVarArgs() throws RecognitionException {
        try {
            // InternalMoniLog.g:279:1: ( ruleParameterDeclNoVarArgs EOF )
            // InternalMoniLog.g:280:1: ruleParameterDeclNoVarArgs EOF
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
    // InternalMoniLog.g:287:1: ruleParameterDeclNoVarArgs : ( ( rule__ParameterDeclNoVarArgs__Group__0 ) ) ;
    public final void ruleParameterDeclNoVarArgs() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:291:2: ( ( ( rule__ParameterDeclNoVarArgs__Group__0 ) ) )
            // InternalMoniLog.g:292:2: ( ( rule__ParameterDeclNoVarArgs__Group__0 ) )
            {
            // InternalMoniLog.g:292:2: ( ( rule__ParameterDeclNoVarArgs__Group__0 ) )
            // InternalMoniLog.g:293:3: ( rule__ParameterDeclNoVarArgs__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup()); 
            }
            // InternalMoniLog.g:294:3: ( rule__ParameterDeclNoVarArgs__Group__0 )
            // InternalMoniLog.g:294:4: rule__ParameterDeclNoVarArgs__Group__0
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
    // InternalMoniLog.g:303:1: entryRuleMoniLogger : ruleMoniLogger EOF ;
    public final void entryRuleMoniLogger() throws RecognitionException {
        try {
            // InternalMoniLog.g:304:1: ( ruleMoniLogger EOF )
            // InternalMoniLog.g:305:1: ruleMoniLogger EOF
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
    // InternalMoniLog.g:312:1: ruleMoniLogger : ( ( rule__MoniLogger__Group__0 ) ) ;
    public final void ruleMoniLogger() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:316:2: ( ( ( rule__MoniLogger__Group__0 ) ) )
            // InternalMoniLog.g:317:2: ( ( rule__MoniLogger__Group__0 ) )
            {
            // InternalMoniLog.g:317:2: ( ( rule__MoniLogger__Group__0 ) )
            // InternalMoniLog.g:318:3: ( rule__MoniLogger__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup()); 
            }
            // InternalMoniLog.g:319:3: ( rule__MoniLogger__Group__0 )
            // InternalMoniLog.g:319:4: rule__MoniLogger__Group__0
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
    // InternalMoniLog.g:328:1: entryRuleParameter : ruleParameter EOF ;
    public final void entryRuleParameter() throws RecognitionException {
        try {
            // InternalMoniLog.g:329:1: ( ruleParameter EOF )
            // InternalMoniLog.g:330:1: ruleParameter EOF
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
    // InternalMoniLog.g:337:1: ruleParameter : ( ( rule__Parameter__NameAssignment ) ) ;
    public final void ruleParameter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:341:2: ( ( ( rule__Parameter__NameAssignment ) ) )
            // InternalMoniLog.g:342:2: ( ( rule__Parameter__NameAssignment ) )
            {
            // InternalMoniLog.g:342:2: ( ( rule__Parameter__NameAssignment ) )
            // InternalMoniLog.g:343:3: ( rule__Parameter__NameAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterAccess().getNameAssignment()); 
            }
            // InternalMoniLog.g:344:3: ( rule__Parameter__NameAssignment )
            // InternalMoniLog.g:344:4: rule__Parameter__NameAssignment
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
    // InternalMoniLog.g:353:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMoniLog.g:354:1: ( ruleEvent EOF )
            // InternalMoniLog.g:355:1: ruleEvent EOF
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
    // InternalMoniLog.g:362:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:366:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalMoniLog.g:367:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalMoniLog.g:367:2: ( ( rule__Event__Alternatives ) )
            // InternalMoniLog.g:368:3: ( rule__Event__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:369:3: ( rule__Event__Alternatives )
            // InternalMoniLog.g:369:4: rule__Event__Alternatives
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
    // InternalMoniLog.g:378:1: entryRuleASTEventKind : ruleASTEventKind EOF ;
    public final void entryRuleASTEventKind() throws RecognitionException {
        try {
            // InternalMoniLog.g:379:1: ( ruleASTEventKind EOF )
            // InternalMoniLog.g:380:1: ruleASTEventKind EOF
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
    // InternalMoniLog.g:387:1: ruleASTEventKind : ( ( rule__ASTEventKind__Alternatives ) ) ;
    public final void ruleASTEventKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:391:2: ( ( ( rule__ASTEventKind__Alternatives ) ) )
            // InternalMoniLog.g:392:2: ( ( rule__ASTEventKind__Alternatives ) )
            {
            // InternalMoniLog.g:392:2: ( ( rule__ASTEventKind__Alternatives ) )
            // InternalMoniLog.g:393:3: ( rule__ASTEventKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:394:3: ( rule__ASTEventKind__Alternatives )
            // InternalMoniLog.g:394:4: rule__ASTEventKind__Alternatives
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
    // InternalMoniLog.g:403:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMoniLog.g:404:1: ( ruleCondition EOF )
            // InternalMoniLog.g:405:1: ruleCondition EOF
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
    // InternalMoniLog.g:412:1: ruleCondition : ( ( rule__Condition__ExpressionAssignment ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:416:2: ( ( ( rule__Condition__ExpressionAssignment ) ) )
            // InternalMoniLog.g:417:2: ( ( rule__Condition__ExpressionAssignment ) )
            {
            // InternalMoniLog.g:417:2: ( ( rule__Condition__ExpressionAssignment ) )
            // InternalMoniLog.g:418:3: ( rule__Condition__ExpressionAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getConditionAccess().getExpressionAssignment()); 
            }
            // InternalMoniLog.g:419:3: ( rule__Condition__ExpressionAssignment )
            // InternalMoniLog.g:419:4: rule__Condition__ExpressionAssignment
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
    // InternalMoniLog.g:428:1: entryRuleTemporalPattern : ruleTemporalPattern EOF ;
    public final void entryRuleTemporalPattern() throws RecognitionException {
        try {
            // InternalMoniLog.g:429:1: ( ruleTemporalPattern EOF )
            // InternalMoniLog.g:430:1: ruleTemporalPattern EOF
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
    // InternalMoniLog.g:437:1: ruleTemporalPattern : ( ( rule__TemporalPattern__Group__0 ) ) ;
    public final void ruleTemporalPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:441:2: ( ( ( rule__TemporalPattern__Group__0 ) ) )
            // InternalMoniLog.g:442:2: ( ( rule__TemporalPattern__Group__0 ) )
            {
            // InternalMoniLog.g:442:2: ( ( rule__TemporalPattern__Group__0 ) )
            // InternalMoniLog.g:443:3: ( rule__TemporalPattern__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getGroup()); 
            }
            // InternalMoniLog.g:444:3: ( rule__TemporalPattern__Group__0 )
            // InternalMoniLog.g:444:4: rule__TemporalPattern__Group__0
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
    // InternalMoniLog.g:453:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMoniLog.g:454:1: ( rulePattern EOF )
            // InternalMoniLog.g:455:1: rulePattern EOF
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
    // InternalMoniLog.g:462:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:466:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalMoniLog.g:467:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalMoniLog.g:467:2: ( ( rule__Pattern__Alternatives ) )
            // InternalMoniLog.g:468:3: ( rule__Pattern__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:469:3: ( rule__Pattern__Alternatives )
            // InternalMoniLog.g:469:4: rule__Pattern__Alternatives
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
    // InternalMoniLog.g:478:1: entryRuleBoundType : ruleBoundType EOF ;
    public final void entryRuleBoundType() throws RecognitionException {
        try {
            // InternalMoniLog.g:479:1: ( ruleBoundType EOF )
            // InternalMoniLog.g:480:1: ruleBoundType EOF
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
    // InternalMoniLog.g:487:1: ruleBoundType : ( ( rule__BoundType__Alternatives ) ) ;
    public final void ruleBoundType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:491:2: ( ( ( rule__BoundType__Alternatives ) ) )
            // InternalMoniLog.g:492:2: ( ( rule__BoundType__Alternatives ) )
            {
            // InternalMoniLog.g:492:2: ( ( rule__BoundType__Alternatives ) )
            // InternalMoniLog.g:493:3: ( rule__BoundType__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBoundTypeAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:494:3: ( rule__BoundType__Alternatives )
            // InternalMoniLog.g:494:4: rule__BoundType__Alternatives
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
    // InternalMoniLog.g:503:1: entryRuleExactBound : ruleExactBound EOF ;
    public final void entryRuleExactBound() throws RecognitionException {
        try {
            // InternalMoniLog.g:504:1: ( ruleExactBound EOF )
            // InternalMoniLog.g:505:1: ruleExactBound EOF
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
    // InternalMoniLog.g:512:1: ruleExactBound : ( ( rule__ExactBound__NAssignment ) ) ;
    public final void ruleExactBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:516:2: ( ( ( rule__ExactBound__NAssignment ) ) )
            // InternalMoniLog.g:517:2: ( ( rule__ExactBound__NAssignment ) )
            {
            // InternalMoniLog.g:517:2: ( ( rule__ExactBound__NAssignment ) )
            // InternalMoniLog.g:518:3: ( rule__ExactBound__NAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExactBoundAccess().getNAssignment()); 
            }
            // InternalMoniLog.g:519:3: ( rule__ExactBound__NAssignment )
            // InternalMoniLog.g:519:4: rule__ExactBound__NAssignment
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
    // InternalMoniLog.g:528:1: entryRuleLowerBound : ruleLowerBound EOF ;
    public final void entryRuleLowerBound() throws RecognitionException {
        try {
            // InternalMoniLog.g:529:1: ( ruleLowerBound EOF )
            // InternalMoniLog.g:530:1: ruleLowerBound EOF
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
    // InternalMoniLog.g:537:1: ruleLowerBound : ( ( rule__LowerBound__Group__0 ) ) ;
    public final void ruleLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:541:2: ( ( ( rule__LowerBound__Group__0 ) ) )
            // InternalMoniLog.g:542:2: ( ( rule__LowerBound__Group__0 ) )
            {
            // InternalMoniLog.g:542:2: ( ( rule__LowerBound__Group__0 ) )
            // InternalMoniLog.g:543:3: ( rule__LowerBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getGroup()); 
            }
            // InternalMoniLog.g:544:3: ( rule__LowerBound__Group__0 )
            // InternalMoniLog.g:544:4: rule__LowerBound__Group__0
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
    // InternalMoniLog.g:553:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalMoniLog.g:554:1: ( ruleUpperBound EOF )
            // InternalMoniLog.g:555:1: ruleUpperBound EOF
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
    // InternalMoniLog.g:562:1: ruleUpperBound : ( ( rule__UpperBound__Group__0 ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:566:2: ( ( ( rule__UpperBound__Group__0 ) ) )
            // InternalMoniLog.g:567:2: ( ( rule__UpperBound__Group__0 ) )
            {
            // InternalMoniLog.g:567:2: ( ( rule__UpperBound__Group__0 ) )
            // InternalMoniLog.g:568:3: ( rule__UpperBound__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getGroup()); 
            }
            // InternalMoniLog.g:569:3: ( rule__UpperBound__Group__0 )
            // InternalMoniLog.g:569:4: rule__UpperBound__Group__0
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
    // InternalMoniLog.g:578:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalMoniLog.g:579:1: ( ruleScope EOF )
            // InternalMoniLog.g:580:1: ruleScope EOF
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
    // InternalMoniLog.g:587:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:591:2: ( ( ( rule__Scope__Alternatives ) ) )
            // InternalMoniLog.g:592:2: ( ( rule__Scope__Alternatives ) )
            {
            // InternalMoniLog.g:592:2: ( ( rule__Scope__Alternatives ) )
            // InternalMoniLog.g:593:3: ( rule__Scope__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:594:3: ( rule__Scope__Alternatives )
            // InternalMoniLog.g:594:4: rule__Scope__Alternatives
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
    // InternalMoniLog.g:603:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMoniLog.g:604:1: ( ruleAction EOF )
            // InternalMoniLog.g:605:1: ruleAction EOF
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
    // InternalMoniLog.g:612:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:616:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMoniLog.g:617:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMoniLog.g:617:2: ( ( rule__Action__Alternatives ) )
            // InternalMoniLog.g:618:3: ( rule__Action__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getActionAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:619:3: ( rule__Action__Alternatives )
            // InternalMoniLog.g:619:4: rule__Action__Alternatives
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
    // InternalMoniLog.g:628:1: entryRuleAppenderCall : ruleAppenderCall EOF ;
    public final void entryRuleAppenderCall() throws RecognitionException {
        try {
            // InternalMoniLog.g:629:1: ( ruleAppenderCall EOF )
            // InternalMoniLog.g:630:1: ruleAppenderCall EOF
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
    // InternalMoniLog.g:637:1: ruleAppenderCall : ( ( rule__AppenderCall__Group__0 ) ) ;
    public final void ruleAppenderCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:641:2: ( ( ( rule__AppenderCall__Group__0 ) ) )
            // InternalMoniLog.g:642:2: ( ( rule__AppenderCall__Group__0 ) )
            {
            // InternalMoniLog.g:642:2: ( ( rule__AppenderCall__Group__0 ) )
            // InternalMoniLog.g:643:3: ( rule__AppenderCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup()); 
            }
            // InternalMoniLog.g:644:3: ( rule__AppenderCall__Group__0 )
            // InternalMoniLog.g:644:4: rule__AppenderCall__Group__0
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
    // InternalMoniLog.g:653:1: entryRuleAppenderCallArgument : ruleAppenderCallArgument EOF ;
    public final void entryRuleAppenderCallArgument() throws RecognitionException {
        try {
            // InternalMoniLog.g:654:1: ( ruleAppenderCallArgument EOF )
            // InternalMoniLog.g:655:1: ruleAppenderCallArgument EOF
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
    // InternalMoniLog.g:662:1: ruleAppenderCallArgument : ( ( rule__AppenderCallArgument__Alternatives ) ) ;
    public final void ruleAppenderCallArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:666:2: ( ( ( rule__AppenderCallArgument__Alternatives ) ) )
            // InternalMoniLog.g:667:2: ( ( rule__AppenderCallArgument__Alternatives ) )
            {
            // InternalMoniLog.g:667:2: ( ( rule__AppenderCallArgument__Alternatives ) )
            // InternalMoniLog.g:668:3: ( rule__AppenderCallArgument__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallArgumentAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:669:3: ( rule__AppenderCallArgument__Alternatives )
            // InternalMoniLog.g:669:4: rule__AppenderCallArgument__Alternatives
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
    // InternalMoniLog.g:678:1: entryRuleLayoutCall : ruleLayoutCall EOF ;
    public final void entryRuleLayoutCall() throws RecognitionException {
        try {
            // InternalMoniLog.g:679:1: ( ruleLayoutCall EOF )
            // InternalMoniLog.g:680:1: ruleLayoutCall EOF
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
    // InternalMoniLog.g:687:1: ruleLayoutCall : ( ( rule__LayoutCall__Group__0 ) ) ;
    public final void ruleLayoutCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:691:2: ( ( ( rule__LayoutCall__Group__0 ) ) )
            // InternalMoniLog.g:692:2: ( ( rule__LayoutCall__Group__0 ) )
            {
            // InternalMoniLog.g:692:2: ( ( rule__LayoutCall__Group__0 ) )
            // InternalMoniLog.g:693:3: ( rule__LayoutCall__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup()); 
            }
            // InternalMoniLog.g:694:3: ( rule__LayoutCall__Group__0 )
            // InternalMoniLog.g:694:4: rule__LayoutCall__Group__0
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
    // InternalMoniLog.g:703:1: entryRuleLayoutCallArgument : ruleLayoutCallArgument EOF ;
    public final void entryRuleLayoutCallArgument() throws RecognitionException {
        try {
            // InternalMoniLog.g:704:1: ( ruleLayoutCallArgument EOF )
            // InternalMoniLog.g:705:1: ruleLayoutCallArgument EOF
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
    // InternalMoniLog.g:712:1: ruleLayoutCallArgument : ( ruleExpression ) ;
    public final void ruleLayoutCallArgument() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:716:2: ( ( ruleExpression ) )
            // InternalMoniLog.g:717:2: ( ruleExpression )
            {
            // InternalMoniLog.g:717:2: ( ruleExpression )
            // InternalMoniLog.g:718:3: ruleExpression
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
    // InternalMoniLog.g:728:1: entryRuleEmitEvent : ruleEmitEvent EOF ;
    public final void entryRuleEmitEvent() throws RecognitionException {
        try {
            // InternalMoniLog.g:729:1: ( ruleEmitEvent EOF )
            // InternalMoniLog.g:730:1: ruleEmitEvent EOF
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
    // InternalMoniLog.g:737:1: ruleEmitEvent : ( ( rule__EmitEvent__Group__0 ) ) ;
    public final void ruleEmitEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:741:2: ( ( ( rule__EmitEvent__Group__0 ) ) )
            // InternalMoniLog.g:742:2: ( ( rule__EmitEvent__Group__0 ) )
            {
            // InternalMoniLog.g:742:2: ( ( rule__EmitEvent__Group__0 ) )
            // InternalMoniLog.g:743:3: ( rule__EmitEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup()); 
            }
            // InternalMoniLog.g:744:3: ( rule__EmitEvent__Group__0 )
            // InternalMoniLog.g:744:4: rule__EmitEvent__Group__0
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
    // InternalMoniLog.g:753:1: entryRuleSetVariable : ruleSetVariable EOF ;
    public final void entryRuleSetVariable() throws RecognitionException {
        try {
            // InternalMoniLog.g:754:1: ( ruleSetVariable EOF )
            // InternalMoniLog.g:755:1: ruleSetVariable EOF
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
    // InternalMoniLog.g:762:1: ruleSetVariable : ( ( rule__SetVariable__Group__0 ) ) ;
    public final void ruleSetVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:766:2: ( ( ( rule__SetVariable__Group__0 ) ) )
            // InternalMoniLog.g:767:2: ( ( rule__SetVariable__Group__0 ) )
            {
            // InternalMoniLog.g:767:2: ( ( rule__SetVariable__Group__0 ) )
            // InternalMoniLog.g:768:3: ( rule__SetVariable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getGroup()); 
            }
            // InternalMoniLog.g:769:3: ( rule__SetVariable__Group__0 )
            // InternalMoniLog.g:769:4: rule__SetVariable__Group__0
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
    // InternalMoniLog.g:778:1: entryRuleMoniloggerCall : ruleMoniloggerCall EOF ;
    public final void entryRuleMoniloggerCall() throws RecognitionException {
        try {
            // InternalMoniLog.g:779:1: ( ruleMoniloggerCall EOF )
            // InternalMoniLog.g:780:1: ruleMoniloggerCall EOF
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
    // InternalMoniLog.g:787:1: ruleMoniloggerCall : ( ( rule__MoniloggerCall__Alternatives ) ) ;
    public final void ruleMoniloggerCall() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:791:2: ( ( ( rule__MoniloggerCall__Alternatives ) ) )
            // InternalMoniLog.g:792:2: ( ( rule__MoniloggerCall__Alternatives ) )
            {
            // InternalMoniLog.g:792:2: ( ( rule__MoniloggerCall__Alternatives ) )
            // InternalMoniLog.g:793:3: ( rule__MoniloggerCall__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:794:3: ( rule__MoniloggerCall__Alternatives )
            // InternalMoniLog.g:794:4: rule__MoniloggerCall__Alternatives
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
    // InternalMoniLog.g:803:1: entryRuleStreamEvent : ruleStreamEvent EOF ;
    public final void entryRuleStreamEvent() throws RecognitionException {
        try {
            // InternalMoniLog.g:804:1: ( ruleStreamEvent EOF )
            // InternalMoniLog.g:805:1: ruleStreamEvent EOF
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
    // InternalMoniLog.g:812:1: ruleStreamEvent : ( ( rule__StreamEvent__Group__0 ) ) ;
    public final void ruleStreamEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:816:2: ( ( ( rule__StreamEvent__Group__0 ) ) )
            // InternalMoniLog.g:817:2: ( ( rule__StreamEvent__Group__0 ) )
            {
            // InternalMoniLog.g:817:2: ( ( rule__StreamEvent__Group__0 ) )
            // InternalMoniLog.g:818:3: ( rule__StreamEvent__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup()); 
            }
            // InternalMoniLog.g:819:3: ( rule__StreamEvent__Group__0 )
            // InternalMoniLog.g:819:4: rule__StreamEvent__Group__0
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
    // InternalMoniLog.g:828:1: entryRuleEmptyOrPropertyValue : ruleEmptyOrPropertyValue EOF ;
    public final void entryRuleEmptyOrPropertyValue() throws RecognitionException {
        try {
            // InternalMoniLog.g:829:1: ( ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog.g:830:1: ruleEmptyOrPropertyValue EOF
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
    // InternalMoniLog.g:837:1: ruleEmptyOrPropertyValue : ( ( rule__EmptyOrPropertyValue__Alternatives ) ) ;
    public final void ruleEmptyOrPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:841:2: ( ( ( rule__EmptyOrPropertyValue__Alternatives ) ) )
            // InternalMoniLog.g:842:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            {
            // InternalMoniLog.g:842:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            // InternalMoniLog.g:843:3: ( rule__EmptyOrPropertyValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:844:3: ( rule__EmptyOrPropertyValue__Alternatives )
            // InternalMoniLog.g:844:4: rule__EmptyOrPropertyValue__Alternatives
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
    // InternalMoniLog.g:853:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMoniLog.g:854:1: ( ruleExpression EOF )
            // InternalMoniLog.g:855:1: ruleExpression EOF
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
    // InternalMoniLog.g:862:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:866:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMoniLog.g:867:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMoniLog.g:867:2: ( ( rule__Expression__Alternatives ) )
            // InternalMoniLog.g:868:3: ( rule__Expression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:869:3: ( rule__Expression__Alternatives )
            // InternalMoniLog.g:869:4: rule__Expression__Alternatives
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
    // InternalMoniLog.g:878:1: entryRuleParameterReference : ruleParameterReference EOF ;
    public final void entryRuleParameterReference() throws RecognitionException {
        try {
            // InternalMoniLog.g:879:1: ( ruleParameterReference EOF )
            // InternalMoniLog.g:880:1: ruleParameterReference EOF
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
    // InternalMoniLog.g:887:1: ruleParameterReference : ( ( rule__ParameterReference__ParameterAssignment ) ) ;
    public final void ruleParameterReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:891:2: ( ( ( rule__ParameterReference__ParameterAssignment ) ) )
            // InternalMoniLog.g:892:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            {
            // InternalMoniLog.g:892:2: ( ( rule__ParameterReference__ParameterAssignment ) )
            // InternalMoniLog.g:893:3: ( rule__ParameterReference__ParameterAssignment )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterAssignment()); 
            }
            // InternalMoniLog.g:894:3: ( rule__ParameterReference__ParameterAssignment )
            // InternalMoniLog.g:894:4: rule__ParameterReference__ParameterAssignment
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
    // InternalMoniLog.g:903:1: entryRulePropertyValue : rulePropertyValue EOF ;
    public final void entryRulePropertyValue() throws RecognitionException {
        try {
            // InternalMoniLog.g:904:1: ( rulePropertyValue EOF )
            // InternalMoniLog.g:905:1: rulePropertyValue EOF
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
    // InternalMoniLog.g:912:1: rulePropertyValue : ( ( rule__PropertyValue__Alternatives ) ) ;
    public final void rulePropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:916:2: ( ( ( rule__PropertyValue__Alternatives ) ) )
            // InternalMoniLog.g:917:2: ( ( rule__PropertyValue__Alternatives ) )
            {
            // InternalMoniLog.g:917:2: ( ( rule__PropertyValue__Alternatives ) )
            // InternalMoniLog.g:918:3: ( rule__PropertyValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:919:3: ( rule__PropertyValue__Alternatives )
            // InternalMoniLog.g:919:4: rule__PropertyValue__Alternatives
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
    // InternalMoniLog.g:928:1: entryRuleLanguageExpression : ruleLanguageExpression EOF ;
    public final void entryRuleLanguageExpression() throws RecognitionException {
        try {
            // InternalMoniLog.g:929:1: ( ruleLanguageExpression EOF )
            // InternalMoniLog.g:930:1: ruleLanguageExpression EOF
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
    // InternalMoniLog.g:937:1: ruleLanguageExpression : ( ( rule__LanguageExpression__Group__0 ) ) ;
    public final void ruleLanguageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:941:2: ( ( ( rule__LanguageExpression__Group__0 ) ) )
            // InternalMoniLog.g:942:2: ( ( rule__LanguageExpression__Group__0 ) )
            {
            // InternalMoniLog.g:942:2: ( ( rule__LanguageExpression__Group__0 ) )
            // InternalMoniLog.g:943:3: ( rule__LanguageExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getGroup()); 
            }
            // InternalMoniLog.g:944:3: ( rule__LanguageExpression__Group__0 )
            // InternalMoniLog.g:944:4: rule__LanguageExpression__Group__0
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
    // InternalMoniLog.g:953:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMoniLog.g:954:1: ( ruleQualifiedName EOF )
            // InternalMoniLog.g:955:1: ruleQualifiedName EOF
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
    // InternalMoniLog.g:962:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:966:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMoniLog.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMoniLog.g:967:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMoniLog.g:968:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalMoniLog.g:969:3: ( rule__QualifiedName__Group__0 )
            // InternalMoniLog.g:969:4: rule__QualifiedName__Group__0
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
    // InternalMoniLog.g:978:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalMoniLog.g:979:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalMoniLog.g:980:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalMoniLog.g:987:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:991:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalMoniLog.g:992:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalMoniLog.g:992:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalMoniLog.g:993:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalMoniLog.g:994:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalMoniLog.g:994:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalMoniLog.g:1003:1: ruleMoniLoggerAnnotation : ( ( '@Inactive' ) ) ;
    public final void ruleMoniLoggerAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1007:1: ( ( ( '@Inactive' ) ) )
            // InternalMoniLog.g:1008:2: ( ( '@Inactive' ) )
            {
            // InternalMoniLog.g:1008:2: ( ( '@Inactive' ) )
            // InternalMoniLog.g:1009:3: ( '@Inactive' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAnnotationAccess().getInactiveEnumLiteralDeclaration()); 
            }
            // InternalMoniLog.g:1010:3: ( '@Inactive' )
            // InternalMoniLog.g:1010:4: '@Inactive'
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
    // InternalMoniLog.g:1019:1: ruleAppenderAnnotation : ( ( '@Async' ) ) ;
    public final void ruleAppenderAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1023:1: ( ( ( '@Async' ) ) )
            // InternalMoniLog.g:1024:2: ( ( '@Async' ) )
            {
            // InternalMoniLog.g:1024:2: ( ( '@Async' ) )
            // InternalMoniLog.g:1025:3: ( '@Async' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderAnnotationAccess().getAsyncEnumLiteralDeclaration()); 
            }
            // InternalMoniLog.g:1026:3: ( '@Async' )
            // InternalMoniLog.g:1026:4: '@Async'
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
    // InternalMoniLog.g:1035:1: ruleLogLevel : ( ( rule__LogLevel__Alternatives ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1039:1: ( ( ( rule__LogLevel__Alternatives ) ) )
            // InternalMoniLog.g:1040:2: ( ( rule__LogLevel__Alternatives ) )
            {
            // InternalMoniLog.g:1040:2: ( ( rule__LogLevel__Alternatives ) )
            // InternalMoniLog.g:1041:3: ( rule__LogLevel__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLogLevelAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:1042:3: ( rule__LogLevel__Alternatives )
            // InternalMoniLog.g:1042:4: rule__LogLevel__Alternatives
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
    // InternalMoniLog.g:1051:1: ruleTemporalPatternKind : ( ( rule__TemporalPatternKind__Alternatives ) ) ;
    public final void ruleTemporalPatternKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1055:1: ( ( ( rule__TemporalPatternKind__Alternatives ) ) )
            // InternalMoniLog.g:1056:2: ( ( rule__TemporalPatternKind__Alternatives ) )
            {
            // InternalMoniLog.g:1056:2: ( ( rule__TemporalPatternKind__Alternatives ) )
            // InternalMoniLog.g:1057:3: ( rule__TemporalPatternKind__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternKindAccess().getAlternatives()); 
            }
            // InternalMoniLog.g:1058:3: ( rule__TemporalPatternKind__Alternatives )
            // InternalMoniLog.g:1058:4: rule__TemporalPatternKind__Alternatives
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
    // InternalMoniLog.g:1066:1: rule__Appender__Alternatives : ( ( ruleLocalAppender ) | ( ruleExternalAppender ) );
    public final void rule__Appender__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1070:1: ( ( ruleLocalAppender ) | ( ruleExternalAppender ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalMoniLog.g:1071:2: ( ruleLocalAppender )
                    {
                    // InternalMoniLog.g:1071:2: ( ruleLocalAppender )
                    // InternalMoniLog.g:1072:3: ruleLocalAppender
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
                    // InternalMoniLog.g:1077:2: ( ruleExternalAppender )
                    {
                    // InternalMoniLog.g:1077:2: ( ruleExternalAppender )
                    // InternalMoniLog.g:1078:3: ruleExternalAppender
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
    // InternalMoniLog.g:1087:1: rule__Layout__Alternatives : ( ( ruleLocalLayout ) | ( ruleExternalLayout ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1091:1: ( ( ruleLocalLayout ) | ( ruleExternalLayout ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalMoniLog.g:1092:2: ( ruleLocalLayout )
                    {
                    // InternalMoniLog.g:1092:2: ( ruleLocalLayout )
                    // InternalMoniLog.g:1093:3: ruleLocalLayout
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
                    // InternalMoniLog.g:1098:2: ( ruleExternalLayout )
                    {
                    // InternalMoniLog.g:1098:2: ( ruleExternalLayout )
                    // InternalMoniLog.g:1099:3: ruleExternalLayout
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
    // InternalMoniLog.g:1108:1: rule__Event__Alternatives : ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1112:1: ( ( ( rule__Event__Group_0__0 ) ) | ( ( rule__Event__Group_1__0 ) ) | ( ( rule__Event__Group_2__0 ) ) )
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
                    // InternalMoniLog.g:1113:2: ( ( rule__Event__Group_0__0 ) )
                    {
                    // InternalMoniLog.g:1113:2: ( ( rule__Event__Group_0__0 ) )
                    // InternalMoniLog.g:1114:3: ( rule__Event__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_0()); 
                    }
                    // InternalMoniLog.g:1115:3: ( rule__Event__Group_0__0 )
                    // InternalMoniLog.g:1115:4: rule__Event__Group_0__0
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
                    // InternalMoniLog.g:1119:2: ( ( rule__Event__Group_1__0 ) )
                    {
                    // InternalMoniLog.g:1119:2: ( ( rule__Event__Group_1__0 ) )
                    // InternalMoniLog.g:1120:3: ( rule__Event__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_1()); 
                    }
                    // InternalMoniLog.g:1121:3: ( rule__Event__Group_1__0 )
                    // InternalMoniLog.g:1121:4: rule__Event__Group_1__0
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
                    // InternalMoniLog.g:1125:2: ( ( rule__Event__Group_2__0 ) )
                    {
                    // InternalMoniLog.g:1125:2: ( ( rule__Event__Group_2__0 ) )
                    // InternalMoniLog.g:1126:3: ( rule__Event__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEventAccess().getGroup_2()); 
                    }
                    // InternalMoniLog.g:1127:3: ( rule__Event__Group_2__0 )
                    // InternalMoniLog.g:1127:4: rule__Event__Group_2__0
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
    // InternalMoniLog.g:1135:1: rule__ASTEventKind__Alternatives : ( ( ( rule__ASTEventKind__Group_0__0 ) ) | ( ( rule__ASTEventKind__Group_1__0 ) ) );
    public final void rule__ASTEventKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1139:1: ( ( ( rule__ASTEventKind__Group_0__0 ) ) | ( ( rule__ASTEventKind__Group_1__0 ) ) )
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
                    // InternalMoniLog.g:1140:2: ( ( rule__ASTEventKind__Group_0__0 ) )
                    {
                    // InternalMoniLog.g:1140:2: ( ( rule__ASTEventKind__Group_0__0 ) )
                    // InternalMoniLog.g:1141:3: ( rule__ASTEventKind__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASTEventKindAccess().getGroup_0()); 
                    }
                    // InternalMoniLog.g:1142:3: ( rule__ASTEventKind__Group_0__0 )
                    // InternalMoniLog.g:1142:4: rule__ASTEventKind__Group_0__0
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
                    // InternalMoniLog.g:1146:2: ( ( rule__ASTEventKind__Group_1__0 ) )
                    {
                    // InternalMoniLog.g:1146:2: ( ( rule__ASTEventKind__Group_1__0 ) )
                    // InternalMoniLog.g:1147:3: ( rule__ASTEventKind__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getASTEventKindAccess().getGroup_1()); 
                    }
                    // InternalMoniLog.g:1148:3: ( rule__ASTEventKind__Group_1__0 )
                    // InternalMoniLog.g:1148:4: rule__ASTEventKind__Group_1__0
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
    // InternalMoniLog.g:1156:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1160:1: ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) )
            int alt5=5;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMoniLog.g:1161:2: ( ( rule__Pattern__Group_0__0 ) )
                    {
                    // InternalMoniLog.g:1161:2: ( ( rule__Pattern__Group_0__0 ) )
                    // InternalMoniLog.g:1162:3: ( rule__Pattern__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_0()); 
                    }
                    // InternalMoniLog.g:1163:3: ( rule__Pattern__Group_0__0 )
                    // InternalMoniLog.g:1163:4: rule__Pattern__Group_0__0
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
                    // InternalMoniLog.g:1167:2: ( ( rule__Pattern__Group_1__0 ) )
                    {
                    // InternalMoniLog.g:1167:2: ( ( rule__Pattern__Group_1__0 ) )
                    // InternalMoniLog.g:1168:3: ( rule__Pattern__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_1()); 
                    }
                    // InternalMoniLog.g:1169:3: ( rule__Pattern__Group_1__0 )
                    // InternalMoniLog.g:1169:4: rule__Pattern__Group_1__0
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
                    // InternalMoniLog.g:1173:2: ( ( rule__Pattern__Group_2__0 ) )
                    {
                    // InternalMoniLog.g:1173:2: ( ( rule__Pattern__Group_2__0 ) )
                    // InternalMoniLog.g:1174:3: ( rule__Pattern__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_2()); 
                    }
                    // InternalMoniLog.g:1175:3: ( rule__Pattern__Group_2__0 )
                    // InternalMoniLog.g:1175:4: rule__Pattern__Group_2__0
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
                    // InternalMoniLog.g:1179:2: ( ( rule__Pattern__Group_3__0 ) )
                    {
                    // InternalMoniLog.g:1179:2: ( ( rule__Pattern__Group_3__0 ) )
                    // InternalMoniLog.g:1180:3: ( rule__Pattern__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_3()); 
                    }
                    // InternalMoniLog.g:1181:3: ( rule__Pattern__Group_3__0 )
                    // InternalMoniLog.g:1181:4: rule__Pattern__Group_3__0
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
                    // InternalMoniLog.g:1185:2: ( ( rule__Pattern__Group_4__0 ) )
                    {
                    // InternalMoniLog.g:1185:2: ( ( rule__Pattern__Group_4__0 ) )
                    // InternalMoniLog.g:1186:3: ( rule__Pattern__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPatternAccess().getGroup_4()); 
                    }
                    // InternalMoniLog.g:1187:3: ( rule__Pattern__Group_4__0 )
                    // InternalMoniLog.g:1187:4: rule__Pattern__Group_4__0
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
    // InternalMoniLog.g:1195:1: rule__BoundType__Alternatives : ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) );
    public final void rule__BoundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1199:1: ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) )
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
                    // InternalMoniLog.g:1200:2: ( ruleExactBound )
                    {
                    // InternalMoniLog.g:1200:2: ( ruleExactBound )
                    // InternalMoniLog.g:1201:3: ruleExactBound
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
                    // InternalMoniLog.g:1206:2: ( ruleLowerBound )
                    {
                    // InternalMoniLog.g:1206:2: ( ruleLowerBound )
                    // InternalMoniLog.g:1207:3: ruleLowerBound
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
                    // InternalMoniLog.g:1212:2: ( ruleUpperBound )
                    {
                    // InternalMoniLog.g:1212:2: ( ruleUpperBound )
                    // InternalMoniLog.g:1213:3: ruleUpperBound
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
    // InternalMoniLog.g:1222:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1226:1: ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMoniLog.g:1227:2: ( ( rule__Scope__Group_0__0 ) )
                    {
                    // InternalMoniLog.g:1227:2: ( ( rule__Scope__Group_0__0 ) )
                    // InternalMoniLog.g:1228:3: ( rule__Scope__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_0()); 
                    }
                    // InternalMoniLog.g:1229:3: ( rule__Scope__Group_0__0 )
                    // InternalMoniLog.g:1229:4: rule__Scope__Group_0__0
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
                    // InternalMoniLog.g:1233:2: ( ( rule__Scope__Group_1__0 ) )
                    {
                    // InternalMoniLog.g:1233:2: ( ( rule__Scope__Group_1__0 ) )
                    // InternalMoniLog.g:1234:3: ( rule__Scope__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_1()); 
                    }
                    // InternalMoniLog.g:1235:3: ( rule__Scope__Group_1__0 )
                    // InternalMoniLog.g:1235:4: rule__Scope__Group_1__0
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
                    // InternalMoniLog.g:1239:2: ( ( rule__Scope__Group_2__0 ) )
                    {
                    // InternalMoniLog.g:1239:2: ( ( rule__Scope__Group_2__0 ) )
                    // InternalMoniLog.g:1240:3: ( rule__Scope__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_2()); 
                    }
                    // InternalMoniLog.g:1241:3: ( rule__Scope__Group_2__0 )
                    // InternalMoniLog.g:1241:4: rule__Scope__Group_2__0
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
                    // InternalMoniLog.g:1245:2: ( ( rule__Scope__Group_3__0 ) )
                    {
                    // InternalMoniLog.g:1245:2: ( ( rule__Scope__Group_3__0 ) )
                    // InternalMoniLog.g:1246:3: ( rule__Scope__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_3()); 
                    }
                    // InternalMoniLog.g:1247:3: ( rule__Scope__Group_3__0 )
                    // InternalMoniLog.g:1247:4: rule__Scope__Group_3__0
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
                    // InternalMoniLog.g:1251:2: ( ( rule__Scope__Group_4__0 ) )
                    {
                    // InternalMoniLog.g:1251:2: ( ( rule__Scope__Group_4__0 ) )
                    // InternalMoniLog.g:1252:3: ( rule__Scope__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getScopeAccess().getGroup_4()); 
                    }
                    // InternalMoniLog.g:1253:3: ( rule__Scope__Group_4__0 )
                    // InternalMoniLog.g:1253:4: rule__Scope__Group_4__0
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
    // InternalMoniLog.g:1261:1: rule__Action__Alternatives : ( ( ruleLanguageExpression ) | ( ruleAppenderCall ) | ( ruleEmitEvent ) | ( ruleSetVariable ) | ( ruleMoniloggerCall ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1265:1: ( ( ruleLanguageExpression ) | ( ruleAppenderCall ) | ( ruleEmitEvent ) | ( ruleSetVariable ) | ( ruleMoniloggerCall ) )
            int alt8=5;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==57) ) {
                    switch ( input.LA(3) ) {
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
                    case 60:
                    case 61:
                        {
                        alt8=5;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 3, input);

                        throw nvae;
                    }

                }
                else if ( (LA8_1==30) ) {
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
                    // InternalMoniLog.g:1266:2: ( ruleLanguageExpression )
                    {
                    // InternalMoniLog.g:1266:2: ( ruleLanguageExpression )
                    // InternalMoniLog.g:1267:3: ruleLanguageExpression
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
                    // InternalMoniLog.g:1272:2: ( ruleAppenderCall )
                    {
                    // InternalMoniLog.g:1272:2: ( ruleAppenderCall )
                    // InternalMoniLog.g:1273:3: ruleAppenderCall
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
                    // InternalMoniLog.g:1278:2: ( ruleEmitEvent )
                    {
                    // InternalMoniLog.g:1278:2: ( ruleEmitEvent )
                    // InternalMoniLog.g:1279:3: ruleEmitEvent
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
                    // InternalMoniLog.g:1284:2: ( ruleSetVariable )
                    {
                    // InternalMoniLog.g:1284:2: ( ruleSetVariable )
                    // InternalMoniLog.g:1285:3: ruleSetVariable
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
                    // InternalMoniLog.g:1290:2: ( ruleMoniloggerCall )
                    {
                    // InternalMoniLog.g:1290:2: ( ruleMoniloggerCall )
                    // InternalMoniLog.g:1291:3: ruleMoniloggerCall
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
    // InternalMoniLog.g:1300:1: rule__AppenderCallArgument__Alternatives : ( ( ruleExpression ) | ( ruleLayoutCall ) );
    public final void rule__AppenderCallArgument__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1304:1: ( ( ruleExpression ) | ( ruleLayoutCall ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==57) ) {
                    alt9=2;
                }
                else if ( (LA9_1==EOF||(LA9_1>=30 && LA9_1<=31)||LA9_1==33) ) {
                    alt9=1;
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
                    // InternalMoniLog.g:1305:2: ( ruleExpression )
                    {
                    // InternalMoniLog.g:1305:2: ( ruleExpression )
                    // InternalMoniLog.g:1306:3: ruleExpression
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
                    // InternalMoniLog.g:1311:2: ( ruleLayoutCall )
                    {
                    // InternalMoniLog.g:1311:2: ( ruleLayoutCall )
                    // InternalMoniLog.g:1312:3: ruleLayoutCall
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
    // InternalMoniLog.g:1321:1: rule__MoniloggerCall__Alternatives : ( ( ( rule__MoniloggerCall__Group_0__0 ) ) | ( ( rule__MoniloggerCall__Group_1__0 ) ) );
    public final void rule__MoniloggerCall__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1325:1: ( ( ( rule__MoniloggerCall__Group_0__0 ) ) | ( ( rule__MoniloggerCall__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==57) ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2==61) ) {
                        alt10=2;
                    }
                    else if ( (LA10_2==60) ) {
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
                    // InternalMoniLog.g:1326:2: ( ( rule__MoniloggerCall__Group_0__0 ) )
                    {
                    // InternalMoniLog.g:1326:2: ( ( rule__MoniloggerCall__Group_0__0 ) )
                    // InternalMoniLog.g:1327:3: ( rule__MoniloggerCall__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMoniloggerCallAccess().getGroup_0()); 
                    }
                    // InternalMoniLog.g:1328:3: ( rule__MoniloggerCall__Group_0__0 )
                    // InternalMoniLog.g:1328:4: rule__MoniloggerCall__Group_0__0
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
                    // InternalMoniLog.g:1332:2: ( ( rule__MoniloggerCall__Group_1__0 ) )
                    {
                    // InternalMoniLog.g:1332:2: ( ( rule__MoniloggerCall__Group_1__0 ) )
                    // InternalMoniLog.g:1333:3: ( rule__MoniloggerCall__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMoniloggerCallAccess().getGroup_1()); 
                    }
                    // InternalMoniLog.g:1334:3: ( rule__MoniloggerCall__Group_1__0 )
                    // InternalMoniLog.g:1334:4: rule__MoniloggerCall__Group_1__0
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
    // InternalMoniLog.g:1342:1: rule__EmptyOrPropertyValue__Alternatives : ( ( () ) | ( rulePropertyValue ) );
    public final void rule__EmptyOrPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1346:1: ( ( () ) | ( rulePropertyValue ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==EOF||LA11_0==31||LA11_0==33) ) {
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
                    // InternalMoniLog.g:1347:2: ( () )
                    {
                    // InternalMoniLog.g:1347:2: ( () )
                    // InternalMoniLog.g:1348:3: ()
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    }
                    // InternalMoniLog.g:1349:3: ()
                    // InternalMoniLog.g:1349:4: 
                    {
                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:1353:2: ( rulePropertyValue )
                    {
                    // InternalMoniLog.g:1353:2: ( rulePropertyValue )
                    // InternalMoniLog.g:1354:3: rulePropertyValue
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
    // InternalMoniLog.g:1363:1: rule__Expression__Alternatives : ( ( ruleParameterReference ) | ( ruleLanguageExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1367:1: ( ( ruleParameterReference ) | ( ruleLanguageExpression ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==EOF||LA12_1==31||LA12_1==33) ) {
                    alt12=1;
                }
                else if ( (LA12_1==30) ) {
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
                    // InternalMoniLog.g:1368:2: ( ruleParameterReference )
                    {
                    // InternalMoniLog.g:1368:2: ( ruleParameterReference )
                    // InternalMoniLog.g:1369:3: ruleParameterReference
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
                    // InternalMoniLog.g:1374:2: ( ruleLanguageExpression )
                    {
                    // InternalMoniLog.g:1374:2: ( ruleLanguageExpression )
                    // InternalMoniLog.g:1375:3: ruleLanguageExpression
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
    // InternalMoniLog.g:1384:1: rule__PropertyValue__Alternatives : ( ( ( rule__PropertyValue__Group_0__0 ) ) | ( ( rule__PropertyValue__ValueAssignment_1 ) ) );
    public final void rule__PropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1388:1: ( ( ( rule__PropertyValue__Group_0__0 ) ) | ( ( rule__PropertyValue__ValueAssignment_1 ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==30) ) {
                    alt13=2;
                }
                else if ( (LA13_1==EOF||LA13_1==31||LA13_1==33||LA13_1==62) ) {
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
                    // InternalMoniLog.g:1389:2: ( ( rule__PropertyValue__Group_0__0 ) )
                    {
                    // InternalMoniLog.g:1389:2: ( ( rule__PropertyValue__Group_0__0 ) )
                    // InternalMoniLog.g:1390:3: ( rule__PropertyValue__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueAccess().getGroup_0()); 
                    }
                    // InternalMoniLog.g:1391:3: ( rule__PropertyValue__Group_0__0 )
                    // InternalMoniLog.g:1391:4: rule__PropertyValue__Group_0__0
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
                    // InternalMoniLog.g:1395:2: ( ( rule__PropertyValue__ValueAssignment_1 ) )
                    {
                    // InternalMoniLog.g:1395:2: ( ( rule__PropertyValue__ValueAssignment_1 ) )
                    // InternalMoniLog.g:1396:3: ( rule__PropertyValue__ValueAssignment_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getPropertyValueAccess().getValueAssignment_1()); 
                    }
                    // InternalMoniLog.g:1397:3: ( rule__PropertyValue__ValueAssignment_1 )
                    // InternalMoniLog.g:1397:4: rule__PropertyValue__ValueAssignment_1
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
    // InternalMoniLog.g:1405:1: rule__LogLevel__Alternatives : ( ( ( 'INFO' ) ) | ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) );
    public final void rule__LogLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1409:1: ( ( ( 'INFO' ) ) | ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) )
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
                    // InternalMoniLog.g:1410:2: ( ( 'INFO' ) )
                    {
                    // InternalMoniLog.g:1410:2: ( ( 'INFO' ) )
                    // InternalMoniLog.g:1411:3: ( 'INFO' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_0()); 
                    }
                    // InternalMoniLog.g:1412:3: ( 'INFO' )
                    // InternalMoniLog.g:1412:4: 'INFO'
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
                    // InternalMoniLog.g:1416:2: ( ( 'CONFIG' ) )
                    {
                    // InternalMoniLog.g:1416:2: ( ( 'CONFIG' ) )
                    // InternalMoniLog.g:1417:3: ( 'CONFIG' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_1()); 
                    }
                    // InternalMoniLog.g:1418:3: ( 'CONFIG' )
                    // InternalMoniLog.g:1418:4: 'CONFIG'
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
                    // InternalMoniLog.g:1422:2: ( ( 'FINE' ) )
                    {
                    // InternalMoniLog.g:1422:2: ( ( 'FINE' ) )
                    // InternalMoniLog.g:1423:3: ( 'FINE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_2()); 
                    }
                    // InternalMoniLog.g:1424:3: ( 'FINE' )
                    // InternalMoniLog.g:1424:4: 'FINE'
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
                    // InternalMoniLog.g:1428:2: ( ( 'FINER' ) )
                    {
                    // InternalMoniLog.g:1428:2: ( ( 'FINER' ) )
                    // InternalMoniLog.g:1429:3: ( 'FINER' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_3()); 
                    }
                    // InternalMoniLog.g:1430:3: ( 'FINER' )
                    // InternalMoniLog.g:1430:4: 'FINER'
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
                    // InternalMoniLog.g:1434:2: ( ( 'FINEST' ) )
                    {
                    // InternalMoniLog.g:1434:2: ( ( 'FINEST' ) )
                    // InternalMoniLog.g:1435:3: ( 'FINEST' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_4()); 
                    }
                    // InternalMoniLog.g:1436:3: ( 'FINEST' )
                    // InternalMoniLog.g:1436:4: 'FINEST'
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
                    // InternalMoniLog.g:1440:2: ( ( 'SEVERE' ) )
                    {
                    // InternalMoniLog.g:1440:2: ( ( 'SEVERE' ) )
                    // InternalMoniLog.g:1441:3: ( 'SEVERE' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5()); 
                    }
                    // InternalMoniLog.g:1442:3: ( 'SEVERE' )
                    // InternalMoniLog.g:1442:4: 'SEVERE'
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
                    // InternalMoniLog.g:1446:2: ( ( 'WARNING' ) )
                    {
                    // InternalMoniLog.g:1446:2: ( ( 'WARNING' ) )
                    // InternalMoniLog.g:1447:3: ( 'WARNING' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6()); 
                    }
                    // InternalMoniLog.g:1448:3: ( 'WARNING' )
                    // InternalMoniLog.g:1448:4: 'WARNING'
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
    // InternalMoniLog.g:1456:1: rule__TemporalPatternKind__Alternatives : ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) );
    public final void rule__TemporalPatternKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1460:1: ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) )
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
                    // InternalMoniLog.g:1461:2: ( ( 'S' ) )
                    {
                    // InternalMoniLog.g:1461:2: ( ( 'S' ) )
                    // InternalMoniLog.g:1462:3: ( 'S' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getSEnumLiteralDeclaration_0()); 
                    }
                    // InternalMoniLog.g:1463:3: ( 'S' )
                    // InternalMoniLog.g:1463:4: 'S'
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
                    // InternalMoniLog.g:1467:2: ( ( 'V' ) )
                    {
                    // InternalMoniLog.g:1467:2: ( ( 'V' ) )
                    // InternalMoniLog.g:1468:3: ( 'V' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getVEnumLiteralDeclaration_1()); 
                    }
                    // InternalMoniLog.g:1469:3: ( 'V' )
                    // InternalMoniLog.g:1469:4: 'V'
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
                    // InternalMoniLog.g:1473:2: ( ( 'nS' ) )
                    {
                    // InternalMoniLog.g:1473:2: ( ( 'nS' ) )
                    // InternalMoniLog.g:1474:3: ( 'nS' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getNSEnumLiteralDeclaration_2()); 
                    }
                    // InternalMoniLog.g:1475:3: ( 'nS' )
                    // InternalMoniLog.g:1475:4: 'nS'
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
                    // InternalMoniLog.g:1479:2: ( ( 'nV' ) )
                    {
                    // InternalMoniLog.g:1479:2: ( ( 'nV' ) )
                    // InternalMoniLog.g:1480:3: ( 'nV' )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getTemporalPatternKindAccess().getNVEnumLiteralDeclaration_3()); 
                    }
                    // InternalMoniLog.g:1481:3: ( 'nV' )
                    // InternalMoniLog.g:1481:4: 'nV'
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
    // InternalMoniLog.g:1489:1: rule__Document__Group__0 : rule__Document__Group__0__Impl rule__Document__Group__1 ;
    public final void rule__Document__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1493:1: ( rule__Document__Group__0__Impl rule__Document__Group__1 )
            // InternalMoniLog.g:1494:2: rule__Document__Group__0__Impl rule__Document__Group__1
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
    // InternalMoniLog.g:1501:1: rule__Document__Group__0__Impl : ( 'package' ) ;
    public final void rule__Document__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1505:1: ( ( 'package' ) )
            // InternalMoniLog.g:1506:1: ( 'package' )
            {
            // InternalMoniLog.g:1506:1: ( 'package' )
            // InternalMoniLog.g:1507:2: 'package'
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
    // InternalMoniLog.g:1516:1: rule__Document__Group__1 : rule__Document__Group__1__Impl rule__Document__Group__2 ;
    public final void rule__Document__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1520:1: ( rule__Document__Group__1__Impl rule__Document__Group__2 )
            // InternalMoniLog.g:1521:2: rule__Document__Group__1__Impl rule__Document__Group__2
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
    // InternalMoniLog.g:1528:1: rule__Document__Group__1__Impl : ( ( rule__Document__NameAssignment_1 ) ) ;
    public final void rule__Document__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1532:1: ( ( ( rule__Document__NameAssignment_1 ) ) )
            // InternalMoniLog.g:1533:1: ( ( rule__Document__NameAssignment_1 ) )
            {
            // InternalMoniLog.g:1533:1: ( ( rule__Document__NameAssignment_1 ) )
            // InternalMoniLog.g:1534:2: ( rule__Document__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog.g:1535:2: ( rule__Document__NameAssignment_1 )
            // InternalMoniLog.g:1535:3: rule__Document__NameAssignment_1
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
    // InternalMoniLog.g:1543:1: rule__Document__Group__2 : rule__Document__Group__2__Impl rule__Document__Group__3 ;
    public final void rule__Document__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1547:1: ( rule__Document__Group__2__Impl rule__Document__Group__3 )
            // InternalMoniLog.g:1548:2: rule__Document__Group__2__Impl rule__Document__Group__3
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
    // InternalMoniLog.g:1555:1: rule__Document__Group__2__Impl : ( ( rule__Document__ImportsAssignment_2 )* ) ;
    public final void rule__Document__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1559:1: ( ( ( rule__Document__ImportsAssignment_2 )* ) )
            // InternalMoniLog.g:1560:1: ( ( rule__Document__ImportsAssignment_2 )* )
            {
            // InternalMoniLog.g:1560:1: ( ( rule__Document__ImportsAssignment_2 )* )
            // InternalMoniLog.g:1561:2: ( rule__Document__ImportsAssignment_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getImportsAssignment_2()); 
            }
            // InternalMoniLog.g:1562:2: ( rule__Document__ImportsAssignment_2 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMoniLog.g:1562:3: rule__Document__ImportsAssignment_2
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
    // InternalMoniLog.g:1570:1: rule__Document__Group__3 : rule__Document__Group__3__Impl ;
    public final void rule__Document__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1574:1: ( rule__Document__Group__3__Impl )
            // InternalMoniLog.g:1575:2: rule__Document__Group__3__Impl
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
    // InternalMoniLog.g:1581:1: rule__Document__Group__3__Impl : ( ( rule__Document__UnorderedGroup_3 ) ) ;
    public final void rule__Document__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1585:1: ( ( ( rule__Document__UnorderedGroup_3 ) ) )
            // InternalMoniLog.g:1586:1: ( ( rule__Document__UnorderedGroup_3 ) )
            {
            // InternalMoniLog.g:1586:1: ( ( rule__Document__UnorderedGroup_3 ) )
            // InternalMoniLog.g:1587:2: ( rule__Document__UnorderedGroup_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDocumentAccess().getUnorderedGroup_3()); 
            }
            // InternalMoniLog.g:1588:2: ( rule__Document__UnorderedGroup_3 )
            // InternalMoniLog.g:1588:3: rule__Document__UnorderedGroup_3
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
    // InternalMoniLog.g:1597:1: rule__Import__Group__0 : rule__Import__Group__0__Impl rule__Import__Group__1 ;
    public final void rule__Import__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1601:1: ( rule__Import__Group__0__Impl rule__Import__Group__1 )
            // InternalMoniLog.g:1602:2: rule__Import__Group__0__Impl rule__Import__Group__1
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
    // InternalMoniLog.g:1609:1: rule__Import__Group__0__Impl : ( 'import' ) ;
    public final void rule__Import__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1613:1: ( ( 'import' ) )
            // InternalMoniLog.g:1614:1: ( 'import' )
            {
            // InternalMoniLog.g:1614:1: ( 'import' )
            // InternalMoniLog.g:1615:2: 'import'
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
    // InternalMoniLog.g:1624:1: rule__Import__Group__1 : rule__Import__Group__1__Impl ;
    public final void rule__Import__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1628:1: ( rule__Import__Group__1__Impl )
            // InternalMoniLog.g:1629:2: rule__Import__Group__1__Impl
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
    // InternalMoniLog.g:1635:1: rule__Import__Group__1__Impl : ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__Import__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1639:1: ( ( ( rule__Import__ImportedNamespaceAssignment_1 ) ) )
            // InternalMoniLog.g:1640:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            {
            // InternalMoniLog.g:1640:1: ( ( rule__Import__ImportedNamespaceAssignment_1 ) )
            // InternalMoniLog.g:1641:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalMoniLog.g:1642:2: ( rule__Import__ImportedNamespaceAssignment_1 )
            // InternalMoniLog.g:1642:3: rule__Import__ImportedNamespaceAssignment_1
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
    // InternalMoniLog.g:1651:1: rule__LocalAppender__Group__0 : rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1 ;
    public final void rule__LocalAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1655:1: ( rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1 )
            // InternalMoniLog.g:1656:2: rule__LocalAppender__Group__0__Impl rule__LocalAppender__Group__1
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
    // InternalMoniLog.g:1663:1: rule__LocalAppender__Group__0__Impl : ( ( rule__LocalAppender__AnnotationsAssignment_0 )* ) ;
    public final void rule__LocalAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1667:1: ( ( ( rule__LocalAppender__AnnotationsAssignment_0 )* ) )
            // InternalMoniLog.g:1668:1: ( ( rule__LocalAppender__AnnotationsAssignment_0 )* )
            {
            // InternalMoniLog.g:1668:1: ( ( rule__LocalAppender__AnnotationsAssignment_0 )* )
            // InternalMoniLog.g:1669:2: ( rule__LocalAppender__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getAnnotationsAssignment_0()); 
            }
            // InternalMoniLog.g:1670:2: ( rule__LocalAppender__AnnotationsAssignment_0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==12) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMoniLog.g:1670:3: rule__LocalAppender__AnnotationsAssignment_0
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
    // InternalMoniLog.g:1678:1: rule__LocalAppender__Group__1 : rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2 ;
    public final void rule__LocalAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1682:1: ( rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2 )
            // InternalMoniLog.g:1683:2: rule__LocalAppender__Group__1__Impl rule__LocalAppender__Group__2
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
    // InternalMoniLog.g:1690:1: rule__LocalAppender__Group__1__Impl : ( 'appender' ) ;
    public final void rule__LocalAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1694:1: ( ( 'appender' ) )
            // InternalMoniLog.g:1695:1: ( 'appender' )
            {
            // InternalMoniLog.g:1695:1: ( 'appender' )
            // InternalMoniLog.g:1696:2: 'appender'
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
    // InternalMoniLog.g:1705:1: rule__LocalAppender__Group__2 : rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3 ;
    public final void rule__LocalAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1709:1: ( rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3 )
            // InternalMoniLog.g:1710:2: rule__LocalAppender__Group__2__Impl rule__LocalAppender__Group__3
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
    // InternalMoniLog.g:1717:1: rule__LocalAppender__Group__2__Impl : ( ( rule__LocalAppender__NameAssignment_2 ) ) ;
    public final void rule__LocalAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1721:1: ( ( ( rule__LocalAppender__NameAssignment_2 ) ) )
            // InternalMoniLog.g:1722:1: ( ( rule__LocalAppender__NameAssignment_2 ) )
            {
            // InternalMoniLog.g:1722:1: ( ( rule__LocalAppender__NameAssignment_2 ) )
            // InternalMoniLog.g:1723:2: ( rule__LocalAppender__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getNameAssignment_2()); 
            }
            // InternalMoniLog.g:1724:2: ( rule__LocalAppender__NameAssignment_2 )
            // InternalMoniLog.g:1724:3: rule__LocalAppender__NameAssignment_2
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
    // InternalMoniLog.g:1732:1: rule__LocalAppender__Group__3 : rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4 ;
    public final void rule__LocalAppender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1736:1: ( rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4 )
            // InternalMoniLog.g:1737:2: rule__LocalAppender__Group__3__Impl rule__LocalAppender__Group__4
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
    // InternalMoniLog.g:1744:1: rule__LocalAppender__Group__3__Impl : ( ( rule__LocalAppender__Group_3__0 )? ) ;
    public final void rule__LocalAppender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1748:1: ( ( ( rule__LocalAppender__Group_3__0 )? ) )
            // InternalMoniLog.g:1749:1: ( ( rule__LocalAppender__Group_3__0 )? )
            {
            // InternalMoniLog.g:1749:1: ( ( rule__LocalAppender__Group_3__0 )? )
            // InternalMoniLog.g:1750:2: ( rule__LocalAppender__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_3()); 
            }
            // InternalMoniLog.g:1751:2: ( rule__LocalAppender__Group_3__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoniLog.g:1751:3: rule__LocalAppender__Group_3__0
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
    // InternalMoniLog.g:1759:1: rule__LocalAppender__Group__4 : rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5 ;
    public final void rule__LocalAppender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1763:1: ( rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5 )
            // InternalMoniLog.g:1764:2: rule__LocalAppender__Group__4__Impl rule__LocalAppender__Group__5
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
    // InternalMoniLog.g:1771:1: rule__LocalAppender__Group__4__Impl : ( '{' ) ;
    public final void rule__LocalAppender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1775:1: ( ( '{' ) )
            // InternalMoniLog.g:1776:1: ( '{' )
            {
            // InternalMoniLog.g:1776:1: ( '{' )
            // InternalMoniLog.g:1777:2: '{'
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
    // InternalMoniLog.g:1786:1: rule__LocalAppender__Group__5 : rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6 ;
    public final void rule__LocalAppender__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1790:1: ( rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6 )
            // InternalMoniLog.g:1791:2: rule__LocalAppender__Group__5__Impl rule__LocalAppender__Group__6
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
    // InternalMoniLog.g:1798:1: rule__LocalAppender__Group__5__Impl : ( ( rule__LocalAppender__CallsAssignment_5 ) ) ;
    public final void rule__LocalAppender__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1802:1: ( ( ( rule__LocalAppender__CallsAssignment_5 ) ) )
            // InternalMoniLog.g:1803:1: ( ( rule__LocalAppender__CallsAssignment_5 ) )
            {
            // InternalMoniLog.g:1803:1: ( ( rule__LocalAppender__CallsAssignment_5 ) )
            // InternalMoniLog.g:1804:2: ( rule__LocalAppender__CallsAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAssignment_5()); 
            }
            // InternalMoniLog.g:1805:2: ( rule__LocalAppender__CallsAssignment_5 )
            // InternalMoniLog.g:1805:3: rule__LocalAppender__CallsAssignment_5
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
    // InternalMoniLog.g:1813:1: rule__LocalAppender__Group__6 : rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7 ;
    public final void rule__LocalAppender__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1817:1: ( rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7 )
            // InternalMoniLog.g:1818:2: rule__LocalAppender__Group__6__Impl rule__LocalAppender__Group__7
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
    // InternalMoniLog.g:1825:1: rule__LocalAppender__Group__6__Impl : ( ( rule__LocalAppender__Group_6__0 )* ) ;
    public final void rule__LocalAppender__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1829:1: ( ( ( rule__LocalAppender__Group_6__0 )* ) )
            // InternalMoniLog.g:1830:1: ( ( rule__LocalAppender__Group_6__0 )* )
            {
            // InternalMoniLog.g:1830:1: ( ( rule__LocalAppender__Group_6__0 )* )
            // InternalMoniLog.g:1831:2: ( rule__LocalAppender__Group_6__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getGroup_6()); 
            }
            // InternalMoniLog.g:1832:2: ( rule__LocalAppender__Group_6__0 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==28) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_ID) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // InternalMoniLog.g:1832:3: rule__LocalAppender__Group_6__0
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
    // InternalMoniLog.g:1840:1: rule__LocalAppender__Group__7 : rule__LocalAppender__Group__7__Impl rule__LocalAppender__Group__8 ;
    public final void rule__LocalAppender__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1844:1: ( rule__LocalAppender__Group__7__Impl rule__LocalAppender__Group__8 )
            // InternalMoniLog.g:1845:2: rule__LocalAppender__Group__7__Impl rule__LocalAppender__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__LocalAppender__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMoniLog.g:1852:1: rule__LocalAppender__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__LocalAppender__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1856:1: ( ( ( ';' )? ) )
            // InternalMoniLog.g:1857:1: ( ( ';' )? )
            {
            // InternalMoniLog.g:1857:1: ( ( ';' )? )
            // InternalMoniLog.g:1858:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_7()); 
            }
            // InternalMoniLog.g:1859:2: ( ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==28) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMoniLog.g:1859:3: ';'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__LocalAppender__Group__8"
    // InternalMoniLog.g:1867:1: rule__LocalAppender__Group__8 : rule__LocalAppender__Group__8__Impl ;
    public final void rule__LocalAppender__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1871:1: ( rule__LocalAppender__Group__8__Impl )
            // InternalMoniLog.g:1872:2: rule__LocalAppender__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LocalAppender__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__8"


    // $ANTLR start "rule__LocalAppender__Group__8__Impl"
    // InternalMoniLog.g:1878:1: rule__LocalAppender__Group__8__Impl : ( '}' ) ;
    public final void rule__LocalAppender__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1882:1: ( ( '}' ) )
            // InternalMoniLog.g:1883:1: ( '}' )
            {
            // InternalMoniLog.g:1883:1: ( '}' )
            // InternalMoniLog.g:1884:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_8()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getLocalAppenderAccess().getRightCurlyBracketKeyword_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LocalAppender__Group__8__Impl"


    // $ANTLR start "rule__LocalAppender__Group_3__0"
    // InternalMoniLog.g:1894:1: rule__LocalAppender__Group_3__0 : rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1 ;
    public final void rule__LocalAppender__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1898:1: ( rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1 )
            // InternalMoniLog.g:1899:2: rule__LocalAppender__Group_3__0__Impl rule__LocalAppender__Group_3__1
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
    // InternalMoniLog.g:1906:1: rule__LocalAppender__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LocalAppender__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1910:1: ( ( '(' ) )
            // InternalMoniLog.g:1911:1: ( '(' )
            {
            // InternalMoniLog.g:1911:1: ( '(' )
            // InternalMoniLog.g:1912:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:1921:1: rule__LocalAppender__Group_3__1 : rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2 ;
    public final void rule__LocalAppender__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1925:1: ( rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2 )
            // InternalMoniLog.g:1926:2: rule__LocalAppender__Group_3__1__Impl rule__LocalAppender__Group_3__2
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
    // InternalMoniLog.g:1933:1: rule__LocalAppender__Group_3__1__Impl : ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) ) ;
    public final void rule__LocalAppender__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1937:1: ( ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) ) )
            // InternalMoniLog.g:1938:1: ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) )
            {
            // InternalMoniLog.g:1938:1: ( ( rule__LocalAppender__ParameterDeclAssignment_3_1 ) )
            // InternalMoniLog.g:1939:2: ( rule__LocalAppender__ParameterDeclAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getParameterDeclAssignment_3_1()); 
            }
            // InternalMoniLog.g:1940:2: ( rule__LocalAppender__ParameterDeclAssignment_3_1 )
            // InternalMoniLog.g:1940:3: rule__LocalAppender__ParameterDeclAssignment_3_1
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
    // InternalMoniLog.g:1948:1: rule__LocalAppender__Group_3__2 : rule__LocalAppender__Group_3__2__Impl ;
    public final void rule__LocalAppender__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1952:1: ( rule__LocalAppender__Group_3__2__Impl )
            // InternalMoniLog.g:1953:2: rule__LocalAppender__Group_3__2__Impl
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
    // InternalMoniLog.g:1959:1: rule__LocalAppender__Group_3__2__Impl : ( ')' ) ;
    public final void rule__LocalAppender__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1963:1: ( ( ')' ) )
            // InternalMoniLog.g:1964:1: ( ')' )
            {
            // InternalMoniLog.g:1964:1: ( ')' )
            // InternalMoniLog.g:1965:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:1975:1: rule__LocalAppender__Group_6__0 : rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1 ;
    public final void rule__LocalAppender__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1979:1: ( rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1 )
            // InternalMoniLog.g:1980:2: rule__LocalAppender__Group_6__0__Impl rule__LocalAppender__Group_6__1
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
    // InternalMoniLog.g:1987:1: rule__LocalAppender__Group_6__0__Impl : ( ';' ) ;
    public final void rule__LocalAppender__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:1991:1: ( ( ';' ) )
            // InternalMoniLog.g:1992:1: ( ';' )
            {
            // InternalMoniLog.g:1992:1: ( ';' )
            // InternalMoniLog.g:1993:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getSemicolonKeyword_6_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2002:1: rule__LocalAppender__Group_6__1 : rule__LocalAppender__Group_6__1__Impl ;
    public final void rule__LocalAppender__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2006:1: ( rule__LocalAppender__Group_6__1__Impl )
            // InternalMoniLog.g:2007:2: rule__LocalAppender__Group_6__1__Impl
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
    // InternalMoniLog.g:2013:1: rule__LocalAppender__Group_6__1__Impl : ( ( rule__LocalAppender__CallsAssignment_6_1 ) ) ;
    public final void rule__LocalAppender__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2017:1: ( ( ( rule__LocalAppender__CallsAssignment_6_1 ) ) )
            // InternalMoniLog.g:2018:1: ( ( rule__LocalAppender__CallsAssignment_6_1 ) )
            {
            // InternalMoniLog.g:2018:1: ( ( rule__LocalAppender__CallsAssignment_6_1 ) )
            // InternalMoniLog.g:2019:2: ( rule__LocalAppender__CallsAssignment_6_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalAppenderAccess().getCallsAssignment_6_1()); 
            }
            // InternalMoniLog.g:2020:2: ( rule__LocalAppender__CallsAssignment_6_1 )
            // InternalMoniLog.g:2020:3: rule__LocalAppender__CallsAssignment_6_1
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
    // InternalMoniLog.g:2029:1: rule__ExternalAppender__Group__0 : rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1 ;
    public final void rule__ExternalAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2033:1: ( rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1 )
            // InternalMoniLog.g:2034:2: rule__ExternalAppender__Group__0__Impl rule__ExternalAppender__Group__1
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
    // InternalMoniLog.g:2041:1: rule__ExternalAppender__Group__0__Impl : ( 'appender' ) ;
    public final void rule__ExternalAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2045:1: ( ( 'appender' ) )
            // InternalMoniLog.g:2046:1: ( 'appender' )
            {
            // InternalMoniLog.g:2046:1: ( 'appender' )
            // InternalMoniLog.g:2047:2: 'appender'
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
    // InternalMoniLog.g:2056:1: rule__ExternalAppender__Group__1 : rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2 ;
    public final void rule__ExternalAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2060:1: ( rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2 )
            // InternalMoniLog.g:2061:2: rule__ExternalAppender__Group__1__Impl rule__ExternalAppender__Group__2
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
    // InternalMoniLog.g:2068:1: rule__ExternalAppender__Group__1__Impl : ( ( rule__ExternalAppender__NameAssignment_1 ) ) ;
    public final void rule__ExternalAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2072:1: ( ( ( rule__ExternalAppender__NameAssignment_1 ) ) )
            // InternalMoniLog.g:2073:1: ( ( rule__ExternalAppender__NameAssignment_1 ) )
            {
            // InternalMoniLog.g:2073:1: ( ( rule__ExternalAppender__NameAssignment_1 ) )
            // InternalMoniLog.g:2074:2: ( rule__ExternalAppender__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog.g:2075:2: ( rule__ExternalAppender__NameAssignment_1 )
            // InternalMoniLog.g:2075:3: rule__ExternalAppender__NameAssignment_1
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
    // InternalMoniLog.g:2083:1: rule__ExternalAppender__Group__2 : rule__ExternalAppender__Group__2__Impl ;
    public final void rule__ExternalAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2087:1: ( rule__ExternalAppender__Group__2__Impl )
            // InternalMoniLog.g:2088:2: rule__ExternalAppender__Group__2__Impl
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
    // InternalMoniLog.g:2094:1: rule__ExternalAppender__Group__2__Impl : ( ( rule__ExternalAppender__Group_2__0 )? ) ;
    public final void rule__ExternalAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2098:1: ( ( ( rule__ExternalAppender__Group_2__0 )? ) )
            // InternalMoniLog.g:2099:1: ( ( rule__ExternalAppender__Group_2__0 )? )
            {
            // InternalMoniLog.g:2099:1: ( ( rule__ExternalAppender__Group_2__0 )? )
            // InternalMoniLog.g:2100:2: ( rule__ExternalAppender__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getGroup_2()); 
            }
            // InternalMoniLog.g:2101:2: ( rule__ExternalAppender__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoniLog.g:2101:3: rule__ExternalAppender__Group_2__0
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
    // InternalMoniLog.g:2110:1: rule__ExternalAppender__Group_2__0 : rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1 ;
    public final void rule__ExternalAppender__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2114:1: ( rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1 )
            // InternalMoniLog.g:2115:2: rule__ExternalAppender__Group_2__0__Impl rule__ExternalAppender__Group_2__1
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
    // InternalMoniLog.g:2122:1: rule__ExternalAppender__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExternalAppender__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2126:1: ( ( '(' ) )
            // InternalMoniLog.g:2127:1: ( '(' )
            {
            // InternalMoniLog.g:2127:1: ( '(' )
            // InternalMoniLog.g:2128:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2137:1: rule__ExternalAppender__Group_2__1 : rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2 ;
    public final void rule__ExternalAppender__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2141:1: ( rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2 )
            // InternalMoniLog.g:2142:2: rule__ExternalAppender__Group_2__1__Impl rule__ExternalAppender__Group_2__2
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
    // InternalMoniLog.g:2149:1: rule__ExternalAppender__Group_2__1__Impl : ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) ) ;
    public final void rule__ExternalAppender__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2153:1: ( ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) ) )
            // InternalMoniLog.g:2154:1: ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) )
            {
            // InternalMoniLog.g:2154:1: ( ( rule__ExternalAppender__ParameterDeclAssignment_2_1 ) )
            // InternalMoniLog.g:2155:2: ( rule__ExternalAppender__ParameterDeclAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getParameterDeclAssignment_2_1()); 
            }
            // InternalMoniLog.g:2156:2: ( rule__ExternalAppender__ParameterDeclAssignment_2_1 )
            // InternalMoniLog.g:2156:3: rule__ExternalAppender__ParameterDeclAssignment_2_1
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
    // InternalMoniLog.g:2164:1: rule__ExternalAppender__Group_2__2 : rule__ExternalAppender__Group_2__2__Impl ;
    public final void rule__ExternalAppender__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2168:1: ( rule__ExternalAppender__Group_2__2__Impl )
            // InternalMoniLog.g:2169:2: rule__ExternalAppender__Group_2__2__Impl
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
    // InternalMoniLog.g:2175:1: rule__ExternalAppender__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExternalAppender__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2179:1: ( ( ')' ) )
            // InternalMoniLog.g:2180:1: ( ')' )
            {
            // InternalMoniLog.g:2180:1: ( ')' )
            // InternalMoniLog.g:2181:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalAppenderAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2191:1: rule__LocalLayout__Group__0 : rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1 ;
    public final void rule__LocalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2195:1: ( rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1 )
            // InternalMoniLog.g:2196:2: rule__LocalLayout__Group__0__Impl rule__LocalLayout__Group__1
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
    // InternalMoniLog.g:2203:1: rule__LocalLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__LocalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2207:1: ( ( 'layout' ) )
            // InternalMoniLog.g:2208:1: ( 'layout' )
            {
            // InternalMoniLog.g:2208:1: ( 'layout' )
            // InternalMoniLog.g:2209:2: 'layout'
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
    // InternalMoniLog.g:2218:1: rule__LocalLayout__Group__1 : rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2 ;
    public final void rule__LocalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2222:1: ( rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2 )
            // InternalMoniLog.g:2223:2: rule__LocalLayout__Group__1__Impl rule__LocalLayout__Group__2
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
    // InternalMoniLog.g:2230:1: rule__LocalLayout__Group__1__Impl : ( ( rule__LocalLayout__NameAssignment_1 ) ) ;
    public final void rule__LocalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2234:1: ( ( ( rule__LocalLayout__NameAssignment_1 ) ) )
            // InternalMoniLog.g:2235:1: ( ( rule__LocalLayout__NameAssignment_1 ) )
            {
            // InternalMoniLog.g:2235:1: ( ( rule__LocalLayout__NameAssignment_1 ) )
            // InternalMoniLog.g:2236:2: ( rule__LocalLayout__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog.g:2237:2: ( rule__LocalLayout__NameAssignment_1 )
            // InternalMoniLog.g:2237:3: rule__LocalLayout__NameAssignment_1
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
    // InternalMoniLog.g:2245:1: rule__LocalLayout__Group__2 : rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3 ;
    public final void rule__LocalLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2249:1: ( rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3 )
            // InternalMoniLog.g:2250:2: rule__LocalLayout__Group__2__Impl rule__LocalLayout__Group__3
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
    // InternalMoniLog.g:2257:1: rule__LocalLayout__Group__2__Impl : ( ( rule__LocalLayout__Group_2__0 )? ) ;
    public final void rule__LocalLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2261:1: ( ( ( rule__LocalLayout__Group_2__0 )? ) )
            // InternalMoniLog.g:2262:1: ( ( rule__LocalLayout__Group_2__0 )? )
            {
            // InternalMoniLog.g:2262:1: ( ( rule__LocalLayout__Group_2__0 )? )
            // InternalMoniLog.g:2263:2: ( rule__LocalLayout__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getGroup_2()); 
            }
            // InternalMoniLog.g:2264:2: ( rule__LocalLayout__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoniLog.g:2264:3: rule__LocalLayout__Group_2__0
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
    // InternalMoniLog.g:2272:1: rule__LocalLayout__Group__3 : rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4 ;
    public final void rule__LocalLayout__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2276:1: ( rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4 )
            // InternalMoniLog.g:2277:2: rule__LocalLayout__Group__3__Impl rule__LocalLayout__Group__4
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
    // InternalMoniLog.g:2284:1: rule__LocalLayout__Group__3__Impl : ( '{' ) ;
    public final void rule__LocalLayout__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2288:1: ( ( '{' ) )
            // InternalMoniLog.g:2289:1: ( '{' )
            {
            // InternalMoniLog.g:2289:1: ( '{' )
            // InternalMoniLog.g:2290:2: '{'
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
    // InternalMoniLog.g:2299:1: rule__LocalLayout__Group__4 : rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5 ;
    public final void rule__LocalLayout__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2303:1: ( rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5 )
            // InternalMoniLog.g:2304:2: rule__LocalLayout__Group__4__Impl rule__LocalLayout__Group__5
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
    // InternalMoniLog.g:2311:1: rule__LocalLayout__Group__4__Impl : ( ( rule__LocalLayout__CallAssignment_4 ) ) ;
    public final void rule__LocalLayout__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2315:1: ( ( ( rule__LocalLayout__CallAssignment_4 ) ) )
            // InternalMoniLog.g:2316:1: ( ( rule__LocalLayout__CallAssignment_4 ) )
            {
            // InternalMoniLog.g:2316:1: ( ( rule__LocalLayout__CallAssignment_4 ) )
            // InternalMoniLog.g:2317:2: ( rule__LocalLayout__CallAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getCallAssignment_4()); 
            }
            // InternalMoniLog.g:2318:2: ( rule__LocalLayout__CallAssignment_4 )
            // InternalMoniLog.g:2318:3: rule__LocalLayout__CallAssignment_4
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
    // InternalMoniLog.g:2326:1: rule__LocalLayout__Group__5 : rule__LocalLayout__Group__5__Impl ;
    public final void rule__LocalLayout__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2330:1: ( rule__LocalLayout__Group__5__Impl )
            // InternalMoniLog.g:2331:2: rule__LocalLayout__Group__5__Impl
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
    // InternalMoniLog.g:2337:1: rule__LocalLayout__Group__5__Impl : ( '}' ) ;
    public final void rule__LocalLayout__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2341:1: ( ( '}' ) )
            // InternalMoniLog.g:2342:1: ( '}' )
            {
            // InternalMoniLog.g:2342:1: ( '}' )
            // InternalMoniLog.g:2343:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getRightCurlyBracketKeyword_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2353:1: rule__LocalLayout__Group_2__0 : rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1 ;
    public final void rule__LocalLayout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2357:1: ( rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1 )
            // InternalMoniLog.g:2358:2: rule__LocalLayout__Group_2__0__Impl rule__LocalLayout__Group_2__1
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
    // InternalMoniLog.g:2365:1: rule__LocalLayout__Group_2__0__Impl : ( '(' ) ;
    public final void rule__LocalLayout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2369:1: ( ( '(' ) )
            // InternalMoniLog.g:2370:1: ( '(' )
            {
            // InternalMoniLog.g:2370:1: ( '(' )
            // InternalMoniLog.g:2371:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2380:1: rule__LocalLayout__Group_2__1 : rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2 ;
    public final void rule__LocalLayout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2384:1: ( rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2 )
            // InternalMoniLog.g:2385:2: rule__LocalLayout__Group_2__1__Impl rule__LocalLayout__Group_2__2
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
    // InternalMoniLog.g:2392:1: rule__LocalLayout__Group_2__1__Impl : ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) ) ;
    public final void rule__LocalLayout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2396:1: ( ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) ) )
            // InternalMoniLog.g:2397:1: ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) )
            {
            // InternalMoniLog.g:2397:1: ( ( rule__LocalLayout__ParameterDeclAssignment_2_1 ) )
            // InternalMoniLog.g:2398:2: ( rule__LocalLayout__ParameterDeclAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getParameterDeclAssignment_2_1()); 
            }
            // InternalMoniLog.g:2399:2: ( rule__LocalLayout__ParameterDeclAssignment_2_1 )
            // InternalMoniLog.g:2399:3: rule__LocalLayout__ParameterDeclAssignment_2_1
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
    // InternalMoniLog.g:2407:1: rule__LocalLayout__Group_2__2 : rule__LocalLayout__Group_2__2__Impl ;
    public final void rule__LocalLayout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2411:1: ( rule__LocalLayout__Group_2__2__Impl )
            // InternalMoniLog.g:2412:2: rule__LocalLayout__Group_2__2__Impl
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
    // InternalMoniLog.g:2418:1: rule__LocalLayout__Group_2__2__Impl : ( ')' ) ;
    public final void rule__LocalLayout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2422:1: ( ( ')' ) )
            // InternalMoniLog.g:2423:1: ( ')' )
            {
            // InternalMoniLog.g:2423:1: ( ')' )
            // InternalMoniLog.g:2424:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLocalLayoutAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2434:1: rule__ExternalLayout__Group__0 : rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 ;
    public final void rule__ExternalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2438:1: ( rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 )
            // InternalMoniLog.g:2439:2: rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1
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
    // InternalMoniLog.g:2446:1: rule__ExternalLayout__Group__0__Impl : ( 'layout' ) ;
    public final void rule__ExternalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2450:1: ( ( 'layout' ) )
            // InternalMoniLog.g:2451:1: ( 'layout' )
            {
            // InternalMoniLog.g:2451:1: ( 'layout' )
            // InternalMoniLog.g:2452:2: 'layout'
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
    // InternalMoniLog.g:2461:1: rule__ExternalLayout__Group__1 : rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2 ;
    public final void rule__ExternalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2465:1: ( rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2 )
            // InternalMoniLog.g:2466:2: rule__ExternalLayout__Group__1__Impl rule__ExternalLayout__Group__2
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
    // InternalMoniLog.g:2473:1: rule__ExternalLayout__Group__1__Impl : ( ( rule__ExternalLayout__NameAssignment_1 ) ) ;
    public final void rule__ExternalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2477:1: ( ( ( rule__ExternalLayout__NameAssignment_1 ) ) )
            // InternalMoniLog.g:2478:1: ( ( rule__ExternalLayout__NameAssignment_1 ) )
            {
            // InternalMoniLog.g:2478:1: ( ( rule__ExternalLayout__NameAssignment_1 ) )
            // InternalMoniLog.g:2479:2: ( rule__ExternalLayout__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getNameAssignment_1()); 
            }
            // InternalMoniLog.g:2480:2: ( rule__ExternalLayout__NameAssignment_1 )
            // InternalMoniLog.g:2480:3: rule__ExternalLayout__NameAssignment_1
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
    // InternalMoniLog.g:2488:1: rule__ExternalLayout__Group__2 : rule__ExternalLayout__Group__2__Impl ;
    public final void rule__ExternalLayout__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2492:1: ( rule__ExternalLayout__Group__2__Impl )
            // InternalMoniLog.g:2493:2: rule__ExternalLayout__Group__2__Impl
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
    // InternalMoniLog.g:2499:1: rule__ExternalLayout__Group__2__Impl : ( ( rule__ExternalLayout__Group_2__0 )? ) ;
    public final void rule__ExternalLayout__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2503:1: ( ( ( rule__ExternalLayout__Group_2__0 )? ) )
            // InternalMoniLog.g:2504:1: ( ( rule__ExternalLayout__Group_2__0 )? )
            {
            // InternalMoniLog.g:2504:1: ( ( rule__ExternalLayout__Group_2__0 )? )
            // InternalMoniLog.g:2505:2: ( rule__ExternalLayout__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getGroup_2()); 
            }
            // InternalMoniLog.g:2506:2: ( rule__ExternalLayout__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog.g:2506:3: rule__ExternalLayout__Group_2__0
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
    // InternalMoniLog.g:2515:1: rule__ExternalLayout__Group_2__0 : rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1 ;
    public final void rule__ExternalLayout__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2519:1: ( rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1 )
            // InternalMoniLog.g:2520:2: rule__ExternalLayout__Group_2__0__Impl rule__ExternalLayout__Group_2__1
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
    // InternalMoniLog.g:2527:1: rule__ExternalLayout__Group_2__0__Impl : ( '(' ) ;
    public final void rule__ExternalLayout__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2531:1: ( ( '(' ) )
            // InternalMoniLog.g:2532:1: ( '(' )
            {
            // InternalMoniLog.g:2532:1: ( '(' )
            // InternalMoniLog.g:2533:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getLeftParenthesisKeyword_2_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2542:1: rule__ExternalLayout__Group_2__1 : rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2 ;
    public final void rule__ExternalLayout__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2546:1: ( rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2 )
            // InternalMoniLog.g:2547:2: rule__ExternalLayout__Group_2__1__Impl rule__ExternalLayout__Group_2__2
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
    // InternalMoniLog.g:2554:1: rule__ExternalLayout__Group_2__1__Impl : ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) ) ;
    public final void rule__ExternalLayout__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2558:1: ( ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) ) )
            // InternalMoniLog.g:2559:1: ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) )
            {
            // InternalMoniLog.g:2559:1: ( ( rule__ExternalLayout__ParameterDeclAssignment_2_1 ) )
            // InternalMoniLog.g:2560:2: ( rule__ExternalLayout__ParameterDeclAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getParameterDeclAssignment_2_1()); 
            }
            // InternalMoniLog.g:2561:2: ( rule__ExternalLayout__ParameterDeclAssignment_2_1 )
            // InternalMoniLog.g:2561:3: rule__ExternalLayout__ParameterDeclAssignment_2_1
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
    // InternalMoniLog.g:2569:1: rule__ExternalLayout__Group_2__2 : rule__ExternalLayout__Group_2__2__Impl ;
    public final void rule__ExternalLayout__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2573:1: ( rule__ExternalLayout__Group_2__2__Impl )
            // InternalMoniLog.g:2574:2: rule__ExternalLayout__Group_2__2__Impl
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
    // InternalMoniLog.g:2580:1: rule__ExternalLayout__Group_2__2__Impl : ( ')' ) ;
    public final void rule__ExternalLayout__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2584:1: ( ( ')' ) )
            // InternalMoniLog.g:2585:1: ( ')' )
            {
            // InternalMoniLog.g:2585:1: ( ')' )
            // InternalMoniLog.g:2586:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExternalLayoutAccess().getRightParenthesisKeyword_2_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:2596:1: rule__ParameterDeclVarArgs__Group__0 : rule__ParameterDeclVarArgs__Group__0__Impl rule__ParameterDeclVarArgs__Group__1 ;
    public final void rule__ParameterDeclVarArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2600:1: ( rule__ParameterDeclVarArgs__Group__0__Impl rule__ParameterDeclVarArgs__Group__1 )
            // InternalMoniLog.g:2601:2: rule__ParameterDeclVarArgs__Group__0__Impl rule__ParameterDeclVarArgs__Group__1
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
    // InternalMoniLog.g:2608:1: rule__ParameterDeclVarArgs__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclVarArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2612:1: ( ( () ) )
            // InternalMoniLog.g:2613:1: ( () )
            {
            // InternalMoniLog.g:2613:1: ( () )
            // InternalMoniLog.g:2614:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParameterDeclAction_0()); 
            }
            // InternalMoniLog.g:2615:2: ()
            // InternalMoniLog.g:2615:3: 
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
    // InternalMoniLog.g:2623:1: rule__ParameterDeclVarArgs__Group__1 : rule__ParameterDeclVarArgs__Group__1__Impl ;
    public final void rule__ParameterDeclVarArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2627:1: ( rule__ParameterDeclVarArgs__Group__1__Impl )
            // InternalMoniLog.g:2628:2: rule__ParameterDeclVarArgs__Group__1__Impl
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
    // InternalMoniLog.g:2634:1: rule__ParameterDeclVarArgs__Group__1__Impl : ( ( rule__ParameterDeclVarArgs__Group_1__0 )? ) ;
    public final void rule__ParameterDeclVarArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2638:1: ( ( ( rule__ParameterDeclVarArgs__Group_1__0 )? ) )
            // InternalMoniLog.g:2639:1: ( ( rule__ParameterDeclVarArgs__Group_1__0 )? )
            {
            // InternalMoniLog.g:2639:1: ( ( rule__ParameterDeclVarArgs__Group_1__0 )? )
            // InternalMoniLog.g:2640:2: ( rule__ParameterDeclVarArgs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1()); 
            }
            // InternalMoniLog.g:2641:2: ( rule__ParameterDeclVarArgs__Group_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoniLog.g:2641:3: rule__ParameterDeclVarArgs__Group_1__0
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
    // InternalMoniLog.g:2650:1: rule__ParameterDeclVarArgs__Group_1__0 : rule__ParameterDeclVarArgs__Group_1__0__Impl rule__ParameterDeclVarArgs__Group_1__1 ;
    public final void rule__ParameterDeclVarArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2654:1: ( rule__ParameterDeclVarArgs__Group_1__0__Impl rule__ParameterDeclVarArgs__Group_1__1 )
            // InternalMoniLog.g:2655:2: rule__ParameterDeclVarArgs__Group_1__0__Impl rule__ParameterDeclVarArgs__Group_1__1
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
    // InternalMoniLog.g:2662:1: rule__ParameterDeclVarArgs__Group_1__0__Impl : ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) ) ;
    public final void rule__ParameterDeclVarArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2666:1: ( ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) ) )
            // InternalMoniLog.g:2667:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) )
            {
            // InternalMoniLog.g:2667:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 ) )
            // InternalMoniLog.g:2668:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParametersAssignment_1_0()); 
            }
            // InternalMoniLog.g:2669:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_0 )
            // InternalMoniLog.g:2669:3: rule__ParameterDeclVarArgs__ParametersAssignment_1_0
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
    // InternalMoniLog.g:2677:1: rule__ParameterDeclVarArgs__Group_1__1 : rule__ParameterDeclVarArgs__Group_1__1__Impl rule__ParameterDeclVarArgs__Group_1__2 ;
    public final void rule__ParameterDeclVarArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2681:1: ( rule__ParameterDeclVarArgs__Group_1__1__Impl rule__ParameterDeclVarArgs__Group_1__2 )
            // InternalMoniLog.g:2682:2: rule__ParameterDeclVarArgs__Group_1__1__Impl rule__ParameterDeclVarArgs__Group_1__2
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
    // InternalMoniLog.g:2689:1: rule__ParameterDeclVarArgs__Group_1__1__Impl : ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* ) ;
    public final void rule__ParameterDeclVarArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2693:1: ( ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* ) )
            // InternalMoniLog.g:2694:1: ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* )
            {
            // InternalMoniLog.g:2694:1: ( ( rule__ParameterDeclVarArgs__Group_1_1__0 )* )
            // InternalMoniLog.g:2695:2: ( rule__ParameterDeclVarArgs__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1_1()); 
            }
            // InternalMoniLog.g:2696:2: ( rule__ParameterDeclVarArgs__Group_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==33) ) {
                    int LA25_1 = input.LA(2);

                    if ( (LA25_1==RULE_ID) ) {
                        int LA25_3 = input.LA(3);

                        if ( (LA25_3==EOF||LA25_3==31||LA25_3==33) ) {
                            alt25=1;
                        }


                    }


                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoniLog.g:2696:3: rule__ParameterDeclVarArgs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ParameterDeclVarArgs__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
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
    // InternalMoniLog.g:2704:1: rule__ParameterDeclVarArgs__Group_1__2 : rule__ParameterDeclVarArgs__Group_1__2__Impl ;
    public final void rule__ParameterDeclVarArgs__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2708:1: ( rule__ParameterDeclVarArgs__Group_1__2__Impl )
            // InternalMoniLog.g:2709:2: rule__ParameterDeclVarArgs__Group_1__2__Impl
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
    // InternalMoniLog.g:2715:1: rule__ParameterDeclVarArgs__Group_1__2__Impl : ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? ) ;
    public final void rule__ParameterDeclVarArgs__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2719:1: ( ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? ) )
            // InternalMoniLog.g:2720:1: ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? )
            {
            // InternalMoniLog.g:2720:1: ( ( rule__ParameterDeclVarArgs__Group_1_2__0 )? )
            // InternalMoniLog.g:2721:2: ( rule__ParameterDeclVarArgs__Group_1_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getGroup_1_2()); 
            }
            // InternalMoniLog.g:2722:2: ( rule__ParameterDeclVarArgs__Group_1_2__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==33) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMoniLog.g:2722:3: rule__ParameterDeclVarArgs__Group_1_2__0
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
    // InternalMoniLog.g:2731:1: rule__ParameterDeclVarArgs__Group_1_1__0 : rule__ParameterDeclVarArgs__Group_1_1__0__Impl rule__ParameterDeclVarArgs__Group_1_1__1 ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2735:1: ( rule__ParameterDeclVarArgs__Group_1_1__0__Impl rule__ParameterDeclVarArgs__Group_1_1__1 )
            // InternalMoniLog.g:2736:2: rule__ParameterDeclVarArgs__Group_1_1__0__Impl rule__ParameterDeclVarArgs__Group_1_1__1
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
    // InternalMoniLog.g:2743:1: rule__ParameterDeclVarArgs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2747:1: ( ( ',' ) )
            // InternalMoniLog.g:2748:1: ( ',' )
            {
            // InternalMoniLog.g:2748:1: ( ',' )
            // InternalMoniLog.g:2749:2: ','
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
    // InternalMoniLog.g:2758:1: rule__ParameterDeclVarArgs__Group_1_1__1 : rule__ParameterDeclVarArgs__Group_1_1__1__Impl ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2762:1: ( rule__ParameterDeclVarArgs__Group_1_1__1__Impl )
            // InternalMoniLog.g:2763:2: rule__ParameterDeclVarArgs__Group_1_1__1__Impl
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
    // InternalMoniLog.g:2769:1: rule__ParameterDeclVarArgs__Group_1_1__1__Impl : ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2773:1: ( ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) ) )
            // InternalMoniLog.g:2774:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) )
            {
            // InternalMoniLog.g:2774:1: ( ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 ) )
            // InternalMoniLog.g:2775:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getParametersAssignment_1_1_1()); 
            }
            // InternalMoniLog.g:2776:2: ( rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 )
            // InternalMoniLog.g:2776:3: rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1
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
    // InternalMoniLog.g:2785:1: rule__ParameterDeclVarArgs__Group_1_2__0 : rule__ParameterDeclVarArgs__Group_1_2__0__Impl rule__ParameterDeclVarArgs__Group_1_2__1 ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2789:1: ( rule__ParameterDeclVarArgs__Group_1_2__0__Impl rule__ParameterDeclVarArgs__Group_1_2__1 )
            // InternalMoniLog.g:2790:2: rule__ParameterDeclVarArgs__Group_1_2__0__Impl rule__ParameterDeclVarArgs__Group_1_2__1
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
    // InternalMoniLog.g:2797:1: rule__ParameterDeclVarArgs__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2801:1: ( ( ',' ) )
            // InternalMoniLog.g:2802:1: ( ',' )
            {
            // InternalMoniLog.g:2802:1: ( ',' )
            // InternalMoniLog.g:2803:2: ','
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
    // InternalMoniLog.g:2812:1: rule__ParameterDeclVarArgs__Group_1_2__1 : rule__ParameterDeclVarArgs__Group_1_2__1__Impl rule__ParameterDeclVarArgs__Group_1_2__2 ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2816:1: ( rule__ParameterDeclVarArgs__Group_1_2__1__Impl rule__ParameterDeclVarArgs__Group_1_2__2 )
            // InternalMoniLog.g:2817:2: rule__ParameterDeclVarArgs__Group_1_2__1__Impl rule__ParameterDeclVarArgs__Group_1_2__2
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
    // InternalMoniLog.g:2824:1: rule__ParameterDeclVarArgs__Group_1_2__1__Impl : ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2828:1: ( ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) ) )
            // InternalMoniLog.g:2829:1: ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) )
            {
            // InternalMoniLog.g:2829:1: ( ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 ) )
            // InternalMoniLog.g:2830:2: ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclVarArgsAccess().getVarArgsAssignment_1_2_1()); 
            }
            // InternalMoniLog.g:2831:2: ( rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 )
            // InternalMoniLog.g:2831:3: rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1
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
    // InternalMoniLog.g:2839:1: rule__ParameterDeclVarArgs__Group_1_2__2 : rule__ParameterDeclVarArgs__Group_1_2__2__Impl ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2843:1: ( rule__ParameterDeclVarArgs__Group_1_2__2__Impl )
            // InternalMoniLog.g:2844:2: rule__ParameterDeclVarArgs__Group_1_2__2__Impl
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
    // InternalMoniLog.g:2850:1: rule__ParameterDeclVarArgs__Group_1_2__2__Impl : ( '...' ) ;
    public final void rule__ParameterDeclVarArgs__Group_1_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2854:1: ( ( '...' ) )
            // InternalMoniLog.g:2855:1: ( '...' )
            {
            // InternalMoniLog.g:2855:1: ( '...' )
            // InternalMoniLog.g:2856:2: '...'
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
    // InternalMoniLog.g:2866:1: rule__ParameterDeclNoVarArgs__Group__0 : rule__ParameterDeclNoVarArgs__Group__0__Impl rule__ParameterDeclNoVarArgs__Group__1 ;
    public final void rule__ParameterDeclNoVarArgs__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2870:1: ( rule__ParameterDeclNoVarArgs__Group__0__Impl rule__ParameterDeclNoVarArgs__Group__1 )
            // InternalMoniLog.g:2871:2: rule__ParameterDeclNoVarArgs__Group__0__Impl rule__ParameterDeclNoVarArgs__Group__1
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
    // InternalMoniLog.g:2878:1: rule__ParameterDeclNoVarArgs__Group__0__Impl : ( () ) ;
    public final void rule__ParameterDeclNoVarArgs__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2882:1: ( ( () ) )
            // InternalMoniLog.g:2883:1: ( () )
            {
            // InternalMoniLog.g:2883:1: ( () )
            // InternalMoniLog.g:2884:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParameterDeclAction_0()); 
            }
            // InternalMoniLog.g:2885:2: ()
            // InternalMoniLog.g:2885:3: 
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
    // InternalMoniLog.g:2893:1: rule__ParameterDeclNoVarArgs__Group__1 : rule__ParameterDeclNoVarArgs__Group__1__Impl ;
    public final void rule__ParameterDeclNoVarArgs__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2897:1: ( rule__ParameterDeclNoVarArgs__Group__1__Impl )
            // InternalMoniLog.g:2898:2: rule__ParameterDeclNoVarArgs__Group__1__Impl
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
    // InternalMoniLog.g:2904:1: rule__ParameterDeclNoVarArgs__Group__1__Impl : ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? ) ;
    public final void rule__ParameterDeclNoVarArgs__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2908:1: ( ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? ) )
            // InternalMoniLog.g:2909:1: ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? )
            {
            // InternalMoniLog.g:2909:1: ( ( rule__ParameterDeclNoVarArgs__Group_1__0 )? )
            // InternalMoniLog.g:2910:2: ( rule__ParameterDeclNoVarArgs__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup_1()); 
            }
            // InternalMoniLog.g:2911:2: ( rule__ParameterDeclNoVarArgs__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_ID) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMoniLog.g:2911:3: rule__ParameterDeclNoVarArgs__Group_1__0
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
    // InternalMoniLog.g:2920:1: rule__ParameterDeclNoVarArgs__Group_1__0 : rule__ParameterDeclNoVarArgs__Group_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1__1 ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2924:1: ( rule__ParameterDeclNoVarArgs__Group_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1__1 )
            // InternalMoniLog.g:2925:2: rule__ParameterDeclNoVarArgs__Group_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1__1
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
    // InternalMoniLog.g:2932:1: rule__ParameterDeclNoVarArgs__Group_1__0__Impl : ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2936:1: ( ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) ) )
            // InternalMoniLog.g:2937:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) )
            {
            // InternalMoniLog.g:2937:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 ) )
            // InternalMoniLog.g:2938:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersAssignment_1_0()); 
            }
            // InternalMoniLog.g:2939:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 )
            // InternalMoniLog.g:2939:3: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0
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
    // InternalMoniLog.g:2947:1: rule__ParameterDeclNoVarArgs__Group_1__1 : rule__ParameterDeclNoVarArgs__Group_1__1__Impl ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2951:1: ( rule__ParameterDeclNoVarArgs__Group_1__1__Impl )
            // InternalMoniLog.g:2952:2: rule__ParameterDeclNoVarArgs__Group_1__1__Impl
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
    // InternalMoniLog.g:2958:1: rule__ParameterDeclNoVarArgs__Group_1__1__Impl : ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2962:1: ( ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* ) )
            // InternalMoniLog.g:2963:1: ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* )
            {
            // InternalMoniLog.g:2963:1: ( ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )* )
            // InternalMoniLog.g:2964:2: ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getGroup_1_1()); 
            }
            // InternalMoniLog.g:2965:2: ( rule__ParameterDeclNoVarArgs__Group_1_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==33) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoniLog.g:2965:3: rule__ParameterDeclNoVarArgs__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__ParameterDeclNoVarArgs__Group_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // InternalMoniLog.g:2974:1: rule__ParameterDeclNoVarArgs__Group_1_1__0 : rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1_1__1 ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2978:1: ( rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1_1__1 )
            // InternalMoniLog.g:2979:2: rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl rule__ParameterDeclNoVarArgs__Group_1_1__1
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
    // InternalMoniLog.g:2986:1: rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:2990:1: ( ( ',' ) )
            // InternalMoniLog.g:2991:1: ( ',' )
            {
            // InternalMoniLog.g:2991:1: ( ',' )
            // InternalMoniLog.g:2992:2: ','
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
    // InternalMoniLog.g:3001:1: rule__ParameterDeclNoVarArgs__Group_1_1__1 : rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3005:1: ( rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl )
            // InternalMoniLog.g:3006:2: rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl
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
    // InternalMoniLog.g:3012:1: rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl : ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) ) ;
    public final void rule__ParameterDeclNoVarArgs__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3016:1: ( ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) ) )
            // InternalMoniLog.g:3017:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) )
            {
            // InternalMoniLog.g:3017:1: ( ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 ) )
            // InternalMoniLog.g:3018:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterDeclNoVarArgsAccess().getParametersAssignment_1_1_1()); 
            }
            // InternalMoniLog.g:3019:2: ( rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 )
            // InternalMoniLog.g:3019:3: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1
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
    // InternalMoniLog.g:3028:1: rule__MoniLogger__Group__0 : rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1 ;
    public final void rule__MoniLogger__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3032:1: ( rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1 )
            // InternalMoniLog.g:3033:2: rule__MoniLogger__Group__0__Impl rule__MoniLogger__Group__1
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
    // InternalMoniLog.g:3040:1: rule__MoniLogger__Group__0__Impl : ( ( rule__MoniLogger__AnnotationsAssignment_0 )* ) ;
    public final void rule__MoniLogger__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3044:1: ( ( ( rule__MoniLogger__AnnotationsAssignment_0 )* ) )
            // InternalMoniLog.g:3045:1: ( ( rule__MoniLogger__AnnotationsAssignment_0 )* )
            {
            // InternalMoniLog.g:3045:1: ( ( rule__MoniLogger__AnnotationsAssignment_0 )* )
            // InternalMoniLog.g:3046:2: ( rule__MoniLogger__AnnotationsAssignment_0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getAnnotationsAssignment_0()); 
            }
            // InternalMoniLog.g:3047:2: ( rule__MoniLogger__AnnotationsAssignment_0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==11) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalMoniLog.g:3047:3: rule__MoniLogger__AnnotationsAssignment_0
            	    {
            	    pushFollow(FOLLOW_18);
            	    rule__MoniLogger__AnnotationsAssignment_0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
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
    // InternalMoniLog.g:3055:1: rule__MoniLogger__Group__1 : rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2 ;
    public final void rule__MoniLogger__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3059:1: ( rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2 )
            // InternalMoniLog.g:3060:2: rule__MoniLogger__Group__1__Impl rule__MoniLogger__Group__2
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
    // InternalMoniLog.g:3067:1: rule__MoniLogger__Group__1__Impl : ( 'monilogger' ) ;
    public final void rule__MoniLogger__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3071:1: ( ( 'monilogger' ) )
            // InternalMoniLog.g:3072:1: ( 'monilogger' )
            {
            // InternalMoniLog.g:3072:1: ( 'monilogger' )
            // InternalMoniLog.g:3073:2: 'monilogger'
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
    // InternalMoniLog.g:3082:1: rule__MoniLogger__Group__2 : rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3 ;
    public final void rule__MoniLogger__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3086:1: ( rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3 )
            // InternalMoniLog.g:3087:2: rule__MoniLogger__Group__2__Impl rule__MoniLogger__Group__3
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
    // InternalMoniLog.g:3094:1: rule__MoniLogger__Group__2__Impl : ( ( rule__MoniLogger__NameAssignment_2 ) ) ;
    public final void rule__MoniLogger__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3098:1: ( ( ( rule__MoniLogger__NameAssignment_2 ) ) )
            // InternalMoniLog.g:3099:1: ( ( rule__MoniLogger__NameAssignment_2 ) )
            {
            // InternalMoniLog.g:3099:1: ( ( rule__MoniLogger__NameAssignment_2 ) )
            // InternalMoniLog.g:3100:2: ( rule__MoniLogger__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getNameAssignment_2()); 
            }
            // InternalMoniLog.g:3101:2: ( rule__MoniLogger__NameAssignment_2 )
            // InternalMoniLog.g:3101:3: rule__MoniLogger__NameAssignment_2
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
    // InternalMoniLog.g:3109:1: rule__MoniLogger__Group__3 : rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4 ;
    public final void rule__MoniLogger__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3113:1: ( rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4 )
            // InternalMoniLog.g:3114:2: rule__MoniLogger__Group__3__Impl rule__MoniLogger__Group__4
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
    // InternalMoniLog.g:3121:1: rule__MoniLogger__Group__3__Impl : ( ( rule__MoniLogger__Group_3__0 )? ) ;
    public final void rule__MoniLogger__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3125:1: ( ( ( rule__MoniLogger__Group_3__0 )? ) )
            // InternalMoniLog.g:3126:1: ( ( rule__MoniLogger__Group_3__0 )? )
            {
            // InternalMoniLog.g:3126:1: ( ( rule__MoniLogger__Group_3__0 )? )
            // InternalMoniLog.g:3127:2: ( rule__MoniLogger__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_3()); 
            }
            // InternalMoniLog.g:3128:2: ( rule__MoniLogger__Group_3__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==30) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoniLog.g:3128:3: rule__MoniLogger__Group_3__0
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
    // InternalMoniLog.g:3136:1: rule__MoniLogger__Group__4 : rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5 ;
    public final void rule__MoniLogger__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3140:1: ( rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5 )
            // InternalMoniLog.g:3141:2: rule__MoniLogger__Group__4__Impl rule__MoniLogger__Group__5
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
    // InternalMoniLog.g:3148:1: rule__MoniLogger__Group__4__Impl : ( ( rule__MoniLogger__Group_4__0 )? ) ;
    public final void rule__MoniLogger__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3152:1: ( ( ( rule__MoniLogger__Group_4__0 )? ) )
            // InternalMoniLog.g:3153:1: ( ( rule__MoniLogger__Group_4__0 )? )
            {
            // InternalMoniLog.g:3153:1: ( ( rule__MoniLogger__Group_4__0 )? )
            // InternalMoniLog.g:3154:2: ( rule__MoniLogger__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_4()); 
            }
            // InternalMoniLog.g:3155:2: ( rule__MoniLogger__Group_4__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==38) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoniLog.g:3155:3: rule__MoniLogger__Group_4__0
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
    // InternalMoniLog.g:3163:1: rule__MoniLogger__Group__5 : rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6 ;
    public final void rule__MoniLogger__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3167:1: ( rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6 )
            // InternalMoniLog.g:3168:2: rule__MoniLogger__Group__5__Impl rule__MoniLogger__Group__6
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
    // InternalMoniLog.g:3175:1: rule__MoniLogger__Group__5__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3179:1: ( ( '{' ) )
            // InternalMoniLog.g:3180:1: ( '{' )
            {
            // InternalMoniLog.g:3180:1: ( '{' )
            // InternalMoniLog.g:3181:2: '{'
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
    // InternalMoniLog.g:3190:1: rule__MoniLogger__Group__6 : rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7 ;
    public final void rule__MoniLogger__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3194:1: ( rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7 )
            // InternalMoniLog.g:3195:2: rule__MoniLogger__Group__6__Impl rule__MoniLogger__Group__7
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
    // InternalMoniLog.g:3202:1: rule__MoniLogger__Group__6__Impl : ( 'event' ) ;
    public final void rule__MoniLogger__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3206:1: ( ( 'event' ) )
            // InternalMoniLog.g:3207:1: ( 'event' )
            {
            // InternalMoniLog.g:3207:1: ( 'event' )
            // InternalMoniLog.g:3208:2: 'event'
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
    // InternalMoniLog.g:3217:1: rule__MoniLogger__Group__7 : rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8 ;
    public final void rule__MoniLogger__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3221:1: ( rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8 )
            // InternalMoniLog.g:3222:2: rule__MoniLogger__Group__7__Impl rule__MoniLogger__Group__8
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
    // InternalMoniLog.g:3229:1: rule__MoniLogger__Group__7__Impl : ( ( rule__MoniLogger__StreamEventAssignment_7 ) ) ;
    public final void rule__MoniLogger__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3233:1: ( ( ( rule__MoniLogger__StreamEventAssignment_7 ) ) )
            // InternalMoniLog.g:3234:1: ( ( rule__MoniLogger__StreamEventAssignment_7 ) )
            {
            // InternalMoniLog.g:3234:1: ( ( rule__MoniLogger__StreamEventAssignment_7 ) )
            // InternalMoniLog.g:3235:2: ( rule__MoniLogger__StreamEventAssignment_7 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getStreamEventAssignment_7()); 
            }
            // InternalMoniLog.g:3236:2: ( rule__MoniLogger__StreamEventAssignment_7 )
            // InternalMoniLog.g:3236:3: rule__MoniLogger__StreamEventAssignment_7
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
    // InternalMoniLog.g:3244:1: rule__MoniLogger__Group__8 : rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9 ;
    public final void rule__MoniLogger__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3248:1: ( rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9 )
            // InternalMoniLog.g:3249:2: rule__MoniLogger__Group__8__Impl rule__MoniLogger__Group__9
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
    // InternalMoniLog.g:3256:1: rule__MoniLogger__Group__8__Impl : ( ( rule__MoniLogger__Group_8__0 )? ) ;
    public final void rule__MoniLogger__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3260:1: ( ( ( rule__MoniLogger__Group_8__0 )? ) )
            // InternalMoniLog.g:3261:1: ( ( rule__MoniLogger__Group_8__0 )? )
            {
            // InternalMoniLog.g:3261:1: ( ( rule__MoniLogger__Group_8__0 )? )
            // InternalMoniLog.g:3262:2: ( rule__MoniLogger__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_8()); 
            }
            // InternalMoniLog.g:3263:2: ( rule__MoniLogger__Group_8__0 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==40) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMoniLog.g:3263:3: rule__MoniLogger__Group_8__0
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
    // InternalMoniLog.g:3271:1: rule__MoniLogger__Group__9 : rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10 ;
    public final void rule__MoniLogger__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3275:1: ( rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10 )
            // InternalMoniLog.g:3276:2: rule__MoniLogger__Group__9__Impl rule__MoniLogger__Group__10
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
    // InternalMoniLog.g:3283:1: rule__MoniLogger__Group__9__Impl : ( 'actions' ) ;
    public final void rule__MoniLogger__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3287:1: ( ( 'actions' ) )
            // InternalMoniLog.g:3288:1: ( 'actions' )
            {
            // InternalMoniLog.g:3288:1: ( 'actions' )
            // InternalMoniLog.g:3289:2: 'actions'
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
    // InternalMoniLog.g:3298:1: rule__MoniLogger__Group__10 : rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11 ;
    public final void rule__MoniLogger__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3302:1: ( rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11 )
            // InternalMoniLog.g:3303:2: rule__MoniLogger__Group__10__Impl rule__MoniLogger__Group__11
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
    // InternalMoniLog.g:3310:1: rule__MoniLogger__Group__10__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3314:1: ( ( '{' ) )
            // InternalMoniLog.g:3315:1: ( '{' )
            {
            // InternalMoniLog.g:3315:1: ( '{' )
            // InternalMoniLog.g:3316:2: '{'
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
    // InternalMoniLog.g:3325:1: rule__MoniLogger__Group__11 : rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12 ;
    public final void rule__MoniLogger__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3329:1: ( rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12 )
            // InternalMoniLog.g:3330:2: rule__MoniLogger__Group__11__Impl rule__MoniLogger__Group__12
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
    // InternalMoniLog.g:3337:1: rule__MoniLogger__Group__11__Impl : ( ( rule__MoniLogger__ActionsAssignment_11 ) ) ;
    public final void rule__MoniLogger__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3341:1: ( ( ( rule__MoniLogger__ActionsAssignment_11 ) ) )
            // InternalMoniLog.g:3342:1: ( ( rule__MoniLogger__ActionsAssignment_11 ) )
            {
            // InternalMoniLog.g:3342:1: ( ( rule__MoniLogger__ActionsAssignment_11 ) )
            // InternalMoniLog.g:3343:2: ( rule__MoniLogger__ActionsAssignment_11 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsAssignment_11()); 
            }
            // InternalMoniLog.g:3344:2: ( rule__MoniLogger__ActionsAssignment_11 )
            // InternalMoniLog.g:3344:3: rule__MoniLogger__ActionsAssignment_11
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
    // InternalMoniLog.g:3352:1: rule__MoniLogger__Group__12 : rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13 ;
    public final void rule__MoniLogger__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3356:1: ( rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13 )
            // InternalMoniLog.g:3357:2: rule__MoniLogger__Group__12__Impl rule__MoniLogger__Group__13
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
    // InternalMoniLog.g:3364:1: rule__MoniLogger__Group__12__Impl : ( ( rule__MoniLogger__Group_12__0 )* ) ;
    public final void rule__MoniLogger__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3368:1: ( ( ( rule__MoniLogger__Group_12__0 )* ) )
            // InternalMoniLog.g:3369:1: ( ( rule__MoniLogger__Group_12__0 )* )
            {
            // InternalMoniLog.g:3369:1: ( ( rule__MoniLogger__Group_12__0 )* )
            // InternalMoniLog.g:3370:2: ( rule__MoniLogger__Group_12__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_12()); 
            }
            // InternalMoniLog.g:3371:2: ( rule__MoniLogger__Group_12__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==28) ) {
                    int LA33_1 = input.LA(2);

                    if ( (LA33_1==RULE_ID||LA33_1==59) ) {
                        alt33=1;
                    }


                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoniLog.g:3371:3: rule__MoniLogger__Group_12__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MoniLogger__Group_12__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalMoniLog.g:3379:1: rule__MoniLogger__Group__13 : rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14 ;
    public final void rule__MoniLogger__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3383:1: ( rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14 )
            // InternalMoniLog.g:3384:2: rule__MoniLogger__Group__13__Impl rule__MoniLogger__Group__14
            {
            pushFollow(FOLLOW_9);
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
    // InternalMoniLog.g:3391:1: rule__MoniLogger__Group__13__Impl : ( ( ';' )? ) ;
    public final void rule__MoniLogger__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3395:1: ( ( ( ';' )? ) )
            // InternalMoniLog.g:3396:1: ( ( ';' )? )
            {
            // InternalMoniLog.g:3396:1: ( ( ';' )? )
            // InternalMoniLog.g:3397:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_13()); 
            }
            // InternalMoniLog.g:3398:2: ( ';' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==28) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoniLog.g:3398:3: ';'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_13()); 
            }

            }


            }

        }
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
    // InternalMoniLog.g:3406:1: rule__MoniLogger__Group__14 : rule__MoniLogger__Group__14__Impl rule__MoniLogger__Group__15 ;
    public final void rule__MoniLogger__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3410:1: ( rule__MoniLogger__Group__14__Impl rule__MoniLogger__Group__15 )
            // InternalMoniLog.g:3411:2: rule__MoniLogger__Group__14__Impl rule__MoniLogger__Group__15
            {
            pushFollow(FOLLOW_13);
            rule__MoniLogger__Group__14__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__15();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMoniLog.g:3418:1: rule__MoniLogger__Group__14__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3422:1: ( ( '}' ) )
            // InternalMoniLog.g:3423:1: ( '}' )
            {
            // InternalMoniLog.g:3423:1: ( '}' )
            // InternalMoniLog.g:3424:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_14()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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


    // $ANTLR start "rule__MoniLogger__Group__15"
    // InternalMoniLog.g:3433:1: rule__MoniLogger__Group__15 : rule__MoniLogger__Group__15__Impl ;
    public final void rule__MoniLogger__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3437:1: ( rule__MoniLogger__Group__15__Impl )
            // InternalMoniLog.g:3438:2: rule__MoniLogger__Group__15__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group__15__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__15"


    // $ANTLR start "rule__MoniLogger__Group__15__Impl"
    // InternalMoniLog.g:3444:1: rule__MoniLogger__Group__15__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3448:1: ( ( '}' ) )
            // InternalMoniLog.g:3449:1: ( '}' )
            {
            // InternalMoniLog.g:3449:1: ( '}' )
            // InternalMoniLog.g:3450:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_15()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_15()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group__15__Impl"


    // $ANTLR start "rule__MoniLogger__Group_3__0"
    // InternalMoniLog.g:3460:1: rule__MoniLogger__Group_3__0 : rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1 ;
    public final void rule__MoniLogger__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3464:1: ( rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1 )
            // InternalMoniLog.g:3465:2: rule__MoniLogger__Group_3__0__Impl rule__MoniLogger__Group_3__1
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
    // InternalMoniLog.g:3472:1: rule__MoniLogger__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MoniLogger__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3476:1: ( ( '(' ) )
            // InternalMoniLog.g:3477:1: ( '(' )
            {
            // InternalMoniLog.g:3477:1: ( '(' )
            // InternalMoniLog.g:3478:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:3487:1: rule__MoniLogger__Group_3__1 : rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2 ;
    public final void rule__MoniLogger__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3491:1: ( rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2 )
            // InternalMoniLog.g:3492:2: rule__MoniLogger__Group_3__1__Impl rule__MoniLogger__Group_3__2
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
    // InternalMoniLog.g:3499:1: rule__MoniLogger__Group_3__1__Impl : ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) ) ;
    public final void rule__MoniLogger__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3503:1: ( ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) ) )
            // InternalMoniLog.g:3504:1: ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) )
            {
            // InternalMoniLog.g:3504:1: ( ( rule__MoniLogger__ParameterDeclAssignment_3_1 ) )
            // InternalMoniLog.g:3505:2: ( rule__MoniLogger__ParameterDeclAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getParameterDeclAssignment_3_1()); 
            }
            // InternalMoniLog.g:3506:2: ( rule__MoniLogger__ParameterDeclAssignment_3_1 )
            // InternalMoniLog.g:3506:3: rule__MoniLogger__ParameterDeclAssignment_3_1
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
    // InternalMoniLog.g:3514:1: rule__MoniLogger__Group_3__2 : rule__MoniLogger__Group_3__2__Impl ;
    public final void rule__MoniLogger__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3518:1: ( rule__MoniLogger__Group_3__2__Impl )
            // InternalMoniLog.g:3519:2: rule__MoniLogger__Group_3__2__Impl
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
    // InternalMoniLog.g:3525:1: rule__MoniLogger__Group_3__2__Impl : ( ')' ) ;
    public final void rule__MoniLogger__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3529:1: ( ( ')' ) )
            // InternalMoniLog.g:3530:1: ( ')' )
            {
            // InternalMoniLog.g:3530:1: ( ')' )
            // InternalMoniLog.g:3531:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:3541:1: rule__MoniLogger__Group_4__0 : rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1 ;
    public final void rule__MoniLogger__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3545:1: ( rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1 )
            // InternalMoniLog.g:3546:2: rule__MoniLogger__Group_4__0__Impl rule__MoniLogger__Group_4__1
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
    // InternalMoniLog.g:3553:1: rule__MoniLogger__Group_4__0__Impl : ( '[' ) ;
    public final void rule__MoniLogger__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3557:1: ( ( '[' ) )
            // InternalMoniLog.g:3558:1: ( '[' )
            {
            // InternalMoniLog.g:3558:1: ( '[' )
            // InternalMoniLog.g:3559:2: '['
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
    // InternalMoniLog.g:3568:1: rule__MoniLogger__Group_4__1 : rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2 ;
    public final void rule__MoniLogger__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3572:1: ( rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2 )
            // InternalMoniLog.g:3573:2: rule__MoniLogger__Group_4__1__Impl rule__MoniLogger__Group_4__2
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
    // InternalMoniLog.g:3580:1: rule__MoniLogger__Group_4__1__Impl : ( ( rule__MoniLogger__LevelAssignment_4_1 ) ) ;
    public final void rule__MoniLogger__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3584:1: ( ( ( rule__MoniLogger__LevelAssignment_4_1 ) ) )
            // InternalMoniLog.g:3585:1: ( ( rule__MoniLogger__LevelAssignment_4_1 ) )
            {
            // InternalMoniLog.g:3585:1: ( ( rule__MoniLogger__LevelAssignment_4_1 ) )
            // InternalMoniLog.g:3586:2: ( rule__MoniLogger__LevelAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getLevelAssignment_4_1()); 
            }
            // InternalMoniLog.g:3587:2: ( rule__MoniLogger__LevelAssignment_4_1 )
            // InternalMoniLog.g:3587:3: rule__MoniLogger__LevelAssignment_4_1
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
    // InternalMoniLog.g:3595:1: rule__MoniLogger__Group_4__2 : rule__MoniLogger__Group_4__2__Impl ;
    public final void rule__MoniLogger__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3599:1: ( rule__MoniLogger__Group_4__2__Impl )
            // InternalMoniLog.g:3600:2: rule__MoniLogger__Group_4__2__Impl
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
    // InternalMoniLog.g:3606:1: rule__MoniLogger__Group_4__2__Impl : ( ']' ) ;
    public final void rule__MoniLogger__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3610:1: ( ( ']' ) )
            // InternalMoniLog.g:3611:1: ( ']' )
            {
            // InternalMoniLog.g:3611:1: ( ']' )
            // InternalMoniLog.g:3612:2: ']'
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
    // InternalMoniLog.g:3622:1: rule__MoniLogger__Group_8__0 : rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1 ;
    public final void rule__MoniLogger__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3626:1: ( rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1 )
            // InternalMoniLog.g:3627:2: rule__MoniLogger__Group_8__0__Impl rule__MoniLogger__Group_8__1
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
    // InternalMoniLog.g:3634:1: rule__MoniLogger__Group_8__0__Impl : ( 'conditions' ) ;
    public final void rule__MoniLogger__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3638:1: ( ( 'conditions' ) )
            // InternalMoniLog.g:3639:1: ( 'conditions' )
            {
            // InternalMoniLog.g:3639:1: ( 'conditions' )
            // InternalMoniLog.g:3640:2: 'conditions'
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
    // InternalMoniLog.g:3649:1: rule__MoniLogger__Group_8__1 : rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2 ;
    public final void rule__MoniLogger__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3653:1: ( rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2 )
            // InternalMoniLog.g:3654:2: rule__MoniLogger__Group_8__1__Impl rule__MoniLogger__Group_8__2
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
    // InternalMoniLog.g:3661:1: rule__MoniLogger__Group_8__1__Impl : ( '{' ) ;
    public final void rule__MoniLogger__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3665:1: ( ( '{' ) )
            // InternalMoniLog.g:3666:1: ( '{' )
            {
            // InternalMoniLog.g:3666:1: ( '{' )
            // InternalMoniLog.g:3667:2: '{'
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
    // InternalMoniLog.g:3676:1: rule__MoniLogger__Group_8__2 : rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3 ;
    public final void rule__MoniLogger__Group_8__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3680:1: ( rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3 )
            // InternalMoniLog.g:3681:2: rule__MoniLogger__Group_8__2__Impl rule__MoniLogger__Group_8__3
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
    // InternalMoniLog.g:3688:1: rule__MoniLogger__Group_8__2__Impl : ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) ) ;
    public final void rule__MoniLogger__Group_8__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3692:1: ( ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) ) )
            // InternalMoniLog.g:3693:1: ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) )
            {
            // InternalMoniLog.g:3693:1: ( ( rule__MoniLogger__ConditionsAssignment_8_2 ) )
            // InternalMoniLog.g:3694:2: ( rule__MoniLogger__ConditionsAssignment_8_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_2()); 
            }
            // InternalMoniLog.g:3695:2: ( rule__MoniLogger__ConditionsAssignment_8_2 )
            // InternalMoniLog.g:3695:3: rule__MoniLogger__ConditionsAssignment_8_2
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
    // InternalMoniLog.g:3703:1: rule__MoniLogger__Group_8__3 : rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4 ;
    public final void rule__MoniLogger__Group_8__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3707:1: ( rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4 )
            // InternalMoniLog.g:3708:2: rule__MoniLogger__Group_8__3__Impl rule__MoniLogger__Group_8__4
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
    // InternalMoniLog.g:3715:1: rule__MoniLogger__Group_8__3__Impl : ( ( rule__MoniLogger__Group_8_3__0 )* ) ;
    public final void rule__MoniLogger__Group_8__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3719:1: ( ( ( rule__MoniLogger__Group_8_3__0 )* ) )
            // InternalMoniLog.g:3720:1: ( ( rule__MoniLogger__Group_8_3__0 )* )
            {
            // InternalMoniLog.g:3720:1: ( ( rule__MoniLogger__Group_8_3__0 )* )
            // InternalMoniLog.g:3721:2: ( rule__MoniLogger__Group_8_3__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getGroup_8_3()); 
            }
            // InternalMoniLog.g:3722:2: ( rule__MoniLogger__Group_8_3__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==28) ) {
                    int LA35_1 = input.LA(2);

                    if ( (LA35_1==RULE_ID) ) {
                        alt35=1;
                    }


                }


                switch (alt35) {
            	case 1 :
            	    // InternalMoniLog.g:3722:3: rule__MoniLogger__Group_8_3__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__MoniLogger__Group_8_3__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalMoniLog.g:3730:1: rule__MoniLogger__Group_8__4 : rule__MoniLogger__Group_8__4__Impl rule__MoniLogger__Group_8__5 ;
    public final void rule__MoniLogger__Group_8__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3734:1: ( rule__MoniLogger__Group_8__4__Impl rule__MoniLogger__Group_8__5 )
            // InternalMoniLog.g:3735:2: rule__MoniLogger__Group_8__4__Impl rule__MoniLogger__Group_8__5
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogger__Group_8__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
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
    // InternalMoniLog.g:3742:1: rule__MoniLogger__Group_8__4__Impl : ( ( ';' )? ) ;
    public final void rule__MoniLogger__Group_8__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3746:1: ( ( ( ';' )? ) )
            // InternalMoniLog.g:3747:1: ( ( ';' )? )
            {
            // InternalMoniLog.g:3747:1: ( ( ';' )? )
            // InternalMoniLog.g:3748:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_4()); 
            }
            // InternalMoniLog.g:3749:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==28) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoniLog.g:3749:3: ';'
                    {
                    match(input,28,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_4()); 
            }

            }


            }

        }
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


    // $ANTLR start "rule__MoniLogger__Group_8__5"
    // InternalMoniLog.g:3757:1: rule__MoniLogger__Group_8__5 : rule__MoniLogger__Group_8__5__Impl ;
    public final void rule__MoniLogger__Group_8__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3761:1: ( rule__MoniLogger__Group_8__5__Impl )
            // InternalMoniLog.g:3762:2: rule__MoniLogger__Group_8__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogger__Group_8__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__5"


    // $ANTLR start "rule__MoniLogger__Group_8__5__Impl"
    // InternalMoniLog.g:3768:1: rule__MoniLogger__Group_8__5__Impl : ( '}' ) ;
    public final void rule__MoniLogger__Group_8__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3772:1: ( ( '}' ) )
            // InternalMoniLog.g:3773:1: ( '}' )
            {
            // InternalMoniLog.g:3773:1: ( '}' )
            // InternalMoniLog.g:3774:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_5()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMoniLoggerAccess().getRightCurlyBracketKeyword_8_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogger__Group_8__5__Impl"


    // $ANTLR start "rule__MoniLogger__Group_8_3__0"
    // InternalMoniLog.g:3784:1: rule__MoniLogger__Group_8_3__0 : rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1 ;
    public final void rule__MoniLogger__Group_8_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3788:1: ( rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1 )
            // InternalMoniLog.g:3789:2: rule__MoniLogger__Group_8_3__0__Impl rule__MoniLogger__Group_8_3__1
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
    // InternalMoniLog.g:3796:1: rule__MoniLogger__Group_8_3__0__Impl : ( ';' ) ;
    public final void rule__MoniLogger__Group_8_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3800:1: ( ( ';' ) )
            // InternalMoniLog.g:3801:1: ( ';' )
            {
            // InternalMoniLog.g:3801:1: ( ';' )
            // InternalMoniLog.g:3802:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_8_3_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:3811:1: rule__MoniLogger__Group_8_3__1 : rule__MoniLogger__Group_8_3__1__Impl ;
    public final void rule__MoniLogger__Group_8_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3815:1: ( rule__MoniLogger__Group_8_3__1__Impl )
            // InternalMoniLog.g:3816:2: rule__MoniLogger__Group_8_3__1__Impl
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
    // InternalMoniLog.g:3822:1: rule__MoniLogger__Group_8_3__1__Impl : ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) ) ;
    public final void rule__MoniLogger__Group_8_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3826:1: ( ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) ) )
            // InternalMoniLog.g:3827:1: ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) )
            {
            // InternalMoniLog.g:3827:1: ( ( rule__MoniLogger__ConditionsAssignment_8_3_1 ) )
            // InternalMoniLog.g:3828:2: ( rule__MoniLogger__ConditionsAssignment_8_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getConditionsAssignment_8_3_1()); 
            }
            // InternalMoniLog.g:3829:2: ( rule__MoniLogger__ConditionsAssignment_8_3_1 )
            // InternalMoniLog.g:3829:3: rule__MoniLogger__ConditionsAssignment_8_3_1
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
    // InternalMoniLog.g:3838:1: rule__MoniLogger__Group_12__0 : rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1 ;
    public final void rule__MoniLogger__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3842:1: ( rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1 )
            // InternalMoniLog.g:3843:2: rule__MoniLogger__Group_12__0__Impl rule__MoniLogger__Group_12__1
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
    // InternalMoniLog.g:3850:1: rule__MoniLogger__Group_12__0__Impl : ( ';' ) ;
    public final void rule__MoniLogger__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3854:1: ( ( ';' ) )
            // InternalMoniLog.g:3855:1: ( ';' )
            {
            // InternalMoniLog.g:3855:1: ( ';' )
            // InternalMoniLog.g:3856:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getSemicolonKeyword_12_0()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:3865:1: rule__MoniLogger__Group_12__1 : rule__MoniLogger__Group_12__1__Impl ;
    public final void rule__MoniLogger__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3869:1: ( rule__MoniLogger__Group_12__1__Impl )
            // InternalMoniLog.g:3870:2: rule__MoniLogger__Group_12__1__Impl
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
    // InternalMoniLog.g:3876:1: rule__MoniLogger__Group_12__1__Impl : ( ( rule__MoniLogger__ActionsAssignment_12_1 ) ) ;
    public final void rule__MoniLogger__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3880:1: ( ( ( rule__MoniLogger__ActionsAssignment_12_1 ) ) )
            // InternalMoniLog.g:3881:1: ( ( rule__MoniLogger__ActionsAssignment_12_1 ) )
            {
            // InternalMoniLog.g:3881:1: ( ( rule__MoniLogger__ActionsAssignment_12_1 ) )
            // InternalMoniLog.g:3882:2: ( rule__MoniLogger__ActionsAssignment_12_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniLoggerAccess().getActionsAssignment_12_1()); 
            }
            // InternalMoniLog.g:3883:2: ( rule__MoniLogger__ActionsAssignment_12_1 )
            // InternalMoniLog.g:3883:3: rule__MoniLogger__ActionsAssignment_12_1
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
    // InternalMoniLog.g:3892:1: rule__Event__Group_0__0 : rule__Event__Group_0__0__Impl rule__Event__Group_0__1 ;
    public final void rule__Event__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3896:1: ( rule__Event__Group_0__0__Impl rule__Event__Group_0__1 )
            // InternalMoniLog.g:3897:2: rule__Event__Group_0__0__Impl rule__Event__Group_0__1
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
    // InternalMoniLog.g:3904:1: rule__Event__Group_0__0__Impl : ( () ) ;
    public final void rule__Event__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3908:1: ( ( () ) )
            // InternalMoniLog.g:3909:1: ( () )
            {
            // InternalMoniLog.g:3909:1: ( () )
            // InternalMoniLog.g:3910:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getASTEventAction_0_0()); 
            }
            // InternalMoniLog.g:3911:2: ()
            // InternalMoniLog.g:3911:3: 
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
    // InternalMoniLog.g:3919:1: rule__Event__Group_0__1 : rule__Event__Group_0__1__Impl rule__Event__Group_0__2 ;
    public final void rule__Event__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3923:1: ( rule__Event__Group_0__1__Impl rule__Event__Group_0__2 )
            // InternalMoniLog.g:3924:2: rule__Event__Group_0__1__Impl rule__Event__Group_0__2
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
    // InternalMoniLog.g:3931:1: rule__Event__Group_0__1__Impl : ( 'call' ) ;
    public final void rule__Event__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3935:1: ( ( 'call' ) )
            // InternalMoniLog.g:3936:1: ( 'call' )
            {
            // InternalMoniLog.g:3936:1: ( 'call' )
            // InternalMoniLog.g:3937:2: 'call'
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
    // InternalMoniLog.g:3946:1: rule__Event__Group_0__2 : rule__Event__Group_0__2__Impl rule__Event__Group_0__3 ;
    public final void rule__Event__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3950:1: ( rule__Event__Group_0__2__Impl rule__Event__Group_0__3 )
            // InternalMoniLog.g:3951:2: rule__Event__Group_0__2__Impl rule__Event__Group_0__3
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
    // InternalMoniLog.g:3958:1: rule__Event__Group_0__2__Impl : ( ( rule__Event__NameAssignment_0_2 ) ) ;
    public final void rule__Event__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3962:1: ( ( ( rule__Event__NameAssignment_0_2 ) ) )
            // InternalMoniLog.g:3963:1: ( ( rule__Event__NameAssignment_0_2 ) )
            {
            // InternalMoniLog.g:3963:1: ( ( rule__Event__NameAssignment_0_2 ) )
            // InternalMoniLog.g:3964:2: ( rule__Event__NameAssignment_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_0_2()); 
            }
            // InternalMoniLog.g:3965:2: ( rule__Event__NameAssignment_0_2 )
            // InternalMoniLog.g:3965:3: rule__Event__NameAssignment_0_2
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
    // InternalMoniLog.g:3973:1: rule__Event__Group_0__3 : rule__Event__Group_0__3__Impl rule__Event__Group_0__4 ;
    public final void rule__Event__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3977:1: ( rule__Event__Group_0__3__Impl rule__Event__Group_0__4 )
            // InternalMoniLog.g:3978:2: rule__Event__Group_0__3__Impl rule__Event__Group_0__4
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
    // InternalMoniLog.g:3985:1: rule__Event__Group_0__3__Impl : ( ( rule__Event__Group_0_3__0 )? ) ;
    public final void rule__Event__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:3989:1: ( ( ( rule__Event__Group_0_3__0 )? ) )
            // InternalMoniLog.g:3990:1: ( ( rule__Event__Group_0_3__0 )? )
            {
            // InternalMoniLog.g:3990:1: ( ( rule__Event__Group_0_3__0 )? )
            // InternalMoniLog.g:3991:2: ( rule__Event__Group_0_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_0_3()); 
            }
            // InternalMoniLog.g:3992:2: ( rule__Event__Group_0_3__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==30) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoniLog.g:3992:3: rule__Event__Group_0_3__0
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
    // InternalMoniLog.g:4000:1: rule__Event__Group_0__4 : rule__Event__Group_0__4__Impl rule__Event__Group_0__5 ;
    public final void rule__Event__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4004:1: ( rule__Event__Group_0__4__Impl rule__Event__Group_0__5 )
            // InternalMoniLog.g:4005:2: rule__Event__Group_0__4__Impl rule__Event__Group_0__5
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
    // InternalMoniLog.g:4012:1: rule__Event__Group_0__4__Impl : ( '{' ) ;
    public final void rule__Event__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4016:1: ( ( '{' ) )
            // InternalMoniLog.g:4017:1: ( '{' )
            {
            // InternalMoniLog.g:4017:1: ( '{' )
            // InternalMoniLog.g:4018:2: '{'
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
    // InternalMoniLog.g:4027:1: rule__Event__Group_0__5 : rule__Event__Group_0__5__Impl rule__Event__Group_0__6 ;
    public final void rule__Event__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4031:1: ( rule__Event__Group_0__5__Impl rule__Event__Group_0__6 )
            // InternalMoniLog.g:4032:2: rule__Event__Group_0__5__Impl rule__Event__Group_0__6
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
    // InternalMoniLog.g:4039:1: rule__Event__Group_0__5__Impl : ( ( rule__Event__KindAssignment_0_5 ) ) ;
    public final void rule__Event__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4043:1: ( ( ( rule__Event__KindAssignment_0_5 ) ) )
            // InternalMoniLog.g:4044:1: ( ( rule__Event__KindAssignment_0_5 ) )
            {
            // InternalMoniLog.g:4044:1: ( ( rule__Event__KindAssignment_0_5 ) )
            // InternalMoniLog.g:4045:2: ( rule__Event__KindAssignment_0_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindAssignment_0_5()); 
            }
            // InternalMoniLog.g:4046:2: ( rule__Event__KindAssignment_0_5 )
            // InternalMoniLog.g:4046:3: rule__Event__KindAssignment_0_5
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
    // InternalMoniLog.g:4054:1: rule__Event__Group_0__6 : rule__Event__Group_0__6__Impl rule__Event__Group_0__7 ;
    public final void rule__Event__Group_0__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4058:1: ( rule__Event__Group_0__6__Impl rule__Event__Group_0__7 )
            // InternalMoniLog.g:4059:2: rule__Event__Group_0__6__Impl rule__Event__Group_0__7
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
    // InternalMoniLog.g:4066:1: rule__Event__Group_0__6__Impl : ( ( rule__Event__RuleIDAssignment_0_6 ) ) ;
    public final void rule__Event__Group_0__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4070:1: ( ( ( rule__Event__RuleIDAssignment_0_6 ) ) )
            // InternalMoniLog.g:4071:1: ( ( rule__Event__RuleIDAssignment_0_6 ) )
            {
            // InternalMoniLog.g:4071:1: ( ( rule__Event__RuleIDAssignment_0_6 ) )
            // InternalMoniLog.g:4072:2: ( rule__Event__RuleIDAssignment_0_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRuleIDAssignment_0_6()); 
            }
            // InternalMoniLog.g:4073:2: ( rule__Event__RuleIDAssignment_0_6 )
            // InternalMoniLog.g:4073:3: rule__Event__RuleIDAssignment_0_6
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
    // InternalMoniLog.g:4081:1: rule__Event__Group_0__7 : rule__Event__Group_0__7__Impl ;
    public final void rule__Event__Group_0__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4085:1: ( rule__Event__Group_0__7__Impl )
            // InternalMoniLog.g:4086:2: rule__Event__Group_0__7__Impl
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
    // InternalMoniLog.g:4092:1: rule__Event__Group_0__7__Impl : ( '}' ) ;
    public final void rule__Event__Group_0__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4096:1: ( ( '}' ) )
            // InternalMoniLog.g:4097:1: ( '}' )
            {
            // InternalMoniLog.g:4097:1: ( '}' )
            // InternalMoniLog.g:4098:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_0_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4108:1: rule__Event__Group_0_3__0 : rule__Event__Group_0_3__0__Impl rule__Event__Group_0_3__1 ;
    public final void rule__Event__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4112:1: ( rule__Event__Group_0_3__0__Impl rule__Event__Group_0_3__1 )
            // InternalMoniLog.g:4113:2: rule__Event__Group_0_3__0__Impl rule__Event__Group_0_3__1
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
    // InternalMoniLog.g:4120:1: rule__Event__Group_0_3__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4124:1: ( ( '(' ) )
            // InternalMoniLog.g:4125:1: ( '(' )
            {
            // InternalMoniLog.g:4125:1: ( '(' )
            // InternalMoniLog.g:4126:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_0_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4135:1: rule__Event__Group_0_3__1 : rule__Event__Group_0_3__1__Impl rule__Event__Group_0_3__2 ;
    public final void rule__Event__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4139:1: ( rule__Event__Group_0_3__1__Impl rule__Event__Group_0_3__2 )
            // InternalMoniLog.g:4140:2: rule__Event__Group_0_3__1__Impl rule__Event__Group_0_3__2
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
    // InternalMoniLog.g:4147:1: rule__Event__Group_0_3__1__Impl : ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) ) ;
    public final void rule__Event__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4151:1: ( ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) ) )
            // InternalMoniLog.g:4152:1: ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) )
            {
            // InternalMoniLog.g:4152:1: ( ( rule__Event__ParameterDeclAssignment_0_3_1 ) )
            // InternalMoniLog.g:4153:2: ( rule__Event__ParameterDeclAssignment_0_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclAssignment_0_3_1()); 
            }
            // InternalMoniLog.g:4154:2: ( rule__Event__ParameterDeclAssignment_0_3_1 )
            // InternalMoniLog.g:4154:3: rule__Event__ParameterDeclAssignment_0_3_1
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
    // InternalMoniLog.g:4162:1: rule__Event__Group_0_3__2 : rule__Event__Group_0_3__2__Impl ;
    public final void rule__Event__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4166:1: ( rule__Event__Group_0_3__2__Impl )
            // InternalMoniLog.g:4167:2: rule__Event__Group_0_3__2__Impl
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
    // InternalMoniLog.g:4173:1: rule__Event__Group_0_3__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4177:1: ( ( ')' ) )
            // InternalMoniLog.g:4178:1: ( ')' )
            {
            // InternalMoniLog.g:4178:1: ( ')' )
            // InternalMoniLog.g:4179:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_0_3_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4189:1: rule__Event__Group_1__0 : rule__Event__Group_1__0__Impl rule__Event__Group_1__1 ;
    public final void rule__Event__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4193:1: ( rule__Event__Group_1__0__Impl rule__Event__Group_1__1 )
            // InternalMoniLog.g:4194:2: rule__Event__Group_1__0__Impl rule__Event__Group_1__1
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
    // InternalMoniLog.g:4201:1: rule__Event__Group_1__0__Impl : ( () ) ;
    public final void rule__Event__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4205:1: ( ( () ) )
            // InternalMoniLog.g:4206:1: ( () )
            {
            // InternalMoniLog.g:4206:1: ( () )
            // InternalMoniLog.g:4207:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getComplexEventAction_1_0()); 
            }
            // InternalMoniLog.g:4208:2: ()
            // InternalMoniLog.g:4208:3: 
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
    // InternalMoniLog.g:4216:1: rule__Event__Group_1__1 : rule__Event__Group_1__1__Impl rule__Event__Group_1__2 ;
    public final void rule__Event__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4220:1: ( rule__Event__Group_1__1__Impl rule__Event__Group_1__2 )
            // InternalMoniLog.g:4221:2: rule__Event__Group_1__1__Impl rule__Event__Group_1__2
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
    // InternalMoniLog.g:4228:1: rule__Event__Group_1__1__Impl : ( 'complex' ) ;
    public final void rule__Event__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4232:1: ( ( 'complex' ) )
            // InternalMoniLog.g:4233:1: ( 'complex' )
            {
            // InternalMoniLog.g:4233:1: ( 'complex' )
            // InternalMoniLog.g:4234:2: 'complex'
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
    // InternalMoniLog.g:4243:1: rule__Event__Group_1__2 : rule__Event__Group_1__2__Impl rule__Event__Group_1__3 ;
    public final void rule__Event__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4247:1: ( rule__Event__Group_1__2__Impl rule__Event__Group_1__3 )
            // InternalMoniLog.g:4248:2: rule__Event__Group_1__2__Impl rule__Event__Group_1__3
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
    // InternalMoniLog.g:4255:1: rule__Event__Group_1__2__Impl : ( ( rule__Event__NameAssignment_1_2 ) ) ;
    public final void rule__Event__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4259:1: ( ( ( rule__Event__NameAssignment_1_2 ) ) )
            // InternalMoniLog.g:4260:1: ( ( rule__Event__NameAssignment_1_2 ) )
            {
            // InternalMoniLog.g:4260:1: ( ( rule__Event__NameAssignment_1_2 ) )
            // InternalMoniLog.g:4261:2: ( rule__Event__NameAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_1_2()); 
            }
            // InternalMoniLog.g:4262:2: ( rule__Event__NameAssignment_1_2 )
            // InternalMoniLog.g:4262:3: rule__Event__NameAssignment_1_2
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
    // InternalMoniLog.g:4270:1: rule__Event__Group_1__3 : rule__Event__Group_1__3__Impl rule__Event__Group_1__4 ;
    public final void rule__Event__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4274:1: ( rule__Event__Group_1__3__Impl rule__Event__Group_1__4 )
            // InternalMoniLog.g:4275:2: rule__Event__Group_1__3__Impl rule__Event__Group_1__4
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
    // InternalMoniLog.g:4282:1: rule__Event__Group_1__3__Impl : ( ( rule__Event__Group_1_3__0 )? ) ;
    public final void rule__Event__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4286:1: ( ( ( rule__Event__Group_1_3__0 )? ) )
            // InternalMoniLog.g:4287:1: ( ( rule__Event__Group_1_3__0 )? )
            {
            // InternalMoniLog.g:4287:1: ( ( rule__Event__Group_1_3__0 )? )
            // InternalMoniLog.g:4288:2: ( rule__Event__Group_1_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1_3()); 
            }
            // InternalMoniLog.g:4289:2: ( rule__Event__Group_1_3__0 )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==38) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoniLog.g:4289:3: rule__Event__Group_1_3__0
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
    // InternalMoniLog.g:4297:1: rule__Event__Group_1__4 : rule__Event__Group_1__4__Impl rule__Event__Group_1__5 ;
    public final void rule__Event__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4301:1: ( rule__Event__Group_1__4__Impl rule__Event__Group_1__5 )
            // InternalMoniLog.g:4302:2: rule__Event__Group_1__4__Impl rule__Event__Group_1__5
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
    // InternalMoniLog.g:4309:1: rule__Event__Group_1__4__Impl : ( ( rule__Event__Group_1_4__0 )? ) ;
    public final void rule__Event__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4313:1: ( ( ( rule__Event__Group_1_4__0 )? ) )
            // InternalMoniLog.g:4314:1: ( ( rule__Event__Group_1_4__0 )? )
            {
            // InternalMoniLog.g:4314:1: ( ( rule__Event__Group_1_4__0 )? )
            // InternalMoniLog.g:4315:2: ( rule__Event__Group_1_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_1_4()); 
            }
            // InternalMoniLog.g:4316:2: ( rule__Event__Group_1_4__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoniLog.g:4316:3: rule__Event__Group_1_4__0
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
    // InternalMoniLog.g:4324:1: rule__Event__Group_1__5 : rule__Event__Group_1__5__Impl rule__Event__Group_1__6 ;
    public final void rule__Event__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4328:1: ( rule__Event__Group_1__5__Impl rule__Event__Group_1__6 )
            // InternalMoniLog.g:4329:2: rule__Event__Group_1__5__Impl rule__Event__Group_1__6
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
    // InternalMoniLog.g:4336:1: rule__Event__Group_1__5__Impl : ( '{' ) ;
    public final void rule__Event__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4340:1: ( ( '{' ) )
            // InternalMoniLog.g:4341:1: ( '{' )
            {
            // InternalMoniLog.g:4341:1: ( '{' )
            // InternalMoniLog.g:4342:2: '{'
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
    // InternalMoniLog.g:4351:1: rule__Event__Group_1__6 : rule__Event__Group_1__6__Impl rule__Event__Group_1__7 ;
    public final void rule__Event__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4355:1: ( rule__Event__Group_1__6__Impl rule__Event__Group_1__7 )
            // InternalMoniLog.g:4356:2: rule__Event__Group_1__6__Impl rule__Event__Group_1__7
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
    // InternalMoniLog.g:4363:1: rule__Event__Group_1__6__Impl : ( ( rule__Event__PatternAssignment_1_6 ) ) ;
    public final void rule__Event__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4367:1: ( ( ( rule__Event__PatternAssignment_1_6 ) ) )
            // InternalMoniLog.g:4368:1: ( ( rule__Event__PatternAssignment_1_6 ) )
            {
            // InternalMoniLog.g:4368:1: ( ( rule__Event__PatternAssignment_1_6 ) )
            // InternalMoniLog.g:4369:2: ( rule__Event__PatternAssignment_1_6 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getPatternAssignment_1_6()); 
            }
            // InternalMoniLog.g:4370:2: ( rule__Event__PatternAssignment_1_6 )
            // InternalMoniLog.g:4370:3: rule__Event__PatternAssignment_1_6
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
    // InternalMoniLog.g:4378:1: rule__Event__Group_1__7 : rule__Event__Group_1__7__Impl ;
    public final void rule__Event__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4382:1: ( rule__Event__Group_1__7__Impl )
            // InternalMoniLog.g:4383:2: rule__Event__Group_1__7__Impl
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
    // InternalMoniLog.g:4389:1: rule__Event__Group_1__7__Impl : ( '}' ) ;
    public final void rule__Event__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4393:1: ( ( '}' ) )
            // InternalMoniLog.g:4394:1: ( '}' )
            {
            // InternalMoniLog.g:4394:1: ( '}' )
            // InternalMoniLog.g:4395:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightCurlyBracketKeyword_1_7()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4405:1: rule__Event__Group_1_3__0 : rule__Event__Group_1_3__0__Impl rule__Event__Group_1_3__1 ;
    public final void rule__Event__Group_1_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4409:1: ( rule__Event__Group_1_3__0__Impl rule__Event__Group_1_3__1 )
            // InternalMoniLog.g:4410:2: rule__Event__Group_1_3__0__Impl rule__Event__Group_1_3__1
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
    // InternalMoniLog.g:4417:1: rule__Event__Group_1_3__0__Impl : ( '[' ) ;
    public final void rule__Event__Group_1_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4421:1: ( ( '[' ) )
            // InternalMoniLog.g:4422:1: ( '[' )
            {
            // InternalMoniLog.g:4422:1: ( '[' )
            // InternalMoniLog.g:4423:2: '['
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
    // InternalMoniLog.g:4432:1: rule__Event__Group_1_3__1 : rule__Event__Group_1_3__1__Impl rule__Event__Group_1_3__2 ;
    public final void rule__Event__Group_1_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4436:1: ( rule__Event__Group_1_3__1__Impl rule__Event__Group_1_3__2 )
            // InternalMoniLog.g:4437:2: rule__Event__Group_1_3__1__Impl rule__Event__Group_1_3__2
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
    // InternalMoniLog.g:4444:1: rule__Event__Group_1_3__1__Impl : ( ( rule__Event__KindAssignment_1_3_1 ) ) ;
    public final void rule__Event__Group_1_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4448:1: ( ( ( rule__Event__KindAssignment_1_3_1 ) ) )
            // InternalMoniLog.g:4449:1: ( ( rule__Event__KindAssignment_1_3_1 ) )
            {
            // InternalMoniLog.g:4449:1: ( ( rule__Event__KindAssignment_1_3_1 ) )
            // InternalMoniLog.g:4450:2: ( rule__Event__KindAssignment_1_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getKindAssignment_1_3_1()); 
            }
            // InternalMoniLog.g:4451:2: ( rule__Event__KindAssignment_1_3_1 )
            // InternalMoniLog.g:4451:3: rule__Event__KindAssignment_1_3_1
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
    // InternalMoniLog.g:4459:1: rule__Event__Group_1_3__2 : rule__Event__Group_1_3__2__Impl ;
    public final void rule__Event__Group_1_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4463:1: ( rule__Event__Group_1_3__2__Impl )
            // InternalMoniLog.g:4464:2: rule__Event__Group_1_3__2__Impl
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
    // InternalMoniLog.g:4470:1: rule__Event__Group_1_3__2__Impl : ( ']' ) ;
    public final void rule__Event__Group_1_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4474:1: ( ( ']' ) )
            // InternalMoniLog.g:4475:1: ( ']' )
            {
            // InternalMoniLog.g:4475:1: ( ']' )
            // InternalMoniLog.g:4476:2: ']'
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
    // InternalMoniLog.g:4486:1: rule__Event__Group_1_4__0 : rule__Event__Group_1_4__0__Impl rule__Event__Group_1_4__1 ;
    public final void rule__Event__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4490:1: ( rule__Event__Group_1_4__0__Impl rule__Event__Group_1_4__1 )
            // InternalMoniLog.g:4491:2: rule__Event__Group_1_4__0__Impl rule__Event__Group_1_4__1
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
    // InternalMoniLog.g:4498:1: rule__Event__Group_1_4__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4502:1: ( ( '(' ) )
            // InternalMoniLog.g:4503:1: ( '(' )
            {
            // InternalMoniLog.g:4503:1: ( '(' )
            // InternalMoniLog.g:4504:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_1_4_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4513:1: rule__Event__Group_1_4__1 : rule__Event__Group_1_4__1__Impl rule__Event__Group_1_4__2 ;
    public final void rule__Event__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4517:1: ( rule__Event__Group_1_4__1__Impl rule__Event__Group_1_4__2 )
            // InternalMoniLog.g:4518:2: rule__Event__Group_1_4__1__Impl rule__Event__Group_1_4__2
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
    // InternalMoniLog.g:4525:1: rule__Event__Group_1_4__1__Impl : ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) ) ;
    public final void rule__Event__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4529:1: ( ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) ) )
            // InternalMoniLog.g:4530:1: ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) )
            {
            // InternalMoniLog.g:4530:1: ( ( rule__Event__ParameterDeclAssignment_1_4_1 ) )
            // InternalMoniLog.g:4531:2: ( rule__Event__ParameterDeclAssignment_1_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclAssignment_1_4_1()); 
            }
            // InternalMoniLog.g:4532:2: ( rule__Event__ParameterDeclAssignment_1_4_1 )
            // InternalMoniLog.g:4532:3: rule__Event__ParameterDeclAssignment_1_4_1
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
    // InternalMoniLog.g:4540:1: rule__Event__Group_1_4__2 : rule__Event__Group_1_4__2__Impl ;
    public final void rule__Event__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4544:1: ( rule__Event__Group_1_4__2__Impl )
            // InternalMoniLog.g:4545:2: rule__Event__Group_1_4__2__Impl
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
    // InternalMoniLog.g:4551:1: rule__Event__Group_1_4__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4555:1: ( ( ')' ) )
            // InternalMoniLog.g:4556:1: ( ')' )
            {
            // InternalMoniLog.g:4556:1: ( ')' )
            // InternalMoniLog.g:4557:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_1_4_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4567:1: rule__Event__Group_2__0 : rule__Event__Group_2__0__Impl rule__Event__Group_2__1 ;
    public final void rule__Event__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4571:1: ( rule__Event__Group_2__0__Impl rule__Event__Group_2__1 )
            // InternalMoniLog.g:4572:2: rule__Event__Group_2__0__Impl rule__Event__Group_2__1
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
    // InternalMoniLog.g:4579:1: rule__Event__Group_2__0__Impl : ( () ) ;
    public final void rule__Event__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4583:1: ( ( () ) )
            // InternalMoniLog.g:4584:1: ( () )
            {
            // InternalMoniLog.g:4584:1: ( () )
            // InternalMoniLog.g:4585:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getUserEventAction_2_0()); 
            }
            // InternalMoniLog.g:4586:2: ()
            // InternalMoniLog.g:4586:3: 
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
    // InternalMoniLog.g:4594:1: rule__Event__Group_2__1 : rule__Event__Group_2__1__Impl rule__Event__Group_2__2 ;
    public final void rule__Event__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4598:1: ( rule__Event__Group_2__1__Impl rule__Event__Group_2__2 )
            // InternalMoniLog.g:4599:2: rule__Event__Group_2__1__Impl rule__Event__Group_2__2
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
    // InternalMoniLog.g:4606:1: rule__Event__Group_2__1__Impl : ( 'custom' ) ;
    public final void rule__Event__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4610:1: ( ( 'custom' ) )
            // InternalMoniLog.g:4611:1: ( 'custom' )
            {
            // InternalMoniLog.g:4611:1: ( 'custom' )
            // InternalMoniLog.g:4612:2: 'custom'
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
    // InternalMoniLog.g:4621:1: rule__Event__Group_2__2 : rule__Event__Group_2__2__Impl rule__Event__Group_2__3 ;
    public final void rule__Event__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4625:1: ( rule__Event__Group_2__2__Impl rule__Event__Group_2__3 )
            // InternalMoniLog.g:4626:2: rule__Event__Group_2__2__Impl rule__Event__Group_2__3
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
    // InternalMoniLog.g:4633:1: rule__Event__Group_2__2__Impl : ( ( rule__Event__NameAssignment_2_2 ) ) ;
    public final void rule__Event__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4637:1: ( ( ( rule__Event__NameAssignment_2_2 ) ) )
            // InternalMoniLog.g:4638:1: ( ( rule__Event__NameAssignment_2_2 ) )
            {
            // InternalMoniLog.g:4638:1: ( ( rule__Event__NameAssignment_2_2 ) )
            // InternalMoniLog.g:4639:2: ( rule__Event__NameAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getNameAssignment_2_2()); 
            }
            // InternalMoniLog.g:4640:2: ( rule__Event__NameAssignment_2_2 )
            // InternalMoniLog.g:4640:3: rule__Event__NameAssignment_2_2
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
    // InternalMoniLog.g:4648:1: rule__Event__Group_2__3 : rule__Event__Group_2__3__Impl ;
    public final void rule__Event__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4652:1: ( rule__Event__Group_2__3__Impl )
            // InternalMoniLog.g:4653:2: rule__Event__Group_2__3__Impl
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
    // InternalMoniLog.g:4659:1: rule__Event__Group_2__3__Impl : ( ( rule__Event__Group_2_3__0 )? ) ;
    public final void rule__Event__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4663:1: ( ( ( rule__Event__Group_2_3__0 )? ) )
            // InternalMoniLog.g:4664:1: ( ( rule__Event__Group_2_3__0 )? )
            {
            // InternalMoniLog.g:4664:1: ( ( rule__Event__Group_2_3__0 )? )
            // InternalMoniLog.g:4665:2: ( rule__Event__Group_2_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getGroup_2_3()); 
            }
            // InternalMoniLog.g:4666:2: ( rule__Event__Group_2_3__0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoniLog.g:4666:3: rule__Event__Group_2_3__0
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
    // InternalMoniLog.g:4675:1: rule__Event__Group_2_3__0 : rule__Event__Group_2_3__0__Impl rule__Event__Group_2_3__1 ;
    public final void rule__Event__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4679:1: ( rule__Event__Group_2_3__0__Impl rule__Event__Group_2_3__1 )
            // InternalMoniLog.g:4680:2: rule__Event__Group_2_3__0__Impl rule__Event__Group_2_3__1
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
    // InternalMoniLog.g:4687:1: rule__Event__Group_2_3__0__Impl : ( '(' ) ;
    public final void rule__Event__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4691:1: ( ( '(' ) )
            // InternalMoniLog.g:4692:1: ( '(' )
            {
            // InternalMoniLog.g:4692:1: ( '(' )
            // InternalMoniLog.g:4693:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getLeftParenthesisKeyword_2_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4702:1: rule__Event__Group_2_3__1 : rule__Event__Group_2_3__1__Impl rule__Event__Group_2_3__2 ;
    public final void rule__Event__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4706:1: ( rule__Event__Group_2_3__1__Impl rule__Event__Group_2_3__2 )
            // InternalMoniLog.g:4707:2: rule__Event__Group_2_3__1__Impl rule__Event__Group_2_3__2
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
    // InternalMoniLog.g:4714:1: rule__Event__Group_2_3__1__Impl : ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) ) ;
    public final void rule__Event__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4718:1: ( ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) ) )
            // InternalMoniLog.g:4719:1: ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) )
            {
            // InternalMoniLog.g:4719:1: ( ( rule__Event__ParameterDeclAssignment_2_3_1 ) )
            // InternalMoniLog.g:4720:2: ( rule__Event__ParameterDeclAssignment_2_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getParameterDeclAssignment_2_3_1()); 
            }
            // InternalMoniLog.g:4721:2: ( rule__Event__ParameterDeclAssignment_2_3_1 )
            // InternalMoniLog.g:4721:3: rule__Event__ParameterDeclAssignment_2_3_1
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
    // InternalMoniLog.g:4729:1: rule__Event__Group_2_3__2 : rule__Event__Group_2_3__2__Impl ;
    public final void rule__Event__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4733:1: ( rule__Event__Group_2_3__2__Impl )
            // InternalMoniLog.g:4734:2: rule__Event__Group_2_3__2__Impl
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
    // InternalMoniLog.g:4740:1: rule__Event__Group_2_3__2__Impl : ( ')' ) ;
    public final void rule__Event__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4744:1: ( ( ')' ) )
            // InternalMoniLog.g:4745:1: ( ')' )
            {
            // InternalMoniLog.g:4745:1: ( ')' )
            // InternalMoniLog.g:4746:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEventAccess().getRightParenthesisKeyword_2_3_2()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:4756:1: rule__ASTEventKind__Group_0__0 : rule__ASTEventKind__Group_0__0__Impl rule__ASTEventKind__Group_0__1 ;
    public final void rule__ASTEventKind__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4760:1: ( rule__ASTEventKind__Group_0__0__Impl rule__ASTEventKind__Group_0__1 )
            // InternalMoniLog.g:4761:2: rule__ASTEventKind__Group_0__0__Impl rule__ASTEventKind__Group_0__1
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
    // InternalMoniLog.g:4768:1: rule__ASTEventKind__Group_0__0__Impl : ( () ) ;
    public final void rule__ASTEventKind__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4772:1: ( ( () ) )
            // InternalMoniLog.g:4773:1: ( () )
            {
            // InternalMoniLog.g:4773:1: ( () )
            // InternalMoniLog.g:4774:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getBeforeASTEventAction_0_0()); 
            }
            // InternalMoniLog.g:4775:2: ()
            // InternalMoniLog.g:4775:3: 
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
    // InternalMoniLog.g:4783:1: rule__ASTEventKind__Group_0__1 : rule__ASTEventKind__Group_0__1__Impl ;
    public final void rule__ASTEventKind__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4787:1: ( rule__ASTEventKind__Group_0__1__Impl )
            // InternalMoniLog.g:4788:2: rule__ASTEventKind__Group_0__1__Impl
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
    // InternalMoniLog.g:4794:1: rule__ASTEventKind__Group_0__1__Impl : ( 'before' ) ;
    public final void rule__ASTEventKind__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4798:1: ( ( 'before' ) )
            // InternalMoniLog.g:4799:1: ( 'before' )
            {
            // InternalMoniLog.g:4799:1: ( 'before' )
            // InternalMoniLog.g:4800:2: 'before'
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
    // InternalMoniLog.g:4810:1: rule__ASTEventKind__Group_1__0 : rule__ASTEventKind__Group_1__0__Impl rule__ASTEventKind__Group_1__1 ;
    public final void rule__ASTEventKind__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4814:1: ( rule__ASTEventKind__Group_1__0__Impl rule__ASTEventKind__Group_1__1 )
            // InternalMoniLog.g:4815:2: rule__ASTEventKind__Group_1__0__Impl rule__ASTEventKind__Group_1__1
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
    // InternalMoniLog.g:4822:1: rule__ASTEventKind__Group_1__0__Impl : ( () ) ;
    public final void rule__ASTEventKind__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4826:1: ( ( () ) )
            // InternalMoniLog.g:4827:1: ( () )
            {
            // InternalMoniLog.g:4827:1: ( () )
            // InternalMoniLog.g:4828:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getASTEventKindAccess().getAfterASTEventAction_1_0()); 
            }
            // InternalMoniLog.g:4829:2: ()
            // InternalMoniLog.g:4829:3: 
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
    // InternalMoniLog.g:4837:1: rule__ASTEventKind__Group_1__1 : rule__ASTEventKind__Group_1__1__Impl ;
    public final void rule__ASTEventKind__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4841:1: ( rule__ASTEventKind__Group_1__1__Impl )
            // InternalMoniLog.g:4842:2: rule__ASTEventKind__Group_1__1__Impl
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
    // InternalMoniLog.g:4848:1: rule__ASTEventKind__Group_1__1__Impl : ( 'after' ) ;
    public final void rule__ASTEventKind__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4852:1: ( ( 'after' ) )
            // InternalMoniLog.g:4853:1: ( 'after' )
            {
            // InternalMoniLog.g:4853:1: ( 'after' )
            // InternalMoniLog.g:4854:2: 'after'
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
    // InternalMoniLog.g:4864:1: rule__TemporalPattern__Group__0 : rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 ;
    public final void rule__TemporalPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4868:1: ( rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 )
            // InternalMoniLog.g:4869:2: rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1
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
    // InternalMoniLog.g:4876:1: rule__TemporalPattern__Group__0__Impl : ( ( rule__TemporalPattern__PatternAssignment_0 ) ) ;
    public final void rule__TemporalPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4880:1: ( ( ( rule__TemporalPattern__PatternAssignment_0 ) ) )
            // InternalMoniLog.g:4881:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            {
            // InternalMoniLog.g:4881:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            // InternalMoniLog.g:4882:2: ( rule__TemporalPattern__PatternAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0()); 
            }
            // InternalMoniLog.g:4883:2: ( rule__TemporalPattern__PatternAssignment_0 )
            // InternalMoniLog.g:4883:3: rule__TemporalPattern__PatternAssignment_0
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
    // InternalMoniLog.g:4891:1: rule__TemporalPattern__Group__1 : rule__TemporalPattern__Group__1__Impl ;
    public final void rule__TemporalPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4895:1: ( rule__TemporalPattern__Group__1__Impl )
            // InternalMoniLog.g:4896:2: rule__TemporalPattern__Group__1__Impl
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
    // InternalMoniLog.g:4902:1: rule__TemporalPattern__Group__1__Impl : ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) ;
    public final void rule__TemporalPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4906:1: ( ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) )
            // InternalMoniLog.g:4907:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            {
            // InternalMoniLog.g:4907:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            // InternalMoniLog.g:4908:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1()); 
            }
            // InternalMoniLog.g:4909:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            // InternalMoniLog.g:4909:3: rule__TemporalPattern__ScopeAssignment_1
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
    // InternalMoniLog.g:4918:1: rule__Pattern__Group_0__0 : rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 ;
    public final void rule__Pattern__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4922:1: ( rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 )
            // InternalMoniLog.g:4923:2: rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1
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
    // InternalMoniLog.g:4930:1: rule__Pattern__Group_0__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4934:1: ( ( () ) )
            // InternalMoniLog.g:4935:1: ( () )
            {
            // InternalMoniLog.g:4935:1: ( () )
            // InternalMoniLog.g:4936:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getExistenceAction_0_0()); 
            }
            // InternalMoniLog.g:4937:2: ()
            // InternalMoniLog.g:4937:3: 
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
    // InternalMoniLog.g:4945:1: rule__Pattern__Group_0__1 : rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 ;
    public final void rule__Pattern__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4949:1: ( rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 )
            // InternalMoniLog.g:4950:2: rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2
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
    // InternalMoniLog.g:4957:1: rule__Pattern__Group_0__1__Impl : ( ( 'exists' )? ) ;
    public final void rule__Pattern__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4961:1: ( ( ( 'exists' )? ) )
            // InternalMoniLog.g:4962:1: ( ( 'exists' )? )
            {
            // InternalMoniLog.g:4962:1: ( ( 'exists' )? )
            // InternalMoniLog.g:4963:2: ( 'exists' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getExistsKeyword_0_1()); 
            }
            // InternalMoniLog.g:4964:2: ( 'exists' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==46) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoniLog.g:4964:3: 'exists'
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
    // InternalMoniLog.g:4972:1: rule__Pattern__Group_0__2 : rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3 ;
    public final void rule__Pattern__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4976:1: ( rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3 )
            // InternalMoniLog.g:4977:2: rule__Pattern__Group_0__2__Impl rule__Pattern__Group_0__3
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
    // InternalMoniLog.g:4984:1: rule__Pattern__Group_0__2__Impl : ( ( rule__Pattern__BoundAssignment_0_2 )? ) ;
    public final void rule__Pattern__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:4988:1: ( ( ( rule__Pattern__BoundAssignment_0_2 )? ) )
            // InternalMoniLog.g:4989:1: ( ( rule__Pattern__BoundAssignment_0_2 )? )
            {
            // InternalMoniLog.g:4989:1: ( ( rule__Pattern__BoundAssignment_0_2 )? )
            // InternalMoniLog.g:4990:2: ( rule__Pattern__BoundAssignment_0_2 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getBoundAssignment_0_2()); 
            }
            // InternalMoniLog.g:4991:2: ( rule__Pattern__BoundAssignment_0_2 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_INT||(LA42_0>=51 && LA42_0<=52)) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoniLog.g:4991:3: rule__Pattern__BoundAssignment_0_2
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
    // InternalMoniLog.g:4999:1: rule__Pattern__Group_0__3 : rule__Pattern__Group_0__3__Impl ;
    public final void rule__Pattern__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5003:1: ( rule__Pattern__Group_0__3__Impl )
            // InternalMoniLog.g:5004:2: rule__Pattern__Group_0__3__Impl
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
    // InternalMoniLog.g:5010:1: rule__Pattern__Group_0__3__Impl : ( ( rule__Pattern__EventAssignment_0_3 ) ) ;
    public final void rule__Pattern__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5014:1: ( ( ( rule__Pattern__EventAssignment_0_3 ) ) )
            // InternalMoniLog.g:5015:1: ( ( rule__Pattern__EventAssignment_0_3 ) )
            {
            // InternalMoniLog.g:5015:1: ( ( rule__Pattern__EventAssignment_0_3 ) )
            // InternalMoniLog.g:5016:2: ( rule__Pattern__EventAssignment_0_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_0_3()); 
            }
            // InternalMoniLog.g:5017:2: ( rule__Pattern__EventAssignment_0_3 )
            // InternalMoniLog.g:5017:3: rule__Pattern__EventAssignment_0_3
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
    // InternalMoniLog.g:5026:1: rule__Pattern__Group_1__0 : rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 ;
    public final void rule__Pattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5030:1: ( rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 )
            // InternalMoniLog.g:5031:2: rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1
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
    // InternalMoniLog.g:5038:1: rule__Pattern__Group_1__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5042:1: ( ( () ) )
            // InternalMoniLog.g:5043:1: ( () )
            {
            // InternalMoniLog.g:5043:1: ( () )
            // InternalMoniLog.g:5044:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getUniversalityAction_1_0()); 
            }
            // InternalMoniLog.g:5045:2: ()
            // InternalMoniLog.g:5045:3: 
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
    // InternalMoniLog.g:5053:1: rule__Pattern__Group_1__1 : rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 ;
    public final void rule__Pattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5057:1: ( rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 )
            // InternalMoniLog.g:5058:2: rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2
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
    // InternalMoniLog.g:5065:1: rule__Pattern__Group_1__1__Impl : ( 'always' ) ;
    public final void rule__Pattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5069:1: ( ( 'always' ) )
            // InternalMoniLog.g:5070:1: ( 'always' )
            {
            // InternalMoniLog.g:5070:1: ( 'always' )
            // InternalMoniLog.g:5071:2: 'always'
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
    // InternalMoniLog.g:5080:1: rule__Pattern__Group_1__2 : rule__Pattern__Group_1__2__Impl ;
    public final void rule__Pattern__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5084:1: ( rule__Pattern__Group_1__2__Impl )
            // InternalMoniLog.g:5085:2: rule__Pattern__Group_1__2__Impl
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
    // InternalMoniLog.g:5091:1: rule__Pattern__Group_1__2__Impl : ( ( rule__Pattern__EventAssignment_1_2 ) ) ;
    public final void rule__Pattern__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5095:1: ( ( ( rule__Pattern__EventAssignment_1_2 ) ) )
            // InternalMoniLog.g:5096:1: ( ( rule__Pattern__EventAssignment_1_2 ) )
            {
            // InternalMoniLog.g:5096:1: ( ( rule__Pattern__EventAssignment_1_2 ) )
            // InternalMoniLog.g:5097:2: ( rule__Pattern__EventAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_1_2()); 
            }
            // InternalMoniLog.g:5098:2: ( rule__Pattern__EventAssignment_1_2 )
            // InternalMoniLog.g:5098:3: rule__Pattern__EventAssignment_1_2
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
    // InternalMoniLog.g:5107:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5111:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMoniLog.g:5112:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
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
    // InternalMoniLog.g:5119:1: rule__Pattern__Group_2__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5123:1: ( ( () ) )
            // InternalMoniLog.g:5124:1: ( () )
            {
            // InternalMoniLog.g:5124:1: ( () )
            // InternalMoniLog.g:5125:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getAbsenceAction_2_0()); 
            }
            // InternalMoniLog.g:5126:2: ()
            // InternalMoniLog.g:5126:3: 
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
    // InternalMoniLog.g:5134:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5138:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMoniLog.g:5139:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
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
    // InternalMoniLog.g:5146:1: rule__Pattern__Group_2__1__Impl : ( 'never' ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5150:1: ( ( 'never' ) )
            // InternalMoniLog.g:5151:1: ( 'never' )
            {
            // InternalMoniLog.g:5151:1: ( 'never' )
            // InternalMoniLog.g:5152:2: 'never'
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
    // InternalMoniLog.g:5161:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5165:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMoniLog.g:5166:2: rule__Pattern__Group_2__2__Impl
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
    // InternalMoniLog.g:5172:1: rule__Pattern__Group_2__2__Impl : ( ( rule__Pattern__EventAssignment_2_2 ) ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5176:1: ( ( ( rule__Pattern__EventAssignment_2_2 ) ) )
            // InternalMoniLog.g:5177:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            {
            // InternalMoniLog.g:5177:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            // InternalMoniLog.g:5178:2: ( rule__Pattern__EventAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_2_2()); 
            }
            // InternalMoniLog.g:5179:2: ( rule__Pattern__EventAssignment_2_2 )
            // InternalMoniLog.g:5179:3: rule__Pattern__EventAssignment_2_2
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
    // InternalMoniLog.g:5188:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5192:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalMoniLog.g:5193:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
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
    // InternalMoniLog.g:5200:1: rule__Pattern__Group_3__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5204:1: ( ( () ) )
            // InternalMoniLog.g:5205:1: ( () )
            {
            // InternalMoniLog.g:5205:1: ( () )
            // InternalMoniLog.g:5206:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPrecedenceAction_3_0()); 
            }
            // InternalMoniLog.g:5207:2: ()
            // InternalMoniLog.g:5207:3: 
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
    // InternalMoniLog.g:5215:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5219:1: ( rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 )
            // InternalMoniLog.g:5220:2: rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2
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
    // InternalMoniLog.g:5227:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5231:1: ( ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) )
            // InternalMoniLog.g:5232:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            {
            // InternalMoniLog.g:5232:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            // InternalMoniLog.g:5233:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1()); 
            }
            // InternalMoniLog.g:5234:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            // InternalMoniLog.g:5234:3: rule__Pattern__PredecessorAssignment_3_1
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
    // InternalMoniLog.g:5242:1: rule__Pattern__Group_3__2 : rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 ;
    public final void rule__Pattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5246:1: ( rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 )
            // InternalMoniLog.g:5247:2: rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3
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
    // InternalMoniLog.g:5254:1: rule__Pattern__Group_3__2__Impl : ( 'precedes' ) ;
    public final void rule__Pattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5258:1: ( ( 'precedes' ) )
            // InternalMoniLog.g:5259:1: ( 'precedes' )
            {
            // InternalMoniLog.g:5259:1: ( 'precedes' )
            // InternalMoniLog.g:5260:2: 'precedes'
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
    // InternalMoniLog.g:5269:1: rule__Pattern__Group_3__3 : rule__Pattern__Group_3__3__Impl ;
    public final void rule__Pattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5273:1: ( rule__Pattern__Group_3__3__Impl )
            // InternalMoniLog.g:5274:2: rule__Pattern__Group_3__3__Impl
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
    // InternalMoniLog.g:5280:1: rule__Pattern__Group_3__3__Impl : ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) ;
    public final void rule__Pattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5284:1: ( ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) )
            // InternalMoniLog.g:5285:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            {
            // InternalMoniLog.g:5285:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            // InternalMoniLog.g:5286:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3()); 
            }
            // InternalMoniLog.g:5287:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            // InternalMoniLog.g:5287:3: rule__Pattern__SuccessorAssignment_3_3
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
    // InternalMoniLog.g:5296:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5300:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalMoniLog.g:5301:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
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
    // InternalMoniLog.g:5308:1: rule__Pattern__Group_4__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5312:1: ( ( () ) )
            // InternalMoniLog.g:5313:1: ( () )
            {
            // InternalMoniLog.g:5313:1: ( () )
            // InternalMoniLog.g:5314:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getResponseAction_4_0()); 
            }
            // InternalMoniLog.g:5315:2: ()
            // InternalMoniLog.g:5315:3: 
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
    // InternalMoniLog.g:5323:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5327:1: ( rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 )
            // InternalMoniLog.g:5328:2: rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2
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
    // InternalMoniLog.g:5335:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__EventAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5339:1: ( ( ( rule__Pattern__EventAssignment_4_1 ) ) )
            // InternalMoniLog.g:5340:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            {
            // InternalMoniLog.g:5340:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            // InternalMoniLog.g:5341:2: ( rule__Pattern__EventAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getEventAssignment_4_1()); 
            }
            // InternalMoniLog.g:5342:2: ( rule__Pattern__EventAssignment_4_1 )
            // InternalMoniLog.g:5342:3: rule__Pattern__EventAssignment_4_1
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
    // InternalMoniLog.g:5350:1: rule__Pattern__Group_4__2 : rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 ;
    public final void rule__Pattern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5354:1: ( rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 )
            // InternalMoniLog.g:5355:2: rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3
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
    // InternalMoniLog.g:5362:1: rule__Pattern__Group_4__2__Impl : ( 'respondsTo' ) ;
    public final void rule__Pattern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5366:1: ( ( 'respondsTo' ) )
            // InternalMoniLog.g:5367:1: ( 'respondsTo' )
            {
            // InternalMoniLog.g:5367:1: ( 'respondsTo' )
            // InternalMoniLog.g:5368:2: 'respondsTo'
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
    // InternalMoniLog.g:5377:1: rule__Pattern__Group_4__3 : rule__Pattern__Group_4__3__Impl ;
    public final void rule__Pattern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5381:1: ( rule__Pattern__Group_4__3__Impl )
            // InternalMoniLog.g:5382:2: rule__Pattern__Group_4__3__Impl
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
    // InternalMoniLog.g:5388:1: rule__Pattern__Group_4__3__Impl : ( ( rule__Pattern__TriggerAssignment_4_3 ) ) ;
    public final void rule__Pattern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5392:1: ( ( ( rule__Pattern__TriggerAssignment_4_3 ) ) )
            // InternalMoniLog.g:5393:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            {
            // InternalMoniLog.g:5393:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            // InternalMoniLog.g:5394:2: ( rule__Pattern__TriggerAssignment_4_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPatternAccess().getTriggerAssignment_4_3()); 
            }
            // InternalMoniLog.g:5395:2: ( rule__Pattern__TriggerAssignment_4_3 )
            // InternalMoniLog.g:5395:3: rule__Pattern__TriggerAssignment_4_3
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
    // InternalMoniLog.g:5404:1: rule__LowerBound__Group__0 : rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 ;
    public final void rule__LowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5408:1: ( rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 )
            // InternalMoniLog.g:5409:2: rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1
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
    // InternalMoniLog.g:5416:1: rule__LowerBound__Group__0__Impl : ( 'atleast' ) ;
    public final void rule__LowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5420:1: ( ( 'atleast' ) )
            // InternalMoniLog.g:5421:1: ( 'atleast' )
            {
            // InternalMoniLog.g:5421:1: ( 'atleast' )
            // InternalMoniLog.g:5422:2: 'atleast'
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
    // InternalMoniLog.g:5431:1: rule__LowerBound__Group__1 : rule__LowerBound__Group__1__Impl ;
    public final void rule__LowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5435:1: ( rule__LowerBound__Group__1__Impl )
            // InternalMoniLog.g:5436:2: rule__LowerBound__Group__1__Impl
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
    // InternalMoniLog.g:5442:1: rule__LowerBound__Group__1__Impl : ( ( rule__LowerBound__NAssignment_1 ) ) ;
    public final void rule__LowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5446:1: ( ( ( rule__LowerBound__NAssignment_1 ) ) )
            // InternalMoniLog.g:5447:1: ( ( rule__LowerBound__NAssignment_1 ) )
            {
            // InternalMoniLog.g:5447:1: ( ( rule__LowerBound__NAssignment_1 ) )
            // InternalMoniLog.g:5448:2: ( rule__LowerBound__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLowerBoundAccess().getNAssignment_1()); 
            }
            // InternalMoniLog.g:5449:2: ( rule__LowerBound__NAssignment_1 )
            // InternalMoniLog.g:5449:3: rule__LowerBound__NAssignment_1
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
    // InternalMoniLog.g:5458:1: rule__UpperBound__Group__0 : rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 ;
    public final void rule__UpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5462:1: ( rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 )
            // InternalMoniLog.g:5463:2: rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1
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
    // InternalMoniLog.g:5470:1: rule__UpperBound__Group__0__Impl : ( 'atmost' ) ;
    public final void rule__UpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5474:1: ( ( 'atmost' ) )
            // InternalMoniLog.g:5475:1: ( 'atmost' )
            {
            // InternalMoniLog.g:5475:1: ( 'atmost' )
            // InternalMoniLog.g:5476:2: 'atmost'
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
    // InternalMoniLog.g:5485:1: rule__UpperBound__Group__1 : rule__UpperBound__Group__1__Impl ;
    public final void rule__UpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5489:1: ( rule__UpperBound__Group__1__Impl )
            // InternalMoniLog.g:5490:2: rule__UpperBound__Group__1__Impl
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
    // InternalMoniLog.g:5496:1: rule__UpperBound__Group__1__Impl : ( ( rule__UpperBound__NAssignment_1 ) ) ;
    public final void rule__UpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5500:1: ( ( ( rule__UpperBound__NAssignment_1 ) ) )
            // InternalMoniLog.g:5501:1: ( ( rule__UpperBound__NAssignment_1 ) )
            {
            // InternalMoniLog.g:5501:1: ( ( rule__UpperBound__NAssignment_1 ) )
            // InternalMoniLog.g:5502:2: ( rule__UpperBound__NAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getUpperBoundAccess().getNAssignment_1()); 
            }
            // InternalMoniLog.g:5503:2: ( rule__UpperBound__NAssignment_1 )
            // InternalMoniLog.g:5503:3: rule__UpperBound__NAssignment_1
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
    // InternalMoniLog.g:5512:1: rule__Scope__Group_0__0 : rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 ;
    public final void rule__Scope__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5516:1: ( rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 )
            // InternalMoniLog.g:5517:2: rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1
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
    // InternalMoniLog.g:5524:1: rule__Scope__Group_0__0__Impl : ( () ) ;
    public final void rule__Scope__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5528:1: ( ( () ) )
            // InternalMoniLog.g:5529:1: ( () )
            {
            // InternalMoniLog.g:5529:1: ( () )
            // InternalMoniLog.g:5530:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getGloballyAction_0_0()); 
            }
            // InternalMoniLog.g:5531:2: ()
            // InternalMoniLog.g:5531:3: 
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
    // InternalMoniLog.g:5539:1: rule__Scope__Group_0__1 : rule__Scope__Group_0__1__Impl ;
    public final void rule__Scope__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5543:1: ( rule__Scope__Group_0__1__Impl )
            // InternalMoniLog.g:5544:2: rule__Scope__Group_0__1__Impl
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
    // InternalMoniLog.g:5550:1: rule__Scope__Group_0__1__Impl : ( ( 'globally' )? ) ;
    public final void rule__Scope__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5554:1: ( ( ( 'globally' )? ) )
            // InternalMoniLog.g:5555:1: ( ( 'globally' )? )
            {
            // InternalMoniLog.g:5555:1: ( ( 'globally' )? )
            // InternalMoniLog.g:5556:2: ( 'globally' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 
            }
            // InternalMoniLog.g:5557:2: ( 'globally' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==53) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoniLog.g:5557:3: 'globally'
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
    // InternalMoniLog.g:5566:1: rule__Scope__Group_1__0 : rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 ;
    public final void rule__Scope__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5570:1: ( rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 )
            // InternalMoniLog.g:5571:2: rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1
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
    // InternalMoniLog.g:5578:1: rule__Scope__Group_1__0__Impl : ( () ) ;
    public final void rule__Scope__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5582:1: ( ( () ) )
            // InternalMoniLog.g:5583:1: ( () )
            {
            // InternalMoniLog.g:5583:1: ( () )
            // InternalMoniLog.g:5584:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterAction_1_0()); 
            }
            // InternalMoniLog.g:5585:2: ()
            // InternalMoniLog.g:5585:3: 
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
    // InternalMoniLog.g:5593:1: rule__Scope__Group_1__1 : rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 ;
    public final void rule__Scope__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5597:1: ( rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 )
            // InternalMoniLog.g:5598:2: rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2
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
    // InternalMoniLog.g:5605:1: rule__Scope__Group_1__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5609:1: ( ( 'after' ) )
            // InternalMoniLog.g:5610:1: ( 'after' )
            {
            // InternalMoniLog.g:5610:1: ( 'after' )
            // InternalMoniLog.g:5611:2: 'after'
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
    // InternalMoniLog.g:5620:1: rule__Scope__Group_1__2 : rule__Scope__Group_1__2__Impl ;
    public final void rule__Scope__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5624:1: ( rule__Scope__Group_1__2__Impl )
            // InternalMoniLog.g:5625:2: rule__Scope__Group_1__2__Impl
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
    // InternalMoniLog.g:5631:1: rule__Scope__Group_1__2__Impl : ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) ;
    public final void rule__Scope__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5635:1: ( ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) )
            // InternalMoniLog.g:5636:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            {
            // InternalMoniLog.g:5636:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            // InternalMoniLog.g:5637:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2()); 
            }
            // InternalMoniLog.g:5638:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            // InternalMoniLog.g:5638:3: rule__Scope__LowerBoundAssignment_1_2
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
    // InternalMoniLog.g:5647:1: rule__Scope__Group_2__0 : rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 ;
    public final void rule__Scope__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5651:1: ( rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 )
            // InternalMoniLog.g:5652:2: rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1
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
    // InternalMoniLog.g:5659:1: rule__Scope__Group_2__0__Impl : ( () ) ;
    public final void rule__Scope__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5663:1: ( ( () ) )
            // InternalMoniLog.g:5664:1: ( () )
            {
            // InternalMoniLog.g:5664:1: ( () )
            // InternalMoniLog.g:5665:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBeforeAction_2_0()); 
            }
            // InternalMoniLog.g:5666:2: ()
            // InternalMoniLog.g:5666:3: 
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
    // InternalMoniLog.g:5674:1: rule__Scope__Group_2__1 : rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 ;
    public final void rule__Scope__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5678:1: ( rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 )
            // InternalMoniLog.g:5679:2: rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2
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
    // InternalMoniLog.g:5686:1: rule__Scope__Group_2__1__Impl : ( 'before' ) ;
    public final void rule__Scope__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5690:1: ( ( 'before' ) )
            // InternalMoniLog.g:5691:1: ( 'before' )
            {
            // InternalMoniLog.g:5691:1: ( 'before' )
            // InternalMoniLog.g:5692:2: 'before'
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
    // InternalMoniLog.g:5701:1: rule__Scope__Group_2__2 : rule__Scope__Group_2__2__Impl ;
    public final void rule__Scope__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5705:1: ( rule__Scope__Group_2__2__Impl )
            // InternalMoniLog.g:5706:2: rule__Scope__Group_2__2__Impl
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
    // InternalMoniLog.g:5712:1: rule__Scope__Group_2__2__Impl : ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) ;
    public final void rule__Scope__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5716:1: ( ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) )
            // InternalMoniLog.g:5717:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            {
            // InternalMoniLog.g:5717:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            // InternalMoniLog.g:5718:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2()); 
            }
            // InternalMoniLog.g:5719:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            // InternalMoniLog.g:5719:3: rule__Scope__UpperBoundAssignment_2_2
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
    // InternalMoniLog.g:5728:1: rule__Scope__Group_3__0 : rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 ;
    public final void rule__Scope__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5732:1: ( rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 )
            // InternalMoniLog.g:5733:2: rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1
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
    // InternalMoniLog.g:5740:1: rule__Scope__Group_3__0__Impl : ( () ) ;
    public final void rule__Scope__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5744:1: ( ( () ) )
            // InternalMoniLog.g:5745:1: ( () )
            {
            // InternalMoniLog.g:5745:1: ( () )
            // InternalMoniLog.g:5746:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getBetweenAction_3_0()); 
            }
            // InternalMoniLog.g:5747:2: ()
            // InternalMoniLog.g:5747:3: 
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
    // InternalMoniLog.g:5755:1: rule__Scope__Group_3__1 : rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 ;
    public final void rule__Scope__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5759:1: ( rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 )
            // InternalMoniLog.g:5760:2: rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2
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
    // InternalMoniLog.g:5767:1: rule__Scope__Group_3__1__Impl : ( 'between' ) ;
    public final void rule__Scope__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5771:1: ( ( 'between' ) )
            // InternalMoniLog.g:5772:1: ( 'between' )
            {
            // InternalMoniLog.g:5772:1: ( 'between' )
            // InternalMoniLog.g:5773:2: 'between'
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
    // InternalMoniLog.g:5782:1: rule__Scope__Group_3__2 : rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 ;
    public final void rule__Scope__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5786:1: ( rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 )
            // InternalMoniLog.g:5787:2: rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3
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
    // InternalMoniLog.g:5794:1: rule__Scope__Group_3__2__Impl : ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) ;
    public final void rule__Scope__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5798:1: ( ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) )
            // InternalMoniLog.g:5799:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            {
            // InternalMoniLog.g:5799:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            // InternalMoniLog.g:5800:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2()); 
            }
            // InternalMoniLog.g:5801:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            // InternalMoniLog.g:5801:3: rule__Scope__LowerBoundAssignment_3_2
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
    // InternalMoniLog.g:5809:1: rule__Scope__Group_3__3 : rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 ;
    public final void rule__Scope__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5813:1: ( rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 )
            // InternalMoniLog.g:5814:2: rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4
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
    // InternalMoniLog.g:5821:1: rule__Scope__Group_3__3__Impl : ( 'and' ) ;
    public final void rule__Scope__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5825:1: ( ( 'and' ) )
            // InternalMoniLog.g:5826:1: ( 'and' )
            {
            // InternalMoniLog.g:5826:1: ( 'and' )
            // InternalMoniLog.g:5827:2: 'and'
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
    // InternalMoniLog.g:5836:1: rule__Scope__Group_3__4 : rule__Scope__Group_3__4__Impl ;
    public final void rule__Scope__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5840:1: ( rule__Scope__Group_3__4__Impl )
            // InternalMoniLog.g:5841:2: rule__Scope__Group_3__4__Impl
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
    // InternalMoniLog.g:5847:1: rule__Scope__Group_3__4__Impl : ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) ;
    public final void rule__Scope__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5851:1: ( ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) )
            // InternalMoniLog.g:5852:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            {
            // InternalMoniLog.g:5852:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            // InternalMoniLog.g:5853:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4()); 
            }
            // InternalMoniLog.g:5854:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            // InternalMoniLog.g:5854:3: rule__Scope__UpperBoundAssignment_3_4
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
    // InternalMoniLog.g:5863:1: rule__Scope__Group_4__0 : rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 ;
    public final void rule__Scope__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5867:1: ( rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 )
            // InternalMoniLog.g:5868:2: rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1
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
    // InternalMoniLog.g:5875:1: rule__Scope__Group_4__0__Impl : ( () ) ;
    public final void rule__Scope__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5879:1: ( ( () ) )
            // InternalMoniLog.g:5880:1: ( () )
            {
            // InternalMoniLog.g:5880:1: ( () )
            // InternalMoniLog.g:5881:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getAfterUntilAction_4_0()); 
            }
            // InternalMoniLog.g:5882:2: ()
            // InternalMoniLog.g:5882:3: 
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
    // InternalMoniLog.g:5890:1: rule__Scope__Group_4__1 : rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 ;
    public final void rule__Scope__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5894:1: ( rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 )
            // InternalMoniLog.g:5895:2: rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2
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
    // InternalMoniLog.g:5902:1: rule__Scope__Group_4__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5906:1: ( ( 'after' ) )
            // InternalMoniLog.g:5907:1: ( 'after' )
            {
            // InternalMoniLog.g:5907:1: ( 'after' )
            // InternalMoniLog.g:5908:2: 'after'
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
    // InternalMoniLog.g:5917:1: rule__Scope__Group_4__2 : rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 ;
    public final void rule__Scope__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5921:1: ( rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 )
            // InternalMoniLog.g:5922:2: rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3
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
    // InternalMoniLog.g:5929:1: rule__Scope__Group_4__2__Impl : ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) ;
    public final void rule__Scope__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5933:1: ( ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) )
            // InternalMoniLog.g:5934:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            {
            // InternalMoniLog.g:5934:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            // InternalMoniLog.g:5935:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2()); 
            }
            // InternalMoniLog.g:5936:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            // InternalMoniLog.g:5936:3: rule__Scope__LowerBoundAssignment_4_2
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
    // InternalMoniLog.g:5944:1: rule__Scope__Group_4__3 : rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 ;
    public final void rule__Scope__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5948:1: ( rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 )
            // InternalMoniLog.g:5949:2: rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4
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
    // InternalMoniLog.g:5956:1: rule__Scope__Group_4__3__Impl : ( 'until' ) ;
    public final void rule__Scope__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5960:1: ( ( 'until' ) )
            // InternalMoniLog.g:5961:1: ( 'until' )
            {
            // InternalMoniLog.g:5961:1: ( 'until' )
            // InternalMoniLog.g:5962:2: 'until'
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
    // InternalMoniLog.g:5971:1: rule__Scope__Group_4__4 : rule__Scope__Group_4__4__Impl ;
    public final void rule__Scope__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5975:1: ( rule__Scope__Group_4__4__Impl )
            // InternalMoniLog.g:5976:2: rule__Scope__Group_4__4__Impl
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
    // InternalMoniLog.g:5982:1: rule__Scope__Group_4__4__Impl : ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) ;
    public final void rule__Scope__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:5986:1: ( ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) )
            // InternalMoniLog.g:5987:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            {
            // InternalMoniLog.g:5987:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            // InternalMoniLog.g:5988:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4()); 
            }
            // InternalMoniLog.g:5989:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            // InternalMoniLog.g:5989:3: rule__Scope__UpperBoundAssignment_4_4
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
    // InternalMoniLog.g:5998:1: rule__AppenderCall__Group__0 : rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1 ;
    public final void rule__AppenderCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6002:1: ( rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1 )
            // InternalMoniLog.g:6003:2: rule__AppenderCall__Group__0__Impl rule__AppenderCall__Group__1
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
    // InternalMoniLog.g:6010:1: rule__AppenderCall__Group__0__Impl : ( ( rule__AppenderCall__AppenderAssignment_0 ) ) ;
    public final void rule__AppenderCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6014:1: ( ( ( rule__AppenderCall__AppenderAssignment_0 ) ) )
            // InternalMoniLog.g:6015:1: ( ( rule__AppenderCall__AppenderAssignment_0 ) )
            {
            // InternalMoniLog.g:6015:1: ( ( rule__AppenderCall__AppenderAssignment_0 ) )
            // InternalMoniLog.g:6016:2: ( rule__AppenderCall__AppenderAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAssignment_0()); 
            }
            // InternalMoniLog.g:6017:2: ( rule__AppenderCall__AppenderAssignment_0 )
            // InternalMoniLog.g:6017:3: rule__AppenderCall__AppenderAssignment_0
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
    // InternalMoniLog.g:6025:1: rule__AppenderCall__Group__1 : rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2 ;
    public final void rule__AppenderCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6029:1: ( rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2 )
            // InternalMoniLog.g:6030:2: rule__AppenderCall__Group__1__Impl rule__AppenderCall__Group__2
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
    // InternalMoniLog.g:6037:1: rule__AppenderCall__Group__1__Impl : ( '.' ) ;
    public final void rule__AppenderCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6041:1: ( ( '.' ) )
            // InternalMoniLog.g:6042:1: ( '.' )
            {
            // InternalMoniLog.g:6042:1: ( '.' )
            // InternalMoniLog.g:6043:2: '.'
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
    // InternalMoniLog.g:6052:1: rule__AppenderCall__Group__2 : rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3 ;
    public final void rule__AppenderCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6056:1: ( rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3 )
            // InternalMoniLog.g:6057:2: rule__AppenderCall__Group__2__Impl rule__AppenderCall__Group__3
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
    // InternalMoniLog.g:6064:1: rule__AppenderCall__Group__2__Impl : ( 'call' ) ;
    public final void rule__AppenderCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6068:1: ( ( 'call' ) )
            // InternalMoniLog.g:6069:1: ( 'call' )
            {
            // InternalMoniLog.g:6069:1: ( 'call' )
            // InternalMoniLog.g:6070:2: 'call'
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
    // InternalMoniLog.g:6079:1: rule__AppenderCall__Group__3 : rule__AppenderCall__Group__3__Impl ;
    public final void rule__AppenderCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6083:1: ( rule__AppenderCall__Group__3__Impl )
            // InternalMoniLog.g:6084:2: rule__AppenderCall__Group__3__Impl
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
    // InternalMoniLog.g:6090:1: rule__AppenderCall__Group__3__Impl : ( ( rule__AppenderCall__Group_3__0 )? ) ;
    public final void rule__AppenderCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6094:1: ( ( ( rule__AppenderCall__Group_3__0 )? ) )
            // InternalMoniLog.g:6095:1: ( ( rule__AppenderCall__Group_3__0 )? )
            {
            // InternalMoniLog.g:6095:1: ( ( rule__AppenderCall__Group_3__0 )? )
            // InternalMoniLog.g:6096:2: ( rule__AppenderCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup_3()); 
            }
            // InternalMoniLog.g:6097:2: ( rule__AppenderCall__Group_3__0 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==30) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoniLog.g:6097:3: rule__AppenderCall__Group_3__0
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
    // InternalMoniLog.g:6106:1: rule__AppenderCall__Group_3__0 : rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1 ;
    public final void rule__AppenderCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6110:1: ( rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1 )
            // InternalMoniLog.g:6111:2: rule__AppenderCall__Group_3__0__Impl rule__AppenderCall__Group_3__1
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
    // InternalMoniLog.g:6118:1: rule__AppenderCall__Group_3__0__Impl : ( '(' ) ;
    public final void rule__AppenderCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6122:1: ( ( '(' ) )
            // InternalMoniLog.g:6123:1: ( '(' )
            {
            // InternalMoniLog.g:6123:1: ( '(' )
            // InternalMoniLog.g:6124:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6133:1: rule__AppenderCall__Group_3__1 : rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2 ;
    public final void rule__AppenderCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6137:1: ( rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2 )
            // InternalMoniLog.g:6138:2: rule__AppenderCall__Group_3__1__Impl rule__AppenderCall__Group_3__2
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
    // InternalMoniLog.g:6145:1: rule__AppenderCall__Group_3__1__Impl : ( ( rule__AppenderCall__ArgsAssignment_3_1 ) ) ;
    public final void rule__AppenderCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6149:1: ( ( ( rule__AppenderCall__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog.g:6150:1: ( ( rule__AppenderCall__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog.g:6150:1: ( ( rule__AppenderCall__ArgsAssignment_3_1 ) )
            // InternalMoniLog.g:6151:2: ( rule__AppenderCall__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog.g:6152:2: ( rule__AppenderCall__ArgsAssignment_3_1 )
            // InternalMoniLog.g:6152:3: rule__AppenderCall__ArgsAssignment_3_1
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
    // InternalMoniLog.g:6160:1: rule__AppenderCall__Group_3__2 : rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3 ;
    public final void rule__AppenderCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6164:1: ( rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3 )
            // InternalMoniLog.g:6165:2: rule__AppenderCall__Group_3__2__Impl rule__AppenderCall__Group_3__3
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
    // InternalMoniLog.g:6172:1: rule__AppenderCall__Group_3__2__Impl : ( ( rule__AppenderCall__Group_3_2__0 )* ) ;
    public final void rule__AppenderCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6176:1: ( ( ( rule__AppenderCall__Group_3_2__0 )* ) )
            // InternalMoniLog.g:6177:1: ( ( rule__AppenderCall__Group_3_2__0 )* )
            {
            // InternalMoniLog.g:6177:1: ( ( rule__AppenderCall__Group_3_2__0 )* )
            // InternalMoniLog.g:6178:2: ( rule__AppenderCall__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getGroup_3_2()); 
            }
            // InternalMoniLog.g:6179:2: ( rule__AppenderCall__Group_3_2__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==33) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMoniLog.g:6179:3: rule__AppenderCall__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__AppenderCall__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalMoniLog.g:6187:1: rule__AppenderCall__Group_3__3 : rule__AppenderCall__Group_3__3__Impl ;
    public final void rule__AppenderCall__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6191:1: ( rule__AppenderCall__Group_3__3__Impl )
            // InternalMoniLog.g:6192:2: rule__AppenderCall__Group_3__3__Impl
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
    // InternalMoniLog.g:6198:1: rule__AppenderCall__Group_3__3__Impl : ( ')' ) ;
    public final void rule__AppenderCall__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6202:1: ( ( ')' ) )
            // InternalMoniLog.g:6203:1: ( ')' )
            {
            // InternalMoniLog.g:6203:1: ( ')' )
            // InternalMoniLog.g:6204:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6214:1: rule__AppenderCall__Group_3_2__0 : rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1 ;
    public final void rule__AppenderCall__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6218:1: ( rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1 )
            // InternalMoniLog.g:6219:2: rule__AppenderCall__Group_3_2__0__Impl rule__AppenderCall__Group_3_2__1
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
    // InternalMoniLog.g:6226:1: rule__AppenderCall__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__AppenderCall__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6230:1: ( ( ',' ) )
            // InternalMoniLog.g:6231:1: ( ',' )
            {
            // InternalMoniLog.g:6231:1: ( ',' )
            // InternalMoniLog.g:6232:2: ','
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
    // InternalMoniLog.g:6241:1: rule__AppenderCall__Group_3_2__1 : rule__AppenderCall__Group_3_2__1__Impl ;
    public final void rule__AppenderCall__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6245:1: ( rule__AppenderCall__Group_3_2__1__Impl )
            // InternalMoniLog.g:6246:2: rule__AppenderCall__Group_3_2__1__Impl
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
    // InternalMoniLog.g:6252:1: rule__AppenderCall__Group_3_2__1__Impl : ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__AppenderCall__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6256:1: ( ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog.g:6257:1: ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog.g:6257:1: ( ( rule__AppenderCall__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog.g:6258:2: ( rule__AppenderCall__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog.g:6259:2: ( rule__AppenderCall__ArgsAssignment_3_2_1 )
            // InternalMoniLog.g:6259:3: rule__AppenderCall__ArgsAssignment_3_2_1
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
    // InternalMoniLog.g:6268:1: rule__LayoutCall__Group__0 : rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1 ;
    public final void rule__LayoutCall__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6272:1: ( rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1 )
            // InternalMoniLog.g:6273:2: rule__LayoutCall__Group__0__Impl rule__LayoutCall__Group__1
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
    // InternalMoniLog.g:6280:1: rule__LayoutCall__Group__0__Impl : ( ( rule__LayoutCall__LayoutAssignment_0 ) ) ;
    public final void rule__LayoutCall__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6284:1: ( ( ( rule__LayoutCall__LayoutAssignment_0 ) ) )
            // InternalMoniLog.g:6285:1: ( ( rule__LayoutCall__LayoutAssignment_0 ) )
            {
            // InternalMoniLog.g:6285:1: ( ( rule__LayoutCall__LayoutAssignment_0 ) )
            // InternalMoniLog.g:6286:2: ( rule__LayoutCall__LayoutAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutAssignment_0()); 
            }
            // InternalMoniLog.g:6287:2: ( rule__LayoutCall__LayoutAssignment_0 )
            // InternalMoniLog.g:6287:3: rule__LayoutCall__LayoutAssignment_0
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
    // InternalMoniLog.g:6295:1: rule__LayoutCall__Group__1 : rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2 ;
    public final void rule__LayoutCall__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6299:1: ( rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2 )
            // InternalMoniLog.g:6300:2: rule__LayoutCall__Group__1__Impl rule__LayoutCall__Group__2
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
    // InternalMoniLog.g:6307:1: rule__LayoutCall__Group__1__Impl : ( '.' ) ;
    public final void rule__LayoutCall__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6311:1: ( ( '.' ) )
            // InternalMoniLog.g:6312:1: ( '.' )
            {
            // InternalMoniLog.g:6312:1: ( '.' )
            // InternalMoniLog.g:6313:2: '.'
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
    // InternalMoniLog.g:6322:1: rule__LayoutCall__Group__2 : rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3 ;
    public final void rule__LayoutCall__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6326:1: ( rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3 )
            // InternalMoniLog.g:6327:2: rule__LayoutCall__Group__2__Impl rule__LayoutCall__Group__3
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
    // InternalMoniLog.g:6334:1: rule__LayoutCall__Group__2__Impl : ( 'call' ) ;
    public final void rule__LayoutCall__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6338:1: ( ( 'call' ) )
            // InternalMoniLog.g:6339:1: ( 'call' )
            {
            // InternalMoniLog.g:6339:1: ( 'call' )
            // InternalMoniLog.g:6340:2: 'call'
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
    // InternalMoniLog.g:6349:1: rule__LayoutCall__Group__3 : rule__LayoutCall__Group__3__Impl ;
    public final void rule__LayoutCall__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6353:1: ( rule__LayoutCall__Group__3__Impl )
            // InternalMoniLog.g:6354:2: rule__LayoutCall__Group__3__Impl
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
    // InternalMoniLog.g:6360:1: rule__LayoutCall__Group__3__Impl : ( ( rule__LayoutCall__Group_3__0 )? ) ;
    public final void rule__LayoutCall__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6364:1: ( ( ( rule__LayoutCall__Group_3__0 )? ) )
            // InternalMoniLog.g:6365:1: ( ( rule__LayoutCall__Group_3__0 )? )
            {
            // InternalMoniLog.g:6365:1: ( ( rule__LayoutCall__Group_3__0 )? )
            // InternalMoniLog.g:6366:2: ( rule__LayoutCall__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup_3()); 
            }
            // InternalMoniLog.g:6367:2: ( rule__LayoutCall__Group_3__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==30) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoniLog.g:6367:3: rule__LayoutCall__Group_3__0
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
    // InternalMoniLog.g:6376:1: rule__LayoutCall__Group_3__0 : rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1 ;
    public final void rule__LayoutCall__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6380:1: ( rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1 )
            // InternalMoniLog.g:6381:2: rule__LayoutCall__Group_3__0__Impl rule__LayoutCall__Group_3__1
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
    // InternalMoniLog.g:6388:1: rule__LayoutCall__Group_3__0__Impl : ( '(' ) ;
    public final void rule__LayoutCall__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6392:1: ( ( '(' ) )
            // InternalMoniLog.g:6393:1: ( '(' )
            {
            // InternalMoniLog.g:6393:1: ( '(' )
            // InternalMoniLog.g:6394:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6403:1: rule__LayoutCall__Group_3__1 : rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2 ;
    public final void rule__LayoutCall__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6407:1: ( rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2 )
            // InternalMoniLog.g:6408:2: rule__LayoutCall__Group_3__1__Impl rule__LayoutCall__Group_3__2
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
    // InternalMoniLog.g:6415:1: rule__LayoutCall__Group_3__1__Impl : ( ( rule__LayoutCall__ArgsAssignment_3_1 ) ) ;
    public final void rule__LayoutCall__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6419:1: ( ( ( rule__LayoutCall__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog.g:6420:1: ( ( rule__LayoutCall__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog.g:6420:1: ( ( rule__LayoutCall__ArgsAssignment_3_1 ) )
            // InternalMoniLog.g:6421:2: ( rule__LayoutCall__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog.g:6422:2: ( rule__LayoutCall__ArgsAssignment_3_1 )
            // InternalMoniLog.g:6422:3: rule__LayoutCall__ArgsAssignment_3_1
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
    // InternalMoniLog.g:6430:1: rule__LayoutCall__Group_3__2 : rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3 ;
    public final void rule__LayoutCall__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6434:1: ( rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3 )
            // InternalMoniLog.g:6435:2: rule__LayoutCall__Group_3__2__Impl rule__LayoutCall__Group_3__3
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
    // InternalMoniLog.g:6442:1: rule__LayoutCall__Group_3__2__Impl : ( ( rule__LayoutCall__Group_3_2__0 )* ) ;
    public final void rule__LayoutCall__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6446:1: ( ( ( rule__LayoutCall__Group_3_2__0 )* ) )
            // InternalMoniLog.g:6447:1: ( ( rule__LayoutCall__Group_3_2__0 )* )
            {
            // InternalMoniLog.g:6447:1: ( ( rule__LayoutCall__Group_3_2__0 )* )
            // InternalMoniLog.g:6448:2: ( rule__LayoutCall__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getGroup_3_2()); 
            }
            // InternalMoniLog.g:6449:2: ( rule__LayoutCall__Group_3_2__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==33) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMoniLog.g:6449:3: rule__LayoutCall__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__LayoutCall__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalMoniLog.g:6457:1: rule__LayoutCall__Group_3__3 : rule__LayoutCall__Group_3__3__Impl ;
    public final void rule__LayoutCall__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6461:1: ( rule__LayoutCall__Group_3__3__Impl )
            // InternalMoniLog.g:6462:2: rule__LayoutCall__Group_3__3__Impl
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
    // InternalMoniLog.g:6468:1: rule__LayoutCall__Group_3__3__Impl : ( ')' ) ;
    public final void rule__LayoutCall__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6472:1: ( ( ')' ) )
            // InternalMoniLog.g:6473:1: ( ')' )
            {
            // InternalMoniLog.g:6473:1: ( ')' )
            // InternalMoniLog.g:6474:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6484:1: rule__LayoutCall__Group_3_2__0 : rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1 ;
    public final void rule__LayoutCall__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6488:1: ( rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1 )
            // InternalMoniLog.g:6489:2: rule__LayoutCall__Group_3_2__0__Impl rule__LayoutCall__Group_3_2__1
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
    // InternalMoniLog.g:6496:1: rule__LayoutCall__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__LayoutCall__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6500:1: ( ( ',' ) )
            // InternalMoniLog.g:6501:1: ( ',' )
            {
            // InternalMoniLog.g:6501:1: ( ',' )
            // InternalMoniLog.g:6502:2: ','
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
    // InternalMoniLog.g:6511:1: rule__LayoutCall__Group_3_2__1 : rule__LayoutCall__Group_3_2__1__Impl ;
    public final void rule__LayoutCall__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6515:1: ( rule__LayoutCall__Group_3_2__1__Impl )
            // InternalMoniLog.g:6516:2: rule__LayoutCall__Group_3_2__1__Impl
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
    // InternalMoniLog.g:6522:1: rule__LayoutCall__Group_3_2__1__Impl : ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__LayoutCall__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6526:1: ( ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog.g:6527:1: ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog.g:6527:1: ( ( rule__LayoutCall__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog.g:6528:2: ( rule__LayoutCall__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog.g:6529:2: ( rule__LayoutCall__ArgsAssignment_3_2_1 )
            // InternalMoniLog.g:6529:3: rule__LayoutCall__ArgsAssignment_3_2_1
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
    // InternalMoniLog.g:6538:1: rule__EmitEvent__Group__0 : rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1 ;
    public final void rule__EmitEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6542:1: ( rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1 )
            // InternalMoniLog.g:6543:2: rule__EmitEvent__Group__0__Impl rule__EmitEvent__Group__1
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
    // InternalMoniLog.g:6550:1: rule__EmitEvent__Group__0__Impl : ( ( rule__EmitEvent__EventAssignment_0 ) ) ;
    public final void rule__EmitEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6554:1: ( ( ( rule__EmitEvent__EventAssignment_0 ) ) )
            // InternalMoniLog.g:6555:1: ( ( rule__EmitEvent__EventAssignment_0 ) )
            {
            // InternalMoniLog.g:6555:1: ( ( rule__EmitEvent__EventAssignment_0 ) )
            // InternalMoniLog.g:6556:2: ( rule__EmitEvent__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventAssignment_0()); 
            }
            // InternalMoniLog.g:6557:2: ( rule__EmitEvent__EventAssignment_0 )
            // InternalMoniLog.g:6557:3: rule__EmitEvent__EventAssignment_0
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
    // InternalMoniLog.g:6565:1: rule__EmitEvent__Group__1 : rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2 ;
    public final void rule__EmitEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6569:1: ( rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2 )
            // InternalMoniLog.g:6570:2: rule__EmitEvent__Group__1__Impl rule__EmitEvent__Group__2
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
    // InternalMoniLog.g:6577:1: rule__EmitEvent__Group__1__Impl : ( '.' ) ;
    public final void rule__EmitEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6581:1: ( ( '.' ) )
            // InternalMoniLog.g:6582:1: ( '.' )
            {
            // InternalMoniLog.g:6582:1: ( '.' )
            // InternalMoniLog.g:6583:2: '.'
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
    // InternalMoniLog.g:6592:1: rule__EmitEvent__Group__2 : rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3 ;
    public final void rule__EmitEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6596:1: ( rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3 )
            // InternalMoniLog.g:6597:2: rule__EmitEvent__Group__2__Impl rule__EmitEvent__Group__3
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
    // InternalMoniLog.g:6604:1: rule__EmitEvent__Group__2__Impl : ( 'emit' ) ;
    public final void rule__EmitEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6608:1: ( ( 'emit' ) )
            // InternalMoniLog.g:6609:1: ( 'emit' )
            {
            // InternalMoniLog.g:6609:1: ( 'emit' )
            // InternalMoniLog.g:6610:2: 'emit'
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
    // InternalMoniLog.g:6619:1: rule__EmitEvent__Group__3 : rule__EmitEvent__Group__3__Impl ;
    public final void rule__EmitEvent__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6623:1: ( rule__EmitEvent__Group__3__Impl )
            // InternalMoniLog.g:6624:2: rule__EmitEvent__Group__3__Impl
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
    // InternalMoniLog.g:6630:1: rule__EmitEvent__Group__3__Impl : ( ( rule__EmitEvent__Group_3__0 )? ) ;
    public final void rule__EmitEvent__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6634:1: ( ( ( rule__EmitEvent__Group_3__0 )? ) )
            // InternalMoniLog.g:6635:1: ( ( rule__EmitEvent__Group_3__0 )? )
            {
            // InternalMoniLog.g:6635:1: ( ( rule__EmitEvent__Group_3__0 )? )
            // InternalMoniLog.g:6636:2: ( rule__EmitEvent__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup_3()); 
            }
            // InternalMoniLog.g:6637:2: ( rule__EmitEvent__Group_3__0 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==30) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoniLog.g:6637:3: rule__EmitEvent__Group_3__0
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
    // InternalMoniLog.g:6646:1: rule__EmitEvent__Group_3__0 : rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1 ;
    public final void rule__EmitEvent__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6650:1: ( rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1 )
            // InternalMoniLog.g:6651:2: rule__EmitEvent__Group_3__0__Impl rule__EmitEvent__Group_3__1
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
    // InternalMoniLog.g:6658:1: rule__EmitEvent__Group_3__0__Impl : ( '(' ) ;
    public final void rule__EmitEvent__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6662:1: ( ( '(' ) )
            // InternalMoniLog.g:6663:1: ( '(' )
            {
            // InternalMoniLog.g:6663:1: ( '(' )
            // InternalMoniLog.g:6664:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getLeftParenthesisKeyword_3_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6673:1: rule__EmitEvent__Group_3__1 : rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2 ;
    public final void rule__EmitEvent__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6677:1: ( rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2 )
            // InternalMoniLog.g:6678:2: rule__EmitEvent__Group_3__1__Impl rule__EmitEvent__Group_3__2
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
    // InternalMoniLog.g:6685:1: rule__EmitEvent__Group_3__1__Impl : ( ( rule__EmitEvent__ArgsAssignment_3_1 ) ) ;
    public final void rule__EmitEvent__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6689:1: ( ( ( rule__EmitEvent__ArgsAssignment_3_1 ) ) )
            // InternalMoniLog.g:6690:1: ( ( rule__EmitEvent__ArgsAssignment_3_1 ) )
            {
            // InternalMoniLog.g:6690:1: ( ( rule__EmitEvent__ArgsAssignment_3_1 ) )
            // InternalMoniLog.g:6691:2: ( rule__EmitEvent__ArgsAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsAssignment_3_1()); 
            }
            // InternalMoniLog.g:6692:2: ( rule__EmitEvent__ArgsAssignment_3_1 )
            // InternalMoniLog.g:6692:3: rule__EmitEvent__ArgsAssignment_3_1
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
    // InternalMoniLog.g:6700:1: rule__EmitEvent__Group_3__2 : rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3 ;
    public final void rule__EmitEvent__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6704:1: ( rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3 )
            // InternalMoniLog.g:6705:2: rule__EmitEvent__Group_3__2__Impl rule__EmitEvent__Group_3__3
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
    // InternalMoniLog.g:6712:1: rule__EmitEvent__Group_3__2__Impl : ( ( rule__EmitEvent__Group_3_2__0 )* ) ;
    public final void rule__EmitEvent__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6716:1: ( ( ( rule__EmitEvent__Group_3_2__0 )* ) )
            // InternalMoniLog.g:6717:1: ( ( rule__EmitEvent__Group_3_2__0 )* )
            {
            // InternalMoniLog.g:6717:1: ( ( rule__EmitEvent__Group_3_2__0 )* )
            // InternalMoniLog.g:6718:2: ( rule__EmitEvent__Group_3_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getGroup_3_2()); 
            }
            // InternalMoniLog.g:6719:2: ( rule__EmitEvent__Group_3_2__0 )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==33) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMoniLog.g:6719:3: rule__EmitEvent__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__EmitEvent__Group_3_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop49;
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
    // InternalMoniLog.g:6727:1: rule__EmitEvent__Group_3__3 : rule__EmitEvent__Group_3__3__Impl ;
    public final void rule__EmitEvent__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6731:1: ( rule__EmitEvent__Group_3__3__Impl )
            // InternalMoniLog.g:6732:2: rule__EmitEvent__Group_3__3__Impl
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
    // InternalMoniLog.g:6738:1: rule__EmitEvent__Group_3__3__Impl : ( ')' ) ;
    public final void rule__EmitEvent__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6742:1: ( ( ')' ) )
            // InternalMoniLog.g:6743:1: ( ')' )
            {
            // InternalMoniLog.g:6743:1: ( ')' )
            // InternalMoniLog.g:6744:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getRightParenthesisKeyword_3_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6754:1: rule__EmitEvent__Group_3_2__0 : rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1 ;
    public final void rule__EmitEvent__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6758:1: ( rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1 )
            // InternalMoniLog.g:6759:2: rule__EmitEvent__Group_3_2__0__Impl rule__EmitEvent__Group_3_2__1
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
    // InternalMoniLog.g:6766:1: rule__EmitEvent__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__EmitEvent__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6770:1: ( ( ',' ) )
            // InternalMoniLog.g:6771:1: ( ',' )
            {
            // InternalMoniLog.g:6771:1: ( ',' )
            // InternalMoniLog.g:6772:2: ','
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
    // InternalMoniLog.g:6781:1: rule__EmitEvent__Group_3_2__1 : rule__EmitEvent__Group_3_2__1__Impl ;
    public final void rule__EmitEvent__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6785:1: ( rule__EmitEvent__Group_3_2__1__Impl )
            // InternalMoniLog.g:6786:2: rule__EmitEvent__Group_3_2__1__Impl
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
    // InternalMoniLog.g:6792:1: rule__EmitEvent__Group_3_2__1__Impl : ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) ) ;
    public final void rule__EmitEvent__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6796:1: ( ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) ) )
            // InternalMoniLog.g:6797:1: ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) )
            {
            // InternalMoniLog.g:6797:1: ( ( rule__EmitEvent__ArgsAssignment_3_2_1 ) )
            // InternalMoniLog.g:6798:2: ( rule__EmitEvent__ArgsAssignment_3_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getArgsAssignment_3_2_1()); 
            }
            // InternalMoniLog.g:6799:2: ( rule__EmitEvent__ArgsAssignment_3_2_1 )
            // InternalMoniLog.g:6799:3: rule__EmitEvent__ArgsAssignment_3_2_1
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
    // InternalMoniLog.g:6808:1: rule__SetVariable__Group__0 : rule__SetVariable__Group__0__Impl rule__SetVariable__Group__1 ;
    public final void rule__SetVariable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6812:1: ( rule__SetVariable__Group__0__Impl rule__SetVariable__Group__1 )
            // InternalMoniLog.g:6813:2: rule__SetVariable__Group__0__Impl rule__SetVariable__Group__1
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
    // InternalMoniLog.g:6820:1: rule__SetVariable__Group__0__Impl : ( 'set' ) ;
    public final void rule__SetVariable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6824:1: ( ( 'set' ) )
            // InternalMoniLog.g:6825:1: ( 'set' )
            {
            // InternalMoniLog.g:6825:1: ( 'set' )
            // InternalMoniLog.g:6826:2: 'set'
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
    // InternalMoniLog.g:6835:1: rule__SetVariable__Group__1 : rule__SetVariable__Group__1__Impl rule__SetVariable__Group__2 ;
    public final void rule__SetVariable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6839:1: ( rule__SetVariable__Group__1__Impl rule__SetVariable__Group__2 )
            // InternalMoniLog.g:6840:2: rule__SetVariable__Group__1__Impl rule__SetVariable__Group__2
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
    // InternalMoniLog.g:6847:1: rule__SetVariable__Group__1__Impl : ( '(' ) ;
    public final void rule__SetVariable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6851:1: ( ( '(' ) )
            // InternalMoniLog.g:6852:1: ( '(' )
            {
            // InternalMoniLog.g:6852:1: ( '(' )
            // InternalMoniLog.g:6853:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6862:1: rule__SetVariable__Group__2 : rule__SetVariable__Group__2__Impl rule__SetVariable__Group__3 ;
    public final void rule__SetVariable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6866:1: ( rule__SetVariable__Group__2__Impl rule__SetVariable__Group__3 )
            // InternalMoniLog.g:6867:2: rule__SetVariable__Group__2__Impl rule__SetVariable__Group__3
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
    // InternalMoniLog.g:6874:1: rule__SetVariable__Group__2__Impl : ( ( rule__SetVariable__VariableAssignment_2 ) ) ;
    public final void rule__SetVariable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6878:1: ( ( ( rule__SetVariable__VariableAssignment_2 ) ) )
            // InternalMoniLog.g:6879:1: ( ( rule__SetVariable__VariableAssignment_2 ) )
            {
            // InternalMoniLog.g:6879:1: ( ( rule__SetVariable__VariableAssignment_2 ) )
            // InternalMoniLog.g:6880:2: ( rule__SetVariable__VariableAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getVariableAssignment_2()); 
            }
            // InternalMoniLog.g:6881:2: ( rule__SetVariable__VariableAssignment_2 )
            // InternalMoniLog.g:6881:3: rule__SetVariable__VariableAssignment_2
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
    // InternalMoniLog.g:6889:1: rule__SetVariable__Group__3 : rule__SetVariable__Group__3__Impl rule__SetVariable__Group__4 ;
    public final void rule__SetVariable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6893:1: ( rule__SetVariable__Group__3__Impl rule__SetVariable__Group__4 )
            // InternalMoniLog.g:6894:2: rule__SetVariable__Group__3__Impl rule__SetVariable__Group__4
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
    // InternalMoniLog.g:6901:1: rule__SetVariable__Group__3__Impl : ( ',' ) ;
    public final void rule__SetVariable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6905:1: ( ( ',' ) )
            // InternalMoniLog.g:6906:1: ( ',' )
            {
            // InternalMoniLog.g:6906:1: ( ',' )
            // InternalMoniLog.g:6907:2: ','
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
    // InternalMoniLog.g:6916:1: rule__SetVariable__Group__4 : rule__SetVariable__Group__4__Impl rule__SetVariable__Group__5 ;
    public final void rule__SetVariable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6920:1: ( rule__SetVariable__Group__4__Impl rule__SetVariable__Group__5 )
            // InternalMoniLog.g:6921:2: rule__SetVariable__Group__4__Impl rule__SetVariable__Group__5
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
    // InternalMoniLog.g:6928:1: rule__SetVariable__Group__4__Impl : ( ( rule__SetVariable__ValueAssignment_4 ) ) ;
    public final void rule__SetVariable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6932:1: ( ( ( rule__SetVariable__ValueAssignment_4 ) ) )
            // InternalMoniLog.g:6933:1: ( ( rule__SetVariable__ValueAssignment_4 ) )
            {
            // InternalMoniLog.g:6933:1: ( ( rule__SetVariable__ValueAssignment_4 ) )
            // InternalMoniLog.g:6934:2: ( rule__SetVariable__ValueAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getValueAssignment_4()); 
            }
            // InternalMoniLog.g:6935:2: ( rule__SetVariable__ValueAssignment_4 )
            // InternalMoniLog.g:6935:3: rule__SetVariable__ValueAssignment_4
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
    // InternalMoniLog.g:6943:1: rule__SetVariable__Group__5 : rule__SetVariable__Group__5__Impl ;
    public final void rule__SetVariable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6947:1: ( rule__SetVariable__Group__5__Impl )
            // InternalMoniLog.g:6948:2: rule__SetVariable__Group__5__Impl
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
    // InternalMoniLog.g:6954:1: rule__SetVariable__Group__5__Impl : ( ')' ) ;
    public final void rule__SetVariable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6958:1: ( ( ')' ) )
            // InternalMoniLog.g:6959:1: ( ')' )
            {
            // InternalMoniLog.g:6959:1: ( ')' )
            // InternalMoniLog.g:6960:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSetVariableAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:6970:1: rule__MoniloggerCall__Group_0__0 : rule__MoniloggerCall__Group_0__0__Impl rule__MoniloggerCall__Group_0__1 ;
    public final void rule__MoniloggerCall__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6974:1: ( rule__MoniloggerCall__Group_0__0__Impl rule__MoniloggerCall__Group_0__1 )
            // InternalMoniLog.g:6975:2: rule__MoniloggerCall__Group_0__0__Impl rule__MoniloggerCall__Group_0__1
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
    // InternalMoniLog.g:6982:1: rule__MoniloggerCall__Group_0__0__Impl : ( () ) ;
    public final void rule__MoniloggerCall__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:6986:1: ( ( () ) )
            // InternalMoniLog.g:6987:1: ( () )
            {
            // InternalMoniLog.g:6987:1: ( () )
            // InternalMoniLog.g:6988:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getStartMoniLoggerAction_0_0()); 
            }
            // InternalMoniLog.g:6989:2: ()
            // InternalMoniLog.g:6989:3: 
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
    // InternalMoniLog.g:6997:1: rule__MoniloggerCall__Group_0__1 : rule__MoniloggerCall__Group_0__1__Impl rule__MoniloggerCall__Group_0__2 ;
    public final void rule__MoniloggerCall__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7001:1: ( rule__MoniloggerCall__Group_0__1__Impl rule__MoniloggerCall__Group_0__2 )
            // InternalMoniLog.g:7002:2: rule__MoniloggerCall__Group_0__1__Impl rule__MoniloggerCall__Group_0__2
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
    // InternalMoniLog.g:7009:1: rule__MoniloggerCall__Group_0__1__Impl : ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) ) ;
    public final void rule__MoniloggerCall__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7013:1: ( ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) ) )
            // InternalMoniLog.g:7014:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) )
            {
            // InternalMoniLog.g:7014:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_0_1 ) )
            // InternalMoniLog.g:7015:2: ( rule__MoniloggerCall__MoniloggerAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerAssignment_0_1()); 
            }
            // InternalMoniLog.g:7016:2: ( rule__MoniloggerCall__MoniloggerAssignment_0_1 )
            // InternalMoniLog.g:7016:3: rule__MoniloggerCall__MoniloggerAssignment_0_1
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
    // InternalMoniLog.g:7024:1: rule__MoniloggerCall__Group_0__2 : rule__MoniloggerCall__Group_0__2__Impl rule__MoniloggerCall__Group_0__3 ;
    public final void rule__MoniloggerCall__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7028:1: ( rule__MoniloggerCall__Group_0__2__Impl rule__MoniloggerCall__Group_0__3 )
            // InternalMoniLog.g:7029:2: rule__MoniloggerCall__Group_0__2__Impl rule__MoniloggerCall__Group_0__3
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
    // InternalMoniLog.g:7036:1: rule__MoniloggerCall__Group_0__2__Impl : ( '.' ) ;
    public final void rule__MoniloggerCall__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7040:1: ( ( '.' ) )
            // InternalMoniLog.g:7041:1: ( '.' )
            {
            // InternalMoniLog.g:7041:1: ( '.' )
            // InternalMoniLog.g:7042:2: '.'
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
    // InternalMoniLog.g:7051:1: rule__MoniloggerCall__Group_0__3 : rule__MoniloggerCall__Group_0__3__Impl rule__MoniloggerCall__Group_0__4 ;
    public final void rule__MoniloggerCall__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7055:1: ( rule__MoniloggerCall__Group_0__3__Impl rule__MoniloggerCall__Group_0__4 )
            // InternalMoniLog.g:7056:2: rule__MoniloggerCall__Group_0__3__Impl rule__MoniloggerCall__Group_0__4
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
    // InternalMoniLog.g:7063:1: rule__MoniloggerCall__Group_0__3__Impl : ( 'start' ) ;
    public final void rule__MoniloggerCall__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7067:1: ( ( 'start' ) )
            // InternalMoniLog.g:7068:1: ( 'start' )
            {
            // InternalMoniLog.g:7068:1: ( 'start' )
            // InternalMoniLog.g:7069:2: 'start'
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
    // InternalMoniLog.g:7078:1: rule__MoniloggerCall__Group_0__4 : rule__MoniloggerCall__Group_0__4__Impl ;
    public final void rule__MoniloggerCall__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7082:1: ( rule__MoniloggerCall__Group_0__4__Impl )
            // InternalMoniLog.g:7083:2: rule__MoniloggerCall__Group_0__4__Impl
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
    // InternalMoniLog.g:7089:1: rule__MoniloggerCall__Group_0__4__Impl : ( ( rule__MoniloggerCall__Group_0_4__0 )? ) ;
    public final void rule__MoniloggerCall__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7093:1: ( ( ( rule__MoniloggerCall__Group_0_4__0 )? ) )
            // InternalMoniLog.g:7094:1: ( ( rule__MoniloggerCall__Group_0_4__0 )? )
            {
            // InternalMoniLog.g:7094:1: ( ( rule__MoniloggerCall__Group_0_4__0 )? )
            // InternalMoniLog.g:7095:2: ( rule__MoniloggerCall__Group_0_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getGroup_0_4()); 
            }
            // InternalMoniLog.g:7096:2: ( rule__MoniloggerCall__Group_0_4__0 )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==30) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoniLog.g:7096:3: rule__MoniloggerCall__Group_0_4__0
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
    // InternalMoniLog.g:7105:1: rule__MoniloggerCall__Group_0_4__0 : rule__MoniloggerCall__Group_0_4__0__Impl rule__MoniloggerCall__Group_0_4__1 ;
    public final void rule__MoniloggerCall__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7109:1: ( rule__MoniloggerCall__Group_0_4__0__Impl rule__MoniloggerCall__Group_0_4__1 )
            // InternalMoniLog.g:7110:2: rule__MoniloggerCall__Group_0_4__0__Impl rule__MoniloggerCall__Group_0_4__1
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
    // InternalMoniLog.g:7117:1: rule__MoniloggerCall__Group_0_4__0__Impl : ( '(' ) ;
    public final void rule__MoniloggerCall__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7121:1: ( ( '(' ) )
            // InternalMoniLog.g:7122:1: ( '(' )
            {
            // InternalMoniLog.g:7122:1: ( '(' )
            // InternalMoniLog.g:7123:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getLeftParenthesisKeyword_0_4_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:7132:1: rule__MoniloggerCall__Group_0_4__1 : rule__MoniloggerCall__Group_0_4__1__Impl rule__MoniloggerCall__Group_0_4__2 ;
    public final void rule__MoniloggerCall__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7136:1: ( rule__MoniloggerCall__Group_0_4__1__Impl rule__MoniloggerCall__Group_0_4__2 )
            // InternalMoniLog.g:7137:2: rule__MoniloggerCall__Group_0_4__1__Impl rule__MoniloggerCall__Group_0_4__2
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
    // InternalMoniLog.g:7144:1: rule__MoniloggerCall__Group_0_4__1__Impl : ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) ) ;
    public final void rule__MoniloggerCall__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7148:1: ( ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) ) )
            // InternalMoniLog.g:7149:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) )
            {
            // InternalMoniLog.g:7149:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_1 ) )
            // InternalMoniLog.g:7150:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getArgsAssignment_0_4_1()); 
            }
            // InternalMoniLog.g:7151:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_1 )
            // InternalMoniLog.g:7151:3: rule__MoniloggerCall__ArgsAssignment_0_4_1
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
    // InternalMoniLog.g:7159:1: rule__MoniloggerCall__Group_0_4__2 : rule__MoniloggerCall__Group_0_4__2__Impl rule__MoniloggerCall__Group_0_4__3 ;
    public final void rule__MoniloggerCall__Group_0_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7163:1: ( rule__MoniloggerCall__Group_0_4__2__Impl rule__MoniloggerCall__Group_0_4__3 )
            // InternalMoniLog.g:7164:2: rule__MoniloggerCall__Group_0_4__2__Impl rule__MoniloggerCall__Group_0_4__3
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
    // InternalMoniLog.g:7171:1: rule__MoniloggerCall__Group_0_4__2__Impl : ( ( rule__MoniloggerCall__Group_0_4_2__0 )* ) ;
    public final void rule__MoniloggerCall__Group_0_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7175:1: ( ( ( rule__MoniloggerCall__Group_0_4_2__0 )* ) )
            // InternalMoniLog.g:7176:1: ( ( rule__MoniloggerCall__Group_0_4_2__0 )* )
            {
            // InternalMoniLog.g:7176:1: ( ( rule__MoniloggerCall__Group_0_4_2__0 )* )
            // InternalMoniLog.g:7177:2: ( rule__MoniloggerCall__Group_0_4_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getGroup_0_4_2()); 
            }
            // InternalMoniLog.g:7178:2: ( rule__MoniloggerCall__Group_0_4_2__0 )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==33) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMoniLog.g:7178:3: rule__MoniloggerCall__Group_0_4_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MoniloggerCall__Group_0_4_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop51;
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
    // InternalMoniLog.g:7186:1: rule__MoniloggerCall__Group_0_4__3 : rule__MoniloggerCall__Group_0_4__3__Impl ;
    public final void rule__MoniloggerCall__Group_0_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7190:1: ( rule__MoniloggerCall__Group_0_4__3__Impl )
            // InternalMoniLog.g:7191:2: rule__MoniloggerCall__Group_0_4__3__Impl
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
    // InternalMoniLog.g:7197:1: rule__MoniloggerCall__Group_0_4__3__Impl : ( ')' ) ;
    public final void rule__MoniloggerCall__Group_0_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7201:1: ( ( ')' ) )
            // InternalMoniLog.g:7202:1: ( ')' )
            {
            // InternalMoniLog.g:7202:1: ( ')' )
            // InternalMoniLog.g:7203:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getRightParenthesisKeyword_0_4_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:7213:1: rule__MoniloggerCall__Group_0_4_2__0 : rule__MoniloggerCall__Group_0_4_2__0__Impl rule__MoniloggerCall__Group_0_4_2__1 ;
    public final void rule__MoniloggerCall__Group_0_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7217:1: ( rule__MoniloggerCall__Group_0_4_2__0__Impl rule__MoniloggerCall__Group_0_4_2__1 )
            // InternalMoniLog.g:7218:2: rule__MoniloggerCall__Group_0_4_2__0__Impl rule__MoniloggerCall__Group_0_4_2__1
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
    // InternalMoniLog.g:7225:1: rule__MoniloggerCall__Group_0_4_2__0__Impl : ( ',' ) ;
    public final void rule__MoniloggerCall__Group_0_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7229:1: ( ( ',' ) )
            // InternalMoniLog.g:7230:1: ( ',' )
            {
            // InternalMoniLog.g:7230:1: ( ',' )
            // InternalMoniLog.g:7231:2: ','
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
    // InternalMoniLog.g:7240:1: rule__MoniloggerCall__Group_0_4_2__1 : rule__MoniloggerCall__Group_0_4_2__1__Impl ;
    public final void rule__MoniloggerCall__Group_0_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7244:1: ( rule__MoniloggerCall__Group_0_4_2__1__Impl )
            // InternalMoniLog.g:7245:2: rule__MoniloggerCall__Group_0_4_2__1__Impl
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
    // InternalMoniLog.g:7251:1: rule__MoniloggerCall__Group_0_4_2__1__Impl : ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) ) ;
    public final void rule__MoniloggerCall__Group_0_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7255:1: ( ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) ) )
            // InternalMoniLog.g:7256:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) )
            {
            // InternalMoniLog.g:7256:1: ( ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 ) )
            // InternalMoniLog.g:7257:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getArgsAssignment_0_4_2_1()); 
            }
            // InternalMoniLog.g:7258:2: ( rule__MoniloggerCall__ArgsAssignment_0_4_2_1 )
            // InternalMoniLog.g:7258:3: rule__MoniloggerCall__ArgsAssignment_0_4_2_1
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
    // InternalMoniLog.g:7267:1: rule__MoniloggerCall__Group_1__0 : rule__MoniloggerCall__Group_1__0__Impl rule__MoniloggerCall__Group_1__1 ;
    public final void rule__MoniloggerCall__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7271:1: ( rule__MoniloggerCall__Group_1__0__Impl rule__MoniloggerCall__Group_1__1 )
            // InternalMoniLog.g:7272:2: rule__MoniloggerCall__Group_1__0__Impl rule__MoniloggerCall__Group_1__1
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
    // InternalMoniLog.g:7279:1: rule__MoniloggerCall__Group_1__0__Impl : ( () ) ;
    public final void rule__MoniloggerCall__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7283:1: ( ( () ) )
            // InternalMoniLog.g:7284:1: ( () )
            {
            // InternalMoniLog.g:7284:1: ( () )
            // InternalMoniLog.g:7285:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getStopMoniLoggerAction_1_0()); 
            }
            // InternalMoniLog.g:7286:2: ()
            // InternalMoniLog.g:7286:3: 
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
    // InternalMoniLog.g:7294:1: rule__MoniloggerCall__Group_1__1 : rule__MoniloggerCall__Group_1__1__Impl rule__MoniloggerCall__Group_1__2 ;
    public final void rule__MoniloggerCall__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7298:1: ( rule__MoniloggerCall__Group_1__1__Impl rule__MoniloggerCall__Group_1__2 )
            // InternalMoniLog.g:7299:2: rule__MoniloggerCall__Group_1__1__Impl rule__MoniloggerCall__Group_1__2
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
    // InternalMoniLog.g:7306:1: rule__MoniloggerCall__Group_1__1__Impl : ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) ) ;
    public final void rule__MoniloggerCall__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7310:1: ( ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) ) )
            // InternalMoniLog.g:7311:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) )
            {
            // InternalMoniLog.g:7311:1: ( ( rule__MoniloggerCall__MoniloggerAssignment_1_1 ) )
            // InternalMoniLog.g:7312:2: ( rule__MoniloggerCall__MoniloggerAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerAssignment_1_1()); 
            }
            // InternalMoniLog.g:7313:2: ( rule__MoniloggerCall__MoniloggerAssignment_1_1 )
            // InternalMoniLog.g:7313:3: rule__MoniloggerCall__MoniloggerAssignment_1_1
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
    // InternalMoniLog.g:7321:1: rule__MoniloggerCall__Group_1__2 : rule__MoniloggerCall__Group_1__2__Impl rule__MoniloggerCall__Group_1__3 ;
    public final void rule__MoniloggerCall__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7325:1: ( rule__MoniloggerCall__Group_1__2__Impl rule__MoniloggerCall__Group_1__3 )
            // InternalMoniLog.g:7326:2: rule__MoniloggerCall__Group_1__2__Impl rule__MoniloggerCall__Group_1__3
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
    // InternalMoniLog.g:7333:1: rule__MoniloggerCall__Group_1__2__Impl : ( '.' ) ;
    public final void rule__MoniloggerCall__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7337:1: ( ( '.' ) )
            // InternalMoniLog.g:7338:1: ( '.' )
            {
            // InternalMoniLog.g:7338:1: ( '.' )
            // InternalMoniLog.g:7339:2: '.'
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
    // InternalMoniLog.g:7348:1: rule__MoniloggerCall__Group_1__3 : rule__MoniloggerCall__Group_1__3__Impl ;
    public final void rule__MoniloggerCall__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7352:1: ( rule__MoniloggerCall__Group_1__3__Impl )
            // InternalMoniLog.g:7353:2: rule__MoniloggerCall__Group_1__3__Impl
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
    // InternalMoniLog.g:7359:1: rule__MoniloggerCall__Group_1__3__Impl : ( 'stop' ) ;
    public final void rule__MoniloggerCall__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7363:1: ( ( 'stop' ) )
            // InternalMoniLog.g:7364:1: ( 'stop' )
            {
            // InternalMoniLog.g:7364:1: ( 'stop' )
            // InternalMoniLog.g:7365:2: 'stop'
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
    // InternalMoniLog.g:7375:1: rule__StreamEvent__Group__0 : rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 ;
    public final void rule__StreamEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7379:1: ( rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 )
            // InternalMoniLog.g:7380:2: rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1
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
    // InternalMoniLog.g:7387:1: rule__StreamEvent__Group__0__Impl : ( ( rule__StreamEvent__EventAssignment_0 ) ) ;
    public final void rule__StreamEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7391:1: ( ( ( rule__StreamEvent__EventAssignment_0 ) ) )
            // InternalMoniLog.g:7392:1: ( ( rule__StreamEvent__EventAssignment_0 ) )
            {
            // InternalMoniLog.g:7392:1: ( ( rule__StreamEvent__EventAssignment_0 ) )
            // InternalMoniLog.g:7393:2: ( rule__StreamEvent__EventAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventAssignment_0()); 
            }
            // InternalMoniLog.g:7394:2: ( rule__StreamEvent__EventAssignment_0 )
            // InternalMoniLog.g:7394:3: rule__StreamEvent__EventAssignment_0
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
    // InternalMoniLog.g:7402:1: rule__StreamEvent__Group__1 : rule__StreamEvent__Group__1__Impl ;
    public final void rule__StreamEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7406:1: ( rule__StreamEvent__Group__1__Impl )
            // InternalMoniLog.g:7407:2: rule__StreamEvent__Group__1__Impl
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
    // InternalMoniLog.g:7413:1: rule__StreamEvent__Group__1__Impl : ( ( rule__StreamEvent__Group_1__0 )? ) ;
    public final void rule__StreamEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7417:1: ( ( ( rule__StreamEvent__Group_1__0 )? ) )
            // InternalMoniLog.g:7418:1: ( ( rule__StreamEvent__Group_1__0 )? )
            {
            // InternalMoniLog.g:7418:1: ( ( rule__StreamEvent__Group_1__0 )? )
            // InternalMoniLog.g:7419:2: ( rule__StreamEvent__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup_1()); 
            }
            // InternalMoniLog.g:7420:2: ( rule__StreamEvent__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==30) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoniLog.g:7420:3: rule__StreamEvent__Group_1__0
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
    // InternalMoniLog.g:7429:1: rule__StreamEvent__Group_1__0 : rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 ;
    public final void rule__StreamEvent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7433:1: ( rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 )
            // InternalMoniLog.g:7434:2: rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1
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
    // InternalMoniLog.g:7441:1: rule__StreamEvent__Group_1__0__Impl : ( '(' ) ;
    public final void rule__StreamEvent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7445:1: ( ( '(' ) )
            // InternalMoniLog.g:7446:1: ( '(' )
            {
            // InternalMoniLog.g:7446:1: ( '(' )
            // InternalMoniLog.g:7447:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getLeftParenthesisKeyword_1_0()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:7456:1: rule__StreamEvent__Group_1__1 : rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 ;
    public final void rule__StreamEvent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7460:1: ( rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 )
            // InternalMoniLog.g:7461:2: rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2
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
    // InternalMoniLog.g:7468:1: rule__StreamEvent__Group_1__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) ;
    public final void rule__StreamEvent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7472:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) )
            // InternalMoniLog.g:7473:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            {
            // InternalMoniLog.g:7473:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            // InternalMoniLog.g:7474:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1()); 
            }
            // InternalMoniLog.g:7475:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            // InternalMoniLog.g:7475:3: rule__StreamEvent__ValuesAssignment_1_1
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
    // InternalMoniLog.g:7483:1: rule__StreamEvent__Group_1__2 : rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 ;
    public final void rule__StreamEvent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7487:1: ( rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 )
            // InternalMoniLog.g:7488:2: rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3
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
    // InternalMoniLog.g:7495:1: rule__StreamEvent__Group_1__2__Impl : ( ( rule__StreamEvent__Group_1_2__0 )* ) ;
    public final void rule__StreamEvent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7499:1: ( ( ( rule__StreamEvent__Group_1_2__0 )* ) )
            // InternalMoniLog.g:7500:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            {
            // InternalMoniLog.g:7500:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            // InternalMoniLog.g:7501:2: ( rule__StreamEvent__Group_1_2__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getGroup_1_2()); 
            }
            // InternalMoniLog.g:7502:2: ( rule__StreamEvent__Group_1_2__0 )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==33) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMoniLog.g:7502:3: rule__StreamEvent__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__StreamEvent__Group_1_2__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop53;
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
    // InternalMoniLog.g:7510:1: rule__StreamEvent__Group_1__3 : rule__StreamEvent__Group_1__3__Impl ;
    public final void rule__StreamEvent__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7514:1: ( rule__StreamEvent__Group_1__3__Impl )
            // InternalMoniLog.g:7515:2: rule__StreamEvent__Group_1__3__Impl
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
    // InternalMoniLog.g:7521:1: rule__StreamEvent__Group_1__3__Impl : ( ')' ) ;
    public final void rule__StreamEvent__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7525:1: ( ( ')' ) )
            // InternalMoniLog.g:7526:1: ( ')' )
            {
            // InternalMoniLog.g:7526:1: ( ')' )
            // InternalMoniLog.g:7527:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getRightParenthesisKeyword_1_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:7537:1: rule__StreamEvent__Group_1_2__0 : rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 ;
    public final void rule__StreamEvent__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7541:1: ( rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 )
            // InternalMoniLog.g:7542:2: rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1
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
    // InternalMoniLog.g:7549:1: rule__StreamEvent__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StreamEvent__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7553:1: ( ( ',' ) )
            // InternalMoniLog.g:7554:1: ( ',' )
            {
            // InternalMoniLog.g:7554:1: ( ',' )
            // InternalMoniLog.g:7555:2: ','
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
    // InternalMoniLog.g:7564:1: rule__StreamEvent__Group_1_2__1 : rule__StreamEvent__Group_1_2__1__Impl ;
    public final void rule__StreamEvent__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7568:1: ( rule__StreamEvent__Group_1_2__1__Impl )
            // InternalMoniLog.g:7569:2: rule__StreamEvent__Group_1_2__1__Impl
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
    // InternalMoniLog.g:7575:1: rule__StreamEvent__Group_1_2__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) ;
    public final void rule__StreamEvent__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7579:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) )
            // InternalMoniLog.g:7580:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            {
            // InternalMoniLog.g:7580:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            // InternalMoniLog.g:7581:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1()); 
            }
            // InternalMoniLog.g:7582:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            // InternalMoniLog.g:7582:3: rule__StreamEvent__ValuesAssignment_1_2_1
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
    // InternalMoniLog.g:7591:1: rule__PropertyValue__Group_0__0 : rule__PropertyValue__Group_0__0__Impl rule__PropertyValue__Group_0__1 ;
    public final void rule__PropertyValue__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7595:1: ( rule__PropertyValue__Group_0__0__Impl rule__PropertyValue__Group_0__1 )
            // InternalMoniLog.g:7596:2: rule__PropertyValue__Group_0__0__Impl rule__PropertyValue__Group_0__1
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
    // InternalMoniLog.g:7603:1: rule__PropertyValue__Group_0__0__Impl : ( ( rule__PropertyValue__IdAssignment_0_0 ) ) ;
    public final void rule__PropertyValue__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7607:1: ( ( ( rule__PropertyValue__IdAssignment_0_0 ) ) )
            // InternalMoniLog.g:7608:1: ( ( rule__PropertyValue__IdAssignment_0_0 ) )
            {
            // InternalMoniLog.g:7608:1: ( ( rule__PropertyValue__IdAssignment_0_0 ) )
            // InternalMoniLog.g:7609:2: ( rule__PropertyValue__IdAssignment_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getIdAssignment_0_0()); 
            }
            // InternalMoniLog.g:7610:2: ( rule__PropertyValue__IdAssignment_0_0 )
            // InternalMoniLog.g:7610:3: rule__PropertyValue__IdAssignment_0_0
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
    // InternalMoniLog.g:7618:1: rule__PropertyValue__Group_0__1 : rule__PropertyValue__Group_0__1__Impl ;
    public final void rule__PropertyValue__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7622:1: ( rule__PropertyValue__Group_0__1__Impl )
            // InternalMoniLog.g:7623:2: rule__PropertyValue__Group_0__1__Impl
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
    // InternalMoniLog.g:7629:1: rule__PropertyValue__Group_0__1__Impl : ( ( rule__PropertyValue__Group_0_1__0 )? ) ;
    public final void rule__PropertyValue__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7633:1: ( ( ( rule__PropertyValue__Group_0_1__0 )? ) )
            // InternalMoniLog.g:7634:1: ( ( rule__PropertyValue__Group_0_1__0 )? )
            {
            // InternalMoniLog.g:7634:1: ( ( rule__PropertyValue__Group_0_1__0 )? )
            // InternalMoniLog.g:7635:2: ( rule__PropertyValue__Group_0_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getGroup_0_1()); 
            }
            // InternalMoniLog.g:7636:2: ( rule__PropertyValue__Group_0_1__0 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==62) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoniLog.g:7636:3: rule__PropertyValue__Group_0_1__0
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
    // InternalMoniLog.g:7645:1: rule__PropertyValue__Group_0_1__0 : rule__PropertyValue__Group_0_1__0__Impl rule__PropertyValue__Group_0_1__1 ;
    public final void rule__PropertyValue__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7649:1: ( rule__PropertyValue__Group_0_1__0__Impl rule__PropertyValue__Group_0_1__1 )
            // InternalMoniLog.g:7650:2: rule__PropertyValue__Group_0_1__0__Impl rule__PropertyValue__Group_0_1__1
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
    // InternalMoniLog.g:7657:1: rule__PropertyValue__Group_0_1__0__Impl : ( '=' ) ;
    public final void rule__PropertyValue__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7661:1: ( ( '=' ) )
            // InternalMoniLog.g:7662:1: ( '=' )
            {
            // InternalMoniLog.g:7662:1: ( '=' )
            // InternalMoniLog.g:7663:2: '='
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
    // InternalMoniLog.g:7672:1: rule__PropertyValue__Group_0_1__1 : rule__PropertyValue__Group_0_1__1__Impl ;
    public final void rule__PropertyValue__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7676:1: ( rule__PropertyValue__Group_0_1__1__Impl )
            // InternalMoniLog.g:7677:2: rule__PropertyValue__Group_0_1__1__Impl
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
    // InternalMoniLog.g:7683:1: rule__PropertyValue__Group_0_1__1__Impl : ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) ) ;
    public final void rule__PropertyValue__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7687:1: ( ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) ) )
            // InternalMoniLog.g:7688:1: ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) )
            {
            // InternalMoniLog.g:7688:1: ( ( rule__PropertyValue__ValueAssignment_0_1_1 ) )
            // InternalMoniLog.g:7689:2: ( rule__PropertyValue__ValueAssignment_0_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getPropertyValueAccess().getValueAssignment_0_1_1()); 
            }
            // InternalMoniLog.g:7690:2: ( rule__PropertyValue__ValueAssignment_0_1_1 )
            // InternalMoniLog.g:7690:3: rule__PropertyValue__ValueAssignment_0_1_1
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
    // InternalMoniLog.g:7699:1: rule__LanguageExpression__Group__0 : rule__LanguageExpression__Group__0__Impl rule__LanguageExpression__Group__1 ;
    public final void rule__LanguageExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7703:1: ( rule__LanguageExpression__Group__0__Impl rule__LanguageExpression__Group__1 )
            // InternalMoniLog.g:7704:2: rule__LanguageExpression__Group__0__Impl rule__LanguageExpression__Group__1
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
    // InternalMoniLog.g:7711:1: rule__LanguageExpression__Group__0__Impl : ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) ) ;
    public final void rule__LanguageExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7715:1: ( ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) ) )
            // InternalMoniLog.g:7716:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) )
            {
            // InternalMoniLog.g:7716:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0 ) )
            // InternalMoniLog.g:7717:2: ( rule__LanguageExpression__LanguageIdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0()); 
            }
            // InternalMoniLog.g:7718:2: ( rule__LanguageExpression__LanguageIdAssignment_0 )
            // InternalMoniLog.g:7718:3: rule__LanguageExpression__LanguageIdAssignment_0
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
    // InternalMoniLog.g:7726:1: rule__LanguageExpression__Group__1 : rule__LanguageExpression__Group__1__Impl rule__LanguageExpression__Group__2 ;
    public final void rule__LanguageExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7730:1: ( rule__LanguageExpression__Group__1__Impl rule__LanguageExpression__Group__2 )
            // InternalMoniLog.g:7731:2: rule__LanguageExpression__Group__1__Impl rule__LanguageExpression__Group__2
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
    // InternalMoniLog.g:7738:1: rule__LanguageExpression__Group__1__Impl : ( '(' ) ;
    public final void rule__LanguageExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7742:1: ( ( '(' ) )
            // InternalMoniLog.g:7743:1: ( '(' )
            {
            // InternalMoniLog.g:7743:1: ( '(' )
            // InternalMoniLog.g:7744:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_1()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:7753:1: rule__LanguageExpression__Group__2 : rule__LanguageExpression__Group__2__Impl rule__LanguageExpression__Group__3 ;
    public final void rule__LanguageExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7757:1: ( rule__LanguageExpression__Group__2__Impl rule__LanguageExpression__Group__3 )
            // InternalMoniLog.g:7758:2: rule__LanguageExpression__Group__2__Impl rule__LanguageExpression__Group__3
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
    // InternalMoniLog.g:7765:1: rule__LanguageExpression__Group__2__Impl : ( ( rule__LanguageExpression__ExpressionAssignment_2 ) ) ;
    public final void rule__LanguageExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7769:1: ( ( ( rule__LanguageExpression__ExpressionAssignment_2 ) ) )
            // InternalMoniLog.g:7770:1: ( ( rule__LanguageExpression__ExpressionAssignment_2 ) )
            {
            // InternalMoniLog.g:7770:1: ( ( rule__LanguageExpression__ExpressionAssignment_2 ) )
            // InternalMoniLog.g:7771:2: ( rule__LanguageExpression__ExpressionAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_2()); 
            }
            // InternalMoniLog.g:7772:2: ( rule__LanguageExpression__ExpressionAssignment_2 )
            // InternalMoniLog.g:7772:3: rule__LanguageExpression__ExpressionAssignment_2
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
    // InternalMoniLog.g:7780:1: rule__LanguageExpression__Group__3 : rule__LanguageExpression__Group__3__Impl ;
    public final void rule__LanguageExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7784:1: ( rule__LanguageExpression__Group__3__Impl )
            // InternalMoniLog.g:7785:2: rule__LanguageExpression__Group__3__Impl
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
    // InternalMoniLog.g:7791:1: rule__LanguageExpression__Group__3__Impl : ( ')' ) ;
    public final void rule__LanguageExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7795:1: ( ( ')' ) )
            // InternalMoniLog.g:7796:1: ( ')' )
            {
            // InternalMoniLog.g:7796:1: ( ')' )
            // InternalMoniLog.g:7797:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_3()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
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
    // InternalMoniLog.g:7807:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7811:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMoniLog.g:7812:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalMoniLog.g:7819:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7823:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:7824:1: ( RULE_ID )
            {
            // InternalMoniLog.g:7824:1: ( RULE_ID )
            // InternalMoniLog.g:7825:2: RULE_ID
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
    // InternalMoniLog.g:7834:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7838:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMoniLog.g:7839:2: rule__QualifiedName__Group__1__Impl
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
    // InternalMoniLog.g:7845:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7849:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMoniLog.g:7850:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMoniLog.g:7850:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMoniLog.g:7851:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalMoniLog.g:7852:2: ( rule__QualifiedName__Group_1__0 )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==57) ) {
                    int LA55_2 = input.LA(2);

                    if ( (LA55_2==RULE_ID) ) {
                        alt55=1;
                    }


                }


                switch (alt55) {
            	case 1 :
            	    // InternalMoniLog.g:7852:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_52);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop55;
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
    // InternalMoniLog.g:7861:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7865:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMoniLog.g:7866:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalMoniLog.g:7873:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7877:1: ( ( '.' ) )
            // InternalMoniLog.g:7878:1: ( '.' )
            {
            // InternalMoniLog.g:7878:1: ( '.' )
            // InternalMoniLog.g:7879:2: '.'
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
    // InternalMoniLog.g:7888:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7892:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMoniLog.g:7893:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalMoniLog.g:7899:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7903:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:7904:1: ( RULE_ID )
            {
            // InternalMoniLog.g:7904:1: ( RULE_ID )
            // InternalMoniLog.g:7905:2: RULE_ID
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
    // InternalMoniLog.g:7915:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7919:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalMoniLog.g:7920:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
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
    // InternalMoniLog.g:7927:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7931:1: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:7932:1: ( ruleQualifiedName )
            {
            // InternalMoniLog.g:7932:1: ( ruleQualifiedName )
            // InternalMoniLog.g:7933:2: ruleQualifiedName
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
    // InternalMoniLog.g:7942:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7946:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalMoniLog.g:7947:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalMoniLog.g:7953:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:7957:1: ( ( ( '.*' )? ) )
            // InternalMoniLog.g:7958:1: ( ( '.*' )? )
            {
            // InternalMoniLog.g:7958:1: ( ( '.*' )? )
            // InternalMoniLog.g:7959:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalMoniLog.g:7960:2: ( '.*' )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==63) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMoniLog.g:7960:3: '.*'
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
    // InternalMoniLog.g:7969:1: rule__Document__UnorderedGroup_3 : ( rule__Document__UnorderedGroup_3__0 )? ;
    public final void rule__Document__UnorderedGroup_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getDocumentAccess().getUnorderedGroup_3());
        	
        try {
            // InternalMoniLog.g:7974:1: ( ( rule__Document__UnorderedGroup_3__0 )? )
            // InternalMoniLog.g:7975:2: ( rule__Document__UnorderedGroup_3__0 )?
            {
            // InternalMoniLog.g:7975:2: ( rule__Document__UnorderedGroup_3__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 >= 41 && LA57_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt57=1;
            }
            else if ( ( LA57_0 == 12 || LA57_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt57=1;
            }
            else if ( LA57_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt57=1;
            }
            else if ( ( LA57_0 == 11 || LA57_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoniLog.g:7975:2: rule__Document__UnorderedGroup_3__0
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
    // InternalMoniLog.g:7983:1: rule__Document__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) ) ;
    public final void rule__Document__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog.g:7988:1: ( ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) ) )
            // InternalMoniLog.g:7989:3: ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) )
            {
            // InternalMoniLog.g:7989:3: ( ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) ) | ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) ) )
            int alt62=4;
            int LA62_0 = input.LA(1);

            if ( LA62_0 >= 41 && LA62_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt62=1;
            }
            else if ( ( LA62_0 == 12 || LA62_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt62=2;
            }
            else if ( LA62_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt62=3;
            }
            else if ( ( LA62_0 == 11 || LA62_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt62=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoniLog.g:7990:3: ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) )
                    {
                    // InternalMoniLog.g:7990:3: ({...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) ) )
                    // InternalMoniLog.g:7991:4: {...}? => ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0)");
                    }
                    // InternalMoniLog.g:7991:104: ( ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) ) )
                    // InternalMoniLog.g:7992:5: ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0);
                    selected = true;
                    // InternalMoniLog.g:7998:5: ( ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* ) )
                    // InternalMoniLog.g:7999:6: ( ( rule__Document__EventsAssignment_3_0 ) ) ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* )
                    {
                    // InternalMoniLog.g:7999:6: ( ( rule__Document__EventsAssignment_3_0 ) )
                    // InternalMoniLog.g:8000:7: ( rule__Document__EventsAssignment_3_0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEventsAssignment_3_0()); 
                    }
                    // InternalMoniLog.g:8001:7: ( rule__Document__EventsAssignment_3_0 )
                    // InternalMoniLog.g:8001:8: rule__Document__EventsAssignment_3_0
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

                    // InternalMoniLog.g:8004:6: ( ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )* )
                    // InternalMoniLog.g:8005:7: ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getEventsAssignment_3_0()); 
                    }
                    // InternalMoniLog.g:8006:7: ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )*
                    loop58:
                    do {
                        int alt58=2;
                        alt58 = dfa58.predict(input);
                        switch (alt58) {
                    	case 1 :
                    	    // InternalMoniLog.g:8006:8: ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0
                    	    {
                    	    pushFollow(FOLLOW_54);
                    	    rule__Document__EventsAssignment_3_0();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
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
                    // InternalMoniLog.g:8012:3: ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) )
                    {
                    // InternalMoniLog.g:8012:3: ({...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) ) )
                    // InternalMoniLog.g:8013:4: {...}? => ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1)");
                    }
                    // InternalMoniLog.g:8013:104: ( ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) ) )
                    // InternalMoniLog.g:8014:5: ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1);
                    selected = true;
                    // InternalMoniLog.g:8020:5: ( ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* ) )
                    // InternalMoniLog.g:8021:6: ( ( rule__Document__AppendersAssignment_3_1 ) ) ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* )
                    {
                    // InternalMoniLog.g:8021:6: ( ( rule__Document__AppendersAssignment_3_1 ) )
                    // InternalMoniLog.g:8022:7: ( rule__Document__AppendersAssignment_3_1 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getAppendersAssignment_3_1()); 
                    }
                    // InternalMoniLog.g:8023:7: ( rule__Document__AppendersAssignment_3_1 )
                    // InternalMoniLog.g:8023:8: rule__Document__AppendersAssignment_3_1
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

                    // InternalMoniLog.g:8026:6: ( ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )* )
                    // InternalMoniLog.g:8027:7: ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getAppendersAssignment_3_1()); 
                    }
                    // InternalMoniLog.g:8028:7: ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )*
                    loop59:
                    do {
                        int alt59=2;
                        alt59 = dfa59.predict(input);
                        switch (alt59) {
                    	case 1 :
                    	    // InternalMoniLog.g:8028:8: ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1
                    	    {
                    	    pushFollow(FOLLOW_55);
                    	    rule__Document__AppendersAssignment_3_1();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
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
                    // InternalMoniLog.g:8034:3: ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) )
                    {
                    // InternalMoniLog.g:8034:3: ({...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) ) )
                    // InternalMoniLog.g:8035:4: {...}? => ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2)");
                    }
                    // InternalMoniLog.g:8035:104: ( ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) ) )
                    // InternalMoniLog.g:8036:5: ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2);
                    selected = true;
                    // InternalMoniLog.g:8042:5: ( ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* ) )
                    // InternalMoniLog.g:8043:6: ( ( rule__Document__LayoutsAssignment_3_2 ) ) ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* )
                    {
                    // InternalMoniLog.g:8043:6: ( ( rule__Document__LayoutsAssignment_3_2 ) )
                    // InternalMoniLog.g:8044:7: ( rule__Document__LayoutsAssignment_3_2 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getLayoutsAssignment_3_2()); 
                    }
                    // InternalMoniLog.g:8045:7: ( rule__Document__LayoutsAssignment_3_2 )
                    // InternalMoniLog.g:8045:8: rule__Document__LayoutsAssignment_3_2
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

                    // InternalMoniLog.g:8048:6: ( ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )* )
                    // InternalMoniLog.g:8049:7: ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getLayoutsAssignment_3_2()); 
                    }
                    // InternalMoniLog.g:8050:7: ( ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2 )*
                    loop60:
                    do {
                        int alt60=2;
                        int LA60_0 = input.LA(1);

                        if ( (LA60_0==32) ) {
                            int LA60_2 = input.LA(2);

                            if ( (LA60_2==RULE_ID) ) {
                                int LA60_3 = input.LA(3);

                                if ( (synpred3_InternalMoniLog()) ) {
                                    alt60=1;
                                }


                            }


                        }


                        switch (alt60) {
                    	case 1 :
                    	    // InternalMoniLog.g:8050:8: ( rule__Document__LayoutsAssignment_3_2 )=> rule__Document__LayoutsAssignment_3_2
                    	    {
                    	    pushFollow(FOLLOW_56);
                    	    rule__Document__LayoutsAssignment_3_2();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop60;
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
                    // InternalMoniLog.g:8056:3: ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) )
                    {
                    // InternalMoniLog.g:8056:3: ({...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) ) )
                    // InternalMoniLog.g:8057:4: {...}? => ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        throw new FailedPredicateException(input, "rule__Document__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3)");
                    }
                    // InternalMoniLog.g:8057:104: ( ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) ) )
                    // InternalMoniLog.g:8058:5: ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) )
                    {
                    getUnorderedGroupHelper().select(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3);
                    selected = true;
                    // InternalMoniLog.g:8064:5: ( ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* ) )
                    // InternalMoniLog.g:8065:6: ( ( rule__Document__MoniloggersAssignment_3_3 ) ) ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* )
                    {
                    // InternalMoniLog.g:8065:6: ( ( rule__Document__MoniloggersAssignment_3_3 ) )
                    // InternalMoniLog.g:8066:7: ( rule__Document__MoniloggersAssignment_3_3 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getMoniloggersAssignment_3_3()); 
                    }
                    // InternalMoniLog.g:8067:7: ( rule__Document__MoniloggersAssignment_3_3 )
                    // InternalMoniLog.g:8067:8: rule__Document__MoniloggersAssignment_3_3
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

                    // InternalMoniLog.g:8070:6: ( ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )* )
                    // InternalMoniLog.g:8071:7: ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )*
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDocumentAccess().getMoniloggersAssignment_3_3()); 
                    }
                    // InternalMoniLog.g:8072:7: ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )*
                    loop61:
                    do {
                        int alt61=2;
                        alt61 = dfa61.predict(input);
                        switch (alt61) {
                    	case 1 :
                    	    // InternalMoniLog.g:8072:8: ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3
                    	    {
                    	    pushFollow(FOLLOW_57);
                    	    rule__Document__MoniloggersAssignment_3_3();

                    	    state._fsp--;
                    	    if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    break loop61;
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
    // InternalMoniLog.g:8086:1: rule__Document__UnorderedGroup_3__0 : rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__1 )? ;
    public final void rule__Document__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8090:1: ( rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__1 )? )
            // InternalMoniLog.g:8091:2: rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_57);
            rule__Document__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog.g:8092:2: ( rule__Document__UnorderedGroup_3__1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( LA63_0 >= 41 && LA63_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt63=1;
            }
            else if ( ( LA63_0 == 12 || LA63_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt63=1;
            }
            else if ( LA63_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt63=1;
            }
            else if ( ( LA63_0 == 11 || LA63_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMoniLog.g:8092:2: rule__Document__UnorderedGroup_3__1
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
    // InternalMoniLog.g:8098:1: rule__Document__UnorderedGroup_3__1 : rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__2 )? ;
    public final void rule__Document__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8102:1: ( rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__2 )? )
            // InternalMoniLog.g:8103:2: rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_57);
            rule__Document__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog.g:8104:2: ( rule__Document__UnorderedGroup_3__2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( LA64_0 >= 41 && LA64_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt64=1;
            }
            else if ( ( LA64_0 == 12 || LA64_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt64=1;
            }
            else if ( LA64_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt64=1;
            }
            else if ( ( LA64_0 == 11 || LA64_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMoniLog.g:8104:2: rule__Document__UnorderedGroup_3__2
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
    // InternalMoniLog.g:8110:1: rule__Document__UnorderedGroup_3__2 : rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__3 )? ;
    public final void rule__Document__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8114:1: ( rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__3 )? )
            // InternalMoniLog.g:8115:2: rule__Document__UnorderedGroup_3__Impl ( rule__Document__UnorderedGroup_3__3 )?
            {
            pushFollow(FOLLOW_57);
            rule__Document__UnorderedGroup_3__Impl();

            state._fsp--;
            if (state.failed) return ;
            // InternalMoniLog.g:8116:2: ( rule__Document__UnorderedGroup_3__3 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( LA65_0 >= 41 && LA65_0 <= 43 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 0) ) {
                alt65=1;
            }
            else if ( ( LA65_0 == 12 || LA65_0 == 26 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 1) ) {
                alt65=1;
            }
            else if ( LA65_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 2) ) {
                alt65=1;
            }
            else if ( ( LA65_0 == 11 || LA65_0 == 35 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getDocumentAccess().getUnorderedGroup_3(), 3) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMoniLog.g:8116:2: rule__Document__UnorderedGroup_3__3
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
    // InternalMoniLog.g:8122:1: rule__Document__UnorderedGroup_3__3 : rule__Document__UnorderedGroup_3__Impl ;
    public final void rule__Document__UnorderedGroup_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8126:1: ( rule__Document__UnorderedGroup_3__Impl )
            // InternalMoniLog.g:8127:2: rule__Document__UnorderedGroup_3__Impl
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
    // InternalMoniLog.g:8134:1: rule__Document__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Document__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8138:1: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:8139:2: ( ruleQualifiedName )
            {
            // InternalMoniLog.g:8139:2: ( ruleQualifiedName )
            // InternalMoniLog.g:8140:3: ruleQualifiedName
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
    // InternalMoniLog.g:8149:1: rule__Document__ImportsAssignment_2 : ( ruleImport ) ;
    public final void rule__Document__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8153:1: ( ( ruleImport ) )
            // InternalMoniLog.g:8154:2: ( ruleImport )
            {
            // InternalMoniLog.g:8154:2: ( ruleImport )
            // InternalMoniLog.g:8155:3: ruleImport
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
    // InternalMoniLog.g:8164:1: rule__Document__EventsAssignment_3_0 : ( ruleEvent ) ;
    public final void rule__Document__EventsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8168:1: ( ( ruleEvent ) )
            // InternalMoniLog.g:8169:2: ( ruleEvent )
            {
            // InternalMoniLog.g:8169:2: ( ruleEvent )
            // InternalMoniLog.g:8170:3: ruleEvent
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
    // InternalMoniLog.g:8179:1: rule__Document__AppendersAssignment_3_1 : ( ruleAppender ) ;
    public final void rule__Document__AppendersAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8183:1: ( ( ruleAppender ) )
            // InternalMoniLog.g:8184:2: ( ruleAppender )
            {
            // InternalMoniLog.g:8184:2: ( ruleAppender )
            // InternalMoniLog.g:8185:3: ruleAppender
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
    // InternalMoniLog.g:8194:1: rule__Document__LayoutsAssignment_3_2 : ( ruleLayout ) ;
    public final void rule__Document__LayoutsAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8198:1: ( ( ruleLayout ) )
            // InternalMoniLog.g:8199:2: ( ruleLayout )
            {
            // InternalMoniLog.g:8199:2: ( ruleLayout )
            // InternalMoniLog.g:8200:3: ruleLayout
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
    // InternalMoniLog.g:8209:1: rule__Document__MoniloggersAssignment_3_3 : ( ruleMoniLogger ) ;
    public final void rule__Document__MoniloggersAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8213:1: ( ( ruleMoniLogger ) )
            // InternalMoniLog.g:8214:2: ( ruleMoniLogger )
            {
            // InternalMoniLog.g:8214:2: ( ruleMoniLogger )
            // InternalMoniLog.g:8215:3: ruleMoniLogger
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
    // InternalMoniLog.g:8224:1: rule__Import__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__Import__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8228:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalMoniLog.g:8229:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalMoniLog.g:8229:2: ( ruleQualifiedNameWithWildcard )
            // InternalMoniLog.g:8230:3: ruleQualifiedNameWithWildcard
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
    // InternalMoniLog.g:8239:1: rule__LocalAppender__AnnotationsAssignment_0 : ( ruleAppenderAnnotation ) ;
    public final void rule__LocalAppender__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8243:1: ( ( ruleAppenderAnnotation ) )
            // InternalMoniLog.g:8244:2: ( ruleAppenderAnnotation )
            {
            // InternalMoniLog.g:8244:2: ( ruleAppenderAnnotation )
            // InternalMoniLog.g:8245:3: ruleAppenderAnnotation
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
    // InternalMoniLog.g:8254:1: rule__LocalAppender__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__LocalAppender__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8258:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8259:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8259:2: ( RULE_ID )
            // InternalMoniLog.g:8260:3: RULE_ID
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
    // InternalMoniLog.g:8269:1: rule__LocalAppender__ParameterDeclAssignment_3_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__LocalAppender__ParameterDeclAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8273:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog.g:8274:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog.g:8274:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog.g:8275:3: ruleParameterDeclVarArgs
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
    // InternalMoniLog.g:8284:1: rule__LocalAppender__CallsAssignment_5 : ( ruleAppenderCall ) ;
    public final void rule__LocalAppender__CallsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8288:1: ( ( ruleAppenderCall ) )
            // InternalMoniLog.g:8289:2: ( ruleAppenderCall )
            {
            // InternalMoniLog.g:8289:2: ( ruleAppenderCall )
            // InternalMoniLog.g:8290:3: ruleAppenderCall
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
    // InternalMoniLog.g:8299:1: rule__LocalAppender__CallsAssignment_6_1 : ( ruleAppenderCall ) ;
    public final void rule__LocalAppender__CallsAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8303:1: ( ( ruleAppenderCall ) )
            // InternalMoniLog.g:8304:2: ( ruleAppenderCall )
            {
            // InternalMoniLog.g:8304:2: ( ruleAppenderCall )
            // InternalMoniLog.g:8305:3: ruleAppenderCall
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
    // InternalMoniLog.g:8314:1: rule__ExternalAppender__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalAppender__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8318:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8319:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8319:2: ( RULE_ID )
            // InternalMoniLog.g:8320:3: RULE_ID
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
    // InternalMoniLog.g:8329:1: rule__ExternalAppender__ParameterDeclAssignment_2_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__ExternalAppender__ParameterDeclAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8333:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog.g:8334:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog.g:8334:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog.g:8335:3: ruleParameterDeclVarArgs
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
    // InternalMoniLog.g:8344:1: rule__LocalLayout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LocalLayout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8348:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8349:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8349:2: ( RULE_ID )
            // InternalMoniLog.g:8350:3: RULE_ID
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
    // InternalMoniLog.g:8359:1: rule__LocalLayout__ParameterDeclAssignment_2_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__LocalLayout__ParameterDeclAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8363:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog.g:8364:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog.g:8364:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog.g:8365:3: ruleParameterDeclVarArgs
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
    // InternalMoniLog.g:8374:1: rule__LocalLayout__CallAssignment_4 : ( ruleLayoutCall ) ;
    public final void rule__LocalLayout__CallAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8378:1: ( ( ruleLayoutCall ) )
            // InternalMoniLog.g:8379:2: ( ruleLayoutCall )
            {
            // InternalMoniLog.g:8379:2: ( ruleLayoutCall )
            // InternalMoniLog.g:8380:3: ruleLayoutCall
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
    // InternalMoniLog.g:8389:1: rule__ExternalLayout__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__ExternalLayout__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8393:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8394:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8394:2: ( RULE_ID )
            // InternalMoniLog.g:8395:3: RULE_ID
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
    // InternalMoniLog.g:8404:1: rule__ExternalLayout__ParameterDeclAssignment_2_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__ExternalLayout__ParameterDeclAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8408:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog.g:8409:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog.g:8409:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog.g:8410:3: ruleParameterDeclVarArgs
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
    // InternalMoniLog.g:8419:1: rule__ParameterDeclVarArgs__ParametersAssignment_1_0 : ( ruleParameter ) ;
    public final void rule__ParameterDeclVarArgs__ParametersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8423:1: ( ( ruleParameter ) )
            // InternalMoniLog.g:8424:2: ( ruleParameter )
            {
            // InternalMoniLog.g:8424:2: ( ruleParameter )
            // InternalMoniLog.g:8425:3: ruleParameter
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
    // InternalMoniLog.g:8434:1: rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterDeclVarArgs__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8438:1: ( ( ruleParameter ) )
            // InternalMoniLog.g:8439:2: ( ruleParameter )
            {
            // InternalMoniLog.g:8439:2: ( ruleParameter )
            // InternalMoniLog.g:8440:3: ruleParameter
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
    // InternalMoniLog.g:8449:1: rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1 : ( ruleParameter ) ;
    public final void rule__ParameterDeclVarArgs__VarArgsAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8453:1: ( ( ruleParameter ) )
            // InternalMoniLog.g:8454:2: ( ruleParameter )
            {
            // InternalMoniLog.g:8454:2: ( ruleParameter )
            // InternalMoniLog.g:8455:3: ruleParameter
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
    // InternalMoniLog.g:8464:1: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0 : ( ruleParameter ) ;
    public final void rule__ParameterDeclNoVarArgs__ParametersAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8468:1: ( ( ruleParameter ) )
            // InternalMoniLog.g:8469:2: ( ruleParameter )
            {
            // InternalMoniLog.g:8469:2: ( ruleParameter )
            // InternalMoniLog.g:8470:3: ruleParameter
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
    // InternalMoniLog.g:8479:1: rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1 : ( ruleParameter ) ;
    public final void rule__ParameterDeclNoVarArgs__ParametersAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8483:1: ( ( ruleParameter ) )
            // InternalMoniLog.g:8484:2: ( ruleParameter )
            {
            // InternalMoniLog.g:8484:2: ( ruleParameter )
            // InternalMoniLog.g:8485:3: ruleParameter
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
    // InternalMoniLog.g:8494:1: rule__MoniLogger__AnnotationsAssignment_0 : ( ruleMoniLoggerAnnotation ) ;
    public final void rule__MoniLogger__AnnotationsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8498:1: ( ( ruleMoniLoggerAnnotation ) )
            // InternalMoniLog.g:8499:2: ( ruleMoniLoggerAnnotation )
            {
            // InternalMoniLog.g:8499:2: ( ruleMoniLoggerAnnotation )
            // InternalMoniLog.g:8500:3: ruleMoniLoggerAnnotation
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
    // InternalMoniLog.g:8509:1: rule__MoniLogger__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__MoniLogger__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8513:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8514:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8514:2: ( RULE_ID )
            // InternalMoniLog.g:8515:3: RULE_ID
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
    // InternalMoniLog.g:8524:1: rule__MoniLogger__ParameterDeclAssignment_3_1 : ( ruleParameterDeclVarArgs ) ;
    public final void rule__MoniLogger__ParameterDeclAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8528:1: ( ( ruleParameterDeclVarArgs ) )
            // InternalMoniLog.g:8529:2: ( ruleParameterDeclVarArgs )
            {
            // InternalMoniLog.g:8529:2: ( ruleParameterDeclVarArgs )
            // InternalMoniLog.g:8530:3: ruleParameterDeclVarArgs
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
    // InternalMoniLog.g:8539:1: rule__MoniLogger__LevelAssignment_4_1 : ( ruleLogLevel ) ;
    public final void rule__MoniLogger__LevelAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8543:1: ( ( ruleLogLevel ) )
            // InternalMoniLog.g:8544:2: ( ruleLogLevel )
            {
            // InternalMoniLog.g:8544:2: ( ruleLogLevel )
            // InternalMoniLog.g:8545:3: ruleLogLevel
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
    // InternalMoniLog.g:8554:1: rule__MoniLogger__StreamEventAssignment_7 : ( ruleStreamEvent ) ;
    public final void rule__MoniLogger__StreamEventAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8558:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8559:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8559:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8560:3: ruleStreamEvent
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
    // InternalMoniLog.g:8569:1: rule__MoniLogger__ConditionsAssignment_8_2 : ( ruleCondition ) ;
    public final void rule__MoniLogger__ConditionsAssignment_8_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8573:1: ( ( ruleCondition ) )
            // InternalMoniLog.g:8574:2: ( ruleCondition )
            {
            // InternalMoniLog.g:8574:2: ( ruleCondition )
            // InternalMoniLog.g:8575:3: ruleCondition
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
    // InternalMoniLog.g:8584:1: rule__MoniLogger__ConditionsAssignment_8_3_1 : ( ruleCondition ) ;
    public final void rule__MoniLogger__ConditionsAssignment_8_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8588:1: ( ( ruleCondition ) )
            // InternalMoniLog.g:8589:2: ( ruleCondition )
            {
            // InternalMoniLog.g:8589:2: ( ruleCondition )
            // InternalMoniLog.g:8590:3: ruleCondition
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
    // InternalMoniLog.g:8599:1: rule__MoniLogger__ActionsAssignment_11 : ( ruleAction ) ;
    public final void rule__MoniLogger__ActionsAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8603:1: ( ( ruleAction ) )
            // InternalMoniLog.g:8604:2: ( ruleAction )
            {
            // InternalMoniLog.g:8604:2: ( ruleAction )
            // InternalMoniLog.g:8605:3: ruleAction
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
    // InternalMoniLog.g:8614:1: rule__MoniLogger__ActionsAssignment_12_1 : ( ruleAction ) ;
    public final void rule__MoniLogger__ActionsAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8618:1: ( ( ruleAction ) )
            // InternalMoniLog.g:8619:2: ( ruleAction )
            {
            // InternalMoniLog.g:8619:2: ( ruleAction )
            // InternalMoniLog.g:8620:3: ruleAction
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
    // InternalMoniLog.g:8629:1: rule__Parameter__NameAssignment : ( RULE_ID ) ;
    public final void rule__Parameter__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8633:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8634:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8634:2: ( RULE_ID )
            // InternalMoniLog.g:8635:3: RULE_ID
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
    // InternalMoniLog.g:8644:1: rule__Event__NameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8648:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8649:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8649:2: ( RULE_ID )
            // InternalMoniLog.g:8650:3: RULE_ID
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
    // InternalMoniLog.g:8659:1: rule__Event__ParameterDeclAssignment_0_3_1 : ( ruleParameterDeclNoVarArgs ) ;
    public final void rule__Event__ParameterDeclAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8663:1: ( ( ruleParameterDeclNoVarArgs ) )
            // InternalMoniLog.g:8664:2: ( ruleParameterDeclNoVarArgs )
            {
            // InternalMoniLog.g:8664:2: ( ruleParameterDeclNoVarArgs )
            // InternalMoniLog.g:8665:3: ruleParameterDeclNoVarArgs
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
    // InternalMoniLog.g:8674:1: rule__Event__KindAssignment_0_5 : ( ruleASTEventKind ) ;
    public final void rule__Event__KindAssignment_0_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8678:1: ( ( ruleASTEventKind ) )
            // InternalMoniLog.g:8679:2: ( ruleASTEventKind )
            {
            // InternalMoniLog.g:8679:2: ( ruleASTEventKind )
            // InternalMoniLog.g:8680:3: ruleASTEventKind
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
    // InternalMoniLog.g:8689:1: rule__Event__RuleIDAssignment_0_6 : ( RULE_ID ) ;
    public final void rule__Event__RuleIDAssignment_0_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8693:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8694:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8694:2: ( RULE_ID )
            // InternalMoniLog.g:8695:3: RULE_ID
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
    // InternalMoniLog.g:8704:1: rule__Event__NameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8708:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8709:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8709:2: ( RULE_ID )
            // InternalMoniLog.g:8710:3: RULE_ID
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
    // InternalMoniLog.g:8719:1: rule__Event__KindAssignment_1_3_1 : ( ruleTemporalPatternKind ) ;
    public final void rule__Event__KindAssignment_1_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8723:1: ( ( ruleTemporalPatternKind ) )
            // InternalMoniLog.g:8724:2: ( ruleTemporalPatternKind )
            {
            // InternalMoniLog.g:8724:2: ( ruleTemporalPatternKind )
            // InternalMoniLog.g:8725:3: ruleTemporalPatternKind
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
    // InternalMoniLog.g:8734:1: rule__Event__ParameterDeclAssignment_1_4_1 : ( ruleParameterDeclNoVarArgs ) ;
    public final void rule__Event__ParameterDeclAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8738:1: ( ( ruleParameterDeclNoVarArgs ) )
            // InternalMoniLog.g:8739:2: ( ruleParameterDeclNoVarArgs )
            {
            // InternalMoniLog.g:8739:2: ( ruleParameterDeclNoVarArgs )
            // InternalMoniLog.g:8740:3: ruleParameterDeclNoVarArgs
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
    // InternalMoniLog.g:8749:1: rule__Event__PatternAssignment_1_6 : ( ruleTemporalPattern ) ;
    public final void rule__Event__PatternAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8753:1: ( ( ruleTemporalPattern ) )
            // InternalMoniLog.g:8754:2: ( ruleTemporalPattern )
            {
            // InternalMoniLog.g:8754:2: ( ruleTemporalPattern )
            // InternalMoniLog.g:8755:3: ruleTemporalPattern
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
    // InternalMoniLog.g:8764:1: rule__Event__NameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8768:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:8769:2: ( RULE_ID )
            {
            // InternalMoniLog.g:8769:2: ( RULE_ID )
            // InternalMoniLog.g:8770:3: RULE_ID
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
    // InternalMoniLog.g:8779:1: rule__Event__ParameterDeclAssignment_2_3_1 : ( ruleParameterDeclNoVarArgs ) ;
    public final void rule__Event__ParameterDeclAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8783:1: ( ( ruleParameterDeclNoVarArgs ) )
            // InternalMoniLog.g:8784:2: ( ruleParameterDeclNoVarArgs )
            {
            // InternalMoniLog.g:8784:2: ( ruleParameterDeclNoVarArgs )
            // InternalMoniLog.g:8785:3: ruleParameterDeclNoVarArgs
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
    // InternalMoniLog.g:8794:1: rule__Condition__ExpressionAssignment : ( ruleLanguageExpression ) ;
    public final void rule__Condition__ExpressionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8798:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog.g:8799:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog.g:8799:2: ( ruleLanguageExpression )
            // InternalMoniLog.g:8800:3: ruleLanguageExpression
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
    // InternalMoniLog.g:8809:1: rule__TemporalPattern__PatternAssignment_0 : ( rulePattern ) ;
    public final void rule__TemporalPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8813:1: ( ( rulePattern ) )
            // InternalMoniLog.g:8814:2: ( rulePattern )
            {
            // InternalMoniLog.g:8814:2: ( rulePattern )
            // InternalMoniLog.g:8815:3: rulePattern
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
    // InternalMoniLog.g:8824:1: rule__TemporalPattern__ScopeAssignment_1 : ( ruleScope ) ;
    public final void rule__TemporalPattern__ScopeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8828:1: ( ( ruleScope ) )
            // InternalMoniLog.g:8829:2: ( ruleScope )
            {
            // InternalMoniLog.g:8829:2: ( ruleScope )
            // InternalMoniLog.g:8830:3: ruleScope
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
    // InternalMoniLog.g:8839:1: rule__Pattern__BoundAssignment_0_2 : ( ruleBoundType ) ;
    public final void rule__Pattern__BoundAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8843:1: ( ( ruleBoundType ) )
            // InternalMoniLog.g:8844:2: ( ruleBoundType )
            {
            // InternalMoniLog.g:8844:2: ( ruleBoundType )
            // InternalMoniLog.g:8845:3: ruleBoundType
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
    // InternalMoniLog.g:8854:1: rule__Pattern__EventAssignment_0_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8858:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8859:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8859:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8860:3: ruleStreamEvent
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
    // InternalMoniLog.g:8869:1: rule__Pattern__EventAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8873:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8874:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8874:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8875:3: ruleStreamEvent
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
    // InternalMoniLog.g:8884:1: rule__Pattern__EventAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8888:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8889:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8889:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8890:3: ruleStreamEvent
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
    // InternalMoniLog.g:8899:1: rule__Pattern__PredecessorAssignment_3_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__PredecessorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8903:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8904:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8904:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8905:3: ruleStreamEvent
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
    // InternalMoniLog.g:8914:1: rule__Pattern__SuccessorAssignment_3_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__SuccessorAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8918:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8919:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8919:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8920:3: ruleStreamEvent
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
    // InternalMoniLog.g:8929:1: rule__Pattern__EventAssignment_4_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8933:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8934:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8934:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8935:3: ruleStreamEvent
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
    // InternalMoniLog.g:8944:1: rule__Pattern__TriggerAssignment_4_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__TriggerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8948:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:8949:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:8949:2: ( ruleStreamEvent )
            // InternalMoniLog.g:8950:3: ruleStreamEvent
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
    // InternalMoniLog.g:8959:1: rule__ExactBound__NAssignment : ( RULE_INT ) ;
    public final void rule__ExactBound__NAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8963:1: ( ( RULE_INT ) )
            // InternalMoniLog.g:8964:2: ( RULE_INT )
            {
            // InternalMoniLog.g:8964:2: ( RULE_INT )
            // InternalMoniLog.g:8965:3: RULE_INT
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
    // InternalMoniLog.g:8974:1: rule__LowerBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__LowerBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8978:1: ( ( RULE_INT ) )
            // InternalMoniLog.g:8979:2: ( RULE_INT )
            {
            // InternalMoniLog.g:8979:2: ( RULE_INT )
            // InternalMoniLog.g:8980:3: RULE_INT
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
    // InternalMoniLog.g:8989:1: rule__UpperBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__UpperBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:8993:1: ( ( RULE_INT ) )
            // InternalMoniLog.g:8994:2: ( RULE_INT )
            {
            // InternalMoniLog.g:8994:2: ( RULE_INT )
            // InternalMoniLog.g:8995:3: RULE_INT
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
    // InternalMoniLog.g:9004:1: rule__Scope__LowerBoundAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9008:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:9009:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:9009:2: ( ruleStreamEvent )
            // InternalMoniLog.g:9010:3: ruleStreamEvent
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
    // InternalMoniLog.g:9019:1: rule__Scope__UpperBoundAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9023:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:9024:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:9024:2: ( ruleStreamEvent )
            // InternalMoniLog.g:9025:3: ruleStreamEvent
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
    // InternalMoniLog.g:9034:1: rule__Scope__LowerBoundAssignment_3_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9038:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:9039:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:9039:2: ( ruleStreamEvent )
            // InternalMoniLog.g:9040:3: ruleStreamEvent
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
    // InternalMoniLog.g:9049:1: rule__Scope__UpperBoundAssignment_3_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9053:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:9054:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:9054:2: ( ruleStreamEvent )
            // InternalMoniLog.g:9055:3: ruleStreamEvent
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
    // InternalMoniLog.g:9064:1: rule__Scope__LowerBoundAssignment_4_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9068:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:9069:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:9069:2: ( ruleStreamEvent )
            // InternalMoniLog.g:9070:3: ruleStreamEvent
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
    // InternalMoniLog.g:9079:1: rule__Scope__UpperBoundAssignment_4_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9083:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog.g:9084:2: ( ruleStreamEvent )
            {
            // InternalMoniLog.g:9084:2: ( ruleStreamEvent )
            // InternalMoniLog.g:9085:3: ruleStreamEvent
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
    // InternalMoniLog.g:9094:1: rule__AppenderCall__AppenderAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__AppenderCall__AppenderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9098:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMoniLog.g:9099:2: ( ( ruleQualifiedName ) )
            {
            // InternalMoniLog.g:9099:2: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:9100:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAppenderCallAccess().getAppenderAppenderCrossReference_0_0()); 
            }
            // InternalMoniLog.g:9101:3: ( ruleQualifiedName )
            // InternalMoniLog.g:9102:4: ruleQualifiedName
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
    // InternalMoniLog.g:9113:1: rule__AppenderCall__ArgsAssignment_3_1 : ( ruleAppenderCallArgument ) ;
    public final void rule__AppenderCall__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9117:1: ( ( ruleAppenderCallArgument ) )
            // InternalMoniLog.g:9118:2: ( ruleAppenderCallArgument )
            {
            // InternalMoniLog.g:9118:2: ( ruleAppenderCallArgument )
            // InternalMoniLog.g:9119:3: ruleAppenderCallArgument
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
    // InternalMoniLog.g:9128:1: rule__AppenderCall__ArgsAssignment_3_2_1 : ( ruleAppenderCallArgument ) ;
    public final void rule__AppenderCall__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9132:1: ( ( ruleAppenderCallArgument ) )
            // InternalMoniLog.g:9133:2: ( ruleAppenderCallArgument )
            {
            // InternalMoniLog.g:9133:2: ( ruleAppenderCallArgument )
            // InternalMoniLog.g:9134:3: ruleAppenderCallArgument
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
    // InternalMoniLog.g:9143:1: rule__LayoutCall__LayoutAssignment_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__LayoutCall__LayoutAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9147:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMoniLog.g:9148:2: ( ( ruleQualifiedName ) )
            {
            // InternalMoniLog.g:9148:2: ( ( ruleQualifiedName ) )
            // InternalMoniLog.g:9149:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getLayoutCallAccess().getLayoutLayoutCrossReference_0_0()); 
            }
            // InternalMoniLog.g:9150:3: ( ruleQualifiedName )
            // InternalMoniLog.g:9151:4: ruleQualifiedName
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
    // InternalMoniLog.g:9162:1: rule__LayoutCall__ArgsAssignment_3_1 : ( ruleLayoutCallArgument ) ;
    public final void rule__LayoutCall__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9166:1: ( ( ruleLayoutCallArgument ) )
            // InternalMoniLog.g:9167:2: ( ruleLayoutCallArgument )
            {
            // InternalMoniLog.g:9167:2: ( ruleLayoutCallArgument )
            // InternalMoniLog.g:9168:3: ruleLayoutCallArgument
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
    // InternalMoniLog.g:9177:1: rule__LayoutCall__ArgsAssignment_3_2_1 : ( ruleLayoutCallArgument ) ;
    public final void rule__LayoutCall__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9181:1: ( ( ruleLayoutCallArgument ) )
            // InternalMoniLog.g:9182:2: ( ruleLayoutCallArgument )
            {
            // InternalMoniLog.g:9182:2: ( ruleLayoutCallArgument )
            // InternalMoniLog.g:9183:3: ruleLayoutCallArgument
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
    // InternalMoniLog.g:9192:1: rule__EmitEvent__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__EmitEvent__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9196:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog.g:9197:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog.g:9197:2: ( ( RULE_ID ) )
            // InternalMoniLog.g:9198:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEmitEventAccess().getEventUserEventCrossReference_0_0()); 
            }
            // InternalMoniLog.g:9199:3: ( RULE_ID )
            // InternalMoniLog.g:9200:4: RULE_ID
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
    // InternalMoniLog.g:9211:1: rule__EmitEvent__ArgsAssignment_3_1 : ( ruleExpression ) ;
    public final void rule__EmitEvent__ArgsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9215:1: ( ( ruleExpression ) )
            // InternalMoniLog.g:9216:2: ( ruleExpression )
            {
            // InternalMoniLog.g:9216:2: ( ruleExpression )
            // InternalMoniLog.g:9217:3: ruleExpression
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
    // InternalMoniLog.g:9226:1: rule__EmitEvent__ArgsAssignment_3_2_1 : ( ruleExpression ) ;
    public final void rule__EmitEvent__ArgsAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9230:1: ( ( ruleExpression ) )
            // InternalMoniLog.g:9231:2: ( ruleExpression )
            {
            // InternalMoniLog.g:9231:2: ( ruleExpression )
            // InternalMoniLog.g:9232:3: ruleExpression
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
    // InternalMoniLog.g:9241:1: rule__SetVariable__VariableAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SetVariable__VariableAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9245:1: ( ( RULE_STRING ) )
            // InternalMoniLog.g:9246:2: ( RULE_STRING )
            {
            // InternalMoniLog.g:9246:2: ( RULE_STRING )
            // InternalMoniLog.g:9247:3: RULE_STRING
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
    // InternalMoniLog.g:9256:1: rule__SetVariable__ValueAssignment_4 : ( ruleLanguageExpression ) ;
    public final void rule__SetVariable__ValueAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9260:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog.g:9261:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog.g:9261:2: ( ruleLanguageExpression )
            // InternalMoniLog.g:9262:3: ruleLanguageExpression
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
    // InternalMoniLog.g:9271:1: rule__MoniloggerCall__MoniloggerAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoniloggerCall__MoniloggerAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9275:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog.g:9276:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog.g:9276:2: ( ( RULE_ID ) )
            // InternalMoniLog.g:9277:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_0_1_0()); 
            }
            // InternalMoniLog.g:9278:3: ( RULE_ID )
            // InternalMoniLog.g:9279:4: RULE_ID
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
    // InternalMoniLog.g:9290:1: rule__MoniloggerCall__ArgsAssignment_0_4_1 : ( ruleExpression ) ;
    public final void rule__MoniloggerCall__ArgsAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9294:1: ( ( ruleExpression ) )
            // InternalMoniLog.g:9295:2: ( ruleExpression )
            {
            // InternalMoniLog.g:9295:2: ( ruleExpression )
            // InternalMoniLog.g:9296:3: ruleExpression
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
    // InternalMoniLog.g:9305:1: rule__MoniloggerCall__ArgsAssignment_0_4_2_1 : ( ruleExpression ) ;
    public final void rule__MoniloggerCall__ArgsAssignment_0_4_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9309:1: ( ( ruleExpression ) )
            // InternalMoniLog.g:9310:2: ( ruleExpression )
            {
            // InternalMoniLog.g:9310:2: ( ruleExpression )
            // InternalMoniLog.g:9311:3: ruleExpression
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
    // InternalMoniLog.g:9320:1: rule__MoniloggerCall__MoniloggerAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MoniloggerCall__MoniloggerAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9324:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog.g:9325:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog.g:9325:2: ( ( RULE_ID ) )
            // InternalMoniLog.g:9326:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMoniloggerCallAccess().getMoniloggerMoniLoggerCrossReference_1_1_0()); 
            }
            // InternalMoniLog.g:9327:3: ( RULE_ID )
            // InternalMoniLog.g:9328:4: RULE_ID
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
    // InternalMoniLog.g:9339:1: rule__StreamEvent__EventAssignment_0 : ( ( RULE_ID ) ) ;
    public final void rule__StreamEvent__EventAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9343:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog.g:9344:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog.g:9344:2: ( ( RULE_ID ) )
            // InternalMoniLog.g:9345:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStreamEventAccess().getEventEventCrossReference_0_0()); 
            }
            // InternalMoniLog.g:9346:3: ( RULE_ID )
            // InternalMoniLog.g:9347:4: RULE_ID
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
    // InternalMoniLog.g:9358:1: rule__StreamEvent__ValuesAssignment_1_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9362:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog.g:9363:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog.g:9363:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog.g:9364:3: ruleEmptyOrPropertyValue
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
    // InternalMoniLog.g:9373:1: rule__StreamEvent__ValuesAssignment_1_2_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9377:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog.g:9378:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog.g:9378:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog.g:9379:3: ruleEmptyOrPropertyValue
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
    // InternalMoniLog.g:9388:1: rule__ParameterReference__ParameterAssignment : ( ( RULE_ID ) ) ;
    public final void rule__ParameterReference__ParameterAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9392:1: ( ( ( RULE_ID ) ) )
            // InternalMoniLog.g:9393:2: ( ( RULE_ID ) )
            {
            // InternalMoniLog.g:9393:2: ( ( RULE_ID ) )
            // InternalMoniLog.g:9394:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParameterReferenceAccess().getParameterParameterCrossReference_0()); 
            }
            // InternalMoniLog.g:9395:3: ( RULE_ID )
            // InternalMoniLog.g:9396:4: RULE_ID
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
    // InternalMoniLog.g:9407:1: rule__PropertyValue__IdAssignment_0_0 : ( RULE_ID ) ;
    public final void rule__PropertyValue__IdAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9411:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:9412:2: ( RULE_ID )
            {
            // InternalMoniLog.g:9412:2: ( RULE_ID )
            // InternalMoniLog.g:9413:3: RULE_ID
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
    // InternalMoniLog.g:9422:1: rule__PropertyValue__ValueAssignment_0_1_1 : ( ruleExpression ) ;
    public final void rule__PropertyValue__ValueAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9426:1: ( ( ruleExpression ) )
            // InternalMoniLog.g:9427:2: ( ruleExpression )
            {
            // InternalMoniLog.g:9427:2: ( ruleExpression )
            // InternalMoniLog.g:9428:3: ruleExpression
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
    // InternalMoniLog.g:9437:1: rule__PropertyValue__ValueAssignment_1 : ( ruleLanguageExpression ) ;
    public final void rule__PropertyValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9441:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog.g:9442:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog.g:9442:2: ( ruleLanguageExpression )
            // InternalMoniLog.g:9443:3: ruleLanguageExpression
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
    // InternalMoniLog.g:9452:1: rule__LanguageExpression__LanguageIdAssignment_0 : ( RULE_ID ) ;
    public final void rule__LanguageExpression__LanguageIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9456:1: ( ( RULE_ID ) )
            // InternalMoniLog.g:9457:2: ( RULE_ID )
            {
            // InternalMoniLog.g:9457:2: ( RULE_ID )
            // InternalMoniLog.g:9458:3: RULE_ID
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
    // InternalMoniLog.g:9467:1: rule__LanguageExpression__ExpressionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__LanguageExpression__ExpressionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog.g:9471:1: ( ( RULE_STRING ) )
            // InternalMoniLog.g:9472:2: ( RULE_STRING )
            {
            // InternalMoniLog.g:9472:2: ( RULE_STRING )
            // InternalMoniLog.g:9473:3: RULE_STRING
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

    // $ANTLR start synpred1_InternalMoniLog
    public final void synpred1_InternalMoniLog_fragment() throws RecognitionException {   
        // InternalMoniLog.g:8006:8: ( rule__Document__EventsAssignment_3_0 )
        // InternalMoniLog.g:8006:9: rule__Document__EventsAssignment_3_0
        {
        pushFollow(FOLLOW_2);
        rule__Document__EventsAssignment_3_0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMoniLog

    // $ANTLR start synpred2_InternalMoniLog
    public final void synpred2_InternalMoniLog_fragment() throws RecognitionException {   
        // InternalMoniLog.g:8028:8: ( rule__Document__AppendersAssignment_3_1 )
        // InternalMoniLog.g:8028:9: rule__Document__AppendersAssignment_3_1
        {
        pushFollow(FOLLOW_2);
        rule__Document__AppendersAssignment_3_1();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMoniLog

    // $ANTLR start synpred3_InternalMoniLog
    public final void synpred3_InternalMoniLog_fragment() throws RecognitionException {   
        // InternalMoniLog.g:8050:8: ( rule__Document__LayoutsAssignment_3_2 )
        // InternalMoniLog.g:8050:9: rule__Document__LayoutsAssignment_3_2
        {
        pushFollow(FOLLOW_2);
        rule__Document__LayoutsAssignment_3_2();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred3_InternalMoniLog

    // $ANTLR start synpred4_InternalMoniLog
    public final void synpred4_InternalMoniLog_fragment() throws RecognitionException {   
        // InternalMoniLog.g:8072:8: ( rule__Document__MoniloggersAssignment_3_3 )
        // InternalMoniLog.g:8072:9: rule__Document__MoniloggersAssignment_3_3
        {
        pushFollow(FOLLOW_2);
        rule__Document__MoniloggersAssignment_3_3();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalMoniLog

    // Delegated rules

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
    public final boolean synpred1_InternalMoniLog() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMoniLog_fragment(); // can never throw exception
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


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA58 dfa58 = new DFA58(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA61 dfa61 = new DFA61(this);
    static final String dfa_1s = "\13\uffff";
    static final String dfa_2s = "\3\uffff\1\5\3\uffff\1\5\3\uffff";
    static final String dfa_3s = "\1\14\1\uffff\1\4\1\13\1\4\1\uffff\1\37\1\13\1\4\2\37";
    static final String dfa_4s = "\1\32\1\uffff\1\4\1\53\1\37\1\uffff\1\41\1\53\1\4\1\42\1\37";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\5\uffff";
    static final String dfa_6s = "\13\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\15\uffff\1\2",
            "",
            "\1\3",
            "\2\5\15\uffff\1\5\1\1\2\uffff\1\4\1\uffff\1\5\2\uffff\1\5\5\uffff\3\5",
            "\1\6\32\uffff\1\7",
            "",
            "\1\7\1\uffff\1\10",
            "\2\5\15\uffff\1\5\1\1\4\uffff\1\5\2\uffff\1\5\5\uffff\3\5",
            "\1\11",
            "\1\7\1\uffff\1\10\1\12",
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
    static final String dfa_8s = "\2\uffff\1\4\4\uffff\1\4\3\uffff";
    static final String dfa_9s = "\1\40\1\4\1\13\1\4\2\uffff\1\37\1\13\1\4\2\37";
    static final String dfa_10s = "\1\40\1\4\1\53\1\37\2\uffff\1\41\1\53\1\4\1\42\1\37";
    static final String dfa_11s = "\4\uffff\1\2\1\1\5\uffff";
    static final String[] dfa_12s = {
            "\1\1",
            "\1\2",
            "\2\4\15\uffff\1\4\1\5\2\uffff\1\3\1\uffff\1\4\2\uffff\1\4\5\uffff\3\4",
            "\1\6\32\uffff\1\7",
            "",
            "",
            "\1\7\1\uffff\1\10",
            "\2\4\15\uffff\1\4\1\5\4\uffff\1\4\2\uffff\1\4\5\uffff\3\4",
            "\1\11",
            "\1\7\1\uffff\1\10\1\12",
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
    static final String dfa_15s = "\1\4\1\uffff\1\35\2\uffff\1\4\2\uffff\1\4\1\35\2\36\1\4\2\6\1\4\1\36\2\37\1\36\1\6\2\37\1\6\4\37";
    static final String dfa_16s = "\1\64\1\uffff\1\66\2\uffff\1\41\2\uffff\1\41\1\66\2\76\1\4\2\6\1\4\1\41\2\37\1\41\1\6\2\41\1\6\2\37\2\41";
    static final String dfa_17s = "\1\uffff\1\1\1\uffff\1\2\1\3\1\uffff\1\5\1\4\24\uffff";
    static final String dfa_18s = "\34\uffff}>";
    static final String[] dfa_19s = {
            "\1\2\1\1\50\uffff\1\1\1\3\1\4\2\uffff\2\1",
            "",
            "\1\1\1\5\15\uffff\2\1\3\uffff\1\7\1\6\2\uffff\2\1",
            "",
            "",
            "\1\12\32\uffff\1\11\1\uffff\1\10",
            "",
            "",
            "\1\13\32\uffff\1\11\1\uffff\1\10",
            "\1\1\16\uffff\2\1\3\uffff\1\7\1\6\2\uffff\2\1",
            "\1\15\1\11\1\uffff\1\10\34\uffff\1\14",
            "\1\16\1\11\1\uffff\1\10\34\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24\1\11\1\uffff\1\10",
            "\1\25",
            "\1\26",
            "\1\27\1\11\1\uffff\1\10",
            "\1\30",
            "\1\11\1\uffff\1\10",
            "\1\11\1\uffff\1\10",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\11\1\uffff\1\10",
            "\1\11\1\uffff\1\10"
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
    static final String dfa_22s = "\1\35\1\uffff\1\4\2\uffff\1\35\1\4\2\uffff\1\4\1\35\2\36\1\6\2\4\1\6\1\37\2\36\2\37\2\6\5\37";
    static final String dfa_23s = "\1\66\1\uffff\1\4\2\uffff\1\70\1\41\2\uffff\1\41\1\70\2\76\1\6\2\4\1\6\1\37\2\41\1\37\1\41\2\6\1\41\2\37\2\41";
    static final String dfa_24s = "\1\uffff\1\1\1\uffff\1\3\1\4\2\uffff\1\2\1\5\24\uffff";
    static final String dfa_25s = "\35\uffff}>";
    static final String[] dfa_26s = {
            "\1\1\16\uffff\1\3\1\2\7\uffff\1\1\1\4",
            "",
            "\1\5",
            "",
            "",
            "\1\7\1\6\31\uffff\1\10",
            "\1\13\32\uffff\1\12\1\uffff\1\11",
            "",
            "",
            "\1\14\32\uffff\1\12\1\uffff\1\11",
            "\1\7\32\uffff\1\10",
            "\1\15\1\12\1\uffff\1\11\34\uffff\1\16",
            "\1\20\1\12\1\uffff\1\11\34\uffff\1\17",
            "\1\21",
            "\1\22",
            "\1\23",
            "\1\24",
            "\1\25",
            "\1\26\1\12\1\uffff\1\11",
            "\1\27\1\12\1\uffff\1\11",
            "\1\30",
            "\1\12\1\uffff\1\11",
            "\1\31",
            "\1\32",
            "\1\12\1\uffff\1\11",
            "\1\33",
            "\1\34",
            "\1\12\1\uffff\1\11",
            "\1\12\1\uffff\1\11"
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
    static final String dfa_29s = "\1\13\3\4\1\uffff\2\33\1\0\1\4\1\54\1\24\2\4\1\uffff\1\37\1\33\2\4\4\47\1\37\1\33\2\4\2\5\1\35\3\4\1\35\1\33\1\4\1\35\4\4\1\35\1\0\4\4\2\35\1\37\1\0\1\37\2\4\1\35\1\36\3\35\1\36\1\35\3\4\1\35\2\36\1\6\11\4\1\35\1\36\1\4\1\35\2\36\1\6\1\4\1\6\1\4\1\37\1\36\1\4\1\35\1\36\1\4\1\35\1\36\1\35\1\4\1\35\1\36\1\4\1\67\1\36\1\35\1\4\1\35\2\36\1\4\1\6\1\36\1\6\1\4\1\6\1\4\1\37\1\36\1\37\1\36\1\37\1\6\1\36\1\4\1\6\1\36\1\6\2\4\1\36\1\6\1\4\1\36\1\6\2\4\1\36\1\4\1\6\1\4\1\6\1\36\1\37\1\6\1\4\1\37\1\36\1\37\1\36\1\37\1\6\1\37\1\6\1\37\1\6\1\4\1\36\1\37\1\4\1\6\1\37\1\36\1\4\1\35\1\36\1\4\1\6\1\37\1\36\1\4\1\6\1\37\1\36\1\4\1\35\1\36\1\4\1\6\1\36\1\37\1\36\1\37\1\6\2\37\1\36\1\37\1\6\1\37\1\6\4\37\1\36\1\6\1\37\1\36\2\37\1\6\1\36\1\4\1\6\1\36\2\37\1\6\1\36\2\37\1\6\1\36\1\6\1\4\1\36\1\37\1\6\1\37\1\6\3\37\1\6\5\37\1\6\1\37\1\6\2\37\1\4\1\6\1\36\1\37\1\6\2\37\1\6\2\37\1\4\1\6\1\37\1\36\1\6\13\37\1\36\1\37\1\6\5\37\1\36\2\37\1\6\6\37\1\6\4\37\1\6\11\37";
    static final String dfa_30s = "\1\53\3\4\1\uffff\1\36\1\46\1\0\1\37\1\55\1\27\1\37\1\64\1\uffff\1\41\1\33\2\4\4\47\1\41\1\33\1\64\1\4\2\5\1\66\3\4\1\35\1\36\1\4\1\66\2\4\1\41\1\4\1\35\1\0\4\4\2\66\1\41\1\0\3\41\1\66\1\76\1\66\1\70\1\36\1\67\1\66\3\41\1\66\2\76\1\6\1\4\2\41\1\4\2\41\1\4\2\41\1\66\1\76\1\41\1\66\2\76\1\6\1\4\1\6\1\4\1\37\2\41\1\66\1\76\1\41\1\70\1\76\1\36\1\41\1\35\1\76\1\41\1\67\1\76\1\36\1\41\1\66\2\76\1\4\1\6\1\76\1\6\1\4\1\6\1\4\1\37\1\41\1\37\2\41\1\6\1\76\1\4\1\6\1\76\1\6\1\4\1\41\1\76\1\6\1\4\1\76\1\6\1\4\1\41\1\76\1\4\1\6\1\4\1\6\1\41\1\37\1\6\1\4\1\37\1\41\1\37\2\41\1\6\1\41\1\6\1\37\1\6\1\4\1\41\1\37\1\4\1\6\1\37\2\41\1\35\1\76\1\4\1\6\1\37\1\41\1\4\1\6\1\37\2\41\1\35\1\76\1\4\1\6\1\41\1\37\1\41\1\37\1\6\1\41\1\37\2\41\1\6\1\41\1\6\2\37\1\41\1\37\1\41\1\6\2\41\1\37\1\41\1\6\1\76\1\4\1\6\1\41\1\37\1\41\1\6\1\41\1\37\1\41\1\6\1\76\1\6\1\4\1\41\1\37\1\6\1\41\1\6\1\41\1\37\1\41\1\6\2\37\3\41\1\6\1\37\1\6\1\41\1\37\1\4\1\6\1\41\1\37\1\6\1\41\1\37\1\6\1\41\1\37\1\4\1\6\1\37\1\41\1\6\1\41\2\37\1\41\1\37\2\41\1\37\1\41\1\37\2\41\1\37\1\6\1\41\1\37\1\41\1\37\2\41\1\37\1\41\1\6\1\37\5\41\1\6\1\41\1\37\2\41\1\6\1\41\1\37\1\41\1\37\1\41\1\37\3\41";
    static final String dfa_31s = "\4\uffff\1\2\10\uffff\1\1\u0114\uffff";
    static final String dfa_32s = "\7\uffff\1\1\41\uffff\1\0\7\uffff\1\2\u00f0\uffff}>";
    static final String[] dfa_33s = {
            "\2\4\15\uffff\1\4\5\uffff\1\4\2\uffff\1\4\5\uffff\1\1\1\2\1\3",
            "\1\5",
            "\1\6",
            "\1\7",
            "",
            "\1\11\2\uffff\1\10",
            "\1\14\2\uffff\1\13\7\uffff\1\12",
            "\1\uffff",
            "\1\16\32\uffff\1\17",
            "\1\20\1\21",
            "\1\22\1\23\1\24\1\25",
            "\1\26\32\uffff\1\27",
            "\1\34\1\31\50\uffff\1\30\1\35\1\36\2\uffff\1\32\1\33",
            "",
            "\1\17\1\uffff\1\37",
            "\1\11",
            "\1\40",
            "\1\40",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\41",
            "\1\27\1\uffff\1\42",
            "\1\14",
            "\1\43\1\31\55\uffff\1\32\1\33",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\51\1\46\15\uffff\1\53\1\52\3\uffff\1\55\1\47\2\uffff\1\50\1\54",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\14\2\uffff\1\13",
            "\1\62",
            "\1\51\1\63\15\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\43",
            "\1\43",
            "\1\66\32\uffff\1\65\1\uffff\1\64",
            "\1\67",
            "\1\51",
            "\1\uffff",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\51\1\74\15\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\51\1\75\15\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\17\1\uffff\1\37",
            "\1\uffff",
            "\1\27\1\uffff\1\42",
            "\1\100\32\uffff\1\77\1\uffff\1\76",
            "\1\101\32\uffff\1\65\1\uffff\1\64",
            "\1\51\16\uffff\1\53\1\52\3\uffff\1\55\1\47\2\uffff\1\50\1\54",
            "\1\102\1\65\1\uffff\1\64\34\uffff\1\103",
            "\1\51\1\104\15\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\51\1\105\31\uffff\1\106",
            "\1\51\1\107",
            "\1\110\30\uffff\1\111",
            "\1\51\1\112\15\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\115\32\uffff\1\114\1\uffff\1\113",
            "\1\120\32\uffff\1\117\1\uffff\1\116",
            "\1\121\32\uffff\1\77\1\uffff\1\76",
            "\1\51\16\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\122\1\77\1\uffff\1\76\34\uffff\1\123",
            "\1\124\1\65\1\uffff\1\64\34\uffff\1\125",
            "\1\126",
            "\1\127",
            "\1\132\32\uffff\1\131\1\uffff\1\130",
            "\1\135\32\uffff\1\134\1\uffff\1\133",
            "\1\136",
            "\1\141\32\uffff\1\140\1\uffff\1\137",
            "\1\144\32\uffff\1\143\1\uffff\1\142",
            "\1\145",
            "\1\150\32\uffff\1\147\1\uffff\1\146",
            "\1\151\32\uffff\1\114\1\uffff\1\113",
            "\1\51\16\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\153\1\114\1\uffff\1\113\34\uffff\1\152",
            "\1\154\32\uffff\1\117\1\uffff\1\116",
            "\1\51\16\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\155\1\117\1\uffff\1\116\34\uffff\1\156",
            "\1\157\1\77\1\uffff\1\76\34\uffff\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166\1\65\1\uffff\1\64",
            "\1\167\32\uffff\1\131\1\uffff\1\130",
            "\1\51\16\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\171\1\131\1\uffff\1\130\34\uffff\1\170",
            "\1\172\32\uffff\1\134\1\uffff\1\133",
            "\1\51\32\uffff\1\106",
            "\1\173\1\134\1\uffff\1\133\34\uffff\1\174",
            "\1\51\1\175",
            "\1\176\32\uffff\1\140\1\uffff\1\137",
            "\1\51",
            "\1\177\1\140\1\uffff\1\137\34\uffff\1\u0080",
            "\1\u0081\32\uffff\1\143\1\uffff\1\142",
            "\1\111",
            "\1\u0082\1\143\1\uffff\1\142\34\uffff\1\u0083",
            "\1\51\1\u0084",
            "\1\u0085\32\uffff\1\147\1\uffff\1\146",
            "\1\51\16\uffff\1\53\1\52\7\uffff\1\50\1\54",
            "\1\u0087\1\147\1\uffff\1\146\34\uffff\1\u0086",
            "\1\u0089\1\114\1\uffff\1\113\34\uffff\1\u0088",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c\1\117\1\uffff\1\116\34\uffff\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093\1\77\1\uffff\1\76",
            "\1\u0094",
            "\1\u0095\1\65\1\uffff\1\64",
            "\1\65\1\uffff\1\64",
            "\1\u0096",
            "\1\u0097\1\131\1\uffff\1\130\34\uffff\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\1\u009c\1\134\1\uffff\1\133\34\uffff\1\u009b",
            "\1\u009d",
            "\1\u009e",
            "\1\u00a1\32\uffff\1\u00a0\1\uffff\1\u009f",
            "\1\u00a3\1\140\1\uffff\1\137\34\uffff\1\u00a2",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a7\1\143\1\uffff\1\142\34\uffff\1\u00a6",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00ac\32\uffff\1\u00ab\1\uffff\1\u00aa",
            "\1\u00ae\1\147\1\uffff\1\146\34\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\1\114\1\uffff\1\113",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\1\117\1\uffff\1\116",
            "\1\u00b9",
            "\1\u00ba\1\77\1\uffff\1\76",
            "\1\77\1\uffff\1\76",
            "\1\u00bb",
            "\1\65\1\uffff\1\64",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0\1\131\1\uffff\1\130",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5\1\134\1\uffff\1\133",
            "\1\u00c6\32\uffff\1\u00a0\1\uffff\1\u009f",
            "\1\51",
            "\1\u00c8\1\u00a0\1\uffff\1\u009f\34\uffff\1\u00c7",
            "\1\u00c9",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc\1\140\1\uffff\1\137",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0\1\143\1\uffff\1\142",
            "\1\u00d1\32\uffff\1\u00ab\1\uffff\1\u00aa",
            "\1\51",
            "\1\u00d2\1\u00ab\1\uffff\1\u00aa\34\uffff\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6\1\147\1\uffff\1\146",
            "\1\u00d7",
            "\1\u00d8\1\114\1\uffff\1\113",
            "\1\u00d9",
            "\1\u00da",
            "\1\114\1\uffff\1\113",
            "\1\u00db",
            "\1\u00dc\1\117\1\uffff\1\116",
            "\1\117\1\uffff\1\116",
            "\1\u00dd",
            "\1\77\1\uffff\1\76",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\65\1\uffff\1\64",
            "\1\u00e1",
            "\1\u00e2\1\131\1\uffff\1\130",
            "\1\u00e3",
            "\1\131\1\uffff\1\130",
            "\1\u00e4\1\134\1\uffff\1\133",
            "\1\u00e5",
            "\1\134\1\uffff\1\133",
            "\1\u00e6",
            "\1\u00e8\1\u00a0\1\uffff\1\u009f\34\uffff\1\u00e7",
            "\1\u00e9",
            "\1\u00ea",
            "\1\u00eb\1\140\1\uffff\1\137",
            "\1\u00ec",
            "\1\140\1\uffff\1\137",
            "\1\u00ed",
            "\1\u00ee\1\143\1\uffff\1\142",
            "\1\u00ef",
            "\1\143\1\uffff\1\142",
            "\1\u00f0",
            "\1\u00f2\1\u00ab\1\uffff\1\u00aa\34\uffff\1\u00f1",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5\1\147\1\uffff\1\146",
            "\1\u00f6",
            "\1\u00f7",
            "\1\147\1\uffff\1\146",
            "\1\u00f8",
            "\1\114\1\uffff\1\113",
            "\1\u00f9",
            "\1\117\1\uffff\1\116",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\77\1\uffff\1\76",
            "\1\65\1\uffff\1\64",
            "\1\131\1\uffff\1\130",
            "\1\u00fd",
            "\1\u00fe",
            "\1\u00ff",
            "\1\134\1\uffff\1\133",
            "\1\u0100",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103\1\u00a0\1\uffff\1\u009f",
            "\1\u0104",
            "\1\u0105",
            "\1\140\1\uffff\1\137",
            "\1\u0106",
            "\1\u0107",
            "\1\143\1\uffff\1\142",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c\1\u00ab\1\uffff\1\u00aa",
            "\1\u010d",
            "\1\147\1\uffff\1\146",
            "\1\u010e",
            "\1\u010f",
            "\1\114\1\uffff\1\113",
            "\1\u0110",
            "\1\117\1\uffff\1\116",
            "\1\77\1\uffff\1\76",
            "\1\u0111",
            "\1\131\1\uffff\1\130",
            "\1\u0112",
            "\1\134\1\uffff\1\133",
            "\1\u0113\1\u00a0\1\uffff\1\u009f",
            "\1\u0114",
            "\1\u0115",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u0116",
            "\1\140\1\uffff\1\137",
            "\1\u0117",
            "\1\143\1\uffff\1\142",
            "\1\u0118\1\u00ab\1\uffff\1\u00aa",
            "\1\u0119",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u011a",
            "\1\u011b",
            "\1\147\1\uffff\1\146",
            "\1\114\1\uffff\1\113",
            "\1\117\1\uffff\1\116",
            "\1\131\1\uffff\1\130",
            "\1\134\1\uffff\1\133",
            "\1\u011c",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u011d",
            "\1\140\1\uffff\1\137",
            "\1\143\1\uffff\1\142",
            "\1\u011e",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u011f",
            "\1\147\1\uffff\1\146",
            "\1\u0120",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u0121",
            "\1\u00ab\1\uffff\1\u00aa",
            "\1\u00a0\1\uffff\1\u009f",
            "\1\u00ab\1\uffff\1\u00aa"
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "()* loopback of 8006:7: ( ( rule__Document__EventsAssignment_3_0 )=> rule__Document__EventsAssignment_3_0 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA58_41 = input.LA(1);

                         
                        int index58_41 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index58_41);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA58_7 = input.LA(1);

                         
                        int index58_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index58_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA58_49 = input.LA(1);

                         
                        int index58_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred1_InternalMoniLog()) ) {s = 13;}

                        else if ( (true) ) {s = 4;}

                         
                        input.seek(index58_49);
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
    static final String dfa_34s = "\147\uffff";
    static final String dfa_35s = "\1\1\146\uffff";
    static final String dfa_36s = "\1\13\1\uffff\1\14\2\4\1\0\1\33\1\uffff\2\4\1\37\1\33\1\71\2\4\1\37\1\71\1\34\1\37\2\4\1\0\1\36\1\71\2\4\1\34\1\6\1\4\1\71\2\36\1\37\1\71\1\34\2\4\1\6\1\37\1\4\2\36\1\71\1\37\1\36\1\4\1\37\1\6\1\4\1\37\1\4\1\34\1\4\1\6\1\36\1\37\2\36\1\71\1\36\1\37\1\6\1\37\1\4\1\37\1\6\1\4\1\6\1\4\2\37\1\36\1\37\1\71\1\36\1\37\1\36\1\37\1\6\1\37\1\4\1\37\1\4\1\37\1\6\1\37\2\36\2\37\1\4\1\37\2\6\1\37\1\36\2\37\1\6\4\37";
    static final String dfa_37s = "\1\53\1\uffff\1\32\2\4\1\0\1\36\1\uffff\1\37\1\4\1\41\1\33\1\71\1\4\1\51\1\42\1\71\1\36\1\37\1\4\1\35\1\0\2\71\1\51\1\4\1\35\1\6\1\51\1\71\1\41\1\71\1\37\1\71\1\36\1\4\1\51\1\6\1\41\1\4\2\41\1\71\1\37\1\71\1\4\1\41\1\6\1\4\1\41\1\4\1\35\1\51\1\6\1\41\1\37\1\41\2\71\1\41\1\37\1\6\1\41\1\4\1\41\1\6\1\51\1\6\1\4\1\41\1\37\1\41\1\37\1\71\1\41\1\37\2\41\1\6\1\41\1\4\1\41\1\4\1\41\1\6\1\37\2\41\1\37\1\41\1\4\1\41\2\6\2\41\2\37\1\6\2\41\1\37\1\41";
    static final String dfa_38s = "\1\uffff\1\2\5\uffff\1\1\137\uffff";
    static final String dfa_39s = "\5\uffff\1\1\17\uffff\1\0\121\uffff}>";
    static final String[] dfa_40s = {
            "\1\1\1\2\15\uffff\1\3\5\uffff\1\1\2\uffff\1\1\5\uffff\3\1",
            "",
            "\1\2\15\uffff\1\4",
            "\1\5",
            "\1\6",
            "\1\uffff",
            "\1\11\2\uffff\1\10",
            "",
            "\1\12\32\uffff\1\13",
            "\1\14",
            "\1\13\1\uffff\1\15",
            "\1\11",
            "\1\16",
            "\1\17",
            "\1\20\44\uffff\1\21",
            "\1\13\1\uffff\1\15\1\22",
            "\1\16",
            "\1\24\1\25\1\23",
            "\1\13",
            "\1\26",
            "\1\27\30\uffff\1\25",
            "\1\uffff",
            "\1\33\1\32\1\uffff\1\31\27\uffff\1\30",
            "\1\34",
            "\1\35\44\uffff\1\36",
            "\1\37",
            "\1\24\1\25",
            "\1\40",
            "\1\41\44\uffff\1\42",
            "\1\30",
            "\1\43\1\32\1\uffff\1\31",
            "\1\45\1\32\1\uffff\1\31\27\uffff\1\44",
            "\1\46",
            "\1\34",
            "\1\24\1\25\1\47",
            "\1\50",
            "\1\52\44\uffff\1\51",
            "\1\53",
            "\1\32\1\uffff\1\31",
            "\1\54",
            "\1\57\1\56\1\uffff\1\55",
            "\1\60\1\32\1\uffff\1\31",
            "\1\44",
            "\1\61",
            "\1\65\1\63\1\uffff\1\62\27\uffff\1\64",
            "\1\66",
            "\1\32\1\uffff\1\31",
            "\1\67",
            "\1\70",
            "\1\32\1\uffff\1\31",
            "\1\71",
            "\1\24\1\25",
            "\1\72\44\uffff\1\73",
            "\1\74",
            "\1\75\1\56\1\uffff\1\55",
            "\1\76",
            "\1\101\1\100\1\uffff\1\77",
            "\1\103\1\63\1\uffff\1\62\27\uffff\1\102",
            "\1\64",
            "\1\104\1\63\1\uffff\1\62",
            "\1\105",
            "\1\106",
            "\1\56\1\uffff\1\55",
            "\1\107",
            "\1\32\1\uffff\1\31",
            "\1\110",
            "\1\111\44\uffff\1\112",
            "\1\113",
            "\1\114",
            "\1\63\1\uffff\1\62",
            "\1\115",
            "\1\116\1\100\1\uffff\1\77",
            "\1\117",
            "\1\102",
            "\1\120\1\63\1\uffff\1\62",
            "\1\121",
            "\1\124\1\123\1\uffff\1\122",
            "\1\56\1\uffff\1\55",
            "\1\125",
            "\1\100\1\uffff\1\77",
            "\1\126",
            "\1\63\1\uffff\1\62",
            "\1\127",
            "\1\63\1\uffff\1\62",
            "\1\130",
            "\1\131",
            "\1\134\1\133\1\uffff\1\132",
            "\1\135\1\123\1\uffff\1\122",
            "\1\136",
            "\1\100\1\uffff\1\77",
            "\1\137",
            "\1\63\1\uffff\1\62",
            "\1\140",
            "\1\141",
            "\1\123\1\uffff\1\122",
            "\1\142\1\133\1\uffff\1\132",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\133\1\uffff\1\132",
            "\1\123\1\uffff\1\122",
            "\1\146",
            "\1\133\1\uffff\1\132"
    };

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final char[] dfa_37 = DFA.unpackEncodedStringToUnsignedChars(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final short[][] dfa_40 = unpackEncodedStringArray(dfa_40s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_34;
            this.eof = dfa_35;
            this.min = dfa_36;
            this.max = dfa_37;
            this.accept = dfa_38;
            this.special = dfa_39;
            this.transition = dfa_40;
        }
        public String getDescription() {
            return "()* loopback of 8028:7: ( ( rule__Document__AppendersAssignment_3_1 )=> rule__Document__AppendersAssignment_3_1 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_21 = input.LA(1);

                         
                        int index59_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMoniLog()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_21);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA59_5 = input.LA(1);

                         
                        int index59_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred2_InternalMoniLog()) ) {s = 7;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index59_5);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_41s = "\u00e0\uffff";
    static final String dfa_42s = "\1\1\u00df\uffff";
    static final String dfa_43s = "\1\13\1\uffff\1\13\1\4\1\33\1\4\1\15\1\44\1\37\1\33\7\47\2\4\1\33\1\36\1\37\1\4\2\33\1\37\1\4\1\45\1\36\2\4\1\36\1\6\1\4\3\36\1\6\1\4\1\37\1\36\2\6\1\4\1\6\1\37\1\36\1\37\1\6\2\37\1\34\1\71\3\34\1\41\1\37\1\6\1\37\2\34\1\4\1\35\5\4\2\37\1\4\1\45\2\36\1\0\4\36\1\37\1\36\1\4\2\6\1\uffff\1\6\2\4\1\34\1\6\1\4\1\34\1\4\1\34\3\6\4\34\1\71\1\37\1\41\1\37\1\71\2\36\1\37\2\36\3\37\4\4\1\34\1\4\1\37\1\4\1\6\1\4\1\37\2\6\2\37\1\34\5\36\1\37\1\36\1\71\2\37\1\34\1\6\1\4\1\34\2\4\1\34\2\6\1\4\1\34\1\6\1\4\1\37\1\6\1\37\1\4\3\37\2\36\1\71\1\36\2\37\1\36\1\37\1\36\1\37\1\36\1\37\1\6\2\4\1\6\2\37\1\6\1\37\1\6\1\37\1\4\1\37\1\6\1\37\1\71\2\36\2\37\1\34\1\37\1\36\2\37\1\4\1\6\1\4\4\37\1\6\1\37\1\36\1\37\1\36\1\37\1\6\1\4\2\37\1\6\2\37\1\36\2\37\1\6\3\37";
    static final String dfa_44s = "\1\53\1\uffff\1\43\1\4\1\46\1\37\1\23\1\44\1\41\1\46\7\47\2\4\1\33\1\50\1\42\1\41\2\33\1\37\1\41\1\50\1\76\1\4\1\73\1\76\1\6\1\4\1\36\1\71\1\36\1\6\1\4\1\37\1\41\2\6\1\75\1\6\1\37\2\41\1\6\2\37\1\35\1\71\3\36\2\41\1\6\1\37\2\35\1\73\1\35\1\51\4\4\1\37\1\41\1\35\1\45\1\71\1\36\1\0\1\71\2\41\1\36\1\41\1\36\1\75\2\6\1\uffff\1\6\1\51\1\4\1\35\1\6\1\4\1\35\1\4\1\35\3\6\3\36\1\35\1\71\1\37\1\41\1\37\1\71\1\41\1\71\1\37\2\41\3\37\3\4\1\51\1\35\1\4\1\41\1\4\1\6\1\51\1\41\2\6\1\41\1\37\1\35\1\71\2\41\1\36\1\41\1\37\1\41\1\71\2\37\1\35\1\6\1\4\1\35\1\51\1\4\1\35\2\6\1\4\1\35\1\6\1\4\1\41\1\6\1\41\1\4\2\41\1\37\1\71\1\41\1\71\1\41\2\37\1\41\1\37\1\41\1\37\2\41\1\6\1\51\1\4\1\6\2\41\1\6\1\37\1\6\1\41\1\4\1\41\1\6\1\37\1\71\2\41\2\37\1\35\1\37\1\41\1\37\1\41\1\4\1\6\1\4\4\41\1\6\2\41\1\37\1\41\1\37\1\6\1\4\2\41\1\6\1\41\1\37\1\41\1\37\1\41\1\6\1\41\1\37\1\41";
    static final String dfa_45s = "\1\uffff\1\2\123\uffff\1\1\u008a\uffff";
    static final String dfa_46s = "\113\uffff\1\0\u0094\uffff}>";
    static final String[] dfa_47s = {
            "\1\2\1\1\15\uffff\1\1\5\uffff\1\1\2\uffff\1\3\5\uffff\3\1",
            "",
            "\1\2\27\uffff\1\3",
            "\1\4",
            "\1\7\2\uffff\1\5\7\uffff\1\6",
            "\1\10\32\uffff\1\11",
            "\1\12\1\13\1\14\1\15\1\16\1\17\1\20",
            "\1\21",
            "\1\11\1\uffff\1\22",
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
            "\1\26\6\uffff\1\30\2\uffff\1\27",
            "\1\11\1\uffff\1\22\1\31",
            "\1\34\32\uffff\1\33\1\uffff\1\32",
            "\1\35",
            "\1\36",
            "\1\11",
            "\1\37\32\uffff\1\33\1\uffff\1\32",
            "\1\30\2\uffff\1\27",
            "\1\40\1\33\1\uffff\1\32\34\uffff\1\41",
            "\1\42",
            "\1\43\66\uffff\1\44",
            "\1\45\1\33\1\uffff\1\32\34\uffff\1\46",
            "\1\47",
            "\1\50",
            "\1\51",
            "\1\52\32\uffff\1\53",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60\1\33\1\uffff\1\32",
            "\1\61",
            "\1\62",
            "\1\64\44\uffff\1\65\20\uffff\1\66\1\uffff\1\67\1\63",
            "\1\70",
            "\1\71",
            "\1\72\1\33\1\uffff\1\32",
            "\1\33\1\uffff\1\32",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76\1\77",
            "\1\100",
            "\1\76\1\77\1\101",
            "\1\76\1\77\1\102",
            "\1\76\1\77\1\103",
            "\1\104",
            "\1\33\1\uffff\1\32",
            "\1\105",
            "\1\106",
            "\1\107\1\110",
            "\1\76\1\77",
            "\1\111\30\uffff\1\77\35\uffff\1\112",
            "\1\113",
            "\1\64\44\uffff\1\65",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\33\1\uffff\1\32",
            "\1\121\30\uffff\1\110",
            "\1\30",
            "\1\123\32\uffff\1\122",
            "\1\124",
            "\1\uffff",
            "\1\126\1\131\1\uffff\1\130\27\uffff\1\127",
            "\1\132\1\134\1\uffff\1\133",
            "\1\137\1\136\1\uffff\1\135",
            "\1\140",
            "\1\33\1\uffff\1\32",
            "\1\141",
            "\1\146\44\uffff\1\142\20\uffff\1\144\1\uffff\1\143\1\145",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152\44\uffff\1\153",
            "\1\154",
            "\1\76\1\77",
            "\1\155",
            "\1\156",
            "\1\76\1\77",
            "\1\157",
            "\1\76\1\77",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\76\1\77\1\163",
            "\1\76\1\77\1\164",
            "\1\76\1\77\1\165",
            "\1\76\1\77",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\127",
            "\1\172\1\131\1\uffff\1\130",
            "\1\173\1\131\1\uffff\1\130\27\uffff\1\174",
            "\1\175",
            "\1\176\1\134\1\uffff\1\133",
            "\1\177\1\136\1\uffff\1\135",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\146\44\uffff\1\142",
            "\1\76\1\77",
            "\1\u0086",
            "\1\131\1\uffff\1\130",
            "\1\u0087",
            "\1\u0088",
            "\1\u008a\44\uffff\1\u0089",
            "\1\134\1\uffff\1\133",
            "\1\u008b",
            "\1\u008c",
            "\1\136\1\uffff\1\135",
            "\1\u008d",
            "\1\107\1\110",
            "\1\u008e\1\u0090\1\uffff\1\u008f\27\uffff\1\u0091",
            "\1\u0094\1\u0093\1\uffff\1\u0092",
            "\1\u0095\1\u0097\1\uffff\1\u0096",
            "\1\u0098",
            "\1\u009b\1\u009a\1\uffff\1\u0099",
            "\1\u009c",
            "\1\u009d\1\131\1\uffff\1\130",
            "\1\174",
            "\1\u009e",
            "\1\u009f",
            "\1\76\1\77",
            "\1\u00a0",
            "\1\u00a1",
            "\1\76\1\77",
            "\1\u00a3\44\uffff\1\u00a2",
            "\1\u00a4",
            "\1\76\1\77",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\76\1\77",
            "\1\u00a8",
            "\1\u00a9",
            "\1\131\1\uffff\1\130",
            "\1\u00aa",
            "\1\131\1\uffff\1\130",
            "\1\u00ab",
            "\1\134\1\uffff\1\133",
            "\1\136\1\uffff\1\135",
            "\1\u00ac",
            "\1\u00ad\1\u0090\1\uffff\1\u008f\27\uffff\1\u00ae",
            "\1\u00af\1\u0090\1\uffff\1\u008f",
            "\1\u0091",
            "\1\u00b0\1\u0093\1\uffff\1\u0092",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3\1\u0097\1\uffff\1\u0096",
            "\1\u00b4",
            "\1\u00b5\1\u009a\1\uffff\1\u0099",
            "\1\u00b6",
            "\1\u00b9\1\u00b8\1\uffff\1\u00b7",
            "\1\u0090\1\uffff\1\u008f",
            "\1\u00ba",
            "\1\u00bb\44\uffff\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u0093\1\uffff\1\u0092",
            "\1\u0097\1\uffff\1\u0096",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u009a\1\uffff\1\u0099",
            "\1\u00c2",
            "\1\131\1\uffff\1\130",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00ae",
            "\1\u00c5\1\u0090\1\uffff\1\u008f",
            "\1\u00c6\1\u00c8\1\uffff\1\u00c7",
            "\1\u00c9",
            "\1\u00ca",
            "\1\76\1\77",
            "\1\u00cb",
            "\1\u00cc\1\u00b8\1\uffff\1\u00b7",
            "\1\u00cd",
            "\1\u0090\1\uffff\1\u008f",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u0090\1\uffff\1\u008f",
            "\1\u0093\1\uffff\1\u0092",
            "\1\u0097\1\uffff\1\u0096",
            "\1\u009a\1\uffff\1\u0099",
            "\1\u00d1",
            "\1\u00b8\1\uffff\1\u00b7",
            "\1\u00d2\1\u00d4\1\uffff\1\u00d3",
            "\1\u00d5",
            "\1\u00d6\1\u00c8\1\uffff\1\u00c7",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u0090\1\uffff\1\u008f",
            "\1\u00c8\1\uffff\1\u00c7",
            "\1\u00da",
            "\1\u00b8\1\uffff\1\u00b7",
            "\1\u00db",
            "\1\u00dc\1\u00d4\1\uffff\1\u00d3",
            "\1\u00dd",
            "\1\u00d4\1\uffff\1\u00d3",
            "\1\u00de",
            "\1\u00c8\1\uffff\1\u00c7",
            "\1\u00df",
            "\1\u00d4\1\uffff\1\u00d3"
    };

    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final char[] dfa_43 = DFA.unpackEncodedStringToUnsignedChars(dfa_43s);
    static final char[] dfa_44 = DFA.unpackEncodedStringToUnsignedChars(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[][] dfa_47 = unpackEncodedStringArray(dfa_47s);

    class DFA61 extends DFA {

        public DFA61(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 61;
            this.eot = dfa_41;
            this.eof = dfa_42;
            this.min = dfa_43;
            this.max = dfa_44;
            this.accept = dfa_45;
            this.special = dfa_46;
            this.transition = dfa_47;
        }
        public String getDescription() {
            return "()* loopback of 8072:7: ( ( rule__Document__MoniloggersAssignment_3_3 )=> rule__Document__MoniloggersAssignment_3_3 )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA61_75 = input.LA(1);

                         
                        int index61_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred4_InternalMoniLog()) ) {s = 85;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index61_75);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 61, _s, input);
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
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000048000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x00000E0904001800L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004048000000L});
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
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000280000000L});
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
