import java.util.ArrayList;

public class Student {
    String name;
    String grade;
    ArrayList<String> courses;

    // Constructor method
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add course
    public void addCourse(String course) {
        courses.add(course);
    }

    // Method to remove course
    public void removeCourse(String course) {
        courses.remove(course);
    }

    // Method to display courses
    public void displayCourses() {
        System.out.println("Courses: " + courses);
    }

    public static void main(String[] args) {
        // Creates student object
        Student student = new Student("Nitsua", "12th grade");

        // Add courses
        student.addCourse("Java Programming");
        student.addCourse("Horticulture");

        // Display courses
        student.displayCourses();

        // Remove course
        student.removeCourse("Horticulture");

        // Display courses again
        student.displayCourses();
    }
}
