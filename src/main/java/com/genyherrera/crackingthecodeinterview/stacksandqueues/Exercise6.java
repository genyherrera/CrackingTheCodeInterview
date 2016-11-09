package com.genyherrera.crackingthecodeinterview.stacksandqueues;

import java.util.Date;
import java.util.LinkedList;

/**
 * @problem: Animal Shelter: An animal shelter, which holds only dogs and cats, operates on a strictly"first in, first
 * 			 out" basis. People must adopt either the "oldest" (based on arrival time) of all animals at the shelter,
 * 			 or they can select whether they would prefer a dog or a cat (and will receive the oldest animal of
 * 			 that type). They cannot select which specific animal they would like. Create the data structures to
 * 			 maintain this system and implement operations such as enqueue, dequeueAny, dequeueDog,
 * 			 and dequeueCat. You may use the built-in Linkedlist data structure.
 * @author geny.herrera
 */
public class Exercise6 {

	abstract class Animal {
		protected String name;
		protected Date createdTimeStamp;

		public Animal(String name) {
			this.name = name;
			this.createdTimeStamp = new Date();
		}

		public int compareTo(Animal animal) {
			return this.createdTimeStamp.compareTo(animal.createdTimeStamp);
		}
	}

	class Dog extends Animal {
		public Dog(String name) {super(name);}
	}
	class Cat extends Animal{
		public Cat(String name) {super(name);}
	}

	class AnimalShelter {
	
		LinkedList<Dog> dogList;
		LinkedList<Cat> catList;
		
		public AnimalShelter() {
			dogList = new LinkedList<Dog>();
			catList = new LinkedList<Cat>();
		}

		public void enqueue(Animal animal) {
			if (animal instanceof Dog) {
				dogList.addLast((Dog) animal);
			} else {
				catList.addLast((Cat) animal);
			}
		}

		public Animal dequeueAny() {
			if (dogList.getFirst().compareTo(catList.getFirst()) == 1) {
				return dequeueCat();
			} else {
				return dequeueDog();
			}
		}

		public Animal dequeueDog() {
			return dogList.poll();
		}

		public Animal dequeueCat() {
			return catList.poll();
		}

	}

	public static void main(String[] args) {
		Cat cat1 = new Exercise6().new Cat("CAT1");
		Cat cat2 = new Exercise6().new Cat("CAT2");
		Cat cat3 = new Exercise6().new Cat("CAT3");
		Cat cat4 = new Exercise6().new Cat("CAT4");
		Cat cat5 = new Exercise6().new Cat("CAT5");

		Dog dog1 = new Exercise6().new Dog("DOG1");
		Dog dog2 = new Exercise6().new Dog("DOG2");
		Dog dog3 = new Exercise6().new Dog("DOG3");
		Dog dog4 = new Exercise6().new Dog("DOG4");
		Dog dog5 = new Exercise6().new Dog("DOG5");

		AnimalShelter shelter = new Exercise6().new AnimalShelter();
		shelter.enqueue(cat1);
		shelter.enqueue(dog1);
		shelter.enqueue(cat2);
		shelter.enqueue(dog2);
		shelter.enqueue(cat3);
		shelter.enqueue(dog3);
		shelter.enqueue(cat4);
		shelter.enqueue(dog4);
		shelter.enqueue(cat5);
		shelter.enqueue(dog5);
		
		System.out.println(shelter.dequeueAny().name);
		System.out.println(shelter.dequeueAny().name);
		System.out.println(shelter.dequeueCat().name);
		System.out.println(shelter.dequeueDog().name);
	}



}
