package JavaPlayGround.JavaPlayGround;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(IntegrationTestConfiguration.class)
//@ActiveProfiles("test")
class JavaPlayGroundApplicationTests {
    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate testRestTemplate;
    @Autowired
    @Qualifier("appName")
    private String appName;

    @Test
    public void testGetEmployee() {
//        String url = "http://localhost:" + port + "/javaplayground/getEmployeeDetails";
//        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).queryParam("employeeId", "11").build();
//        HttpEntity<String> requestEntity = new HttpEntity<>(null,null);
//        ResponseEntity<String> response = testRestTemplate.exchange(uri.toString(), HttpMethod.GET,requestEntity,String.class);
//        System.out.println("response is "+response.getBody());
        System.out.println("app name is: "+appName);
    }

}