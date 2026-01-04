package sampleQuestions1.SixthQuestion;

public class Student {
    private String studentId;
    private String name;
    private String course;
    private int age;

    public Student(){}
    public Student(String studentId, String name, String course, int age){
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public static Student validateStudentDetails(String studentDetails) throws InvalidStudentException {
        String[] parts = studentDetails.split(":");
        if(parts.length != 4){
            throw new InvalidStudentException("invalid student details");
        }

        String studentId = parts[0];
        String name = parts[1];
        String course = parts[2];
        String ageStr = parts[3];

        if(!studentId.matches("STU/\\d{5}")){
            throw new InvalidStudentException("Invalid Student detail");
        }

        if(!name.matches("[A-Z][a-zA-Z]*")){
            throw new InvalidStudentException("Invalid Student detail");
        }

        if(!(course.equals("BSc") || course.equals("BCom") || course.equals("BTech"))){
            throw new InvalidStudentException("Invalid Student detail");
        }

        int age;
        try{
            age = Integer.parseInt(ageStr);

        }catch (NumberFormatException e){
            throw new InvalidStudentException("Invalid Student details");
        }

        if(age<17 || age>30){
            throw new InvalidStudentException("invalid student details");
        }

        return new Student(studentId, name, course, age);
    }

}

