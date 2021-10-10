package game;
import game.space.Space;
import game.space.Chance;
import game.Player;
import game.PropertyFiller;
import game.Graphic;
import game.UI;
import game.Dice;
import java.util.ArrayList;

public class GameLoop {
  
  public static ArrayList<Space> spaces = new ArrayList<Space>();
  
  public static void runGame() {
    // Scanner scanner = new Scanner(System.in);


    Player.makePlayers(/*scanner*/);
    PropertyFiller.fillSpaces(spaces);
    Chance.initCards();

    Player selectedPlayer;

    while (Player.getTotalPlayers() > 1) {
      for (int i = 0; i < Player.getTotalPlayers(); i++) {
        selectedPlayer = Player.getPlayer(i);
        // System.out.println(Player.getPlayer(0).getPosition());
        Graphic.clear();
        Graphic.drawBoard();

        Graphic.drawPlayers(selectedPlayer);
        UI.printPlayerInfo(selectedPlayer);
        selectedPlayer.changePosition(UI.rollDice());
        Graphic.clear();
        Graphic.drawBoard();
        Graphic.drawPlayers(selectedPlayer);
        UI.printPlayerInfo(selectedPlayer);
        UI.printEnd(selectedPlayer);
        if (Dice.isDouble()) {
          i--;
        }
        // System.out.println(Dice.rollDice());
      }
    // System.out.println(Player.getPlayer(0).getPosition());
    }

    // System.out.println(Graphic.text());
  }
}