package ch.heigvd.res.chill.domain.Brassens;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class KwakTest {
    @Test
    void tourneeGeneraleShouldBeCorrect(){
        Kwak kwak = new Kwak();
        assertEquals(kwak.tourneeGenerale(), Kwak.TOURNEE_GENERALE);
    }

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Kwak kwak = new Kwak();
        assertEquals(kwak.getName(), Kwak.NAME);
        assertEquals(kwak.getPrice(), Kwak.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Brassens.Kwak";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Kwak.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}