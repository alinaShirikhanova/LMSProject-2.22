import model.Course;
import model.CourseEnrollment;
import model.Student;
import view.MainFrame;

class Main {
    public static void main(String[] args) {
        Student student = new Student("Vladimir", "Ivanov");
        Course java = new Course("Java", "для начинающих");
        student.addCourse(java);

        System.out.println(CourseEnrollment.getAllEnrollments());
        System.out.println(student.getCourses());
        MainFrame mainFrame = new MainFrame();

    }
}

