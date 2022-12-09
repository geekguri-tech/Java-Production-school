import java.util.*;

public class tableoftwo 
{

public static void main (String args[])
{
    Scanner gg = new Scanner(System.in);
    System.out.print("Enter the number of which you want to get Table of:- ");
    int n = gg.nextInt();
    for(int t = 1; t <= 10; t++)
    {
        System.out.println(n + " * "+ t + " = " +(n*t));
    }
    Showoff obj2 = new Showoff();
    obj2.multiple();
    gg.close();

}
}
class Showoff
{
    void multiple()
    {
        Scanner fc = new Scanner(System.in);
        System.out.print("Enter the number of which you want to get cube of: ");
        int a = fc.nextInt();
        int ans = a*a*a;
        System.out.println(ans);
        fc.close();
    }
}