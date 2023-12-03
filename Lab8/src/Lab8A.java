import java.util.Scanner;
public class Lab8A {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[5];
        int B[] = new int[5];
        int sum[] = new int[5];

        System.out.println("Please enter 5 integers for the first array: ");
        for(int i = 0; i < A.length; i++)
        {
            System.out.print("Integer "+ (i+1) +": ");
            A[i] = scanner.nextInt();
        }
        System.out.println("");
        System.out.println("Please enter 5 integers for the second array: ");
        for (int i = 0; i < B.length; i++)
        {
            System.out.print("Integer "+ (i+1) +": ");
            B[i] = scanner.nextInt();
        }
        for (int i = 0; i < B.length; i++)
        {
            sum[i]= A[i] + B[i];
        }

        System.out.print("\nThe resulting sums are ");
        for (int i = 0; i < sum.length; i++)
            System.out.print(sum[i] + "|");
        System.out.println("");




    }
}
