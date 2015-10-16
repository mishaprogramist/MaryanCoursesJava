import com.github.mishaprogramist.MaryanCoursesJava.Bmw;
import com.github.mishaprogramist.MaryanCoursesJava.Car;
import com.github.mishaprogramist.MaryanCoursesJava.Peugeot;

public class MaryanCoursesJava {

    public static void main(String [] args) {

        Car mw1 = new Peugeot();
        mw1.show();

        Car mw2 = new Bmw("A1", 2013, 2345.6);
        mw2.show();
        mw2.setProbeg(1234.0);
        mw2.show();

        Car mw3 = new Bmw("X5");
        mw3.show();

        Car mw4 = new Bmw();
        mw4.show();

    }
}
