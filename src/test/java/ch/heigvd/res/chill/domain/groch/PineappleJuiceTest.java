package ch.heigvd.res.chill.domain.groch;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PineappleJuiceTest {

    @Test
    void thePriceAndNameForPineappleJuiceShouldBeCorrect() {
        PineappleJuice juice = new PineappleJuice();
        assertEquals(juice.getName(), PineappleJuice.NAME);
        assertEquals(juice.getPrice(), PineappleJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPineappleJuice() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.groch.PineappleJuice";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = PineappleJuice.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}