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
