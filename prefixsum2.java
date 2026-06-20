public class prefixsum2 {
    //this code is regarding the prefix sum
    public static void arraysum(int nums[])
    {
        int n=nums.length;
        int p[]=new int[n];
        int i;
        int j;
        p[0]=nums[0];
        for(i=1;i<n;i++)
        {

            p[i]=nums[i]+p[i-1];
        }
        for(j=0;j<n;j++)
        {
            System.out.println(p[j]+" ");
        }
    }
    public static void main(String args[])
    {
        int nums[]={2,4,6,8,2};
        arraysum(nums);
    }
}
