package org.zerock.springex.sample;

import org.springframework.stereotype.Repository;

@Repository
public class EventSampleDAOImpl implements SampleDAO{   // 특정한 기간에만 SampleDAO를 다른 객체로 변경한다.
    // 그러나 이렇게 설정하면 SampleService에 필요한 SampleDAO 타입의 Bean이 2개(SampleDAOImple, EventSampleDAOImpe)가 되기 떄문에
    // 스프링의 입장에서 어떤 것을 주입해야 하는지 알 수 없게 되어 오류가 발생한다.
}
