package ch.heigvd.res.chill.domain.egremyb;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class HoegaardenTest {

    @Test
    void thePriceAndNameForHoegaardenShouldBeCorrect() {
        Hoegaarden beer = new Hoegaarden();
        assertEquals(beer.getName(), Hoegaarden.NAME);
        assertEquals(beer.getPrice(), Hoegaarden.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.egremyb.Hoegaarden";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Hoegaarden.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}