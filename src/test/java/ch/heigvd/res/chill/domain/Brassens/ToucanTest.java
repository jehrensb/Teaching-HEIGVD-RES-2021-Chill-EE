package ch.heigvd.res.chill.domain.Brassens;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class ToucanTest {
    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Toucan toucan = new Toucan();
        assertEquals(toucan.getName(), Toucan.NAME);
        assertEquals(toucan.getPrice(), Toucan.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        final int Q = 3;
        String productName = "ch.heigvd.res.chill.domain.Brassens.Toucan";
        OrderRequest request = new OrderRequest(Q, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Toucan.PRICE.multiply(new BigDecimal(Q));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}