import java.util.Scanner;

public class Q1 {
    public static void display(char a, int n){
        for(int i=1; i<=n; i++){
            for (int j=0; j<i; j++){
                System.out.print(a + " ");
            }
            System.out.println();
        }
    }

    public static void display(int n){
        int sum=0;
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        System.out.println(sum);
    }

    public static void display(int a, int b){
        System.out.println(a*a + b*b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strInput = input.nextLine().trim();
        String[] strInputArr = strInput.trim().split(" ");
        if(strInputArr.length==1) display(Integer.parseInt(strInputArr[0]));
        else if(Character.isDigit(strInputArr[0].charAt(0))) display(Integer.parseInt(strInputArr[0]), Integer.parseInt(strInputArr[1]));
        else display(strInputArr[0].charAt(0), Integer.parseInt(strInputArr[1]));
        input.close();
    }
}
