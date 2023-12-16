import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseManagement {

    private CourseManagement() {
        throw new IllegalStateException("Utility class");
    }

    private static final List<Course> courses =  new ArrayList<>();

    private static final List<Student> students = new ArrayList<>();

    public static void addCourse(String name, String code, int maxCapacity) {
        Course course = new Course(name, code, maxCapacity);
        courses.add(course);
    }

    public static boolean enrollStudent(Student student, Course course) {
        if (course.getMaxCapacity() > Course.numEnrolled) {
            student.addCourse(course);
            students.add(student);
            Course.numEnrolled++;
            return true;
        }
        return false;
    }

    public static void assignGrade(Student student, Course course, int grade) {
        student.setGrade(course, grade);
    }

    public static Course getCourseByCode(String courseCode) {
        return courses.stream().filter(course -> course.getCode().equals(courseCode)).findFirst().orElse(null);
    }

    public static Student getStudentById(String studentId2) {
        return students.stream().filter(student -> student.getId().equals(studentId2)).findFirst().orElse(null);
    }

    public static int calculateOverallGrade(Student student) {
        int total = 0;
        for (Course course : student.getCourses()) {
            total += student.getGrades().get(course);
        }
        return total / student.getCourses().size();
    }

    public static List<Course> getCourses() {
        return Collections.unmodifiableList(courses);
    }

    public static List<Student> getStudents() {
        return Collections.unmodifiableList(students);
    }
}
