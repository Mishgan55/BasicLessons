package basicLessons.abstractClasses;

public class Test {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Elephant elephant = new Elephant();
        horse.eat();
        horse.makeSound();
        horse.sleep();
        System.out.println("/////////////////////////////////////////");
        elephant.makeSound();
        elephant.eat();
    }
}
