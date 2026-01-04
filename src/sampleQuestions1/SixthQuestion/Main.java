package sampleQuestions1.SixthQuestion;

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter student details: ");
        String studentDetails = sc.nextLine();

        try{
            Student student = Student.validateStudentDetails(studentDetails);
            System.out.println("Student Details");
            System.out.println("student id: "+ student.getStudentId());
            System.out.println("name: "+ student.getName());
            System.out.println("course: "+ student.getCourse());
            System.out.println("age: "+ student.getAge());
        }
        catch (InvalidStudentException e){
            System.out.println(e.getMessage());
        }
        sc.close();

    }
}