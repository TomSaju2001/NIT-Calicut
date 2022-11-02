import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] checkerBoard = new int[8][8];
        String[] str = input.nextLine().trim().split(" ");
        int initialRow=Integer.parseInt(str[0])-1;
        int initialColumn=Integer.parseInt(str[1])-1;
        checkerBoard[initialRow][initialColumn]=1;

        int N = Integer.parseInt(input.nextLine().trim());
        while (N>0){
            str = input.nextLine().trim().split(" ");
            try{
                if(str[0].equalsIgnoreCase("Up")){
                    initialRow-=Integer.parseInt(str[1]);
                }else if(str[0].equalsIgnoreCase("Down")){
                    initialRow+=Integer.parseInt(str[1]);
                }else if(str[0].equalsIgnoreCase("Right")){
                    initialColumn+=Integer.parseInt(str[1]);
                }else if(str[0].equalsIgnoreCase("Left")){
                    initialColumn-=Integer.parseInt(str[1]);
                }else{
                    System.out.println("Invalid Movement");
                    System.exit(0);
                }
                checkerBoard[initialRow-1][initialColumn-1]=1;
            }catch (Exception e){
                System.out.println("Overflow");
            }
            N--;
        }
        if(initialRow<8 && initialRow>0 && initialColumn<8 && initialColumn>0){
            System.out.println("["+(initialRow+1)+","+(initialColumn+1)+"]");
        }
        input.close();
    }
}


/*
Sample Input:
5 3
4
Up 2
Right 3
Down 5
Left 1
Output:
[8,5]

Sample Input:
3 1
1
Left 2
Output:
Overflow
 */