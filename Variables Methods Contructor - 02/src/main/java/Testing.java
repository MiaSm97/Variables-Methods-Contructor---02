public class Testing {
    public static void main(String[] args) {
        Student student1 = new Student("Mina");
        Student student2 = new Student("Tom");

        Teacher teacher = new Teacher("Nino");

        teacher.assignGrade(student1, 10);
        teacher.assignGrade(student2, 8);

        student1.getStudentDetails();
        student2.getStudentDetails();
    }
}
    /*define a testing class where you:
        create 2 students
        create 1 teacher
        assign a name to the teacher
        assign grades to the 2 students
        prints the students' details*/