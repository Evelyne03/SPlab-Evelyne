package uvt.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;

@Entity

public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "chapter")
    private List<Subchapter> subchapterList;
    public Chapter(String name, List<Subchapter> subchapters){
        this.name = name;
        subchapterList = subchapters;
    }
    public Chapter() {
    }
    public Chapter(String name){
        this.name = name;
        subchapterList = null;
    }

    public void print(){

        System.out.println("Chapter name: " + name);
    }

    public int createSubchapter(String title){
        if(subchapterList == null)
            subchapterList = new ArrayList<Subchapter>();
        subchapterList.add(new Subchapter(title));
        return subchapterList.size();
    }

    public Subchapter getSubchapter(int index){
        return subchapterList.get(index - 1);
    }

}
