import java.util.Scanner;

class Customer{
    public String customerName;
    public String accountNo;
    public double currentBalance=0.0;
    public double predictedBalance=0.0;

    public void availableBalance(){
        System.out.println(this.customerName + ":" + this.currentBalance);
    }
}

class Silver extends Customer{
    public Silver(String customerName,String accountNo,double currentBalance){
        this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
    }

    @Override
    public void availableBalance(){
        //5% interest
        this.predictedBalance=this.currentBalance+(this.currentBalance*0.05);
        System.out.println(this.customerName + ":" + (int)this.currentBalance + ":Silver:" + (int)this.predictedBalance);
    }
}

class Gold extends Customer{
    public Gold(String customerName,String accountNo,double currentBalance){
        this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
    }

    @Override
    public void availableBalance(){
        //10% interest
        this.predictedBalance=this.currentBalance+(this.currentBalance*0.1);
        System.out.println(this.customerName + ":" + (int)this.currentBalance + ":Gold:" + (int)this.predictedBalance);
    }
}

class Platinum extends Customer{
    public Platinum(String customerName,String accountNo,double currentBalance){
        this.customerName=customerName;
        this.accountNo=accountNo;
        this.currentBalance=currentBalance;
    }

    @Override
    public void availableBalance(){
        //15% interest
        this.predictedBalance=this.currentBalance+(this.currentBalance*0.15);
        System.out.println(this.customerName + ":" + (int)this.currentBalance + ":Platinum:" + (int)this.predictedBalance);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        Customer[] customerArr = new Customer[n];

        for (int i=0; i<n; i++){
            String str = input.nextLine();
            String[] strArr = str.trim().split(":");
            double currentBalance=Double.parseDouble(strArr[2]);

            if(currentBalance < 100000) customerArr[i] = new Silver(strArr[0], strArr[1], currentBalance);
            else if(currentBalance > 100000 && currentBalance < 1000000) customerArr[i] = new Gold(strArr[0], strArr[1], currentBalance);
            else customerArr[i] = new Platinum(strArr[0], strArr[1], currentBalance);
        }

        for (Customer customer: customerArr){
            customer.availableBalance();
        }

        input.close();
    }
}


/*
Sample Input:
2
Suresh:LD703:500000
Dinesh:LD905:1500000


Sample Output:
Suresh:500000:Gold:550000
Dinesh:1500000:Platinum:1725000
 */