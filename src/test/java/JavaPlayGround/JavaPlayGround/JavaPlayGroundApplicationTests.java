package JavaPlayGround.JavaPlayGround;

import JavaPlayGround.JavaPlayGround.service.IntegrationTestsPOC;
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
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.util.Assert;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(classes = {JavaPlayGroundApplication.class},webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
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
//    @Autowired
//    @Qualifier("testVar")
//    private String testVar;

    /**
     * The ResponseEntity instance
     */
    ResponseEntity<String> responseEntity;

//    @Test
//    public void testGetEmployee() {
////        String url = "http://localhost:" + port + "/javaplayground/getEmployeeDetails";
////        UriComponents uri = UriComponentsBuilder.fromHttpUrl(url).queryParam("employeeId", "11").build();
////        HttpEntity<String> requestEntity = new HttpEntity<>(null,null);
////        ResponseEntity<String> response = testRestTemplate.exchange(uri.toString(), HttpMethod.GET,requestEntity,String.class);
////        System.out.println("response is "+response.getBody());
//        System.out.println("app name is: "+appName);
//    }
    @Test
    public void testWelcomeMethod() throws Exception {
        System.out.println("AZURE_CLIENT_ID is : "+ System.getenv("AZURE_CLIENT_ID"));
        System.out.println("Env is : "+ System.getenv());

//        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
//        params.add("applicantName", appName);
//        System.out.println("testVar is : "+ testVar);
//        String queryApiUrl = "http://localhost:" + port + "/javaplayground/welcomenote";
//        String urlQuery = buildUriString(queryApiUrl, params);
//        HttpEntity<String> requestEntity = new HttpEntity<>(null, null);
//        ResponseEntity<String> responseEntity = testRestTemplate.exchange(urlQuery, HttpMethod.GET, requestEntity, String.class);
//        System.out.println(responseEntity.getBody());
        //throw new Exception("test");
    }

    /**
     * build uri from url attributes and parameters
     *
     * @param url:    url for uri
     * @param params: parameters for query
     * @return string
     */
    private String buildUriString(String url, MultiValueMap<String, String> params) {
        UriComponents uri;
        if (!params.isEmpty()) {
            uri = UriComponentsBuilder.fromHttpUrl(url).queryParams(params).build();
        } else {
            uri = UriComponentsBuilder.fromHttpUrl(url).build();
        }
        return uri.toString();
    }
}