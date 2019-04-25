import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n=in.nextInt();
      int sec=n%10000;
      if(n>99)
      {
          while(sec>=10)
          {
              sec=sec/10;
          }
      
           System.out.println(sec);
      }
    
    
  if(n<99)
  {
    System.out.println(n%10);
  }
}
    }