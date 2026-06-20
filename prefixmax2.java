public class prefixmax2 {
    //this code is regarding the prefixsum of the maximum
    public static void max(int n[])
    {
        int i;
        int s=n.length;
        int pmax[]=new int[s];
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
        pmax[0]=n[0];
        for(i=1;i<s;i++)
        {
            pmax[i]=Math.max(pmax[i-1],p[i]);
        }
        for(i=0;i<s;i++)
        {
            System.out.println("prefix sum max:"+pmax[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int n[]={5,2,3,10,1};
        max(n);
    }

}

