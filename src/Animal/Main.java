package Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Васька", 45, false);
        Animal animal2 = new Animal("Васька", 45, false);

        System.out.println("animal1.equals(animal2): " + animal1.equals(animal2));
        System.out.println("animal1.hashCode(): " + animal1.hashCode());
        System.out.println("animal2.hashCode(): " + animal2.hashCode());

        System.out.println(animal1.toString());
    }
}
