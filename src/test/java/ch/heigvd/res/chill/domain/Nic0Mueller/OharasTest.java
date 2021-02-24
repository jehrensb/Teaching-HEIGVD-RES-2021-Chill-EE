package ch.heigvd.res.chill.domain.Nic0Mueller;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.IProduct;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class OharasTest {

    @Test
    void oharasPriceAndNameShouldBeCorrect() {
        IProduct beer = new Oharas();
        assertEquals(beer.getName(), Oharas.NAME);
        assertEquals(beer.getPrice(), Oharas.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForOharas() {
        Bartender trainee = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.Nic0Mueller.Oharas";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = trainee.order(request);
        BigDecimal expectedTotalPrice = Oharas.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}