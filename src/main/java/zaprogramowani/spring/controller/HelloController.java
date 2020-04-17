package zaprogramowani.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zaprogramowani.spring.application.Item;

@RestController
public class HelloController {

    @Autowired
    private Item item;

    @RequestMapping("/")
    public String index(){
        return item.print();
    }

//https://www.baeldung.com/inversion-control-and-dependency-injection-in-spring
}
