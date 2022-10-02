package Person.Staff;

import Enum.Gender;
import Person.Person;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Staff extends Person {

    private static Integer noOfStaff = 0;
    private Integer staffID;
    private Double salary;

    public Staff(String fullName, String email, String phone, Integer age, Gender gender, Double salary) {
        super(fullName, email, phone, age, gender);
        noOfStaff++;
        this.staffID = noOfStaff;
        this.salary = salary;
    }

    public Staff() {

    }

    public static Integer getNoOfStaff() {
        return noOfStaff;
    }


    public Integer getStaffID() {
        return staffID;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
