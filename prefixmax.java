public class prefixmax {
    //this code is regarding the prefix array of the maximum sum
    public static void max(int n[])
    {
        int i;
        int s=n.length;
        int pmax[]=new int[s];
        pmax[0]=n[0];
        for(i=1;i<s;i++)
        {
            pmax[i]=Math.max(pmax[i-1],n[i]);
        }
        for(i=0;i<s;i++)
        {
            System.out.println(pmax[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int n[]={5,2,3,10,1};
        max(n);
    }

}
