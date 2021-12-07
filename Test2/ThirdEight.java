public class ThirdEight {
  public static boolean meMaybe() {
    System.out.println("Hi");
    return false;
  }

  public static void sixteen(int a, int b, int c) {
    boolean test = ((a==b) || !(c<=b)) || meMaybe();
    System.out.println(test);
  }

  public static void main( String[] args ) {
    System.out.println("a ");
    sixteen(7,5,6);

    System.out.println("b ");
    sixteen(7,7,4);

    System.out.println("c ");
    sixteen(4,5,6);

    System.out.println("d ");
    sixteen(6,5,4);
  }
}
