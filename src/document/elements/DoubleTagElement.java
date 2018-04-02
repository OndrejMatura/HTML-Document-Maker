package document.elements;

import java.util.Arrays;

public abstract class DoubleTagElement extends Element {

    private final Children children;

    @Override
    public void appendChild(Element element) {
        element.setParent(this);
        children.add(element);
    }

    @Override
    public void removeChild(int index) {
        children.get(index).removeParent();
        children.remove(index);
    }

    @Override
    public void removeChild(Element element) {
        element.removeParent();
        children.remove(element);
    }

    @Override
    public void clearChildren() {
        for (Element child : children) {
            child.setParent(null);
        }
        children.clear();
    }

    @Override
    public void switchChildren(int index1, int index2) {
        Element temp = children.get(index1);
        children.set(index1, children.get(index2));
        children.set(index2, temp);
    }

    @Override
    public Element[] children() {
        return children.toArray(new Element[0]);
    }
    
    @Override
    public Element children(int index) {
        return children.get(index);
    }
    
    @Override
    public boolean hasChildren() {
        return children.isEmpty();
    }

    @Override
    public int childrenCount() {
        return children.size();
    }

    public String openingTag() {
        return String.format(OPENING_TAG, getTagName());
    }

    public String closingTag() {
        return String.format(CLOSING_TAG, getTagName());
    }

    @Override
    public String toString() {
        String string = openingTag();
        for (Element element : children) {
            string += element;
        }
        string += closingTag();
        return string;
    }

    public DoubleTagElement() {
        children = new Children();
    }

    public DoubleTagElement(Element... elements) {
        this();
        children.addAll(Arrays.asList(elements));
    }

}
