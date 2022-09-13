import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count=0;

        String inputString = input.nextLine();
        inputString=inputString.trim();
        if(inputString.equals("")) return;
        String[] inputStrArr = inputString.split(" ");


        for(int i=0; i<inputStrArr.length; i++){
            for(int j=i+1; j<inputStrArr.length; j++){
                for(String ch: inputStrArr){
                    if(Integer.parseInt(ch)==(Integer.parseInt(inputStrArr[i])+Integer.parseInt(inputStrArr[j]))){
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
        input.close();
    }
}
