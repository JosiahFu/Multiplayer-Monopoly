package src.game.space;

import src.game.Player;
import src.game.UI;
// import java.util.Scanner;

public class Buyable extends Space {
  private int price;
  private int rent;
  private boolean owned = false;

  public Buyable(String spaceName, int propertyCost, int rentPrice) { 
    super(spaceName);
    price = propertyCost;
    rent = rentPrice;
  }

  public int getPrice() {
    return price;
  }

  public int getRentCost() {
    return rent;
  }

  public boolean getOwned() {
    return owned;
  }

  public Player getOwner() {
    if (owned) {
      for (int i = 0; i < Player.getTotalPlayers(); i++) {
        if (Player.getPlayer(i).ownsProperty(this)) {
          return Player.getPlayer(i);
        }
      }
    }
    return null;
  }

  @Override
  public void onLand(Player player) {
    if (owned) {
      // System.out.println("You paid $"+getRentCost()+" to "+getOwner().getName());
      player.changeMoney(-getRentCost());
      getOwner().changeMoney(getRentCost());
      UI.paidTo(getRentCost(), player, getOwner());
    } else {
      // System.out.println("Do you want to buy this property for $"+price+"? (y/n)");
      // System.out.print("> ");
      // boolean buying = scanner.nextLine().equalsIgnoreCase("y");
      boolean buying = UI.askBuy(price);
      if (buying) {
        owned = true;
        player.changeMoney(-price);
        player.addProperty(this);
        UI.bought(player, getName());
      }
    }
  }
}
