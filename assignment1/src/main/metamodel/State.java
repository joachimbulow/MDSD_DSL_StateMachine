package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class State {

	private String name;

	private List<Transition> transitions = new ArrayList<>();

	public State(String name){
		this.name = name;
	}

	public void addTransition(Transition transition){
		this.transitions.add(transition);
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return this.transitions;
	}

	//Can there be multiple transitions by same event?
	public Transition getTransitionByEvent(String string) {
		return transitions.stream().filter(transition -> transition.getEvent() == string).findFirst().orElse(null);
	}

}
