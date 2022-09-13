import java.util.Scanner;

class TellphoneCall{
    String phNo;
    String custName;
    int callSlots;
    int totalBill;

    void readCustomer(String custName, String phNo, int callSlots){
        this.custName=custName;
        this.phNo=phNo;
        this.callSlots=callSlots;
    }

    void computeBill(){
        if(callSlots<=100) totalBill=500;
        if(callSlots>=101 && callSlots<=200) totalBill=callSlots*8;
        if(callSlots>=201 && callSlots<=300) totalBill=callSlots*10;
        if(callSlots>300) totalBill=callSlots*15;

        //Adding rental charge
        totalBill+=300;
        System.out.println(totalBill);
    }

}

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TellphoneCall obj = new TellphoneCall();

        String custName = input.next();
        String phNo = input.next();
        int callSlots = input.nextInt();

        obj.readCustomer(custName.trim(), phNo.trim(), callSlots);
        obj.computeBill();

        input.close();
    }
}
