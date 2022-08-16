import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        if(number<0) number*=-1;
        int numRev=0, numCopy = number;

        while(number>0){
            numRev = numRev*10 + number%10;
            number/=10;
        }

        if(numRev==numCopy)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
