package basicLessons;

public class Dog extends Animal {
    private String name;

    public void bark(){
        System.out.println("I am barking!");
    }

    public void show(){
        System.out.println(name+", "+getWeight());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
