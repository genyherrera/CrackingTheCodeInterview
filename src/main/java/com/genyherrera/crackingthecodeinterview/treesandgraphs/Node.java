package com.genyherrera.crackingthecodeinterview.treesandgraphs;

import java.util.List;

public class Node {
	
	enum State { Unvisited, Visited, Visiting; }

	private String value;
	private List<Node> children;
	private State state;
	
	public Node(String value) {
		this.value = value;
		this.state = State.Unvisited;
	}
	
	public Node(String value, List<Node> children) {
		this.value = value;
		this.children = children;
		this.state = State.Unvisited;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<Node> getChildren() {
		return children;
	}
	public void setChildren(List<Node> children) {
		this.children = children;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
