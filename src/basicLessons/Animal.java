package basicLessons;

public class Animal {
    private int weight;
    private String type;

    public Animal(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public Animal() {
    }

    public void eat(){
        System.out.println("I am eating!");

    }
    public void sleep(){
        System.out.println("I am sleeping!");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", type='" + type + '\'' +
                '}';
    }
}
