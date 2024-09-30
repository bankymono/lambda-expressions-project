package org.example;

public class Dog implements Animal {
    @Override
    public void makeSound(String name, String sound) {
        System.out.println("I am a " + name + ". I " + sound);
    }
}
