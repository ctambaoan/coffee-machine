package command;

import domain.CoffeeMachine;
import io.ConsoleIO;

public interface Command {

  boolean execute(CoffeeMachine machine, ConsoleIO io);

  String name();
}
