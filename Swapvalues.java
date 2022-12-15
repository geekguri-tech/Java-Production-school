public class Swapvalues 
{
    public static void main(String args[])
    {
        int a = 9;
        int b = 3;
        System.out.println("Values before Swap: ");
        System.out.print(a + ", ");
        System.out.println(b);

        int temp = a; // Method using temporary variable
        a = b;
        b = temp;
        System.out.println("Values after Swap: ");
        System.out.print(a + ", ");
        System.out.println(b);

        int aa = 9; // Using sum and Difference method
        int bb = 3;
        aa = aa+bb; // a = 12
        bb = aa-bb; // b = 9
        aa = aa-bb; // a = 3
        System.out.println("Values after using Mathematical way of Swap: ");
        System.out.print(aa + ", ");
        System.out.println(bb);

    }    
}
