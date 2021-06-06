// Generated from python.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pythonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		ID=25, STRING=26, INT=27, WS=28;
	public static final int
		RULE_prog = 0, RULE_stat = 1, RULE_comprehension = 2, RULE_expression = 3, 
		RULE_condition = 4, RULE_slicing = 5, RULE_concatenation = 6, RULE_appendInsertRemove = 7, 
		RULE_assign = 8, RULE_declare = 9, RULE_list = 10, RULE_value = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat", "comprehension", "expression", "condition", "slicing", 
			"concatenation", "appendInsertRemove", "assign", "declare", "list", "value"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'['", "'for'", "'in'", "'if'", "']'", "'max'", "'len'", 
			"'abs'", "'('", "')'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", 
			"':'", "'+'", "'.'", "'append'", "'remove'", "'insert'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "ID", "STRING", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "python.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		java.util.Map<String, java.util.ArrayList<Object>> idToList = new java.util.HashMap<>();

	public pythonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				stat();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public DeclareContext declare() {
			return getRuleContext(DeclareContext.class,0);
		}
		public AppendInsertRemoveContext appendInsertRemove() {
			return getRuleContext(AppendInsertRemoveContext.class,0);
		}
		public ConcatenationContext concatenation() {
			return getRuleContext(ConcatenationContext.class,0);
		}
		public SlicingContext slicing() {
			return getRuleContext(SlicingContext.class,0);
		}
		public ComprehensionContext comprehension() {
			return getRuleContext(ComprehensionContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				declare();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				appendInsertRemove();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				concatenation();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				slicing();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				comprehension();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComprehensionContext extends ParserRuleContext {
		public Token ID;
		public ExpressionContext expression;
		public ConditionContext condition;
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ComprehensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comprehension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterComprehension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitComprehension(this);
		}
	}

	public final ComprehensionContext comprehension() throws RecognitionException {
		ComprehensionContext _localctx = new ComprehensionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comprehension);
		 
							java.util.ArrayList<Object> newListt = new java.util.ArrayList<>();
						     boolean cond=false; 
							
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			((ComprehensionContext)_localctx).ID = match(ID);
			idToList.put((((ComprehensionContext)_localctx).ID!=null?((ComprehensionContext)_localctx).ID.getText():null), newListt);
			setState(39);
			match(T__0);
			setState(40);
			match(T__1);
			setState(41);
			((ComprehensionContext)_localctx).expression = expression();
			setState(42);
			match(T__2);
			setState(43);
			((ComprehensionContext)_localctx).ID = match(ID);
			if ((((ComprehensionContext)_localctx).ID!=null?((ComprehensionContext)_localctx).ID.getText():null) != ((ComprehensionContext)_localctx).expression.variablee) System.out.println("index variable does not match with expression");
			setState(45);
			match(T__3);
			setState(46);
			((ComprehensionContext)_localctx).ID = match(ID);
			setState(47);
			match(T__4);
			setState(48);
			((ComprehensionContext)_localctx).condition = condition();
			setState(49);
			match(T__5);

								  java.util.ArrayList<Object> arList = idToList.get((((ComprehensionContext)_localctx).ID!=null?((ComprehensionContext)_localctx).ID.getText():null));
								  for(int i=0; i<arList.size();i++){
								      Object obj = arList.get(i);
									  Integer oper1 =null; 
									  Integer oper2 = null;
								      if(((ComprehensionContext)_localctx).condition.operand1.equals("len")){
										
									     if(obj instanceof String){
										   String temp = (String) obj;
										   oper1 = new Integer(temp.length()-2);
										 }else if(obj instanceof java.util.ArrayList){
										   java.util.ArrayList<Object> temp = (java.util.ArrayList<Object>) obj;
										   oper1 = new Integer(temp.size());
										 }
									  }else if (((ComprehensionContext)_localctx).condition.operand1.equals("abs")){
										  if(obj instanceof Integer){
											int temp= (Integer) obj;
										    oper1 = new Integer(Math.abs(temp));
										  }
									  }else {
										oper1 = new Integer(((ComprehensionContext)_localctx).condition.int1);
									  }
									  
									  if(((ComprehensionContext)_localctx).condition.operand2 != null){
										if(((ComprehensionContext)_localctx).condition.operand2.equals("len")){
											if(obj instanceof String){
												String temp = (String) obj; 
												oper2 = new Integer(temp.length());
											}else if(obj instanceof java.util.ArrayList){
												java.util.ArrayList<Object> temp = (java.util.ArrayList<Object>) obj;
												oper2 = new Integer(temp.size());
											}
										}else if (((ComprehensionContext)_localctx).condition.operand2.equals("abs")){
											if(obj instanceof Integer){
										    int temp= (Integer) obj;
										    oper2 = new Integer(Math.abs(temp));
										  }
										}
									  }else {
											oper2 = new Integer(((ComprehensionContext)_localctx).condition.int2);
										}
									  
									  if(((ComprehensionContext)_localctx).condition.op.equals("==")) cond = oper1 == oper2;
									  else if(((ComprehensionContext)_localctx).condition.op.equals("!=")) cond = oper1 != oper2;
									  else if(((ComprehensionContext)_localctx).condition.op.equals("<")) cond = oper1 < oper2;
									  else if(((ComprehensionContext)_localctx).condition.op.equals(">")) cond = oper1 > oper2;
									  else if(((ComprehensionContext)_localctx).condition.op.equals("<=")) cond = oper1 <= oper2;
									  else if(((ComprehensionContext)_localctx).condition.op.equals(">=")) cond = oper1 >= oper2;
									  
									if(cond){
									  if(((ComprehensionContext)_localctx).expression.function ==null){
									     newListt.add(obj);
									  }else{
											if(((ComprehensionContext)_localctx).expression.function.equals("max") && obj instanceof String){
												char max = 'A';
												String temp = (String) obj;
												for (int j=0; j<temp.length();j++){
												     if(temp.charAt(j) >max){
													    max = temp.charAt(j);
													 }
												}
												newListt.add(max);
											}
											else if(((ComprehensionContext)_localctx).expression.function.equals("len")){
												if(obj instanceof String) {
												  String temp = (String) obj;
												  newListt.add(temp.length());
												}else if(obj instanceof java.util.ArrayList){
												  java.util.ArrayList<Object> temp = (java.util.ArrayList<Object>) obj;
												  newListt.add(temp.size());
												}
											}
											else if(((ComprehensionContext)_localctx).expression.function.equals("abs")){
												if(obj instanceof Integer){
													Integer temp = (Integer) obj;
													newListt.add(temp);
													}
												}
											}
									}
								  }
								  
								
			}
			_ctx.stop = _input.LT(-1);

						         System.out.println(java.util.Arrays.toString(newListt.toArray()));
								
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String variablee;
		public String function;
		public Token ID;
		public Token funct;
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		int _la;
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				((ExpressionContext)_localctx).ID = match(ID);
				((ExpressionContext)_localctx).variablee =  (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null);
				}
				break;
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(54);
				((ExpressionContext)_localctx).funct = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					((ExpressionContext)_localctx).funct = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				setState(55);
				match(T__9);
				setState(56);
				((ExpressionContext)_localctx).ID = match(ID);
				setState(57);
				match(T__10);

									   ((ExpressionContext)_localctx).function =  (((ExpressionContext)_localctx).funct!=null?((ExpressionContext)_localctx).funct.getText():null);
									   ((ExpressionContext)_localctx).variablee =  (((ExpressionContext)_localctx).ID!=null?((ExpressionContext)_localctx).ID.getText():null);
									 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public String operand1;
		public Integer int1;
		public String op;
		public String operand2;
		public Integer int2;
		public String variable1;
		public String variable2;
		public Token INT;
		public Token funct1;
		public Token ID;
		public Token oper;
		public Token funct2;
		public List<TerminalNode> INT() { return getTokens(pythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(pythonParser.INT, i);
		}
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(61);
				((ConditionContext)_localctx).INT = match(INT);
				}
				break;
			case T__7:
			case T__8:
				{
				{
				setState(62);
				((ConditionContext)_localctx).funct1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((ConditionContext)_localctx).funct1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(63);
				match(T__9);
				setState(64);
				((ConditionContext)_localctx).ID = match(ID);
				setState(65);
				match(T__10);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			   
					     ((ConditionContext)_localctx).operand1 =  (((ConditionContext)_localctx).funct1!=null?((ConditionContext)_localctx).funct1.getText():null);
						 
						 if((((ConditionContext)_localctx).INT!=null?((ConditionContext)_localctx).INT.getText():null) != null) ((ConditionContext)_localctx).int1 =  new Integer(Integer.parseInt((((ConditionContext)_localctx).INT!=null?((ConditionContext)_localctx).INT.getText():null)));
						 ((ConditionContext)_localctx).variable1 =  (((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null);			 
					 
			setState(69);
			((ConditionContext)_localctx).oper = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
				((ConditionContext)_localctx).oper = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				{
				setState(70);
				((ConditionContext)_localctx).INT = match(INT);
				}
				break;
			case T__7:
			case T__8:
				{
				{
				setState(71);
				((ConditionContext)_localctx).funct2 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__7 || _la==T__8) ) {
					((ConditionContext)_localctx).funct2 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(72);
				match(T__9);
				setState(73);
				((ConditionContext)_localctx).ID = match(ID);
				setState(74);
				match(T__10);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			   
					     ((ConditionContext)_localctx).op =  (((ConditionContext)_localctx).oper!=null?((ConditionContext)_localctx).oper.getText():null);
					     ((ConditionContext)_localctx).operand2 =  (((ConditionContext)_localctx).funct2!=null?((ConditionContext)_localctx).funct2.getText():null);
						 if((((ConditionContext)_localctx).INT!=null?((ConditionContext)_localctx).INT.getText():null) != null) ((ConditionContext)_localctx).int2 =  new Integer(Integer.parseInt((((ConditionContext)_localctx).INT!=null?((ConditionContext)_localctx).INT.getText():null)));
						 ((ConditionContext)_localctx).variable2 =  (((ConditionContext)_localctx).ID!=null?((ConditionContext)_localctx).ID.getText():null);	
						 if (_localctx.variable1 == null && _localctx.variable2==null) System.out.println("error");
						 if (_localctx.variable1 !=null && _localctx.variable2 != null && !_localctx.variable1.equals(_localctx.variable2))
						     System.out.println("error2");
					 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SlicingContext extends ParserRuleContext {
		public Token ID;
		public Token INT;
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public List<TerminalNode> INT() { return getTokens(pythonParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(pythonParser.INT, i);
		}
		public SlicingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_slicing; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterSlicing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitSlicing(this);
		}
	}

	public final SlicingContext slicing() throws RecognitionException {
		SlicingContext _localctx = new SlicingContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_slicing);

						java.util.ArrayList<Object> newListt = new java.util.ArrayList<>();
						Integer beginIndex= new Integer(0);
						Integer endIndex;
						java.util.ArrayList<Object> gettt;
					  
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			((SlicingContext)_localctx).ID = match(ID);
			idToList.put((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null), newListt);
			setState(81);
			match(T__0);
			setState(82);
			((SlicingContext)_localctx).ID = match(ID);

						                                                   gettt = idToList.get((((SlicingContext)_localctx).ID!=null?((SlicingContext)_localctx).ID.getText():null));
																		   endIndex = new Integer(gettt.size());
																		  
			setState(84);
			match(T__1);
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(85);
				((SlicingContext)_localctx).INT = match(INT);

																							beginIndex = new Integer(Integer.parseInt((((SlicingContext)_localctx).INT!=null?((SlicingContext)_localctx).INT.getText():null)));
																			              
				}
			}

			setState(89);
			match(T__17);
			setState(92);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==INT) {
				{
				setState(90);
				((SlicingContext)_localctx).INT = match(INT);

																						                 endIndex= new Integer(Integer.parseInt((((SlicingContext)_localctx).INT!=null?((SlicingContext)_localctx).INT.getText():null)));
																						                
				}
			}

			setState(94);
			match(T__5);
			}
			_ctx.stop = _input.LT(-1);

					        for(int i=beginIndex; i<endIndex;i++){
							  newListt.add(gettt.get(i));
							}
							System.out.println("Slicing");
							System.out.println(java.util.Arrays.toString(newListt.toArray()));
					      
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConcatenationContext extends ParserRuleContext {
		public Token ID;
		public ListContext list;
		public List<TerminalNode> ID() { return getTokens(pythonParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(pythonParser.ID, i);
		}
		public List<ListContext> list() {
			return getRuleContexts(ListContext.class);
		}
		public ListContext list(int i) {
			return getRuleContext(ListContext.class,i);
		}
		public ConcatenationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concatenation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitConcatenation(this);
		}
	}

	public final ConcatenationContext concatenation() throws RecognitionException {
		ConcatenationContext _localctx = new ConcatenationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_concatenation);

		                      java.util.ArrayList<Object> newList = new java.util.ArrayList<>();
							
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			((ConcatenationContext)_localctx).ID = match(ID);
			idToList.put((((ConcatenationContext)_localctx).ID!=null?((ConcatenationContext)_localctx).ID.getText():null), newList);
			setState(98);
			match(T__0);
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(99);
				((ConcatenationContext)_localctx).ID = match(ID);
					
																					 java.util.ArrayList<Object> arlist = idToList.get((((ConcatenationContext)_localctx).ID!=null?((ConcatenationContext)_localctx).ID.getText():null));
																					 for (int i=0; i<arlist.size();i++){
																					    newList.add(arlist.get(i));
																					 }
								                                                   
				}
				break;
			case T__1:
				{
				setState(101);
				((ConcatenationContext)_localctx).list = list();

																				              for (int i=0; i<((ConcatenationContext)_localctx).list.newList.size();i++){
																								newList.add(((ConcatenationContext)_localctx).list.newList.get(i));
																							   }
																				            
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(106);
			match(T__18);
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(107);
				((ConcatenationContext)_localctx).ID = match(ID);

				                                                                       java.util.ArrayList<Object> arlist = idToList.get((((ConcatenationContext)_localctx).ID!=null?((ConcatenationContext)_localctx).ID.getText():null));
																					    for (int i=0; i<arlist.size();i++){
																							newList.add(arlist.get(i));
																					    }
																					
				}
				break;
			case T__1:
				{
				setState(109);
				((ConcatenationContext)_localctx).list = list();

				 																	           for (int i=0; i<((ConcatenationContext)_localctx).list.newList.size();i++){
																								newList.add(((ConcatenationContext)_localctx).list.newList.get(i));
																							   }
																							 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			_ctx.stop = _input.LT(-1);

						          System.out.println(java.util.Arrays.toString(newList.toArray()));
						        
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AppendInsertRemoveContext extends ParserRuleContext {
		public Token ID;
		public Token word;
		public Token INT;
		public ValueContext value;
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode INT() { return getToken(pythonParser.INT, 0); }
		public AppendInsertRemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_appendInsertRemove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterAppendInsertRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitAppendInsertRemove(this);
		}
	}

	public final AppendInsertRemoveContext appendInsertRemove() throws RecognitionException {
		AppendInsertRemoveContext _localctx = new AppendInsertRemoveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_appendInsertRemove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			((AppendInsertRemoveContext)_localctx).ID = match(ID);
			setState(115);
			match(T__19);
			{
			setState(116);
			((AppendInsertRemoveContext)_localctx).word = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__20) | (1L << T__21) | (1L << T__22))) != 0)) ) {
				((AppendInsertRemoveContext)_localctx).word = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
			setState(117);
			match(T__9);
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(118);
				((AppendInsertRemoveContext)_localctx).INT = match(INT);
				setState(119);
				match(T__23);
				}
				break;
			}
			setState(122);
			((AppendInsertRemoveContext)_localctx).value = value();
			setState(123);
			match(T__10);

									System.out.println("appendinsertremove");
									java.util.ArrayList<Object> gett = idToList.get((((AppendInsertRemoveContext)_localctx).ID!=null?((AppendInsertRemoveContext)_localctx).ID.getText():null));
									if(gett != null) {
										if((((AppendInsertRemoveContext)_localctx).word!=null?((AppendInsertRemoveContext)_localctx).word.getText():null).equals("append")){
											if(((AppendInsertRemoveContext)_localctx).value.str !=null) gett.add(((AppendInsertRemoveContext)_localctx).value.str);
											else if(((AppendInsertRemoveContext)_localctx).value.in !=null) gett.add(((AppendInsertRemoveContext)_localctx).value.in);
											else if(((AppendInsertRemoveContext)_localctx).value.listt!=null) gett.add(((AppendInsertRemoveContext)_localctx).value.listt);
										} else if((((AppendInsertRemoveContext)_localctx).word!=null?((AppendInsertRemoveContext)_localctx).word.getText():null).equals("remove")){
											if(((AppendInsertRemoveContext)_localctx).value.str !=null) gett.remove(((AppendInsertRemoveContext)_localctx).value.str);
											else if(((AppendInsertRemoveContext)_localctx).value.in !=null) gett.remove(((AppendInsertRemoveContext)_localctx).value.in);
											else if(((AppendInsertRemoveContext)_localctx).value.listt!=null) gett.remove(((AppendInsertRemoveContext)_localctx).value.listt);
										} else if((((AppendInsertRemoveContext)_localctx).word!=null?((AppendInsertRemoveContext)_localctx).word.getText():null).equals("insert")){
											if(((AppendInsertRemoveContext)_localctx).value.str !=null) gett.add(Integer.parseInt((((AppendInsertRemoveContext)_localctx).INT!=null?((AppendInsertRemoveContext)_localctx).INT.getText():null)),((AppendInsertRemoveContext)_localctx).value.str);
											else if(((AppendInsertRemoveContext)_localctx).value.in !=null) gett.add(Integer.parseInt((((AppendInsertRemoveContext)_localctx).INT!=null?((AppendInsertRemoveContext)_localctx).INT.getText():null)),((AppendInsertRemoveContext)_localctx).value.in);
											else if(((AppendInsertRemoveContext)_localctx).value.listt!=null) gett.add(Integer.parseInt((((AppendInsertRemoveContext)_localctx).INT!=null?((AppendInsertRemoveContext)_localctx).INT.getText():null)),((AppendInsertRemoveContext)_localctx).value.listt);
										}
										
										
									}
									System.out.println(java.util.Arrays.toString(gett.toArray()));
								 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignContext extends ParserRuleContext {
		public Token ID;
		public Token INT;
		public ValueContext value;
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public TerminalNode INT() { return getToken(pythonParser.INT, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			((AssignContext)_localctx).ID = match(ID);
			setState(127);
			match(T__1);
			setState(128);
			((AssignContext)_localctx).INT = match(INT);
			setState(129);
			match(T__5);
			setState(130);
			match(T__0);
			setState(131);
			((AssignContext)_localctx).value = value();

			                                    System.out.println("Assign");
												java.util.ArrayList<Object> gett = idToList.get((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null));
												if(gett != null) {
													if(((AssignContext)_localctx).value.str !=null) gett.set(Integer.parseInt((((AssignContext)_localctx).INT!=null?((AssignContext)_localctx).INT.getText():null)),((AssignContext)_localctx).value.str);
													else if(((AssignContext)_localctx).value.in !=null) gett.set(Integer.parseInt((((AssignContext)_localctx).INT!=null?((AssignContext)_localctx).INT.getText():null)),((AssignContext)_localctx).value.in);
													else if(((AssignContext)_localctx).value.listt!=null) gett.set(Integer.parseInt((((AssignContext)_localctx).INT!=null?((AssignContext)_localctx).INT.getText():null)),((AssignContext)_localctx).value.listt);
												}
												System.out.println(java.util.Arrays.toString(gett.toArray()));
											   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclareContext extends ParserRuleContext {
		public Token ID;
		public ListContext list;
		public TerminalNode ID() { return getToken(pythonParser.ID, 0); }
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public DeclareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterDeclare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitDeclare(this);
		}
	}

	public final DeclareContext declare() throws RecognitionException {
		DeclareContext _localctx = new DeclareContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			((DeclareContext)_localctx).ID = match(ID);
			setState(135);
			match(T__0);
			setState(136);
			((DeclareContext)_localctx).list = list();

						System.out.println("Finished declaring a list");
						java.util.ArrayList<Object> ids = new java.util.ArrayList<>();
						for(int i=0; i< ((DeclareContext)_localctx).list.newList.size();i++){
						    ids.add(i,((DeclareContext)_localctx).list.newList.get(i));
						}
						idToList.put((((DeclareContext)_localctx).ID!=null?((DeclareContext)_localctx).ID.getText():null), ids);
						System.out.println(java.util.Arrays.toString(ids.toArray()));
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public java.util.ArrayList<Object> newList;
		public ValueContext value;
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_list);

						java.util.ArrayList<Object> Alist = new java.util.ArrayList<>();
						System.out.println("List created");
				
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(T__1);
			setState(153);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << STRING) | (1L << INT))) != 0)) {
				{
				{
				setState(140);
				((ListContext)_localctx).value = value();

									  if(((ListContext)_localctx).value.str !=null) Alist.add(((ListContext)_localctx).value.str);
				                      else if(((ListContext)_localctx).value.in !=null)	Alist.add(((ListContext)_localctx).value.in);
				                      else if(((ListContext)_localctx).value.listt!=null) Alist.add(((ListContext)_localctx).value.listt);					  
									
				setState(148);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__23) {
					{
					{
					setState(142);
					match(T__23);
					setState(143);
					((ListContext)_localctx).value = value();

													 if(((ListContext)_localctx).value.str !=null) Alist.add(((ListContext)_localctx).value.str);
													 else if(((ListContext)_localctx).value.in!=null)	Alist.add(((ListContext)_localctx).value.in);
													 else if(((ListContext)_localctx).value.listt!=null) Alist.add(((ListContext)_localctx).value.listt);
													
					}
					}
					setState(150);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(156);
			match(T__5);

											            ((ListContext)_localctx).newList =  Alist;
												     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public String str;
		public Integer in;
		public java.util.ArrayList<Object> listt;
		public ListContext list;
		public Token STRING;
		public Token INT;
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public TerminalNode STRING() { return getToken(pythonParser.STRING, 0); }
		public TerminalNode INT() { return getToken(pythonParser.INT, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pythonListener ) ((pythonListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				((ValueContext)_localctx).list = list();

								 ((ValueContext)_localctx).listt =  ((ValueContext)_localctx).list.newList;	
						       
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((ValueContext)_localctx).STRING = match(STRING);
				((ValueContext)_localctx).str =  (((ValueContext)_localctx).STRING!=null?((ValueContext)_localctx).STRING.getText():null); 
						         
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				((ValueContext)_localctx).INT = match(INT);
				String s = (((ValueContext)_localctx).INT!=null?((ValueContext)_localctx).INT.getText():null).trim();
							   ((ValueContext)_localctx).in =  new Integer(Integer.parseInt(s));
						       
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00ab\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\5\3&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5>\n\5\3\6\3\6\3\6\3\6\3\6\5\6E\n\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6N\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7Z\n\7\3\7\3\7\3\7\5\7_\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\5\bk\n\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bs\n\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0095\n\f\f\f\16\f\u0098"+
		"\13\f\7\f\u009a\n\f\f\f\16\f\u009d\13\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\5\r\u00a9\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\6"+
		"\3\2\t\13\3\2\n\13\3\2\16\23\3\2\27\31\2\u00b0\2\33\3\2\2\2\4%\3\2\2\2"+
		"\6\'\3\2\2\2\b=\3\2\2\2\nD\3\2\2\2\fQ\3\2\2\2\16b\3\2\2\2\20t\3\2\2\2"+
		"\22\u0080\3\2\2\2\24\u0088\3\2\2\2\26\u008d\3\2\2\2\30\u00a8\3\2\2\2\32"+
		"\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36"+
		"\3\3\2\2\2\37&\5\22\n\2 &\5\24\13\2!&\5\20\t\2\"&\5\16\b\2#&\5\f\7\2$"+
		"&\5\6\4\2%\37\3\2\2\2% \3\2\2\2%!\3\2\2\2%\"\3\2\2\2%#\3\2\2\2%$\3\2\2"+
		"\2&\5\3\2\2\2\'(\7\33\2\2()\b\4\1\2)*\7\3\2\2*+\7\4\2\2+,\5\b\5\2,-\7"+
		"\5\2\2-.\7\33\2\2./\b\4\1\2/\60\7\6\2\2\60\61\7\33\2\2\61\62\7\7\2\2\62"+
		"\63\5\n\6\2\63\64\7\b\2\2\64\65\b\4\1\2\65\7\3\2\2\2\66\67\7\33\2\2\67"+
		">\b\5\1\289\t\2\2\29:\7\f\2\2:;\7\33\2\2;<\7\r\2\2<>\b\5\1\2=\66\3\2\2"+
		"\2=8\3\2\2\2>\t\3\2\2\2?E\7\35\2\2@A\t\3\2\2AB\7\f\2\2BC\7\33\2\2CE\7"+
		"\r\2\2D?\3\2\2\2D@\3\2\2\2EF\3\2\2\2FG\b\6\1\2GM\t\4\2\2HN\7\35\2\2IJ"+
		"\t\3\2\2JK\7\f\2\2KL\7\33\2\2LN\7\r\2\2MH\3\2\2\2MI\3\2\2\2NO\3\2\2\2"+
		"OP\b\6\1\2P\13\3\2\2\2QR\7\33\2\2RS\b\7\1\2ST\7\3\2\2TU\7\33\2\2UV\b\7"+
		"\1\2VY\7\4\2\2WX\7\35\2\2XZ\b\7\1\2YW\3\2\2\2YZ\3\2\2\2Z[\3\2\2\2[^\7"+
		"\24\2\2\\]\7\35\2\2]_\b\7\1\2^\\\3\2\2\2^_\3\2\2\2_`\3\2\2\2`a\7\b\2\2"+
		"a\r\3\2\2\2bc\7\33\2\2cd\b\b\1\2dj\7\3\2\2ef\7\33\2\2fk\b\b\1\2gh\5\26"+
		"\f\2hi\b\b\1\2ik\3\2\2\2je\3\2\2\2jg\3\2\2\2kl\3\2\2\2lr\7\25\2\2mn\7"+
		"\33\2\2ns\b\b\1\2op\5\26\f\2pq\b\b\1\2qs\3\2\2\2rm\3\2\2\2ro\3\2\2\2s"+
		"\17\3\2\2\2tu\7\33\2\2uv\7\26\2\2vw\t\5\2\2wz\7\f\2\2xy\7\35\2\2y{\7\32"+
		"\2\2zx\3\2\2\2z{\3\2\2\2{|\3\2\2\2|}\5\30\r\2}~\7\r\2\2~\177\b\t\1\2\177"+
		"\21\3\2\2\2\u0080\u0081\7\33\2\2\u0081\u0082\7\4\2\2\u0082\u0083\7\35"+
		"\2\2\u0083\u0084\7\b\2\2\u0084\u0085\7\3\2\2\u0085\u0086\5\30\r\2\u0086"+
		"\u0087\b\n\1\2\u0087\23\3\2\2\2\u0088\u0089\7\33\2\2\u0089\u008a\7\3\2"+
		"\2\u008a\u008b\5\26\f\2\u008b\u008c\b\13\1\2\u008c\25\3\2\2\2\u008d\u009b"+
		"\7\4\2\2\u008e\u008f\5\30\r\2\u008f\u0096\b\f\1\2\u0090\u0091\7\32\2\2"+
		"\u0091\u0092\5\30\r\2\u0092\u0093\b\f\1\2\u0093\u0095\3\2\2\2\u0094\u0090"+
		"\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009a\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u008e\3\2\2\2\u009a\u009d\3\2"+
		"\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\b\f\1\2\u00a0\27\3\2\2"+
		"\2\u00a1\u00a2\5\26\f\2\u00a2\u00a3\b\r\1\2\u00a3\u00a9\3\2\2\2\u00a4"+
		"\u00a5\7\34\2\2\u00a5\u00a9\b\r\1\2\u00a6\u00a7\7\35\2\2\u00a7\u00a9\b"+
		"\r\1\2\u00a8\u00a1\3\2\2\2\u00a8\u00a4\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9"+
		"\31\3\2\2\2\17\35%=DMY^jrz\u0096\u009b\u00a8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}