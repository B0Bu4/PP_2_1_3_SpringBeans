package app.model;

import org.springframework.stereotype.Component;
import java.io.Serializable;
import java.util.Objects;

@Component("dog")
public class Dog extends Animal implements Serializable {

    private String dogSay = "Im a Dog";

    public Dog(){

    }

    public Dog(String dogSay) {
        this.dogSay = dogSay;
    }

    public String getDogSay() {
        return dogSay;
    }

    public void setDogSay(String dogSay) {
        this.dogSay = dogSay;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return dogSay.equals(dog.dogSay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dogSay);
    }

    @Override
    public String toString() {
        return dogSay;
    }
}
