public class bruteforce {
    //this code is regarding the brute force 
    public static void maxnumber(int n[])
    {
        int i;
        int j;
        int max=Integer.MIN_VALUE;
        for(i=0;i<n.length;i++)
        {
            int sum=0;
            for(j=i;j<n.length;j++)
            {
                sum=sum+n[j];
        if(max<sum)
        {
            max=sum;
        }    }
    }
            System.out.println("Maximum Subarray:"+max);

    }
    public static void main(String args[])
    {
        int n[]={1,2,4,6,8};
        maxnumber(n);

    }

}
