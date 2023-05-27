package basicLessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Hanna";
        person1.age=26;
        person1.sayHello();
        person1.sayNameAndAge();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println("Years to retirement: "+years1);


        Person person2=new Person();
        person2.name="Ksenia";
        person2.age=9;
        person2.sayHello();
        person2.sayNameAndAge();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Years to retirement: "+years2);


    }

}
class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){
        int years=65-age;
        return years;
    }



    void sayNameAndAge(){
        System.out.println("My name is "+name+", I am "+age+" years old!");
    }

    void sayHello(){
        System.out.println("Hello! ");
    }
}
