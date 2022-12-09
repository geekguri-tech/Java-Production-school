import java.util.*;

public class numberofpairs 
{
    public static void main(String args[])
    {
        int arr[] = {5,1,2,3,6,7,8,8,9,4,1};
        Scanner gg = new Scanner(System.in);
        System.out.println("Enter the Target");
        int t = gg.nextInt();
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if(arr[i] + arr[j] == t)
                {
                    ans++;
                }
            }
        }
        System.out.println(ans);
        gg.close();
    }    
}
