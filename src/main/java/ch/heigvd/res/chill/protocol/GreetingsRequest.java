package ch.heigvd.res.chill.protocol;

import lombok.Data;

@Data
public class GreetingsRequest implements IMessage {

  private final String text;

}
