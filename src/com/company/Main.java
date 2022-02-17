package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        String sobname = scanner.nextLine();

        System.out.println(name + sobname);

        scanner.close();



    }
}
