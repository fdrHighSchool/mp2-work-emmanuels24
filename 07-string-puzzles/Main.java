//divide word in half
class Main {
  public static void main(String[] args) {
  firstHalf("WooHoo");
  }
  public static void firstHalf(String word1) {
    if (word1.length() % 2 == 0) {
      int length = word1.length();
      int div1 = length/2;
      String word2 = word1.substring(0, div1);
      System.out.println(word2);
    }
    else {
      System.out.print("Not divisible");
    }
  }
}
