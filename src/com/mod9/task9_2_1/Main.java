package com.mod9.task9_2_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new OneZeroStream());
        for (int i = 0; i < 10; i++) {
            System.out.print(scanner.nextInt()); // метод nextInt() считывает и возвращает число
        }
    }
}
