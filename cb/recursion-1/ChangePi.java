// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

public String changePi(String str) {
  if (str.length() <= 1) {
    return str;
  }
  if (str.substring(str.length()-2).equals("pi")) { // we need to ensure length >= 2 to call this
    return changePi( str.substring(0,str.length()-2) ) + "3.14";
  }
  return changePi( str.substring(0,str.length()-1) ) + str.substring(str.length()-1);
}
