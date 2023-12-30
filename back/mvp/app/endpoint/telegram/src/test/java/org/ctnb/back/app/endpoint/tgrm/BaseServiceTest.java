package org.ctnb.back.app.endpoint.tgrm;

import org.ctnb.back.app.domain.service.DomCarService;
import org.junit.jupiter.api.TestInstance;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest(classes = TestApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseServiceTest {

    @MockBean
    protected DomCarService domCarService;
}