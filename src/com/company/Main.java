package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int countOfRightExamples = 0;
        int countOfExamples = 0;
        printMenu();
        int inputMenu = Integer.parseInt(sc.nextLine());
        switch (inputMenu) {
            case 1:
                System.out.println("Kolik chceš příkladů?");
                countOfExamples = Integer.parseInt(sc.nextLine());
                for (int i = 0; i < countOfExamples; i++) {
                    int sign = (rd.nextInt((4 - 1) + 1) + 1);
                    switch (sign) {
                        case 1:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            int first = returnNumber();
                            int second = returnNumber();
                            System.out.println(first + " + " + second + " = ?");
                            int outputTwo = Integer.parseInt(sc.nextLine());
                            int output = first + second;
                            if (output == outputTwo) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 2:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            second = returnNumber();
                            System.out.println(first + " - " + second + " = ?");
                            outputTwo = Integer.parseInt(sc.nextLine());
                            output = first - second;
                            if (output == outputTwo) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 3:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            second = returnNumber();
                            System.out.println(first + " * " + second + " = ?");
                            outputTwo = Integer.parseInt(sc.nextLine());
                            output = first * second;
                            if (output == outputTwo) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 4:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            second = returnNumber();
                            System.out.println(first + " / " + second + " = ?");
                            outputTwo = Integer.parseInt(sc.nextLine());
                            output = first / second;
                            if (output == outputTwo) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                    }
                }
                break;
            case 2:
                System.out.println("Kolik chceš příkladů?");
                countOfExamples = Integer.parseInt(sc.nextLine());
                countOfRightExamples = 0;
                for (int i = 0; i < countOfExamples; i++) {
                    int sign = (rd.nextInt((4 - 1) + 1) + 1);
                    switch (sign) {
                        case 1:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            Fraction one = returnFraction();
                            Fraction second = returnFraction();
                            System.out.println(one.getNumerator() + "/" + one.getDenominator() + " + " + second.getNumerator() + "/" + second.getDenominator() + " = ?/?");
                            System.out.print("Zadej čitatele: ");
                            int numerator = Integer.parseInt(sc.nextLine());
                            System.out.print("Zadej jmenovatele: ");
                            int denominator = Integer.parseInt(sc.nextLine());
                            Fraction output = one.plus(second);
                            Fraction outputTwo = new Fraction(numerator, denominator);
                            if (output.getNumerator() == outputTwo.getNumerator() && output.getDenominator() == outputTwo.getDenominator()) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 2:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            one = returnFraction();
                            second = returnFraction();
                            System.out.println(one.getNumerator() + "/" + one.getDenominator() + " - " + second.getNumerator() + "/" + second.getDenominator() + " = ?/?");
                            System.out.print("Zadej čitatele: ");
                            numerator = Integer.parseInt(sc.nextLine());
                            System.out.print("Zadej jmenovatele: ");
                            denominator = Integer.parseInt(sc.nextLine());
                            output = one.minus(second);
                            outputTwo = new Fraction(numerator, denominator);
                            if (output.getNumerator() == outputTwo.getNumerator() && output.getDenominator() == outputTwo.getDenominator()) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 3:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            one = returnFraction();
                            second = returnFraction();
                            System.out.println(one.getNumerator() + "/" + one.getDenominator() + " * " + second.getNumerator() + "/" + second.getDenominator() + " = ?/?");
                            System.out.print("Zadej čitatele: ");
                            numerator = Integer.parseInt(sc.nextLine());
                            System.out.print("Zadej jmenovatele: ");
                            denominator = Integer.parseInt(sc.nextLine());
                            output = one.times(second);
                            outputTwo = new Fraction(numerator, denominator);
                            if (output.getNumerator() == outputTwo.getNumerator() && output.getDenominator() == outputTwo.getDenominator()) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 4:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            one = returnFraction();
                            second = returnFraction();
                            System.out.println(one.getNumerator() + "/" + one.getDenominator() + " / " + second.getNumerator() + "/" + second.getDenominator() + " = ?/?");
                            System.out.print("Zadej čitatele: ");
                            numerator = Integer.parseInt(sc.nextLine());
                            System.out.print("Zadej jmenovatele: ");
                            denominator = Integer.parseInt(sc.nextLine());
                            output = one.dividedBy(second);
                            outputTwo = new Fraction(numerator, denominator);
                            if (output.getNumerator() == outputTwo.getNumerator() && output.getDenominator() == outputTwo.getDenominator()) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                    }
                }
                break;
            case 3:
                System.out.println("Kolik chceš příkladů?");
                countOfExamples = Integer.parseInt(sc.nextLine());
                countOfRightExamples = 0;
                for (int i = 0; i < countOfExamples; i++) {
                    int sign = (rd.nextInt((6 - 1) + 1) + 1);
                    /**
                     * 1. dec to bin
                     * 2. dec to hex
                     * 3. bin to dec
                     * 4. bin to hex
                     * 5. hex to dec
                     * 6. hex to bin
                     */
                    switch (sign) {
                        case 1:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            int first = returnNumber();
                            String output = Integer.toBinaryString(first);
                            System.out.println(first + "(decimal) to binary = ?");
                            String userOutput = sc.nextLine();
                            if (output.equals(userOutput)) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 2:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            output = Integer.toHexString(first);
                            System.out.println(first + "(decimal) to hexadecimal = ?");
                            userOutput = sc.nextLine();
                            if (output.equals(userOutput)) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 3:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            output = Integer.toBinaryString(first);
                            System.out.println(output + "(binary) to decimal = ?");
                            userOutput = sc.nextLine();
                            if (String.valueOf(first).equals(userOutput)) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 4:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            output = Integer.toBinaryString(first);
                            System.out.println(output + "(binary) to hexadecimal = ?");
                            output = Integer.toHexString(first);
                            userOutput = sc.nextLine();
                            if (output.equals(userOutput)) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 5:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            output = Integer.toHexString(first);
                            System.out.println(output + "(hexadecimal) to decimal = ?");
                            userOutput = sc.nextLine();
                            if (String.valueOf(first).equals(userOutput)) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                        case 6:
                            System.out.println((i + 1) + "/" + countOfExamples);
                            first = returnNumber();
                            output = Integer.toHexString(first);
                            System.out.println(output + "(hexadecimal) to binary = ?");
                            output = Integer.toBinaryString(first);
                            userOutput = sc.nextLine();
                            if (output.equals(userOutput)) {
                                System.out.println("Spávně");
                                countOfRightExamples++;
                            } else System.out.println("Špatně");
                            break;
                    }
                }
        }
        System.out.println("Počet správných příkladů: " + countOfRightExamples + "/" + countOfExamples);
    }

    public static Fraction returnFraction() {
        Random rd = new Random();
        int first = (rd.nextInt((10 - 1) + 1) + 1);
        int second = (rd.nextInt((10 - 1) + 1) + 1);
        return new Fraction(first, second);
    }
    public static int returnNumber() {
        Random rd = new Random();
        return (rd.nextInt((100 - 1) + 1) + 1);
    }
    public static void printMenu() {
        System.out.println("1. sčítání, odčítání, násobení a dělení celých čísel");
        System.out.println("2. sčítání, odčítání, násobení a dělení zlomků");
        System.out.println("3. převody mezi číselnými soustavami");
    }
}
