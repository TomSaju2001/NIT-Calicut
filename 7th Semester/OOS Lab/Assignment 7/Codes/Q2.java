import java.util.Scanner;

interface HDFC{
    void transaction(int n, int m);
}

interface ICICI{
    void transaction(int n, int m);
}

class Flipkart implements HDFC, ICICI{
    @Override
    public void transaction(int n, int m) {
        int remainingBalance = n-m;
        System.out.print(" " + remainingBalance + "\n");
    }
}

public class Q2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        int account=0;
        while(n!=0){
            String[] str = input.nextLine().trim().split(" ");
            if(str[0].equals("HDFC")){
                HDFC obj = new Flipkart();
                account+=Integer.parseInt(str[2]);
                System.out.print(account);
                obj.transaction(Integer.parseInt(str[1]),Integer.parseInt(str[2]));
            }
            else{
                ICICI obj=new Flipkart();
                account+=Integer.parseInt(str[2]);
                System.out.print(account);
                obj.transaction(Integer.parseInt(str[1]),Integer.parseInt(str[2]));
            }
            n--;
        }
        input.close();
    }
}
