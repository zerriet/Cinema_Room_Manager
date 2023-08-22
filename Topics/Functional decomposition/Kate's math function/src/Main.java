import java.util.Scanner;

class MultipleFunction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));
    }

    public static double f(double x) {
        //call your implemented methods here.
        double output = 0;
        if (x <= 0) {
            output= f1(x);
        } else if (x > 0 && x < 1) {
            output = f2(x);
        } else if (x >= 1) {
            output = f3(x);

        }

        return output;
    }

    //implement your methods here
    public static double f1(double x) {
        double y = (x * x) + 1;
        return y;
    }

    public static double f2(double x) {
        double y = 1 / (x * x);
        return y;
    }

    public static double f3(double x) {
        double y = (x * x) - 1;
        return y;
    }
}