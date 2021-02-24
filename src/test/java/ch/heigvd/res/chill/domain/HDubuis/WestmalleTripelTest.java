package ch.heigvd.res.chill.domain.HDubuis;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.HDubuis.WestmalleTripel;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WestmalleTripelTest {
    @Test
    void thePriceAndNameForWestmalleTripelShouldBeCorrect() {
        WestmalleTripel beer = new WestmalleTripel();
        assertEquals(beer.getName(), WestmalleTripel.NAME);
        assertEquals(beer.getPrice(), WestmalleTripel.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForWestmalleTripel() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.HDubuis.WestmalleTripel";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = WestmalleTripel.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}