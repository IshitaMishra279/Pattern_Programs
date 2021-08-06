import java.util.Scanner;

public class Pattern_2_Star 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int  i = 1;
        while (i<=n)
        {
            int j = 1;
            while (j<=n)
            {
                if(j<=n-i)
                {
                    System.out.print(" ");
                }
                else
                {   
                    System.out.print("*");
                }
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }

    }    
}
