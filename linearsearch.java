import java.util.Scanner;
public class linearsearch {
    //this code is regarding the linear search
    public static int search(int numbers[],int key)
    {
        int i;
        for(i=0;i<numbers.length;i++)
        {
           if(numbers[i]==key)
           {
              return i;//returning index value
           }
        
        }
        return -1;//nill

    }
    public static void main(String args[])
    {
        int numbers[]={1,2,4,6,8,10,12};
        int key=8;
        int result=search(numbers,key);
        if(result==-1)
        {
            System.out.println("Number can't be found");
        }
        else
        {
            System.out.println("The number is found at index:"+result);
        }
    }
}
