import java.util.Scanner;
//square pattern
public class pattern6 {
    public static void pattern(int n)
    {
        int i;
        int j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                    System.out.print("*"+" ");
            }
            System.out.println();
        }


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        pattern(n);
    }
}
