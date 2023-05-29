package basicLessons;

public class ThisExample {
    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Misha");
        human.setAge(25);
        human.getInfo();
    }

}

class Human{
     private String name;
     private int age;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+ ", "+age);
    }


}
