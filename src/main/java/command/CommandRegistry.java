package command;

import java.util.HashMap;
import java.util.Map;

public enum CommandRegistry {
  INSTANCE;

  private final Map<String, Command> map = new HashMap<>();

  CommandRegistry() {
    register(new BuyCommand());
    register(new ExitCommand());
    register(new RemainingCommand());
    register(new FillCommand());
    register(new TakeCommand());
    register(new CleanCommand());
  }

  private void register(Command command) {
    map.put(command.name(), command);
  }

  public Command get(String action) {
    return map.get(action);
  }
}
