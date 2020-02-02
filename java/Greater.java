import java.util.Scanner;
class Greater
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a first number");
        a=scanner.nextInt();
         System.out.println("enter a second number");
        b=scanner.nextInt();
         System.out.println("enter a third number");
        c=scanner.nextInt();
        if(a>b)
        {
            if(a>c)
            {
               System.out.println("greater number is"+a)  ;
            }
            else
            {
                 System.out.println("greater number is"+c) ;
            }
         else{
               if(b>c)
               {
            System.out.println("greater number is"+b);
               }
                else{
             System.out.println("greater number is"+c); 
               }

         }    
        
     
    }
}