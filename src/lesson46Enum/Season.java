package lesson46Enum;

public enum Season {
    SUMMER(30), AUTUMN(15), WINTER(-20), SPRING(18);

    private int temperature;
    Season(int tempreture) {
    this.temperature = tempreture;
    }

    public int getTemperature() {
        return temperature;
    }
}
