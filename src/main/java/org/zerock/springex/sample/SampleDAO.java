package org.zerock.springex.sample;

import org.springframework.stereotype.Repository;

@Repository     // 해당 클래스의 객체가 스프링에서 Bean으로 관리될 수 있도록 하는 어노테이션
public interface SampleDAO {    // 유연한 프로그램을 설계하기 위해 클래스를 인터페이스로 변경한다.(실체x)
}
