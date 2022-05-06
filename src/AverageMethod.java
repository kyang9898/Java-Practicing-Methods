import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double numOne = Double.valueOf(scanner.nextLine());
        
        System.out.println("Enter a second number: ");
        double numTwo = Double.valueOf(scanner.nextLine());  

        System.out.println("Enter a third number: ");
        double numThree = Double.valueOf(scanner.nextLine()); 
        
        System.out.println("The average is: " + average(numOne, numTwo, numThree));
    }
    public static  double sum(double numOne, double numTwo, double numThree){
        return numOne + numTwo + numThree;
    }
    public static double average(double numOne, double numTwo, double numThree) {
        return sum(numOne, numTwo, numThree)/3;
    }
}
