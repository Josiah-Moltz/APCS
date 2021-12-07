public class SecondEight {
  public static void fourteen() {
    System.out.print("a ");
    System.out.println((double) (25/4));

    System.out.print("b ");
    System.out.println(25/(double)4.0);;

    System.out.print("c ");
    System.out.println((double)25/4);

    System.out.print("d ");
    System.out.println(25/4.0);

    System.out.print("e ");
    System.out.println(25.0/4);
  }

  public static void fifteen() {
    System.out.print("a ");
    System.out.println(Math.random()*15);

    System.out.print("b ");
    System.out.println((int)Math.random()+15);

    System.out.print("c ");
    System.out.println((int)Math.random()*5+10);

    System.out.print("d ");
    System.out.println((int)(Math.random()*5)+10);
  }

  public static void sixteen() {
    System.out.println("1" + new String("2") + 3);
  }

  public static void main( String[] args ) {
    System.out.println("QUESTION 14");
    fourteen();

    System.out.println("QUESTION 15");
    fifteen();
    fifteen();
    fifteen();

    System.out.println("QUESTION 16");
    sixteen();
  }
}
