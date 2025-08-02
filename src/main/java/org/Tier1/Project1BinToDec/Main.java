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

        System.out.println(calculateDecimal(binary));


    }


    public int calculateDecimal(String binary) {
        String aux2 =  binary;
        Integer number = 0;

        while (aux2.length() < 8 && aux2.length() >= 0) {
            int length = aux2.length()-1;
            char c = aux2.charAt(length-1);

            number += c*(2*length);

            length = length--;
        }


        return number;
    }

}
