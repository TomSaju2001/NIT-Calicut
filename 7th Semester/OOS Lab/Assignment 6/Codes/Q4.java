import java.util.Scanner;

abstract class Addition{
    abstract void add();
}

class IntegerAddition extends Addition{
    int a;
    int b;
    public IntegerAddition(int a, int b) {
        this.a=a;
        this.b=b;
    }

    void add(){
        System.out.println(a+b);
    }
}

class FractionAddition extends Addition{
    int n1, d1;
    int n2, d2;
    public FractionAddition(int n1, int d1, int n2, int d2) {
        this.n1=n1;
        this.d1=d1;
        this.n2=n2;
        this.d2=d2;
    }

    public int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b,a%b);
    }

    void add() {
        int a=n1*d2+n2*d1;
        int b=d1*d2;
        while(gcd(a,b)!=1) {
            int k=gcd(a,b);
            a=a/k;
            b=b/k;
        }
        System.out.println(a+" / "+b);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] line1Arr = input.nextLine().trim().split(" ");
        String[] line2Arr = input.nextLine().trim().split(" ");
        if(line1Arr.length==2){
            IntegerAddition obj = new IntegerAddition(Integer.parseInt(line1Arr[0]), Integer.parseInt(line1Arr[1]));
            obj.add();
        }
        if (line2Arr.length==4){
            FractionAddition obj = new FractionAddition(Integer.parseInt(line2Arr[0]), Integer.parseInt(line2Arr[1]), Integer.parseInt(line2Arr[2]), Integer.parseInt(line2Arr[3]));
            obj.add();
        }
        input.close();
    }
}


/*
Sample Input :
2 5
3 5 4 2

Sample Output :
7
13 / 5
 */