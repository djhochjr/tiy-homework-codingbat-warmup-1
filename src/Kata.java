import java.util.Scanner;

/**
 * Created by davehochstrasser on 8/8/16.
 */
public class Kata {

    public boolean sleepIn(boolean weekday, boolean vacation) {

        return (!weekday || vacation);
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    //    monkeyTrouble(true, true);
    //    monkeyTrouble(false, false);
    //    monkeyTrouble(true, false);
        return ((aSmile && bSmile) || (!aSmile && !bSmile));
    }


   //sumDouble(1, 2) → 3
   //sumDouble(3, 2) → 5
   //sumDouble(2, 2) → 8

    public int sumDouble(int a, int b) {
       int sum = (a + b);
     if(a == b) {
       return (sum * 2);
    }
    else {
      return(sum);
    }

    }

   //diff21(19) → 2
   //diff21(10) → 11
   //diff21(21) → 0

    public int diff21(int n) {
    int diff = (21 - n);
    if (n >= 21) {
        return (diff * 2);
      }

    else {
        return (diff);
     }
    }
   //parrotTrouble(true, 6);
   //parrotTrouble(true, 7) ;
   //parrotTrouble(false, 6);

    public boolean parrotTrouble(boolean talking, int hour) {
        if ((talking == true) && (hour < 7 || hour > 20)) {
            return (true);
        } else {
            return (false);
        }
    }

   //makes10(9, 10);
   //makes10(9, 9) ;
   //makes10(1, 9) ;


    public boolean makes10(int a, int b) {
    if ((a ==10 || b == 10) || (a + b == 10)) {
     return (true);
    }
     else{
     return(false);

    }
     }
    //nearHundred(93);
    //nearHundred(90);
    //nearHundred(89);
    public boolean nearHundred(int n) {
        if (((100 + n <= Math.abs(10)) || (100 - n <= Math.abs(10))
                || ((200 + n <= Math.abs(10)) || (200 - n <= Math.abs(10)))))
            return (true);
        else {
            return (false);

        }
    }
   //posNeg(1, -1, false) → true
   //posNeg(-1, 1, false) → true
   //posNeg(-4, -5, true) → true
    public boolean posNeg(int a, int b, boolean negative) {

        if (((a < 0) && (b > 0) || ((a > 0) && (b < 0)))) {
            return (true);
        }
        if (((a < 0) && (b < 0)) && (negative == true)) {
            return (true);
        }
    return (false);
    }
   //notString("candy") → "not candy"
   //notString("x") → "not x"
   //notString("not bad") → "not bad"

    public String notString(String str) {
      if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        return str;
    }

    return "not " + str;
    }
   //missingChar("kitten", 1) → "ktten"
   //missingChar("kitten", 0) → "itten"
   //missingChar("kitten", 4) → "kittn"
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n + 1, str.length());
        return front + back;
    }
    public String frontBack(String str) {
        if (str.length() <= 1) return str;

        String mid = str.substring(1, str.length() - 1);


        return str.charAt(str.length() - 1) + mid + str.charAt(0);
    }
     public String front3(String str) {
         String front;

         if (str.length() >= 3) {
             front = str.substring(0, 3);
         } else {
             front = str;
         }
         return front + front + front;
     }

    public boolean or35(int n) {
        return (n % 3 == 0) || (n % 5 == 0);
    }

    public String front22(String str) {
        int take = 2;
        if (take > str.length()) {
            take = str.length();
        }
        String front = str.substring(0, take);
        return front + str + front;
    }

    public boolean startHi(String str) {
        if (str.length() < 2)
            return false;
        String firstTwo = str.substring(0, 2);

        if (firstTwo.equals("hi")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean in1020(int a, int b) {
        return ((a >= 10 && a <= 20) || (b >= 10 && b <= 20));
    }

    public boolean hasTeen(int a, int b, int c) {
        return (a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19) ||
                (c >= 13 && c <= 19);
    }

    public boolean loneTeen(int a, int b) {
        boolean aTeen = (a >= 13 && a <= 19);
        boolean bTeen = (b >= 13 && b <= 19);

        return (aTeen && !bTeen) || (!aTeen && bTeen);
    }

    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.substring(0, 1) + str.substring(4);
        }
        return str;
    }

    public boolean mixStart(String str) {

        if (str.length() < 3)
            return false;

        String two = str.substring(1, 3);

        if (two.equals("ix")) {
            return true;
        } else {
            return false;
        }

    }

    public String startOz(String str) {
        String result = "";

        if (str.length() >= 1 && str.charAt(0) == 'o') {
            result = result + str.charAt(0);
        }

        if (str.length() >= 2 && str.charAt(1) == 'z') {
            result = result + str.charAt(1);
        }

        return result;
    }

    public int intMax(int a, int b, int c) {
        int max;

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        return max;

    }

    public int close10(int a, int b) {
        int aDiff = Math.abs(a - 10);
        int bDiff = Math.abs(b - 10);

        if (aDiff < bDiff) {
            return a;
        }
        if (bDiff < aDiff) {
            return b;
        }
        return 0;  // i.e. aDiff == bDiff

    }

    public boolean in3050(int a, int b) {
        if (a >= 30 && a <= 40 && b >= 30 && b <= 40) {
            return true;
        }
        if (a >= 40 && a <= 50 && b >= 40 && b <= 50) {
            return true;
        }
        return false;
    }

    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20)
            return a;
        if (b >= 10 && b <= 20)
            return b;
        return 0;
    }

    public boolean stringE(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') count++;
        }

        return (count >= 1 && count <= 3);
    }

    public boolean lastDigit(int a, int b) {
        return (a % 10 == b % 10);
    }

    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);

        return front + back.toUpperCase();
    }

    public String everyNth(String str, int n) {
        String result = "";

        for (int i = 0; i < str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }
}


























































































