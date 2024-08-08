public class Test {
    public static void main(String[] args) {
       
        Student student = new Student("Mimi", "S123", "A");

        
        StudentView studentView = new StudentView();

        
        StudentController studentController = new StudentController(student, studentView);

        //updating the grade
        studentController.updateView();
        studentController.setStudentName("Mimi");
        studentController.setStudentGrade("A+");

        
        studentController.updateView();
    }
}