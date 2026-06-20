public class subarrays {
    //this code is regarding the subarrays
    public static void subarray(int numbers[])
    {
        int start;
        int end;
        int i;
        int j;
        int k;
        for(i=0;i<numbers.length;i++)
        {
            start=i;
            //nested loops
            for(j=i;j<numbers.length;j++)
            {
                end =j;
                for(k=start;k<=end;k++)
                {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5};
        subarray(numbers);
    }
}
