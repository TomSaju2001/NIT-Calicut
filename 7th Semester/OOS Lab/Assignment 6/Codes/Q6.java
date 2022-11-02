import java.util.ArrayList;
import java.util.Scanner;

class Customer{
    String name;
    String mobile;
    String membership;

    public Customer(String name, String mobile, String membership){
        this.name=name;
        this.mobile=mobile;
        this.membership=membership;
    }

    public void printCustomerDetails(){
        System.out.println(this.name + "\t" + this.mobile + "\t" + this.membership);
    }
}

class Service{
    String serviceName;
    int cost;

    public Service(String serviceName, int cost){
        this.serviceName=serviceName;
        this.cost=cost;
    }

}

class Membership{
    int discount=0;
}

class Premium extends Membership{
    int discount=20;
    public int getDiscount(){
        return this.discount;
    }
}

class Gold extends Membership{
    int discount=15;
    public int getDiscount(){
        return this.discount;
    }
}

class Silver extends Membership{
    int discount=10;
    public int getDiscount(){
        return this.discount;
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take customer details
        System.out.println("Enter Customer Details:");
        System.out.print("Name: ");
        String name = input.nextLine().trim();
        System.out.print("Mobile: ");
        String mobile = input.nextLine().trim();
        System.out.print("Membership: ");
        String membership = input.nextLine().trim();

        //Creating customer
        Customer customer = new Customer(name, mobile, membership);
        ArrayList<Service> services = new ArrayList<>();
        while (true){
            System.out.print("\nAdd Service (Y/N): ");
            char choice = input.nextLine().trim().charAt(0);
            if (choice == 'Y'){
                System.out.print("Service Name: ");
                String serviceName = input.nextLine().trim();
                System.out.print("Rate: ");
                int rate = input.nextInt();
                input.nextLine();
                Service service = new Service(serviceName, rate);
                services.add(service);
            }else{
                //If No
                System.out.println("\n***** BILL *****");
                customer.printCustomerDetails();

                int discount=0;
                if(customer.membership.equalsIgnoreCase("Premium")){
                    Premium obj = new Premium();
                    discount=obj.getDiscount();
                }else if(customer.membership.equalsIgnoreCase("Gold")){
                    Gold obj = new Gold();
                    discount = obj.getDiscount();
                }else if(customer.membership.equalsIgnoreCase("Silver")){
                    Silver obj = new Silver();
                    discount = obj.getDiscount();
                }
                double totalCost=0.0;
                double totalDiscount=0.0;

                for (int i=0; i<services.size(); i++){
                    System.out.println(i+1 +
                            ". " +
                            services.get(i).serviceName +
                            "\t" + services.get(i).cost);

                    totalCost+=services.get(i).cost;
                    totalDiscount+=(services.get(i).cost * (0.01)*discount);
                }

                System.out.println("Total: " +
                        totalCost + "-" + totalDiscount);
                double finalAmount = totalCost-totalDiscount;
                if(finalAmount%(int)(finalAmount)==0) System.out.print("Please Pay: " + (int)finalAmount);
                else System.out.print("Please Pay: " + finalAmount);
                break;
            }
        }

        input.close();
    }
}


/*
Sample input and output:
Enter Customer Details:
Name:Ram
Mobile:9876543210
Membership:Gold

Add Service(Y/N): Y
ServiceName:FaceWash
Rate:100

Add Service(Y/N): Y
ServiceName:HairCut
Rate:200

Add Service(Y/N): N

*****BILL*****
Ram 9876543210 Gold
1. FaceWash 100
2. HairCut 200
Total: 300-45
Please Pay: 255
 */