package ch.heigvd.res.chill.domain.stephaneb1;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalvinusTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Calvinus beer = new Calvinus();
        assertEquals(beer.getName(), Calvinus.NAME);
        assertEquals(beer.getPrice(), Calvinus.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        ch.heigvd.res.chill.domain.Bartender jane = new ch.heigvd.res.chill.domain.Bartender();
        String productName = "ch.heigvd.res.chill.domain.stephaneb1.Calvinus";
        ch.heigvd.res.chill.protocol.OrderRequest request = new ch.heigvd.res.chill.protocol.OrderRequest(3, productName);
        ch.heigvd.res.chill.protocol.OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Calvinus.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
