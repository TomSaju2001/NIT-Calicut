import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        string=string.trim();
        if(string==""){
            System.out.println(0);
            return;
        }
        System.out.println((findLongestPalindromicSubstring(string)).length());
        input.close();
    }

    private static String findLongestPalindromicSubstring(String string){
        int length = string.length();

        boolean dp[][] = new boolean[length+1][length];


        for(int i=0;i<length;i++){
            dp[1][i] = true;
            dp[0][i] = true;
        }

        int left = 0, right = 0;

        for(int len=2;len<=length;len++){
            for(int i=0;i<(length-len+1);i++){
                dp[len][i] = (string.charAt(i) == string.charAt(i+len-1)) && dp[len-2][i+1];
                if(dp[len][i]){
                    left = i;
                    right = i+len-1;
                }
            }
        }

        return string.substring(left, right+1);
    }
}
