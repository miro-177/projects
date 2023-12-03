import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Checking checking = new Checking();
        Savings savings = new Savings();
        int choice = 0;
        float withdrawl;
        float deposit;
        int input;
        do{
            System.out.println("1. Withdraw from Checking\n2. Withdraw from Savings\n3. Deposit to Checking\n4. Deposit to Savings\n5. Balance of Checking\n6. Balance of Savings\n7. Award Interest to Savings now\n8. Quit ");
            choice = scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("How much would you like to withdrawl from Checking?");
                    withdrawl = scanner.nextFloat();
                    checking.withdrawal(withdrawl);
                    break;
                case 2:
                    System.out.println("How much would you like to withdrawl from Savings?");
                    withdrawl = scanner.nextFloat();
                    savings.withdrawal(withdrawl);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit to Checking?");
                    deposit = scanner.nextFloat();
                    checking.deposit(deposit);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit to Savings?");
                    deposit = scanner.nextFloat();
                    savings.deposit(deposit);
                    break;
                case 5:
                    System.out.println("Your balance for checking " +checking.getAccountNumber()+ " is $"+ checking.getAccountBalance());
                    break;
                case 6:
                    System.out.println("Your balance for savings " +savings.getAccountNumber()+ " is $"+ savings.getAccountBalance());
                    break;
                case 7:
                    savings.addInterest();
                    break;
            }
        }
        while(choice != 8);
    }
}