import java.util.*;

public class Maximumvalue 
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
    
        System.out.println("Maximum Element of the Array is " + liquid(arra));
        System.out.println("Minimum Element in the array is " + minimumvalue.liquid2(arra));
        System.out.println("Second Maximum value is " + secondmaximum.liquid3(arra));
    }

    static int liquid (int arr[]) 
    {
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > ans) 
            {
                ans = arr[i];
            }
        }
        return ans;
    }
}

class minimumvalue extends Maximumvalue
{
    static int liquid2(int arr2[])
    {
        int ans2 = arr2[0];
        for (int ii = 0; ii < arr2.length; ii++)
        {
            if (arr2[ii] < ans2) 
            {
                ans2 = arr2[ii];
            }
        }
        return ans2;
    }
}

class secondmaximum extends Maximumvalue
{
    static int liquid3(int arr3[])
    {
        int mx = liquid(arr3);
        int n = arr3.length;

        for(int iii = 0; iii < n; iii++)
        {
            if(arr3[iii] == mx)
            {
                arr3[iii] = Integer.MIN_VALUE;
            }
        }
        int ans4 = liquid(arr3);
        return ans4;
    }
}