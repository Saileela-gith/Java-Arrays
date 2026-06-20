public class maxsum2 {
    //this code is regarding the maximum of array
    public static void arraysum(int nums[])
    {
        int n=nums.length;
        int k;
        int pmax[]=new int[n];
        pmax[0]=nums[0];
        for(k=1;k<n;k++)
        {
            pmax[k]=Math.max(pmax[k-1],nums[k]);//calculating the maximum of prefix sum
        }
        for(k=0;k<n;k++)
        {
            System.out.println(pmax[k]+" ");//printing prefix sum
        }
    }
    public static void main(String args[])
    {
        int nums[]={2,4,6,82,2};
        arraysum(nums);
    }
}

