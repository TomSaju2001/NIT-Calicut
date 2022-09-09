import java.io.*;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

class Q7 {
    public static class StudentComparator implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            if(o1.height == o2.height) return 0;
            if(o1.height < o2.height) return -1;
            return 1;
        }
    }

    public static class Student {
        String rollNumber, fullName;
        double height, weight;

        public Student(){}

        public Student(String rollNumber, String fullName, double height, double weight) {
            this.rollNumber = rollNumber;
            this.fullName = fullName;
            this.height = height;
            this.weight = weight;
        }

        public void readStudent(String line){
            String [] data = line.split(", ");
            rollNumber = data[0];
            fullName = data[1];
            height = Double.parseDouble(data[2].substring(0, data[2].length() - 2));
            weight = Double.parseDouble(data[3].substring(0, data[3].length() - 2));
        }

        public void printStudentDetails(){
            System.out.println(this.rollNumber+", "+this.fullName+", "+(int)this.height+"cm, "+(int)this.weight+"Kg");
        }

    }
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(br.readLine());

        ArrayList<Student> students = new ArrayList<Student>();
        System.out.println("Enter details (rollNumber, fullName, height, weight) separated by comma in each line ");
        for(int i=0;i<n;i++){
            String line = br.readLine();
            Student student = new Student();
            student.readStudent(line);
            students.add(student);
        }

        Collections.sort(students, new StudentComparator());
        for(int i=0;i<n;i++){
            students.get(i).printStudentDetails();
        }
    }
}