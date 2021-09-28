public class Wug{
  public static void zoop() {
      baffle();
      System.out.print("You wugga ");
      baffle();
  }

  public static void main(String[] args) {
      System.out.print("No, I ");
      zoop();
      System.out.print("I ");
      baffle();
  }

  public static void baffle() {
      System.out.print("wug");
      ping();
  }

  public static void ping() {
      System.out.println(".");
      baffle();
  }
}

/*1. The output of the program is
No, I wug.
You wugga wug.
I wug.

3. It should be a run-time error, because you have an infinite loop?*/
