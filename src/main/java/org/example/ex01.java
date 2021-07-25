/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */

package org.example;

import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        System.out.print("What is your name? ");
        Scanner readName = new Scanner(System.in);

        String firstName = readName.nextLine();
        System.out.print("Hello, " + firstName + ", nice to meet you!");
    }
}

