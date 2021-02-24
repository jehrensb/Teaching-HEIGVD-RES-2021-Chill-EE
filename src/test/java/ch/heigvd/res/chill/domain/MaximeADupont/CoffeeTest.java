package ch.heigvd.res.chill.domain.MaximeADupont;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CoffeeTest {
    @Test
    void thePriceAndNameForCoffeeShouldBeCorrect() {
        Coffee beverage = new Coffee();
        assertEquals(beverage.getName(), Coffee.NAME);
        assertEquals(beverage.getPrice(), Coffee.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCoffee() {
        int numberOfCoffees = 4;
        Bartender franky = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.MaximeADupont.Coffee";
        OrderRequest request = new OrderRequest(numberOfCoffees, productName);
        OrderResponse response = franky.order(request);
        BigDecimal expectedPrice = Coffee.PRICE.multiply(new BigDecimal(numberOfCoffees));
        assertEquals(expectedPrice,response.getTotalPrice());
    }
}