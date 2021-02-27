package ch.heigvd.res.chill.domain.fg1989;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.wasadigi.PunkIPA;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppleJuiceTest {

    @Test
    void thePriceAndNameForAppleJuiceShouldBeCorrect() {
        AppleJuice juice = new AppleJuice();
        assertEquals(juice.getName(), AppleJuice.NAME);
        assertEquals(juice.getPrice(), AppleJuice.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForAppleJuice() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fg1989.AppleJuice";
        OrderRequest request = new OrderRequest(5, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = AppleJuice.PRICE.multiply(new BigDecimal(5));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
