import java.util.Scanner;

class Employee{
    public int employeeId;
    public String employeeName;
    public double salary;

    public void calculateSalary(){
    }

    public int getEmployeeId(){
        return this.employeeId;
    }

    public String getEmployeeName(){
        return this.employeeName;
    }

    public int getSalary() {
        return (int)this.salary;
    }
}

class PermanentEmployee extends Employee{
    private double basicPay;
    private double pfaAmount;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.basicPay = basicPay;
        this.pfaAmount=(this.basicPay*0.12);
        this.salary=this.basicPay-this.pfaAmount;
    }

    @Override
    public void calculateSalary(){
        System.out.println(this.getEmployeeId() +
                " " + this.getEmployeeName() +
                " " + this.getSalary());
    }
}

class TemporaryEmployee extends Employee{
    public double hoursWorked;
    public double hourlyWages;

    public TemporaryEmployee(int employeeId, String employeeName, double hoursWorked, double hourlyWages){
        this.employeeId=employeeId;
        this.employeeName=employeeName;
        this.hoursWorked = hoursWorked;
        this.hourlyWages=hourlyWages;
        this.salary=hoursWorked*hourlyWages;
    }

    @Override
    public void calculateSalary(){
        System.out.println(this.getEmployeeId() +
                " " + this.getEmployeeName() +
                " " + this.getSalary());
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        Employee[] employeeArr = new Employee[n];

        for(int i=0; i<n; i++){
            String str = input.nextLine();
            String[] strArr = str.trim().split(" ");

            //Permanent Employee
            if(strArr.length == 4){
                employeeArr[i] = new PermanentEmployee(Integer.parseInt(strArr[1]), strArr[2], Double.parseDouble(strArr[3]));
            }else{
                employeeArr[i] = new TemporaryEmployee(Integer.parseInt(strArr[1]), strArr[2], Double.parseDouble(strArr[3]), Double.parseDouble(strArr[4]));
            }
        }

        int searchEmployee = input.nextInt();

        for(Employee employee: employeeArr){
            if(employee.getEmployeeId()==searchEmployee){
                employee.calculateSalary();
                return;
            }
        }
        //If employee not found
        System.out.println("-1");
        input.close();
    }
}


/*
Sample Input 1:
3
1 203 shiva 15000
2 312 krishna 43 250
1 415 ankit 25000
312

Sample Output 1:
312 krishna 10750

***********************

Sample Input 2:
4
2 672 messi 55 25000
1 326 neymar 33000
2 112 mbappe 38 23000
1 724 ramos 35000
326

Sample Output 2:
326 neymar 29040
 */