public class FirstEight {
  public static void one( boolean p, boolean b) {
    System.out.println(!(p && b) && (!p || b));
  }

  public static void two() {
    System.out.print("a ");
    System.out.println(9+0.95);

    System.out.print("b ");
    System.out.println(995/100.0);

    System.out.print("c ");
    System.out.println(9. + 95/100);

    System.out.print("d ");
    System.out.println(9 + 95.0/100);
  }

  public static void three() {
    for ( int i = 12; i > 0; i -= 3) {
      System.out.print(i);
    }
    System.out.print("\n");
  }

  public static void four() {
    int i = 0;
    while (i < 8) {
      i += 1;
    }
    System.out.println(i);
  }

  public static void five() {

  }

  public static void eight() {
    int g;
    g = 1024;
    g = 475 / 2;
    g = 5 / 7;
    //g = 3.9 / 1.3;
  }

  public static void main( String[] args ) {
    System.out.println("QUESTION 1");
    System.out.println("TT");
    one(true,true);
    System.out.println("TF");
    one(true,false);
    System.out.println("FT");
    one(false,true);
    System.out.println("FF");
    one(false,false);

    System.out.println("QUESTION 2");
    two();

    System.out.println("QUESTION 3");
    three();

    System.out.println("QUESTION 4");
    four();

    System.out.println("QUESTION 5");

    System.out.println("QUESTION 6");

    System.out.println("QUESTION 7");

    System.out.println("QUESTION 8");
    //eight(); d
  }
}
