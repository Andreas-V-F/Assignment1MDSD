package main;

import main.metamodel.Machine;
import main.metamodel.State;

public class StateMachine extends Machine{

	Machine m;
	State currentState;
	public StateMachine() {
		m = new Machine();
	}
	public Machine build() {
		// TODO Auto-generated method stub
		return this.m;
	}

	public StateMachine state(String string) {
		// TODO Auto-generated method stub
		this.m.addState(string);
		currentState = this.m.getState(string);	
		return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		this.m.setInitialState(this.m.getStates().get(this.m.getStates().size()-1));
		return this;
	}

	public StateMachine when(String string) {
		currentState.addTransitionByEvent(string);
		return this;
	}

	public StateMachine to(String string) {
		if(this.m.getState(string) == null) {
			this.m.addState(string);
		}
		currentState.getTransitions().get(currentState.getTransitions().size()-1).addTarget(this.m.getState(string));
		return this;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		this.m.addInteger(string);
		return this;
	}

	public StateMachine set(String string, int i) {
		currentState.getTransitions().get(currentState.getTransitions().size()-1).addToSet(string , i);
		return this;
	}

	public StateMachine increment(String string) {
		currentState.getTransitions().get(currentState.getTransitions().size()-1).incrament(string);
		return this;
	}

	public StateMachine decrement(String string) {
		currentState.getTransitions().get(currentState.getTransitions().size()-1).decrament(string);
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentState.getTransitions().get(currentState.getTransitions().size()-1).ifEquals(string, i);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		currentState.getTransitions().get(currentState.getTransitions().size()-1).ifGreater(string, i);
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		currentState.getTransitions().get(currentState.getTransitions().size()-1).ifLess(string, i);
		return this;
	}

}
