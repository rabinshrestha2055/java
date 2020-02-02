import java.util.Scanner;
class Grade
{
    public static void main(String args[])
    {
        int marks;
        char grade;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your marks");
        marks=scanner.nextInt();
        if(marks>=85)
        {
         grade='A';
        }
        else if(marks>=75)
         {
            grade='B';
         }
        else if(marks>=65)
        {
            grade='c';
        }
        else
        {
            grade='D';
        }
        System.out.println("According to marks your grade is "+grade);
    }
}