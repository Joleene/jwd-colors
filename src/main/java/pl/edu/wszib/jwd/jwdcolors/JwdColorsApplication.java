package pl.edu.wszib.jwd.jwdcolors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;


//@PropertySource("classpath:db-postgres.properties")
@SpringBootApplication
public class JwdColorsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwdColorsApplication.class, args);
    }

}
