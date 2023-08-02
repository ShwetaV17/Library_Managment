package LibraryManagmentSystem;

import java.util.List;
import java.util.Scanner;

public class Student
{
    String studentName;
    int registrationNum;

    public Student(){};
    public Student(String studentName, int registrationNum) {
        this.studentName = studentName;
        this.registrationNum = registrationNum;

    }

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setRegistrationNum(int regNum) {
        this.registrationNum = regNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getRegistrationNum() {
        return registrationNum;
    }

    public Student addStudent()
    {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();

   //     sc.nextLine();
        System.out.println("Enter the student name:");
        String name =sc.nextLine();
        student.setStudentName(name);

        System.out.println("Enter the register number:");
        int regNum =sc.nextInt();
        student.setRegistrationNum(regNum);

        return student;
    }

    public void printStudentList(List<Student> students)
    {
        for(Student student : students)
        {
            printStudent(student);
        }
    }

    public void printStudent(Student student)
    {
        
        System.out.println(student.getStudentName()+ " " + student.getRegistrationNum());
    }


}
