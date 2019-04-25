import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner ob=new  Scanner(System.in);
      char ch=ob.next().charAt(0);
      int key=ob.nextInt();
      ch=(char)(ch-key);
     if(ch>=97 && ch<=122 || ch>=65 && ch<=90 )
    System.out.println(ch);
    else if(ch<97)
    {
        ch=(char)(ch+26);
    System.out.println(ch);
 } else if(ch<65)
    {
        ch=(char)(ch+26);
    System.out.println(ch);
 }
    }
}