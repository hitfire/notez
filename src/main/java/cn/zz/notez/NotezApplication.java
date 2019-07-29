package cn.zz.notez;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@tk.mybatis.spring.annotation.MapperScan(basePackages = "cn.zz.notez.domain.mapper.*")
public class NotezApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotezApplication.class, args);
	}
}
