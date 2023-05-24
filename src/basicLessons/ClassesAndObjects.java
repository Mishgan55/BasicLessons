package basicLessons;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Hanna";
        person1.years=26;
        System.out.println(person1.name+", "+person1.years);

        Person person2=new Person();
        person2.name="Ksysha";
        person2.years=9;
        System.out.println(person2.name+", "+person2.years);
    }

}
class Person{
    String name;
    int years;
}
