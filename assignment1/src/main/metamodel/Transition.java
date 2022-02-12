package main.metamodel;


public class Transition {

	private String event;
	private String target;

	private Operation operation;
	private String operationVariableName;
	private int operationValue;

	private Condition condition;
	private String conditionVariableName;
	private int conditionValue;

	public Transition(String event) {
		this.event = event;
	}

	public String getEvent() {
		return event;
	}

	public String getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		return this.operation == Operation.SET;
	}

	public boolean hasIncrementOperation() {
		return this.operation == Operation.INCREMENT;

	}

	public boolean hasDecrementOperation() {
		return this.operation == Operation.DECREMENT;

	}

	public String getOperationVariableName() {
		return operationVariableName;
	}

	public boolean isConditional() {
		return this.condition != null;
	}

	public String getConditionVariableName() {
		return conditionVariableName;
	}

	public Integer getConditionComparedValue() {
		return conditionValue;
	}

	public boolean isConditionEqual() {
		return condition == Condition.EQUALS;
	}

	public boolean isConditionGreaterThan() {
		return condition == Condition.GREATERTHAN;
	}

	public boolean isConditionLessThan() {
		return condition == Condition.LESSTHAN;
	}

	public boolean hasOperation() {
		return this.operation != null;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public Operation getOperation() {
		return operation;
	}

	public void setOperation(Operation operation) {
		this.operation = operation;
	}

	public void setOperationVariableName(String operationVariableName) {
		this.operationVariableName = operationVariableName;
	}

	public int getOperationValue() {
		return operationValue;
	}

	public void setOperationValue(int operationValue) {
		this.operationValue = operationValue;
	}

	public Condition getCondition() {
		return condition;
	}

	public void setCondition(Condition condition) {
		this.condition = condition;
	}

	public void setConditionVariableName(String conditionVariableName) {
		this.conditionVariableName = conditionVariableName;
	}

	public int getConditionValue() {
		return conditionValue;
	}

	public void setConditionValue(int conditionValue) {
		this.conditionValue = conditionValue;
	}



}
