package ch.heigvd.res.chill.domain.groch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TomatoJuiceTest {

    @Test
    void thePriceAndNameForTomatoJuiceShouldBeCorrect() {
        TomatoJuice juice = new TomatoJuice();
        assertEquals(juice.getName(), TomatoJuice.NAME);
        assertEquals(juice.getPrice(), TomatoJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTomatoJuice() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.groch.TomatoJuice";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = TomatoJuice.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}