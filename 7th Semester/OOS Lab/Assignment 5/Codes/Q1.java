import java.util.Scanner;

class BitWiseAnd{
    public int x;
    public int y;
    public int z;
    public int result;

    public BitWiseAnd(int x, int y){
        this.result = x&y;
    }

    public BitWiseAnd(int x, int y, int z){
        this.result = x&y&z;
    }

    public int getResult(){
        return this.result;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        String[] strArr = str.trim().split(" ");
        if(strArr.length==2){
            BitWiseAnd obj = new BitWiseAnd(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]));
            System.out.println(obj.getResult());
        }else if(strArr.length==3){
            BitWiseAnd obj = new BitWiseAnd(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            System.out.println(obj.getResult());
        }else{
            System.out.println("Enter either 2 or 3 Integers!");
        }
        input.close();
    }
}
