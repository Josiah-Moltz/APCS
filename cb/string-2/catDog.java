public class catDog {
  public static int countWord(String word, String str) {
    int wordNum = 0;
    for (int i = 0; i <= str.length() - word.length(); i++) {
      if ( str.substring( i,i + word.length() ).equals( word ) ) { wordNum += 1;}
    }
    return wordNum;
  }

  public static boolean catDog(String str) {
    return countWord("cat",str) == countWord("dog",str);
  }

  public static void main(String[] args) {
    System.out.println(catDog("catdog")); // true		
    System.out.println(catDog("catcat")); // false
    System.out.println(catDog("1cat1cadodog")); // true
    System.out.println(catDog("catxxdogxxxdog")); // false
    System.out.println(catDog("catxdogxdogxcat")); // true
    System.out.println(catDog("catxdogxdogxca")); // false
    System.out.println(catDog("dogdogcat")); // false
    System.out.println(catDog("dogogcat")); // true
    System.out.println(catDog("dog")); // false
    System.out.println(catDog("cat")); // false
    System.out.println(catDog("ca")); // true
    System.out.println(catDog("c")); // true
    System.out.println(catDog("")); // true
  }
}
