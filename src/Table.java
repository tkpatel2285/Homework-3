import java.util.Scanner;

public class Table {

    public static void main(String[] args)
    {

        System.out.println("Enter Positive Number :");
        Scanner sc = new Scanner(System.in);
        int tab = sc.nextInt();

        for(int i = 1;i <=10;i++){


                System.out.println(tab + "x" + i+"="+ (tab*i));
            }
        }
    }

