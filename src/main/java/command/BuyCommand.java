package command;

import domain.Coffee;
import domain.CoffeeMachine;
import io.ConsoleIO;

public class BuyCommand implements Command {

  @Override
  public boolean execute(CoffeeMachine machine, ConsoleIO io) {
    io.print("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");

    var selection = io.readLine();
    if ("back".equals(selection)) return true;
    var result = switch (selection) {
      case "1" -> machine.makeCoffee(Coffee.ESPRESSO);
      case "2" -> machine.makeCoffee(Coffee.LATTE);
      case "3" -> machine.makeCoffee(Coffee.CAPPUCCINO);
      default -> "\nInvalid Input!";
    };

    io.print(result);
    return true;
  }

  @Override
  public String name() {
    return "buy";
  }
}
