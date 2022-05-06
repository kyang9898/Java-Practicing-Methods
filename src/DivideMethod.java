import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int numOne = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number: ");
        int numTwo = Integer.valueOf(scanner.nextLine());

        divide(numOne, numTwo);
    }
    public static void divide(double numOne, double numTwo) {
        System.out.println((int)numOne + " / " + (int)numTwo + " = " + numOne/numTwo);
    }
}
