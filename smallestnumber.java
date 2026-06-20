public class smallestnumber {
    public static int smallest(int numbers[])
    //this code is regarding to find the smallest number
    {
      int smaller=Integer.MAX_VALUE;//this is bigger value infinity
      int i;
      for(i=0;i<numbers.length;i++)
      {
        if(smaller>numbers[i])
        {
            smaller=numbers[i];
        }

      }
      return smaller;
    }
    public static void main(String args[])
    {
      int numbers[]={2,4,6,1,5};
      int result=smallest(numbers);
      System.out.print("The smallest number is:"+result);
    }
}
