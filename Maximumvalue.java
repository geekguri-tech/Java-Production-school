public class Maximumvalue 
{
 public static void main(String args[])
 {
    int arr[] = {6,8,9,11,89,100,56,34,7,90,00,65,12};
    int ans = 0;

    for(int i = 0; i < arr.length; i++ )
    {
        if(arr[i] > ans)
        {
            ans = arr[i];
        }
    }
    System.out.println(ans);
 }   
}
