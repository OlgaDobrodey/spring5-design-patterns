package com.itrex.chapter3.bridge.course;

import com.itrex.chapter3.bridge.language.Language;

public class Physic extends Course {

    public Physic(Language languages) {
        super(languages);
    }

    @Override
    public void getSubjectCourse() {
        System.out.print("Course - Physic");
    }

}
