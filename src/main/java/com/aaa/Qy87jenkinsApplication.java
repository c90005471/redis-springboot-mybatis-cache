package com.aaa;

import java.io.PrintStream;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class Qy87jenkinsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Qy87jenkinsApplication.class, args);//springboot项目默认启动方式
		SpringApplication app = new SpringApplication(Qy87jenkinsApplication.class);//实例化
		/*Banner banner= new Banner() {
			@Override
			public void printBanner(Environment environment, Class<?> sourceClass, PrintStream out) {
				out.append("111111111111111111111");
				out.println("432435435");
			}
		};
		app.setBanner(banner);*/
		app.run(args);//运行
	}

}

