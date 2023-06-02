package basicLessons;

public class Animal {
    private int weight;
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
}
