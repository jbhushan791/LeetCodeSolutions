package com.jb.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jbhushan
 */
public class ReformateDate {

    private static Map<String, String> MONTHS = new HashMap<>() {{
        put("Jan", "01"); put("Feb", "02"); put("Mar", "03"); put("Apr", "04");
        put("May", "05"); put("Jun", "06"); put("Jul", "07"); put("Aug", "08");
        put("Sep", "09"); put("Oct", "10"); put("Nov", "11"); put("Dec", "12");
    }};

    public static void main(String[] args){
        ReformateDate reformateDate = new ReformateDate();
        reformateDate.reformate("20th Oct 2052");
        reformateDate.reformate("4th Sep 1992");
    }

    private String reformate(String date){
        StringBuilder reformatedDate = new StringBuilder();
        // append year
        reformatedDate.append(date.substring(date.length()-4));
        reformatedDate.append("-");
        // append month
        reformatedDate.append(getMonth(date.substring(date.length()-8, date.length()-5)));
        reformatedDate.append("-");
        // append date
        if(Character.isDigit(date.charAt(1))){
            reformatedDate.append(date.charAt(0));
            reformatedDate.append(date.charAt(1));
        } else {
            reformatedDate.append("0");
            reformatedDate.append(date.charAt(0));
        }
        System.out.println(reformatedDate.toString());
        return reformatedDate.toString();
    }

    public String getMonth(String month){
        System.out.println(month);
        if(month.equals("Jan")) {
            return "01";
        } else if(month.equals("Feb")){
                return "02";
        } else if(month.equals("Mar")){
                return "03";
        } else if(month.equals("Apr")){
                return "04";
        } else if(month.equals("May")){
                return "05";
        } else if(month.equals("Jun")){
                return "06";
        } else if(month.equals("Jul")){
                return "07";
        } else if(month.equals("Aug")){
                return "08";
        } else if(month.equals("Sep")){
                return "09";
        } else if(month.equals("Oct")){
                System.out.println("here");
                return "10";
        } else if(month.equals("Nov")){
                return "11";
        } else if(month.equals("Dec")){
                return "12";
        }

        //  System.out.println("Month: " +m);
        return "";
    }
}
