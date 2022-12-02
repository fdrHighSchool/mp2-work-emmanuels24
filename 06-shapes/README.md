# Shapes
#### Respond to the following:

1. Write a plan for the following output:
```
000111222333444555666777888999
000111222333444555666777888999
000111222333444555666777888999
```
  *   public static String shapeNum(int num) {
    String newString = "";
    String num2 = Integer.toString(num);
    for (int i = 0; i < num2.length();i++) {
      for (int j = 0; j < 3; j++) {
        String temp = num2.substring(i, i + 1);
        newString += temp;
      }
    }
    return newString;
  }
}


2. Write a plan for the following output:
```
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
999998888877777666665555544444333332222211111
```
(assuming that num = 987654321
  *   public static String shapeNum(int num) {
    String newString = "";
    String num2 = Integer.toString(num);
    for (int i = 0; i < num2.length();i++) {
      for (int j = 0; j < 5; j++) {
        String temp = num2.substring(i, i + 1);
        newString += temp;
      }
    }
    return newString;
  }
}
