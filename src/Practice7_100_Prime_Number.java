public class Practice7_100_Prime_Number {
    public static void main(String[] args) {
        int i;
        int j;
        for(i = 2; i <= 100; i++){
            boolean check = true;
            j = 2;
            while( j <= Math.sqrt(i)){
                if(i % j == 0){
                    check = false;
                }
                j++;
            }
            if(check){
                System.out.println(i);
            }
        }
    }

}
