package com.company;

public class Fraction {
    private int numerator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private int denominator;

    public static int findGreatestCommonDenominator(int a, int b) {
        int low = 0, high = 0;
        if (a < b) {
            low = a;
            high = b;
        } else {
            low = b;
            high = a;
        }
        for (int i = low; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) return i;
        }
        return 1;
    }
    public static int findLowestCommonMultiple(int a, int b) {
        int low = 0, high = 0;
        if (a < b) {
            low = a;
            high = b;
        } else {
            low = b;
            high = a;
        }
        for (int i = 1; i <= low; i++) {
            if ((high * i) % low == 0) return high * i;
        }
        return (a * b);
    }

    public Fraction plus(Fraction other) {
        int smallestMultiple = findLowestCommonMultiple(getDenominator(), other.getDenominator());
        int firstNumerator = smallestMultiple / getDenominator();
        int secondNumerator = smallestMultiple / other.getDenominator();
        int nominator = (firstNumerator * getNumerator()) + (secondNumerator * other.getNumerator());
        return new Fraction(nominator, smallestMultiple);
    }
    public Fraction minus(Fraction other) {
        int smallestMultiple = findLowestCommonMultiple(getDenominator(), other.getDenominator());
        int firstNumerator = smallestMultiple / getDenominator();
        int secondNumerator = smallestMultiple / other.getDenominator();
        int nominator = (firstNumerator * getNumerator()) - (secondNumerator * other.getNumerator());
        return new Fraction(nominator, smallestMultiple);
    }
    public Fraction times(Fraction other) {
        int newNumerator = getNumerator() * other.getNumerator();
        int newDenominator = getDenominator() * other.getDenominator();
        return new Fraction(newNumerator, newDenominator);
    }
    public Fraction dividedBy(Fraction other) {
        return times(other.getReciprocal());
    }
    public Fraction getReciprocal() {
        return new Fraction(getDenominator(), getNumerator());
    }
}
