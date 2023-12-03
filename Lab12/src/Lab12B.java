import java.util.Scanner;
public class Lab12B {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dog dog = new Dog();
        System.out.println("You are about to create a dog.");
        System.out.print("How old is the dog: ");
        dog.age = scanner.nextInt();

        System.out.print("How much does the dog weigh: ");
        dog.weight = scanner.nextDouble();
        System.out.print("What is the dog's name: ");
        dog.name = scanner.next();

        System.out.print("What color is the dog: ");
        dog.furColor = scanner.next();

        System.out.print("What breed is the dog: ");
        dog.breed = scanner.next();

        System.out.println();
        System.out.println(dog.name +" is a "+dog.age+" year old "+dog.furColor+" "+dog.breed+" that weighs "+ dog.weight+" lbs.");
        System.out.println();

        dog.bark();
        dog.eat();
        dog.rename();

        System.out.println();
        System.out.println(dog.name +" is a "+dog.age+" year old "+dog.furColor+" "+dog.breed+" that weighs "+ dog.weight+" lbs.");

    }
}