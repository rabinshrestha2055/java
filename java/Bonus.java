import java.util.Scanner;
class Bonus
{
    public static void main(String args[])
    {
        int salary1,a,b;
        Scanner scanner=new Scanner(System.in);
         System.out.println("enter your salary");
        salary1=scanner.nextInt();
       
        if(salary1>=10000)
        {
            a=(salary1*10)/100;
            salary1=salary1+a;
        }
        else{
              b=(salary1*5)/100;
            salary1=salary1+b;
        }
System.out.println("Your salary is"+salary1);
    }
}