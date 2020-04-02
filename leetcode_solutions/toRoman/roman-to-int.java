class Solution {
  public int romanToInt(String s) {
    int solution = 0;
    char prevChar = ' ';
    char[] sCharArray = s.toCharArray();
    for (int i = sCharArray.length - 1; i >= 0; i--) {
      if (sCharArray[i] == 'I') {
        solution += 1;
      }
      if (sCharArray[i] == 'V') {
        if (i != 0 && sCharArray[i - 1] == 'I') {
          solution += 4;
          i--;
        } else {
          solution += 5;
        }
      }
      if (sCharArray[i] == 'X') {
        if (i != 0 && sCharArray[i - 1] == 'I') {
          solution += 9;
          i--;
        } else {
          solution += 10;
        }
      }

      if (sCharArray[i] == 'L') {
        if (i != 0 && sCharArray[i - 1] == 'X') {
          solution += 40;
          i--;
        } else {
          solution += 50;
        }
      }

      if (sCharArray[i] == 'C') {
        if (i != 0 && sCharArray[i - 1] == 'X') {
          solution += 90;
          i--;
        } else {
          solution += 100;
        }
      }

      if (sCharArray[i] == 'D') {
        if (i != 0 && sCharArray[i - 1] == 'C') {
          solution += 400;
          i--;
        } else {
          solution += 500;
        }
      }

      if (sCharArray[i] == 'M') {
        if (i != 0 && sCharArray[i - 1] == 'C') {
          solution += 900;
          i--;
        } else {
          solution += 1000;
        }
      }
    }
    return solution;
  }
}