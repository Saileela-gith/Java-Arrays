public class maxprefixsum {
    public static void sum(int nums[])
    {
        int i;
        int n=nums.length;
        int p[]=new int[n];
        p[0]=nums[0];
        for(i=1;i<n;i++)
        {
           p[i]=p[i-1]+nums[i];
        }
        for(i=0;i<nums.length;i++)
        {
            System.out.print(p[i]+" ");
        }
        int pmax[]=new int[n];
        pmax[0]=p[0];
        int k;
        for(k=1;k<nums.length;k++)
        {
            pmax[k]=Math.max(pmax[k-1],p[k]);
        }
        for(i=0;i<n;i++)
        {
            System.out.print(pmax[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int nums[]={10,4,12,9,7,5};
        sum(nums);
        int i;
    }
}
