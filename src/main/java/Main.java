import Person.Applicant;
import Person.Customer;
import Person.Staff.Cashier;
import Person.Staff.Manager;
import Enum.*;
import Products.Product;
import org.junit.jupiter.api.Assertions;

public class Main {
    public static void main(String[] args) {

            //The Hire()
        Manager manager = new Manager("Elizabeth Simple","lizsimple@gmail.com", "867439843", 23, Gender.Female,2000.0);
        Applicant applicant = new Applicant("Matthew Great", "eff.g@gmail.com","875394542", 25, Gender.Male,Qualification.BSC,Boolean.TRUE);
        System.out.println(manager.hireCashier(applicant));

        Manager managerX = new Manager("Carl Max","carlmax@gmail.com", "8674398993", 44, Gender.Female,6000.0);
        Applicant applicantX = new Applicant("Throw Max", "throwmax.g@gmail.com","876694542", 27, Gender.Female,Qualification.HND,Boolean.TRUE);
        System.out.println(manager.hireCashier(applicantX));

        //The SellProduct()
        Customer customerY = new Customer(
                "Bende White", "bendewhite@gmail.com",
                "232323729", 32, Gender.Female,
                "Texas", "Houston",
                PaymentOption.CARD, Boolean.TRUE );

        Cashier cashierY = new Cashier("Nancy Games",
                "nancygames@gmail.com", "8345832",
                22, Gender.Male, 1500.0, Boolean.TRUE);

        Product productY = new Product(
                "Beverages", "RicheTea",
                320, 5, Category.Beverages);

        System.out.println(cashierY.sellProduct(productY, customerY));

        // The IssueReceipt()
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

        System.out.println(cashier.issueReceipt(product,customer));

        //The buyProduct();
            Customer customerZ = new Customer(
                    "Alan King", "alank@gmail.com", "232323729", 32, Gender.Female,
                    "Texas", "Houston", PaymentOption.CASH, Boolean.TRUE );

            Product productZ = new Product(
                    "Cereals", "Golden Moore",
                    1320, 7, Category.Beverages);

        System.out.println(customer.buyProduct(product, customer.getPaymentSuccessful()));
    }
}