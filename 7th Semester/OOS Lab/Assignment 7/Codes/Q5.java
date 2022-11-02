import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

interface OrderStudents{
    void OrderByRollno(ArrayList<Student> students);
    void OrderByName(ArrayList<Student> students);
}

class Student implements OrderStudents{
    String name;
    int rollno;
    String address;

    public Student(String name , int rollno ,String address){
        this.name=name;
        this.rollno=rollno;
        this.address=address;
    }


    @Override
    public void OrderByRollno(ArrayList<Student> students) {
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.rollno-o2.rollno;
            }
        });

        //Printing
        System.out.println("//Sorted by Rollno");
        for (Student student : students) {
            System.out.println(student.rollno + " " + student.name + " " + student.address);
        }
        System.out.print("\n");
    }

    @Override
    public void OrderByName(ArrayList<Student> students) {
        Collections.sort(students,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2){
                return (o1.name).compareTo(o2.name);
            }

        });

        //Printing
        System.out.println("//Sorted by Name");
        for (Student student : students) {
            System.out.println(student.rollno + " " + student.name + " " + student.address);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        ArrayList<Student> students = new ArrayList<>();
        while (n!=0){
            String[] str = input.nextLine().trim().split(" ");
            Student student = new Student(str[0],Integer.parseInt(str[1]),str[2]);
            students.add(student);
            n--;
        }
        Student obj = new Student("", 0, "");
        obj.OrderByRollno(students);
        obj.OrderByName(students);
        input.close();
    }
}

/*
Sample Input:
3
Babita 111 Hyderabad
Ajay 131 Banglore
Ritika 121 Jaipur

Sample Output:
//Sorted by Rollno
111 Babita Hyderabad
121 Ritika Jaipur
131 Ajay Banglore

//Sorted by Name
131 Ajay Banglore
111 Babita Hyderabad
121 Ritika Jaipur
*/