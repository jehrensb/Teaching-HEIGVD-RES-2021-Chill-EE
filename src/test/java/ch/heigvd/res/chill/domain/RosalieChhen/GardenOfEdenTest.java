package ch.heigvd.res.chill.domain.RosalieChhen;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class GardenOfEdenTest {

    @Test
    void thePriceAndNameForGardenOfEdenShouldBeCorrect() {
        GardenOfEden beer = new GardenOfEden();
        assertEquals(beer.getName(), GardenOfEden.NAME);
        assertEquals(beer.getPrice(), GardenOfEden.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForGardenOfEden() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.RosalieChhen.GardenOfEden";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = GardenOfEden.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}