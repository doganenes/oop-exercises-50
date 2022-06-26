import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Course c1 = new Course("Enes", "Doğan", "Java 101");
        Course c2 = new Course("Baki", "Salık", "Algorithm 101");
        Course c3 = new Course("Ezgi", "Şeker", "Algebra 101");


        List<Course> courses = new ArrayList<>();
        courses.add(c1);
        courses.add(c2);
        courses.add(c3);

        // print name and surname of students
        for (int i = 0; i < courses.size(); i++) {

            System.out.println("Student name: " + courses.get(i).getName() +
                    "\nStudent surname: " + courses.get(i).getSurname());
            System.out.println();
        }

        // printing courseName for each students.
        System.out.println("Recording course names are: ");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(courses.get(i).getCourseName());
        }

        // printing student name, surname and courses they are enrolled in
        System.out.println();
        for (int i = 0; i < courses.size(); i++) {

            System.out.println("Student name and surname: " + courses.get(i).getName() + " " + courses.get(i).getSurname() +
                    " | Course Name: " + courses.get(i).getCourseName());

        }
    }
}
