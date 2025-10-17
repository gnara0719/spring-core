package com.codeit.springcore.chap04;

import org.springframework.stereotype.Component;

@Component("john")
public class JohnChef implements Chef {
    public void cook() {
        System.out.println("John Chef가 요리를 시작합니다.");
    }
}
