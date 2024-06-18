package com.java.dailyExercisesday4;

public class Animaldemo {

		 public static void main(String[] args) {
		     // Creating instances of Animal subclasses
		     Animal dog = new Dog();
		     Animal horse = new Horse();
		     Animal cat = new Cat();

		     // Making each animal shout using the Animal variable
		     dog.shout();   // Outputs: Woof! Woof!
		     horse.shout(); // Outputs: Neigh! Neigh!
		     cat.shout();   // Outputs: Meow! Meow!
		 
		}

}
