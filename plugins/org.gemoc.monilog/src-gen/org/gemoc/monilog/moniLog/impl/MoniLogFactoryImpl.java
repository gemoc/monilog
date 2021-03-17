/**
 * generated by Xtext 2.21.0
 */
package org.gemoc.monilog.moniLog.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.gemoc.monilog.moniLog.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MoniLogFactoryImpl extends EFactoryImpl implements MoniLogFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MoniLogFactory init()
  {
    try
    {
      MoniLogFactory theMoniLogFactory = (MoniLogFactory)EPackage.Registry.INSTANCE.getEFactory(MoniLogPackage.eNS_URI);
      if (theMoniLogFactory != null)
      {
        return theMoniLogFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MoniLogFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoniLogFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MoniLogPackage.DOCUMENT: return createDocument();
      case MoniLogPackage.IMPORT: return createImport();
      case MoniLogPackage.FILE_ALIAS: return createFileAlias();
      case MoniLogPackage.APPENDER: return createAppender();
      case MoniLogPackage.LOCAL_APPENDER: return createLocalAppender();
      case MoniLogPackage.EXTERNAL_APPENDER: return createExternalAppender();
      case MoniLogPackage.LAYOUT: return createLayout();
      case MoniLogPackage.LOCAL_LAYOUT: return createLocalLayout();
      case MoniLogPackage.EXTERNAL_LAYOUT: return createExternalLayout();
      case MoniLogPackage.PARAMETER_DECL: return createParameterDecl();
      case MoniLogPackage.MONI_LOGGER: return createMoniLogger();
      case MoniLogPackage.PARAMETER: return createParameter();
      case MoniLogPackage.EVENT: return createEvent();
      case MoniLogPackage.AST_EVENT_KIND: return createASTEventKind();
      case MoniLogPackage.CONDITION: return createCondition();
      case MoniLogPackage.TEMPORAL_PATTERN: return createTemporalPattern();
      case MoniLogPackage.PATTERN: return createPattern();
      case MoniLogPackage.BOUND_TYPE: return createBoundType();
      case MoniLogPackage.EXACT_BOUND: return createExactBound();
      case MoniLogPackage.LOWER_BOUND: return createLowerBound();
      case MoniLogPackage.UPPER_BOUND: return createUpperBound();
      case MoniLogPackage.SCOPE: return createScope();
      case MoniLogPackage.ACTION: return createAction();
      case MoniLogPackage.APPENDER_CALL: return createAppenderCall();
      case MoniLogPackage.LAYOUT_CALL: return createLayoutCall();
      case MoniLogPackage.EMIT_EVENT: return createEmitEvent();
      case MoniLogPackage.MONILOGGER_CALL: return createMoniloggerCall();
      case MoniLogPackage.STREAM_EVENT: return createStreamEvent();
      case MoniLogPackage.EMPTY_OR_PROPERTY_VALUE: return createEmptyOrPropertyValue();
      case MoniLogPackage.PROPERTY_VALUE: return createPropertyValue();
      case MoniLogPackage.EXPRESSION: return createExpression();
      case MoniLogPackage.PARAMETER_REFERENCE: return createParameterReference();
      case MoniLogPackage.MONI_LOG_EXPRESSION: return createMoniLogExpression();
      case MoniLogPackage.LANGUAGE_VALUE: return createLanguageValue();
      case MoniLogPackage.LANGUAGE_EXPRESSION: return createLanguageExpression();
      case MoniLogPackage.LANGUAGE_CALL: return createLanguageCall();
      case MoniLogPackage.SIMPLE_EXPRESSION: return createSimpleExpression();
      case MoniLogPackage.REF: return createRef();
      case MoniLogPackage.SIMPLE_VAR_REF: return createSimpleVarRef();
      case MoniLogPackage.ARRAY_SIZE: return createArraySize();
      case MoniLogPackage.AST_EVENT: return createASTEvent();
      case MoniLogPackage.COMPLEX_EVENT: return createComplexEvent();
      case MoniLogPackage.USER_EVENT: return createUserEvent();
      case MoniLogPackage.BEFORE_AST_EVENT: return createBeforeASTEvent();
      case MoniLogPackage.AFTER_AST_EVENT: return createAfterASTEvent();
      case MoniLogPackage.EXISTENCE: return createExistence();
      case MoniLogPackage.UNIVERSALITY: return createUniversality();
      case MoniLogPackage.ABSENCE: return createAbsence();
      case MoniLogPackage.PRECEDENCE: return createPrecedence();
      case MoniLogPackage.RESPONSE: return createResponse();
      case MoniLogPackage.GLOBALLY: return createGlobally();
      case MoniLogPackage.AFTER: return createAfter();
      case MoniLogPackage.BEFORE: return createBefore();
      case MoniLogPackage.BETWEEN: return createBetween();
      case MoniLogPackage.AFTER_UNTIL: return createAfterUntil();
      case MoniLogPackage.START_MONI_LOGGER: return createStartMoniLogger();
      case MoniLogPackage.STOP_MONI_LOGGER: return createStopMoniLogger();
      case MoniLogPackage.EMPTY: return createEmpty();
      case MoniLogPackage.CONTRACTED_IF: return createContractedIf();
      case MoniLogPackage.OR: return createOr();
      case MoniLogPackage.AND: return createAnd();
      case MoniLogPackage.EQUALITY: return createEquality();
      case MoniLogPackage.COMPARISON: return createComparison();
      case MoniLogPackage.PLUS: return createPlus();
      case MoniLogPackage.MINUS: return createMinus();
      case MoniLogPackage.MUL: return createMul();
      case MoniLogPackage.DIV: return createDiv();
      case MoniLogPackage.MODULO: return createModulo();
      case MoniLogPackage.PARENTHESIS: return createParenthesis();
      case MoniLogPackage.UNARY_MINUS: return createUnaryMinus();
      case MoniLogPackage.NOT: return createNot();
      case MoniLogPackage.INT_CONSTANT: return createIntConstant();
      case MoniLogPackage.REAL_CONSTANT: return createRealConstant();
      case MoniLogPackage.BOOL_CONSTANT: return createBoolConstant();
      case MoniLogPackage.STRING_CONSTANT: return createStringConstant();
      case MoniLogPackage.VECTOR_CONSTANT: return createVectorConstant();
      case MoniLogPackage.ARRAY_REF: return createArrayRef();
      case MoniLogPackage.PROPERTY_REF: return createPropertyRef();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MoniLogPackage.MONI_LOGGER_ANNOTATION:
        return createMoniLoggerAnnotationFromString(eDataType, initialValue);
      case MoniLogPackage.APPENDER_ANNOTATION:
        return createAppenderAnnotationFromString(eDataType, initialValue);
      case MoniLogPackage.LOG_LEVEL:
        return createLogLevelFromString(eDataType, initialValue);
      case MoniLogPackage.TEMPORAL_PATTERN_KIND:
        return createTemporalPatternKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case MoniLogPackage.MONI_LOGGER_ANNOTATION:
        return convertMoniLoggerAnnotationToString(eDataType, instanceValue);
      case MoniLogPackage.APPENDER_ANNOTATION:
        return convertAppenderAnnotationToString(eDataType, instanceValue);
      case MoniLogPackage.LOG_LEVEL:
        return convertLogLevelToString(eDataType, instanceValue);
      case MoniLogPackage.TEMPORAL_PATTERN_KIND:
        return convertTemporalPatternKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FileAlias createFileAlias()
  {
    FileAliasImpl fileAlias = new FileAliasImpl();
    return fileAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Appender createAppender()
  {
    AppenderImpl appender = new AppenderImpl();
    return appender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalAppender createLocalAppender()
  {
    LocalAppenderImpl localAppender = new LocalAppenderImpl();
    return localAppender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalAppender createExternalAppender()
  {
    ExternalAppenderImpl externalAppender = new ExternalAppenderImpl();
    return externalAppender;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Layout createLayout()
  {
    LayoutImpl layout = new LayoutImpl();
    return layout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LocalLayout createLocalLayout()
  {
    LocalLayoutImpl localLayout = new LocalLayoutImpl();
    return localLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExternalLayout createExternalLayout()
  {
    ExternalLayoutImpl externalLayout = new ExternalLayoutImpl();
    return externalLayout;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterDecl createParameterDecl()
  {
    ParameterDeclImpl parameterDecl = new ParameterDeclImpl();
    return parameterDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoniLogger createMoniLogger()
  {
    MoniLoggerImpl moniLogger = new MoniLoggerImpl();
    return moniLogger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parameter createParameter()
  {
    ParameterImpl parameter = new ParameterImpl();
    return parameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ASTEventKind createASTEventKind()
  {
    ASTEventKindImpl astEventKind = new ASTEventKindImpl();
    return astEventKind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TemporalPattern createTemporalPattern()
  {
    TemporalPatternImpl temporalPattern = new TemporalPatternImpl();
    return temporalPattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoundType createBoundType()
  {
    BoundTypeImpl boundType = new BoundTypeImpl();
    return boundType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExactBound createExactBound()
  {
    ExactBoundImpl exactBound = new ExactBoundImpl();
    return exactBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LowerBound createLowerBound()
  {
    LowerBoundImpl lowerBound = new LowerBoundImpl();
    return lowerBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UpperBound createUpperBound()
  {
    UpperBoundImpl upperBound = new UpperBoundImpl();
    return upperBound;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Scope createScope()
  {
    ScopeImpl scope = new ScopeImpl();
    return scope;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AppenderCall createAppenderCall()
  {
    AppenderCallImpl appenderCall = new AppenderCallImpl();
    return appenderCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LayoutCall createLayoutCall()
  {
    LayoutCallImpl layoutCall = new LayoutCallImpl();
    return layoutCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmitEvent createEmitEvent()
  {
    EmitEventImpl emitEvent = new EmitEventImpl();
    return emitEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoniloggerCall createMoniloggerCall()
  {
    MoniloggerCallImpl moniloggerCall = new MoniloggerCallImpl();
    return moniloggerCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StreamEvent createStreamEvent()
  {
    StreamEventImpl streamEvent = new StreamEventImpl();
    return streamEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EmptyOrPropertyValue createEmptyOrPropertyValue()
  {
    EmptyOrPropertyValueImpl emptyOrPropertyValue = new EmptyOrPropertyValueImpl();
    return emptyOrPropertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyValue createPropertyValue()
  {
    PropertyValueImpl propertyValue = new PropertyValueImpl();
    return propertyValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParameterReference createParameterReference()
  {
    ParameterReferenceImpl parameterReference = new ParameterReferenceImpl();
    return parameterReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoniLogExpression createMoniLogExpression()
  {
    MoniLogExpressionImpl moniLogExpression = new MoniLogExpressionImpl();
    return moniLogExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LanguageValue createLanguageValue()
  {
    LanguageValueImpl languageValue = new LanguageValueImpl();
    return languageValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LanguageExpression createLanguageExpression()
  {
    LanguageExpressionImpl languageExpression = new LanguageExpressionImpl();
    return languageExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LanguageCall createLanguageCall()
  {
    LanguageCallImpl languageCall = new LanguageCallImpl();
    return languageCall;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleExpression createSimpleExpression()
  {
    SimpleExpressionImpl simpleExpression = new SimpleExpressionImpl();
    return simpleExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Ref createRef()
  {
    RefImpl ref = new RefImpl();
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SimpleVarRef createSimpleVarRef()
  {
    SimpleVarRefImpl simpleVarRef = new SimpleVarRefImpl();
    return simpleVarRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArraySize createArraySize()
  {
    ArraySizeImpl arraySize = new ArraySizeImpl();
    return arraySize;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ASTEvent createASTEvent()
  {
    ASTEventImpl astEvent = new ASTEventImpl();
    return astEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ComplexEvent createComplexEvent()
  {
    ComplexEventImpl complexEvent = new ComplexEventImpl();
    return complexEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UserEvent createUserEvent()
  {
    UserEventImpl userEvent = new UserEventImpl();
    return userEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BeforeASTEvent createBeforeASTEvent()
  {
    BeforeASTEventImpl beforeASTEvent = new BeforeASTEventImpl();
    return beforeASTEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AfterASTEvent createAfterASTEvent()
  {
    AfterASTEventImpl afterASTEvent = new AfterASTEventImpl();
    return afterASTEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Existence createExistence()
  {
    ExistenceImpl existence = new ExistenceImpl();
    return existence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Universality createUniversality()
  {
    UniversalityImpl universality = new UniversalityImpl();
    return universality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Absence createAbsence()
  {
    AbsenceImpl absence = new AbsenceImpl();
    return absence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Precedence createPrecedence()
  {
    PrecedenceImpl precedence = new PrecedenceImpl();
    return precedence;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Response createResponse()
  {
    ResponseImpl response = new ResponseImpl();
    return response;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Globally createGlobally()
  {
    GloballyImpl globally = new GloballyImpl();
    return globally;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public After createAfter()
  {
    AfterImpl after = new AfterImpl();
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Before createBefore()
  {
    BeforeImpl before = new BeforeImpl();
    return before;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Between createBetween()
  {
    BetweenImpl between = new BetweenImpl();
    return between;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AfterUntil createAfterUntil()
  {
    AfterUntilImpl afterUntil = new AfterUntilImpl();
    return afterUntil;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StartMoniLogger createStartMoniLogger()
  {
    StartMoniLoggerImpl startMoniLogger = new StartMoniLoggerImpl();
    return startMoniLogger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StopMoniLogger createStopMoniLogger()
  {
    StopMoniLoggerImpl stopMoniLogger = new StopMoniLoggerImpl();
    return stopMoniLogger;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Empty createEmpty()
  {
    EmptyImpl empty = new EmptyImpl();
    return empty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ContractedIf createContractedIf()
  {
    ContractedIfImpl contractedIf = new ContractedIfImpl();
    return contractedIf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Mul createMul()
  {
    MulImpl mul = new MulImpl();
    return mul;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Modulo createModulo()
  {
    ModuloImpl modulo = new ModuloImpl();
    return modulo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Parenthesis createParenthesis()
  {
    ParenthesisImpl parenthesis = new ParenthesisImpl();
    return parenthesis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UnaryMinus createUnaryMinus()
  {
    UnaryMinusImpl unaryMinus = new UnaryMinusImpl();
    return unaryMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RealConstant createRealConstant()
  {
    RealConstantImpl realConstant = new RealConstantImpl();
    return realConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringConstant createStringConstant()
  {
    StringConstantImpl stringConstant = new StringConstantImpl();
    return stringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public VectorConstant createVectorConstant()
  {
    VectorConstantImpl vectorConstant = new VectorConstantImpl();
    return vectorConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArrayRef createArrayRef()
  {
    ArrayRefImpl arrayRef = new ArrayRefImpl();
    return arrayRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyRef createPropertyRef()
  {
    PropertyRefImpl propertyRef = new PropertyRefImpl();
    return propertyRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MoniLoggerAnnotation createMoniLoggerAnnotationFromString(EDataType eDataType, String initialValue)
  {
    MoniLoggerAnnotation result = MoniLoggerAnnotation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertMoniLoggerAnnotationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AppenderAnnotation createAppenderAnnotationFromString(EDataType eDataType, String initialValue)
  {
    AppenderAnnotation result = AppenderAnnotation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertAppenderAnnotationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LogLevel createLogLevelFromString(EDataType eDataType, String initialValue)
  {
    LogLevel result = LogLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertLogLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemporalPatternKind createTemporalPatternKindFromString(EDataType eDataType, String initialValue)
  {
    TemporalPatternKind result = TemporalPatternKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTemporalPatternKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MoniLogPackage getMoniLogPackage()
  {
    return (MoniLogPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MoniLogPackage getPackage()
  {
    return MoniLogPackage.eINSTANCE;
  }

} //MoniLogFactoryImpl
