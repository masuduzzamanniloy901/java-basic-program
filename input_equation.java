import java.util.Scanner;
public class input_equation {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter X value: ");
        double x= input.nextDouble();

        System.out.println("Enter value of A: ");
        int a = input.nextInt();

        System.out.println("Enter value of B: ");
        int b = input.nextInt();

        System.out.println("Enter value of C: ");
        int c = input.nextInt();

        double y = a*x*x+b*x+c;

        System.out.println("Result: " +y);

    }
}
