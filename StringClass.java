package com.regex.regex;

public class StringClass {
    public static void main(String[] args) {
        String num = "68575565 234";
        StringBuilder reversed = new StringBuilder(num.substring(num.length() - 3));
        reversed.append(") ");
        reversed.insert(0, "(+");

        System.out.println(reversed);

        int count = 0;

        for (int counter = num.length() - 5; counter >= 0; counter--) {

            if (count % 3 == 0 && count > 0) {
                reversed.append("-");
            }
            reversed.append(num.charAt(counter));
            count++;
        }
        System.out.println(reversed);
    }

}









