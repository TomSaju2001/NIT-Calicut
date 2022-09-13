import java.util.Scanner;

class Angle{
    private int degrees;
    private int minutes;

    public Angle(int degrees, int minutes){
        this.degrees=degrees;
        this.minutes=minutes;
    }

    public static Angle angleSum(Angle angle1, Angle angle2){
        if(angle1.getMinutes()+angle2.getMinutes() >= 60){
            return new Angle((angle1.getDegrees()+angle2.getDegrees()+1), ((angle1.getMinutes()+angle2.getMinutes())%60));
        }
        return new Angle((angle1.getDegrees()+angle2.getDegrees()), (angle1.getMinutes()+angle2.getMinutes()));
    }

    public int getDegrees(){
        return this.degrees;
    }

    public int getMinutes(){
        return this.minutes;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String inputAngle1 = input.nextLine();
        String[] angle1Arr = inputAngle1.trim().split(" ");
        Angle angle1 = new Angle(Integer.parseInt(angle1Arr[0]), Integer.parseInt(angle1Arr[1]));

        String inputAngle2 = input.nextLine();
        String[] angle2Arr = inputAngle2.trim().split(" ");
        Angle angle2 = new Angle(Integer.parseInt(angle2Arr[0]), Integer.parseInt(angle2Arr[1]));

        Angle newAngle = Angle.angleSum(angle1, angle2);

        System.out.println(newAngle.getDegrees() + " " + newAngle.getMinutes());
        input.close();
    }
}
