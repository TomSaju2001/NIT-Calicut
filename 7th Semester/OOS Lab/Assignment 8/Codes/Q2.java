import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void printLine(String fileName){
        File file = new File(fileName);
        Scanner input;
        try{
            input = new Scanner(file);
        }catch (FileNotFoundException e){
            System.out.println(e);
            return;
        }

        while (input.hasNextLine()){
            String string = input.nextLine();
            try{
                long l = Long.parseLong(string);
                System.out.println(l);
            }catch (NumberFormatException e){
                System.out.println("OtherCharactersFound");
            }
        }
        input.close();
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String fileName = input.nextLine().trim();
        printLine("C:\\Users\\tomsa\\OneDrive\\Desktop\\7th Semester\\OOS Lab\\Assignment 8\\src\\"+fileName);
        input.close();
    }
}
