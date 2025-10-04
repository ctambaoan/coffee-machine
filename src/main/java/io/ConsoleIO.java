package io;

import java.util.Scanner;

public enum ConsoleIO {
  INSTANCE;

  private final Scanner scanner = new Scanner(System.in);

  public String readLine() {
    return scanner.nextLine().trim();
  }

  public void print(String message) {
    System.out.println(message);
  }

  public void close() {
    scanner.close();
  }
}
