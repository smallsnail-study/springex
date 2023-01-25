package org.zerock.springex.sample;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service    // 서비스 계층의 객체를 위한 어노테이션
@ToString
@RequiredArgsConstructor    // 필요한 생성자 함수를 자동으로 작성
public class SampleService {
    @Qualifier("normal")    // 객체가 여러개일때 특정 이름을 가진 객체를 주입한다.
    private final SampleDAO sampleDAO;    // 생성자 주입 방식 규칙 적용(주입 받아야 하는 객체의 변수는 final로 작성한다.)
}
