import java.util.Scanner;

public class Pattern_3_Star 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = 2*n;
        int i = 0;
        while (i<=n)
        {
            int j = 0;
            while (j<=m)
            {
                if (j>=n-i && j<=n+i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }
    }
}
