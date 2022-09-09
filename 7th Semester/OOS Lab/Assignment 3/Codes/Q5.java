import java.util.Scanner;

class Person{
    public String name;
}

class Patient extends Person{
    public String patientId;
    public int age;

    public Patient(String name, String patientId){
        this.name=name;
        this.patientId=patientId;
        this.age=calculateAge(patientId);
    }

    public int calculateAge(String patientId){
        int age=0;
        for (int i=5; i<8; i++){
            age = age*10 + (patientId.charAt(i)-'0');
        }
        return age;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of patients: ");

        int numOfPatients = input.nextInt();
        Patient[] patientArr = new Patient[numOfPatients];
        input.nextLine();
        System.out.print("\n");

        for (int i=0; i<numOfPatients; i++){
            String name, patientId;
            System.out.println("Enter the details of patient " + (i+1) + ": ");
            System.out.print("Name: ");
            name=input.next();
            System.out.print("Patient ID: ");
            patientId=input.next();

            patientArr[i] = new Patient(name, patientId);
            System.out.print("\n");
        }

        Patient temp = new Patient(" ", "xxxx-yyy");
        for(int i=0;i<numOfPatients;i++){
            for(int j=0;j<numOfPatients-1;j++){
                if(patientArr[j].age>patientArr[j+1].age){
                    temp=patientArr[j];
                    patientArr[j]=patientArr[j+1];
                    patientArr[j+1]=temp;
                }
            }
        }

        System.out.println("List of Patients to be tested are: ");
        for(int i=numOfPatients-1;i>=0;i--){
            System.out.println(patientArr[i].patientId + " " + patientArr[i].name);
        }
    }
}
