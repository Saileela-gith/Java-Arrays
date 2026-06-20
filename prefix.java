import java.util.Scanner;
public class prefix {
    //this code is regarding prefix sum
    public static void sum(int n[])
    {
        int s=n.length;
        int i;
        int p[]=new int[s];
        p[0]=n[0];
        for(i=1;i<s;i++)
        {
            p[i]=p[i-1]+n[i];

        }
        for(i=0;i<s;i++)
        {
            System.out.println(p[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int n[]={2,4,6,8,10};
        sum(n);
    }
}
