public class reversearray {
    public static void reverse(int numbers[])
    {
        //this code is regarding to reverse the array
        int first=0;
        int last=numbers.length-1;
        while(first<=last)
        {
            int temp=numbers[first];//swapping the array
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5};
        reverse(numbers);
        int i;
        for(i=0;i<numbers.length;i++)//for the printing the changed array using the for loop
        {
           System.out.print(numbers[i]+" ");
        }
    }
}
