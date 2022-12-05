//count hi in string
class Main2 {
  public static void main(String[] args) {
    System.out.print(countHi("jjdfkjiHI"));
  }
  public static int countHi(String str) {
    int count = 0;
    for (int i = 0; i <= str.length() - 2; i++) {
      if (str.substring(i, i + 2).equalsIgnoreCase("hi")) {
        count++;
      }
    }
    return count;
  }
}
