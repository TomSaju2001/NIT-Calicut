import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine().trim());
        int[] array = new int[n];
        String[] str = input.nextLine().trim().split(" ");

        for(int i=0; i<n; i++){
            array[i]=Integer.parseInt(str[i]);
        }

        str = input.nextLine().trim().split(" ");
        int sum=0;

        try {
            for (String s : str) {
                sum += array[Integer.parseInt(s)];
            }
            System.out.println(sum);
        }catch (Exception e){
            System.out.println("ArrayIndexOutOfBoundsException. Enter valid index.");
        }
        input.close();
    }
}
