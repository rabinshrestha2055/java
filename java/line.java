import java.util.Scanner;
class Input 
{
    public static void main(String args[])
    {
    
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter a text");
        String text=obj.nextLine();
        System.out.println("Hi"+text);

    }
}