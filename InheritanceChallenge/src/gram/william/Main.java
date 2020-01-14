package gram.william;


// All classes inherit from java.lang.Object. Writing "extends Object" is superfluous.
public class Main extends Object {

    public static void main(String[] args) {

        SpecialCar outlander = new SpecialCar(3);
        outlander.accelerate(20);
        outlander.accelerate(30);
    }
}
