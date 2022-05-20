package app.model;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component("dog")
public class Dog extends Animal implements Serializable {

    @Override
    @Bean
    public String toString() {
        return "Im a Dog";
    }
}
