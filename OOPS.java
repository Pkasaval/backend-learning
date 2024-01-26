package OOPS;

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Parvati";
        s1.rollNo = 30;
        s1.Pwd = "ejhiu";
        s1.marks[0]= 70;
        s1.marks[1]= 80;
        s1.marks[2]=90;
        Student s2 = new Student(s1);
        s2.Pwd = "Hello";
        s1.marks[1]= 0;

        for(int i =0; i<s1.marks.length;i++){
            System.out.println(s2.marks[i]);
        }

    }
   
}

class Student{
    String name;
    int rollNo;
    String Pwd;
    int marks[];

    Student(){
    marks = new int[3];
        System.out.println("constructor has been called..");
    }
//copy constructor
    Student(Student s1){
         marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }
  
}
