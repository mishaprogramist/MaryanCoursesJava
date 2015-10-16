package com.github.mishaprogramist.MaryanCoursesJava;

/**
 * Created by m.karma on 30.09.2015.
 */
public class Car {
    /*
    измени класс Car, чтобы он содержал
    1) марка String
    2) модель String
    3) год выпуска int
    4) пробег - float
     */
    private String marka = "Peugeot";
    private String model = "405";
    private int godVypuska = 1989;
    private double probeg = 400000.0;

    public Car(){

    }

    public Car(String marka, String model){
        this.marka = marka;
        this.model = model;
        this.godVypuska = 2015;
        this.probeg = 0;
    }

    public Car(String marka, String model, int godVypuska, double probeg){
        this.marka = marka;
        this.model = model;
        this.godVypuska = godVypuska;
        this.probeg = probeg;
    }

    public void show(){
        System.out.println(this.marka + " - " + this.model + " " + this.godVypuska + " года выпуска с пробегом " + this.probeg + " км");
    }

    public void setProbeg(double probeg){
        this.probeg = probeg;
    }

}

