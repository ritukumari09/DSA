package DSA.String;

import java.util.Arrays;

public class SortCharacters {
    public String frequencySort(String s) {
        int[] freq = new int[128];
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        Character[] characters = new Character[128];
        for (int i = 0; i < 128; i++) {
            characters[i] = (char) i;
        }
        Arrays.sort(characters, (a, b) -> freq[b] - freq[a]);
        StringBuilder result = new StringBuilder();
        for (char c : characters) {
            if (freq[c] > 0) {
                for (int i = 0; i < freq[c]; i++) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
/*
 * Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

Return the sorted string. If there are multiple answers, return any of them.

 

Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:
Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:
Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
 */