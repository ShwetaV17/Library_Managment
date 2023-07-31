package LibraryManagmentSystem;

import java.util.List;
import java.util.Scanner;

public class Student
{
    String studentName;
    String registrationNum;

    public Student(){};
    public Student(String studentName, String registrationNum) {
        this.studentName = studentName;
        this.registrationNum = registrationNum;

    }

    public void setStudentNameName(String name) {
        this.studentName = name;
    }

    public void setRegistrationNum(String regnum) {
        this.registrationNum = regnum;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRegistrationNum() {
        return registrationNum;
    }

    public Student addStudent()
    {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

        sc.nextLine();
        System.out.println("Enter the student name:");
        String name =sc.nextLine();
        student.setStudentNameName(name);

        System.out.println("Enter the register number:");
        String regnum =sc.nextLine();
        student.setRegistrationNum(regnum);

        return student;
    }

    public void printStudentlist(List<Student> students)
    {
        for(Student student : students)
        {
            printBook(student);
        }
    }

    public void printBook(Student student)
    {
        
        System.out.println(student.getStudentName()+ " " + student.getRegistrationNum());
    }
}
