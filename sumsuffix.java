public class sumsuffix {
    //this code is regarding the addition of the suffix sum
    public static void max(int n[])
        {
            int i;
            int l=n.length;
            int s[]=new int[l];
            s[l-1]=n[l-1];
            for(i=l-2;i>=0;i--)
            {
                s[i]=s[i+1]+n[i];
            }
            for(i=0;i<l;i++)
            {
                System.out.println("Suffix sum is:"+s[i]);
            }
        }
    public static void main(String args[])
    {
        int n[]={10,4,7,40};
        max(n);
    }
}
