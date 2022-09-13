import java.util.Arrays;
import java.util.Scanner;

class IntegerArray{
    int[] data = new int[5];

    boolean inputData(String inputStr){
        String[] inputStrArr = inputStr.split(" ");
        for(int i=0; i<data.length; i++){
            data[i]=Integer.parseInt(inputStrArr[i]);
        }

        if(Arrays.stream(data).distinct().count()!=data.length){
            System.out.println("INVALID INPUT");
            return false;
        }

        return true;
    }

    void bubSort(){
        for(int i=0; i<data.length; i++){
            for (int j=0; j<data.length-i-1; j++){
                if(data[j]>data[j+1]){
                    //swap
                    int temp = data[j];
                    data[j]=data[j+1];
                    data[j+1]=temp;
                }
            }
        }

        //print array
        System.out.println(Arrays.toString(data).replaceAll("[\\[\\]\\,]", "").trim());
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        IntegerArray obj = new IntegerArray();
        if(obj.inputData(inputStr.trim())){
            obj.bubSort();
        }
        input.close();
    }
}
