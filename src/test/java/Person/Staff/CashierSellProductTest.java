package Person.Staff;

import Person.Customer;
import Products.Product;
import Enum.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CashierSellProductTest {

    @Test
    void sellProductToTheCustomerWhenPaymentIsSuccessful() {
        Customer customer = new Customer(
                "Bende White", "bendewhite@gmail.com", "232323729", 32, Gender.Female,
                "Texas", "Houston", PaymentOption.CARD, Boolean.TRUE );

        Cashier cashier = new Cashier("Nancy Games", "nancygames@gmail.com",
                "8345832", 22, Gender.Male, 1500.0, Boolean.TRUE);

        Product product = new Product(
                "Beverages", "RicheTea",
                320, 5, Category.Beverages);

        String result =cashier.sellProduct(product, customer);
        Assertions.assertEquals("Your Order is successful", result);
    }

    @Test
    void doNotSellProductToTheCustomerWhenPaymentIsNotSuccessful() {
        Customer customerX = new Customer(
                "Garden Teams", "gardenteams@gmail.com",
                "232323729", 32, Gender.Male,
                "Texas", "Whitehall",
                PaymentOption.CARD, Boolean.FALSE );

        Cashier cashierX = new Cashier("Tither Pitt",
                "tpitt@gmail.com", "8345832",
                33, Gender.Male, 1500.0, Boolean.FALSE);

        Product productX = new Product(
                "Beverages", "RicheTea",
                320, 5, Category.Beverages);

        String result = cashierX.sellProduct(productX, customerX);
        Assertions.assertEquals("Your purchase is not successful", result);
    }
}
