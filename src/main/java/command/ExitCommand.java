package command;

import domain.CoffeeMachine;
import io.ConsoleIO;

public class ExitCommand implements Command {

  @Override
  public boolean execute(CoffeeMachine machine, ConsoleIO io) {
    return false;
  }

  @Override
  public String name() {
    return "exit";
  }
}
