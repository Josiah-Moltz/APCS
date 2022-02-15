public int countHi(String str) {
  if (str.equals("hi")) {
    return 1;
  }
  if (str.length() <= 2) {
    return 0;
  }
  return countHi(str.substring(0,str.length()-1)) + countHi(str.substring(str.length()-2)); //iterate by ONE to ensure we don't skip stuff - Raven
}
