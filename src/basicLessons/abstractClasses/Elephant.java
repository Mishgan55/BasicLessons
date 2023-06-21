package basicLessons.abstractClasses;

import basicLessons.interfaces.Info;

public class Elephant extends Animal   {
    @Override
    public void makeSound() {
        System.out.println("WWWWWW");
    }

    @Override
    public void eat() {
        System.out.println("I am eating a lot of food!");

    }


}
