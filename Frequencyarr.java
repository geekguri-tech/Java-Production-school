import java.util.*;

public class Frequencyarr 
{
    public static void main(String args[])
    {
        System.out.println("Enter the number of Elements you want in the array: ");
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int arr[] = new int[l];

        System.out.println("Enter the elements of the Array: ");
        
        for(int i = 0; i < l; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The Original Array is: ");

        for(int j = 0; j < l; j++)
        {
            System.out.print(arr[j] + " ");
        }
        System.out.println();

        int[] freq = Frequencyarray(arr);

        System.out.println("Enter number of queries: ");
        int q = sc.nextInt();

        while(q > 0)
        {
            System.out.println("Enter number to be searched");
            int x = sc.nextInt();
            if(freq[x] > 0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            q--;
        }
        sc.close();

    }

    static int[] Frequencyarray(int[] arr)
    {
        int[] freq = new int[100005];

        for(int i = 0; i < arr.length; i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }
}
