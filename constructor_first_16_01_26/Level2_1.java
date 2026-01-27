package constructor_first_16_01_26;

public class Level2_1 {

    static void main(String[] args) {

        Student s = new Student("Ak",1,60);
        s.calculateGrade();
        s.disp();


    }
}

class Student{

    private final String name;
    private final int rollNo;
    private final float marks;
    private String grade;

    Student(String name,int rollNo,float marks){

        this.name =name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void calculateGrade(){


        if(marks>=90 && marks<=100){
            grade="A";
        }
        else if(marks>=80){
            grade="B";
        } else if (marks>=60) {
           grade ="C";
        } else if (marks>=40) {
            grade ="D";
        }
        else{
            grade ="Fail";
        }
    }

    void disp(){
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(marks);
        System.out.println(grade);
    }

}
