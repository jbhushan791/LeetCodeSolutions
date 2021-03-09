package com.jb.leetcode.facebook;

/**
 * Convert a non-negative integer num to its English words representation.
 *
 * @Link https://leetcode.com/problems/integer-to-english-words/
 *
 * @author jyotibhushan
 */
public class IntegerToEnglish {

    public static void main(String[] args){

        IntegerToEnglish integerToEnglish = new IntegerToEnglish();
        integerToEnglish.convertIntegerToEnglish(123);

    }

    public String convertIntegerToEnglish(Integer num){
        if(num == 0){
            return "Zero";
        }

        int billion = num / 1000000000;
        int million = (num - billion * 1000000000)/ 1000000;
        int thousand = ( num - billion * 1000000000 - million * 1000000) /1000;
        int rest = num - billion * 1000000000 - million * 1000000 - thousand * 1000;

        String result = "";

        if(billion != 0){
            result = threeDigit(billion) + " Billion";
        }

        if(million != 0){
            if(!result.isEmpty()){
                result += " ";
            }
            result += threeDigit(million)+ " Million";

        }

        if(thousand != 0){
            if(!result.isEmpty()){
                result += " ";
            }
            result += threeDigit(thousand)+ " Thousand";
        }

        if(rest != 0){
            if(!result.isEmpty()){
                result += " ";
            }
            result += threeDigit(rest);
        }

        System.out.println(result);

        return result;
    }

    private String threeDigit(int num) {
        int hundred = num /100;
        int rest = num - hundred * 100;

        String result = "";
        if(hundred * rest != 0){
            result = oneDigit(hundred) + " Hundred " + twoDigit(rest);
        } else if( hundred == 0 && rest != 0){
            result = twoDigit(rest);
        } else if( hundred != 0 && rest == 0){
            result = oneDigit(hundred) + " Hundred ";
        }

        return result;
    }

    private String twoDigit(int num) {
        if(num == 0){
            return "";
        } else if(num < 10){
            return oneDigit(num);
        } else if(num < 20){
            return twoDigitLessThan20(num);
        } else {
            int tenner = num /10;
            int rest = num - tenner*10;
            if(rest != 0){
                return twoDigit10(tenner) + " " + oneDigit(rest);
            } else {
                return twoDigit10(tenner);
            }
        }
    }

    private String oneDigit(int num) {
        switch(num){
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
        }
      return "";
    }

    private String twoDigitLessThan20(int num) {
        switch(num){
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Ninteen";
        }
        return "";
    }

    private String twoDigit10(int num) {
        switch(num){
            case 1: return "Ten";
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventeen";
            case 8: return "Eighteen";
            case 9: return "Nineteen";
        }
        return "";
    }
}
