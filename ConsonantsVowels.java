package com.String;

public class ConsonantsVowels {
    public static void main(String[] args) {
        String a = "I want to learn Java.";
        int length = a.length();
        int vowels = 0, consonants = 0;
        boolean[] vowelFlags = new boolean[26]; // Array to track encountered vowels

        for (int i = 0; i < length; i++) {
            char ch = Character.toLowerCase(a.charAt(i)); // Convert to lowercase for case-insensitive comparison
            if (ch >= 'a' && ch <= 'z') { // Check if character is an alphabet
                int index = ch - 'a'; // Get index for boolean array
                if (!vowelFlags[index]) { // Check if vowel hasn't been encountered yet
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowels++;
                        vowelFlags[index] = true; // Mark vowel as encountered

                    } else if(ch >= 'a' && ch <= 'z'){
                        consonants++;
                        System.out.println(vowelFlags[index]);
                    }
                }
            }
        }

        System.out.println("Number of Vowels:" + vowels);
        System.out.println("Number of Consonants:" + consonants);
    }
}
