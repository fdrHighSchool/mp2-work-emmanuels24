class Main {
public static void main(String[] args) {
    
    System.out.print(isLeapYear(2022));
    System.out.print(isLeapYear(2020));
    System.out.print(isLeapYear(1900));
    System.out.print(isLeapYear(2000));
    
  }
  public static boolean isLeapYear(float year) {
if (year % 4 == 0) {
  if (year % 100 == 0) {
        if (year % 400 == 0) {
          return true;
        }
    }
}
else {
       return false;
    }
    return true;
}
}
