package SpringBoot1.demo;
import org.springframework.stereotype.Component;


@Component
public class Laptop implements Computer {

    @Override
    public void compile() {
        System.out.println("I am Compiling in Laptop...");
    }

}
