package uvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"uvt.models", "uvt.services", "uvt.commands", "uvt.repos", "uvt.evelyne"})
public class SPlabEvelyneApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SPlabEvelyneApplication.class, args);


    }
    }
