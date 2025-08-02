package org.Tier1.Project1BinToDec;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public void Main(String[] args) {

        System.out.println("Please inform a binary number: (max is 8 digits)");
        String binary = sc.nextLine();

        if (binary.length() > 8) {
            System.err.println("The given binary number is too big");
        }



    }

}
