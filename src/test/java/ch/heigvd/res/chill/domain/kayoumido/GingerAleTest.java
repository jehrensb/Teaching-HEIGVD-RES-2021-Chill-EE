package ch.heigvd.res.chill.domain.kayoumido;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GingerAleTest {

    @Test
    void thePriceForGingerAleShoudBeCorrect() {
        GingerAle ga = new GingerAle();

        assertEquals(ga.getPrice(), GingerAle.PRICE);
    }

    @Test
    void theNameForGingerAlerShouldBeCorrect() {
        GingerAle ga = new GingerAle();

        assertEquals(ga.getName(), GingerAle.NAME);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGingerAle() {
        Bartender saoirse = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.kayoumido.GingerAle";
        OrderRequest request = new OrderRequest(2, productName);
        OrderResponse response = saoirse.order(request);
        BigDecimal expectedTotalPrice = GingerAle.PRICE.multiply(new BigDecimal(2));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}