/*
Class: CSE 1321L
Section: J51
Term: Fall
Instructor: Jaskirat Sohal
Name: Miroslav Ostrovski
Lab#: 9
 */
import java.util.Scanner;
public class Lab9A {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array=new int[10];
        int i, num, flag=0;

        System.out.println("Please enter 10 numbers: ");

        for(i=0; i<10; i++)
        {
            System.out.print("Integer "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("What is the target number: ");
        num = scanner.nextInt();

        for(i=0; i<10; i++)
        {
            if(array[i]==num)
            {
                flag=1;
                break;
            }
        }
        System.out.println();
        if(flag==1)
            System.out.println("The target is in the set.");
        else
            System.out.println("The target is not in the set.");
    }
}

