package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication /* составная аннотация, объединяющая три другие
аннотации @SpringBootConfiguration , @EnableAutoConfiguration , @ComponentScan
*/
public class Starter {

	public static void main(String[] args)  {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		List<WebPage> webPages = new ArrayList<>();
		webPages.add(context.getBean("headerAboutUs", AboutUs.class));
		webPages.add(context.getBean("headerHomePage", HomePage.class));
		webPages.add(context.getBean("headerIndieGame", IndieGamesPage.class));

		User user1 = context.getBean("user", User.class);
		System.out.println("BEAN 1ST:\n" + user1 + "\n");
		user1.setWebPages(webPages);
		user1.setTimeReading(8);
		user1.setNickname("Globglogabgalab"); //change the nickname

		user1.readAllPages();
		System.out.println("\n"+ user1 + "\n");

		User user2 = context.getBean("user1", User.class);
		System.out.println("BEAN 2ND:\n" + user2 + "\n");

		User user3 = context.getBean("user2", User.class);
		System.out.println("BEAN 3RD:\n" + user3 + "\n");

		context.close();
//		Thread.sleep(1000);
	}

}
