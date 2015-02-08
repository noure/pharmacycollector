package ma.nour.phar;
/**
 * this class is used to run the application 
 * default port is 8080 
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ma.nour.phar")
@EnableAutoConfiguration 
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
