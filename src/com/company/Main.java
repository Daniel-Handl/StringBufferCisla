package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        StringBuffer sbfr = new StringBuffer(16);
        Scanner scanner = new Scanner(System.in);
        System.out.println("zadej znak čísla plusu nebo mezery (pro ukončení q):");
        while(true){
            String s =scanner.nextLine();
            if (s.matches("\\d") || s.matches("\s") || s.matches("\\+")){
                sbfr.append(s.toCharArray()[0]);
                System.out.println("Zadej další znak:");
            }
            else if (s.matches("q")){
                break;
            }
            else {
                System.out.println("špatný znak zadej znovu:");

            }
        }
        System.out.println(sbfr);
        String s = sbfr.toString().replaceFirst("\\+\\d{3}\s","").replaceAll("\s","");

    }
}
