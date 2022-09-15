import java.util.Scanner;

class Person{
    public String personName;
    public int age;
}

class Student extends Person{
    public int rollNumber;
    public double percentageOfMarks;
}

class PGStudent extends Student{
    public String elective;
    public int numberOfSubjects;

    public PGStudent(String personName, int age, String elective, double percentageOfMarks) {
        this.personName=personName;
        this.age=age;
        this.elective = elective;
        this.percentageOfMarks = percentageOfMarks;
    }

    public double getPercentageOfMarks(){
        return this.percentageOfMarks;
    }

    public String getPersonName(){
        return this.personName;
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        PGStudent[] PGStudentArr = new PGStudent[n];
        for(int i=0; i<n; i++){
            String str = input.nextLine();
            String[] strArr = str.trim().split(":");
            PGStudentArr[i] = new PGStudent(strArr[0], Integer.parseInt(strArr[1]), strArr[2], Double.parseDouble(strArr[3]));
        }

        //Sorting in descending order
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i-1; j++){
                if(PGStudentArr[j].getPercentageOfMarks() < PGStudentArr[j+1].getPercentageOfMarks()){
                    PGStudent temp = PGStudentArr[j];
                    PGStudentArr[j] = PGStudentArr[j+1];
                    PGStudentArr[j+1] = temp;
                }
            }
        }

        for(PGStudent student: PGStudentArr){
            System.out.println(student.getPersonName());
        }
        input.close();
    }
}


/*
Sample input:
3
Amal:22:Soft Computing:77
Neha:21: IOT:75
Kiran:21:Image Processing:80

Sample output:
Kiran
Amal
Neha
 */