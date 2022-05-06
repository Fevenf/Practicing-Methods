import java.util.Scanner;
public class AverageMethod {

    public static void main(String[] args) throws Exception {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Enter the third number: ");
            double num3 = scanner.nextDouble();
            System.out.println("The average is:" + average(sum(num1, num2, num3)));
    
        }
        public static double sum (double num1, double num2, double num3) {
            return (num1 + num2 + num3);
        }
        public static double average(double sum) {
            return (sum/3);
    
        }
    }
    