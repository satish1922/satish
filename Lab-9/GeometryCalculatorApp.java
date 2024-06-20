package satish;
import java.util.Scanner;

public class GeometryCalculatorApp {
    double rect(double l, double w) {
        return l * w;
    }
    double circle(double r) {
        return Math.PI * r * r;
    }
    double box(double l, double w, double h) {
        return l * w * h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        GeometryCalculatorApp calc = new GeometryCalculatorApp();
        do {
            System.out.println("Geometry Calculator\n");
            System.out.println("1. Calculate area of a rectangle");
            System.out.println("2. Calculate area of a circle");
            System.out.println("3. Calculate volume of a box");
            System.out.println("4. Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.next().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Enter length of rectangle: ");
                    double l = sc.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double w = sc.nextDouble();
                    double areaRect = calc.rect(l, w);
                    System.out.println("Area of rectangle: " + areaRect);
                    break;
                case '2':
                    System.out.print("Enter radius of circle: ");
                    double r = sc.nextDouble();
                    double areaCircle = calc.circle(r);
                    System.out.println("Area of circle: " + areaCircle);
                    break;
                case '3':
                    System.out.print("Enter length of box: ");
                    double len = sc.nextDouble();
                    System.out.print("Enter width of box: ");
                    double wid = sc.nextDouble();
                    System.out.print("Enter height of box: ");
                    double h = sc.nextDouble();
                    double volumeBox = calc.box(len, wid, h);
                    System.out.println("Volume of box: " + volumeBox);
                    break;
                case '4':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        } while (choice != '4');
    }
}
