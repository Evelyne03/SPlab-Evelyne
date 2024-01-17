package uvt.models;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.*;

@Entity
public class Subchapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subchapter")
    private List<Element> elements;
    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;
    Subchapter(String name, List<Element> elements){
        this.name = name;
        elements = null;
    }
    public Subchapter() {
    }
    public Subchapter(String title) {
    }


    public void createNewParagraph(String text){
        if(elements == null)
            elements = new ArrayList<Element>();
        this.elements.add(new Paragraph(text));
    }

    public void createNewImage(String imagename){
        if(elements == null)
             elements = new ArrayList<Element>();
        this.elements.add(new Image(imagename));
    }

    public void createNewTable(String tableName){
        if(elements == null)
            elements = new ArrayList<Element>();
        this.elements.add(new Table(tableName));
    }

    public void print(){
        System.out.println("Subchapter name: " + name + "\n\n\n");
        for(Element e: elements){
            e.print();
            System.out.println('\n');
        }
    }

    public String getTitle(){
        return name;
    }
}
