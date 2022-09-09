import java.util.HashMap;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String string = input.nextLine();
        if(string.equals("[]")){
            System.out.println("The length of the original array is: 0");
            System.out.print("After removing duplicates, the new length of the array is: 0");
            return;
        }
        String[] arrString = string.replaceAll("[\\[\\]\\s+]", "").split(",");

        HashMap<Integer, Integer> count_map = new HashMap<>();
        int lengthOfNewArray=0;
        for(int i=0; i<arrString.length; i++){
            int temp = 0;
            if (count_map.get(Integer.parseInt(arrString[i])) != null) {
                temp = count_map.get(Integer.parseInt(arrString[i]));
            }
            if(temp<2) lengthOfNewArray++;
            count_map.put(Integer.parseInt(arrString[i]), temp + 1);
        }

        System.out.println("The length of the original array is: " + arrString.length);
        System.out.print("After removing duplicates, the new length of the array is: " + lengthOfNewArray);

        input.close();
    }
}

//Sample Input:
//  [1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 7]
//Sample Output:
//  The length of the original array is: 13
//  After removing duplicates, the new length of the array is: 10

