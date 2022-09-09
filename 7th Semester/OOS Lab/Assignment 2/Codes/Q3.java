import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        string=string.trim();
        //check for empty string
        if(string.equals("")) return;
        else{
            String[] word=string.replaceAll("[\\s+]", "").split(" ", 2);
            HashSet<Character> s = new LinkedHashSet<>(word[0].length() - 1);
            for(int i=0; i<string.length(); i++)
                s.add(word[0].charAt(i));
            for (char x : s)
                System.out.print(x);
        }
        input.close();
    }
}

//Sample Input1: JAVA
//Sample Output1: JAV
//Sample Input2: PROGRAMMING
//Sample Output2: PROGAMIN

