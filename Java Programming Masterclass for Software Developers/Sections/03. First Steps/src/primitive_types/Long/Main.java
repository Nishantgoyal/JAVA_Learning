package primitive_types.Long;

public class Main {
  public static void main(String[] args) {

    // Long
    long myMinLongValue = Long.MIN_VALUE;
    long myMaxLongValue = Long.MAX_VALUE;
    System.out.println("Long Min Value: " + myMinLongValue);
    System.out.println("Long Max Value: " + myMaxLongValue);
    System.out.println("Busted Max Value: " + (myMaxLongValue + 1));
    System.out.println("Busted Min Value: " + (myMinLongValue - 1));
  }
}