package Enums;

public enum Season {
    WINTER(-10),SPRING(5),SUMMER(20),AUTUMN(7);

    private int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }


}
