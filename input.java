
import java.util.Scanner;

public class input {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("enter a number: ");

        int a = input.nextInt();

        System.out.println("enter another number: ");
        int b = input.nextInt();
        int sum =a + b;

        System.out.println("sum: " +sum);

    }

}
