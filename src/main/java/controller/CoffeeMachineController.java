package controller;

import command.CommandRegistry;
import domain.CoffeeMachine;
import io.ConsoleIO;

public enum CoffeeMachineController {
  INSTANCE(CoffeeMachine.INSTANCE, ConsoleIO.INSTANCE, CommandRegistry.INSTANCE);

  private final CoffeeMachine machine;
  private final CommandRegistry commands;
  private final ConsoleIO io;

  CoffeeMachineController(CoffeeMachine machine, ConsoleIO io, CommandRegistry commands) {
    this.machine = machine;
    this.io = io;
    this.commands = commands;
  }

  public void run() {
    var shouldContinue = true;
    while (shouldContinue) {
      io.print("\nWrite action (buy, fill, take, clean, remaining, exit):");
      var action = io.readLine();
      var command = commands.get(action);
      if (command == null) {
        io.print("Invalid action!");
        continue;
      }
      shouldContinue = command.execute(machine, io);
    }
    io.close();
  }
}