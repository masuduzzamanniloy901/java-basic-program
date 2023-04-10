import java.util.Scanner;
public class book_exercise1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a value A: ");
        int a = input.nextInt();

        System.out.println("Enter a value B: ");
        int b = input.nextInt();

        int sum = a+b;
        int minus = a-b;
        int multiple = a*b;
        double divide = a/b;


        System.out.println("Sum: " +sum);

        System.out.println("Minus: " +minus);

        System.out.println("Multiple: " +multiple);

        System.out.println("Divide: " +divide);

    }
}
