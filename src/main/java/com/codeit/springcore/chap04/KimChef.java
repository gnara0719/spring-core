package com.codeit.springcore.chap04;

import org.springframework.stereotype.Component;

@Component("kim")
public class KimChef implements Chef {

    public void cook() {
        System.out.println("KimChef가 요리를 만듭니다.");
    }
}
