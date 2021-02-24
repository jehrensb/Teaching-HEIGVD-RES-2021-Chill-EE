package ch.heigvd.res.chill.domain.bpotet;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.bpotet.Farmer;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FarmerTest {
    @Test
    void thePriceAndTheNameShouldMatch(){
        Farmer farmer = new Farmer();
        assertEquals(farmer.getName(), Farmer.NAME);
        assertEquals(farmer.getPrice(), Farmer.PRICE);
    }

    @Test
    void customerShouldCanBuyAFarmer(){
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.bpotet.Farmer";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Farmer.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
