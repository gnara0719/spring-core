package com.codeit.springcore.chap02;

public class AsianRestaurant {

    private KimChef chef = new KimChef();

    private SuShiCourse course = new SuShiCourse();

    public void order() {
        System.out.println("안녕하세요, 아시안 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }
}
