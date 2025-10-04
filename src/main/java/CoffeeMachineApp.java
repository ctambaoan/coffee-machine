import controller.CoffeeMachineController;

public class CoffeeMachineApp {

  public static void main(String[] args) {
    CoffeeMachineController controller = CoffeeMachineController.INSTANCE;
    controller.run();
  }
}
