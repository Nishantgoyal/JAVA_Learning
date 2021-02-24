package primitive_types.Byte;

public class Main {
  public static void main(String[] args) {

    // Byte
    byte myMinByteValue = Byte.MIN_VALUE;
    byte myMaxByteValue = Byte.MAX_VALUE;
    System.out.println("Byte Min Value: " + myMinByteValue);
    System.out.println("Byte Max Value: " + myMaxByteValue);
    System.out.println("Busted Max Value: " + (myMaxByteValue + 1));
    System.out.println("Busted Min Value: " + (myMinByteValue - 1));
  }
}