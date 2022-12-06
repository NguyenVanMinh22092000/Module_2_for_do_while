import java.util.Scanner;

public class Practice2_Interest_Money {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = 1;
        int month = 1;
        double interest = 0;
        double rateInterest = 0;

        System.out.println("Enter the amount you want to borrow");
        money = sc.nextDouble();
        System.out.println("How many months?");
        month = sc.nextInt();
        System.out.println("Here's the interest our bank offer");
        interest = sc.nextDouble();

        for ( int i = 1; i <= month; i++){
            money += interest;
            interest = money * (rateInterest / 100)/12;
        }
        System.out.println("money = " + money);
    }
}
