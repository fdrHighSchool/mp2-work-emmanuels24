class Main {
  public static void main(String[] args) {
    System.out.println(countQuarters(4984));
  }
  public static String countQuarters(int cents) {
    String coin = Integer.toString(cents);
    String quarters = coin.substring(coin.length() -2);
    return quarters;
  }
}
