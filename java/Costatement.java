import java.util.Scanner;
class Condition
{
    public static void main(String args[])
    {
      int a,b,c;
      Scanner scanner= new Scanner(System.in);
      System.out.println("Enter first number");
      a=scanner.nextInt();  
      System.out.println("Enter second number");
      b=scanner.nextInt(); 
      c=(a>b)?a:b;
         System.out.println("greater number is: "+c);
    }
}