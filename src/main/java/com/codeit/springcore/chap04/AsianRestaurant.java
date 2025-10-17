package com.codeit.springcore.chap04;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// 스프링이 자동으로 객체를 생성하고, 그 객체의 생명주기 및 기타 등등을 관리
// 같은 타입의 객체를 여러 개 등록할 때는 별칭을 지어 주는 것이 좋음
// 짓지 않으면 클래스 이름을 따라감
@Component("asian")
public class AsianRestaurant implements Restaurant {

    private Chef chef;
    private Course course;

    // 의존객체를 직접 생성하는게 아니라 외부에서 생성자를 통해 전달할 예정
    public AsianRestaurant(@Qualifier("kim") Chef chef, @Qualifier("sushi") Course course) {
        this.chef = chef;
        this.course = course;
    }

    public void order() {
        System.out.println("안녕하세요, 아시안 레스토랑입니다.");
        chef.cook();
        course.combineMenu();
    }
}
