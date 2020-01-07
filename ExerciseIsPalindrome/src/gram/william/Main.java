package gram.william;

import javax.swing.text.StyledEditorKit;

public class Main {

    public static void main(String[] args) {
        NumberPalindrome.isPalindrome(121);
        NumberPalindrome.isPalindrome(-14541);
        NumberPalindrome.isPalindrome(1378731);
        NumberPalindrome.isPalindrome(123451);

        FirstLastDigitSum.sumFirstAndLastDigit(1234);
        FirstLastDigitSum.sumLoop(1234);
        FirstLastDigitSum.sumFirstAndLastDigit(781235);
        FirstLastDigitSum.sumLoop(781235);

        EvenDigitSum.getEvenDigitSum(12344);
        EvenDigitSum.getEvenDigitSum(123456789);
        EvenDigitSum.getEvenDigitSum(2000);

        SharedDigit.hasSharedDigit(42, 12);
        SharedDigit.hasSharedDigit(72, 17);
        SharedDigit.hasSharedDigit2(72, 17);

        boolean test1 = LastDigitChecker.hasSameLastDigit(41, 22, 71);
        System.out.println(test1);

        int comDiv = GreatestCommonDivisor.getGreatestCommonDivisor(25,15);
        System.out.println(comDiv);

        FactorPrinter.printFactors(32);
        FactorPrinter.printFactors(-1);

        System.out.println(PerfectNumber.isPerfectNumber(6));
        System.out.println(NumberToWords.reverse(-121));
        NumberToWords.numberToWords(-121);
        System.out.println(NumberToWords.reverse(13421));
        System.out.println(NumberToWords.reverse(1201));
        NumberToWords.numberToWords(13421);
        NumberToWords.numberToWords(100);
        NumberToWords.numberToWords(11);
    }
}
