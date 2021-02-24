package ch.heigvd.res.chill.domain.matt989253;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IchnusaTest {

    @Test
    void thePriceAndNameForIchnusaShouldBeCorrect() {
        Ichnusa beer = new Ichnusa();
        assertEquals(beer.getName(), Ichnusa.NAME);
        assertEquals(beer.getPrice(), Ichnusa.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIchnusa() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.matt989253.Ichnusa";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Ichnusa.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
