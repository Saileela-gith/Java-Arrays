public class maxsubarray {
   public static void subarray(int numbers[])
   {
    //this code is regarding finding the maximum sum of the subarray this is called brute force
    int i;
    int j;
    int k;
    int start;
    int end;
    int sum=0;
    int max=Integer.MIN_VALUE;
    for(i=0;i<numbers.length;i++)
    {
        start=i;
        for(j=i;j<numbers.length;j++)
        {
            sum=0;
            end=j;
            for(k=start;k<=end;k++)
            {
                sum=sum+numbers[k];
            
            }
            System.out.println("The sum is:"+sum);
            if(max<sum)
            {
              max=sum;//checking the condition
            }
        }
        
    }
    System.out.println("The maximum sum is:"+max);
   } 
   public static void main(String args[])
   {
    int numbers[]={2,4,6,8,10};
    subarray(numbers);
   }
}
