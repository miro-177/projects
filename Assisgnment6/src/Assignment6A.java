import java.util.Random;
import java.util.Scanner;

public class Assignment6A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("[Is It Sorted?]");
        create_random_array(array,10);
        int action;
        do {
            System.out.println("\nWhat do you want to do?\n1) Generate a new random array\n2) Is the array sorted?\n3) Sort the array\n4) Quit");
            System.out.print("\nChoice: ");
            action = scanner.nextInt();

            switch (action) {
                case 1:
                    create_random_array(array, 10);
                    break;
                case 2:
                    if (!is_array_sorted(array,10)) {
                        System.out.println("\nThe array is sorted.");
                    } else {
                        System.out.println("\nThe array is not sorted.");
                    }
                    break;
                case 3:
                    System.out.println();
                    sort_array(array, array.length);
                    break;
            }
        }
        while (action != 4);
    }
    public static void create_random_array(int[] array, int array_size) {
        Random rand = new Random();
        for (int i = 0; i < array_size; i++) {
            int randomNum = rand.nextInt(-500, 500);
            array[i] = randomNum;
        }

        System.out.println();
        System.out.println("Random Array: ");
        printArray(array);
    }
    public static boolean is_array_sorted(int[] array, int array_size) {
        boolean isSorted = false;
        for (int i = 0; i < array_size; i++)
        {
            for (int j = 0; j < array_size - i - 1 ; j++)
            {
                if (array[j] > array[j + 1]) {
                    isSorted = true;
                    break;
                }
            }
        }
        return isSorted;
    }
    public static void sort_array(int[] array, int array_size) {
        for (int index = 1; index < array_size; index++) {
            int key = array[index];
            int position = index;
            while (position > 0 && key < array[position - 1]) {
                array[position] = array[position - 1];
                position--;
            }
            array[position] = key;
        }
        System.out.print("Sorted Array: ");
        printArray(array);
    }
    public static void printArray(int[] newArray) {
        int i = 0;
        for (int number : newArray) {
            if (i == newArray.length-1) {
                System.out.print("\b "+number);
            }
            else {
                System.out.print(number + ", ");
            }
            i++;
        }
        System.out.println();
    }
}