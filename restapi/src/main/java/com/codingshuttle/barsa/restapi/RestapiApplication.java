package com.codingshuttle.barsa.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestapiApplication {
	
//	@Autowired
//	DB db;
//
//	public static void main(String[] args) {
//		SpringApplication.run(RestapiApplication.class, args);
//		
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//       System.out.println(db.getData());		
//	}
   public static void main(String[] args) {
       SpringApplication.run(RestapiApplication.class, args);
   }
}
