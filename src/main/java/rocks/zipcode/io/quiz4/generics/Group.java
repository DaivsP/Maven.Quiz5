package rocks.zipcode.io.quiz4.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author leon on 18/12/2018.
 */
public class Group<_> implements GroupInterface{

    private List<_> list;

    public Group() {
        this.list = new ArrayList<>();
    }

    public Group(List<_> list) {
        this.list = list;
    }

    public Integer count() {
        return list.size();
    }

    @Override
    public Boolean has(Object valueToInsert) {
        return list.contains(valueToInsert);
    }

    public _ fetch(int indexOfValue) {
        return list.get(indexOfValue);
    }

    @Override
    public void insert(Object string) {
        list.add((_)string);
    }

    @Override
    public void delete(Object valueToInsert) {
        list.remove(valueToInsert);
    }

    public void clear() {
        list.clear();
    }

    public Iterator<_> iterator() {
        return null;
    }

    @Override
    public String toString(){
        return list.toString();
    }

    @Override
    public void forEach(Consumer action) {
        for (_ object : list){
            action.accept(object);
        }
    }
}
