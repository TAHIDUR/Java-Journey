package Playground.NumberPrograms;

import static Utilities.Helper.*;

public class NumberToWord {
    public static String word = "";
    public static int length;

    public static void main(String[] args) {
        print("Please enter a number bellow 10000: ");
        int num = ScanInteger();
        length = (String.valueOf(num)).length();
        println(word(num));
    }

    public static String word(int num) {
        String[] oneDigit = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] twoDigit = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] multipleOfter = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        if (length == 0) return word;

        if (length == 1) {
            if (num == 0) {
                length = 0;
                return "zero";
            }
            word += oneDigit[num];
            word += " ";
            length = 0;
        }

        if (length == 2) {
            if (num > 9 && num < 20) {
                word += twoDigit[num % 10];
                word += " ";
                length = 0;
            } else {
                word += multipleOfter[num / 10];
                word += " ";
                length = 1;
                word(num % 10);
            }
        }

        if (length == 3) {
            int hundredsDigit = num / 100;
            word += oneDigit[hundredsDigit];
            word += " hundred ";
            length = 2;
            word(num % 100);
        }

        if (length == 4) {
            int hundredsDigit = num / 1000;
            word += oneDigit[hundredsDigit];
            word += " thousand ";
            length = 3;
            word(num % 1000);
        }

        if (length == 5) {
            word += word(num / 1000);
            num = num % 1000;
            word += " thousand ";
            length = 3;
            word(num % 1000);
        }

        return word;
    }

}
