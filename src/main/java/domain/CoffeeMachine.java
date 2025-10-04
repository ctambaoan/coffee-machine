package domain;

public enum CoffeeMachine {
  INSTANCE;

  private int remainingWater;
  private int remainingMilk;
  private int remainingBeans;
  private int remainingCups;
  private int remainingCash;
  private int cleaningCounter;

  public static final int MAX_COFFEE_MADE_COUNT = 10;

  CoffeeMachine() {
    this.remainingWater = 400;
    this.remainingMilk = 540;
    this.remainingBeans = 120;
    this.remainingCups = 9;
    this.remainingCash = 550;
    this.cleaningCounter = 0;
  }

  public String makeCoffee(Coffee coffee) {
    if (cleaningCounter >= MAX_COFFEE_MADE_COUNT) {
      return "\nI need cleaning!";
    }
    if (remainingWater < coffee.getWater()) {
      return "\nSorry, not enough water!";
    }
    if (remainingMilk < coffee.getMilk()) {
      return "\nSorry, not enough milk!";
    }
    if (remainingBeans < coffee.getBeans()) {
      return "\nSorry, not enough coffee beans!";
    }
    if (remainingCups == 0) {
      return "\nSorry, not enough cups!";
    }

    remainingWater -= coffee.getWater();
    remainingMilk -= coffee.getMilk();
    remainingBeans -= coffee.getBeans();
    remainingCash += coffee.getCost();
    remainingCups--;
    cleaningCounter++;

    return "\nI have enough resources, making you a %s!".formatted(coffee.name().toLowerCase());
  }

  public String getRemainingIngredients() {
    return "\nThe coffee machine has:"
        + "\n%d ml of water".formatted(remainingWater)
        + "\n%d ml of milk".formatted(remainingMilk)
        + "\n%d g of coffee beans".formatted(remainingBeans)
        + "\n%d disposable cups".formatted(remainingCups)
        + "\n$%d of money".formatted(remainingCash)
        + "\n%d coffees made (for cleaning)".formatted(cleaningCounter);
  }

  public void fill(int water, int milk, int beans, int cups) {
    remainingWater += water;
    remainingMilk += milk;
    remainingBeans += beans;
    remainingCups += cups;
  }

  public int takeCash() {
    var temp = remainingCash;
    remainingCash = 0;
    return temp;
  }

  public void clean() {
    cleaningCounter = 0;
  }
}
