package ch.heigvd.res.chill.domain.alexisallemann;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.alexisallemann.Feldschlosschen;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FeldschlosschenTest {

    @Test
    void thePriceAndNameForFeldschlosschenShouldBeCorrect() {
        Feldschlosschen beer = new Feldschlosschen();
        assertEquals(beer.getName(), Feldschlosschen.NAME);
        assertEquals(beer.getPrice(), Feldschlosschen.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForFeldschlosschen() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.alexisallemann.Feldschlosschen";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Feldschlosschen.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}