// tnpg Tiger Josiah Moltz and Jing Feng
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz/instance variables (?)/Accessing/"editing" BigSib by making a "copy"
// 2021-10-06

public class Greet {
  public static void main(String[] args) {
    String greeting;

    BigSib richard = new BigSib();
    //new is required (checked)
    richard.setHelloMsg("Word up");         //initializing helloMsg
    System.out.println(richard.helloMsg);   //printing to check change worked
    richard.setHelloMsg("blah(hoodyhah)");  //second change to helloMsg
    System.out.println(richard.helloMsg);

    greeting = richard.greet("freshman");
    System.out.println(greeting);
  }
}
