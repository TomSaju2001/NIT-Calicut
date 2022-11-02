import java.util.ArrayList;
import java.util.Scanner;

interface Borrowable{
    void checkIn();
    void checkOut(String name);

}

abstract class Book implements Borrowable{
    int bookID;
    String title;
    String author;
    int type;
    public int status;
    public String borrowedUser;

    @Override
    public abstract void checkIn();

    @Override
    public abstract void checkOut(String name);

}

class TextBooks extends Book{
    public TextBooks(int bookID,String title,String author){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        type=1;
        status=1;//Default value is Available
    }

    public void checkIn(){
        status=1;
    }

    public void checkOut(String name){
        borrowedUser=name;
        status=0;
    }
}

class ReferenceBooks extends Book{
    public ReferenceBooks(int bookID,String title,String author){
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        type=0;
    }

    public void checkIn(){
        System.out.println("Invalid");
    }

    public void checkOut(String name){
        System.out.println("Cannot be borrowed");
    }
}

public class Q6{
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        System.out.print("1. Add Reference Book\n" +
                "2. Add Text Book\n" +
                "3. Check-Out\n" +
                "4. Check-In\n" +
                "5. List Books\n" +
                "6. Exit" +
                "\n\nEnter your choice: ");
        int n=input.nextInt();
        ArrayList<Book> list=new ArrayList<>();
        while(n!=6){
            switch(n){
                case 1:{
                    System.out.println("Enter ID, Title and Author (Line by line)");
                    int bookID=input.nextInt();
                    input.nextLine();
                    String title=input.nextLine();
                    String author=input.nextLine();
                    Book x=new ReferenceBooks(bookID,title,author);
                    list.add(x);
                    break;
                }
                case 2:{
                    System.out.println("Enter ID, Title and Author (Line by line)");
                    int bookID=input.nextInt();
                    input.nextLine();
                    String title=input.nextLine();
                    String author=input.nextLine();
                    Book x=new TextBooks(bookID,title,author);
                    list.add(x);
                    break;
                }
                case 3:{
                    System.out.print("Enter Book ID: ");
                    int x=input.nextInt();

                    String s="";
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).bookID==x){
                            if(list.get(i).type==1){
                                System.out.print("Enter Username: ");
                                input.nextLine();
                                s=input.nextLine().trim();
                                list.get(i).checkOut(s);
                            }else{
                                list.get(i).checkOut(s);
                            }
                            break;
                        }else{
                            continue;
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.print("Enter Book ID: ");
                    int x=input.nextInt();
                    for (Book book : list) {
                        if (book.bookID == x) {
                            book.checkIn();
                            break;
                        } else {
                            continue;
                        }
                    }
                    break;
                }
                case 5:{
                    for(int i=0;i<list.size();i++){
                        if(list.get(i).type==1){
                            System.out.print("TextBook: " +
                                    list.get(i).bookID +
                                    ": " +
                                    list.get(i).title +
                                    ": " +
                                    list.get(i).author +
                                    ": ");
                            if(list.get(i).status==1){
                                System.out.print("Available\n");
                            }else{
                                System.out.print("Borrowed by "+
                                        list.get(i).borrowedUser+ "\n");
                            }
                        }else{
                            System.out.print("ReferenceBook: " +
                                    list.get(i).bookID +
                                    ": " +
                                    list.get(i).title +
                                    ": " +
                                    list.get(i).author + "\n");
                        }
                    }
                    break;
                }
            }
            System.out.print("\nEnter your choice: ");
            n=input.nextInt();
        }
        input.close();
    }
}