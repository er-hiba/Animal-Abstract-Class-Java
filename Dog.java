// Define a Dog class extending the Animal class
class Dog extends Animal {
    // Constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Implementing the sound method for a Dog
    public String sound() {
        return "Barking";
    }
}
