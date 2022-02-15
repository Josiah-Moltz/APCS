// Junior: Josiah Moltz, Raven Tang
// APCS pd6
// HW64: Revisitation
// 2022-02-14
// time spent: 1 hrs

// tree-y
public String changeXY(String str) {
  if (str.equals("x")) {
    return "y";
  }
  if (str.length() <= 1) {
    return str;
  }
  return changeXY( str.substring(0,str.length()/2) ) + changeXY( str.substring(str.length()/2) );
}
