package org.example.config;

import org.example.Cat;
import org.example.Person;
import org.example.Pet;
import org.example.aop.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
@PropertySource("properties")
@EnableAspectJAutoProxy
public class MyConfig {

    @Bean
   public Library libraryBean() {
        return new Library();
    }
}
