/**
 * Created by m.karma on 30.09.2015.
 */
public class Car {
    /*
    ������ ����� Car, ����� �� ��������
    1) ����� String
    2) ������ String
    3) ��� ������� int
    4) ������ - float
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
