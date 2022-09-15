import java.util.Scanner;

class Car{
    public String modelName;
    public String engineNo;
    public double basePrice;
    public double additionalCharge;

    public Car(String modelName,String engineNo,double basePrice,double additionalCharge){
        this.modelName=modelName;
        this.engineNo=engineNo;
        this.basePrice=basePrice;
        this.additionalCharge=additionalCharge;
    }

    public double totalPrice(){
        return this.basePrice + this.additionalCharge;
    }
}

class Dealer{
    public String dealerName;
    public double discountPercentage;
    public Car car;

    public Dealer(String modelName,String engineNo,double basePrice,double additionalCharge,String dealerName,double discountPercentage){
        this.car =new Car(modelName,engineNo,basePrice,additionalCharge);
        this.dealerName=dealerName;
        this.discountPercentage=discountPercentage;
    }

    public double onRoadPrice(){
        return car.totalPrice() - ((car.totalPrice()*discountPercentage)/100.0);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        Dealer[] dealerArr = new Dealer[n];
        for(int i=0; i<n; i++){
            String str = input.nextLine();
            String[] strArr = str.trim().split(" ");
            dealerArr[i] = new Dealer(strArr[0], strArr[1], Double.parseDouble(strArr[2]), Double.parseDouble(strArr[3]), strArr[4], Double.parseDouble(strArr[5]));
        }

        for(Dealer dealer: dealerArr){
            System.out.println(dealer.car.modelName +
                    " " +
                    (int)dealer.car.totalPrice() +
                    " " +
                    (int)dealer.onRoadPrice());
        }

        input.close();
    }
}

/*
Sample Input:
1
Mahendra cc2300 1000000 50000 KVR 10

Sample Output:
Mahendra 1050000 945000

****************************

Sample Input:
1
Hyundai cc3400 500000 20000 HondaDrive 8

Sample Output:
Hyundai 520000 478400
 */