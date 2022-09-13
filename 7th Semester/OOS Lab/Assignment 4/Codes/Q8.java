import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.Scanner;

class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if(student1.rollNo == student2.rollNo) return 0;
        if(student1.rollNo < student2.rollNo) return -1;
        return 1;
    }
}
class Student{
    String studentName;
    int rollNo;
    int englishScore;
    int hindiScore;
    int mathsScore;
    int scienceScore;
    int ssScore;

    public Student(){}

    static ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(String studentName,
                   int rollNo,
                   int englishScore,
                   int hindiScore,
                   int mathsScore,
                   int scienceScore,
                   int ssScore){
        this.studentName=studentName;
        this.rollNo=rollNo;
        this.englishScore=englishScore;
        this.hindiScore=hindiScore;
        this.mathsScore=mathsScore;
        this.scienceScore=scienceScore;
        this.ssScore=ssScore;
    }

    public int getTotalMarks(){
        return (this.englishScore+this.hindiScore+this.mathsScore+this.scienceScore+this.ssScore);
    }

    public int getEnglishScore(){
        return this.englishScore;
    }

    public int getHindiScore(){
        return this.hindiScore;
    }

    public int getMathsScore(){
        return this.mathsScore;
    }

    public int getScienceScore(){
        return this.scienceScore;
    }

    public int getSsScore(){
        return this.ssScore;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public int getRollNo(){
        return this.rollNo;
    }

    public static void subjectTopper(int subCode){
        //[101: English, 102: Hindi, 103: Maths, 104: Science, 105: Social Studies]
        ArrayList<Student> toppers = new ArrayList<>();
        if(subCode==101){
            int maxEnglishScore=0;
            for (Student student : studentList) {
                if (student.getEnglishScore() > maxEnglishScore) {
                    maxEnglishScore = student.getEnglishScore();
                }
            }
            for (Student student : studentList) {
                if (student.getEnglishScore() == maxEnglishScore) {
                    toppers.add(student);
                }
            }
        }else if(subCode==102){
            int maxHindiScore=0;
            for (Student student : studentList) {
                if (student.getHindiScore() > maxHindiScore) {
                    maxHindiScore = student.getHindiScore();
                }
            }
            for (Student student : studentList) {
                if (student.getHindiScore() == maxHindiScore) {
                    toppers.add(student);
                }
            }
        }else if(subCode==103){
            int maxMathsScore=0;
            for (Student student : studentList) {
                if (student.getHindiScore() > maxMathsScore) {
                    maxMathsScore = student.getMathsScore();
                }
            }
            for (Student student : studentList) {
                if (student.getMathsScore() == maxMathsScore) {
                    toppers.add(student);
                }
            }
        }else if(subCode==104){
            int maxScienceScore=0;
            for (Student student : studentList) {
                if (student.getHindiScore() > maxScienceScore) {
                    maxScienceScore = student.getScienceScore();
                }
            }
            for (Student student : studentList) {
                if (student.getScienceScore() == maxScienceScore) {
                    toppers.add(student);
                }
            }
        }else if(subCode==105){
            int maxSsScore=0;
            for (Student student : studentList) {
                if (student.getSsScore() > maxSsScore) {
                    maxSsScore = student.getSsScore();
                }
            }
            for (Student student : studentList) {
                if (student.getSsScore() == maxSsScore) {
                    toppers.add(student);
                }
            }
        }

        Collections.sort(toppers, new StudentComparator());
        printList(toppers);
    }

    public static void classTopper(){
        ArrayList<Student> list = new ArrayList<>();
        int maxTotalScore=0;
        for (Student student : studentList) {
            if (student.getTotalMarks()> maxTotalScore) {
                maxTotalScore = student.getTotalMarks();
            }
        }

        for (Student student : studentList) {
            if (student.getTotalMarks() == maxTotalScore) {
                list.add(student);
            }
        }
        Collections.sort(list, new StudentComparator());
        printList(list);
    }

    public static void printList(ArrayList<Student> list){
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i).getStudentName() + " " + list.get(i).getRollNo());
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            String str = input.nextLine();
            if(str.equals("a")){
                String data = input.nextLine();
                String[] dataArr = data.trim().split(" ");

                Student newStudent = new Student();
                newStudent.addStudent(dataArr[0],
                        Integer.parseInt(dataArr[1]),
                        Integer.parseInt(dataArr[2]),
                        Integer.parseInt(dataArr[3]),
                        Integer.parseInt(dataArr[4]),
                        Integer.parseInt(dataArr[5]),
                        Integer.parseInt(dataArr[6]));
                Student.studentList.add(newStudent);
            }else if(str.equals("s")) {
                String subCode = input.nextLine();
                Student.subjectTopper(Integer.parseInt(subCode));
            }else if(str.equals("c")) {
                Student.classTopper();
            }else{
                break;
            }
        }
        input.close();
    }
}
