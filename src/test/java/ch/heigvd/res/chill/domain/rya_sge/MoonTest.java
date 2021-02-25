package ch.heigvd.res.chill.domain.rya_sge;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    @Test
    void thePriceAndNameForMoonShouldBeCorrect() {
        Moon m = new Moon();
        assertEquals(m.getName(), Moon.NAME);
        assertEquals(m.getPrice(), Moon.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMoon() {
        Bartender b = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.rya_sge.Moon";
        OrderRequest r = new OrderRequest(50, productName);
        OrderResponse res = b.order(r);
        BigDecimal expectedTotalPrice = Moon.PRICE.multiply(new BigDecimal(50));
        assertEquals(res.getTotalPrice(), expectedTotalPrice);
    }
}