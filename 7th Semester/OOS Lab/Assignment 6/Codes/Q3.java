import java.util.Scanner;

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public void area(){
        System.out.println("Rectangle Area " + length*breadth);
    }

    public void  perimeter(){
        System.out.println("Rectangle  Perimeter " + 2*(length + breadth));
    }
}

class Square extends Rectangle{
    public Square(int length){
        super(length, length);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strInput = input.nextLine().trim().split(" ");

        if(strInput.length==2){
            Rectangle rectangle = new Rectangle(Integer.parseInt(strInput[0]), Integer.parseInt(strInput[1]));
            rectangle.perimeter();
            rectangle.area();
        }else{
            Rectangle square = new Square(Integer.parseInt(strInput[0]));
            square.perimeter();
            square.area();
        }

        input.close();
    }
}
