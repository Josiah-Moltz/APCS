public String noX(String str) {
  if (str.equals("x")) {
    return "";
  }
  if (str.length() <= 1) {
    return str;
  }
  return noX( str.substring(0,str.length()/2) ) + noX( str.substring( str.length()/2 ) );
}
