import java.util.Scanner;

public class Divisable
{
    public static void main(String[] args)
    {
        System.out.println("enter the Limit : ");
        Scanner sc = new Scanner(System.in);
        int limit = sc.nextInt();

        for (int i=1;i<=1;i++)
        {
             for (int j=1;j<=limit;j++)
             {
                 if (j % 3 == 0)
                 {
                     System.out.print(" "+ j);
                 }

                 System.out.println();
                    for (int m =1;m<=limit;m++)

                     if (m%5==0)
                     {
                         System.out.println("Divisible by 5");
                         System.out.print(" " + m);

                     }
             }
        }


    }

}

