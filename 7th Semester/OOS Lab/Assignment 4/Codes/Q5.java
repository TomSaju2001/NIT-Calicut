import java.util.Scanner;

class Person{
    String name;
    int age;
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    void calculatePension(){
        if(age<65){
            System.out.println(0);
        }else if(age>70){
            System.out.println(500 + 100);
        }else{
            System.out.println(500);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        int age = input.nextInt();
        Person obj = new Person(name.trim(), age);
        obj.calculatePension();
        input.close();
    }
}
