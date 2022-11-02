import java.util.Scanner;


interface ShapeArea{
    void area(int n);
}
class Circle implements ShapeArea{
    @Override
    public void area(int n) {
        double area = 3.14*n*n;
        System.out.println((int) area);
    }
}

class Square implements ShapeArea{
    @Override
    public void area(int n) {
        double area = n*n;
        System.out.println((int) area);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameOfShape = input.nextLine().trim();
        if (nameOfShape.equalsIgnoreCase("Circle")){
            int radius=input.nextInt();
            ShapeArea obj = new Circle();
            obj.area(radius);
        }else{
            int length=input.nextInt();
            ShapeArea obj = new Square();
            obj.area(length);
        }
        input.close();
    }
}