package Person.Staff;

import Enum.*;
import Interface.ManagerServices;
import Person.Applicant;

public class Manager extends Staff implements ManagerServices {
    private String staffRecords;

    public Manager(String fullName, String email, String phone, Integer age, Gender gender, Double salary) {
        super(fullName, email, phone, age, gender, salary);
    }

    public Manager() {
    }

    @Override
    public String hireCashier(Applicant applicant) {
        if (applicant.getQualification().equals(Qualification.BSC)) {
            Cashier cashier = new Cashier();
            return "Congratulations! You are hired";
        } else
            return "You're not eligible for this position";
    }

    @Override
    public String toString() {
        return "Manager{" +
                "staffRecords='" + staffRecords + '\'' +
                '}';
    }
}
