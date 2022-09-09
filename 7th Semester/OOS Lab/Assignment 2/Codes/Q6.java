import java.util.Scanner;
//Assumed that cgpa provided will be in decimals

public class Q6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no of students: ");
        int n = Integer.parseInt(scn.nextLine());

        System.out.println("Enter student details: ");
        Student[] students = new Student[n];
        for(int i = 0; i < n; i++){
            String details = scn.nextLine();
            String[] arrdetails = details.split(" ");
            students[i] = new Student(arrdetails[0], arrdetails[1], Double.parseDouble(arrdetails[2]));
        }

        for(int i = 0; i < n; i++){
            System.out.println(students[i].getName() + " " + students[i].getRollNo() + " " + students[i].getCgpa() + " " + students[i].getPercentage()+"%");
        }
    }

}

class Student{
    private String name;
    private String rollNo;
    private double cgpa;
    private double percentage;

    public Student(String name, String rollNo, double cgpa){
        this.setName(name);
        this.setRollNo(rollNo);
        this.setCgpa(cgpa);
        this.toPercentage(cgpa);
    }

    void toPercentage(double cgpa){
        this.percentage = this.cgpa * 9.5;
    }
    String getName(){
        return this.name;
    }
    String getRollNo(){
        return this.rollNo;
    }
    double getCgpa(){
        return this.cgpa;
    }
    double getPercentage(){
        return this.percentage;
    }
    void setName(String name){
        this.name = name;
    }
    void setRollNo(String rollNo){
        this.rollNo = rollNo;
    }
    void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
    void setPercentage(double percentage){
        this.percentage = percentage;
    }
}