class Main {
  public static void main(String[] args) {
    System.out.println(letterGrade(87));
  }
  public static String letterGrade(int grade) {
    String letter = "";
    if (grade >= 90) {
      if (grade % 10 >= 7) {
        letter = "A+";
      }
      else if (grade % 10 >= 3 && grade % 10 <= 6) {
        letter = "A";
      }
      else {
        letter = "A-";
      }
    }
    else if (grade >= 80 && grade <= 89) {
      if (grade % 10 >= 7) {
        letter = "B+";
      }
      else if (grade % 10 >= 3 && grade % 10 <= 6) {
        letter = "B";
      }
      else {
        letter = "B-";
      }
    }
    else if (grade >= 70 && grade <= 79) {
      if (grade % 10 >= 7) {
        letter = "C+";
      }
      else if (grade % 10 >= 3 && grade % 10 <= 6) {
        letter = "C";
      }
      else {
        letter = "C-";
      }
    }
    else if (grade >= 60 && grade <= 69) {
      if (grade % 10 >= 7) {
        letter = "D+";
      }
      else if (grade % 10 >= 3 && grade % 10 <= 6) {
        letter = "D";
      }
       else  {
         letter = "D-";
       }
    }
    else if (grade < 60) {
      letter = "F";
    }
    return letter;
  }
}
