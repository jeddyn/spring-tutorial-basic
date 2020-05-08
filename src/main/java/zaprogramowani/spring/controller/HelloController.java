package zaprogramowani.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zaprogramowani.spring.application.Item;
import zaprogramowani.spring.dependency.Coach;
import zaprogramowani.spring.dependency.TennisCoach;

@RestController
public class HelloController {

    @Autowired
    private Item item;

    @Autowired
    Coach tennisCoach;

    @RequestMapping("/")
    public String index(){
        return tennisCoach.getDailyFortune();
    }

//https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
}
