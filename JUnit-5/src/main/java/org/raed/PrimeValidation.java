package org.raed;

public class PrimeValidation {

    public boolean validate(int num) {
        boolean prime = true;
        int x = 2;

        // Check for zero, One, and -Ve
        if (num <= 1)
            return false;

        // Check if divisible
        while (x < num) {
            if (num % x == 0) {
                prime = false;
                break;
            }
            x++;
        }
        return prime;
    }
}
