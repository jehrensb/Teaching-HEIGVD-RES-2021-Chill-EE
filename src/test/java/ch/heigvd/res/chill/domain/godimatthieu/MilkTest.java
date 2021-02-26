package ch.heigvd.res.chill.domain.godimatthieu;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class MilkTest {

    @Test
    void thePriceAndNameForBoxerShouldBeCorrect() {
        Milk drink = new Milk();
        assertEquals(drink.getName(), Milk.NAME);
        assertEquals(drink.getPrice(), Milk.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBoxer() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.godimatthieu.Milk";
        OrderRequest request = new OrderRequest(10, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Milk.PRICE.multiply(new BigDecimal(10));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}