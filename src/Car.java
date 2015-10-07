/**
 * Created by m.karma on 30.09.2015.
 */
public class Car {
    String marka = "Peugeot";
    String model = "405";

    public Car(){

    }

    public Car(String marka){
        this.marka = marka;
    }

    public Car(String marka, String model){
        this.marka = marka;
        this.model = model;
    }

    public void show(){
        System.out.println(this.marka + " - " + this.model);
    }


}
