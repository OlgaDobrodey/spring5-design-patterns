package com.packt.patterninspring.chapter11.web;

import rx.Observable;
import rx.Observer;

public class Main {

    public Main() {
        super();
    }

    public static void main(String[] args) {
        Observable<String> locations = Observable.just("Minsk", "Krakov", "Moskow", "Kiev", "Sofia");
        Observer<Integer> observer = new Observer<Integer>() {
            @Override
            public void onCompleted() {
                System.out.println("Done");
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onNext(Integer integer) {
                System.out.println("Length: " + integer);
            }
        };
        locations.map(String::length).filter(l -> l >= 5).subscribe(observer);
    }

}
