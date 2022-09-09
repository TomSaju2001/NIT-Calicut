import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int number, exponent;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the number: ");
        number = input.nextInt();

        System.out.print("Enter the exponent: ");
        exponent = input.nextInt();

        int result = 1;
        while(exponent!=0){
            result=result*number;
            exponent--;
        }
        //System.out.println(Math.pow(number, exponent));
        System.out.println(result);
    }
}
