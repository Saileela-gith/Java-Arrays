public class arrayarguments {
    public static void number(int marks[])
    {
        int i;
        //this for loop is for accessing each number in the array
        for(i=0;i<marks.length;i++)
        {
            marks[i]=marks[i]+1;//updating the array
        }
    }
    public static void main(String args[])
    {
        //the array is call by reference
        int marks[]={25,28,27};
        int i;
        number(marks);
        // this for loop is for printing upadated number
        for(i=0;i<marks.length;i++)
        {
          System.out.println(marks[i]);
        }

    }
}
