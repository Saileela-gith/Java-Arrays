import java.util.Scanner;
public class pattern4 {
    public static void pattern(int n)
    {
       int i;
       int j;
       int x;
       for(i=1;i<=n;i++)
       {
        for(j=1;j<=n-i;j++)
        {
            System.out.print(" ");
        }
        for(x=i;x>=1;x--)
        {
            System.out.print(x);
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
