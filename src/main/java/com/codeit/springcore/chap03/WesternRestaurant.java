package com.codeit.springcore.chap03;

public class WesternRestaurant implements Restaurant {


    private Chef chef;

    private Course course;

    public WesternRestaurant(Chef chef, Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        chef.cook();
        course.combineMenu();
    }
}
