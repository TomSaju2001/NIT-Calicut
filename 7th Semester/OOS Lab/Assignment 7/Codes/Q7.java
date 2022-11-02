import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

interface TaxCalculatable{
    void calculateTax();
}

abstract class Vehicle implements TaxCalculatable{
    String modelNumber;
    int rateBought;
    String fuelType;
    int numberOfWheels;
    int tax;

    @Override
    public abstract void calculateTax();
}

class Car extends Vehicle{
    int numberOfPassengers;

    public Car(String modelNumber,int rateBought,String fuelType,int numberOfPassengers){
        this.modelNumber=modelNumber;
        this.rateBought=rateBought;
        this.fuelType=fuelType;
        this.numberOfPassengers=numberOfPassengers;
        this.numberOfWheels=4;
        calculateTax();
    }

    @Override
    public void calculateTax(){
        if(fuelType.equals("petrol")){
            tax= (int)((0.1*rateBought* numberOfPassengers)*0.5);
        }else{
            tax= (int)((0.1*rateBought* numberOfPassengers)*0.4);
        }
    }
}

class Truck extends Vehicle{
    int loadLimit;

    public Truck(String modelNumber,int rateBought,String fuelType,int loadLimit){
        this.modelNumber=modelNumber;
        this.rateBought=rateBought;
        this.fuelType=fuelType;
        this.loadLimit=loadLimit;
        this.numberOfWheels=6;
        calculateTax();
    }

    @Override
    public void calculateTax() {
        if(fuelType.equals("petrol")){
            tax= (int)((rateBought*0.1 * loadLimit*0.002)*0.5);
        }else{
            tax= (int)((rateBought*0.1 * loadLimit*0.002)*0.4);
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1. Add Vehicle\n2. Display Vehicles\n3. Exit\n\nEnter your choice:");
        int n=input.nextInt();
        ArrayList<Vehicle> v=new ArrayList<>();
        while(true){
            if(n==1){
                System.out.print("a.Car\nb.Truck\nEnter your choice:");
                char choice=input.next().trim().charAt(0);
                input.nextLine();

                if(choice=='a'){
                    System.out.print("ModelNumber:");
                    String model=input.nextLine().trim();
                    System.out.print("Rate:");
                    int rateBought=input.nextInt();
                    input.nextLine();
                    System.out.print("FuelType(petrol/diesel):");
                    String fuelType=input.nextLine().trim();
                    System.out.print("Passengers:");
                    int passengers=input.nextInt();
                    Vehicle x=new Car(model,rateBought,fuelType,passengers);
                    v.add(x);
                }else{
                    System.out.print("ModelNumber:");
                    String modelNumber=input.nextLine().trim();
                    System.out.print("Rate:");
                    int rateBought=input.nextInt();
                    input.nextLine();
                    System.out.print("FuelType(petrol/diesel):");
                    String fuelType=input.nextLine().trim();
                    System.out.print("Loadlimit:");
                    int loadLimit=input.nextInt();
                    Vehicle x=new Truck(modelNumber,rateBought,fuelType,loadLimit);
                    v.add(x);
                }
            }else if(n==2){
                Collections.sort(v,new Comparator<Vehicle>(){
                    public int compare(Vehicle a,Vehicle b){
                        return b.tax-a.tax;
                    }
                });
                for (Vehicle vehicle : v) {
                    System.out.println(vehicle.modelNumber + " " + vehicle.fuelType + " " + vehicle.tax);
                }
            }else{
                break;
            }
            System.out.print("\n1. Add Vehicle\n2. Display Vehicles\n3. Exit\nEnter your choice:");
            n=input.nextInt();
        }
        input.close();
    }
}
