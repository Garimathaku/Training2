import java.util.*;

public class CtF {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();
         double fahrenheit = (celsius * 9 / 5) + 32;
		 System.out.println("Temperature in Fahrenheit: " + fahrenheit);

         
         
    }
}