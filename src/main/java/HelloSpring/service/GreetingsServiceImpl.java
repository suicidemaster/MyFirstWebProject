package HelloSpring.service;

/**
 * Created by KGBkid on 16.07.2017.
 */


public class GreetingsServiceImpl implements GreetingsService {
    private String greetings;

    public void setGreetings(String greetings) {
        this.greetings = greetings;
    }

   // public GreetingsServiceImpl() {}

    public GreetingsServiceImpl(String greetings) {
        this.greetings = greetings;
    }

    public void sayGreetings() {
        System.out.println(greetings);
    }
}
