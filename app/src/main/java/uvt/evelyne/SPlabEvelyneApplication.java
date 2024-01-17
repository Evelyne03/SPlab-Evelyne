package uvt.evelyne;

import uvt.models.Book;
import uvt.models.Element;
import uvt.models.Paragraph;
import uvt.models.Section;
import uvt.services.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"uvt.models", "uvt.services"})
public class SPlabEvelyneApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SPlabEvelyneApplication.class, args);


    }
    }
