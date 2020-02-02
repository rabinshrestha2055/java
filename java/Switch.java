import java.util.Scanner;
class Roll
{
    public static void main(String args[])
    {
        int roll;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your roll number");
        roll=scanner.nextInt();
        switch(roll)
        {
            case 101:
             System.out.println("Student name: Ashish");
             break;
            case 102:
             System.out.println("Student name: Manish");
             break;
            case 103:
             System.out.println("Student name: Nishan");
             break;
            default:
            System.out.println("Not Found!!");
             break;
        }
    }
}