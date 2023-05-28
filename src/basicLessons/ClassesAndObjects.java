package basicLessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setNameAndAge("Hanna",25);
        person1.sayHello();
        person1.sayNameAndAge();
        int years1 = person1.calculateYearsToRetirement();
        System.out.println("Years to retirement: "+years1);


        System.out.println();


        Person person2=new Person();
        person2.setNameAndAge("Ksenia",9);
        person2.sayHello();
        person2.sayNameAndAge();
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Years to retirement: "+years2);


    }

}
class Person{
    String name;
    int age;

    void setNameAndAge(String userName, int userAge){
        name=userName;
        age=userAge;
    }

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
