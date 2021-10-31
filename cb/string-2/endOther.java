public class endOther {
  public static boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    int aLength = a.length();
    int bLength = b.length();

    if ( aLength > bLength ) {
      return a.substring( aLength - bLength, aLength ).equals( b );
    }
    else {
      return b.substring( bLength - aLength, bLength ).equals( a );
    }
  }

  public static void main(String[] args) {
    System.out.println(endOther("Hiabc", "abc")); // true
    System.out.println(endOther("AbC", "HiaBc")); // true
    System.out.println(endOther("abc", "abXabc")); // true
    System.out.println(endOther("Hiabc", "abcd")); // false
    System.out.println(endOther("Hiabc", "bc")); // true
    System.out.println(endOther("Hiabcx", "bc")); // false
    System.out.println(endOther("abc", "abc")); // true
    System.out.println(endOther("xyz", "12xyz")); // true
    System.out.println(endOther("yz", "12xz")); // false
    System.out.println(endOther("Z", "12xz")); // true
    System.out.println(endOther("12", "12")); // true
    System.out.println(endOther("abcXYZ", "abcDEF")); // false
    System.out.println(endOther("ab", "ab12")); // false
    System.out.println(endOther("ab", "12ab")); // true
  }
}
