package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * Created by octavio on 3/30/17.
 */
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String args[]) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
        return args -> {
            Person person = restTemplate.getForObject(
                    "https://radiant-eyrie-89206.herokuapp.com/person/1", Person.class);
            log.info(person.toString());

            User user = new User("777 White House", "erik@gmail.com", "groupA", 126, "Big Pappa");
                    restTemplate.postForObject(
                    "https://young-shelf-69194.herokuapp.com/user", user, User.class);
            log.info(user.toString());

        };
    }
}

