package command;

import domain.CoffeeMachine;
import io.ConsoleIO;

public class TakeCommand implements Command {

  @Override
  public boolean execute(CoffeeMachine machine, ConsoleIO io) {
    io.print("\nHere's your $%d".formatted(machine.takeCash()));
    return true;
  }

  @Override
  public String name() {
    return "take";
  }
}
