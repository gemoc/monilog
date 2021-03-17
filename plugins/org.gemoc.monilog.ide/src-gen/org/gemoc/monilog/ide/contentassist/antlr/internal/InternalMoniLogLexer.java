package org.gemoc.monilog.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMoniLogLexer extends Lexer {
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
    public static final int RULE_ID=4;
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
    public static final int RULE_STRING=5;
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

    public InternalMoniLogLexer() {;} 
    public InternalMoniLogLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalMoniLogLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalMoniLog.g"; }

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:11:7: ( '@Inactive' )
            // InternalMoniLog.g:11:9: '@Inactive'
            {
            match("@Inactive"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:12:7: ( '@Async' )
            // InternalMoniLog.g:12:9: '@Async'
            {
            match("@Async"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13:7: ( '==' )
            // InternalMoniLog.g:13:9: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:14:7: ( '!=' )
            // InternalMoniLog.g:14:9: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:15:7: ( '>=' )
            // InternalMoniLog.g:15:9: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:16:7: ( '<=' )
            // InternalMoniLog.g:16:9: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:17:7: ( '>' )
            // InternalMoniLog.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:18:7: ( '<' )
            // InternalMoniLog.g:18:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:19:7: ( 'false' )
            // InternalMoniLog.g:19:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:20:7: ( 'INFO' )
            // InternalMoniLog.g:20:9: 'INFO'
            {
            match("INFO"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:21:7: ( 'CONFIG' )
            // InternalMoniLog.g:21:9: 'CONFIG'
            {
            match("CONFIG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:22:7: ( 'FINE' )
            // InternalMoniLog.g:22:9: 'FINE'
            {
            match("FINE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:23:7: ( 'FINER' )
            // InternalMoniLog.g:23:9: 'FINER'
            {
            match("FINER"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:24:7: ( 'FINEST' )
            // InternalMoniLog.g:24:9: 'FINEST'
            {
            match("FINEST"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:25:7: ( 'SEVERE' )
            // InternalMoniLog.g:25:9: 'SEVERE'
            {
            match("SEVERE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:26:7: ( 'WARNING' )
            // InternalMoniLog.g:26:9: 'WARNING'
            {
            match("WARNING"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:27:7: ( 'S' )
            // InternalMoniLog.g:27:9: 'S'
            {
            match('S'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:28:7: ( 'V' )
            // InternalMoniLog.g:28:9: 'V'
            {
            match('V'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:29:7: ( 'nS' )
            // InternalMoniLog.g:29:9: 'nS'
            {
            match("nS"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:30:7: ( 'nV' )
            // InternalMoniLog.g:30:9: 'nV'
            {
            match("nV"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:31:7: ( 'package' )
            // InternalMoniLog.g:31:9: 'package'
            {
            match("package"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:32:7: ( 'import' )
            // InternalMoniLog.g:32:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:33:7: ( 'as' )
            // InternalMoniLog.g:33:9: 'as'
            {
            match("as"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:34:7: ( 'appender' )
            // InternalMoniLog.g:34:9: 'appender'
            {
            match("appender"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:35:7: ( '{' )
            // InternalMoniLog.g:35:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:36:7: ( ';' )
            // InternalMoniLog.g:36:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:37:7: ( '}' )
            // InternalMoniLog.g:37:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:38:7: ( '(' )
            // InternalMoniLog.g:38:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:39:7: ( ')' )
            // InternalMoniLog.g:39:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:40:7: ( 'layout' )
            // InternalMoniLog.g:40:9: 'layout'
            {
            match("layout"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:41:7: ( ',' )
            // InternalMoniLog.g:41:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:42:7: ( '...' )
            // InternalMoniLog.g:42:9: '...'
            {
            match("..."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:43:7: ( 'monilogger' )
            // InternalMoniLog.g:43:9: 'monilogger'
            {
            match("monilogger"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:44:7: ( 'event' )
            // InternalMoniLog.g:44:9: 'event'
            {
            match("event"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:45:7: ( 'actions' )
            // InternalMoniLog.g:45:9: 'actions'
            {
            match("actions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:46:7: ( '[' )
            // InternalMoniLog.g:46:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:47:7: ( ']' )
            // InternalMoniLog.g:47:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:48:7: ( 'conditions' )
            // InternalMoniLog.g:48:9: 'conditions'
            {
            match("conditions"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:49:7: ( 'call' )
            // InternalMoniLog.g:49:9: 'call'
            {
            match("call"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:50:7: ( 'complex' )
            // InternalMoniLog.g:50:9: 'complex'
            {
            match("complex"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:51:7: ( 'custom' )
            // InternalMoniLog.g:51:9: 'custom'
            {
            match("custom"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:52:7: ( 'before' )
            // InternalMoniLog.g:52:9: 'before'
            {
            match("before"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:53:7: ( 'after' )
            // InternalMoniLog.g:53:9: 'after'
            {
            match("after"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:54:7: ( 'exists' )
            // InternalMoniLog.g:54:9: 'exists'
            {
            match("exists"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:55:7: ( 'always' )
            // InternalMoniLog.g:55:9: 'always'
            {
            match("always"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:56:7: ( 'never' )
            // InternalMoniLog.g:56:9: 'never'
            {
            match("never"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:57:7: ( 'precedes' )
            // InternalMoniLog.g:57:9: 'precedes'
            {
            match("precedes"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:58:7: ( 'respondsTo' )
            // InternalMoniLog.g:58:9: 'respondsTo'
            {
            match("respondsTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:59:7: ( 'atleast' )
            // InternalMoniLog.g:59:9: 'atleast'
            {
            match("atleast"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:60:7: ( 'atmost' )
            // InternalMoniLog.g:60:9: 'atmost'
            {
            match("atmost"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:61:7: ( 'globally' )
            // InternalMoniLog.g:61:9: 'globally'
            {
            match("globally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:62:7: ( 'between' )
            // InternalMoniLog.g:62:9: 'between'
            {
            match("between"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:63:7: ( 'and' )
            // InternalMoniLog.g:63:9: 'and'
            {
            match("and"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:64:7: ( 'until' )
            // InternalMoniLog.g:64:9: 'until'
            {
            match("until"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:65:7: ( '.' )
            // InternalMoniLog.g:65:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:66:7: ( 'emit' )
            // InternalMoniLog.g:66:9: 'emit'
            {
            match("emit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:67:7: ( 'start' )
            // InternalMoniLog.g:67:9: 'start'
            {
            match("start"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:68:7: ( 'stop' )
            // InternalMoniLog.g:68:9: 'stop'
            {
            match("stop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:69:7: ( '=' )
            // InternalMoniLog.g:69:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:70:7: ( '?' )
            // InternalMoniLog.g:70:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:71:7: ( ':' )
            // InternalMoniLog.g:71:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:72:7: ( '-' )
            // InternalMoniLog.g:72:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:73:7: ( '!' )
            // InternalMoniLog.g:73:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:74:7: ( 'sizeOf' )
            // InternalMoniLog.g:74:9: 'sizeOf'
            {
            match("sizeOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:75:7: ( '.*' )
            // InternalMoniLog.g:75:9: '.*'
            {
            match(".*"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:76:7: ( '||' )
            // InternalMoniLog.g:76:9: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:77:7: ( '&&' )
            // InternalMoniLog.g:77:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:78:7: ( '+' )
            // InternalMoniLog.g:78:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:79:7: ( '*' )
            // InternalMoniLog.g:79:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:80:7: ( '/' )
            // InternalMoniLog.g:80:9: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:81:7: ( '%' )
            // InternalMoniLog.g:81:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:82:7: ( 'true' )
            // InternalMoniLog.g:82:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "RULE_REAL"
    public final void mRULE_REAL() throws RecognitionException {
        try {
            int _type = RULE_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13455:11: ( RULE_INT '.' RULE_INT )
            // InternalMoniLog.g:13455:13: RULE_INT '.' RULE_INT
            {
            mRULE_INT(); 
            match('.'); 
            mRULE_INT(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13457:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalMoniLog.g:13457:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalMoniLog.g:13457:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMoniLog.g:13457:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalMoniLog.g:13457:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMoniLog.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13459:10: ( ( '0' .. '9' )+ )
            // InternalMoniLog.g:13459:12: ( '0' .. '9' )+
            {
            // InternalMoniLog.g:13459:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMoniLog.g:13459:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13461:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalMoniLog.g:13461:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalMoniLog.g:13461:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMoniLog.g:13461:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalMoniLog.g:13461:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMoniLog.g:13461:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMoniLog.g:13461:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalMoniLog.g:13461:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalMoniLog.g:13461:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalMoniLog.g:13461:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMoniLog.g:13461:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13463:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalMoniLog.g:13463:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalMoniLog.g:13463:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMoniLog.g:13463:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13465:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalMoniLog.g:13465:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalMoniLog.g:13465:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMoniLog.g:13465:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalMoniLog.g:13465:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoniLog.g:13465:41: ( '\\r' )? '\\n'
                    {
                    // InternalMoniLog.g:13465:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalMoniLog.g:13465:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13467:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalMoniLog.g:13467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalMoniLog.g:13467:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMoniLog.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalMoniLog.g:13469:16: ( . )
            // InternalMoniLog.g:13469:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalMoniLog.g:1:8: ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=80;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalMoniLog.g:1:10: T__12
                {
                mT__12(); 

                }
                break;
            case 2 :
                // InternalMoniLog.g:1:16: T__13
                {
                mT__13(); 

                }
                break;
            case 3 :
                // InternalMoniLog.g:1:22: T__14
                {
                mT__14(); 

                }
                break;
            case 4 :
                // InternalMoniLog.g:1:28: T__15
                {
                mT__15(); 

                }
                break;
            case 5 :
                // InternalMoniLog.g:1:34: T__16
                {
                mT__16(); 

                }
                break;
            case 6 :
                // InternalMoniLog.g:1:40: T__17
                {
                mT__17(); 

                }
                break;
            case 7 :
                // InternalMoniLog.g:1:46: T__18
                {
                mT__18(); 

                }
                break;
            case 8 :
                // InternalMoniLog.g:1:52: T__19
                {
                mT__19(); 

                }
                break;
            case 9 :
                // InternalMoniLog.g:1:58: T__20
                {
                mT__20(); 

                }
                break;
            case 10 :
                // InternalMoniLog.g:1:64: T__21
                {
                mT__21(); 

                }
                break;
            case 11 :
                // InternalMoniLog.g:1:70: T__22
                {
                mT__22(); 

                }
                break;
            case 12 :
                // InternalMoniLog.g:1:76: T__23
                {
                mT__23(); 

                }
                break;
            case 13 :
                // InternalMoniLog.g:1:82: T__24
                {
                mT__24(); 

                }
                break;
            case 14 :
                // InternalMoniLog.g:1:88: T__25
                {
                mT__25(); 

                }
                break;
            case 15 :
                // InternalMoniLog.g:1:94: T__26
                {
                mT__26(); 

                }
                break;
            case 16 :
                // InternalMoniLog.g:1:100: T__27
                {
                mT__27(); 

                }
                break;
            case 17 :
                // InternalMoniLog.g:1:106: T__28
                {
                mT__28(); 

                }
                break;
            case 18 :
                // InternalMoniLog.g:1:112: T__29
                {
                mT__29(); 

                }
                break;
            case 19 :
                // InternalMoniLog.g:1:118: T__30
                {
                mT__30(); 

                }
                break;
            case 20 :
                // InternalMoniLog.g:1:124: T__31
                {
                mT__31(); 

                }
                break;
            case 21 :
                // InternalMoniLog.g:1:130: T__32
                {
                mT__32(); 

                }
                break;
            case 22 :
                // InternalMoniLog.g:1:136: T__33
                {
                mT__33(); 

                }
                break;
            case 23 :
                // InternalMoniLog.g:1:142: T__34
                {
                mT__34(); 

                }
                break;
            case 24 :
                // InternalMoniLog.g:1:148: T__35
                {
                mT__35(); 

                }
                break;
            case 25 :
                // InternalMoniLog.g:1:154: T__36
                {
                mT__36(); 

                }
                break;
            case 26 :
                // InternalMoniLog.g:1:160: T__37
                {
                mT__37(); 

                }
                break;
            case 27 :
                // InternalMoniLog.g:1:166: T__38
                {
                mT__38(); 

                }
                break;
            case 28 :
                // InternalMoniLog.g:1:172: T__39
                {
                mT__39(); 

                }
                break;
            case 29 :
                // InternalMoniLog.g:1:178: T__40
                {
                mT__40(); 

                }
                break;
            case 30 :
                // InternalMoniLog.g:1:184: T__41
                {
                mT__41(); 

                }
                break;
            case 31 :
                // InternalMoniLog.g:1:190: T__42
                {
                mT__42(); 

                }
                break;
            case 32 :
                // InternalMoniLog.g:1:196: T__43
                {
                mT__43(); 

                }
                break;
            case 33 :
                // InternalMoniLog.g:1:202: T__44
                {
                mT__44(); 

                }
                break;
            case 34 :
                // InternalMoniLog.g:1:208: T__45
                {
                mT__45(); 

                }
                break;
            case 35 :
                // InternalMoniLog.g:1:214: T__46
                {
                mT__46(); 

                }
                break;
            case 36 :
                // InternalMoniLog.g:1:220: T__47
                {
                mT__47(); 

                }
                break;
            case 37 :
                // InternalMoniLog.g:1:226: T__48
                {
                mT__48(); 

                }
                break;
            case 38 :
                // InternalMoniLog.g:1:232: T__49
                {
                mT__49(); 

                }
                break;
            case 39 :
                // InternalMoniLog.g:1:238: T__50
                {
                mT__50(); 

                }
                break;
            case 40 :
                // InternalMoniLog.g:1:244: T__51
                {
                mT__51(); 

                }
                break;
            case 41 :
                // InternalMoniLog.g:1:250: T__52
                {
                mT__52(); 

                }
                break;
            case 42 :
                // InternalMoniLog.g:1:256: T__53
                {
                mT__53(); 

                }
                break;
            case 43 :
                // InternalMoniLog.g:1:262: T__54
                {
                mT__54(); 

                }
                break;
            case 44 :
                // InternalMoniLog.g:1:268: T__55
                {
                mT__55(); 

                }
                break;
            case 45 :
                // InternalMoniLog.g:1:274: T__56
                {
                mT__56(); 

                }
                break;
            case 46 :
                // InternalMoniLog.g:1:280: T__57
                {
                mT__57(); 

                }
                break;
            case 47 :
                // InternalMoniLog.g:1:286: T__58
                {
                mT__58(); 

                }
                break;
            case 48 :
                // InternalMoniLog.g:1:292: T__59
                {
                mT__59(); 

                }
                break;
            case 49 :
                // InternalMoniLog.g:1:298: T__60
                {
                mT__60(); 

                }
                break;
            case 50 :
                // InternalMoniLog.g:1:304: T__61
                {
                mT__61(); 

                }
                break;
            case 51 :
                // InternalMoniLog.g:1:310: T__62
                {
                mT__62(); 

                }
                break;
            case 52 :
                // InternalMoniLog.g:1:316: T__63
                {
                mT__63(); 

                }
                break;
            case 53 :
                // InternalMoniLog.g:1:322: T__64
                {
                mT__64(); 

                }
                break;
            case 54 :
                // InternalMoniLog.g:1:328: T__65
                {
                mT__65(); 

                }
                break;
            case 55 :
                // InternalMoniLog.g:1:334: T__66
                {
                mT__66(); 

                }
                break;
            case 56 :
                // InternalMoniLog.g:1:340: T__67
                {
                mT__67(); 

                }
                break;
            case 57 :
                // InternalMoniLog.g:1:346: T__68
                {
                mT__68(); 

                }
                break;
            case 58 :
                // InternalMoniLog.g:1:352: T__69
                {
                mT__69(); 

                }
                break;
            case 59 :
                // InternalMoniLog.g:1:358: T__70
                {
                mT__70(); 

                }
                break;
            case 60 :
                // InternalMoniLog.g:1:364: T__71
                {
                mT__71(); 

                }
                break;
            case 61 :
                // InternalMoniLog.g:1:370: T__72
                {
                mT__72(); 

                }
                break;
            case 62 :
                // InternalMoniLog.g:1:376: T__73
                {
                mT__73(); 

                }
                break;
            case 63 :
                // InternalMoniLog.g:1:382: T__74
                {
                mT__74(); 

                }
                break;
            case 64 :
                // InternalMoniLog.g:1:388: T__75
                {
                mT__75(); 

                }
                break;
            case 65 :
                // InternalMoniLog.g:1:394: T__76
                {
                mT__76(); 

                }
                break;
            case 66 :
                // InternalMoniLog.g:1:400: T__77
                {
                mT__77(); 

                }
                break;
            case 67 :
                // InternalMoniLog.g:1:406: T__78
                {
                mT__78(); 

                }
                break;
            case 68 :
                // InternalMoniLog.g:1:412: T__79
                {
                mT__79(); 

                }
                break;
            case 69 :
                // InternalMoniLog.g:1:418: T__80
                {
                mT__80(); 

                }
                break;
            case 70 :
                // InternalMoniLog.g:1:424: T__81
                {
                mT__81(); 

                }
                break;
            case 71 :
                // InternalMoniLog.g:1:430: T__82
                {
                mT__82(); 

                }
                break;
            case 72 :
                // InternalMoniLog.g:1:436: T__83
                {
                mT__83(); 

                }
                break;
            case 73 :
                // InternalMoniLog.g:1:442: RULE_REAL
                {
                mRULE_REAL(); 

                }
                break;
            case 74 :
                // InternalMoniLog.g:1:452: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 75 :
                // InternalMoniLog.g:1:460: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 76 :
                // InternalMoniLog.g:1:469: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 77 :
                // InternalMoniLog.g:1:481: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 78 :
                // InternalMoniLog.g:1:497: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 79 :
                // InternalMoniLog.g:1:513: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 80 :
                // InternalMoniLog.g:1:521: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\63\1\67\1\71\1\73\1\75\4\77\1\104\1\77\1\106\4\77\5\uffff\1\77\1\uffff\1\135\2\77\2\uffff\6\77\3\uffff\2\63\2\uffff\1\166\1\uffff\1\77\1\171\1\63\1\uffff\2\63\14\uffff\1\77\1\uffff\4\77\1\uffff\1\77\1\uffff\1\u0084\1\u0085\4\77\1\u008a\6\77\5\uffff\1\77\4\uffff\4\77\2\uffff\11\77\13\uffff\1\77\1\uffff\1\171\3\uffff\6\77\2\uffff\4\77\1\uffff\6\77\1\u00b4\23\77\1\u00c8\1\77\1\u00cc\14\77\1\uffff\4\77\1\u00dd\2\77\1\u00e0\7\77\1\u00e8\1\77\1\u00ea\1\u00eb\1\uffff\1\77\1\u00ed\1\77\1\uffff\2\77\1\u00f1\5\77\1\u00f7\5\77\1\u00fd\1\77\1\uffff\2\77\1\uffff\5\77\1\u0106\1\u0107\1\uffff\1\77\2\uffff\1\u0109\1\uffff\1\u010a\1\u010b\1\77\1\uffff\2\77\1\u010f\2\77\1\uffff\1\u0112\1\77\1\u0114\1\u0115\1\77\1\uffff\1\u0117\2\77\1\u011a\1\u011b\3\77\2\uffff\1\u011f\3\uffff\1\u0120\1\u0121\1\77\1\uffff\1\77\1\u0124\1\uffff\1\u0125\2\uffff\1\77\1\uffff\1\77\1\u0128\2\uffff\1\u0129\2\77\3\uffff\1\u012c\1\u012d\2\uffff\2\77\2\uffff\1\77\1\u0131\2\uffff\3\77\1\uffff\1\u0135\1\u0136\1\u0137\3\uffff";
    static final String DFA12_eofS =
        "\u0138\uffff";
    static final String DFA12_minS =
        "\1\0\1\101\4\75\1\141\1\116\1\117\1\111\1\60\1\101\1\60\1\123\1\141\1\155\1\143\5\uffff\1\141\1\uffff\1\52\1\157\1\155\2\uffff\1\141\2\145\1\154\1\156\1\151\3\uffff\1\174\1\46\2\uffff\1\52\1\uffff\1\162\1\56\1\101\1\uffff\2\0\14\uffff\1\154\1\uffff\1\106\2\116\1\126\1\uffff\1\122\1\uffff\2\60\1\166\1\143\1\145\1\160\1\60\1\160\2\164\1\167\1\154\1\144\5\uffff\1\171\4\uffff\1\156\1\145\2\151\2\uffff\1\155\1\154\1\163\1\146\1\163\1\157\1\164\1\141\1\172\13\uffff\1\165\1\uffff\1\56\3\uffff\1\163\1\117\1\106\2\105\1\116\2\uffff\1\145\1\153\1\143\1\157\1\uffff\1\145\1\151\1\145\1\141\1\145\1\157\1\60\1\157\1\151\1\156\1\163\1\164\1\144\1\160\1\154\1\164\1\157\1\167\1\160\1\142\1\151\1\162\1\160\3\145\1\60\1\111\1\60\1\122\1\111\1\162\1\141\1\145\1\162\1\156\1\157\1\162\1\171\1\141\1\163\1\uffff\1\165\1\154\2\164\1\60\1\151\1\154\1\60\1\157\1\162\1\145\1\157\1\141\1\154\1\164\1\60\1\117\2\60\1\uffff\1\107\1\60\1\124\1\uffff\1\105\1\116\1\60\1\147\1\144\1\164\1\144\1\156\1\60\2\163\2\164\1\157\1\60\1\163\1\uffff\1\164\1\145\1\uffff\1\155\2\145\1\156\1\154\2\60\1\uffff\1\146\2\uffff\1\60\1\uffff\2\60\1\107\1\uffff\2\145\1\60\1\145\1\163\1\uffff\1\60\1\164\2\60\1\147\1\uffff\1\60\1\151\1\170\2\60\1\156\1\144\1\154\2\uffff\1\60\3\uffff\2\60\1\163\1\uffff\1\162\1\60\1\uffff\1\60\2\uffff\1\147\1\uffff\1\157\1\60\2\uffff\1\60\1\163\1\171\3\uffff\2\60\2\uffff\1\145\1\156\2\uffff\1\124\1\60\2\uffff\1\162\1\163\1\157\1\uffff\3\60\3\uffff";
    static final String DFA12_maxS =
        "\1\uffff\1\111\4\75\1\141\1\116\1\117\1\111\1\172\1\101\1\172\1\145\1\162\1\155\1\164\5\uffff\1\141\1\uffff\1\56\1\157\1\170\2\uffff\1\165\2\145\1\154\1\156\1\164\3\uffff\1\174\1\46\2\uffff\1\57\1\uffff\1\162\1\71\1\172\1\uffff\2\uffff\14\uffff\1\154\1\uffff\1\106\2\116\1\126\1\uffff\1\122\1\uffff\2\172\1\166\1\143\1\145\1\160\1\172\1\160\2\164\1\167\1\155\1\144\5\uffff\1\171\4\uffff\1\156\1\145\2\151\2\uffff\1\156\1\154\1\163\1\164\1\163\1\157\1\164\1\157\1\172\13\uffff\1\165\1\uffff\1\71\3\uffff\1\163\1\117\1\106\2\105\1\116\2\uffff\1\145\1\153\1\143\1\157\1\uffff\1\145\1\151\1\145\1\141\1\145\1\157\1\172\1\157\1\151\1\156\1\163\1\164\1\144\1\160\1\154\1\164\1\157\1\167\1\160\1\142\1\151\1\162\1\160\3\145\1\172\1\111\1\172\1\122\1\111\1\162\1\141\1\145\1\162\1\156\1\157\1\162\1\171\1\141\1\163\1\uffff\1\165\1\154\2\164\1\172\1\151\1\154\1\172\1\157\1\162\1\145\1\157\1\141\1\154\1\164\1\172\1\117\2\172\1\uffff\1\107\1\172\1\124\1\uffff\1\105\1\116\1\172\1\147\1\144\1\164\1\144\1\156\1\172\2\163\2\164\1\157\1\172\1\163\1\uffff\1\164\1\145\1\uffff\1\155\2\145\1\156\1\154\2\172\1\uffff\1\146\2\uffff\1\172\1\uffff\2\172\1\107\1\uffff\2\145\1\172\1\145\1\163\1\uffff\1\172\1\164\2\172\1\147\1\uffff\1\172\1\151\1\170\2\172\1\156\1\144\1\154\2\uffff\1\172\3\uffff\2\172\1\163\1\uffff\1\162\1\172\1\uffff\1\172\2\uffff\1\147\1\uffff\1\157\1\172\2\uffff\1\172\1\163\1\171\3\uffff\2\172\2\uffff\1\145\1\156\2\uffff\1\124\1\172\2\uffff\1\162\1\163\1\157\1\uffff\3\172\3\uffff";
    static final String DFA12_acceptS =
        "\21\uffff\1\31\1\32\1\33\1\34\1\35\1\uffff\1\37\3\uffff\1\44\1\45\6\uffff\1\74\1\75\1\76\2\uffff\1\104\1\105\1\uffff\1\107\3\uffff\1\112\2\uffff\1\117\1\120\1\1\1\2\1\3\1\73\1\4\1\77\1\5\1\7\1\6\1\10\1\uffff\1\112\4\uffff\1\21\1\uffff\1\22\15\uffff\1\31\1\32\1\33\1\34\1\35\1\uffff\1\37\1\40\1\101\1\67\4\uffff\1\44\1\45\11\uffff\1\74\1\75\1\76\1\102\1\103\1\104\1\105\1\115\1\116\1\106\1\107\1\uffff\1\113\1\uffff\1\111\1\114\1\117\6\uffff\1\23\1\24\4\uffff\1\27\51\uffff\1\65\23\uffff\1\12\3\uffff\1\14\20\uffff\1\70\2\uffff\1\47\7\uffff\1\72\1\uffff\1\110\1\11\1\uffff\1\15\3\uffff\1\56\5\uffff\1\53\5\uffff\1\42\10\uffff\1\66\1\71\1\uffff\1\13\1\16\1\17\3\uffff\1\26\2\uffff\1\55\1\uffff\1\62\1\36\1\uffff\1\54\2\uffff\1\51\1\52\3\uffff\1\100\1\20\1\25\2\uffff\1\43\1\61\2\uffff\1\50\1\64\2\uffff\1\57\1\30\3\uffff\1\63\3\uffff\1\41\1\46\1\60";
    static final String DFA12_specialS =
        "\1\2\57\uffff\1\0\1\1\u0106\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\63\2\62\2\63\1\62\22\63\1\62\1\3\1\60\2\63\1\53\1\47\1\61\1\24\1\25\1\51\1\50\1\27\1\45\1\30\1\52\12\55\1\44\1\22\1\5\1\2\1\4\1\43\1\1\2\57\1\10\2\57\1\11\2\57\1\7\11\57\1\12\2\57\1\14\1\13\3\57\1\33\1\63\1\34\1\56\1\57\1\63\1\20\1\36\1\35\1\57\1\32\1\6\1\40\1\57\1\17\2\57\1\26\1\31\1\15\1\57\1\16\1\57\1\37\1\42\1\54\1\41\5\57\1\21\1\46\1\23\uff82\63",
            "\1\65\7\uffff\1\64",
            "\1\66",
            "\1\70",
            "\1\72",
            "\1\74",
            "\1\76",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\77\7\uffff\4\77\1\103\25\77\4\uffff\1\77\1\uffff\32\77",
            "\1\105",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\107\2\uffff\1\110\16\uffff\1\111",
            "\1\112\20\uffff\1\113",
            "\1\114",
            "\1\117\2\uffff\1\120\5\uffff\1\121\1\uffff\1\123\1\uffff\1\116\2\uffff\1\115\1\122",
            "",
            "",
            "",
            "",
            "",
            "\1\131",
            "",
            "\1\134\3\uffff\1\133",
            "\1\136",
            "\1\141\10\uffff\1\137\1\uffff\1\140",
            "",
            "",
            "\1\145\15\uffff\1\144\5\uffff\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\154\12\uffff\1\153",
            "",
            "",
            "",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\164\4\uffff\1\165",
            "",
            "\1\170",
            "\1\173\1\uffff\12\172",
            "\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\0\174",
            "\0\174",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\176",
            "",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "",
            "\1\u0083",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f\1\u0090",
            "\1\u0091",
            "",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "",
            "",
            "",
            "",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "",
            "",
            "\1\u0098\1\u0097",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b\15\uffff\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0\15\uffff\1\u00a1",
            "\1\u00a2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a3",
            "",
            "\1\173\1\uffff\12\172",
            "",
            "",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "",
            "",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00c9",
            "\12\77\7\uffff\21\77\1\u00ca\1\u00cb\7\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00de",
            "\1\u00df",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00e9",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u00ec",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\1\u0108",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u010c",
            "",
            "\1\u010d",
            "\1\u010e",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0110",
            "\1\u0111",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0113",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0116",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0118",
            "\1\u0119",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u0122",
            "",
            "\1\u0123",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\1\u0126",
            "",
            "\1\u0127",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\1\u012a",
            "\1\u012b",
            "",
            "",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\1\u012e",
            "\1\u012f",
            "",
            "",
            "\1\u0130",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "\12\77\7\uffff\32\77\4\uffff\1\77\1\uffff\32\77",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | RULE_REAL | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_48 = input.LA(1);

                        s = -1;
                        if ( ((LA12_48>='\u0000' && LA12_48<='\uFFFF')) ) {s = 124;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_49 = input.LA(1);

                        s = -1;
                        if ( ((LA12_49>='\u0000' && LA12_49<='\uFFFF')) ) {s = 124;}

                        else s = 51;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='@') ) {s = 1;}

                        else if ( (LA12_0=='=') ) {s = 2;}

                        else if ( (LA12_0=='!') ) {s = 3;}

                        else if ( (LA12_0=='>') ) {s = 4;}

                        else if ( (LA12_0=='<') ) {s = 5;}

                        else if ( (LA12_0=='f') ) {s = 6;}

                        else if ( (LA12_0=='I') ) {s = 7;}

                        else if ( (LA12_0=='C') ) {s = 8;}

                        else if ( (LA12_0=='F') ) {s = 9;}

                        else if ( (LA12_0=='S') ) {s = 10;}

                        else if ( (LA12_0=='W') ) {s = 11;}

                        else if ( (LA12_0=='V') ) {s = 12;}

                        else if ( (LA12_0=='n') ) {s = 13;}

                        else if ( (LA12_0=='p') ) {s = 14;}

                        else if ( (LA12_0=='i') ) {s = 15;}

                        else if ( (LA12_0=='a') ) {s = 16;}

                        else if ( (LA12_0=='{') ) {s = 17;}

                        else if ( (LA12_0==';') ) {s = 18;}

                        else if ( (LA12_0=='}') ) {s = 19;}

                        else if ( (LA12_0=='(') ) {s = 20;}

                        else if ( (LA12_0==')') ) {s = 21;}

                        else if ( (LA12_0=='l') ) {s = 22;}

                        else if ( (LA12_0==',') ) {s = 23;}

                        else if ( (LA12_0=='.') ) {s = 24;}

                        else if ( (LA12_0=='m') ) {s = 25;}

                        else if ( (LA12_0=='e') ) {s = 26;}

                        else if ( (LA12_0=='[') ) {s = 27;}

                        else if ( (LA12_0==']') ) {s = 28;}

                        else if ( (LA12_0=='c') ) {s = 29;}

                        else if ( (LA12_0=='b') ) {s = 30;}

                        else if ( (LA12_0=='r') ) {s = 31;}

                        else if ( (LA12_0=='g') ) {s = 32;}

                        else if ( (LA12_0=='u') ) {s = 33;}

                        else if ( (LA12_0=='s') ) {s = 34;}

                        else if ( (LA12_0=='?') ) {s = 35;}

                        else if ( (LA12_0==':') ) {s = 36;}

                        else if ( (LA12_0=='-') ) {s = 37;}

                        else if ( (LA12_0=='|') ) {s = 38;}

                        else if ( (LA12_0=='&') ) {s = 39;}

                        else if ( (LA12_0=='+') ) {s = 40;}

                        else if ( (LA12_0=='*') ) {s = 41;}

                        else if ( (LA12_0=='/') ) {s = 42;}

                        else if ( (LA12_0=='%') ) {s = 43;}

                        else if ( (LA12_0=='t') ) {s = 44;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 45;}

                        else if ( (LA12_0=='^') ) {s = 46;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||(LA12_0>='D' && LA12_0<='E')||(LA12_0>='G' && LA12_0<='H')||(LA12_0>='J' && LA12_0<='R')||(LA12_0>='T' && LA12_0<='U')||(LA12_0>='X' && LA12_0<='Z')||LA12_0=='_'||LA12_0=='d'||LA12_0=='h'||(LA12_0>='j' && LA12_0<='k')||LA12_0=='o'||LA12_0=='q'||(LA12_0>='v' && LA12_0<='z')) ) {s = 47;}

                        else if ( (LA12_0=='\"') ) {s = 48;}

                        else if ( (LA12_0=='\'') ) {s = 49;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 50;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||(LA12_0>='#' && LA12_0<='$')||LA12_0=='\\'||LA12_0=='`'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 51;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}