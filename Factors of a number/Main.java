import java.util.*;
class Main{
	public static void main (String[] args){
	    // Type your code heren);
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      for(int i=1;i<=n;++i)
      {
        if(n%i==0)
          System.out.println(i);
      }
	}
}