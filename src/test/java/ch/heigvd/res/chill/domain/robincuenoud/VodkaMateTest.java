package ch.heigvd.res.chill.domain.robincuenoud;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.robincuenoud.VodkaMate;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class VodkaMateTest {

    @Test
    void thePriceAndNameForVodkaMateShouldBeCorrect() {
        VodkaMate beer = new VodkaMate();
        assertEquals(beer.getName(), VodkaMate.NAME);
        assertEquals(beer.getPrice(), VodkaMate.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForVodkaMate() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.robincuenoud.VodkaMate";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = VodkaMate.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}