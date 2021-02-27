package ch.heigvd.res.chill.domain.LordTT;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.LordTT.Swaf;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SwafTest {

    @Test
    void thePriceAndNameForSwafShouldBeCorrect() {
        Swaf beer = new Swaf();
        assertEquals(beer.getName(), Swaf.NAME);
        assertEquals(beer.getPrice(), Swaf.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForSwaf() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.LordTT.Swaf";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Swaf.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}