import java.util.Scanner;

public class Pattern_1_Star
{   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int row = scan.nextInt();
        int i = 1;
        //int j = 1;

        while (i<=row)
        {
            int j = 1;
            while (j<=i)
            {
                System.out.print("*");
                j=j+1;
            }
            i=i+1;
            System.out.println();

        }

    }

}
