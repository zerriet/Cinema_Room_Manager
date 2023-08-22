import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int numElements = scanner.nextInt();
        int[] array = new int[numElements];
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < numElements; i++){
            array[i] = scanner.nextInt();
        }

        int numElementsProductArray = numElements - 1;

        int[] productArray = new int[numElementsProductArray];

        for (int j = 0; j < numElementsProductArray; j++) {
            productArray[j] = array[j] * array[j+1];

            if (maxVal < productArray[j]) {

                maxVal = productArray[j];
            }
        }

        System.out.println(maxVal);


    }
}