import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Abhi = new Teacher(1,"Abhi",1000000);
        Teacher Prasad = new Teacher(2,"Prasad",70000);
        Teacher vHariom = new Teacher(3,"Hariom",70000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Abhi);
        teacherList.add(Prasad);
        teacherList.add(vHariom);


        Student Anya = new Student(1,"Anya",4);
        Student Aditi = new Student(2,"Aditi",12);
        Student Anjali = new Student(3,"Anjali",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Anya);
        studentList.add(Anjali);
        studentList.add(Aditi);

        School mit = new School(teacherList,studentList);
        Teacher Gaurya = new Teacher(6,"Gaurya", 900);
        mit.addTeacher(Gaurya);

        Anya.payFees(5000);
        Aditi.payFees(6000);
        System.out.println("mit has earned $"+ mit.getTotalMoneyEarned());

        System.out.println("-SCHOOL SALARY");
        Abhi.receiveSalary(Abhi.getSalary());
        System.out.println("mit has spent for salary to " + Abhi.getName()
        +" and now has $" + mit.getTotalMoneyEarned());

        vHariom.receiveSalary(vHariom.getSalary());
        System.out.println("mit has spent for salary to " + vHariom.getName()
                +" and now has $" + mit.getTotalMoneyEarned());


        System.out.println(Aditi);

        Prasad.receiveSalary(Prasad.getSalary());

        System.out.println(Prasad);


    }
}