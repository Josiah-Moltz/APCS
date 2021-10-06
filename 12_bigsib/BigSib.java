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
