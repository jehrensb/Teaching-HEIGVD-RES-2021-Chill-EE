package ch.heigvd.res.chill.domain.alexmottier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SWAFTest {
    @Test
    void thePriceAndNameForSWAFShouldBeCorrect() {
        SWAF beer = new SWAF();
        assertEquals(beer.getName(), SWAF.NAME);
        assertEquals(beer.getPrice(), SWAF.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSWAF() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.alexmottier.SWAF";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = SWAF.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
