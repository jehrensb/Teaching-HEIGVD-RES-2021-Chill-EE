package ch.heigvd.res.chill.domain.MazieroMarco;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IceTeaTest {

    @Test
    void thePriceAndNameForIceTeaShouldBeCorrect() {
        IceTea drink = new IceTea();
        assertEquals(drink.getName(), IceTea.NAME);
        assertEquals(drink.getPrice(), IceTea.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForIceTea() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MazieroMarco.IceTea";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = IceTea.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}