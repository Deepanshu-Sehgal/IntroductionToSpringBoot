package com.datricle.deepanshu.intro.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {

//	@Autowired
//	Apple obj1;
//
//	@Autowired
//	Apple obj2;

	@Autowired
	DBService dbService;


	public static void main(String[] args) {
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		obj1.eatApple();
//		obj2.eatApple();

//		System.out.println(obj1.hashCode());
//		System.out.println(obj2.hashCode());

		System.out.println(dbService.getData());

	}
}