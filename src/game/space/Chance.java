package game.space;

import java.util.Collections;
import java.util.ArrayList;
import game.Player;

public class Chance extends Space {
  
  private static ArrayList<Integer> cards = new ArrayList<Integer>();

  public static void initCards() {
    for (int i = 0; i < 10; i++) {
      cards.add(i);
    }
    Collections.shuffle(cards);
  }

  // public static void

  public Chance() { 
    super("Chance");
  }
  
  public void onLand(Player player) {
    chanceEvent(player);
  }

  private void chanceEvent(Player player) {
    int chosenCard = cards.remove(0);
    cards.add(chosenCard);
    System.out.println("You picked card "+chosenCard);
  }
}