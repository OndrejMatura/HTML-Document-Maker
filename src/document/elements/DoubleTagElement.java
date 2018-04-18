package document.elements;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class DoubleTagElement extends Element {

    private final Children children;

    @Override
    public Children children() {
        return children;
    }

    @Override
    public boolean hasChildren() {
        return children.isEmpty();
    }

    @Override
    public int childrenCount() {
        return children.count();
    }

    public String openingTag() {
        return String.format(OPENING_TAG, tagName(), getAttributes());
    }

    public String closingTag() {
        return String.format(CLOSING_TAG, tagName());
    }

    @Override
    public String toString() {
        return openingTag() + children + closingTag();
    }

    protected DoubleTagElement(boolean children) {
        if (children) {
            this.children = new Children();
        } else {
            this.children = null;
        }
    }

    public DoubleTagElement() {
        this(true);
    }

    public DoubleTagElement(Element... elements) {
        this();
        children.append(elements);
    }

}
