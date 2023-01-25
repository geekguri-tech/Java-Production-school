import java.util.*;

public class Rotatearray 
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

        System.out.println("Enter the number of steps you want to repeat");
        int k = sc.nextInt();

        int ans[] = rotate(arr, k);

        for(int j = 0; j < l; j++)
        {
            System.out.print(ans[j] + " ");
        }

        sc.close();
    }

    static int[] rotate(int[] arr, int k)
    {
        int n = arr.length;
        k = k%n;
        int ans[] = new int[n];
        int j = 0;
        
        for(int i = n-k; i < n; i++)
        {
            ans[j++] = arr[i];
        }

        for(int  i = 0; i < n-k; i++)
        {
            ans[j++] = arr[i];
        }
        return ans;

    }    
}
