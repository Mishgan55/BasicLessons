package basicLessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("Hanna");
        person1.setAge(26);
        person1.sayHello();
        person1.sayNameAndAge();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println("Years to retirement: "+years1);


        System.out.println();


        Person person2=new Person();
        person2.setName("");
        person2.setAge(-2);
        person2.sayHello();
        person2.sayNameAndAge();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Years to retirement: "+years2);


    }

}
class Person{
    private String name;
    private int age;
    private static final int YEARSTORETIREMENT=65;

    public Person(){
        this.name="Default name";
        this.age=0;
    }

    public Person(String name){
        this.name=name;

    }

    public Person(String name,int age){
        this.name=name;
        this.age=age;

    }

    public void setName(String userName){
        if (userName.isEmpty()){
            System.out.println("You didn't write down name!");}
        else {
            name=userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        if (userAge<0){
            System.out.println("you wrote down wrong age!");
        }else {
            age=userAge;
        }
    }

    public int getAge(){
        return age;
    }

    void setNameAndAge(String userName, int userAge){
        name=userName;
        age=userAge;
    }

    int calculateYearsToRetirement(){
        int years=YEARSTORETIREMENT-age;
        return years;
    }



    void sayNameAndAge(){
        System.out.println("My name is "+name+", I am "+age+" years old!");
    }

    void sayHello(){
        System.out.println("Hello! ");
    }
}
