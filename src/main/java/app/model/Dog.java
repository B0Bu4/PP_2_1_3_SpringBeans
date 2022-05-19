package app.model;

import org.springframework.stereotype.Component;
import java.io.Serializable;

@Component
public class Dog extends Animal implements Serializable {
    public Dog(){
    }
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
