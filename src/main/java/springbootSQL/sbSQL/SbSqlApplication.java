package springbootSQL.sbSQL;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.flyway.FlywayAutoConfiguration;

// @SpringBootApplication(exclude = {FlywayAutoConfiguration.class})
@SpringBootApplication
public class SbSqlApplication {
	public static void main(String[] args) {
		SpringApplication.run(SbSqlApplication.class, args);
	}

}
