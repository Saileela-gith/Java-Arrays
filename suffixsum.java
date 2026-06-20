public class suffixsum {
    //this code is regarding the suffix of the array
    public static void suffix(int nums[])
    {
        int i;
        int n=nums.length;
        int s[]=new int[n];
        s[n-1]=nums[n-1];
        for(i=n-2;i>=0;i--)
        {
            s[i]=nums[i]+s[i+1];//calculating the suffix array
        }
        for(i=0;i<n;i++)
        {
            System.out.println(s[i]+" ");
        }
    }
    public static void main(String args[])
    {
        int nums[]={2,4,6,8};
        suffix(nums);
    }
}
