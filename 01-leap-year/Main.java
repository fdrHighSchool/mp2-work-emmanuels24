class Main {
public static void main(String[] args) {
    System.out.println(isLeapYear(2022));
    System.out.println(isLeapYear(2020));
    System.out.println(isLeapYear(1900));
    System.out.println(isLeapYear(2000));
  }
  public static boolean isLeapYear(double year) {
    return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
  }
}
