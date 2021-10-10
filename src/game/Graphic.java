package src.game;

public class Graphic {
  private static final String reset = "\033[0m";
  private static final String green = "\033[32m";
  private static final String red = "\033[31m";
  private static final String yellow = "\033[93m";

  private static final String purple = "\033[35m";
  private static final String lblue = "\033[96m";
  private static final String pink = "\033[95m";
  private static final String orange = "\033[33m";
  private static final String lred = "\033[91m";
  private static final String blue = "\033[34m";
  private static final String gray = "\033[90m";

  public static final String bold = "\033[1m";
  public static final String italic = "\033[3m";
  public static final String uline = "\033[4m";

  private static final String house1 = green+"^"+reset;
  private static final String house2 = green+"2"+reset;
  private static final String house3 = green+"3"+reset;
  private static final String house4 = green+"4"+reset;
  private static final String hotel = red+"^"+reset;

  public static void clear() {
    System.out.print("\033[H\033[J");
  }

  private static String goToPosition(int x, int y) {
    return "\033["+(y+1)+";"+(x+1)+"H";
  }

  private static String goToPositionOrder(int position) {
    if (position < 10) {
      return goToPosition(41-4*position,21);
    } else if (position < 20) {
      return goToPosition(1,31-(2*position-10));
    } else if (position < 30) {
      return goToPosition(4*(position-20)+1,1);
    } else {
      return goToPosition(41,(2*(position-30))+1);
    }
  }

  public static void drawBoard() {
    System.out.println(
      "+-------------------------------------------+\n"+
      "|"+lred+bold+"P"+reset+"  |"+lred+uline+"K"+reset+"  |"+orange+"?"+reset+"  |"+lred+uline+"I"+reset+"  |"+lred+uline+"I"+reset+"  |"+gray+"R"+reset+"  |"+yellow+uline+"A"+reset+"  |"+yellow+uline+"V"+reset+"  |W  |"+yellow+uline+"M"+reset+"  |"+blue+bold+"G"+reset+"  |\n"+
      "|---+-----------------------------------+---|\n"+
      "|"+orange+uline+"N"+reset+"  |                                   |"+green+uline+"P"+reset+"  |\n"+
      "|---|                                   |---|\n"+
      "|"+orange+uline+"T"+reset+"  |            "+yellow+"+--------+"+reset+"             |"+green+uline+"N"+reset+"  |\n"+
      "|---|            "+yellow+"| C Chest|"+reset+"             |---|\n"+
      "|"+yellow+"C"+reset+"  |            "+yellow+"+--------+"+reset+"             |"+yellow+"C"+reset+"  |\n"+
      "|---|                                   |---|\n"+
      "|"+orange+uline+"J"+reset+"  |         _      _  _  _            |"+green+uline+"P"+reset+"  |\n"+
      "|---|    |\\/|| ||\\ || ||_|| ||  |_|     |---|\n"+
      "|"+gray+"R"+reset+"  |    |  ||_|| \\||_||  |_||__ |      |"+gray+"R"+reset+"  |\n"+
      "|---|           Java Edition            |---|\n"+
      "|"+pink+uline+"V"+reset+"  |                                   |"+orange+"?"+reset+"  |\n"+
      "|---|                                   |---|\n"+
      "|"+pink+uline+"S"+reset+"  |            "+orange+"+--------+"+reset+"             |"+blue+uline+"P"+reset+"  |\n"+
      "|---|            "+orange+"| Chance |"+reset+"             |---|\n"+
      "|E  |            "+orange+"+--------+"+reset+"             |T  |\n"+
      "|---|                                   |---|\n"+
      "|"+pink+uline+"C"+reset+"  |                                   |"+blue+uline+"B"+reset+"  |\n"+
      "|---+-----------------------------------+---|\n"+
      "|"+orange+bold+"J"+reset+"  |"+lblue+uline+"C"+reset+"  |"+lblue+uline+"V"+reset+"  |"+orange+"?"+reset+"  |"+lblue+uline+"O"+reset+"  |"+gray+"R"+reset+"  |T  |"+purple+uline+"B"+reset+"  |"+yellow+"C"+reset+"  |"+purple+uline+"M"+reset+"  |"+lred+bold+"<"+reset+"  |\n"+
      "+-------------------------------------------+"
    );
  }

  public static void drawPlayers(Player selectedPlayer) {
    for (int i = 0; i < Player.getTotalPlayers(); i++) {
      System.out.print(goToPositionOrder(Player.getPlayer(i).getPosition())+"\033[2C"+yellow+italic+Player.getPlayer(i).getName().toUpperCase().charAt(0)+reset);
    }
    System.out.print(goToPositionOrder(selectedPlayer.getPosition())+"\033[2C"+yellow+italic+selectedPlayer.getName().toUpperCase().charAt(0)+reset);
    System.out.print("\033[24;1H");
  }

  // public static void draw() {
    // for(int i = 0; i < 40; i++) {
    //   System.out.print(goToPositionOrder(i)+"^");
    // }
    // System.out.print(goToPosition(1,1)+"^");
    // System.out.print(goToPosition(2,1)+"H\033[22E");
  // }

}
