package ch.heigvd.res.chill.domain.doublei;

        import ch.heigvd.res.chill.domain.Bartender;
        import ch.heigvd.res.chill.protocol.OrderRequest;
        import ch.heigvd.res.chill.protocol.OrderResponse;
        import org.junit.jupiter.api.Test;

        import java.math.BigDecimal;

        import static org.junit.jupiter.api.Assertions.assertEquals;

class AmsterdamMaximatorTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        AmsterdamMaximator beer = new AmsterdamMaximator();
        assertEquals(beer.getName(), AmsterdamMaximator.NAME);
        assertEquals(beer.getPrice(), AmsterdamMaximator.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.doublei.AmsterdamMaximator";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = AmsterdamMaximator.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}