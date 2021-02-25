package ch.heigvd.res.chill.domain.Nono98;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RivaleTest {

    @Test
    void thePriceAndNameForRivaleShouldBeCorrect() {
        Rivale beer = new Rivale();
        assertEquals(beer.getName(), Rivale.NAME);
        assertEquals(beer.getPrice(), Rivale.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForRivale() {
        Bartender britney = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Nono98.Rivale";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = britney.order(request);
        BigDecimal expectedTotalPrice = Rivale.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
