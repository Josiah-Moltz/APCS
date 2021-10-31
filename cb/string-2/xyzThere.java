public class xyzThere {
  public static boolean xyzThere(String str) {
    if ( str.length() >= 3 ) {
      //string must have at least 3 characters
      if ( str.substring( 0, 3 ).equals( "xyz" ) ) {
        //if first 3 characters are xyz, returns true
        return true;
      }
      for ( int i = 0; i <= str.length() - 4; i++ ) {
        //checks where xyz is NOT the first three characters
        if ( str.substring( i + 1, i + 4 ).equals( "xyz" ) && ! str.substring( i, i + 1 ).equals( "." ) ) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(xyzThere("abcxyz")); // true
    System.out.println(xyzThere("abc.xyz")); // false
    System.out.println(xyzThere("xyz.abc")); // true
    System.out.println(xyzThere("abcxy")); // false
    System.out.println(xyzThere("xyz")); // true
    System.out.println(xyzThere("xy")); // false
    System.out.println(xyzThere("x")); // false
    System.out.println(xyzThere("")); // false
    System.out.println(xyzThere("abc.xyzxyz")); // true
    System.out.println(xyzThere("abc.xxyz")); // true
    System.out.println(xyzThere(".xyz")); // false
    System.out.println(xyzThere("12.xyz")); // false
    System.out.println(xyzThere("12xyz")); // true
    System.out.println(xyzThere("1.xyz.xyz2.xyz")); // false
  }
}
