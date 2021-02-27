package ch.heigvd.res.chill.domain.CassandreWoj;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StellaTest {
    @Test
    void thePriceAndNameForStellaShouldBeCorrect() {
        Stella beer = new Stella();
        assertEquals(beer.getName(), Stella.NAME);
        assertEquals(beer.getPrice(), Stella.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForStella() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.CassandreWoj.Stella";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Stella.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
