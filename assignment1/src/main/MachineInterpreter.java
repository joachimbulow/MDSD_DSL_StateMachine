package main;

import main.metamodel.*;

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
			if (haveFoundValid) {
				break;
			}
			if (!transition.isConditional()) {
				validTransition = transition;
				break;
			} else {
				int comparedValue = runtimeMachine.variables.
						get(transition.getConditionVariableName()).compareTo(transition.getConditionValue());
				if ((comparedValue < 0 && transition.getCondition() == Condition.LESSTHAN)
						|| (comparedValue == 0 && transition.getCondition() == Condition.EQUALS)
						|| (comparedValue > 0 && transition.getCondition() == Condition.GREATERTHAN)) {

					validTransition = transition;
					haveFoundValid = true;
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
			int value = validTransition.getOperation() == Operation.SET ? validTransition.getOperationValue() :
					variables.get(validTransition.getOperationVariableName()) + (validTransition.getOperation() == Operation.INCREMENT ? 1 : -1);
			variables.put(validTransition.getOperationVariableName(), value);
		}

		runtimeMachine.setCurrentState(runtimeMachine.getState(validTransition.getTarget()));
		
	}

	public int getInteger(String string) {
		return runtimeMachine.variables.get(string);
	}

}
