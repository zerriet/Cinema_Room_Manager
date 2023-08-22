import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        // write your code here
        long totalFactorial = 1;

        if (n == 0){
            totalFactorial = 1;
        } else {

            for (long i = n; i >= 1; i--) {
                totalFactorial *= i;
            }
        }
        return  totalFactorial;

    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}