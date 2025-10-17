package com.codeit.springcore.chap01;

import com.codeit.springcore.chap02.Restaurant;

public class WesternRestaurant implements Restaurant {


    private JohnChef chef = new  JohnChef();

    private WesternCourse course = new  WesternCourse();

    public void order() {
        chef.cook();
        course.combineMenu();
    }
}
