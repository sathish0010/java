public class make_pi {

  public static int[] makePi() {
    return new int[] {3, 1, 4};
  }

  public static void main(String[] args) {
    int[] piDigits = makePi();

    System.out.print("makePi() → [");
    for (int i = 0; i < piDigits.length; i++) {
      System.out.print(piDigits[i]);
      if (i < piDigits.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");
  }
}
