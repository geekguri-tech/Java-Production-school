import java.util.*;

public class uniqueelement 
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

        System.out.println("Unique Element of the Array is " + unique.funcka(arra));
    }    
}

class unique extends uniqueelement
{
    static int funcka(int arr5[])
    {
        int ans = -1;

        for(int ii = 0; ii < arr5.length; ii++)
        {
            for(int j = ii+1; j < arr5.length; j++)
            {
                if(arr5[ii] == arr5[j])
                {
                    arr5[ii] = -1;
                    arr5[j] = -1;
                }

            }
        }
        
        for(int t = 0; t < arr5.length; t++)
        {
            if(arr5[t] > 0)
            {
                ans = arr5[t];
            }
        }

        return ans;
    }
}