package com.genyherrera.crackingthecodeinterview.treesandgraphs;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import com.genyherrera.crackingthecodeinterview.treesandgraphs.Node.State;

/**
 * @problem: Route Between Nodes: G.+.
 * @author geny.herrera
 *
 */
public class Exercise1 {

	/*static boolean searchBFS(Graph g, Node start, Node end) {
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
	}*/

	public static boolean searchPathDFS(Graph g, Node start, Node end) {
		if (start == null || end == null || g == null) return false;

		if (coversDFS(g.getNodes().get(0), start) && coversDFS(g.getNodes().get(0), end)) {
			return true;
		}

		return false;

	}

	private static boolean coversDFS(Node head, Node start) {
		if (head == null || start == null) return false;

		if (head.getValue() == start.getValue()) {
			return true;
		}

		if (head.getChildren() != null) {
			for(Node adjacent : head.getChildren()) {
				if (adjacent.getState() != State.Visited && coversDFS(adjacent, start)) {
					start.setState(State.Visited);
					return true;
				}
			}
		}
		return false;
	}

	public static boolean searchPathBFS(Graph g, Node start, Node end) {
		if (start == null || end == null || g == null) return false;

		if (coversBFS(g.getNodes().get(0), start) && coversBFS(g.getNodes().get(0), end)) {
			return true;
		}

		return false;

	}

	private static boolean coversBFS(Node head, Node start) {
		if (head == null || start == null) return false;
		
		Queue<Node> myQueue = new LinkedList<Node>();
		myQueue.add(head);

		while(!myQueue.isEmpty()) {
			Node node = myQueue.poll();

			if (node != null && node.getValue() == start.getValue() && node.getState() != State.Visited) {
				return true;
			} else {
				node.setState(State.Visited);
				if (node.getChildren() != null && node.getChildren().size() > 0) {
					myQueue.addAll(node.getChildren());
				}
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

		System.out.println(searchPathBFS(graph, node2, node8));
	}
}
