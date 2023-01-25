package org.zerock.springex.sample;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service    // 서비스 계층의 객체를 위한 어노테이션
@ToString
public class SampleService {
    @Autowired
    private SampleDAO sampleDAO;
}
