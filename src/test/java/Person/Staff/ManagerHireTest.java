package Person.Staff;
import Enum.*;
import Person.Applicant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ManagerHireTest {

    @Test
    void hireCashierAWithBSCQualificationOnly() {
        Applicant applicant = new Applicant(
                "Ade","ade@gmail.com", "12345432", 22,
                Gender.Male, Qualification.BSC, Boolean.TRUE);

        Manager manager = new Manager(
                "King", "king@boss.mann", "1191392",
                33, Gender.Male,500000.0);

        String result = manager.hireCashier(applicant);
        Assertions.assertEquals("Congratulations! You are hired", result);
    }
    @Test
    void doNotTakeCashierWithoutAQualificationBSc() {
        Applicant applicant = new Applicant(
                "Kyle","Kyle@gmail.com", "12345432", 22,
                Gender.Male, Qualification.HND, Boolean.TRUE);

        Manager manager = new Manager(
                "King", "king@boss.mann", "1191392",
                33, Gender.Male,500000.0);

        String result = manager.hireCashier(applicant);
        Assertions.assertEquals("You're not eligible for this position", result);
    }
}