import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        a = input.nextInt();

        System.out.print("b = ");
        b = input.nextInt();

        //swap
        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
