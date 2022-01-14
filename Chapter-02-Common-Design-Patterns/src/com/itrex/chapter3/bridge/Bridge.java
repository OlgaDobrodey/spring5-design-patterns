package com.itrex.chapter3.bridge;

import com.itrex.chapter3.bridge.course.Physic;
import com.itrex.chapter3.bridge.language.English;

public class Bridge {

    public static void main(String[] args) {

        Physic physic = new Physic(new English());
        physic.getSubjectCourse();
        physic.print();
    }

}
