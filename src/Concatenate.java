import java.util.Scanner;

public class Concatenate
{
    public static void main(String[] args)
    {
        System.out.println("enter name : ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        System.out.println("enter Surname : ");
        String surname = sc.next();
        System.out.println(name +" "+ surname);




    }

}
