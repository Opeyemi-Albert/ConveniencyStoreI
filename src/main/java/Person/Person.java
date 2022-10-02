package Person;

import Enum.Gender;

public abstract class Person {
        private String fullName;
        private String email;
        private String phone;
        private Integer age;
        private Gender gender;

    public Person(String fullName, String email, String phone, Integer age, Gender gender) {
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
    }

    public String getFullName() {return fullName;}

    public void setFullName(String fullName) {this.fullName = fullName;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public String getPhone() {return phone;}

    public void setPhone(String phone) {this.phone = phone;}

    public Integer getAge() {return age;}

    public void setAge(Integer age) {this.age = age;}

    public Gender getGender() {return gender;}

    public void setGender(Gender gender) {this.gender = gender;}

    @Override
    public String toString() {
        return "Person{" +
                "fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
