package ch.heigvd.res.chill.domain.DSDaniel;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoucanierRedAleTest {

    @Test
    void thePriceAndNameForBoucanierRedAleShouldBeCorrect() {
        BoucanierRedAle beer = new BoucanierRedAle();
        assertEquals(beer.getName(), BoucanierRedAle.NAME);
        assertEquals(beer.getPrice(), BoucanierRedAle.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoucanierRedAle() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.DSDaniel.BoucanierRedAle";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = BoucanierRedAle.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
