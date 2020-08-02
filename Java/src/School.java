import java.util.List;

/**
 * Schools have multiple students & teachers, therefore a list is needed.
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalEarning, totalSpending;
    // There's just one totalEarning & totalSpending.

    /**
     * This constructs an object.
     * @param teachers List of teachers in the school.
     * @param students List of students in the school.
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalEarning = 0;
        totalSpending = 0;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the array list. If I had <List>, it would replace the whole list.
     * This is the reason I have Teacher class only.
     * @param teacher Adds a new teacher to list.
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
        students.add(student);
    }

    public int getTotalEarning() {
        return totalEarning;
    }

    /**
     * Adds to the total money of earnings from the school.
     * @param earnings Earnings supposed to be earned.
     */
    public static void updateTotalEarning(int earnings) {
        totalEarning += earnings;
    }

    public int getTotalSpending() {
        return totalSpending;
    }

    /**
     * Assigns earnings after expenses taken,
     * wherein expenses calculated are assigned to totalSpending.
     * @param expenses What is spent from earnings.
     */
    public static void updateTotalSpending(int expenses) {
        totalEarning -= expenses;
        totalSpending += expenses;
    }
}
