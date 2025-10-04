package command;

import domain.CoffeeMachine;
import io.ConsoleIO;

public class FillCommand implements Command {

  @Override
  public boolean execute(CoffeeMachine machine, ConsoleIO io) {
    var water = getValidatedInt("\nWrite how many ml of water you want to add:", io);
    var milk = getValidatedInt("\nWrite how many ml of milk you want to add:", io);
    var beans = getValidatedInt("\nWrite how many grams of coffee beans you want to add:", io);
    var cups = getValidatedInt("\nWrite how many disposable cups you want to add:", io);

    machine.fill(water, milk, beans, cups);
    return true;
  }

  @Override
  public String name() {
    return "fill";
  }

  private int getValidatedInt(String prompt, ConsoleIO io) {
    while (true) {
      io.print(prompt);
      var input = io.readLine();
      try {
        var value = Integer.parseInt(input);
        if (value >= 0) {
          return value;
        }
        io.print("\nPlease enter a non-negative integer (0 or greater).");
      } catch (Exception e) {
        io.print("\nInvalid Input! Please enter a whole number.");
      }
    }
  }
}
