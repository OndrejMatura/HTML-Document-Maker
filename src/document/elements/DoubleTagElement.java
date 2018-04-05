package document.elements;

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
        return String.format(OPENING_TAG, tagName());
    }

    public String closingTag() {
        return String.format(CLOSING_TAG, tagName());
    }

    @Override
    public String toString() {
        String string = openingTag();
        for (int i = 0; i < childrenCount(); i++) {
            string += children().get(i);
        }
        string += closingTag();
        return string;
    }

    public DoubleTagElement() {
        children = new Children();
    }

    public DoubleTagElement(Element... elements) {
        this();
        children.append(elements);
    }

}
