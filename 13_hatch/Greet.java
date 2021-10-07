// tnpg Tiger Josiah Moltz (hedwig) and Jing Feng (biscuit)
// APCS
// HW13 -- Where do BigSibs Come From?/constructors/Eliminating the need to initialize variables on creation of new object with constructors
// 2021-10-06

public class Greet {
  public static void main(String[] args) {
    String greeting;

    BigSib richard = new BigSib();
    System.out.println(richard.helloMsg);   //printing to check change worked
    richard.setHelloMsg("blah(hoodyhah)");  //second change to helloMsg
    System.out.println(richard.helloMsg);

    greeting = richard.greet("freshman");
    System.out.println(greeting);
  }
}
