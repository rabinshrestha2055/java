import java.util.Scanner;
class Salary
{
    public static void main(String args[])
    {
        int salary,bonus;
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter your salary");
        salary=scanner.nextInt();
        if(salary>=10000)
        {
            bonus=(salary*10)/100;
            salary=salary+bonus;
        
        }
       System.out.println("Your salary is"+salary);
    }
}