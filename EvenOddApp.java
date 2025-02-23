import java.util.*;
public class EvenOddApp
{
   public static void main(String []args)
   {
    int no;
    String result;
    Scanner sc=new Scanner(System.in);
    System.out.println("plz enter the Number ");
    no=sc.nextInt();
    result=no%2==0 ?"Even" :"Odd";
   System.out.println("The number is "+result);
    }
}
