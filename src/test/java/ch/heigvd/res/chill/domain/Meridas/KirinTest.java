package ch.heigvd.res.chill.domain.Meridas;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KirinTest {

    @Test
    void thePriceAndNameForKirinShouldBeCorrect() {
        Kirin beer = new Kirin();
        assertEquals(beer.getName(), Kirin.NAME);
        assertEquals(beer.getPrice(), Kirin.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForKirin() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Meridas.Kirin";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Kirin.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}