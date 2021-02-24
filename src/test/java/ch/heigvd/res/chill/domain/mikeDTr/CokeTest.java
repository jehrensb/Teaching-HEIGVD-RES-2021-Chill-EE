package ch.heigvd.res.chill.domain.mikeDTr;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CokeTest {
    @Test
    void thePriceAndNameForCokeShouldBeCorrect() {
        Coke beer = new Coke();
        assertEquals(beer.getName(), Coke.NAME);
        assertEquals(beer.getPrice(), Coke.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCoke() {
        int numberOfCoke = 4;
        Bartender franky = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.mikeDTr.Coke";
        OrderRequest request = new OrderRequest(numberOfCoke, productName);
        OrderResponse response = franky.order(request);
        BigDecimal expectedPrice = Coke.PRICE.multiply(new BigDecimal(numberOfCoke));
        assertEquals(expectedPrice,response.getTotalPrice());
    }
}