import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine().trim();

        String[] strArray = new String[2];
        strArray[0] = string.substring(0,8);
        strArray[1] = string.substring(8);

        int i=0, x=Integer.parseInt(strArray[0], 2);
        StringBuilder output= new StringBuilder();
        do {
            String y;
            try {
                y = strArray[1].substring(i, i + 8);
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Incorrect Input");
                return;
            }

            int z = Integer.parseInt(y, 2);
            output.append((char) (x ^ z));
            i += 8;
        } while (i != strArray[1].length());
        System.out.println(output);
        input.close();
    }
}
