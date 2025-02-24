package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        long n = new Scanner(System.in).nextInt();
        long sum = n + (n - 1);

        long counter = 0;
        int len = 0;
        String cur;
        String[] p  = new String[9];

        if (n <= 4) {
            counter += (n * (n - 1)) / 2;
        }
        else {
            List<Long> digits = new ArrayList<>();
            while (sum > 0) {
                digits.add(sum % 10);
                sum /= 10;
            }

            for (Long digit : digits) {
                if (digit == 9) {
                    len++;
                }
            }
            if (len == digits.size()) {
                counter = 1;
            }
            else {
                if (digits.size() != 1){
                    cur = "9".repeat((digits.size() - 1));
                }
                else {
                    cur = "9";
                }
                for (int c = 0; c < 9; c++) {
                    p[c] = c + cur;
                    long int_p = Long.parseLong(p[c]);


                    if (int_p <= (n + 1)){
                        counter += int_p / 2;
                    }
                    else if (int_p > n + (n - 1)){
                        break;
                    }
                    else {
                        counter += (n - (int_p - n) + 1) / 2;
                    }
                }

            }
        }

        System.out.println(counter);
    }
}