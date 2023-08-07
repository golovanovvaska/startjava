public class Jaeger {

    private String modelName;
    private String mark;
    private double height;
    private double weight;
    private int kaijuKilled;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, double height, double weight, int kaijuKilled) {
        this.modelName = modelName;
        this. mark = mark;
        this.height = height;
        this.weight = weight;
        this.kaijuKilled = kaijuKilled;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    public void walk() {
        System.out.println(modelName + " " + "Walking");
    }

    public void fire() {
        System.out.println(modelName + " " + "Firing");
    }

    public void showInfo() {
        System.out.println("Model Name: " + modelName);
        System.out.println("Mark: " + mark);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Kaiju Killed: " + kaijuKilled);
    }
}
