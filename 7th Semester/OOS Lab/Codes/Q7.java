import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int a=0, b=1;
        for(int i=0; i<N; i++){
            System.out.print(a+ " ");

            int sum = a+b;
            a=b;
            b=sum;
        }
    }
}
