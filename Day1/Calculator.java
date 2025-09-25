
import java.util.Scanner;

class Calculator{
    public  static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public  static double div(double a, double b) {
        if (b == 0) {
            System.out.println("Divided by zero throws null pointer exception");
            return 0;
        }
        return a / b;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter choice 1 for addition");
            System.out.println("Enter choice 2 for Subtraction");
            System.out.println("Enter choice 3 for multiplication");
            System.out.println("Enter choice 4 for division");
            System.out.println("Enter option 5 for exit");
            System.out.println("Enter the Choice:");
            int choice = s.nextInt();
             if (choice == 5) {
            System.out.println("Exiting Calculator GoodBye");
            break;
        }
            System.out.println("Enter first Number");
            double a = s.nextDouble();
            System.out.println("Enter second Number");
            double b = s.nextDouble();
            double result = 0;
            switch (choice) {
            case 1:
                result = add(a, b);
                break;
            case 2:
                result = sub(a, b);
                break;
            case 3:
                result = mul(a, b);
                break;
                
            case 4:
                result = div(a, b);
                break;
            default:
                System.out.println("Throw invalid data");
                continue;

        }
        System.out.println("Output:"+result);
        
        
       }s.close();
    }
}