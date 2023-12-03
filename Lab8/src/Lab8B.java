import java.util.Scanner;
public class Lab8B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int numRow;
        int numCol;
        System.out.print("Please enter the number of rows: ");
        numRow = scanner.nextInt();
        System.out.print("Please enter the number of columns: ");
        numCol = scanner.nextInt();
        System.out.println();

        int [][] array = new int[numRow][numCol];
        System.out.println("I have "+numRow+ " rows and "+numCol+" columns. I need to fill-up "+(numRow*numCol)+" spaces.");
        System.out.println();

        for (int i=0; i<numRow;i++)
        {
            for (int j=0; j<numCol;j++)
            {
                array[i][j] = i * numCol + j + 1;
            }
        }
        System.out.println("The "+numRow+"x"+numCol+ " array: ");
        for (int i = 0; i < numRow; i++)
        {
            for (int j = 0; j < numCol; j++)
            {
                System.out.print(array[i][j] + "|");
            }
            System.out.println();
        }

    }
}
