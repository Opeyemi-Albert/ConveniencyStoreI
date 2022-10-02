package Person;

import Enum.*;

import Interface.CustomerServices;
import Person.Person;
import Products.Product;

import java.time.LocalDate;

public class Customer extends Person implements CustomerServices {
    private String location;
    private String pickUpCentre;
    private PaymentOption paymentOption;
    private Boolean isPaymentSuccessful = Boolean.TRUE;

    public Customer(String fullName, String email, String phone, Integer age, Gender gender, String location, String pickUpCentre, PaymentOption paymentOption, Boolean isPaymentSuccessful) {
        super(fullName, email, phone, age, gender);
        this.location = location;
        this.pickUpCentre = pickUpCentre;
        this.paymentOption = paymentOption;
        this.isPaymentSuccessful = isPaymentSuccessful;
    }

    public Customer() {
    }


    public String getLocation() {return location;}

    public void setLocation(String location) {this.location = location;}

    public String getPickUpCentre() {return pickUpCentre;}

    public void setPickUpCentre(String pickUpCentre) {this.pickUpCentre = pickUpCentre;}

    public PaymentOption getPaymentOption() {return paymentOption;}

    public Boolean getPaymentSuccessful() {
        return isPaymentSuccessful;
    }

    public void setPaymentSuccessful(Boolean paymentSuccessful) {
        isPaymentSuccessful = paymentSuccessful;
    }

    @Override
    public String buyProduct(Product product, Boolean isPaymentSuccessful) {
        if (isPaymentSuccessful.equals(Boolean.TRUE)) {
            return "You've made payment for your goods successfully";
        }else{
            return "Your purchase is not successful";
        }
    }


    @Override
    public String toString() {
        return "Customer{" +
                "location='" + location + '\'' +
                ", pickUpCentre='" + pickUpCentre + '\'' +
                ", paymentOption=" + paymentOption +
                '}';
    }

}
