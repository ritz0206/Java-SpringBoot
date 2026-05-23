package SpringBoot1.demo;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    private Computer lap;
    private int age;
    //generate getter and setter
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    //generate getter and setter for laptop
    public Computer getLaptop() {
        return lap;
    }
    public void setComputer(Computer lap) {
        this.lap = lap;
    }
    public void code()
    {
       lap.compile();
    }
    
}
