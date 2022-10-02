package Person.Staff;

import Person.Customer;
import Products.Product;
import Enum.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashierIssueReceiptTest {

    @Test
    void issueReceiptOnlyWhenProductHasBeenSoldAndPaymentMade() {
        Customer customer = new Customer(
                "Bende White", "bendewhite@gmail.com",
                "232323729", 32, Gender.Female,
                "Texas", "Houston",
                PaymentOption.CARD, Boolean.TRUE);
        Cashier cashier = new Cashier("Ellen Goon",
                "tpitt@gmail.com", "8345832",
                33, Gender.Male, 1500.0, Boolean.FALSE);
        Product product = new Product(
                "Beverages", "RicheTea",
                320, 5, Category.Beverages);
        String result = cashier.issueReceipt(product, customer);
        Assertions.assertEquals("Thank you for your patronage", result);
    }
}