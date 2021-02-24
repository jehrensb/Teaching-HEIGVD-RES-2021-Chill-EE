package ch.heigvd.res.chill.domain.Naludrag;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardinalTest {

    @Test
    void thePriceAndNameForCardinalShouldBeCorrect() {
        Cardinal beer = new Cardinal();
        assertEquals(beer.getName(), Cardinal.NAME);
        assertEquals(beer.getPrice(), Cardinal.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCardinal() {
        Bartender jack = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Naludrag.Cardinal";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jack.order(request);
        BigDecimal expectedTotalPrice = Cardinal.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
