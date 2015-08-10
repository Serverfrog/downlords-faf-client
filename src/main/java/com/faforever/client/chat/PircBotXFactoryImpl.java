package com.faforever.client.chat;

import org.pircbotx.Configuration;
import org.pircbotx.PircBotX;

public class PircBotXFactoryImpl implements PircBotXFactory {

  @Override
  public PircBotX createPircBotX(Configuration<PircBotX> configuration) {
    return new PircBotX(configuration);
  }
}
