import java.util.Scanner;
public class Lab8C {
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
        int [] array1 = new int[numRow*numCol];
        int num = 1;
        System.out.println("I have "+numRow+ " rows and "+numCol+" columns. I need to fill-up "+(numRow*numCol)+" spaces.");
        System.out.println();

        for (int i=0; i<numRow;i++)
        {
            for (int j=0; j<numCol;j++)
            {
                array[i][j] = num;
                array1[num-1] = array[i][j];
                num++;
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
        System.out.println();
        System.out.println("The "+numRow+"x"+numCol+" 2-D array flattened into a "+(numCol*numRow)+" cell 1-D array: ");
        for (int i = 0; i < numRow*numCol; i++)
        {
            System.out.print(array1[i] + "|");
        }
        System.out.println();
    }
}
