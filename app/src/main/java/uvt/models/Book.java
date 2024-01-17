package uvt.models;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Book{
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private Long id;
        private String title;
        @OneToMany(cascade = CascadeType.ALL)
        @JoinColumn(name = "book_id")
        private List<Element> sections;
        @ManyToMany(cascade = CascadeType.ALL)
        private List<Author> authors;
        public Book(){}
        public Book(String title, List<Chapter> chapters){
            this.title = title;
            this.sections = sections;
        }

        public void addAuthor(Author a){
            authors.add(a);
        }

        public Book(String title){
            this.title = title;
            authors = new ArrayList<Author>();
            sections = null;
        }

        public int createSection(String ChapterTitle){
            if(sections == null){
                sections = new ArrayList<Element>();
            }
            Section newSection = new Section("ChapterTitle");
            sections.add(newSection);
            return sections.size();
        }

        public void print(){
            System.out.println("Book " + title);
            System.out.println("\n\nAuthors: ");
            for(Author a: authors)
                a.print();
            System.out.println();
            for(Element e: sections)
                e.print();
        }

        public Element getSection(int index){
            return sections.get(index - 1);
        }

        public void addContent(Element paragraph){
            if(sections == null)
                sections= new ArrayList<Element>();
            sections.add(paragraph);
        }

        public String getTitle(){
            return title;
        }


        public List<Element> getSections(){
            return sections;
        }

        public void setAuthors(List<Author> authors){
            this.authors = authors;
        }

        public void setSections(List<Element> sections){
            this.sections = sections;
        }

        public List<Author> getAuthors(){
            return authors;
        }
}


