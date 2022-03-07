package main.metamodel;

public class Transition {
	
	private String event;
	private State target;
	private String operationalName;
	private int operationalNumber;
	private boolean hasSet = false;
	private boolean hasIncrement = false;
	private boolean hasDecrement = false;
	private boolean hasEquals = false;
	private boolean hasGreater = false;
	private boolean hasLess = false;
	
	public Transition(String s) {
		event = s;
	}
	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}

	public boolean hasSetOperation() {
		return hasSet;
	}

	public boolean hasIncrementOperation() {
		return hasIncrement;
	}

	public boolean hasDecrementOperation() {
		return hasDecrement;
	}

	public Object getOperationVariableName() {
		return operationalName;
	}

	public boolean isConditional() {
		return hasEquals || hasGreater || hasLess;
	}

	public Object getConditionVariableName() {
		return operationalName;
	}

	public Integer getConditionComparedValue() {
		return operationalNumber;
	}

	public boolean isConditionEqual() {
		return hasEquals;
	}

	public boolean isConditionGreaterThan() {
		return hasGreater;
	}

	public boolean isConditionLessThan() {
		return hasLess;
	}

	public boolean hasOperation() {
		return hasSet || hasIncrement || hasDecrement || isConditional();
	}
	
	public void addTarget(State s) {
		target = s;
	}
	
	public void addToSet(String s, int i) {
		operationalName = s;
		operationalNumber = i;
		hasSet = true;
	}
	
	public void incrament(String s) {
		operationalName = s;
		hasIncrement = true;
	}
	
	public void decrament(String s) {
		operationalName = s;
		hasDecrement = true;
	}
	
	public void ifEquals(String s, int i) {
		operationalName = s;
		operationalNumber = i;
		hasEquals = true;
	}
	
	public void ifGreater(String s, int i) {
		operationalName = s;
		operationalNumber = i;
		hasGreater = true;
	}
	
	public void ifLess(String s, int i) {
		operationalName = s;
		operationalNumber = i;
		hasLess = true;
	}


}
