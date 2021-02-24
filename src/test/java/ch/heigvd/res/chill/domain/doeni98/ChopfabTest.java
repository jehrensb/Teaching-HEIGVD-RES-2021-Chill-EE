package ch.heigvd.res.chill.domain.doeni98;
import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChopfabTest {
    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Chopfab beer = new Chopfab();
        assertEquals(beer.getName(), Chopfab.NAME);
        assertEquals(beer.getPrice(), Chopfab.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForChopfab() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.doeni98.Chopfab";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Chopfab.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}