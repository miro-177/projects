import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                List<Customer> queue = new ArrayList<>();
                menu(queue);
            }

            public static void menu(List<Customer> queue) {
                Scanner scanner = new Scanner(System.in);
                int choice = 0;
                while (choice != 6) {
                    System.out.println("1. Take test for new license");
                    System.out.println("2. Renew existing license");
                    System.out.println("3. Move from out of state");
                    System.out.println("4. Answer citation/suspended license");
                    System.out.println("5. See current queue");
                    System.out.println("6. Quit");
                    choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.println("What is your name?");
                            String name = scanner.nextLine();
                            System.out.println("What is your date of birth?");
                            String dob = scanner.nextLine();
                            queue.add(new NewTest(name, dob));
                            break;
                        case 2:
                            System.out.println("What is your name?");
                            name = scanner.nextLine();
                            queue.add(new Renew(name));
                            break;
                        case 3:
                            System.out.println("What is your name?");
                            name = scanner.nextLine();
                            System.out.println("What state did you move from?");
                            String state = scanner.nextLine();
                            queue.add(new Move(name, state));
                            break;
                        case 4:
                            System.out.println("What is your name?");
                            name = scanner.nextLine();
                            System.out.println("What violation did you commit?");
                            String violation = scanner.nextLine();
                            queue.add(new Suspended(name, violation));
                            break;
                        case 5:
                            for (Customer customer : queue) {
                                System.out.println(customer.getCustomerInfo());
                            }
                            break;
                        case 6:
                            break;
                        default:
                            System.out.println("Invalid choice.");
                            break;
                    }
                }
            }
        }
