import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int b=in.nextInt();
    int exp=in.nextInt();
    int res=res(b,exp);
    System.out.println(res);
  }
  public static int res(int b,int exp)
  {
    int res=1;
    for(int i=0;i<exp;i++)
    {
      res=res*b;
    }
    return res;
  }
}