package uvt.models;

import java.util.concurrent.TimeUnit;
import jakarta.persistence.*;

@Entity
public class Image extends Element {
    @Column(name = "url")
    private String name;
    private String url;
    public Image() {
    }
    public Image(String url, String name) {
        this.url = url;
        this.name = name;
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public Image(String url) {
            this.url = url;
        }

        @Override
        public void print() {
            System.out.println("Image with url: " + url);
        }

        @Override
        public void add(Element e){
            throw new UnsupportedOperationException();
        }

        @Override
        public void removeElement(Element e){
            throw new UnsupportedOperationException();
        }

        @Override
        public Element get(int i){
            throw new UnsupportedOperationException();
        }

        @Override
        public void accept(Visitor visitor){
        visitor.visitImage(this);
        }

        public String getImageName(){
        return name;
        }

        public void setImageName(String name){
        this.name = name;
        }
    }
