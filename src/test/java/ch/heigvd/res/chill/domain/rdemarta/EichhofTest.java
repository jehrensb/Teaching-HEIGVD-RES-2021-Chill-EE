package ch.heigvd.res.chill.domain.rdemarta;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EichhofTest {

    @Test
    void thePriceAndNameForEichhofShouldBeCorrect() {
        Eichhof beer = new Eichhof();
        assertEquals(beer.getName(), Eichhof.NAME);
        assertEquals(beer.getPrice(), Eichhof.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForEichhof() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.rdemarta.Eichhof";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Eichhof.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}