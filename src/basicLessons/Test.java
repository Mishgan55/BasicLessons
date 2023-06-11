package basicLessons;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Animal> animal=new ArrayList<>();
        animal.add(new Animal(1,"insect"));
        animal.add(new Animal(25,"horse"));
        info(animal);

        List<Dog> dog = new ArrayList<>();
        dog.add(new Dog("bob"));
        dog.add(new Dog("sam"));
        info(dog);


        int _int;
        int _2_;
        int $int;




    }

    public static void info(List<? extends Animal> list){
        for(Animal animal: list){
            System.out.println(animal);
        }
    }


}
