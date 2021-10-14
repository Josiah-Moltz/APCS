// tnpg Tiger Josiah Moltz (hedwig) and Jing Feng (biscuit)
// APCS
// HW14 -- Customize Your Creation/Overloaded Constructors/Using Overloaded Constructors to change variables
// 2021-10-06

/*
DISCO
-When BigSib.java had static infront of functions, only "Salutations" was used for helloMsg
 (forgot to remove it a while ago, my fault)
-30Rock is the best

QCC
-What is static? (Again)
*/

public class BigSib  {
  String helloMsg;

  public BigSib() {
    //BigSib is a constructor
    helloMsg = "Word up";  //initializing helloMsg
  }

  public BigSib(String msg) {
    helloMsg = msg;
  }

  public void setHelloMsg(String msg) {
    helloMsg = msg;
  }

  public String greet(String name) {
    return helloMsg + ", " + name + ".";
  }
}
