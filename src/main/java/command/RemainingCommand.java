package command;

import domain.CoffeeMachine;
import io.ConsoleIO;

public class RemainingCommand implements Command {

  @Override
  public boolean execute(CoffeeMachine machine, ConsoleIO io) {
    io.print(machine.getRemainingIngredients());
    return true;
  }

  @Override
  public String name() {
    return "remaining";
  }
}
