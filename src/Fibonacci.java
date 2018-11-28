import java.sql.SQLOutput;
import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args)
    {
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        int fib = sc.nextInt();
        int a=-1,b=1,c;

        for (int i = 0; i <= fib; i++)
        {
            c =a+b;
            a=b;
            b=c;

            System.out.print(c + "  ");




        }

    }
}
