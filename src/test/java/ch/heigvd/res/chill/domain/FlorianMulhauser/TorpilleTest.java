package ch.heigvd.res.chill.domain.FlorianMulhauser;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TorpilleTest {

    @Test
    void thePriceAndNameForTorpilleShouldBeCorrect() {
        Torpille beer = new Torpille();
        assertEquals(beer.getName(), Torpille.NAME);
        assertEquals(beer.getPrice(), Torpille.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForTorpille() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.FlorianMulhauser.Torpille";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Torpille.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}