package com.genyherrera.crackingthecodeinterview.treesandgraphs;

import java.util.List;

public class Graph implements Cloneable { 

	private List<Node> nodes;
	
	public Graph(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}
	
	
}
