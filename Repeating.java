import java.util.*;

public class Repeating 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want in Array");
        int h = sc.nextInt();

        int arra[] = new int[h];
        for (int i = 0; i < h; i++) 
        {
            arra[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Repeating integer of the Array is " + raw2.rem(arra));
    }    
}

class raw2 extends Repeating
{
    static int rem(int arr[])
    {
        int n = -1;

        for(int ii = 0; ii < arr.length; ii++)
        {
            for(int j = ii+1; j < arr.length; j++)
            {
                if(arr[ii] == arr[j])
                {
                    return arr[ii];
                }
            }
        }
        return n;
    }
}