// Define an abstract class Animal
abstract class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method for making a sound
    public abstract String sound();

    // Method to get information about the animal

    public String getInfo() {
        return "Name: " + name + " and age: " + age;
    }
}
