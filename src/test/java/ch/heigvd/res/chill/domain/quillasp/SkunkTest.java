package ch.heigvd.res.chill.domain.quillasp;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SkunkTest { 

    @Test
    void thePriceAndNameForSkunkShouldBeCorrect() {
        Skunk skunk = new Skunk();
        assertEquals(skunk.getName(), Skunk.NAME);
        assertEquals(skunk.getPrice(), Skunk.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSkunk() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.quillasp.Skunk";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Skunk.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
