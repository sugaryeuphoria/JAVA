public class PasswordChecker {
  public static void main(String[] args) {
    String superSecretPassword = "unicorns";  // Unicorns are awesome!
    String userGuess = "rainbows";  // Maybe try "unicorns" next time?
    if (userGuess.equals(superSecretPassword)) {
      System.out.println("Access granted! You're super cool!");
    } else {
      System.out.println("Nope! Try again, silly.");
    }
  }
}

