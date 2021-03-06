package gw4e.eclipse.dsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDSLPoliciesLexer extends Lexer {
    public static final int RULE_HEX=11;
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=9;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_NEWLINE=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int RULE_FORMAT_COMMENT=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int RULE_DECIMAL=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int RULE_SEV=7;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=8;
    public static final int RULE_ANY_OTHER=15;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators

    public InternalDSLPoliciesLexer() {;} 
    public InternalDSLPoliciesLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDSLPoliciesLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalDSLPolicies.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:11:7: ( '=' )
            // InternalDSLPolicies.g:11:9: '='
            {
            match('='); 

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
            // InternalDSLPolicies.g:12:7: ( '.json' )
            // InternalDSLPolicies.g:12:9: '.json'
            {
            match(".json"); 


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
            // InternalDSLPolicies.g:13:7: ( '.graphml' )
            // InternalDSLPolicies.g:13:9: '.graphml'
            {
            match(".graphml"); 


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
            // InternalDSLPolicies.g:14:7: ( 'nocheck' )
            // InternalDSLPolicies.g:14:9: 'nocheck'
            {
            match("nocheck"); 


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
            // InternalDSLPolicies.g:15:7: ( 'sync' )
            // InternalDSLPolicies.g:15:9: 'sync'
            {
            match("sync"); 


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
            // InternalDSLPolicies.g:16:7: ( ' ' )
            // InternalDSLPolicies.g:16:9: ' '
            {
            match(' '); 

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
            // InternalDSLPolicies.g:17:7: ( ';' )
            // InternalDSLPolicies.g:17:9: ';'
            {
            match(';'); 

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
            // InternalDSLPolicies.g:18:7: ( '(' )
            // InternalDSLPolicies.g:18:9: '('
            {
            match('('); 

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
            // InternalDSLPolicies.g:19:7: ( ')' )
            // InternalDSLPolicies.g:19:9: ')'
            {
            match(')'); 

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
            // InternalDSLPolicies.g:20:7: ( 'random' )
            // InternalDSLPolicies.g:20:9: 'random'
            {
            match("random"); 


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
            // InternalDSLPolicies.g:21:7: ( 'RandomPath' )
            // InternalDSLPolicies.g:21:9: 'RandomPath'
            {
            match("RandomPath"); 


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
            // InternalDSLPolicies.g:22:7: ( 'quick_random' )
            // InternalDSLPolicies.g:22:9: 'quick_random'
            {
            match("quick_random"); 


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
            // InternalDSLPolicies.g:23:7: ( 'QuickRandomPath' )
            // InternalDSLPolicies.g:23:9: 'QuickRandomPath'
            {
            match("QuickRandomPath"); 


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
            // InternalDSLPolicies.g:24:7: ( 'a_star' )
            // InternalDSLPolicies.g:24:9: 'a_star'
            {
            match("a_star"); 


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
            // InternalDSLPolicies.g:25:7: ( 'AStarPath' )
            // InternalDSLPolicies.g:25:9: 'AStarPath'
            {
            match("AStarPath"); 


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
            // InternalDSLPolicies.g:26:7: ( 'weighted_random' )
            // InternalDSLPolicies.g:26:9: 'weighted_random'
            {
            match("weighted_random"); 


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
            // InternalDSLPolicies.g:27:7: ( 'WeightedRandomPath' )
            // InternalDSLPolicies.g:27:9: 'WeightedRandomPath'
            {
            match("WeightedRandomPath"); 


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
            // InternalDSLPolicies.g:28:7: ( 'time_duration' )
            // InternalDSLPolicies.g:28:9: 'time_duration'
            {
            match("time_duration"); 


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
            // InternalDSLPolicies.g:29:7: ( 'TimeDuration' )
            // InternalDSLPolicies.g:29:9: 'TimeDuration'
            {
            match("TimeDuration"); 


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
            // InternalDSLPolicies.g:30:7: ( 'dependency_edge_coverage' )
            // InternalDSLPolicies.g:30:9: 'dependency_edge_coverage'
            {
            match("dependency_edge_coverage"); 


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
            // InternalDSLPolicies.g:31:7: ( 'DependencyEdgeCoverage' )
            // InternalDSLPolicies.g:31:9: 'DependencyEdgeCoverage'
            {
            match("DependencyEdgeCoverage"); 


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
            // InternalDSLPolicies.g:32:7: ( 'edge_coverage' )
            // InternalDSLPolicies.g:32:9: 'edge_coverage'
            {
            match("edge_coverage"); 


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
            // InternalDSLPolicies.g:33:7: ( 'EdgeCoverage' )
            // InternalDSLPolicies.g:33:9: 'EdgeCoverage'
            {
            match("EdgeCoverage"); 


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
            // InternalDSLPolicies.g:34:7: ( 'vertex_coverage' )
            // InternalDSLPolicies.g:34:9: 'vertex_coverage'
            {
            match("vertex_coverage"); 


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
            // InternalDSLPolicies.g:35:7: ( 'VertexCoverage' )
            // InternalDSLPolicies.g:35:9: 'VertexCoverage'
            {
            match("VertexCoverage"); 


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
            // InternalDSLPolicies.g:36:7: ( 'requirement_coverage' )
            // InternalDSLPolicies.g:36:9: 'requirement_coverage'
            {
            match("requirement_coverage"); 


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
            // InternalDSLPolicies.g:37:7: ( 'RequirementCoverage' )
            // InternalDSLPolicies.g:37:9: 'RequirementCoverage'
            {
            match("RequirementCoverage"); 


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
            // InternalDSLPolicies.g:38:7: ( 'reached_vertex' )
            // InternalDSLPolicies.g:38:9: 'reached_vertex'
            {
            match("reached_vertex"); 


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
            // InternalDSLPolicies.g:39:7: ( 'ReachedVertex' )
            // InternalDSLPolicies.g:39:9: 'ReachedVertex'
            {
            match("ReachedVertex"); 


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
            // InternalDSLPolicies.g:40:7: ( 'reached_edge' )
            // InternalDSLPolicies.g:40:9: 'reached_edge'
            {
            match("reached_edge"); 


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
            // InternalDSLPolicies.g:41:7: ( 'ReachedEdge' )
            // InternalDSLPolicies.g:41:9: 'ReachedEdge'
            {
            match("ReachedEdge"); 


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
            // InternalDSLPolicies.g:42:7: ( '+=' )
            // InternalDSLPolicies.g:42:9: '+='
            {
            match("+="); 


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
            // InternalDSLPolicies.g:43:7: ( '-=' )
            // InternalDSLPolicies.g:43:9: '-='
            {
            match("-="); 


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
            // InternalDSLPolicies.g:44:7: ( '*=' )
            // InternalDSLPolicies.g:44:9: '*='
            {
            match("*="); 


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
            // InternalDSLPolicies.g:45:7: ( '/=' )
            // InternalDSLPolicies.g:45:9: '/='
            {
            match("/="); 


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
            // InternalDSLPolicies.g:46:7: ( '%=' )
            // InternalDSLPolicies.g:46:9: '%='
            {
            match("%="); 


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
            // InternalDSLPolicies.g:47:7: ( '<' )
            // InternalDSLPolicies.g:47:9: '<'
            {
            match('<'); 

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
            // InternalDSLPolicies.g:48:7: ( '>' )
            // InternalDSLPolicies.g:48:9: '>'
            {
            match('>'); 

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
            // InternalDSLPolicies.g:49:7: ( '>=' )
            // InternalDSLPolicies.g:49:9: '>='
            {
            match(">="); 


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
            // InternalDSLPolicies.g:50:7: ( '||' )
            // InternalDSLPolicies.g:50:9: '||'
            {
            match("||"); 


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
            // InternalDSLPolicies.g:51:7: ( '&&' )
            // InternalDSLPolicies.g:51:9: '&&'
            {
            match("&&"); 


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
            // InternalDSLPolicies.g:52:7: ( '==' )
            // InternalDSLPolicies.g:52:9: '=='
            {
            match("=="); 


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
            // InternalDSLPolicies.g:53:7: ( '!=' )
            // InternalDSLPolicies.g:53:9: '!='
            {
            match("!="); 


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
            // InternalDSLPolicies.g:54:7: ( '===' )
            // InternalDSLPolicies.g:54:9: '==='
            {
            match("==="); 


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
            // InternalDSLPolicies.g:55:7: ( '!==' )
            // InternalDSLPolicies.g:55:9: '!=='
            {
            match("!=="); 


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
            // InternalDSLPolicies.g:56:7: ( 'instanceof' )
            // InternalDSLPolicies.g:56:9: 'instanceof'
            {
            match("instanceof"); 


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
            // InternalDSLPolicies.g:57:7: ( '->' )
            // InternalDSLPolicies.g:57:9: '->'
            {
            match("->"); 


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
            // InternalDSLPolicies.g:58:7: ( '..<' )
            // InternalDSLPolicies.g:58:9: '..<'
            {
            match("..<"); 


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
            // InternalDSLPolicies.g:59:7: ( '..' )
            // InternalDSLPolicies.g:59:9: '..'
            {
            match(".."); 


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
            // InternalDSLPolicies.g:60:7: ( '=>' )
            // InternalDSLPolicies.g:60:9: '=>'
            {
            match("=>"); 


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
            // InternalDSLPolicies.g:61:7: ( '<>' )
            // InternalDSLPolicies.g:61:9: '<>'
            {
            match("<>"); 


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
            // InternalDSLPolicies.g:62:7: ( '?:' )
            // InternalDSLPolicies.g:62:9: '?:'
            {
            match("?:"); 


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
            // InternalDSLPolicies.g:63:7: ( '+' )
            // InternalDSLPolicies.g:63:9: '+'
            {
            match('+'); 

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
            // InternalDSLPolicies.g:64:7: ( '-' )
            // InternalDSLPolicies.g:64:9: '-'
            {
            match('-'); 

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
            // InternalDSLPolicies.g:65:7: ( '*' )
            // InternalDSLPolicies.g:65:9: '*'
            {
            match('*'); 

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
            // InternalDSLPolicies.g:66:7: ( '**' )
            // InternalDSLPolicies.g:66:9: '**'
            {
            match("**"); 


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
            // InternalDSLPolicies.g:67:7: ( '/' )
            // InternalDSLPolicies.g:67:9: '/'
            {
            match('/'); 

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
            // InternalDSLPolicies.g:68:7: ( '%' )
            // InternalDSLPolicies.g:68:9: '%'
            {
            match('%'); 

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
            // InternalDSLPolicies.g:69:7: ( '!' )
            // InternalDSLPolicies.g:69:9: '!'
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
            // InternalDSLPolicies.g:70:7: ( 'as' )
            // InternalDSLPolicies.g:70:9: 'as'
            {
            match("as"); 


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
            // InternalDSLPolicies.g:71:7: ( '++' )
            // InternalDSLPolicies.g:71:9: '++'
            {
            match("++"); 


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
            // InternalDSLPolicies.g:72:7: ( '--' )
            // InternalDSLPolicies.g:72:9: '--'
            {
            match("--"); 


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
            // InternalDSLPolicies.g:73:7: ( '.' )
            // InternalDSLPolicies.g:73:9: '.'
            {
            match('.'); 

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
            // InternalDSLPolicies.g:74:7: ( '::' )
            // InternalDSLPolicies.g:74:9: '::'
            {
            match("::"); 


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
            // InternalDSLPolicies.g:75:7: ( '?.' )
            // InternalDSLPolicies.g:75:9: '?.'
            {
            match("?."); 


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
            // InternalDSLPolicies.g:76:7: ( ',' )
            // InternalDSLPolicies.g:76:9: ','
            {
            match(','); 

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
            // InternalDSLPolicies.g:77:7: ( '#' )
            // InternalDSLPolicies.g:77:9: '#'
            {
            match('#'); 

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
            // InternalDSLPolicies.g:78:7: ( '{' )
            // InternalDSLPolicies.g:78:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:79:7: ( '}' )
            // InternalDSLPolicies.g:79:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:80:7: ( '[' )
            // InternalDSLPolicies.g:80:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:81:7: ( ']' )
            // InternalDSLPolicies.g:81:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:82:7: ( '|' )
            // InternalDSLPolicies.g:82:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:83:7: ( 'if' )
            // InternalDSLPolicies.g:83:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:84:7: ( 'else' )
            // InternalDSLPolicies.g:84:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:85:7: ( 'switch' )
            // InternalDSLPolicies.g:85:9: 'switch'
            {
            match("switch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:86:7: ( ':' )
            // InternalDSLPolicies.g:86:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:87:7: ( 'default' )
            // InternalDSLPolicies.g:87:9: 'default'
            {
            match("default"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:88:7: ( 'case' )
            // InternalDSLPolicies.g:88:9: 'case'
            {
            match("case"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:89:7: ( 'for' )
            // InternalDSLPolicies.g:89:9: 'for'
            {
            match("for"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "T__95"
    public final void mT__95() throws RecognitionException {
        try {
            int _type = T__95;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:90:7: ( 'while' )
            // InternalDSLPolicies.g:90:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__95"

    // $ANTLR start "T__96"
    public final void mT__96() throws RecognitionException {
        try {
            int _type = T__96;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:91:7: ( 'do' )
            // InternalDSLPolicies.g:91:9: 'do'
            {
            match("do"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__96"

    // $ANTLR start "T__97"
    public final void mT__97() throws RecognitionException {
        try {
            int _type = T__97;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:92:7: ( 'var' )
            // InternalDSLPolicies.g:92:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__97"

    // $ANTLR start "T__98"
    public final void mT__98() throws RecognitionException {
        try {
            int _type = T__98;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:93:7: ( 'val' )
            // InternalDSLPolicies.g:93:9: 'val'
            {
            match("val"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__98"

    // $ANTLR start "T__99"
    public final void mT__99() throws RecognitionException {
        try {
            int _type = T__99;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:94:7: ( 'extends' )
            // InternalDSLPolicies.g:94:9: 'extends'
            {
            match("extends"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__99"

    // $ANTLR start "T__100"
    public final void mT__100() throws RecognitionException {
        try {
            int _type = T__100;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:95:8: ( 'static' )
            // InternalDSLPolicies.g:95:10: 'static'
            {
            match("static"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__100"

    // $ANTLR start "T__101"
    public final void mT__101() throws RecognitionException {
        try {
            int _type = T__101;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:96:8: ( 'import' )
            // InternalDSLPolicies.g:96:10: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__101"

    // $ANTLR start "T__102"
    public final void mT__102() throws RecognitionException {
        try {
            int _type = T__102;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:97:8: ( 'extension' )
            // InternalDSLPolicies.g:97:10: 'extension'
            {
            match("extension"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__102"

    // $ANTLR start "T__103"
    public final void mT__103() throws RecognitionException {
        try {
            int _type = T__103;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:98:8: ( 'super' )
            // InternalDSLPolicies.g:98:10: 'super'
            {
            match("super"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__103"

    // $ANTLR start "T__104"
    public final void mT__104() throws RecognitionException {
        try {
            int _type = T__104;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:99:8: ( 'new' )
            // InternalDSLPolicies.g:99:10: 'new'
            {
            match("new"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__104"

    // $ANTLR start "T__105"
    public final void mT__105() throws RecognitionException {
        try {
            int _type = T__105;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:100:8: ( 'false' )
            // InternalDSLPolicies.g:100:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__105"

    // $ANTLR start "T__106"
    public final void mT__106() throws RecognitionException {
        try {
            int _type = T__106;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:101:8: ( 'true' )
            // InternalDSLPolicies.g:101:10: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__106"

    // $ANTLR start "T__107"
    public final void mT__107() throws RecognitionException {
        try {
            int _type = T__107;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:102:8: ( 'null' )
            // InternalDSLPolicies.g:102:10: 'null'
            {
            match("null"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__107"

    // $ANTLR start "T__108"
    public final void mT__108() throws RecognitionException {
        try {
            int _type = T__108;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:103:8: ( 'typeof' )
            // InternalDSLPolicies.g:103:10: 'typeof'
            {
            match("typeof"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__108"

    // $ANTLR start "T__109"
    public final void mT__109() throws RecognitionException {
        try {
            int _type = T__109;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:104:8: ( 'throw' )
            // InternalDSLPolicies.g:104:10: 'throw'
            {
            match("throw"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__109"

    // $ANTLR start "T__110"
    public final void mT__110() throws RecognitionException {
        try {
            int _type = T__110;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:105:8: ( 'return' )
            // InternalDSLPolicies.g:105:10: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__110"

    // $ANTLR start "T__111"
    public final void mT__111() throws RecognitionException {
        try {
            int _type = T__111;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:106:8: ( 'try' )
            // InternalDSLPolicies.g:106:10: 'try'
            {
            match("try"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__111"

    // $ANTLR start "T__112"
    public final void mT__112() throws RecognitionException {
        try {
            int _type = T__112;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:107:8: ( 'finally' )
            // InternalDSLPolicies.g:107:10: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__112"

    // $ANTLR start "T__113"
    public final void mT__113() throws RecognitionException {
        try {
            int _type = T__113;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:108:8: ( 'synchronized' )
            // InternalDSLPolicies.g:108:10: 'synchronized'
            {
            match("synchronized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__113"

    // $ANTLR start "T__114"
    public final void mT__114() throws RecognitionException {
        try {
            int _type = T__114;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:109:8: ( 'catch' )
            // InternalDSLPolicies.g:109:10: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__114"

    // $ANTLR start "T__115"
    public final void mT__115() throws RecognitionException {
        try {
            int _type = T__115;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:110:8: ( '?' )
            // InternalDSLPolicies.g:110:10: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__115"

    // $ANTLR start "T__116"
    public final void mT__116() throws RecognitionException {
        try {
            int _type = T__116;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:111:8: ( '&' )
            // InternalDSLPolicies.g:111:10: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__116"

    // $ANTLR start "RULE_SEV"
    public final void mRULE_SEV() throws RecognitionException {
        try {
            int _type = RULE_SEV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7724:10: ( ( 'W' | 'I' | 'E' ) )
            // InternalDSLPolicies.g:7724:12: ( 'W' | 'I' | 'E' )
            {
            if ( input.LA(1)=='E'||input.LA(1)=='I'||input.LA(1)=='W' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEV"

    // $ANTLR start "RULE_FORMAT_COMMENT"
    public final void mRULE_FORMAT_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_FORMAT_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7726:21: ( '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDSLPolicies.g:7726:23: '#' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match('#'); 
            // InternalDSLPolicies.g:7726:27: (~ ( ( '\\n' | '\\r' ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalDSLPolicies.g:7726:27: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop1;
                }
            } while (true);

            // InternalDSLPolicies.g:7726:43: ( ( '\\r' )? '\\n' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\n'||LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalDSLPolicies.g:7726:44: ( '\\r' )? '\\n'
                    {
                    // InternalDSLPolicies.g:7726:44: ( '\\r' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0=='\r') ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // InternalDSLPolicies.g:7726:44: '\\r'
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
    // $ANTLR end "RULE_FORMAT_COMMENT"

    // $ANTLR start "RULE_NEWLINE"
    public final void mRULE_NEWLINE() throws RecognitionException {
        try {
            int _type = RULE_NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7728:14: ( ( '\\r' )? '\\n' )
            // InternalDSLPolicies.g:7728:16: ( '\\r' )? '\\n'
            {
            // InternalDSLPolicies.g:7728:16: ( '\\r' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='\r') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalDSLPolicies.g:7728:16: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NEWLINE"

    // $ANTLR start "RULE_HEX"
    public final void mRULE_HEX() throws RecognitionException {
        try {
            int _type = RULE_HEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7730:10: ( ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )? )
            // InternalDSLPolicies.g:7730:12: ( '0x' | '0X' ) ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+ ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            {
            // InternalDSLPolicies.g:7730:12: ( '0x' | '0X' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='x') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='X') ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalDSLPolicies.g:7730:13: '0x'
                    {
                    match("0x"); 


                    }
                    break;
                case 2 :
                    // InternalDSLPolicies.g:7730:18: '0X'
                    {
                    match("0X"); 


                    }
                    break;

            }

            // InternalDSLPolicies.g:7730:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' | '_' )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='0' && LA6_0<='9')||(LA6_0>='A' && LA6_0<='F')||LA6_0=='_'||(LA6_0>='a' && LA6_0<='f')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalDSLPolicies.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='f') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            // InternalDSLPolicies.g:7730:58: ( '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='#') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalDSLPolicies.g:7730:59: '#' ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    {
                    match('#'); 
                    // InternalDSLPolicies.g:7730:63: ( ( 'b' | 'B' ) ( 'i' | 'I' ) | ( 'l' | 'L' ) )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0=='B'||LA7_0=='b') ) {
                        alt7=1;
                    }
                    else if ( (LA7_0=='L'||LA7_0=='l') ) {
                        alt7=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalDSLPolicies.g:7730:64: ( 'b' | 'B' ) ( 'i' | 'I' )
                            {
                            if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}

                            if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;
                        case 2 :
                            // InternalDSLPolicies.g:7730:84: ( 'l' | 'L' )
                            {
                            if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }


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
    // $ANTLR end "RULE_HEX"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7732:10: ( '0' .. '9' ( '0' .. '9' | '_' )* )
            // InternalDSLPolicies.g:7732:12: '0' .. '9' ( '0' .. '9' | '_' )*
            {
            matchRange('0','9'); 
            // InternalDSLPolicies.g:7732:21: ( '0' .. '9' | '_' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||LA9_0=='_') ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalDSLPolicies.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7734:14: ( RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )? )
            // InternalDSLPolicies.g:7734:16: RULE_INT ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )? ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            {
            mRULE_INT(); 
            // InternalDSLPolicies.g:7734:25: ( ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalDSLPolicies.g:7734:26: ( 'e' | 'E' ) ( '+' | '-' )? RULE_INT
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // InternalDSLPolicies.g:7734:36: ( '+' | '-' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0=='+'||LA10_0=='-') ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalDSLPolicies.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();

                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    mRULE_INT(); 

                    }
                    break;

            }

            // InternalDSLPolicies.g:7734:58: ( ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' ) | ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' ) )?
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='B'||LA12_0=='b') ) {
                alt12=1;
            }
            else if ( (LA12_0=='D'||LA12_0=='F'||LA12_0=='L'||LA12_0=='d'||LA12_0=='f'||LA12_0=='l') ) {
                alt12=2;
            }
            switch (alt12) {
                case 1 :
                    // InternalDSLPolicies.g:7734:59: ( 'b' | 'B' ) ( 'i' | 'I' | 'd' | 'D' )
                    {
                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='I'||input.LA(1)=='d'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;
                case 2 :
                    // InternalDSLPolicies.g:7734:87: ( 'l' | 'L' | 'd' | 'D' | 'f' | 'F' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='F'||input.LA(1)=='L'||input.LA(1)=='d'||input.LA(1)=='f'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


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
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7736:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )* )
            // InternalDSLPolicies.g:7736:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            {
            // InternalDSLPolicies.g:7736:11: ( '^' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='^') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalDSLPolicies.g:7736:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( input.LA(1)=='$'||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalDSLPolicies.g:7736:44: ( 'a' .. 'z' | 'A' .. 'Z' | '$' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='$'||(LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalDSLPolicies.g:
            	    {
            	    if ( input.LA(1)=='$'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalDSLPolicies.g:7738:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? ) )
            // InternalDSLPolicies.g:7738:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            {
            // InternalDSLPolicies.g:7738:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )? | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )? )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='\"') ) {
                alt19=1;
            }
            else if ( (LA19_0=='\'') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalDSLPolicies.g:7738:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* ( '\"' )?
                    {
                    match('\"'); 
                    // InternalDSLPolicies.g:7738:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop15:
                    do {
                        int alt15=3;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0=='\\') ) {
                            alt15=1;
                        }
                        else if ( ((LA15_0>='\u0000' && LA15_0<='!')||(LA15_0>='#' && LA15_0<='[')||(LA15_0>=']' && LA15_0<='\uFFFF')) ) {
                            alt15=2;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalDSLPolicies.g:7738:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDSLPolicies.g:7738:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop15;
                        }
                    } while (true);

                    // InternalDSLPolicies.g:7738:44: ( '\"' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\"') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalDSLPolicies.g:7738:44: '\"'
                            {
                            match('\"'); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // InternalDSLPolicies.g:7738:49: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* ( '\\'' )?
                    {
                    match('\''); 
                    // InternalDSLPolicies.g:7738:54: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop17:
                    do {
                        int alt17=3;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='\\') ) {
                            alt17=1;
                        }
                        else if ( ((LA17_0>='\u0000' && LA17_0<='&')||(LA17_0>='(' && LA17_0<='[')||(LA17_0>=']' && LA17_0<='\uFFFF')) ) {
                            alt17=2;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalDSLPolicies.g:7738:55: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalDSLPolicies.g:7738:62: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop17;
                        }
                    } while (true);

                    // InternalDSLPolicies.g:7738:79: ( '\\'' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0=='\'') ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalDSLPolicies.g:7738:79: '\\''
                            {
                            match('\''); 

                            }
                            break;

                    }


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
            // InternalDSLPolicies.g:7740:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalDSLPolicies.g:7740:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalDSLPolicies.g:7740:24: ( options {greedy=false; } : . )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0=='*') ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1=='/') ) {
                        alt20=2;
                    }
                    else if ( ((LA20_1>='\u0000' && LA20_1<='.')||(LA20_1>='0' && LA20_1<='\uFFFF')) ) {
                        alt20=1;
                    }


                }
                else if ( ((LA20_0>='\u0000' && LA20_0<=')')||(LA20_0>='+' && LA20_0<='\uFFFF')) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalDSLPolicies.g:7740:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop20;
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
            // InternalDSLPolicies.g:7742:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalDSLPolicies.g:7742:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalDSLPolicies.g:7742:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='\u0000' && LA21_0<='\t')||(LA21_0>='\u000B' && LA21_0<='\f')||(LA21_0>='\u000E' && LA21_0<='\uFFFF')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalDSLPolicies.g:7742:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop21;
                }
            } while (true);

            // InternalDSLPolicies.g:7742:40: ( ( '\\r' )? '\\n' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='\n'||LA23_0=='\r') ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalDSLPolicies.g:7742:41: ( '\\r' )? '\\n'
                    {
                    // InternalDSLPolicies.g:7742:41: ( '\\r' )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0=='\r') ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalDSLPolicies.g:7742:41: '\\r'
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
            // InternalDSLPolicies.g:7744:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalDSLPolicies.g:7744:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalDSLPolicies.g:7744:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>='\t' && LA24_0<='\n')||LA24_0=='\r'||LA24_0==' ') ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // InternalDSLPolicies.g:
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
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            // InternalDSLPolicies.g:7746:16: ( . )
            // InternalDSLPolicies.g:7746:18: .
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
        // InternalDSLPolicies.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_SEV | RULE_FORMAT_COMMENT | RULE_NEWLINE | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt25=113;
        alt25 = dfa25.predict(input);
        switch (alt25) {
            case 1 :
                // InternalDSLPolicies.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // InternalDSLPolicies.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // InternalDSLPolicies.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // InternalDSLPolicies.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // InternalDSLPolicies.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // InternalDSLPolicies.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // InternalDSLPolicies.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // InternalDSLPolicies.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // InternalDSLPolicies.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // InternalDSLPolicies.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // InternalDSLPolicies.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // InternalDSLPolicies.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // InternalDSLPolicies.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // InternalDSLPolicies.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // InternalDSLPolicies.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // InternalDSLPolicies.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // InternalDSLPolicies.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // InternalDSLPolicies.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // InternalDSLPolicies.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // InternalDSLPolicies.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // InternalDSLPolicies.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // InternalDSLPolicies.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // InternalDSLPolicies.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // InternalDSLPolicies.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // InternalDSLPolicies.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // InternalDSLPolicies.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // InternalDSLPolicies.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // InternalDSLPolicies.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // InternalDSLPolicies.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // InternalDSLPolicies.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // InternalDSLPolicies.g:1:190: T__46
                {
                mT__46(); 

                }
                break;
            case 32 :
                // InternalDSLPolicies.g:1:196: T__47
                {
                mT__47(); 

                }
                break;
            case 33 :
                // InternalDSLPolicies.g:1:202: T__48
                {
                mT__48(); 

                }
                break;
            case 34 :
                // InternalDSLPolicies.g:1:208: T__49
                {
                mT__49(); 

                }
                break;
            case 35 :
                // InternalDSLPolicies.g:1:214: T__50
                {
                mT__50(); 

                }
                break;
            case 36 :
                // InternalDSLPolicies.g:1:220: T__51
                {
                mT__51(); 

                }
                break;
            case 37 :
                // InternalDSLPolicies.g:1:226: T__52
                {
                mT__52(); 

                }
                break;
            case 38 :
                // InternalDSLPolicies.g:1:232: T__53
                {
                mT__53(); 

                }
                break;
            case 39 :
                // InternalDSLPolicies.g:1:238: T__54
                {
                mT__54(); 

                }
                break;
            case 40 :
                // InternalDSLPolicies.g:1:244: T__55
                {
                mT__55(); 

                }
                break;
            case 41 :
                // InternalDSLPolicies.g:1:250: T__56
                {
                mT__56(); 

                }
                break;
            case 42 :
                // InternalDSLPolicies.g:1:256: T__57
                {
                mT__57(); 

                }
                break;
            case 43 :
                // InternalDSLPolicies.g:1:262: T__58
                {
                mT__58(); 

                }
                break;
            case 44 :
                // InternalDSLPolicies.g:1:268: T__59
                {
                mT__59(); 

                }
                break;
            case 45 :
                // InternalDSLPolicies.g:1:274: T__60
                {
                mT__60(); 

                }
                break;
            case 46 :
                // InternalDSLPolicies.g:1:280: T__61
                {
                mT__61(); 

                }
                break;
            case 47 :
                // InternalDSLPolicies.g:1:286: T__62
                {
                mT__62(); 

                }
                break;
            case 48 :
                // InternalDSLPolicies.g:1:292: T__63
                {
                mT__63(); 

                }
                break;
            case 49 :
                // InternalDSLPolicies.g:1:298: T__64
                {
                mT__64(); 

                }
                break;
            case 50 :
                // InternalDSLPolicies.g:1:304: T__65
                {
                mT__65(); 

                }
                break;
            case 51 :
                // InternalDSLPolicies.g:1:310: T__66
                {
                mT__66(); 

                }
                break;
            case 52 :
                // InternalDSLPolicies.g:1:316: T__67
                {
                mT__67(); 

                }
                break;
            case 53 :
                // InternalDSLPolicies.g:1:322: T__68
                {
                mT__68(); 

                }
                break;
            case 54 :
                // InternalDSLPolicies.g:1:328: T__69
                {
                mT__69(); 

                }
                break;
            case 55 :
                // InternalDSLPolicies.g:1:334: T__70
                {
                mT__70(); 

                }
                break;
            case 56 :
                // InternalDSLPolicies.g:1:340: T__71
                {
                mT__71(); 

                }
                break;
            case 57 :
                // InternalDSLPolicies.g:1:346: T__72
                {
                mT__72(); 

                }
                break;
            case 58 :
                // InternalDSLPolicies.g:1:352: T__73
                {
                mT__73(); 

                }
                break;
            case 59 :
                // InternalDSLPolicies.g:1:358: T__74
                {
                mT__74(); 

                }
                break;
            case 60 :
                // InternalDSLPolicies.g:1:364: T__75
                {
                mT__75(); 

                }
                break;
            case 61 :
                // InternalDSLPolicies.g:1:370: T__76
                {
                mT__76(); 

                }
                break;
            case 62 :
                // InternalDSLPolicies.g:1:376: T__77
                {
                mT__77(); 

                }
                break;
            case 63 :
                // InternalDSLPolicies.g:1:382: T__78
                {
                mT__78(); 

                }
                break;
            case 64 :
                // InternalDSLPolicies.g:1:388: T__79
                {
                mT__79(); 

                }
                break;
            case 65 :
                // InternalDSLPolicies.g:1:394: T__80
                {
                mT__80(); 

                }
                break;
            case 66 :
                // InternalDSLPolicies.g:1:400: T__81
                {
                mT__81(); 

                }
                break;
            case 67 :
                // InternalDSLPolicies.g:1:406: T__82
                {
                mT__82(); 

                }
                break;
            case 68 :
                // InternalDSLPolicies.g:1:412: T__83
                {
                mT__83(); 

                }
                break;
            case 69 :
                // InternalDSLPolicies.g:1:418: T__84
                {
                mT__84(); 

                }
                break;
            case 70 :
                // InternalDSLPolicies.g:1:424: T__85
                {
                mT__85(); 

                }
                break;
            case 71 :
                // InternalDSLPolicies.g:1:430: T__86
                {
                mT__86(); 

                }
                break;
            case 72 :
                // InternalDSLPolicies.g:1:436: T__87
                {
                mT__87(); 

                }
                break;
            case 73 :
                // InternalDSLPolicies.g:1:442: T__88
                {
                mT__88(); 

                }
                break;
            case 74 :
                // InternalDSLPolicies.g:1:448: T__89
                {
                mT__89(); 

                }
                break;
            case 75 :
                // InternalDSLPolicies.g:1:454: T__90
                {
                mT__90(); 

                }
                break;
            case 76 :
                // InternalDSLPolicies.g:1:460: T__91
                {
                mT__91(); 

                }
                break;
            case 77 :
                // InternalDSLPolicies.g:1:466: T__92
                {
                mT__92(); 

                }
                break;
            case 78 :
                // InternalDSLPolicies.g:1:472: T__93
                {
                mT__93(); 

                }
                break;
            case 79 :
                // InternalDSLPolicies.g:1:478: T__94
                {
                mT__94(); 

                }
                break;
            case 80 :
                // InternalDSLPolicies.g:1:484: T__95
                {
                mT__95(); 

                }
                break;
            case 81 :
                // InternalDSLPolicies.g:1:490: T__96
                {
                mT__96(); 

                }
                break;
            case 82 :
                // InternalDSLPolicies.g:1:496: T__97
                {
                mT__97(); 

                }
                break;
            case 83 :
                // InternalDSLPolicies.g:1:502: T__98
                {
                mT__98(); 

                }
                break;
            case 84 :
                // InternalDSLPolicies.g:1:508: T__99
                {
                mT__99(); 

                }
                break;
            case 85 :
                // InternalDSLPolicies.g:1:514: T__100
                {
                mT__100(); 

                }
                break;
            case 86 :
                // InternalDSLPolicies.g:1:521: T__101
                {
                mT__101(); 

                }
                break;
            case 87 :
                // InternalDSLPolicies.g:1:528: T__102
                {
                mT__102(); 

                }
                break;
            case 88 :
                // InternalDSLPolicies.g:1:535: T__103
                {
                mT__103(); 

                }
                break;
            case 89 :
                // InternalDSLPolicies.g:1:542: T__104
                {
                mT__104(); 

                }
                break;
            case 90 :
                // InternalDSLPolicies.g:1:549: T__105
                {
                mT__105(); 

                }
                break;
            case 91 :
                // InternalDSLPolicies.g:1:556: T__106
                {
                mT__106(); 

                }
                break;
            case 92 :
                // InternalDSLPolicies.g:1:563: T__107
                {
                mT__107(); 

                }
                break;
            case 93 :
                // InternalDSLPolicies.g:1:570: T__108
                {
                mT__108(); 

                }
                break;
            case 94 :
                // InternalDSLPolicies.g:1:577: T__109
                {
                mT__109(); 

                }
                break;
            case 95 :
                // InternalDSLPolicies.g:1:584: T__110
                {
                mT__110(); 

                }
                break;
            case 96 :
                // InternalDSLPolicies.g:1:591: T__111
                {
                mT__111(); 

                }
                break;
            case 97 :
                // InternalDSLPolicies.g:1:598: T__112
                {
                mT__112(); 

                }
                break;
            case 98 :
                // InternalDSLPolicies.g:1:605: T__113
                {
                mT__113(); 

                }
                break;
            case 99 :
                // InternalDSLPolicies.g:1:612: T__114
                {
                mT__114(); 

                }
                break;
            case 100 :
                // InternalDSLPolicies.g:1:619: T__115
                {
                mT__115(); 

                }
                break;
            case 101 :
                // InternalDSLPolicies.g:1:626: T__116
                {
                mT__116(); 

                }
                break;
            case 102 :
                // InternalDSLPolicies.g:1:633: RULE_SEV
                {
                mRULE_SEV(); 

                }
                break;
            case 103 :
                // InternalDSLPolicies.g:1:642: RULE_FORMAT_COMMENT
                {
                mRULE_FORMAT_COMMENT(); 

                }
                break;
            case 104 :
                // InternalDSLPolicies.g:1:662: RULE_NEWLINE
                {
                mRULE_NEWLINE(); 

                }
                break;
            case 105 :
                // InternalDSLPolicies.g:1:675: RULE_HEX
                {
                mRULE_HEX(); 

                }
                break;
            case 106 :
                // InternalDSLPolicies.g:1:684: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 107 :
                // InternalDSLPolicies.g:1:693: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 108 :
                // InternalDSLPolicies.g:1:706: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 109 :
                // InternalDSLPolicies.g:1:714: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 110 :
                // InternalDSLPolicies.g:1:726: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 111 :
                // InternalDSLPolicies.g:1:742: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 112 :
                // InternalDSLPolicies.g:1:758: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 113 :
                // InternalDSLPolicies.g:1:766: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA25 dfa25 = new DFA25(this);
    static final String DFA25_eotS =
        "\1\uffff\1\73\1\77\2\103\1\110\3\uffff\7\103\1\131\5\103\1\131\2\103\1\153\1\157\1\162\1\166\1\170\1\172\1\174\1\176\1\u0080\1\u0082\1\103\1\u0088\1\u008a\1\uffff\1\u008c\4\uffff\2\103\1\131\1\111\1\u0097\2\u009a\1\70\5\uffff\1\u009e\4\uffff\1\u00a0\1\uffff\3\103\1\uffff\4\103\5\uffff\7\103\1\u00b2\4\103\1\uffff\6\103\1\u00bf\10\103\30\uffff\1\u00ca\1\uffff\1\103\1\u00cc\1\103\14\uffff\4\103\1\u0097\2\uffff\1\u009a\7\uffff\1\103\1\u00d4\17\103\1\uffff\6\103\1\u00ea\5\103\1\uffff\6\103\1\u00f6\1\u00f7\1\103\2\uffff\1\103\1\uffff\3\103\1\u00fd\3\103\1\uffff\1\u0101\1\u0103\22\103\1\u0116\1\uffff\7\103\1\u011e\3\103\2\uffff\3\103\1\u0125\1\103\1\uffff\3\103\1\uffff\1\103\1\uffff\2\103\1\u012d\14\103\1\u013a\2\103\1\uffff\1\103\1\u013e\5\103\1\uffff\6\103\1\uffff\1\u014b\1\u014c\3\103\1\u0150\1\u0151\1\uffff\1\u0152\2\103\1\u0155\5\103\1\u015b\2\103\1\uffff\2\103\1\u0160\1\uffff\13\103\1\u016c\2\uffff\1\103\1\u016e\1\103\3\uffff\2\103\1\uffff\5\103\1\uffff\4\103\1\uffff\2\103\1\u017e\2\103\1\u0181\5\103\1\uffff\1\u0187\1\uffff\17\103\1\uffff\2\103\1\uffff\5\103\1\uffff\12\103\1\u01a9\7\103\1\u01b1\10\103\1\u01ba\5\103\1\uffff\7\103\1\uffff\3\103\1\u01ca\4\103\1\uffff\2\103\1\u01d1\14\103\1\uffff\1\u01de\2\103\1\u01e1\2\103\1\uffff\1\u01e4\4\103\1\u01e9\3\103\1\u01ed\2\103\1\uffff\2\103\1\uffff\1\103\1\u01f3\1\uffff\3\103\1\u01f7\1\uffff\2\103\1\u01fa\1\uffff\3\103\1\u01fe\1\103\1\uffff\3\103\1\uffff\2\103\1\uffff\1\103\1\u0206\1\103\1\uffff\1\103\1\u0209\1\u020a\3\103\1\u020e\1\uffff\2\103\2\uffff\3\103\1\uffff\7\103\1\u021b\3\103\1\u021f\1\uffff\2\103\1\u0222\1\uffff\2\103\1\uffff\3\103\1\u0228\1\103\1\uffff\1\u022a\1\uffff";
    static final String DFA25_eofS =
        "\u022b\uffff";
    static final String DFA25_minS =
        "\1\0\1\75\1\56\1\145\1\164\1\11\3\uffff\2\141\2\165\1\137\1\123\1\145\1\44\1\150\1\151\2\145\1\144\1\44\1\141\1\145\1\53\1\55\2\52\1\75\1\76\1\75\1\174\1\46\1\75\1\146\1\56\1\72\1\uffff\1\0\4\uffff\2\141\1\44\1\12\1\11\2\60\1\44\5\uffff\1\75\4\uffff\1\74\1\uffff\1\143\1\167\1\154\1\uffff\1\156\1\151\1\141\1\160\5\uffff\1\156\1\141\1\156\1\141\2\151\1\163\1\44\1\164\3\151\1\uffff\1\155\1\165\1\160\1\162\1\155\1\146\1\44\1\160\1\147\1\163\1\164\1\147\1\162\1\154\1\162\30\uffff\1\75\1\uffff\1\163\1\44\1\160\14\uffff\1\163\1\162\1\154\1\156\1\11\2\uffff\1\60\7\uffff\1\150\1\44\1\154\1\143\2\164\1\145\1\144\1\165\1\143\1\165\1\144\1\165\3\143\1\164\1\uffff\1\141\1\147\1\154\1\147\2\145\1\44\1\145\1\157\2\145\1\141\1\uffff\5\145\1\164\2\44\1\164\2\uffff\1\164\1\uffff\1\157\1\145\1\143\1\44\1\163\1\141\1\145\1\uffff\2\44\1\143\1\151\1\162\1\157\1\151\1\150\1\162\1\157\1\151\1\150\2\153\1\141\1\162\1\150\1\145\1\150\1\137\1\44\1\uffff\1\157\1\167\1\104\1\156\1\165\1\156\1\137\1\44\1\156\1\103\1\145\2\uffff\1\145\1\141\1\162\1\44\1\150\1\uffff\1\145\1\154\1\143\1\uffff\1\162\1\uffff\1\150\1\143\1\44\1\155\1\162\1\145\1\156\1\155\1\162\1\145\1\137\1\122\1\162\1\120\1\164\1\44\1\164\1\144\1\uffff\1\146\1\44\1\165\1\144\1\154\1\144\1\143\1\uffff\1\144\1\157\2\170\1\156\1\164\1\uffff\2\44\1\154\1\153\1\157\2\44\1\uffff\1\44\1\145\1\144\1\44\1\120\1\145\1\144\1\162\1\141\1\44\1\141\1\145\1\uffff\1\145\1\165\1\44\1\uffff\1\162\1\145\1\164\1\145\1\157\1\163\1\151\1\166\1\137\1\103\1\143\1\44\2\uffff\1\171\1\44\1\156\3\uffff\1\155\1\137\1\uffff\1\141\1\155\1\105\1\141\1\156\1\uffff\1\164\2\144\1\162\1\uffff\1\141\1\156\1\44\1\156\1\166\1\44\1\157\1\145\1\143\1\157\1\145\1\uffff\1\44\1\uffff\1\151\2\145\1\164\2\145\1\144\1\156\1\144\1\150\1\137\1\122\1\141\1\164\1\143\1\uffff\1\143\1\145\1\uffff\1\156\1\162\1\157\1\166\1\157\1\uffff\1\172\1\156\1\145\1\144\1\150\1\156\1\162\1\147\1\144\1\157\1\44\1\162\1\141\1\164\1\151\2\171\1\162\1\44\1\141\1\166\1\145\1\146\1\145\1\164\1\162\1\147\1\44\2\164\1\145\1\157\1\155\1\uffff\1\141\1\156\1\151\1\157\1\137\1\105\1\141\1\uffff\1\147\1\145\1\162\1\44\1\144\1\137\1\164\1\145\1\uffff\1\103\1\145\1\44\1\155\1\120\1\156\1\144\1\157\1\156\1\145\1\144\1\147\1\145\1\162\1\141\1\uffff\1\44\1\143\1\145\1\44\1\157\1\170\1\uffff\1\44\1\141\1\144\1\157\1\156\1\44\1\144\1\147\1\145\1\44\1\141\1\147\1\uffff\1\157\1\170\1\uffff\1\166\1\44\1\uffff\1\164\1\157\1\155\1\44\1\uffff\1\147\1\145\1\44\1\uffff\1\147\1\145\1\166\1\44\1\145\1\uffff\1\150\1\155\1\120\1\uffff\1\145\1\103\1\uffff\1\145\1\44\1\145\1\uffff\1\162\2\44\1\141\1\137\1\157\1\44\1\uffff\1\162\1\141\2\uffff\1\164\1\143\1\166\1\uffff\1\141\1\147\1\150\1\157\1\145\1\147\1\145\1\44\1\166\1\162\1\145\1\44\1\uffff\1\145\1\141\1\44\1\uffff\1\162\1\147\1\uffff\1\141\1\145\1\147\1\44\1\145\1\uffff\1\44\1\uffff";
    static final String DFA25_maxS =
        "\1\uffff\1\76\1\152\1\165\1\171\1\40\3\uffff\2\145\2\165\1\163\1\123\1\150\1\172\1\171\1\151\1\157\1\145\1\170\1\172\2\145\1\75\1\76\3\75\1\76\1\75\1\174\1\46\1\75\1\156\2\72\1\uffff\1\uffff\4\uffff\1\141\1\157\1\172\1\12\1\40\1\170\1\154\1\172\5\uffff\1\75\4\uffff\1\74\1\uffff\1\143\1\167\1\154\1\uffff\1\156\1\151\1\141\1\160\5\uffff\1\156\1\164\1\156\1\161\2\151\1\163\1\172\1\164\3\151\1\uffff\1\155\1\171\1\160\1\162\1\155\1\160\1\172\1\160\1\147\1\163\1\164\1\147\3\162\30\uffff\1\75\1\uffff\1\163\1\172\1\160\14\uffff\1\164\1\162\1\154\1\156\1\40\2\uffff\1\154\7\uffff\1\150\1\172\1\154\1\143\2\164\1\145\1\144\1\165\1\143\1\165\1\144\1\165\3\143\1\164\1\uffff\1\141\1\147\1\154\1\147\2\145\1\172\1\145\1\157\2\145\1\141\1\uffff\5\145\1\164\2\172\1\164\2\uffff\1\164\1\uffff\1\157\1\145\1\143\1\172\1\163\1\141\1\145\1\uffff\2\172\1\143\1\151\1\162\1\157\1\151\1\150\1\162\1\157\1\151\1\150\2\153\1\141\1\162\1\150\1\145\1\150\1\137\1\172\1\uffff\1\157\1\167\1\104\1\156\1\165\1\156\1\137\1\172\1\156\1\103\1\145\2\uffff\1\145\1\141\1\162\1\172\1\150\1\uffff\1\145\1\154\1\143\1\uffff\1\162\1\uffff\1\150\1\143\1\172\1\155\1\162\1\145\1\156\1\155\1\162\1\145\1\137\1\122\1\162\1\120\1\164\1\172\1\164\1\144\1\uffff\1\146\1\172\1\165\1\144\1\154\1\144\1\143\1\uffff\1\163\1\157\2\170\1\156\1\164\1\uffff\2\172\1\154\1\153\1\157\2\172\1\uffff\1\172\1\145\1\144\1\172\1\120\1\145\1\144\1\162\1\141\1\172\1\141\1\145\1\uffff\1\145\1\165\1\172\1\uffff\1\162\1\145\1\164\1\145\1\157\1\163\1\151\1\166\1\137\1\103\1\143\1\172\2\uffff\1\171\1\172\1\156\3\uffff\1\155\1\137\1\uffff\1\141\1\155\1\126\1\141\1\156\1\uffff\1\164\2\144\1\162\1\uffff\1\141\1\156\1\172\1\156\1\166\1\172\1\157\1\145\1\143\1\157\1\145\1\uffff\1\172\1\uffff\1\151\1\145\1\166\1\164\2\145\1\144\1\156\1\144\1\150\1\137\1\122\1\141\1\164\1\143\1\uffff\1\143\1\145\1\uffff\1\156\1\162\1\157\1\166\1\157\1\uffff\1\172\1\156\1\145\1\144\1\150\1\156\1\162\1\147\1\144\1\157\1\172\1\162\1\141\1\164\1\151\2\171\1\162\1\172\1\141\1\166\1\145\1\146\1\145\1\164\1\162\1\147\1\172\2\164\1\145\1\157\1\155\1\uffff\1\141\1\156\1\151\1\157\1\137\1\105\1\141\1\uffff\1\147\1\145\1\162\1\172\1\144\1\137\1\164\1\145\1\uffff\1\103\1\145\1\172\1\155\1\120\1\156\1\144\1\157\1\156\1\145\1\144\1\147\1\145\1\162\1\141\1\uffff\1\172\1\143\1\145\1\172\1\157\1\170\1\uffff\1\172\1\141\1\144\1\157\1\156\1\172\1\144\1\147\1\145\1\172\1\141\1\147\1\uffff\1\157\1\170\1\uffff\1\166\1\172\1\uffff\1\164\1\157\1\155\1\172\1\uffff\1\147\1\145\1\172\1\uffff\1\147\1\145\1\166\1\172\1\145\1\uffff\1\150\1\155\1\120\1\uffff\1\145\1\103\1\uffff\1\145\1\172\1\145\1\uffff\1\162\2\172\1\141\1\137\1\157\1\172\1\uffff\1\162\1\141\2\uffff\1\164\1\143\1\166\1\uffff\1\141\1\147\1\150\1\157\1\145\1\147\1\145\1\172\1\166\1\162\1\145\1\172\1\uffff\1\145\1\141\1\172\1\uffff\1\162\1\147\1\uffff\1\141\1\145\1\147\1\172\1\145\1\uffff\1\172\1\uffff";
    static final String DFA25_acceptS =
        "\6\uffff\1\7\1\10\1\11\35\uffff\1\102\1\uffff\1\104\1\105\1\106\1\107\10\uffff\1\154\2\155\1\160\1\161\1\uffff\1\62\1\1\1\2\1\3\1\uffff\1\77\3\uffff\1\154\4\uffff\1\6\1\160\1\7\1\10\1\11\14\uffff\1\146\17\uffff\1\40\1\75\1\65\1\41\1\57\1\76\1\66\1\42\1\70\1\67\1\43\1\156\1\157\1\71\1\44\1\72\1\63\1\45\1\47\1\46\1\50\1\110\1\51\1\145\1\uffff\1\73\3\uffff\1\64\1\101\1\144\1\100\1\114\1\102\1\103\1\147\1\104\1\105\1\106\1\107\5\uffff\1\150\1\151\1\uffff\1\152\1\153\1\155\1\54\1\52\1\60\1\61\21\uffff\1\74\14\uffff\1\121\11\uffff\1\55\1\53\1\uffff\1\111\7\uffff\1\131\25\uffff\1\140\13\uffff\1\122\1\123\5\uffff\1\117\3\uffff\1\134\1\uffff\1\5\22\uffff\1\133\7\uffff\1\112\6\uffff\1\116\7\uffff\1\130\14\uffff\1\120\3\uffff\1\136\14\uffff\1\143\1\132\3\uffff\1\113\1\125\1\12\2\uffff\1\137\5\uffff\1\16\4\uffff\1\135\13\uffff\1\126\1\uffff\1\4\17\uffff\1\115\2\uffff\1\124\5\uffff\1\141\41\uffff\1\17\7\uffff\1\127\10\uffff\1\13\17\uffff\1\56\6\uffff\1\37\14\uffff\1\142\2\uffff\1\36\2\uffff\1\14\4\uffff\1\23\3\uffff\1\27\5\uffff\1\35\3\uffff\1\22\2\uffff\1\26\3\uffff\1\34\7\uffff\1\31\2\uffff\1\15\1\20\3\uffff\1\30\14\uffff\1\21\3\uffff\1\33\2\uffff\1\32\5\uffff\1\25\1\uffff\1\24";
    static final String DFA25_specialS =
        "\1\0\46\uffff\1\1\u0203\uffff}>";
    static final String[] DFA25_transitionS = {
            "\11\70\1\67\1\60\2\70\1\57\22\70\1\5\1\42\1\65\1\47\1\64\1\35\1\41\1\66\1\7\1\10\1\33\1\31\1\46\1\32\1\2\1\34\1\61\11\62\1\45\1\6\1\36\1\1\1\37\1\44\1\70\1\16\2\64\1\24\1\26\3\64\1\56\7\64\1\14\1\12\1\64\1\22\1\64\1\30\1\20\3\64\1\52\1\70\1\53\1\63\1\64\1\70\1\15\1\64\1\54\1\23\1\25\1\55\2\64\1\43\4\64\1\3\2\64\1\13\1\11\1\4\1\21\1\64\1\27\1\17\3\64\1\50\1\40\1\51\uff82\70",
            "\1\71\1\72",
            "\1\76\70\uffff\1\75\2\uffff\1\74",
            "\1\101\11\uffff\1\100\5\uffff\1\102",
            "\1\106\1\107\1\uffff\1\105\1\uffff\1\104",
            "\2\111\2\uffff\1\111\22\uffff\1\111",
            "",
            "",
            "",
            "\1\115\3\uffff\1\116",
            "\1\117\3\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123\23\uffff\1\124",
            "\1\125",
            "\1\126\2\uffff\1\127",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\4\103\1\130\25\103",
            "\1\135\1\132\10\uffff\1\133\6\uffff\1\134",
            "\1\136",
            "\1\137\11\uffff\1\140",
            "\1\141",
            "\1\142\7\uffff\1\143\13\uffff\1\144",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\3\103\1\145\26\103",
            "\1\147\3\uffff\1\146",
            "\1\150",
            "\1\152\21\uffff\1\151",
            "\1\156\17\uffff\1\154\1\155",
            "\1\161\22\uffff\1\160",
            "\1\164\4\uffff\1\165\15\uffff\1\163",
            "\1\167",
            "\1\171",
            "\1\173",
            "\1\175",
            "\1\177",
            "\1\u0081",
            "\1\u0084\6\uffff\1\u0085\1\u0083",
            "\1\u0087\13\uffff\1\u0086",
            "\1\u0089",
            "",
            "\0\u008d",
            "",
            "",
            "",
            "",
            "\1\u0092",
            "\1\u0094\7\uffff\1\u0095\5\uffff\1\u0093",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0096",
            "\2\111\2\uffff\1\111\22\uffff\1\111",
            "\12\u0099\10\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b\13\uffff\1\u0098\6\uffff\1\u0099\2\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b\13\uffff\1\u0098",
            "\12\u0099\10\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b\22\uffff\1\u0099\2\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b",
            "\1\103\34\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "",
            "",
            "",
            "\1\u009d",
            "",
            "",
            "",
            "",
            "\1\u009f",
            "",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "",
            "",
            "",
            "\1\u00a8",
            "\1\u00aa\17\uffff\1\u00a9\2\uffff\1\u00ab",
            "\1\u00ac",
            "\1\u00ae\17\uffff\1\u00ad",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\1\u00b7",
            "\1\u00b8\3\uffff\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00be\11\uffff\1\u00bd",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c7\5\uffff\1\u00c6",
            "\1\u00c8",
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
            "\1\u00c9",
            "",
            "\1\u00cb",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00cd",
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
            "\1\u00ce\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\2\111\2\uffff\1\111\22\uffff\1\111",
            "",
            "",
            "\12\u0099\10\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b\22\uffff\1\u0099\2\uffff\1\u009b\1\uffff\3\u009b\5\uffff\1\u009b",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00d3",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00eb",
            "\1\u00ec",
            "\1\u00ed",
            "\1\u00ee",
            "\1\u00ef",
            "",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00f8",
            "",
            "",
            "\1\u00f9",
            "",
            "\1\u00fa",
            "\1\u00fb",
            "\1\u00fc",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\7\103\1\u0102\22\103",
            "\1\u0104",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "\1\u010b",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\1\u0114",
            "\1\u0115",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u011f",
            "\1\u0120",
            "\1\u0121",
            "",
            "",
            "\1\u0122",
            "\1\u0123",
            "\1\u0124",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0126",
            "",
            "\1\u0127",
            "\1\u0128",
            "\1\u0129",
            "",
            "\1\u012a",
            "",
            "\1\u012b",
            "\1\u012c",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\1\u0136",
            "\1\u0137",
            "\1\u0138",
            "\1\u0139",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u013b",
            "\1\u013c",
            "",
            "\1\u013d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u013f",
            "\1\u0140",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "\1\u0144\16\uffff\1\u0145",
            "\1\u0146",
            "\1\u0147",
            "\1\u0148",
            "\1\u0149",
            "\1\u014a",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u014d",
            "\1\u014e",
            "\1\u014f",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0153",
            "\1\u0154",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0156",
            "\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015a",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u015c",
            "\1\u015d",
            "",
            "\1\u015e",
            "\1\u015f",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0161",
            "\1\u0162",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "\1\u0168",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "",
            "\1\u016d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u016f",
            "",
            "",
            "",
            "\1\u0170",
            "\1\u0171",
            "",
            "\1\u0172",
            "\1\u0173",
            "\1\u0175\20\uffff\1\u0174",
            "\1\u0176",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a",
            "\1\u017b",
            "",
            "\1\u017c",
            "\1\u017d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u017f",
            "\1\u0180",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184",
            "\1\u0185",
            "\1\u0186",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018b\20\uffff\1\u018a",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0192",
            "\1\u0193",
            "\1\u0194",
            "\1\u0195",
            "\1\u0196",
            "\1\u0197",
            "",
            "\1\u0198",
            "\1\u0199",
            "",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "\1\u019d",
            "\1\u019e",
            "",
            "\1\u019f",
            "\1\u01a0",
            "\1\u01a1",
            "\1\u01a2",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6",
            "\1\u01a7",
            "\1\u01a8",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01aa",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "\1\u01ae",
            "\1\u01af",
            "\1\u01b0",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01b2",
            "\1\u01b3",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\1\u01b8",
            "\1\u01b9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01bb",
            "\1\u01bc",
            "\1\u01bd",
            "\1\u01be",
            "\1\u01bf",
            "",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01cb",
            "\1\u01cc",
            "\1\u01cd",
            "\1\u01ce",
            "",
            "\1\u01cf",
            "\1\u01d0",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01d2",
            "\1\u01d3",
            "\1\u01d4",
            "\1\u01d5",
            "\1\u01d6",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01df",
            "\1\u01e0",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01e2",
            "\1\u01e3",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01ee",
            "\1\u01ef",
            "",
            "\1\u01f0",
            "\1\u01f1",
            "",
            "\1\u01f2",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u01f4",
            "\1\u01f5",
            "\1\u01f6",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u01f8",
            "\1\u01f9",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u01fb",
            "\1\u01fc",
            "\1\u01fd",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u01ff",
            "",
            "\1\u0200",
            "\1\u0201",
            "\1\u0202",
            "",
            "\1\u0203",
            "\1\u0204",
            "",
            "\1\u0205",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0207",
            "",
            "\1\u0208",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u020f",
            "\1\u0210",
            "",
            "",
            "\1\u0211",
            "\1\u0212",
            "\1\u0213",
            "",
            "\1\u0214",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219",
            "\1\u021a",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u021c",
            "\1\u021d",
            "\1\u021e",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0220",
            "\1\u0221",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "",
            "\1\u0223",
            "\1\u0224",
            "",
            "\1\u0225",
            "\1\u0226",
            "\1\u0227",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            "\1\u0229",
            "",
            "\1\103\13\uffff\12\103\7\uffff\32\103\4\uffff\1\103\1\uffff\32\103",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | T__95 | T__96 | T__97 | T__98 | T__99 | T__100 | T__101 | T__102 | T__103 | T__104 | T__105 | T__106 | T__107 | T__108 | T__109 | T__110 | T__111 | T__112 | T__113 | T__114 | T__115 | T__116 | RULE_SEV | RULE_FORMAT_COMMENT | RULE_NEWLINE | RULE_HEX | RULE_INT | RULE_DECIMAL | RULE_ID | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_0 = input.LA(1);

                        s = -1;
                        if ( (LA25_0=='=') ) {s = 1;}

                        else if ( (LA25_0=='.') ) {s = 2;}

                        else if ( (LA25_0=='n') ) {s = 3;}

                        else if ( (LA25_0=='s') ) {s = 4;}

                        else if ( (LA25_0==' ') ) {s = 5;}

                        else if ( (LA25_0==';') ) {s = 6;}

                        else if ( (LA25_0=='(') ) {s = 7;}

                        else if ( (LA25_0==')') ) {s = 8;}

                        else if ( (LA25_0=='r') ) {s = 9;}

                        else if ( (LA25_0=='R') ) {s = 10;}

                        else if ( (LA25_0=='q') ) {s = 11;}

                        else if ( (LA25_0=='Q') ) {s = 12;}

                        else if ( (LA25_0=='a') ) {s = 13;}

                        else if ( (LA25_0=='A') ) {s = 14;}

                        else if ( (LA25_0=='w') ) {s = 15;}

                        else if ( (LA25_0=='W') ) {s = 16;}

                        else if ( (LA25_0=='t') ) {s = 17;}

                        else if ( (LA25_0=='T') ) {s = 18;}

                        else if ( (LA25_0=='d') ) {s = 19;}

                        else if ( (LA25_0=='D') ) {s = 20;}

                        else if ( (LA25_0=='e') ) {s = 21;}

                        else if ( (LA25_0=='E') ) {s = 22;}

                        else if ( (LA25_0=='v') ) {s = 23;}

                        else if ( (LA25_0=='V') ) {s = 24;}

                        else if ( (LA25_0=='+') ) {s = 25;}

                        else if ( (LA25_0=='-') ) {s = 26;}

                        else if ( (LA25_0=='*') ) {s = 27;}

                        else if ( (LA25_0=='/') ) {s = 28;}

                        else if ( (LA25_0=='%') ) {s = 29;}

                        else if ( (LA25_0=='<') ) {s = 30;}

                        else if ( (LA25_0=='>') ) {s = 31;}

                        else if ( (LA25_0=='|') ) {s = 32;}

                        else if ( (LA25_0=='&') ) {s = 33;}

                        else if ( (LA25_0=='!') ) {s = 34;}

                        else if ( (LA25_0=='i') ) {s = 35;}

                        else if ( (LA25_0=='?') ) {s = 36;}

                        else if ( (LA25_0==':') ) {s = 37;}

                        else if ( (LA25_0==',') ) {s = 38;}

                        else if ( (LA25_0=='#') ) {s = 39;}

                        else if ( (LA25_0=='{') ) {s = 40;}

                        else if ( (LA25_0=='}') ) {s = 41;}

                        else if ( (LA25_0=='[') ) {s = 42;}

                        else if ( (LA25_0==']') ) {s = 43;}

                        else if ( (LA25_0=='c') ) {s = 44;}

                        else if ( (LA25_0=='f') ) {s = 45;}

                        else if ( (LA25_0=='I') ) {s = 46;}

                        else if ( (LA25_0=='\r') ) {s = 47;}

                        else if ( (LA25_0=='\n') ) {s = 48;}

                        else if ( (LA25_0=='0') ) {s = 49;}

                        else if ( ((LA25_0>='1' && LA25_0<='9')) ) {s = 50;}

                        else if ( (LA25_0=='^') ) {s = 51;}

                        else if ( (LA25_0=='$'||(LA25_0>='B' && LA25_0<='C')||(LA25_0>='F' && LA25_0<='H')||(LA25_0>='J' && LA25_0<='P')||LA25_0=='S'||LA25_0=='U'||(LA25_0>='X' && LA25_0<='Z')||LA25_0=='_'||LA25_0=='b'||(LA25_0>='g' && LA25_0<='h')||(LA25_0>='j' && LA25_0<='m')||(LA25_0>='o' && LA25_0<='p')||LA25_0=='u'||(LA25_0>='x' && LA25_0<='z')) ) {s = 52;}

                        else if ( (LA25_0=='\"') ) {s = 53;}

                        else if ( (LA25_0=='\'') ) {s = 54;}

                        else if ( (LA25_0=='\t') ) {s = 55;}

                        else if ( ((LA25_0>='\u0000' && LA25_0<='\b')||(LA25_0>='\u000B' && LA25_0<='\f')||(LA25_0>='\u000E' && LA25_0<='\u001F')||LA25_0=='@'||LA25_0=='\\'||LA25_0=='`'||(LA25_0>='~' && LA25_0<='\uFFFF')) ) {s = 56;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_39 = input.LA(1);

                        s = -1;
                        if ( ((LA25_39>='\u0000' && LA25_39<='\uFFFF')) ) {s = 141;}

                        else s = 140;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}