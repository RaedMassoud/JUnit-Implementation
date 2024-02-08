package org.raed;

public class ReverseString {

    // Reverses a String
    public String reverseString(String init) {
        char[] charArray = init.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        // Switch
        while(left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}
