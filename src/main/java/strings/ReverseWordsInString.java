package strings;

/**
 * LeetCode Problem #151: Reverse Words in a String
 * Link: <a href="https://leetcode.com/problems/reverse-words-in-a-string/">...</a>
 */
public class ReverseWordsInString {
    public String reverseWords(String s) {
        String[] arrayOfS = s.trim().split("\\s+");
        if(arrayOfS.length < 2){
            return String.join(" ", arrayOfS);
        }

        int end = arrayOfS.length - 1;

        for(int i = 0; i < arrayOfS.length / 2; i++){
            String temp = arrayOfS[i];
            arrayOfS[i] = arrayOfS[end];
            arrayOfS[end--] = temp;
        }

        return String.join(" ", arrayOfS);
    }
}
