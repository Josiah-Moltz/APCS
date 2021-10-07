// tnpg Tiger Josiah Moltz and Jing Feng
// APCS
// HW12 -- On Elder Individuality and the Elimination of Radio Fuzz/instance variables (?)/Accessing/"editing" BigSib by making a "copy"
// 2021-10-06

/*
DICSO (OOOOOH DISCOVERIES!! NOT THE DANCE!)
-static isn't necessary for a function to work (haven't tried executing tho)
-If a method is static, everything defined inside it is static, and everything used inside it MUST be static
-variables are method specific
-you can access variables by ClassName.MethodName.VariableName

QCC
-What is static?
-What does BigSib mean as a "variable" (in reference to richard) type?
-What is richard?
-What is an instance variable?
-What is static???????
-What really is an object
*/

public class BigSib  {
  static String helloMsg;
  //static necessary for it to run in the static setHelloMsg()
  //if static not included, and static not included in setHelloMsg() still runs
  public static void setHelloMsg(String msg) {
    helloMsg=msg;
  }
  public static String greet(String name) {
    return "Your Big Sib gives you a warm welcome, " + name;
  }
}
