import java.util.Scanner;

class Node{
    char data;
    Node next;

    Node(char data){
        this.data=data;
    }
}

class ReverseMain{
    Node head;
    Node tail;

    public void insert(char data){
        Node node = new Node(data);
        if(head==null){
            head=node;
            tail=node;
            tail.next=null;
        }else{
            tail.next=node;
            tail=tail.next;
            tail.next=null;
        }
    }

    public Node reverseList(Node head){

        if(head==null) return head;
        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=null){
                next=next.next;
            }
        }

        return prev;
    }

    public void printList(Node head){
        Node temp=head;
        if(head==null) return;
        System.out.println("\nThe reversed list is: ");
        while(temp!=null){
            if(temp.next==null){
                System.out.println(temp.data);
            }else{
                System.out.print(temp.data + " -> ");
            }
            temp=temp.next;
        }
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ReverseMain list = new ReverseMain();

        System.out.print("Enter the number of nodes: ");
        int N = input.nextInt();

        for(int i=0; i<N; i++){
            System.out.print("Enter the data in Node " + (i+1) + " : ");
            list.insert(input.next().charAt(0));
        }

        list.printList(list.reverseList(list.head));
    }
}