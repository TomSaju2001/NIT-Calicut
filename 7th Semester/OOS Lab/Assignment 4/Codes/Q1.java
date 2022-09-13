import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String word = input.next();
        //Replacing all vowels
        word=word.toLowerCase().replaceAll("[aeiou]","");
        if(word.length()==0) return;
        char[] charArr = word.toCharArray();
        Arrays.sort(charArr);
        System.out.println(new String(charArr));
        input.close();
    }
}
