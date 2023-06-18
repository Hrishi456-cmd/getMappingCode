package com.geekster.getMapping;

import com.geekster.getMapping.sendEmailJAVA.MailHandler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GetMappingApplication {

	public static void main(String[] args) {

		SpringApplication.run(GetMappingApplication.class, args);

		MailHandler mailHandler = new MailHandler();
		mailHandler.sendMail();
	}

}
