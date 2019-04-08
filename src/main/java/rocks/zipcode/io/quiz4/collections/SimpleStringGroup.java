package rocks.zipcode.io.quiz4.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 * @author leon on 11/12/2018.
 */
public class SimpleStringGroup implements Iterable{

    Integer count;
    List<String> group;

    public SimpleStringGroup() {
        this.group = new ArrayList<>();
    }

    public Integer count() {
        return group.size();
    }

    public void insert(String string) {
        group.add(string);
    }

    public Boolean has(String string) {
        return group.contains(string);
    }

    public String fetch(int indexOfValue) {
        return group.get(indexOfValue);
    }

    public void delete(String string) {
        group.remove(string);
    }

    public void clear() {
        group.clear();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {
        for (String string : group){
            action.accept(string);
        }
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }
}
