//Develop a program using if-else, switch, and loops 
import java.util.Scanner;

public class conditional_statement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Check Even or Odd ");
            System.out.println("2. Simple Calculator");
            System.out.println("3. Print Numbers 1 to N");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter a number: ");
                    int num = sc.nextInt();

                    if (num % 2 == 0) {
                        System.out.println("Number is Even");
                    } else {
                        System.out.println("Number is Odd");
                    }
                    break;

                case 2:
                    System.out.print("Enter two numbers: ");
                    int a = sc.nextInt();
                    int b = sc.nextInt();
                    System.out.print("Enter operator (+, -, *, /): ");
                    char op = sc.next().charAt(0);

                    switch (op) {
                        case '+':
                            System.out.println("Result = " + (a + b));
                            break;
                        case '-':
                            System.out.println("Result = " + (a - b));
                            break;
                        case '*':
                            System.out.println("Result = " + (a * b));
                            break;
                        case '/':
                            if (b != 0)
                                System.out.println("Result = " + (a / b));
                            else
                                System.out.println("Division by zero not allowed");
                            break;
                        default:
                            System.out.println("Invalid Operator");
                    }
                    break;

                case 3:
                    System.out.print("Enter value of N: ");
                    int n = sc.nextInt();

                    for (int i = 1; i <= n; i++) {
                        System.out.print(i + " ");
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
