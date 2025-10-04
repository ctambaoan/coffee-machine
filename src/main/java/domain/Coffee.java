package domain;

public enum Coffee {
  ESPRESSO(250, 16, 0, 4),
  LATTE(350, 20, 75, 7),
  CAPPUCCINO(200, 12, 100, 6);

  private final int water;
  private final int beans;
  private final int milk;
  private final int cost;

  Coffee(int water, int beans, int milk, int cost) {
    this.water = water;
    this.beans = beans;
    this.milk = milk;
    this.cost = cost;
  }

  public int getWater() {
    return water;
  }

  public int getBeans() {
    return beans;
  }

  public int getMilk() {
    return milk;
  }

  public int getCost() {
    return cost;
  }
}
