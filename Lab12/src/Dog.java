import java.util.Scanner;
public class Dog {
    static Scanner scanner = new Scanner(System.in);
    public int age;
    public double weight;
    public String name;
    public String furColor;
    public String breed;
    Dog() {
        furColor = null;
        age = 0;
        weight = 0.0;
        name = null;
        breed = null;
    }
    public void bark() {
        System.out.println("Woof! Woof!");
    }
    public void rename() {
        System.out.print(name+" isn't a very good name. What should they be renamed to: ");
        name = scanner.next();
    }
    public void eat() {
        System.out.print(name+" is hungry, how much should he eat: ");
        double munch = scanner.nextDouble();
        weight = weight + munch;
    }
}
