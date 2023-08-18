package com.startjava.lesson_2_3.robot;

public class Jaeger {

    private String modelNAME;
    private String mark;
    private double height;
    private double weight;
    private int kaijuKilled;

    public Jaeger() {}

    public Jaeger(String modelNAME, String mark, double height, double weight, int kaijuKilled) {
        this.modelNAME = modelNAME;
        this. mark = mark;
        this.height = height;
        this.weight = weight;
        this.kaijuKilled = kaijuKilled;
    }

    public void setModelNAME(String modelNAME) {
        this.modelNAME = modelNAME;
    }

    public String getModelNAME() {
        return modelNAME;
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
        System.out.println(modelNAME + " " + "Walking");
    }

    public void fire() {
        System.out.println(modelNAME + " " + "Firing");
    }

    public void showInfo() {
        System.out.println("Model NAME: " + modelNAME);
        System.out.println("Mark: " + mark);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);
        System.out.println("Kaiju Killed: " + kaijuKilled);
    }
}
