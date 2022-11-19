//Mehak 19105098

/*Question 3. We want to calculate the total marks of each student of a class in Physics,
Chemistry and Mathematics and the average marks of the class. The number of students in
the class are entered by the user. Create a class named Marks with data members for roll
number, name and marks. Create three other classes inheriting the Marks class, namely

Physics, Chemistry and Mathematics, which are used to define marks in individual subject of
each student. Roll number of each student will be generated automatically. */

import java.util.Scanner;

class Marks{
    static int rollNo = 0;
    String name;
    static float total_marks;
    static float class_total;
    Marks(String name){
       this.name = name;
       Marks.rollNo +=1;
    }
    static void total_marks(){
        class_total += total_marks;
        System.out.println("Total Marks scored  : " + total_marks);
        total_marks = 0;
    }
    static float average_total_marks(){
        return class_total;
    }

}
class Physics extends Marks{
    float marks;
    Physics(String name,float marks){
        super(name);
        this.marks = marks;
        total_marks += marks;
    }
    void display_marks(){
        System.out.println("Physics Score: " + marks);
    }
}
class Chemistry extends Marks{
    float marks;
    Chemistry(String name, float marks){
        super(name);
        this.marks = marks;
        super.total_marks += marks;
    }
    void display_marks(){
        System.out.println("Chemistry Score : " + marks);
    }

}

class Mathematics extends Marks{
    float marks;
    Mathematics(String name,float marks){
        super(name);
        this.marks = marks;
        super.total_marks += marks;
    }
    void display_marks(){
        System.out.println("Mathematics Score: " + marks);
    }
}



public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while(i>0){
            System.out.println("Enter the name of the student");
            String name = sc.next();
            System.out.println("Enter the marks of a new student with roll no : " + n);
            System.out.println("Marks scored in Physics : ?");
            float phy = sc.nextFloat();
            System.out.println("Marks scored in Mathematics : ?");
            float math = sc.nextFloat();
            System.out.println("Marks scored in Chemistry : ?");
            float chem = sc.nextFloat();
            Physics p= new Physics(name,phy);
            Mathematics m= new Mathematics(name,math);
            Chemistry c = new Chemistry(name,chem);
            Marks.total_marks();
            i--;
        }
        sc.close();
        float marks = Marks.average_total_marks();
        System.out.println("Average marks of the Class : "+ (marks/n));
    }
}

