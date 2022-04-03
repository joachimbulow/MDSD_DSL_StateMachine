package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

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
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleVariables"
    // InternalMath.g:53:1: entryRuleVariables : ruleVariables EOF ;
    public final void entryRuleVariables() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleVariables EOF )
            // InternalMath.g:55:1: ruleVariables EOF
            {
             before(grammarAccess.getVariablesRule()); 
            pushFollow(FOLLOW_1);
            ruleVariables();

            state._fsp--;

             after(grammarAccess.getVariablesRule()); 
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
    // $ANTLR end "entryRuleVariables"


    // $ANTLR start "ruleVariables"
    // InternalMath.g:62:1: ruleVariables : ( ( rule__Variables__VariablesAssignment )* ) ;
    public final void ruleVariables() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__Variables__VariablesAssignment )* ) )
            // InternalMath.g:67:2: ( ( rule__Variables__VariablesAssignment )* )
            {
            // InternalMath.g:67:2: ( ( rule__Variables__VariablesAssignment )* )
            // InternalMath.g:68:3: ( rule__Variables__VariablesAssignment )*
            {
             before(grammarAccess.getVariablesAccess().getVariablesAssignment()); 
            // InternalMath.g:69:3: ( rule__Variables__VariablesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:69:4: rule__Variables__VariablesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Variables__VariablesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getVariablesAccess().getVariablesAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariables"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:78:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleMathExp EOF )
            // InternalMath.g:80:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:87:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMath.g:92:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMath.g:92:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMath.g:93:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMath.g:94:3: ( rule__MathExp__Group__0 )
            // InternalMath.g:94:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:103:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleExp EOF )
            // InternalMath.g:105:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:112:1: ruleExp : ( ( rule__Exp__Group__0 ) ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Exp__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Exp__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Exp__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Exp__Group__0 )
            {
             before(grammarAccess.getExpAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Exp__Group__0 )
            // InternalMath.g:119:4: rule__Exp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:128:1: entryRuleFactor : ruleFactor EOF ;
    public final void entryRuleFactor() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleFactor EOF )
            // InternalMath.g:130:1: ruleFactor EOF
            {
             before(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getFactorRule()); 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:137:1: ruleFactor : ( ( rule__Factor__Group__0 ) ) ;
    public final void ruleFactor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Factor__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Factor__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Factor__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Factor__Group__0 )
            {
             before(grammarAccess.getFactorAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Factor__Group__0 )
            // InternalMath.g:144:4: rule__Factor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:153:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( rulePrimary EOF )
            // InternalMath.g:155:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:162:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:167:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:167:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:168:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:169:3: ( rule__Primary__Alternatives )
            // InternalMath.g:169:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:178:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( ruleParenthesis EOF )
            // InternalMath.g:180:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
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
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:187:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMath.g:193:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__Parenthesis__Group__0 )
            // InternalMath.g:194:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:203:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleNumber EOF )
            // InternalMath.g:205:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:212:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__Number__Group__0 ) )
            // InternalMath.g:218:3: ( rule__Number__Group__0 )
            {
             before(grammarAccess.getNumberAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__Number__Group__0 )
            // InternalMath.g:219:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:228:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleVariableUse EOF )
            // InternalMath.g:230:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:237:1: ruleVariableUse : ( ( rule__VariableUse__Group__0 ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__VariableUse__Group__0 ) ) )
            // InternalMath.g:242:2: ( ( rule__VariableUse__Group__0 ) )
            {
            // InternalMath.g:242:2: ( ( rule__VariableUse__Group__0 ) )
            // InternalMath.g:243:3: ( rule__VariableUse__Group__0 )
            {
             before(grammarAccess.getVariableUseAccess().getGroup()); 
            // InternalMath.g:244:3: ( rule__VariableUse__Group__0 )
            // InternalMath.g:244:4: rule__VariableUse__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "entryRuleVariableInit"
    // InternalMath.g:253:1: entryRuleVariableInit : ruleVariableInit EOF ;
    public final void entryRuleVariableInit() throws RecognitionException {
        try {
            // InternalMath.g:254:1: ( ruleVariableInit EOF )
            // InternalMath.g:255:1: ruleVariableInit EOF
            {
             before(grammarAccess.getVariableInitRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableInit();

            state._fsp--;

             after(grammarAccess.getVariableInitRule()); 
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
    // $ANTLR end "entryRuleVariableInit"


    // $ANTLR start "ruleVariableInit"
    // InternalMath.g:262:1: ruleVariableInit : ( ( rule__VariableInit__Group__0 ) ) ;
    public final void ruleVariableInit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:266:2: ( ( ( rule__VariableInit__Group__0 ) ) )
            // InternalMath.g:267:2: ( ( rule__VariableInit__Group__0 ) )
            {
            // InternalMath.g:267:2: ( ( rule__VariableInit__Group__0 ) )
            // InternalMath.g:268:3: ( rule__VariableInit__Group__0 )
            {
             before(grammarAccess.getVariableInitAccess().getGroup()); 
            // InternalMath.g:269:3: ( rule__VariableInit__Group__0 )
            // InternalMath.g:269:4: rule__VariableInit__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableInitAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableInit"


    // $ANTLR start "rule__Exp__Alternatives_1_0"
    // InternalMath.g:277:1: rule__Exp__Alternatives_1_0 : ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) );
    public final void rule__Exp__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:281:1: ( ( ( rule__Exp__Group_1_0_0__0 ) ) | ( ( rule__Exp__Group_1_0_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:282:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    {
                    // InternalMath.g:282:2: ( ( rule__Exp__Group_1_0_0__0 ) )
                    // InternalMath.g:283:3: ( rule__Exp__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_0()); 
                    // InternalMath.g:284:3: ( rule__Exp__Group_1_0_0__0 )
                    // InternalMath.g:284:4: rule__Exp__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:288:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    {
                    // InternalMath.g:288:2: ( ( rule__Exp__Group_1_0_1__0 ) )
                    // InternalMath.g:289:3: ( rule__Exp__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getExpAccess().getGroup_1_0_1()); 
                    // InternalMath.g:290:3: ( rule__Exp__Group_1_0_1__0 )
                    // InternalMath.g:290:4: rule__Exp__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Exp__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Exp__Alternatives_1_0"


    // $ANTLR start "rule__Factor__Alternatives_1_0"
    // InternalMath.g:298:1: rule__Factor__Alternatives_1_0 : ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) );
    public final void rule__Factor__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:302:1: ( ( ( rule__Factor__Group_1_0_0__0 ) ) | ( ( rule__Factor__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==16) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:303:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    {
                    // InternalMath.g:303:2: ( ( rule__Factor__Group_1_0_0__0 ) )
                    // InternalMath.g:304:3: ( rule__Factor__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_0()); 
                    // InternalMath.g:305:3: ( rule__Factor__Group_1_0_0__0 )
                    // InternalMath.g:305:4: rule__Factor__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:309:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    {
                    // InternalMath.g:309:2: ( ( rule__Factor__Group_1_0_1__0 ) )
                    // InternalMath.g:310:3: ( rule__Factor__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getFactorAccess().getGroup_1_0_1()); 
                    // InternalMath.g:311:3: ( rule__Factor__Group_1_0_1__0 )
                    // InternalMath.g:311:4: rule__Factor__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Factor__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFactorAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__Factor__Alternatives_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:319:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableInit ) | ( ruleVariableUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:323:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableInit ) | ( ruleVariableUse ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt4=1;
                }
                break;
            case 17:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case RULE_ID:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMath.g:324:2: ( ruleNumber )
                    {
                    // InternalMath.g:324:2: ( ruleNumber )
                    // InternalMath.g:325:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:330:2: ( ruleParenthesis )
                    {
                    // InternalMath.g:330:2: ( ruleParenthesis )
                    // InternalMath.g:331:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:336:2: ( ruleVariableInit )
                    {
                    // InternalMath.g:336:2: ( ruleVariableInit )
                    // InternalMath.g:337:3: ruleVariableInit
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableInitParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableInit();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableInitParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMath.g:342:2: ( ruleVariableUse )
                    {
                    // InternalMath.g:342:2: ( ruleVariableUse )
                    // InternalMath.g:343:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_3()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMath.g:352:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:356:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMath.g:357:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

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
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMath.g:364:1: rule__MathExp__Group__0__Impl : ( 'var' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:368:1: ( ( 'var' ) )
            // InternalMath.g:369:1: ( 'var' )
            {
            // InternalMath.g:369:1: ( 'var' )
            // InternalMath.g:370:2: 'var'
            {
             before(grammarAccess.getMathExpAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMath.g:379:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:383:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMath.g:384:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

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
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMath.g:391:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__NameAssignment_1 ) ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:395:1: ( ( ( rule__MathExp__NameAssignment_1 ) ) )
            // InternalMath.g:396:1: ( ( rule__MathExp__NameAssignment_1 ) )
            {
            // InternalMath.g:396:1: ( ( rule__MathExp__NameAssignment_1 ) )
            // InternalMath.g:397:2: ( rule__MathExp__NameAssignment_1 )
            {
             before(grammarAccess.getMathExpAccess().getNameAssignment_1()); 
            // InternalMath.g:398:2: ( rule__MathExp__NameAssignment_1 )
            // InternalMath.g:398:3: rule__MathExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMath.g:406:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl rule__MathExp__Group__3 ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:410:1: ( rule__MathExp__Group__2__Impl rule__MathExp__Group__3 )
            // InternalMath.g:411:2: rule__MathExp__Group__2__Impl rule__MathExp__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__MathExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3();

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
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMath.g:418:1: rule__MathExp__Group__2__Impl : ( '=' ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:422:1: ( ( '=' ) )
            // InternalMath.g:423:1: ( '=' )
            {
            // InternalMath.g:423:1: ( '=' )
            // InternalMath.g:424:2: '='
            {
             before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__MathExp__Group__3"
    // InternalMath.g:433:1: rule__MathExp__Group__3 : rule__MathExp__Group__3__Impl ;
    public final void rule__MathExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:437:1: ( rule__MathExp__Group__3__Impl )
            // InternalMath.g:438:2: rule__MathExp__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3__Impl();

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
    // $ANTLR end "rule__MathExp__Group__3"


    // $ANTLR start "rule__MathExp__Group__3__Impl"
    // InternalMath.g:444:1: rule__MathExp__Group__3__Impl : ( ( rule__MathExp__ExpAssignment_3 ) ) ;
    public final void rule__MathExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:448:1: ( ( ( rule__MathExp__ExpAssignment_3 ) ) )
            // InternalMath.g:449:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            {
            // InternalMath.g:449:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            // InternalMath.g:450:2: ( rule__MathExp__ExpAssignment_3 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_3()); 
            // InternalMath.g:451:2: ( rule__MathExp__ExpAssignment_3 )
            // InternalMath.g:451:3: rule__MathExp__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__3__Impl"


    // $ANTLR start "rule__Exp__Group__0"
    // InternalMath.g:460:1: rule__Exp__Group__0 : rule__Exp__Group__0__Impl rule__Exp__Group__1 ;
    public final void rule__Exp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:464:1: ( rule__Exp__Group__0__Impl rule__Exp__Group__1 )
            // InternalMath.g:465:2: rule__Exp__Group__0__Impl rule__Exp__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group__1();

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
    // $ANTLR end "rule__Exp__Group__0"


    // $ANTLR start "rule__Exp__Group__0__Impl"
    // InternalMath.g:472:1: rule__Exp__Group__0__Impl : ( ruleFactor ) ;
    public final void rule__Exp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:476:1: ( ( ruleFactor ) )
            // InternalMath.g:477:1: ( ruleFactor )
            {
            // InternalMath.g:477:1: ( ruleFactor )
            // InternalMath.g:478:2: ruleFactor
            {
             before(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getFactorParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__0__Impl"


    // $ANTLR start "rule__Exp__Group__1"
    // InternalMath.g:487:1: rule__Exp__Group__1 : rule__Exp__Group__1__Impl ;
    public final void rule__Exp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:491:1: ( rule__Exp__Group__1__Impl )
            // InternalMath.g:492:2: rule__Exp__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group__1__Impl();

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
    // $ANTLR end "rule__Exp__Group__1"


    // $ANTLR start "rule__Exp__Group__1__Impl"
    // InternalMath.g:498:1: rule__Exp__Group__1__Impl : ( ( rule__Exp__Group_1__0 )* ) ;
    public final void rule__Exp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:502:1: ( ( ( rule__Exp__Group_1__0 )* ) )
            // InternalMath.g:503:1: ( ( rule__Exp__Group_1__0 )* )
            {
            // InternalMath.g:503:1: ( ( rule__Exp__Group_1__0 )* )
            // InternalMath.g:504:2: ( rule__Exp__Group_1__0 )*
            {
             before(grammarAccess.getExpAccess().getGroup_1()); 
            // InternalMath.g:505:2: ( rule__Exp__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:505:3: rule__Exp__Group_1__0
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Exp__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getExpAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group__1__Impl"


    // $ANTLR start "rule__Exp__Group_1__0"
    // InternalMath.g:514:1: rule__Exp__Group_1__0 : rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 ;
    public final void rule__Exp__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:518:1: ( rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1 )
            // InternalMath.g:519:2: rule__Exp__Group_1__0__Impl rule__Exp__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Exp__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1();

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
    // $ANTLR end "rule__Exp__Group_1__0"


    // $ANTLR start "rule__Exp__Group_1__0__Impl"
    // InternalMath.g:526:1: rule__Exp__Group_1__0__Impl : ( ( rule__Exp__Alternatives_1_0 ) ) ;
    public final void rule__Exp__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:530:1: ( ( ( rule__Exp__Alternatives_1_0 ) ) )
            // InternalMath.g:531:1: ( ( rule__Exp__Alternatives_1_0 ) )
            {
            // InternalMath.g:531:1: ( ( rule__Exp__Alternatives_1_0 ) )
            // InternalMath.g:532:2: ( rule__Exp__Alternatives_1_0 )
            {
             before(grammarAccess.getExpAccess().getAlternatives_1_0()); 
            // InternalMath.g:533:2: ( rule__Exp__Alternatives_1_0 )
            // InternalMath.g:533:3: rule__Exp__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1__1"
    // InternalMath.g:541:1: rule__Exp__Group_1__1 : rule__Exp__Group_1__1__Impl ;
    public final void rule__Exp__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:545:1: ( rule__Exp__Group_1__1__Impl )
            // InternalMath.g:546:2: rule__Exp__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1__1"


    // $ANTLR start "rule__Exp__Group_1__1__Impl"
    // InternalMath.g:552:1: rule__Exp__Group_1__1__Impl : ( ( rule__Exp__RightAssignment_1_1 ) ) ;
    public final void rule__Exp__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:556:1: ( ( ( rule__Exp__RightAssignment_1_1 ) ) )
            // InternalMath.g:557:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            {
            // InternalMath.g:557:1: ( ( rule__Exp__RightAssignment_1_1 ) )
            // InternalMath.g:558:2: ( rule__Exp__RightAssignment_1_1 )
            {
             before(grammarAccess.getExpAccess().getRightAssignment_1_1()); 
            // InternalMath.g:559:2: ( rule__Exp__RightAssignment_1_1 )
            // InternalMath.g:559:3: rule__Exp__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Exp__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getExpAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__0"
    // InternalMath.g:568:1: rule__Exp__Group_1_0_0__0 : rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 ;
    public final void rule__Exp__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:572:1: ( rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1 )
            // InternalMath.g:573:2: rule__Exp__Group_1_0_0__0__Impl rule__Exp__Group_1_0_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Exp__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1();

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
    // $ANTLR end "rule__Exp__Group_1_0_0__0"


    // $ANTLR start "rule__Exp__Group_1_0_0__0__Impl"
    // InternalMath.g:580:1: rule__Exp__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:584:1: ( ( () ) )
            // InternalMath.g:585:1: ( () )
            {
            // InternalMath.g:585:1: ( () )
            // InternalMath.g:586:2: ()
            {
             before(grammarAccess.getExpAccess().getAddLeftAction_1_0_0_0()); 
            // InternalMath.g:587:2: ()
            // InternalMath.g:587:3: 
            {
            }

             after(grammarAccess.getExpAccess().getAddLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_0__1"
    // InternalMath.g:595:1: rule__Exp__Group_1_0_0__1 : rule__Exp__Group_1_0_0__1__Impl ;
    public final void rule__Exp__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:599:1: ( rule__Exp__Group_1_0_0__1__Impl )
            // InternalMath.g:600:2: rule__Exp__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1_0_0__1"


    // $ANTLR start "rule__Exp__Group_1_0_0__1__Impl"
    // InternalMath.g:606:1: rule__Exp__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__Exp__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:610:1: ( ( '+' ) )
            // InternalMath.g:611:1: ( '+' )
            {
            // InternalMath.g:611:1: ( '+' )
            // InternalMath.g:612:2: '+'
            {
             before(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__0"
    // InternalMath.g:622:1: rule__Exp__Group_1_0_1__0 : rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 ;
    public final void rule__Exp__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:626:1: ( rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1 )
            // InternalMath.g:627:2: rule__Exp__Group_1_0_1__0__Impl rule__Exp__Group_1_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__Exp__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1();

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
    // $ANTLR end "rule__Exp__Group_1_0_1__0"


    // $ANTLR start "rule__Exp__Group_1_0_1__0__Impl"
    // InternalMath.g:634:1: rule__Exp__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Exp__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:638:1: ( ( () ) )
            // InternalMath.g:639:1: ( () )
            {
            // InternalMath.g:639:1: ( () )
            // InternalMath.g:640:2: ()
            {
             before(grammarAccess.getExpAccess().getSubtractLeftAction_1_0_1_0()); 
            // InternalMath.g:641:2: ()
            // InternalMath.g:641:3: 
            {
            }

             after(grammarAccess.getExpAccess().getSubtractLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Exp__Group_1_0_1__1"
    // InternalMath.g:649:1: rule__Exp__Group_1_0_1__1 : rule__Exp__Group_1_0_1__1__Impl ;
    public final void rule__Exp__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:653:1: ( rule__Exp__Group_1_0_1__1__Impl )
            // InternalMath.g:654:2: rule__Exp__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Exp__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Exp__Group_1_0_1__1"


    // $ANTLR start "rule__Exp__Group_1_0_1__1__Impl"
    // InternalMath.g:660:1: rule__Exp__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__Exp__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:664:1: ( ( '-' ) )
            // InternalMath.g:665:1: ( '-' )
            {
            // InternalMath.g:665:1: ( '-' )
            // InternalMath.g:666:2: '-'
            {
             before(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Factor__Group__0"
    // InternalMath.g:676:1: rule__Factor__Group__0 : rule__Factor__Group__0__Impl rule__Factor__Group__1 ;
    public final void rule__Factor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:680:1: ( rule__Factor__Group__0__Impl rule__Factor__Group__1 )
            // InternalMath.g:681:2: rule__Factor__Group__0__Impl rule__Factor__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__Factor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group__1();

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
    // $ANTLR end "rule__Factor__Group__0"


    // $ANTLR start "rule__Factor__Group__0__Impl"
    // InternalMath.g:688:1: rule__Factor__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Factor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:692:1: ( ( rulePrimary ) )
            // InternalMath.g:693:1: ( rulePrimary )
            {
            // InternalMath.g:693:1: ( rulePrimary )
            // InternalMath.g:694:2: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__0__Impl"


    // $ANTLR start "rule__Factor__Group__1"
    // InternalMath.g:703:1: rule__Factor__Group__1 : rule__Factor__Group__1__Impl ;
    public final void rule__Factor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:707:1: ( rule__Factor__Group__1__Impl )
            // InternalMath.g:708:2: rule__Factor__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group__1__Impl();

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
    // $ANTLR end "rule__Factor__Group__1"


    // $ANTLR start "rule__Factor__Group__1__Impl"
    // InternalMath.g:714:1: rule__Factor__Group__1__Impl : ( ( rule__Factor__Group_1__0 )* ) ;
    public final void rule__Factor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:718:1: ( ( ( rule__Factor__Group_1__0 )* ) )
            // InternalMath.g:719:1: ( ( rule__Factor__Group_1__0 )* )
            {
            // InternalMath.g:719:1: ( ( rule__Factor__Group_1__0 )* )
            // InternalMath.g:720:2: ( rule__Factor__Group_1__0 )*
            {
             before(grammarAccess.getFactorAccess().getGroup_1()); 
            // InternalMath.g:721:2: ( rule__Factor__Group_1__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:721:3: rule__Factor__Group_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Factor__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getFactorAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group__1__Impl"


    // $ANTLR start "rule__Factor__Group_1__0"
    // InternalMath.g:730:1: rule__Factor__Group_1__0 : rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 ;
    public final void rule__Factor__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:734:1: ( rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1 )
            // InternalMath.g:735:2: rule__Factor__Group_1__0__Impl rule__Factor__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Factor__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1();

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
    // $ANTLR end "rule__Factor__Group_1__0"


    // $ANTLR start "rule__Factor__Group_1__0__Impl"
    // InternalMath.g:742:1: rule__Factor__Group_1__0__Impl : ( ( rule__Factor__Alternatives_1_0 ) ) ;
    public final void rule__Factor__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:746:1: ( ( ( rule__Factor__Alternatives_1_0 ) ) )
            // InternalMath.g:747:1: ( ( rule__Factor__Alternatives_1_0 ) )
            {
            // InternalMath.g:747:1: ( ( rule__Factor__Alternatives_1_0 ) )
            // InternalMath.g:748:2: ( rule__Factor__Alternatives_1_0 )
            {
             before(grammarAccess.getFactorAccess().getAlternatives_1_0()); 
            // InternalMath.g:749:2: ( rule__Factor__Alternatives_1_0 )
            // InternalMath.g:749:3: rule__Factor__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1__1"
    // InternalMath.g:757:1: rule__Factor__Group_1__1 : rule__Factor__Group_1__1__Impl ;
    public final void rule__Factor__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:761:1: ( rule__Factor__Group_1__1__Impl )
            // InternalMath.g:762:2: rule__Factor__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1__1"


    // $ANTLR start "rule__Factor__Group_1__1__Impl"
    // InternalMath.g:768:1: rule__Factor__Group_1__1__Impl : ( ( rule__Factor__RightAssignment_1_1 ) ) ;
    public final void rule__Factor__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:772:1: ( ( ( rule__Factor__RightAssignment_1_1 ) ) )
            // InternalMath.g:773:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            {
            // InternalMath.g:773:1: ( ( rule__Factor__RightAssignment_1_1 ) )
            // InternalMath.g:774:2: ( rule__Factor__RightAssignment_1_1 )
            {
             before(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 
            // InternalMath.g:775:2: ( rule__Factor__RightAssignment_1_1 )
            // InternalMath.g:775:3: rule__Factor__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Factor__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFactorAccess().getRightAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__0"
    // InternalMath.g:784:1: rule__Factor__Group_1_0_0__0 : rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 ;
    public final void rule__Factor__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:788:1: ( rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1 )
            // InternalMath.g:789:2: rule__Factor__Group_1_0_0__0__Impl rule__Factor__Group_1_0_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Factor__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1();

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
    // $ANTLR end "rule__Factor__Group_1_0_0__0"


    // $ANTLR start "rule__Factor__Group_1_0_0__0__Impl"
    // InternalMath.g:796:1: rule__Factor__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:800:1: ( ( () ) )
            // InternalMath.g:801:1: ( () )
            {
            // InternalMath.g:801:1: ( () )
            // InternalMath.g:802:2: ()
            {
             before(grammarAccess.getFactorAccess().getMultiplyLeftAction_1_0_0_0()); 
            // InternalMath.g:803:2: ()
            // InternalMath.g:803:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getMultiplyLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_0__1"
    // InternalMath.g:811:1: rule__Factor__Group_1_0_0__1 : rule__Factor__Group_1_0_0__1__Impl ;
    public final void rule__Factor__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:815:1: ( rule__Factor__Group_1_0_0__1__Impl )
            // InternalMath.g:816:2: rule__Factor__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1_0_0__1"


    // $ANTLR start "rule__Factor__Group_1_0_0__1__Impl"
    // InternalMath.g:822:1: rule__Factor__Group_1_0_0__1__Impl : ( '*' ) ;
    public final void rule__Factor__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:826:1: ( ( '*' ) )
            // InternalMath.g:827:1: ( '*' )
            {
            // InternalMath.g:827:1: ( '*' )
            // InternalMath.g:828:2: '*'
            {
             before(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__0"
    // InternalMath.g:838:1: rule__Factor__Group_1_0_1__0 : rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 ;
    public final void rule__Factor__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:842:1: ( rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1 )
            // InternalMath.g:843:2: rule__Factor__Group_1_0_1__0__Impl rule__Factor__Group_1_0_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Factor__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1();

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
    // $ANTLR end "rule__Factor__Group_1_0_1__0"


    // $ANTLR start "rule__Factor__Group_1_0_1__0__Impl"
    // InternalMath.g:850:1: rule__Factor__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__Factor__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:854:1: ( ( () ) )
            // InternalMath.g:855:1: ( () )
            {
            // InternalMath.g:855:1: ( () )
            // InternalMath.g:856:2: ()
            {
             before(grammarAccess.getFactorAccess().getDivideLeftAction_1_0_1_0()); 
            // InternalMath.g:857:2: ()
            // InternalMath.g:857:3: 
            {
            }

             after(grammarAccess.getFactorAccess().getDivideLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__Factor__Group_1_0_1__1"
    // InternalMath.g:865:1: rule__Factor__Group_1_0_1__1 : rule__Factor__Group_1_0_1__1__Impl ;
    public final void rule__Factor__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:869:1: ( rule__Factor__Group_1_0_1__1__Impl )
            // InternalMath.g:870:2: rule__Factor__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Factor__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__Factor__Group_1_0_1__1"


    // $ANTLR start "rule__Factor__Group_1_0_1__1__Impl"
    // InternalMath.g:876:1: rule__Factor__Group_1_0_1__1__Impl : ( '/' ) ;
    public final void rule__Factor__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:880:1: ( ( '/' ) )
            // InternalMath.g:881:1: ( '/' )
            {
            // InternalMath.g:881:1: ( '/' )
            // InternalMath.g:882:2: '/'
            {
             before(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMath.g:892:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:896:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMath.g:897:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

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
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMath.g:904:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:908:1: ( ( '(' ) )
            // InternalMath.g:909:1: ( '(' )
            {
            // InternalMath.g:909:1: ( '(' )
            // InternalMath.g:910:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMath.g:919:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:923:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMath.g:924:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

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
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMath.g:931:1: rule__Parenthesis__Group__1__Impl : ( ruleExp ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:935:1: ( ( ruleExp ) )
            // InternalMath.g:936:1: ( ruleExp )
            {
            // InternalMath.g:936:1: ( ruleExp )
            // InternalMath.g:937:2: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpParserRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMath.g:946:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:950:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMath.g:951:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

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
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMath.g:957:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:961:1: ( ( ')' ) )
            // InternalMath.g:962:1: ( ')' )
            {
            // InternalMath.g:962:1: ( ')' )
            // InternalMath.g:963:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalMath.g:973:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:977:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalMath.g:978:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Number__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

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
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalMath.g:985:1: rule__Number__Group__0__Impl : ( () ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:989:1: ( ( () ) )
            // InternalMath.g:990:1: ( () )
            {
            // InternalMath.g:990:1: ( () )
            // InternalMath.g:991:2: ()
            {
             before(grammarAccess.getNumberAccess().getNumAction_0()); 
            // InternalMath.g:992:2: ()
            // InternalMath.g:992:3: 
            {
            }

             after(grammarAccess.getNumberAccess().getNumAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalMath.g:1000:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1004:1: ( rule__Number__Group__1__Impl )
            // InternalMath.g:1005:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

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
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalMath.g:1011:1: rule__Number__Group__1__Impl : ( ( rule__Number__ValueAssignment_1 ) ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1015:1: ( ( ( rule__Number__ValueAssignment_1 ) ) )
            // InternalMath.g:1016:1: ( ( rule__Number__ValueAssignment_1 ) )
            {
            // InternalMath.g:1016:1: ( ( rule__Number__ValueAssignment_1 ) )
            // InternalMath.g:1017:2: ( rule__Number__ValueAssignment_1 )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment_1()); 
            // InternalMath.g:1018:2: ( rule__Number__ValueAssignment_1 )
            // InternalMath.g:1018:3: rule__Number__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__VariableUse__Group__0"
    // InternalMath.g:1027:1: rule__VariableUse__Group__0 : rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 ;
    public final void rule__VariableUse__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1031:1: ( rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1 )
            // InternalMath.g:1032:2: rule__VariableUse__Group__0__Impl rule__VariableUse__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__VariableUse__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__1();

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
    // $ANTLR end "rule__VariableUse__Group__0"


    // $ANTLR start "rule__VariableUse__Group__0__Impl"
    // InternalMath.g:1039:1: rule__VariableUse__Group__0__Impl : ( () ) ;
    public final void rule__VariableUse__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1043:1: ( ( () ) )
            // InternalMath.g:1044:1: ( () )
            {
            // InternalMath.g:1044:1: ( () )
            // InternalMath.g:1045:2: ()
            {
             before(grammarAccess.getVariableUseAccess().getVarUseAction_0()); 
            // InternalMath.g:1046:2: ()
            // InternalMath.g:1046:3: 
            {
            }

             after(grammarAccess.getVariableUseAccess().getVarUseAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__0__Impl"


    // $ANTLR start "rule__VariableUse__Group__1"
    // InternalMath.g:1054:1: rule__VariableUse__Group__1 : rule__VariableUse__Group__1__Impl rule__VariableUse__Group__2 ;
    public final void rule__VariableUse__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1058:1: ( rule__VariableUse__Group__1__Impl rule__VariableUse__Group__2 )
            // InternalMath.g:1059:2: rule__VariableUse__Group__1__Impl rule__VariableUse__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VariableUse__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__2();

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
    // $ANTLR end "rule__VariableUse__Group__1"


    // $ANTLR start "rule__VariableUse__Group__1__Impl"
    // InternalMath.g:1066:1: rule__VariableUse__Group__1__Impl : ( ( rule__VariableUse__InExpAssignment_1 ) ) ;
    public final void rule__VariableUse__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1070:1: ( ( ( rule__VariableUse__InExpAssignment_1 ) ) )
            // InternalMath.g:1071:1: ( ( rule__VariableUse__InExpAssignment_1 ) )
            {
            // InternalMath.g:1071:1: ( ( rule__VariableUse__InExpAssignment_1 ) )
            // InternalMath.g:1072:2: ( rule__VariableUse__InExpAssignment_1 )
            {
             before(grammarAccess.getVariableUseAccess().getInExpAssignment_1()); 
            // InternalMath.g:1073:2: ( rule__VariableUse__InExpAssignment_1 )
            // InternalMath.g:1073:3: rule__VariableUse__InExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__InExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getInExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__1__Impl"


    // $ANTLR start "rule__VariableUse__Group__2"
    // InternalMath.g:1081:1: rule__VariableUse__Group__2 : rule__VariableUse__Group__2__Impl ;
    public final void rule__VariableUse__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1085:1: ( rule__VariableUse__Group__2__Impl )
            // InternalMath.g:1086:2: rule__VariableUse__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__Group__2__Impl();

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
    // $ANTLR end "rule__VariableUse__Group__2"


    // $ANTLR start "rule__VariableUse__Group__2__Impl"
    // InternalMath.g:1092:1: rule__VariableUse__Group__2__Impl : ( ( rule__VariableUse__InVariableInitAssignment_2 ) ) ;
    public final void rule__VariableUse__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1096:1: ( ( ( rule__VariableUse__InVariableInitAssignment_2 ) ) )
            // InternalMath.g:1097:1: ( ( rule__VariableUse__InVariableInitAssignment_2 ) )
            {
            // InternalMath.g:1097:1: ( ( rule__VariableUse__InVariableInitAssignment_2 ) )
            // InternalMath.g:1098:2: ( rule__VariableUse__InVariableInitAssignment_2 )
            {
             before(grammarAccess.getVariableUseAccess().getInVariableInitAssignment_2()); 
            // InternalMath.g:1099:2: ( rule__VariableUse__InVariableInitAssignment_2 )
            // InternalMath.g:1099:3: rule__VariableUse__InVariableInitAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__InVariableInitAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getInVariableInitAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__Group__2__Impl"


    // $ANTLR start "rule__VariableInit__Group__0"
    // InternalMath.g:1108:1: rule__VariableInit__Group__0 : rule__VariableInit__Group__0__Impl rule__VariableInit__Group__1 ;
    public final void rule__VariableInit__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1112:1: ( rule__VariableInit__Group__0__Impl rule__VariableInit__Group__1 )
            // InternalMath.g:1113:2: rule__VariableInit__Group__0__Impl rule__VariableInit__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__VariableInit__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__1();

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
    // $ANTLR end "rule__VariableInit__Group__0"


    // $ANTLR start "rule__VariableInit__Group__0__Impl"
    // InternalMath.g:1120:1: rule__VariableInit__Group__0__Impl : ( () ) ;
    public final void rule__VariableInit__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1124:1: ( ( () ) )
            // InternalMath.g:1125:1: ( () )
            {
            // InternalMath.g:1125:1: ( () )
            // InternalMath.g:1126:2: ()
            {
             before(grammarAccess.getVariableInitAccess().getVariableInitAction_0()); 
            // InternalMath.g:1127:2: ()
            // InternalMath.g:1127:3: 
            {
            }

             after(grammarAccess.getVariableInitAccess().getVariableInitAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__0__Impl"


    // $ANTLR start "rule__VariableInit__Group__1"
    // InternalMath.g:1135:1: rule__VariableInit__Group__1 : rule__VariableInit__Group__1__Impl rule__VariableInit__Group__2 ;
    public final void rule__VariableInit__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1139:1: ( rule__VariableInit__Group__1__Impl rule__VariableInit__Group__2 )
            // InternalMath.g:1140:2: rule__VariableInit__Group__1__Impl rule__VariableInit__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__VariableInit__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__2();

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
    // $ANTLR end "rule__VariableInit__Group__1"


    // $ANTLR start "rule__VariableInit__Group__1__Impl"
    // InternalMath.g:1147:1: rule__VariableInit__Group__1__Impl : ( 'let' ) ;
    public final void rule__VariableInit__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1151:1: ( ( 'let' ) )
            // InternalMath.g:1152:1: ( 'let' )
            {
            // InternalMath.g:1152:1: ( 'let' )
            // InternalMath.g:1153:2: 'let'
            {
             before(grammarAccess.getVariableInitAccess().getLetKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVariableInitAccess().getLetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__1__Impl"


    // $ANTLR start "rule__VariableInit__Group__2"
    // InternalMath.g:1162:1: rule__VariableInit__Group__2 : rule__VariableInit__Group__2__Impl rule__VariableInit__Group__3 ;
    public final void rule__VariableInit__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1166:1: ( rule__VariableInit__Group__2__Impl rule__VariableInit__Group__3 )
            // InternalMath.g:1167:2: rule__VariableInit__Group__2__Impl rule__VariableInit__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__VariableInit__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__3();

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
    // $ANTLR end "rule__VariableInit__Group__2"


    // $ANTLR start "rule__VariableInit__Group__2__Impl"
    // InternalMath.g:1174:1: rule__VariableInit__Group__2__Impl : ( ( rule__VariableInit__NameAssignment_2 ) ) ;
    public final void rule__VariableInit__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1178:1: ( ( ( rule__VariableInit__NameAssignment_2 ) ) )
            // InternalMath.g:1179:1: ( ( rule__VariableInit__NameAssignment_2 ) )
            {
            // InternalMath.g:1179:1: ( ( rule__VariableInit__NameAssignment_2 ) )
            // InternalMath.g:1180:2: ( rule__VariableInit__NameAssignment_2 )
            {
             before(grammarAccess.getVariableInitAccess().getNameAssignment_2()); 
            // InternalMath.g:1181:2: ( rule__VariableInit__NameAssignment_2 )
            // InternalMath.g:1181:3: rule__VariableInit__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableInit__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableInitAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__2__Impl"


    // $ANTLR start "rule__VariableInit__Group__3"
    // InternalMath.g:1189:1: rule__VariableInit__Group__3 : rule__VariableInit__Group__3__Impl rule__VariableInit__Group__4 ;
    public final void rule__VariableInit__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1193:1: ( rule__VariableInit__Group__3__Impl rule__VariableInit__Group__4 )
            // InternalMath.g:1194:2: rule__VariableInit__Group__3__Impl rule__VariableInit__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__VariableInit__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__4();

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
    // $ANTLR end "rule__VariableInit__Group__3"


    // $ANTLR start "rule__VariableInit__Group__3__Impl"
    // InternalMath.g:1201:1: rule__VariableInit__Group__3__Impl : ( '=' ) ;
    public final void rule__VariableInit__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1205:1: ( ( '=' ) )
            // InternalMath.g:1206:1: ( '=' )
            {
            // InternalMath.g:1206:1: ( '=' )
            // InternalMath.g:1207:2: '='
            {
             before(grammarAccess.getVariableInitAccess().getEqualsSignKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getVariableInitAccess().getEqualsSignKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__3__Impl"


    // $ANTLR start "rule__VariableInit__Group__4"
    // InternalMath.g:1216:1: rule__VariableInit__Group__4 : rule__VariableInit__Group__4__Impl rule__VariableInit__Group__5 ;
    public final void rule__VariableInit__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1220:1: ( rule__VariableInit__Group__4__Impl rule__VariableInit__Group__5 )
            // InternalMath.g:1221:2: rule__VariableInit__Group__4__Impl rule__VariableInit__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__VariableInit__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__5();

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
    // $ANTLR end "rule__VariableInit__Group__4"


    // $ANTLR start "rule__VariableInit__Group__4__Impl"
    // InternalMath.g:1228:1: rule__VariableInit__Group__4__Impl : ( ( rule__VariableInit__InitAssignment_4 ) ) ;
    public final void rule__VariableInit__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1232:1: ( ( ( rule__VariableInit__InitAssignment_4 ) ) )
            // InternalMath.g:1233:1: ( ( rule__VariableInit__InitAssignment_4 ) )
            {
            // InternalMath.g:1233:1: ( ( rule__VariableInit__InitAssignment_4 ) )
            // InternalMath.g:1234:2: ( rule__VariableInit__InitAssignment_4 )
            {
             before(grammarAccess.getVariableInitAccess().getInitAssignment_4()); 
            // InternalMath.g:1235:2: ( rule__VariableInit__InitAssignment_4 )
            // InternalMath.g:1235:3: rule__VariableInit__InitAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__VariableInit__InitAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getVariableInitAccess().getInitAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__4__Impl"


    // $ANTLR start "rule__VariableInit__Group__5"
    // InternalMath.g:1243:1: rule__VariableInit__Group__5 : rule__VariableInit__Group__5__Impl rule__VariableInit__Group__6 ;
    public final void rule__VariableInit__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1247:1: ( rule__VariableInit__Group__5__Impl rule__VariableInit__Group__6 )
            // InternalMath.g:1248:2: rule__VariableInit__Group__5__Impl rule__VariableInit__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__VariableInit__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__6();

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
    // $ANTLR end "rule__VariableInit__Group__5"


    // $ANTLR start "rule__VariableInit__Group__5__Impl"
    // InternalMath.g:1255:1: rule__VariableInit__Group__5__Impl : ( 'in' ) ;
    public final void rule__VariableInit__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1259:1: ( ( 'in' ) )
            // InternalMath.g:1260:1: ( 'in' )
            {
            // InternalMath.g:1260:1: ( 'in' )
            // InternalMath.g:1261:2: 'in'
            {
             before(grammarAccess.getVariableInitAccess().getInKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVariableInitAccess().getInKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__5__Impl"


    // $ANTLR start "rule__VariableInit__Group__6"
    // InternalMath.g:1270:1: rule__VariableInit__Group__6 : rule__VariableInit__Group__6__Impl rule__VariableInit__Group__7 ;
    public final void rule__VariableInit__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1274:1: ( rule__VariableInit__Group__6__Impl rule__VariableInit__Group__7 )
            // InternalMath.g:1275:2: rule__VariableInit__Group__6__Impl rule__VariableInit__Group__7
            {
            pushFollow(FOLLOW_17);
            rule__VariableInit__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__7();

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
    // $ANTLR end "rule__VariableInit__Group__6"


    // $ANTLR start "rule__VariableInit__Group__6__Impl"
    // InternalMath.g:1282:1: rule__VariableInit__Group__6__Impl : ( ( rule__VariableInit__StatementAssignment_6 ) ) ;
    public final void rule__VariableInit__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1286:1: ( ( ( rule__VariableInit__StatementAssignment_6 ) ) )
            // InternalMath.g:1287:1: ( ( rule__VariableInit__StatementAssignment_6 ) )
            {
            // InternalMath.g:1287:1: ( ( rule__VariableInit__StatementAssignment_6 ) )
            // InternalMath.g:1288:2: ( rule__VariableInit__StatementAssignment_6 )
            {
             before(grammarAccess.getVariableInitAccess().getStatementAssignment_6()); 
            // InternalMath.g:1289:2: ( rule__VariableInit__StatementAssignment_6 )
            // InternalMath.g:1289:3: rule__VariableInit__StatementAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__VariableInit__StatementAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getVariableInitAccess().getStatementAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__6__Impl"


    // $ANTLR start "rule__VariableInit__Group__7"
    // InternalMath.g:1297:1: rule__VariableInit__Group__7 : rule__VariableInit__Group__7__Impl ;
    public final void rule__VariableInit__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1301:1: ( rule__VariableInit__Group__7__Impl )
            // InternalMath.g:1302:2: rule__VariableInit__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableInit__Group__7__Impl();

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
    // $ANTLR end "rule__VariableInit__Group__7"


    // $ANTLR start "rule__VariableInit__Group__7__Impl"
    // InternalMath.g:1308:1: rule__VariableInit__Group__7__Impl : ( 'end' ) ;
    public final void rule__VariableInit__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1312:1: ( ( 'end' ) )
            // InternalMath.g:1313:1: ( 'end' )
            {
            // InternalMath.g:1313:1: ( 'end' )
            // InternalMath.g:1314:2: 'end'
            {
             before(grammarAccess.getVariableInitAccess().getEndKeyword_7()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVariableInitAccess().getEndKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__Group__7__Impl"


    // $ANTLR start "rule__Variables__VariablesAssignment"
    // InternalMath.g:1324:1: rule__Variables__VariablesAssignment : ( ruleMathExp ) ;
    public final void rule__Variables__VariablesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1328:1: ( ( ruleMathExp ) )
            // InternalMath.g:1329:2: ( ruleMathExp )
            {
            // InternalMath.g:1329:2: ( ruleMathExp )
            // InternalMath.g:1330:3: ruleMathExp
            {
             before(grammarAccess.getVariablesAccess().getVariablesMathExpParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getVariablesAccess().getVariablesMathExpParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Variables__VariablesAssignment"


    // $ANTLR start "rule__MathExp__NameAssignment_1"
    // InternalMath.g:1339:1: rule__MathExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MathExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1343:1: ( ( RULE_ID ) )
            // InternalMath.g:1344:2: ( RULE_ID )
            {
            // InternalMath.g:1344:2: ( RULE_ID )
            // InternalMath.g:1345:3: RULE_ID
            {
             before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__NameAssignment_1"


    // $ANTLR start "rule__MathExp__ExpAssignment_3"
    // InternalMath.g:1354:1: rule__MathExp__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1358:1: ( ( ruleExp ) )
            // InternalMath.g:1359:2: ( ruleExp )
            {
            // InternalMath.g:1359:2: ( ruleExp )
            // InternalMath.g:1360:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_3"


    // $ANTLR start "rule__Exp__RightAssignment_1_1"
    // InternalMath.g:1369:1: rule__Exp__RightAssignment_1_1 : ( ruleFactor ) ;
    public final void rule__Exp__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1373:1: ( ( ruleFactor ) )
            // InternalMath.g:1374:2: ( ruleFactor )
            {
            // InternalMath.g:1374:2: ( ruleFactor )
            // InternalMath.g:1375:3: ruleFactor
            {
             before(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFactor();

            state._fsp--;

             after(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Exp__RightAssignment_1_1"


    // $ANTLR start "rule__Factor__RightAssignment_1_1"
    // InternalMath.g:1384:1: rule__Factor__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__Factor__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1388:1: ( ( rulePrimary ) )
            // InternalMath.g:1389:2: ( rulePrimary )
            {
            // InternalMath.g:1389:2: ( rulePrimary )
            // InternalMath.g:1390:3: rulePrimary
            {
             before(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Factor__RightAssignment_1_1"


    // $ANTLR start "rule__Number__ValueAssignment_1"
    // InternalMath.g:1399:1: rule__Number__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1403:1: ( ( RULE_INT ) )
            // InternalMath.g:1404:2: ( RULE_INT )
            {
            // InternalMath.g:1404:2: ( RULE_INT )
            // InternalMath.g:1405:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment_1"


    // $ANTLR start "rule__VariableUse__InExpAssignment_1"
    // InternalMath.g:1414:1: rule__VariableUse__InExpAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__InExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1418:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1419:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1419:2: ( ( RULE_ID ) )
            // InternalMath.g:1420:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getInExpMathExpCrossReference_1_0()); 
            // InternalMath.g:1421:3: ( RULE_ID )
            // InternalMath.g:1422:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getInExpMathExpIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getInExpMathExpIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getInExpMathExpCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__InExpAssignment_1"


    // $ANTLR start "rule__VariableUse__InVariableInitAssignment_2"
    // InternalMath.g:1433:1: rule__VariableUse__InVariableInitAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__InVariableInitAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1437:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1438:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1438:2: ( ( RULE_ID ) )
            // InternalMath.g:1439:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getInVariableInitVariableInitCrossReference_2_0()); 
            // InternalMath.g:1440:3: ( RULE_ID )
            // InternalMath.g:1441:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getInVariableInitVariableInitIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getInVariableInitVariableInitIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getInVariableInitVariableInitCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__InVariableInitAssignment_2"


    // $ANTLR start "rule__VariableInit__NameAssignment_2"
    // InternalMath.g:1452:1: rule__VariableInit__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__VariableInit__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1456:1: ( ( RULE_ID ) )
            // InternalMath.g:1457:2: ( RULE_ID )
            {
            // InternalMath.g:1457:2: ( RULE_ID )
            // InternalMath.g:1458:3: RULE_ID
            {
             before(grammarAccess.getVariableInitAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableInitAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__NameAssignment_2"


    // $ANTLR start "rule__VariableInit__InitAssignment_4"
    // InternalMath.g:1467:1: rule__VariableInit__InitAssignment_4 : ( ruleExp ) ;
    public final void rule__VariableInit__InitAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1471:1: ( ( ruleExp ) )
            // InternalMath.g:1472:2: ( ruleExp )
            {
            // InternalMath.g:1472:2: ( ruleExp )
            // InternalMath.g:1473:3: ruleExp
            {
             before(grammarAccess.getVariableInitAccess().getInitExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableInitAccess().getInitExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__InitAssignment_4"


    // $ANTLR start "rule__VariableInit__StatementAssignment_6"
    // InternalMath.g:1482:1: rule__VariableInit__StatementAssignment_6 : ( ruleExp ) ;
    public final void rule__VariableInit__StatementAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1486:1: ( ( ruleExp ) )
            // InternalMath.g:1487:2: ( ruleExp )
            {
            // InternalMath.g:1487:2: ( ruleExp )
            // InternalMath.g:1488:3: ruleExp
            {
             before(grammarAccess.getVariableInitAccess().getStatementExpParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getVariableInitAccess().getStatementExpParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableInit__StatementAssignment_6"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A0030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});

}