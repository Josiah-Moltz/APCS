// tnpg Tiger Josiah Moltz (hedwig) and Jing Feng (biscuit)
// APCS
// HW13 -- Where do BigSibs Come From?/constructors/Eliminating the need to initialize variables on creation of new object with constructors
// 2021-10-06

/*
DISCO
-You can only have one constructor, because of name space restrictions (fancy vocab!!)
-Constructors must be public so that you can access them from a remote class
-Not everything needs to be public in a new object, only that which is being used

QCC
-Why can't you initialize variables (ignoring their definition) outside of a method?
*/

public class BigSib  {
  static String helloMsg;

  public BigSib() {
    //BigSib is a constructor
    helloMsg = "Word up.";  //initializing helloMsg
  }

  public static void setHelloMsg(String msg) {
    helloMsg=msg;
  }

  public static String greet(String name) {
    return "Your Big Sib gives you a warm welcome, " + name;
  }
}
