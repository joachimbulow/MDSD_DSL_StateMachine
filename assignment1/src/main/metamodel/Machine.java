package main.metamodel;

import java.util.*;

public class Machine {

	List<State> states = new ArrayList<>();

	State currentState = null;

	State initialState = null;

	public Map<String, Integer> variables = new HashMap<>();

	public List<State> getStates() {
		return Collections.unmodifiableList(states);
	}

	public void addState(State state){
		this.states.add(state);
	}

	public void setInitialState(State state){
		this.initialState = state;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String name) {
		return states.stream().filter((p) -> p.getName() == name).findFirst().orElse(null);
	}

	public int numberOfIntegers() {
		return variables.size();
	}

	public boolean hasInteger(String name) {
		return variables.get(name) != null;
	}

	public void setStates(List<State> states) {
		this.states = states;
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public Map<String, Integer> getVariables() {
		return variables;
	}

	public void setVariables(Map<String, Integer> variables) {
		this.variables = variables;
	}

}
