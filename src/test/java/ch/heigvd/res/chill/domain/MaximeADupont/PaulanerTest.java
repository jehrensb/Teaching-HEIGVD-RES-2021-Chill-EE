package ch.heigvd.res.chill.domain.MaximeADupont;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaulanerTest {
    @Test
    void thePriceAndNameForPaulanerShouldBeCorrect() {
        Paulaner beer = new Paulaner();
        assertEquals(beer.getName(), Paulaner.NAME);
        assertEquals(beer.getPrice(), Paulaner.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPaulaner() {
        int numberOfPaulaners = 4;
        Bartender franky = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MaximeADupont.Paulaner";
        OrderRequest request = new OrderRequest(numberOfPaulaners, productName);
        OrderResponse response = franky.order(request);
        BigDecimal expectedPrice = Paulaner.PRICE.multiply(new BigDecimal(numberOfPaulaners));
        assertEquals(expectedPrice,response.getTotalPrice());
    }
}