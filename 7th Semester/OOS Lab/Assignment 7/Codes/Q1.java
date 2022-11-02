import java.util.Scanner;

interface convert{
    int convertRupees(int n);
    int convertDollars(int n);
    int convertPounds(int n);
}

class Bank implements convert{
    @Override
    public int convertRupees(int n) {
        return n;
    }

    @Override
    public int convertDollars(int n) {
        return n*70;
    }

    @Override
    public int convertPounds(int n) {
        return n*100;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalBalance = input.nextInt();

        int shopA = input.nextInt();
        int shopB = input.nextInt();
        int shopC = input.nextInt();

        Bank obj = new Bank();
        totalBalance = totalBalance- obj.convertRupees(shopA);
        totalBalance = totalBalance- obj.convertDollars(shopB);
        totalBalance = totalBalance- obj.convertPounds(shopC);

        if(totalBalance<0){
            System.out.println("Insufficient balance");
        }
        else{
            System.out.println(totalBalance);
        }
        input.close();
    }
}
