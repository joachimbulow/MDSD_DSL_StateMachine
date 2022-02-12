package main;

import main.metamodel.*;
import main.metamodel.Condition;

public class StateMachine {

	private Machine metaModel;

	private State currentState;

	private Transition currentTransition;

	public StateMachine() {
		metaModel = new Machine();
	}

	public Machine build() {
		return metaModel;
	}

	public StateMachine state(String string) {
		State state = new State(string);
		metaModel.addState(state);
		this.currentState = state;
		return this;
	}

	public StateMachine initial() {
		this.metaModel.setInitialState(this.currentState);
		return this;
	}

	public StateMachine when(String string) {
		Transition transition = new Transition(string);
		this.currentTransition = transition;
		this.currentState.addTransition(transition);
		return this;
	}

	public StateMachine to(String string) {
		this.currentTransition.setTarget(string);
		return this;
	}

	public StateMachine integer(String string) {
		this.metaModel.variables.put(string, 0);
		return this;
	}

	public StateMachine set(String string, int i) {
		this.currentTransition.setOperation(Operation.SET);
		this.currentTransition.setOperationVariableName(string);
		this.currentTransition.setOperationValue(i);
		return this;
	}

	public StateMachine increment(String string) {
		this.currentTransition.setOperation(Operation.INCREMENT);
		this.currentTransition.setOperationVariableName(string);
		return this;
	}

	public StateMachine decrement(String string) {
		this.currentTransition.setOperation(Operation.DECREMENT);
		this.currentTransition.setOperationVariableName(string);
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		this.currentTransition.setCondition(Condition.EQUALS);
		this.currentTransition.setConditionVariableName(string);
		this.currentTransition.setConditionValue(i);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		this.currentTransition.setCondition(Condition.GREATERTHAN);
		this.currentTransition.setConditionVariableName(string);
		this.currentTransition.setConditionValue(i);
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		this.currentTransition.setCondition(Condition.LESSTHAN);
		this.currentTransition.setConditionVariableName(string);
		this.currentTransition.setConditionValue(i);
		return this;
	}

}
