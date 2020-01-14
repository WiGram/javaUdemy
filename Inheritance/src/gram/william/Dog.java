package gram.william;

// Inheritance in Java uses the statement "extends" - we are extending from a super class
// To make it work, we need a default constructor from the other class
public class Dog extends Animal {
    // We can assign extra states (fields) and behaviours (methods) unique to a dog, and not necessarily for an animal
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // Notice "this()" has been replaced by "super()"
    // super() calls the constructor from the class we're inheriting from
    // i.e. super() initialises the Animal class, i.e. the base characteristics of an animal
    /*
    public Dog(String name, int brain, int body, int size, int weight) {
        super(name, brain, body, size, weight);
    }
     */
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);

        // We need to initialise the unique characteristics also
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();

        // super. means call the super equivalent of that class, i.e. calls the eat method from the super class, Animal
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(5);
    }

    public void run() {
        System.out.println("Dog.run() called");
        // could leave out super., but this makes the code vulnerable to overwriting class method
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
