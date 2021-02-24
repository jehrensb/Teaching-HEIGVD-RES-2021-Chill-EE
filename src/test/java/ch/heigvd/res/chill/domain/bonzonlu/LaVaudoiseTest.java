package ch.heigvd.res.chill.domain.bonzonlu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LaVaudoiseTest {

    @Test
    void thePriceAndNameForLaVaudoiseShouldBeCorrect() {
        LaVaudoise beer = new LaVaudoise();
        assertEquals(beer.getName(), LaVaudoise.NAME);
        assertEquals(beer.getPrice(), LaVaudoise.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaVaudoise() {
        int numberOfLaVaudoise = 4;
        Bartender nico = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.bonzonlu.LaVaudoise";
        OrderRequest request = new OrderRequest(numberOfLaVaudoise, productName);
        OrderResponse response = nico.order(request);
        BigDecimal expectedPrice = LaVaudoise.PRICE.multiply(new BigDecimal(numberOfLaVaudoise));
        assertEquals(expectedPrice,response.getTotalPrice());
    }
}