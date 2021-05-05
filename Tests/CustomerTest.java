import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CustomerTest {
    private Customer customer;

    @BeforeEach
    public void init() {
        customer = new Customer("Ian");
        Movie movie1 = new Movie("The Fast and the Furious 7", 1);
        Movie movie2 = new Movie("The Fast and the Furious 8", 2);
        Rental rental1 = new Rental(movie1, 5);
        Rental rental2 = new Rental(movie2, 7);

        customer.addRental(rental1);
        customer.addRental(rental2);
    }

    @Test
    public void checkStatement() {
        String expectedStatement = "Rental Record for Ian\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tThe Fast and the Furious 7\t\t5\t15.0\n" +
                "\tThe Fast and the Furious 8\t\t7\t7.5\n" +
                "Amount owed is 22.5\n" +
                "You earned 3 frequent renter points";

        Assertions.assertEquals(expectedStatement,customer.statement());
    }

}