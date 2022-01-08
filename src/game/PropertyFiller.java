package src.game;

import java.util.ArrayList;
import src.game.space.*;

public class PropertyFiller {

  public static void fillSpaces(ArrayList<Space> spaces) {
    String[] chosenNames = classicSpaces; // Change this

    spaces.add(new Space("Go"));
    spaces.add(new Property("Mediterranean Avenue", 60, 50, new int[]{2,10,50,100,150,200}, 0));
    spaces.add(new Space("Community Chest"));
    spaces.add(new Property("Baltic Avenue", 60, 50, new int[]{2,10,50,100,150,200}, 0));
    spaces.add(new MoneySpace("Income Tax", 1, 10));
    spaces.add(new Buyable("Reading Railroad", 200, 50));
    spaces.add(new Property("Oriental Avenue", 100, 50, new int[]{10,20,30,40,50,60}, 1));
    spaces.add(new Chance());
    spaces.add(new Property("Vermont Avenue", 100, 50, new int[]{10,20,30,40,50,60}, 1));
    spaces.add(new Property("Connecticut Avenue", 120, 50, new int[]{10,20,30,40,50,60}, 1));
    spaces.add(new Space("Just Visiting"));
    spaces.add(new Property("St. Charles Place", 140, 100, new int[]{10,20,30,40,50,60}, 2));
    spaces.add(new Buyable("Electric Company", 150, 10));
    spaces.add(new Property("States Avenue", 140, 100, new int[]{10,20,30,40,50,60}, 2));
    spaces.add(new Property("Virginia Avenue", 160, 100, new int[]{10,20,30,40,50,60},2));
    spaces.add(new Buyable("Pennsylvania Railroad", 200, 50));
    spaces.add(new Property("St. James Place", 180, 100, new int[]{10,20,30,40,50,60}, 3));
    spaces.add(new Space("Community Chest"));
    spaces.add(new Property("Tennessee Avenue", 180, 100, new int[]{10,20,30,40,50,60}, 3));
    spaces.add(new Property("New York Avenue", 200, 100, new int[]{10,20,30,40,50,60}, 3));
    spaces.add(new Space("Free Parking"));
    spaces.add(new Property("Kentucky Avenue", 220, 150, new int[]{10,20,30,40,50,60}, 4));
    spaces.add(new Chance());
    spaces.add(new Property("Indiana Avenue", 220, 150, new int[]{10,20,30,40,50,60}, 4));
    spaces.add(new Property("Illinois Avenue", 240, 150, new int[]{10,20,30,40,50,60}, 4));
    spaces.add(new Buyable("B & O Railroad", 200, 50));
    spaces.add(new Property("Atlantic Avenue", 260, 150, new int[]{10,20,30,40,50,60}, 5));
    spaces.add(new Property("Vermont Avenue", 260, 150, new int[]{10,20,30,40,50,60}, 5));
    spaces.add(new Buyable("Water Works", 150, 10));
    spaces.add(new Property("Marvin Gardens", 280, 150, new int[]{10,20,30,40,50,60}, 5));
    spaces.add(new Space("Go to Jail"));
    spaces.add(new Property("Pacific Avenue", 300, 200, new int[]{10,20,30,40,50,60}, 6));
    spaces.add(new Property("North Carolina Avenue", 300, 200, new int[]{10,20,30,40,50,60}, 6));
    spaces.add(new Space("Community Chest"));
    spaces.add(new Property("Pennsylvania Avenue", 320, 200, new int[]{10,20,30,40,50,60}, 6));
    spaces.add(new Buyable("Short Line", 200, 50));
    spaces.add(new Chance());
    spaces.add(new Property("Park Place", 350, 200, new int[]{10,20,30,40,50,60}, 7));
    spaces.add(new MoneySpace("Luxury Tax", 0, 75));
    spaces.add(new Property("Boardwalk", 400, 200, new int[]{10,20,30,40,50,60}, 7));

    if (chosenNames != classicSpaces) {
      for (int i = 0; i < 40; i++) {
        spaces.get(i).setName(chosenNames[i]);
      }
    }
  }
 
  private static String[] classicSpaces;

  private static String[] programmer = {
    "Compile",
    "BASIC",
    "Open-Source",
    "Fortran",
    "Activate Windows",
    "Microsoft Word",
    "C/C#",
    "RNG",
    "Pascal",
    "Bash",
    "White-hat",
    "JavaScript",
    "IEEE",
    "Python",
    "Stack overflow",
    "Notepad++",
    "TypeScript",
    "Open-Source",
    "",
    "",
    "GitHub Pro",
    "",
    "RNG",
    "",
    "Oracle",
    "IntelliJ IDEA",
    "Xerox",
    "Microsoft",
    "AT&T",
    "IBM",
    "Caught Hacking",
    "C++",
    "Java",
    "Open-Source",
    "Bell Laboratories",
    "Visual Studio Code",
    "RNG",
    "GNU/Linux",
    "Upgrade to Linux",
    "Google"
  };
}
