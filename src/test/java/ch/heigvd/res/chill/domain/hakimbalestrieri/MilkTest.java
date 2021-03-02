package ch.heigvd.res.chill.domain.hakimbalestrieri;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MilkTest {

    @Test
    void thePriceAndNameForFeldschlosschenShouldBeCorrect() {
        Milk beer = new Milk();
        assertEquals(beer.getName(), Milk.NAME);
        assertEquals(beer.getPrice(), Milk.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFeldschlosschen() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.hakimbalestrieri.Milk";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Milk.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
