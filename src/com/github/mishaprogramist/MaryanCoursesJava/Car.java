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
    String marka;
    String model;
    int godVypuska = 2015;
    double probeg = 30;

    public void show(){
        System.out.println(this.marka + " - " + this.model + " " + this.godVypuska + " года выпуска с пробегом " + this.probeg + " км");
    }

    public void setProbeg(double probeg){
        this.probeg = probeg;
    }

}

