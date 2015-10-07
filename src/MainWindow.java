/**
 * Created by m.karma on 30.09.2015.
 */
public class MainWindow {
    String str = "Hello World";

    public MainWindow(){

    }

    public MainWindow(String str){
        this.str = str;
    }

    public void show(){
        System.out.println(this.str);
    }


}
