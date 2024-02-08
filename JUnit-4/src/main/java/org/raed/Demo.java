package org.raed;

public class Demo {

    // Divide method
    public int divide(int x, int y) {
        return y != 0? x/y : 0;
    }

    // Reverse string method
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
