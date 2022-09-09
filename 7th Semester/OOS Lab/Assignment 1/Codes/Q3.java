import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        //check for negative number
        if(number<0) number*=-1;

        if(number==0){
            System.out.println(1);
            return;
        }
        double numberOfDigits = Math.log10(number)+1;
        System.out.println((int) numberOfDigits);
    }
}
