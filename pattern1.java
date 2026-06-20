import java.util.Scanner;
public class pattern1 {
    public static void pattern(int n)
    {
        int i;
        int j;
        for(i=1;i<=n;i++)//this loop is for rows
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j+" ");//this loop is for the printing the numbers
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        pattern(n);//sunction call
    }
}
