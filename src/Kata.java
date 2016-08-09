import java.util.Scanner;

/**
 * Created by davehochstrasser on 8/8/16.
 */
public class Kata {

    //public boolean sleepIn(boolean weekday, boolean vacation) {

    //return (!weekday || vacation);


    //public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    //monkeyTrouble(true, true) → true
    //monkeyTrouble(false, false) → true
    //monkeyTrouble(true, false) → false
    //return ((aSmile && bSmile) || (!aSmile && !bSmile));
    //}
    //sumDouble(1, 2) → 3
    //sumDouble(3, 2) → 5
    //sumDouble(2, 2) → 8
    //public int sumDouble(int a, int b) {
    //   int sum = (a + b);
    // if(a == b) {
    //   return (sum * 2);
    //}
    //else {
    //  return(sum);
    //}

    //}
    //}
    //diff21(19) → 2
    //diff21(10) → 11
    //diff21(21) → 0

    //public int diff21(int n) {
    //int diff = (21 - n);
    //if (n >= 21) {
    //    return (diff * 2);
    //  }

    //else {
    //    return (diff);
    // }
    //}
    // parrotTrouble(true, 6) → true
    //parrotTrouble(true, 7) → false
    //parrotTrouble(false, 6) → false

    //public boolean parrotTrouble(boolean talking, int hour) {
    //if ((talking == true) &&(hour < 7 || hour > 20 )) {
    // return (true);
    //}
    // else{
    // return(false);
    //makes10(9, 10) → true
    //makes10(9, 9) → false
    //makes10(1, 9) → true


    //public boolean makes10(int a, int b) {
    //if ((a ==10 || b == 10) || (a + b == 10)) {
    // return (true);
    //}
    // else{
    // return(false);

    //}
    // }
    //nearHundred(93) → true
    //nearHundred(90) → true
    //nearHundred(89) → false
    //public boolean nearHundred(int n) {
    //    if (((100 + n <= Math.abs(10)) || (100 - n <= Math.abs(10))
    //|| ((200 + n <= Math.abs(10)) || (200 - n <= Math.abs(10)))))
    //        return (true);
    //else{
    //        return(false);

    //    }
    //posNeg(1, -1, false) → true
    //posNeg(-1, 1, false) → true
    //posNeg(-4, -5, true) → true
    //public boolean posNeg(int a, int b, boolean negative) {

    //    if (((a < 0) && (b > 0) || ((a > 0) && (b < 0)))) {
    //        return (true);
    //    }
    //    if (((a < 0) && (b < 0)) && (negative == true)) {
    //        return (true);
    //    }
    //return (false);
    //}
    //notString("candy") → "not candy"
    //notString("x") → "not x"
    //notString("not bad") → "not bad"

    //public String notString(String str) {
      //  if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
        //    return str;
        //}

        //return "not " + str;

        //}
    //missingChar("kitten", 1) → "ktten"
    //missingChar("kitten", 0) → "itten"
    //missingChar("kitten", 4) → "kittn"
    public String missingChar(String str, int n) {
        String front = str.substring(0, n);
        String back = str.substring(n+1, str.length());
            return front + back;
        }
    }










































