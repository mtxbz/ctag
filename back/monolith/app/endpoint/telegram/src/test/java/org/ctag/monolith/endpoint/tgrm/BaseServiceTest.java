package org.ctag.monolith.endpoint.tgrm;

import org.ctag.monolith.domain.car.service.DomCarService;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = TestApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseServiceTest {

    @MockBean
    protected DomCarService domCarService;
}