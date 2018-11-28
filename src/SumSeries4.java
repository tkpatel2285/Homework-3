import java.util.Scanner;

public class SumSeries4
{


    public static void main(String[] args)
    {
        System.out.println("Enter Number :");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        float temp=0;
        for(float i = 1;i<=n;i++) {

           temp= temp+1/i;




            System.out.print("  "+ temp);
        }








        }



    }



