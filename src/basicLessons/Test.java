package basicLessons;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Dan");
        Animal animal = new Animal();
        Cat barsik = new Cat("Barsik");
        test(dog);
        test(animal);
        test(barsik);



    }
    public static void test(Animal animal){
        animal.eat();
    }

}
