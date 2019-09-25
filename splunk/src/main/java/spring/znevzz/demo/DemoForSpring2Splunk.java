package spring.znevzz.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;


@SpringBootApplication
@EnableIntegration
@ImportResource("spring/spring-integration.xml")
public class DemoForSpring2Splunk {

	private static ApplicationContext applicationContext;

	public static void main(String[] args) {
		applicationContext = SpringApplication.run(DemoForSpring2Splunk.class, args);
		MessageChannel receiveChannel = (MessageChannel)
				DemoForSpring2Splunk.applicationContext.getBean("receiveChannel");
	}

}
