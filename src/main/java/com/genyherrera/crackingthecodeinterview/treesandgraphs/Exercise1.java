package com.genyherrera.crackingthecodeinterview.treesandgraphs;

import java.util.Arrays;
import java.util.LinkedList;

import com.genyherrera.crackingthecodeinterview.treesandgraphs.Node.State;
import com.sun.corba.se.impl.orbutil.graph.GraphImpl;

/**
 * @problem: Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a
 * 			 route between two nodes.
 * @author geny.herrera
 *
 */
public class Exercise1 {

	static boolean searchBFS(Graph g, Node start, Node end) {
		if (start == end) return true;

		// operates as Queue
		LinkedList<Node> q = new LinkedList<Node>();

		start.setState(State.Visiting);
		q.add(start);
		Node u;
		while (!q.isEmpty()) {
			u = q.removeFirst(); //i.e., dequeue()
			if (u != null) {
				for (Node v : u.getChildren()) {
					if (v.getState() == State.Unvisited) {
						if (v == end) {
							return true;
						} else {
							v.setState(State.Visiting);
							System.out.println("VISITING: " + v.getValue());
							q.add(v);
						}
					}
				}
				u.setState(State.Visited);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Node node8 = new Node("8");
		
		Node node7 = new Node("7");
		Node node6 = new Node("6");
		
		Node node5 = new Node("5");
		Node node4 = new Node("4");
		
		Node node3 = new Node("3", Arrays.asList(node6, node7));
		Node node2 = new Node("2", Arrays.asList(node5, node4));
		
		Node node1 = new Node("1", Arrays.asList(node2,node3));
		
		Graph graph = new Graph(Arrays.asList(node1, node8));
		
		System.out.println(searchBFS(graph, node1, node6));
	}
}
