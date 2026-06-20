public class pairarray {
    public static void pairs(int numbers[])
    {
        // this code is regarding to print the subarray
        int i;
        int j;
        int start;
        for(i=0;i<numbers.length;i++)
        {
            start=numbers[i];//current number
          for(j=i+1;j<numbers.length;j++)
          {
              System.out.print("("+start+","+numbers[j]+")");//next number
          }
          System.out.println();
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5};
        pairs(numbers);//calling a function
    }
}
