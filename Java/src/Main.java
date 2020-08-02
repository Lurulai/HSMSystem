import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Teacher> teacherList = new ArrayList<>();
        List<Student> studentList = new ArrayList<>();

        // Teacher section.
        Teacher alan = new Teacher(1, 1500, "Alan Dighton");
        Teacher guy = new Teacher(2, 2000, "Guy Friss");
        Teacher chad = new Teacher(3, 3700, "Chad Price");

        teacherList.add(alan);
        teacherList.add(guy);
        teacherList.add(chad);

        // Student section.
        Student job = new Student(1, "Job Jobs", 3);
        Student william = new Student(2, "William Williams", 7);
        Student eddie = new Student(3, "Eddie Hall", 9);

        studentList.add(job);
        studentList.add(william);
        studentList.add(eddie);

        // Creating school object.
        School hsm = new School(teacherList, studentList);

        job.payFees(500);
        eddie.payFees(1000);
        job.payFees(200);
        System.out.println("HSM has earned " + hsm.getTotalEarning());
    }
}
