import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result = greatest(n1, n2);
	    System.out.print(greatest(result, n3));
	}
	public static int greatest(int num1, int num2)
	{
	    int n4 = 0;
	    if(num1 > num2){
	        n4 = num1;
	    }
	    else{
	        n4 = num2;
	    }
	    return n4;
	}
}


