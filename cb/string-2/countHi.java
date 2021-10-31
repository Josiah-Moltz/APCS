public class countHi {
  public static int countHi(String str) {
    int hiNum = 0;
    for (int i = 0; i <= str.length() - 2; i++) {
      if ( str.substring(i,i+2).equals("hi") ) {
        hiNum += 1;
      }
    }
    return hiNum;
  }

  public static void main(String[] args) {
    System.out.println(countHi("abc hi ho")); // 1
    System.out.println(countHi("ABChi hi")); // 2
    System.out.println(countHi("hihi")); // 2
    System.out.println(countHi("hiHIhi")); // 2
    System.out.println(countHi("")); // 0
    System.out.println(countHi("h")); // 0
    System.out.println(countHi("hi")); // 1
    System.out.println(countHi("Hi is no HI on ahI")); // 0
    System.out.println(countHi("hiho not HOHIhi")); // 2
  }
}
