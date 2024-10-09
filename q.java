import java.util.Scanner;
import java.lang.Math;
 class q {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();
        
        double d = b * b - 4 * a * c;
        
        if (d > 0) {
            double r1 = (-b + Math.sqrt(d)) / (2 * a);
            double r2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("The roots are real and different:");
            System.out.println("Root 1: " + r1);
            System.out.println("Root 2: " + r2);
        } else if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("The roots are real and the same:");
            System.out.println("Root: " + r);
        } else {
            System.out.println("The roots are complex:");
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-d) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
        
        scanner.close();
        System.out.println("aksha s 1BM23CS019");
    }
}
