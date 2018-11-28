public class Armstrong
{
    public static void main(String[] args)
    {
        for(int i =1;i<=500;i++)
        {   int cube1 =i%10;
            int cube2 =i%100/10;
            int cube3 = i%1000/100;
            int total = (cube1*cube1*cube1)+(cube2*cube2*cube2)+(cube3*cube3*cube3);
                if (i==total) {

                    System.out.println(i);
                }

        }


    }
}
