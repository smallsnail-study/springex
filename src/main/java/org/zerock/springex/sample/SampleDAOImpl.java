package org.zerock.springex.sample;

import org.springframework.stereotype.Repository;

@Repository     // 해당 클래스의 객체를 스프링의 Bean으로 처리되도록 한다.
public class SampleDAOImpl implements SampleDAO{    // SampleDAO인터페이스는 실체가 없기 때문에 인터페이스를 구현한 클래스를 선언한다.
}
