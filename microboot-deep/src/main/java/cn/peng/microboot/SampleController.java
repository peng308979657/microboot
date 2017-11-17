package cn.peng.microboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//@ImportResource(locations = {"classpath:spring/spring-*.xml"})
@SpringBootApplication
public class SampleController {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }
}
