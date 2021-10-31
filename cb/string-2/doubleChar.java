public class doubleChar {
  public static String doubleChar(String str) {
    String result = "";
    for ( int i = 0; i < str.length(); i++ ) {
      result = result + str.substring(i,i+1) + str.substring(i,i+1);
    }
    return result;
  }

  public static void main(String args[]) {
    System.out.println("The"); // "TThhee"	"TThhee"
    System.out.println("AAbb"); // "AAAAbbbb"	"AAAAbbbb"
    System.out.println("Hi-There"); // "HHii--TThheerree"	"HHii--TThheerree"
    System.out.println("Word!"); // "WWoorrdd!!"	"WWoorrdd!!"
    System.out.println("!!"); // "!!!!"	"!!!!"
    System.out.println(""); // ""	""
    System.out.println("a"); // "aa"	"aa"
    System.out.println("."); // ".."	".."
    System.out.println("aa"); // "aaaa"	"aaaa"
  }
}
