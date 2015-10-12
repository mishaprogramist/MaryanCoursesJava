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
    String marka = "Peugeot";
    String model = "405";
    private int godVypuska;
    private float probeg;

    public Car(){

    }

    public Car(String marka, String model){
        this.marka = marka;
        this.model = model;
    }

    public void show(){
        System.out.println(this.marka + " - " + this.model);
    }


}
