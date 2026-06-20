import java.util.Scanner;
public class pattern3 {
    public static void pattern(int n)
    {
        int i;
        int j;
        int x;
        for(i=1;i<=n;i++)//this loop is for rows
        {
            for(x=1;x<=n-i;x++)
            {
                System.out.print(" ");//this loop is printing spaces
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);//this loop is for the printing the numbers
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        pattern(n);//function call
    }
}
