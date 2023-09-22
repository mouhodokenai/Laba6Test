package com.example.laba6test;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("число 1");
        int pr1 = in.nextInt();
        System.out.println("число 2");
        int pr2 = in.nextInt();
        String res;
        if (pr1 < 1 | pr2 < 1) {
            res = "одно или оба числа не натуральны";
        } else if (pr1 == pr2) {
            res = "числа равны";
        } else if (func(pr1) > func(pr2)) {
            res = "в 1 числе сумма цифр больше";
        } else {
            res = "в 2 числе сумма цифр больше";
        }
        System.out.println(res);
    }
    public static int func(int num){
        int sum = 0;
        while (num > 0){
            int n1 = num%10;
            num = num/10;
            sum += n1;
        }
        return sum;
    }
}