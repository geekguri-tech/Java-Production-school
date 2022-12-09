import java.util.*;

class Root
{
    public static void main (String args[])
    {
        Scanner gg =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = gg.nextInt();

        if(num % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }

        System.out.println("Enter the Age");
        int rage = gg.nextInt();
        if (rage <= 12)
        {
            if(rage <=5)
            {
                System.out.println("Toodler");
            }
            else
            {
                System.out.println("Child");
            }
        }
        else if (rage > 12 && rage < 20)
        {
            System.out.println("Teenager");
        }
        else 
        {
            System.out.println("Adult");
        }

        String ans;
        ans = (num % 2 == 0) ? "even" : "odd";
        System.out.println(ans);
        gg.close();
    }
}