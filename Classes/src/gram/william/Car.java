package gram.william;

// access modifier:
// public - unrestricted access
// protected - other classes within the package can access the class
// private - no other class can get access

public class Car {
    // encapsulation is the concept of hiding objects outside the object's definition

    // Define the state of the car, defined as fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;
    // Five fields that define the state of the car above.

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            // we wish to change the class field >model<. "this." works as "self."
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
