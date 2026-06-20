public class suffixsummax {
    //this code is regarding the maximum of suffix sum array
    public static void max(int n[])
        {
            int i;
            int l=n.length;
            int s[]=new int[l];
            int smax[]=new int[l];
            s[l-1]=n[l-1];
            for(i=l-2;i>=0;i--)
            {
                s[i]=s[i+1]+n[i];
            }
            for(i=0;i<l;i++)
            {
                System.out.println("Suffix sum is:"+s[i]);
            }
            smax[l-1]=s[l-1];
            for(i=l-2;i>=0;i--)
            {
               smax[i]=Math.max(smax[i+1],s[i]);
            }
            for(i=0;i<l;i++)
            {
                System.out.println("Suffix sum maximum:"+smax[i]);
            }
            
        }
    public static void main(String args[])
    {
        int n[]={10,4,7,40};
        max(n);
    }
}

