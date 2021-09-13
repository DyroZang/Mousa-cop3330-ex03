/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Gabriel Mousa
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("What is the quote? ");
        String quote = input.nextLine();

        System.out.println("Who said it?");
        String name = input.nextLine();

        System.out.println(name + " says, \"" + quote + "\"");

    }
}
