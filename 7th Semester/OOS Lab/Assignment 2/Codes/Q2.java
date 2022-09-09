import java.util.Arrays;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        countWords(sentence);
        printASCII(sentence);

        input.close();
    }

    public static void countWords(String sentence){
        //Remove leading and trailing spaces.
        sentence = sentence.trim();
        int wordCount=0;
        if(sentence == null || sentence.isEmpty()){
            wordCount=0;
        }else{
            String[] words = sentence.split("\\s+");
            wordCount=words.length;
        }
        System.out.println("Words count is " + wordCount);
    }

    public static void printASCII(String sentence){
        for(int i=0; i<sentence.length(); i++){
            System.out.println("'" + sentence.charAt(i) + "'" + " " + Integer.valueOf(sentence.charAt(i)));
        }
    }
}
