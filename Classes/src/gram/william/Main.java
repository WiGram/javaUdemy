package gram.william;

public class Main {

    public static void main(String[] args) {

        // As far as Java is concerned, Car (a class) works as a new data type
        Car porsche = new Car();
        Car holden = new Car();  // an Australian brand car

        // Many methods are inherited from a base Java class, such as the method equals
        // porsche.equals();

        // porsche.model = "Carrera";  Against encapsulation - better make it private and add a method.
        System.out.println("Model is: " + porsche.getModel());
        porsche.setModel("Carrera");
        System.out.println("Model is: " + porsche.getModel());
    }
}
