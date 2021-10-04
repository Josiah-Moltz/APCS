// Team With A Vowel: Lior (toothless), Alif (Grippy), Josiah (Hedwig)
// APCS
// HW10 -- Refactor Big Sib One/function types and return/Rewriting void BigSib.greet() to return a String
// 2021-10-04

/*
DISCOVERIES
-Tested out the idea that a java function needs a main only if it will be executable
 (BigSib.greet(<name>) runs despite not having a main, and BigSib compiles without a main, but java BigSib throws an error)

UNRESOLVED QUESTIONS
*/

public class BigSib {
  //Purposefully no main method, demonstrating that a java file need not have a main to function (but still needs one to be executable)
  //Upon executing, got run time error
  public static String greet(String name) {
    return "Your Big Sib gives you a warm welcome, " + name;
  }
}
