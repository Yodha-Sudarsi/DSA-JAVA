// Java Program to Find the Largest Among Three Numbers
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();

        if(a>=b && a>=c){
            System.out.println(a + " is the largest number");
        }else if(b>=a && b>=c){
            System.out.println(b + " is the largest number");
        }else{
            System.out.println(c + " is the largest number");
        }
    }

}
