import com.github.mishaprogramist.MaryanCoursesJava.Bmw;
import com.github.mishaprogramist.MaryanCoursesJava.Car;

public class MaryanCoursesJava {

    public static void main(String [] args) {

        Car mw1 = new Car();
        mw1.show();

        Car mw2 = new Car("BMW", "A1", 2013, 2345.6);
        mw2.show();

        mw2.setProbeg(1234.0);
        mw2.show();

        Car mw3 = new Bmw("X5");
        mw3.show();

        int mw4 = 678;
    }
}
