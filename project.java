import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        project obj = new project();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter a num2: ");
        int num2 = sc.nextInt();
        System.out.print("Choose an operation(*,+,-,%,/) :  ");

        String input = sc.next();
        char ch = input.charAt(0);
        obj.chooseOperation(ch, num1, num2);
    }

    public void chooseOperation(char ch, int num1, int num2) {
        switch (ch) {
            case '*':
                System.out.println("multiplication");
                System.out.println("Result: " + (num1 * num2));
                break;

            case '+':
                System.out.println("Addition");
                System.out.println("Result: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Subtraction");
                System.out.println("Result: " + (num1 - num2));
                break;

            case '/':
                System.out.println("Division");
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break; 

            case '%':
                System.out.println("Modulus");
                System.out.println("Result: " + (num1 % num2));
                break;

            default:
                System.out.println("Unknown Operation");
        }
    }
}
