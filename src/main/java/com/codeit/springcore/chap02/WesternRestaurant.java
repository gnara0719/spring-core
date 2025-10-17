package com.codeit.springcore.chap02;

public class WesternRestaurant {


    private JohnChef chef = new JohnChef();

    private WesternCourse course = new WesternCourse();

    public void order() {
        chef.cook();
        course.combineMenu();
    }
}
