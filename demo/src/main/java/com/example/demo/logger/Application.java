package com.example.demo.logger;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {


        public static final Logger logger= LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        logger.debug("Welcome to spring concept demo!");
        ApplicationContext context=  SpringApplication.run(Application.class,args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.debug("Retrieved Bean: {}", demoBean.getMessage());
        logger.debug("\n*** Example using @Autowired annontation property");
    }
}
