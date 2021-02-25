package ch.heigvd.res.chill.domain.Nono98;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LaFinDuMondeTest {

    @Test
    void thePriceAndNameForLaFinDuMondeShouldBeCorrect() {
        LaFinDuMonde beer = new LaFinDuMonde();
        assertEquals(beer.getName(), LaFinDuMonde.NAME);
        assertEquals(beer.getPrice(), LaFinDuMonde.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLaFinDuMonde() {
        Bartender alice = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Nono98.LaFinDuMonde";
        OrderRequest request = new OrderRequest(6, productName);
        OrderResponse response = alice.order(request);
        BigDecimal expectedTotalPrice = LaFinDuMonde.PRICE.multiply(new BigDecimal(6));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
