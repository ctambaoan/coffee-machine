package command;

import domain.CoffeeMachine;
import io.ConsoleIO;

public class CleanCommand implements Command {

  @Override
  public boolean execute(CoffeeMachine machine, ConsoleIO io) {
    io.print("I have been cleaned!");
    machine.clean();
    return true;
  }

  @Override
  public String name() {
    return "clean";
  }
}
