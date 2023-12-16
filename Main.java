// import java.util.Scanner;
import java.io.BufferedReader;
import  java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Scanner scanner = new Scanner(System.in);
      BufferedReader reader = 
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1. Add new course\n2. Enroll new student\n3. Add course to a student\n4. Assign grade\n5. Calculate overall grade\n6. Exit\nEnter option: ");
        int option = Integer.parseInt(reader.readLine()) ;
      
        while (option != 6) {
            switch (option) {
                case 1:
                    System.out.print("Enter course name: ");
                    String name = reader.readLine();
                    System.out.print("Enter course code: ");
                    String code = reader.readLine();
                    System.out.print("Enter course max capacity: ");
                    int maxCapacity = Integer.parseInt(reader.readLine()) ;
                    CourseManagement.addCourse(name, code, maxCapacity);
                System.out.println("Course added successfully");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String studentName = reader.readLine();
                    System.out.print("Enter student id: ");
                    String studentId = reader.readLine();
                    Student student = new Student(studentName, studentId);
                    System.out.print("Enter course code: ");
                    String courseCode = reader.readLine();
                    Course course = CourseManagement.getCourseByCode(courseCode);
                    if (CourseManagement.enrollStudent(student, course))
                        System.out.println("Student enrolled successfully");
                    else
                        System.out.println("Student could not be enrolled, course is full");
                    break;
                case 3:
                    System.out.print("Enter student id: ");
                    String studentId1 = reader.readLine();
                    Student student1 = CourseManagement.getStudentById(studentId1);
                    System.out.print("Enter course code: ");
                    String courseCode1 = reader.readLine();
                    Course course1 = CourseManagement.getCourseByCode(courseCode1);
                    if (CourseManagement.enrollStudent(student1, course1))
                        System.out.println("Course added to a student successfully");
                    else
                        System.out.println("Course could not be added, course is full");
                    break;
                case 4:
                    System.out.print("Enter student id: ");
                    String studentId2 = reader.readLine();
                    Student student2 = CourseManagement.getStudentById(studentId2);
                    System.out.print("Enter course code: ");
                    String courseCode2 = reader.readLine();
                    Course course2 = CourseManagement.getCourseByCode(courseCode2);
                    System.out.print("Enter grade: ");
                    int grade = Integer.parseInt(reader.readLine()) ;
                    CourseManagement.assignGrade(student2, course2, grade);
                    System.out.println("Grade assigned successfully");
                    break;
                case 5:
                    System.out.print("Enter student id: ");
                    String studentId3 = reader.readLine();
                    Student student3 = CourseManagement.getStudentById(studentId3);
                    System.out.println("Overall grade: " + CourseManagement.calculateOverallGrade(student3));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.print("1. Add new course\n2. Enroll new student\n3. Add course to a student\n4. Assign grade\n5. Calculate overall grade\n6. Exit\nEnter option: ");
            option = Integer.parseInt(reader.readLine()) ;
        }
    }
}