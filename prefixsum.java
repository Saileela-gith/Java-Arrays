public class prefixsum {
    //this code is regarding the perfix sum
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
    }
    public static void main(String args[])
    {
        int nums[]={10,4,9,7,5};
        sum(nums);
        int i;
    }
}
