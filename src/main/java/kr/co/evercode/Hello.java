package kr.co.evercode;

import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(Hello.class);

	@GetMapping(path="/hello1")
	public String hello1() {
		logger.info("#### logger test helloworld 1234!@#$");
		return "Hello World!";
	}
}
