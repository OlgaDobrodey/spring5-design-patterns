package com.itrex.structural.bridge.course;

import com.itrex.structural.bridge.language.Language;

public class Physic extends Course {

    public Physic(Language languages) {
        super(languages);
    }

    @Override
    public void getSubjectCourse() {
        System.out.print("Course - Physic");
    }

}
