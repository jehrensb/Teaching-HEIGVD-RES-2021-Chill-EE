package ch.heigvd.res.chill.domain.matt989253;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OldRasputinTest {

    @Test
    void thePriceAndNameForOldRasputinShouldBeCorrect() {
        OldRasputin beer = new OldRasputin();
        assertEquals(beer.getName(), OldRasputin.NAME);
        assertEquals(beer.getPrice(), OldRasputin.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForOldRasputin() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.matt989253.OldRasputin";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = OldRasputin.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}