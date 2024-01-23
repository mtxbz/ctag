package org.ctnb.back.app.endpoint.web;

import org.ctnb.back.app.endpoint.web.service.CarService;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = TestApplication.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseControllerTest {
    protected static final String ROOT_WEB = "/";

    @MockBean
    protected CarService carService;

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    public <T> ResponseEntity<T> get(String url, Class<T> responseType, Object... urlVariables) {
        return this.restTemplate.getForEntity("http://localhost:" + port + url, responseType, urlVariables);
    }

    public <T> ResponseEntity<T> get(String url, Class<T> responseType) {
        return this.restTemplate.getForEntity("http://localhost:" + port + url, responseType);
    }
}
