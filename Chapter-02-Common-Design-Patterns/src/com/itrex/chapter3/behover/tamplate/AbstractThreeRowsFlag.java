package com.itrex.chapter3.behover.tamplate;

abstract class AbstractThreeRowsFlag {

    abstract void drawUpperLevel();

    abstract void drawMiddleLevel();

    abstract void drawBottomLevel();

    final void drawFlag() {
        drawUpperLevel();
        drawMiddleLevel();
        drawBottomLevel();
        drawBlazon();
        drawFlagpole();
    }

    void drawFlagpole() {
        System.out.println("Flag got");
    }

    void drawBlazon() {
    }

}
