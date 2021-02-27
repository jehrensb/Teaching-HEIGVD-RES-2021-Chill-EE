package ch.heigvd.res.chill.domain.zoubaidas;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CeltiaTest {

    @Test
    void thePriceAndNameForCeltiaShouldBeCorrect() {
        Celtia beer = new Celtia();
        assertEquals(beer.getName(), Celtia.NAME);
        assertEquals(beer.getPrice(), Celtia.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCeltia() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.zoubaidas.Celtia";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Celtia.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}