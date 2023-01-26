import java.util.*;

public class Rotatewithoutextras 
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

        RotateInPlace(arr , k);

        for(int m = 0; m < arr.length; m++)
        {
            System.out.print(arr[m] + " ");
        }
        sc.close();
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }

    static void reverse(int[] arr, int i, int j)
    {
        while(i < j)
        {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static void RotateInPlace(int[] arr, int k)
    {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
}
