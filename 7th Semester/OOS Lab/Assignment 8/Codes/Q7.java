import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
            int decimal = Integer.parseInt(input.nextLine().trim(), 16);
            System.out.println(decimal);
        }catch (Exception e){
            System.out.println("InvalidHexadecimal");
        }
        input.close();
    }
}


/*
Sample Input and Output :
Input:
DC24
Output:
56356

Input:
24G
Output:
InvalidHexadecimal
 */