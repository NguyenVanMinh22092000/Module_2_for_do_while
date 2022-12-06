import java.util.Scanner;

public class Practice6_Count_Prime_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prime numbers you want");
        int number = sc.nextInt();
        boolean check;
        int count = 0;
        int j, i;

        if(number < 2){
            System.out.println("no no no");
        }else {

            for( j = 2; count < number; j++){
                 i = 2;
                 check = true;
                while (i <= Math.sqrt(j)) {
                    if (j % i == 0) {
                        check = false;
                        break;
                    }
                    i++;
                }
                if (check) {
                    count++;
                    System.out.println(j);
                }
            }
        }
    }
}
