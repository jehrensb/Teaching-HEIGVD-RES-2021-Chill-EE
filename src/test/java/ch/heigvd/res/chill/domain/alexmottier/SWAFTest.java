package ch.heigvd.res.chill.domain.alexmottier;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.alexisallemann.Feldschlosschen;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarbarTest {
    @Test
    void thePriceAndNameForBarbarShouldBeCorrect() {
        Barbar beer = new Barbar();
        assertEquals(beer.getName(), Barbar.NAME);
        assertEquals(beer.getPrice(), Barbar.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBarbar() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.alexmottier.Barbar";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Barbar.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
