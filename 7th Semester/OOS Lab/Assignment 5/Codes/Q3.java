import java.util.Scanner;

class Student{
    String name;
    int rollNo;
    int height;

    public Student(String name, int rollNo, int height){
        this.name=name;
        this.rollNo=rollNo;
        this.height=height;
    }

    public String getName(){
        return this.name;
    }

    public int getHeight(){
        return this.height;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();

        Student[] studentArr = new Student[n];

        for(int i=0; i<n; i++){
            String str = input.nextLine();
            String[] strArr = str.trim().replaceAll("[(\\)]", "").split(",");
            Student student = new Student(strArr[0], Integer.parseInt(strArr[1]), Integer.parseInt(strArr[2]));
            studentArr[i]=student;
        }

        //Bubble Sorting
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1-i; j++){
                if(studentArr[j].getHeight() > studentArr[j+1].getHeight()){
                    Student temp = studentArr[j];
                    studentArr[j]=studentArr[j+1];
                    studentArr[j+1]=temp;
                }else if((studentArr[j].getHeight() == studentArr[j+1].getHeight()) && (studentArr[j].getName().compareToIgnoreCase(studentArr[j+1].getName())>0)){
                    Student temp = studentArr[j];
                    studentArr[j]=studentArr[j+1];
                    studentArr[j+1]=temp;
                }
            }
        }

        //Getting count of unique height
        int height=-1;
        int count=0;
        for(int i=0;i<n;i++){
            if(height!=studentArr[i].getHeight()){
                height=studentArr[i].getHeight();
                count++;
            }
        }
        System.out.println(count);

        int tempCount=0;
        height=-1;
        for(int i=0;i<n;i++){
            if(height!=studentArr[i].getHeight()){
                if (tempCount == count-1){
                    System.out.println(studentArr[i].getName());
                }else{
                    System.out.print(studentArr[i].getName() + ",");
                    height=studentArr[i].getHeight();
                    tempCount++;
                }
            }
        }
        input.close();
    }
}


/*
Sample Input1:
4
(Abhay,1,10)
(Soham,2,20)
(Jeet,3,10)
(Akshay,4,40)

Sample Output1:
3
Abhay,Soham,Akshay

******************

Sample Input2:
9
(Abhay,1,10)
(Soham,2,22)
(Jeet,3,10)
(Akshay,4,33)
(Riya,5,33)
(Abhishek,6,50)
(Vidit,7,50)
(Disha,8,60)
(Lakshya,9,80)

Sample Output2:
6
Abhay,Soham,Akshay,Abhishek,Disha,Lakshya
*/
