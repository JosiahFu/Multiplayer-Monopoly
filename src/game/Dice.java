package game;

import java.util.Random;

public class Dice {
  private static Random random = new Random();
  private static int last = 0;
  private static boolean rolledDouble = false;

  public static int rollDie() {
    return last = random.nextInt(6)+1;
  }

  public static int rollDice() {
    int die1 = rollDie();
    int die2 = rollDie();
    rolledDouble = die1 == die2;
    return last = die1 + die2;
  }

  public static int lastRoll() {
    return last;
  }

  public static boolean isDouble() {
    return rolledDouble;
  }

  public static int randomInt(int max) {
    return random.nextInt(max);
  }
}
