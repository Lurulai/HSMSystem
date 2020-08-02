/**
 * Keeps track of salary, name, ID
 */
public class Teacher {
private int id, salary;
private String name;

    /**
     * Constructs a new teacher with the following;
     * @param id The ID of the teacher: Unique value.
     * @param name Name is name.
     * @param salary Salary is earnings.
     */
    public Teacher (int id, int salary, String name) {
        this.salary = salary;
        this.id = id;
        this.name = name;
    }

    /**
     * Gets & returns the desired name.
     * @return the name.
     * This goes for all the get methods below.
     */
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    /**
     * Sets salary.
     * @param salary Salary of the teacher.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary) {

    }
}
