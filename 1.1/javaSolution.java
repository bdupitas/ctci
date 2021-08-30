
// How to determine if a string has all unique characters
import java.io.*;
import java.util.*;

public class javaSolution {

    public static void main(String[] args) {
        String word = "brando";

        System.out.println(isUnique(word));

    }

    public static boolean isUnique(String value) {
        boolean result = true;
        char[] wordList = value.toCharArray(); // convert value to an array

        Hashtable<Integer, Boolean> charHash = new Hashtable<Integer, Boolean>();

        for (char letter : wordList) { // O(N) implementation with a hash table with fast lookups
            if (charHash.containsKey((int) letter)) {
                result = false;
                break;
            } else {
                charHash.put((int) letter, true);
            }
        }

        System.out.println(charHash.toString());

        // for (int i = 0; i < wordList.length - 1; i++) { // N squared / 2 run time,
        // triangle numbers
        // for (int k = i + 1; k < wordList.length; k++) {
        // if (wordList[i] == wordList[k]) {
        // result = false;
        // break;
        // }
        // }
        // }

        return result;
    }
}