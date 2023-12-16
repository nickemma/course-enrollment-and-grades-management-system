import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. Add new course\n2. Enroll new student\n3. Add course to a student\n4. Assign grade\n5. Calculate overall grade\n6. Exit\nEnter option: ");
        int option = scanner.nextInt();

        while (option != 6) {
            switch (option) {
                case 1:
                    System.out.print("Enter course name: ");
                    String name = scanner.next();
                    System.out.print("Enter course code: ");
                    String code = scanner.next();
                    System.out.print("Enter course max capacity: ");
                    int maxCapacity = scanner.nextInt();
                    CourseManagement.addCourse(name, code, maxCapacity);
                    System.out.print("Course Added Successfully");
                    break;
                case 2:
                    System.out.print("Enter student name: ");
                    String studentName = scanner.next();
                    System.out.print("Enter student id: ");
                    String studentId = scanner.next();
                    Student student = new Student(studentName, studentId);
                    System.out.print("Enter course code: ");
                    String courseCode = scanner.next();
                    Course course = CourseManagement.getCourseByCode(courseCode);
                    if (CourseManagement.enrollStudent(student, course))
                        System.out.println("Student enrolled successfully");
                    else
                        System.out.println("Student could not be enrolled, course is full");
                    break;
                case 3:
                    System.out.print("Enter student id: ");
                    String studentId1 = scanner.next();
                    Student student1 = CourseManagement.getStudentById(studentId1);
                    System.out.print("Enter course code: ");
                    String courseCode1 = scanner.next();
                    Course course1 = CourseManagement.getCourseByCode(courseCode1);
                    if (CourseManagement.enrollStudent(student1, course1))
                        System.out.println("Course added successfully");
                    else
                        System.out.println("Course could not be added, course is full");
                    break;
                case 4:
                    System.out.print("Enter student id: ");
                    String studentId2 = scanner.next();
                    Student student2 = CourseManagement.getStudentById(studentId2);
                    System.out.print("Enter course code: ");
                    String courseCode2 = scanner.next();
                    Course course2 = CourseManagement.getCourseByCode(courseCode2);
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    CourseManagement.assignGrade(student2, course2, grade);
                    break;
                case 5:
                    System.out.print("Enter student id: ");
                    String studentId3 = scanner.next();
                    Student student3 = CourseManagement.getStudentById(studentId3);
                    System.out.println("Overall grade: " + CourseManagement.calculateOverallGrade(student3));
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
            System.out.print("1. Add new course\n2. Enroll new student\n3. Add course to a student\n4. Assign grade\n5. Calculate overall grade\n6. Exit\nEnter option: ");
            option = scanner.nextInt();
        }
    }
}