package src.game;

// import java.util.Scanner;
import java.util.ArrayList;
import src.game.space.*;

public class Player {

  private final String name;
  private int position = 0;
  private int money = 1500;
  private static Player[] players;
  private boolean passed = false;
  private ArrayList<Buyable> properties = new ArrayList<Buyable>();

  public Player(String playerName) {
    name = playerName;
  }

  public static Player getPlayer(int index) {
    return players[index];
  }

  public String getName() {
    return name;
  }

  public int getMoney() {
    return money;
  }

  public void changeMoney(int amount) {
    money += amount;
  }

  public int getPosition() {
    return position;
  }

  public boolean ownsProperty(Buyable item) {
    return properties.contains(item);
  }

  public void addProperty(Buyable item) {
    properties.add(item);
  }

  public int getTotalProperties() {
    return properties.size();
  }

  public Buyable getProperty(int index) {
    return properties.get(index);
  }

  public void changePosition(int change) {
    passed = false;
    position = position + change;
    if (position >= 40) {
      position -= 40;
      passed = true;
      changeMoney(200);
    } else if (position < 0) {
      position += 40;
    }
  }

  public void setPosition(int newPosition) {
    position = newPosition % 40;
  }

  public boolean getPassed() {
    return passed;
  }
  
  public static int getTotalPlayers() {
    int total = 0;
    for (Player i : players) {
      if (i.getMoney() > 0) {
        total += 1;
      }
    }
    return total;
  }

  public static void makePlayers(/*Scanner scanner*/) {
    // System.out.print("Type number of players: ");
    // int totalPlayers = scanner.nextInt();
    int totalPlayers = UI.getTotalPlayers();
    players = new Player[totalPlayers];
    // scanner.nextLine();
    for (int i = 0; i < totalPlayers; i++) {
      // System.out.print("Player "+i+" name: ");
      // players[i] = new Player(scanner.nextLine());
      players[i] = new Player(UI.getPlayerName(i));
    }
  }

}
