import java.util.Scanner;
class Main 
{
  public static void main (String[] args) 
  {int zero=0;int i;
   Scanner ob=new Scanner(System.in);
   int n=ob.nextInt();
   int a[]=new int[n];
   for(i=0;i<n;i++)
   { a[i]=ob.nextInt();
   }    
    for(i=0;i<n;i++)
    {
       if(a[i]>0)
      System.out.print(a[i]+" ");
      else
	zero++;
    }
    for(i=0;i<zero;i++)
    System.out.print("0 ");
  }
  
}