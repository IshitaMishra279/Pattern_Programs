import java.util.Scanner; 

public class Pattern_7_Star 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 0;
        while (i<n)
        {
            int j = 1;
            while(j<=n)
            {
                if (j<=i)
                {
                    System.out.print(" ");
                }
                else
                {   
                    System.out.print("*");
                }
                j=j+1;
            }
            System.out.println();
            i=i+1;
        } 
    }
    
}
