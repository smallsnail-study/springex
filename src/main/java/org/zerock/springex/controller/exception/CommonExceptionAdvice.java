package org.zerock.springex.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice   // 컨트롤러에서 발생하는 예외에 맞게 처리할 수 있는 기능 제공
@Log4j2
public class CommonExceptionAdvice {    // @ControllerAdvice가 선언된 클래스는 스프링의 Bean으로 처리된다.

}
