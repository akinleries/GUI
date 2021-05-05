package com.regex.regex;

public class Palindrome {



        public static boolean isPalindrome(String word){
            StringBuilder reversed = null;
            for (int i = word.length() - 1; i>=0; i--){
                reversed.append(word.charAt(i));
            }
            return reversed.toString().equalsIgnoreCase(word);




    }

//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.next();
//        isPalindrome(userInput);
//    }
}

