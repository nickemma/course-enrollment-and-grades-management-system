import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private String name;
    private String id;

    private final List<Course> courses = new ArrayList<>();

    private final Map<Course, Integer> grades = new HashMap<>();

    public Student() {
    }

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void setGrade(Course course, int grade) {
        this.grades.put(course, grade);
    }

    public Map<Course, Integer> getGrades() {
        return grades;
    }
}
