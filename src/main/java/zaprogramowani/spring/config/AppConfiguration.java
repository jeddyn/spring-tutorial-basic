package zaprogramowani.spring.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zaprogramowani.spring.application.Item;
import zaprogramowani.spring.application.ItemImpl;
import zaprogramowani.spring.application.Store;

@Configuration
public class AppConfiguration {

    @Bean
    public Item item1(){
        return new ItemImpl();
    }

    @Bean
    public Store store(){
        return new Store(item1());
    }
}
