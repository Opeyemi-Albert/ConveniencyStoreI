package Interface;

import Person.Customer;
import Products.Product;

public interface CustomerServices {
    public String buyProduct(Product product, Boolean isPaymentSuccessful);

}
