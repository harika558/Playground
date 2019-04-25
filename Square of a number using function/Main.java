import java.util.Scanner;
class Main
{
  public static int sum_of_last3_digits(int num)
 {
    int sod = num*num;
    return sod;
 }
 public static void main(String args[])
 {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int sod = sum_of_last3_digits(num);
    System.out.println(sod);
  }
}