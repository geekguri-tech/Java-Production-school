import java.util.Scanner;

public class Factorial {
    public static void main ( String args[])
    {
        Scanner gg = new Scanner(System.in);
        int n = gg.nextInt();
        int fact = 1;
        
        for(int i = 1; i <= n; i++)
        {
            System.out.println("Factorial of " + i + " is " + fact*i);
        }
        gg.close();
    }
}
