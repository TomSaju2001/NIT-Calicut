import java.util.Scanner;
import package1.*;

public class Q6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        int numOfStudents = input.nextInt();
        input.nextLine();
        StudentDataExtended[] studentDataExtArr = new StudentDataExtended[numOfStudents];
        StudentData[] studentDataArr = new StudentData[numOfStudents];

        for (int i=0; i<numOfStudents; i++){
            System.out.println("Enter the details of Student " + (i+1) + " (id, name, location): ");
            String string = input.nextLine();
            string = string.trim();
            String[] stringArr = string.split(" ");

            studentDataExtArr[i] = new StudentDataExtended();
            studentDataExtArr[i].addDetails(stringArr[2]);
            studentDataArr[i] = new StudentData(stringArr[0], stringArr[1]);
        }

        System.out.println("\nThe Student Details are:");
        StudentData temp = new StudentData(" " , " ");
        StudentDataExtended temp1 = new StudentDataExtended();
        int l=(studentDataArr[0].getId()).length();
        for(int i=0;i<numOfStudents;i++){
            for(int j=0;j<numOfStudents-1;j++){
                for(int k=0;k<l;k++){
                    if(studentDataArr[j].getId().charAt(k)>studentDataArr[j+1].getId().charAt(k)){
                        temp1=studentDataExtArr[j];
                        studentDataExtArr[j]=studentDataExtArr[j+1];
                        studentDataExtArr[j+1]=temp1;
                        temp=studentDataArr[j];
                        studentDataArr[j]=studentDataArr[j+1];
                        studentDataArr[j+1]=temp;
                        break;
                    }
                }
            }
        }
        for(int i=0;i<numOfStudents;i++){
            studentDataExtArr[i].printDetails(studentDataArr[i].getId(),studentDataArr[i].getName());
        }
    }
}
