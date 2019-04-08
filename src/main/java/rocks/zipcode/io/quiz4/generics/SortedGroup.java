package rocks.zipcode.io.quiz4.generics;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class SortedGroup<_> extends Group<_> {

    private List<_> list;

    public SortedGroup() {
        this.list = new LinkedList<>();
    }

    @Override
    public void insert(Object value) {
        list.add((_)value);
        Collections.sort(list, (o1, o2) -> 0);
    }

    @Override
    public void delete(Object value) {
        list.remove(value);
    }

    public Integer indexOf(_ value) {
        return list.indexOf(value);
    }
}
