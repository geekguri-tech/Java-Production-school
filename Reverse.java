import java.util.Scanner;

public class Reverse
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

        int ans[] = reversie.roof(arra);

        for(int k = 0; k < ans.length; k++)
        {
            System.out.print(ans[k] + " ");
        }
 
        reverseArray(arra);
        System.out.println(arra);
    }

    static void swapInArray(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[i] = temp;
    }

    static void reverseArray(int arr[])
    {
        int i = 0,j = arr.length - 1;

        while(i < j)
        {
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }
}

class reversie extends Reverse
{
    static int[] roof (int arr[])
    {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        
        for(int i = n-1; i >= 0; i--)
        {
            ans[j++] = arr[i];
        }
        return ans;
    }
}