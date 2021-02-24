package primitive_types.Short;

public class Main {
  public static void main(String[] args) {

    // Short
    short myMinShortValue = Short.MIN_VALUE;
    short myMaxShortValue = Short.MAX_VALUE;
    System.out.println("Short Min Value: " + myMinShortValue);
    System.out.println("Short Max Value: " + myMaxShortValue);
    System.out.println("Busted Max Value: " + (myMaxShortValue + 1));
    System.out.println("Busted Min Value: " + (myMinShortValue - 1)); // --> -2147483648

    // short myMaxIntTest = 2147483648;
  }
}