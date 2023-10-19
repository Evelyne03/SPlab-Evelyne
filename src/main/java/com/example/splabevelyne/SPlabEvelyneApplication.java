package com.example.splabevelyne;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class SPlabEvelyneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SPlabEvelyneApplication.class, args);
        Book discoTitanic = new Book("Disco Titanic");
        Author author = new Author("Radu Pavel Gheo");
        discoTitanic.addAuthor(author);
        int IndexChapterOne = discoTitanic.createChapter("Chapter 1");
        Chapter chp1 = discoTitanic.getChapter(1);
        int indexSubChapterOneOne = chp1.createSubchapter("Subchapter 1.1");
        Subchapter scOne0ne = chp1.getSubchapter(indexSubChapterOneOne);
        //scOneOne.createNewParagraph("Paragraph 1");
        //scOneOne.createNewParagraph("Paragraph 2");
        //scOneOne.createNewParagraph("Paragraph 3");
        //scOneOne.createNewImage("Image 1");
        //scOneOne.createNewParagraph("Paragraph 4");
        //ScOneOne.createNewTable("Table 1");
        //scOneOne.createNewParagraph("Paragraph 5");
        //scOneOne.print();
    }

}






