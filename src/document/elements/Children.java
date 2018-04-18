package document.elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Children implements Iterable<Element> {

    private final ArrayList<Element> children;

    public void append(Element... elements) {
        children.addAll(Arrays.asList(elements));
    }

    public void insert(int index, Element... elements) {
        children.addAll(index, Arrays.asList(elements));
    }

    public void prepend(Element... elements) {
        insert(0, elements);
    }

    public void replace(int index, Element element) {
        children.set(index, element);
    }

    public void swap(int index1, int index2) {
        Element temp = get(index1);
        replace(index1, get(index2));
        replace(index2, temp);
    }

    public void remove(int index) {
        children.remove(index);
    }

    public void remove(Element... elements) {
        children.removeAll(Arrays.asList(elements));
    }

    public void clear() {
        children.clear();
    }

    public Element[] toArray() {
        return children.toArray(new Element[0]);
    }

    public Element get(int index) {
        return children.get(index);
    }

    public int count() {
        return children.size();
    }

    public boolean isEmpty() {
        return children.isEmpty();
    }

    public Children() {
        children = new ArrayList<>();
    }
    
    @Override
    public String toString() {
        String string = "";
        for(Element child: children) {
            string += child;
        }
        return string;
    }

    @Override
    public Iterator<Element> iterator() {
        return children.iterator();
    }

}
