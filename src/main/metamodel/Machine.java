package main.metamodel;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;

public class Machine {
	
	private List<State> states;
	private State initialState;
	private List<String> integers;
	
	public Machine() {
		states = new ArrayList<State>();
		integers = new ArrayList<String>();
	}
	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		return initialState;
	}

	public State getState(String string) {
		for(State s : states) {
			if(s.getName() == string) {
				return s; 
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		return integers.size();
	}

	public boolean hasInteger(String string) {
		for(String s : integers) {
			if(s == string) {
				return true;
			}
		}
		return false;
	}
	
	public void addState(String string) {
		states.add(new State(string));
	}
	
	public void setInitialState(State s) {
		initialState = s;
	}
	
	public void addInteger(String s) {
		integers.add(s);
	}
	
	

}
