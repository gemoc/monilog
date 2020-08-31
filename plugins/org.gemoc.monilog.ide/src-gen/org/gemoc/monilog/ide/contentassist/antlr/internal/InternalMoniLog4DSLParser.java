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

@SuppressWarnings("all")
public class InternalMoniLog4DSLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'CONFIG'", "'FINE'", "'FINER'", "'FINEST'", "'INFO'", "'SEVERE'", "'WARNING'", "'S'", "'V'", "'nS'", "'nV'", "'default-language'", "'monilog'", "'{'", "'actions'", "'}'", "'['", "']'", "'events'", "','", "'conditions'", "'before'", "'frequency^'", "'limit'", "'after'", "'frequency'", "'stream'", "'('", "')'", "'always'", "'exists'", "'never'", "'precedes'", "'respondsTo'", "'atleast'", "'atmost'", "'globally'", "'between'", "'and'", "'until'", "'notify'", "'append'", "'file'", "'console'", "'='", "'.'"
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



    // $ANTLR start "entryRuleModel"
    // InternalMoniLog4DSL.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:54:1: ( ruleModel EOF )
            // InternalMoniLog4DSL.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMoniLog4DSL.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMoniLog4DSL.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMoniLog4DSL.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMoniLog4DSL.g:69:3: ( rule__Model__Group__0 )
            // InternalMoniLog4DSL.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleMoniLogSpec"
    // InternalMoniLog4DSL.g:78:1: entryRuleMoniLogSpec : ruleMoniLogSpec EOF ;
    public final void entryRuleMoniLogSpec() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:79:1: ( ruleMoniLogSpec EOF )
            // InternalMoniLog4DSL.g:80:1: ruleMoniLogSpec EOF
            {
             before(grammarAccess.getMoniLogSpecRule()); 
            pushFollow(FOLLOW_1);
            ruleMoniLogSpec();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMoniLogSpec"


    // $ANTLR start "ruleMoniLogSpec"
    // InternalMoniLog4DSL.g:87:1: ruleMoniLogSpec : ( ( rule__MoniLogSpec__Group__0 ) ) ;
    public final void ruleMoniLogSpec() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:91:2: ( ( ( rule__MoniLogSpec__Group__0 ) ) )
            // InternalMoniLog4DSL.g:92:2: ( ( rule__MoniLogSpec__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:92:2: ( ( rule__MoniLogSpec__Group__0 ) )
            // InternalMoniLog4DSL.g:93:3: ( rule__MoniLogSpec__Group__0 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup()); 
            // InternalMoniLog4DSL.g:94:3: ( rule__MoniLogSpec__Group__0 )
            // InternalMoniLog4DSL.g:94:4: rule__MoniLogSpec__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMoniLogSpec"


    // $ANTLR start "entryRuleEvent"
    // InternalMoniLog4DSL.g:103:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:104:1: ( ruleEvent EOF )
            // InternalMoniLog4DSL.g:105:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:112:1: ruleEvent : ( ( rule__Event__Alternatives ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:116:2: ( ( ( rule__Event__Alternatives ) ) )
            // InternalMoniLog4DSL.g:117:2: ( ( rule__Event__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:117:2: ( ( rule__Event__Alternatives ) )
            // InternalMoniLog4DSL.g:118:3: ( rule__Event__Alternatives )
            {
             before(grammarAccess.getEventAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:119:3: ( rule__Event__Alternatives )
            // InternalMoniLog4DSL.g:119:4: rule__Event__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Event__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBeforeEvent"
    // InternalMoniLog4DSL.g:128:1: entryRuleBeforeEvent : ruleBeforeEvent EOF ;
    public final void entryRuleBeforeEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:129:1: ( ruleBeforeEvent EOF )
            // InternalMoniLog4DSL.g:130:1: ruleBeforeEvent EOF
            {
             before(grammarAccess.getBeforeEventRule()); 
            pushFollow(FOLLOW_1);
            ruleBeforeEvent();

            state._fsp--;

             after(grammarAccess.getBeforeEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBeforeEvent"


    // $ANTLR start "ruleBeforeEvent"
    // InternalMoniLog4DSL.g:137:1: ruleBeforeEvent : ( ( rule__BeforeEvent__Group__0 ) ) ;
    public final void ruleBeforeEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:141:2: ( ( ( rule__BeforeEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:142:2: ( ( rule__BeforeEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:142:2: ( ( rule__BeforeEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:143:3: ( rule__BeforeEvent__Group__0 )
            {
             before(grammarAccess.getBeforeEventAccess().getGroup()); 
            // InternalMoniLog4DSL.g:144:3: ( rule__BeforeEvent__Group__0 )
            // InternalMoniLog4DSL.g:144:4: rule__BeforeEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeforeEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeforeEvent"


    // $ANTLR start "entryRuleAfterEvent"
    // InternalMoniLog4DSL.g:153:1: entryRuleAfterEvent : ruleAfterEvent EOF ;
    public final void entryRuleAfterEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:154:1: ( ruleAfterEvent EOF )
            // InternalMoniLog4DSL.g:155:1: ruleAfterEvent EOF
            {
             before(grammarAccess.getAfterEventRule()); 
            pushFollow(FOLLOW_1);
            ruleAfterEvent();

            state._fsp--;

             after(grammarAccess.getAfterEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAfterEvent"


    // $ANTLR start "ruleAfterEvent"
    // InternalMoniLog4DSL.g:162:1: ruleAfterEvent : ( ( rule__AfterEvent__Group__0 ) ) ;
    public final void ruleAfterEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:166:2: ( ( ( rule__AfterEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:167:2: ( ( rule__AfterEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:167:2: ( ( rule__AfterEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:168:3: ( rule__AfterEvent__Group__0 )
            {
             before(grammarAccess.getAfterEventAccess().getGroup()); 
            // InternalMoniLog4DSL.g:169:3: ( rule__AfterEvent__Group__0 )
            // InternalMoniLog4DSL.g:169:4: rule__AfterEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAfterEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAfterEvent"


    // $ANTLR start "entryRuleBeforeAfterEvent"
    // InternalMoniLog4DSL.g:178:1: entryRuleBeforeAfterEvent : ruleBeforeAfterEvent EOF ;
    public final void entryRuleBeforeAfterEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:179:1: ( ruleBeforeAfterEvent EOF )
            // InternalMoniLog4DSL.g:180:1: ruleBeforeAfterEvent EOF
            {
             before(grammarAccess.getBeforeAfterEventRule()); 
            pushFollow(FOLLOW_1);
            ruleBeforeAfterEvent();

            state._fsp--;

             after(grammarAccess.getBeforeAfterEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleBeforeAfterEvent"


    // $ANTLR start "ruleBeforeAfterEvent"
    // InternalMoniLog4DSL.g:187:1: ruleBeforeAfterEvent : ( ( rule__BeforeAfterEvent__Group__0 ) ) ;
    public final void ruleBeforeAfterEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:191:2: ( ( ( rule__BeforeAfterEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:192:2: ( ( rule__BeforeAfterEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:192:2: ( ( rule__BeforeAfterEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:193:3: ( rule__BeforeAfterEvent__Group__0 )
            {
             before(grammarAccess.getBeforeAfterEventAccess().getGroup()); 
            // InternalMoniLog4DSL.g:194:3: ( rule__BeforeAfterEvent__Group__0 )
            // InternalMoniLog4DSL.g:194:4: rule__BeforeAfterEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBeforeAfterEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBeforeAfterEvent"


    // $ANTLR start "entryRuleCondition"
    // InternalMoniLog4DSL.g:203:1: entryRuleCondition : ruleCondition EOF ;
    public final void entryRuleCondition() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:204:1: ( ruleCondition EOF )
            // InternalMoniLog4DSL.g:205:1: ruleCondition EOF
            {
             before(grammarAccess.getConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getConditionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:212:1: ruleCondition : ( ( rule__Condition__Alternatives ) ) ;
    public final void ruleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:216:2: ( ( ( rule__Condition__Alternatives ) ) )
            // InternalMoniLog4DSL.g:217:2: ( ( rule__Condition__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:217:2: ( ( rule__Condition__Alternatives ) )
            // InternalMoniLog4DSL.g:218:3: ( rule__Condition__Alternatives )
            {
             before(grammarAccess.getConditionAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:219:3: ( rule__Condition__Alternatives )
            // InternalMoniLog4DSL.g:219:4: rule__Condition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:228:1: entryRuleTemporalPattern : ruleTemporalPattern EOF ;
    public final void entryRuleTemporalPattern() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:229:1: ( ruleTemporalPattern EOF )
            // InternalMoniLog4DSL.g:230:1: ruleTemporalPattern EOF
            {
             before(grammarAccess.getTemporalPatternRule()); 
            pushFollow(FOLLOW_1);
            ruleTemporalPattern();

            state._fsp--;

             after(grammarAccess.getTemporalPatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:237:1: ruleTemporalPattern : ( ( rule__TemporalPattern__Group__0 ) ) ;
    public final void ruleTemporalPattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:241:2: ( ( ( rule__TemporalPattern__Group__0 ) ) )
            // InternalMoniLog4DSL.g:242:2: ( ( rule__TemporalPattern__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:242:2: ( ( rule__TemporalPattern__Group__0 ) )
            // InternalMoniLog4DSL.g:243:3: ( rule__TemporalPattern__Group__0 )
            {
             before(grammarAccess.getTemporalPatternAccess().getGroup()); 
            // InternalMoniLog4DSL.g:244:3: ( rule__TemporalPattern__Group__0 )
            // InternalMoniLog4DSL.g:244:4: rule__TemporalPattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPatternAccess().getGroup()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:253:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:254:1: ( rulePattern EOF )
            // InternalMoniLog4DSL.g:255:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:262:1: rulePattern : ( ( rule__Pattern__Alternatives ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:266:2: ( ( ( rule__Pattern__Alternatives ) ) )
            // InternalMoniLog4DSL.g:267:2: ( ( rule__Pattern__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:267:2: ( ( rule__Pattern__Alternatives ) )
            // InternalMoniLog4DSL.g:268:3: ( rule__Pattern__Alternatives )
            {
             before(grammarAccess.getPatternAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:269:3: ( rule__Pattern__Alternatives )
            // InternalMoniLog4DSL.g:269:4: rule__Pattern__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:278:1: entryRuleBoundType : ruleBoundType EOF ;
    public final void entryRuleBoundType() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:279:1: ( ruleBoundType EOF )
            // InternalMoniLog4DSL.g:280:1: ruleBoundType EOF
            {
             before(grammarAccess.getBoundTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleBoundType();

            state._fsp--;

             after(grammarAccess.getBoundTypeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:287:1: ruleBoundType : ( ( rule__BoundType__Alternatives ) ) ;
    public final void ruleBoundType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:291:2: ( ( ( rule__BoundType__Alternatives ) ) )
            // InternalMoniLog4DSL.g:292:2: ( ( rule__BoundType__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:292:2: ( ( rule__BoundType__Alternatives ) )
            // InternalMoniLog4DSL.g:293:3: ( rule__BoundType__Alternatives )
            {
             before(grammarAccess.getBoundTypeAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:294:3: ( rule__BoundType__Alternatives )
            // InternalMoniLog4DSL.g:294:4: rule__BoundType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BoundType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBoundTypeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:303:1: entryRuleExactBound : ruleExactBound EOF ;
    public final void entryRuleExactBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:304:1: ( ruleExactBound EOF )
            // InternalMoniLog4DSL.g:305:1: ruleExactBound EOF
            {
             before(grammarAccess.getExactBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleExactBound();

            state._fsp--;

             after(grammarAccess.getExactBoundRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:312:1: ruleExactBound : ( ( rule__ExactBound__NAssignment ) ) ;
    public final void ruleExactBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:316:2: ( ( ( rule__ExactBound__NAssignment ) ) )
            // InternalMoniLog4DSL.g:317:2: ( ( rule__ExactBound__NAssignment ) )
            {
            // InternalMoniLog4DSL.g:317:2: ( ( rule__ExactBound__NAssignment ) )
            // InternalMoniLog4DSL.g:318:3: ( rule__ExactBound__NAssignment )
            {
             before(grammarAccess.getExactBoundAccess().getNAssignment()); 
            // InternalMoniLog4DSL.g:319:3: ( rule__ExactBound__NAssignment )
            // InternalMoniLog4DSL.g:319:4: rule__ExactBound__NAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ExactBound__NAssignment();

            state._fsp--;


            }

             after(grammarAccess.getExactBoundAccess().getNAssignment()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:328:1: entryRuleLowerBound : ruleLowerBound EOF ;
    public final void entryRuleLowerBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:329:1: ( ruleLowerBound EOF )
            // InternalMoniLog4DSL.g:330:1: ruleLowerBound EOF
            {
             before(grammarAccess.getLowerBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleLowerBound();

            state._fsp--;

             after(grammarAccess.getLowerBoundRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:337:1: ruleLowerBound : ( ( rule__LowerBound__Group__0 ) ) ;
    public final void ruleLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:341:2: ( ( ( rule__LowerBound__Group__0 ) ) )
            // InternalMoniLog4DSL.g:342:2: ( ( rule__LowerBound__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:342:2: ( ( rule__LowerBound__Group__0 ) )
            // InternalMoniLog4DSL.g:343:3: ( rule__LowerBound__Group__0 )
            {
             before(grammarAccess.getLowerBoundAccess().getGroup()); 
            // InternalMoniLog4DSL.g:344:3: ( rule__LowerBound__Group__0 )
            // InternalMoniLog4DSL.g:344:4: rule__LowerBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LowerBound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLowerBoundAccess().getGroup()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:353:1: entryRuleUpperBound : ruleUpperBound EOF ;
    public final void entryRuleUpperBound() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:354:1: ( ruleUpperBound EOF )
            // InternalMoniLog4DSL.g:355:1: ruleUpperBound EOF
            {
             before(grammarAccess.getUpperBoundRule()); 
            pushFollow(FOLLOW_1);
            ruleUpperBound();

            state._fsp--;

             after(grammarAccess.getUpperBoundRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:362:1: ruleUpperBound : ( ( rule__UpperBound__Group__0 ) ) ;
    public final void ruleUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:366:2: ( ( ( rule__UpperBound__Group__0 ) ) )
            // InternalMoniLog4DSL.g:367:2: ( ( rule__UpperBound__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:367:2: ( ( rule__UpperBound__Group__0 ) )
            // InternalMoniLog4DSL.g:368:3: ( rule__UpperBound__Group__0 )
            {
             before(grammarAccess.getUpperBoundAccess().getGroup()); 
            // InternalMoniLog4DSL.g:369:3: ( rule__UpperBound__Group__0 )
            // InternalMoniLog4DSL.g:369:4: rule__UpperBound__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUpperBoundAccess().getGroup()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:378:1: entryRuleScope : ruleScope EOF ;
    public final void entryRuleScope() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:379:1: ( ruleScope EOF )
            // InternalMoniLog4DSL.g:380:1: ruleScope EOF
            {
             before(grammarAccess.getScopeRule()); 
            pushFollow(FOLLOW_1);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getScopeRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:387:1: ruleScope : ( ( rule__Scope__Alternatives ) ) ;
    public final void ruleScope() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:391:2: ( ( ( rule__Scope__Alternatives ) ) )
            // InternalMoniLog4DSL.g:392:2: ( ( rule__Scope__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:392:2: ( ( rule__Scope__Alternatives ) )
            // InternalMoniLog4DSL.g:393:3: ( rule__Scope__Alternatives )
            {
             before(grammarAccess.getScopeAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:394:3: ( rule__Scope__Alternatives )
            // InternalMoniLog4DSL.g:394:4: rule__Scope__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:403:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:404:1: ( ruleAction EOF )
            // InternalMoniLog4DSL.g:405:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:412:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:416:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMoniLog4DSL.g:417:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:417:2: ( ( rule__Action__Alternatives ) )
            // InternalMoniLog4DSL.g:418:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:419:3: ( rule__Action__Alternatives )
            // InternalMoniLog4DSL.g:419:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleAppend"
    // InternalMoniLog4DSL.g:428:1: entryRuleAppend : ruleAppend EOF ;
    public final void entryRuleAppend() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:429:1: ( ruleAppend EOF )
            // InternalMoniLog4DSL.g:430:1: ruleAppend EOF
            {
             before(grammarAccess.getAppendRule()); 
            pushFollow(FOLLOW_1);
            ruleAppend();

            state._fsp--;

             after(grammarAccess.getAppendRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAppend"


    // $ANTLR start "ruleAppend"
    // InternalMoniLog4DSL.g:437:1: ruleAppend : ( ( rule__Append__Group__0 ) ) ;
    public final void ruleAppend() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:441:2: ( ( ( rule__Append__Group__0 ) ) )
            // InternalMoniLog4DSL.g:442:2: ( ( rule__Append__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:442:2: ( ( rule__Append__Group__0 ) )
            // InternalMoniLog4DSL.g:443:3: ( rule__Append__Group__0 )
            {
             before(grammarAccess.getAppendAccess().getGroup()); 
            // InternalMoniLog4DSL.g:444:3: ( rule__Append__Group__0 )
            // InternalMoniLog4DSL.g:444:4: rule__Append__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Append__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAppendAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAppend"


    // $ANTLR start "entryRuleAppender"
    // InternalMoniLog4DSL.g:453:1: entryRuleAppender : ruleAppender EOF ;
    public final void entryRuleAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:454:1: ( ruleAppender EOF )
            // InternalMoniLog4DSL.g:455:1: ruleAppender EOF
            {
             before(grammarAccess.getAppenderRule()); 
            pushFollow(FOLLOW_1);
            ruleAppender();

            state._fsp--;

             after(grammarAccess.getAppenderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:462:1: ruleAppender : ( ( rule__Appender__Alternatives ) ) ;
    public final void ruleAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:466:2: ( ( ( rule__Appender__Alternatives ) ) )
            // InternalMoniLog4DSL.g:467:2: ( ( rule__Appender__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:467:2: ( ( rule__Appender__Alternatives ) )
            // InternalMoniLog4DSL.g:468:3: ( rule__Appender__Alternatives )
            {
             before(grammarAccess.getAppenderAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:469:3: ( rule__Appender__Alternatives )
            // InternalMoniLog4DSL.g:469:4: rule__Appender__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Appender__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAppenderAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStreamAppender"
    // InternalMoniLog4DSL.g:478:1: entryRuleStreamAppender : ruleStreamAppender EOF ;
    public final void entryRuleStreamAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:479:1: ( ruleStreamAppender EOF )
            // InternalMoniLog4DSL.g:480:1: ruleStreamAppender EOF
            {
             before(grammarAccess.getStreamAppenderRule()); 
            pushFollow(FOLLOW_1);
            ruleStreamAppender();

            state._fsp--;

             after(grammarAccess.getStreamAppenderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStreamAppender"


    // $ANTLR start "ruleStreamAppender"
    // InternalMoniLog4DSL.g:487:1: ruleStreamAppender : ( ( rule__StreamAppender__Group__0 ) ) ;
    public final void ruleStreamAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:491:2: ( ( ( rule__StreamAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:492:2: ( ( rule__StreamAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:492:2: ( ( rule__StreamAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:493:3: ( rule__StreamAppender__Group__0 )
            {
             before(grammarAccess.getStreamAppenderAccess().getGroup()); 
            // InternalMoniLog4DSL.g:494:3: ( rule__StreamAppender__Group__0 )
            // InternalMoniLog4DSL.g:494:4: rule__StreamAppender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAppenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStreamAppender"


    // $ANTLR start "entryRuleFileAppender"
    // InternalMoniLog4DSL.g:503:1: entryRuleFileAppender : ruleFileAppender EOF ;
    public final void entryRuleFileAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:504:1: ( ruleFileAppender EOF )
            // InternalMoniLog4DSL.g:505:1: ruleFileAppender EOF
            {
             before(grammarAccess.getFileAppenderRule()); 
            pushFollow(FOLLOW_1);
            ruleFileAppender();

            state._fsp--;

             after(grammarAccess.getFileAppenderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleFileAppender"


    // $ANTLR start "ruleFileAppender"
    // InternalMoniLog4DSL.g:512:1: ruleFileAppender : ( ( rule__FileAppender__Group__0 ) ) ;
    public final void ruleFileAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:516:2: ( ( ( rule__FileAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:517:2: ( ( rule__FileAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:517:2: ( ( rule__FileAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:518:3: ( rule__FileAppender__Group__0 )
            {
             before(grammarAccess.getFileAppenderAccess().getGroup()); 
            // InternalMoniLog4DSL.g:519:3: ( rule__FileAppender__Group__0 )
            // InternalMoniLog4DSL.g:519:4: rule__FileAppender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFileAppenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFileAppender"


    // $ANTLR start "entryRuleConsoleAppender"
    // InternalMoniLog4DSL.g:528:1: entryRuleConsoleAppender : ruleConsoleAppender EOF ;
    public final void entryRuleConsoleAppender() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:529:1: ( ruleConsoleAppender EOF )
            // InternalMoniLog4DSL.g:530:1: ruleConsoleAppender EOF
            {
             before(grammarAccess.getConsoleAppenderRule()); 
            pushFollow(FOLLOW_1);
            ruleConsoleAppender();

            state._fsp--;

             after(grammarAccess.getConsoleAppenderRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleConsoleAppender"


    // $ANTLR start "ruleConsoleAppender"
    // InternalMoniLog4DSL.g:537:1: ruleConsoleAppender : ( ( rule__ConsoleAppender__Group__0 ) ) ;
    public final void ruleConsoleAppender() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:541:2: ( ( ( rule__ConsoleAppender__Group__0 ) ) )
            // InternalMoniLog4DSL.g:542:2: ( ( rule__ConsoleAppender__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:542:2: ( ( rule__ConsoleAppender__Group__0 ) )
            // InternalMoniLog4DSL.g:543:3: ( rule__ConsoleAppender__Group__0 )
            {
             before(grammarAccess.getConsoleAppenderAccess().getGroup()); 
            // InternalMoniLog4DSL.g:544:3: ( rule__ConsoleAppender__Group__0 )
            // InternalMoniLog4DSL.g:544:4: rule__ConsoleAppender__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleAppender__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConsoleAppenderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConsoleAppender"


    // $ANTLR start "entryRuleLayout"
    // InternalMoniLog4DSL.g:553:1: entryRuleLayout : ruleLayout EOF ;
    public final void entryRuleLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:554:1: ( ruleLayout EOF )
            // InternalMoniLog4DSL.g:555:1: ruleLayout EOF
            {
             before(grammarAccess.getLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:562:1: ruleLayout : ( ( rule__Layout__Alternatives ) ) ;
    public final void ruleLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:566:2: ( ( ( rule__Layout__Alternatives ) ) )
            // InternalMoniLog4DSL.g:567:2: ( ( rule__Layout__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:567:2: ( ( rule__Layout__Alternatives ) )
            // InternalMoniLog4DSL.g:568:3: ( rule__Layout__Alternatives )
            {
             before(grammarAccess.getLayoutAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:569:3: ( rule__Layout__Alternatives )
            // InternalMoniLog4DSL.g:569:4: rule__Layout__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Layout__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLayoutAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStringLayout"
    // InternalMoniLog4DSL.g:578:1: entryRuleStringLayout : ruleStringLayout EOF ;
    public final void entryRuleStringLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:579:1: ( ruleStringLayout EOF )
            // InternalMoniLog4DSL.g:580:1: ruleStringLayout EOF
            {
             before(grammarAccess.getStringLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLayout();

            state._fsp--;

             after(grammarAccess.getStringLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleStringLayout"


    // $ANTLR start "ruleStringLayout"
    // InternalMoniLog4DSL.g:587:1: ruleStringLayout : ( ( rule__StringLayout__Group__0 ) ) ;
    public final void ruleStringLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:591:2: ( ( ( rule__StringLayout__Group__0 ) ) )
            // InternalMoniLog4DSL.g:592:2: ( ( rule__StringLayout__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:592:2: ( ( rule__StringLayout__Group__0 ) )
            // InternalMoniLog4DSL.g:593:3: ( rule__StringLayout__Group__0 )
            {
             before(grammarAccess.getStringLayoutAccess().getGroup()); 
            // InternalMoniLog4DSL.g:594:3: ( rule__StringLayout__Group__0 )
            // InternalMoniLog4DSL.g:594:4: rule__StringLayout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringLayout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringLayoutAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringLayout"


    // $ANTLR start "entryRuleExternalLayout"
    // InternalMoniLog4DSL.g:603:1: entryRuleExternalLayout : ruleExternalLayout EOF ;
    public final void entryRuleExternalLayout() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:604:1: ( ruleExternalLayout EOF )
            // InternalMoniLog4DSL.g:605:1: ruleExternalLayout EOF
            {
             before(grammarAccess.getExternalLayoutRule()); 
            pushFollow(FOLLOW_1);
            ruleExternalLayout();

            state._fsp--;

             after(grammarAccess.getExternalLayoutRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:612:1: ruleExternalLayout : ( ( rule__ExternalLayout__Group__0 ) ) ;
    public final void ruleExternalLayout() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:616:2: ( ( ( rule__ExternalLayout__Group__0 ) ) )
            // InternalMoniLog4DSL.g:617:2: ( ( rule__ExternalLayout__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:617:2: ( ( rule__ExternalLayout__Group__0 ) )
            // InternalMoniLog4DSL.g:618:3: ( rule__ExternalLayout__Group__0 )
            {
             before(grammarAccess.getExternalLayoutAccess().getGroup()); 
            // InternalMoniLog4DSL.g:619:3: ( rule__ExternalLayout__Group__0 )
            // InternalMoniLog4DSL.g:619:4: rule__ExternalLayout__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExternalLayoutAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleStreamEvent"
    // InternalMoniLog4DSL.g:628:1: entryRuleStreamEvent : ruleStreamEvent EOF ;
    public final void entryRuleStreamEvent() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:629:1: ( ruleStreamEvent EOF )
            // InternalMoniLog4DSL.g:630:1: ruleStreamEvent EOF
            {
             before(grammarAccess.getStreamEventRule()); 
            pushFollow(FOLLOW_1);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getStreamEventRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:637:1: ruleStreamEvent : ( ( rule__StreamEvent__Group__0 ) ) ;
    public final void ruleStreamEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:641:2: ( ( ( rule__StreamEvent__Group__0 ) ) )
            // InternalMoniLog4DSL.g:642:2: ( ( rule__StreamEvent__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:642:2: ( ( rule__StreamEvent__Group__0 ) )
            // InternalMoniLog4DSL.g:643:3: ( rule__StreamEvent__Group__0 )
            {
             before(grammarAccess.getStreamEventAccess().getGroup()); 
            // InternalMoniLog4DSL.g:644:3: ( rule__StreamEvent__Group__0 )
            // InternalMoniLog4DSL.g:644:4: rule__StreamEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStreamEventAccess().getGroup()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:653:1: entryRuleEmptyOrPropertyValue : ruleEmptyOrPropertyValue EOF ;
    public final void entryRuleEmptyOrPropertyValue() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:654:1: ( ruleEmptyOrPropertyValue EOF )
            // InternalMoniLog4DSL.g:655:1: ruleEmptyOrPropertyValue EOF
            {
             before(grammarAccess.getEmptyOrPropertyValueRule()); 
            pushFollow(FOLLOW_1);
            ruleEmptyOrPropertyValue();

            state._fsp--;

             after(grammarAccess.getEmptyOrPropertyValueRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:662:1: ruleEmptyOrPropertyValue : ( ( rule__EmptyOrPropertyValue__Alternatives ) ) ;
    public final void ruleEmptyOrPropertyValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:666:2: ( ( ( rule__EmptyOrPropertyValue__Alternatives ) ) )
            // InternalMoniLog4DSL.g:667:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:667:2: ( ( rule__EmptyOrPropertyValue__Alternatives ) )
            // InternalMoniLog4DSL.g:668:3: ( rule__EmptyOrPropertyValue__Alternatives )
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:669:3: ( rule__EmptyOrPropertyValue__Alternatives )
            // InternalMoniLog4DSL.g:669:4: rule__EmptyOrPropertyValue__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEmptyOrPropertyValueAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleLanguageExpression"
    // InternalMoniLog4DSL.g:678:1: entryRuleLanguageExpression : ruleLanguageExpression EOF ;
    public final void entryRuleLanguageExpression() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:679:1: ( ruleLanguageExpression EOF )
            // InternalMoniLog4DSL.g:680:1: ruleLanguageExpression EOF
            {
             before(grammarAccess.getLanguageExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getLanguageExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:687:1: ruleLanguageExpression : ( ( rule__LanguageExpression__Alternatives ) ) ;
    public final void ruleLanguageExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:691:2: ( ( ( rule__LanguageExpression__Alternatives ) ) )
            // InternalMoniLog4DSL.g:692:2: ( ( rule__LanguageExpression__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:692:2: ( ( rule__LanguageExpression__Alternatives ) )
            // InternalMoniLog4DSL.g:693:3: ( rule__LanguageExpression__Alternatives )
            {
             before(grammarAccess.getLanguageExpressionAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:694:3: ( rule__LanguageExpression__Alternatives )
            // InternalMoniLog4DSL.g:694:4: rule__LanguageExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLanguageExpressionAccess().getAlternatives()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:703:1: entryRuleFQN : ruleFQN EOF ;
    public final void entryRuleFQN() throws RecognitionException {
        try {
            // InternalMoniLog4DSL.g:704:1: ( ruleFQN EOF )
            // InternalMoniLog4DSL.g:705:1: ruleFQN EOF
            {
             before(grammarAccess.getFQNRule()); 
            pushFollow(FOLLOW_1);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getFQNRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // InternalMoniLog4DSL.g:712:1: ruleFQN : ( ( rule__FQN__Group__0 ) ) ;
    public final void ruleFQN() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:716:2: ( ( ( rule__FQN__Group__0 ) ) )
            // InternalMoniLog4DSL.g:717:2: ( ( rule__FQN__Group__0 ) )
            {
            // InternalMoniLog4DSL.g:717:2: ( ( rule__FQN__Group__0 ) )
            // InternalMoniLog4DSL.g:718:3: ( rule__FQN__Group__0 )
            {
             before(grammarAccess.getFQNAccess().getGroup()); 
            // InternalMoniLog4DSL.g:719:3: ( rule__FQN__Group__0 )
            // InternalMoniLog4DSL.g:719:4: rule__FQN__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFQNAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "ruleLogLevel"
    // InternalMoniLog4DSL.g:728:1: ruleLogLevel : ( ( rule__LogLevel__Alternatives ) ) ;
    public final void ruleLogLevel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:732:1: ( ( ( rule__LogLevel__Alternatives ) ) )
            // InternalMoniLog4DSL.g:733:2: ( ( rule__LogLevel__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:733:2: ( ( rule__LogLevel__Alternatives ) )
            // InternalMoniLog4DSL.g:734:3: ( rule__LogLevel__Alternatives )
            {
             before(grammarAccess.getLogLevelAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:735:3: ( rule__LogLevel__Alternatives )
            // InternalMoniLog4DSL.g:735:4: rule__LogLevel__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogLevel__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogLevelAccess().getAlternatives()); 

            }


            }

        }
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


    // $ANTLR start "ruleTemporalPropertyConditionKind"
    // InternalMoniLog4DSL.g:744:1: ruleTemporalPropertyConditionKind : ( ( rule__TemporalPropertyConditionKind__Alternatives ) ) ;
    public final void ruleTemporalPropertyConditionKind() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:748:1: ( ( ( rule__TemporalPropertyConditionKind__Alternatives ) ) )
            // InternalMoniLog4DSL.g:749:2: ( ( rule__TemporalPropertyConditionKind__Alternatives ) )
            {
            // InternalMoniLog4DSL.g:749:2: ( ( rule__TemporalPropertyConditionKind__Alternatives ) )
            // InternalMoniLog4DSL.g:750:3: ( rule__TemporalPropertyConditionKind__Alternatives )
            {
             before(grammarAccess.getTemporalPropertyConditionKindAccess().getAlternatives()); 
            // InternalMoniLog4DSL.g:751:3: ( rule__TemporalPropertyConditionKind__Alternatives )
            // InternalMoniLog4DSL.g:751:4: rule__TemporalPropertyConditionKind__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPropertyConditionKind__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPropertyConditionKindAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTemporalPropertyConditionKind"


    // $ANTLR start "rule__Model__DefaultLanguageIDAlternatives_0_1_0"
    // InternalMoniLog4DSL.g:759:1: rule__Model__DefaultLanguageIDAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Model__DefaultLanguageIDAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:763:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // InternalMoniLog4DSL.g:764:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:764:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:765:3: RULE_ID
                    {
                     before(grammarAccess.getModelAccess().getDefaultLanguageIDIDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDefaultLanguageIDIDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:770:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:770:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:771:3: RULE_STRING
                    {
                     before(grammarAccess.getModelAccess().getDefaultLanguageIDSTRINGTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getModelAccess().getDefaultLanguageIDSTRINGTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__Model__DefaultLanguageIDAlternatives_0_1_0"


    // $ANTLR start "rule__Event__Alternatives"
    // InternalMoniLog4DSL.g:780:1: rule__Event__Alternatives : ( ( ruleBeforeEvent ) | ( ruleAfterEvent ) | ( ruleBeforeAfterEvent ) );
    public final void rule__Event__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:784:1: ( ( ruleBeforeEvent ) | ( ruleAfterEvent ) | ( ruleBeforeAfterEvent ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 35:
                {
                alt2=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMoniLog4DSL.g:785:2: ( ruleBeforeEvent )
                    {
                    // InternalMoniLog4DSL.g:785:2: ( ruleBeforeEvent )
                    // InternalMoniLog4DSL.g:786:3: ruleBeforeEvent
                    {
                     before(grammarAccess.getEventAccess().getBeforeEventParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleBeforeEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getBeforeEventParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:791:2: ( ruleAfterEvent )
                    {
                    // InternalMoniLog4DSL.g:791:2: ( ruleAfterEvent )
                    // InternalMoniLog4DSL.g:792:3: ruleAfterEvent
                    {
                     before(grammarAccess.getEventAccess().getAfterEventParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAfterEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getAfterEventParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:797:2: ( ruleBeforeAfterEvent )
                    {
                    // InternalMoniLog4DSL.g:797:2: ( ruleBeforeAfterEvent )
                    // InternalMoniLog4DSL.g:798:3: ruleBeforeAfterEvent
                    {
                     before(grammarAccess.getEventAccess().getBeforeAfterEventParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleBeforeAfterEvent();

                    state._fsp--;

                     after(grammarAccess.getEventAccess().getBeforeAfterEventParserRuleCall_2()); 

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


    // $ANTLR start "rule__BeforeEvent__RuleIDAlternatives_1_0"
    // InternalMoniLog4DSL.g:807:1: rule__BeforeEvent__RuleIDAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__BeforeEvent__RuleIDAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:811:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_STRING) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMoniLog4DSL.g:812:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:812:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:813:3: RULE_ID
                    {
                     before(grammarAccess.getBeforeEventAccess().getRuleIDIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBeforeEventAccess().getRuleIDIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:818:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:818:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:819:3: RULE_STRING
                    {
                     before(grammarAccess.getBeforeEventAccess().getRuleIDSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBeforeEventAccess().getRuleIDSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__BeforeEvent__RuleIDAlternatives_1_0"


    // $ANTLR start "rule__AfterEvent__RuleIDAlternatives_1_0"
    // InternalMoniLog4DSL.g:828:1: rule__AfterEvent__RuleIDAlternatives_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__AfterEvent__RuleIDAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:832:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_STRING) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoniLog4DSL.g:833:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:833:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:834:3: RULE_ID
                    {
                     before(grammarAccess.getAfterEventAccess().getRuleIDIDTerminalRuleCall_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getAfterEventAccess().getRuleIDIDTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:839:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:839:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:840:3: RULE_STRING
                    {
                     before(grammarAccess.getAfterEventAccess().getRuleIDSTRINGTerminalRuleCall_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getAfterEventAccess().getRuleIDSTRINGTerminalRuleCall_1_0_1()); 

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
    // $ANTLR end "rule__AfterEvent__RuleIDAlternatives_1_0"


    // $ANTLR start "rule__BeforeAfterEvent__RuleIDAlternatives_0_0"
    // InternalMoniLog4DSL.g:849:1: rule__BeforeAfterEvent__RuleIDAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__BeforeAfterEvent__RuleIDAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:853:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_ID) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMoniLog4DSL.g:854:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:854:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:855:3: RULE_ID
                    {
                     before(grammarAccess.getBeforeAfterEventAccess().getRuleIDIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getBeforeAfterEventAccess().getRuleIDIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:860:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:860:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:861:3: RULE_STRING
                    {
                     before(grammarAccess.getBeforeAfterEventAccess().getRuleIDSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getBeforeAfterEventAccess().getRuleIDSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__BeforeAfterEvent__RuleIDAlternatives_0_0"


    // $ANTLR start "rule__Condition__Alternatives"
    // InternalMoniLog4DSL.g:870:1: rule__Condition__Alternatives : ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) );
    public final void rule__Condition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:874:1: ( ( ( rule__Condition__Group_0__0 ) ) | ( ( rule__Condition__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==37) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_STRING)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMoniLog4DSL.g:875:2: ( ( rule__Condition__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:875:2: ( ( rule__Condition__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:876:3: ( rule__Condition__Group_0__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_0()); 
                    // InternalMoniLog4DSL.g:877:3: ( rule__Condition__Group_0__0 )
                    // InternalMoniLog4DSL.g:877:4: rule__Condition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:881:2: ( ( rule__Condition__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:881:2: ( ( rule__Condition__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:882:3: ( rule__Condition__Group_1__0 )
                    {
                     before(grammarAccess.getConditionAccess().getGroup_1()); 
                    // InternalMoniLog4DSL.g:883:3: ( rule__Condition__Group_1__0 )
                    // InternalMoniLog4DSL.g:883:4: rule__Condition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getConditionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Condition__Alternatives"


    // $ANTLR start "rule__Pattern__Alternatives"
    // InternalMoniLog4DSL.g:891:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );
    public final void rule__Pattern__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:895:1: ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) )
            int alt7=5;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalMoniLog4DSL.g:896:2: ( ( rule__Pattern__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:896:2: ( ( rule__Pattern__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:897:3: ( rule__Pattern__Group_0__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_0()); 
                    // InternalMoniLog4DSL.g:898:3: ( rule__Pattern__Group_0__0 )
                    // InternalMoniLog4DSL.g:898:4: rule__Pattern__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:902:2: ( ( rule__Pattern__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:902:2: ( ( rule__Pattern__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:903:3: ( rule__Pattern__Group_1__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_1()); 
                    // InternalMoniLog4DSL.g:904:3: ( rule__Pattern__Group_1__0 )
                    // InternalMoniLog4DSL.g:904:4: rule__Pattern__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:908:2: ( ( rule__Pattern__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:908:2: ( ( rule__Pattern__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:909:3: ( rule__Pattern__Group_2__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_2()); 
                    // InternalMoniLog4DSL.g:910:3: ( rule__Pattern__Group_2__0 )
                    // InternalMoniLog4DSL.g:910:4: rule__Pattern__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:914:2: ( ( rule__Pattern__Group_3__0 ) )
                    {
                    // InternalMoniLog4DSL.g:914:2: ( ( rule__Pattern__Group_3__0 ) )
                    // InternalMoniLog4DSL.g:915:3: ( rule__Pattern__Group_3__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_3()); 
                    // InternalMoniLog4DSL.g:916:3: ( rule__Pattern__Group_3__0 )
                    // InternalMoniLog4DSL.g:916:4: rule__Pattern__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:920:2: ( ( rule__Pattern__Group_4__0 ) )
                    {
                    // InternalMoniLog4DSL.g:920:2: ( ( rule__Pattern__Group_4__0 ) )
                    // InternalMoniLog4DSL.g:921:3: ( rule__Pattern__Group_4__0 )
                    {
                     before(grammarAccess.getPatternAccess().getGroup_4()); 
                    // InternalMoniLog4DSL.g:922:3: ( rule__Pattern__Group_4__0 )
                    // InternalMoniLog4DSL.g:922:4: rule__Pattern__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPatternAccess().getGroup_4()); 

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
    // InternalMoniLog4DSL.g:930:1: rule__BoundType__Alternatives : ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) );
    public final void rule__BoundType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:934:1: ( ( ruleExactBound ) | ( ruleLowerBound ) | ( ruleUpperBound ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 45:
                {
                alt8=2;
                }
                break;
            case 46:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMoniLog4DSL.g:935:2: ( ruleExactBound )
                    {
                    // InternalMoniLog4DSL.g:935:2: ( ruleExactBound )
                    // InternalMoniLog4DSL.g:936:3: ruleExactBound
                    {
                     before(grammarAccess.getBoundTypeAccess().getExactBoundParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleExactBound();

                    state._fsp--;

                     after(grammarAccess.getBoundTypeAccess().getExactBoundParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:941:2: ( ruleLowerBound )
                    {
                    // InternalMoniLog4DSL.g:941:2: ( ruleLowerBound )
                    // InternalMoniLog4DSL.g:942:3: ruleLowerBound
                    {
                     before(grammarAccess.getBoundTypeAccess().getLowerBoundParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLowerBound();

                    state._fsp--;

                     after(grammarAccess.getBoundTypeAccess().getLowerBoundParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:947:2: ( ruleUpperBound )
                    {
                    // InternalMoniLog4DSL.g:947:2: ( ruleUpperBound )
                    // InternalMoniLog4DSL.g:948:3: ruleUpperBound
                    {
                     before(grammarAccess.getBoundTypeAccess().getUpperBoundParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleUpperBound();

                    state._fsp--;

                     after(grammarAccess.getBoundTypeAccess().getUpperBoundParserRuleCall_2()); 

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
    // InternalMoniLog4DSL.g:957:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );
    public final void rule__Scope__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:961:1: ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) )
            int alt9=5;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalMoniLog4DSL.g:962:2: ( ( rule__Scope__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:962:2: ( ( rule__Scope__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:963:3: ( rule__Scope__Group_0__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_0()); 
                    // InternalMoniLog4DSL.g:964:3: ( rule__Scope__Group_0__0 )
                    // InternalMoniLog4DSL.g:964:4: rule__Scope__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:968:2: ( ( rule__Scope__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:968:2: ( ( rule__Scope__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:969:3: ( rule__Scope__Group_1__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_1()); 
                    // InternalMoniLog4DSL.g:970:3: ( rule__Scope__Group_1__0 )
                    // InternalMoniLog4DSL.g:970:4: rule__Scope__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:974:2: ( ( rule__Scope__Group_2__0 ) )
                    {
                    // InternalMoniLog4DSL.g:974:2: ( ( rule__Scope__Group_2__0 ) )
                    // InternalMoniLog4DSL.g:975:3: ( rule__Scope__Group_2__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_2()); 
                    // InternalMoniLog4DSL.g:976:3: ( rule__Scope__Group_2__0 )
                    // InternalMoniLog4DSL.g:976:4: rule__Scope__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:980:2: ( ( rule__Scope__Group_3__0 ) )
                    {
                    // InternalMoniLog4DSL.g:980:2: ( ( rule__Scope__Group_3__0 ) )
                    // InternalMoniLog4DSL.g:981:3: ( rule__Scope__Group_3__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_3()); 
                    // InternalMoniLog4DSL.g:982:3: ( rule__Scope__Group_3__0 )
                    // InternalMoniLog4DSL.g:982:4: rule__Scope__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_3__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:986:2: ( ( rule__Scope__Group_4__0 ) )
                    {
                    // InternalMoniLog4DSL.g:986:2: ( ( rule__Scope__Group_4__0 ) )
                    // InternalMoniLog4DSL.g:987:3: ( rule__Scope__Group_4__0 )
                    {
                     before(grammarAccess.getScopeAccess().getGroup_4()); 
                    // InternalMoniLog4DSL.g:988:3: ( rule__Scope__Group_4__0 )
                    // InternalMoniLog4DSL.g:988:4: rule__Scope__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Scope__Group_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getScopeAccess().getGroup_4()); 

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
    // InternalMoniLog4DSL.g:996:1: rule__Action__Alternatives : ( ( ( rule__Action__Group_0__0 ) ) | ( ruleAppend ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1000:1: ( ( ( rule__Action__Group_0__0 ) ) | ( ruleAppend ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==51) ) {
                alt10=1;
            }
            else if ( (LA10_0==52) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoniLog4DSL.g:1001:2: ( ( rule__Action__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1001:2: ( ( rule__Action__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1002:3: ( rule__Action__Group_0__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_0()); 
                    // InternalMoniLog4DSL.g:1003:3: ( rule__Action__Group_0__0 )
                    // InternalMoniLog4DSL.g:1003:4: rule__Action__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1007:2: ( ruleAppend )
                    {
                    // InternalMoniLog4DSL.g:1007:2: ( ruleAppend )
                    // InternalMoniLog4DSL.g:1008:3: ruleAppend
                    {
                     before(grammarAccess.getActionAccess().getAppendParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAppend();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getAppendParserRuleCall_1()); 

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


    // $ANTLR start "rule__Appender__Alternatives"
    // InternalMoniLog4DSL.g:1017:1: rule__Appender__Alternatives : ( ( ruleStreamAppender ) | ( ruleFileAppender ) | ( ruleConsoleAppender ) );
    public final void rule__Appender__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1021:1: ( ( ruleStreamAppender ) | ( ruleFileAppender ) | ( ruleConsoleAppender ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt11=1;
                }
                break;
            case 53:
                {
                alt11=2;
                }
                break;
            case 54:
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
                    // InternalMoniLog4DSL.g:1022:2: ( ruleStreamAppender )
                    {
                    // InternalMoniLog4DSL.g:1022:2: ( ruleStreamAppender )
                    // InternalMoniLog4DSL.g:1023:3: ruleStreamAppender
                    {
                     before(grammarAccess.getAppenderAccess().getStreamAppenderParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStreamAppender();

                    state._fsp--;

                     after(grammarAccess.getAppenderAccess().getStreamAppenderParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1028:2: ( ruleFileAppender )
                    {
                    // InternalMoniLog4DSL.g:1028:2: ( ruleFileAppender )
                    // InternalMoniLog4DSL.g:1029:3: ruleFileAppender
                    {
                     before(grammarAccess.getAppenderAccess().getFileAppenderParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleFileAppender();

                    state._fsp--;

                     after(grammarAccess.getAppenderAccess().getFileAppenderParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1034:2: ( ruleConsoleAppender )
                    {
                    // InternalMoniLog4DSL.g:1034:2: ( ruleConsoleAppender )
                    // InternalMoniLog4DSL.g:1035:3: ruleConsoleAppender
                    {
                     before(grammarAccess.getAppenderAccess().getConsoleAppenderParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleConsoleAppender();

                    state._fsp--;

                     after(grammarAccess.getAppenderAccess().getConsoleAppenderParserRuleCall_2()); 

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


    // $ANTLR start "rule__StreamAppender__EventAlternatives_2_0"
    // InternalMoniLog4DSL.g:1044:1: rule__StreamAppender__EventAlternatives_2_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__StreamAppender__EventAlternatives_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1048:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // InternalMoniLog4DSL.g:1049:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1049:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:1050:3: RULE_ID
                    {
                     before(grammarAccess.getStreamAppenderAccess().getEventIDTerminalRuleCall_2_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStreamAppenderAccess().getEventIDTerminalRuleCall_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1055:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:1055:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:1056:3: RULE_STRING
                    {
                     before(grammarAccess.getStreamAppenderAccess().getEventSTRINGTerminalRuleCall_2_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStreamAppenderAccess().getEventSTRINGTerminalRuleCall_2_0_1()); 

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
    // $ANTLR end "rule__StreamAppender__EventAlternatives_2_0"


    // $ANTLR start "rule__Layout__Alternatives"
    // InternalMoniLog4DSL.g:1065:1: rule__Layout__Alternatives : ( ( ruleStringLayout ) | ( ruleExternalLayout ) );
    public final void rule__Layout__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1069:1: ( ( ruleStringLayout ) | ( ruleExternalLayout ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoniLog4DSL.g:1070:2: ( ruleStringLayout )
                    {
                    // InternalMoniLog4DSL.g:1070:2: ( ruleStringLayout )
                    // InternalMoniLog4DSL.g:1071:3: ruleStringLayout
                    {
                     before(grammarAccess.getLayoutAccess().getStringLayoutParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLayout();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getStringLayoutParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1076:2: ( ruleExternalLayout )
                    {
                    // InternalMoniLog4DSL.g:1076:2: ( ruleExternalLayout )
                    // InternalMoniLog4DSL.g:1077:3: ruleExternalLayout
                    {
                     before(grammarAccess.getLayoutAccess().getExternalLayoutParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleExternalLayout();

                    state._fsp--;

                     after(grammarAccess.getLayoutAccess().getExternalLayoutParserRuleCall_1()); 

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


    // $ANTLR start "rule__StreamEvent__EventIdAlternatives_0_0"
    // InternalMoniLog4DSL.g:1086:1: rule__StreamEvent__EventIdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__StreamEvent__EventIdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1090:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    // InternalMoniLog4DSL.g:1091:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1091:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:1092:3: RULE_ID
                    {
                     before(grammarAccess.getStreamEventAccess().getEventIdIDTerminalRuleCall_0_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getStreamEventAccess().getEventIdIDTerminalRuleCall_0_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1097:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:1097:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:1098:3: RULE_STRING
                    {
                     before(grammarAccess.getStreamEventAccess().getEventIdSTRINGTerminalRuleCall_0_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getStreamEventAccess().getEventIdSTRINGTerminalRuleCall_0_0_1()); 

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
    // $ANTLR end "rule__StreamEvent__EventIdAlternatives_0_0"


    // $ANTLR start "rule__EmptyOrPropertyValue__Alternatives"
    // InternalMoniLog4DSL.g:1107:1: rule__EmptyOrPropertyValue__Alternatives : ( ( () ) | ( ( rule__EmptyOrPropertyValue__Group_1__0 ) ) );
    public final void rule__EmptyOrPropertyValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1111:1: ( ( () ) | ( ( rule__EmptyOrPropertyValue__Group_1__0 ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==EOF||LA15_0==28||LA15_0==30) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoniLog4DSL.g:1112:2: ( () )
                    {
                    // InternalMoniLog4DSL.g:1112:2: ( () )
                    // InternalMoniLog4DSL.g:1113:3: ()
                    {
                     before(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 
                    // InternalMoniLog4DSL.g:1114:3: ()
                    // InternalMoniLog4DSL.g:1114:4: 
                    {
                    }

                     after(grammarAccess.getEmptyOrPropertyValueAccess().getEmptyAction_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1118:2: ( ( rule__EmptyOrPropertyValue__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1118:2: ( ( rule__EmptyOrPropertyValue__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1119:3: ( rule__EmptyOrPropertyValue__Group_1__0 )
                    {
                     before(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1()); 
                    // InternalMoniLog4DSL.g:1120:3: ( rule__EmptyOrPropertyValue__Group_1__0 )
                    // InternalMoniLog4DSL.g:1120:4: rule__EmptyOrPropertyValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmptyOrPropertyValue__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1()); 

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


    // $ANTLR start "rule__LanguageExpression__Alternatives"
    // InternalMoniLog4DSL.g:1128:1: rule__LanguageExpression__Alternatives : ( ( ( rule__LanguageExpression__Group_0__0 ) ) | ( ( rule__LanguageExpression__Group_1__0 ) ) );
    public final void rule__LanguageExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1132:1: ( ( ( rule__LanguageExpression__Group_0__0 ) ) | ( ( rule__LanguageExpression__Group_1__0 ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_STRING) ) {
                int LA16_2 = input.LA(2);

                if ( (LA16_2==38) ) {
                    alt16=1;
                }
                else if ( (LA16_2==EOF||LA16_2==26||LA16_2==28||LA16_2==30||LA16_2==39) ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoniLog4DSL.g:1133:2: ( ( rule__LanguageExpression__Group_0__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1133:2: ( ( rule__LanguageExpression__Group_0__0 ) )
                    // InternalMoniLog4DSL.g:1134:3: ( rule__LanguageExpression__Group_0__0 )
                    {
                     before(grammarAccess.getLanguageExpressionAccess().getGroup_0()); 
                    // InternalMoniLog4DSL.g:1135:3: ( rule__LanguageExpression__Group_0__0 )
                    // InternalMoniLog4DSL.g:1135:4: rule__LanguageExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageExpression__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageExpressionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1139:2: ( ( rule__LanguageExpression__Group_1__0 ) )
                    {
                    // InternalMoniLog4DSL.g:1139:2: ( ( rule__LanguageExpression__Group_1__0 ) )
                    // InternalMoniLog4DSL.g:1140:3: ( rule__LanguageExpression__Group_1__0 )
                    {
                     before(grammarAccess.getLanguageExpressionAccess().getGroup_1()); 
                    // InternalMoniLog4DSL.g:1141:3: ( rule__LanguageExpression__Group_1__0 )
                    // InternalMoniLog4DSL.g:1141:4: rule__LanguageExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LanguageExpression__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLanguageExpressionAccess().getGroup_1()); 

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


    // $ANTLR start "rule__LanguageExpression__LanguageIdAlternatives_0_1_0"
    // InternalMoniLog4DSL.g:1149:1: rule__LanguageExpression__LanguageIdAlternatives_0_1_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__LanguageExpression__LanguageIdAlternatives_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1153:1: ( ( RULE_ID ) | ( RULE_STRING ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_STRING) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoniLog4DSL.g:1154:2: ( RULE_ID )
                    {
                    // InternalMoniLog4DSL.g:1154:2: ( RULE_ID )
                    // InternalMoniLog4DSL.g:1155:3: RULE_ID
                    {
                     before(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_1_0_0()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getLanguageExpressionAccess().getLanguageIdIDTerminalRuleCall_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1160:2: ( RULE_STRING )
                    {
                    // InternalMoniLog4DSL.g:1160:2: ( RULE_STRING )
                    // InternalMoniLog4DSL.g:1161:3: RULE_STRING
                    {
                     before(grammarAccess.getLanguageExpressionAccess().getLanguageIdSTRINGTerminalRuleCall_0_1_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getLanguageExpressionAccess().getLanguageIdSTRINGTerminalRuleCall_0_1_0_1()); 

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
    // $ANTLR end "rule__LanguageExpression__LanguageIdAlternatives_0_1_0"


    // $ANTLR start "rule__LogLevel__Alternatives"
    // InternalMoniLog4DSL.g:1170:1: rule__LogLevel__Alternatives : ( ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'INFO' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) );
    public final void rule__LogLevel__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1174:1: ( ( ( 'CONFIG' ) ) | ( ( 'FINE' ) ) | ( ( 'FINER' ) ) | ( ( 'FINEST' ) ) | ( ( 'INFO' ) ) | ( ( 'SEVERE' ) ) | ( ( 'WARNING' ) ) )
            int alt18=7;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt18=1;
                }
                break;
            case 12:
                {
                alt18=2;
                }
                break;
            case 13:
                {
                alt18=3;
                }
                break;
            case 14:
                {
                alt18=4;
                }
                break;
            case 15:
                {
                alt18=5;
                }
                break;
            case 16:
                {
                alt18=6;
                }
                break;
            case 17:
                {
                alt18=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMoniLog4DSL.g:1175:2: ( ( 'CONFIG' ) )
                    {
                    // InternalMoniLog4DSL.g:1175:2: ( ( 'CONFIG' ) )
                    // InternalMoniLog4DSL.g:1176:3: ( 'CONFIG' )
                    {
                     before(grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_0()); 
                    // InternalMoniLog4DSL.g:1177:3: ( 'CONFIG' )
                    // InternalMoniLog4DSL.g:1177:4: 'CONFIG'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getConfigEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1181:2: ( ( 'FINE' ) )
                    {
                    // InternalMoniLog4DSL.g:1181:2: ( ( 'FINE' ) )
                    // InternalMoniLog4DSL.g:1182:3: ( 'FINE' )
                    {
                     before(grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_1()); 
                    // InternalMoniLog4DSL.g:1183:3: ( 'FINE' )
                    // InternalMoniLog4DSL.g:1183:4: 'FINE'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getFineEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1187:2: ( ( 'FINER' ) )
                    {
                    // InternalMoniLog4DSL.g:1187:2: ( ( 'FINER' ) )
                    // InternalMoniLog4DSL.g:1188:3: ( 'FINER' )
                    {
                     before(grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_2()); 
                    // InternalMoniLog4DSL.g:1189:3: ( 'FINER' )
                    // InternalMoniLog4DSL.g:1189:4: 'FINER'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getFinerEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1193:2: ( ( 'FINEST' ) )
                    {
                    // InternalMoniLog4DSL.g:1193:2: ( ( 'FINEST' ) )
                    // InternalMoniLog4DSL.g:1194:3: ( 'FINEST' )
                    {
                     before(grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_3()); 
                    // InternalMoniLog4DSL.g:1195:3: ( 'FINEST' )
                    // InternalMoniLog4DSL.g:1195:4: 'FINEST'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getFinestEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMoniLog4DSL.g:1199:2: ( ( 'INFO' ) )
                    {
                    // InternalMoniLog4DSL.g:1199:2: ( ( 'INFO' ) )
                    // InternalMoniLog4DSL.g:1200:3: ( 'INFO' )
                    {
                     before(grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_4()); 
                    // InternalMoniLog4DSL.g:1201:3: ( 'INFO' )
                    // InternalMoniLog4DSL.g:1201:4: 'INFO'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getInfoEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMoniLog4DSL.g:1205:2: ( ( 'SEVERE' ) )
                    {
                    // InternalMoniLog4DSL.g:1205:2: ( ( 'SEVERE' ) )
                    // InternalMoniLog4DSL.g:1206:3: ( 'SEVERE' )
                    {
                     before(grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5()); 
                    // InternalMoniLog4DSL.g:1207:3: ( 'SEVERE' )
                    // InternalMoniLog4DSL.g:1207:4: 'SEVERE'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getSevereEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMoniLog4DSL.g:1211:2: ( ( 'WARNING' ) )
                    {
                    // InternalMoniLog4DSL.g:1211:2: ( ( 'WARNING' ) )
                    // InternalMoniLog4DSL.g:1212:3: ( 'WARNING' )
                    {
                     before(grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6()); 
                    // InternalMoniLog4DSL.g:1213:3: ( 'WARNING' )
                    // InternalMoniLog4DSL.g:1213:4: 'WARNING'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getLogLevelAccess().getWarningEnumLiteralDeclaration_6()); 

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


    // $ANTLR start "rule__TemporalPropertyConditionKind__Alternatives"
    // InternalMoniLog4DSL.g:1221:1: rule__TemporalPropertyConditionKind__Alternatives : ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) );
    public final void rule__TemporalPropertyConditionKind__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1225:1: ( ( ( 'S' ) ) | ( ( 'V' ) ) | ( ( 'nS' ) ) | ( ( 'nV' ) ) )
            int alt19=4;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt19=1;
                }
                break;
            case 19:
                {
                alt19=2;
                }
                break;
            case 20:
                {
                alt19=3;
                }
                break;
            case 21:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // InternalMoniLog4DSL.g:1226:2: ( ( 'S' ) )
                    {
                    // InternalMoniLog4DSL.g:1226:2: ( ( 'S' ) )
                    // InternalMoniLog4DSL.g:1227:3: ( 'S' )
                    {
                     before(grammarAccess.getTemporalPropertyConditionKindAccess().getSEnumLiteralDeclaration_0()); 
                    // InternalMoniLog4DSL.g:1228:3: ( 'S' )
                    // InternalMoniLog4DSL.g:1228:4: 'S'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalPropertyConditionKindAccess().getSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:1232:2: ( ( 'V' ) )
                    {
                    // InternalMoniLog4DSL.g:1232:2: ( ( 'V' ) )
                    // InternalMoniLog4DSL.g:1233:3: ( 'V' )
                    {
                     before(grammarAccess.getTemporalPropertyConditionKindAccess().getVEnumLiteralDeclaration_1()); 
                    // InternalMoniLog4DSL.g:1234:3: ( 'V' )
                    // InternalMoniLog4DSL.g:1234:4: 'V'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalPropertyConditionKindAccess().getVEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoniLog4DSL.g:1238:2: ( ( 'nS' ) )
                    {
                    // InternalMoniLog4DSL.g:1238:2: ( ( 'nS' ) )
                    // InternalMoniLog4DSL.g:1239:3: ( 'nS' )
                    {
                     before(grammarAccess.getTemporalPropertyConditionKindAccess().getNSEnumLiteralDeclaration_2()); 
                    // InternalMoniLog4DSL.g:1240:3: ( 'nS' )
                    // InternalMoniLog4DSL.g:1240:4: 'nS'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalPropertyConditionKindAccess().getNSEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMoniLog4DSL.g:1244:2: ( ( 'nV' ) )
                    {
                    // InternalMoniLog4DSL.g:1244:2: ( ( 'nV' ) )
                    // InternalMoniLog4DSL.g:1245:3: ( 'nV' )
                    {
                     before(grammarAccess.getTemporalPropertyConditionKindAccess().getNVEnumLiteralDeclaration_3()); 
                    // InternalMoniLog4DSL.g:1246:3: ( 'nV' )
                    // InternalMoniLog4DSL.g:1246:4: 'nV'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getTemporalPropertyConditionKindAccess().getNVEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__TemporalPropertyConditionKind__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMoniLog4DSL.g:1254:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1258:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMoniLog4DSL.g:1259:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMoniLog4DSL.g:1266:1: rule__Model__Group__0__Impl : ( ( rule__Model__Group_0__0 )? ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1270:1: ( ( ( rule__Model__Group_0__0 )? ) )
            // InternalMoniLog4DSL.g:1271:1: ( ( rule__Model__Group_0__0 )? )
            {
            // InternalMoniLog4DSL.g:1271:1: ( ( rule__Model__Group_0__0 )? )
            // InternalMoniLog4DSL.g:1272:2: ( rule__Model__Group_0__0 )?
            {
             before(grammarAccess.getModelAccess().getGroup_0()); 
            // InternalMoniLog4DSL.g:1273:2: ( rule__Model__Group_0__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==22) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMoniLog4DSL.g:1273:3: rule__Model__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Model__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMoniLog4DSL.g:1281:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1285:1: ( rule__Model__Group__1__Impl )
            // InternalMoniLog4DSL.g:1286:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMoniLog4DSL.g:1292:1: rule__Model__Group__1__Impl : ( ( ( rule__Model__MoniLogSpecsAssignment_1 ) ) ( ( rule__Model__MoniLogSpecsAssignment_1 )* ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1296:1: ( ( ( ( rule__Model__MoniLogSpecsAssignment_1 ) ) ( ( rule__Model__MoniLogSpecsAssignment_1 )* ) ) )
            // InternalMoniLog4DSL.g:1297:1: ( ( ( rule__Model__MoniLogSpecsAssignment_1 ) ) ( ( rule__Model__MoniLogSpecsAssignment_1 )* ) )
            {
            // InternalMoniLog4DSL.g:1297:1: ( ( ( rule__Model__MoniLogSpecsAssignment_1 ) ) ( ( rule__Model__MoniLogSpecsAssignment_1 )* ) )
            // InternalMoniLog4DSL.g:1298:2: ( ( rule__Model__MoniLogSpecsAssignment_1 ) ) ( ( rule__Model__MoniLogSpecsAssignment_1 )* )
            {
            // InternalMoniLog4DSL.g:1298:2: ( ( rule__Model__MoniLogSpecsAssignment_1 ) )
            // InternalMoniLog4DSL.g:1299:3: ( rule__Model__MoniLogSpecsAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getMoniLogSpecsAssignment_1()); 
            // InternalMoniLog4DSL.g:1300:3: ( rule__Model__MoniLogSpecsAssignment_1 )
            // InternalMoniLog4DSL.g:1300:4: rule__Model__MoniLogSpecsAssignment_1
            {
            pushFollow(FOLLOW_4);
            rule__Model__MoniLogSpecsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getMoniLogSpecsAssignment_1()); 

            }

            // InternalMoniLog4DSL.g:1303:2: ( ( rule__Model__MoniLogSpecsAssignment_1 )* )
            // InternalMoniLog4DSL.g:1304:3: ( rule__Model__MoniLogSpecsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getMoniLogSpecsAssignment_1()); 
            // InternalMoniLog4DSL.g:1305:3: ( rule__Model__MoniLogSpecsAssignment_1 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==23) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1305:4: rule__Model__MoniLogSpecsAssignment_1
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__MoniLogSpecsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getMoniLogSpecsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group_0__0"
    // InternalMoniLog4DSL.g:1315:1: rule__Model__Group_0__0 : rule__Model__Group_0__0__Impl rule__Model__Group_0__1 ;
    public final void rule__Model__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1319:1: ( rule__Model__Group_0__0__Impl rule__Model__Group_0__1 )
            // InternalMoniLog4DSL.g:1320:2: rule__Model__Group_0__0__Impl rule__Model__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__Model__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0"


    // $ANTLR start "rule__Model__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:1327:1: rule__Model__Group_0__0__Impl : ( 'default-language' ) ;
    public final void rule__Model__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1331:1: ( ( 'default-language' ) )
            // InternalMoniLog4DSL.g:1332:1: ( 'default-language' )
            {
            // InternalMoniLog4DSL.g:1332:1: ( 'default-language' )
            // InternalMoniLog4DSL.g:1333:2: 'default-language'
            {
             before(grammarAccess.getModelAccess().getDefaultLanguageKeyword_0_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getDefaultLanguageKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__0__Impl"


    // $ANTLR start "rule__Model__Group_0__1"
    // InternalMoniLog4DSL.g:1342:1: rule__Model__Group_0__1 : rule__Model__Group_0__1__Impl ;
    public final void rule__Model__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1346:1: ( rule__Model__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:1347:2: rule__Model__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1"


    // $ANTLR start "rule__Model__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:1353:1: rule__Model__Group_0__1__Impl : ( ( rule__Model__DefaultLanguageIDAssignment_0_1 ) ) ;
    public final void rule__Model__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1357:1: ( ( ( rule__Model__DefaultLanguageIDAssignment_0_1 ) ) )
            // InternalMoniLog4DSL.g:1358:1: ( ( rule__Model__DefaultLanguageIDAssignment_0_1 ) )
            {
            // InternalMoniLog4DSL.g:1358:1: ( ( rule__Model__DefaultLanguageIDAssignment_0_1 ) )
            // InternalMoniLog4DSL.g:1359:2: ( rule__Model__DefaultLanguageIDAssignment_0_1 )
            {
             before(grammarAccess.getModelAccess().getDefaultLanguageIDAssignment_0_1()); 
            // InternalMoniLog4DSL.g:1360:2: ( rule__Model__DefaultLanguageIDAssignment_0_1 )
            // InternalMoniLog4DSL.g:1360:3: rule__Model__DefaultLanguageIDAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__DefaultLanguageIDAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDefaultLanguageIDAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group_0__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__0"
    // InternalMoniLog4DSL.g:1369:1: rule__MoniLogSpec__Group__0 : rule__MoniLogSpec__Group__0__Impl rule__MoniLogSpec__Group__1 ;
    public final void rule__MoniLogSpec__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1373:1: ( rule__MoniLogSpec__Group__0__Impl rule__MoniLogSpec__Group__1 )
            // InternalMoniLog4DSL.g:1374:2: rule__MoniLogSpec__Group__0__Impl rule__MoniLogSpec__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__MoniLogSpec__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__0"


    // $ANTLR start "rule__MoniLogSpec__Group__0__Impl"
    // InternalMoniLog4DSL.g:1381:1: rule__MoniLogSpec__Group__0__Impl : ( 'monilog' ) ;
    public final void rule__MoniLogSpec__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1385:1: ( ( 'monilog' ) )
            // InternalMoniLog4DSL.g:1386:1: ( 'monilog' )
            {
            // InternalMoniLog4DSL.g:1386:1: ( 'monilog' )
            // InternalMoniLog4DSL.g:1387:2: 'monilog'
            {
             before(grammarAccess.getMoniLogSpecAccess().getMonilogKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getMonilogKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__1"
    // InternalMoniLog4DSL.g:1396:1: rule__MoniLogSpec__Group__1 : rule__MoniLogSpec__Group__1__Impl rule__MoniLogSpec__Group__2 ;
    public final void rule__MoniLogSpec__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1400:1: ( rule__MoniLogSpec__Group__1__Impl rule__MoniLogSpec__Group__2 )
            // InternalMoniLog4DSL.g:1401:2: rule__MoniLogSpec__Group__1__Impl rule__MoniLogSpec__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__MoniLogSpec__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__1"


    // $ANTLR start "rule__MoniLogSpec__Group__1__Impl"
    // InternalMoniLog4DSL.g:1408:1: rule__MoniLogSpec__Group__1__Impl : ( ( rule__MoniLogSpec__NameAssignment_1 )? ) ;
    public final void rule__MoniLogSpec__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1412:1: ( ( ( rule__MoniLogSpec__NameAssignment_1 )? ) )
            // InternalMoniLog4DSL.g:1413:1: ( ( rule__MoniLogSpec__NameAssignment_1 )? )
            {
            // InternalMoniLog4DSL.g:1413:1: ( ( rule__MoniLogSpec__NameAssignment_1 )? )
            // InternalMoniLog4DSL.g:1414:2: ( rule__MoniLogSpec__NameAssignment_1 )?
            {
             before(grammarAccess.getMoniLogSpecAccess().getNameAssignment_1()); 
            // InternalMoniLog4DSL.g:1415:2: ( rule__MoniLogSpec__NameAssignment_1 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_STRING) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoniLog4DSL.g:1415:3: rule__MoniLogSpec__NameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogSpec__NameAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoniLogSpecAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__2"
    // InternalMoniLog4DSL.g:1423:1: rule__MoniLogSpec__Group__2 : rule__MoniLogSpec__Group__2__Impl rule__MoniLogSpec__Group__3 ;
    public final void rule__MoniLogSpec__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1427:1: ( rule__MoniLogSpec__Group__2__Impl rule__MoniLogSpec__Group__3 )
            // InternalMoniLog4DSL.g:1428:2: rule__MoniLogSpec__Group__2__Impl rule__MoniLogSpec__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MoniLogSpec__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__2"


    // $ANTLR start "rule__MoniLogSpec__Group__2__Impl"
    // InternalMoniLog4DSL.g:1435:1: rule__MoniLogSpec__Group__2__Impl : ( ( rule__MoniLogSpec__Group_2__0 )? ) ;
    public final void rule__MoniLogSpec__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1439:1: ( ( ( rule__MoniLogSpec__Group_2__0 )? ) )
            // InternalMoniLog4DSL.g:1440:1: ( ( rule__MoniLogSpec__Group_2__0 )? )
            {
            // InternalMoniLog4DSL.g:1440:1: ( ( rule__MoniLogSpec__Group_2__0 )? )
            // InternalMoniLog4DSL.g:1441:2: ( rule__MoniLogSpec__Group_2__0 )?
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup_2()); 
            // InternalMoniLog4DSL.g:1442:2: ( rule__MoniLogSpec__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoniLog4DSL.g:1442:3: rule__MoniLogSpec__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogSpec__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoniLogSpecAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__2__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__3"
    // InternalMoniLog4DSL.g:1450:1: rule__MoniLogSpec__Group__3 : rule__MoniLogSpec__Group__3__Impl rule__MoniLogSpec__Group__4 ;
    public final void rule__MoniLogSpec__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1454:1: ( rule__MoniLogSpec__Group__3__Impl rule__MoniLogSpec__Group__4 )
            // InternalMoniLog4DSL.g:1455:2: rule__MoniLogSpec__Group__3__Impl rule__MoniLogSpec__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogSpec__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__3"


    // $ANTLR start "rule__MoniLogSpec__Group__3__Impl"
    // InternalMoniLog4DSL.g:1462:1: rule__MoniLogSpec__Group__3__Impl : ( '{' ) ;
    public final void rule__MoniLogSpec__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1466:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:1467:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:1467:1: ( '{' )
            // InternalMoniLog4DSL.g:1468:2: '{'
            {
             before(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__3__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__4"
    // InternalMoniLog4DSL.g:1477:1: rule__MoniLogSpec__Group__4 : rule__MoniLogSpec__Group__4__Impl rule__MoniLogSpec__Group__5 ;
    public final void rule__MoniLogSpec__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1481:1: ( rule__MoniLogSpec__Group__4__Impl rule__MoniLogSpec__Group__5 )
            // InternalMoniLog4DSL.g:1482:2: rule__MoniLogSpec__Group__4__Impl rule__MoniLogSpec__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogSpec__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__4"


    // $ANTLR start "rule__MoniLogSpec__Group__4__Impl"
    // InternalMoniLog4DSL.g:1489:1: rule__MoniLogSpec__Group__4__Impl : ( ( rule__MoniLogSpec__Group_4__0 )? ) ;
    public final void rule__MoniLogSpec__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1493:1: ( ( ( rule__MoniLogSpec__Group_4__0 )? ) )
            // InternalMoniLog4DSL.g:1494:1: ( ( rule__MoniLogSpec__Group_4__0 )? )
            {
            // InternalMoniLog4DSL.g:1494:1: ( ( rule__MoniLogSpec__Group_4__0 )? )
            // InternalMoniLog4DSL.g:1495:2: ( rule__MoniLogSpec__Group_4__0 )?
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup_4()); 
            // InternalMoniLog4DSL.g:1496:2: ( rule__MoniLogSpec__Group_4__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoniLog4DSL.g:1496:3: rule__MoniLogSpec__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogSpec__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoniLogSpecAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__4__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__5"
    // InternalMoniLog4DSL.g:1504:1: rule__MoniLogSpec__Group__5 : rule__MoniLogSpec__Group__5__Impl rule__MoniLogSpec__Group__6 ;
    public final void rule__MoniLogSpec__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1508:1: ( rule__MoniLogSpec__Group__5__Impl rule__MoniLogSpec__Group__6 )
            // InternalMoniLog4DSL.g:1509:2: rule__MoniLogSpec__Group__5__Impl rule__MoniLogSpec__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__MoniLogSpec__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__5"


    // $ANTLR start "rule__MoniLogSpec__Group__5__Impl"
    // InternalMoniLog4DSL.g:1516:1: rule__MoniLogSpec__Group__5__Impl : ( ( rule__MoniLogSpec__Group_5__0 )? ) ;
    public final void rule__MoniLogSpec__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1520:1: ( ( ( rule__MoniLogSpec__Group_5__0 )? ) )
            // InternalMoniLog4DSL.g:1521:1: ( ( rule__MoniLogSpec__Group_5__0 )? )
            {
            // InternalMoniLog4DSL.g:1521:1: ( ( rule__MoniLogSpec__Group_5__0 )? )
            // InternalMoniLog4DSL.g:1522:2: ( rule__MoniLogSpec__Group_5__0 )?
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup_5()); 
            // InternalMoniLog4DSL.g:1523:2: ( rule__MoniLogSpec__Group_5__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==31) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMoniLog4DSL.g:1523:3: rule__MoniLogSpec__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MoniLogSpec__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMoniLogSpecAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__5__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__6"
    // InternalMoniLog4DSL.g:1531:1: rule__MoniLogSpec__Group__6 : rule__MoniLogSpec__Group__6__Impl rule__MoniLogSpec__Group__7 ;
    public final void rule__MoniLogSpec__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1535:1: ( rule__MoniLogSpec__Group__6__Impl rule__MoniLogSpec__Group__7 )
            // InternalMoniLog4DSL.g:1536:2: rule__MoniLogSpec__Group__6__Impl rule__MoniLogSpec__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__MoniLogSpec__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__6"


    // $ANTLR start "rule__MoniLogSpec__Group__6__Impl"
    // InternalMoniLog4DSL.g:1543:1: rule__MoniLogSpec__Group__6__Impl : ( 'actions' ) ;
    public final void rule__MoniLogSpec__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1547:1: ( ( 'actions' ) )
            // InternalMoniLog4DSL.g:1548:1: ( 'actions' )
            {
            // InternalMoniLog4DSL.g:1548:1: ( 'actions' )
            // InternalMoniLog4DSL.g:1549:2: 'actions'
            {
             before(grammarAccess.getMoniLogSpecAccess().getActionsKeyword_6()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getActionsKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__6__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__7"
    // InternalMoniLog4DSL.g:1558:1: rule__MoniLogSpec__Group__7 : rule__MoniLogSpec__Group__7__Impl rule__MoniLogSpec__Group__8 ;
    public final void rule__MoniLogSpec__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1562:1: ( rule__MoniLogSpec__Group__7__Impl rule__MoniLogSpec__Group__8 )
            // InternalMoniLog4DSL.g:1563:2: rule__MoniLogSpec__Group__7__Impl rule__MoniLogSpec__Group__8
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogSpec__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__7"


    // $ANTLR start "rule__MoniLogSpec__Group__7__Impl"
    // InternalMoniLog4DSL.g:1570:1: rule__MoniLogSpec__Group__7__Impl : ( '{' ) ;
    public final void rule__MoniLogSpec__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1574:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:1575:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:1575:1: ( '{' )
            // InternalMoniLog4DSL.g:1576:2: '{'
            {
             before(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_7()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__7__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__8"
    // InternalMoniLog4DSL.g:1585:1: rule__MoniLogSpec__Group__8 : rule__MoniLogSpec__Group__8__Impl rule__MoniLogSpec__Group__9 ;
    public final void rule__MoniLogSpec__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1589:1: ( rule__MoniLogSpec__Group__8__Impl rule__MoniLogSpec__Group__9 )
            // InternalMoniLog4DSL.g:1590:2: rule__MoniLogSpec__Group__8__Impl rule__MoniLogSpec__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__MoniLogSpec__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__8"


    // $ANTLR start "rule__MoniLogSpec__Group__8__Impl"
    // InternalMoniLog4DSL.g:1597:1: rule__MoniLogSpec__Group__8__Impl : ( ( rule__MoniLogSpec__ActionsAssignment_8 ) ) ;
    public final void rule__MoniLogSpec__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1601:1: ( ( ( rule__MoniLogSpec__ActionsAssignment_8 ) ) )
            // InternalMoniLog4DSL.g:1602:1: ( ( rule__MoniLogSpec__ActionsAssignment_8 ) )
            {
            // InternalMoniLog4DSL.g:1602:1: ( ( rule__MoniLogSpec__ActionsAssignment_8 ) )
            // InternalMoniLog4DSL.g:1603:2: ( rule__MoniLogSpec__ActionsAssignment_8 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getActionsAssignment_8()); 
            // InternalMoniLog4DSL.g:1604:2: ( rule__MoniLogSpec__ActionsAssignment_8 )
            // InternalMoniLog4DSL.g:1604:3: rule__MoniLogSpec__ActionsAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__ActionsAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getActionsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__8__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__9"
    // InternalMoniLog4DSL.g:1612:1: rule__MoniLogSpec__Group__9 : rule__MoniLogSpec__Group__9__Impl rule__MoniLogSpec__Group__10 ;
    public final void rule__MoniLogSpec__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1616:1: ( rule__MoniLogSpec__Group__9__Impl rule__MoniLogSpec__Group__10 )
            // InternalMoniLog4DSL.g:1617:2: rule__MoniLogSpec__Group__9__Impl rule__MoniLogSpec__Group__10
            {
            pushFollow(FOLLOW_10);
            rule__MoniLogSpec__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__9"


    // $ANTLR start "rule__MoniLogSpec__Group__9__Impl"
    // InternalMoniLog4DSL.g:1624:1: rule__MoniLogSpec__Group__9__Impl : ( ( rule__MoniLogSpec__Group_9__0 )* ) ;
    public final void rule__MoniLogSpec__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1628:1: ( ( ( rule__MoniLogSpec__Group_9__0 )* ) )
            // InternalMoniLog4DSL.g:1629:1: ( ( rule__MoniLogSpec__Group_9__0 )* )
            {
            // InternalMoniLog4DSL.g:1629:1: ( ( rule__MoniLogSpec__Group_9__0 )* )
            // InternalMoniLog4DSL.g:1630:2: ( rule__MoniLogSpec__Group_9__0 )*
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup_9()); 
            // InternalMoniLog4DSL.g:1631:2: ( rule__MoniLogSpec__Group_9__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==30) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1631:3: rule__MoniLogSpec__Group_9__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MoniLogSpec__Group_9__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

             after(grammarAccess.getMoniLogSpecAccess().getGroup_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__9__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__10"
    // InternalMoniLog4DSL.g:1639:1: rule__MoniLogSpec__Group__10 : rule__MoniLogSpec__Group__10__Impl rule__MoniLogSpec__Group__11 ;
    public final void rule__MoniLogSpec__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1643:1: ( rule__MoniLogSpec__Group__10__Impl rule__MoniLogSpec__Group__11 )
            // InternalMoniLog4DSL.g:1644:2: rule__MoniLogSpec__Group__10__Impl rule__MoniLogSpec__Group__11
            {
            pushFollow(FOLLOW_12);
            rule__MoniLogSpec__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__10"


    // $ANTLR start "rule__MoniLogSpec__Group__10__Impl"
    // InternalMoniLog4DSL.g:1651:1: rule__MoniLogSpec__Group__10__Impl : ( '}' ) ;
    public final void rule__MoniLogSpec__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1655:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:1656:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:1656:1: ( '}' )
            // InternalMoniLog4DSL.g:1657:2: '}'
            {
             before(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_10()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__10__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group__11"
    // InternalMoniLog4DSL.g:1666:1: rule__MoniLogSpec__Group__11 : rule__MoniLogSpec__Group__11__Impl ;
    public final void rule__MoniLogSpec__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1670:1: ( rule__MoniLogSpec__Group__11__Impl )
            // InternalMoniLog4DSL.g:1671:2: rule__MoniLogSpec__Group__11__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__11"


    // $ANTLR start "rule__MoniLogSpec__Group__11__Impl"
    // InternalMoniLog4DSL.g:1677:1: rule__MoniLogSpec__Group__11__Impl : ( '}' ) ;
    public final void rule__MoniLogSpec__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1681:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:1682:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:1682:1: ( '}' )
            // InternalMoniLog4DSL.g:1683:2: '}'
            {
             before(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_11()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group__11__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_2__0"
    // InternalMoniLog4DSL.g:1693:1: rule__MoniLogSpec__Group_2__0 : rule__MoniLogSpec__Group_2__0__Impl rule__MoniLogSpec__Group_2__1 ;
    public final void rule__MoniLogSpec__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1697:1: ( rule__MoniLogSpec__Group_2__0__Impl rule__MoniLogSpec__Group_2__1 )
            // InternalMoniLog4DSL.g:1698:2: rule__MoniLogSpec__Group_2__0__Impl rule__MoniLogSpec__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__MoniLogSpec__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_2__0"


    // $ANTLR start "rule__MoniLogSpec__Group_2__0__Impl"
    // InternalMoniLog4DSL.g:1705:1: rule__MoniLogSpec__Group_2__0__Impl : ( '[' ) ;
    public final void rule__MoniLogSpec__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1709:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:1710:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:1710:1: ( '[' )
            // InternalMoniLog4DSL.g:1711:2: '['
            {
             before(grammarAccess.getMoniLogSpecAccess().getLeftSquareBracketKeyword_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getLeftSquareBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_2__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_2__1"
    // InternalMoniLog4DSL.g:1720:1: rule__MoniLogSpec__Group_2__1 : rule__MoniLogSpec__Group_2__1__Impl rule__MoniLogSpec__Group_2__2 ;
    public final void rule__MoniLogSpec__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1724:1: ( rule__MoniLogSpec__Group_2__1__Impl rule__MoniLogSpec__Group_2__2 )
            // InternalMoniLog4DSL.g:1725:2: rule__MoniLogSpec__Group_2__1__Impl rule__MoniLogSpec__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__MoniLogSpec__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_2__1"


    // $ANTLR start "rule__MoniLogSpec__Group_2__1__Impl"
    // InternalMoniLog4DSL.g:1732:1: rule__MoniLogSpec__Group_2__1__Impl : ( ( rule__MoniLogSpec__LevelAssignment_2_1 ) ) ;
    public final void rule__MoniLogSpec__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1736:1: ( ( ( rule__MoniLogSpec__LevelAssignment_2_1 ) ) )
            // InternalMoniLog4DSL.g:1737:1: ( ( rule__MoniLogSpec__LevelAssignment_2_1 ) )
            {
            // InternalMoniLog4DSL.g:1737:1: ( ( rule__MoniLogSpec__LevelAssignment_2_1 ) )
            // InternalMoniLog4DSL.g:1738:2: ( rule__MoniLogSpec__LevelAssignment_2_1 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getLevelAssignment_2_1()); 
            // InternalMoniLog4DSL.g:1739:2: ( rule__MoniLogSpec__LevelAssignment_2_1 )
            // InternalMoniLog4DSL.g:1739:3: rule__MoniLogSpec__LevelAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__LevelAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getLevelAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_2__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_2__2"
    // InternalMoniLog4DSL.g:1747:1: rule__MoniLogSpec__Group_2__2 : rule__MoniLogSpec__Group_2__2__Impl ;
    public final void rule__MoniLogSpec__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1751:1: ( rule__MoniLogSpec__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:1752:2: rule__MoniLogSpec__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_2__2"


    // $ANTLR start "rule__MoniLogSpec__Group_2__2__Impl"
    // InternalMoniLog4DSL.g:1758:1: rule__MoniLogSpec__Group_2__2__Impl : ( ']' ) ;
    public final void rule__MoniLogSpec__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1762:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:1763:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:1763:1: ( ']' )
            // InternalMoniLog4DSL.g:1764:2: ']'
            {
             before(grammarAccess.getMoniLogSpecAccess().getRightSquareBracketKeyword_2_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getRightSquareBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_2__2__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4__0"
    // InternalMoniLog4DSL.g:1774:1: rule__MoniLogSpec__Group_4__0 : rule__MoniLogSpec__Group_4__0__Impl rule__MoniLogSpec__Group_4__1 ;
    public final void rule__MoniLogSpec__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1778:1: ( rule__MoniLogSpec__Group_4__0__Impl rule__MoniLogSpec__Group_4__1 )
            // InternalMoniLog4DSL.g:1779:2: rule__MoniLogSpec__Group_4__0__Impl rule__MoniLogSpec__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__MoniLogSpec__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__0"


    // $ANTLR start "rule__MoniLogSpec__Group_4__0__Impl"
    // InternalMoniLog4DSL.g:1786:1: rule__MoniLogSpec__Group_4__0__Impl : ( 'events' ) ;
    public final void rule__MoniLogSpec__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1790:1: ( ( 'events' ) )
            // InternalMoniLog4DSL.g:1791:1: ( 'events' )
            {
            // InternalMoniLog4DSL.g:1791:1: ( 'events' )
            // InternalMoniLog4DSL.g:1792:2: 'events'
            {
             before(grammarAccess.getMoniLogSpecAccess().getEventsKeyword_4_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getEventsKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4__1"
    // InternalMoniLog4DSL.g:1801:1: rule__MoniLogSpec__Group_4__1 : rule__MoniLogSpec__Group_4__1__Impl rule__MoniLogSpec__Group_4__2 ;
    public final void rule__MoniLogSpec__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1805:1: ( rule__MoniLogSpec__Group_4__1__Impl rule__MoniLogSpec__Group_4__2 )
            // InternalMoniLog4DSL.g:1806:2: rule__MoniLogSpec__Group_4__1__Impl rule__MoniLogSpec__Group_4__2
            {
            pushFollow(FOLLOW_15);
            rule__MoniLogSpec__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__1"


    // $ANTLR start "rule__MoniLogSpec__Group_4__1__Impl"
    // InternalMoniLog4DSL.g:1813:1: rule__MoniLogSpec__Group_4__1__Impl : ( '{' ) ;
    public final void rule__MoniLogSpec__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1817:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:1818:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:1818:1: ( '{' )
            // InternalMoniLog4DSL.g:1819:2: '{'
            {
             before(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_4_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4__2"
    // InternalMoniLog4DSL.g:1828:1: rule__MoniLogSpec__Group_4__2 : rule__MoniLogSpec__Group_4__2__Impl rule__MoniLogSpec__Group_4__3 ;
    public final void rule__MoniLogSpec__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1832:1: ( rule__MoniLogSpec__Group_4__2__Impl rule__MoniLogSpec__Group_4__3 )
            // InternalMoniLog4DSL.g:1833:2: rule__MoniLogSpec__Group_4__2__Impl rule__MoniLogSpec__Group_4__3
            {
            pushFollow(FOLLOW_10);
            rule__MoniLogSpec__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__2"


    // $ANTLR start "rule__MoniLogSpec__Group_4__2__Impl"
    // InternalMoniLog4DSL.g:1840:1: rule__MoniLogSpec__Group_4__2__Impl : ( ( rule__MoniLogSpec__EventsAssignment_4_2 ) ) ;
    public final void rule__MoniLogSpec__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1844:1: ( ( ( rule__MoniLogSpec__EventsAssignment_4_2 ) ) )
            // InternalMoniLog4DSL.g:1845:1: ( ( rule__MoniLogSpec__EventsAssignment_4_2 ) )
            {
            // InternalMoniLog4DSL.g:1845:1: ( ( rule__MoniLogSpec__EventsAssignment_4_2 ) )
            // InternalMoniLog4DSL.g:1846:2: ( rule__MoniLogSpec__EventsAssignment_4_2 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getEventsAssignment_4_2()); 
            // InternalMoniLog4DSL.g:1847:2: ( rule__MoniLogSpec__EventsAssignment_4_2 )
            // InternalMoniLog4DSL.g:1847:3: rule__MoniLogSpec__EventsAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__EventsAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getEventsAssignment_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__2__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4__3"
    // InternalMoniLog4DSL.g:1855:1: rule__MoniLogSpec__Group_4__3 : rule__MoniLogSpec__Group_4__3__Impl rule__MoniLogSpec__Group_4__4 ;
    public final void rule__MoniLogSpec__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1859:1: ( rule__MoniLogSpec__Group_4__3__Impl rule__MoniLogSpec__Group_4__4 )
            // InternalMoniLog4DSL.g:1860:2: rule__MoniLogSpec__Group_4__3__Impl rule__MoniLogSpec__Group_4__4
            {
            pushFollow(FOLLOW_10);
            rule__MoniLogSpec__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__3"


    // $ANTLR start "rule__MoniLogSpec__Group_4__3__Impl"
    // InternalMoniLog4DSL.g:1867:1: rule__MoniLogSpec__Group_4__3__Impl : ( ( rule__MoniLogSpec__Group_4_3__0 )* ) ;
    public final void rule__MoniLogSpec__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1871:1: ( ( ( rule__MoniLogSpec__Group_4_3__0 )* ) )
            // InternalMoniLog4DSL.g:1872:1: ( ( rule__MoniLogSpec__Group_4_3__0 )* )
            {
            // InternalMoniLog4DSL.g:1872:1: ( ( rule__MoniLogSpec__Group_4_3__0 )* )
            // InternalMoniLog4DSL.g:1873:2: ( rule__MoniLogSpec__Group_4_3__0 )*
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup_4_3()); 
            // InternalMoniLog4DSL.g:1874:2: ( rule__MoniLogSpec__Group_4_3__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==30) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:1874:3: rule__MoniLogSpec__Group_4_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MoniLogSpec__Group_4_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMoniLogSpecAccess().getGroup_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__3__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4__4"
    // InternalMoniLog4DSL.g:1882:1: rule__MoniLogSpec__Group_4__4 : rule__MoniLogSpec__Group_4__4__Impl ;
    public final void rule__MoniLogSpec__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1886:1: ( rule__MoniLogSpec__Group_4__4__Impl )
            // InternalMoniLog4DSL.g:1887:2: rule__MoniLogSpec__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__4"


    // $ANTLR start "rule__MoniLogSpec__Group_4__4__Impl"
    // InternalMoniLog4DSL.g:1893:1: rule__MoniLogSpec__Group_4__4__Impl : ( '}' ) ;
    public final void rule__MoniLogSpec__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1897:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:1898:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:1898:1: ( '}' )
            // InternalMoniLog4DSL.g:1899:2: '}'
            {
             before(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_4_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_4_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4__4__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4_3__0"
    // InternalMoniLog4DSL.g:1909:1: rule__MoniLogSpec__Group_4_3__0 : rule__MoniLogSpec__Group_4_3__0__Impl rule__MoniLogSpec__Group_4_3__1 ;
    public final void rule__MoniLogSpec__Group_4_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1913:1: ( rule__MoniLogSpec__Group_4_3__0__Impl rule__MoniLogSpec__Group_4_3__1 )
            // InternalMoniLog4DSL.g:1914:2: rule__MoniLogSpec__Group_4_3__0__Impl rule__MoniLogSpec__Group_4_3__1
            {
            pushFollow(FOLLOW_15);
            rule__MoniLogSpec__Group_4_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4_3__0"


    // $ANTLR start "rule__MoniLogSpec__Group_4_3__0__Impl"
    // InternalMoniLog4DSL.g:1921:1: rule__MoniLogSpec__Group_4_3__0__Impl : ( ',' ) ;
    public final void rule__MoniLogSpec__Group_4_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1925:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:1926:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:1926:1: ( ',' )
            // InternalMoniLog4DSL.g:1927:2: ','
            {
             before(grammarAccess.getMoniLogSpecAccess().getCommaKeyword_4_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getCommaKeyword_4_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4_3__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_4_3__1"
    // InternalMoniLog4DSL.g:1936:1: rule__MoniLogSpec__Group_4_3__1 : rule__MoniLogSpec__Group_4_3__1__Impl ;
    public final void rule__MoniLogSpec__Group_4_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1940:1: ( rule__MoniLogSpec__Group_4_3__1__Impl )
            // InternalMoniLog4DSL.g:1941:2: rule__MoniLogSpec__Group_4_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_4_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4_3__1"


    // $ANTLR start "rule__MoniLogSpec__Group_4_3__1__Impl"
    // InternalMoniLog4DSL.g:1947:1: rule__MoniLogSpec__Group_4_3__1__Impl : ( ( rule__MoniLogSpec__EventsAssignment_4_3_1 ) ) ;
    public final void rule__MoniLogSpec__Group_4_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1951:1: ( ( ( rule__MoniLogSpec__EventsAssignment_4_3_1 ) ) )
            // InternalMoniLog4DSL.g:1952:1: ( ( rule__MoniLogSpec__EventsAssignment_4_3_1 ) )
            {
            // InternalMoniLog4DSL.g:1952:1: ( ( rule__MoniLogSpec__EventsAssignment_4_3_1 ) )
            // InternalMoniLog4DSL.g:1953:2: ( rule__MoniLogSpec__EventsAssignment_4_3_1 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getEventsAssignment_4_3_1()); 
            // InternalMoniLog4DSL.g:1954:2: ( rule__MoniLogSpec__EventsAssignment_4_3_1 )
            // InternalMoniLog4DSL.g:1954:3: rule__MoniLogSpec__EventsAssignment_4_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__EventsAssignment_4_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getEventsAssignment_4_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_4_3__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5__0"
    // InternalMoniLog4DSL.g:1963:1: rule__MoniLogSpec__Group_5__0 : rule__MoniLogSpec__Group_5__0__Impl rule__MoniLogSpec__Group_5__1 ;
    public final void rule__MoniLogSpec__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1967:1: ( rule__MoniLogSpec__Group_5__0__Impl rule__MoniLogSpec__Group_5__1 )
            // InternalMoniLog4DSL.g:1968:2: rule__MoniLogSpec__Group_5__0__Impl rule__MoniLogSpec__Group_5__1
            {
            pushFollow(FOLLOW_8);
            rule__MoniLogSpec__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__0"


    // $ANTLR start "rule__MoniLogSpec__Group_5__0__Impl"
    // InternalMoniLog4DSL.g:1975:1: rule__MoniLogSpec__Group_5__0__Impl : ( 'conditions' ) ;
    public final void rule__MoniLogSpec__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1979:1: ( ( 'conditions' ) )
            // InternalMoniLog4DSL.g:1980:1: ( 'conditions' )
            {
            // InternalMoniLog4DSL.g:1980:1: ( 'conditions' )
            // InternalMoniLog4DSL.g:1981:2: 'conditions'
            {
             before(grammarAccess.getMoniLogSpecAccess().getConditionsKeyword_5_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getConditionsKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5__1"
    // InternalMoniLog4DSL.g:1990:1: rule__MoniLogSpec__Group_5__1 : rule__MoniLogSpec__Group_5__1__Impl rule__MoniLogSpec__Group_5__2 ;
    public final void rule__MoniLogSpec__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:1994:1: ( rule__MoniLogSpec__Group_5__1__Impl rule__MoniLogSpec__Group_5__2 )
            // InternalMoniLog4DSL.g:1995:2: rule__MoniLogSpec__Group_5__1__Impl rule__MoniLogSpec__Group_5__2
            {
            pushFollow(FOLLOW_16);
            rule__MoniLogSpec__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__1"


    // $ANTLR start "rule__MoniLogSpec__Group_5__1__Impl"
    // InternalMoniLog4DSL.g:2002:1: rule__MoniLogSpec__Group_5__1__Impl : ( '{' ) ;
    public final void rule__MoniLogSpec__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2006:1: ( ( '{' ) )
            // InternalMoniLog4DSL.g:2007:1: ( '{' )
            {
            // InternalMoniLog4DSL.g:2007:1: ( '{' )
            // InternalMoniLog4DSL.g:2008:2: '{'
            {
             before(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5__2"
    // InternalMoniLog4DSL.g:2017:1: rule__MoniLogSpec__Group_5__2 : rule__MoniLogSpec__Group_5__2__Impl rule__MoniLogSpec__Group_5__3 ;
    public final void rule__MoniLogSpec__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2021:1: ( rule__MoniLogSpec__Group_5__2__Impl rule__MoniLogSpec__Group_5__3 )
            // InternalMoniLog4DSL.g:2022:2: rule__MoniLogSpec__Group_5__2__Impl rule__MoniLogSpec__Group_5__3
            {
            pushFollow(FOLLOW_10);
            rule__MoniLogSpec__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__2"


    // $ANTLR start "rule__MoniLogSpec__Group_5__2__Impl"
    // InternalMoniLog4DSL.g:2029:1: rule__MoniLogSpec__Group_5__2__Impl : ( ( rule__MoniLogSpec__ConditionsAssignment_5_2 ) ) ;
    public final void rule__MoniLogSpec__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2033:1: ( ( ( rule__MoniLogSpec__ConditionsAssignment_5_2 ) ) )
            // InternalMoniLog4DSL.g:2034:1: ( ( rule__MoniLogSpec__ConditionsAssignment_5_2 ) )
            {
            // InternalMoniLog4DSL.g:2034:1: ( ( rule__MoniLogSpec__ConditionsAssignment_5_2 ) )
            // InternalMoniLog4DSL.g:2035:2: ( rule__MoniLogSpec__ConditionsAssignment_5_2 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getConditionsAssignment_5_2()); 
            // InternalMoniLog4DSL.g:2036:2: ( rule__MoniLogSpec__ConditionsAssignment_5_2 )
            // InternalMoniLog4DSL.g:2036:3: rule__MoniLogSpec__ConditionsAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__ConditionsAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getConditionsAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__2__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5__3"
    // InternalMoniLog4DSL.g:2044:1: rule__MoniLogSpec__Group_5__3 : rule__MoniLogSpec__Group_5__3__Impl rule__MoniLogSpec__Group_5__4 ;
    public final void rule__MoniLogSpec__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2048:1: ( rule__MoniLogSpec__Group_5__3__Impl rule__MoniLogSpec__Group_5__4 )
            // InternalMoniLog4DSL.g:2049:2: rule__MoniLogSpec__Group_5__3__Impl rule__MoniLogSpec__Group_5__4
            {
            pushFollow(FOLLOW_10);
            rule__MoniLogSpec__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__3"


    // $ANTLR start "rule__MoniLogSpec__Group_5__3__Impl"
    // InternalMoniLog4DSL.g:2056:1: rule__MoniLogSpec__Group_5__3__Impl : ( ( rule__MoniLogSpec__Group_5_3__0 )* ) ;
    public final void rule__MoniLogSpec__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2060:1: ( ( ( rule__MoniLogSpec__Group_5_3__0 )* ) )
            // InternalMoniLog4DSL.g:2061:1: ( ( rule__MoniLogSpec__Group_5_3__0 )* )
            {
            // InternalMoniLog4DSL.g:2061:1: ( ( rule__MoniLogSpec__Group_5_3__0 )* )
            // InternalMoniLog4DSL.g:2062:2: ( rule__MoniLogSpec__Group_5_3__0 )*
            {
             before(grammarAccess.getMoniLogSpecAccess().getGroup_5_3()); 
            // InternalMoniLog4DSL.g:2063:2: ( rule__MoniLogSpec__Group_5_3__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==30) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:2063:3: rule__MoniLogSpec__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__MoniLogSpec__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getMoniLogSpecAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__3__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5__4"
    // InternalMoniLog4DSL.g:2071:1: rule__MoniLogSpec__Group_5__4 : rule__MoniLogSpec__Group_5__4__Impl ;
    public final void rule__MoniLogSpec__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2075:1: ( rule__MoniLogSpec__Group_5__4__Impl )
            // InternalMoniLog4DSL.g:2076:2: rule__MoniLogSpec__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__4"


    // $ANTLR start "rule__MoniLogSpec__Group_5__4__Impl"
    // InternalMoniLog4DSL.g:2082:1: rule__MoniLogSpec__Group_5__4__Impl : ( '}' ) ;
    public final void rule__MoniLogSpec__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2086:1: ( ( '}' ) )
            // InternalMoniLog4DSL.g:2087:1: ( '}' )
            {
            // InternalMoniLog4DSL.g:2087:1: ( '}' )
            // InternalMoniLog4DSL.g:2088:2: '}'
            {
             before(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5__4__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5_3__0"
    // InternalMoniLog4DSL.g:2098:1: rule__MoniLogSpec__Group_5_3__0 : rule__MoniLogSpec__Group_5_3__0__Impl rule__MoniLogSpec__Group_5_3__1 ;
    public final void rule__MoniLogSpec__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2102:1: ( rule__MoniLogSpec__Group_5_3__0__Impl rule__MoniLogSpec__Group_5_3__1 )
            // InternalMoniLog4DSL.g:2103:2: rule__MoniLogSpec__Group_5_3__0__Impl rule__MoniLogSpec__Group_5_3__1
            {
            pushFollow(FOLLOW_16);
            rule__MoniLogSpec__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5_3__0"


    // $ANTLR start "rule__MoniLogSpec__Group_5_3__0__Impl"
    // InternalMoniLog4DSL.g:2110:1: rule__MoniLogSpec__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__MoniLogSpec__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2114:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2115:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2115:1: ( ',' )
            // InternalMoniLog4DSL.g:2116:2: ','
            {
             before(grammarAccess.getMoniLogSpecAccess().getCommaKeyword_5_3_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5_3__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_5_3__1"
    // InternalMoniLog4DSL.g:2125:1: rule__MoniLogSpec__Group_5_3__1 : rule__MoniLogSpec__Group_5_3__1__Impl ;
    public final void rule__MoniLogSpec__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2129:1: ( rule__MoniLogSpec__Group_5_3__1__Impl )
            // InternalMoniLog4DSL.g:2130:2: rule__MoniLogSpec__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5_3__1"


    // $ANTLR start "rule__MoniLogSpec__Group_5_3__1__Impl"
    // InternalMoniLog4DSL.g:2136:1: rule__MoniLogSpec__Group_5_3__1__Impl : ( ( rule__MoniLogSpec__ConditionsAssignment_5_3_1 ) ) ;
    public final void rule__MoniLogSpec__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2140:1: ( ( ( rule__MoniLogSpec__ConditionsAssignment_5_3_1 ) ) )
            // InternalMoniLog4DSL.g:2141:1: ( ( rule__MoniLogSpec__ConditionsAssignment_5_3_1 ) )
            {
            // InternalMoniLog4DSL.g:2141:1: ( ( rule__MoniLogSpec__ConditionsAssignment_5_3_1 ) )
            // InternalMoniLog4DSL.g:2142:2: ( rule__MoniLogSpec__ConditionsAssignment_5_3_1 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getConditionsAssignment_5_3_1()); 
            // InternalMoniLog4DSL.g:2143:2: ( rule__MoniLogSpec__ConditionsAssignment_5_3_1 )
            // InternalMoniLog4DSL.g:2143:3: rule__MoniLogSpec__ConditionsAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__ConditionsAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getConditionsAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_5_3__1__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_9__0"
    // InternalMoniLog4DSL.g:2152:1: rule__MoniLogSpec__Group_9__0 : rule__MoniLogSpec__Group_9__0__Impl rule__MoniLogSpec__Group_9__1 ;
    public final void rule__MoniLogSpec__Group_9__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2156:1: ( rule__MoniLogSpec__Group_9__0__Impl rule__MoniLogSpec__Group_9__1 )
            // InternalMoniLog4DSL.g:2157:2: rule__MoniLogSpec__Group_9__0__Impl rule__MoniLogSpec__Group_9__1
            {
            pushFollow(FOLLOW_9);
            rule__MoniLogSpec__Group_9__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_9__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_9__0"


    // $ANTLR start "rule__MoniLogSpec__Group_9__0__Impl"
    // InternalMoniLog4DSL.g:2164:1: rule__MoniLogSpec__Group_9__0__Impl : ( ',' ) ;
    public final void rule__MoniLogSpec__Group_9__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2168:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2169:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2169:1: ( ',' )
            // InternalMoniLog4DSL.g:2170:2: ','
            {
             before(grammarAccess.getMoniLogSpecAccess().getCommaKeyword_9_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getCommaKeyword_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_9__0__Impl"


    // $ANTLR start "rule__MoniLogSpec__Group_9__1"
    // InternalMoniLog4DSL.g:2179:1: rule__MoniLogSpec__Group_9__1 : rule__MoniLogSpec__Group_9__1__Impl ;
    public final void rule__MoniLogSpec__Group_9__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2183:1: ( rule__MoniLogSpec__Group_9__1__Impl )
            // InternalMoniLog4DSL.g:2184:2: rule__MoniLogSpec__Group_9__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__Group_9__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_9__1"


    // $ANTLR start "rule__MoniLogSpec__Group_9__1__Impl"
    // InternalMoniLog4DSL.g:2190:1: rule__MoniLogSpec__Group_9__1__Impl : ( ( rule__MoniLogSpec__ActionsAssignment_9_1 ) ) ;
    public final void rule__MoniLogSpec__Group_9__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2194:1: ( ( ( rule__MoniLogSpec__ActionsAssignment_9_1 ) ) )
            // InternalMoniLog4DSL.g:2195:1: ( ( rule__MoniLogSpec__ActionsAssignment_9_1 ) )
            {
            // InternalMoniLog4DSL.g:2195:1: ( ( rule__MoniLogSpec__ActionsAssignment_9_1 ) )
            // InternalMoniLog4DSL.g:2196:2: ( rule__MoniLogSpec__ActionsAssignment_9_1 )
            {
             before(grammarAccess.getMoniLogSpecAccess().getActionsAssignment_9_1()); 
            // InternalMoniLog4DSL.g:2197:2: ( rule__MoniLogSpec__ActionsAssignment_9_1 )
            // InternalMoniLog4DSL.g:2197:3: rule__MoniLogSpec__ActionsAssignment_9_1
            {
            pushFollow(FOLLOW_2);
            rule__MoniLogSpec__ActionsAssignment_9_1();

            state._fsp--;


            }

             after(grammarAccess.getMoniLogSpecAccess().getActionsAssignment_9_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__Group_9__1__Impl"


    // $ANTLR start "rule__BeforeEvent__Group__0"
    // InternalMoniLog4DSL.g:2206:1: rule__BeforeEvent__Group__0 : rule__BeforeEvent__Group__0__Impl rule__BeforeEvent__Group__1 ;
    public final void rule__BeforeEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2210:1: ( rule__BeforeEvent__Group__0__Impl rule__BeforeEvent__Group__1 )
            // InternalMoniLog4DSL.g:2211:2: rule__BeforeEvent__Group__0__Impl rule__BeforeEvent__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__BeforeEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group__0"


    // $ANTLR start "rule__BeforeEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:2218:1: rule__BeforeEvent__Group__0__Impl : ( 'before' ) ;
    public final void rule__BeforeEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2222:1: ( ( 'before' ) )
            // InternalMoniLog4DSL.g:2223:1: ( 'before' )
            {
            // InternalMoniLog4DSL.g:2223:1: ( 'before' )
            // InternalMoniLog4DSL.g:2224:2: 'before'
            {
             before(grammarAccess.getBeforeEventAccess().getBeforeKeyword_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBeforeEventAccess().getBeforeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group__0__Impl"


    // $ANTLR start "rule__BeforeEvent__Group__1"
    // InternalMoniLog4DSL.g:2233:1: rule__BeforeEvent__Group__1 : rule__BeforeEvent__Group__1__Impl rule__BeforeEvent__Group__2 ;
    public final void rule__BeforeEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2237:1: ( rule__BeforeEvent__Group__1__Impl rule__BeforeEvent__Group__2 )
            // InternalMoniLog4DSL.g:2238:2: rule__BeforeEvent__Group__1__Impl rule__BeforeEvent__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__BeforeEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group__1"


    // $ANTLR start "rule__BeforeEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:2245:1: rule__BeforeEvent__Group__1__Impl : ( ( rule__BeforeEvent__RuleIDAssignment_1 ) ) ;
    public final void rule__BeforeEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2249:1: ( ( ( rule__BeforeEvent__RuleIDAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2250:1: ( ( rule__BeforeEvent__RuleIDAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2250:1: ( ( rule__BeforeEvent__RuleIDAssignment_1 ) )
            // InternalMoniLog4DSL.g:2251:2: ( rule__BeforeEvent__RuleIDAssignment_1 )
            {
             before(grammarAccess.getBeforeEventAccess().getRuleIDAssignment_1()); 
            // InternalMoniLog4DSL.g:2252:2: ( rule__BeforeEvent__RuleIDAssignment_1 )
            // InternalMoniLog4DSL.g:2252:3: rule__BeforeEvent__RuleIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__RuleIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBeforeEventAccess().getRuleIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group__1__Impl"


    // $ANTLR start "rule__BeforeEvent__Group__2"
    // InternalMoniLog4DSL.g:2260:1: rule__BeforeEvent__Group__2 : rule__BeforeEvent__Group__2__Impl ;
    public final void rule__BeforeEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2264:1: ( rule__BeforeEvent__Group__2__Impl )
            // InternalMoniLog4DSL.g:2265:2: rule__BeforeEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group__2"


    // $ANTLR start "rule__BeforeEvent__Group__2__Impl"
    // InternalMoniLog4DSL.g:2271:1: rule__BeforeEvent__Group__2__Impl : ( ( rule__BeforeEvent__UnorderedGroup_2 ) ) ;
    public final void rule__BeforeEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2275:1: ( ( ( rule__BeforeEvent__UnorderedGroup_2 ) ) )
            // InternalMoniLog4DSL.g:2276:1: ( ( rule__BeforeEvent__UnorderedGroup_2 ) )
            {
            // InternalMoniLog4DSL.g:2276:1: ( ( rule__BeforeEvent__UnorderedGroup_2 ) )
            // InternalMoniLog4DSL.g:2277:2: ( rule__BeforeEvent__UnorderedGroup_2 )
            {
             before(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2()); 
            // InternalMoniLog4DSL.g:2278:2: ( rule__BeforeEvent__UnorderedGroup_2 )
            // InternalMoniLog4DSL.g:2278:3: rule__BeforeEvent__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group__2__Impl"


    // $ANTLR start "rule__BeforeEvent__Group_2_0__0"
    // InternalMoniLog4DSL.g:2287:1: rule__BeforeEvent__Group_2_0__0 : rule__BeforeEvent__Group_2_0__0__Impl rule__BeforeEvent__Group_2_0__1 ;
    public final void rule__BeforeEvent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2291:1: ( rule__BeforeEvent__Group_2_0__0__Impl rule__BeforeEvent__Group_2_0__1 )
            // InternalMoniLog4DSL.g:2292:2: rule__BeforeEvent__Group_2_0__0__Impl rule__BeforeEvent__Group_2_0__1
            {
            pushFollow(FOLLOW_18);
            rule__BeforeEvent__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_0__0"


    // $ANTLR start "rule__BeforeEvent__Group_2_0__0__Impl"
    // InternalMoniLog4DSL.g:2299:1: rule__BeforeEvent__Group_2_0__0__Impl : ( 'frequency^' ) ;
    public final void rule__BeforeEvent__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2303:1: ( ( 'frequency^' ) )
            // InternalMoniLog4DSL.g:2304:1: ( 'frequency^' )
            {
            // InternalMoniLog4DSL.g:2304:1: ( 'frequency^' )
            // InternalMoniLog4DSL.g:2305:2: 'frequency^'
            {
             before(grammarAccess.getBeforeEventAccess().getFrequencyKeyword_2_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBeforeEventAccess().getFrequencyKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_0__0__Impl"


    // $ANTLR start "rule__BeforeEvent__Group_2_0__1"
    // InternalMoniLog4DSL.g:2314:1: rule__BeforeEvent__Group_2_0__1 : rule__BeforeEvent__Group_2_0__1__Impl ;
    public final void rule__BeforeEvent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2318:1: ( rule__BeforeEvent__Group_2_0__1__Impl )
            // InternalMoniLog4DSL.g:2319:2: rule__BeforeEvent__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_0__1"


    // $ANTLR start "rule__BeforeEvent__Group_2_0__1__Impl"
    // InternalMoniLog4DSL.g:2325:1: rule__BeforeEvent__Group_2_0__1__Impl : ( ( rule__BeforeEvent__FrequencyAssignment_2_0_1 ) ) ;
    public final void rule__BeforeEvent__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2329:1: ( ( ( rule__BeforeEvent__FrequencyAssignment_2_0_1 ) ) )
            // InternalMoniLog4DSL.g:2330:1: ( ( rule__BeforeEvent__FrequencyAssignment_2_0_1 ) )
            {
            // InternalMoniLog4DSL.g:2330:1: ( ( rule__BeforeEvent__FrequencyAssignment_2_0_1 ) )
            // InternalMoniLog4DSL.g:2331:2: ( rule__BeforeEvent__FrequencyAssignment_2_0_1 )
            {
             before(grammarAccess.getBeforeEventAccess().getFrequencyAssignment_2_0_1()); 
            // InternalMoniLog4DSL.g:2332:2: ( rule__BeforeEvent__FrequencyAssignment_2_0_1 )
            // InternalMoniLog4DSL.g:2332:3: rule__BeforeEvent__FrequencyAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__FrequencyAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBeforeEventAccess().getFrequencyAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_0__1__Impl"


    // $ANTLR start "rule__BeforeEvent__Group_2_1__0"
    // InternalMoniLog4DSL.g:2341:1: rule__BeforeEvent__Group_2_1__0 : rule__BeforeEvent__Group_2_1__0__Impl rule__BeforeEvent__Group_2_1__1 ;
    public final void rule__BeforeEvent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2345:1: ( rule__BeforeEvent__Group_2_1__0__Impl rule__BeforeEvent__Group_2_1__1 )
            // InternalMoniLog4DSL.g:2346:2: rule__BeforeEvent__Group_2_1__0__Impl rule__BeforeEvent__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__BeforeEvent__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_1__0"


    // $ANTLR start "rule__BeforeEvent__Group_2_1__0__Impl"
    // InternalMoniLog4DSL.g:2353:1: rule__BeforeEvent__Group_2_1__0__Impl : ( 'limit' ) ;
    public final void rule__BeforeEvent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2357:1: ( ( 'limit' ) )
            // InternalMoniLog4DSL.g:2358:1: ( 'limit' )
            {
            // InternalMoniLog4DSL.g:2358:1: ( 'limit' )
            // InternalMoniLog4DSL.g:2359:2: 'limit'
            {
             before(grammarAccess.getBeforeEventAccess().getLimitKeyword_2_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBeforeEventAccess().getLimitKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_1__0__Impl"


    // $ANTLR start "rule__BeforeEvent__Group_2_1__1"
    // InternalMoniLog4DSL.g:2368:1: rule__BeforeEvent__Group_2_1__1 : rule__BeforeEvent__Group_2_1__1__Impl ;
    public final void rule__BeforeEvent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2372:1: ( rule__BeforeEvent__Group_2_1__1__Impl )
            // InternalMoniLog4DSL.g:2373:2: rule__BeforeEvent__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_1__1"


    // $ANTLR start "rule__BeforeEvent__Group_2_1__1__Impl"
    // InternalMoniLog4DSL.g:2379:1: rule__BeforeEvent__Group_2_1__1__Impl : ( ( rule__BeforeEvent__LimitAssignment_2_1_1 ) ) ;
    public final void rule__BeforeEvent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2383:1: ( ( ( rule__BeforeEvent__LimitAssignment_2_1_1 ) ) )
            // InternalMoniLog4DSL.g:2384:1: ( ( rule__BeforeEvent__LimitAssignment_2_1_1 ) )
            {
            // InternalMoniLog4DSL.g:2384:1: ( ( rule__BeforeEvent__LimitAssignment_2_1_1 ) )
            // InternalMoniLog4DSL.g:2385:2: ( rule__BeforeEvent__LimitAssignment_2_1_1 )
            {
             before(grammarAccess.getBeforeEventAccess().getLimitAssignment_2_1_1()); 
            // InternalMoniLog4DSL.g:2386:2: ( rule__BeforeEvent__LimitAssignment_2_1_1 )
            // InternalMoniLog4DSL.g:2386:3: rule__BeforeEvent__LimitAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__LimitAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBeforeEventAccess().getLimitAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__Group_2_1__1__Impl"


    // $ANTLR start "rule__AfterEvent__Group__0"
    // InternalMoniLog4DSL.g:2395:1: rule__AfterEvent__Group__0 : rule__AfterEvent__Group__0__Impl rule__AfterEvent__Group__1 ;
    public final void rule__AfterEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2399:1: ( rule__AfterEvent__Group__0__Impl rule__AfterEvent__Group__1 )
            // InternalMoniLog4DSL.g:2400:2: rule__AfterEvent__Group__0__Impl rule__AfterEvent__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__AfterEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group__0"


    // $ANTLR start "rule__AfterEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:2407:1: rule__AfterEvent__Group__0__Impl : ( 'after' ) ;
    public final void rule__AfterEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2411:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:2412:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:2412:1: ( 'after' )
            // InternalMoniLog4DSL.g:2413:2: 'after'
            {
             before(grammarAccess.getAfterEventAccess().getAfterKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getAfterEventAccess().getAfterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group__0__Impl"


    // $ANTLR start "rule__AfterEvent__Group__1"
    // InternalMoniLog4DSL.g:2422:1: rule__AfterEvent__Group__1 : rule__AfterEvent__Group__1__Impl rule__AfterEvent__Group__2 ;
    public final void rule__AfterEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2426:1: ( rule__AfterEvent__Group__1__Impl rule__AfterEvent__Group__2 )
            // InternalMoniLog4DSL.g:2427:2: rule__AfterEvent__Group__1__Impl rule__AfterEvent__Group__2
            {
            pushFollow(FOLLOW_19);
            rule__AfterEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group__1"


    // $ANTLR start "rule__AfterEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:2434:1: rule__AfterEvent__Group__1__Impl : ( ( rule__AfterEvent__RuleIDAssignment_1 ) ) ;
    public final void rule__AfterEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2438:1: ( ( ( rule__AfterEvent__RuleIDAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:2439:1: ( ( rule__AfterEvent__RuleIDAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:2439:1: ( ( rule__AfterEvent__RuleIDAssignment_1 ) )
            // InternalMoniLog4DSL.g:2440:2: ( rule__AfterEvent__RuleIDAssignment_1 )
            {
             before(grammarAccess.getAfterEventAccess().getRuleIDAssignment_1()); 
            // InternalMoniLog4DSL.g:2441:2: ( rule__AfterEvent__RuleIDAssignment_1 )
            // InternalMoniLog4DSL.g:2441:3: rule__AfterEvent__RuleIDAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__RuleIDAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterEventAccess().getRuleIDAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group__1__Impl"


    // $ANTLR start "rule__AfterEvent__Group__2"
    // InternalMoniLog4DSL.g:2449:1: rule__AfterEvent__Group__2 : rule__AfterEvent__Group__2__Impl ;
    public final void rule__AfterEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2453:1: ( rule__AfterEvent__Group__2__Impl )
            // InternalMoniLog4DSL.g:2454:2: rule__AfterEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group__2"


    // $ANTLR start "rule__AfterEvent__Group__2__Impl"
    // InternalMoniLog4DSL.g:2460:1: rule__AfterEvent__Group__2__Impl : ( ( rule__AfterEvent__UnorderedGroup_2 ) ) ;
    public final void rule__AfterEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2464:1: ( ( ( rule__AfterEvent__UnorderedGroup_2 ) ) )
            // InternalMoniLog4DSL.g:2465:1: ( ( rule__AfterEvent__UnorderedGroup_2 ) )
            {
            // InternalMoniLog4DSL.g:2465:1: ( ( rule__AfterEvent__UnorderedGroup_2 ) )
            // InternalMoniLog4DSL.g:2466:2: ( rule__AfterEvent__UnorderedGroup_2 )
            {
             before(grammarAccess.getAfterEventAccess().getUnorderedGroup_2()); 
            // InternalMoniLog4DSL.g:2467:2: ( rule__AfterEvent__UnorderedGroup_2 )
            // InternalMoniLog4DSL.g:2467:3: rule__AfterEvent__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getAfterEventAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group__2__Impl"


    // $ANTLR start "rule__AfterEvent__Group_2_0__0"
    // InternalMoniLog4DSL.g:2476:1: rule__AfterEvent__Group_2_0__0 : rule__AfterEvent__Group_2_0__0__Impl rule__AfterEvent__Group_2_0__1 ;
    public final void rule__AfterEvent__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2480:1: ( rule__AfterEvent__Group_2_0__0__Impl rule__AfterEvent__Group_2_0__1 )
            // InternalMoniLog4DSL.g:2481:2: rule__AfterEvent__Group_2_0__0__Impl rule__AfterEvent__Group_2_0__1
            {
            pushFollow(FOLLOW_18);
            rule__AfterEvent__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_0__0"


    // $ANTLR start "rule__AfterEvent__Group_2_0__0__Impl"
    // InternalMoniLog4DSL.g:2488:1: rule__AfterEvent__Group_2_0__0__Impl : ( 'frequency' ) ;
    public final void rule__AfterEvent__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2492:1: ( ( 'frequency' ) )
            // InternalMoniLog4DSL.g:2493:1: ( 'frequency' )
            {
            // InternalMoniLog4DSL.g:2493:1: ( 'frequency' )
            // InternalMoniLog4DSL.g:2494:2: 'frequency'
            {
             before(grammarAccess.getAfterEventAccess().getFrequencyKeyword_2_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getAfterEventAccess().getFrequencyKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_0__0__Impl"


    // $ANTLR start "rule__AfterEvent__Group_2_0__1"
    // InternalMoniLog4DSL.g:2503:1: rule__AfterEvent__Group_2_0__1 : rule__AfterEvent__Group_2_0__1__Impl ;
    public final void rule__AfterEvent__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2507:1: ( rule__AfterEvent__Group_2_0__1__Impl )
            // InternalMoniLog4DSL.g:2508:2: rule__AfterEvent__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_0__1"


    // $ANTLR start "rule__AfterEvent__Group_2_0__1__Impl"
    // InternalMoniLog4DSL.g:2514:1: rule__AfterEvent__Group_2_0__1__Impl : ( ( rule__AfterEvent__FrequencyAssignment_2_0_1 ) ) ;
    public final void rule__AfterEvent__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2518:1: ( ( ( rule__AfterEvent__FrequencyAssignment_2_0_1 ) ) )
            // InternalMoniLog4DSL.g:2519:1: ( ( rule__AfterEvent__FrequencyAssignment_2_0_1 ) )
            {
            // InternalMoniLog4DSL.g:2519:1: ( ( rule__AfterEvent__FrequencyAssignment_2_0_1 ) )
            // InternalMoniLog4DSL.g:2520:2: ( rule__AfterEvent__FrequencyAssignment_2_0_1 )
            {
             before(grammarAccess.getAfterEventAccess().getFrequencyAssignment_2_0_1()); 
            // InternalMoniLog4DSL.g:2521:2: ( rule__AfterEvent__FrequencyAssignment_2_0_1 )
            // InternalMoniLog4DSL.g:2521:3: rule__AfterEvent__FrequencyAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__FrequencyAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterEventAccess().getFrequencyAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_0__1__Impl"


    // $ANTLR start "rule__AfterEvent__Group_2_1__0"
    // InternalMoniLog4DSL.g:2530:1: rule__AfterEvent__Group_2_1__0 : rule__AfterEvent__Group_2_1__0__Impl rule__AfterEvent__Group_2_1__1 ;
    public final void rule__AfterEvent__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2534:1: ( rule__AfterEvent__Group_2_1__0__Impl rule__AfterEvent__Group_2_1__1 )
            // InternalMoniLog4DSL.g:2535:2: rule__AfterEvent__Group_2_1__0__Impl rule__AfterEvent__Group_2_1__1
            {
            pushFollow(FOLLOW_18);
            rule__AfterEvent__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_1__0"


    // $ANTLR start "rule__AfterEvent__Group_2_1__0__Impl"
    // InternalMoniLog4DSL.g:2542:1: rule__AfterEvent__Group_2_1__0__Impl : ( 'limit' ) ;
    public final void rule__AfterEvent__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2546:1: ( ( 'limit' ) )
            // InternalMoniLog4DSL.g:2547:1: ( 'limit' )
            {
            // InternalMoniLog4DSL.g:2547:1: ( 'limit' )
            // InternalMoniLog4DSL.g:2548:2: 'limit'
            {
             before(grammarAccess.getAfterEventAccess().getLimitKeyword_2_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getAfterEventAccess().getLimitKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_1__0__Impl"


    // $ANTLR start "rule__AfterEvent__Group_2_1__1"
    // InternalMoniLog4DSL.g:2557:1: rule__AfterEvent__Group_2_1__1 : rule__AfterEvent__Group_2_1__1__Impl ;
    public final void rule__AfterEvent__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2561:1: ( rule__AfterEvent__Group_2_1__1__Impl )
            // InternalMoniLog4DSL.g:2562:2: rule__AfterEvent__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_1__1"


    // $ANTLR start "rule__AfterEvent__Group_2_1__1__Impl"
    // InternalMoniLog4DSL.g:2568:1: rule__AfterEvent__Group_2_1__1__Impl : ( ( rule__AfterEvent__LimitAssignment_2_1_1 ) ) ;
    public final void rule__AfterEvent__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2572:1: ( ( ( rule__AfterEvent__LimitAssignment_2_1_1 ) ) )
            // InternalMoniLog4DSL.g:2573:1: ( ( rule__AfterEvent__LimitAssignment_2_1_1 ) )
            {
            // InternalMoniLog4DSL.g:2573:1: ( ( rule__AfterEvent__LimitAssignment_2_1_1 ) )
            // InternalMoniLog4DSL.g:2574:2: ( rule__AfterEvent__LimitAssignment_2_1_1 )
            {
             before(grammarAccess.getAfterEventAccess().getLimitAssignment_2_1_1()); 
            // InternalMoniLog4DSL.g:2575:2: ( rule__AfterEvent__LimitAssignment_2_1_1 )
            // InternalMoniLog4DSL.g:2575:3: rule__AfterEvent__LimitAssignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__LimitAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAfterEventAccess().getLimitAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__Group_2_1__1__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__Group__0"
    // InternalMoniLog4DSL.g:2584:1: rule__BeforeAfterEvent__Group__0 : rule__BeforeAfterEvent__Group__0__Impl rule__BeforeAfterEvent__Group__1 ;
    public final void rule__BeforeAfterEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2588:1: ( rule__BeforeAfterEvent__Group__0__Impl rule__BeforeAfterEvent__Group__1 )
            // InternalMoniLog4DSL.g:2589:2: rule__BeforeAfterEvent__Group__0__Impl rule__BeforeAfterEvent__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__BeforeAfterEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group__0"


    // $ANTLR start "rule__BeforeAfterEvent__Group__0__Impl"
    // InternalMoniLog4DSL.g:2596:1: rule__BeforeAfterEvent__Group__0__Impl : ( ( rule__BeforeAfterEvent__RuleIDAssignment_0 ) ) ;
    public final void rule__BeforeAfterEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2600:1: ( ( ( rule__BeforeAfterEvent__RuleIDAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:2601:1: ( ( rule__BeforeAfterEvent__RuleIDAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:2601:1: ( ( rule__BeforeAfterEvent__RuleIDAssignment_0 ) )
            // InternalMoniLog4DSL.g:2602:2: ( rule__BeforeAfterEvent__RuleIDAssignment_0 )
            {
             before(grammarAccess.getBeforeAfterEventAccess().getRuleIDAssignment_0()); 
            // InternalMoniLog4DSL.g:2603:2: ( rule__BeforeAfterEvent__RuleIDAssignment_0 )
            // InternalMoniLog4DSL.g:2603:3: rule__BeforeAfterEvent__RuleIDAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__RuleIDAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getBeforeAfterEventAccess().getRuleIDAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group__0__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__Group__1"
    // InternalMoniLog4DSL.g:2611:1: rule__BeforeAfterEvent__Group__1 : rule__BeforeAfterEvent__Group__1__Impl ;
    public final void rule__BeforeAfterEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2615:1: ( rule__BeforeAfterEvent__Group__1__Impl )
            // InternalMoniLog4DSL.g:2616:2: rule__BeforeAfterEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group__1"


    // $ANTLR start "rule__BeforeAfterEvent__Group__1__Impl"
    // InternalMoniLog4DSL.g:2622:1: rule__BeforeAfterEvent__Group__1__Impl : ( ( rule__BeforeAfterEvent__UnorderedGroup_1 ) ) ;
    public final void rule__BeforeAfterEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2626:1: ( ( ( rule__BeforeAfterEvent__UnorderedGroup_1 ) ) )
            // InternalMoniLog4DSL.g:2627:1: ( ( rule__BeforeAfterEvent__UnorderedGroup_1 ) )
            {
            // InternalMoniLog4DSL.g:2627:1: ( ( rule__BeforeAfterEvent__UnorderedGroup_1 ) )
            // InternalMoniLog4DSL.g:2628:2: ( rule__BeforeAfterEvent__UnorderedGroup_1 )
            {
             before(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1()); 
            // InternalMoniLog4DSL.g:2629:2: ( rule__BeforeAfterEvent__UnorderedGroup_1 )
            // InternalMoniLog4DSL.g:2629:3: rule__BeforeAfterEvent__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group__1__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_0__0"
    // InternalMoniLog4DSL.g:2638:1: rule__BeforeAfterEvent__Group_1_0__0 : rule__BeforeAfterEvent__Group_1_0__0__Impl rule__BeforeAfterEvent__Group_1_0__1 ;
    public final void rule__BeforeAfterEvent__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2642:1: ( rule__BeforeAfterEvent__Group_1_0__0__Impl rule__BeforeAfterEvent__Group_1_0__1 )
            // InternalMoniLog4DSL.g:2643:2: rule__BeforeAfterEvent__Group_1_0__0__Impl rule__BeforeAfterEvent__Group_1_0__1
            {
            pushFollow(FOLLOW_18);
            rule__BeforeAfterEvent__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_0__0"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_0__0__Impl"
    // InternalMoniLog4DSL.g:2650:1: rule__BeforeAfterEvent__Group_1_0__0__Impl : ( 'frequency' ) ;
    public final void rule__BeforeAfterEvent__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2654:1: ( ( 'frequency' ) )
            // InternalMoniLog4DSL.g:2655:1: ( 'frequency' )
            {
            // InternalMoniLog4DSL.g:2655:1: ( 'frequency' )
            // InternalMoniLog4DSL.g:2656:2: 'frequency'
            {
             before(grammarAccess.getBeforeAfterEventAccess().getFrequencyKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getBeforeAfterEventAccess().getFrequencyKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_0__0__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_0__1"
    // InternalMoniLog4DSL.g:2665:1: rule__BeforeAfterEvent__Group_1_0__1 : rule__BeforeAfterEvent__Group_1_0__1__Impl ;
    public final void rule__BeforeAfterEvent__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2669:1: ( rule__BeforeAfterEvent__Group_1_0__1__Impl )
            // InternalMoniLog4DSL.g:2670:2: rule__BeforeAfterEvent__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_0__1"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_0__1__Impl"
    // InternalMoniLog4DSL.g:2676:1: rule__BeforeAfterEvent__Group_1_0__1__Impl : ( ( rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 ) ) ;
    public final void rule__BeforeAfterEvent__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2680:1: ( ( ( rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 ) ) )
            // InternalMoniLog4DSL.g:2681:1: ( ( rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 ) )
            {
            // InternalMoniLog4DSL.g:2681:1: ( ( rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 ) )
            // InternalMoniLog4DSL.g:2682:2: ( rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 )
            {
             before(grammarAccess.getBeforeAfterEventAccess().getFrequencyAssignment_1_0_1()); 
            // InternalMoniLog4DSL.g:2683:2: ( rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 )
            // InternalMoniLog4DSL.g:2683:3: rule__BeforeAfterEvent__FrequencyAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__FrequencyAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getBeforeAfterEventAccess().getFrequencyAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_0__1__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_1__0"
    // InternalMoniLog4DSL.g:2692:1: rule__BeforeAfterEvent__Group_1_1__0 : rule__BeforeAfterEvent__Group_1_1__0__Impl rule__BeforeAfterEvent__Group_1_1__1 ;
    public final void rule__BeforeAfterEvent__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2696:1: ( rule__BeforeAfterEvent__Group_1_1__0__Impl rule__BeforeAfterEvent__Group_1_1__1 )
            // InternalMoniLog4DSL.g:2697:2: rule__BeforeAfterEvent__Group_1_1__0__Impl rule__BeforeAfterEvent__Group_1_1__1
            {
            pushFollow(FOLLOW_18);
            rule__BeforeAfterEvent__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_1__0"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_1__0__Impl"
    // InternalMoniLog4DSL.g:2704:1: rule__BeforeAfterEvent__Group_1_1__0__Impl : ( 'limit' ) ;
    public final void rule__BeforeAfterEvent__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2708:1: ( ( 'limit' ) )
            // InternalMoniLog4DSL.g:2709:1: ( 'limit' )
            {
            // InternalMoniLog4DSL.g:2709:1: ( 'limit' )
            // InternalMoniLog4DSL.g:2710:2: 'limit'
            {
             before(grammarAccess.getBeforeAfterEventAccess().getLimitKeyword_1_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getBeforeAfterEventAccess().getLimitKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_1__0__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_1__1"
    // InternalMoniLog4DSL.g:2719:1: rule__BeforeAfterEvent__Group_1_1__1 : rule__BeforeAfterEvent__Group_1_1__1__Impl ;
    public final void rule__BeforeAfterEvent__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2723:1: ( rule__BeforeAfterEvent__Group_1_1__1__Impl )
            // InternalMoniLog4DSL.g:2724:2: rule__BeforeAfterEvent__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__Group_1_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_1__1"


    // $ANTLR start "rule__BeforeAfterEvent__Group_1_1__1__Impl"
    // InternalMoniLog4DSL.g:2730:1: rule__BeforeAfterEvent__Group_1_1__1__Impl : ( ( rule__BeforeAfterEvent__LimitAssignment_1_1_1 ) ) ;
    public final void rule__BeforeAfterEvent__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2734:1: ( ( ( rule__BeforeAfterEvent__LimitAssignment_1_1_1 ) ) )
            // InternalMoniLog4DSL.g:2735:1: ( ( rule__BeforeAfterEvent__LimitAssignment_1_1_1 ) )
            {
            // InternalMoniLog4DSL.g:2735:1: ( ( rule__BeforeAfterEvent__LimitAssignment_1_1_1 ) )
            // InternalMoniLog4DSL.g:2736:2: ( rule__BeforeAfterEvent__LimitAssignment_1_1_1 )
            {
             before(grammarAccess.getBeforeAfterEventAccess().getLimitAssignment_1_1_1()); 
            // InternalMoniLog4DSL.g:2737:2: ( rule__BeforeAfterEvent__LimitAssignment_1_1_1 )
            // InternalMoniLog4DSL.g:2737:3: rule__BeforeAfterEvent__LimitAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__LimitAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getBeforeAfterEventAccess().getLimitAssignment_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__Group_1_1__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__0"
    // InternalMoniLog4DSL.g:2746:1: rule__Condition__Group_0__0 : rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 ;
    public final void rule__Condition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2750:1: ( rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1 )
            // InternalMoniLog4DSL.g:2751:2: rule__Condition__Group_0__0__Impl rule__Condition__Group_0__1
            {
            pushFollow(FOLLOW_20);
            rule__Condition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0"


    // $ANTLR start "rule__Condition__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:2758:1: rule__Condition__Group_0__0__Impl : ( () ) ;
    public final void rule__Condition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2762:1: ( ( () ) )
            // InternalMoniLog4DSL.g:2763:1: ( () )
            {
            // InternalMoniLog4DSL.g:2763:1: ( () )
            // InternalMoniLog4DSL.g:2764:2: ()
            {
             before(grammarAccess.getConditionAccess().getTemporalPropertyConditionAction_0_0()); 
            // InternalMoniLog4DSL.g:2765:2: ()
            // InternalMoniLog4DSL.g:2765:3: 
            {
            }

             after(grammarAccess.getConditionAccess().getTemporalPropertyConditionAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__0__Impl"


    // $ANTLR start "rule__Condition__Group_0__1"
    // InternalMoniLog4DSL.g:2773:1: rule__Condition__Group_0__1 : rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 ;
    public final void rule__Condition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2777:1: ( rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2 )
            // InternalMoniLog4DSL.g:2778:2: rule__Condition__Group_0__1__Impl rule__Condition__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__Condition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1"


    // $ANTLR start "rule__Condition__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:2785:1: rule__Condition__Group_0__1__Impl : ( 'stream' ) ;
    public final void rule__Condition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2789:1: ( ( 'stream' ) )
            // InternalMoniLog4DSL.g:2790:1: ( 'stream' )
            {
            // InternalMoniLog4DSL.g:2790:1: ( 'stream' )
            // InternalMoniLog4DSL.g:2791:2: 'stream'
            {
             before(grammarAccess.getConditionAccess().getStreamKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getStreamKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__1__Impl"


    // $ANTLR start "rule__Condition__Group_0__2"
    // InternalMoniLog4DSL.g:2800:1: rule__Condition__Group_0__2 : rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3 ;
    public final void rule__Condition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2804:1: ( rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3 )
            // InternalMoniLog4DSL.g:2805:2: rule__Condition__Group_0__2__Impl rule__Condition__Group_0__3
            {
            pushFollow(FOLLOW_22);
            rule__Condition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2"


    // $ANTLR start "rule__Condition__Group_0__2__Impl"
    // InternalMoniLog4DSL.g:2812:1: rule__Condition__Group_0__2__Impl : ( '(' ) ;
    public final void rule__Condition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2816:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:2817:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:2817:1: ( '(' )
            // InternalMoniLog4DSL.g:2818:2: '('
            {
             before(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__2__Impl"


    // $ANTLR start "rule__Condition__Group_0__3"
    // InternalMoniLog4DSL.g:2827:1: rule__Condition__Group_0__3 : rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4 ;
    public final void rule__Condition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2831:1: ( rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4 )
            // InternalMoniLog4DSL.g:2832:2: rule__Condition__Group_0__3__Impl rule__Condition__Group_0__4
            {
            pushFollow(FOLLOW_23);
            rule__Condition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__3"


    // $ANTLR start "rule__Condition__Group_0__3__Impl"
    // InternalMoniLog4DSL.g:2839:1: rule__Condition__Group_0__3__Impl : ( ( rule__Condition__PatternAssignment_0_3 ) ) ;
    public final void rule__Condition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2843:1: ( ( ( rule__Condition__PatternAssignment_0_3 ) ) )
            // InternalMoniLog4DSL.g:2844:1: ( ( rule__Condition__PatternAssignment_0_3 ) )
            {
            // InternalMoniLog4DSL.g:2844:1: ( ( rule__Condition__PatternAssignment_0_3 ) )
            // InternalMoniLog4DSL.g:2845:2: ( rule__Condition__PatternAssignment_0_3 )
            {
             before(grammarAccess.getConditionAccess().getPatternAssignment_0_3()); 
            // InternalMoniLog4DSL.g:2846:2: ( rule__Condition__PatternAssignment_0_3 )
            // InternalMoniLog4DSL.g:2846:3: rule__Condition__PatternAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Condition__PatternAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getPatternAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__3__Impl"


    // $ANTLR start "rule__Condition__Group_0__4"
    // InternalMoniLog4DSL.g:2854:1: rule__Condition__Group_0__4 : rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5 ;
    public final void rule__Condition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2858:1: ( rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5 )
            // InternalMoniLog4DSL.g:2859:2: rule__Condition__Group_0__4__Impl rule__Condition__Group_0__5
            {
            pushFollow(FOLLOW_23);
            rule__Condition__Group_0__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__4"


    // $ANTLR start "rule__Condition__Group_0__4__Impl"
    // InternalMoniLog4DSL.g:2866:1: rule__Condition__Group_0__4__Impl : ( ( rule__Condition__Group_0_4__0 )? ) ;
    public final void rule__Condition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2870:1: ( ( ( rule__Condition__Group_0_4__0 )? ) )
            // InternalMoniLog4DSL.g:2871:1: ( ( rule__Condition__Group_0_4__0 )? )
            {
            // InternalMoniLog4DSL.g:2871:1: ( ( rule__Condition__Group_0_4__0 )? )
            // InternalMoniLog4DSL.g:2872:2: ( rule__Condition__Group_0_4__0 )?
            {
             before(grammarAccess.getConditionAccess().getGroup_0_4()); 
            // InternalMoniLog4DSL.g:2873:2: ( rule__Condition__Group_0_4__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==30) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoniLog4DSL.g:2873:3: rule__Condition__Group_0_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Condition__Group_0_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionAccess().getGroup_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__4__Impl"


    // $ANTLR start "rule__Condition__Group_0__5"
    // InternalMoniLog4DSL.g:2881:1: rule__Condition__Group_0__5 : rule__Condition__Group_0__5__Impl ;
    public final void rule__Condition__Group_0__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2885:1: ( rule__Condition__Group_0__5__Impl )
            // InternalMoniLog4DSL.g:2886:2: rule__Condition__Group_0__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__5"


    // $ANTLR start "rule__Condition__Group_0__5__Impl"
    // InternalMoniLog4DSL.g:2892:1: rule__Condition__Group_0__5__Impl : ( ')' ) ;
    public final void rule__Condition__Group_0__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2896:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:2897:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:2897:1: ( ')' )
            // InternalMoniLog4DSL.g:2898:2: ')'
            {
             before(grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getRightParenthesisKeyword_0_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0__5__Impl"


    // $ANTLR start "rule__Condition__Group_0_4__0"
    // InternalMoniLog4DSL.g:2908:1: rule__Condition__Group_0_4__0 : rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1 ;
    public final void rule__Condition__Group_0_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2912:1: ( rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1 )
            // InternalMoniLog4DSL.g:2913:2: rule__Condition__Group_0_4__0__Impl rule__Condition__Group_0_4__1
            {
            pushFollow(FOLLOW_24);
            rule__Condition__Group_0_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__0"


    // $ANTLR start "rule__Condition__Group_0_4__0__Impl"
    // InternalMoniLog4DSL.g:2920:1: rule__Condition__Group_0_4__0__Impl : ( ',' ) ;
    public final void rule__Condition__Group_0_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2924:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:2925:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:2925:1: ( ',' )
            // InternalMoniLog4DSL.g:2926:2: ','
            {
             before(grammarAccess.getConditionAccess().getCommaKeyword_0_4_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getConditionAccess().getCommaKeyword_0_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__0__Impl"


    // $ANTLR start "rule__Condition__Group_0_4__1"
    // InternalMoniLog4DSL.g:2935:1: rule__Condition__Group_0_4__1 : rule__Condition__Group_0_4__1__Impl ;
    public final void rule__Condition__Group_0_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2939:1: ( rule__Condition__Group_0_4__1__Impl )
            // InternalMoniLog4DSL.g:2940:2: rule__Condition__Group_0_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_0_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__1"


    // $ANTLR start "rule__Condition__Group_0_4__1__Impl"
    // InternalMoniLog4DSL.g:2946:1: rule__Condition__Group_0_4__1__Impl : ( ( rule__Condition__KindAssignment_0_4_1 ) ) ;
    public final void rule__Condition__Group_0_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2950:1: ( ( ( rule__Condition__KindAssignment_0_4_1 ) ) )
            // InternalMoniLog4DSL.g:2951:1: ( ( rule__Condition__KindAssignment_0_4_1 ) )
            {
            // InternalMoniLog4DSL.g:2951:1: ( ( rule__Condition__KindAssignment_0_4_1 ) )
            // InternalMoniLog4DSL.g:2952:2: ( rule__Condition__KindAssignment_0_4_1 )
            {
             before(grammarAccess.getConditionAccess().getKindAssignment_0_4_1()); 
            // InternalMoniLog4DSL.g:2953:2: ( rule__Condition__KindAssignment_0_4_1 )
            // InternalMoniLog4DSL.g:2953:3: rule__Condition__KindAssignment_0_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__KindAssignment_0_4_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getKindAssignment_0_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_0_4__1__Impl"


    // $ANTLR start "rule__Condition__Group_1__0"
    // InternalMoniLog4DSL.g:2962:1: rule__Condition__Group_1__0 : rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 ;
    public final void rule__Condition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2966:1: ( rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1 )
            // InternalMoniLog4DSL.g:2967:2: rule__Condition__Group_1__0__Impl rule__Condition__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Condition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0"


    // $ANTLR start "rule__Condition__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:2974:1: rule__Condition__Group_1__0__Impl : ( () ) ;
    public final void rule__Condition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2978:1: ( ( () ) )
            // InternalMoniLog4DSL.g:2979:1: ( () )
            {
            // InternalMoniLog4DSL.g:2979:1: ( () )
            // InternalMoniLog4DSL.g:2980:2: ()
            {
             before(grammarAccess.getConditionAccess().getLanguageExpressionConditionAction_1_0()); 
            // InternalMoniLog4DSL.g:2981:2: ()
            // InternalMoniLog4DSL.g:2981:3: 
            {
            }

             after(grammarAccess.getConditionAccess().getLanguageExpressionConditionAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__0__Impl"


    // $ANTLR start "rule__Condition__Group_1__1"
    // InternalMoniLog4DSL.g:2989:1: rule__Condition__Group_1__1 : rule__Condition__Group_1__1__Impl ;
    public final void rule__Condition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:2993:1: ( rule__Condition__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:2994:2: rule__Condition__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Condition__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1"


    // $ANTLR start "rule__Condition__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:3000:1: rule__Condition__Group_1__1__Impl : ( ( rule__Condition__ExpressionAssignment_1_1 ) ) ;
    public final void rule__Condition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3004:1: ( ( ( rule__Condition__ExpressionAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:3005:1: ( ( rule__Condition__ExpressionAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:3005:1: ( ( rule__Condition__ExpressionAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:3006:2: ( rule__Condition__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getConditionAccess().getExpressionAssignment_1_1()); 
            // InternalMoniLog4DSL.g:3007:2: ( rule__Condition__ExpressionAssignment_1_1 )
            // InternalMoniLog4DSL.g:3007:3: rule__Condition__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Condition__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getConditionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__Group_1__1__Impl"


    // $ANTLR start "rule__TemporalPattern__Group__0"
    // InternalMoniLog4DSL.g:3016:1: rule__TemporalPattern__Group__0 : rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 ;
    public final void rule__TemporalPattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3020:1: ( rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1 )
            // InternalMoniLog4DSL.g:3021:2: rule__TemporalPattern__Group__0__Impl rule__TemporalPattern__Group__1
            {
            pushFollow(FOLLOW_25);
            rule__TemporalPattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3028:1: rule__TemporalPattern__Group__0__Impl : ( ( rule__TemporalPattern__PatternAssignment_0 ) ) ;
    public final void rule__TemporalPattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3032:1: ( ( ( rule__TemporalPattern__PatternAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:3033:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:3033:1: ( ( rule__TemporalPattern__PatternAssignment_0 ) )
            // InternalMoniLog4DSL.g:3034:2: ( rule__TemporalPattern__PatternAssignment_0 )
            {
             before(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0()); 
            // InternalMoniLog4DSL.g:3035:2: ( rule__TemporalPattern__PatternAssignment_0 )
            // InternalMoniLog4DSL.g:3035:3: rule__TemporalPattern__PatternAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__PatternAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPatternAccess().getPatternAssignment_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3043:1: rule__TemporalPattern__Group__1 : rule__TemporalPattern__Group__1__Impl ;
    public final void rule__TemporalPattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3047:1: ( rule__TemporalPattern__Group__1__Impl )
            // InternalMoniLog4DSL.g:3048:2: rule__TemporalPattern__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3054:1: rule__TemporalPattern__Group__1__Impl : ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) ;
    public final void rule__TemporalPattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3058:1: ( ( ( rule__TemporalPattern__ScopeAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:3059:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:3059:1: ( ( rule__TemporalPattern__ScopeAssignment_1 ) )
            // InternalMoniLog4DSL.g:3060:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            {
             before(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1()); 
            // InternalMoniLog4DSL.g:3061:2: ( rule__TemporalPattern__ScopeAssignment_1 )
            // InternalMoniLog4DSL.g:3061:3: rule__TemporalPattern__ScopeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TemporalPattern__ScopeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTemporalPatternAccess().getScopeAssignment_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3070:1: rule__Pattern__Group_0__0 : rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 ;
    public final void rule__Pattern__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3074:1: ( rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1 )
            // InternalMoniLog4DSL.g:3075:2: rule__Pattern__Group_0__0__Impl rule__Pattern__Group_0__1
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3082:1: rule__Pattern__Group_0__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3086:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3087:1: ( () )
            {
            // InternalMoniLog4DSL.g:3087:1: ( () )
            // InternalMoniLog4DSL.g:3088:2: ()
            {
             before(grammarAccess.getPatternAccess().getUniversalityAction_0_0()); 
            // InternalMoniLog4DSL.g:3089:2: ()
            // InternalMoniLog4DSL.g:3089:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getUniversalityAction_0_0()); 

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
    // InternalMoniLog4DSL.g:3097:1: rule__Pattern__Group_0__1 : rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 ;
    public final void rule__Pattern__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3101:1: ( rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2 )
            // InternalMoniLog4DSL.g:3102:2: rule__Pattern__Group_0__1__Impl rule__Pattern__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3109:1: rule__Pattern__Group_0__1__Impl : ( 'always' ) ;
    public final void rule__Pattern__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3113:1: ( ( 'always' ) )
            // InternalMoniLog4DSL.g:3114:1: ( 'always' )
            {
            // InternalMoniLog4DSL.g:3114:1: ( 'always' )
            // InternalMoniLog4DSL.g:3115:2: 'always'
            {
             before(grammarAccess.getPatternAccess().getAlwaysKeyword_0_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getAlwaysKeyword_0_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3124:1: rule__Pattern__Group_0__2 : rule__Pattern__Group_0__2__Impl ;
    public final void rule__Pattern__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3128:1: ( rule__Pattern__Group_0__2__Impl )
            // InternalMoniLog4DSL.g:3129:2: rule__Pattern__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_0__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3135:1: rule__Pattern__Group_0__2__Impl : ( ( rule__Pattern__EventAssignment_0_2 ) ) ;
    public final void rule__Pattern__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3139:1: ( ( ( rule__Pattern__EventAssignment_0_2 ) ) )
            // InternalMoniLog4DSL.g:3140:1: ( ( rule__Pattern__EventAssignment_0_2 ) )
            {
            // InternalMoniLog4DSL.g:3140:1: ( ( rule__Pattern__EventAssignment_0_2 ) )
            // InternalMoniLog4DSL.g:3141:2: ( rule__Pattern__EventAssignment_0_2 )
            {
             before(grammarAccess.getPatternAccess().getEventAssignment_0_2()); 
            // InternalMoniLog4DSL.g:3142:2: ( rule__Pattern__EventAssignment_0_2 )
            // InternalMoniLog4DSL.g:3142:3: rule__Pattern__EventAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getEventAssignment_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__Group_1__0"
    // InternalMoniLog4DSL.g:3151:1: rule__Pattern__Group_1__0 : rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 ;
    public final void rule__Pattern__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3155:1: ( rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1 )
            // InternalMoniLog4DSL.g:3156:2: rule__Pattern__Group_1__0__Impl rule__Pattern__Group_1__1
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3163:1: rule__Pattern__Group_1__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3167:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3168:1: ( () )
            {
            // InternalMoniLog4DSL.g:3168:1: ( () )
            // InternalMoniLog4DSL.g:3169:2: ()
            {
             before(grammarAccess.getPatternAccess().getExistenceAction_1_0()); 
            // InternalMoniLog4DSL.g:3170:2: ()
            // InternalMoniLog4DSL.g:3170:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getExistenceAction_1_0()); 

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
    // InternalMoniLog4DSL.g:3178:1: rule__Pattern__Group_1__1 : rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 ;
    public final void rule__Pattern__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3182:1: ( rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2 )
            // InternalMoniLog4DSL.g:3183:2: rule__Pattern__Group_1__1__Impl rule__Pattern__Group_1__2
            {
            pushFollow(FOLLOW_28);
            rule__Pattern__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3190:1: rule__Pattern__Group_1__1__Impl : ( 'exists' ) ;
    public final void rule__Pattern__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3194:1: ( ( 'exists' ) )
            // InternalMoniLog4DSL.g:3195:1: ( 'exists' )
            {
            // InternalMoniLog4DSL.g:3195:1: ( 'exists' )
            // InternalMoniLog4DSL.g:3196:2: 'exists'
            {
             before(grammarAccess.getPatternAccess().getExistsKeyword_1_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getExistsKeyword_1_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3205:1: rule__Pattern__Group_1__2 : rule__Pattern__Group_1__2__Impl rule__Pattern__Group_1__3 ;
    public final void rule__Pattern__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3209:1: ( rule__Pattern__Group_1__2__Impl rule__Pattern__Group_1__3 )
            // InternalMoniLog4DSL.g:3210:2: rule__Pattern__Group_1__2__Impl rule__Pattern__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3217:1: rule__Pattern__Group_1__2__Impl : ( ( rule__Pattern__BoundAssignment_1_2 ) ) ;
    public final void rule__Pattern__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3221:1: ( ( ( rule__Pattern__BoundAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:3222:1: ( ( rule__Pattern__BoundAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:3222:1: ( ( rule__Pattern__BoundAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:3223:2: ( rule__Pattern__BoundAssignment_1_2 )
            {
             before(grammarAccess.getPatternAccess().getBoundAssignment_1_2()); 
            // InternalMoniLog4DSL.g:3224:2: ( rule__Pattern__BoundAssignment_1_2 )
            // InternalMoniLog4DSL.g:3224:3: rule__Pattern__BoundAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__BoundAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getBoundAssignment_1_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__Group_1__3"
    // InternalMoniLog4DSL.g:3232:1: rule__Pattern__Group_1__3 : rule__Pattern__Group_1__3__Impl ;
    public final void rule__Pattern__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3236:1: ( rule__Pattern__Group_1__3__Impl )
            // InternalMoniLog4DSL.g:3237:2: rule__Pattern__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__3"


    // $ANTLR start "rule__Pattern__Group_1__3__Impl"
    // InternalMoniLog4DSL.g:3243:1: rule__Pattern__Group_1__3__Impl : ( ( rule__Pattern__EventAssignment_1_3 ) ) ;
    public final void rule__Pattern__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3247:1: ( ( ( rule__Pattern__EventAssignment_1_3 ) ) )
            // InternalMoniLog4DSL.g:3248:1: ( ( rule__Pattern__EventAssignment_1_3 ) )
            {
            // InternalMoniLog4DSL.g:3248:1: ( ( rule__Pattern__EventAssignment_1_3 ) )
            // InternalMoniLog4DSL.g:3249:2: ( rule__Pattern__EventAssignment_1_3 )
            {
             before(grammarAccess.getPatternAccess().getEventAssignment_1_3()); 
            // InternalMoniLog4DSL.g:3250:2: ( rule__Pattern__EventAssignment_1_3 )
            // InternalMoniLog4DSL.g:3250:3: rule__Pattern__EventAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getEventAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_1__3__Impl"


    // $ANTLR start "rule__Pattern__Group_2__0"
    // InternalMoniLog4DSL.g:3259:1: rule__Pattern__Group_2__0 : rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 ;
    public final void rule__Pattern__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3263:1: ( rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1 )
            // InternalMoniLog4DSL.g:3264:2: rule__Pattern__Group_2__0__Impl rule__Pattern__Group_2__1
            {
            pushFollow(FOLLOW_29);
            rule__Pattern__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3271:1: rule__Pattern__Group_2__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3275:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3276:1: ( () )
            {
            // InternalMoniLog4DSL.g:3276:1: ( () )
            // InternalMoniLog4DSL.g:3277:2: ()
            {
             before(grammarAccess.getPatternAccess().getAbsenceAction_2_0()); 
            // InternalMoniLog4DSL.g:3278:2: ()
            // InternalMoniLog4DSL.g:3278:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getAbsenceAction_2_0()); 

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
    // InternalMoniLog4DSL.g:3286:1: rule__Pattern__Group_2__1 : rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 ;
    public final void rule__Pattern__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3290:1: ( rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2 )
            // InternalMoniLog4DSL.g:3291:2: rule__Pattern__Group_2__1__Impl rule__Pattern__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3298:1: rule__Pattern__Group_2__1__Impl : ( 'never' ) ;
    public final void rule__Pattern__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3302:1: ( ( 'never' ) )
            // InternalMoniLog4DSL.g:3303:1: ( 'never' )
            {
            // InternalMoniLog4DSL.g:3303:1: ( 'never' )
            // InternalMoniLog4DSL.g:3304:2: 'never'
            {
             before(grammarAccess.getPatternAccess().getNeverKeyword_2_1()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNeverKeyword_2_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3313:1: rule__Pattern__Group_2__2 : rule__Pattern__Group_2__2__Impl ;
    public final void rule__Pattern__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3317:1: ( rule__Pattern__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:3318:2: rule__Pattern__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_2__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3324:1: rule__Pattern__Group_2__2__Impl : ( ( rule__Pattern__EventAssignment_2_2 ) ) ;
    public final void rule__Pattern__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3328:1: ( ( ( rule__Pattern__EventAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:3329:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:3329:1: ( ( rule__Pattern__EventAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:3330:2: ( rule__Pattern__EventAssignment_2_2 )
            {
             before(grammarAccess.getPatternAccess().getEventAssignment_2_2()); 
            // InternalMoniLog4DSL.g:3331:2: ( rule__Pattern__EventAssignment_2_2 )
            // InternalMoniLog4DSL.g:3331:3: rule__Pattern__EventAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getEventAssignment_2_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3340:1: rule__Pattern__Group_3__0 : rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 ;
    public final void rule__Pattern__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3344:1: ( rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1 )
            // InternalMoniLog4DSL.g:3345:2: rule__Pattern__Group_3__0__Impl rule__Pattern__Group_3__1
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3352:1: rule__Pattern__Group_3__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3356:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3357:1: ( () )
            {
            // InternalMoniLog4DSL.g:3357:1: ( () )
            // InternalMoniLog4DSL.g:3358:2: ()
            {
             before(grammarAccess.getPatternAccess().getPrecedenceAction_3_0()); 
            // InternalMoniLog4DSL.g:3359:2: ()
            // InternalMoniLog4DSL.g:3359:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getPrecedenceAction_3_0()); 

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
    // InternalMoniLog4DSL.g:3367:1: rule__Pattern__Group_3__1 : rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 ;
    public final void rule__Pattern__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3371:1: ( rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2 )
            // InternalMoniLog4DSL.g:3372:2: rule__Pattern__Group_3__1__Impl rule__Pattern__Group_3__2
            {
            pushFollow(FOLLOW_30);
            rule__Pattern__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3379:1: rule__Pattern__Group_3__1__Impl : ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) ;
    public final void rule__Pattern__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3383:1: ( ( ( rule__Pattern__PredecessorAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:3384:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:3384:1: ( ( rule__Pattern__PredecessorAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:3385:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            {
             before(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1()); 
            // InternalMoniLog4DSL.g:3386:2: ( rule__Pattern__PredecessorAssignment_3_1 )
            // InternalMoniLog4DSL.g:3386:3: rule__Pattern__PredecessorAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__PredecessorAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getPredecessorAssignment_3_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3394:1: rule__Pattern__Group_3__2 : rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 ;
    public final void rule__Pattern__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3398:1: ( rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3 )
            // InternalMoniLog4DSL.g:3399:2: rule__Pattern__Group_3__2__Impl rule__Pattern__Group_3__3
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3406:1: rule__Pattern__Group_3__2__Impl : ( 'precedes' ) ;
    public final void rule__Pattern__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3410:1: ( ( 'precedes' ) )
            // InternalMoniLog4DSL.g:3411:1: ( 'precedes' )
            {
            // InternalMoniLog4DSL.g:3411:1: ( 'precedes' )
            // InternalMoniLog4DSL.g:3412:2: 'precedes'
            {
             before(grammarAccess.getPatternAccess().getPrecedesKeyword_3_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPrecedesKeyword_3_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3421:1: rule__Pattern__Group_3__3 : rule__Pattern__Group_3__3__Impl ;
    public final void rule__Pattern__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3425:1: ( rule__Pattern__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:3426:2: rule__Pattern__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_3__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3432:1: rule__Pattern__Group_3__3__Impl : ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) ;
    public final void rule__Pattern__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3436:1: ( ( ( rule__Pattern__SuccessorAssignment_3_3 ) ) )
            // InternalMoniLog4DSL.g:3437:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            {
            // InternalMoniLog4DSL.g:3437:1: ( ( rule__Pattern__SuccessorAssignment_3_3 ) )
            // InternalMoniLog4DSL.g:3438:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            {
             before(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3()); 
            // InternalMoniLog4DSL.g:3439:2: ( rule__Pattern__SuccessorAssignment_3_3 )
            // InternalMoniLog4DSL.g:3439:3: rule__Pattern__SuccessorAssignment_3_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__SuccessorAssignment_3_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getSuccessorAssignment_3_3()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3448:1: rule__Pattern__Group_4__0 : rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 ;
    public final void rule__Pattern__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3452:1: ( rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1 )
            // InternalMoniLog4DSL.g:3453:2: rule__Pattern__Group_4__0__Impl rule__Pattern__Group_4__1
            {
            pushFollow(FOLLOW_22);
            rule__Pattern__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3460:1: rule__Pattern__Group_4__0__Impl : ( () ) ;
    public final void rule__Pattern__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3464:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3465:1: ( () )
            {
            // InternalMoniLog4DSL.g:3465:1: ( () )
            // InternalMoniLog4DSL.g:3466:2: ()
            {
             before(grammarAccess.getPatternAccess().getResponseAction_4_0()); 
            // InternalMoniLog4DSL.g:3467:2: ()
            // InternalMoniLog4DSL.g:3467:3: 
            {
            }

             after(grammarAccess.getPatternAccess().getResponseAction_4_0()); 

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
    // InternalMoniLog4DSL.g:3475:1: rule__Pattern__Group_4__1 : rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 ;
    public final void rule__Pattern__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3479:1: ( rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2 )
            // InternalMoniLog4DSL.g:3480:2: rule__Pattern__Group_4__1__Impl rule__Pattern__Group_4__2
            {
            pushFollow(FOLLOW_31);
            rule__Pattern__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3487:1: rule__Pattern__Group_4__1__Impl : ( ( rule__Pattern__EventAssignment_4_1 ) ) ;
    public final void rule__Pattern__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3491:1: ( ( ( rule__Pattern__EventAssignment_4_1 ) ) )
            // InternalMoniLog4DSL.g:3492:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            {
            // InternalMoniLog4DSL.g:3492:1: ( ( rule__Pattern__EventAssignment_4_1 ) )
            // InternalMoniLog4DSL.g:3493:2: ( rule__Pattern__EventAssignment_4_1 )
            {
             before(grammarAccess.getPatternAccess().getEventAssignment_4_1()); 
            // InternalMoniLog4DSL.g:3494:2: ( rule__Pattern__EventAssignment_4_1 )
            // InternalMoniLog4DSL.g:3494:3: rule__Pattern__EventAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getEventAssignment_4_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3502:1: rule__Pattern__Group_4__2 : rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 ;
    public final void rule__Pattern__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3506:1: ( rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3 )
            // InternalMoniLog4DSL.g:3507:2: rule__Pattern__Group_4__2__Impl rule__Pattern__Group_4__3
            {
            pushFollow(FOLLOW_5);
            rule__Pattern__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3514:1: rule__Pattern__Group_4__2__Impl : ( 'respondsTo' ) ;
    public final void rule__Pattern__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3518:1: ( ( 'respondsTo' ) )
            // InternalMoniLog4DSL.g:3519:1: ( 'respondsTo' )
            {
            // InternalMoniLog4DSL.g:3519:1: ( 'respondsTo' )
            // InternalMoniLog4DSL.g:3520:2: 'respondsTo'
            {
             before(grammarAccess.getPatternAccess().getRespondsToKeyword_4_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRespondsToKeyword_4_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3529:1: rule__Pattern__Group_4__3 : rule__Pattern__Group_4__3__Impl ;
    public final void rule__Pattern__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3533:1: ( rule__Pattern__Group_4__3__Impl )
            // InternalMoniLog4DSL.g:3534:2: rule__Pattern__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_4__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3540:1: rule__Pattern__Group_4__3__Impl : ( ( rule__Pattern__TriggerAssignment_4_3 ) ) ;
    public final void rule__Pattern__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3544:1: ( ( ( rule__Pattern__TriggerAssignment_4_3 ) ) )
            // InternalMoniLog4DSL.g:3545:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            {
            // InternalMoniLog4DSL.g:3545:1: ( ( rule__Pattern__TriggerAssignment_4_3 ) )
            // InternalMoniLog4DSL.g:3546:2: ( rule__Pattern__TriggerAssignment_4_3 )
            {
             before(grammarAccess.getPatternAccess().getTriggerAssignment_4_3()); 
            // InternalMoniLog4DSL.g:3547:2: ( rule__Pattern__TriggerAssignment_4_3 )
            // InternalMoniLog4DSL.g:3547:3: rule__Pattern__TriggerAssignment_4_3
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__TriggerAssignment_4_3();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getTriggerAssignment_4_3()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3556:1: rule__LowerBound__Group__0 : rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 ;
    public final void rule__LowerBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3560:1: ( rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1 )
            // InternalMoniLog4DSL.g:3561:2: rule__LowerBound__Group__0__Impl rule__LowerBound__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__LowerBound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LowerBound__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3568:1: rule__LowerBound__Group__0__Impl : ( 'atleast' ) ;
    public final void rule__LowerBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3572:1: ( ( 'atleast' ) )
            // InternalMoniLog4DSL.g:3573:1: ( 'atleast' )
            {
            // InternalMoniLog4DSL.g:3573:1: ( 'atleast' )
            // InternalMoniLog4DSL.g:3574:2: 'atleast'
            {
             before(grammarAccess.getLowerBoundAccess().getAtleastKeyword_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLowerBoundAccess().getAtleastKeyword_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3583:1: rule__LowerBound__Group__1 : rule__LowerBound__Group__1__Impl ;
    public final void rule__LowerBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3587:1: ( rule__LowerBound__Group__1__Impl )
            // InternalMoniLog4DSL.g:3588:2: rule__LowerBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LowerBound__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3594:1: rule__LowerBound__Group__1__Impl : ( ( rule__LowerBound__NAssignment_1 ) ) ;
    public final void rule__LowerBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3598:1: ( ( ( rule__LowerBound__NAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:3599:1: ( ( rule__LowerBound__NAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:3599:1: ( ( rule__LowerBound__NAssignment_1 ) )
            // InternalMoniLog4DSL.g:3600:2: ( rule__LowerBound__NAssignment_1 )
            {
             before(grammarAccess.getLowerBoundAccess().getNAssignment_1()); 
            // InternalMoniLog4DSL.g:3601:2: ( rule__LowerBound__NAssignment_1 )
            // InternalMoniLog4DSL.g:3601:3: rule__LowerBound__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LowerBound__NAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLowerBoundAccess().getNAssignment_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3610:1: rule__UpperBound__Group__0 : rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 ;
    public final void rule__UpperBound__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3614:1: ( rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1 )
            // InternalMoniLog4DSL.g:3615:2: rule__UpperBound__Group__0__Impl rule__UpperBound__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__UpperBound__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UpperBound__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3622:1: rule__UpperBound__Group__0__Impl : ( 'atmost' ) ;
    public final void rule__UpperBound__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3626:1: ( ( 'atmost' ) )
            // InternalMoniLog4DSL.g:3627:1: ( 'atmost' )
            {
            // InternalMoniLog4DSL.g:3627:1: ( 'atmost' )
            // InternalMoniLog4DSL.g:3628:2: 'atmost'
            {
             before(grammarAccess.getUpperBoundAccess().getAtmostKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getUpperBoundAccess().getAtmostKeyword_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3637:1: rule__UpperBound__Group__1 : rule__UpperBound__Group__1__Impl ;
    public final void rule__UpperBound__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3641:1: ( rule__UpperBound__Group__1__Impl )
            // InternalMoniLog4DSL.g:3642:2: rule__UpperBound__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3648:1: rule__UpperBound__Group__1__Impl : ( ( rule__UpperBound__NAssignment_1 ) ) ;
    public final void rule__UpperBound__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3652:1: ( ( ( rule__UpperBound__NAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:3653:1: ( ( rule__UpperBound__NAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:3653:1: ( ( rule__UpperBound__NAssignment_1 ) )
            // InternalMoniLog4DSL.g:3654:2: ( rule__UpperBound__NAssignment_1 )
            {
             before(grammarAccess.getUpperBoundAccess().getNAssignment_1()); 
            // InternalMoniLog4DSL.g:3655:2: ( rule__UpperBound__NAssignment_1 )
            // InternalMoniLog4DSL.g:3655:3: rule__UpperBound__NAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__UpperBound__NAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUpperBoundAccess().getNAssignment_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3664:1: rule__Scope__Group_0__0 : rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 ;
    public final void rule__Scope__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3668:1: ( rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1 )
            // InternalMoniLog4DSL.g:3669:2: rule__Scope__Group_0__0__Impl rule__Scope__Group_0__1
            {
            pushFollow(FOLLOW_32);
            rule__Scope__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3676:1: rule__Scope__Group_0__0__Impl : ( () ) ;
    public final void rule__Scope__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3680:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3681:1: ( () )
            {
            // InternalMoniLog4DSL.g:3681:1: ( () )
            // InternalMoniLog4DSL.g:3682:2: ()
            {
             before(grammarAccess.getScopeAccess().getGloballyAction_0_0()); 
            // InternalMoniLog4DSL.g:3683:2: ()
            // InternalMoniLog4DSL.g:3683:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getGloballyAction_0_0()); 

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
    // InternalMoniLog4DSL.g:3691:1: rule__Scope__Group_0__1 : rule__Scope__Group_0__1__Impl ;
    public final void rule__Scope__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3695:1: ( rule__Scope__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:3696:2: rule__Scope__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_0__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3702:1: rule__Scope__Group_0__1__Impl : ( ( 'globally' )? ) ;
    public final void rule__Scope__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3706:1: ( ( ( 'globally' )? ) )
            // InternalMoniLog4DSL.g:3707:1: ( ( 'globally' )? )
            {
            // InternalMoniLog4DSL.g:3707:1: ( ( 'globally' )? )
            // InternalMoniLog4DSL.g:3708:2: ( 'globally' )?
            {
             before(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 
            // InternalMoniLog4DSL.g:3709:2: ( 'globally' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoniLog4DSL.g:3709:3: 'globally'
                    {
                    match(input,47,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getScopeAccess().getGloballyKeyword_0_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3718:1: rule__Scope__Group_1__0 : rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 ;
    public final void rule__Scope__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3722:1: ( rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1 )
            // InternalMoniLog4DSL.g:3723:2: rule__Scope__Group_1__0__Impl rule__Scope__Group_1__1
            {
            pushFollow(FOLLOW_33);
            rule__Scope__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3730:1: rule__Scope__Group_1__0__Impl : ( () ) ;
    public final void rule__Scope__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3734:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3735:1: ( () )
            {
            // InternalMoniLog4DSL.g:3735:1: ( () )
            // InternalMoniLog4DSL.g:3736:2: ()
            {
             before(grammarAccess.getScopeAccess().getAfterAction_1_0()); 
            // InternalMoniLog4DSL.g:3737:2: ()
            // InternalMoniLog4DSL.g:3737:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getAfterAction_1_0()); 

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
    // InternalMoniLog4DSL.g:3745:1: rule__Scope__Group_1__1 : rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 ;
    public final void rule__Scope__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3749:1: ( rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2 )
            // InternalMoniLog4DSL.g:3750:2: rule__Scope__Group_1__1__Impl rule__Scope__Group_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Scope__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3757:1: rule__Scope__Group_1__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3761:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:3762:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:3762:1: ( 'after' )
            // InternalMoniLog4DSL.g:3763:2: 'after'
            {
             before(grammarAccess.getScopeAccess().getAfterKeyword_1_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getAfterKeyword_1_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3772:1: rule__Scope__Group_1__2 : rule__Scope__Group_1__2__Impl ;
    public final void rule__Scope__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3776:1: ( rule__Scope__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:3777:2: rule__Scope__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3783:1: rule__Scope__Group_1__2__Impl : ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) ;
    public final void rule__Scope__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3787:1: ( ( ( rule__Scope__LowerBoundAssignment_1_2 ) ) )
            // InternalMoniLog4DSL.g:3788:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            {
            // InternalMoniLog4DSL.g:3788:1: ( ( rule__Scope__LowerBoundAssignment_1_2 ) )
            // InternalMoniLog4DSL.g:3789:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            {
             before(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2()); 
            // InternalMoniLog4DSL.g:3790:2: ( rule__Scope__LowerBoundAssignment_1_2 )
            // InternalMoniLog4DSL.g:3790:3: rule__Scope__LowerBoundAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__LowerBoundAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getLowerBoundAssignment_1_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3799:1: rule__Scope__Group_2__0 : rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 ;
    public final void rule__Scope__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3803:1: ( rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1 )
            // InternalMoniLog4DSL.g:3804:2: rule__Scope__Group_2__0__Impl rule__Scope__Group_2__1
            {
            pushFollow(FOLLOW_34);
            rule__Scope__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3811:1: rule__Scope__Group_2__0__Impl : ( () ) ;
    public final void rule__Scope__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3815:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3816:1: ( () )
            {
            // InternalMoniLog4DSL.g:3816:1: ( () )
            // InternalMoniLog4DSL.g:3817:2: ()
            {
             before(grammarAccess.getScopeAccess().getBeforeAction_2_0()); 
            // InternalMoniLog4DSL.g:3818:2: ()
            // InternalMoniLog4DSL.g:3818:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getBeforeAction_2_0()); 

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
    // InternalMoniLog4DSL.g:3826:1: rule__Scope__Group_2__1 : rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 ;
    public final void rule__Scope__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3830:1: ( rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2 )
            // InternalMoniLog4DSL.g:3831:2: rule__Scope__Group_2__1__Impl rule__Scope__Group_2__2
            {
            pushFollow(FOLLOW_5);
            rule__Scope__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3838:1: rule__Scope__Group_2__1__Impl : ( 'before' ) ;
    public final void rule__Scope__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3842:1: ( ( 'before' ) )
            // InternalMoniLog4DSL.g:3843:1: ( 'before' )
            {
            // InternalMoniLog4DSL.g:3843:1: ( 'before' )
            // InternalMoniLog4DSL.g:3844:2: 'before'
            {
             before(grammarAccess.getScopeAccess().getBeforeKeyword_2_1()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getBeforeKeyword_2_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3853:1: rule__Scope__Group_2__2 : rule__Scope__Group_2__2__Impl ;
    public final void rule__Scope__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3857:1: ( rule__Scope__Group_2__2__Impl )
            // InternalMoniLog4DSL.g:3858:2: rule__Scope__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_2__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3864:1: rule__Scope__Group_2__2__Impl : ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) ;
    public final void rule__Scope__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3868:1: ( ( ( rule__Scope__UpperBoundAssignment_2_2 ) ) )
            // InternalMoniLog4DSL.g:3869:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            {
            // InternalMoniLog4DSL.g:3869:1: ( ( rule__Scope__UpperBoundAssignment_2_2 ) )
            // InternalMoniLog4DSL.g:3870:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            {
             before(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2()); 
            // InternalMoniLog4DSL.g:3871:2: ( rule__Scope__UpperBoundAssignment_2_2 )
            // InternalMoniLog4DSL.g:3871:3: rule__Scope__UpperBoundAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__UpperBoundAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getUpperBoundAssignment_2_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3880:1: rule__Scope__Group_3__0 : rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 ;
    public final void rule__Scope__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3884:1: ( rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1 )
            // InternalMoniLog4DSL.g:3885:2: rule__Scope__Group_3__0__Impl rule__Scope__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__Scope__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3892:1: rule__Scope__Group_3__0__Impl : ( () ) ;
    public final void rule__Scope__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3896:1: ( ( () ) )
            // InternalMoniLog4DSL.g:3897:1: ( () )
            {
            // InternalMoniLog4DSL.g:3897:1: ( () )
            // InternalMoniLog4DSL.g:3898:2: ()
            {
             before(grammarAccess.getScopeAccess().getBetweenAction_3_0()); 
            // InternalMoniLog4DSL.g:3899:2: ()
            // InternalMoniLog4DSL.g:3899:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getBetweenAction_3_0()); 

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
    // InternalMoniLog4DSL.g:3907:1: rule__Scope__Group_3__1 : rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 ;
    public final void rule__Scope__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3911:1: ( rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2 )
            // InternalMoniLog4DSL.g:3912:2: rule__Scope__Group_3__1__Impl rule__Scope__Group_3__2
            {
            pushFollow(FOLLOW_5);
            rule__Scope__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3919:1: rule__Scope__Group_3__1__Impl : ( 'between' ) ;
    public final void rule__Scope__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3923:1: ( ( 'between' ) )
            // InternalMoniLog4DSL.g:3924:1: ( 'between' )
            {
            // InternalMoniLog4DSL.g:3924:1: ( 'between' )
            // InternalMoniLog4DSL.g:3925:2: 'between'
            {
             before(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getBetweenKeyword_3_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3934:1: rule__Scope__Group_3__2 : rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 ;
    public final void rule__Scope__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3938:1: ( rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3 )
            // InternalMoniLog4DSL.g:3939:2: rule__Scope__Group_3__2__Impl rule__Scope__Group_3__3
            {
            pushFollow(FOLLOW_36);
            rule__Scope__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3946:1: rule__Scope__Group_3__2__Impl : ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) ;
    public final void rule__Scope__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3950:1: ( ( ( rule__Scope__LowerBoundAssignment_3_2 ) ) )
            // InternalMoniLog4DSL.g:3951:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            {
            // InternalMoniLog4DSL.g:3951:1: ( ( rule__Scope__LowerBoundAssignment_3_2 ) )
            // InternalMoniLog4DSL.g:3952:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            {
             before(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2()); 
            // InternalMoniLog4DSL.g:3953:2: ( rule__Scope__LowerBoundAssignment_3_2 )
            // InternalMoniLog4DSL.g:3953:3: rule__Scope__LowerBoundAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__LowerBoundAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getLowerBoundAssignment_3_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3961:1: rule__Scope__Group_3__3 : rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 ;
    public final void rule__Scope__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3965:1: ( rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4 )
            // InternalMoniLog4DSL.g:3966:2: rule__Scope__Group_3__3__Impl rule__Scope__Group_3__4
            {
            pushFollow(FOLLOW_5);
            rule__Scope__Group_3__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__4();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3973:1: rule__Scope__Group_3__3__Impl : ( 'and' ) ;
    public final void rule__Scope__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3977:1: ( ( 'and' ) )
            // InternalMoniLog4DSL.g:3978:1: ( 'and' )
            {
            // InternalMoniLog4DSL.g:3978:1: ( 'and' )
            // InternalMoniLog4DSL.g:3979:2: 'and'
            {
             before(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getAndKeyword_3_3()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:3988:1: rule__Scope__Group_3__4 : rule__Scope__Group_3__4__Impl ;
    public final void rule__Scope__Group_3__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:3992:1: ( rule__Scope__Group_3__4__Impl )
            // InternalMoniLog4DSL.g:3993:2: rule__Scope__Group_3__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_3__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:3999:1: rule__Scope__Group_3__4__Impl : ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) ;
    public final void rule__Scope__Group_3__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4003:1: ( ( ( rule__Scope__UpperBoundAssignment_3_4 ) ) )
            // InternalMoniLog4DSL.g:4004:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            {
            // InternalMoniLog4DSL.g:4004:1: ( ( rule__Scope__UpperBoundAssignment_3_4 ) )
            // InternalMoniLog4DSL.g:4005:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            {
             before(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4()); 
            // InternalMoniLog4DSL.g:4006:2: ( rule__Scope__UpperBoundAssignment_3_4 )
            // InternalMoniLog4DSL.g:4006:3: rule__Scope__UpperBoundAssignment_3_4
            {
            pushFollow(FOLLOW_2);
            rule__Scope__UpperBoundAssignment_3_4();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getUpperBoundAssignment_3_4()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:4015:1: rule__Scope__Group_4__0 : rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 ;
    public final void rule__Scope__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4019:1: ( rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1 )
            // InternalMoniLog4DSL.g:4020:2: rule__Scope__Group_4__0__Impl rule__Scope__Group_4__1
            {
            pushFollow(FOLLOW_25);
            rule__Scope__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4027:1: rule__Scope__Group_4__0__Impl : ( () ) ;
    public final void rule__Scope__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4031:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4032:1: ( () )
            {
            // InternalMoniLog4DSL.g:4032:1: ( () )
            // InternalMoniLog4DSL.g:4033:2: ()
            {
             before(grammarAccess.getScopeAccess().getAfterUntilAction_4_0()); 
            // InternalMoniLog4DSL.g:4034:2: ()
            // InternalMoniLog4DSL.g:4034:3: 
            {
            }

             after(grammarAccess.getScopeAccess().getAfterUntilAction_4_0()); 

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
    // InternalMoniLog4DSL.g:4042:1: rule__Scope__Group_4__1 : rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 ;
    public final void rule__Scope__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4046:1: ( rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2 )
            // InternalMoniLog4DSL.g:4047:2: rule__Scope__Group_4__1__Impl rule__Scope__Group_4__2
            {
            pushFollow(FOLLOW_5);
            rule__Scope__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4054:1: rule__Scope__Group_4__1__Impl : ( 'after' ) ;
    public final void rule__Scope__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4058:1: ( ( 'after' ) )
            // InternalMoniLog4DSL.g:4059:1: ( 'after' )
            {
            // InternalMoniLog4DSL.g:4059:1: ( 'after' )
            // InternalMoniLog4DSL.g:4060:2: 'after'
            {
             before(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getAfterKeyword_4_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:4069:1: rule__Scope__Group_4__2 : rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 ;
    public final void rule__Scope__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4073:1: ( rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3 )
            // InternalMoniLog4DSL.g:4074:2: rule__Scope__Group_4__2__Impl rule__Scope__Group_4__3
            {
            pushFollow(FOLLOW_37);
            rule__Scope__Group_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4081:1: rule__Scope__Group_4__2__Impl : ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) ;
    public final void rule__Scope__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4085:1: ( ( ( rule__Scope__LowerBoundAssignment_4_2 ) ) )
            // InternalMoniLog4DSL.g:4086:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            {
            // InternalMoniLog4DSL.g:4086:1: ( ( rule__Scope__LowerBoundAssignment_4_2 ) )
            // InternalMoniLog4DSL.g:4087:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            {
             before(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2()); 
            // InternalMoniLog4DSL.g:4088:2: ( rule__Scope__LowerBoundAssignment_4_2 )
            // InternalMoniLog4DSL.g:4088:3: rule__Scope__LowerBoundAssignment_4_2
            {
            pushFollow(FOLLOW_2);
            rule__Scope__LowerBoundAssignment_4_2();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getLowerBoundAssignment_4_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:4096:1: rule__Scope__Group_4__3 : rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 ;
    public final void rule__Scope__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4100:1: ( rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4 )
            // InternalMoniLog4DSL.g:4101:2: rule__Scope__Group_4__3__Impl rule__Scope__Group_4__4
            {
            pushFollow(FOLLOW_5);
            rule__Scope__Group_4__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__4();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4108:1: rule__Scope__Group_4__3__Impl : ( 'until' ) ;
    public final void rule__Scope__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4112:1: ( ( 'until' ) )
            // InternalMoniLog4DSL.g:4113:1: ( 'until' )
            {
            // InternalMoniLog4DSL.g:4113:1: ( 'until' )
            // InternalMoniLog4DSL.g:4114:2: 'until'
            {
             before(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getScopeAccess().getUntilKeyword_4_3()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:4123:1: rule__Scope__Group_4__4 : rule__Scope__Group_4__4__Impl ;
    public final void rule__Scope__Group_4__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4127:1: ( rule__Scope__Group_4__4__Impl )
            // InternalMoniLog4DSL.g:4128:2: rule__Scope__Group_4__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Scope__Group_4__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4134:1: rule__Scope__Group_4__4__Impl : ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) ;
    public final void rule__Scope__Group_4__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4138:1: ( ( ( rule__Scope__UpperBoundAssignment_4_4 ) ) )
            // InternalMoniLog4DSL.g:4139:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            {
            // InternalMoniLog4DSL.g:4139:1: ( ( rule__Scope__UpperBoundAssignment_4_4 ) )
            // InternalMoniLog4DSL.g:4140:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            {
             before(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4()); 
            // InternalMoniLog4DSL.g:4141:2: ( rule__Scope__UpperBoundAssignment_4_4 )
            // InternalMoniLog4DSL.g:4141:3: rule__Scope__UpperBoundAssignment_4_4
            {
            pushFollow(FOLLOW_2);
            rule__Scope__UpperBoundAssignment_4_4();

            state._fsp--;


            }

             after(grammarAccess.getScopeAccess().getUpperBoundAssignment_4_4()); 

            }


            }

        }
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


    // $ANTLR start "rule__Action__Group_0__0"
    // InternalMoniLog4DSL.g:4150:1: rule__Action__Group_0__0 : rule__Action__Group_0__0__Impl rule__Action__Group_0__1 ;
    public final void rule__Action__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4154:1: ( rule__Action__Group_0__0__Impl rule__Action__Group_0__1 )
            // InternalMoniLog4DSL.g:4155:2: rule__Action__Group_0__0__Impl rule__Action__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__Action__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__0"


    // $ANTLR start "rule__Action__Group_0__0__Impl"
    // InternalMoniLog4DSL.g:4162:1: rule__Action__Group_0__0__Impl : ( () ) ;
    public final void rule__Action__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4166:1: ( ( () ) )
            // InternalMoniLog4DSL.g:4167:1: ( () )
            {
            // InternalMoniLog4DSL.g:4167:1: ( () )
            // InternalMoniLog4DSL.g:4168:2: ()
            {
             before(grammarAccess.getActionAccess().getNotifyAction_0_0()); 
            // InternalMoniLog4DSL.g:4169:2: ()
            // InternalMoniLog4DSL.g:4169:3: 
            {
            }

             after(grammarAccess.getActionAccess().getNotifyAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__0__Impl"


    // $ANTLR start "rule__Action__Group_0__1"
    // InternalMoniLog4DSL.g:4177:1: rule__Action__Group_0__1 : rule__Action__Group_0__1__Impl ;
    public final void rule__Action__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4181:1: ( rule__Action__Group_0__1__Impl )
            // InternalMoniLog4DSL.g:4182:2: rule__Action__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__1"


    // $ANTLR start "rule__Action__Group_0__1__Impl"
    // InternalMoniLog4DSL.g:4188:1: rule__Action__Group_0__1__Impl : ( 'notify' ) ;
    public final void rule__Action__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4192:1: ( ( 'notify' ) )
            // InternalMoniLog4DSL.g:4193:1: ( 'notify' )
            {
            // InternalMoniLog4DSL.g:4193:1: ( 'notify' )
            // InternalMoniLog4DSL.g:4194:2: 'notify'
            {
             before(grammarAccess.getActionAccess().getNotifyKeyword_0_1()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getActionAccess().getNotifyKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Group_0__1__Impl"


    // $ANTLR start "rule__Append__Group__0"
    // InternalMoniLog4DSL.g:4204:1: rule__Append__Group__0 : rule__Append__Group__0__Impl rule__Append__Group__1 ;
    public final void rule__Append__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4208:1: ( rule__Append__Group__0__Impl rule__Append__Group__1 )
            // InternalMoniLog4DSL.g:4209:2: rule__Append__Group__0__Impl rule__Append__Group__1
            {
            pushFollow(FOLLOW_39);
            rule__Append__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Append__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Append__Group__0"


    // $ANTLR start "rule__Append__Group__0__Impl"
    // InternalMoniLog4DSL.g:4216:1: rule__Append__Group__0__Impl : ( 'append' ) ;
    public final void rule__Append__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4220:1: ( ( 'append' ) )
            // InternalMoniLog4DSL.g:4221:1: ( 'append' )
            {
            // InternalMoniLog4DSL.g:4221:1: ( 'append' )
            // InternalMoniLog4DSL.g:4222:2: 'append'
            {
             before(grammarAccess.getAppendAccess().getAppendKeyword_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getAppendAccess().getAppendKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Append__Group__0__Impl"


    // $ANTLR start "rule__Append__Group__1"
    // InternalMoniLog4DSL.g:4231:1: rule__Append__Group__1 : rule__Append__Group__1__Impl ;
    public final void rule__Append__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4235:1: ( rule__Append__Group__1__Impl )
            // InternalMoniLog4DSL.g:4236:2: rule__Append__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Append__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Append__Group__1"


    // $ANTLR start "rule__Append__Group__1__Impl"
    // InternalMoniLog4DSL.g:4242:1: rule__Append__Group__1__Impl : ( ( rule__Append__AppenderAssignment_1 ) ) ;
    public final void rule__Append__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4246:1: ( ( ( rule__Append__AppenderAssignment_1 ) ) )
            // InternalMoniLog4DSL.g:4247:1: ( ( rule__Append__AppenderAssignment_1 ) )
            {
            // InternalMoniLog4DSL.g:4247:1: ( ( rule__Append__AppenderAssignment_1 ) )
            // InternalMoniLog4DSL.g:4248:2: ( rule__Append__AppenderAssignment_1 )
            {
             before(grammarAccess.getAppendAccess().getAppenderAssignment_1()); 
            // InternalMoniLog4DSL.g:4249:2: ( rule__Append__AppenderAssignment_1 )
            // InternalMoniLog4DSL.g:4249:3: rule__Append__AppenderAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Append__AppenderAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAppendAccess().getAppenderAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Append__Group__1__Impl"


    // $ANTLR start "rule__StreamAppender__Group__0"
    // InternalMoniLog4DSL.g:4258:1: rule__StreamAppender__Group__0 : rule__StreamAppender__Group__0__Impl rule__StreamAppender__Group__1 ;
    public final void rule__StreamAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4262:1: ( rule__StreamAppender__Group__0__Impl rule__StreamAppender__Group__1 )
            // InternalMoniLog4DSL.g:4263:2: rule__StreamAppender__Group__0__Impl rule__StreamAppender__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__StreamAppender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__0"


    // $ANTLR start "rule__StreamAppender__Group__0__Impl"
    // InternalMoniLog4DSL.g:4270:1: rule__StreamAppender__Group__0__Impl : ( 'stream' ) ;
    public final void rule__StreamAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4274:1: ( ( 'stream' ) )
            // InternalMoniLog4DSL.g:4275:1: ( 'stream' )
            {
            // InternalMoniLog4DSL.g:4275:1: ( 'stream' )
            // InternalMoniLog4DSL.g:4276:2: 'stream'
            {
             before(grammarAccess.getStreamAppenderAccess().getStreamKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getStreamAppenderAccess().getStreamKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__0__Impl"


    // $ANTLR start "rule__StreamAppender__Group__1"
    // InternalMoniLog4DSL.g:4285:1: rule__StreamAppender__Group__1 : rule__StreamAppender__Group__1__Impl rule__StreamAppender__Group__2 ;
    public final void rule__StreamAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4289:1: ( rule__StreamAppender__Group__1__Impl rule__StreamAppender__Group__2 )
            // InternalMoniLog4DSL.g:4290:2: rule__StreamAppender__Group__1__Impl rule__StreamAppender__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StreamAppender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__1"


    // $ANTLR start "rule__StreamAppender__Group__1__Impl"
    // InternalMoniLog4DSL.g:4297:1: rule__StreamAppender__Group__1__Impl : ( '(' ) ;
    public final void rule__StreamAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4301:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4302:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4302:1: ( '(' )
            // InternalMoniLog4DSL.g:4303:2: '('
            {
             before(grammarAccess.getStreamAppenderAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getStreamAppenderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__1__Impl"


    // $ANTLR start "rule__StreamAppender__Group__2"
    // InternalMoniLog4DSL.g:4312:1: rule__StreamAppender__Group__2 : rule__StreamAppender__Group__2__Impl rule__StreamAppender__Group__3 ;
    public final void rule__StreamAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4316:1: ( rule__StreamAppender__Group__2__Impl rule__StreamAppender__Group__3 )
            // InternalMoniLog4DSL.g:4317:2: rule__StreamAppender__Group__2__Impl rule__StreamAppender__Group__3
            {
            pushFollow(FOLLOW_40);
            rule__StreamAppender__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__2"


    // $ANTLR start "rule__StreamAppender__Group__2__Impl"
    // InternalMoniLog4DSL.g:4324:1: rule__StreamAppender__Group__2__Impl : ( ( rule__StreamAppender__EventAssignment_2 ) ) ;
    public final void rule__StreamAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4328:1: ( ( ( rule__StreamAppender__EventAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:4329:1: ( ( rule__StreamAppender__EventAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:4329:1: ( ( rule__StreamAppender__EventAssignment_2 ) )
            // InternalMoniLog4DSL.g:4330:2: ( rule__StreamAppender__EventAssignment_2 )
            {
             before(grammarAccess.getStreamAppenderAccess().getEventAssignment_2()); 
            // InternalMoniLog4DSL.g:4331:2: ( rule__StreamAppender__EventAssignment_2 )
            // InternalMoniLog4DSL.g:4331:3: rule__StreamAppender__EventAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__EventAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStreamAppenderAccess().getEventAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__2__Impl"


    // $ANTLR start "rule__StreamAppender__Group__3"
    // InternalMoniLog4DSL.g:4339:1: rule__StreamAppender__Group__3 : rule__StreamAppender__Group__3__Impl rule__StreamAppender__Group__4 ;
    public final void rule__StreamAppender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4343:1: ( rule__StreamAppender__Group__3__Impl rule__StreamAppender__Group__4 )
            // InternalMoniLog4DSL.g:4344:2: rule__StreamAppender__Group__3__Impl rule__StreamAppender__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__StreamAppender__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__3"


    // $ANTLR start "rule__StreamAppender__Group__3__Impl"
    // InternalMoniLog4DSL.g:4351:1: rule__StreamAppender__Group__3__Impl : ( ( rule__StreamAppender__Group_3__0 )? ) ;
    public final void rule__StreamAppender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4355:1: ( ( ( rule__StreamAppender__Group_3__0 )? ) )
            // InternalMoniLog4DSL.g:4356:1: ( ( rule__StreamAppender__Group_3__0 )? )
            {
            // InternalMoniLog4DSL.g:4356:1: ( ( rule__StreamAppender__Group_3__0 )? )
            // InternalMoniLog4DSL.g:4357:2: ( rule__StreamAppender__Group_3__0 )?
            {
             before(grammarAccess.getStreamAppenderAccess().getGroup_3()); 
            // InternalMoniLog4DSL.g:4358:2: ( rule__StreamAppender__Group_3__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoniLog4DSL.g:4358:3: rule__StreamAppender__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StreamAppender__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStreamAppenderAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__3__Impl"


    // $ANTLR start "rule__StreamAppender__Group__4"
    // InternalMoniLog4DSL.g:4366:1: rule__StreamAppender__Group__4 : rule__StreamAppender__Group__4__Impl ;
    public final void rule__StreamAppender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4370:1: ( rule__StreamAppender__Group__4__Impl )
            // InternalMoniLog4DSL.g:4371:2: rule__StreamAppender__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__4"


    // $ANTLR start "rule__StreamAppender__Group__4__Impl"
    // InternalMoniLog4DSL.g:4377:1: rule__StreamAppender__Group__4__Impl : ( ')' ) ;
    public final void rule__StreamAppender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4381:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4382:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4382:1: ( ')' )
            // InternalMoniLog4DSL.g:4383:2: ')'
            {
             before(grammarAccess.getStreamAppenderAccess().getRightParenthesisKeyword_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getStreamAppenderAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group__4__Impl"


    // $ANTLR start "rule__StreamAppender__Group_3__0"
    // InternalMoniLog4DSL.g:4393:1: rule__StreamAppender__Group_3__0 : rule__StreamAppender__Group_3__0__Impl rule__StreamAppender__Group_3__1 ;
    public final void rule__StreamAppender__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4397:1: ( rule__StreamAppender__Group_3__0__Impl rule__StreamAppender__Group_3__1 )
            // InternalMoniLog4DSL.g:4398:2: rule__StreamAppender__Group_3__0__Impl rule__StreamAppender__Group_3__1
            {
            pushFollow(FOLLOW_16);
            rule__StreamAppender__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__0"


    // $ANTLR start "rule__StreamAppender__Group_3__0__Impl"
    // InternalMoniLog4DSL.g:4405:1: rule__StreamAppender__Group_3__0__Impl : ( '[' ) ;
    public final void rule__StreamAppender__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4409:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:4410:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:4410:1: ( '[' )
            // InternalMoniLog4DSL.g:4411:2: '['
            {
             before(grammarAccess.getStreamAppenderAccess().getLeftSquareBracketKeyword_3_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStreamAppenderAccess().getLeftSquareBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__0__Impl"


    // $ANTLR start "rule__StreamAppender__Group_3__1"
    // InternalMoniLog4DSL.g:4420:1: rule__StreamAppender__Group_3__1 : rule__StreamAppender__Group_3__1__Impl rule__StreamAppender__Group_3__2 ;
    public final void rule__StreamAppender__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4424:1: ( rule__StreamAppender__Group_3__1__Impl rule__StreamAppender__Group_3__2 )
            // InternalMoniLog4DSL.g:4425:2: rule__StreamAppender__Group_3__1__Impl rule__StreamAppender__Group_3__2
            {
            pushFollow(FOLLOW_41);
            rule__StreamAppender__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__1"


    // $ANTLR start "rule__StreamAppender__Group_3__1__Impl"
    // InternalMoniLog4DSL.g:4432:1: rule__StreamAppender__Group_3__1__Impl : ( ( rule__StreamAppender__ValuesAssignment_3_1 ) ) ;
    public final void rule__StreamAppender__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4436:1: ( ( ( rule__StreamAppender__ValuesAssignment_3_1 ) ) )
            // InternalMoniLog4DSL.g:4437:1: ( ( rule__StreamAppender__ValuesAssignment_3_1 ) )
            {
            // InternalMoniLog4DSL.g:4437:1: ( ( rule__StreamAppender__ValuesAssignment_3_1 ) )
            // InternalMoniLog4DSL.g:4438:2: ( rule__StreamAppender__ValuesAssignment_3_1 )
            {
             before(grammarAccess.getStreamAppenderAccess().getValuesAssignment_3_1()); 
            // InternalMoniLog4DSL.g:4439:2: ( rule__StreamAppender__ValuesAssignment_3_1 )
            // InternalMoniLog4DSL.g:4439:3: rule__StreamAppender__ValuesAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__ValuesAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAppenderAccess().getValuesAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__1__Impl"


    // $ANTLR start "rule__StreamAppender__Group_3__2"
    // InternalMoniLog4DSL.g:4447:1: rule__StreamAppender__Group_3__2 : rule__StreamAppender__Group_3__2__Impl rule__StreamAppender__Group_3__3 ;
    public final void rule__StreamAppender__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4451:1: ( rule__StreamAppender__Group_3__2__Impl rule__StreamAppender__Group_3__3 )
            // InternalMoniLog4DSL.g:4452:2: rule__StreamAppender__Group_3__2__Impl rule__StreamAppender__Group_3__3
            {
            pushFollow(FOLLOW_41);
            rule__StreamAppender__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group_3__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__2"


    // $ANTLR start "rule__StreamAppender__Group_3__2__Impl"
    // InternalMoniLog4DSL.g:4459:1: rule__StreamAppender__Group_3__2__Impl : ( ( rule__StreamAppender__Group_3_2__0 )* ) ;
    public final void rule__StreamAppender__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4463:1: ( ( ( rule__StreamAppender__Group_3_2__0 )* ) )
            // InternalMoniLog4DSL.g:4464:1: ( ( rule__StreamAppender__Group_3_2__0 )* )
            {
            // InternalMoniLog4DSL.g:4464:1: ( ( rule__StreamAppender__Group_3_2__0 )* )
            // InternalMoniLog4DSL.g:4465:2: ( rule__StreamAppender__Group_3_2__0 )*
            {
             before(grammarAccess.getStreamAppenderAccess().getGroup_3_2()); 
            // InternalMoniLog4DSL.g:4466:2: ( rule__StreamAppender__Group_3_2__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==30) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:4466:3: rule__StreamAppender__Group_3_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StreamAppender__Group_3_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getStreamAppenderAccess().getGroup_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__2__Impl"


    // $ANTLR start "rule__StreamAppender__Group_3__3"
    // InternalMoniLog4DSL.g:4474:1: rule__StreamAppender__Group_3__3 : rule__StreamAppender__Group_3__3__Impl ;
    public final void rule__StreamAppender__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4478:1: ( rule__StreamAppender__Group_3__3__Impl )
            // InternalMoniLog4DSL.g:4479:2: rule__StreamAppender__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group_3__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__3"


    // $ANTLR start "rule__StreamAppender__Group_3__3__Impl"
    // InternalMoniLog4DSL.g:4485:1: rule__StreamAppender__Group_3__3__Impl : ( ']' ) ;
    public final void rule__StreamAppender__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4489:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:4490:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:4490:1: ( ']' )
            // InternalMoniLog4DSL.g:4491:2: ']'
            {
             before(grammarAccess.getStreamAppenderAccess().getRightSquareBracketKeyword_3_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStreamAppenderAccess().getRightSquareBracketKeyword_3_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3__3__Impl"


    // $ANTLR start "rule__StreamAppender__Group_3_2__0"
    // InternalMoniLog4DSL.g:4501:1: rule__StreamAppender__Group_3_2__0 : rule__StreamAppender__Group_3_2__0__Impl rule__StreamAppender__Group_3_2__1 ;
    public final void rule__StreamAppender__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4505:1: ( rule__StreamAppender__Group_3_2__0__Impl rule__StreamAppender__Group_3_2__1 )
            // InternalMoniLog4DSL.g:4506:2: rule__StreamAppender__Group_3_2__0__Impl rule__StreamAppender__Group_3_2__1
            {
            pushFollow(FOLLOW_16);
            rule__StreamAppender__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3_2__0"


    // $ANTLR start "rule__StreamAppender__Group_3_2__0__Impl"
    // InternalMoniLog4DSL.g:4513:1: rule__StreamAppender__Group_3_2__0__Impl : ( ',' ) ;
    public final void rule__StreamAppender__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4517:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:4518:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:4518:1: ( ',' )
            // InternalMoniLog4DSL.g:4519:2: ','
            {
             before(grammarAccess.getStreamAppenderAccess().getCommaKeyword_3_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStreamAppenderAccess().getCommaKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3_2__0__Impl"


    // $ANTLR start "rule__StreamAppender__Group_3_2__1"
    // InternalMoniLog4DSL.g:4528:1: rule__StreamAppender__Group_3_2__1 : rule__StreamAppender__Group_3_2__1__Impl ;
    public final void rule__StreamAppender__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4532:1: ( rule__StreamAppender__Group_3_2__1__Impl )
            // InternalMoniLog4DSL.g:4533:2: rule__StreamAppender__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3_2__1"


    // $ANTLR start "rule__StreamAppender__Group_3_2__1__Impl"
    // InternalMoniLog4DSL.g:4539:1: rule__StreamAppender__Group_3_2__1__Impl : ( ( rule__StreamAppender__ValuesAssignment_3_2_1 ) ) ;
    public final void rule__StreamAppender__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4543:1: ( ( ( rule__StreamAppender__ValuesAssignment_3_2_1 ) ) )
            // InternalMoniLog4DSL.g:4544:1: ( ( rule__StreamAppender__ValuesAssignment_3_2_1 ) )
            {
            // InternalMoniLog4DSL.g:4544:1: ( ( rule__StreamAppender__ValuesAssignment_3_2_1 ) )
            // InternalMoniLog4DSL.g:4545:2: ( rule__StreamAppender__ValuesAssignment_3_2_1 )
            {
             before(grammarAccess.getStreamAppenderAccess().getValuesAssignment_3_2_1()); 
            // InternalMoniLog4DSL.g:4546:2: ( rule__StreamAppender__ValuesAssignment_3_2_1 )
            // InternalMoniLog4DSL.g:4546:3: rule__StreamAppender__ValuesAssignment_3_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__ValuesAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamAppenderAccess().getValuesAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__Group_3_2__1__Impl"


    // $ANTLR start "rule__FileAppender__Group__0"
    // InternalMoniLog4DSL.g:4555:1: rule__FileAppender__Group__0 : rule__FileAppender__Group__0__Impl rule__FileAppender__Group__1 ;
    public final void rule__FileAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4559:1: ( rule__FileAppender__Group__0__Impl rule__FileAppender__Group__1 )
            // InternalMoniLog4DSL.g:4560:2: rule__FileAppender__Group__0__Impl rule__FileAppender__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__FileAppender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__0"


    // $ANTLR start "rule__FileAppender__Group__0__Impl"
    // InternalMoniLog4DSL.g:4567:1: rule__FileAppender__Group__0__Impl : ( 'file' ) ;
    public final void rule__FileAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4571:1: ( ( 'file' ) )
            // InternalMoniLog4DSL.g:4572:1: ( 'file' )
            {
            // InternalMoniLog4DSL.g:4572:1: ( 'file' )
            // InternalMoniLog4DSL.g:4573:2: 'file'
            {
             before(grammarAccess.getFileAppenderAccess().getFileKeyword_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getFileAppenderAccess().getFileKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__0__Impl"


    // $ANTLR start "rule__FileAppender__Group__1"
    // InternalMoniLog4DSL.g:4582:1: rule__FileAppender__Group__1 : rule__FileAppender__Group__1__Impl rule__FileAppender__Group__2 ;
    public final void rule__FileAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4586:1: ( rule__FileAppender__Group__1__Impl rule__FileAppender__Group__2 )
            // InternalMoniLog4DSL.g:4587:2: rule__FileAppender__Group__1__Impl rule__FileAppender__Group__2
            {
            pushFollow(FOLLOW_42);
            rule__FileAppender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__1"


    // $ANTLR start "rule__FileAppender__Group__1__Impl"
    // InternalMoniLog4DSL.g:4594:1: rule__FileAppender__Group__1__Impl : ( '(' ) ;
    public final void rule__FileAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4598:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4599:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4599:1: ( '(' )
            // InternalMoniLog4DSL.g:4600:2: '('
            {
             before(grammarAccess.getFileAppenderAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFileAppenderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__1__Impl"


    // $ANTLR start "rule__FileAppender__Group__2"
    // InternalMoniLog4DSL.g:4609:1: rule__FileAppender__Group__2 : rule__FileAppender__Group__2__Impl rule__FileAppender__Group__3 ;
    public final void rule__FileAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4613:1: ( rule__FileAppender__Group__2__Impl rule__FileAppender__Group__3 )
            // InternalMoniLog4DSL.g:4614:2: rule__FileAppender__Group__2__Impl rule__FileAppender__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__FileAppender__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__2"


    // $ANTLR start "rule__FileAppender__Group__2__Impl"
    // InternalMoniLog4DSL.g:4621:1: rule__FileAppender__Group__2__Impl : ( ( rule__FileAppender__FilenameAssignment_2 ) ) ;
    public final void rule__FileAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4625:1: ( ( ( rule__FileAppender__FilenameAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:4626:1: ( ( rule__FileAppender__FilenameAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:4626:1: ( ( rule__FileAppender__FilenameAssignment_2 ) )
            // InternalMoniLog4DSL.g:4627:2: ( rule__FileAppender__FilenameAssignment_2 )
            {
             before(grammarAccess.getFileAppenderAccess().getFilenameAssignment_2()); 
            // InternalMoniLog4DSL.g:4628:2: ( rule__FileAppender__FilenameAssignment_2 )
            // InternalMoniLog4DSL.g:4628:3: rule__FileAppender__FilenameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FileAppender__FilenameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFileAppenderAccess().getFilenameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__2__Impl"


    // $ANTLR start "rule__FileAppender__Group__3"
    // InternalMoniLog4DSL.g:4636:1: rule__FileAppender__Group__3 : rule__FileAppender__Group__3__Impl rule__FileAppender__Group__4 ;
    public final void rule__FileAppender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4640:1: ( rule__FileAppender__Group__3__Impl rule__FileAppender__Group__4 )
            // InternalMoniLog4DSL.g:4641:2: rule__FileAppender__Group__3__Impl rule__FileAppender__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__FileAppender__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__3"


    // $ANTLR start "rule__FileAppender__Group__3__Impl"
    // InternalMoniLog4DSL.g:4648:1: rule__FileAppender__Group__3__Impl : ( ',' ) ;
    public final void rule__FileAppender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4652:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:4653:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:4653:1: ( ',' )
            // InternalMoniLog4DSL.g:4654:2: ','
            {
             before(grammarAccess.getFileAppenderAccess().getCommaKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFileAppenderAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__3__Impl"


    // $ANTLR start "rule__FileAppender__Group__4"
    // InternalMoniLog4DSL.g:4663:1: rule__FileAppender__Group__4 : rule__FileAppender__Group__4__Impl rule__FileAppender__Group__5 ;
    public final void rule__FileAppender__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4667:1: ( rule__FileAppender__Group__4__Impl rule__FileAppender__Group__5 )
            // InternalMoniLog4DSL.g:4668:2: rule__FileAppender__Group__4__Impl rule__FileAppender__Group__5
            {
            pushFollow(FOLLOW_44);
            rule__FileAppender__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__4"


    // $ANTLR start "rule__FileAppender__Group__4__Impl"
    // InternalMoniLog4DSL.g:4675:1: rule__FileAppender__Group__4__Impl : ( ( rule__FileAppender__LayoutAssignment_4 ) ) ;
    public final void rule__FileAppender__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4679:1: ( ( ( rule__FileAppender__LayoutAssignment_4 ) ) )
            // InternalMoniLog4DSL.g:4680:1: ( ( rule__FileAppender__LayoutAssignment_4 ) )
            {
            // InternalMoniLog4DSL.g:4680:1: ( ( rule__FileAppender__LayoutAssignment_4 ) )
            // InternalMoniLog4DSL.g:4681:2: ( rule__FileAppender__LayoutAssignment_4 )
            {
             before(grammarAccess.getFileAppenderAccess().getLayoutAssignment_4()); 
            // InternalMoniLog4DSL.g:4682:2: ( rule__FileAppender__LayoutAssignment_4 )
            // InternalMoniLog4DSL.g:4682:3: rule__FileAppender__LayoutAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__FileAppender__LayoutAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getFileAppenderAccess().getLayoutAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__4__Impl"


    // $ANTLR start "rule__FileAppender__Group__5"
    // InternalMoniLog4DSL.g:4690:1: rule__FileAppender__Group__5 : rule__FileAppender__Group__5__Impl ;
    public final void rule__FileAppender__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4694:1: ( rule__FileAppender__Group__5__Impl )
            // InternalMoniLog4DSL.g:4695:2: rule__FileAppender__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FileAppender__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__5"


    // $ANTLR start "rule__FileAppender__Group__5__Impl"
    // InternalMoniLog4DSL.g:4701:1: rule__FileAppender__Group__5__Impl : ( ')' ) ;
    public final void rule__FileAppender__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4705:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4706:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4706:1: ( ')' )
            // InternalMoniLog4DSL.g:4707:2: ')'
            {
             before(grammarAccess.getFileAppenderAccess().getRightParenthesisKeyword_5()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFileAppenderAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__Group__5__Impl"


    // $ANTLR start "rule__ConsoleAppender__Group__0"
    // InternalMoniLog4DSL.g:4717:1: rule__ConsoleAppender__Group__0 : rule__ConsoleAppender__Group__0__Impl rule__ConsoleAppender__Group__1 ;
    public final void rule__ConsoleAppender__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4721:1: ( rule__ConsoleAppender__Group__0__Impl rule__ConsoleAppender__Group__1 )
            // InternalMoniLog4DSL.g:4722:2: rule__ConsoleAppender__Group__0__Impl rule__ConsoleAppender__Group__1
            {
            pushFollow(FOLLOW_21);
            rule__ConsoleAppender__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleAppender__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__0"


    // $ANTLR start "rule__ConsoleAppender__Group__0__Impl"
    // InternalMoniLog4DSL.g:4729:1: rule__ConsoleAppender__Group__0__Impl : ( 'console' ) ;
    public final void rule__ConsoleAppender__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4733:1: ( ( 'console' ) )
            // InternalMoniLog4DSL.g:4734:1: ( 'console' )
            {
            // InternalMoniLog4DSL.g:4734:1: ( 'console' )
            // InternalMoniLog4DSL.g:4735:2: 'console'
            {
             before(grammarAccess.getConsoleAppenderAccess().getConsoleKeyword_0()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getConsoleAppenderAccess().getConsoleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__0__Impl"


    // $ANTLR start "rule__ConsoleAppender__Group__1"
    // InternalMoniLog4DSL.g:4744:1: rule__ConsoleAppender__Group__1 : rule__ConsoleAppender__Group__1__Impl rule__ConsoleAppender__Group__2 ;
    public final void rule__ConsoleAppender__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4748:1: ( rule__ConsoleAppender__Group__1__Impl rule__ConsoleAppender__Group__2 )
            // InternalMoniLog4DSL.g:4749:2: rule__ConsoleAppender__Group__1__Impl rule__ConsoleAppender__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__ConsoleAppender__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleAppender__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__1"


    // $ANTLR start "rule__ConsoleAppender__Group__1__Impl"
    // InternalMoniLog4DSL.g:4756:1: rule__ConsoleAppender__Group__1__Impl : ( '(' ) ;
    public final void rule__ConsoleAppender__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4760:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:4761:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:4761:1: ( '(' )
            // InternalMoniLog4DSL.g:4762:2: '('
            {
             before(grammarAccess.getConsoleAppenderAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getConsoleAppenderAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__1__Impl"


    // $ANTLR start "rule__ConsoleAppender__Group__2"
    // InternalMoniLog4DSL.g:4771:1: rule__ConsoleAppender__Group__2 : rule__ConsoleAppender__Group__2__Impl rule__ConsoleAppender__Group__3 ;
    public final void rule__ConsoleAppender__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4775:1: ( rule__ConsoleAppender__Group__2__Impl rule__ConsoleAppender__Group__3 )
            // InternalMoniLog4DSL.g:4776:2: rule__ConsoleAppender__Group__2__Impl rule__ConsoleAppender__Group__3
            {
            pushFollow(FOLLOW_44);
            rule__ConsoleAppender__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ConsoleAppender__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__2"


    // $ANTLR start "rule__ConsoleAppender__Group__2__Impl"
    // InternalMoniLog4DSL.g:4783:1: rule__ConsoleAppender__Group__2__Impl : ( ( rule__ConsoleAppender__LayoutAssignment_2 ) ) ;
    public final void rule__ConsoleAppender__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4787:1: ( ( ( rule__ConsoleAppender__LayoutAssignment_2 ) ) )
            // InternalMoniLog4DSL.g:4788:1: ( ( rule__ConsoleAppender__LayoutAssignment_2 ) )
            {
            // InternalMoniLog4DSL.g:4788:1: ( ( rule__ConsoleAppender__LayoutAssignment_2 ) )
            // InternalMoniLog4DSL.g:4789:2: ( rule__ConsoleAppender__LayoutAssignment_2 )
            {
             before(grammarAccess.getConsoleAppenderAccess().getLayoutAssignment_2()); 
            // InternalMoniLog4DSL.g:4790:2: ( rule__ConsoleAppender__LayoutAssignment_2 )
            // InternalMoniLog4DSL.g:4790:3: rule__ConsoleAppender__LayoutAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleAppender__LayoutAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConsoleAppenderAccess().getLayoutAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__2__Impl"


    // $ANTLR start "rule__ConsoleAppender__Group__3"
    // InternalMoniLog4DSL.g:4798:1: rule__ConsoleAppender__Group__3 : rule__ConsoleAppender__Group__3__Impl ;
    public final void rule__ConsoleAppender__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4802:1: ( rule__ConsoleAppender__Group__3__Impl )
            // InternalMoniLog4DSL.g:4803:2: rule__ConsoleAppender__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ConsoleAppender__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__3"


    // $ANTLR start "rule__ConsoleAppender__Group__3__Impl"
    // InternalMoniLog4DSL.g:4809:1: rule__ConsoleAppender__Group__3__Impl : ( ')' ) ;
    public final void rule__ConsoleAppender__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4813:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:4814:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:4814:1: ( ')' )
            // InternalMoniLog4DSL.g:4815:2: ')'
            {
             before(grammarAccess.getConsoleAppenderAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getConsoleAppenderAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__Group__3__Impl"


    // $ANTLR start "rule__StringLayout__Group__0"
    // InternalMoniLog4DSL.g:4825:1: rule__StringLayout__Group__0 : rule__StringLayout__Group__0__Impl rule__StringLayout__Group__1 ;
    public final void rule__StringLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4829:1: ( rule__StringLayout__Group__0__Impl rule__StringLayout__Group__1 )
            // InternalMoniLog4DSL.g:4830:2: rule__StringLayout__Group__0__Impl rule__StringLayout__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__StringLayout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLayout__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group__0"


    // $ANTLR start "rule__StringLayout__Group__0__Impl"
    // InternalMoniLog4DSL.g:4837:1: rule__StringLayout__Group__0__Impl : ( ( rule__StringLayout__FormatStringAssignment_0 ) ) ;
    public final void rule__StringLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4841:1: ( ( ( rule__StringLayout__FormatStringAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:4842:1: ( ( rule__StringLayout__FormatStringAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:4842:1: ( ( rule__StringLayout__FormatStringAssignment_0 ) )
            // InternalMoniLog4DSL.g:4843:2: ( rule__StringLayout__FormatStringAssignment_0 )
            {
             before(grammarAccess.getStringLayoutAccess().getFormatStringAssignment_0()); 
            // InternalMoniLog4DSL.g:4844:2: ( rule__StringLayout__FormatStringAssignment_0 )
            // InternalMoniLog4DSL.g:4844:3: rule__StringLayout__FormatStringAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StringLayout__FormatStringAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStringLayoutAccess().getFormatStringAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group__0__Impl"


    // $ANTLR start "rule__StringLayout__Group__1"
    // InternalMoniLog4DSL.g:4852:1: rule__StringLayout__Group__1 : rule__StringLayout__Group__1__Impl ;
    public final void rule__StringLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4856:1: ( rule__StringLayout__Group__1__Impl )
            // InternalMoniLog4DSL.g:4857:2: rule__StringLayout__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLayout__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group__1"


    // $ANTLR start "rule__StringLayout__Group__1__Impl"
    // InternalMoniLog4DSL.g:4863:1: rule__StringLayout__Group__1__Impl : ( ( rule__StringLayout__Group_1__0 )* ) ;
    public final void rule__StringLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4867:1: ( ( ( rule__StringLayout__Group_1__0 )* ) )
            // InternalMoniLog4DSL.g:4868:1: ( ( rule__StringLayout__Group_1__0 )* )
            {
            // InternalMoniLog4DSL.g:4868:1: ( ( rule__StringLayout__Group_1__0 )* )
            // InternalMoniLog4DSL.g:4869:2: ( rule__StringLayout__Group_1__0 )*
            {
             before(grammarAccess.getStringLayoutAccess().getGroup_1()); 
            // InternalMoniLog4DSL.g:4870:2: ( rule__StringLayout__Group_1__0 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==30) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:4870:3: rule__StringLayout__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StringLayout__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getStringLayoutAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group__1__Impl"


    // $ANTLR start "rule__StringLayout__Group_1__0"
    // InternalMoniLog4DSL.g:4879:1: rule__StringLayout__Group_1__0 : rule__StringLayout__Group_1__0__Impl rule__StringLayout__Group_1__1 ;
    public final void rule__StringLayout__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4883:1: ( rule__StringLayout__Group_1__0__Impl rule__StringLayout__Group_1__1 )
            // InternalMoniLog4DSL.g:4884:2: rule__StringLayout__Group_1__0__Impl rule__StringLayout__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__StringLayout__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringLayout__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group_1__0"


    // $ANTLR start "rule__StringLayout__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:4891:1: rule__StringLayout__Group_1__0__Impl : ( ',' ) ;
    public final void rule__StringLayout__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4895:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:4896:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:4896:1: ( ',' )
            // InternalMoniLog4DSL.g:4897:2: ','
            {
             before(grammarAccess.getStringLayoutAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStringLayoutAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group_1__0__Impl"


    // $ANTLR start "rule__StringLayout__Group_1__1"
    // InternalMoniLog4DSL.g:4906:1: rule__StringLayout__Group_1__1 : rule__StringLayout__Group_1__1__Impl ;
    public final void rule__StringLayout__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4910:1: ( rule__StringLayout__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:4911:2: rule__StringLayout__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringLayout__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group_1__1"


    // $ANTLR start "rule__StringLayout__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:4917:1: rule__StringLayout__Group_1__1__Impl : ( ( rule__StringLayout__ValuesAssignment_1_1 ) ) ;
    public final void rule__StringLayout__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4921:1: ( ( ( rule__StringLayout__ValuesAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:4922:1: ( ( rule__StringLayout__ValuesAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:4922:1: ( ( rule__StringLayout__ValuesAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:4923:2: ( rule__StringLayout__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getStringLayoutAccess().getValuesAssignment_1_1()); 
            // InternalMoniLog4DSL.g:4924:2: ( rule__StringLayout__ValuesAssignment_1_1 )
            // InternalMoniLog4DSL.g:4924:3: rule__StringLayout__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StringLayout__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStringLayoutAccess().getValuesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__Group_1__1__Impl"


    // $ANTLR start "rule__ExternalLayout__Group__0"
    // InternalMoniLog4DSL.g:4933:1: rule__ExternalLayout__Group__0 : rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 ;
    public final void rule__ExternalLayout__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4937:1: ( rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1 )
            // InternalMoniLog4DSL.g:4938:2: rule__ExternalLayout__Group__0__Impl rule__ExternalLayout__Group__1
            {
            pushFollow(FOLLOW_43);
            rule__ExternalLayout__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4945:1: rule__ExternalLayout__Group__0__Impl : ( ( rule__ExternalLayout__PathAssignment_0 ) ) ;
    public final void rule__ExternalLayout__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4949:1: ( ( ( rule__ExternalLayout__PathAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:4950:1: ( ( rule__ExternalLayout__PathAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:4950:1: ( ( rule__ExternalLayout__PathAssignment_0 ) )
            // InternalMoniLog4DSL.g:4951:2: ( rule__ExternalLayout__PathAssignment_0 )
            {
             before(grammarAccess.getExternalLayoutAccess().getPathAssignment_0()); 
            // InternalMoniLog4DSL.g:4952:2: ( rule__ExternalLayout__PathAssignment_0 )
            // InternalMoniLog4DSL.g:4952:3: rule__ExternalLayout__PathAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__PathAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getExternalLayoutAccess().getPathAssignment_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:4960:1: rule__ExternalLayout__Group__1 : rule__ExternalLayout__Group__1__Impl ;
    public final void rule__ExternalLayout__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4964:1: ( rule__ExternalLayout__Group__1__Impl )
            // InternalMoniLog4DSL.g:4965:2: rule__ExternalLayout__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:4971:1: rule__ExternalLayout__Group__1__Impl : ( ( rule__ExternalLayout__Group_1__0 )* ) ;
    public final void rule__ExternalLayout__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4975:1: ( ( ( rule__ExternalLayout__Group_1__0 )* ) )
            // InternalMoniLog4DSL.g:4976:1: ( ( rule__ExternalLayout__Group_1__0 )* )
            {
            // InternalMoniLog4DSL.g:4976:1: ( ( rule__ExternalLayout__Group_1__0 )* )
            // InternalMoniLog4DSL.g:4977:2: ( rule__ExternalLayout__Group_1__0 )*
            {
             before(grammarAccess.getExternalLayoutAccess().getGroup_1()); 
            // InternalMoniLog4DSL.g:4978:2: ( rule__ExternalLayout__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==30) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:4978:3: rule__ExternalLayout__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ExternalLayout__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

             after(grammarAccess.getExternalLayoutAccess().getGroup_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__ExternalLayout__Group_1__0"
    // InternalMoniLog4DSL.g:4987:1: rule__ExternalLayout__Group_1__0 : rule__ExternalLayout__Group_1__0__Impl rule__ExternalLayout__Group_1__1 ;
    public final void rule__ExternalLayout__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:4991:1: ( rule__ExternalLayout__Group_1__0__Impl rule__ExternalLayout__Group_1__1 )
            // InternalMoniLog4DSL.g:4992:2: rule__ExternalLayout__Group_1__0__Impl rule__ExternalLayout__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__ExternalLayout__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_1__0"


    // $ANTLR start "rule__ExternalLayout__Group_1__0__Impl"
    // InternalMoniLog4DSL.g:4999:1: rule__ExternalLayout__Group_1__0__Impl : ( ',' ) ;
    public final void rule__ExternalLayout__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5003:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:5004:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:5004:1: ( ',' )
            // InternalMoniLog4DSL.g:5005:2: ','
            {
             before(grammarAccess.getExternalLayoutAccess().getCommaKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getExternalLayoutAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_1__0__Impl"


    // $ANTLR start "rule__ExternalLayout__Group_1__1"
    // InternalMoniLog4DSL.g:5014:1: rule__ExternalLayout__Group_1__1 : rule__ExternalLayout__Group_1__1__Impl ;
    public final void rule__ExternalLayout__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5018:1: ( rule__ExternalLayout__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:5019:2: rule__ExternalLayout__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_1__1"


    // $ANTLR start "rule__ExternalLayout__Group_1__1__Impl"
    // InternalMoniLog4DSL.g:5025:1: rule__ExternalLayout__Group_1__1__Impl : ( ( rule__ExternalLayout__ValuesAssignment_1_1 ) ) ;
    public final void rule__ExternalLayout__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5029:1: ( ( ( rule__ExternalLayout__ValuesAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:5030:1: ( ( rule__ExternalLayout__ValuesAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:5030:1: ( ( rule__ExternalLayout__ValuesAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:5031:2: ( rule__ExternalLayout__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getExternalLayoutAccess().getValuesAssignment_1_1()); 
            // InternalMoniLog4DSL.g:5032:2: ( rule__ExternalLayout__ValuesAssignment_1_1 )
            // InternalMoniLog4DSL.g:5032:3: rule__ExternalLayout__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ExternalLayout__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExternalLayoutAccess().getValuesAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__Group_1__1__Impl"


    // $ANTLR start "rule__StreamEvent__Group__0"
    // InternalMoniLog4DSL.g:5041:1: rule__StreamEvent__Group__0 : rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 ;
    public final void rule__StreamEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5045:1: ( rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1 )
            // InternalMoniLog4DSL.g:5046:2: rule__StreamEvent__Group__0__Impl rule__StreamEvent__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__StreamEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5053:1: rule__StreamEvent__Group__0__Impl : ( ( rule__StreamEvent__EventIdAssignment_0 ) ) ;
    public final void rule__StreamEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5057:1: ( ( ( rule__StreamEvent__EventIdAssignment_0 ) ) )
            // InternalMoniLog4DSL.g:5058:1: ( ( rule__StreamEvent__EventIdAssignment_0 ) )
            {
            // InternalMoniLog4DSL.g:5058:1: ( ( rule__StreamEvent__EventIdAssignment_0 ) )
            // InternalMoniLog4DSL.g:5059:2: ( rule__StreamEvent__EventIdAssignment_0 )
            {
             before(grammarAccess.getStreamEventAccess().getEventIdAssignment_0()); 
            // InternalMoniLog4DSL.g:5060:2: ( rule__StreamEvent__EventIdAssignment_0 )
            // InternalMoniLog4DSL.g:5060:3: rule__StreamEvent__EventIdAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__EventIdAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamEventAccess().getEventIdAssignment_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5068:1: rule__StreamEvent__Group__1 : rule__StreamEvent__Group__1__Impl ;
    public final void rule__StreamEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5072:1: ( rule__StreamEvent__Group__1__Impl )
            // InternalMoniLog4DSL.g:5073:2: rule__StreamEvent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5079:1: rule__StreamEvent__Group__1__Impl : ( ( rule__StreamEvent__Group_1__0 )? ) ;
    public final void rule__StreamEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5083:1: ( ( ( rule__StreamEvent__Group_1__0 )? ) )
            // InternalMoniLog4DSL.g:5084:1: ( ( rule__StreamEvent__Group_1__0 )? )
            {
            // InternalMoniLog4DSL.g:5084:1: ( ( rule__StreamEvent__Group_1__0 )? )
            // InternalMoniLog4DSL.g:5085:2: ( rule__StreamEvent__Group_1__0 )?
            {
             before(grammarAccess.getStreamEventAccess().getGroup_1()); 
            // InternalMoniLog4DSL.g:5086:2: ( rule__StreamEvent__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==27) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoniLog4DSL.g:5086:3: rule__StreamEvent__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StreamEvent__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStreamEventAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5095:1: rule__StreamEvent__Group_1__0 : rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 ;
    public final void rule__StreamEvent__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5099:1: ( rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1 )
            // InternalMoniLog4DSL.g:5100:2: rule__StreamEvent__Group_1__0__Impl rule__StreamEvent__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__StreamEvent__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5107:1: rule__StreamEvent__Group_1__0__Impl : ( '[' ) ;
    public final void rule__StreamEvent__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5111:1: ( ( '[' ) )
            // InternalMoniLog4DSL.g:5112:1: ( '[' )
            {
            // InternalMoniLog4DSL.g:5112:1: ( '[' )
            // InternalMoniLog4DSL.g:5113:2: '['
            {
             before(grammarAccess.getStreamEventAccess().getLeftSquareBracketKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getStreamEventAccess().getLeftSquareBracketKeyword_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5122:1: rule__StreamEvent__Group_1__1 : rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 ;
    public final void rule__StreamEvent__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5126:1: ( rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2 )
            // InternalMoniLog4DSL.g:5127:2: rule__StreamEvent__Group_1__1__Impl rule__StreamEvent__Group_1__2
            {
            pushFollow(FOLLOW_41);
            rule__StreamEvent__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5134:1: rule__StreamEvent__Group_1__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) ;
    public final void rule__StreamEvent__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5138:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:5139:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:5139:1: ( ( rule__StreamEvent__ValuesAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:5140:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            {
             before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1()); 
            // InternalMoniLog4DSL.g:5141:2: ( rule__StreamEvent__ValuesAssignment_1_1 )
            // InternalMoniLog4DSL.g:5141:3: rule__StreamEvent__ValuesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__ValuesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamEventAccess().getValuesAssignment_1_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5149:1: rule__StreamEvent__Group_1__2 : rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 ;
    public final void rule__StreamEvent__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5153:1: ( rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3 )
            // InternalMoniLog4DSL.g:5154:2: rule__StreamEvent__Group_1__2__Impl rule__StreamEvent__Group_1__3
            {
            pushFollow(FOLLOW_41);
            rule__StreamEvent__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5161:1: rule__StreamEvent__Group_1__2__Impl : ( ( rule__StreamEvent__Group_1_2__0 )* ) ;
    public final void rule__StreamEvent__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5165:1: ( ( ( rule__StreamEvent__Group_1_2__0 )* ) )
            // InternalMoniLog4DSL.g:5166:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            {
            // InternalMoniLog4DSL.g:5166:1: ( ( rule__StreamEvent__Group_1_2__0 )* )
            // InternalMoniLog4DSL.g:5167:2: ( rule__StreamEvent__Group_1_2__0 )*
            {
             before(grammarAccess.getStreamEventAccess().getGroup_1_2()); 
            // InternalMoniLog4DSL.g:5168:2: ( rule__StreamEvent__Group_1_2__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==30) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:5168:3: rule__StreamEvent__Group_1_2__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StreamEvent__Group_1_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

             after(grammarAccess.getStreamEventAccess().getGroup_1_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5176:1: rule__StreamEvent__Group_1__3 : rule__StreamEvent__Group_1__3__Impl ;
    public final void rule__StreamEvent__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5180:1: ( rule__StreamEvent__Group_1__3__Impl )
            // InternalMoniLog4DSL.g:5181:2: rule__StreamEvent__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1__3__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5187:1: rule__StreamEvent__Group_1__3__Impl : ( ']' ) ;
    public final void rule__StreamEvent__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5191:1: ( ( ']' ) )
            // InternalMoniLog4DSL.g:5192:1: ( ']' )
            {
            // InternalMoniLog4DSL.g:5192:1: ( ']' )
            // InternalMoniLog4DSL.g:5193:2: ']'
            {
             before(grammarAccess.getStreamEventAccess().getRightSquareBracketKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getStreamEventAccess().getRightSquareBracketKeyword_1_3()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5203:1: rule__StreamEvent__Group_1_2__0 : rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 ;
    public final void rule__StreamEvent__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5207:1: ( rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1 )
            // InternalMoniLog4DSL.g:5208:2: rule__StreamEvent__Group_1_2__0__Impl rule__StreamEvent__Group_1_2__1
            {
            pushFollow(FOLLOW_46);
            rule__StreamEvent__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1_2__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5215:1: rule__StreamEvent__Group_1_2__0__Impl : ( ',' ) ;
    public final void rule__StreamEvent__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5219:1: ( ( ',' ) )
            // InternalMoniLog4DSL.g:5220:1: ( ',' )
            {
            // InternalMoniLog4DSL.g:5220:1: ( ',' )
            // InternalMoniLog4DSL.g:5221:2: ','
            {
             before(grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getStreamEventAccess().getCommaKeyword_1_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5230:1: rule__StreamEvent__Group_1_2__1 : rule__StreamEvent__Group_1_2__1__Impl ;
    public final void rule__StreamEvent__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5234:1: ( rule__StreamEvent__Group_1_2__1__Impl )
            // InternalMoniLog4DSL.g:5235:2: rule__StreamEvent__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5241:1: rule__StreamEvent__Group_1_2__1__Impl : ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) ;
    public final void rule__StreamEvent__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5245:1: ( ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) ) )
            // InternalMoniLog4DSL.g:5246:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            {
            // InternalMoniLog4DSL.g:5246:1: ( ( rule__StreamEvent__ValuesAssignment_1_2_1 ) )
            // InternalMoniLog4DSL.g:5247:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            {
             before(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1()); 
            // InternalMoniLog4DSL.g:5248:2: ( rule__StreamEvent__ValuesAssignment_1_2_1 )
            // InternalMoniLog4DSL.g:5248:3: rule__StreamEvent__ValuesAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__ValuesAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getStreamEventAccess().getValuesAssignment_1_2_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5257:1: rule__EmptyOrPropertyValue__Group_1__0 : rule__EmptyOrPropertyValue__Group_1__0__Impl rule__EmptyOrPropertyValue__Group_1__1 ;
    public final void rule__EmptyOrPropertyValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5261:1: ( rule__EmptyOrPropertyValue__Group_1__0__Impl rule__EmptyOrPropertyValue__Group_1__1 )
            // InternalMoniLog4DSL.g:5262:2: rule__EmptyOrPropertyValue__Group_1__0__Impl rule__EmptyOrPropertyValue__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__EmptyOrPropertyValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5269:1: rule__EmptyOrPropertyValue__Group_1__0__Impl : ( () ) ;
    public final void rule__EmptyOrPropertyValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5273:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5274:1: ( () )
            {
            // InternalMoniLog4DSL.g:5274:1: ( () )
            // InternalMoniLog4DSL.g:5275:2: ()
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueAction_1_0()); 
            // InternalMoniLog4DSL.g:5276:2: ()
            // InternalMoniLog4DSL.g:5276:3: 
            {
            }

             after(grammarAccess.getEmptyOrPropertyValueAccess().getPropertyValueAction_1_0()); 

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
    // InternalMoniLog4DSL.g:5284:1: rule__EmptyOrPropertyValue__Group_1__1 : rule__EmptyOrPropertyValue__Group_1__1__Impl rule__EmptyOrPropertyValue__Group_1__2 ;
    public final void rule__EmptyOrPropertyValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5288:1: ( rule__EmptyOrPropertyValue__Group_1__1__Impl rule__EmptyOrPropertyValue__Group_1__2 )
            // InternalMoniLog4DSL.g:5289:2: rule__EmptyOrPropertyValue__Group_1__1__Impl rule__EmptyOrPropertyValue__Group_1__2
            {
            pushFollow(FOLLOW_47);
            rule__EmptyOrPropertyValue__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5296:1: rule__EmptyOrPropertyValue__Group_1__1__Impl : ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) ) ;
    public final void rule__EmptyOrPropertyValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5300:1: ( ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:5301:1: ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:5301:1: ( ( rule__EmptyOrPropertyValue__IdAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:5302:2: ( rule__EmptyOrPropertyValue__IdAssignment_1_1 )
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getIdAssignment_1_1()); 
            // InternalMoniLog4DSL.g:5303:2: ( rule__EmptyOrPropertyValue__IdAssignment_1_1 )
            // InternalMoniLog4DSL.g:5303:3: rule__EmptyOrPropertyValue__IdAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__IdAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getEmptyOrPropertyValueAccess().getIdAssignment_1_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5311:1: rule__EmptyOrPropertyValue__Group_1__2 : rule__EmptyOrPropertyValue__Group_1__2__Impl ;
    public final void rule__EmptyOrPropertyValue__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5315:1: ( rule__EmptyOrPropertyValue__Group_1__2__Impl )
            // InternalMoniLog4DSL.g:5316:2: rule__EmptyOrPropertyValue__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1__2__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5322:1: rule__EmptyOrPropertyValue__Group_1__2__Impl : ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? ) ;
    public final void rule__EmptyOrPropertyValue__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5326:1: ( ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? ) )
            // InternalMoniLog4DSL.g:5327:1: ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? )
            {
            // InternalMoniLog4DSL.g:5327:1: ( ( rule__EmptyOrPropertyValue__Group_1_2__0 )? )
            // InternalMoniLog4DSL.g:5328:2: ( rule__EmptyOrPropertyValue__Group_1_2__0 )?
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1_2()); 
            // InternalMoniLog4DSL.g:5329:2: ( rule__EmptyOrPropertyValue__Group_1_2__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==55) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoniLog4DSL.g:5329:3: rule__EmptyOrPropertyValue__Group_1_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EmptyOrPropertyValue__Group_1_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEmptyOrPropertyValueAccess().getGroup_1_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5338:1: rule__EmptyOrPropertyValue__Group_1_2__0 : rule__EmptyOrPropertyValue__Group_1_2__0__Impl rule__EmptyOrPropertyValue__Group_1_2__1 ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5342:1: ( rule__EmptyOrPropertyValue__Group_1_2__0__Impl rule__EmptyOrPropertyValue__Group_1_2__1 )
            // InternalMoniLog4DSL.g:5343:2: rule__EmptyOrPropertyValue__Group_1_2__0__Impl rule__EmptyOrPropertyValue__Group_1_2__1
            {
            pushFollow(FOLLOW_16);
            rule__EmptyOrPropertyValue__Group_1_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1_2__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5350:1: rule__EmptyOrPropertyValue__Group_1_2__0__Impl : ( '=' ) ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5354:1: ( ( '=' ) )
            // InternalMoniLog4DSL.g:5355:1: ( '=' )
            {
            // InternalMoniLog4DSL.g:5355:1: ( '=' )
            // InternalMoniLog4DSL.g:5356:2: '='
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getEqualsSignKeyword_1_2_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getEmptyOrPropertyValueAccess().getEqualsSignKeyword_1_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5365:1: rule__EmptyOrPropertyValue__Group_1_2__1 : rule__EmptyOrPropertyValue__Group_1_2__1__Impl ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5369:1: ( rule__EmptyOrPropertyValue__Group_1_2__1__Impl )
            // InternalMoniLog4DSL.g:5370:2: rule__EmptyOrPropertyValue__Group_1_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__Group_1_2__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5376:1: rule__EmptyOrPropertyValue__Group_1_2__1__Impl : ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) ) ;
    public final void rule__EmptyOrPropertyValue__Group_1_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5380:1: ( ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) ) )
            // InternalMoniLog4DSL.g:5381:1: ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) )
            {
            // InternalMoniLog4DSL.g:5381:1: ( ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 ) )
            // InternalMoniLog4DSL.g:5382:2: ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 )
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getValueAssignment_1_2_1()); 
            // InternalMoniLog4DSL.g:5383:2: ( rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 )
            // InternalMoniLog4DSL.g:5383:3: rule__EmptyOrPropertyValue__ValueAssignment_1_2_1
            {
            pushFollow(FOLLOW_2);
            rule__EmptyOrPropertyValue__ValueAssignment_1_2_1();

            state._fsp--;


            }

             after(grammarAccess.getEmptyOrPropertyValueAccess().getValueAssignment_1_2_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5392:1: rule__LanguageExpression__Group_0__0 : rule__LanguageExpression__Group_0__0__Impl rule__LanguageExpression__Group_0__1 ;
    public final void rule__LanguageExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5396:1: ( rule__LanguageExpression__Group_0__0__Impl rule__LanguageExpression__Group_0__1 )
            // InternalMoniLog4DSL.g:5397:2: rule__LanguageExpression__Group_0__0__Impl rule__LanguageExpression__Group_0__1
            {
            pushFollow(FOLLOW_5);
            rule__LanguageExpression__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5404:1: rule__LanguageExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__LanguageExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5408:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5409:1: ( () )
            {
            // InternalMoniLog4DSL.g:5409:1: ( () )
            // InternalMoniLog4DSL.g:5410:2: ()
            {
             before(grammarAccess.getLanguageExpressionAccess().getExplicitLanguageExpressionAction_0_0()); 
            // InternalMoniLog4DSL.g:5411:2: ()
            // InternalMoniLog4DSL.g:5411:3: 
            {
            }

             after(grammarAccess.getLanguageExpressionAccess().getExplicitLanguageExpressionAction_0_0()); 

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
    // InternalMoniLog4DSL.g:5419:1: rule__LanguageExpression__Group_0__1 : rule__LanguageExpression__Group_0__1__Impl rule__LanguageExpression__Group_0__2 ;
    public final void rule__LanguageExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5423:1: ( rule__LanguageExpression__Group_0__1__Impl rule__LanguageExpression__Group_0__2 )
            // InternalMoniLog4DSL.g:5424:2: rule__LanguageExpression__Group_0__1__Impl rule__LanguageExpression__Group_0__2
            {
            pushFollow(FOLLOW_21);
            rule__LanguageExpression__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__2();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5431:1: rule__LanguageExpression__Group_0__1__Impl : ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) ) ;
    public final void rule__LanguageExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5435:1: ( ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) ) )
            // InternalMoniLog4DSL.g:5436:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) )
            {
            // InternalMoniLog4DSL.g:5436:1: ( ( rule__LanguageExpression__LanguageIdAssignment_0_1 ) )
            // InternalMoniLog4DSL.g:5437:2: ( rule__LanguageExpression__LanguageIdAssignment_0_1 )
            {
             before(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0_1()); 
            // InternalMoniLog4DSL.g:5438:2: ( rule__LanguageExpression__LanguageIdAssignment_0_1 )
            // InternalMoniLog4DSL.g:5438:3: rule__LanguageExpression__LanguageIdAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__LanguageIdAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageExpressionAccess().getLanguageIdAssignment_0_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5446:1: rule__LanguageExpression__Group_0__2 : rule__LanguageExpression__Group_0__2__Impl rule__LanguageExpression__Group_0__3 ;
    public final void rule__LanguageExpression__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5450:1: ( rule__LanguageExpression__Group_0__2__Impl rule__LanguageExpression__Group_0__3 )
            // InternalMoniLog4DSL.g:5451:2: rule__LanguageExpression__Group_0__2__Impl rule__LanguageExpression__Group_0__3
            {
            pushFollow(FOLLOW_42);
            rule__LanguageExpression__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__3();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5458:1: rule__LanguageExpression__Group_0__2__Impl : ( '(' ) ;
    public final void rule__LanguageExpression__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5462:1: ( ( '(' ) )
            // InternalMoniLog4DSL.g:5463:1: ( '(' )
            {
            // InternalMoniLog4DSL.g:5463:1: ( '(' )
            // InternalMoniLog4DSL.g:5464:2: '('
            {
             before(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_0_2()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getLanguageExpressionAccess().getLeftParenthesisKeyword_0_2()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5473:1: rule__LanguageExpression__Group_0__3 : rule__LanguageExpression__Group_0__3__Impl rule__LanguageExpression__Group_0__4 ;
    public final void rule__LanguageExpression__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5477:1: ( rule__LanguageExpression__Group_0__3__Impl rule__LanguageExpression__Group_0__4 )
            // InternalMoniLog4DSL.g:5478:2: rule__LanguageExpression__Group_0__3__Impl rule__LanguageExpression__Group_0__4
            {
            pushFollow(FOLLOW_44);
            rule__LanguageExpression__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__4();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5485:1: rule__LanguageExpression__Group_0__3__Impl : ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) ) ;
    public final void rule__LanguageExpression__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5489:1: ( ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) ) )
            // InternalMoniLog4DSL.g:5490:1: ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) )
            {
            // InternalMoniLog4DSL.g:5490:1: ( ( rule__LanguageExpression__ExpressionAssignment_0_3 ) )
            // InternalMoniLog4DSL.g:5491:2: ( rule__LanguageExpression__ExpressionAssignment_0_3 )
            {
             before(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_0_3()); 
            // InternalMoniLog4DSL.g:5492:2: ( rule__LanguageExpression__ExpressionAssignment_0_3 )
            // InternalMoniLog4DSL.g:5492:3: rule__LanguageExpression__ExpressionAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__ExpressionAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_0_3()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5500:1: rule__LanguageExpression__Group_0__4 : rule__LanguageExpression__Group_0__4__Impl ;
    public final void rule__LanguageExpression__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5504:1: ( rule__LanguageExpression__Group_0__4__Impl )
            // InternalMoniLog4DSL.g:5505:2: rule__LanguageExpression__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_0__4__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5511:1: rule__LanguageExpression__Group_0__4__Impl : ( ')' ) ;
    public final void rule__LanguageExpression__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5515:1: ( ( ')' ) )
            // InternalMoniLog4DSL.g:5516:1: ( ')' )
            {
            // InternalMoniLog4DSL.g:5516:1: ( ')' )
            // InternalMoniLog4DSL.g:5517:2: ')'
            {
             before(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getLanguageExpressionAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5527:1: rule__LanguageExpression__Group_1__0 : rule__LanguageExpression__Group_1__0__Impl rule__LanguageExpression__Group_1__1 ;
    public final void rule__LanguageExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5531:1: ( rule__LanguageExpression__Group_1__0__Impl rule__LanguageExpression__Group_1__1 )
            // InternalMoniLog4DSL.g:5532:2: rule__LanguageExpression__Group_1__0__Impl rule__LanguageExpression__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__LanguageExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5539:1: rule__LanguageExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__LanguageExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5543:1: ( ( () ) )
            // InternalMoniLog4DSL.g:5544:1: ( () )
            {
            // InternalMoniLog4DSL.g:5544:1: ( () )
            // InternalMoniLog4DSL.g:5545:2: ()
            {
             before(grammarAccess.getLanguageExpressionAccess().getDefaultLanguageExpressionAction_1_0()); 
            // InternalMoniLog4DSL.g:5546:2: ()
            // InternalMoniLog4DSL.g:5546:3: 
            {
            }

             after(grammarAccess.getLanguageExpressionAccess().getDefaultLanguageExpressionAction_1_0()); 

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
    // InternalMoniLog4DSL.g:5554:1: rule__LanguageExpression__Group_1__1 : rule__LanguageExpression__Group_1__1__Impl ;
    public final void rule__LanguageExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5558:1: ( rule__LanguageExpression__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:5559:2: rule__LanguageExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5565:1: rule__LanguageExpression__Group_1__1__Impl : ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) ) ;
    public final void rule__LanguageExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5569:1: ( ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) ) )
            // InternalMoniLog4DSL.g:5570:1: ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) )
            {
            // InternalMoniLog4DSL.g:5570:1: ( ( rule__LanguageExpression__ExpressionAssignment_1_1 ) )
            // InternalMoniLog4DSL.g:5571:2: ( rule__LanguageExpression__ExpressionAssignment_1_1 )
            {
             before(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_1_1()); 
            // InternalMoniLog4DSL.g:5572:2: ( rule__LanguageExpression__ExpressionAssignment_1_1 )
            // InternalMoniLog4DSL.g:5572:3: rule__LanguageExpression__ExpressionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__ExpressionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLanguageExpressionAccess().getExpressionAssignment_1_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5581:1: rule__FQN__Group__0 : rule__FQN__Group__0__Impl rule__FQN__Group__1 ;
    public final void rule__FQN__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5585:1: ( rule__FQN__Group__0__Impl rule__FQN__Group__1 )
            // InternalMoniLog4DSL.g:5586:2: rule__FQN__Group__0__Impl rule__FQN__Group__1
            {
            pushFollow(FOLLOW_48);
            rule__FQN__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5593:1: rule__FQN__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5597:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:5598:1: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:5598:1: ( RULE_ID )
            // InternalMoniLog4DSL.g:5599:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5608:1: rule__FQN__Group__1 : rule__FQN__Group__1__Impl ;
    public final void rule__FQN__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5612:1: ( rule__FQN__Group__1__Impl )
            // InternalMoniLog4DSL.g:5613:2: rule__FQN__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5619:1: rule__FQN__Group__1__Impl : ( ( rule__FQN__Group_1__0 )* ) ;
    public final void rule__FQN__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5623:1: ( ( ( rule__FQN__Group_1__0 )* ) )
            // InternalMoniLog4DSL.g:5624:1: ( ( rule__FQN__Group_1__0 )* )
            {
            // InternalMoniLog4DSL.g:5624:1: ( ( rule__FQN__Group_1__0 )* )
            // InternalMoniLog4DSL.g:5625:2: ( rule__FQN__Group_1__0 )*
            {
             before(grammarAccess.getFQNAccess().getGroup_1()); 
            // InternalMoniLog4DSL.g:5626:2: ( rule__FQN__Group_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==56) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMoniLog4DSL.g:5626:3: rule__FQN__Group_1__0
            	    {
            	    pushFollow(FOLLOW_49);
            	    rule__FQN__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             after(grammarAccess.getFQNAccess().getGroup_1()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5635:1: rule__FQN__Group_1__0 : rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 ;
    public final void rule__FQN__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5639:1: ( rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1 )
            // InternalMoniLog4DSL.g:5640:2: rule__FQN__Group_1__0__Impl rule__FQN__Group_1__1
            {
            pushFollow(FOLLOW_46);
            rule__FQN__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5647:1: rule__FQN__Group_1__0__Impl : ( '.' ) ;
    public final void rule__FQN__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5651:1: ( ( '.' ) )
            // InternalMoniLog4DSL.g:5652:1: ( '.' )
            {
            // InternalMoniLog4DSL.g:5652:1: ( '.' )
            // InternalMoniLog4DSL.g:5653:2: '.'
            {
             before(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:5662:1: rule__FQN__Group_1__1 : rule__FQN__Group_1__1__Impl ;
    public final void rule__FQN__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5666:1: ( rule__FQN__Group_1__1__Impl )
            // InternalMoniLog4DSL.g:5667:2: rule__FQN__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FQN__Group_1__1__Impl();

            state._fsp--;


            }

        }
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
    // InternalMoniLog4DSL.g:5673:1: rule__FQN__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__FQN__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5677:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:5678:1: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:5678:1: ( RULE_ID )
            // InternalMoniLog4DSL.g:5679:2: RULE_ID
            {
             before(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFQNAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__BeforeEvent__UnorderedGroup_2"
    // InternalMoniLog4DSL.g:5689:1: rule__BeforeEvent__UnorderedGroup_2 : ( rule__BeforeEvent__UnorderedGroup_2__0 )? ;
    public final void rule__BeforeEvent__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
        	
        try {
            // InternalMoniLog4DSL.g:5694:1: ( ( rule__BeforeEvent__UnorderedGroup_2__0 )? )
            // InternalMoniLog4DSL.g:5695:2: ( rule__BeforeEvent__UnorderedGroup_2__0 )?
            {
            // InternalMoniLog4DSL.g:5695:2: ( rule__BeforeEvent__UnorderedGroup_2__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( LA39_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0) ) {
                alt39=1;
            }
            else if ( LA39_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoniLog4DSL.g:5695:2: rule__BeforeEvent__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeEvent__UnorderedGroup_2__0();

                    state._fsp--;


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

            	getUnorderedGroupHelper().leave(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__UnorderedGroup_2"


    // $ANTLR start "rule__BeforeEvent__UnorderedGroup_2__Impl"
    // InternalMoniLog4DSL.g:5703:1: rule__BeforeEvent__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__BeforeEvent__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog4DSL.g:5708:1: ( ( ({...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) ) ) ) )
            // InternalMoniLog4DSL.g:5709:3: ( ({...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) ) ) )
            {
            // InternalMoniLog4DSL.g:5709:3: ( ({...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) ) ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( LA40_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0) ) {
                alt40=1;
            }
            else if ( LA40_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoniLog4DSL.g:5710:3: ({...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:5710:3: ({...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) ) )
                    // InternalMoniLog4DSL.g:5711:4: {...}? => ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__BeforeEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalMoniLog4DSL.g:5711:107: ( ( ( rule__BeforeEvent__Group_2_0__0 ) ) )
                    // InternalMoniLog4DSL.g:5712:5: ( ( rule__BeforeEvent__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoniLog4DSL.g:5718:5: ( ( rule__BeforeEvent__Group_2_0__0 ) )
                    // InternalMoniLog4DSL.g:5719:6: ( rule__BeforeEvent__Group_2_0__0 )
                    {
                     before(grammarAccess.getBeforeEventAccess().getGroup_2_0()); 
                    // InternalMoniLog4DSL.g:5720:6: ( rule__BeforeEvent__Group_2_0__0 )
                    // InternalMoniLog4DSL.g:5720:7: rule__BeforeEvent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeEvent__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBeforeEventAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:5725:3: ({...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:5725:3: ({...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) ) )
                    // InternalMoniLog4DSL.g:5726:4: {...}? => ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__BeforeEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalMoniLog4DSL.g:5726:107: ( ( ( rule__BeforeEvent__Group_2_1__0 ) ) )
                    // InternalMoniLog4DSL.g:5727:5: ( ( rule__BeforeEvent__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoniLog4DSL.g:5733:5: ( ( rule__BeforeEvent__Group_2_1__0 ) )
                    // InternalMoniLog4DSL.g:5734:6: ( rule__BeforeEvent__Group_2_1__0 )
                    {
                     before(grammarAccess.getBeforeEventAccess().getGroup_2_1()); 
                    // InternalMoniLog4DSL.g:5735:6: ( rule__BeforeEvent__Group_2_1__0 )
                    // InternalMoniLog4DSL.g:5735:7: rule__BeforeEvent__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeEvent__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBeforeEventAccess().getGroup_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__BeforeEvent__UnorderedGroup_2__0"
    // InternalMoniLog4DSL.g:5748:1: rule__BeforeEvent__UnorderedGroup_2__0 : rule__BeforeEvent__UnorderedGroup_2__Impl ( rule__BeforeEvent__UnorderedGroup_2__1 )? ;
    public final void rule__BeforeEvent__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5752:1: ( rule__BeforeEvent__UnorderedGroup_2__Impl ( rule__BeforeEvent__UnorderedGroup_2__1 )? )
            // InternalMoniLog4DSL.g:5753:2: rule__BeforeEvent__UnorderedGroup_2__Impl ( rule__BeforeEvent__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_50);
            rule__BeforeEvent__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMoniLog4DSL.g:5754:2: ( rule__BeforeEvent__UnorderedGroup_2__1 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( LA41_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 0) ) {
                alt41=1;
            }
            else if ( LA41_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeEventAccess().getUnorderedGroup_2(), 1) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoniLog4DSL.g:5754:2: rule__BeforeEvent__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeEvent__UnorderedGroup_2__1();

                    state._fsp--;


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
    // $ANTLR end "rule__BeforeEvent__UnorderedGroup_2__0"


    // $ANTLR start "rule__BeforeEvent__UnorderedGroup_2__1"
    // InternalMoniLog4DSL.g:5760:1: rule__BeforeEvent__UnorderedGroup_2__1 : rule__BeforeEvent__UnorderedGroup_2__Impl ;
    public final void rule__BeforeEvent__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5764:1: ( rule__BeforeEvent__UnorderedGroup_2__Impl )
            // InternalMoniLog4DSL.g:5765:2: rule__BeforeEvent__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__UnorderedGroup_2__1"


    // $ANTLR start "rule__AfterEvent__UnorderedGroup_2"
    // InternalMoniLog4DSL.g:5772:1: rule__AfterEvent__UnorderedGroup_2 : ( rule__AfterEvent__UnorderedGroup_2__0 )? ;
    public final void rule__AfterEvent__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
        	
        try {
            // InternalMoniLog4DSL.g:5777:1: ( ( rule__AfterEvent__UnorderedGroup_2__0 )? )
            // InternalMoniLog4DSL.g:5778:2: ( rule__AfterEvent__UnorderedGroup_2__0 )?
            {
            // InternalMoniLog4DSL.g:5778:2: ( rule__AfterEvent__UnorderedGroup_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoniLog4DSL.g:5778:2: rule__AfterEvent__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AfterEvent__UnorderedGroup_2__0();

                    state._fsp--;


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

            	getUnorderedGroupHelper().leave(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__UnorderedGroup_2"


    // $ANTLR start "rule__AfterEvent__UnorderedGroup_2__Impl"
    // InternalMoniLog4DSL.g:5786:1: rule__AfterEvent__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) ) ) ) ;
    public final void rule__AfterEvent__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog4DSL.g:5791:1: ( ( ({...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) ) ) ) )
            // InternalMoniLog4DSL.g:5792:3: ( ({...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) ) ) )
            {
            // InternalMoniLog4DSL.g:5792:3: ( ({...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) ) ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1) ) {
                alt43=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoniLog4DSL.g:5793:3: ({...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:5793:3: ({...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) ) )
                    // InternalMoniLog4DSL.g:5794:4: {...}? => ( ( ( rule__AfterEvent__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__AfterEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalMoniLog4DSL.g:5794:106: ( ( ( rule__AfterEvent__Group_2_0__0 ) ) )
                    // InternalMoniLog4DSL.g:5795:5: ( ( rule__AfterEvent__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoniLog4DSL.g:5801:5: ( ( rule__AfterEvent__Group_2_0__0 ) )
                    // InternalMoniLog4DSL.g:5802:6: ( rule__AfterEvent__Group_2_0__0 )
                    {
                     before(grammarAccess.getAfterEventAccess().getGroup_2_0()); 
                    // InternalMoniLog4DSL.g:5803:6: ( rule__AfterEvent__Group_2_0__0 )
                    // InternalMoniLog4DSL.g:5803:7: rule__AfterEvent__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AfterEvent__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAfterEventAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:5808:3: ({...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:5808:3: ({...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) ) )
                    // InternalMoniLog4DSL.g:5809:4: {...}? => ( ( ( rule__AfterEvent__Group_2_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__AfterEvent__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalMoniLog4DSL.g:5809:106: ( ( ( rule__AfterEvent__Group_2_1__0 ) ) )
                    // InternalMoniLog4DSL.g:5810:5: ( ( rule__AfterEvent__Group_2_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoniLog4DSL.g:5816:5: ( ( rule__AfterEvent__Group_2_1__0 ) )
                    // InternalMoniLog4DSL.g:5817:6: ( rule__AfterEvent__Group_2_1__0 )
                    {
                     before(grammarAccess.getAfterEventAccess().getGroup_2_1()); 
                    // InternalMoniLog4DSL.g:5818:6: ( rule__AfterEvent__Group_2_1__0 )
                    // InternalMoniLog4DSL.g:5818:7: rule__AfterEvent__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AfterEvent__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAfterEventAccess().getGroup_2_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getAfterEventAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__AfterEvent__UnorderedGroup_2__0"
    // InternalMoniLog4DSL.g:5831:1: rule__AfterEvent__UnorderedGroup_2__0 : rule__AfterEvent__UnorderedGroup_2__Impl ( rule__AfterEvent__UnorderedGroup_2__1 )? ;
    public final void rule__AfterEvent__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5835:1: ( rule__AfterEvent__UnorderedGroup_2__Impl ( rule__AfterEvent__UnorderedGroup_2__1 )? )
            // InternalMoniLog4DSL.g:5836:2: rule__AfterEvent__UnorderedGroup_2__Impl ( rule__AfterEvent__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_51);
            rule__AfterEvent__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMoniLog4DSL.g:5837:2: ( rule__AfterEvent__UnorderedGroup_2__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getAfterEventAccess().getUnorderedGroup_2(), 1) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoniLog4DSL.g:5837:2: rule__AfterEvent__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__AfterEvent__UnorderedGroup_2__1();

                    state._fsp--;


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
    // $ANTLR end "rule__AfterEvent__UnorderedGroup_2__0"


    // $ANTLR start "rule__AfterEvent__UnorderedGroup_2__1"
    // InternalMoniLog4DSL.g:5843:1: rule__AfterEvent__UnorderedGroup_2__1 : rule__AfterEvent__UnorderedGroup_2__Impl ;
    public final void rule__AfterEvent__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5847:1: ( rule__AfterEvent__UnorderedGroup_2__Impl )
            // InternalMoniLog4DSL.g:5848:2: rule__AfterEvent__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__UnorderedGroup_2__1"


    // $ANTLR start "rule__BeforeAfterEvent__UnorderedGroup_1"
    // InternalMoniLog4DSL.g:5855:1: rule__BeforeAfterEvent__UnorderedGroup_1 : ( rule__BeforeAfterEvent__UnorderedGroup_1__0 )? ;
    public final void rule__BeforeAfterEvent__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoniLog4DSL.g:5860:1: ( ( rule__BeforeAfterEvent__UnorderedGroup_1__0 )? )
            // InternalMoniLog4DSL.g:5861:2: ( rule__BeforeAfterEvent__UnorderedGroup_1__0 )?
            {
            // InternalMoniLog4DSL.g:5861:2: ( rule__BeforeAfterEvent__UnorderedGroup_1__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoniLog4DSL.g:5861:2: rule__BeforeAfterEvent__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeAfterEvent__UnorderedGroup_1__0();

                    state._fsp--;


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

            	getUnorderedGroupHelper().leave(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__UnorderedGroup_1"


    // $ANTLR start "rule__BeforeAfterEvent__UnorderedGroup_1__Impl"
    // InternalMoniLog4DSL.g:5869:1: rule__BeforeAfterEvent__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) ) ) ) ;
    public final void rule__BeforeAfterEvent__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoniLog4DSL.g:5874:1: ( ( ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) ) ) ) )
            // InternalMoniLog4DSL.g:5875:3: ( ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) ) ) )
            {
            // InternalMoniLog4DSL.g:5875:3: ( ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) ) ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1) ) {
                alt46=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoniLog4DSL.g:5876:3: ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:5876:3: ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) ) )
                    // InternalMoniLog4DSL.g:5877:4: {...}? => ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__BeforeAfterEvent__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoniLog4DSL.g:5877:112: ( ( ( rule__BeforeAfterEvent__Group_1_0__0 ) ) )
                    // InternalMoniLog4DSL.g:5878:5: ( ( rule__BeforeAfterEvent__Group_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoniLog4DSL.g:5884:5: ( ( rule__BeforeAfterEvent__Group_1_0__0 ) )
                    // InternalMoniLog4DSL.g:5885:6: ( rule__BeforeAfterEvent__Group_1_0__0 )
                    {
                     before(grammarAccess.getBeforeAfterEventAccess().getGroup_1_0()); 
                    // InternalMoniLog4DSL.g:5886:6: ( rule__BeforeAfterEvent__Group_1_0__0 )
                    // InternalMoniLog4DSL.g:5886:7: rule__BeforeAfterEvent__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeAfterEvent__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBeforeAfterEventAccess().getGroup_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoniLog4DSL.g:5891:3: ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) ) )
                    {
                    // InternalMoniLog4DSL.g:5891:3: ({...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) ) )
                    // InternalMoniLog4DSL.g:5892:4: {...}? => ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__BeforeAfterEvent__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoniLog4DSL.g:5892:112: ( ( ( rule__BeforeAfterEvent__Group_1_1__0 ) ) )
                    // InternalMoniLog4DSL.g:5893:5: ( ( rule__BeforeAfterEvent__Group_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoniLog4DSL.g:5899:5: ( ( rule__BeforeAfterEvent__Group_1_1__0 ) )
                    // InternalMoniLog4DSL.g:5900:6: ( rule__BeforeAfterEvent__Group_1_1__0 )
                    {
                     before(grammarAccess.getBeforeAfterEventAccess().getGroup_1_1()); 
                    // InternalMoniLog4DSL.g:5901:6: ( rule__BeforeAfterEvent__Group_1_1__0 )
                    // InternalMoniLog4DSL.g:5901:7: rule__BeforeAfterEvent__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeAfterEvent__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBeforeAfterEventAccess().getGroup_1_1()); 

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
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__BeforeAfterEvent__UnorderedGroup_1__0"
    // InternalMoniLog4DSL.g:5914:1: rule__BeforeAfterEvent__UnorderedGroup_1__0 : rule__BeforeAfterEvent__UnorderedGroup_1__Impl ( rule__BeforeAfterEvent__UnorderedGroup_1__1 )? ;
    public final void rule__BeforeAfterEvent__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5918:1: ( rule__BeforeAfterEvent__UnorderedGroup_1__Impl ( rule__BeforeAfterEvent__UnorderedGroup_1__1 )? )
            // InternalMoniLog4DSL.g:5919:2: rule__BeforeAfterEvent__UnorderedGroup_1__Impl ( rule__BeforeAfterEvent__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_51);
            rule__BeforeAfterEvent__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoniLog4DSL.g:5920:2: ( rule__BeforeAfterEvent__UnorderedGroup_1__1 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 36 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getBeforeAfterEventAccess().getUnorderedGroup_1(), 1) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoniLog4DSL.g:5920:2: rule__BeforeAfterEvent__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BeforeAfterEvent__UnorderedGroup_1__1();

                    state._fsp--;


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
    // $ANTLR end "rule__BeforeAfterEvent__UnorderedGroup_1__0"


    // $ANTLR start "rule__BeforeAfterEvent__UnorderedGroup_1__1"
    // InternalMoniLog4DSL.g:5926:1: rule__BeforeAfterEvent__UnorderedGroup_1__1 : rule__BeforeAfterEvent__UnorderedGroup_1__Impl ;
    public final void rule__BeforeAfterEvent__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5930:1: ( rule__BeforeAfterEvent__UnorderedGroup_1__Impl )
            // InternalMoniLog4DSL.g:5931:2: rule__BeforeAfterEvent__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__UnorderedGroup_1__1"


    // $ANTLR start "rule__Model__DefaultLanguageIDAssignment_0_1"
    // InternalMoniLog4DSL.g:5938:1: rule__Model__DefaultLanguageIDAssignment_0_1 : ( ( rule__Model__DefaultLanguageIDAlternatives_0_1_0 ) ) ;
    public final void rule__Model__DefaultLanguageIDAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5942:1: ( ( ( rule__Model__DefaultLanguageIDAlternatives_0_1_0 ) ) )
            // InternalMoniLog4DSL.g:5943:2: ( ( rule__Model__DefaultLanguageIDAlternatives_0_1_0 ) )
            {
            // InternalMoniLog4DSL.g:5943:2: ( ( rule__Model__DefaultLanguageIDAlternatives_0_1_0 ) )
            // InternalMoniLog4DSL.g:5944:3: ( rule__Model__DefaultLanguageIDAlternatives_0_1_0 )
            {
             before(grammarAccess.getModelAccess().getDefaultLanguageIDAlternatives_0_1_0()); 
            // InternalMoniLog4DSL.g:5945:3: ( rule__Model__DefaultLanguageIDAlternatives_0_1_0 )
            // InternalMoniLog4DSL.g:5945:4: rule__Model__DefaultLanguageIDAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Model__DefaultLanguageIDAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getDefaultLanguageIDAlternatives_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__DefaultLanguageIDAssignment_0_1"


    // $ANTLR start "rule__Model__MoniLogSpecsAssignment_1"
    // InternalMoniLog4DSL.g:5953:1: rule__Model__MoniLogSpecsAssignment_1 : ( ruleMoniLogSpec ) ;
    public final void rule__Model__MoniLogSpecsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5957:1: ( ( ruleMoniLogSpec ) )
            // InternalMoniLog4DSL.g:5958:2: ( ruleMoniLogSpec )
            {
            // InternalMoniLog4DSL.g:5958:2: ( ruleMoniLogSpec )
            // InternalMoniLog4DSL.g:5959:3: ruleMoniLogSpec
            {
             before(grammarAccess.getModelAccess().getMoniLogSpecsMoniLogSpecParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMoniLogSpec();

            state._fsp--;

             after(grammarAccess.getModelAccess().getMoniLogSpecsMoniLogSpecParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__MoniLogSpecsAssignment_1"


    // $ANTLR start "rule__MoniLogSpec__NameAssignment_1"
    // InternalMoniLog4DSL.g:5968:1: rule__MoniLogSpec__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MoniLogSpec__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5972:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:5973:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:5973:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:5974:3: RULE_STRING
            {
             before(grammarAccess.getMoniLogSpecAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMoniLogSpecAccess().getNameSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__NameAssignment_1"


    // $ANTLR start "rule__MoniLogSpec__LevelAssignment_2_1"
    // InternalMoniLog4DSL.g:5983:1: rule__MoniLogSpec__LevelAssignment_2_1 : ( ruleLogLevel ) ;
    public final void rule__MoniLogSpec__LevelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:5987:1: ( ( ruleLogLevel ) )
            // InternalMoniLog4DSL.g:5988:2: ( ruleLogLevel )
            {
            // InternalMoniLog4DSL.g:5988:2: ( ruleLogLevel )
            // InternalMoniLog4DSL.g:5989:3: ruleLogLevel
            {
             before(grammarAccess.getMoniLogSpecAccess().getLevelLogLevelEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogLevel();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getLevelLogLevelEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__LevelAssignment_2_1"


    // $ANTLR start "rule__MoniLogSpec__EventsAssignment_4_2"
    // InternalMoniLog4DSL.g:5998:1: rule__MoniLogSpec__EventsAssignment_4_2 : ( ruleEvent ) ;
    public final void rule__MoniLogSpec__EventsAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6002:1: ( ( ruleEvent ) )
            // InternalMoniLog4DSL.g:6003:2: ( ruleEvent )
            {
            // InternalMoniLog4DSL.g:6003:2: ( ruleEvent )
            // InternalMoniLog4DSL.g:6004:3: ruleEvent
            {
             before(grammarAccess.getMoniLogSpecAccess().getEventsEventParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getEventsEventParserRuleCall_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__EventsAssignment_4_2"


    // $ANTLR start "rule__MoniLogSpec__EventsAssignment_4_3_1"
    // InternalMoniLog4DSL.g:6013:1: rule__MoniLogSpec__EventsAssignment_4_3_1 : ( ruleEvent ) ;
    public final void rule__MoniLogSpec__EventsAssignment_4_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6017:1: ( ( ruleEvent ) )
            // InternalMoniLog4DSL.g:6018:2: ( ruleEvent )
            {
            // InternalMoniLog4DSL.g:6018:2: ( ruleEvent )
            // InternalMoniLog4DSL.g:6019:3: ruleEvent
            {
             before(grammarAccess.getMoniLogSpecAccess().getEventsEventParserRuleCall_4_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getEventsEventParserRuleCall_4_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__EventsAssignment_4_3_1"


    // $ANTLR start "rule__MoniLogSpec__ConditionsAssignment_5_2"
    // InternalMoniLog4DSL.g:6028:1: rule__MoniLogSpec__ConditionsAssignment_5_2 : ( ruleCondition ) ;
    public final void rule__MoniLogSpec__ConditionsAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6032:1: ( ( ruleCondition ) )
            // InternalMoniLog4DSL.g:6033:2: ( ruleCondition )
            {
            // InternalMoniLog4DSL.g:6033:2: ( ruleCondition )
            // InternalMoniLog4DSL.g:6034:3: ruleCondition
            {
             before(grammarAccess.getMoniLogSpecAccess().getConditionsConditionParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getConditionsConditionParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__ConditionsAssignment_5_2"


    // $ANTLR start "rule__MoniLogSpec__ConditionsAssignment_5_3_1"
    // InternalMoniLog4DSL.g:6043:1: rule__MoniLogSpec__ConditionsAssignment_5_3_1 : ( ruleCondition ) ;
    public final void rule__MoniLogSpec__ConditionsAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6047:1: ( ( ruleCondition ) )
            // InternalMoniLog4DSL.g:6048:2: ( ruleCondition )
            {
            // InternalMoniLog4DSL.g:6048:2: ( ruleCondition )
            // InternalMoniLog4DSL.g:6049:3: ruleCondition
            {
             before(grammarAccess.getMoniLogSpecAccess().getConditionsConditionParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCondition();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getConditionsConditionParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__ConditionsAssignment_5_3_1"


    // $ANTLR start "rule__MoniLogSpec__ActionsAssignment_8"
    // InternalMoniLog4DSL.g:6058:1: rule__MoniLogSpec__ActionsAssignment_8 : ( ruleAction ) ;
    public final void rule__MoniLogSpec__ActionsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6062:1: ( ( ruleAction ) )
            // InternalMoniLog4DSL.g:6063:2: ( ruleAction )
            {
            // InternalMoniLog4DSL.g:6063:2: ( ruleAction )
            // InternalMoniLog4DSL.g:6064:3: ruleAction
            {
             before(grammarAccess.getMoniLogSpecAccess().getActionsActionParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getActionsActionParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__ActionsAssignment_8"


    // $ANTLR start "rule__MoniLogSpec__ActionsAssignment_9_1"
    // InternalMoniLog4DSL.g:6073:1: rule__MoniLogSpec__ActionsAssignment_9_1 : ( ruleAction ) ;
    public final void rule__MoniLogSpec__ActionsAssignment_9_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6077:1: ( ( ruleAction ) )
            // InternalMoniLog4DSL.g:6078:2: ( ruleAction )
            {
            // InternalMoniLog4DSL.g:6078:2: ( ruleAction )
            // InternalMoniLog4DSL.g:6079:3: ruleAction
            {
             before(grammarAccess.getMoniLogSpecAccess().getActionsActionParserRuleCall_9_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMoniLogSpecAccess().getActionsActionParserRuleCall_9_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MoniLogSpec__ActionsAssignment_9_1"


    // $ANTLR start "rule__BeforeEvent__RuleIDAssignment_1"
    // InternalMoniLog4DSL.g:6088:1: rule__BeforeEvent__RuleIDAssignment_1 : ( ( rule__BeforeEvent__RuleIDAlternatives_1_0 ) ) ;
    public final void rule__BeforeEvent__RuleIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6092:1: ( ( ( rule__BeforeEvent__RuleIDAlternatives_1_0 ) ) )
            // InternalMoniLog4DSL.g:6093:2: ( ( rule__BeforeEvent__RuleIDAlternatives_1_0 ) )
            {
            // InternalMoniLog4DSL.g:6093:2: ( ( rule__BeforeEvent__RuleIDAlternatives_1_0 ) )
            // InternalMoniLog4DSL.g:6094:3: ( rule__BeforeEvent__RuleIDAlternatives_1_0 )
            {
             before(grammarAccess.getBeforeEventAccess().getRuleIDAlternatives_1_0()); 
            // InternalMoniLog4DSL.g:6095:3: ( rule__BeforeEvent__RuleIDAlternatives_1_0 )
            // InternalMoniLog4DSL.g:6095:4: rule__BeforeEvent__RuleIDAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__BeforeEvent__RuleIDAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getBeforeEventAccess().getRuleIDAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__RuleIDAssignment_1"


    // $ANTLR start "rule__BeforeEvent__FrequencyAssignment_2_0_1"
    // InternalMoniLog4DSL.g:6103:1: rule__BeforeEvent__FrequencyAssignment_2_0_1 : ( RULE_INT ) ;
    public final void rule__BeforeEvent__FrequencyAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6107:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6108:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6108:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6109:3: RULE_INT
            {
             before(grammarAccess.getBeforeEventAccess().getFrequencyINTTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBeforeEventAccess().getFrequencyINTTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__FrequencyAssignment_2_0_1"


    // $ANTLR start "rule__BeforeEvent__LimitAssignment_2_1_1"
    // InternalMoniLog4DSL.g:6118:1: rule__BeforeEvent__LimitAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__BeforeEvent__LimitAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6122:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6123:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6123:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6124:3: RULE_INT
            {
             before(grammarAccess.getBeforeEventAccess().getLimitINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBeforeEventAccess().getLimitINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeEvent__LimitAssignment_2_1_1"


    // $ANTLR start "rule__AfterEvent__RuleIDAssignment_1"
    // InternalMoniLog4DSL.g:6133:1: rule__AfterEvent__RuleIDAssignment_1 : ( ( rule__AfterEvent__RuleIDAlternatives_1_0 ) ) ;
    public final void rule__AfterEvent__RuleIDAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6137:1: ( ( ( rule__AfterEvent__RuleIDAlternatives_1_0 ) ) )
            // InternalMoniLog4DSL.g:6138:2: ( ( rule__AfterEvent__RuleIDAlternatives_1_0 ) )
            {
            // InternalMoniLog4DSL.g:6138:2: ( ( rule__AfterEvent__RuleIDAlternatives_1_0 ) )
            // InternalMoniLog4DSL.g:6139:3: ( rule__AfterEvent__RuleIDAlternatives_1_0 )
            {
             before(grammarAccess.getAfterEventAccess().getRuleIDAlternatives_1_0()); 
            // InternalMoniLog4DSL.g:6140:3: ( rule__AfterEvent__RuleIDAlternatives_1_0 )
            // InternalMoniLog4DSL.g:6140:4: rule__AfterEvent__RuleIDAlternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__AfterEvent__RuleIDAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAfterEventAccess().getRuleIDAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__RuleIDAssignment_1"


    // $ANTLR start "rule__AfterEvent__FrequencyAssignment_2_0_1"
    // InternalMoniLog4DSL.g:6148:1: rule__AfterEvent__FrequencyAssignment_2_0_1 : ( RULE_INT ) ;
    public final void rule__AfterEvent__FrequencyAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6152:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6153:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6153:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6154:3: RULE_INT
            {
             before(grammarAccess.getAfterEventAccess().getFrequencyINTTerminalRuleCall_2_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAfterEventAccess().getFrequencyINTTerminalRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__FrequencyAssignment_2_0_1"


    // $ANTLR start "rule__AfterEvent__LimitAssignment_2_1_1"
    // InternalMoniLog4DSL.g:6163:1: rule__AfterEvent__LimitAssignment_2_1_1 : ( RULE_INT ) ;
    public final void rule__AfterEvent__LimitAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6167:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6168:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6168:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6169:3: RULE_INT
            {
             before(grammarAccess.getAfterEventAccess().getLimitINTTerminalRuleCall_2_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAfterEventAccess().getLimitINTTerminalRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AfterEvent__LimitAssignment_2_1_1"


    // $ANTLR start "rule__BeforeAfterEvent__RuleIDAssignment_0"
    // InternalMoniLog4DSL.g:6178:1: rule__BeforeAfterEvent__RuleIDAssignment_0 : ( ( rule__BeforeAfterEvent__RuleIDAlternatives_0_0 ) ) ;
    public final void rule__BeforeAfterEvent__RuleIDAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6182:1: ( ( ( rule__BeforeAfterEvent__RuleIDAlternatives_0_0 ) ) )
            // InternalMoniLog4DSL.g:6183:2: ( ( rule__BeforeAfterEvent__RuleIDAlternatives_0_0 ) )
            {
            // InternalMoniLog4DSL.g:6183:2: ( ( rule__BeforeAfterEvent__RuleIDAlternatives_0_0 ) )
            // InternalMoniLog4DSL.g:6184:3: ( rule__BeforeAfterEvent__RuleIDAlternatives_0_0 )
            {
             before(grammarAccess.getBeforeAfterEventAccess().getRuleIDAlternatives_0_0()); 
            // InternalMoniLog4DSL.g:6185:3: ( rule__BeforeAfterEvent__RuleIDAlternatives_0_0 )
            // InternalMoniLog4DSL.g:6185:4: rule__BeforeAfterEvent__RuleIDAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__BeforeAfterEvent__RuleIDAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getBeforeAfterEventAccess().getRuleIDAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__RuleIDAssignment_0"


    // $ANTLR start "rule__BeforeAfterEvent__FrequencyAssignment_1_0_1"
    // InternalMoniLog4DSL.g:6193:1: rule__BeforeAfterEvent__FrequencyAssignment_1_0_1 : ( RULE_INT ) ;
    public final void rule__BeforeAfterEvent__FrequencyAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6197:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6198:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6198:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6199:3: RULE_INT
            {
             before(grammarAccess.getBeforeAfterEventAccess().getFrequencyINTTerminalRuleCall_1_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBeforeAfterEventAccess().getFrequencyINTTerminalRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__FrequencyAssignment_1_0_1"


    // $ANTLR start "rule__BeforeAfterEvent__LimitAssignment_1_1_1"
    // InternalMoniLog4DSL.g:6208:1: rule__BeforeAfterEvent__LimitAssignment_1_1_1 : ( RULE_INT ) ;
    public final void rule__BeforeAfterEvent__LimitAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6212:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6213:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6213:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6214:3: RULE_INT
            {
             before(grammarAccess.getBeforeAfterEventAccess().getLimitINTTerminalRuleCall_1_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getBeforeAfterEventAccess().getLimitINTTerminalRuleCall_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BeforeAfterEvent__LimitAssignment_1_1_1"


    // $ANTLR start "rule__Condition__PatternAssignment_0_3"
    // InternalMoniLog4DSL.g:6223:1: rule__Condition__PatternAssignment_0_3 : ( ruleTemporalPattern ) ;
    public final void rule__Condition__PatternAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6227:1: ( ( ruleTemporalPattern ) )
            // InternalMoniLog4DSL.g:6228:2: ( ruleTemporalPattern )
            {
            // InternalMoniLog4DSL.g:6228:2: ( ruleTemporalPattern )
            // InternalMoniLog4DSL.g:6229:3: ruleTemporalPattern
            {
             before(grammarAccess.getConditionAccess().getPatternTemporalPatternParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPattern();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getPatternTemporalPatternParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__PatternAssignment_0_3"


    // $ANTLR start "rule__Condition__KindAssignment_0_4_1"
    // InternalMoniLog4DSL.g:6238:1: rule__Condition__KindAssignment_0_4_1 : ( ruleTemporalPropertyConditionKind ) ;
    public final void rule__Condition__KindAssignment_0_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6242:1: ( ( ruleTemporalPropertyConditionKind ) )
            // InternalMoniLog4DSL.g:6243:2: ( ruleTemporalPropertyConditionKind )
            {
            // InternalMoniLog4DSL.g:6243:2: ( ruleTemporalPropertyConditionKind )
            // InternalMoniLog4DSL.g:6244:3: ruleTemporalPropertyConditionKind
            {
             before(grammarAccess.getConditionAccess().getKindTemporalPropertyConditionKindEnumRuleCall_0_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTemporalPropertyConditionKind();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getKindTemporalPropertyConditionKindEnumRuleCall_0_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__KindAssignment_0_4_1"


    // $ANTLR start "rule__Condition__ExpressionAssignment_1_1"
    // InternalMoniLog4DSL.g:6253:1: rule__Condition__ExpressionAssignment_1_1 : ( ruleLanguageExpression ) ;
    public final void rule__Condition__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6257:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:6258:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:6258:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:6259:3: ruleLanguageExpression
            {
             before(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getConditionAccess().getExpressionLanguageExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Condition__ExpressionAssignment_1_1"


    // $ANTLR start "rule__TemporalPattern__PatternAssignment_0"
    // InternalMoniLog4DSL.g:6268:1: rule__TemporalPattern__PatternAssignment_0 : ( rulePattern ) ;
    public final void rule__TemporalPattern__PatternAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6272:1: ( ( rulePattern ) )
            // InternalMoniLog4DSL.g:6273:2: ( rulePattern )
            {
            // InternalMoniLog4DSL.g:6273:2: ( rulePattern )
            // InternalMoniLog4DSL.g:6274:3: rulePattern
            {
             before(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getPatternPatternParserRuleCall_0_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6283:1: rule__TemporalPattern__ScopeAssignment_1 : ( ruleScope ) ;
    public final void rule__TemporalPattern__ScopeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6287:1: ( ( ruleScope ) )
            // InternalMoniLog4DSL.g:6288:2: ( ruleScope )
            {
            // InternalMoniLog4DSL.g:6288:2: ( ruleScope )
            // InternalMoniLog4DSL.g:6289:3: ruleScope
            {
             before(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleScope();

            state._fsp--;

             after(grammarAccess.getTemporalPatternAccess().getScopeScopeParserRuleCall_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Pattern__EventAssignment_0_2"
    // InternalMoniLog4DSL.g:6298:1: rule__Pattern__EventAssignment_0_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6302:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6303:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6303:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6304:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_0_2"


    // $ANTLR start "rule__Pattern__BoundAssignment_1_2"
    // InternalMoniLog4DSL.g:6313:1: rule__Pattern__BoundAssignment_1_2 : ( ruleBoundType ) ;
    public final void rule__Pattern__BoundAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6317:1: ( ( ruleBoundType ) )
            // InternalMoniLog4DSL.g:6318:2: ( ruleBoundType )
            {
            // InternalMoniLog4DSL.g:6318:2: ( ruleBoundType )
            // InternalMoniLog4DSL.g:6319:3: ruleBoundType
            {
             before(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleBoundType();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getBoundBoundTypeParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__BoundAssignment_1_2"


    // $ANTLR start "rule__Pattern__EventAssignment_1_3"
    // InternalMoniLog4DSL.g:6328:1: rule__Pattern__EventAssignment_1_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6332:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6333:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6333:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6334:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_1_3"


    // $ANTLR start "rule__Pattern__EventAssignment_2_2"
    // InternalMoniLog4DSL.g:6343:1: rule__Pattern__EventAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6347:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6348:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6348:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6349:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_2_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6358:1: rule__Pattern__PredecessorAssignment_3_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__PredecessorAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6362:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6363:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6363:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6364:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getPredecessorStreamEventParserRuleCall_3_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6373:1: rule__Pattern__SuccessorAssignment_3_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__SuccessorAssignment_3_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6377:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6378:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6378:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6379:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getSuccessorStreamEventParserRuleCall_3_3_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6388:1: rule__Pattern__EventAssignment_4_1 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__EventAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6392:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6393:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6393:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6394:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getEventStreamEventParserRuleCall_4_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6403:1: rule__Pattern__TriggerAssignment_4_3 : ( ruleStreamEvent ) ;
    public final void rule__Pattern__TriggerAssignment_4_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6407:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6408:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6408:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6409:3: ruleStreamEvent
            {
             before(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getTriggerStreamEventParserRuleCall_4_3_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6418:1: rule__ExactBound__NAssignment : ( RULE_INT ) ;
    public final void rule__ExactBound__NAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6422:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6423:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6423:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6424:3: RULE_INT
            {
             before(grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getExactBoundAccess().getNINTTerminalRuleCall_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6433:1: rule__LowerBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__LowerBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6437:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6438:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6438:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6439:3: RULE_INT
            {
             before(grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLowerBoundAccess().getNINTTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6448:1: rule__UpperBound__NAssignment_1 : ( RULE_INT ) ;
    public final void rule__UpperBound__NAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6452:1: ( ( RULE_INT ) )
            // InternalMoniLog4DSL.g:6453:2: ( RULE_INT )
            {
            // InternalMoniLog4DSL.g:6453:2: ( RULE_INT )
            // InternalMoniLog4DSL.g:6454:3: RULE_INT
            {
             before(grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getUpperBoundAccess().getNINTTerminalRuleCall_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6463:1: rule__Scope__LowerBoundAssignment_1_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6467:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6468:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6468:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6469:3: ruleStreamEvent
            {
             before(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_1_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6478:1: rule__Scope__UpperBoundAssignment_2_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6482:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6483:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6483:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6484:3: ruleStreamEvent
            {
             before(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_2_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6493:1: rule__Scope__LowerBoundAssignment_3_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6497:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6498:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6498:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6499:3: ruleStreamEvent
            {
             before(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_3_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6508:1: rule__Scope__UpperBoundAssignment_3_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_3_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6512:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6513:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6513:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6514:3: ruleStreamEvent
            {
             before(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_3_4_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6523:1: rule__Scope__LowerBoundAssignment_4_2 : ( ruleStreamEvent ) ;
    public final void rule__Scope__LowerBoundAssignment_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6527:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6528:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6528:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6529:3: ruleStreamEvent
            {
             before(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getLowerBoundStreamEventParserRuleCall_4_2_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6538:1: rule__Scope__UpperBoundAssignment_4_4 : ( ruleStreamEvent ) ;
    public final void rule__Scope__UpperBoundAssignment_4_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6542:1: ( ( ruleStreamEvent ) )
            // InternalMoniLog4DSL.g:6543:2: ( ruleStreamEvent )
            {
            // InternalMoniLog4DSL.g:6543:2: ( ruleStreamEvent )
            // InternalMoniLog4DSL.g:6544:3: ruleStreamEvent
            {
             before(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0()); 
            pushFollow(FOLLOW_2);
            ruleStreamEvent();

            state._fsp--;

             after(grammarAccess.getScopeAccess().getUpperBoundStreamEventParserRuleCall_4_4_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__Append__AppenderAssignment_1"
    // InternalMoniLog4DSL.g:6553:1: rule__Append__AppenderAssignment_1 : ( ruleAppender ) ;
    public final void rule__Append__AppenderAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6557:1: ( ( ruleAppender ) )
            // InternalMoniLog4DSL.g:6558:2: ( ruleAppender )
            {
            // InternalMoniLog4DSL.g:6558:2: ( ruleAppender )
            // InternalMoniLog4DSL.g:6559:3: ruleAppender
            {
             before(grammarAccess.getAppendAccess().getAppenderAppenderParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAppender();

            state._fsp--;

             after(grammarAccess.getAppendAccess().getAppenderAppenderParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Append__AppenderAssignment_1"


    // $ANTLR start "rule__StreamAppender__EventAssignment_2"
    // InternalMoniLog4DSL.g:6568:1: rule__StreamAppender__EventAssignment_2 : ( ( rule__StreamAppender__EventAlternatives_2_0 ) ) ;
    public final void rule__StreamAppender__EventAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6572:1: ( ( ( rule__StreamAppender__EventAlternatives_2_0 ) ) )
            // InternalMoniLog4DSL.g:6573:2: ( ( rule__StreamAppender__EventAlternatives_2_0 ) )
            {
            // InternalMoniLog4DSL.g:6573:2: ( ( rule__StreamAppender__EventAlternatives_2_0 ) )
            // InternalMoniLog4DSL.g:6574:3: ( rule__StreamAppender__EventAlternatives_2_0 )
            {
             before(grammarAccess.getStreamAppenderAccess().getEventAlternatives_2_0()); 
            // InternalMoniLog4DSL.g:6575:3: ( rule__StreamAppender__EventAlternatives_2_0 )
            // InternalMoniLog4DSL.g:6575:4: rule__StreamAppender__EventAlternatives_2_0
            {
            pushFollow(FOLLOW_2);
            rule__StreamAppender__EventAlternatives_2_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamAppenderAccess().getEventAlternatives_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__EventAssignment_2"


    // $ANTLR start "rule__StreamAppender__ValuesAssignment_3_1"
    // InternalMoniLog4DSL.g:6583:1: rule__StreamAppender__ValuesAssignment_3_1 : ( ruleLanguageExpression ) ;
    public final void rule__StreamAppender__ValuesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6587:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:6588:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:6588:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:6589:3: ruleLanguageExpression
            {
             before(grammarAccess.getStreamAppenderAccess().getValuesLanguageExpressionParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getStreamAppenderAccess().getValuesLanguageExpressionParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__ValuesAssignment_3_1"


    // $ANTLR start "rule__StreamAppender__ValuesAssignment_3_2_1"
    // InternalMoniLog4DSL.g:6598:1: rule__StreamAppender__ValuesAssignment_3_2_1 : ( ruleLanguageExpression ) ;
    public final void rule__StreamAppender__ValuesAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6602:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:6603:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:6603:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:6604:3: ruleLanguageExpression
            {
             before(grammarAccess.getStreamAppenderAccess().getValuesLanguageExpressionParserRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getStreamAppenderAccess().getValuesLanguageExpressionParserRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamAppender__ValuesAssignment_3_2_1"


    // $ANTLR start "rule__FileAppender__FilenameAssignment_2"
    // InternalMoniLog4DSL.g:6613:1: rule__FileAppender__FilenameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__FileAppender__FilenameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6617:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:6618:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:6618:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:6619:3: RULE_STRING
            {
             before(grammarAccess.getFileAppenderAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFileAppenderAccess().getFilenameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__FilenameAssignment_2"


    // $ANTLR start "rule__FileAppender__LayoutAssignment_4"
    // InternalMoniLog4DSL.g:6628:1: rule__FileAppender__LayoutAssignment_4 : ( ruleLayout ) ;
    public final void rule__FileAppender__LayoutAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6632:1: ( ( ruleLayout ) )
            // InternalMoniLog4DSL.g:6633:2: ( ruleLayout )
            {
            // InternalMoniLog4DSL.g:6633:2: ( ruleLayout )
            // InternalMoniLog4DSL.g:6634:3: ruleLayout
            {
             before(grammarAccess.getFileAppenderAccess().getLayoutLayoutParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getFileAppenderAccess().getLayoutLayoutParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FileAppender__LayoutAssignment_4"


    // $ANTLR start "rule__ConsoleAppender__LayoutAssignment_2"
    // InternalMoniLog4DSL.g:6643:1: rule__ConsoleAppender__LayoutAssignment_2 : ( ruleLayout ) ;
    public final void rule__ConsoleAppender__LayoutAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6647:1: ( ( ruleLayout ) )
            // InternalMoniLog4DSL.g:6648:2: ( ruleLayout )
            {
            // InternalMoniLog4DSL.g:6648:2: ( ruleLayout )
            // InternalMoniLog4DSL.g:6649:3: ruleLayout
            {
             before(grammarAccess.getConsoleAppenderAccess().getLayoutLayoutParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLayout();

            state._fsp--;

             after(grammarAccess.getConsoleAppenderAccess().getLayoutLayoutParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ConsoleAppender__LayoutAssignment_2"


    // $ANTLR start "rule__StringLayout__FormatStringAssignment_0"
    // InternalMoniLog4DSL.g:6658:1: rule__StringLayout__FormatStringAssignment_0 : ( RULE_STRING ) ;
    public final void rule__StringLayout__FormatStringAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6662:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:6663:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:6663:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:6664:3: RULE_STRING
            {
             before(grammarAccess.getStringLayoutAccess().getFormatStringSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLayoutAccess().getFormatStringSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__FormatStringAssignment_0"


    // $ANTLR start "rule__StringLayout__ValuesAssignment_1_1"
    // InternalMoniLog4DSL.g:6673:1: rule__StringLayout__ValuesAssignment_1_1 : ( ruleLanguageExpression ) ;
    public final void rule__StringLayout__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6677:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:6678:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:6678:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:6679:3: ruleLanguageExpression
            {
             before(grammarAccess.getStringLayoutAccess().getValuesLanguageExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getStringLayoutAccess().getValuesLanguageExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringLayout__ValuesAssignment_1_1"


    // $ANTLR start "rule__ExternalLayout__PathAssignment_0"
    // InternalMoniLog4DSL.g:6688:1: rule__ExternalLayout__PathAssignment_0 : ( ruleFQN ) ;
    public final void rule__ExternalLayout__PathAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6692:1: ( ( ruleFQN ) )
            // InternalMoniLog4DSL.g:6693:2: ( ruleFQN )
            {
            // InternalMoniLog4DSL.g:6693:2: ( ruleFQN )
            // InternalMoniLog4DSL.g:6694:3: ruleFQN
            {
             before(grammarAccess.getExternalLayoutAccess().getPathFQNParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFQN();

            state._fsp--;

             after(grammarAccess.getExternalLayoutAccess().getPathFQNParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__PathAssignment_0"


    // $ANTLR start "rule__ExternalLayout__ValuesAssignment_1_1"
    // InternalMoniLog4DSL.g:6703:1: rule__ExternalLayout__ValuesAssignment_1_1 : ( ruleLanguageExpression ) ;
    public final void rule__ExternalLayout__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6707:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:6708:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:6708:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:6709:3: ruleLanguageExpression
            {
             before(grammarAccess.getExternalLayoutAccess().getValuesLanguageExpressionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getExternalLayoutAccess().getValuesLanguageExpressionParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExternalLayout__ValuesAssignment_1_1"


    // $ANTLR start "rule__StreamEvent__EventIdAssignment_0"
    // InternalMoniLog4DSL.g:6718:1: rule__StreamEvent__EventIdAssignment_0 : ( ( rule__StreamEvent__EventIdAlternatives_0_0 ) ) ;
    public final void rule__StreamEvent__EventIdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6722:1: ( ( ( rule__StreamEvent__EventIdAlternatives_0_0 ) ) )
            // InternalMoniLog4DSL.g:6723:2: ( ( rule__StreamEvent__EventIdAlternatives_0_0 ) )
            {
            // InternalMoniLog4DSL.g:6723:2: ( ( rule__StreamEvent__EventIdAlternatives_0_0 ) )
            // InternalMoniLog4DSL.g:6724:3: ( rule__StreamEvent__EventIdAlternatives_0_0 )
            {
             before(grammarAccess.getStreamEventAccess().getEventIdAlternatives_0_0()); 
            // InternalMoniLog4DSL.g:6725:3: ( rule__StreamEvent__EventIdAlternatives_0_0 )
            // InternalMoniLog4DSL.g:6725:4: rule__StreamEvent__EventIdAlternatives_0_0
            {
            pushFollow(FOLLOW_2);
            rule__StreamEvent__EventIdAlternatives_0_0();

            state._fsp--;


            }

             after(grammarAccess.getStreamEventAccess().getEventIdAlternatives_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StreamEvent__EventIdAssignment_0"


    // $ANTLR start "rule__StreamEvent__ValuesAssignment_1_1"
    // InternalMoniLog4DSL.g:6733:1: rule__StreamEvent__ValuesAssignment_1_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6737:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog4DSL.g:6738:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog4DSL.g:6738:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog4DSL.g:6739:3: ruleEmptyOrPropertyValue
            {
             before(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyOrPropertyValue();

            state._fsp--;

             after(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6748:1: rule__StreamEvent__ValuesAssignment_1_2_1 : ( ruleEmptyOrPropertyValue ) ;
    public final void rule__StreamEvent__ValuesAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6752:1: ( ( ruleEmptyOrPropertyValue ) )
            // InternalMoniLog4DSL.g:6753:2: ( ruleEmptyOrPropertyValue )
            {
            // InternalMoniLog4DSL.g:6753:2: ( ruleEmptyOrPropertyValue )
            // InternalMoniLog4DSL.g:6754:3: ruleEmptyOrPropertyValue
            {
             before(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEmptyOrPropertyValue();

            state._fsp--;

             after(grammarAccess.getStreamEventAccess().getValuesEmptyOrPropertyValueParserRuleCall_1_2_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6763:1: rule__EmptyOrPropertyValue__IdAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__EmptyOrPropertyValue__IdAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6767:1: ( ( RULE_ID ) )
            // InternalMoniLog4DSL.g:6768:2: ( RULE_ID )
            {
            // InternalMoniLog4DSL.g:6768:2: ( RULE_ID )
            // InternalMoniLog4DSL.g:6769:3: RULE_ID
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getIdIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEmptyOrPropertyValueAccess().getIdIDTerminalRuleCall_1_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6778:1: rule__EmptyOrPropertyValue__ValueAssignment_1_2_1 : ( ruleLanguageExpression ) ;
    public final void rule__EmptyOrPropertyValue__ValueAssignment_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6782:1: ( ( ruleLanguageExpression ) )
            // InternalMoniLog4DSL.g:6783:2: ( ruleLanguageExpression )
            {
            // InternalMoniLog4DSL.g:6783:2: ( ruleLanguageExpression )
            // InternalMoniLog4DSL.g:6784:3: ruleLanguageExpression
            {
             before(grammarAccess.getEmptyOrPropertyValueAccess().getValueLanguageExpressionParserRuleCall_1_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLanguageExpression();

            state._fsp--;

             after(grammarAccess.getEmptyOrPropertyValueAccess().getValueLanguageExpressionParserRuleCall_1_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__LanguageExpression__LanguageIdAssignment_0_1"
    // InternalMoniLog4DSL.g:6793:1: rule__LanguageExpression__LanguageIdAssignment_0_1 : ( ( rule__LanguageExpression__LanguageIdAlternatives_0_1_0 ) ) ;
    public final void rule__LanguageExpression__LanguageIdAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6797:1: ( ( ( rule__LanguageExpression__LanguageIdAlternatives_0_1_0 ) ) )
            // InternalMoniLog4DSL.g:6798:2: ( ( rule__LanguageExpression__LanguageIdAlternatives_0_1_0 ) )
            {
            // InternalMoniLog4DSL.g:6798:2: ( ( rule__LanguageExpression__LanguageIdAlternatives_0_1_0 ) )
            // InternalMoniLog4DSL.g:6799:3: ( rule__LanguageExpression__LanguageIdAlternatives_0_1_0 )
            {
             before(grammarAccess.getLanguageExpressionAccess().getLanguageIdAlternatives_0_1_0()); 
            // InternalMoniLog4DSL.g:6800:3: ( rule__LanguageExpression__LanguageIdAlternatives_0_1_0 )
            // InternalMoniLog4DSL.g:6800:4: rule__LanguageExpression__LanguageIdAlternatives_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__LanguageExpression__LanguageIdAlternatives_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getLanguageExpressionAccess().getLanguageIdAlternatives_0_1_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6808:1: rule__LanguageExpression__ExpressionAssignment_0_3 : ( RULE_STRING ) ;
    public final void rule__LanguageExpression__ExpressionAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6812:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:6813:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:6813:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:6814:3: RULE_STRING
            {
             before(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_0_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_0_3_0()); 

            }


            }

        }
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
    // InternalMoniLog4DSL.g:6823:1: rule__LanguageExpression__ExpressionAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__LanguageExpression__ExpressionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoniLog4DSL.g:6827:1: ( ( RULE_STRING ) )
            // InternalMoniLog4DSL.g:6828:2: ( RULE_STRING )
            {
            // InternalMoniLog4DSL.g:6828:2: ( RULE_STRING )
            // InternalMoniLog4DSL.g:6829:3: RULE_STRING
            {
             before(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLanguageExpressionAccess().getExpressionSTRINGTerminalRuleCall_1_1_0()); 

            }


            }

        }
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

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\31\uffff";
    static final String dfa_2s = "\1\4\3\uffff\2\33\1\4\2\uffff\1\4\1\53\2\34\2\4\1\46\1\34\1\46\1\34\2\5\2\47\2\34";
    static final String dfa_3s = "\1\52\3\uffff\2\54\1\36\2\uffff\1\36\1\54\2\67\2\5\4\46\2\5\2\47\2\36";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\3\uffff\1\4\1\5\20\uffff";
    static final String dfa_5s = "\31\uffff}>";
    static final String[] dfa_6s = {
            "\1\4\1\5\42\uffff\1\1\1\2\1\3",
            "",
            "",
            "",
            "\1\6\17\uffff\1\7\1\10",
            "\1\6\17\uffff\1\7\1\10",
            "\1\13\27\uffff\1\12\1\uffff\1\11",
            "",
            "",
            "\1\14\27\uffff\1\12\1\uffff\1\11",
            "\1\7\1\10",
            "\1\12\1\uffff\1\11\30\uffff\1\15",
            "\1\12\1\uffff\1\11\30\uffff\1\16",
            "\1\17\1\20",
            "\1\21\1\22",
            "\1\23",
            "\1\12\1\uffff\1\11\7\uffff\1\23",
            "\1\24",
            "\1\12\1\uffff\1\11\7\uffff\1\24",
            "\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\12\1\uffff\1\11",
            "\1\12\1\uffff\1\11"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "891:1: rule__Pattern__Alternatives : ( ( ( rule__Pattern__Group_0__0 ) ) | ( ( rule__Pattern__Group_1__0 ) ) | ( ( rule__Pattern__Group_2__0 ) ) | ( ( rule__Pattern__Group_3__0 ) ) | ( ( rule__Pattern__Group_4__0 ) ) );";
        }
    }
    static final String dfa_7s = "\32\uffff";
    static final String dfa_8s = "\1\1\4\uffff\2\10\4\uffff\1\10\16\uffff";
    static final String dfa_9s = "\1\36\1\uffff\1\4\2\uffff\2\33\1\4\2\uffff\1\4\1\36\2\34\2\4\1\46\1\34\1\46\1\34\2\5\2\47\2\34";
    static final String dfa_10s = "\1\60\1\uffff\1\5\2\uffff\2\62\1\36\2\uffff\1\36\1\62\2\67\2\5\4\46\2\5\2\47\2\36";
    static final String dfa_11s = "\1\uffff\1\1\1\uffff\1\3\1\4\3\uffff\1\2\1\5\20\uffff";
    static final String dfa_12s = "\32\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\1\3\2\uffff\1\2\3\uffff\1\1\7\uffff\1\1\1\4",
            "",
            "\1\5\1\6",
            "",
            "",
            "\1\7\2\uffff\1\10\10\uffff\1\10\12\uffff\1\11",
            "\1\7\2\uffff\1\10\10\uffff\1\10\12\uffff\1\11",
            "\1\14\27\uffff\1\13\1\uffff\1\12",
            "",
            "",
            "\1\15\27\uffff\1\13\1\uffff\1\12",
            "\1\10\10\uffff\1\10\12\uffff\1\11",
            "\1\13\1\uffff\1\12\30\uffff\1\16",
            "\1\13\1\uffff\1\12\30\uffff\1\17",
            "\1\20\1\21",
            "\1\22\1\23",
            "\1\24",
            "\1\13\1\uffff\1\12\7\uffff\1\24",
            "\1\25",
            "\1\13\1\uffff\1\12\7\uffff\1\25",
            "\1\26",
            "\1\27",
            "\1\30",
            "\1\31",
            "\1\13\1\uffff\1\12",
            "\1\13\1\uffff\1\12"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "957:1: rule__Scope__Alternatives : ( ( ( rule__Scope__Group_0__0 ) ) | ( ( rule__Scope__Group_1__0 ) ) | ( ( rule__Scope__Group_2__0 ) ) | ( ( rule__Scope__Group_3__0 ) ) | ( ( rule__Scope__Group_4__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000009000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000A2000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000003F800L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000900000030L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000002000000030L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000001400000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000070000000030L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008040000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0001800900000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000600000000040L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0060002000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000008008000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000600000002L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000001400000002L});

}
