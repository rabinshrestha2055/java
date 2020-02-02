import java.util.Scanner;
class FloatInput 
{
    public static void main(String args[])
    {
        double no;
        Scanner obj1= new Scanner(System.in);
        System.out.println("Enter a float number");
        no=obj1.nextFloat();
        System.out.println("Addition is" +(no+no));

    }
}
