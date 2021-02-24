package ch.heigvd.res.chill.domain.gollgot;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class StrongbowTest {

    @Test
    void thePriceAndNameForStrongbowShouldBeCorrect() {
        Strongbow beer = new Strongbow();
        assertEquals(beer.getName(), Strongbow.NAME);
        assertEquals(beer.getPrice(), Strongbow.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForStrongbow() {
        Bartender jojo = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.gollgot.Strongbow";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = jojo.order(request);
        BigDecimal expectedTotalPrice = Strongbow.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}