import java.util.Scanner;

public class Practice1_Find_Prime_number {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int number = sc.nextInt();
        int i = 2;
        boolean check = true;
        if(number < 2){
            System.out.println(number + " is not a prime number.");
        } else {
            while(i <= Math.sqrt(number)){
                if(number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if(check){
                System.out.println(number + " is a prime number.");
            }else{
                System.out.println(number + " is not a prime number.");
            }
        }

    }
}
