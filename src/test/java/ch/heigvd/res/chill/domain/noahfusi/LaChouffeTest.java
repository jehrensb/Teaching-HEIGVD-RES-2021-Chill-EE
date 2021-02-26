package ch.heigvd.res.chill.domain.noahfusi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.Boxer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaChouffeTest {

    @Test
    void thePriceAndNameForLaChouffeShouldBeCorrect() {
        LaChouffe beer = new LaChouffe();
        assertEquals(beer.getName(), LaChouffe.NAME);
        assertEquals(beer.getPrice(), LaChouffe.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaChouffe() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.noahfusi.LaChouffe";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LaChouffe.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
