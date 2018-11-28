import java.util.Scanner;

public class SumAverage
{

    public static void main(String[] args)
    {
        System.out.println("enter first number ");
        Scanner sc=new Scanner(System.in);
        int value1 = sc.nextInt();

        System.out.println("enter Second number ");
        int value2 = sc.nextInt();
        System.out.println("enter third number ");
        int value3 = sc.nextInt();
        System.out.println("enter fourth number ");
        int value4 = sc.nextInt();
        System.out.println("enter fifth number ");
        int value5 = sc.nextInt();
        int total = value1+value2+value3+value4+value5;

        System.out.println("Sum is " + total);
        System.out.println("Average is " + total/5);
    }
}
