package ch.heigvd.res.chill.domain.qsaucy;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LAbbayeDeSaintBonChienTest {

    @Test
    void thePriceAndNameForLAbbayeDeSaintBonChienShouldBeCorrect() {
        LAbbayeDeSaintBonChien beer = new LAbbayeDeSaintBonChien();
        assertEquals(beer.getName(), LAbbayeDeSaintBonChien.NAME);
        assertEquals(beer.getPrice(), LAbbayeDeSaintBonChien.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForLAbbayeDeSaintBonChien() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.qsaucy.LAbbayeDeSaintBonChien";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = LAbbayeDeSaintBonChien.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}