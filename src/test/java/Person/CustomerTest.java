package Person;

import Products.Product;
import Enum.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static java.lang.Boolean.*;


class CustomerTest {

    @Test
    void CustomerCanBuyProductWhenPaymentIsSuccessful() {
        Customer customer = new Customer(
                "Alan King", "alank@gmail.com", "232323729", 32, Gender.Female,
                "Texas", "Houston", PaymentOption.CASH, Boolean.TRUE );

        Product product = new Product(
                "Cereals", "Golden Moore",
                1320, 7, Category.Beverages);

        String result = customer.buyProduct(product, customer.getPaymentSuccessful());
        Assertions.assertEquals("You've made payment for your goods successfully", result);
    }
    @Test
    void CustomerCannotBuyProductWhenPaymentIsNotSuccessful() {
        Customer customerX = new Customer(
                "Robert White", "rwhite@gmail.com", "232323729", 32, Gender.Female,
                "Texas", "Houston", PaymentOption.CASH, Boolean.FALSE );

        Product product = new Product(
                "Biscuit", "Golden Moore",
                1320, 7, Category.Beverages);

        String result = customerX.buyProduct(product,customerX.getPaymentSuccessful());
        Assertions.assertEquals("Your purchase is not successful", result);
    }
}