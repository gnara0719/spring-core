package com.codeit.springcore.chap04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wes")
public class WesternRestaurant implements Restaurant {


    private Chef chef;

    private Course course;

    public WesternRestaurant(@Qualifier("john") Chef chef, @Qualifier("wc") Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        chef.cook();
        course.combineMenu();
    }
}
