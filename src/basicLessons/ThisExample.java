package basicLessons;

public class ThisExample {
    public static void main(String[] args) {
        Human human = new Human("Misha",25);
        Human anna = new Human("Anna", 26);
        Human ksenia = new Human("Ksenia", 9);
        Human.getPeople();

    }

}

class Human {
    private String name;
    private int age;
    public static int countPeople;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        countPeople++;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void getPeople(){
        System.out.println("peoples = "+ countPeople);
    }

    public void getInfo() {
        System.out.println(name + ", " + age);
    }


}
