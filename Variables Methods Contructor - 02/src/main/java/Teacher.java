public class Teacher {
    public String teacherName;
    public Teacher(String teacherName){
        System.out.println("The teacher is " + teacherName);
    }

    public void assignGrade(Student student, int finalGrade){
        student.grade = finalGrade;
        System.out.println(student.name + "'s final grade is " + finalGrade);
    }
}
    /*define a class called Teacher that has:
        a string instance variable called teacherName
        a constructor method that simply inform the user about the creation of a Teacher object
        a method assignGrade() that
        takes 2 params:
        alum of type Student
        a int finalGrade
        assigns finalGrade to the Student's grade
        define a testing class where you:
        create 2 students
        create 1 teacher
        assign a name to the teacher
        assign grades to the 2 students
        prints the students' details*/
