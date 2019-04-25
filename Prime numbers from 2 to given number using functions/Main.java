import java.util.Scanner;
class Main 
 {

    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      int high=in.nextInt();

        int low = 2;

        while (low < high) {
            if(checkPrimeNumber(low))
                System.out.println(low + " ");

            ++low;
        }
    }

    public static boolean checkPrimeNumber(int num) {
        boolean flag = true;

        for(int i = 2; i <= num/2; ++i) {

            if(num % i == 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

}