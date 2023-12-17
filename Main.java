public class Main {
    public static void main(String[] args) {
        // Creating instances of Horse and Cat
        Horse h1 = new Horse("Jack", 4);
        Horse h2 = new Horse("Steve", 5);
        Cat c1 = new Cat("Nickie", 6);
        Cat c2 = new Cat("Rosy", 4);
        Cat c3 = new Cat("Riri", 2);
        Dog d1 = new Dog("Rocky", 2);
        Dog d2 = new Dog("Max", 3);

        // Accessing information and sounds of Horse and Cat and Dog
        System.out.println("Horses:"+"\nSound: "+h1.sound());
        System.out.println(h1.getInfo());
        System.out.println(h2.getInfo());
        System.out.println("\nCats:"+"\nSound: "+c1.sound());
        System.out.println(c1.getInfo());
        System.out.println(c2.getInfo());
        System.out.println(c3.getInfo());
        System.out.println("\nDogs:"+"\nSound: "+d1.sound());
        System.out.println(d1.getInfo());
        System.out.println(d2.getInfo());
    }
}
