/**
 * Keeps track of ID, fees (& total), name, grade.
 */
public class Student {
private int id, feesPaid, feesTotal, grade;
private String name;

    /**
     * To construct a student with the following;
     * Total fees is 4000, while fees paid starts at 0.
     * @param id The ID of a student: Unique value.
     * @param name Name is name.
     * @param grade Grade of a student; Or year.
     */
    public Student (int id, String name, int grade) {
        feesPaid = 0;
        feesTotal = 4000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    /**
     * Gets student name.
     * @return Returns name of student.
     */
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * Updates grade.
     * @param grade Grade of a student; Or year.
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Should update how much of the fees a student pays.
     * feesPaid = would change & update however much amount til it meets the total payment.
     * @param fees The amount of fees the student pays.
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalEarning(fees);
    }

    /**
     * Gets the remainder of the fees of a student.
     * @return Remainder of fee.
     */
   public int getRemainingFees() {
        return feesTotal - feesPaid;
   }
}
