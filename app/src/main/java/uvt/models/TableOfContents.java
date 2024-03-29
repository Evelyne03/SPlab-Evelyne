package uvt.models;

import java.util.LinkedHashMap;
import java.util.Map;
import lombok.Data;

@Data
public class TableOfContents extends BaseElement implements Element{
    private Map<String, Integer> entries = new LinkedHashMap<>();
    public void print(){
        System.out.println("Sample");
    }

    @Override
    public void add(Element e){
        throw new UnsupportedOperationException();
    }

    public void addEntry(String title, Integer pageNumber){
        entries.put(title, pageNumber);
    }

    @Override
    public void removeElement(Element e){
        throw new UnsupportedOperationException();
    }

    @Override
    public Element get(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void accept(Visitor visitor){

    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Table of Contents");
        for(Map.Entry<String, Integer> entry: entries.entrySet()){
            sb.append(entry.getKey()).append("--------------------").append(entry.getValue()).append("\n");
        }
        return sb.toString();
    }
}
