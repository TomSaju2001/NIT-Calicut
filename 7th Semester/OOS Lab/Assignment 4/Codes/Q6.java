import java.util.Scanner;

class Point{
    private double abscissa;
    private double ordinate;


    public Point(double abscissa, double ordinate){
        this.abscissa=abscissa;
        this.ordinate=ordinate;
    }

    public double getXCor(){
        return this.abscissa;
    }

    public double getYCor(){
        return this.ordinate;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String p1 = input.nextLine();
        String[] p1Arr=p1.trim().split(",");
        if(p1Arr.length!=2){
            System.out.println("INVALID");
            return;
        }

        String p2 = input.nextLine();
        String[] p2Arr=p2.trim().split(",");
        if(p2Arr.length!=2){
            System.out.println("INVALID");
            return;
        }

        Point point1 = new Point(Double.parseDouble(p1Arr[0]), Double.parseDouble(p1Arr[1]));
        Point point2 = new Point(Double.parseDouble(p2Arr[0]), Double.parseDouble(p2Arr[1]));

        Point midPoint = getMidPoint(point1, point2);
        System.out.printf("%.2f,%.2f",midPoint.getXCor(), midPoint.getYCor());
        input.close();
    }

    private static Point getMidPoint(Point point1, Point point2) {
        return  new Point((point1.getXCor()+point2.getXCor())/2,(point1.getYCor()+point2.getYCor())/2);
    }
}
