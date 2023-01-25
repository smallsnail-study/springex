package org.zerock.springex.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}
