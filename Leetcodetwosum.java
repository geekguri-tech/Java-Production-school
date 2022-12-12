public class Leetcodetwosum 
{
        public static void main(String srgs[])
        {
            int nums[] = {2,7,11,15};
            int target = 9;
            int n = nums.length;
            int a = 0;
            int b = 0;
            for(int i = 0; i < n ; i++)
            {
                for(int j = i + 1; j < n; j++ )
                {
                    if(nums[i] + nums[j] == target)
                    {
                        a = i;
                        b = j;
                    }
                }
            }
            System.out.println("Ans is [" + a + ", " + b + "]");
        }
}