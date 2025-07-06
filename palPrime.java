import java.util.*;

public class palPrime
{
    public static boolean isPrime(int x)
    {
        int c = 0;
        for (int i = 1; i <= x; i++)
        {
            if (x % i == 0)
                c = c + 1; // increments by 1
        }
        if (c == 2) // condition for being prime
            return true;
        else
            return false;
    }

    public static int reverse(int x)
    {
        int r = 0, cp;
        cp = x;
        while (cp != 0)
        {
            r = (r * 10) + (cp % 10);
            cp = cp / 10;
        }
        return r;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        if (isPrime(a) && reverse(a) == a)
            System.out.println("The number is Palprime");
        else
            System.out.println("The number is not Palprime");
    }
}