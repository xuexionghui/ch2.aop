package com.bee.sample.ch2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.Banner.Mode;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ch2Application {

	public static void main(String[] args) {
		//SpringApplication.run(Ch2Application.class, args);
        SpringApplication application = new SpringApplication(Ch2Application.class);
        application.setBannerMode(Mode.OFF);
        application.run(args);
	}

}
