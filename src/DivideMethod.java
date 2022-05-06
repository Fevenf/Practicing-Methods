import java.util.Scanner;
public class DivideMethod {
    
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number");
        int num2 = Integer.valueOf(scanner.nextLine());

        
        divide(num1,num2); 
    }
    public static void divide(int num1, int num2) {

   System.out.println( num1 + " / " + num2 + " = " + (num1 * 1.0 / num2));
   
  
}

}
