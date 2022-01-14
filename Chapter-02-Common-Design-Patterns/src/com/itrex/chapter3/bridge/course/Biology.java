package com.itrex.chapter3.bridge.course;

import com.itrex.chapter3.bridge.language.Language;

public class Biology extends Course {

    private Language language;

    public Biology(Language languages) {
        super(languages);
    }

    @Override
    void getSubjectCourse() {
        System.out.print("Course - Biology");
    }

}
