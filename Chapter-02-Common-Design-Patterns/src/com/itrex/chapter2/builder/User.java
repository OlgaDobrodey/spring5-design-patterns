package com.itrex.chapter2.builder;

import lombok.ToString;

@ToString
public class User {

    private String name;
    private Integer age;
    private String address;

    public User(Builder builder) {
        name = builder.name;
        age = builder.age;
        address = builder.address;
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private String name;
        private Integer age;
        private String address;

        Builder() {
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }

    }

}
