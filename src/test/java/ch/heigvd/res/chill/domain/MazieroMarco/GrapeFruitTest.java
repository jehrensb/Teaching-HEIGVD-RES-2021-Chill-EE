package ch.heigvd.res.chill.domain.MazieroMarco;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrapeFruitTest {

    @Test
    void thePriceAndNameForGrapeFruitShouldBeCorrect() {
        GrapeFruit drink = new GrapeFruit();
        assertEquals(drink.getName(), GrapeFruit.NAME);
        assertEquals(drink.getPrice(), GrapeFruit.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGrapeFruit() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MazieroMarco.GrapeFruit";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = GrapeFruit.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}