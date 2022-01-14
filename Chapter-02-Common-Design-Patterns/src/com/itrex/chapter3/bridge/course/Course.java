package com.itrex.chapter3.bridge.course;

import com.itrex.chapter3.bridge.language.Language;

public abstract class Course {

    protected Language languages;

    public Course(Language languages) {
        this.languages = languages;
    }

    abstract void getSubjectCourse();

    public void print() {
        System.out.println(" with " + languages.getLanguages());
    }

}
