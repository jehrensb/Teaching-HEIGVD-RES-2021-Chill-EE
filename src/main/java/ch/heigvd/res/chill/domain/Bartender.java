package ch.heigvd.res.chill.domain;

import ch.heigvd.res.chill.protocol.GreetingsRequest;
import ch.heigvd.res.chill.protocol.GreetingsResponse;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;

import java.math.BigDecimal;

public class Bartender {

  public GreetingsResponse greet(GreetingsRequest request) {
    return new GreetingsResponse("hello, how can I help you?");
  }

  public OrderResponse order(OrderRequest request) {
    String productName = request.getProductName();

    try {
      // let Java reflection do its magic
      IProduct product = (IProduct) Class.forName(productName).getDeclaredConstructor().newInstance();
      BigDecimal totalPrice = product.getPrice().multiply(new BigDecimal(request.getQuantity()));
      return new OrderResponse(totalPrice);
    } catch (Exception e) {
      return null;
    }
  }

}
