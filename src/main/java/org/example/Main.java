package org.example;

public class Main {
    public static void main(String[] args) {

        Animal animalOne = new Dog();

        animalOne.makeSound("dog", "bark");

        Animal animalTwo = (name, sound) -> System.out.println("I am a " + name + ". I " + sound);

        animalTwo.makeSound("lion", "roar");
    }
}