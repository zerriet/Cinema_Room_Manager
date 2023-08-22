import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String input = scanner.nextLine();
        double area = Double.MIN_VALUE;

        switch (input) {
            case "triangle":
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                double p = (side1 + side2 + side3)/2;
                area = Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
                break;
            case "rectangle":
                double recSide1 = scanner.nextDouble();
                double recSide2 = scanner.nextDouble();
                area = recSide1 * recSide2;
                break;
            case "circle":
                double radius = scanner.nextDouble();
                area = 3.14 * radius * radius;
                break;

        }

        System.out.println(area);
    }
}