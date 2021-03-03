package ch.heigvd.res.chill.domain.mascot27;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoronaTest {

    @Test
    void thePriceAndNameForCoronaShouldBeCorrect() {
        Corona corona = new Corona();
        assertEquals(corona.getName(), Corona.NAME, "corona's name is incorrect");
        assertEquals(corona.getPrice(), Corona.PRICE, "corona's price is incorrect");
    }

    @Test
    void aBartenderShouldAcceptAndOrderForBfm() {
        String productName = "ch.heigvd.res.chill.domain.mascot27.Corona";
        int quantityToOrder = 3;
        Bartender bartender = new Bartender();
        OrderRequest request = new OrderRequest(quantityToOrder, productName);
        OrderResponse response = bartender.order(request);
        BigDecimal expectedTotalPrice = Corona.PRICE.multiply(new BigDecimal(quantityToOrder));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
