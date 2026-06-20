public class binarysearch {
    public static int search(int numbers[],int key)
    {
        //this code is regarding binary search
        int start=0;
        int end=numbers.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;//finding mis value
            if(numbers[mid]==key)
            {
                return mid;//found
            }
            if(numbers[mid]<key)
            {
                start=mid+1;//rightt side 
            }
            else
            {
                end=mid-1;//left side
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6};
        int key=4;
        int result=search(numbers,key);
        if(result==-1)
        {
            System.out.println("Number cannot be found");
        }
        else
        {
            System.out.println("The number is found at index:"+result);
        }

    }
}
