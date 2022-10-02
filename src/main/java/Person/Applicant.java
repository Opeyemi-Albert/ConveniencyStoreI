package Person;

import Enum.Qualification;
import Enum.Gender;

public class Applicant extends Person {
    private Qualification qualification;


    public Applicant(String fullName, String email, String phone, Integer age, Gender gender, Qualification qualification, Boolean isApplicationSuccessful) {
        super(fullName, email, phone, age, gender);
        this.qualification = qualification;
    }

    public Applicant() {
    }

    public Qualification getQualification() {return qualification;}

    public void setQualification(Qualification qualification) {this.qualification = qualification;}

    @Override
    public String toString() {
        return "ApplicantService{" +
                "qualification=" + qualification +
                ", isApplicationSuccessful=" +
                '}';
    }

}
