package HelloSpring;

import HelloSpring.service.GreetingsService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
/**
 * Created by KGBkid on 18.07.2017.
 */


public class App {
    public static void main(String[] args) {

        BeanFactory factory = new XmlBeanFactory(new FileSystemResource("D:\\myFirstWebProject\\src\\main\\resources\\hello.xml"));

        GreetingsService greetingService = (GreetingsService) factory.getBean("greetingsService");

        greetingService.sayGreetings();
    }
}
