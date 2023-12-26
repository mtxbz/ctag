package org.ctnb.back.app.tgrm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BaseTest {
    protected static final String ROOT_API = "/tgrm/v1/";

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
