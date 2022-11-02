import java.util.Scanner;

abstract class Student{
    public String name;
    public String rollNo;

    protected int fee;

    public Student(String name, String rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    abstract void getFeeDetails();
    abstract void setFeeDetails(int fee);
}

class Undergraduate extends Student{

    public Undergraduate(String name, String rollNo){
        super(name, rollNo);
    }

    void getFeeDetails(){
        System.out.println(this.fee);
    }

    void setFeeDetails(int fee){
        this.fee=fee;
    }
}

class Postgraduate extends Student{
    public Postgraduate(String name, String rollNo){
        super(name, rollNo);
    }

    void getFeeDetails(){
        System.out.println(this.fee);
    }
    void setFeeDetails(int fee){
        this.fee=fee;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] feeDetails = input.nextLine().trim().split(" ");
        int numStudents = input.nextInt();
        input.nextLine();

        Student[] studentArr = new Student[numStudents];

        for(int i=0; i<numStudents; i++){
            String[] studentDetailArr = input.nextLine().trim().split(" ");
            if(studentDetailArr[2].equalsIgnoreCase("UG")){
                studentArr[i] = new Undergraduate(studentDetailArr[0], studentDetailArr[1]);
                studentArr[i].setFeeDetails(Integer.parseInt(feeDetails[0]));
            }else{
                studentArr[i] = new Postgraduate(studentDetailArr[0], studentDetailArr[1]);
                studentArr[i].setFeeDetails(Integer.parseInt(feeDetails[1]));
            }
        }

        String searchStudent = input.nextLine().trim();
        for (Student student: studentArr){
            if(student.rollNo.equals(searchStudent)){
                student.getFeeDetails();
                break;
            }
        }

        input.close();
    }
}

/*
Sample Input:
45000 25000
2
Ankit B180021cs UG
Rahul M190034cs PG
B180021cs

Sample Output:
45000
 */