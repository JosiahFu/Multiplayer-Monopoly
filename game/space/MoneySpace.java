package game.space;

import game.Player;
import game.UI;

public class MoneySpace extends Space {

  int type; // 0: absolute 1: percentage 
  int value;

  public MoneySpace(String name, int valueType, int moneyValue) {
    super(name);
    type = valueType;
    value = moneyValue;
  }

  public void onLand(Player player) {
    if (type == 0) {
      player.changeMoney(-value);
      UI.payBank(player, value);
    } else if (type == 1) {
      player.changeMoney((player.getMoney() * -value) / 100);
      UI.payBank(player, (player.getMoney() * value) / 100);
    }
  }
}