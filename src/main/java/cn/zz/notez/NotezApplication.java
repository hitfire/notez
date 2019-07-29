package cn.zz.notez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ServletComponentScan({"cn.zz.notez.filter"})//扫描filter
public class NotezApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotezApplication.class, args);
	}
}
