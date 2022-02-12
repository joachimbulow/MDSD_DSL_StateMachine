package main;

import main.metamodel.Condition;
import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MachineInterpreter {

	Machine runtimeMachine;

	public void run(Machine m) {
		m.setCurrentState(m.getInitialState());
		runtimeMachine = m;
	}

	public State getCurrentState() {
		return runtimeMachine.getCurrentState();
	}

	public void processEvent(String string) {
		List<Transition> ts = runtimeMachine.getCurrentState()
				.getTransitions().stream().filter(tr -> tr.getEvent() == string)
				.collect(Collectors.toList());

		//Handle if there are multiple transitions, suppose transitions are in order
		Transition validTransition = null;
		boolean haveFoundValid = false;
		for (Transition transition: ts) {
			if (haveFoundValid){
				break;
			}
			if (!transition.isConditional()){
				validTransition = transition;
				break;
			}
			else {
				switch (transition.getCondition()){
					case EQUALS:
						if(runtimeMachine.variables.
								get(transition.getConditionVariableName())
								.equals(transition.getConditionValue())){
							validTransition = transition;
							haveFoundValid = true;
						}
						break;
					case GREATERTHAN:
						if(runtimeMachine.variables.
								get(transition.getConditionVariableName())
								> transition.getConditionValue()){
							validTransition = transition;
							haveFoundValid = true;
						}
						break;
					case LESSTHAN:
						if(runtimeMachine.variables.
								get(transition.getConditionVariableName())
								< transition.getConditionValue()){
							validTransition = transition;
							haveFoundValid = true;
						}
						break;
				}
			}

		}

		if (validTransition == null){
			// Handle no valid transition found?
			return;
		}

		//Handle arithmetic
		if (validTransition.hasOperation()){
			Map<String, Integer> variables = runtimeMachine.variables;
			switch (validTransition.getOperation()){
				case SET:
					variables.put(validTransition.getOperationVariableName(), validTransition.getOperationValue());
					break;
				case INCREMENT:
					variables.put(validTransition.getOperationVariableName(), variables.get(validTransition.getOperationVariableName()) + 1);
					break;
				case DECREMENT:
					variables.put(validTransition.getOperationVariableName(), variables.get(validTransition.getOperationVariableName()) - 1);
					break;
			}
		}

		runtimeMachine.setCurrentState(runtimeMachine.getState(validTransition.getTarget()));
		
	}

	public int getInteger(String string) {
		return runtimeMachine.variables.get(string);
	}

}
