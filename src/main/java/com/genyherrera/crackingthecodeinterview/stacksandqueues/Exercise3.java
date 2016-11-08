package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @problem: Stack of Plates: Imagine a (literal) stack of plates. If the stack gets too high, it might topple.
 * 			 Therefore, in real life, we would likely start a new stack when the previous stack exceeds some
 * 			 threshold. Implement a data structure SetOfStacks that mimics this. SetOfStacks should be
 * 			 composed of several stacks and should create a new stack once the previous one exceeds capacity.
 * 			 SetOfStacks.push() and SetOfStacks.pop() should behave identically to a single stack
 * 			 (that is, pop() should return the same values as it would if there were just a single stack).
 * 
 * 			 FOLLOW UP
 * 				Implement a function popAt(int index) which performs a pop operation on a specific substack.
 * @author geny.herrera
 */
public class Exercise3 {

	class Planet {
		private String name;
		
		Planet(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
	
	class SetOfStacks {
		private List<Stack<Planet>> listOfStacks;
		private int capacity;
		
		public SetOfStacks(int capacity) {
			listOfStacks = new ArrayList<Stack<Planet>>();
			this.capacity = capacity;
		}
		
		public void push(Planet planet) {
			if (listOfStacks.size() == 0 || listOfStacks.get(listOfStacks.size() - 1).size() == capacity) {
				Stack<Planet> stack = new Stack<Planet>();
				stack.push(planet);
				listOfStacks.add(stack);
			} else {
				listOfStacks.get(listOfStacks.size() - 1).push(planet);
			}
		}
		
		public Planet pop() {
			Planet planetToReturn = listOfStacks.get(listOfStacks.size() - 1).pop();
			
			if (listOfStacks.get(listOfStacks.size() - 1).isEmpty()) {
				listOfStacks.remove(listOfStacks.size() - 1);
			}
			return planetToReturn;
		}
		
		// TODO: Requires to much code
		/*public popAt(int index) {
			
		}*/
	}
	
	
	public static void main(String[] args) {
		SetOfStacks setOfStacks = new Exercise3().new SetOfStacks(2);
		setOfStacks.push(new Exercise3().new Planet("Earth"));
		setOfStacks.push(new Exercise3().new Planet("Moon"));
		setOfStacks.push(new Exercise3().new Planet("Jupter"));
		setOfStacks.push(new Exercise3().new Planet("Neptune"));
		setOfStacks.push(new Exercise3().new Planet("Saturn"));
		
	}

}
