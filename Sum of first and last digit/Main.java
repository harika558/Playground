import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int l,f;
      f=n;
      while(f>=10)
      {
        f=f/10;
      }
      l=n%10;
      int s=f+l;
      System.out.println(s);
	}
}