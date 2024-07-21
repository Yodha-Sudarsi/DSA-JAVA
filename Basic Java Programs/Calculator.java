import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true) {
            System.out.println();
            System.out.print("Enter Num1 and Num 2: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            System.out.print("Enter operator: ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                switch (op) {
                    case '+' -> System.out.print(num1 + num2);
                    case '-' -> System.out.print(num1 - num2);
                    case '*' -> System.out.print(num1 * num2);
                    case '/' -> System.out.print(num1 / num2);
                    case '%' -> System.out.print(num1 % num2);
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Enter a valid operator!");
            }
        }
    }
}
