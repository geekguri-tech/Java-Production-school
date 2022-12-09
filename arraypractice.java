import java.util.*;

// It is a Linear search Program

public class arraypractice 
{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5,8,2,3,9,1,19,21,5};
        Scanner gg = new Scanner(System.in);
        System.out.println("Enter the number you want to find in array");
        int num = gg.nextInt();
        int ans = 0;
        
        for(int i = 0; i < arr.length; i++)
        {
            if(num==arr[i])
            {
                ans = i;
                break;
            }
        }
        System.out.println(ans);
        gg.close();
    }    
}
