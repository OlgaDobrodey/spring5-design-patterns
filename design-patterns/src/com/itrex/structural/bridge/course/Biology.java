package com.itrex.structural.bridge.course;

import com.itrex.structural.bridge.language.Language;

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
