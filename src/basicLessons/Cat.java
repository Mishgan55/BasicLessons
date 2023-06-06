package basicLessons;

import basicLessons.interfaces.Info;

public class Cat extends Animal implements Info {
    private String name;

    public void eat() {
        System.out.println("Cat is  eating!");
    }


    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(name);

    }
}
