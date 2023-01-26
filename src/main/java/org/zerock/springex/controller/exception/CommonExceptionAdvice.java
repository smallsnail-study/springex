package org.zerock.springex.controller.exception;

import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice   // 컨트롤러에서 발생하는 예외에 맞게 처리할 수 있는 기능 제공
@Log4j2
public class CommonExceptionAdvice {    // @ControllerAdvice가 선언된 클래스는 스프링의 Bean으로 처리된다.

    @ResponseBody   // REST방식, 문자열이나 JSON데이터를 그대로 전송할 떄 사용하는 어노테이션
//  NumberFormatException타입을 지정하면 @ExceptionHandler를 가진 모든 메소드에서 해당타입의 예외를 파라미터로 전달받을 수 있다.
    @ExceptionHandler(NumberFormatException.class)
    public String exceptionNumber(NumberFormatException numberFormatException) {

        log.error("-----------------------------------");
        log.error(numberFormatException.getMessage());

        return "NUMBER FORMAT EXCEPTION";   // NumberFormatException이 발생하면 화면에 "NUMBER FORMAT EXCEPTION" 이 표기된다.
    }

}
