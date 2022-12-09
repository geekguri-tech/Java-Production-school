import java.util.*;

public class Stats {
    public static void main(String args[])
    {
        Scanner bla = new Scanner (System.in);
        int gra = bla.nextInt();
        
        switch (gra)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Monday");
                break;
            case 4:
                System.out.println("Monday");
                break;
            case 5:
                System.out.println("Monday");
                break;
            case 6:
                System.out.println("Monday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day number");
        }
        bla.close();
    }
}
