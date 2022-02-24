package com.itrex.behovioral.tamplate;

class Main {
    public static void main(String[] args) {
        System.out.println("Draw Russia Flag:");
        AbstractThreeRowsFlag russianFlag = new RussianFlag();
        russianFlag.drawFlag();

        System.out.println("\nDraw Nether Flag:");
        AbstractThreeRowsFlag netherlandsFlag = new NetherlandsFlag();
        netherlandsFlag.drawFlag();
    }
}
