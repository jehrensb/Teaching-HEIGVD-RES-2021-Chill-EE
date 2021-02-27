package ch.heigvd.res.chill.domain.issolahma;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MooBeerTest {

    @Test
    void thePriceAndNameForWaterShouldBeCorrect() {
        MooBeer beer = new MooBeer();
        assertEquals(beer.getName(), MooBeer.NAME);
        assertEquals(beer.getPrice(), MooBeer.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWater() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.issolahma.MooBeer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = MooBeer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
