package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.springex.dto.TodoDTO;

import java.time.LocalDate;

@Controller     // 해당 클래스가 스프링MVC에서 컨트롤러 역할을 한다는 것을 의미, 스프링의 Bean으로 처리되기 위해서 사용
@Log4j2
public class SampleController {

    @GetMapping("/hello")
    public void hello() {
        log.info("hello..........");
    }

    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info("ex1............");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    @GetMapping("/ex2")
    // @RequestParam은 기본값(defaultValud)을 지정할 수 있는 어노테이션
    public void ex2(@RequestParam(name = "name", defaultValue = "AAA") String name,
                    @RequestParam(name = "age", defaultValue = "20") int age) {
        log.info("ex2.........");
        log.info("name: " + name);
        log.info("age: " + age);
    }

    @GetMapping("/ex3")     // HTTP는 문자열로 데이터를 전달하기 때문에 컨트롤러는 문자열을 기준으로 특정한 클래스의 객체를 처리
    public void ex3(LocalDate dueDate) {    // 날짜 관련 타입의 파라미터 수집은 에러발생
        log.info("ex3..........");
        log.info("dueDate: " + dueDate);
    }

    @GetMapping("/ex4")
    public void ex4(Model model) {  // 모델이라고 부르는 데이터를 객체로 이용해서 JSP로 전달
        log.info("------------------------");
        // Model에는 addAttribute()메소드를 이용해서 뷰에 전달할 '이름'과'값'을 지정할 수 있다.
        model.addAttribute("message", "Hello World");
    }

    @GetMapping("/ex4_1")   // 파라미터가 getter/setter를 이용하는 Java Beans형식의 사용자정의 클래스인 경우
    public void ex4_1(TodoDTO todoDTO, Model model) {   // 자동으로 변수명이 todoDTO로 생성된다.
        log.info(todoDTO);
    }
    /* 자동으로 생성된 변수명 todoDTO 외에 다른 이름을 사용하고 싶다면 @ModelAttribute()로 지정하면 된다.
    public void ex4_1(@ModelAttribute("dto") TodoDTO todoDTO, Model model) {    // 변수명 dto
        log.info(todoDTO);
    } */
}
