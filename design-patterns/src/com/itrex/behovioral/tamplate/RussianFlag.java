package com.itrex.behovioral.tamplate;

class RussianFlag extends AbstractThreeRowsFlag {

    @Override
    void drawUpperLevel() {
        Colors.paintWhiteColor();
    }

    @Override
    void drawMiddleLevel() {
        Colors.paintBlueColor();
    }

    @Override
    void drawBottomLevel() {
        Colors.paintRedColor();
    }

    @Override
    void drawBlazon() {
        System.out.println("draw blazon");
    }
}
