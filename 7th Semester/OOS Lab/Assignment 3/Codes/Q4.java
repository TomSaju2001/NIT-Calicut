import java.util.Scanner;

class Employee{
    public int id;
    public String name;
    public String department;
    public int salary;
}

class Manager extends Employee{
    public int bonus;
    public int total;

    public Manager(int id, String name, String department, int salary, int bonus){
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
        this.bonus=bonus;
        this.total=salary+bonus;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        Manager[] managerArr = new Manager[n];

        for(int i=0; i<n; i++){
            String string = input.nextLine();
            string = string.trim();

            String[] stringArr = string.split(" ");
            managerArr[i]=new Manager(Integer.parseInt(stringArr[0]), stringArr[1], stringArr[2], Integer.parseInt(stringArr[3]), Integer.parseInt(stringArr[4]));
        }

        Manager temp = new Manager(0, " ", " ", 0, 0);
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(managerArr[j].total>managerArr[j+1].total){
                    temp=managerArr[j];
                    managerArr[j]=managerArr[j+1];
                    managerArr[j+1]=temp;
                }
            }
        }

        int h=managerArr[n-1].total;

        //System.out.println("\n");
        for(int i=0; i<n; i++){
            if(managerArr[i].total==h){
                System.out.println(managerArr[i].id +
                        " " +
                        managerArr[i].name +
                        " " +
                        managerArr[i].department +
                        " " +
                        managerArr[i].salary +
                        " " +
                        managerArr[i].bonus);
            }
        }
    }
}
