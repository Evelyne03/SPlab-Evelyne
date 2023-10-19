package com.example.splabevelyne;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;


public class SPlabEvelyneApplication {
        public static void main(String[] args) {
                Book discoTitanic = new Book("Disco Titanic");
                Author author = new Author("Radu Pavel Gheo");
                discoTitanic.addAuthor(author);
                int indexChapterOne = discoTitanic.createChapter("Capitolul 1");
                Chapter chp1 = discoTitanic.getChapter(indexChapterOne);
                int indexSubChapterOneOne = chp1.createSubchapter("Subcapitolul 1.1");
                Subchapter scOneOne = chp1.getSubchapter(indexSubChapterOneOne);
                scOneOne.createNewParagraph("Paragraph 1");
                scOneOne.createNewParagraph("Paragraph 2");
                scOneOne.createNewParagraph("Paragraph 3");
                scOneOne.createNewImage("Image 1");
                scOneOne.createNewParagraph("Paragraph 4");
                scOneOne.createNewTable("Table 1");
                scOneOne.createNewParagraph("Paragraph 5");
                scOneOne.print();
        }

}