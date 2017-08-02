package myFirstWebProject.app;

import myFirstWebProject.entities.User;
import myFirstWebProject.service.GenericService;
import myFirstWebProject.service.UserService;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class WebApp {

    public static void main(String[] args) {

        BasicConfigurator.configure();
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring-config.xml");
        ctx.refresh();

        UserService userService = ctx.getBean("jpaUserService", UserService.class);
        GenericService planService = ctx.getBean("jpaPlanService", GenericService.class);
        GenericService clientService = ctx.getBean("jpaClientService", GenericService.class);
        GenericService contractService = ctx.getBean("jpaContractService", GenericService.class);
        GenericService optionService = ctx.getBean("jpaOptionService", GenericService.class);


        /*service.save(new User("con1", "co1"));
        service.save(new User("con2", "co2"));
        service.save(new User("con3", "co3"));




        List<User> users = userService.findAll();
        printAll(users);

        users = userService.findByLogin("con1");
        printAll(users);

        users = userService.findByLoginAndPassword("con2", "co2");
        printAll(users);
*/
    }

    private static void printAll(List<User> users) {
        System.out.println("printAll: ");
        for (User user : users) {
            System.out.println(user);
        }
    }

}
