import java.util.Scanner;
public class largestnumber {
    //this code is regarding to find the largest number in the array
    public static int largest(int numbers[])
    {
       int i;
       int larger=Integer.MIN_VALUE;//this is smallest value 
       for(i=0;i<numbers.length;i++)
       {
         if(larger<numbers[i])
         {
            larger=numbers[i];
         }
       }
       return larger;
       }

    public static void main(String args[])
    {
       int numbers[]={1,2,8,5,6};
       int result=largest(numbers);
       System.out.print("The larger number is:"+result);
    }
}

