package src.game.space;

import java.util.ArrayList;
import src.game.Player;
import src.game.GameLoop;
// import java.util.Scanner;

public class Space {
  
  private String name;

  // public static void fill() {
  //   SpaceFiller.fillSpaces(spaces);
  // }

  public Space(String spaceName) { 
    name = spaceName;
  }

  public static Space getSpace(int position) {
    return GameLoop.spaces.get(position);
  }

  public void onLand(Player player) {
    
  }
  
  public String getName() {
    return name;
  }

  public void setName(String newName) {
    name = newName;
  }
  
}
