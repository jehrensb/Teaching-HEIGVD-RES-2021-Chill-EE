package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HiteTest {

	@Test
	void thePriceAndNameForPunkIPAShouldBeCorrect() {
		Hite beer = new Hite();
		assertEquals(beer.getName(), Hite.NAME);
		assertEquals(beer.getPrice(), Hite.PRICE);
	}

	@Test
	void aBartenderShouldAcceptAnOrderForPunkIPA() {
		Bartender jane = new Bartender();
		String productName = "ch.heigvd.res.chill.domain.wasadigi.Hite";
		OrderRequest request = new OrderRequest(4, productName);
		OrderResponse response = jane.order(request);
		BigDecimal expectedTotalPrice = Hite.PRICE.multiply(new BigDecimal(4));
		assertEquals(expectedTotalPrice, response.getTotalPrice());
	}

}