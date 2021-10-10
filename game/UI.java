package game;

import java.util.Scanner;
import game.space.Space;

public class UI {
  private static Scanner scanner = new Scanner(System.in);
  
  public static int getTotalPlayers() {
    System.out.print("Type number of players: ");
    return scanner.nextInt();
  }

  public static String getPlayerName(int number) {
    if(number == 0) {
      scanner.nextLine(); // For some reason the scanner skips one input so this is to catch that
    }
    System.out.print("Player "+number+" name: ");
    return scanner.nextLine();
  }

  public static void printBalance(Player selectedPlayer) {
    System.out.println("Balance: $"+selectedPlayer.getMoney());
  }

  public static void printPlayerInfo(Player selectedPlayer) {
    System.out.println(selectedPlayer.getName().toUpperCase()+"'S TURN");
    // System.out.println("Balance: $"+selectedPlayer.getMoney());
    printBalance(selectedPlayer);
    if (selectedPlayer.getTotalProperties() > 0) {
      System.out.println("Owned properties:");
      for (int j = 0; j < selectedPlayer.getTotalProperties(); j++) {
        System.out.println("  "+selectedPlayer.getProperty(j).getName());
      }
    } else {
      System.out.println("No owned properties");
    }
    System.out.println();
  }

  public static int rollDice() {
    System.out.print("Press enter to roll dice ");
    scanner.nextLine();
    return Dice.rollDice();
  }

  public static void printEnd(Player selectedPlayer) {
    System.out.println("Press enter to roll dice ");
    System.out.println("You rolled "+Dice.lastRoll());
    if (Dice.isDouble()) {
      System.out.println("You rolled doubles");
    }
    System.out.println();
    if (selectedPlayer.getPassed()) {
      System.out.println("You passed Go and collected $200\n");
    }
    System.out.println("You landed on "+Space.getSpace(selectedPlayer.getPosition()).getName());
    Space.getSpace(selectedPlayer.getPosition()).onLand(selectedPlayer); // This must be fixed
    System.out.println("\nPress enter to continue");
    scanner.nextLine();
  }

  public static void paidTo(int rent, Player selectedPlayer, Player owner) {
    System.out.println("You paid $"+rent+" to "+owner.getName());
    printBalance(selectedPlayer);
  }

  public static void payBank(Player selectedPlayer, int amount) {
    System.out.println("You paid $"+amount+" to the bank");
    printBalance(selectedPlayer);
  }

  public static boolean askBuy(int price) {
    System.out.println("Do you want to buy this property for $"+price+"? (y/n)");
    System.out.print("> ");
    boolean buying = scanner.nextLine().equalsIgnoreCase("y");
    return buying;
  }

  public static void bought(Player player, String name) {
    System.out.println("You bought "+name);
    printBalance(player);
  }
}