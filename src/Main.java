import com.naveed.mathops.recursive.Factorial;
import com.naveed.mathops.recursive.Power;

public class Main {
    public static void main(String[] args)  {
        System.out.println("Hello math-ops!");
        int num = 3;
        int pwr = 5;
        System.out.println("3 raise to 5 is: " + Power.raise(num, pwr));
        System.out.println("Factorial of 10: " + Factorial.factorial(10));
    }
}