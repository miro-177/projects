/*
Class: CSE 1321L
Section: J51
Term: Fall
Instructor: Jaskirat Sohal
Name: Miroslav Ostrovski
Assignment#: 5
 */
import java.util.Scanner;

public class Assignment5A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] friends = new String[5];
        System.out.println("[Top 5 Friend's List]");
        int action;
        int i = 0;
        do {
            System.out.println("What would you like to do?");
            System.out.print("1) Enter a friend’s name\n2) Replace a friend’s name\n3) Display your friends list\n4) Quit\nYour choice: ");
            action = scanner.nextInt();
            switch (action) {
                case 1: {
                    System.out.println();
                    System.out.print("Enter a name: ");
                    String name = scanner.next();
                    if (i == 5) {
                        System.out.println("Sorry, your friends list is full!");
                        System.out.println();
                        continue;
                    }
                    for (String person : friends) {
                        if (name.equals(person)) {
                            System.out.println("Sorry, they're already on the list!");
                        }
                        else {
                            friends[i] = name;
                            i++;
                        }
                        System.out.println();
                        break;
                    }
                    break;
                }
                case 2: {
                    System.out.println();
                    System.out.print("Enter a name: ");
                    String name = scanner.next();
                    System.out.print("Enter an index: ");
                    int index = scanner.nextInt();
                    if (index > friends.length-1) {
                        System.out.println("Sorry, that's an invalid command");
                        System.out.println();
                        break;
                    }
                    String temp = name;
                    name = friends[index];
                    friends[index] = temp;
                    break;
                }
                case 3: {
                    System.out.println("Friend's list");
                    int count = 1;
                    for (int friendNum = 0; friendNum < friends.length;) {
                        if (friendNum >= i) {
                            System.out.println(count+ ")");
                        }
                        else {
                            System.out.println(count + ") " + friends[friendNum]);
                        }
                        friendNum++;
                        count++;
                    }
                    System.out.println();
                    break;
                }
                case 4:
                    break;
                default:
                    System.out.println("Sorry, that's an invalid command");
                    break;
            }
        }
        while (action != 4);
    }
}
