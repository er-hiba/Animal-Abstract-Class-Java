// Define a Horse class extending the Animal class
class Horse extends Animal {
    // Constructor
    public Horse(String name, int age) {
        super(name, age);
    }

    // Implementing the sound method for a Horse
    public String sound() {
        return "Neighing";
    }
}
