package com.kodilla;

class Calculator {

    public int addAToB(int a, int b) {
        return a + b;
    }
    public int substractAFromB(int a,int b) {
        return a - b;
    }

    public static void main(String args[]) {
        Calculator calculator = new Calculator();

        int result = calculator.addAToB(15, 20);
        int result2 = calculator.substractAFromB(15, 20);
        System.out.println("Wynik dodawania to: " + result);
        System.out.println("Wynik odejmowania to: " + result2);
    }
}
