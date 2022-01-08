package src.game.space;

// import java.util.Scanner;

public class Property extends Buyable {
  // private static int price;
  private int housePrice;
  private int[] rent;
  public int houses = 0;
  public int set;

  public Property(String spaceName, int propertyCost, int houseCost, int[] rentPrice, int propertySet) { 
    super(spaceName, propertyCost, 0);
    // price = propertyCost;
    housePrice = houseCost;
    rent = rentPrice;
    set = propertySet;
  }

  public int getHousePrice() {
    // return "House-DOS";
    return housePrice;
  }

  @Override
  public int getRentCost() {
    return rent[houses];
  }

  public int getHouses() {
    return houses;
  }

  public void addHouse() {
    if (houses <= 5) {
      houses += 1;
    }
  }
}
