package basicLessons.abstractClasses;

public class Horse extends Animal {

    @Override
    public void makeSound() {
        System.out.println("HRHRHRH");
    }

    @Override
    public void eat() {
        System.out.println("I like eat hay!");

    }
}
