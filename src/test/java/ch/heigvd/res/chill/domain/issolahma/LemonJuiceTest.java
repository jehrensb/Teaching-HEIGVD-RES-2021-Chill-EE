package ch.heigvd.res.chill.domain.issolahma;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LemonJuiceTest {
    @Test
    void thePriceAndNameForWaterShouldBeCorrect() {
        LemonJuice beer = new LemonJuice();
        assertEquals(beer.getName(), LemonJuice.NAME);
        assertEquals(beer.getPrice(), LemonJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWater() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.issolahma.LemonJuice";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LemonJuice.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
