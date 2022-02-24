package com.itrex.structural.bridge;

import com.itrex.structural.bridge.course.Physic;
import com.itrex.structural.bridge.language.English;

public class Bridge {

    public static void main(String[] args) {

        Physic physic = new Physic(new English());
        physic.getSubjectCourse();
        physic.print();
    }

}
