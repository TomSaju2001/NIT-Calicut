import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;


class Queue1{
    public static Queue<Integer> queue = new LinkedList<>();
    public void  enqueue(int element){
        queue.add(element);
    }

    public boolean dequeue(){
        try {
            if(!queue.isEmpty())
                System.out.println(queue.peek());
            queue.remove();
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("EmptyQueue");
            return false;
        }
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue1 queue = new Queue1();
        while (true){
            String[] strArray = input.nextLine().trim().split(" ");

            if (strArray[0].equalsIgnoreCase("E")){
                queue.enqueue(Integer.parseInt(strArray[1]));
                System.out.println("Success");
            }else{
                if (!queue.dequeue()) {
                    break;
                }
            }
        }
        input.close();
    }
}
