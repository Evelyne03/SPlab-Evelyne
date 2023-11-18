package splab.evelyne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import services.*;
import models.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;



@SpringBootApplication
@ComponentScan("services")
public class SPlabEvelyneApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SPlabEvelyneApplication.class, args);
        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

        c = (ClientComponent)context.getBean("clientComponent");
        c.operation();


    }
    }
