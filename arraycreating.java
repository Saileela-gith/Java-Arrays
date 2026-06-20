import java.util.Scanner;
public class arraycreating {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        //creating array
        int age[]={22,25,18};
        //input from the user
        int marks[]=new int[5];
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        marks[4]=sc.nextInt();
        //printing the output
        System.out.println("Maths:"+marks[0]);
        System.out.println("Science:"+marks[1]);
        System.out.println("Physics:"+marks[2]);
        System.out.println("English:"+marks[3]);
        System.out.println("Social:"+marks[4]);

    }
}
