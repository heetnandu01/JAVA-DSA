import java.util.Scanner;

public class primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if(num % 2 != 0){
            System.out.println("NUmber is prime");
        }else{
            System.out.println("Number is not prime");
        }
    }
}
