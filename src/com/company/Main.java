package com.company;

public class Main {

    public static void main(String[] args) {

        String a = "Megalomaniac";
        String b = "0";
        int vowels = 0;

        b = a.toLowerCase();

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == 'a' || b.charAt(i) == 'e' || b.charAt(i) == 'i' || b.charAt(i) == 'o' || b.charAt(i) == 'u') {
                vowels++;
            }
        }

        System.out.println("Number of vowels in String " + a + " is " + vowels);

    }
}
