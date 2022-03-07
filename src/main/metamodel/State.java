package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private List<Transition> transitions = new ArrayList<Transition>();;
	
	private String name;
	public State(String s) {
		name = s;
	}
	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public Transition getTransitionByEvent(String string) {
		for(Transition t : transitions) {
			if(t.getEvent() == string) {
				return t;
			}
		}
		return null;
	}
	
	public void addTransitionByEvent(String string) {
		transitions.add(new Transition(string));
	}
	
	public void addTargetToTransition(Transition t, State s) {
		t.addTarget(s);
	}
}
