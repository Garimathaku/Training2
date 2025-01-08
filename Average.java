import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       System.out.print("Enter the first number: ");
        double n1 = sc.nextDouble();
         System.out.print("Enter the second number: ");
        double n2 = sc.nextDouble();
      System.out.print("Enter the third number: ");
        double n3 = sc.nextDouble();
         double average = (n1 + n2 + n3) / 3;

  System.out.println("The average of the three numbers is: " + average);

        
    }
}
