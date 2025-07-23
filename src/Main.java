public class Main {
    public static void main(String[] args) {

        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));  // true → 1 is shared
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));  // true → 2 is shared
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));  // false → 9 is invalid
        System.out.println(LastDigitChecker.hasSameLastDigit(101, 201, 301)); // true → 1 is shared
        System.out.println(LastDigitChecker.hasSameLastDigit(10, 20, 30)); // true → 0 is shared

        System.out.println(LastDigitChecker.isValid(10));    // true
        System.out.println(LastDigitChecker.isValid(1000));  // true
        System.out.println(LastDigitChecker.isValid(1001));  // false
        System.out.println(LastDigitChecker.isValid(9));     // false
    }
}
