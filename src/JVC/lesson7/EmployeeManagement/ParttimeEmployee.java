package JVC.lesson7.EmployeeManagement;

public class ParttimeEmployee extends Employee {
    private long workHourNumber;

    public ParttimeEmployee(String name, int age, int level, int workHourNumber) {
        super(name, age, level);
        this.workHourNumber = workHourNumber;
    }

    public long getWorkHourNumber() {
        return workHourNumber;
    }

    public void setWorkHourNumber(int workHourNumber) {
        this.workHourNumber = workHourNumber;
    }

    public String toString3() {
        return "ParttimeEmployee{" +
                "workHourNumber=" + workHourNumber +
                '}';
    }
}