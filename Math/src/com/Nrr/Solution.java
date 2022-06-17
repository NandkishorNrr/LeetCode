package com.Nrr;

import java.util.Arrays;

public class Solution {
   /* public String intToRoman(int item) {
            int current = item;
            int units;
            int tens;
            int hunds;
            int thunds;
            units = current % 10;
            current = current / 10;
            tens = current % 10;
            current = current / 10;
            hunds = current % 10;
            current = current / 10;
            thunds = current % 10;
            String rom = "";
            String unit = "";
            String ten = "";
            String hund = "";
            String thund = "";
            if(units == 1)
                unit = "I";
            if(units == 2)
                unit = "II";
            if(units == 3)
                unit = "III";
            if(units == 4)
                unit = "IV";
            if(units == 5)
                unit = "V";
            if(units == 6)
                unit = "VI";
            if(units == 7)
                unit = "VII";
            if(units == 8)
                unit = "VIII";
            if(units == 9)
                unit = "IX";
            if(tens*10 == 10)
                ten = "X";
            if(tens*10 == 20)
                ten = "XX";
            if(tens*10 == 30)
                ten = "XXX";
            if(tens*10 == 40)
                ten = "XL";
            if(tens*10 == 50)
                ten = "L";
            if(tens*10 == 60)
                ten = "LX";
            if(tens*10 == 70)
                ten = "LXX";
            if(tens*10 == 80)
                ten = "LXXX";
            if(tens*10 == 90)
                ten = "XC";
            if(hunds*100 == 100)
                hund = "C";
            if(hunds*100 == 200)
                hund = "CC";
            if(hunds*100 == 300)
                hund = "CCC";
            if(hunds*100 == 400)
                hund = "CD";
            if(hunds*100 == 500)
                hund = "D";
            if(hunds*100 == 600)
                hund = "DC";
            if(hunds*100 == 700)
                hund = "DCC";
            if(hunds*100 == 800)
                hund = "DCCC";
            if(hunds*100 ==900)
                hund = "CM";
            if(thunds*1000 == 1000)
                thund = "M";
            if(thunds*1000 == 2000)
                thund = "MM";
            if(thunds*1000 == 3000)
                thund = "MMM";

            rom = thund + hund + ten + unit;
            return rom;
        }*/
    /*public int romanToInt(String s) {
        int num = 0;
        int numStrg = 0;
        String temp = s;
        int units = 0;
        int tens = 0;
        int hunds = 0;
        int thunds = 0;
            if (temp.charAt(0) + temp.charAt(1) == 'I')
                numStrg = 1;
            if (temp.charAt(0) == 'V')
                numStrg = 5;
            if (temp.charAt(0) == 'X')
                numStrg = 10;
            if (temp.charAt(0) == 'L')
                numStrg = 50;
            if (temp.charAt(0) == 'C')
                numStrg = 100;
            if (temp.charAt(0) == 'D')
                numStrg = 500;
            if (temp.charAt(0) == 'M')
                numStrg = 1000;
            if (numStrg < 10)
                units = numStrg;
            if ()
        return num;
    }*/
//    Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    public long reverse(long x) {
        long reversed = 0;
        long current = x ;
        int count = 0;
        long[] arr = new long[11];
        while (current != 0 ) {
            arr[count++] = current % 10;
            current = current / 10;
        }
        arr = Arrays.copyOfRange(arr, 0, count);
        for (int i = 0; i < count; i++) {
            reversed = reversed*10 + arr[i];
        }
        if(reversed > Math.pow(2, 32))
            return  0;
        return reversed;
    }
}
