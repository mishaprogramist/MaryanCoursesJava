package com.github.mishaprogramist.MaryanCoursesJava;

/**
 * Created by m.karma on 16.10.2015.
 */
public class Bmw extends Car {

    public Bmw(){
        this.marka = "BMW";
        this.model = "A1";
    }

    public Bmw(String model){
        this.marka = "BMW";
        this.model = model;
    }

    public Bmw(String model, int godVypuska, double probeg){
        this.marka = "BMW";
        this.model = model;
        this.godVypuska = godVypuska;
        this.probeg = probeg;
    }
}
