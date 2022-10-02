package Person.Staff;

import Interface.CashierServices;
import Person.Customer;
import Products.Product;
import Enum.*;

public class Cashier extends Staff implements CashierServices {

    private Boolean isReceiptGenerated= Boolean.FALSE;

    public Cashier(String fullName, String email, String phone, Integer age, Gender gender, Double salary, Boolean isReceiptGenerated) {
        super(fullName, email, phone, age, gender, salary);
        this.isReceiptGenerated = isReceiptGenerated;
    }

    public Cashier() {
    }

    public Boolean getReceiptGenerated() {return isReceiptGenerated;}

    public void setReceiptGenerated(Boolean receiptGenerated) {isReceiptGenerated = receiptGenerated;}



    @Override
    public String sellProduct(Product product, Customer customer) {
        if (customer.getPaymentSuccessful().equals(Boolean.TRUE)) {
            issueReceipt(product, customer);
            return "Your Order is successful";
        }else{
            return "Your purchase is not successful";
        }
    }

    @Override
    public String issueReceipt(Product product, Customer customer) {
        return "Thank you for your patronage";
    }

}
