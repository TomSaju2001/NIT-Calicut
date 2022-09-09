import java.util.Scanner;
import java.util.ArrayList;

// busno - to store Bus Number
// from - to store Place name of origin (single word)
// to - to store Place name of destination (single word)
// distance - to store the Distance in Kilometres
// type – to store Bus Type such as ‘O’ for ordinary (O, F , L use enum)
public class Q8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Train> trains
                = new ArrayList<Train>();
        while(true){
            System.out.println("1-Add details");
            System.out.println("2-Show details");
            System.out.println("3-Exit" + "\n");
            System.out.print("Enter choice ");
            int choice = Integer.parseInt(scn.nextLine());
            if(choice == 3)
                break;
            else if(choice == 2){
                System.out.println("Bus Details (Busno,from,to,distance,type, fare)");
                for(int i = 0; i < trains.size(); i++){
                    trains.get(i).show();
                }
                System.out.println();
            }
            else if(choice == 1){
                System.out.println("Enter bus details(Busno,from,to,distance,type)");
                String details = scn.nextLine();
                details=details.trim();
                String[] arrdetails = details.split(" ");
                if(arrdetails.length == 5){
                    trains.add(new Train(Integer.parseInt(arrdetails[0]), arrdetails[1], arrdetails[2], Double.parseDouble(arrdetails[3]), arrdetails[4]));
                }else if(arrdetails.length == 4){
                    trains.add(new Train(Integer.parseInt(arrdetails[0]), arrdetails[1], arrdetails[2], Double.parseDouble(arrdetails[3])));
                }
                System.out.println();
            }
        }

    }
}

class Train {
    private int busno;
    private String from;
    private String to;
    private double distance;
    enum BusType {
        O,
        F,
        L
    }
    private BusType type;


    public Train(int busno, String from, String to, double distance, String type) {
        this.busno = busno;
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.type = BusType.valueOf(type);
    }

    public Train (int busno, String from, String to, double distance){
        this.busno = busno;
        this.from = from;
        this.to = to;
        this.distance = distance;
        this.type = BusType.O;
    }

    public double calcFare(){
        if(this.type == BusType.O){
            return this.distance * 10;
        }
        else if(this.type == BusType.F){
            return this.distance * 20;
        }
        else {
            return this.distance * 24;
        }
    }

    public void show(){
        System.out.println(this.busno + " " + this.from + " " + this.to + " " + this.distance + " " + this.type + " " + this.calcFare());
    }
}