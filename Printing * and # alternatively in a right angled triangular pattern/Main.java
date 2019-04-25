import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {

   
     // System.out.println ("Enter the value:");
    Scanner ob = new Scanner (System.in);
    int n = ob.nextInt ();
    int count =10;
     
    for (int i = 1; i <= n; i++)
      {  
	for (int j = 1; j <= i; j++)
	 
      {
	    if(count==10) 
        {   System.out.print ("*");count=11;}
	    else if(count==11) 
        {   System.out.print ("#");count=10;}
	    
      }
	  System.out.println (" ");
	  } 

     } 
 
}
