package com.xlc.chuji;

import java.util.Scanner;  

public class T012 {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        while (sc.hasNext()) {  
            int number = sc.nextInt();  
            String s = NumberToEnglishString(number);  
            System.out.println(s);  
        }
        sc.close();
    }  
  
    public static String NumberToEnglishString(int number) {  
        String s = null;  
        if (number < 0) {  
            s = "error";  
            return s;  
        }  
        if (number < 20) {  
            switch (number) {  
            case 0:  
                s = "zero";  
                return s;  
            case 1:  
                s = "one";  
                return s;  
            case 2:  
                s = "two";  
                return s;  
            case 3:  
                s = "three";  
                return s;  
            case 4:  
                s = "four";  
                return s;  
            case 5:  
                s = "five";  
                return s;  
            case 6:  
                s = "six";  
                return s;  
            case 7:  
                s = "seven";  
                return s;  
            case 8:  
                s = "eight";  
                return s;  
            case 9:  
                s = "nine";  
                return s;  
            case 10:  
                s = "ten";  
                return s;  
            case 11:  
                s = "eleven";  
                return s;  
            case 12:  
                s = "twelve";  
                return s;  
            case 13:  
                s = "thirteen";  
                return s;  
            case 14:  
                s = "fourteen";  
                return s;  
            case 15:  
                s = "fifteen";  
                return s;  
            case 16:  
                s = "sixteen";  
                return s;  
            case 17:  
                s = "seventeen";  
                return s;  
            case 18:  
                s = "eighteen";  
                return s;  
            case 19:  
                s = "nineteen";  
                return s;  
            default:  
                s = "error";  
                return s;  
            }  
        }  
  
        if (number < 100) {  
            if (number % 10 == 0) {  
                switch (number) {  
                case 20:  
                    s = "twenty";  
                    return s;  
                case 30:  
                    s = "thirty";  
                    return s;  
                case 40:  
                    s = "forty";  
                    return s;  
                case 50:  
                    s = "fifty";  
                    return s;  
                case 60:  
                    s = "sixty";  
                    return s;  
                case 70:  
                    s = "seventy";  
                    return s;  
                case 80:  
                    s = "eighty";  
                    return s;  
                case 90:  
                    s = "ninety";  
                    return s;  
                default:  
                    s = "error";  
                    return s;  
                }  
            } else {  
                s = NumberToEnglishString(number / 10 * 10) + ' '  
                        + NumberToEnglishString(number % 10);  
                return s;  
            }  
        }  
  
        if (number < 1000) {  
            if (number % 100 == 0) {  
                s = NumberToEnglishString(number / 100) + " hundred";  
                return s;  
            } else {  
                s = NumberToEnglishString(number / 100) + " hundred and "  
                        + NumberToEnglishString(number % 100);  
                return s;  
            }  
        }  
  
        if (number < 1000000) {  
            if (number % 1000 == 0) {  
                s = NumberToEnglishString(number / 1000) + " thousand";  
                return s;  
            } else {  
                s = NumberToEnglishString(number / 1000) + " thousand "  
                        + NumberToEnglishString(number % 1000);  
                return s;  
            }  
        }  
  
        if (number < 1000000000) {  
            if (number % 1000000 == 0) {  
                s = NumberToEnglishString(number / 1000000) + " million";  
                return s;  
            } else {  
                s = NumberToEnglishString(number / 1000000) + " million "  
                        + NumberToEnglishString(number % 1000000);  
                return s;  
            }  
        }  
  
        if (number < 999999999) {  
            if (number % 1000000000 == 0) {  
                s = NumberToEnglishString(number / 1000000000) + " billion";  
                return s;  
            } else {  
                s = NumberToEnglishString(number / 1000000000) + " billion "  
                        + NumberToEnglishString(number % 1000000000);  
                return s;  
            }  
        }  
  
        if (number > 999999999) {  
            s = "error";  
            return s;  
        }  
        return s;  
    }  
}  
