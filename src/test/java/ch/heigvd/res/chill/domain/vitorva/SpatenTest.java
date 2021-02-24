package ch.heigvd.res.chill.domain.vitorva;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpatenTest {

    @Test
    void thePriceAndNameForSpatenShouldBeCorrect() {
        Spaten beer = new Spaten();
        assertEquals(beer.getName(), Spaten.NAME);
        assertEquals(beer.getPrice(), Spaten.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSpaten() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.vitorva.Spaten";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Spaten.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
