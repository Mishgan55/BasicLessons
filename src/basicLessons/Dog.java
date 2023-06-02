package basicLessons;

import basicLessons.interfaces.Info;

public class Dog extends Animal implements Info {
    private String name;

    public void bark(){
        System.out.println("I am barking!");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showInfo() {
        System.out.println(this.name+", "+ getWeight());
    }
}
