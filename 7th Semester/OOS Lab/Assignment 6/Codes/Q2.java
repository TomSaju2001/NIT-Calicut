import java.util.Scanner;

abstract class Bank{
    abstract void interest(int x);
}

class SBI extends Bank{
    @Override
    public void interest(int x){
        System.out.println("SBI interest is : " + (int)(x*0.05));
    }
}

class ICICI extends Bank{
    @Override
    public void interest(int x){
        System.out.println("ICICI interest is : " + (int)(x*0.06));
    }
}

class AXIS extends Bank{
    @Override
    public void interest(int x){
        System.out.println("AXIS interest is : " + (int)(x*0.07));
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();

        Bank sbi = new SBI();
        sbi.interest(x);

        Bank icici = new ICICI();
        icici.interest(x);

        Bank axis = new AXIS();
        axis.interest(x);

        input.close();
    }
}

/*
Sample Input:
X = 1000

Sample Output:
SBI interest is : 50
ICICI interest is : 60
AXIS interest is : 70
 */