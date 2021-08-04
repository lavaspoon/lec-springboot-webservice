package com.lavaspoon.book.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //스프링부트의 자동설정, Bean읽기 생성을 모두 자동저장으로 설정
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }
}
