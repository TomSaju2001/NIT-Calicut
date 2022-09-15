import java.util.Scanner;

class Area{
    double area=0;

    public Area(){}

    public void getArea(double radius){
        area = 3.14 * radius * radius;
        System.out.println("Circle:" + String.format("%.2f", area));
    }

    public void getArea(double length, double breadth){
        area = length*breadth;
        System.out.println("Rectangle:" + String.format("%.2f", area));
    }

    public void getArea(double a, double b, double c){
        double s = (a+b+c)/2.0;
        area = s*((s-a)*(s-b)*(s-c));
        System.out.println("Triangle:" + String.format("%.2f", Math.sqrt(area)));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = input.nextLine();
        if (str.equals("")) return;

        String[] strArr = str.trim().split(" ");
        if (strArr.length == 4){
            System.out.println("INVALID INPUT");
            return;
        }
        Area obj = new Area();

        if (strArr.length==1) obj.getArea(Double.parseDouble(strArr[0]));
        else if (strArr.length==2) obj.getArea(Double.parseDouble(strArr[0]), Double.parseDouble(strArr[1]));
        else obj.getArea(Double.parseDouble(strArr[0]), Double.parseDouble(strArr[1]), Double.parseDouble(strArr[2]));

        input.close();
    }
}
