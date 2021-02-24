package ch.heigvd.res.chill.domain.Naludrag;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BrewdogPunkIPATest {

    @Test
    void thePriceAndNameForBrewdogPunkIPAShouldBeCorrect() {
        BrewdogPunkIPA beer = new BrewdogPunkIPA();
        assertEquals(beer.getName(), BrewdogPunkIPA.NAME);
        assertEquals(beer.getPrice(), BrewdogPunkIPA.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBrewdogPunkIPA() {
        Bartender jack = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Naludrag.BrewdogPunkIPA";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jack.order(request);
        BigDecimal expectedTotalPrice = BrewdogPunkIPA.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
