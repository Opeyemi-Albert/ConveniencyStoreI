package Interface;

import Person.Customer;
import Products.Product;

public interface CashierServices {
    public String sellProduct(Product product, Customer customer);

    public String issueReceipt(Product product, Customer customer);
}
