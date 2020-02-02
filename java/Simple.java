import java.util.Scanner;
class Simple
{
    public static void main(String arg[])
    {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        num=scanner.nextInt();
        num=num*20+num;
        System.out.println("multiple= "+num);
    }
}